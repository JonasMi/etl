package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.OutpatientCharges;

public class OutpatientChargesDetails extends OutpatientChargesRecord {
    /**
     *名称:院内门诊收费记录id
     *备注:门诊收费记录在院内系统中的唯一标识
 	 *
     */
     private String outpatientChargesId;
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
     *名称:医疗机构类型
     *
 	 *
     */
     private String medicalInstitutionsType;
    /**
     *名称:收款单位
     *
 	 *
     */
     private String receivables;
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
     *名称:门诊流水号
     *备注:引用门诊接诊表T_OUTPATIENT_REGISTRATION院内门诊流水号
 	 *
     */
     private String outpatientRegistrationId;
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
    /**
     *名称:门诊大额支付
     *
 	 *
     */
     private Float outpatientLargePayment;
    /**
     *名称:退休补充支付
     *
 	 *
     */
     private Float retirementSupplementaryPayment;
    /**
     *名称:残军补助支付
     *
 	 *
     */
     private Float remnantSubsidyPayments;
    /**
     *名称:单位补充险（原公疗）支付
     *
 	 *
     */
     private Float unitSupplementaryInsurancePayments;
    /**
     *名称:医疗保险范围内金额
     *
 	 *
     */
     private Float midwaySettlementAmount;
    /**
     *名称:累计医保内围内金额
     *
 	 *
     */
     private Float aaimiAmount;
    /**
     *名称:年度门诊大额累计支付
     *
 	 *
     */
     private Float aoptp;
    /**
     *名称:个人账户余额
     *
 	 *
     */
     private Float personalAccountBalance;
    /**
     *名称:个人自付一
     *
 	 *
     */
     private Float selfPaymentOne;
    /**
     *名称:起付金额
     *
 	 *
     */
     private Float payAmount;
    /**
     *名称:超封顶金额
     *
 	 *
     */
     private Float superCappingAmount;
    /**
     *名称:个人自付二
     *
 	 *
     */
     private Float selfPaymentTwo;
    /**
     *名称:个人支付自费金额
     *
 	 *
     */
     private Float selfExpenseAmount;
    /**
     *名称:医疗保险基金支付金额
     *
 	 *
     */
     private Float midwaySettlementPayAmount;
    /**
     *名称:本次个人现金支付金额
     *
 	 *
     */
     private Float cashPaymentAmount;
    /**
     *名称:本次个人账户支付金额
     *
 	 *
     */
     private Float accountPaymentAmount;
     private String errorMessage;
     private String errorDetail;             
     public OutpatientChargesDetails(OutpatientCharges outpatientCharges) {
        super(outpatientCharges);
         this.outpatientChargesId=outpatientCharges.getOutpatientChargesId();
         java.util.Date _created = outpatientCharges.getCreated();
         if(_created!=null){
         	this.created=_created.getTime();
         }
         this.originalChargesId=outpatientCharges.getOriginalChargesId();
         this.chargeEmpId=outpatientCharges.getChargeEmpId();
         this.medicalInstitutionsType=outpatientCharges.getMedicalInstitutionsType();
         this.receivables=outpatientCharges.getReceivables();
         this.patientId=outpatientCharges.getPatientId();
         this.total=outpatientCharges.getTotal();
         this.medicalinsRuralcmsMark=outpatientCharges.getMedicalinsRuralcmsMark();
         this.insuranceNumber=outpatientCharges.getInsuranceNumber();
         this.outpatientRegistrationId=outpatientCharges.getOutpatientRegistrationId();
         this.reimbursementType=outpatientCharges.getReimbursementType();
         this.invoiceId=outpatientCharges.getInvoiceId();
         this.cancelType=outpatientCharges.getCancelType();
         this.feeCode=outpatientCharges.getFeeCode();
         java.util.Date _clinCostDate = outpatientCharges.getClinCostDate();
         if(_clinCostDate!=null){
         	this.clinCostDate=_clinCostDate.getTime();
         }
         this.notes=outpatientCharges.getNotes();
         this.psnExpense=outpatientCharges.getPsnExpense();
         this.reimbursementCost=outpatientCharges.getReimbursementCost();
         this.submitRatio=outpatientCharges.getSubmitRatio();
         this.outpatientLargePayment=outpatientCharges.getOutpatientLargePayment();
         this.retirementSupplementaryPayment=outpatientCharges.getRetirementSupplementaryPayment();
         this.remnantSubsidyPayments=outpatientCharges.getRemnantSubsidyPayments();
         this.unitSupplementaryInsurancePayments=outpatientCharges.getUnitSupplementaryInsurancePayments();
         this.midwaySettlementAmount=outpatientCharges.getMidwaySettlementAmount();
         this.aaimiAmount=outpatientCharges.getAaimiAmount();
         this.aoptp=outpatientCharges.getAoptp();
         this.personalAccountBalance=outpatientCharges.getPersonalAccountBalance();
         this.selfPaymentOne=outpatientCharges.getSelfPaymentOne();
         this.payAmount=outpatientCharges.getPayAmount();
         this.superCappingAmount=outpatientCharges.getSuperCappingAmount();
         this.selfPaymentTwo=outpatientCharges.getSelfPaymentTwo();
         this.selfExpenseAmount=outpatientCharges.getSelfExpenseAmount();
         this.midwaySettlementPayAmount=outpatientCharges.getMidwaySettlementPayAmount();
         this.cashPaymentAmount=outpatientCharges.getCashPaymentAmount();
         this.accountPaymentAmount=outpatientCharges.getAccountPaymentAmount();
         this.errorMessage=outpatientCharges.getErrorMessage();
         this.errorDetail=outpatientCharges.getErrorDetail();      
    }
      public String  getOutpatientChargesId(){
       		return this.outpatientChargesId;
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
      public String  getMedicalInstitutionsType(){
       		return this.medicalInstitutionsType;
      }    
      public String  getReceivables(){
       		return this.receivables;
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
      public String  getOutpatientRegistrationId(){
       		return this.outpatientRegistrationId;
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
      public Float  getOutpatientLargePayment(){
       		return this.outpatientLargePayment;
      }    
      public Float  getRetirementSupplementaryPayment(){
       		return this.retirementSupplementaryPayment;
      }    
      public Float  getRemnantSubsidyPayments(){
       		return this.remnantSubsidyPayments;
      }    
      public Float  getUnitSupplementaryInsurancePayments(){
       		return this.unitSupplementaryInsurancePayments;
      }    
      public Float  getMidwaySettlementAmount(){
       		return this.midwaySettlementAmount;
      }    
      public Float  getAaimiAmount(){
       		return this.aaimiAmount;
      }    
      public Float  getAoptp(){
       		return this.aoptp;
      }    
      public Float  getPersonalAccountBalance(){
       		return this.personalAccountBalance;
      }    
      public Float  getSelfPaymentOne(){
       		return this.selfPaymentOne;
      }    
      public Float  getPayAmount(){
       		return this.payAmount;
      }    
      public Float  getSuperCappingAmount(){
       		return this.superCappingAmount;
      }    
      public Float  getSelfPaymentTwo(){
       		return this.selfPaymentTwo;
      }    
      public Float  getSelfExpenseAmount(){
       		return this.selfExpenseAmount;
      }    
      public Float  getMidwaySettlementPayAmount(){
       		return this.midwaySettlementPayAmount;
      }    
      public Float  getCashPaymentAmount(){
       		return this.cashPaymentAmount;
      }    
      public Float  getAccountPaymentAmount(){
       		return this.accountPaymentAmount;
      }    
	  public String getErrorMessage() {
	        return errorMessage;
	  }
	  public String getErrorDetail() {
	        return errorDetail;
	  }  
}