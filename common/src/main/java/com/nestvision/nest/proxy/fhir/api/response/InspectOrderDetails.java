package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.InspectOrder;

public class InspectOrderDetails extends InspectOrderRecord {
    /**
     *名称:院内检查申请单id
     *备注:检查申请单在院内系统中的唯一标识
 	 *
     */
     private String inspectionOrderId;
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
     *名称:检查项目代码
     *
 	 *
     */
     private String inspectionItemCd;
    /**
     *名称:检查项目名字
     *
 	 *
     */
     private String inspectionItemName;
    /**
     *名称:检查部位代码
     *
 	 *限制:CV0600227
     */
     private String partCode;
    /**
     *名称:检查部位名称
     *
 	 *限制:CV0600227
     */
     private String partName;
    /**
     *名称:申请科室id
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
     */
     private String orderDpid;
    /**
     *名称:检查科室id
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
     *名称:检查类别代码
     *
 	 *限制:CV9900391
     */
     private String inspectionType;
    /**
     *名称:检查类别名称
     *
 	 *限制:CV9900391
     */
     private String inspectionTypeName;
     private String errorMessage;
     private String errorDetail;             
     public InspectOrderDetails(InspectOrder inspectOrder) {
        super(inspectOrder);
         this.inspectionOrderId=inspectOrder.getInspectionOrderId();
         this.status=inspectOrder.getStatus();
         this.priority=inspectOrder.getPriority();
         this.patientId=inspectOrder.getPatientId();
         this.patientName=inspectOrder.getPatientName();
         this.visitMark=inspectOrder.getVisitMark();
         this.registrationId=inspectOrder.getRegistrationId();
         this.ordererEmployeeId=inspectOrder.getOrdererEmployeeId();
         this.inspectionItemCd=inspectOrder.getInspectionItemCd();
         this.inspectionItemName=inspectOrder.getInspectionItemName();
         this.partCode=inspectOrder.getPartCode();
         this.partName=inspectOrder.getPartName();
         this.orderDpid=inspectOrder.getOrderDpid();
         this.dpId=inspectOrder.getDpId();
         java.util.Date _orderDate = inspectOrder.getOrderDate();
         if(_orderDate!=null){
         	this.orderDate=_orderDate.getTime();
         }
         this.inspectionObjective=inspectOrder.getInspectionObjective();
         this.orderTypeCd=inspectOrder.getOrderTypeCd();
         this.adviceId=inspectOrder.getAdviceId();
         this.inspectionType=inspectOrder.getInspectionType();
         this.inspectionTypeName=inspectOrder.getInspectionTypeName();
         this.errorMessage=inspectOrder.getErrorMessage();
         this.errorDetail=inspectOrder.getErrorDetail();      
    }
      public String  getInspectionOrderId(){
       		return this.inspectionOrderId;
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
      public String  getInspectionItemCd(){
       		return this.inspectionItemCd;
      }    
      public String  getInspectionItemName(){
       		return this.inspectionItemName;
      }    
      public String  getPartCode(){
       		return this.partCode;
      }    
      public String  getPartName(){
       		return this.partName;
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
      public String  getInspectionType(){
       		return this.inspectionType;
      }    
      public String  getInspectionTypeName(){
       		return this.inspectionTypeName;
      }    
	  public String getErrorMessage() {
	        return errorMessage;
	  }
	  public String getErrorDetail() {
	        return errorDetail;
	  }  
}