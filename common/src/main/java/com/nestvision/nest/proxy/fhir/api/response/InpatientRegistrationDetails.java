package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.InpatientRegistration;

public class InpatientRegistrationDetails extends InpatientRegistrationRecord {
    /**
     *名称:院内住院流水号
     *备注:本次住院就诊在院内系统中的唯一标识
 	 *
     */
     private String inpatientRegistrationId;
    /**
     *名称:患者id
     *备注:引用患者信息表T_PATIENT院内患者id
 	 *
     */
     private String patientId;
    /**
     *名称:患者姓名
     *
 	 *
     */
     private String patientName;
    /**
     *名称:住院医师id
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
     */
     private String residentPhysicianId;
    /**
     *名称:入院时间
     *
 	 *
     */
     private Long start;
    /**
     *名称:出院时间
     *
 	 *
     */
     private Long end;
    /**
     *名称:住院号
     *
 	 *
     */
     private String inhId;
    /**
     *名称:入院方式
     *
 	 *
     */
     private String admissionMethod;
    /**
     *名称:入院科室id
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
     */
     private String inDpid;
    /**
     *名称:入院时情况
     *
 	 *
     */
     private String inSituation;
    /**
     *名称:入院途径
     *
 	 *限制:CV0900403
     */
     private String inModeCode;
    /**
     *名称:入院病区
     *
 	 *
     */
     private String inInpatientArea;
    /**
     *名称:床位id
     *备注:引用床位信息表T_BED院内床位id
 	 *
     */
     private String bedId;
    /**
     *名称:住院科室id
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
     */
     private String serviceprovider;
    /**
     *名称:出院科室
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
     */
     private String outDpid;
    /**
     *名称:出院病区
     *
 	 *
     */
     private String outInpatientArea;
    /**
     *名称:住院次数
     *
 	 *
     */
     private Integer inpatTimes;
    /**
     *名称:住院天数
     *
 	 *
     */
     private Integer inpatDays;
    /**
     *名称:离院方式
     *
 	 *限制:CV0600226
     */
     private String outModeCode;
    /**
     *名称:医疗付费方式
     *
 	 *限制:CV9900376
     */
     private String feeCode;
    /**
     *名称:住院原因代码
     *
 	 *限制:CV0600212
     */
     private String inhospitalReasonCd;
     private String errorMessage;
     private String errorDetail;             
     public InpatientRegistrationDetails(InpatientRegistration inpatientRegistration) {
        super(inpatientRegistration);
         this.inpatientRegistrationId=inpatientRegistration.getInpatientRegistrationId();
         this.patientId=inpatientRegistration.getPatientId();
         this.patientName=inpatientRegistration.getPatientName();
         this.residentPhysicianId=inpatientRegistration.getResidentPhysicianId();
         java.util.Date _start = inpatientRegistration.getStart();
         if(_start!=null){
         	this.start=_start.getTime();
         }
         java.util.Date _end = inpatientRegistration.getEnd();
         if(_end!=null){
         	this.end=_end.getTime();
         }
         this.inhId=inpatientRegistration.getInhId();
         this.admissionMethod=inpatientRegistration.getAdmissionMethod();
         this.inDpid=inpatientRegistration.getInDpid();
         this.inSituation=inpatientRegistration.getInSituation();
         this.inModeCode=inpatientRegistration.getInModeCode();
         this.inInpatientArea=inpatientRegistration.getInInpatientArea();
         this.bedId=inpatientRegistration.getBedId();
         this.serviceprovider=inpatientRegistration.getServiceprovider();
         this.outDpid=inpatientRegistration.getOutDpid();
         this.outInpatientArea=inpatientRegistration.getOutInpatientArea();
         this.inpatTimes=inpatientRegistration.getInpatTimes();
         this.inpatDays=inpatientRegistration.getInpatDays();
         this.outModeCode=inpatientRegistration.getOutModeCode();
         this.feeCode=inpatientRegistration.getFeeCode();
         this.inhospitalReasonCd=inpatientRegistration.getInhospitalReasonCd();
         this.errorMessage=inpatientRegistration.getErrorMessage();
         this.errorDetail=inpatientRegistration.getErrorDetail();      
    }
      public String  getInpatientRegistrationId(){
       		return this.inpatientRegistrationId;
      }    
      public String  getPatientId(){
       		return this.patientId;
      }    
      public String  getPatientName(){
       		return this.patientName;
      }    
      public String  getResidentPhysicianId(){
       		return this.residentPhysicianId;
      }    
      public Long  getStart(){
       		return this.start;
      }    
      public Long  getEnd(){
       		return this.end;
      }    
      public String  getInhId(){
       		return this.inhId;
      }    
      public String  getAdmissionMethod(){
       		return this.admissionMethod;
      }    
      public String  getInDpid(){
       		return this.inDpid;
      }    
      public String  getInSituation(){
       		return this.inSituation;
      }    
      public String  getInModeCode(){
       		return this.inModeCode;
      }    
      public String  getInInpatientArea(){
       		return this.inInpatientArea;
      }    
      public String  getBedId(){
       		return this.bedId;
      }    
      public String  getServiceprovider(){
       		return this.serviceprovider;
      }    
      public String  getOutDpid(){
       		return this.outDpid;
      }    
      public String  getOutInpatientArea(){
       		return this.outInpatientArea;
      }    
      public Integer  getInpatTimes(){
       		return this.inpatTimes;
      }    
      public Integer  getInpatDays(){
       		return this.inpatDays;
      }    
      public String  getOutModeCode(){
       		return this.outModeCode;
      }    
      public String  getFeeCode(){
       		return this.feeCode;
      }    
      public String  getInhospitalReasonCd(){
       		return this.inhospitalReasonCd;
      }    
	  public String getErrorMessage() {
	        return errorMessage;
	  }
	  public String getErrorDetail() {
	        return errorDetail;
	  }  
}