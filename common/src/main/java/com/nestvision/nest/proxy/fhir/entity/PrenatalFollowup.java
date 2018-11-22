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
@Table(name = BaseEntity.TABLE_PREFIX + "PRENATAL_FOLLOWUP")
public class PrenatalFollowup extends FhirResourceEntity {

    /**
     *名称:产前随访服务id
     *
 	 *
 	 *主键字段
     */
     @Column(name="PRENATAL_FOLLOW_UP_SERVICE_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="PRENATAL_FOLLOW_UP_SERVICE_ID",displayName="产前随访服务id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String prenatalFollowUpServiceId;
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
     *名称:体重（g）
     *
 	 *
 	 *
     */
     @Column(name="BIRTH_WEIGHT",length = 8,nullable = true)
     @FhirFieldValidate(name="BIRTH_WEIGHT",displayName="体重（g）",maxLength=8,required=false,valuesRange="")   
     private Float birthWeight;
    /**
     *名称:收缩压(收缩压的测量值，计量单位为mmHg)
     *
 	 *
 	 *
     */
     @Column(name="SBP",length = 4,nullable = true)
     @FhirFieldValidate(name="SBP",displayName="收缩压(收缩压的测量值，计量单位为mmHg)",maxLength=4,required=false,valuesRange="")   
     private Integer sbp;
    /**
     *名称:舒张压(舒张压的测量值，计量单位为mmHg)
     *
 	 *
 	 *
     */
     @Column(name="DBP",length = 4,nullable = true)
     @FhirFieldValidate(name="DBP",displayName="舒张压(舒张压的测量值，计量单位为mmHg)",maxLength=4,required=false,valuesRange="")   
     private Integer dbp;
    /**
     *名称:出生孕周
     *
 	 *
 	 *
     */
     @Column(name="GESTATIONAL_WEEK",length = 8,nullable = true)
     @FhirFieldValidate(name="GESTATIONAL_WEEK",displayName="出生孕周",maxLength=8,required=false,valuesRange="")   
     private Float gestationalWeek;
    /**
     *名称:主诉
     *
 	 *
 	 *
     */
     @Column(name="CHIEF",length = 40,nullable = true)
     @FhirFieldValidate(name="CHIEF",displayName="主诉",maxLength=40,required=false,valuesRange="")   
     private String chief;
    /**
     *名称:宫底高度（cm）
     *
 	 *
 	 *
     */
     @Column(name="UTERUS_HEIGHT",length = 8,nullable = true)
     @FhirFieldValidate(name="UTERUS_HEIGHT",displayName="宫底高度（cm）",maxLength=8,required=false,valuesRange="")   
     private Float uterusHeight;
    /**
     *名称:腹围（cm）
     *
 	 *
 	 *
     */
     @Column(name="ABDOMINAL_GIRTH",length = 8,nullable = true)
     @FhirFieldValidate(name="ABDOMINAL_GIRTH",displayName="腹围（cm）",maxLength=8,required=false,valuesRange="")   
     private Float abdominalGirth;
    /**
     *名称:胎方位代码
     *
 	 *限制:CV0501007
 	 *
     */
     @Column(name="FETUS_POSITION_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="FETUS_POSITION_CD",displayName="胎方位代码",maxLength=20,required=false,valuesRange="CV0501007")   
     private String fetusPositionCd;
    /**
     *名称:胎心率（次/min）
     *
 	 *
 	 *
     */
     @Column(name="FETAL_HEART_RATE",length = 8,nullable = true)
     @FhirFieldValidate(name="FETAL_HEART_RATE",displayName="胎心率（次/min）",maxLength=8,required=false,valuesRange="")   
     private Float fetalHeartRate;
    /**
     *名称:血红蛋白
     *
 	 *
 	 *
     */
     @Column(name="HEMOGLOBIN",length = 8,nullable = true)
     @FhirFieldValidate(name="HEMOGLOBIN",displayName="血红蛋白",maxLength=8,required=false,valuesRange="")   
     private Float hemoglobin;
    /**
     *名称:尿蛋白定性检测结果代码
     *
 	 *限制:CV0450015
 	 *
     */
     @Column(name="URINE_PROTEIN_QUALITATIVE_TEST_RESULT_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="URINE_PROTEIN_QUALITATIVE_TEST_RESULT_CODE",displayName="尿蛋白定性检测结果代码",maxLength=20,required=false,valuesRange="CV0450015")   
     private String urineProteinQualitativeTestResultCode;
    /**
     *名称:B超检查结果
     *
 	 *
 	 *
     */
     @Column(name="BSCAN_RESULT_DESCR",length = 200,nullable = true)
     @FhirFieldValidate(name="BSCAN_RESULT_DESCR",displayName="B超检查结果",maxLength=200,required=false,valuesRange="")   
     private String bscanResultDescr;
    /**
     *名称:孕产妇健康评估异常标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="MATERNAL_HEALTH_ASSESSMENT",length = 5,nullable = true)
     @FhirFieldValidate(name="MATERNAL_HEALTH_ASSESSMENT",displayName="孕产妇健康评估异常标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean maternalHealthAssessment;
    /**
     *名称:孕产妇健康评估异常结果描述
     *
 	 *
 	 *
     */
     @Column(name="MATERNAL_HEALTH_RESULT_DESCR",length = 40,nullable = true)
     @FhirFieldValidate(name="MATERNAL_HEALTH_RESULT_DESCR",displayName="孕产妇健康评估异常结果描述",maxLength=40,required=false,valuesRange="")   
     private String maternalHealthResultDescr;
    /**
     *名称:健康指导代码
     *
 	 *限制:CV9900017
 	 *
     */
     @Column(name="HEALTH_INSTRUCTION_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="HEALTH_INSTRUCTION_CODE",displayName="健康指导代码",maxLength=20,required=false,valuesRange="CV9900017")   
     private String healthInstructionCode;
    /**
     *名称:转诊标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="REFERRAL_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="REFERRAL_MARK",displayName="转诊标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean referralMark;
    /**
     *名称:转诊原因
     *
 	 *
 	 *
     */
     @Column(name="REFERRAL_REASONS",length = 200,nullable = true)
     @FhirFieldValidate(name="REFERRAL_REASONS",displayName="转诊原因",maxLength=200,required=false,valuesRange="")   
     private String referralReasons;
    /**
     *名称:转入机构的名称
     *
 	 *
 	 *
     */
     @Column(name="REFERRAL_IN_ORG",length = 40,nullable = true)
     @FhirFieldValidate(name="REFERRAL_IN_ORG",displayName="转入机构的名称",maxLength=40,required=false,valuesRange="")   
     private String referralInOrg;
    /**
     *名称:转入科室的名称
     *
 	 *
 	 *
     */
     @Column(name="REFERRAL_IN_DEP",length = 40,nullable = true)
     @FhirFieldValidate(name="REFERRAL_IN_DEP",displayName="转入科室的名称",maxLength=40,required=false,valuesRange="")   
     private String referralInDep;
    /**
     *名称:下次随访日期
     *
 	 *
 	 *
     */
     @Column(name="NEXT_FOLLOW_UP_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="NEXT_FOLLOW_UP_DATE",displayName="下次随访日期",required=false,valuesRange="")   
     private Date nextFollowUpDate;
    /**
     *名称:下次访视地点
     *
 	 *
 	 *
     */
     @Column(name="NEXT_VISIT_LOCATION",length = 40,nullable = true)
     @FhirFieldValidate(name="NEXT_VISIT_LOCATION",displayName="下次访视地点",maxLength=40,required=false,valuesRange="")   
     private String nextVisitLocation;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getPrenatalFollowUpServiceId(){
       	return this.prenatalFollowUpServiceId;
     }
     public void setPrenatalFollowUpServiceId(String prenatalFollowUpServiceId){
       	this.prenatalFollowUpServiceId=prenatalFollowUpServiceId;
     }
     public Date getDate(){
       	return this.date;
     }
     public void setDate(Date date){
       	this.date=date;
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
     public Float getBirthWeight(){
       	return this.birthWeight;
     }
     public void setBirthWeight(Float birthWeight){
       	this.birthWeight=birthWeight;
     }
     public Integer getSbp(){
       	return this.sbp;
     }
     public void setSbp(Integer sbp){
       	this.sbp=sbp;
     }
     public Integer getDbp(){
       	return this.dbp;
     }
     public void setDbp(Integer dbp){
       	this.dbp=dbp;
     }
     public Float getGestationalWeek(){
       	return this.gestationalWeek;
     }
     public void setGestationalWeek(Float gestationalWeek){
       	this.gestationalWeek=gestationalWeek;
     }
     public String getChief(){
       	return this.chief;
     }
     public void setChief(String chief){
       	this.chief=chief;
     }
     public Float getUterusHeight(){
       	return this.uterusHeight;
     }
     public void setUterusHeight(Float uterusHeight){
       	this.uterusHeight=uterusHeight;
     }
     public Float getAbdominalGirth(){
       	return this.abdominalGirth;
     }
     public void setAbdominalGirth(Float abdominalGirth){
       	this.abdominalGirth=abdominalGirth;
     }
     public String getFetusPositionCd(){
       	return this.fetusPositionCd;
     }
     public void setFetusPositionCd(String fetusPositionCd){
       	this.fetusPositionCd=fetusPositionCd;
     }
     public Float getFetalHeartRate(){
       	return this.fetalHeartRate;
     }
     public void setFetalHeartRate(Float fetalHeartRate){
       	this.fetalHeartRate=fetalHeartRate;
     }
     public Float getHemoglobin(){
       	return this.hemoglobin;
     }
     public void setHemoglobin(Float hemoglobin){
       	this.hemoglobin=hemoglobin;
     }
     public String getUrineProteinQualitativeTestResultCode(){
       	return this.urineProteinQualitativeTestResultCode;
     }
     public void setUrineProteinQualitativeTestResultCode(String urineProteinQualitativeTestResultCode){
       	this.urineProteinQualitativeTestResultCode=urineProteinQualitativeTestResultCode;
     }
     public String getBscanResultDescr(){
       	return this.bscanResultDescr;
     }
     public void setBscanResultDescr(String bscanResultDescr){
       	this.bscanResultDescr=bscanResultDescr;
     }
     public Boolean getMaternalHealthAssessment(){
       	return this.maternalHealthAssessment;
     }
     public void setMaternalHealthAssessment(Boolean maternalHealthAssessment){
       	this.maternalHealthAssessment=maternalHealthAssessment;
     }
     public String getMaternalHealthResultDescr(){
       	return this.maternalHealthResultDescr;
     }
     public void setMaternalHealthResultDescr(String maternalHealthResultDescr){
       	this.maternalHealthResultDescr=maternalHealthResultDescr;
     }
     public String getHealthInstructionCode(){
       	return this.healthInstructionCode;
     }
     public void setHealthInstructionCode(String healthInstructionCode){
       	this.healthInstructionCode=healthInstructionCode;
     }
     public Boolean getReferralMark(){
       	return this.referralMark;
     }
     public void setReferralMark(Boolean referralMark){
       	this.referralMark=referralMark;
     }
     public String getReferralReasons(){
       	return this.referralReasons;
     }
     public void setReferralReasons(String referralReasons){
       	this.referralReasons=referralReasons;
     }
     public String getReferralInOrg(){
       	return this.referralInOrg;
     }
     public void setReferralInOrg(String referralInOrg){
       	this.referralInOrg=referralInOrg;
     }
     public String getReferralInDep(){
       	return this.referralInDep;
     }
     public void setReferralInDep(String referralInDep){
       	this.referralInDep=referralInDep;
     }
     public Date getNextFollowUpDate(){
       	return this.nextFollowUpDate;
     }
     public void setNextFollowUpDate(Date nextFollowUpDate){
       	this.nextFollowUpDate=nextFollowUpDate;
     }
     public String getNextVisitLocation(){
       	return this.nextVisitLocation;
     }
     public void setNextVisitLocation(String nextVisitLocation){
       	this.nextVisitLocation=nextVisitLocation;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}