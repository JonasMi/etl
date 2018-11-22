package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.Appointment;

public class AppointmentDetails extends AppointmentRecord {
    /**
     *名称:挂号号
     *备注:挂号信息在院内系统中的唯一标识
 	 *
     */
     private String registerId;
    /**
     *名称:预约号
     *
 	 *
     */
     private String appointmentId;
    /**
     *名称:状态
     *
 	 *限制:CUS00007
     */
     private String status;
    /**
     *名称:等级
     *
 	 *
     */
     private String priority;
    /**
     *名称:预计就诊开始时间
     *
 	 *
     */
     private Long startTime;
    /**
     *名称:预计就诊结束时间
     *
 	 *
     */
     private Long endTime;
    /**
     *名称:号源id
     *备注:引用号源信息表T_SLOT院内号源id
 	 *
     */
     private String numberSourceId;
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
     *名称:挂号医生id
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
     */
     private String registerEmployeeId;
    /**
     *名称:挂号医生姓名
     *
 	 *
     */
     private String registerEmployeeName;
    /**
     *名称:专家ID
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
     */
     private String expertId;
    /**
     *名称:专家姓名
     *
 	 *
     */
     private String expertName;
    /**
     *名称:挂号费
     *
 	 *
     */
     private Float reFee;
    /**
     *名称:诊疗费
     *
 	 *
     */
     private Float dtFee;
    /**
     *名称:病历本费
     *
 	 *
     */
     private Float rbFee;
    /**
     *名称:是否门诊特殊病
     *
 	 *限制:CUS00004
     */
     private Boolean ifSpecial;
    /**
     *名称:就诊方式代码
     *
 	 *限制:CV9900263
     */
     private String regSourceCode;
    /**
     *名称:挂号科室id
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
     */
     private String registerDpCode;
    /**
     *名称:医疗（保险）类别代码
     *
 	 *限制:CV9900281
     */
     private String medicalInsuranceType;
    /**
     *名称:就诊类别
     *
 	 *限制:CV9900133
     */
     private String regTypeCode;
    /**
     *名称:挂号时间
     *
 	 *
     */
     private Long registerTime;
    /**
     *名称:就诊顺序号
     *
 	 *
     */
     private String regNo;
     private String errorMessage;
     private String errorDetail;             
     public AppointmentDetails(Appointment appointment) {
        super(appointment);
         this.registerId=appointment.getRegisterId();
         this.appointmentId=appointment.getAppointmentId();
         this.status=appointment.getStatus();
         this.priority=appointment.getPriority();
         java.util.Date _startTime = appointment.getStartTime();
         if(_startTime!=null){
         	this.startTime=_startTime.getTime();
         }
         java.util.Date _endTime = appointment.getEndTime();
         if(_endTime!=null){
         	this.endTime=_endTime.getTime();
         }
         this.numberSourceId=appointment.getNumberSourceId();
         this.patientId=appointment.getPatientId();
         this.patientName=appointment.getPatientName();
         this.registerEmployeeId=appointment.getRegisterEmployeeId();
         this.registerEmployeeName=appointment.getRegisterEmployeeName();
         this.expertId=appointment.getExpertId();
         this.expertName=appointment.getExpertName();
         this.reFee=appointment.getReFee();
         this.dtFee=appointment.getDtFee();
         this.rbFee=appointment.getRbFee();
         this.ifSpecial=appointment.getIfSpecial();
         this.regSourceCode=appointment.getRegSourceCode();
         this.registerDpCode=appointment.getRegisterDpCode();
         this.medicalInsuranceType=appointment.getMedicalInsuranceType();
         this.regTypeCode=appointment.getRegTypeCode();
         java.util.Date _registerTime = appointment.getRegisterTime();
         if(_registerTime!=null){
         	this.registerTime=_registerTime.getTime();
         }
         this.regNo=appointment.getRegNo();
         this.errorMessage=appointment.getErrorMessage();
         this.errorDetail=appointment.getErrorDetail();      
    }
      public String  getRegisterId(){
       		return this.registerId;
      }    
      public String  getAppointmentId(){
       		return this.appointmentId;
      }    
      public String  getStatus(){
       		return this.status;
      }    
      public String  getPriority(){
       		return this.priority;
      }    
      public Long  getStartTime(){
       		return this.startTime;
      }    
      public Long  getEndTime(){
       		return this.endTime;
      }    
      public String  getNumberSourceId(){
       		return this.numberSourceId;
      }    
      public String  getPatientId(){
       		return this.patientId;
      }    
      public String  getPatientName(){
       		return this.patientName;
      }    
      public String  getRegisterEmployeeId(){
       		return this.registerEmployeeId;
      }    
      public String  getRegisterEmployeeName(){
       		return this.registerEmployeeName;
      }    
      public String  getExpertId(){
       		return this.expertId;
      }    
      public String  getExpertName(){
       		return this.expertName;
      }    
      public Float  getReFee(){
       		return this.reFee;
      }    
      public Float  getDtFee(){
       		return this.dtFee;
      }    
      public Float  getRbFee(){
       		return this.rbFee;
      }    
      public Boolean  getIfSpecial(){
       		return this.ifSpecial;
      }    
      public String  getRegSourceCode(){
       		return this.regSourceCode;
      }    
      public String  getRegisterDpCode(){
       		return this.registerDpCode;
      }    
      public String  getMedicalInsuranceType(){
       		return this.medicalInsuranceType;
      }    
      public String  getRegTypeCode(){
       		return this.regTypeCode;
      }    
      public Long  getRegisterTime(){
       		return this.registerTime;
      }    
      public String  getRegNo(){
       		return this.regNo;
      }    
	  public String getErrorMessage() {
	        return errorMessage;
	  }
	  public String getErrorDetail() {
	        return errorDetail;
	  }  
}