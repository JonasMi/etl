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
@Table(name = BaseEntity.TABLE_PREFIX + "OUTPATIENT_PRESCRIPTION_DETAIL")
public class OutpatientPrescriptionDetail extends FhirResourceEntity {

    /**
     *名称:院内处方号
     *备注:门诊处方在院内系统中的唯一标识
 	 *
 	 *主键字段
     */
     @Column(name="OUTPATIENT_PRESCRIPTION_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="OUTPATIENT_PRESCRIPTION_ID",displayName="院内处方号",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String outpatientPrescriptionId;
    /**
     *名称:处方明细序号
     *
 	 *
 	 *主键字段
     */
     @Column(name="SEQUENCE",length = 40,nullable = false)
     @FhirFieldValidate(name="SEQUENCE",displayName="处方明细序号",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String sequence;
    /**
     *名称:医嘱类型代码
     *
 	 *限制:CV9900229
 	 *
     */
     @Column(name="ORDER_TYPE_CODE",length = 20,nullable = false)
     @FhirFieldValidate(name="ORDER_TYPE_CODE",displayName="医嘱类型代码",maxLength=20,required=true,valuesRange="CV9900229")   
     private String orderTypeCode;
    /**
     *名称:医嘱项目
     *备注:引用药品信息表T_MEDICATION院内药品编码或引用收费项目信息表T_CHARGING_ITEM院内收费项目编码
 	 *
 	 *
     */
     @Column(name="PRESCRIPTION_ITEM_CODE",length = 40,nullable = false)
     @FhirFieldValidate(name="PRESCRIPTION_ITEM_CODE",displayName="医嘱项目",maxLength=40,required=true,valuesRange="")   
     private String prescriptionItemCode;
    /**
     *名称:用药次剂量
     *
 	 *
 	 *
     */
     @Column(name="ONCE_VALUE",length = 8,nullable = true)
     @FhirFieldValidate(name="ONCE_VALUE",displayName="用药次剂量",maxLength=8,required=false,valuesRange="")   
     private Float onceValue;
    /**
     *名称:用药次剂量单位
     *
 	 *
 	 *
     */
     @Column(name="ONCE_UNIT",length = 20,nullable = true)
     @FhirFieldValidate(name="ONCE_UNIT",displayName="用药次剂量单位",maxLength=20,required=false,valuesRange="")   
     private String onceUnit;
    /**
     *名称:用药总剂量
     *
 	 *
 	 *
     */
     @Column(name="DRUG_TOTAL_DOSE",length = 8,nullable = true)
     @FhirFieldValidate(name="DRUG_TOTAL_DOSE",displayName="用药总剂量",maxLength=8,required=false,valuesRange="")   
     private Float drugTotalDose;
    /**
     *名称:用药总剂量单位
     *
 	 *
 	 *
     */
     @Column(name="DRUG_TOTAL_DOSE_UTIL",length = 20,nullable = true)
     @FhirFieldValidate(name="DRUG_TOTAL_DOSE_UTIL",displayName="用药总剂量单位",maxLength=20,required=false,valuesRange="")   
     private String drugTotalDoseUtil;
    /**
     *名称:处方药品组号
     *
 	 *
 	 *
     */
     @Column(name="PREC_DRUG_NO",length = 40,nullable = true)
     @FhirFieldValidate(name="PREC_DRUG_NO",displayName="处方药品组号",maxLength=40,required=false,valuesRange="")   
     private String precDrugNo;
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
     *名称:频率代码
     *
 	 *限制:CV9900341
 	 *
     */
     @Column(name="FREQ_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="FREQ_CODE",displayName="频率代码",maxLength=20,required=false,valuesRange="CV9900341")   
     private String freqCode;
    /**
     *名称:数量
     *
 	 *
 	 *
     */
     @Column(name="ITEM_NUMBER",length = 8,nullable = true)
     @FhirFieldValidate(name="ITEM_NUMBER",displayName="数量",maxLength=8,required=false,valuesRange="")   
     private Float itemNumber;
    /**
     *名称:项目单位
     *
 	 *
 	 *
     */
     @Column(name="ITEM_UNIT",length = 20,nullable = true)
     @FhirFieldValidate(name="ITEM_UNIT",displayName="项目单位",maxLength=20,required=false,valuesRange="")   
     private String itemUnit;
    /**
     *名称:金额
     *
 	 *
 	 *
     */
     @Column(name="ITEM_AMOUNT",length = 8,nullable = true)
     @FhirFieldValidate(name="ITEM_AMOUNT",displayName="金额",maxLength=8,required=false,valuesRange="")   
     private Float itemAmount;
    /**
     *名称:单价
     *
 	 *
 	 *
     */
     @Column(name="ITEM_PRICE",length = 8,nullable = true)
     @FhirFieldValidate(name="ITEM_PRICE",displayName="单价",maxLength=8,required=false,valuesRange="")   
     private Float itemPrice;
    /**
     *名称:执行天数
     *
 	 *
 	 *
     */
     @Column(name="DURATION",length = 8,nullable = true)
     @FhirFieldValidate(name="DURATION",displayName="执行天数",maxLength=8,required=false,valuesRange="")   
     private Float duration;
    /**
     *名称:医嘱开始时间
     *
 	 *
 	 *
     */
     @Column(name="START",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="START",displayName="医嘱开始时间",required=false,valuesRange="")   
     private Date start;
    /**
     *名称:成组号
     *备注:患者用药时，某些药物是一组,药物搭配用
 	 *
 	 *
     */
     @Column(name="GROUP_NO",length = 40,nullable = true)
     @FhirFieldValidate(name="GROUP_NO",displayName="成组号",maxLength=40,required=false,valuesRange="")   
     private String groupNo;
    /**
     *名称:用药途径代码
     *
 	 *限制:CV0600102
 	 *
     */
     @Column(name="DOSAGE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="DOSAGE_CODE",displayName="用药途径代码",maxLength=20,required=false,valuesRange="CV0600102")   
     private String dosageCode;
    /**
     *名称:特殊用法代码
     *
 	 *限制:CV9900285
 	 *
     */
     @Column(name="C_MED_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="C_MED_CODE",displayName="特殊用法代码",maxLength=20,required=false,valuesRange="CV9900285")   
     private String cMedCode;
    /**
     *名称:用法用量指导
     *
 	 *
 	 *
     */
     @Column(name="TEXT",length = 200,nullable = true)
     @FhirFieldValidate(name="TEXT",displayName="用法用量指导",maxLength=200,required=false,valuesRange="")   
     private String text;
     @ManyToOne
     @JoinColumn(name="F_UID")
     private OutpatientPrescription outpatientPrescription;
    
     public String getOutpatientPrescriptionId(){
       	return this.outpatientPrescriptionId;
     }
     public void setOutpatientPrescriptionId(String outpatientPrescriptionId){
       	this.outpatientPrescriptionId=outpatientPrescriptionId;
     }
     public String getSequence(){
       	return this.sequence;
     }
     public void setSequence(String sequence){
       	this.sequence=sequence;
     }
     public String getOrderTypeCode(){
       	return this.orderTypeCode;
     }
     public void setOrderTypeCode(String orderTypeCode){
       	this.orderTypeCode=orderTypeCode;
     }
     public String getPrescriptionItemCode(){
       	return this.prescriptionItemCode;
     }
     public void setPrescriptionItemCode(String prescriptionItemCode){
       	this.prescriptionItemCode=prescriptionItemCode;
     }
     public Float getOnceValue(){
       	return this.onceValue;
     }
     public void setOnceValue(Float onceValue){
       	this.onceValue=onceValue;
     }
     public String getOnceUnit(){
       	return this.onceUnit;
     }
     public void setOnceUnit(String onceUnit){
       	this.onceUnit=onceUnit;
     }
     public Float getDrugTotalDose(){
       	return this.drugTotalDose;
     }
     public void setDrugTotalDose(Float drugTotalDose){
       	this.drugTotalDose=drugTotalDose;
     }
     public String getDrugTotalDoseUtil(){
       	return this.drugTotalDoseUtil;
     }
     public void setDrugTotalDoseUtil(String drugTotalDoseUtil){
       	this.drugTotalDoseUtil=drugTotalDoseUtil;
     }
     public String getPrecDrugNo(){
       	return this.precDrugNo;
     }
     public void setPrecDrugNo(String precDrugNo){
       	this.precDrugNo=precDrugNo;
     }
     public String getItemSpec(){
       	return this.itemSpec;
     }
     public void setItemSpec(String itemSpec){
       	this.itemSpec=itemSpec;
     }
     public String getFreqCode(){
       	return this.freqCode;
     }
     public void setFreqCode(String freqCode){
       	this.freqCode=freqCode;
     }
     public Float getItemNumber(){
       	return this.itemNumber;
     }
     public void setItemNumber(Float itemNumber){
       	this.itemNumber=itemNumber;
     }
     public String getItemUnit(){
       	return this.itemUnit;
     }
     public void setItemUnit(String itemUnit){
       	this.itemUnit=itemUnit;
     }
     public Float getItemAmount(){
       	return this.itemAmount;
     }
     public void setItemAmount(Float itemAmount){
       	this.itemAmount=itemAmount;
     }
     public Float getItemPrice(){
       	return this.itemPrice;
     }
     public void setItemPrice(Float itemPrice){
       	this.itemPrice=itemPrice;
     }
     public Float getDuration(){
       	return this.duration;
     }
     public void setDuration(Float duration){
       	this.duration=duration;
     }
     public Date getStart(){
       	return this.start;
     }
     public void setStart(Date start){
       	this.start=start;
     }
     public String getGroupNo(){
       	return this.groupNo;
     }
     public void setGroupNo(String groupNo){
       	this.groupNo=groupNo;
     }
     public String getDosageCode(){
       	return this.dosageCode;
     }
     public void setDosageCode(String dosageCode){
       	this.dosageCode=dosageCode;
     }
     public String getcMedCode(){
       	return this.cMedCode;
     }
     public void setcMedCode(String cMedCode){
       	this.cMedCode=cMedCode;
     }
     public String getText(){
       	return this.text;
     }
     public void setText(String text){
       	this.text=text;
     }
	 public OutpatientPrescription getOutpatientPrescription(){
	 	return this.outpatientPrescription;
	}
	 public void setOutpatientPrescription(OutpatientPrescription outpatientPrescription){
		this.outpatientPrescription=outpatientPrescription;
	}
}