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
@Table(name = BaseEntity.TABLE_PREFIX + "INPATIENT_CHARGES")
public class InpatientCharges extends FhirResourceEntity {

    /**
     *名称:院内住院收费记录id
     *备注:住院收费记录在院内系统中的唯一标识
 	 *
 	 *主键字段
     */
     @Column(name="INPATIENT_CHARGES_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="INPATIENT_CHARGES_ID",displayName="院内住院收费记录id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String inpatientChargesId;
    /**
     *名称:报销日期
     *
 	 *
 	 *
     */
     @Column(name="CREATED",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="CREATED",displayName="报销日期",required=false,valuesRange="")   
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
     *名称:住院流水号
     *备注:引用住院接诊表T_INPATIENT_REGISTRATION院内住院流水号
 	 *
 	 *
     */
     @Column(name="INPATIENT_REGISTRATION_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="INPATIENT_REGISTRATION_ID",displayName="住院流水号",maxLength=40,required=true,valuesRange="")   
     private String inpatientRegistrationId;
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
     @javax.persistence.OrderBy("upTime DESC")
     @OneToMany(mappedBy="inpatientCharges",cascade=CascadeType.ALL,fetch=javax.persistence.FetchType.EAGER)
     @org.hibernate.annotations.Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
     private List<InpatientChargesDetail> inpatientChargesDetails;
     @javax.persistence.OrderBy("upTime DESC")
     @OneToMany(mappedBy="inpatientCharges",cascade=CascadeType.ALL,fetch=javax.persistence.FetchType.EAGER)
     @org.hibernate.annotations.Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
     private List<InpatientChargesPayDetail> inpatientChargesPayDetails;
    
     public String getInpatientChargesId(){
       	return this.inpatientChargesId;
     }
     public void setInpatientChargesId(String inpatientChargesId){
       	this.inpatientChargesId=inpatientChargesId;
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
     public String getInpatientRegistrationId(){
       	return this.inpatientRegistrationId;
     }
     public void setInpatientRegistrationId(String inpatientRegistrationId){
       	this.inpatientRegistrationId=inpatientRegistrationId;
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
     public List<InpatientChargesDetail> getInpatientChargesDetails(){
       	return this.inpatientChargesDetails;
    }
     public void setInpatientChargesDetails(List<InpatientChargesDetail> inpatientChargesDetails){
        this.inpatientChargesDetails=inpatientChargesDetails;
    }
     public List<InpatientChargesPayDetail> getInpatientChargesPayDetails(){
       	return this.inpatientChargesPayDetails;
    }
     public void setInpatientChargesPayDetails(List<InpatientChargesPayDetail> inpatientChargesPayDetails){
        this.inpatientChargesPayDetails=inpatientChargesPayDetails;
    }
}