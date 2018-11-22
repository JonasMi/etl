package com.nestvision.nest.proxy.fhir.entity;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.nestvision.nest.proxy.base.entity.BaseEntity;
import com.nestvision.nest.proxy.fhir.anotaion.FhirFieldValidate;

@Entity
@Table(name = BaseEntity.TABLE_PREFIX + "PATIENT_TELECOM")
public class PatientTelecom extends FhirResourceEntity {

    /**
     *名称:院内患者id
     *备注:引用患者信息表T_PATIENT院内患者ID
 	 *
 	 *主键字段
     */
     @Column(name="PATIENT_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="PATIENT_ID",displayName="院内患者id",maxLength=40,required=true,valuesRange="")
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String patientId;
    /**
     *名称:联系人关系代码
     *
 	 *限制:GBT4761
 	 *主键字段
     */
     @Column(name="RELATIONSHIP",length = 20,nullable = true)
     @FhirFieldValidate(name="RELATIONSHIP",displayName="联系人关系代码",maxLength=20,required=false,valuesRange="GBT4761")
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String relationship;
    /**
     *名称:联系人姓名
     *
 	 *
 	 *
     */
     @Column(name="NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="NAME",displayName="联系人姓名",maxLength=20,required=false,valuesRange="")
     private String name;
    /**
     *名称:联系人电话-类别代码
     *
 	 *限制:CV040001
 	 *
     */
     @Column(name="TEL_TYPE_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="TEL_TYPE_CD",displayName="联系人电话-类别代码",maxLength=20,required=false,valuesRange="CV040001")
     private String telTypeCd;
    /**
     *名称:联系人电话号码
     *
 	 *
 	 *
     */
     @Column(name="PHONE",length = 20,nullable = true)
     @FhirFieldValidate(name="PHONE",displayName="联系人电话号码",maxLength=20,required=false,valuesRange="")
     private String phone;
    /**
     *名称:联系人地址-省（自治区、直辖市）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="TEMP_STATE",length = 10,nullable = true)
     @FhirFieldValidate(name="TEMP_STATE",displayName="联系人地址-省（自治区、直辖市）代码",maxLength=10,required=false,valuesRange="GBT2260")
     private String tempState;
    /**
     *名称:联系人地址-市（地区）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="TEMP_CITY",length = 10,nullable = true)
     @FhirFieldValidate(name="TEMP_CITY",displayName="联系人地址-市（地区）代码",maxLength=10,required=false,valuesRange="GBT2260")
     private String tempCity;
    /**
     *名称:联系人地址-县（区）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="TEMP_DISTRICT",length = 10,nullable = true)
     @FhirFieldValidate(name="TEMP_DISTRICT",displayName="联系人地址-县（区）代码",maxLength=10,required=false,valuesRange="GBT2260")
     private String tempDistrict;
    /**
     *名称:联系人地址-乡（镇、街道办事处）
     *
 	 *
 	 *
     */
     @Column(name="TEMP_LINE",length = 100,nullable = true)
     @FhirFieldValidate(name="TEMP_LINE",displayName="联系人地址-乡（镇、街道办事处）",maxLength=100,required=false,valuesRange="")
     private String tempLine;
    /**
     *名称:联系人地址-村（街、路、弄等）
     *
 	 *
 	 *
     */
     @Column(name="TEMP_ROAD",length = 100,nullable = true)
     @FhirFieldValidate(name="TEMP_ROAD",displayName="联系人地址-村（街、路、弄等）",maxLength=100,required=false,valuesRange="")
     private String tempRoad;
    /**
     *名称:联系人地址-门牌号码
     *
 	 *
 	 *
     */
     @Column(name="TEMP_HOUSE_NO",length = 50,nullable = true)
     @FhirFieldValidate(name="TEMP_HOUSE_NO",displayName="联系人地址-门牌号码",maxLength=50,required=false,valuesRange="")
     private String tempHouseNo;
    /**
     *名称:联系人地址-详细信息
     *
 	 *
 	 *
     */
     @Column(name="TEMP_TEXT",length = 500,nullable = true)
     @FhirFieldValidate(name="TEMP_TEXT",displayName="联系人地址-详细信息",maxLength=500,required=false,valuesRange="")
     private String tempText;
    /**
     *名称:联系人身份证件类别代码
     *
 	 *限制:CV0201101
 	 *
     */
     @Column(name="ID_CARD_TYPE",length = 20,nullable = true)
     @FhirFieldValidate(name="ID_CARD_TYPE",displayName="联系人身份证件类别代码",maxLength=20,required=false,valuesRange="CV0201101")
     private String idCardType;
    /**
     *名称:联系人标识号号码
     *
 	 *
 	 *
     */
     @Column(name="LM_ID_NO",length = 50,nullable = true)
     @FhirFieldValidate(name="LM_ID_NO",displayName="联系人标识号号码",maxLength=50,required=false,valuesRange="")
     private String lmIdNo;
    /**
     *名称:联系人邮编
     *
 	 *
 	 *
     */
     @Column(name="LINKMAN_POST",length = 20,nullable = true)
     @FhirFieldValidate(name="LINKMAN_POST",displayName="联系人邮编",maxLength=20,required=false,valuesRange="")
     private String linkmanPost;
    @JsonBackReference// TODO by 丁建 防止Jackson解析时因为循环引用堆栈溢出
     @ManyToOne
     @JoinColumn(name="F_UID")
     private Patient patient;

     public String getPatientId(){
       	return this.patientId;
     }
     public void setPatientId(String patientId){
       	this.patientId=patientId;
     }
     public String getRelationship(){
       	return this.relationship;
     }
     public void setRelationship(String relationship){
       	this.relationship=relationship;
     }
     public String getName(){
       	return this.name;
     }
     public void setName(String name){
       	this.name=name;
     }
     public String getTelTypeCd(){
       	return this.telTypeCd;
     }
     public void setTelTypeCd(String telTypeCd){
       	this.telTypeCd=telTypeCd;
     }
     public String getPhone(){
       	return this.phone;
     }
     public void setPhone(String phone){
       	this.phone=phone;
     }
     public String getTempState(){
       	return this.tempState;
     }
     public void setTempState(String tempState){
       	this.tempState=tempState;
     }
     public String getTempCity(){
       	return this.tempCity;
     }
     public void setTempCity(String tempCity){
       	this.tempCity=tempCity;
     }
     public String getTempDistrict(){
       	return this.tempDistrict;
     }
     public void setTempDistrict(String tempDistrict){
       	this.tempDistrict=tempDistrict;
     }
     public String getTempLine(){
       	return this.tempLine;
     }
     public void setTempLine(String tempLine){
       	this.tempLine=tempLine;
     }
     public String getTempRoad(){
       	return this.tempRoad;
     }
     public void setTempRoad(String tempRoad){
       	this.tempRoad=tempRoad;
     }
     public String getTempHouseNo(){
       	return this.tempHouseNo;
     }
     public void setTempHouseNo(String tempHouseNo){
       	this.tempHouseNo=tempHouseNo;
     }
     public String getTempText(){
       	return this.tempText;
     }
     public void setTempText(String tempText){
       	this.tempText=tempText;
     }
     public String getIdCardType(){
       	return this.idCardType;
     }
     public void setIdCardType(String idCardType){
       	this.idCardType=idCardType;
     }
     public String getLmIdNo(){
       	return this.lmIdNo;
     }
     public void setLmIdNo(String lmIdNo){
       	this.lmIdNo=lmIdNo;
     }
     public String getLinkmanPost(){
       	return this.linkmanPost;
     }
     public void setLinkmanPost(String linkmanPost){
       	this.linkmanPost=linkmanPost;
     }
	 public Patient getPatient(){
	 	return this.patient;
	}
	 public void setPatient(Patient patient){
		this.patient=patient;
	}
}