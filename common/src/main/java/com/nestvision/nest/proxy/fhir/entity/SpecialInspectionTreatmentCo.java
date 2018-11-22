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
@Table(name = BaseEntity.TABLE_PREFIX + "SPECIAL_INSPECTION_TREATMENT_CO")
public class SpecialInspectionTreatmentCo extends FhirResourceEntity {

    /**
     *名称:院内特殊检查及特殊治疗同意书id
     *
 	 *
 	 *主键字段
     */
     @Column(name="SPECIAL_INSPECTION_TREATMENT_CONSENT_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="SPECIAL_INSPECTION_TREATMENT_CONSENT_ID",displayName="院内特殊检查及特殊治疗同意书id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String specialInspectionTreatmentConsentId;
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
     *名称:电话号码
     *
 	 *
 	 *
     */
     @Column(name="TELECOM",length = 20,nullable = true)
     @FhirFieldValidate(name="TELECOM",displayName="电话号码",maxLength=20,required=false,valuesRange="")   
     private String telecom;
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
     *名称:门诊或住院标识
     *
 	 *限制:CUS00010
 	 *
     */
     @Column(name="VISIT_MARK",length = 10,nullable = false)
     @FhirFieldValidate(name="VISIT_MARK",displayName="门诊或住院标识",maxLength=10,required=true,valuesRange="CUS00010")   
     private String visitMark;
    /**
     *名称:就诊流水号
     *
 	 *
 	 *
     */
     @Column(name="REGISTRATION_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="REGISTRATION_ID",displayName="就诊流水号",maxLength=40,required=true,valuesRange="")   
     private String registrationId;
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
     *名称:就诊时间
     *
 	 *
 	 *
     */
     @Column(name="VISITING_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="VISITING_TIME",displayName="就诊时间",required=false,valuesRange="")   
     private Date visitingTime;
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
     *名称:中医"四诊"观察结果
     *
 	 *
 	 *
     */
     @Column(name="CN_FOUR_RESULT",length = 200,nullable = true)
     @FhirFieldValidate(name="CN_FOUR_RESULT",displayName="中医&quot;四诊&quot;观察结果",maxLength=200,required=false,valuesRange="")   
     private String cnFourResult;
    /**
     *名称:就诊类型
     *
 	 *限制:CV9900340
 	 *
     */
     @Column(name="VISITING_TYPE",length = 20,nullable = true)
     @FhirFieldValidate(name="VISITING_TYPE",displayName="就诊类型",maxLength=20,required=false,valuesRange="CV9900340")   
     private String visitingType;
    /**
     *名称:主诉
     *
 	 *
 	 *
     */
     @Column(name="CHIEF",columnDefinition="text")
     @FhirFieldValidate(name="CHIEF",displayName="主诉",required=false,valuesRange="")   
     private String chief;
    /**
     *名称:患者签名日期时间
     *
 	 *
 	 *
     */
     @Column(name="PATIENT_AGENT_SIGN_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="PATIENT_AGENT_SIGN_DATE",displayName="患者签名日期时间",required=false,valuesRange="")   
     private Date patientAgentSignDate;
    /**
     *名称:法定代理人签名日期时间
     *
 	 *
 	 *
     */
     @Column(name="AGENT_SIGN_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="AGENT_SIGN_DATE",displayName="法定代理人签名日期时间",required=false,valuesRange="")   
     private Date agentSignDate;
    /**
     *名称:备注
     *
 	 *
 	 *
     */
     @Column(name="REMARKS",length = 40,nullable = true)
     @FhirFieldValidate(name="REMARKS",displayName="备注",maxLength=40,required=false,valuesRange="")   
     private String remarks;
    /**
     *名称:经治医师id
     *
 	 *
 	 *
     */
     @Column(name="CERTIFIED_PHYSICIAN_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="CERTIFIED_PHYSICIAN_ID",displayName="经治医师id",maxLength=40,required=false,valuesRange="")   
     private String certifiedPhysicianId;
    /**
     *名称:经治医师姓名
     *
 	 *
 	 *
     */
     @Column(name="CERTIFIED_PHYSICIAN_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="CERTIFIED_PHYSICIAN_NAME",displayName="经治医师姓名",maxLength=40,required=false,valuesRange="")   
     private String certifiedPhysicianName;
    /**
     *名称:经治医师签名日期
     *
 	 *
 	 *
     */
     @Column(name="CERTIFIED_PHYSICIAN_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="CERTIFIED_PHYSICIAN_DATE",displayName="经治医师签名日期",required=false,valuesRange="")   
     private Date certifiedPhysicianDate;
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
     *名称:特殊检查及特殊治疗项目名称
     *
 	 *
 	 *
     */
     @Column(name="SPECIAL_INSPECTION_TREATMENT_NAME",length = 200,nullable = true)
     @FhirFieldValidate(name="SPECIAL_INSPECTION_TREATMENT_NAME",displayName="特殊检查及特殊治疗项目名称",maxLength=200,required=false,valuesRange="")   
     private String specialInspectionTreatmentName;
    /**
     *名称:特殊检查及特殊治疗目的
     *
 	 *
 	 *
     */
     @Column(name="SPECIAL_INSPECTION_TREATMENT_PURPOSES",length = 200,nullable = true)
     @FhirFieldValidate(name="SPECIAL_INSPECTION_TREATMENT_PURPOSES",displayName="特殊检查及特殊治疗目的",maxLength=200,required=false,valuesRange="")   
     private String specialInspectionTreatmentPurposes;
    /**
     *名称:替代方案
     *
 	 *
 	 *
     */
     @Column(name="ALTERNATIVE_SOLUTION",length = 1000,nullable = true)
     @FhirFieldValidate(name="ALTERNATIVE_SOLUTION",displayName="替代方案",maxLength=1000,required=false,valuesRange="")   
     private String alternativeSolution;
    /**
     *名称:医疗机构的意见
     *
 	 *
 	 *
     */
     @Column(name="HOSPITAL_ADVICE",length = 200,nullable = true)
     @FhirFieldValidate(name="HOSPITAL_ADVICE",displayName="医疗机构的意见",maxLength=200,required=false,valuesRange="")   
     private String hospitalAdvice;
    /**
     *名称:患者的意见
     *
 	 *
 	 *
     */
     @Column(name="PATIENT_ADVICE",length = 200,nullable = true)
     @FhirFieldValidate(name="PATIENT_ADVICE",displayName="患者的意见",maxLength=200,required=false,valuesRange="")   
     private String patientAdvice;
    /**
     *名称:特殊检查及特殊治疗可能引起的并发症及风险
     *
 	 *
 	 *
     */
     @Column(name="SPECIAL_POSSIBLE_ACCIDENT",length = 200,nullable = true)
     @FhirFieldValidate(name="SPECIAL_POSSIBLE_ACCIDENT",displayName="特殊检查及特殊治疗可能引起的并发症及风险",maxLength=200,required=false,valuesRange="")   
     private String specialPossibleAccident;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getSpecialInspectionTreatmentConsentId(){
       	return this.specialInspectionTreatmentConsentId;
     }
     public void setSpecialInspectionTreatmentConsentId(String specialInspectionTreatmentConsentId){
       	this.specialInspectionTreatmentConsentId=specialInspectionTreatmentConsentId;
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
     public String getTelecom(){
       	return this.telecom;
     }
     public void setTelecom(String telecom){
       	this.telecom=telecom;
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
     public Date getVisitingTime(){
       	return this.visitingTime;
     }
     public void setVisitingTime(Date visitingTime){
       	this.visitingTime=visitingTime;
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
     public String getCnFourResult(){
       	return this.cnFourResult;
     }
     public void setCnFourResult(String cnFourResult){
       	this.cnFourResult=cnFourResult;
     }
     public String getVisitingType(){
       	return this.visitingType;
     }
     public void setVisitingType(String visitingType){
       	this.visitingType=visitingType;
     }
     public String getChief(){
       	return this.chief;
     }
     public void setChief(String chief){
       	this.chief=chief;
     }
     public Date getPatientAgentSignDate(){
       	return this.patientAgentSignDate;
     }
     public void setPatientAgentSignDate(Date patientAgentSignDate){
       	this.patientAgentSignDate=patientAgentSignDate;
     }
     public Date getAgentSignDate(){
       	return this.agentSignDate;
     }
     public void setAgentSignDate(Date agentSignDate){
       	this.agentSignDate=agentSignDate;
     }
     public String getRemarks(){
       	return this.remarks;
     }
     public void setRemarks(String remarks){
       	this.remarks=remarks;
     }
     public String getCertifiedPhysicianId(){
       	return this.certifiedPhysicianId;
     }
     public void setCertifiedPhysicianId(String certifiedPhysicianId){
       	this.certifiedPhysicianId=certifiedPhysicianId;
     }
     public String getCertifiedPhysicianName(){
       	return this.certifiedPhysicianName;
     }
     public void setCertifiedPhysicianName(String certifiedPhysicianName){
       	this.certifiedPhysicianName=certifiedPhysicianName;
     }
     public Date getCertifiedPhysicianDate(){
       	return this.certifiedPhysicianDate;
     }
     public void setCertifiedPhysicianDate(Date certifiedPhysicianDate){
       	this.certifiedPhysicianDate=certifiedPhysicianDate;
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
     public String getSpecialInspectionTreatmentName(){
       	return this.specialInspectionTreatmentName;
     }
     public void setSpecialInspectionTreatmentName(String specialInspectionTreatmentName){
       	this.specialInspectionTreatmentName=specialInspectionTreatmentName;
     }
     public String getSpecialInspectionTreatmentPurposes(){
       	return this.specialInspectionTreatmentPurposes;
     }
     public void setSpecialInspectionTreatmentPurposes(String specialInspectionTreatmentPurposes){
       	this.specialInspectionTreatmentPurposes=specialInspectionTreatmentPurposes;
     }
     public String getAlternativeSolution(){
       	return this.alternativeSolution;
     }
     public void setAlternativeSolution(String alternativeSolution){
       	this.alternativeSolution=alternativeSolution;
     }
     public String getHospitalAdvice(){
       	return this.hospitalAdvice;
     }
     public void setHospitalAdvice(String hospitalAdvice){
       	this.hospitalAdvice=hospitalAdvice;
     }
     public String getPatientAdvice(){
       	return this.patientAdvice;
     }
     public void setPatientAdvice(String patientAdvice){
       	this.patientAdvice=patientAdvice;
     }
     public String getSpecialPossibleAccident(){
       	return this.specialPossibleAccident;
     }
     public void setSpecialPossibleAccident(String specialPossibleAccident){
       	this.specialPossibleAccident=specialPossibleAccident;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}