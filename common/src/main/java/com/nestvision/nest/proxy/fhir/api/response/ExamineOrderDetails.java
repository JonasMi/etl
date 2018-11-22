package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.ExamineOrder;

public class ExamineOrderDetails extends ExamineOrderRecord {
    /**
     *名称:院内检验申请单id
     *备注:检验申请单在院内系统中的唯一标识
 	 *
     */
     private String examinationOrderId;
    /**
     *名称:申请状态
     *
 	 *限制:CUS00009
     */
     private String status;
    /**
     *名称:优先等级
     *
 	 *限制:CUS00010
     */
     private String priority;
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
     *名称:申请医生ID
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
     */
     private String ordererEmployeeId;
    /**
     *名称:检验总项目代码
     *
 	 *
     */
     private String examinationItemCd;
    /**
     *名称:检验总项目名字
     *
 	 *
     */
     private String examinationItemName;
    /**
     *名称:标本采集部位代码
     *
 	 *限制:CV9900316
     */
     private String specimensCode;
    /**
     *名称:标本采集部位名称
     *
 	 *
     */
     private String specimensName;
    /**
     *名称:申请科室id
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
     */
     private String orderDpid;
    /**
     *名称:检验科室id
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
     */
     private String dpId;
    /**
     *名称:申请时间
     *
 	 *
     */
     private Long orderDate;
    /**
     *名称:检查目的
     *
 	 *
     */
     private String inspectionObjective;
    /**
     *名称:对应医嘱类型
     *
 	 *限制:CV9900390
     */
     private String orderTypeCd;
    /**
     *名称:对应医嘱号
     *
 	 *
     */
     private String adviceId;
    /**
     *名称:检验类别代码
     *
 	 *限制:CV9900393
     */
     private String examinationType;
    /**
     *名称:检验类别名称
     *
 	 *限制:CV9900393
     */
     private String examinationTypeName;
     private String errorMessage;
     private String errorDetail;             
     public ExamineOrderDetails(ExamineOrder examineOrder) {
        super(examineOrder);
         this.examinationOrderId=examineOrder.getExaminationOrderId();
         this.status=examineOrder.getStatus();
         this.priority=examineOrder.getPriority();
         this.patientId=examineOrder.getPatientId();
         this.patientName=examineOrder.getPatientName();
         this.visitMark=examineOrder.getVisitMark();
         this.registrationId=examineOrder.getRegistrationId();
         this.ordererEmployeeId=examineOrder.getOrdererEmployeeId();
         this.examinationItemCd=examineOrder.getExaminationItemCd();
         this.examinationItemName=examineOrder.getExaminationItemName();
         this.specimensCode=examineOrder.getSpecimensCode();
         this.specimensName=examineOrder.getSpecimensName();
         this.orderDpid=examineOrder.getOrderDpid();
         this.dpId=examineOrder.getDpId();
         java.util.Date _orderDate = examineOrder.getOrderDate();
         if(_orderDate!=null){
         	this.orderDate=_orderDate.getTime();
         }
         this.inspectionObjective=examineOrder.getInspectionObjective();
         this.orderTypeCd=examineOrder.getOrderTypeCd();
         this.adviceId=examineOrder.getAdviceId();
         this.examinationType=examineOrder.getExaminationType();
         this.examinationTypeName=examineOrder.getExaminationTypeName();
         this.errorMessage=examineOrder.getErrorMessage();
         this.errorDetail=examineOrder.getErrorDetail();      
    }
      public String  getExaminationOrderId(){
       		return this.examinationOrderId;
      }    
      public String  getStatus(){
       		return this.status;
      }    
      public String  getPriority(){
       		return this.priority;
      }    
      public String  getPatientId(){
       		return this.patientId;
      }    
      public String  getPatientName(){
       		return this.patientName;
      }    
      public String  getVisitMark(){
       		return this.visitMark;
      }    
      public String  getRegistrationId(){
       		return this.registrationId;
      }    
      public String  getOrdererEmployeeId(){
       		return this.ordererEmployeeId;
      }    
      public String  getExaminationItemCd(){
       		return this.examinationItemCd;
      }    
      public String  getExaminationItemName(){
       		return this.examinationItemName;
      }    
      public String  getSpecimensCode(){
       		return this.specimensCode;
      }    
      public String  getSpecimensName(){
       		return this.specimensName;
      }    
      public String  getOrderDpid(){
       		return this.orderDpid;
      }    
      public String  getDpId(){
       		return this.dpId;
      }    
      public Long  getOrderDate(){
       		return this.orderDate;
      }    
      public String  getInspectionObjective(){
       		return this.inspectionObjective;
      }    
      public String  getOrderTypeCd(){
       		return this.orderTypeCd;
      }    
      public String  getAdviceId(){
       		return this.adviceId;
      }    
      public String  getExaminationType(){
       		return this.examinationType;
      }    
      public String  getExaminationTypeName(){
       		return this.examinationTypeName;
      }    
	  public String getErrorMessage() {
	        return errorMessage;
	  }
	  public String getErrorDetail() {
	        return errorDetail;
	  }  
}