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
@Table(name = BaseEntity.TABLE_PREFIX + "PATHOLOGICAL_REPORT")
public class PathologicalReport extends FhirResourceEntity {

    /**
     *名称:病理号
     *备注:病理报告在院内系统中的唯一标识
 	 *
 	 *
     */
     @Column(name="PATHOLOGICAL_REPORT_ID",length = 20,nullable = false)
     @FhirFieldValidate(name="PATHOLOGICAL_REPORT_ID",displayName="病理号",maxLength=20,required=true,valuesRange="")   
     private String pathologicalReportId;
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
 	 *
 	 *
     */
     @Column(name="GENDER",length = 10,nullable = true)
     @FhirFieldValidate(name="GENDER",displayName="性别",maxLength=10,required=false,valuesRange="")   
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
     *名称:门诊或住院标识
     *
 	 *
 	 *
     */
     @Column(name="VISIT_MARK",length = 10,nullable = false)
     @FhirFieldValidate(name="VISIT_MARK",displayName="门诊或住院标识",maxLength=10,required=true,valuesRange="")   
     private String visitMark;
    /**
     *名称:就诊流水号
     *备注:引用门诊接诊表T_OUTPATIENT_REGISTRATION院内门诊流水号或引用住院接诊表T_INPATIENT_REGISTRATION院内住院流水号
 	 *
 	 *
     */
     @Column(name="REGISTRATION_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="REGISTRATION_ID",displayName="就诊流水号",maxLength=40,required=true,valuesRange="")   
     private String registrationId;
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
     *名称:送检日期
     *
 	 *
 	 *
     */
     @Column(name="INSPECTION_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="INSPECTION_DATE",displayName="送检日期",required=false,valuesRange="")   
     private Date inspectionDate;
    /**
     *名称:送检单位
     *
 	 *
 	 *
     */
     @Column(name="INSPECTION_UNIT",length = 20,nullable = true)
     @FhirFieldValidate(name="INSPECTION_UNIT",displayName="送检单位",maxLength=20,required=false,valuesRange="")   
     private String inspectionUnit;
    /**
     *名称:临床诊断
     *
 	 *
 	 *
     */
     @Column(name="CLINICAL_DIAGNOSIS",length = 50,nullable = true)
     @FhirFieldValidate(name="CLINICAL_DIAGNOSIS",displayName="临床诊断",maxLength=50,required=false,valuesRange="")   
     private String clinicalDiagnosis;
    /**
     *名称:送检材料/部位
     *
 	 *
 	 *
     */
     @Column(name="INSPECTION_MATERIALS_PARTS",length = 50,nullable = true)
     @FhirFieldValidate(name="INSPECTION_MATERIALS_PARTS",displayName="送检材料/部位",maxLength=50,required=false,valuesRange="")   
     private String inspectionMaterialsParts;
    /**
     *名称:肉眼检查
     *
 	 *
 	 *
     */
     @Column(name="NAKED_EYE_EXAMINATION",length = 200,nullable = true)
     @FhirFieldValidate(name="NAKED_EYE_EXAMINATION",displayName="肉眼检查",maxLength=200,required=false,valuesRange="")   
     private String nakedEyeExamination;
    /**
     *名称:图像（base64Binary）
     *
 	 *
 	 *
     */
     @Column(name="IMAGE",columnDefinition="text")
     @FhirFieldValidate(name="IMAGE",displayName="图像（base64Binary）",required=false,valuesRange="")   
     private String image;
    /**
     *名称:病理诊断
     *
 	 *
 	 *
     */
     @Column(name="PATHOLOGIC_DIAGNOSIS",length = 200,nullable = true)
     @FhirFieldValidate(name="PATHOLOGIC_DIAGNOSIS",displayName="病理诊断",maxLength=200,required=false,valuesRange="")   
     private String pathologicDiagnosis;
    /**
     *名称:诊断日期
     *
 	 *
 	 *
     */
     @Column(name="DIAGNOSIS_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DIAGNOSIS_DATE",displayName="诊断日期",required=false,valuesRange="")   
     private Date diagnosisDate;
    /**
     *名称:复诊医师
     *
 	 *
 	 *
     */
     @Column(name="REVISIT_DOCTOR",length = 20,nullable = true)
     @FhirFieldValidate(name="REVISIT_DOCTOR",displayName="复诊医师",maxLength=20,required=false,valuesRange="")   
     private String revisitDoctor;
    /**
     *名称:初诊医师
     *
 	 *
 	 *
     */
     @Column(name="PRIMARY_DOCTOR",length = 20,nullable = true)
     @FhirFieldValidate(name="PRIMARY_DOCTOR",displayName="初诊医师",maxLength=20,required=false,valuesRange="")   
     private String primaryDoctor;
    /**
     *名称:上传机构名称
     *备注:医疗机构在爱心医疗云平台中的唯一编码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getPathologicalReportId(){
       	return this.pathologicalReportId;
     }
     public void setPathologicalReportId(String pathologicalReportId){
       	this.pathologicalReportId=pathologicalReportId;
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
     public String getVisitMark(){
       	return this.visitMark;
     }
     public void setVisitMark(String visitMark){
       	this.visitMark=visitMark;
     }
     public String getRegistrationId(){
       	return this.registrationId;
     }
     public void setRegistrationId(String registrationId){
       	this.registrationId=registrationId;
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
     public Date getInspectionDate(){
       	return this.inspectionDate;
     }
     public void setInspectionDate(Date inspectionDate){
       	this.inspectionDate=inspectionDate;
     }
     public String getInspectionUnit(){
       	return this.inspectionUnit;
     }
     public void setInspectionUnit(String inspectionUnit){
       	this.inspectionUnit=inspectionUnit;
     }
     public String getClinicalDiagnosis(){
       	return this.clinicalDiagnosis;
     }
     public void setClinicalDiagnosis(String clinicalDiagnosis){
       	this.clinicalDiagnosis=clinicalDiagnosis;
     }
     public String getInspectionMaterialsParts(){
       	return this.inspectionMaterialsParts;
     }
     public void setInspectionMaterialsParts(String inspectionMaterialsParts){
       	this.inspectionMaterialsParts=inspectionMaterialsParts;
     }
     public String getNakedEyeExamination(){
       	return this.nakedEyeExamination;
     }
     public void setNakedEyeExamination(String nakedEyeExamination){
       	this.nakedEyeExamination=nakedEyeExamination;
     }
     public String getImage(){
       	return this.image;
     }
     public void setImage(String image){
       	this.image=image;
     }
     public String getPathologicDiagnosis(){
       	return this.pathologicDiagnosis;
     }
     public void setPathologicDiagnosis(String pathologicDiagnosis){
       	this.pathologicDiagnosis=pathologicDiagnosis;
     }
     public Date getDiagnosisDate(){
       	return this.diagnosisDate;
     }
     public void setDiagnosisDate(Date diagnosisDate){
       	this.diagnosisDate=diagnosisDate;
     }
     public String getRevisitDoctor(){
       	return this.revisitDoctor;
     }
     public void setRevisitDoctor(String revisitDoctor){
       	this.revisitDoctor=revisitDoctor;
     }
     public String getPrimaryDoctor(){
       	return this.primaryDoctor;
     }
     public void setPrimaryDoctor(String primaryDoctor){
       	this.primaryDoctor=primaryDoctor;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}