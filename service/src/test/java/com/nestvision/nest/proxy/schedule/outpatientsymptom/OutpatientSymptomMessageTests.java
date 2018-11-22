package com.nestvision.nest.proxy.schedule.outpatientsymptom;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.OutpatientSymptom;
import com.nestvision.nest.proxy.fhir.service.OutpatientSymptomService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OutpatientSymptomMessageTests {

    @Autowired
    private OutpatientSymptomService outpatientSymptomService;

    @Autowired
    private OutpatientSymptomMessageScheduler outpatientSymptomMessageScheduler;

    @Autowired
    private OutpatientSymptomMessageSender outpatientSymptomMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        OutpatientSymptom outpatientSymptom = EntityGenarator.genarate(OutpatientSymptom.class);
		outpatientSymptom.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = outpatientSymptomMessageSender.createRequestBody(outpatientSymptom);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        outpatientSymptom = EntityGenarator.genarateNessaray(OutpatientSymptom.class);
        templateResult = outpatientSymptomMessageSender.createRequestBody(outpatientSymptom);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		OutpatientSymptom outpatientSymptom = EntityGenarator.genarate(OutpatientSymptom.class);	
		String uid = UUID.randomUUID().toString();
		outpatientSymptom.setUid(uid);  		 		 
        outpatientSymptomService.save(outpatientSymptom);
        
        outpatientSymptom=outpatientSymptomService.findOne(uid);      
        outpatientSymptomMessageScheduler.doSend(outpatientSymptom);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        outpatientSymptom = EntityGenarator.genarateNessaray(OutpatientSymptom.class);
        uid = UUID.randomUUID().toString();
        outpatientSymptom.setUid(uid);
        outpatientSymptomService.save(outpatientSymptom);
        
        outpatientSymptom=outpatientSymptomService.findOne(uid);      
        outpatientSymptomMessageScheduler.doSend(outpatientSymptom);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
