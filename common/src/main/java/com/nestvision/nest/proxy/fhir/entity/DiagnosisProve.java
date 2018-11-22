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
@Table(name = BaseEntity.TABLE_PREFIX + "DIAGNOSIS_PROVE")
public class DiagnosisProve extends FhirResourceEntity {

    /**
     *名称:诊断证明id
     *备注:诊断证明在院内系统中的唯一标识
 	 *
 	 *主键字段
     */
     @Column(name="DIAGNOSIS_PROVE_ID",length = 20,nullable = false)
     @FhirFieldValidate(name="DIAGNOSIS_PROVE_ID",displayName="诊断证明id",maxLength=20,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String diagnosisProveId;
    /**
     *名称:记录日期
     *备注:出门（急）诊病历报告的日期时间
 	 *
 	 *
     */
     @Column(name="RECORD_DATE",nullable = false)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="RECORD_DATE",displayName="记录日期",required=true,valuesRange="")   
     private Date recordDate;
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
     *名称:身份证号
     *
 	 *
 	 *
     */
     @Column(name="ID_CARD",length = 40,nullable = true)
     @FhirFieldValidate(name="ID_CARD",displayName="身份证号",maxLength=40,required=false,valuesRange="")   
     private String idCard;
    /**
     *名称:年龄
     *
 	 *
 	 *
     */
     @Column(name="AGE",length = 3,nullable = true)
     @FhirFieldValidate(name="AGE",displayName="年龄",maxLength=3,required=false,valuesRange="")   
     private Integer age;
    /**
     *名称:姓名
     *
 	 *
 	 *
     */
     @Column(name="NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="NAME",displayName="姓名",maxLength=20,required=false,valuesRange="")   
     private String name;
    /**
     *名称:性别
     *
 	 *限制:GBT22611
 	 *
     */
     @Column(name="GENDER",length = 10,nullable = true)
     @FhirFieldValidate(name="GENDER",displayName="性别",maxLength=10,required=false,valuesRange="GBT22611")   
     private String gender;
    /**
     *名称:出生日期
     *
 	 *
 	 *
     */
     @Column(name="BIRTHDATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="BIRTHDATE",displayName="出生日期",required=false,valuesRange="")   
     private Date birthdate;
    /**
     *名称:住院流水号
     *备注:引用住院基础信息表T_INPATIENT院内住院流水号
 	 *
 	 *
     */
     @Column(name="INPATIENT_REGISTRATION_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="INPATIENT_REGISTRATION_ID",displayName="住院流水号",maxLength=40,required=true,valuesRange="")   
     private String inpatientRegistrationId;
    /**
     *名称:入院时间
     *
 	 *
 	 *
     */
     @Column(name="START",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="START",displayName="入院时间",required=false,valuesRange="")   
     private Date start;
    /**
     *名称:出院时间
     *
 	 *
 	 *
     */
     @Column(name="END",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="END",displayName="出院时间",required=false,valuesRange="")   
     private Date end;
    /**
     *名称:住院天数
     *
 	 *
 	 *
     */
     @Column(name="INPAT_DAYS",length = 3,nullable = true)
     @FhirFieldValidate(name="INPAT_DAYS",displayName="住院天数",maxLength=3,required=false,valuesRange="")   
     private Integer inpatDays;
    /**
     *名称:住院号
     *
 	 *
 	 *
     */
     @Column(name="INH_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="INH_ID",displayName="住院号",maxLength=40,required=false,valuesRange="")   
     private String inhId;
    /**
     *名称:就诊科室id
     *
 	 *
 	 *
     */
     @Column(name="VISITING_DEPT_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="VISITING_DEPT_ID",displayName="就诊科室id",maxLength=40,required=false,valuesRange="")   
     private String visitingDeptId;
    /**
     *名称:就诊科室名称
     *
 	 *
 	 *
     */
     @Column(name="VISITING_DEPT_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="VISITING_DEPT_NAME",displayName="就诊科室名称",maxLength=40,required=false,valuesRange="")   
     private String visitingDeptName;
    /**
     *名称:治疗过程描述
     *
 	 *
 	 *
     */
     @Column(name="TREAT_RESCUE_COURSE",columnDefinition="text")
     @FhirFieldValidate(name="TREAT_RESCUE_COURSE",displayName="治疗过程描述",required=false,valuesRange="")   
     private String treatRescueCourse;
    /**
     *名称:出院主要诊断名称
     *
 	 *
 	 *
     */
     @Column(name="OUT_MAIN_DIAGNOSIS_NAME",length = 100,nullable = true)
     @FhirFieldValidate(name="OUT_MAIN_DIAGNOSIS_NAME",displayName="出院主要诊断名称",maxLength=100,required=false,valuesRange="")   
     private String outMainDiagnosisName;
    /**
     *名称:出院伴随诊断名称
     *
 	 *
 	 *
     */
     @Column(name="OUT_ACCOMPANY_DIAGNOSIS_NAME",length = 100,nullable = true)
     @FhirFieldValidate(name="OUT_ACCOMPANY_DIAGNOSIS_NAME",displayName="出院伴随诊断名称",maxLength=100,required=false,valuesRange="")   
     private String outAccompanyDiagnosisName;
    /**
     *名称:出院建议及带药
     *
 	 *
 	 *
     */
     @Column(name="DISCHARGE_ADVICE_MEDICINE",length = 500,nullable = true)
     @FhirFieldValidate(name="DISCHARGE_ADVICE_MEDICINE",displayName="出院建议及带药",maxLength=500,required=false,valuesRange="")   
     private String dischargeAdviceMedicine;
    /**
     *名称:医师签名
     *
 	 *
 	 *
     */
     @Column(name="PHYSICIAN",length = 20,nullable = true)
     @FhirFieldValidate(name="PHYSICIAN",displayName="医师签名",maxLength=20,required=false,valuesRange="")   
     private String physician;
    /**
     *名称:上传机构名称
     *备注:医疗机构在爱心医疗云平台中的唯一编码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getDiagnosisProveId(){
       	return this.diagnosisProveId;
     }
     public void setDiagnosisProveId(String diagnosisProveId){
       	this.diagnosisProveId=diagnosisProveId;
     }
     public Date getRecordDate(){
       	return this.recordDate;
     }
     public void setRecordDate(Date recordDate){
       	this.recordDate=recordDate;
     }
     public String getPatientId(){
       	return this.patientId;
     }
     public void setPatientId(String patientId){
       	this.patientId=patientId;
     }
     public String getIdCard(){
       	return this.idCard;
     }
     public void setIdCard(String idCard){
       	this.idCard=idCard;
     }
     public Integer getAge(){
       	return this.age;
     }
     public void setAge(Integer age){
       	this.age=age;
     }
     public String getName(){
       	return this.name;
     }
     public void setName(String name){
       	this.name=name;
     }
     public String getGender(){
       	return this.gender;
     }
     public void setGender(String gender){
       	this.gender=gender;
     }
     public Date getBirthdate(){
       	return this.birthdate;
     }
     public void setBirthdate(Date birthdate){
       	this.birthdate=birthdate;
     }
     public String getInpatientRegistrationId(){
       	return this.inpatientRegistrationId;
     }
     public void setInpatientRegistrationId(String inpatientRegistrationId){
       	this.inpatientRegistrationId=inpatientRegistrationId;
     }
     public Date getStart(){
       	return this.start;
     }
     public void setStart(Date start){
       	this.start=start;
     }
     public Date getEnd(){
       	return this.end;
     }
     public void setEnd(Date end){
       	this.end=end;
     }
     public Integer getInpatDays(){
       	return this.inpatDays;
     }
     public void setInpatDays(Integer inpatDays){
       	this.inpatDays=inpatDays;
     }
     public String getInhId(){
       	return this.inhId;
     }
     public void setInhId(String inhId){
       	this.inhId=inhId;
     }
     public String getVisitingDeptId(){
       	return this.visitingDeptId;
     }
     public void setVisitingDeptId(String visitingDeptId){
       	this.visitingDeptId=visitingDeptId;
     }
     public String getVisitingDeptName(){
       	return this.visitingDeptName;
     }
     public void setVisitingDeptName(String visitingDeptName){
       	this.visitingDeptName=visitingDeptName;
     }
     public String getTreatRescueCourse(){
       	return this.treatRescueCourse;
     }
     public void setTreatRescueCourse(String treatRescueCourse){
       	this.treatRescueCourse=treatRescueCourse;
     }
     public String getOutMainDiagnosisName(){
       	return this.outMainDiagnosisName;
     }
     public void setOutMainDiagnosisName(String outMainDiagnosisName){
       	this.outMainDiagnosisName=outMainDiagnosisName;
     }
     public String getOutAccompanyDiagnosisName(){
       	return this.outAccompanyDiagnosisName;
     }
     public void setOutAccompanyDiagnosisName(String outAccompanyDiagnosisName){
       	this.outAccompanyDiagnosisName=outAccompanyDiagnosisName;
     }
     public String getDischargeAdviceMedicine(){
       	return this.dischargeAdviceMedicine;
     }
     public void setDischargeAdviceMedicine(String dischargeAdviceMedicine){
       	this.dischargeAdviceMedicine=dischargeAdviceMedicine;
     }
     public String getPhysician(){
       	return this.physician;
     }
     public void setPhysician(String physician){
       	this.physician=physician;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}