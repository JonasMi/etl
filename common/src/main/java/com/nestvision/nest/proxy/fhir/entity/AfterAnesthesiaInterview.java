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
@Table(name = BaseEntity.TABLE_PREFIX + "AFTER_ANESTHESIA_INTERVIEW")
public class AfterAnesthesiaInterview extends FhirResourceEntity {

    /**
     *名称:院内麻醉术后访视记录id
     *
 	 *
 	 *主键字段
     */
     @Column(name="AFTER_ANESTHESIA_INTERVIEW_RECORD_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="AFTER_ANESTHESIA_INTERVIEW_RECORD_ID",displayName="院内麻醉术后访视记录id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String afterAnesthesiaInterviewRecordId;
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
     *名称:患者类型
     *
 	 *限制:CV0900404
 	 *
     */
     @Column(name="PATIENT_TYPE",length = 20,nullable = true)
     @FhirFieldValidate(name="PATIENT_TYPE",displayName="患者类型",maxLength=20,required=false,valuesRange="CV0900404")   
     private String patientType;
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
     @FhirFieldValidate(name="VISIT_MARK",displayName="门诊或住院标识",maxLength=10,required=true,valuesRange="CUS00011")   
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
     *名称:就诊类型
     *
 	 *限制:CV9900340
 	 *
     */
     @Column(name="VISITING_TYPE",length = 20,nullable = true)
     @FhirFieldValidate(name="VISITING_TYPE",displayName="就诊类型",maxLength=20,required=false,valuesRange="CV9900340")   
     private String visitingType;
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
     *名称:麻醉医师id
     *
 	 *
 	 *
     */
     @Column(name="ANAESTHETIC",length = 40,nullable = true)
     @FhirFieldValidate(name="ANAESTHETIC",displayName="麻醉医师id",maxLength=40,required=false,valuesRange="")   
     private String anaesthetic;
    /**
     *名称:麻醉医师姓名
     *
 	 *
 	 *
     */
     @Column(name="ANAESTHETIC_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="ANAESTHETIC_NAME",displayName="麻醉医师姓名",maxLength=20,required=false,valuesRange="")   
     private String anaestheticName;
    /**
     *名称:麻醉医师签名日期
     *
 	 *
 	 *
     */
     @Column(name="ANAESTHETIC_SIGN_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="ANAESTHETIC_SIGN_DATE",displayName="麻醉医师签名日期",required=false,valuesRange="")   
     private Date anaestheticSignDate;
    /**
     *名称:体重
     *备注:kg
 	 *
 	 *
     */
     @Column(name="WEIGHT",length = 8,nullable = true)
     @FhirFieldValidate(name="WEIGHT",displayName="体重",maxLength=8,required=false,valuesRange="")   
     private Float weight;
    /**
     *名称:一般状况
     *备注:对患者一般状况检查结果的详细描述，包括其发育状况、营养状况、体味、步态、面容与表情、意识，检查能否合作等等
 	 *
 	 *
     */
     @Column(name="GENERAL_SITU_EXAM_RESULT",columnDefinition="text")
     @FhirFieldValidate(name="GENERAL_SITU_EXAM_RESULT",displayName="一般状况",required=false,valuesRange="")   
     private String generalSituExamResult;
    /**
     *名称:ABO血型代码
     *
 	 *限制:CV0450005
 	 *
     */
     @Column(name="ABO_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="ABO_CD",displayName="ABO血型代码",maxLength=20,required=false,valuesRange="CV0450005")   
     private String aboCd;
    /**
     *名称:RH血型代码
     *
 	 *限制:CV0450020
 	 *
     */
     @Column(name="RH_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="RH_CD",displayName="RH血型代码",maxLength=20,required=false,valuesRange="CV0450020")   
     private String rhCd;
    /**
     *名称:术前诊断-诊断编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="PREOPERATIVE_DIAGNOSIS",length = 20,nullable = true)
     @FhirFieldValidate(name="PREOPERATIVE_DIAGNOSIS",displayName="术前诊断-诊断编码",maxLength=20,required=false,valuesRange="CV990111")   
     private String preoperativeDiagnosis;
    /**
     *名称:术前诊断-诊断编码名称
     *
 	 *
 	 *
     */
     @Column(name="PREOPERATIVE_DIAGNOSIS_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="PREOPERATIVE_DIAGNOSIS_NAME",displayName="术前诊断-诊断编码名称",maxLength=40,required=false,valuesRange="")   
     private String preoperativeDiagnosisName;
    /**
     *名称:术前诊断-诊断日期
     *
 	 *
 	 *
     */
     @Column(name="PREOPERATIVE_DIAGNOSIS_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="PREOPERATIVE_DIAGNOSIS_DATE",displayName="术前诊断-诊断日期",required=false,valuesRange="")   
     private Date preoperativeDiagnosisDate;
    /**
     *名称:术后诊断-诊断编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="AFTER_OPERATION_DIAGNOSIS",length = 20,nullable = true)
     @FhirFieldValidate(name="AFTER_OPERATION_DIAGNOSIS",displayName="术后诊断-诊断编码",maxLength=20,required=false,valuesRange="CV990111")   
     private String afterOperationDiagnosis;
    /**
     *名称:术后诊断-诊断编码名称
     *
 	 *
 	 *
     */
     @Column(name="AFTER_OPERATION_DIAGNOSIS_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="AFTER_OPERATION_DIAGNOSIS_NAME",displayName="术后诊断-诊断编码名称",maxLength=40,required=false,valuesRange="")   
     private String afterOperationDiagnosisName;
    /**
     *名称:术后诊断-诊断日期
     *
 	 *
 	 *
     */
     @Column(name="AFTER_OPERATION_DIAGNOSIS_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="AFTER_OPERATION_DIAGNOSIS_DATE",displayName="术后诊断-诊断日期",required=false,valuesRange="")   
     private Date afterOperationDiagnosisDate;
    /**
     *名称:麻醉适应证
     *
 	 *
 	 *
     */
     @Column(name="ANES_INDICATION",length = 100,nullable = true)
     @FhirFieldValidate(name="ANES_INDICATION",displayName="麻醉适应证",maxLength=100,required=false,valuesRange="")   
     private String anesIndication;
    /**
     *名称:麻醉方法代码
     *
 	 *限制:CV0600103
 	 *
     */
     @Column(name="ANESTHESIA_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="ANESTHESIA_CODE",displayName="麻醉方法代码",maxLength=20,required=false,valuesRange="CV0600103")   
     private String anesthesiaCode;
    /**
     *名称:麻醉记录id
     *
 	 *
 	 *
     */
     @Column(name="ANAESTHESIA_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="ANAESTHESIA_ID",displayName="麻醉记录id",maxLength=40,required=false,valuesRange="")   
     private String anaesthesiaId;
    /**
     *名称:麻醉方法
     *
 	 *
 	 *
     */
     @Column(name="ANESTHESIA_WAY",length = 100,nullable = true)
     @FhirFieldValidate(name="ANESTHESIA_WAY",displayName="麻醉方法",maxLength=100,required=false,valuesRange="")   
     private String anesthesiaWay;
    /**
     *名称:手术编码
     *
 	 *限制:CV990113
 	 *
     */
     @Column(name="OPERATION_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="OPERATION_CD",displayName="手术编码",maxLength=20,required=false,valuesRange="CV990113")   
     private String operationCd;
    /**
     *名称:手术名称
     *
 	 *
 	 *
     */
     @Column(name="OPERATION_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="OPERATION_NAME",displayName="手术名称",maxLength=40,required=false,valuesRange="")   
     private String operationName;
    /**
     *名称:麻醉恢复情况
     *
 	 *
 	 *
     */
     @Column(name="ANESTHESIA_RECOVERY",length = 100,nullable = true)
     @FhirFieldValidate(name="ANESTHESIA_RECOVERY",displayName="麻醉恢复情况",maxLength=100,required=false,valuesRange="")   
     private String anesthesiaRecovery;
    /**
     *名称:清醒日期时间
     *
 	 *
 	 *
     */
     @Column(name="AWAKE_DATE_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="AWAKE_DATE_TIME",displayName="清醒日期时间",required=false,valuesRange="")   
     private Date awakeDateTime;
    /**
     *名称:拔除气管插管标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="EXTUBATION_CD",length = 5,nullable = true)
     @FhirFieldValidate(name="EXTUBATION_CD",displayName="拔除气管插管标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean extubationCd;
    /**
     *名称:特殊情况
     *
 	 *
 	 *
     */
     @Column(name="EXCEPTIONAL_CASE",length = 100,nullable = true)
     @FhirFieldValidate(name="EXCEPTIONAL_CASE",displayName="特殊情况",maxLength=100,required=false,valuesRange="")   
     private String exceptionalCase;
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
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getAfterAnesthesiaInterviewRecordId(){
       	return this.afterAnesthesiaInterviewRecordId;
     }
     public void setAfterAnesthesiaInterviewRecordId(String afterAnesthesiaInterviewRecordId){
       	this.afterAnesthesiaInterviewRecordId=afterAnesthesiaInterviewRecordId;
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
     public String getPatientType(){
       	return this.patientType;
     }
     public void setPatientType(String patientType){
       	this.patientType=patientType;
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
     public String getVisitingType(){
       	return this.visitingType;
     }
     public void setVisitingType(String visitingType){
       	this.visitingType=visitingType;
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
     public String getAnaesthetic(){
       	return this.anaesthetic;
     }
     public void setAnaesthetic(String anaesthetic){
       	this.anaesthetic=anaesthetic;
     }
     public String getAnaestheticName(){
       	return this.anaestheticName;
     }
     public void setAnaestheticName(String anaestheticName){
       	this.anaestheticName=anaestheticName;
     }
     public Date getAnaestheticSignDate(){
       	return this.anaestheticSignDate;
     }
     public void setAnaestheticSignDate(Date anaestheticSignDate){
       	this.anaestheticSignDate=anaestheticSignDate;
     }
     public Float getWeight(){
       	return this.weight;
     }
     public void setWeight(Float weight){
       	this.weight=weight;
     }
     public String getGeneralSituExamResult(){
       	return this.generalSituExamResult;
     }
     public void setGeneralSituExamResult(String generalSituExamResult){
       	this.generalSituExamResult=generalSituExamResult;
     }
     public String getAboCd(){
       	return this.aboCd;
     }
     public void setAboCd(String aboCd){
       	this.aboCd=aboCd;
     }
     public String getRhCd(){
       	return this.rhCd;
     }
     public void setRhCd(String rhCd){
       	this.rhCd=rhCd;
     }
     public String getPreoperativeDiagnosis(){
       	return this.preoperativeDiagnosis;
     }
     public void setPreoperativeDiagnosis(String preoperativeDiagnosis){
       	this.preoperativeDiagnosis=preoperativeDiagnosis;
     }
     public String getPreoperativeDiagnosisName(){
       	return this.preoperativeDiagnosisName;
     }
     public void setPreoperativeDiagnosisName(String preoperativeDiagnosisName){
       	this.preoperativeDiagnosisName=preoperativeDiagnosisName;
     }
     public Date getPreoperativeDiagnosisDate(){
       	return this.preoperativeDiagnosisDate;
     }
     public void setPreoperativeDiagnosisDate(Date preoperativeDiagnosisDate){
       	this.preoperativeDiagnosisDate=preoperativeDiagnosisDate;
     }
     public String getAfterOperationDiagnosis(){
       	return this.afterOperationDiagnosis;
     }
     public void setAfterOperationDiagnosis(String afterOperationDiagnosis){
       	this.afterOperationDiagnosis=afterOperationDiagnosis;
     }
     public String getAfterOperationDiagnosisName(){
       	return this.afterOperationDiagnosisName;
     }
     public void setAfterOperationDiagnosisName(String afterOperationDiagnosisName){
       	this.afterOperationDiagnosisName=afterOperationDiagnosisName;
     }
     public Date getAfterOperationDiagnosisDate(){
       	return this.afterOperationDiagnosisDate;
     }
     public void setAfterOperationDiagnosisDate(Date afterOperationDiagnosisDate){
       	this.afterOperationDiagnosisDate=afterOperationDiagnosisDate;
     }
     public String getAnesIndication(){
       	return this.anesIndication;
     }
     public void setAnesIndication(String anesIndication){
       	this.anesIndication=anesIndication;
     }
     public String getAnesthesiaCode(){
       	return this.anesthesiaCode;
     }
     public void setAnesthesiaCode(String anesthesiaCode){
       	this.anesthesiaCode=anesthesiaCode;
     }
     public String getAnaesthesiaId(){
       	return this.anaesthesiaId;
     }
     public void setAnaesthesiaId(String anaesthesiaId){
       	this.anaesthesiaId=anaesthesiaId;
     }
     public String getAnesthesiaWay(){
       	return this.anesthesiaWay;
     }
     public void setAnesthesiaWay(String anesthesiaWay){
       	this.anesthesiaWay=anesthesiaWay;
     }
     public String getOperationCd(){
       	return this.operationCd;
     }
     public void setOperationCd(String operationCd){
       	this.operationCd=operationCd;
     }
     public String getOperationName(){
       	return this.operationName;
     }
     public void setOperationName(String operationName){
       	this.operationName=operationName;
     }
     public String getAnesthesiaRecovery(){
       	return this.anesthesiaRecovery;
     }
     public void setAnesthesiaRecovery(String anesthesiaRecovery){
       	this.anesthesiaRecovery=anesthesiaRecovery;
     }
     public Date getAwakeDateTime(){
       	return this.awakeDateTime;
     }
     public void setAwakeDateTime(Date awakeDateTime){
       	this.awakeDateTime=awakeDateTime;
     }
     public Boolean getExtubationCd(){
       	return this.extubationCd;
     }
     public void setExtubationCd(Boolean extubationCd){
       	this.extubationCd=extubationCd;
     }
     public String getExceptionalCase(){
       	return this.exceptionalCase;
     }
     public void setExceptionalCase(String exceptionalCase){
       	this.exceptionalCase=exceptionalCase;
     }
     public String getRemarks(){
       	return this.remarks;
     }
     public void setRemarks(String remarks){
       	this.remarks=remarks;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}