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
@Table(name = BaseEntity.TABLE_PREFIX + "HCR_DEATH_CASE_DISCUSSION")
public class HcrDeathCaseDiscussion extends FhirResourceEntity {

    /**
     *名称:死亡病例讨论记录id
     *
 	 *
 	 *主键字段
     */
     @Column(name="HCR_DEATH_CASE_DISCUSSION_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="HCR_DEATH_CASE_DISCUSSION_ID",displayName="死亡病例讨论记录id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String hcrDeathCaseDiscussionId;
    /**
     *名称:讨论日期时间
     *
 	 *
 	 *
     */
     @Column(name="DISCUSSION_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DISCUSSION_DATE",displayName="讨论日期时间",required=false,valuesRange="")   
     private Date discussionDate;
    /**
     *名称:讨论地点
     *
 	 *
 	 *
     */
     @Column(name="DISCUSSION_SITES",length = 40,nullable = true)
     @FhirFieldValidate(name="DISCUSSION_SITES",displayName="讨论地点",maxLength=40,required=false,valuesRange="")   
     private String discussionSites;
    /**
     *名称:病案号
     *
 	 *
 	 *
     */
     @Column(name="CASE_NO",length = 20,nullable = true)
     @FhirFieldValidate(name="CASE_NO",displayName="病案号",maxLength=20,required=false,valuesRange="")   
     private String caseNo;
    /**
     *名称:住院次数
     *
 	 *
 	 *
     */
     @Column(name="INPAT_TIMES",length = 8,nullable = true)
     @FhirFieldValidate(name="INPAT_TIMES",displayName="住院次数",maxLength=8,required=false,valuesRange="")   
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
     *名称:患者年龄
     *
 	 *
 	 *
     */
     @Column(name="AGE",length = 8,nullable = true)
     @FhirFieldValidate(name="AGE",displayName="患者年龄",maxLength=8,required=false,valuesRange="")   
     private Float age;
    /**
     *名称:患者类型
     *
 	 *限制:CV0900404
 	 *
     */
     @Column(name="PATIENT_TYPE",length = 20,nullable = true)
     @FhirFieldValidate(name="PATIENT_TYPE",displayName="患者类型",maxLength=20,required=false,valuesRange="CV0900404")   
     private String patientType;
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
     *名称:讨论主持人id
     *
 	 *
 	 *
     */
     @Column(name="DISCUSSION_MODERATOR_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="DISCUSSION_MODERATOR_ID",displayName="讨论主持人id",maxLength=40,required=false,valuesRange="")   
     private String discussionModeratorId;
    /**
     *名称:讨论主持人姓名
     *
 	 *
 	 *
     */
     @Column(name="DISCUSSION_MODERATOR_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="DISCUSSION_MODERATOR_NAME",displayName="讨论主持人姓名",maxLength=20,required=false,valuesRange="")   
     private String discussionModeratorName;
    /**
     *名称:讨论主持人签名日期
     *
 	 *
 	 *
     */
     @Column(name="DISCUSSION_MODERATOR_SIGN_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DISCUSSION_MODERATOR_SIGN_DATE",displayName="讨论主持人签名日期",required=false,valuesRange="")   
     private Date discussionModeratorSignDate;
    /**
     *名称:讨论成员1id
     *
 	 *
 	 *
     */
     @Column(name="DISCUSSION_ONE_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="DISCUSSION_ONE_ID",displayName="讨论成员1id",maxLength=40,required=false,valuesRange="")   
     private String discussionOneId;
    /**
     *名称:讨论成员1姓名
     *
 	 *
 	 *
     */
     @Column(name="DISCUSSION_ONE_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="DISCUSSION_ONE_NAME",displayName="讨论成员1姓名",maxLength=20,required=false,valuesRange="")   
     private String discussionOneName;
    /**
     *名称:讨论成员1签名日期
     *
 	 *
 	 *
     */
     @Column(name="DISCUSSION_ONE_SIGN_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DISCUSSION_ONE_SIGN_DATE",displayName="讨论成员1签名日期",required=false,valuesRange="")   
     private Date discussionOneSignDate;
    /**
     *名称:讨论成员2id
     *
 	 *
 	 *
     */
     @Column(name="DISCUSSION_TWO_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="DISCUSSION_TWO_ID",displayName="讨论成员2id",maxLength=40,required=false,valuesRange="")   
     private String discussionTwoId;
    /**
     *名称:讨论成员2姓名
     *
 	 *
 	 *
     */
     @Column(name="DISCUSSION_TWO_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="DISCUSSION_TWO_NAME",displayName="讨论成员2姓名",maxLength=20,required=false,valuesRange="")   
     private String discussionTwoName;
    /**
     *名称:讨论成员2签名日期
     *
 	 *
 	 *
     */
     @Column(name="DISCUSSION_TWO_SIGN_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DISCUSSION_TWO_SIGN_DATE",displayName="讨论成员2签名日期",required=false,valuesRange="")   
     private Date discussionTwoSignDate;
    /**
     *名称:讨论成员3id
     *
 	 *
 	 *
     */
     @Column(name="DISCUSSION_THREE_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="DISCUSSION_THREE_ID",displayName="讨论成员3id",maxLength=40,required=false,valuesRange="")   
     private String discussionThreeId;
    /**
     *名称:讨论成员3姓名
     *
 	 *
 	 *
     */
     @Column(name="DISCUSSION_THREE_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="DISCUSSION_THREE_NAME",displayName="讨论成员3姓名",maxLength=20,required=false,valuesRange="")   
     private String discussionThreeName;
    /**
     *名称:讨论成员3签名日期
     *
 	 *
 	 *
     */
     @Column(name="DISCUSSION_THREE_SIGN_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DISCUSSION_THREE_SIGN_DATE",displayName="讨论成员3签名日期",required=false,valuesRange="")   
     private Date discussionThreeSignDate;
    /**
     *名称:病房号
     *
 	 *
 	 *
     */
     @Column(name="WARD_NO",length = 40,nullable = true)
     @FhirFieldValidate(name="WARD_NO",displayName="病房号",maxLength=40,required=false,valuesRange="")   
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
     @Column(name="BED_NUM",length = 40,nullable = true)
     @FhirFieldValidate(name="BED_NUM",displayName="床位号",maxLength=40,required=false,valuesRange="")   
     private String bedNum;
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
     *名称:死亡原因代码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="DEATH_CAUSE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="DEATH_CAUSE_CODE",displayName="死亡原因代码",maxLength=20,required=false,valuesRange="CV990111")   
     private String deathCauseCode;
    /**
     *名称:死亡原因名称
     *
 	 *
 	 *
     */
     @Column(name="DEATH_CAUSE_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="DEATH_CAUSE_NAME",displayName="死亡原因名称",maxLength=40,required=false,valuesRange="")   
     private String deathCauseName;
    /**
     *名称:死亡诊断编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="DEATH_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="DEATH_DIAG_CODE",displayName="死亡诊断编码",maxLength=20,required=false,valuesRange="CV990111")   
     private String deathDiagCode;
    /**
     *名称:死亡诊断名称
     *
 	 *
 	 *
     */
     @Column(name="DEATH_DIAG_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="DEATH_DIAG_NAME",displayName="死亡诊断名称",maxLength=40,required=false,valuesRange="")   
     private String deathDiagName;
    /**
     *名称:讨论内容
     *
 	 *
 	 *
     */
     @Column(name="DISCUSSION_CONTENT",columnDefinition="text")
     @FhirFieldValidate(name="DISCUSSION_CONTENT",displayName="讨论内容",required=false,valuesRange="")   
     private String discussionContent;
    /**
     *名称:讨论总结
     *
 	 *
 	 *
     */
     @Column(name="DISCUSSION_SUMMARIZE",columnDefinition="text")
     @FhirFieldValidate(name="DISCUSSION_SUMMARIZE",displayName="讨论总结",required=false,valuesRange="")   
     private String discussionSummarize;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getHcrDeathCaseDiscussionId(){
       	return this.hcrDeathCaseDiscussionId;
     }
     public void setHcrDeathCaseDiscussionId(String hcrDeathCaseDiscussionId){
       	this.hcrDeathCaseDiscussionId=hcrDeathCaseDiscussionId;
     }
     public Date getDiscussionDate(){
       	return this.discussionDate;
     }
     public void setDiscussionDate(Date discussionDate){
       	this.discussionDate=discussionDate;
     }
     public String getDiscussionSites(){
       	return this.discussionSites;
     }
     public void setDiscussionSites(String discussionSites){
       	this.discussionSites=discussionSites;
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
     public Date getDate(){
       	return this.date;
     }
     public void setDate(Date date){
       	this.date=date;
     }
     public Float getAge(){
       	return this.age;
     }
     public void setAge(Float age){
       	this.age=age;
     }
     public String getPatientType(){
       	return this.patientType;
     }
     public void setPatientType(String patientType){
       	this.patientType=patientType;
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
     public String getDiscussionModeratorId(){
       	return this.discussionModeratorId;
     }
     public void setDiscussionModeratorId(String discussionModeratorId){
       	this.discussionModeratorId=discussionModeratorId;
     }
     public String getDiscussionModeratorName(){
       	return this.discussionModeratorName;
     }
     public void setDiscussionModeratorName(String discussionModeratorName){
       	this.discussionModeratorName=discussionModeratorName;
     }
     public Date getDiscussionModeratorSignDate(){
       	return this.discussionModeratorSignDate;
     }
     public void setDiscussionModeratorSignDate(Date discussionModeratorSignDate){
       	this.discussionModeratorSignDate=discussionModeratorSignDate;
     }
     public String getDiscussionOneId(){
       	return this.discussionOneId;
     }
     public void setDiscussionOneId(String discussionOneId){
       	this.discussionOneId=discussionOneId;
     }
     public String getDiscussionOneName(){
       	return this.discussionOneName;
     }
     public void setDiscussionOneName(String discussionOneName){
       	this.discussionOneName=discussionOneName;
     }
     public Date getDiscussionOneSignDate(){
       	return this.discussionOneSignDate;
     }
     public void setDiscussionOneSignDate(Date discussionOneSignDate){
       	this.discussionOneSignDate=discussionOneSignDate;
     }
     public String getDiscussionTwoId(){
       	return this.discussionTwoId;
     }
     public void setDiscussionTwoId(String discussionTwoId){
       	this.discussionTwoId=discussionTwoId;
     }
     public String getDiscussionTwoName(){
       	return this.discussionTwoName;
     }
     public void setDiscussionTwoName(String discussionTwoName){
       	this.discussionTwoName=discussionTwoName;
     }
     public Date getDiscussionTwoSignDate(){
       	return this.discussionTwoSignDate;
     }
     public void setDiscussionTwoSignDate(Date discussionTwoSignDate){
       	this.discussionTwoSignDate=discussionTwoSignDate;
     }
     public String getDiscussionThreeId(){
       	return this.discussionThreeId;
     }
     public void setDiscussionThreeId(String discussionThreeId){
       	this.discussionThreeId=discussionThreeId;
     }
     public String getDiscussionThreeName(){
       	return this.discussionThreeName;
     }
     public void setDiscussionThreeName(String discussionThreeName){
       	this.discussionThreeName=discussionThreeName;
     }
     public Date getDiscussionThreeSignDate(){
       	return this.discussionThreeSignDate;
     }
     public void setDiscussionThreeSignDate(Date discussionThreeSignDate){
       	this.discussionThreeSignDate=discussionThreeSignDate;
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
     public String getDeathCauseCode(){
       	return this.deathCauseCode;
     }
     public void setDeathCauseCode(String deathCauseCode){
       	this.deathCauseCode=deathCauseCode;
     }
     public String getDeathCauseName(){
       	return this.deathCauseName;
     }
     public void setDeathCauseName(String deathCauseName){
       	this.deathCauseName=deathCauseName;
     }
     public String getDeathDiagCode(){
       	return this.deathDiagCode;
     }
     public void setDeathDiagCode(String deathDiagCode){
       	this.deathDiagCode=deathDiagCode;
     }
     public String getDeathDiagName(){
       	return this.deathDiagName;
     }
     public void setDeathDiagName(String deathDiagName){
       	this.deathDiagName=deathDiagName;
     }
     public String getDiscussionContent(){
       	return this.discussionContent;
     }
     public void setDiscussionContent(String discussionContent){
       	this.discussionContent=discussionContent;
     }
     public String getDiscussionSummarize(){
       	return this.discussionSummarize;
     }
     public void setDiscussionSummarize(String discussionSummarize){
       	this.discussionSummarize=discussionSummarize;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}