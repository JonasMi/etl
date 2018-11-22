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
@Table(name = BaseEntity.TABLE_PREFIX + "OUTPATIENT_DIAGNOSIS")
public class OutpatientDiagnosis extends FhirResourceEntity {

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
     @Column(name="ONSETDATETIME",nullable = false)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="ONSETDATETIME",displayName="诊断时间",required=true,valuesRange="")   
     private Date onsetdatetime;
    /**
     *名称:诊断序号
     *
 	 *
 	 *
     */
     @Column(name="PATIENT_SERIAL_NO",length = 40,nullable = true)
     @FhirFieldValidate(name="PATIENT_SERIAL_NO",displayName="诊断序号",maxLength=40,required=false,valuesRange="")   
     private String patientSerialNo;
    /**
     *名称:是否传染病标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_INFECTION",length = 5,nullable = false)
     @FhirFieldValidate(name="IF_INFECTION",displayName="是否传染病标志",maxLength=5,required=true,valuesRange="CUS00004")   
     private Boolean ifInfection;
    /**
     *名称:传染上报标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="INFECT_REPORT_CD",length = 5,nullable = false)
     @FhirFieldValidate(name="INFECT_REPORT_CD",displayName="传染上报标志",maxLength=5,required=true,valuesRange="CUS00004")   
     private Boolean infectReportCd;
    /**
     *名称:中医征候诊断代码
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="CN_SYM_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="CN_SYM_DIAG_CODE",displayName="中医征候诊断代码",maxLength=20,required=false,valuesRange="CV9900357")   
     private String cnSymDiagCode;
    /**
     *名称:诊断顺位
     *
 	 *
 	 *
     */
     @Column(name="ADMIT_DIAG",length = 8,nullable = true)
     @FhirFieldValidate(name="ADMIT_DIAG",displayName="诊断顺位",maxLength=8,required=false,valuesRange="")   
     private Float admitDiag;
    /**
     *名称:中医病名诊断代码
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="CN_DIS_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="CN_DIS_DIAG_CODE",displayName="中医病名诊断代码",maxLength=20,required=false,valuesRange="CV9900357")   
     private String cnDisDiagCode;
    
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
     public String getPatientSerialNo(){
       	return this.patientSerialNo;
     }
     public void setPatientSerialNo(String patientSerialNo){
       	this.patientSerialNo=patientSerialNo;
     }
     public Boolean getIfInfection(){
       	return this.ifInfection;
     }
     public void setIfInfection(Boolean ifInfection){
       	this.ifInfection=ifInfection;
     }
     public Boolean getInfectReportCd(){
       	return this.infectReportCd;
     }
     public void setInfectReportCd(Boolean infectReportCd){
       	this.infectReportCd=infectReportCd;
     }
     public String getCnSymDiagCode(){
       	return this.cnSymDiagCode;
     }
     public void setCnSymDiagCode(String cnSymDiagCode){
       	this.cnSymDiagCode=cnSymDiagCode;
     }
     public Float getAdmitDiag(){
       	return this.admitDiag;
     }
     public void setAdmitDiag(Float admitDiag){
       	this.admitDiag=admitDiag;
     }
     public String getCnDisDiagCode(){
       	return this.cnDisDiagCode;
     }
     public void setCnDisDiagCode(String cnDisDiagCode){
       	this.cnDisDiagCode=cnDisDiagCode;
     }
}