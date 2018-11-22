package com.nestvision.nest.proxy.fhir.entity;
import java.util.List;
import javax.persistence.Temporal;
import java.util.Date;
import javax.persistence.TemporalType;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.nestvision.nest.proxy.base.entity.BaseEntity;
import com.nestvision.nest.proxy.fhir.anotaion.FhirFieldValidate;

@Entity
@Table(name = BaseEntity.TABLE_PREFIX + "OUTPATIENT_CHARGES")
public class OutpatientCharges extends FhirResourceEntity {

    /**
     *名称:院内门诊收费记录id
     *备注:门诊收费记录在院内系统中的唯一标识
 	 *
 	 *主键字段
     */
     @Column(name="OUTPATIENT_CHARGES_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="OUTPATIENT_CHARGES_ID",displayName="院内门诊收费记录id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String outpatientChargesId;
    /**
     *名称:报销日期
     *
 	 *
 	 *
     */
     @Column(name="CREATED",nullable = false)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="CREATED",displayName="报销日期",required=true,valuesRange="")   
     private Date created;
    /**
     *名称:原收费单号id
     *备注:仅当此单为红票时填写
 	 *
 	 *
     */
     @Column(name="ORIGINAL_CHARGES_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="ORIGINAL_CHARGES_ID",displayName="原收费单号id",maxLength=40,required=false,valuesRange="")   
     private String originalChargesId;
    /**
     *名称:收费人ID
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="CHARGE_EMP_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="CHARGE_EMP_ID",displayName="收费人ID",maxLength=40,required=false,valuesRange="")   
     private String chargeEmpId;
    /**
     *名称:医疗机构类型
     *
 	 *
 	 *
     */
     @Column(name="MEDICAL_INSTITUTIONS_TYPE",length = 50,nullable = true)
     @FhirFieldValidate(name="MEDICAL_INSTITUTIONS_TYPE",displayName="医疗机构类型",maxLength=50,required=false,valuesRange="")   
     private String medicalInstitutionsType;
    /**
     *名称:收款单位
     *
 	 *
 	 *
     */
     @Column(name="RECEIVABLES",length = 50,nullable = true)
     @FhirFieldValidate(name="RECEIVABLES",displayName="收款单位",maxLength=50,required=false,valuesRange="")   
     private String receivables;
    /**
     *名称:患者ID
     *备注:引用患者信息表T_PATIENT院内患者id
 	 *
 	 *
     */
     @Column(name="PATIENT_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="PATIENT_ID",displayName="患者ID",maxLength=40,required=true,valuesRange="")   
     private String patientId;
    /**
     *名称:总金额
     *
 	 *
 	 *
     */
     @Column(name="TOTAL",length = 8,nullable = false)
     @FhirFieldValidate(name="TOTAL",displayName="总金额",maxLength=8,required=true,valuesRange="")   
     private Float total;
    /**
     *名称:农合/医保标志
     *
 	 *限制:CUS00016
 	 *
     */
     @Column(name="MEDICALINS_RURALCMS_MARK",length = 2,nullable = true)
     @FhirFieldValidate(name="MEDICALINS_RURALCMS_MARK",displayName="农合/医保标志",maxLength=2,required=false,valuesRange="CUS00016")   
     private Integer medicalinsRuralcmsMark;
    /**
     *名称:农合/医保流水号
     *
 	 *
 	 *
     */
     @Column(name="INSURANCE_NUMBER",length = 40,nullable = true)
     @FhirFieldValidate(name="INSURANCE_NUMBER",displayName="农合/医保流水号",maxLength=40,required=false,valuesRange="")   
     private String insuranceNumber;
    /**
     *名称:门诊流水号
     *备注:引用门诊接诊表T_OUTPATIENT_REGISTRATION院内门诊流水号
 	 *
 	 *
     */
     @Column(name="OUTPATIENT_REGISTRATION_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="OUTPATIENT_REGISTRATION_ID",displayName="门诊流水号",maxLength=40,required=true,valuesRange="")   
     private String outpatientRegistrationId;
    /**
     *名称:报销类型
     *
 	 *限制:CV990100
 	 *
     */
     @Column(name="REIMBURSEMENT_TYPE",length = 20,nullable = true)
     @FhirFieldValidate(name="REIMBURSEMENT_TYPE",displayName="报销类型",maxLength=20,required=false,valuesRange="CV990100")   
     private String reimbursementType;
    /**
     *名称:打印发票号
     *
 	 *
 	 *
     */
     @Column(name="INVOICE_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="INVOICE_ID",displayName="打印发票号",maxLength=40,required=false,valuesRange="")   
     private String invoiceId;
    /**
     *名称:是否红票标识
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="CANCEL_TYPE",length = 5,nullable = true)
     @FhirFieldValidate(name="CANCEL_TYPE",displayName="是否红票标识",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean cancelType;
    /**
     *名称:医疗付费方式代码
     *
 	 *限制:CV9900376
 	 *
     */
     @Column(name="FEE_CODE",length = 20,nullable = false)
     @FhirFieldValidate(name="FEE_CODE",displayName="医疗付费方式代码",maxLength=20,required=true,valuesRange="CV9900376")   
     private String feeCode;
    /**
     *名称:收费时间
     *
 	 *
 	 *
     */
     @Column(name="CLIN_COST_DATE",nullable = false)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="CLIN_COST_DATE",displayName="收费时间",required=true,valuesRange="")   
     private Date clinCostDate;
    /**
     *名称:备注
     *
 	 *
 	 *
     */
     @Column(name="NOTES",length = 500,nullable = true)
     @FhirFieldValidate(name="NOTES",displayName="备注",maxLength=500,required=false,valuesRange="")   
     private String notes;
    /**
     *名称:个人承担费用
     *
 	 *
 	 *
     */
     @Column(name="PSN_EXPENSE",length = 8,nullable = false)
     @FhirFieldValidate(name="PSN_EXPENSE",displayName="个人承担费用",maxLength=8,required=true,valuesRange="")   
     private Float psnExpense;
    /**
     *名称:报销金额
     *
 	 *
 	 *
     */
     @Column(name="REIMBURSEMENT_COST",length = 8,nullable = false)
     @FhirFieldValidate(name="REIMBURSEMENT_COST",displayName="报销金额",maxLength=8,required=true,valuesRange="")   
     private Float reimbursementCost;
    /**
     *名称:报销比例
     *
 	 *
 	 *
     */
     @Column(name="SUBMIT_RATIO",length = 4,nullable = true)
     @FhirFieldValidate(name="SUBMIT_RATIO",displayName="报销比例",maxLength=4,required=false,valuesRange="")   
     private Float submitRatio;
    /**
     *名称:门诊大额支付
     *
 	 *
 	 *
     */
     @Column(name="OUTPATIENT_LARGE_PAYMENT",length = 14,nullable = true)
     @FhirFieldValidate(name="OUTPATIENT_LARGE_PAYMENT",displayName="门诊大额支付",maxLength=14,required=false,valuesRange="")   
     private Float outpatientLargePayment;
    /**
     *名称:退休补充支付
     *
 	 *
 	 *
     */
     @Column(name="RETIREMENT_SUPPLEMENTARY_PAYMENT",length = 14,nullable = true)
     @FhirFieldValidate(name="RETIREMENT_SUPPLEMENTARY_PAYMENT",displayName="退休补充支付",maxLength=14,required=false,valuesRange="")   
     private Float retirementSupplementaryPayment;
    /**
     *名称:残军补助支付
     *
 	 *
 	 *
     */
     @Column(name="REMNANT_SUBSIDY_PAYMENTS",length = 14,nullable = true)
     @FhirFieldValidate(name="REMNANT_SUBSIDY_PAYMENTS",displayName="残军补助支付",maxLength=14,required=false,valuesRange="")   
     private Float remnantSubsidyPayments;
    /**
     *名称:单位补充险（原公疗）支付
     *
 	 *
 	 *
     */
     @Column(name="UNIT_SUPPLEMENTARY_INSURANCE_PAYMENTS",length = 14,nullable = true)
     @FhirFieldValidate(name="UNIT_SUPPLEMENTARY_INSURANCE_PAYMENTS",displayName="单位补充险（原公疗）支付",maxLength=14,required=false,valuesRange="")   
     private Float unitSupplementaryInsurancePayments;
    /**
     *名称:医疗保险范围内金额
     *
 	 *
 	 *
     */
     @Column(name="MIDWAY_SETTLEMENT_AMOUNT",length = 14,nullable = true)
     @FhirFieldValidate(name="MIDWAY_SETTLEMENT_AMOUNT",displayName="医疗保险范围内金额",maxLength=14,required=false,valuesRange="")   
     private Float midwaySettlementAmount;
    /**
     *名称:累计医保内围内金额
     *
 	 *
 	 *
     */
     @Column(name="AAIMI_AMOUNT",length = 14,nullable = true)
     @FhirFieldValidate(name="AAIMI_AMOUNT",displayName="累计医保内围内金额",maxLength=14,required=false,valuesRange="")   
     private Float aaimiAmount;
    /**
     *名称:年度门诊大额累计支付
     *
 	 *
 	 *
     */
     @Column(name="AOPTP",length = 14,nullable = true)
     @FhirFieldValidate(name="AOPTP",displayName="年度门诊大额累计支付",maxLength=14,required=false,valuesRange="")   
     private Float aoptp;
    /**
     *名称:个人账户余额
     *
 	 *
 	 *
     */
     @Column(name="PERSONAL_ACCOUNT_BALANCE",length = 14,nullable = true)
     @FhirFieldValidate(name="PERSONAL_ACCOUNT_BALANCE",displayName="个人账户余额",maxLength=14,required=false,valuesRange="")   
     private Float personalAccountBalance;
    /**
     *名称:个人自付一
     *
 	 *
 	 *
     */
     @Column(name="SELF_PAYMENT_ONE",length = 14,nullable = true)
     @FhirFieldValidate(name="SELF_PAYMENT_ONE",displayName="个人自付一",maxLength=14,required=false,valuesRange="")   
     private Float selfPaymentOne;
    /**
     *名称:起付金额
     *
 	 *
 	 *
     */
     @Column(name="PAY_AMOUNT",length = 14,nullable = true)
     @FhirFieldValidate(name="PAY_AMOUNT",displayName="起付金额",maxLength=14,required=false,valuesRange="")   
     private Float payAmount;
    /**
     *名称:超封顶金额
     *
 	 *
 	 *
     */
     @Column(name="SUPER_CAPPING_AMOUNT",length = 14,nullable = true)
     @FhirFieldValidate(name="SUPER_CAPPING_AMOUNT",displayName="超封顶金额",maxLength=14,required=false,valuesRange="")   
     private Float superCappingAmount;
    /**
     *名称:个人自付二
     *
 	 *
 	 *
     */
     @Column(name="SELF_PAYMENT_TWO",length = 14,nullable = true)
     @FhirFieldValidate(name="SELF_PAYMENT_TWO",displayName="个人自付二",maxLength=14,required=false,valuesRange="")   
     private Float selfPaymentTwo;
    /**
     *名称:个人支付自费金额
     *
 	 *
 	 *
     */
     @Column(name="SELF_EXPENSE_AMOUNT",length = 14,nullable = true)
     @FhirFieldValidate(name="SELF_EXPENSE_AMOUNT",displayName="个人支付自费金额",maxLength=14,required=false,valuesRange="")   
     private Float selfExpenseAmount;
    /**
     *名称:医疗保险基金支付金额
     *
 	 *
 	 *
     */
     @Column(name="MIDWAY_SETTLEMENT_PAY_AMOUNT",length = 14,nullable = true)
     @FhirFieldValidate(name="MIDWAY_SETTLEMENT_PAY_AMOUNT",displayName="医疗保险基金支付金额",maxLength=14,required=false,valuesRange="")   
     private Float midwaySettlementPayAmount;
    /**
     *名称:本次个人现金支付金额
     *
 	 *
 	 *
     */
     @Column(name="CASH_PAYMENT_AMOUNT",length = 14,nullable = true)
     @FhirFieldValidate(name="CASH_PAYMENT_AMOUNT",displayName="本次个人现金支付金额",maxLength=14,required=false,valuesRange="")   
     private Float cashPaymentAmount;
    /**
     *名称:本次个人账户支付金额
     *
 	 *
 	 *
     */
     @Column(name="ACCOUNT_PAYMENT_AMOUNT",length = 14,nullable = true)
     @FhirFieldValidate(name="ACCOUNT_PAYMENT_AMOUNT",displayName="本次个人账户支付金额",maxLength=14,required=false,valuesRange="")   
     private Float accountPaymentAmount;
     @javax.persistence.OrderBy("upTime DESC")
     @OneToMany(mappedBy="outpatientCharges",cascade=CascadeType.ALL,fetch=javax.persistence.FetchType.EAGER)
     @org.hibernate.annotations.Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
     private List<OutpatientChargesDetail> outpatientChargesDetails;
     @javax.persistence.OrderBy("upTime DESC")
     @OneToMany(mappedBy="outpatientCharges",cascade=CascadeType.ALL,fetch=javax.persistence.FetchType.EAGER)
     @org.hibernate.annotations.Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
     private List<OutpatientChargesPayDetail> outpatientChargesPayDetails;
    
     public String getOutpatientChargesId(){
       	return this.outpatientChargesId;
     }
     public void setOutpatientChargesId(String outpatientChargesId){
       	this.outpatientChargesId=outpatientChargesId;
     }
     public Date getCreated(){
       	return this.created;
     }
     public void setCreated(Date created){
       	this.created=created;
     }
     public String getOriginalChargesId(){
       	return this.originalChargesId;
     }
     public void setOriginalChargesId(String originalChargesId){
       	this.originalChargesId=originalChargesId;
     }
     public String getChargeEmpId(){
       	return this.chargeEmpId;
     }
     public void setChargeEmpId(String chargeEmpId){
       	this.chargeEmpId=chargeEmpId;
     }
     public String getMedicalInstitutionsType(){
       	return this.medicalInstitutionsType;
     }
     public void setMedicalInstitutionsType(String medicalInstitutionsType){
       	this.medicalInstitutionsType=medicalInstitutionsType;
     }
     public String getReceivables(){
       	return this.receivables;
     }
     public void setReceivables(String receivables){
       	this.receivables=receivables;
     }
     public String getPatientId(){
       	return this.patientId;
     }
     public void setPatientId(String patientId){
       	this.patientId=patientId;
     }
     public Float getTotal(){
       	return this.total;
     }
     public void setTotal(Float total){
       	this.total=total;
     }
     public Integer getMedicalinsRuralcmsMark(){
       	return this.medicalinsRuralcmsMark;
     }
     public void setMedicalinsRuralcmsMark(Integer medicalinsRuralcmsMark){
       	this.medicalinsRuralcmsMark=medicalinsRuralcmsMark;
     }
     public String getInsuranceNumber(){
       	return this.insuranceNumber;
     }
     public void setInsuranceNumber(String insuranceNumber){
       	this.insuranceNumber=insuranceNumber;
     }
     public String getOutpatientRegistrationId(){
       	return this.outpatientRegistrationId;
     }
     public void setOutpatientRegistrationId(String outpatientRegistrationId){
       	this.outpatientRegistrationId=outpatientRegistrationId;
     }
     public String getReimbursementType(){
       	return this.reimbursementType;
     }
     public void setReimbursementType(String reimbursementType){
       	this.reimbursementType=reimbursementType;
     }
     public String getInvoiceId(){
       	return this.invoiceId;
     }
     public void setInvoiceId(String invoiceId){
       	this.invoiceId=invoiceId;
     }
     public Boolean getCancelType(){
       	return this.cancelType;
     }
     public void setCancelType(Boolean cancelType){
       	this.cancelType=cancelType;
     }
     public String getFeeCode(){
       	return this.feeCode;
     }
     public void setFeeCode(String feeCode){
       	this.feeCode=feeCode;
     }
     public Date getClinCostDate(){
       	return this.clinCostDate;
     }
     public void setClinCostDate(Date clinCostDate){
       	this.clinCostDate=clinCostDate;
     }
     public String getNotes(){
       	return this.notes;
     }
     public void setNotes(String notes){
       	this.notes=notes;
     }
     public Float getPsnExpense(){
       	return this.psnExpense;
     }
     public void setPsnExpense(Float psnExpense){
       	this.psnExpense=psnExpense;
     }
     public Float getReimbursementCost(){
       	return this.reimbursementCost;
     }
     public void setReimbursementCost(Float reimbursementCost){
       	this.reimbursementCost=reimbursementCost;
     }
     public Float getSubmitRatio(){
       	return this.submitRatio;
     }
     public void setSubmitRatio(Float submitRatio){
       	this.submitRatio=submitRatio;
     }
     public Float getOutpatientLargePayment(){
       	return this.outpatientLargePayment;
     }
     public void setOutpatientLargePayment(Float outpatientLargePayment){
       	this.outpatientLargePayment=outpatientLargePayment;
     }
     public Float getRetirementSupplementaryPayment(){
       	return this.retirementSupplementaryPayment;
     }
     public void setRetirementSupplementaryPayment(Float retirementSupplementaryPayment){
       	this.retirementSupplementaryPayment=retirementSupplementaryPayment;
     }
     public Float getRemnantSubsidyPayments(){
       	return this.remnantSubsidyPayments;
     }
     public void setRemnantSubsidyPayments(Float remnantSubsidyPayments){
       	this.remnantSubsidyPayments=remnantSubsidyPayments;
     }
     public Float getUnitSupplementaryInsurancePayments(){
       	return this.unitSupplementaryInsurancePayments;
     }
     public void setUnitSupplementaryInsurancePayments(Float unitSupplementaryInsurancePayments){
       	this.unitSupplementaryInsurancePayments=unitSupplementaryInsurancePayments;
     }
     public Float getMidwaySettlementAmount(){
       	return this.midwaySettlementAmount;
     }
     public void setMidwaySettlementAmount(Float midwaySettlementAmount){
       	this.midwaySettlementAmount=midwaySettlementAmount;
     }
     public Float getAaimiAmount(){
       	return this.aaimiAmount;
     }
     public void setAaimiAmount(Float aaimiAmount){
       	this.aaimiAmount=aaimiAmount;
     }
     public Float getAoptp(){
       	return this.aoptp;
     }
     public void setAoptp(Float aoptp){
       	this.aoptp=aoptp;
     }
     public Float getPersonalAccountBalance(){
       	return this.personalAccountBalance;
     }
     public void setPersonalAccountBalance(Float personalAccountBalance){
       	this.personalAccountBalance=personalAccountBalance;
     }
     public Float getSelfPaymentOne(){
       	return this.selfPaymentOne;
     }
     public void setSelfPaymentOne(Float selfPaymentOne){
       	this.selfPaymentOne=selfPaymentOne;
     }
     public Float getPayAmount(){
       	return this.payAmount;
     }
     public void setPayAmount(Float payAmount){
       	this.payAmount=payAmount;
     }
     public Float getSuperCappingAmount(){
       	return this.superCappingAmount;
     }
     public void setSuperCappingAmount(Float superCappingAmount){
       	this.superCappingAmount=superCappingAmount;
     }
     public Float getSelfPaymentTwo(){
       	return this.selfPaymentTwo;
     }
     public void setSelfPaymentTwo(Float selfPaymentTwo){
       	this.selfPaymentTwo=selfPaymentTwo;
     }
     public Float getSelfExpenseAmount(){
       	return this.selfExpenseAmount;
     }
     public void setSelfExpenseAmount(Float selfExpenseAmount){
       	this.selfExpenseAmount=selfExpenseAmount;
     }
     public Float getMidwaySettlementPayAmount(){
       	return this.midwaySettlementPayAmount;
     }
     public void setMidwaySettlementPayAmount(Float midwaySettlementPayAmount){
       	this.midwaySettlementPayAmount=midwaySettlementPayAmount;
     }
     public Float getCashPaymentAmount(){
       	return this.cashPaymentAmount;
     }
     public void setCashPaymentAmount(Float cashPaymentAmount){
       	this.cashPaymentAmount=cashPaymentAmount;
     }
     public Float getAccountPaymentAmount(){
       	return this.accountPaymentAmount;
     }
     public void setAccountPaymentAmount(Float accountPaymentAmount){
       	this.accountPaymentAmount=accountPaymentAmount;
     }
     public List<OutpatientChargesDetail> getOutpatientChargesDetails(){
       	return this.outpatientChargesDetails;
    }
     public void setOutpatientChargesDetails(List<OutpatientChargesDetail> outpatientChargesDetails){
        this.outpatientChargesDetails=outpatientChargesDetails;
    }
     public List<OutpatientChargesPayDetail> getOutpatientChargesPayDetails(){
       	return this.outpatientChargesPayDetails;
    }
     public void setOutpatientChargesPayDetails(List<OutpatientChargesPayDetail> outpatientChargesPayDetails){
        this.outpatientChargesPayDetails=outpatientChargesPayDetails;
    }
}