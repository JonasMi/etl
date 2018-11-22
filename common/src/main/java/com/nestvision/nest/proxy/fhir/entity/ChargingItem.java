package com.nestvision.nest.proxy.fhir.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.nestvision.nest.proxy.base.entity.BaseEntity;
import com.nestvision.nest.proxy.fhir.anotaion.FhirFieldValidate;

@Entity
@Table(name = BaseEntity.TABLE_PREFIX + "CHARGING_ITEM")
public class ChargingItem extends FhirResourceEntity {

    /**
     *名称:院内收费项目编码
     *备注:收费项目在院内系统中的唯一标识
 	 *
 	 *主键字段
     */
     @Column(name="ITEM_CODE",length = 40,nullable = false)
     @FhirFieldValidate(name="ITEM_CODE",displayName="院内收费项目编码",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String itemCode;
    /**
     *名称:收费项目名称
     *
 	 *
 	 *
     */
     @Column(name="ITEM_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="ITEM_NAME",displayName="收费项目名称",maxLength=40,required=false,valuesRange="")   
     private String itemName;
    /**
     *名称:门诊费用类型代码
     *
 	 *限制:CV9900326
 	 *
     */
     @Column(name="OUTP_FEE_TYPE_CODE",length = 20,nullable = false)
     @FhirFieldValidate(name="OUTP_FEE_TYPE_CODE",displayName="门诊费用类型代码",maxLength=20,required=true,valuesRange="CV9900326")   
     private String outpFeeTypeCode;
    /**
     *名称:住院费用类型代码
     *
 	 *限制:CV9900326
 	 *
     */
     @Column(name="HOSP_FEE_TYPE_CODE",length = 20,nullable = false)
     @FhirFieldValidate(name="HOSP_FEE_TYPE_CODE",displayName="住院费用类型代码",maxLength=20,required=true,valuesRange="CV9900326")   
     private String hospFeeTypeCode;
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
     *名称:单位
     *
 	 *
 	 *
     */
     @Column(name="ITEM_UNIT",length = 40,nullable = false)
     @FhirFieldValidate(name="ITEM_UNIT",displayName="单位",maxLength=40,required=true,valuesRange="")   
     private String itemUnit;
    /**
     *名称:单价
     *
 	 *
 	 *
     */
     @Column(name="ITEM_PRICE",length = 8,nullable = false)
     @FhirFieldValidate(name="ITEM_PRICE",displayName="单价",maxLength=8,required=true,valuesRange="")   
     private Float itemPrice;
    /**
     *名称:对应农合编码
     *
 	 *
 	 *
     */
     @Column(name="NCMS_MEDICATION",length = 20,nullable = true)
     @FhirFieldValidate(name="NCMS_MEDICATION",displayName="对应农合编码",maxLength=20,required=false,valuesRange="")   
     private String ncmsMedication;
    /**
     *名称:对应医保编码
     *
 	 *
 	 *
     */
     @Column(name="MEDICAL_INSURANCE",length = 20,nullable = true)
     @FhirFieldValidate(name="MEDICAL_INSURANCE",displayName="对应医保编码",maxLength=20,required=false,valuesRange="")   
     private String medicalInsurance;
    /**
     *名称:收费依据
     *
 	 *
 	 *
     */
     @Column(name="FEE_BASIS",length = 1000,nullable = true)
     @FhirFieldValidate(name="FEE_BASIS",displayName="收费依据",maxLength=1000,required=false,valuesRange="")   
     private String feeBasis;
    /**
     *名称:医保报销标志
     *
 	 *限制:CV9900286
 	 *
     */
     @Column(name="MEDICATION_CATEGORY",length = 20,nullable = true)
     @FhirFieldValidate(name="MEDICATION_CATEGORY",displayName="医保报销标志",maxLength=20,required=false,valuesRange="CV9900286")   
     private String medicationCategory;
    /**
     *名称:农合报销标志
     *
 	 *限制:CV9900373
 	 *
     */
     @Column(name="NCMS_MEDICATION_CATEGORY",length = 20,nullable = true)
     @FhirFieldValidate(name="NCMS_MEDICATION_CATEGORY",displayName="农合报销标志",maxLength=20,required=false,valuesRange="CV9900373")   
     private String ncmsMedicationCategory;
    /**
     *名称:收费项目标准编码
     *
 	 *限制:CV990112
 	 *
     */
     @Column(name="ITEM_STD_CODE",length = 40,nullable = true)
     @FhirFieldValidate(name="ITEM_STD_CODE",displayName="收费项目标准编码",maxLength=40,required=false,valuesRange="CV990112")   
     private String itemStdCode;
    
     public String getItemCode(){
       	return this.itemCode;
     }
     public void setItemCode(String itemCode){
       	this.itemCode=itemCode;
     }
     public String getItemName(){
       	return this.itemName;
     }
     public void setItemName(String itemName){
       	this.itemName=itemName;
     }
     public String getOutpFeeTypeCode(){
       	return this.outpFeeTypeCode;
     }
     public void setOutpFeeTypeCode(String outpFeeTypeCode){
       	this.outpFeeTypeCode=outpFeeTypeCode;
     }
     public String getHospFeeTypeCode(){
       	return this.hospFeeTypeCode;
     }
     public void setHospFeeTypeCode(String hospFeeTypeCode){
       	this.hospFeeTypeCode=hospFeeTypeCode;
     }
     public String getItemSpec(){
       	return this.itemSpec;
     }
     public void setItemSpec(String itemSpec){
       	this.itemSpec=itemSpec;
     }
     public String getItemUnit(){
       	return this.itemUnit;
     }
     public void setItemUnit(String itemUnit){
       	this.itemUnit=itemUnit;
     }
     public Float getItemPrice(){
       	return this.itemPrice;
     }
     public void setItemPrice(Float itemPrice){
       	this.itemPrice=itemPrice;
     }
     public String getNcmsMedication(){
       	return this.ncmsMedication;
     }
     public void setNcmsMedication(String ncmsMedication){
       	this.ncmsMedication=ncmsMedication;
     }
     public String getMedicalInsurance(){
       	return this.medicalInsurance;
     }
     public void setMedicalInsurance(String medicalInsurance){
       	this.medicalInsurance=medicalInsurance;
     }
     public String getFeeBasis(){
       	return this.feeBasis;
     }
     public void setFeeBasis(String feeBasis){
       	this.feeBasis=feeBasis;
     }
     public String getMedicationCategory(){
       	return this.medicationCategory;
     }
     public void setMedicationCategory(String medicationCategory){
       	this.medicationCategory=medicationCategory;
     }
     public String getNcmsMedicationCategory(){
       	return this.ncmsMedicationCategory;
     }
     public void setNcmsMedicationCategory(String ncmsMedicationCategory){
       	this.ncmsMedicationCategory=ncmsMedicationCategory;
     }
     public String getItemStdCode(){
       	return this.itemStdCode;
     }
     public void setItemStdCode(String itemStdCode){
       	this.itemStdCode=itemStdCode;
     }
}