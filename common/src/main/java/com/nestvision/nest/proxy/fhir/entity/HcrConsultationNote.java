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
@Table(name = BaseEntity.TABLE_PREFIX + "HCR_CONSULTATION_NOTE")
public class HcrConsultationNote extends FhirResourceEntity {

    /**
     *名称:会诊记录id
     *
 	 *
 	 *主键字段
     */
     @Column(name="HCR_CONSULTATION_NOTE_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="HCR_CONSULTATION_NOTE_ID",displayName="会诊记录id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String hcrConsultationNoteId;
    /**
     *名称:会诊申请科室id
     *
 	 *
 	 *
     */
     @Column(name="CONSULTATION_REQUEST_DEPT_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="CONSULTATION_REQUEST_DEPT_ID",displayName="会诊申请科室id",maxLength=40,required=false,valuesRange="")   
     private String consultationRequestDeptId;
    /**
     *名称:会诊申请科室名称
     *
 	 *
 	 *
     */
     @Column(name="CONSULTATION_REQUEST_DEPT_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="CONSULTATION_REQUEST_DEPT_NAME",displayName="会诊申请科室名称",maxLength=40,required=false,valuesRange="")   
     private String consultationRequestDeptName;
    /**
     *名称:会诊申请科室标准编码
     *
 	 *限制:CV9900051
 	 *
     */
     @Column(name="CONSULTATION_REQUEST_DEPT_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="CONSULTATION_REQUEST_DEPT_CD",displayName="会诊申请科室标准编码",maxLength=20,required=false,valuesRange="CV9900051")   
     private String consultationRequestDeptCd;
    /**
     *名称:会诊科室id
     *
 	 *
 	 *
     */
     @Column(name="CONSULTATION_DEPT_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="CONSULTATION_DEPT_ID",displayName="会诊科室id",maxLength=40,required=false,valuesRange="")   
     private String consultationDeptId;
    /**
     *名称:会诊科室名称
     *
 	 *
 	 *
     */
     @Column(name="CONSULTATION_DEPT_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="CONSULTATION_DEPT_NAME",displayName="会诊科室名称",maxLength=40,required=false,valuesRange="")   
     private String consultationDeptName;
    /**
     *名称:会诊科室标准编码
     *
 	 *限制:CV9900051
 	 *
     */
     @Column(name="CONSULTATION_DEPT_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="CONSULTATION_DEPT_CD",displayName="会诊科室标准编码",maxLength=20,required=false,valuesRange="CV9900051")   
     private String consultationDeptCd;
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
     *名称:联系人关系代码
     *
 	 *限制:GBT4761
 	 *
     */
     @Column(name="RELATIONSHIP",length = 20,nullable = true)
     @FhirFieldValidate(name="RELATIONSHIP",displayName="联系人关系代码",maxLength=20,required=false,valuesRange="GBT4761")   
     private String relationship;
    /**
     *名称:联系人姓名
     *
 	 *
 	 *
     */
     @Column(name="CONTACTS_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="CONTACTS_NAME",displayName="联系人姓名",maxLength=20,required=false,valuesRange="")   
     private String contactsName;
    /**
     *名称:联系人电话号码
     *
 	 *
 	 *
     */
     @Column(name="CONTACTS_PHONE",length = 20,nullable = true)
     @FhirFieldValidate(name="CONTACTS_PHONE",displayName="联系人电话号码",maxLength=20,required=false,valuesRange="")   
     private String contactsPhone;
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
     *名称:是否有过敏史
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_RRITABILITY",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_RRITABILITY",displayName="是否有过敏史",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifRritability;
    /**
     *名称:过敏史其他描述
     *
 	 *
 	 *
     */
     @Column(name="RRITABILITY",columnDefinition="text")
     @FhirFieldValidate(name="RRITABILITY",displayName="过敏史其他描述",required=false,valuesRange="")   
     private String rritability;
    /**
     *名称:会诊申请医师id
     *
 	 *
 	 *
     */
     @Column(name="CONSULTATION_REQUEST_DOCTOR_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="CONSULTATION_REQUEST_DOCTOR_ID",displayName="会诊申请医师id",maxLength=40,required=false,valuesRange="")   
     private String consultationRequestDoctorId;
    /**
     *名称:会诊申请医师姓名
     *
 	 *
 	 *
     */
     @Column(name="CONSULTATION_REQUEST_DOCTOR_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="CONSULTATION_REQUEST_DOCTOR_NAME",displayName="会诊申请医师姓名",maxLength=20,required=false,valuesRange="")   
     private String consultationRequestDoctorName;
    /**
     *名称:会诊医师id
     *
 	 *
 	 *
     */
     @Column(name="CONSULTATION_DOCTOR_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="CONSULTATION_DOCTOR_ID",displayName="会诊医师id",maxLength=40,required=false,valuesRange="")   
     private String consultationDoctorId;
    /**
     *名称:会诊医师姓名
     *
 	 *
 	 *
     */
     @Column(name="CONSULTATION_DOCTOR_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="CONSULTATION_DOCTOR_NAME",displayName="会诊医师姓名",maxLength=20,required=false,valuesRange="")   
     private String consultationDoctorName;
    /**
     *名称:会诊日期
     *
 	 *
 	 *
     */
     @Column(name="CONSULTATION_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="CONSULTATION_DATE",displayName="会诊日期",required=false,valuesRange="")   
     private Date consultationDate;
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
     *名称:中医"四诊"观察结果
     *
 	 *
 	 *
     */
     @Column(name="CN_FOUR_RESULT",length = 100,nullable = true)
     @FhirFieldValidate(name="CN_FOUR_RESULT",displayName="中医&quot;四诊&quot;观察结果",maxLength=100,required=false,valuesRange="")   
     private String cnFourResult;
    /**
     *名称:病历摘要
     *
 	 *
 	 *
     */
     @Column(name="CASE_ABSTRACT",length = 100,nullable = true)
     @FhirFieldValidate(name="CASE_ABSTRACT",displayName="病历摘要",maxLength=100,required=false,valuesRange="")   
     private String caseAbstract;
    /**
     *名称:中医症候代码
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="CN_SYM_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="CN_SYM_DIAG_CODE",displayName="中医症候代码",maxLength=20,required=false,valuesRange="CV9900357")   
     private String cnSymDiagCode;
    /**
     *名称:中医病名代码
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="CN_DIS_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="CN_DIS_DIAG_CODE",displayName="中医病名代码",maxLength=20,required=false,valuesRange="CV9900357")   
     private String cnDisDiagCode;
    /**
     *名称:诊断编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="DIAG_CODE",displayName="诊断编码",maxLength=20,required=false,valuesRange="CV990111")   
     private String diagCode;
    /**
     *名称:诊断编码名称
     *
 	 *
 	 *
     */
     @Column(name="DIAG_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="DIAG_NAME",displayName="诊断编码名称",maxLength=40,required=false,valuesRange="")   
     private String diagName;
    /**
     *名称:诊断日期
     *
 	 *
 	 *
     */
     @Column(name="DIAG_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DIAG_DATE",displayName="诊断日期",required=false,valuesRange="")   
     private Date diagDate;
    /**
     *名称:辅助检查结果
     *
 	 *
 	 *
     */
     @Column(name="AUXILIARY_EXAMINATION_RESULTS",length = 200,nullable = true)
     @FhirFieldValidate(name="AUXILIARY_EXAMINATION_RESULTS",displayName="辅助检查结果",maxLength=200,required=false,valuesRange="")   
     private String auxiliaryExaminationResults;
    /**
     *名称:治则治法代码
     *备注:根据辨证结果采用的治则治法名称术语
 	 *限制:GBT167513
 	 *
     */
     @Column(name="THERAPEUTIC_PRINCIPLES",length = 10,nullable = true)
     @FhirFieldValidate(name="THERAPEUTIC_PRINCIPLES",displayName="治则治法代码",maxLength=10,required=false,valuesRange="GBT167513")   
     private String therapeuticPrinciples;
    /**
     *名称:诊疗过程名称
     *
 	 *
 	 *
     */
     @Column(name="TREAT_COURSE_NAME",length = 200,nullable = true)
     @FhirFieldValidate(name="TREAT_COURSE_NAME",displayName="诊疗过程名称",maxLength=200,required=false,valuesRange="")   
     private String treatCourseName;
    /**
     *名称:会诊目的
     *
 	 *
 	 *
     */
     @Column(name="CONSULTATION_PURPOSES",length = 200,nullable = true)
     @FhirFieldValidate(name="CONSULTATION_PURPOSES",displayName="会诊目的",maxLength=200,required=false,valuesRange="")   
     private String consultationPurposes;
    /**
     *名称:会诊类型
     *
 	 *
 	 *
     */
     @Column(name="CONSULTATION_TYPE",length = 200,nullable = true)
     @FhirFieldValidate(name="CONSULTATION_TYPE",displayName="会诊类型",maxLength=200,required=false,valuesRange="")   
     private String consultationType;
    /**
     *名称:会诊原因
     *
 	 *
 	 *
     */
     @Column(name="CONSULTATION_REASON",length = 200,nullable = true)
     @FhirFieldValidate(name="CONSULTATION_REASON",displayName="会诊原因",maxLength=200,required=false,valuesRange="")   
     private String consultationReason;
    /**
     *名称:会诊意见
     *
 	 *
 	 *
     */
     @Column(name="CONSULTATION_OPINION",length = 100,nullable = true)
     @FhirFieldValidate(name="CONSULTATION_OPINION",displayName="会诊意见",maxLength=100,required=false,valuesRange="")   
     private String consultationOpinion;
    /**
     *名称:诊疗过程描述
     *
 	 *
 	 *
     */
     @Column(name="TREAT_RESCUE_COURSE",length = 500,nullable = true)
     @FhirFieldValidate(name="TREAT_RESCUE_COURSE",displayName="诊疗过程描述",maxLength=500,required=false,valuesRange="")   
     private String treatRescueCourse;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getHcrConsultationNoteId(){
       	return this.hcrConsultationNoteId;
     }
     public void setHcrConsultationNoteId(String hcrConsultationNoteId){
       	this.hcrConsultationNoteId=hcrConsultationNoteId;
     }
     public String getConsultationRequestDeptId(){
       	return this.consultationRequestDeptId;
     }
     public void setConsultationRequestDeptId(String consultationRequestDeptId){
       	this.consultationRequestDeptId=consultationRequestDeptId;
     }
     public String getConsultationRequestDeptName(){
       	return this.consultationRequestDeptName;
     }
     public void setConsultationRequestDeptName(String consultationRequestDeptName){
       	this.consultationRequestDeptName=consultationRequestDeptName;
     }
     public String getConsultationRequestDeptCd(){
       	return this.consultationRequestDeptCd;
     }
     public void setConsultationRequestDeptCd(String consultationRequestDeptCd){
       	this.consultationRequestDeptCd=consultationRequestDeptCd;
     }
     public String getConsultationDeptId(){
       	return this.consultationDeptId;
     }
     public void setConsultationDeptId(String consultationDeptId){
       	this.consultationDeptId=consultationDeptId;
     }
     public String getConsultationDeptName(){
       	return this.consultationDeptName;
     }
     public void setConsultationDeptName(String consultationDeptName){
       	this.consultationDeptName=consultationDeptName;
     }
     public String getConsultationDeptCd(){
       	return this.consultationDeptCd;
     }
     public void setConsultationDeptCd(String consultationDeptCd){
       	this.consultationDeptCd=consultationDeptCd;
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
     public String getRelationship(){
       	return this.relationship;
     }
     public void setRelationship(String relationship){
       	this.relationship=relationship;
     }
     public String getContactsName(){
       	return this.contactsName;
     }
     public void setContactsName(String contactsName){
       	this.contactsName=contactsName;
     }
     public String getContactsPhone(){
       	return this.contactsPhone;
     }
     public void setContactsPhone(String contactsPhone){
       	this.contactsPhone=contactsPhone;
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
     public Boolean getIfRritability(){
       	return this.ifRritability;
     }
     public void setIfRritability(Boolean ifRritability){
       	this.ifRritability=ifRritability;
     }
     public String getRritability(){
       	return this.rritability;
     }
     public void setRritability(String rritability){
       	this.rritability=rritability;
     }
     public String getConsultationRequestDoctorId(){
       	return this.consultationRequestDoctorId;
     }
     public void setConsultationRequestDoctorId(String consultationRequestDoctorId){
       	this.consultationRequestDoctorId=consultationRequestDoctorId;
     }
     public String getConsultationRequestDoctorName(){
       	return this.consultationRequestDoctorName;
     }
     public void setConsultationRequestDoctorName(String consultationRequestDoctorName){
       	this.consultationRequestDoctorName=consultationRequestDoctorName;
     }
     public String getConsultationDoctorId(){
       	return this.consultationDoctorId;
     }
     public void setConsultationDoctorId(String consultationDoctorId){
       	this.consultationDoctorId=consultationDoctorId;
     }
     public String getConsultationDoctorName(){
       	return this.consultationDoctorName;
     }
     public void setConsultationDoctorName(String consultationDoctorName){
       	this.consultationDoctorName=consultationDoctorName;
     }
     public Date getConsultationDate(){
       	return this.consultationDate;
     }
     public void setConsultationDate(Date consultationDate){
       	this.consultationDate=consultationDate;
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
     public Date getStart(){
       	return this.start;
     }
     public void setStart(Date start){
       	this.start=start;
     }
     public String getCnFourResult(){
       	return this.cnFourResult;
     }
     public void setCnFourResult(String cnFourResult){
       	this.cnFourResult=cnFourResult;
     }
     public String getCaseAbstract(){
       	return this.caseAbstract;
     }
     public void setCaseAbstract(String caseAbstract){
       	this.caseAbstract=caseAbstract;
     }
     public String getCnSymDiagCode(){
       	return this.cnSymDiagCode;
     }
     public void setCnSymDiagCode(String cnSymDiagCode){
       	this.cnSymDiagCode=cnSymDiagCode;
     }
     public String getCnDisDiagCode(){
       	return this.cnDisDiagCode;
     }
     public void setCnDisDiagCode(String cnDisDiagCode){
       	this.cnDisDiagCode=cnDisDiagCode;
     }
     public String getDiagCode(){
       	return this.diagCode;
     }
     public void setDiagCode(String diagCode){
       	this.diagCode=diagCode;
     }
     public String getDiagName(){
       	return this.diagName;
     }
     public void setDiagName(String diagName){
       	this.diagName=diagName;
     }
     public Date getDiagDate(){
       	return this.diagDate;
     }
     public void setDiagDate(Date diagDate){
       	this.diagDate=diagDate;
     }
     public String getAuxiliaryExaminationResults(){
       	return this.auxiliaryExaminationResults;
     }
     public void setAuxiliaryExaminationResults(String auxiliaryExaminationResults){
       	this.auxiliaryExaminationResults=auxiliaryExaminationResults;
     }
     public String getTherapeuticPrinciples(){
       	return this.therapeuticPrinciples;
     }
     public void setTherapeuticPrinciples(String therapeuticPrinciples){
       	this.therapeuticPrinciples=therapeuticPrinciples;
     }
     public String getTreatCourseName(){
       	return this.treatCourseName;
     }
     public void setTreatCourseName(String treatCourseName){
       	this.treatCourseName=treatCourseName;
     }
     public String getConsultationPurposes(){
       	return this.consultationPurposes;
     }
     public void setConsultationPurposes(String consultationPurposes){
       	this.consultationPurposes=consultationPurposes;
     }
     public String getConsultationType(){
       	return this.consultationType;
     }
     public void setConsultationType(String consultationType){
       	this.consultationType=consultationType;
     }
     public String getConsultationReason(){
       	return this.consultationReason;
     }
     public void setConsultationReason(String consultationReason){
       	this.consultationReason=consultationReason;
     }
     public String getConsultationOpinion(){
       	return this.consultationOpinion;
     }
     public void setConsultationOpinion(String consultationOpinion){
       	this.consultationOpinion=consultationOpinion;
     }
     public String getTreatRescueCourse(){
       	return this.treatRescueCourse;
     }
     public void setTreatRescueCourse(String treatRescueCourse){
       	this.treatRescueCourse=treatRescueCourse;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}