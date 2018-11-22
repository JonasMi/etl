package com.nestvision.nest.proxy.fhir.entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import java.util.Date;
import javax.persistence.TemporalType;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.nestvision.nest.proxy.base.entity.BaseEntity;
import com.nestvision.nest.proxy.fhir.anotaion.FhirFieldValidate;

@Entity
@Table(name = BaseEntity.TABLE_PREFIX + "INPATIENT_CHARGES_DETAIL")
public class InpatientChargesDetail extends FhirResourceEntity {

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
     *名称:收费明细序号
     *
 	 *
 	 *主键字段
     */
     @Column(name="CHARGES_DETAIL_SEQ",length = 40,nullable = false)
     @FhirFieldValidate(name="CHARGES_DETAIL_SEQ",displayName="收费明细序号",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String chargesDetailSeq;
    /**
     *名称:处方号
     *
 	 *
 	 *
     */
     @Column(name="RECIPE_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="RECIPE_ID",displayName="处方号",maxLength=40,required=false,valuesRange="")   
     private String recipeId;
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
     *名称:报销金额
     *
 	 *
 	 *
     */
     @Column(name="AMOUNT_REIMBURSEMENT",length = 8,nullable = true)
     @FhirFieldValidate(name="AMOUNT_REIMBURSEMENT",displayName="报销金额",maxLength=8,required=false,valuesRange="")   
     private Float amountReimbursement;
    /**
     *名称:自费金额
     *
 	 *
 	 *
     */
     @Column(name="SELF_AMOUNT",length = 8,nullable = true)
     @FhirFieldValidate(name="SELF_AMOUNT",displayName="自费金额",maxLength=8,required=false,valuesRange="")   
     private Float selfAmount;
    /**
     *名称:项目规格
     *
 	 *
 	 *
     */
     @Column(name="ITEM_SPEC",length = 40,nullable = true)
     @FhirFieldValidate(name="ITEM_SPEC",displayName="项目规格",maxLength=40,required=false,valuesRange="")   
     private String itemSpec;
    /**
     *名称:收费时间
     *
 	 *
 	 *
     */
     @Column(name="CLIN_COST_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="CLIN_COST_DATE",displayName="收费时间",required=false,valuesRange="")   
     private Date clinCostDate;
    /**
     *名称:是否婴儿标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IS_BABY",length = 5,nullable = true)
     @FhirFieldValidate(name="IS_BABY",displayName="是否婴儿标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean isBaby;
    /**
     *名称:开单科室
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
 	 *
     */
     @Column(name="ORDERED_DPID",length = 40,nullable = true)
     @FhirFieldValidate(name="ORDERED_DPID",displayName="开单科室",maxLength=40,required=false,valuesRange="")   
     private String orderedDpid;
    /**
     *名称:开单医生
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="ORDERED_EMPID",length = 40,nullable = true)
     @FhirFieldValidate(name="ORDERED_EMPID",displayName="开单医生",maxLength=40,required=false,valuesRange="")   
     private String orderedEmpid;
    /**
     *名称:执行科室
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
 	 *
     */
     @Column(name="PERFORM_DPID",length = 40,nullable = true)
     @FhirFieldValidate(name="PERFORM_DPID",displayName="执行科室",maxLength=40,required=false,valuesRange="")   
     private String performDpid;
    /**
     *名称:执行医生
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="PERFORM_EMPID",length = 40,nullable = true)
     @FhirFieldValidate(name="PERFORM_EMPID",displayName="执行医生",maxLength=40,required=false,valuesRange="")   
     private String performEmpid;
    /**
     *名称:费用类型代码
     *
 	 *限制:CV9900326
 	 *
     */
     @Column(name="ACC_CODE",length = 20,nullable = false)
     @FhirFieldValidate(name="ACC_CODE",displayName="费用类型代码",maxLength=20,required=true,valuesRange="CV9900326")   
     private String accCode;
    /**
     *名称:费用类型名称
     *
 	 *限制:CV9900326
 	 *
     */
     @Column(name="ACC_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="ACC_NAME",displayName="费用类型名称",maxLength=40,required=true,valuesRange="CV9900326")   
     private String accName;
    /**
     *名称:收费项目代码
     *备注:收费项目在院内系统中的编码，引用药品信息表T_MEDICATION院内药品编码或引用收费项目信息表T_CHARGING_ITEM院内收费项目编码
 	 *
 	 *
     */
     @Column(name="CHARGING_ITEM_CD",length = 40,nullable = false)
     @FhirFieldValidate(name="CHARGING_ITEM_CD",displayName="收费项目代码",maxLength=40,required=true,valuesRange="")   
     private String chargingItemCd;
    /**
     *名称:收费项目名称
     *
 	 *
 	 *
     */
     @Column(name="CHARGING_ITEM_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="CHARGING_ITEM_NAME",displayName="收费项目名称",maxLength=40,required=true,valuesRange="")   
     private String chargingItemName;
    /**
     *名称:对应医保项目编码
     *
 	 *
 	 *
     */
     @Column(name="MEDICALINS_ITEM_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="MEDICALINS_ITEM_CODE",displayName="对应医保项目编码",maxLength=20,required=false,valuesRange="")   
     private String medicalinsItemCode;
    /**
     *名称:对应医保项目名称
     *
 	 *
 	 *
     */
     @Column(name="MEDICALINS_ITEM_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="MEDICALINS_ITEM_NAME",displayName="对应医保项目名称",maxLength=40,required=false,valuesRange="")   
     private String medicalinsItemName;
    /**
     *名称:报销标志代码
     *
 	 *限制:CV9900286
 	 *
     */
     @Column(name="MEDICATION_CATEGORY",length = 20,nullable = true)
     @FhirFieldValidate(name="MEDICATION_CATEGORY",displayName="报销标志代码",maxLength=20,required=false,valuesRange="CV9900286")   
     private String medicationCategory;
    /**
     *名称:报销标志名称
     *
 	 *限制:CV9900286
 	 *
     */
     @Column(name="MEDICATION_CATEGORY_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="MEDICATION_CATEGORY_NAME",displayName="报销标志名称",maxLength=40,required=false,valuesRange="CV9900286")   
     private String medicationCategoryName;
    /**
     *名称:数量
     *
 	 *
 	 *
     */
     @Column(name="QUANTITY_VALUE",length = 8,nullable = false)
     @FhirFieldValidate(name="QUANTITY_VALUE",displayName="数量",maxLength=8,required=true,valuesRange="")   
     private Float quantityValue;
    /**
     *名称:单位
     *
 	 *
 	 *
     */
     @Column(name="QUANTITY_UNIT",length = 20,nullable = false)
     @FhirFieldValidate(name="QUANTITY_UNIT",displayName="单位",maxLength=20,required=true,valuesRange="")   
     private String quantityUnit;
    /**
     *名称:单价
     *
 	 *
 	 *
     */
     @Column(name="UNITPRICE",length = 8,nullable = false)
     @FhirFieldValidate(name="UNITPRICE",displayName="单价",maxLength=8,required=true,valuesRange="")   
     private Float unitprice;
    /**
     *名称:金额
     *
 	 *
 	 *
     */
     @Column(name="NET",length = 8,nullable = true)
     @FhirFieldValidate(name="NET",displayName="金额",maxLength=8,required=false,valuesRange="")   
     private Float net;
     @ManyToOne
     @JoinColumn(name="F_UID")
     private InpatientCharges inpatientCharges;
    
     public String getInpatientChargesId(){
       	return this.inpatientChargesId;
     }
     public void setInpatientChargesId(String inpatientChargesId){
       	this.inpatientChargesId=inpatientChargesId;
     }
     public String getChargesDetailSeq(){
       	return this.chargesDetailSeq;
     }
     public void setChargesDetailSeq(String chargesDetailSeq){
       	this.chargesDetailSeq=chargesDetailSeq;
     }
     public String getRecipeId(){
       	return this.recipeId;
     }
     public void setRecipeId(String recipeId){
       	this.recipeId=recipeId;
     }
     public Float getSubmitRatio(){
       	return this.submitRatio;
     }
     public void setSubmitRatio(Float submitRatio){
       	this.submitRatio=submitRatio;
     }
     public Float getAmountReimbursement(){
       	return this.amountReimbursement;
     }
     public void setAmountReimbursement(Float amountReimbursement){
       	this.amountReimbursement=amountReimbursement;
     }
     public Float getSelfAmount(){
       	return this.selfAmount;
     }
     public void setSelfAmount(Float selfAmount){
       	this.selfAmount=selfAmount;
     }
     public String getItemSpec(){
       	return this.itemSpec;
     }
     public void setItemSpec(String itemSpec){
       	this.itemSpec=itemSpec;
     }
     public Date getClinCostDate(){
       	return this.clinCostDate;
     }
     public void setClinCostDate(Date clinCostDate){
       	this.clinCostDate=clinCostDate;
     }
     public Boolean getIsBaby(){
       	return this.isBaby;
     }
     public void setIsBaby(Boolean isBaby){
       	this.isBaby=isBaby;
     }
     public String getOrderedDpid(){
       	return this.orderedDpid;
     }
     public void setOrderedDpid(String orderedDpid){
       	this.orderedDpid=orderedDpid;
     }
     public String getOrderedEmpid(){
       	return this.orderedEmpid;
     }
     public void setOrderedEmpid(String orderedEmpid){
       	this.orderedEmpid=orderedEmpid;
     }
     public String getPerformDpid(){
       	return this.performDpid;
     }
     public void setPerformDpid(String performDpid){
       	this.performDpid=performDpid;
     }
     public String getPerformEmpid(){
       	return this.performEmpid;
     }
     public void setPerformEmpid(String performEmpid){
       	this.performEmpid=performEmpid;
     }
     public String getAccCode(){
       	return this.accCode;
     }
     public void setAccCode(String accCode){
       	this.accCode=accCode;
     }
     public String getAccName(){
       	return this.accName;
     }
     public void setAccName(String accName){
       	this.accName=accName;
     }
     public String getChargingItemCd(){
       	return this.chargingItemCd;
     }
     public void setChargingItemCd(String chargingItemCd){
       	this.chargingItemCd=chargingItemCd;
     }
     public String getChargingItemName(){
       	return this.chargingItemName;
     }
     public void setChargingItemName(String chargingItemName){
       	this.chargingItemName=chargingItemName;
     }
     public String getMedicalinsItemCode(){
       	return this.medicalinsItemCode;
     }
     public void setMedicalinsItemCode(String medicalinsItemCode){
       	this.medicalinsItemCode=medicalinsItemCode;
     }
     public String getMedicalinsItemName(){
       	return this.medicalinsItemName;
     }
     public void setMedicalinsItemName(String medicalinsItemName){
       	this.medicalinsItemName=medicalinsItemName;
     }
     public String getMedicationCategory(){
       	return this.medicationCategory;
     }
     public void setMedicationCategory(String medicationCategory){
       	this.medicationCategory=medicationCategory;
     }
     public String getMedicationCategoryName(){
       	return this.medicationCategoryName;
     }
     public void setMedicationCategoryName(String medicationCategoryName){
       	this.medicationCategoryName=medicationCategoryName;
     }
     public Float getQuantityValue(){
       	return this.quantityValue;
     }
     public void setQuantityValue(Float quantityValue){
       	this.quantityValue=quantityValue;
     }
     public String getQuantityUnit(){
       	return this.quantityUnit;
     }
     public void setQuantityUnit(String quantityUnit){
       	this.quantityUnit=quantityUnit;
     }
     public Float getUnitprice(){
       	return this.unitprice;
     }
     public void setUnitprice(Float unitprice){
       	this.unitprice=unitprice;
     }
     public Float getNet(){
       	return this.net;
     }
     public void setNet(Float net){
       	this.net=net;
     }
	 public InpatientCharges getInpatientCharges(){
	 	return this.inpatientCharges;
	}
	 public void setInpatientCharges(InpatientCharges inpatientCharges){
		this.inpatientCharges=inpatientCharges;
	}
}