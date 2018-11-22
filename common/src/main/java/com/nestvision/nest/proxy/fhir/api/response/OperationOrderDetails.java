package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.OperationOrder;

public class OperationOrderDetails extends OperationOrderRecord {
    /**
     *名称:院内手术申请单id
     *备注:手术申请单在院内系统中的唯一标识
 	 *
     */
     private String operationOrderId;
    /**
     *名称:患者ID
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
     *名称:手术编码
     *
 	 *限制:CV990113
     */
     private String operationCd;
    /**
     *名称:手术名称
     *
 	 *
     */
     private String operationName;
    /**
     *名称:预计手术日期
     *
 	 *
     */
     private Long scheduleddatetime;
    /**
     *名称:门诊或住院标识
     *
 	 *限制:CUS00010
     */
     private String visitMark;
    /**
     *名称:就诊流水号
     *备注:引用门诊接诊表T_OUTPATIENT_REGISTRATION院内门诊流水号或引用住院接诊表T_INPATIENT_REGISTRATION院内住院流水号
 	 *
     */
     private String registrationId;
    /**
     *名称:状态
     *
 	 *限制:CUS00014
     */
     private String status;
    /**
     *名称:申请医生ID
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
     */
     private String orderEmployeeId;
    /**
     *名称:申请科室
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
     */
     private String orderDpid;
    /**
     *名称:手术日期类型
     *
 	 *限制:CV9900277
     */
     private String opDateType;
     private String errorMessage;
     private String errorDetail;             
     public OperationOrderDetails(OperationOrder operationOrder) {
        super(operationOrder);
         this.operationOrderId=operationOrder.getOperationOrderId();
         this.patientId=operationOrder.getPatientId();
         this.patientName=operationOrder.getPatientName();
         this.operationCd=operationOrder.getOperationCd();
         this.operationName=operationOrder.getOperationName();
         java.util.Date _scheduleddatetime = operationOrder.getScheduleddatetime();
         if(_scheduleddatetime!=null){
         	this.scheduleddatetime=_scheduleddatetime.getTime();
         }
         this.visitMark=operationOrder.getVisitMark();
         this.registrationId=operationOrder.getRegistrationId();
         this.status=operationOrder.getStatus();
         this.orderEmployeeId=operationOrder.getOrderEmployeeId();
         this.orderDpid=operationOrder.getOrderDpid();
         this.opDateType=operationOrder.getOpDateType();
         this.errorMessage=operationOrder.getErrorMessage();
         this.errorDetail=operationOrder.getErrorDetail();      
    }
      public String  getOperationOrderId(){
       		return this.operationOrderId;
      }    
      public String  getPatientId(){
       		return this.patientId;
      }    
      public String  getPatientName(){
       		return this.patientName;
      }    
      public String  getOperationCd(){
       		return this.operationCd;
      }    
      public String  getOperationName(){
       		return this.operationName;
      }    
      public Long  getScheduleddatetime(){
       		return this.scheduleddatetime;
      }    
      public String  getVisitMark(){
       		return this.visitMark;
      }    
      public String  getRegistrationId(){
       		return this.registrationId;
      }    
      public String  getStatus(){
       		return this.status;
      }    
      public String  getOrderEmployeeId(){
       		return this.orderEmployeeId;
      }    
      public String  getOrderDpid(){
       		return this.orderDpid;
      }    
      public String  getOpDateType(){
       		return this.opDateType;
      }    
	  public String getErrorMessage() {
	        return errorMessage;
	  }
	  public String getErrorDetail() {
	        return errorDetail;
	  }  
}