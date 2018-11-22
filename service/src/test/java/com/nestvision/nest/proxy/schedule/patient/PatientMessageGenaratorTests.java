package com.nestvision.nest.proxy.schedule.patient;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nestvision.nest.proxy.fhir.entity.Patient;
import com.nestvision.nest.proxy.fhir.entity.PatientTelecom;
import com.nestvision.nest.proxy.fhir.service.PatientService;
import com.nestvision.nest.proxy.schedule.Result;
import com.nestvision.nest.proxy.test.EntityGenarator;
import com.nestvision.nest.proxy.test.MessageGenaratorSupport;
import com.nestvision.nest.proxy.test.TestConstants;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientMessageGenaratorTests extends MessageGenaratorSupport<Patient> {

    @Autowired
    private PatientService patientService;   
    @Autowired
	private PatientMessageScheduler patientMessageScheduler;
	private boolean finished = false;
    @Override
    protected void setSpecialProperties(Patient patient) {
        //这里设置Patient特殊字段的生成
        patient.setGender("0");
        patient.setMaritalstatus("10");
        patient.setHomeState("110000");
        patient.setHomeCity("110000");
        patient.setHomeDistrict("110100");
        patient.setMedicalInsuranceCategory("1");
        patient.setTempState("110000");
        patient.setTempCity("110000");
        patient.setTempDistrict("110100");
        patient.setResponsDocCode(TestConstants.EMPLOYEE_ID);
        patient.setWorkState("110000");
        patient.setWorkCity("110000");
        patient.setWorkDistrict("110100");

        patient.setBirthState("110000");
        patient.setBirthCity("110000");
        patient.setBirthDistrict("110100");

        patient.setRprAddrProvince("110000");
        patient.setRprAddrCity("110000");
        patient.setRprAddrArea("110100");

        patient.setNativeProvince("110000");
        patient.setNativeCity("110000");
        patient.setAdministration("110000");

        patient.setNationCd("01X");
        patient.setNationalityCode("CN");
        patient.setOccupationCd("0");
        patient.setPatientType("1X");
        patient.setRhCd("1");
        patient.setRhNegCd("1");
        patient.setReligionCode("00");
        patient.setEducationCd("10");
        patient.setServicePremisesTypeCd("10");
        patient.setInReasonCd("1");
        patient.setDealState(null);
        patient.setOutReasonCd("1X");
        patient.setCardArea("110000");
        patient.setUpHospital("aixin_test");
        patient.setUid(UUID.randomUUID().toString());
        List<PatientTelecom> patientTelecoms = new ArrayList<PatientTelecom>();
        for (int i = 0; i < 1; i++) {
            try {
                PatientTelecom patientTelecom = EntityGenarator.genarate(PatientTelecom.class);
                setCommonProperties(patientTelecom);
                patientTelecom.setPatient(patient);
                patientTelecom.setPatientId(patient.getPatientId());
                patientTelecom.setRelationship("0");
                patientTelecom.setTelTypeCd("01X");
                patientTelecom.setTempState("110000X");
                patientTelecom.setTempCity("110000X");
                patientTelecom.setTempDistrict("110100");
                patientTelecom.setIdCardType("01");
                patientTelecom.setRelationship("test1");
                patientTelecom.setUid(UUID.randomUUID().toString());
                patientTelecoms.add(patientTelecom);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
        patient.setPatientTelecoms(patientTelecoms);
    }

    @Test
    public void testGenarate() throws Exception {
		patientService.deleteAll();//清空所有数据
        System.out.println("正在生成完整数据:" + Patient.class.getName() + ".....");
        List<Patient> fullEntities = genarateFullEntities(Patient.class);
        System.out.println("已经生成完整数据:" + Patient.class.getName() + "....." + fullEntities.size() + "条");

        System.out.println("正在保存完整数据:" + Patient.class.getName() + ".....");
        patientService.saveAll(fullEntities);
        System.out.println("已经保存完整数据:" + Patient.class.getName() + "....." + fullEntities.size() + "条");

        System.out.println("正在生成必要数据:" + Patient.class.getName() + ".....");
        List<Patient> nessaryEntities = genarateNessarayEntities(Patient.class);
        System.out.println("已经生成必要数据:" + Patient.class.getName() + "....." + nessaryEntities.size() + "条");

        System.out.println("正在保存必要数据:" + Patient.class.getName() + ".....");
        patientService.saveAll(nessaryEntities);
        System.out.println("已经保存必要数据:" + Patient.class.getName() + "....." + fullEntities.size() + "条");
        
        new Thread() {

            public void run() {

                while (patientService.count() > 0) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {

                        e.printStackTrace();
                    }
                }

                finished = true;

            };
        }.start();
        long size = patientService.count();
        System.out.println("开始发送[Patient]消息....总共:" + size + "条");
        long start = System.currentTimeMillis();
        Result result = new Result();
		 while (!finished) {
            Result newResult = patientMessageScheduler.schedule();// 模仿消息调度定时任务
            result.increment(newResult);
            Thread.sleep(3000);
        }
        System.out.println("所有消息[Patient]已经发送完成.总共:" + size + "条,耗时:" + (System.currentTimeMillis() - start) + "ms");
        System.out.println("消息[Patient]发送实际结果-成功:" + result.getSuccessTotal() + "条,失败:" + result.getErrorTotal() + "条,取消:" + result.getCancelTotal() + "条,合计:"
                           + result.getTotal() + "条");
        Assert.assertTrue(result.getCancelTotal() == 0);
        Assert.assertTrue(result.getErrorTotal() == 0);
        Assert.assertTrue(result.getTotal() == size);
        Assert.assertTrue(result.getSuccessTotal() == size);
    }

}
