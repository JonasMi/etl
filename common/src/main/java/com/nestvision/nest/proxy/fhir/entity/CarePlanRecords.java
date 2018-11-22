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
@Table(name = BaseEntity.TABLE_PREFIX + "CARE_PLAN_RECORDS")
public class CarePlanRecords extends FhirResourceEntity {

    /**
     *名称:院内护理计划id
     *
 	 *
 	 *主键字段
     */
     @Column(name="CARE_PLAN_RECORDS_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="CARE_PLAN_RECORDS_ID",displayName="院内护理计划id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String carePlanRecordsId;
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
     *名称:主诉
     *
 	 *
 	 *
     */
     @Column(name="CHIEF",columnDefinition="text")
     @FhirFieldValidate(name="CHIEF",displayName="主诉",required=false,valuesRange="")   
     private String chief;
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
     *名称:护理等级代码
     *
 	 *限制:CV9900330
 	 *
     */
     @Column(name="NURSING_TYPE",length = 20,nullable = true)
     @FhirFieldValidate(name="NURSING_TYPE",displayName="护理等级代码",maxLength=20,required=false,valuesRange="CV9900330")   
     private String nursingType;
    /**
     *名称:护理类型代码
     *
 	 *限制:CV9900331
 	 *
     */
     @Column(name="NURSING_GRADE",length = 20,nullable = true)
     @FhirFieldValidate(name="NURSING_GRADE",displayName="护理类型代码",maxLength=20,required=false,valuesRange="CV9900331")   
     private String nursingGrade;
    /**
     *名称:护理问题
     *
 	 *
 	 *
     */
     @Column(name="NURSING_PROBLEM",length = 200,nullable = true)
     @FhirFieldValidate(name="NURSING_PROBLEM",displayName="护理问题",maxLength=200,required=false,valuesRange="")   
     private String nursingProblem;
    /**
     *名称:护理操作名称
     *
 	 *
 	 *
     */
     @Column(name="NURSING_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="NURSING_NAME",displayName="护理操作名称",maxLength=40,required=false,valuesRange="")   
     private String nursingName;
    /**
     *名称:护理操作项目类目名称
     *
 	 *
 	 *
     */
     @Column(name="NURSING_ITEM_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="NURSING_ITEM_NAME",displayName="护理操作项目类目名称",maxLength=40,required=false,valuesRange="")   
     private String nursingItemName;
    /**
     *名称:护理操作结果描述
     *
 	 *
 	 *
     */
     @Column(name="NURSING_RESULT_DESCRIPTION",length = 200,nullable = true)
     @FhirFieldValidate(name="NURSING_RESULT_DESCRIPTION",displayName="护理操作结果描述",maxLength=200,required=false,valuesRange="")   
     private String nursingResultDescription;
    /**
     *名称:导管护理
     *
 	 *
 	 *
     */
     @Column(name="CATHETER_CARE_DESCRIPTION",length = 200,nullable = true)
     @FhirFieldValidate(name="CATHETER_CARE_DESCRIPTION",displayName="导管护理",maxLength=200,required=false,valuesRange="")   
     private String catheterCareDescription;
    /**
     *名称:体位护理
     *
 	 *
 	 *
     */
     @Column(name="POSITION_NURSE_DESCRIPTION",length = 200,nullable = true)
     @FhirFieldValidate(name="POSITION_NURSE_DESCRIPTION",displayName="体位护理",maxLength=200,required=false,valuesRange="")   
     private String positionNurseDescription;
    /**
     *名称:皮肤护理
     *
 	 *
 	 *
     */
     @Column(name="SKIN_NURSE_DESCRIPTION",length = 200,nullable = true)
     @FhirFieldValidate(name="SKIN_NURSE_DESCRIPTION",displayName="皮肤护理",maxLength=200,required=false,valuesRange="")   
     private String skinNurseDescription;
    /**
     *名称:气管护理代码
     *
 	 *限制:CV9900332
 	 *
     */
     @Column(name="TRACHEA_NURSE_DESCRIPTION",length = 20,nullable = true)
     @FhirFieldValidate(name="TRACHEA_NURSE_DESCRIPTION",displayName="气管护理代码",maxLength=20,required=false,valuesRange="CV9900332")   
     private String tracheaNurseDescription;
    /**
     *名称:安全护理代码
     *
 	 *限制:CV9900335
 	 *
     */
     @Column(name="SECURITY_NURSE_DESCRIPTION",length = 20,nullable = true)
     @FhirFieldValidate(name="SECURITY_NURSE_DESCRIPTION",displayName="安全护理代码",maxLength=20,required=false,valuesRange="CV9900335")   
     private String securityNurseDescription;
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
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getCarePlanRecordsId(){
       	return this.carePlanRecordsId;
     }
     public void setCarePlanRecordsId(String carePlanRecordsId){
       	this.carePlanRecordsId=carePlanRecordsId;
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
     public String getChief(){
       	return this.chief;
     }
     public void setChief(String chief){
       	this.chief=chief;
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
     public String getNursingType(){
       	return this.nursingType;
     }
     public void setNursingType(String nursingType){
       	this.nursingType=nursingType;
     }
     public String getNursingGrade(){
       	return this.nursingGrade;
     }
     public void setNursingGrade(String nursingGrade){
       	this.nursingGrade=nursingGrade;
     }
     public String getNursingProblem(){
       	return this.nursingProblem;
     }
     public void setNursingProblem(String nursingProblem){
       	this.nursingProblem=nursingProblem;
     }
     public String getNursingName(){
       	return this.nursingName;
     }
     public void setNursingName(String nursingName){
       	this.nursingName=nursingName;
     }
     public String getNursingItemName(){
       	return this.nursingItemName;
     }
     public void setNursingItemName(String nursingItemName){
       	this.nursingItemName=nursingItemName;
     }
     public String getNursingResultDescription(){
       	return this.nursingResultDescription;
     }
     public void setNursingResultDescription(String nursingResultDescription){
       	this.nursingResultDescription=nursingResultDescription;
     }
     public String getCatheterCareDescription(){
       	return this.catheterCareDescription;
     }
     public void setCatheterCareDescription(String catheterCareDescription){
       	this.catheterCareDescription=catheterCareDescription;
     }
     public String getPositionNurseDescription(){
       	return this.positionNurseDescription;
     }
     public void setPositionNurseDescription(String positionNurseDescription){
       	this.positionNurseDescription=positionNurseDescription;
     }
     public String getSkinNurseDescription(){
       	return this.skinNurseDescription;
     }
     public void setSkinNurseDescription(String skinNurseDescription){
       	this.skinNurseDescription=skinNurseDescription;
     }
     public String getTracheaNurseDescription(){
       	return this.tracheaNurseDescription;
     }
     public void setTracheaNurseDescription(String tracheaNurseDescription){
       	this.tracheaNurseDescription=tracheaNurseDescription;
     }
     public String getSecurityNurseDescription(){
       	return this.securityNurseDescription;
     }
     public void setSecurityNurseDescription(String securityNurseDescription){
       	this.securityNurseDescription=securityNurseDescription;
     }
     public String getDietGuide(){
       	return this.dietGuide;
     }
     public void setDietGuide(String dietGuide){
       	this.dietGuide=dietGuide;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}