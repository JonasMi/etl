package com.nestvision.nest.proxy.fhir.entity;
import javax.persistence.Temporal;
import java.util.Date;
import javax.persistence.TemporalType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.nestvision.nest.proxy.base.entity.BaseEntity;
import com.nestvision.nest.proxy.fhir.anotaion.FhirFieldValidate;

@Entity
@Table(name = BaseEntity.TABLE_PREFIX + "OUTPATIENT_SYMPTOM")
public class OutpatientSymptom extends FhirResourceEntity {

    /**
     *名称:院内诊断记录id
     *备注:本次诊断在院内系统中的唯一标识
 	 *
 	 *主键字段
     */
     @Column(name="DIAGNOSIS_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="DIAGNOSIS_ID",displayName="院内诊断记录id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String diagnosisId;
    /**
     *名称:患者id
     *备注:引用患者信息表T_PATIENT院内患者id
 	 *
 	 *
     */
     @Column(name="PATIENT_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="PATIENT_ID",displayName="患者id",maxLength=40,required=true,valuesRange="")   
     private String patientId;
    /**
     *名称:患者姓名
     *
 	 *
 	 *
     */
     @Column(name="PATIENT_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="PATIENT_NAME",displayName="患者姓名",maxLength=40,required=true,valuesRange="")   
     private String patientName;
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
     *名称:诊断医生信息 id
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="DIAGNOSIS_EMP_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="DIAGNOSIS_EMP_ID",displayName="诊断医生信息 id",maxLength=40,required=false,valuesRange="")   
     private String diagnosisEmpId;
    /**
     *名称:诊断ICD-10编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="DIAGNOSIS_CD",length = 20,nullable = false)
     @FhirFieldValidate(name="DIAGNOSIS_CD",displayName="诊断ICD-10编码",maxLength=20,required=true,valuesRange="CV990111")   
     private String diagnosisCd;
    /**
     *名称:诊断ICD-10编码的值
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="DIAGNOSIS_VALUE",length = 100,nullable = true)
     @FhirFieldValidate(name="DIAGNOSIS_VALUE",displayName="诊断ICD-10编码的值",maxLength=100,required=false,valuesRange="CV990111")   
     private String diagnosisValue;
    /**
     *名称:诊断时间
     *
 	 *
 	 *
     */
     @Column(name="ONSETDATETIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="ONSETDATETIME",displayName="诊断时间",required=false,valuesRange="")   
     private Date onsetdatetime;
    /**
     *名称:记录医生所在科室id
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
 	 *
     */
     @Column(name="DP_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="DP_ID",displayName="记录医生所在科室id",maxLength=40,required=false,valuesRange="")   
     private String dpId;
    /**
     *名称:发病时间
     *
 	 *
 	 *
     */
     @Column(name="ONSET_DATE",nullable = false)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="ONSET_DATE",displayName="发病时间",required=true,valuesRange="")   
     private Date onsetDate;
    /**
     *名称:症状持续时间（min)
     *
 	 *
 	 *
     */
     @Column(name="SYMP_DURATION_MINS",length = 8,nullable = true)
     @FhirFieldValidate(name="SYMP_DURATION_MINS",displayName="症状持续时间（min)",maxLength=8,required=false,valuesRange="")   
     private Float sympDurationMins;
    
     public String getDiagnosisId(){
       	return this.diagnosisId;
     }
     public void setDiagnosisId(String diagnosisId){
       	this.diagnosisId=diagnosisId;
     }
     public String getPatientId(){
       	return this.patientId;
     }
     public void setPatientId(String patientId){
       	this.patientId=patientId;
     }
     public String getPatientName(){
       	return this.patientName;
     }
     public void setPatientName(String patientName){
       	this.patientName=patientName;
     }
     public String getOutpatientRegistrationId(){
       	return this.outpatientRegistrationId;
     }
     public void setOutpatientRegistrationId(String outpatientRegistrationId){
       	this.outpatientRegistrationId=outpatientRegistrationId;
     }
     public String getDiagnosisEmpId(){
       	return this.diagnosisEmpId;
     }
     public void setDiagnosisEmpId(String diagnosisEmpId){
       	this.diagnosisEmpId=diagnosisEmpId;
     }
     public String getDiagnosisCd(){
       	return this.diagnosisCd;
     }
     public void setDiagnosisCd(String diagnosisCd){
       	this.diagnosisCd=diagnosisCd;
     }
     public String getDiagnosisValue(){
       	return this.diagnosisValue;
     }
     public void setDiagnosisValue(String diagnosisValue){
       	this.diagnosisValue=diagnosisValue;
     }
     public Date getOnsetdatetime(){
       	return this.onsetdatetime;
     }
     public void setOnsetdatetime(Date onsetdatetime){
       	this.onsetdatetime=onsetdatetime;
     }
     public String getDpId(){
       	return this.dpId;
     }
     public void setDpId(String dpId){
       	this.dpId=dpId;
     }
     public Date getOnsetDate(){
       	return this.onsetDate;
     }
     public void setOnsetDate(Date onsetDate){
       	this.onsetDate=onsetDate;
     }
     public Float getSympDurationMins(){
       	return this.sympDurationMins;
     }
     public void setSympDurationMins(Float sympDurationMins){
       	this.sympDurationMins=sympDurationMins;
     }
}