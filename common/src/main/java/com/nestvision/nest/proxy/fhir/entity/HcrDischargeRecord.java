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
@Table(name = BaseEntity.TABLE_PREFIX + "HCR_DISCHARGE_RECORD")
public class HcrDischargeRecord extends FhirResourceEntity {

    /**
     *名称:出院记录id
     *
 	 *
 	 *主键字段
     */
     @Column(name="HCR_DISCHARGE_RECORD_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="HCR_DISCHARGE_RECORD_ID",displayName="出院记录id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String hcrDischargeRecordId;
    /**
     *名称:记录日期
     *
 	 *
 	 *
     */
     @Column(name="DATE",nullable = false)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DATE",displayName="记录日期",required=true,valuesRange="")   
     private Date date;
    /**
     *名称:院内患者ID
     *
 	 *
 	 *
     */
     @Column(name="PATIENT_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="PATIENT_ID",displayName="院内患者ID",maxLength=40,required=false,valuesRange="")   
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
     *名称:城乡居民健康档案编号
     *
 	 *
 	 *
     */
     @Column(name="HEALTH_FILE_NUMBER",length = 40,nullable = true)
     @FhirFieldValidate(name="HEALTH_FILE_NUMBER",displayName="城乡居民健康档案编号",maxLength=40,required=false,valuesRange="")   
     private String healthFileNumber;
    /**
     *名称:健康卡号
     *
 	 *
 	 *
     */
     @Column(name="HEALTH_CARD",length = 40,nullable = true)
     @FhirFieldValidate(name="HEALTH_CARD",displayName="健康卡号",maxLength=40,required=false,valuesRange="")   
     private String healthCard;
    /**
     *名称:姓名
     *
 	 *
 	 *
     */
     @Column(name="NAME",length = 20,nullable = false)
     @FhirFieldValidate(name="NAME",displayName="姓名",maxLength=20,required=true,valuesRange="")   
     private String name;
    /**
     *名称:性别
     *
 	 *限制:GBT22611
 	 *
     */
     @Column(name="GENDER",length = 10,nullable = false)
     @FhirFieldValidate(name="GENDER",displayName="性别",maxLength=10,required=true,valuesRange="GBT22611")   
     private String gender;
    /**
     *名称:年龄
     *
 	 *
 	 *
     */
     @Column(name="AGE",length = 8,nullable = true)
     @FhirFieldValidate(name="AGE",displayName="年龄",maxLength=8,required=false,valuesRange="")   
     private Float age;
    /**
     *名称:文档创建者id
     *
 	 *
 	 *
     */
     @Column(name="AUTHOR_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="AUTHOR_ID",displayName="文档创建者id",maxLength=40,required=false,valuesRange="")   
     private String authorId;
    /**
     *名称:文档创建者姓名
     *
 	 *
 	 *
     */
     @Column(name="AUTHOR_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="AUTHOR_NAME",displayName="文档创建者姓名",maxLength=20,required=false,valuesRange="")   
     private String authorName;
    /**
     *名称:主治医师签名日期
     *
 	 *
 	 *
     */
     @Column(name="ATTENDING_DOCTOR_SIGN_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="ATTENDING_DOCTOR_SIGN_DATE",displayName="主治医师签名日期",required=false,valuesRange="")   
     private Date attendingDoctorSignDate;
    /**
     *名称:主治医师id
     *
 	 *
 	 *
     */
     @Column(name="ATTENDING_DOCTOR_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="ATTENDING_DOCTOR_ID",displayName="主治医师id",maxLength=40,required=false,valuesRange="")   
     private String attendingDoctorId;
    /**
     *名称:主治医师姓名
     *
 	 *
 	 *
     */
     @Column(name="ATTENDING_DOCTOR_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="ATTENDING_DOCTOR_NAME",displayName="主治医师姓名",maxLength=20,required=false,valuesRange="")   
     private String attendingDoctorName;
    /**
     *名称:主治医师职务代码
     *
 	 *限制:CV9900374
 	 *
     */
     @Column(name="ATTENDING_DOCTOR_POST_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="ATTENDING_DOCTOR_POST_CODE",displayName="主治医师职务代码",maxLength=20,required=false,valuesRange="CV9900374")   
     private String attendingDoctorPostCode;
    /**
     *名称:住院医师签名日期
     *
 	 *
 	 *
     */
     @Column(name="RESIDENT_DOCTOR_SIGN_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="RESIDENT_DOCTOR_SIGN_DATE",displayName="住院医师签名日期",required=false,valuesRange="")   
     private Date residentDoctorSignDate;
    /**
     *名称:住院医师id
     *
 	 *
 	 *
     */
     @Column(name="RESIDENT_DOCTOR_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="RESIDENT_DOCTOR_ID",displayName="住院医师id",maxLength=40,required=false,valuesRange="")   
     private String residentDoctorId;
    /**
     *名称:住院医师姓名
     *
 	 *
 	 *
     */
     @Column(name="RESIDENT_DOCTOR_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="RESIDENT_DOCTOR_NAME",displayName="住院医师姓名",maxLength=20,required=false,valuesRange="")   
     private String residentDoctorName;
    /**
     *名称:住院医师职务代码
     *
 	 *限制:CV9900374
 	 *
     */
     @Column(name="RESIDENT_DOCTOR_POST_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="RESIDENT_DOCTOR_POST_CODE",displayName="住院医师职务代码",maxLength=20,required=false,valuesRange="CV9900374")   
     private String residentDoctorPostCode;
    /**
     *名称:主任医师签名日期
     *
 	 *
 	 *
     */
     @Column(name="DIRECTOR_DOCTOR_SIGN_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DIRECTOR_DOCTOR_SIGN_DATE",displayName="主任医师签名日期",required=false,valuesRange="")   
     private Date directorDoctorSignDate;
    /**
     *名称:主任医师id
     *
 	 *
 	 *
     */
     @Column(name="DIRECTOR_DOCTOR_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="DIRECTOR_DOCTOR_ID",displayName="主任医师id",maxLength=40,required=false,valuesRange="")   
     private String directorDoctorId;
    /**
     *名称:主任医师姓名
     *
 	 *
 	 *
     */
     @Column(name="DIRECTOR_DOCTOR_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="DIRECTOR_DOCTOR_NAME",displayName="主任医师姓名",maxLength=20,required=false,valuesRange="")   
     private String directorDoctorName;
    /**
     *名称:主任医师职务代码
     *
 	 *限制:CV9900374
 	 *
     */
     @Column(name="DIRECTOR_DOCTOR_POST_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="DIRECTOR_DOCTOR_POST_CODE",displayName="主任医师职务代码",maxLength=20,required=false,valuesRange="CV9900374")   
     private String directorDoctorPostCode;
    /**
     *名称:病房号
     *
 	 *
 	 *
     */
     @Column(name="WARD_NO",length = 20,nullable = true)
     @FhirFieldValidate(name="WARD_NO",displayName="病房号",maxLength=20,required=false,valuesRange="")   
     private String wardNo;
    /**
     *名称:病区
     *
 	 *
 	 *
     */
     @Column(name="WARD_AREA",length = 40,nullable = true)
     @FhirFieldValidate(name="WARD_AREA",displayName="病区",maxLength=40,required=false,valuesRange="")   
     private String wardArea;
    /**
     *名称:床位号
     *
 	 *
 	 *
     */
     @Column(name="BED_NUM",length = 20,nullable = true)
     @FhirFieldValidate(name="BED_NUM",displayName="床位号",maxLength=20,required=false,valuesRange="")   
     private String bedNum;
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
     *名称:就诊科室标准编码
     *
 	 *限制:CV9900051
 	 *
     */
     @Column(name="VISITING_DEPT_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="VISITING_DEPT_CD",displayName="就诊科室标准编码",maxLength=20,required=false,valuesRange="CV9900051")   
     private String visitingDeptCd;
    /**
     *名称:中医"四诊"观察结果
     *
 	 *
 	 *
     */
     @Column(name="CN_FOUR_RESULT",length = 100,nullable = true)
     @FhirFieldValidate(name="CN_FOUR_RESULT",displayName="中医&quot;四诊&quot;观察结果",maxLength=100,required=false,valuesRange="")   
     private String cnFourResult;
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
     *名称:住院号
     *
 	 *
 	 *
     */
     @Column(name="INH_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="INH_ID",displayName="住院号",maxLength=40,required=false,valuesRange="")   
     private String inhId;
    /**
     *名称:住院流水号
     *
 	 *
 	 *
     */
     @Column(name="INPATIENT_REGISTRATION_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="INPATIENT_REGISTRATION_ID",displayName="住院流水号",maxLength=40,required=true,valuesRange="")   
     private String inpatientRegistrationId;
    /**
     *名称:入院情况
     *
 	 *
 	 *
     */
     @Column(name="HTH_INPATIENT_DETAILS",columnDefinition="text")
     @FhirFieldValidate(name="HTH_INPATIENT_DETAILS",displayName="入院情况",required=false,valuesRange="")   
     private String hthInpatientDetails;
    /**
     *名称:出院诊断-中医症候代码
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="OUT_CN_SYM_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="OUT_CN_SYM_DIAG_CODE",displayName="出院诊断-中医症候代码",maxLength=20,required=false,valuesRange="CV9900357")   
     private String outCnSymDiagCode;
    /**
     *名称:出院诊断-中医病名代码
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="OUT_CN_DIS_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="OUT_CN_DIS_DIAG_CODE",displayName="出院诊断-中医病名代码",maxLength=20,required=false,valuesRange="CV9900357")   
     private String outCnDisDiagCode;
    /**
     *名称:出院诊断-出院时症状与体征
     *
 	 *
 	 *
     */
     @Column(name="OUT_DISCHARGE_SYMPTOM_AND_SIGN",length = 100,nullable = true)
     @FhirFieldValidate(name="OUT_DISCHARGE_SYMPTOM_AND_SIGN",displayName="出院诊断-出院时症状与体征",maxLength=100,required=false,valuesRange="")   
     private String outDischargeSymptomAndSign;
    /**
     *名称:出院诊断-出院情况
     *
 	 *
 	 *
     */
     @Column(name="OUT_DISCHARGE_CIRCUMSTANCE",columnDefinition="text")
     @FhirFieldValidate(name="OUT_DISCHARGE_CIRCUMSTANCE",displayName="出院诊断-出院情况",required=false,valuesRange="")   
     private String outDischargeCircumstance;
    /**
     *名称:出院诊断-出院医嘱
     *
 	 *
 	 *
     */
     @Column(name="OUT_DISCHARGE_ADVICE",columnDefinition="text")
     @FhirFieldValidate(name="OUT_DISCHARGE_ADVICE",displayName="出院诊断-出院医嘱",required=false,valuesRange="")   
     private String outDischargeAdvice;
    /**
     *名称:出院诊断-诊断编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="OUT_ADMISSION_DIAGNOSIS",length = 20,nullable = true)
     @FhirFieldValidate(name="OUT_ADMISSION_DIAGNOSIS",displayName="出院诊断-诊断编码",maxLength=20,required=false,valuesRange="CV990111")   
     private String outAdmissionDiagnosis;
    /**
     *名称:出院诊断-诊断编码名称
     *
 	 *
 	 *
     */
     @Column(name="OUT_ADMISSION_DIAGNOSIS_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="OUT_ADMISSION_DIAGNOSIS_NAME",displayName="出院诊断-诊断编码名称",maxLength=40,required=false,valuesRange="")   
     private String outAdmissionDiagnosisName;
    /**
     *名称:出院诊断-诊断日期
     *
 	 *
 	 *
     */
     @Column(name="OUT_DIAGNOSIS_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="OUT_DIAGNOSIS_DATE",displayName="出院诊断-诊断日期",required=false,valuesRange="")   
     private Date outDiagnosisDate;
    /**
     *名称:入院诊断-阳性辅助检查结果
     *
 	 *
 	 *
     */
     @Column(name="IN_POSITIVE_AUX_INSPECTION_RESULT",length = 200,nullable = true)
     @FhirFieldValidate(name="IN_POSITIVE_AUX_INSPECTION_RESULT",displayName="入院诊断-阳性辅助检查结果",maxLength=200,required=false,valuesRange="")   
     private String inPositiveAuxInspectionResult;
    /**
     *名称:入院诊断-治则治法
     *
 	 *
 	 *
     */
     @Column(name="IN_THERAPEUTIC_PRINCIPLES",length = 200,nullable = true)
     @FhirFieldValidate(name="IN_THERAPEUTIC_PRINCIPLES",displayName="入院诊断-治则治法",maxLength=200,required=false,valuesRange="")   
     private String inTherapeuticPrinciples;
    /**
     *名称:入院诊断-诊断编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="IN_ADMISSION_DIAGNOSIS",length = 20,nullable = true)
     @FhirFieldValidate(name="IN_ADMISSION_DIAGNOSIS",displayName="入院诊断-诊断编码",maxLength=20,required=false,valuesRange="CV990111")   
     private String inAdmissionDiagnosis;
    /**
     *名称:入院诊断-诊断编码名称
     *
 	 *
 	 *
     */
     @Column(name="IN_ADMISSION_DIAGNOSIS_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="IN_ADMISSION_DIAGNOSIS_NAME",displayName="入院诊断-诊断编码名称",maxLength=40,required=false,valuesRange="")   
     private String inAdmissionDiagnosisName;
    /**
     *名称:入院诊断-诊断日期
     *
 	 *
 	 *
     */
     @Column(name="IN_DIAGNOSIS_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="IN_DIAGNOSIS_DATE",displayName="入院诊断-诊断日期",required=false,valuesRange="")   
     private Date inDiagnosisDate;
    /**
     *名称:住院过程-诊疗过程描述
     *
 	 *
 	 *
     */
     @Column(name="IN_TREAT_RESCUE_COURSE",length = 500,nullable = true)
     @FhirFieldValidate(name="IN_TREAT_RESCUE_COURSE",displayName="住院过程-诊疗过程描述",maxLength=500,required=false,valuesRange="")   
     private String inTreatRescueCourse;
    /**
     *名称:医嘱用药-中药煎煮法
     *备注:中药饮片煎煮方法描述
 	 *
 	 *
     */
     @Column(name="CN_PRESCRIBE_DESCR",length = 100,nullable = true)
     @FhirFieldValidate(name="CN_PRESCRIBE_DESCR",displayName="医嘱用药-中药煎煮法",maxLength=100,required=false,valuesRange="")   
     private String cnPrescribeDescr;
    /**
     *名称:医嘱用药-中药服用方法代码
     *
 	 *限制:CV9900304
 	 *
     */
     @Column(name="CN_DRUG_WAY_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="CN_DRUG_WAY_CD",displayName="医嘱用药-中药服用方法代码",maxLength=20,required=false,valuesRange="CV9900304")   
     private String cnDrugWayCd;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getHcrDischargeRecordId(){
       	return this.hcrDischargeRecordId;
     }
     public void setHcrDischargeRecordId(String hcrDischargeRecordId){
       	this.hcrDischargeRecordId=hcrDischargeRecordId;
     }
     public Date getDate(){
       	return this.date;
     }
     public void setDate(Date date){
       	this.date=date;
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
     public String getHealthFileNumber(){
       	return this.healthFileNumber;
     }
     public void setHealthFileNumber(String healthFileNumber){
       	this.healthFileNumber=healthFileNumber;
     }
     public String getHealthCard(){
       	return this.healthCard;
     }
     public void setHealthCard(String healthCard){
       	this.healthCard=healthCard;
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
     public Float getAge(){
       	return this.age;
     }
     public void setAge(Float age){
       	this.age=age;
     }
     public String getAuthorId(){
       	return this.authorId;
     }
     public void setAuthorId(String authorId){
       	this.authorId=authorId;
     }
     public String getAuthorName(){
       	return this.authorName;
     }
     public void setAuthorName(String authorName){
       	this.authorName=authorName;
     }
     public Date getAttendingDoctorSignDate(){
       	return this.attendingDoctorSignDate;
     }
     public void setAttendingDoctorSignDate(Date attendingDoctorSignDate){
       	this.attendingDoctorSignDate=attendingDoctorSignDate;
     }
     public String getAttendingDoctorId(){
       	return this.attendingDoctorId;
     }
     public void setAttendingDoctorId(String attendingDoctorId){
       	this.attendingDoctorId=attendingDoctorId;
     }
     public String getAttendingDoctorName(){
       	return this.attendingDoctorName;
     }
     public void setAttendingDoctorName(String attendingDoctorName){
       	this.attendingDoctorName=attendingDoctorName;
     }
     public String getAttendingDoctorPostCode(){
       	return this.attendingDoctorPostCode;
     }
     public void setAttendingDoctorPostCode(String attendingDoctorPostCode){
       	this.attendingDoctorPostCode=attendingDoctorPostCode;
     }
     public Date getResidentDoctorSignDate(){
       	return this.residentDoctorSignDate;
     }
     public void setResidentDoctorSignDate(Date residentDoctorSignDate){
       	this.residentDoctorSignDate=residentDoctorSignDate;
     }
     public String getResidentDoctorId(){
       	return this.residentDoctorId;
     }
     public void setResidentDoctorId(String residentDoctorId){
       	this.residentDoctorId=residentDoctorId;
     }
     public String getResidentDoctorName(){
       	return this.residentDoctorName;
     }
     public void setResidentDoctorName(String residentDoctorName){
       	this.residentDoctorName=residentDoctorName;
     }
     public String getResidentDoctorPostCode(){
       	return this.residentDoctorPostCode;
     }
     public void setResidentDoctorPostCode(String residentDoctorPostCode){
       	this.residentDoctorPostCode=residentDoctorPostCode;
     }
     public Date getDirectorDoctorSignDate(){
       	return this.directorDoctorSignDate;
     }
     public void setDirectorDoctorSignDate(Date directorDoctorSignDate){
       	this.directorDoctorSignDate=directorDoctorSignDate;
     }
     public String getDirectorDoctorId(){
       	return this.directorDoctorId;
     }
     public void setDirectorDoctorId(String directorDoctorId){
       	this.directorDoctorId=directorDoctorId;
     }
     public String getDirectorDoctorName(){
       	return this.directorDoctorName;
     }
     public void setDirectorDoctorName(String directorDoctorName){
       	this.directorDoctorName=directorDoctorName;
     }
     public String getDirectorDoctorPostCode(){
       	return this.directorDoctorPostCode;
     }
     public void setDirectorDoctorPostCode(String directorDoctorPostCode){
       	this.directorDoctorPostCode=directorDoctorPostCode;
     }
     public String getWardNo(){
       	return this.wardNo;
     }
     public void setWardNo(String wardNo){
       	this.wardNo=wardNo;
     }
     public String getWardArea(){
       	return this.wardArea;
     }
     public void setWardArea(String wardArea){
       	this.wardArea=wardArea;
     }
     public String getBedNum(){
       	return this.bedNum;
     }
     public void setBedNum(String bedNum){
       	this.bedNum=bedNum;
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
     public String getVisitingDeptCd(){
       	return this.visitingDeptCd;
     }
     public void setVisitingDeptCd(String visitingDeptCd){
       	this.visitingDeptCd=visitingDeptCd;
     }
     public String getCnFourResult(){
       	return this.cnFourResult;
     }
     public void setCnFourResult(String cnFourResult){
       	this.cnFourResult=cnFourResult;
     }
     public Date getStart(){
       	return this.start;
     }
     public void setStart(Date start){
       	this.start=start;
     }
     public String getInhId(){
       	return this.inhId;
     }
     public void setInhId(String inhId){
       	this.inhId=inhId;
     }
     public String getInpatientRegistrationId(){
       	return this.inpatientRegistrationId;
     }
     public void setInpatientRegistrationId(String inpatientRegistrationId){
       	this.inpatientRegistrationId=inpatientRegistrationId;
     }
     public String getHthInpatientDetails(){
       	return this.hthInpatientDetails;
     }
     public void setHthInpatientDetails(String hthInpatientDetails){
       	this.hthInpatientDetails=hthInpatientDetails;
     }
     public String getOutCnSymDiagCode(){
       	return this.outCnSymDiagCode;
     }
     public void setOutCnSymDiagCode(String outCnSymDiagCode){
       	this.outCnSymDiagCode=outCnSymDiagCode;
     }
     public String getOutCnDisDiagCode(){
       	return this.outCnDisDiagCode;
     }
     public void setOutCnDisDiagCode(String outCnDisDiagCode){
       	this.outCnDisDiagCode=outCnDisDiagCode;
     }
     public String getOutDischargeSymptomAndSign(){
       	return this.outDischargeSymptomAndSign;
     }
     public void setOutDischargeSymptomAndSign(String outDischargeSymptomAndSign){
       	this.outDischargeSymptomAndSign=outDischargeSymptomAndSign;
     }
     public String getOutDischargeCircumstance(){
       	return this.outDischargeCircumstance;
     }
     public void setOutDischargeCircumstance(String outDischargeCircumstance){
       	this.outDischargeCircumstance=outDischargeCircumstance;
     }
     public String getOutDischargeAdvice(){
       	return this.outDischargeAdvice;
     }
     public void setOutDischargeAdvice(String outDischargeAdvice){
       	this.outDischargeAdvice=outDischargeAdvice;
     }
     public String getOutAdmissionDiagnosis(){
       	return this.outAdmissionDiagnosis;
     }
     public void setOutAdmissionDiagnosis(String outAdmissionDiagnosis){
       	this.outAdmissionDiagnosis=outAdmissionDiagnosis;
     }
     public String getOutAdmissionDiagnosisName(){
       	return this.outAdmissionDiagnosisName;
     }
     public void setOutAdmissionDiagnosisName(String outAdmissionDiagnosisName){
       	this.outAdmissionDiagnosisName=outAdmissionDiagnosisName;
     }
     public Date getOutDiagnosisDate(){
       	return this.outDiagnosisDate;
     }
     public void setOutDiagnosisDate(Date outDiagnosisDate){
       	this.outDiagnosisDate=outDiagnosisDate;
     }
     public String getInPositiveAuxInspectionResult(){
       	return this.inPositiveAuxInspectionResult;
     }
     public void setInPositiveAuxInspectionResult(String inPositiveAuxInspectionResult){
       	this.inPositiveAuxInspectionResult=inPositiveAuxInspectionResult;
     }
     public String getInTherapeuticPrinciples(){
       	return this.inTherapeuticPrinciples;
     }
     public void setInTherapeuticPrinciples(String inTherapeuticPrinciples){
       	this.inTherapeuticPrinciples=inTherapeuticPrinciples;
     }
     public String getInAdmissionDiagnosis(){
       	return this.inAdmissionDiagnosis;
     }
     public void setInAdmissionDiagnosis(String inAdmissionDiagnosis){
       	this.inAdmissionDiagnosis=inAdmissionDiagnosis;
     }
     public String getInAdmissionDiagnosisName(){
       	return this.inAdmissionDiagnosisName;
     }
     public void setInAdmissionDiagnosisName(String inAdmissionDiagnosisName){
       	this.inAdmissionDiagnosisName=inAdmissionDiagnosisName;
     }
     public Date getInDiagnosisDate(){
       	return this.inDiagnosisDate;
     }
     public void setInDiagnosisDate(Date inDiagnosisDate){
       	this.inDiagnosisDate=inDiagnosisDate;
     }
     public String getInTreatRescueCourse(){
       	return this.inTreatRescueCourse;
     }
     public void setInTreatRescueCourse(String inTreatRescueCourse){
       	this.inTreatRescueCourse=inTreatRescueCourse;
     }
     public String getCnPrescribeDescr(){
       	return this.cnPrescribeDescr;
     }
     public void setCnPrescribeDescr(String cnPrescribeDescr){
       	this.cnPrescribeDescr=cnPrescribeDescr;
     }
     public String getCnDrugWayCd(){
       	return this.cnDrugWayCd;
     }
     public void setCnDrugWayCd(String cnDrugWayCd){
       	this.cnDrugWayCd=cnDrugWayCd;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}