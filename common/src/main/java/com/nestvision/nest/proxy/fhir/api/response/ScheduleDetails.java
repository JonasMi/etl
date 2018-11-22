package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.Schedule;

public class ScheduleDetails extends ScheduleRecord {
    /**
     *名称:院内排班id
     *备注:号别在院内系统中的唯一标识
 	 *
     */
     private String scheduleId;
    /**
     *名称:被安排的医务人员ID号
     *备注:引用医务人员表T_EMPLOYEE院内人员id
 	 *
     */
     private String employeeId;
    /**
     *名称:排班日期
     *
 	 *
     */
     private Long arrDate;
    /**
     *名称:号别信息id
     *备注:引用号别信息表T_CLINICTYPE院内号别编码
 	 *
     */
     private String chargeType;
    /**
     *名称:允许预约量
     *
 	 *
     */
     private Integer allowReservationNum;
    /**
     *名称:允许挂号量
     *
 	 *
     */
     private Integer allowRegistrationNum;
    /**
     *名称:时间段代码
     *
 	 *限制:CV9900282
     */
     private String preTimeCode;
    /**
     *名称:排班时间段开始时间
     *
 	 *
     */
     private Long start;
    /**
     *名称:排班时间段结束时间
     *
 	 *
     */
     private Long end;
    /**
     *名称:备注
     *
 	 *
     */
     private String comment;
    /**
     *名称:是否停诊
     *
 	 *限制:CUS00004
     */
     private Boolean ifStopDiagnosis;
    /**
     *名称:替诊医生
     *备注:引用医务人员表T_EMPLOYEE院内人员id
 	 *
     */
     private String replaceDiagnosisDoctor;
    /**
     *名称:停诊原因
     *
 	 *
     */
     private String stopDiagnosisReason;
    /**
     *名称:停诊起始日期
     *
 	 *
     */
     private Long stopDiagnosisStartdate;
    /**
     *名称:停诊结束日期
     *
 	 *
     */
     private Long stopDiagnosisEnddate;
     private String errorMessage;
     private String errorDetail;             
     public ScheduleDetails(Schedule schedule) {
        super(schedule);
         this.scheduleId=schedule.getScheduleId();
         this.employeeId=schedule.getEmployeeId();
         java.util.Date _arrDate = schedule.getArrDate();
         if(_arrDate!=null){
         	this.arrDate=_arrDate.getTime();
         }
         this.chargeType=schedule.getChargeType();
         this.allowReservationNum=schedule.getAllowReservationNum();
         this.allowRegistrationNum=schedule.getAllowRegistrationNum();
         this.preTimeCode=schedule.getPreTimeCode();
         java.util.Date _start = schedule.getStart();
         if(_start!=null){
         	this.start=_start.getTime();
         }
         java.util.Date _end = schedule.getEnd();
         if(_end!=null){
         	this.end=_end.getTime();
         }
         this.comment=schedule.getComment();
         this.ifStopDiagnosis=schedule.getIfStopDiagnosis();
         this.replaceDiagnosisDoctor=schedule.getReplaceDiagnosisDoctor();
         this.stopDiagnosisReason=schedule.getStopDiagnosisReason();
         java.util.Date _stopDiagnosisStartdate = schedule.getStopDiagnosisStartdate();
         if(_stopDiagnosisStartdate!=null){
         	this.stopDiagnosisStartdate=_stopDiagnosisStartdate.getTime();
         }
         java.util.Date _stopDiagnosisEnddate = schedule.getStopDiagnosisEnddate();
         if(_stopDiagnosisEnddate!=null){
         	this.stopDiagnosisEnddate=_stopDiagnosisEnddate.getTime();
         }
         this.errorMessage=schedule.getErrorMessage();
         this.errorDetail=schedule.getErrorDetail();      
    }
      public String  getScheduleId(){
       		return this.scheduleId;
      }    
      public String  getEmployeeId(){
       		return this.employeeId;
      }    
      public Long  getArrDate(){
       		return this.arrDate;
      }    
      public String  getChargeType(){
       		return this.chargeType;
      }    
      public Integer  getAllowReservationNum(){
       		return this.allowReservationNum;
      }    
      public Integer  getAllowRegistrationNum(){
       		return this.allowRegistrationNum;
      }    
      public String  getPreTimeCode(){
       		return this.preTimeCode;
      }    
      public Long  getStart(){
       		return this.start;
      }    
      public Long  getEnd(){
       		return this.end;
      }    
      public String  getComment(){
       		return this.comment;
      }    
      public Boolean  getIfStopDiagnosis(){
       		return this.ifStopDiagnosis;
      }    
      public String  getReplaceDiagnosisDoctor(){
       		return this.replaceDiagnosisDoctor;
      }    
      public String  getStopDiagnosisReason(){
       		return this.stopDiagnosisReason;
      }    
      public Long  getStopDiagnosisStartdate(){
       		return this.stopDiagnosisStartdate;
      }    
      public Long  getStopDiagnosisEnddate(){
       		return this.stopDiagnosisEnddate;
      }    
	  public String getErrorMessage() {
	        return errorMessage;
	  }
	  public String getErrorDetail() {
	        return errorDetail;
	  }  
}