package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.InpatientCharges;

public class InpatientChargesDetails extends InpatientChargesRecord {
    /**
     *名称:院内住院收费记录id
     *备注:住院收费记录在院内系统中的唯一标识
 	 *
     */
     private String inpatientChargesId;
    /**
     *名称:报销日期
     *
 	 *
     */
     private Long created;
    /**
     *名称:原收费单号id
     *备注:仅当此单为红票时填写
 	 *
     */
     private String originalChargesId;
    /**
     *名称:收费人ID
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
     */
     private String chargeEmpId;
    /**
     *名称:患者ID
     *备注:引用患者信息表T_PATIENT院内患者id
 	 *
     */
     private String patientId;
    /**
     *名称:总金额
     *
 	 *
     */
     private Float total;
    /**
     *名称:农合/医保标志
     *
 	 *限制:CUS00016
     */
     private Integer medicalinsRuralcmsMark;
    /**
     *名称:农合/医保流水号
     *
 	 *
     */
     private String insuranceNumber;
    /**
     *名称:住院流水号
     *备注:引用住院接诊表T_INPATIENT_REGISTRATION院内住院流水号
 	 *
     */
     private String inpatientRegistrationId;
    /**
     *名称:报销类型
     *
 	 *限制:CV990100
     */
     private String reimbursementType;
    /**
     *名称:打印发票号
     *
 	 *
     */
     private String invoiceId;
    /**
     *名称:是否红票标识
     *
 	 *限制:CUS00004
     */
     private Boolean cancelType;
    /**
     *名称:医疗付费方式代码
     *
 	 *限制:CV9900376
     */
     private String feeCode;
    /**
     *名称:收费时间
     *
 	 *
     */
     private Long clinCostDate;
    /**
     *名称:备注
     *
 	 *
     */
     private String notes;
    /**
     *名称:个人承担费用
     *
 	 *
     */
     private Float psnExpense;
    /**
     *名称:报销金额
     *
 	 *
     */
     private Float reimbursementCost;
    /**
     *名称:报销比例
     *
 	 *
     */
     private Float submitRatio;
     private String errorMessage;
     private String errorDetail;             
     public InpatientChargesDetails(InpatientCharges inpatientCharges) {
        super(inpatientCharges);
         this.inpatientChargesId=inpatientCharges.getInpatientChargesId();
         java.util.Date _created = inpatientCharges.getCreated();
         if(_created!=null){
         	this.created=_created.getTime();
         }
         this.originalChargesId=inpatientCharges.getOriginalChargesId();
         this.chargeEmpId=inpatientCharges.getChargeEmpId();
         this.patientId=inpatientCharges.getPatientId();
         this.total=inpatientCharges.getTotal();
         this.medicalinsRuralcmsMark=inpatientCharges.getMedicalinsRuralcmsMark();
         this.insuranceNumber=inpatientCharges.getInsuranceNumber();
         this.inpatientRegistrationId=inpatientCharges.getInpatientRegistrationId();
         this.reimbursementType=inpatientCharges.getReimbursementType();
         this.invoiceId=inpatientCharges.getInvoiceId();
         this.cancelType=inpatientCharges.getCancelType();
         this.feeCode=inpatientCharges.getFeeCode();
         java.util.Date _clinCostDate = inpatientCharges.getClinCostDate();
         if(_clinCostDate!=null){
         	this.clinCostDate=_clinCostDate.getTime();
         }
         this.notes=inpatientCharges.getNotes();
         this.psnExpense=inpatientCharges.getPsnExpense();
         this.reimbursementCost=inpatientCharges.getReimbursementCost();
         this.submitRatio=inpatientCharges.getSubmitRatio();
         this.errorMessage=inpatientCharges.getErrorMessage();
         this.errorDetail=inpatientCharges.getErrorDetail();      
    }
      public String  getInpatientChargesId(){
       		return this.inpatientChargesId;
      }    
      public Long  getCreated(){
       		return this.created;
      }    
      public String  getOriginalChargesId(){
       		return this.originalChargesId;
      }    
      public String  getChargeEmpId(){
       		return this.chargeEmpId;
      }    
      public String  getPatientId(){
       		return this.patientId;
      }    
      public Float  getTotal(){
       		return this.total;
      }    
      public Integer  getMedicalinsRuralcmsMark(){
       		return this.medicalinsRuralcmsMark;
      }    
      public String  getInsuranceNumber(){
       		return this.insuranceNumber;
      }    
      public String  getInpatientRegistrationId(){
       		return this.inpatientRegistrationId;
      }    
      public String  getReimbursementType(){
       		return this.reimbursementType;
      }    
      public String  getInvoiceId(){
       		return this.invoiceId;
      }    
      public Boolean  getCancelType(){
       		return this.cancelType;
      }    
      public String  getFeeCode(){
       		return this.feeCode;
      }    
      public Long  getClinCostDate(){
       		return this.clinCostDate;
      }    
      public String  getNotes(){
       		return this.notes;
      }    
      public Float  getPsnExpense(){
       		return this.psnExpense;
      }    
      public Float  getReimbursementCost(){
       		return this.reimbursementCost;
      }    
      public Float  getSubmitRatio(){
       		return this.submitRatio;
      }    
	  public String getErrorMessage() {
	        return errorMessage;
	  }
	  public String getErrorDetail() {
	        return errorDetail;
	  }  
}