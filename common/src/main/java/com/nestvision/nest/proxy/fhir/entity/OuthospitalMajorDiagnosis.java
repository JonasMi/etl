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
@Table(name = BaseEntity.TABLE_PREFIX + "OUTHOSPITAL_MAJOR_DIAGNOSIS")
public class OuthospitalMajorDiagnosis extends FhirResourceEntity {

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
     *名称:住院流水号
     *备注:引用住院接诊表T_INPATIENT_REGISTRATION院内门诊流水号
 	 *
 	 *
     */
     @Column(name="INPATIENT_REGISTRATION_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="INPATIENT_REGISTRATION_ID",displayName="住院流水号",maxLength=40,required=true,valuesRange="")   
     private String inpatientRegistrationId;
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
     *名称:中西医诊断标志
     *
 	 *限制:CV9900033
 	 *
     */
     @Column(name="TCM_WESTERN_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="TCM_WESTERN_CD",displayName="中西医诊断标志",maxLength=20,required=false,valuesRange="CV9900033")   
     private String tcmWesternCd;
    /**
     *名称:入院病情代码
     *
 	 *限制:CV0510019
 	 *
     */
     @Column(name="INHOS_ILLNESS_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="INHOS_ILLNESS_CD",displayName="入院病情代码",maxLength=20,required=false,valuesRange="CV0510019")   
     private String inhosIllnessCd;
    /**
     *名称:治疗结果代码
     *
 	 *限制:CV0510010
 	 *
     */
     @Column(name="TREAT_RESULT_CD",length = 20,nullable = false)
     @FhirFieldValidate(name="TREAT_RESULT_CD",displayName="治疗结果代码",maxLength=20,required=true,valuesRange="CV0510010")   
     private String treatResultCd;
    /**
     *名称:诊断性质代码
     *
 	 *限制:CV9900315
 	 *
     */
     @Column(name="PROPERTY_CD",length = 20,nullable = false)
     @FhirFieldValidate(name="PROPERTY_CD",displayName="诊断性质代码",maxLength=20,required=true,valuesRange="CV9900315")   
     private String propertyCd;
    /**
     *名称:诊断说明
     *
 	 *
 	 *
     */
     @Column(name="DIAG_EXPLAN",length = 1000,nullable = true)
     @FhirFieldValidate(name="DIAG_EXPLAN",displayName="诊断说明",maxLength=1000,required=false,valuesRange="")   
     private String diagExplan;
    /**
     *名称:诊断顺位
     *
 	 *
 	 *
     */
     @Column(name="ADMIT_DIAG",length = 8,nullable = true)
     @FhirFieldValidate(name="ADMIT_DIAG",displayName="诊断顺位",maxLength=8,required=false,valuesRange="")   
     private Float admitDiag;
    
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
     public String getInpatientRegistrationId(){
       	return this.inpatientRegistrationId;
     }
     public void setInpatientRegistrationId(String inpatientRegistrationId){
       	this.inpatientRegistrationId=inpatientRegistrationId;
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
     public String getTcmWesternCd(){
       	return this.tcmWesternCd;
     }
     public void setTcmWesternCd(String tcmWesternCd){
       	this.tcmWesternCd=tcmWesternCd;
     }
     public String getInhosIllnessCd(){
       	return this.inhosIllnessCd;
     }
     public void setInhosIllnessCd(String inhosIllnessCd){
       	this.inhosIllnessCd=inhosIllnessCd;
     }
     public String getTreatResultCd(){
       	return this.treatResultCd;
     }
     public void setTreatResultCd(String treatResultCd){
       	this.treatResultCd=treatResultCd;
     }
     public String getPropertyCd(){
       	return this.propertyCd;
     }
     public void setPropertyCd(String propertyCd){
       	this.propertyCd=propertyCd;
     }
     public String getDiagExplan(){
       	return this.diagExplan;
     }
     public void setDiagExplan(String diagExplan){
       	this.diagExplan=diagExplan;
     }
     public Float getAdmitDiag(){
       	return this.admitDiag;
     }
     public void setAdmitDiag(Float admitDiag){
       	this.admitDiag=admitDiag;
     }
}