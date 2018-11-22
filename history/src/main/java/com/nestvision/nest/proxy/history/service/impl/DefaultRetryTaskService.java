package com.nestvision.nest.proxy.history.service.impl;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.history.dao.RetryTaskRepository;
import com.nestvision.nest.proxy.history.entity.MatcherConfigurationMapping;
import com.nestvision.nest.proxy.history.entity.RetryStatus;
import com.nestvision.nest.proxy.history.entity.RetryTask;
import com.nestvision.nest.proxy.history.entity.RetryTaskRequest;
import com.nestvision.nest.proxy.history.entity.RetryType;
import com.nestvision.nest.proxy.history.match.Matcher;
import com.nestvision.nest.proxy.history.match.MatcherConfiguration;
import com.nestvision.nest.proxy.history.service.MatcherConfigurationMappingService;
import com.nestvision.nest.proxy.history.service.RetryTaskRequestService;
import com.nestvision.nest.proxy.history.service.RetryTaskService;
import com.nestvision.nest.proxy.nest.NestRequestException;
import com.nestvision.nest.proxy.nest.service.NestRequestService;
import com.nestvision.nest.proxy.transform.model.NestRequest;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DefaultRetryTaskService extends AbstractBaseService<RetryTask, Long> implements RetryTaskService {

    @Autowired
    private RetryTaskRepository retryTaskRepository;

    @Autowired
    private NestRequestService nestRequestService;

    @Autowired
    private RetryTaskRequestService retryTaskRequestService;

    @Autowired
    private MatcherConfigurationMappingService matcherConfigurationMappingService;

    @Override
    protected BaseRepository<RetryTask, Long> getBaseRepository() {

        return retryTaskRepository;
    }
    
    //默认在每天凌晨2点进行扫描
    @Scheduled(cron = "${message.retry.schedule.corn:0 0 2 * * ? *}")
    public void schedule() {

        List<RetryTask> waittingTasks = retryTaskRepository.findAllByStatus(RetryStatus.WAITTING);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(new Task(0, waittingTasks.size(), waittingTasks));
        pool.shutdown();
    }

    private boolean retry(RetryTaskRequest retryTaskRequest) {

        Date now = new Date();
        retryTaskRequest.setLastRetryTime(now);
        retryTaskRequest.setStatus(RetryStatus.RETRYING);
        retryTaskRequest.setRetryedTimes(retryTaskRequest.getRetryedTimes() + 1);
        retryTaskRequestService.save(retryTaskRequest);

        String requestTableName = retryTaskRequest.getRequestTableName();
        String requestId = retryTaskRequest.getRequestId();
        NestRequest nestRequest = nestRequestService.findOne(requestTableName, requestId);
        try {
            nestRequestService.retry(nestRequest);
            retryTaskRequest.setStatus(RetryStatus.RETRYED);
            return true;
        } catch (NestRequestException e) {
            log.debug("重发消息发送失败:" + e.getMessage(), e);
            if (matchAutoRetry(nestRequest)) {
                retryTaskRequest.setStatus(RetryStatus.WAITTING);// 匹配重发条件,下次继续重发
            } else {
                retryTaskRequest.setStatus(RetryStatus.RETRYED);// 未匹配重发条件,下次不再重发
            }
            return false;
        } finally {
            retryTaskRequestService.save(retryTaskRequest);
        }
    }

    @Transactional
    public void changeRetryTaskStatus(RetryTask retryTask, RetryStatus status) {
        retryTask.setStatus(status);
        retryTaskRepository.save(retryTask);
    }

    private void retry(RetryTask retryTask) {
        retryTask.setLastRetryTime(new Date());
        changeRetryTaskStatus(retryTask, RetryStatus.RETRYING);

        int nestRequestedRetryError = 0;// 重发错误数
        int notRetryWattingRequests = 0;// 需要发送但还未重发的请求数
        int nextTimeRetryRequests = 0;// 下次轮询需要重发的请求数
        try {

            List<RetryTaskRequest> requests = retryTask.getRetryTaskRequests();

            Iterator<RetryTaskRequest> it = requests.iterator();

            while (it.hasNext()) {

                RetryTaskRequest retryTaskRequest = it.next();
                final RetryStatus beforeRetryStatus = retryTaskRequest.getStatus();// 发送之前的状态
                if (beforeRetryStatus != RetryStatus.WAITTING) {
                    continue;
                }
                if (nestRequestedRetryError > 0) {
                    notRetryWattingRequests++;
                    continue;
                }

                if (!retry(retryTaskRequest)) {
                    nestRequestedRetryError++;
                }
                final RetryStatus afterRetryStatus = retryTaskRequest.getStatus();// 发送之后的状态
                if (afterRetryStatus == RetryStatus.WAITTING) {
                    nextTimeRetryRequests++;
                }

            }

        } catch (Exception e) {
            log.error("消息重发失败:" + e.getMessage(), e);
        } finally {
            if (nextTimeRetryRequests > 0 || notRetryWattingRequests > 0) {
                changeRetryTaskStatus(retryTask, RetryStatus.WAITTING);// 重置状态为等待下次重发
            } else {
                changeRetryTaskStatus(retryTask, RetryStatus.RETRYED);// 下次不会再重发

            }
        }

    }

    @Override
    @Transactional
    public void save(RetryTask entity) {

        retryTaskRepository.save(entity);
        if (RetryType.EAGER == entity.getType()) {
            retry(entity);
        }

    }

    @Override
    public boolean matchAutoRetry(NestRequest nestRequest) {

        MatcherConfigurationMapping mapping = matcherConfigurationMappingService.findOne(NestRequest.class.getName());
        if (mapping != null) {
            MatcherConfiguration matcherConfiguration = JSONUtil.readObject(mapping.getMatcher(), MatcherConfiguration.class);
            Matcher matcher = matcherConfiguration.buildMatcher();
            return matcher.execute(nestRequest);
        }
        return false;
    }

    private class Task extends RecursiveAction {

        /**
         * 
         */
        private static final long serialVersionUID = 983987277460025003L;

        private static final int THRESHOLD = 10;

        private int start;

        private int end;

        private List<RetryTask> list;

        public Task(int start, int end, List<RetryTask> list) {
            this.start = start;
            this.end = end;
            this.list = list;
        }

        @Override
        protected void compute() {

            if (end - start < THRESHOLD) {

                for (int i = start; i < end; i++) {

                    RetryTask retryTask = list.get(i);

                    retry(retryTask);
                }

            } else {
                // 如果当end与start之间的差大于THRESHOLD时，即要发送的数超过10个
                // 将大任务分解成两个小任务。
                int middle = (start + end) / 2;
                Task left = new Task(start, middle, list);
                Task right = new Task(middle, end, list);
                // 并行执行两个“小任务”
                left.fork();
                right.fork();
            }
        }

    }

}
