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
@Table(name = BaseEntity.TABLE_PREFIX + "DISCHARGE_ASSESSMENT_GUIDANCE")
public class DischargeAssessmentGuidance extends FhirResourceEntity {

    /**
     *名称:院内出院评估与指导id
     *
 	 *
 	 *主键字段
     */
     @Column(name="DISCHARGE_ASSESSMENT_GUIDANCE_RECORDS_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="DISCHARGE_ASSESSMENT_GUIDANCE_RECORDS_ID",displayName="院内出院评估与指导id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String dischargeAssessmentGuidanceRecordsId;
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
     *名称:年龄
     *
 	 *
 	 *
     */
     @Column(name="AGE",length = 8,nullable = true)
     @FhirFieldValidate(name="AGE",displayName="年龄",maxLength=8,required=false,valuesRange="")   
     private Float age;
    /**
     *名称:民族代码
     *
 	 *限制:CV9900377
 	 *
     */
     @Column(name="NATION_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="NATION_CD",displayName="民族代码",maxLength=20,required=false,valuesRange="CV9900377")   
     private String nationCd;
    /**
     *名称:职业代码
     *
 	 *限制:GBT22614
 	 *
     */
     @Column(name="OCCUPATION_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="OCCUPATION_CD",displayName="职业代码",maxLength=20,required=false,valuesRange="GBT22614")   
     private String occupationCd;
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
     @Column(name="START_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="START_TIME",displayName="入院时间",required=false,valuesRange="")   
     private Date startTime;
    /**
     *名称:出院时间
     *
 	 *
 	 *
     */
     @Column(name="END_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="END_TIME",displayName="出院时间",required=false,valuesRange="")   
     private Date endTime;
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
     *名称:就诊科室标准编码
     *
 	 *限制:CV9900051
 	 *
     */
     @Column(name="VISITING_DEPT_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="VISITING_DEPT_CD",displayName="就诊科室标准编码",maxLength=20,required=false,valuesRange="CV9900051")   
     private String visitingDeptCd;
    /**
     *名称:接诊护士id
     *
 	 *
 	 *
     */
     @Column(name="TREATMENT_NURSE_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="TREATMENT_NURSE_ID",displayName="接诊护士id",maxLength=40,required=false,valuesRange="")   
     private String treatmentNurseId;
    /**
     *名称:接诊护士姓名
     *
 	 *
 	 *
     */
     @Column(name="TREATMENT_NURSE_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="TREATMENT_NURSE_NAME",displayName="接诊护士姓名",maxLength=40,required=false,valuesRange="")   
     private String treatmentNurseName;
    /**
     *名称:接诊护士专业技术职务代码
     *
 	 *限制:CV9900374
 	 *
     */
     @Column(name="TREATMENT_NURSE_POST_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="TREATMENT_NURSE_POST_CD",displayName="接诊护士专业技术职务代码",maxLength=20,required=false,valuesRange="CV9900374")   
     private String treatmentNursePostCd;
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
     *名称:病案号
     *
 	 *
 	 *
     */
     @Column(name="CASE_NO",length = 40,nullable = true)
     @FhirFieldValidate(name="CASE_NO",displayName="病案号",maxLength=40,required=false,valuesRange="")   
     private String caseNo;
    /**
     *名称:住院次数
     *
 	 *
 	 *
     */
     @Column(name="INPAT_TIMES",length = 3,nullable = true)
     @FhirFieldValidate(name="INPAT_TIMES",displayName="住院次数",maxLength=3,required=false,valuesRange="")   
     private Integer inpatTimes;
    /**
     *名称:备注
     *
 	 *
 	 *
     */
     @Column(name="REMARKS",columnDefinition="text")
     @FhirFieldValidate(name="REMARKS",displayName="备注",required=false,valuesRange="")   
     private String remarks;
    /**
     *名称:文档管理者id
     *
 	 *
 	 *
     */
     @Column(name="DOCUMENT_MANAGER_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="DOCUMENT_MANAGER_ID",displayName="文档管理者id",maxLength=40,required=false,valuesRange="")   
     private String documentManagerId;
    /**
     *名称:文档管理者姓名
     *
 	 *
 	 *
     */
     @Column(name="DOCUMENT_MANAGER_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="DOCUMENT_MANAGER_NAME",displayName="文档管理者姓名",maxLength=40,required=false,valuesRange="")   
     private String documentManagerName;
    /**
     *名称:文档管理者签名日期
     *
 	 *
 	 *
     */
     @Column(name="DOCUMENT_MANAGER_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DOCUMENT_MANAGER_DATE",displayName="文档管理者签名日期",required=false,valuesRange="")   
     private Date documentManagerDate;
    /**
     *名称:文档审核者签名日期
     *
 	 *
 	 *
     */
     @Column(name="DOCUMENT_VERIFIER_SIGN_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DOCUMENT_VERIFIER_SIGN_DATE",displayName="文档审核者签名日期",required=false,valuesRange="")   
     private Date documentVerifierSignDate;
    /**
     *名称:文档审核者id
     *
 	 *
 	 *
     */
     @Column(name="DOCUMENT_VERIFIER_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="DOCUMENT_VERIFIER_ID",displayName="文档审核者id",maxLength=40,required=false,valuesRange="")   
     private String documentVerifierId;
    /**
     *名称:文档审核者姓名
     *
 	 *
 	 *
     */
     @Column(name="DOCUMENT_VERIFIER_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="DOCUMENT_VERIFIER_NAME",displayName="文档审核者姓名",maxLength=20,required=false,valuesRange="")   
     private String documentVerifierName;
    /**
     *名称:责任护士id
     *
 	 *
 	 *
     */
     @Column(name="RESPONSIBILITY_NURSE_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="RESPONSIBILITY_NURSE_ID",displayName="责任护士id",maxLength=40,required=false,valuesRange="")   
     private String responsibilityNurseId;
    /**
     *名称:责任护士姓名
     *
 	 *
 	 *
     */
     @Column(name="RESPONSIBILITY_NURSE_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="RESPONSIBILITY_NURSE_NAME",displayName="责任护士姓名",maxLength=40,required=false,valuesRange="")   
     private String responsibilityNurseName;
    /**
     *名称:责任护士签名日期
     *
 	 *
 	 *
     */
     @Column(name="RESPONSIBILITY_NURSE_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="RESPONSIBILITY_NURSE_DATE",displayName="责任护士签名日期",required=false,valuesRange="")   
     private Date responsibilityNurseDate;
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
     *名称:出院情况
     *
 	 *
 	 *
     */
     @Column(name="OUTPATIENT_DETAILS",length = 200,nullable = true)
     @FhirFieldValidate(name="OUTPATIENT_DETAILS",displayName="出院情况",maxLength=200,required=false,valuesRange="")   
     private String outpatientDetails;
    /**
     *名称:离院方式
     *
 	 *限制:CV0600226
 	 *
     */
     @Column(name="OUT_MODE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="OUT_MODE_CODE",displayName="离院方式",maxLength=20,required=false,valuesRange="CV0600226")   
     private String outModeCode;
    /**
     *名称:饮食指导代码
     *
 	 *限制:CV9900333
 	 *
     */
     @Column(name="DIET_GUIDE",length = 20,nullable = true)
     @FhirFieldValidate(name="DIET_GUIDE",displayName="饮食指导代码",maxLength=20,required=false,valuesRange="CV9900333")   
     private String dietGuide;
    /**
     *名称:生活方式指导
     *
 	 *
 	 *
     */
     @Column(name="LIFESTYLE_GUIDANCE",length = 1000,nullable = true)
     @FhirFieldValidate(name="LIFESTYLE_GUIDANCE",displayName="生活方式指导",maxLength=1000,required=false,valuesRange="")   
     private String lifestyleGuidance;
    /**
     *名称:宣教内容
     *
 	 *
 	 *
     */
     @Column(name="PROPAGANDA_CONTENT",length = 1000,nullable = true)
     @FhirFieldValidate(name="PROPAGANDA_CONTENT",displayName="宣教内容",maxLength=1000,required=false,valuesRange="")   
     private String propagandaContent;
    /**
     *名称:复诊指导
     *
 	 *
 	 *
     */
     @Column(name="VISIT_THE_GUIDE",length = 200,nullable = true)
     @FhirFieldValidate(name="VISIT_THE_GUIDE",displayName="复诊指导",maxLength=200,required=false,valuesRange="")   
     private String visitTheGuide;
    /**
     *名称:用药指导
     *
 	 *
 	 *
     */
     @Column(name="MEDICATION_GUIDE",length = 200,nullable = true)
     @FhirFieldValidate(name="MEDICATION_GUIDE",displayName="用药指导",maxLength=200,required=false,valuesRange="")   
     private String medicationGuide;
    /**
     *名称:自理能力代码
     *
 	 *限制:CV9900339
 	 *
     */
     @Column(name="OF_DAILY",length = 20,nullable = true)
     @FhirFieldValidate(name="OF_DAILY",displayName="自理能力代码",maxLength=20,required=false,valuesRange="CV9900339")   
     private String ofDaily;
    /**
     *名称:饮食情况代码
     *
 	 *限制:CV9900003
 	 *
     */
     @Column(name="DIETARY_STATUS",length = 20,nullable = true)
     @FhirFieldValidate(name="DIETARY_STATUS",displayName="饮食情况代码",maxLength=20,required=false,valuesRange="CV9900003")   
     private String dietaryStatus;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getDischargeAssessmentGuidanceRecordsId(){
       	return this.dischargeAssessmentGuidanceRecordsId;
     }
     public void setDischargeAssessmentGuidanceRecordsId(String dischargeAssessmentGuidanceRecordsId){
       	this.dischargeAssessmentGuidanceRecordsId=dischargeAssessmentGuidanceRecordsId;
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
     public Date getBirthdate(){
       	return this.birthdate;
     }
     public void setBirthdate(Date birthdate){
       	this.birthdate=birthdate;
     }
     public Float getAge(){
       	return this.age;
     }
     public void setAge(Float age){
       	this.age=age;
     }
     public String getNationCd(){
       	return this.nationCd;
     }
     public void setNationCd(String nationCd){
       	this.nationCd=nationCd;
     }
     public String getOccupationCd(){
       	return this.occupationCd;
     }
     public void setOccupationCd(String occupationCd){
       	this.occupationCd=occupationCd;
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
     public String getInpatientRegistrationId(){
       	return this.inpatientRegistrationId;
     }
     public void setInpatientRegistrationId(String inpatientRegistrationId){
       	this.inpatientRegistrationId=inpatientRegistrationId;
     }
     public Date getStartTime(){
       	return this.startTime;
     }
     public void setStartTime(Date startTime){
       	this.startTime=startTime;
     }
     public Date getEndTime(){
       	return this.endTime;
     }
     public void setEndTime(Date endTime){
       	this.endTime=endTime;
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
     public String getVisitingDeptCd(){
       	return this.visitingDeptCd;
     }
     public void setVisitingDeptCd(String visitingDeptCd){
       	this.visitingDeptCd=visitingDeptCd;
     }
     public String getTreatmentNurseId(){
       	return this.treatmentNurseId;
     }
     public void setTreatmentNurseId(String treatmentNurseId){
       	this.treatmentNurseId=treatmentNurseId;
     }
     public String getTreatmentNurseName(){
       	return this.treatmentNurseName;
     }
     public void setTreatmentNurseName(String treatmentNurseName){
       	this.treatmentNurseName=treatmentNurseName;
     }
     public String getTreatmentNursePostCd(){
       	return this.treatmentNursePostCd;
     }
     public void setTreatmentNursePostCd(String treatmentNursePostCd){
       	this.treatmentNursePostCd=treatmentNursePostCd;
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
     public String getCaseNo(){
       	return this.caseNo;
     }
     public void setCaseNo(String caseNo){
       	this.caseNo=caseNo;
     }
     public Integer getInpatTimes(){
       	return this.inpatTimes;
     }
     public void setInpatTimes(Integer inpatTimes){
       	this.inpatTimes=inpatTimes;
     }
     public String getRemarks(){
       	return this.remarks;
     }
     public void setRemarks(String remarks){
       	this.remarks=remarks;
     }
     public String getDocumentManagerId(){
       	return this.documentManagerId;
     }
     public void setDocumentManagerId(String documentManagerId){
       	this.documentManagerId=documentManagerId;
     }
     public String getDocumentManagerName(){
       	return this.documentManagerName;
     }
     public void setDocumentManagerName(String documentManagerName){
       	this.documentManagerName=documentManagerName;
     }
     public Date getDocumentManagerDate(){
       	return this.documentManagerDate;
     }
     public void setDocumentManagerDate(Date documentManagerDate){
       	this.documentManagerDate=documentManagerDate;
     }
     public Date getDocumentVerifierSignDate(){
       	return this.documentVerifierSignDate;
     }
     public void setDocumentVerifierSignDate(Date documentVerifierSignDate){
       	this.documentVerifierSignDate=documentVerifierSignDate;
     }
     public String getDocumentVerifierId(){
       	return this.documentVerifierId;
     }
     public void setDocumentVerifierId(String documentVerifierId){
       	this.documentVerifierId=documentVerifierId;
     }
     public String getDocumentVerifierName(){
       	return this.documentVerifierName;
     }
     public void setDocumentVerifierName(String documentVerifierName){
       	this.documentVerifierName=documentVerifierName;
     }
     public String getResponsibilityNurseId(){
       	return this.responsibilityNurseId;
     }
     public void setResponsibilityNurseId(String responsibilityNurseId){
       	this.responsibilityNurseId=responsibilityNurseId;
     }
     public String getResponsibilityNurseName(){
       	return this.responsibilityNurseName;
     }
     public void setResponsibilityNurseName(String responsibilityNurseName){
       	this.responsibilityNurseName=responsibilityNurseName;
     }
     public Date getResponsibilityNurseDate(){
       	return this.responsibilityNurseDate;
     }
     public void setResponsibilityNurseDate(Date responsibilityNurseDate){
       	this.responsibilityNurseDate=responsibilityNurseDate;
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
     public String getOutpatientDetails(){
       	return this.outpatientDetails;
     }
     public void setOutpatientDetails(String outpatientDetails){
       	this.outpatientDetails=outpatientDetails;
     }
     public String getOutModeCode(){
       	return this.outModeCode;
     }
     public void setOutModeCode(String outModeCode){
       	this.outModeCode=outModeCode;
     }
     public String getDietGuide(){
       	return this.dietGuide;
     }
     public void setDietGuide(String dietGuide){
       	this.dietGuide=dietGuide;
     }
     public String getLifestyleGuidance(){
       	return this.lifestyleGuidance;
     }
     public void setLifestyleGuidance(String lifestyleGuidance){
       	this.lifestyleGuidance=lifestyleGuidance;
     }
     public String getPropagandaContent(){
       	return this.propagandaContent;
     }
     public void setPropagandaContent(String propagandaContent){
       	this.propagandaContent=propagandaContent;
     }
     public String getVisitTheGuide(){
       	return this.visitTheGuide;
     }
     public void setVisitTheGuide(String visitTheGuide){
       	this.visitTheGuide=visitTheGuide;
     }
     public String getMedicationGuide(){
       	return this.medicationGuide;
     }
     public void setMedicationGuide(String medicationGuide){
       	this.medicationGuide=medicationGuide;
     }
     public String getOfDaily(){
       	return this.ofDaily;
     }
     public void setOfDaily(String ofDaily){
       	this.ofDaily=ofDaily;
     }
     public String getDietaryStatus(){
       	return this.dietaryStatus;
     }
     public void setDietaryStatus(String dietaryStatus){
       	this.dietaryStatus=dietaryStatus;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}