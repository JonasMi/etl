package com.nestvision.nest.proxy.schedule.outpatientprescription;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nestvision.nest.proxy.fhir.entity.OutpatientPrescription;
import com.nestvision.nest.proxy.fhir.service.OutpatientPrescriptionService;
import com.nestvision.nest.proxy.schedule.Result;
import com.nestvision.nest.proxy.test.MessageGenaratorSupport;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OutpatientPrescriptionMessageGenaratorTests extends MessageGenaratorSupport<OutpatientPrescription> {

    @Autowired
    private OutpatientPrescriptionService outpatientPrescriptionService;   
    @Autowired
	private OutpatientPrescriptionMessageScheduler outpatientPrescriptionMessageScheduler;
	private boolean finished = false;
    @Override
    protected void setSpecialProperties(OutpatientPrescription outpatientPrescription) {
        //这里设置OutpatientPrescription特殊字段的生成
    }

    @Test
    public void testGenarate() throws Exception {
		outpatientPrescriptionService.deleteAll();//清空所有数据
        System.out.println("正在生成完整数据:" + OutpatientPrescription.class.getName() + ".....");
        List<OutpatientPrescription> fullEntities = genarateFullEntities(OutpatientPrescription.class);
        System.out.println("已经生成完整数据:" + OutpatientPrescription.class.getName() + "....." + fullEntities.size() + "条");

        System.out.println("正在保存完整数据:" + OutpatientPrescription.class.getName() + ".....");
        outpatientPrescriptionService.saveAll(fullEntities);
        System.out.println("已经保存完整数据:" + OutpatientPrescription.class.getName() + "....." + fullEntities.size() + "条");

        System.out.println("正在生成必要数据:" + OutpatientPrescription.class.getName() + ".....");
        List<OutpatientPrescription> nessaryEntities = genarateNessarayEntities(OutpatientPrescription.class);
        System.out.println("已经生成必要数据:" + OutpatientPrescription.class.getName() + "....." + nessaryEntities.size() + "条");

        System.out.println("正在保存必要数据:" + OutpatientPrescription.class.getName() + ".....");
        outpatientPrescriptionService.saveAll(nessaryEntities);
        System.out.println("已经保存必要数据:" + OutpatientPrescription.class.getName() + "....." + fullEntities.size() + "条");
        
        new Thread() {

            public void run() {

                while (outpatientPrescriptionService.count() > 0) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {

                        e.printStackTrace();
                    }
                }

                finished = true;

            };
        }.start();
        long size = outpatientPrescriptionService.count();
        System.out.println("开始发送[OutpatientPrescription]消息....总共:" + size + "条");
        long start = System.currentTimeMillis();
        Result result = new Result();
		 while (!finished) {
            Result newResult = outpatientPrescriptionMessageScheduler.schedule();// 模仿消息调度定时任务
            result.increment(newResult);
            Thread.sleep(3000);
        }
        System.out.println("所有消息[OutpatientPrescription]已经发送完成.总共:" + size + "条,耗时:" + (System.currentTimeMillis() - start) + "ms");
        System.out.println("消息[OutpatientPrescription]发送实际结果-成功:" + result.getSuccessTotal() + "条,失败:" + result.getErrorTotal() + "条,取消:" + result.getCancelTotal() + "条,合计:"
                           + result.getTotal() + "条");
        Assert.assertTrue(result.getCancelTotal() == 0);
        Assert.assertTrue(result.getErrorTotal() == 0);
        Assert.assertTrue(result.getTotal() == size);
        Assert.assertTrue(result.getSuccessTotal() == size);
    }

}
