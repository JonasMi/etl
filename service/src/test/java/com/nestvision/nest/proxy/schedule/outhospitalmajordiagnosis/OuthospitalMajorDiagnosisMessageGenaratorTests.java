package com.nestvision.nest.proxy.schedule.outhospitalmajordiagnosis;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nestvision.nest.proxy.fhir.entity.OuthospitalMajorDiagnosis;
import com.nestvision.nest.proxy.fhir.service.OuthospitalMajorDiagnosisService;
import com.nestvision.nest.proxy.schedule.Result;
import com.nestvision.nest.proxy.test.MessageGenaratorSupport;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OuthospitalMajorDiagnosisMessageGenaratorTests extends MessageGenaratorSupport<OuthospitalMajorDiagnosis> {

    @Autowired
    private OuthospitalMajorDiagnosisService outhospitalMajorDiagnosisService;   
    @Autowired
	private OuthospitalMajorDiagnosisMessageScheduler outhospitalMajorDiagnosisMessageScheduler;
	private boolean finished = false;
    @Override
    protected void setSpecialProperties(OuthospitalMajorDiagnosis outhospitalMajorDiagnosis) {
        //这里设置OuthospitalMajorDiagnosis特殊字段的生成
    }

    @Test
    public void testGenarate() throws Exception {
		outhospitalMajorDiagnosisService.deleteAll();//清空所有数据
        System.out.println("正在生成完整数据:" + OuthospitalMajorDiagnosis.class.getName() + ".....");
        List<OuthospitalMajorDiagnosis> fullEntities = genarateFullEntities(OuthospitalMajorDiagnosis.class);
        System.out.println("已经生成完整数据:" + OuthospitalMajorDiagnosis.class.getName() + "....." + fullEntities.size() + "条");

        System.out.println("正在保存完整数据:" + OuthospitalMajorDiagnosis.class.getName() + ".....");
        outhospitalMajorDiagnosisService.saveAll(fullEntities);
        System.out.println("已经保存完整数据:" + OuthospitalMajorDiagnosis.class.getName() + "....." + fullEntities.size() + "条");

        System.out.println("正在生成必要数据:" + OuthospitalMajorDiagnosis.class.getName() + ".....");
        List<OuthospitalMajorDiagnosis> nessaryEntities = genarateNessarayEntities(OuthospitalMajorDiagnosis.class);
        System.out.println("已经生成必要数据:" + OuthospitalMajorDiagnosis.class.getName() + "....." + nessaryEntities.size() + "条");

        System.out.println("正在保存必要数据:" + OuthospitalMajorDiagnosis.class.getName() + ".....");
        outhospitalMajorDiagnosisService.saveAll(nessaryEntities);
        System.out.println("已经保存必要数据:" + OuthospitalMajorDiagnosis.class.getName() + "....." + fullEntities.size() + "条");
        
        new Thread() {

            public void run() {

                while (outhospitalMajorDiagnosisService.count() > 0) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {

                        e.printStackTrace();
                    }
                }

                finished = true;

            };
        }.start();
        long size = outhospitalMajorDiagnosisService.count();
        System.out.println("开始发送[OuthospitalMajorDiagnosis]消息....总共:" + size + "条");
        long start = System.currentTimeMillis();
        Result result = new Result();
		 while (!finished) {
            Result newResult = outhospitalMajorDiagnosisMessageScheduler.schedule();// 模仿消息调度定时任务
            result.increment(newResult);
            Thread.sleep(3000);
        }
        System.out.println("所有消息[OuthospitalMajorDiagnosis]已经发送完成.总共:" + size + "条,耗时:" + (System.currentTimeMillis() - start) + "ms");
        System.out.println("消息[OuthospitalMajorDiagnosis]发送实际结果-成功:" + result.getSuccessTotal() + "条,失败:" + result.getErrorTotal() + "条,取消:" + result.getCancelTotal() + "条,合计:"
                           + result.getTotal() + "条");
        Assert.assertTrue(result.getCancelTotal() == 0);
        Assert.assertTrue(result.getErrorTotal() == 0);
        Assert.assertTrue(result.getTotal() == size);
        Assert.assertTrue(result.getSuccessTotal() == size);
    }

}
