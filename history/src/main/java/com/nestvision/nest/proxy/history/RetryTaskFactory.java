package com.nestvision.nest.proxy.history;

import java.util.ArrayList;
import java.util.List;

import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity;
import com.nestvision.nest.proxy.fhir.util.NestRequestUtil;
import com.nestvision.nest.proxy.history.entity.RetryStatus;
import com.nestvision.nest.proxy.history.entity.RetryTask;
import com.nestvision.nest.proxy.history.entity.RetryTaskRequest;
import com.nestvision.nest.proxy.history.entity.RetryType;
import com.nestvision.nest.proxy.transform.model.NestRequest;

public class RetryTaskFactory {

    private RetryTaskFactory() {

    }

    public static RetryTask newRetryTask(RetryType type, FhirResourceEntity retryMessage, List<NestRequest> retryRequests) {
        RetryTask retryTask = new RetryTask();
        retryTask.setMessageClass(retryMessage.getClass().getName());
        retryTask.setMessageId(retryMessage.getUid());
        retryTask.setType(type);
        retryTask.setStatus(RetryStatus.WAITTING);
        String requestTableName = NestRequestUtil.detectNestRequestTableName(retryMessage.getClass());
        List<RetryTaskRequest> retryTaskRequests = new ArrayList<>();
        for (NestRequest nestRequest : retryRequests) {
            RetryTaskRequest retryTaskRequest = new RetryTaskRequest();
            retryTaskRequest.setRequestId(nestRequest.getId());
            retryTaskRequest.setRequestTableName(requestTableName);
            retryTaskRequest.setRetryedTimes(0);
            retryTaskRequest.setRetryTask(retryTask);
            retryTaskRequest.setStatus(RetryStatus.WAITTING);
            retryTaskRequests.add(retryTaskRequest);
        }
        retryTask.setRetryTaskRequests(retryTaskRequests);
        return retryTask;
    }
    
    public static RetryTask newLazyRetryTask(FhirResourceEntity retryMessage, List<NestRequest> retryRequests) {

        return newRetryTask(RetryType.LAZY, retryMessage, retryRequests);
    }
    public static RetryTask newEagerRetryTask(FhirResourceEntity retryMessage, List<NestRequest> retryRequests) {

        return newRetryTask(RetryType.EAGER, retryMessage, retryRequests);
    }
}
