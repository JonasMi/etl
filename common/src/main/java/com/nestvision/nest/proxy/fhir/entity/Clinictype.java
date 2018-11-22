package com.nestvision.nest.proxy.fhir.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.nestvision.nest.proxy.base.entity.BaseEntity;
import com.nestvision.nest.proxy.fhir.anotaion.FhirFieldValidate;

@Entity
@Table(name = BaseEntity.TABLE_PREFIX + "CLINICTYPE")
public class Clinictype extends FhirResourceEntity {

    /**
     *名称:院内号别编码
     *备注:号别在院内系统中的唯一标识
 	 *
 	 *主键字段
     */
     @Column(name="ITEM_CODE",length = 40,nullable = false)
     @FhirFieldValidate(name="ITEM_CODE",displayName="院内号别编码",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String itemCode;
    /**
     *名称:对应科室id
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
 	 *
     */
     @Column(name="DP_ID",length = 20,nullable = false)
     @FhirFieldValidate(name="DP_ID",displayName="对应科室id",maxLength=20,required=true,valuesRange="")   
     private String dpId;
    /**
     *名称:号别类型代码
     *
 	 *限制:CV9900261
 	 *
     */
     @Column(name="CLINIC_CODE",length = 20,nullable = false)
     @FhirFieldValidate(name="CLINIC_CODE",displayName="号别类型代码",maxLength=20,required=true,valuesRange="CV9900261")   
     private String clinicCode;
    /**
     *名称:挂号费
     *
 	 *
 	 *
     */
     @Column(name="RE_FEE",length = 8,nullable = true)
     @FhirFieldValidate(name="RE_FEE",displayName="挂号费",maxLength=8,required=false,valuesRange="")   
     private Float reFee;
    /**
     *名称:诊疗费
     *
 	 *
 	 *
     */
     @Column(name="DT_FEE",length = 8,nullable = true)
     @FhirFieldValidate(name="DT_FEE",displayName="诊疗费",maxLength=8,required=false,valuesRange="")   
     private Float dtFee;
    
     public String getItemCode(){
       	return this.itemCode;
     }
     public void setItemCode(String itemCode){
       	this.itemCode=itemCode;
     }
     public String getDpId(){
       	return this.dpId;
     }
     public void setDpId(String dpId){
       	this.dpId=dpId;
     }
     public String getClinicCode(){
       	return this.clinicCode;
     }
     public void setClinicCode(String clinicCode){
       	this.clinicCode=clinicCode;
     }
     public Float getReFee(){
       	return this.reFee;
     }
     public void setReFee(Float reFee){
       	this.reFee=reFee;
     }
     public Float getDtFee(){
       	return this.dtFee;
     }
     public void setDtFee(Float dtFee){
       	this.dtFee=dtFee;
     }
}