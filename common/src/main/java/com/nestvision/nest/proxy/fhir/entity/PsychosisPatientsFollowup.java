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
@Table(name = BaseEntity.TABLE_PREFIX + "PSYCHOSIS_PATIENTS_FOLLOWUP")
public class PsychosisPatientsFollowup extends FhirResourceEntity {

    /**
     *名称:重性精神病患者随访服务id
     *
 	 *
 	 *主键字段
     */
     @Column(name="SEVERE_PSYCHOSIS_PATIENTS_FOLLOW_UP_SERVICE_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="SEVERE_PSYCHOSIS_PATIENTS_FOLLOW_UP_SERVICE_ID",displayName="重性精神病患者随访服务id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String severePsychosisPatientsFollowUpServiceId;
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
     *名称:联系方式
     *
 	 *
 	 *
     */
     @Column(name="PHONE",length = 20,nullable = true)
     @FhirFieldValidate(name="PHONE",displayName="联系方式",maxLength=20,required=false,valuesRange="")   
     private String phone;
    /**
     *名称:家庭住址-省（自治区、直辖市）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="HOME_STATE",length = 10,nullable = true)
     @FhirFieldValidate(name="HOME_STATE",displayName="家庭住址-省（自治区、直辖市）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String homeState;
    /**
     *名称:家庭住址-市（地区）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="HOME_CITY",length = 10,nullable = true)
     @FhirFieldValidate(name="HOME_CITY",displayName="家庭住址-市（地区）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String homeCity;
    /**
     *名称:家庭住址-县（区）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="HOME_DISTRICT",length = 10,nullable = true)
     @FhirFieldValidate(name="HOME_DISTRICT",displayName="家庭住址-县（区）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String homeDistrict;
    /**
     *名称:家庭住址-乡（镇、街道办事处）
     *
 	 *
 	 *
     */
     @Column(name="HOME_LINE",length = 100,nullable = true)
     @FhirFieldValidate(name="HOME_LINE",displayName="家庭住址-乡（镇、街道办事处）",maxLength=100,required=false,valuesRange="")   
     private String homeLine;
    /**
     *名称:家庭住址-村（街、路、弄等）
     *
 	 *
 	 *
     */
     @Column(name="HOME_ROAD",length = 100,nullable = true)
     @FhirFieldValidate(name="HOME_ROAD",displayName="家庭住址-村（街、路、弄等）",maxLength=100,required=false,valuesRange="")   
     private String homeRoad;
    /**
     *名称:家庭住址-门牌号码
     *
 	 *
 	 *
     */
     @Column(name="HOME_HOUSE_NO",length = 50,nullable = true)
     @FhirFieldValidate(name="HOME_HOUSE_NO",displayName="家庭住址-门牌号码",maxLength=50,required=false,valuesRange="")   
     private String homeHouseNo;
    /**
     *名称:家庭住址-详细信息
     *
 	 *
 	 *
     */
     @Column(name="HOME_TEXT",length = 500,nullable = true)
     @FhirFieldValidate(name="HOME_TEXT",displayName="家庭住址-详细信息",maxLength=500,required=false,valuesRange="")   
     private String homeText;
    /**
     *名称:重性精神疾病患者访到标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="SEVERE_MENTAL_ILLNESS_PATIENTS_VISIT_SIGNS",length = 5,nullable = true)
     @FhirFieldValidate(name="SEVERE_MENTAL_ILLNESS_PATIENTS_VISIT_SIGNS",displayName="重性精神疾病患者访到标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean severeMentalIllnessPatientsVisitSigns;
    /**
     *名称:重性精神疾病患者危险性分级代码
     *
 	 *限制:CV0510013
 	 *
     */
     @Column(name="STD_SMI_DANGER_LEVEL",length = 20,nullable = true)
     @FhirFieldValidate(name="STD_SMI_DANGER_LEVEL",displayName="重性精神疾病患者危险性分级代码",maxLength=20,required=false,valuesRange="CV0510013")   
     private String stdSmiDangerLevel;
    /**
     *名称:精神症状代码
     *
 	 *限制:CV0401009
 	 *
     */
     @Column(name="MENTAL_SYMPTOM_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="MENTAL_SYMPTOM_CODE",displayName="精神症状代码",maxLength=20,required=false,valuesRange="CV0401009")   
     private String mentalSymptomCode;
    /**
     *名称:自知力评价结果代码
     *
 	 *限制:CV9900013
 	 *
     */
     @Column(name="INSIGHT_EVALUATION_RESULT_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="INSIGHT_EVALUATION_RESULT_CODE",displayName="自知力评价结果代码",maxLength=20,required=false,valuesRange="CV9900013")   
     private String insightEvaluationResultCode;
    /**
     *名称:睡眠情况代码
     *
 	 *限制:CV9900031
 	 *
     */
     @Column(name="SLEEP_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="SLEEP_CODE",displayName="睡眠情况代码",maxLength=20,required=false,valuesRange="CV9900031")   
     private String sleepCode;
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
     *名称:社会功能情况分类代码
     *
 	 *限制:CV0510003
 	 *
     */
     @Column(name="SOCIAL_FUNCTION_CLASSIFICATION_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="SOCIAL_FUNCTION_CLASSIFICATION_CODE",displayName="社会功能情况分类代码",maxLength=20,required=false,valuesRange="CV0510003")   
     private String socialFunctionClassificationCode;
    /**
     *名称:社会功能情况评价代码
     *
 	 *限制:CV9900031
 	 *
     */
     @Column(name="SOCIAL_FUNCTION_EVALUATION_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="SOCIAL_FUNCTION_EVALUATION_CODE",displayName="社会功能情况评价代码",maxLength=20,required=false,valuesRange="CV9900031")   
     private String socialFunctionEvaluationCode;
    /**
     *名称:患重性精神疾病对家庭社会的影响代码
     *
 	 *限制:CV0300112
 	 *
     */
     @Column(name="MENTAL_ILLNESS_ON_FAMILY_SOCIETY_IMPACT",length = 20,nullable = true)
     @FhirFieldValidate(name="MENTAL_ILLNESS_ON_FAMILY_SOCIETY_IMPACT",displayName="患重性精神疾病对家庭社会的影响代码",maxLength=20,required=false,valuesRange="CV0300112")   
     private String mentalIllnessOnFamilySocietyImpact;
    /**
     *名称:患病对家庭社会的影响次数
     *
 	 *
 	 *
     */
     @Column(name="ILLNESS_ON_FAMILY_SOCIETY_INFLUENCE_TIMES",length = 4,nullable = true)
     @FhirFieldValidate(name="ILLNESS_ON_FAMILY_SOCIETY_INFLUENCE_TIMES",displayName="患病对家庭社会的影响次数",maxLength=4,required=false,valuesRange="")   
     private Integer illnessOnFamilySocietyInfluenceTimes;
    /**
     *名称:关锁情况代码
     *
 	 *限制:CV9900020
 	 *
     */
     @Column(name="LOCK_CASE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="LOCK_CASE_CODE",displayName="关锁情况代码",maxLength=20,required=false,valuesRange="CV9900020")   
     private String lockCaseCode;
    /**
     *名称:住院情况的代码
     *
 	 *限制:CV9900125
 	 *
     */
     @Column(name="INPATIENT_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="INPATIENT_CODE",displayName="住院情况的代码",maxLength=20,required=false,valuesRange="CV9900125")   
     private String inpatientCode;
    /**
     *名称:辅助检查标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="AUXILIARY_INSPECTION_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="AUXILIARY_INSPECTION_MARK",displayName="辅助检查标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean auxiliaryInspectionMark;
    /**
     *名称:辅助检查项目
     *
 	 *
 	 *
     */
     @Column(name="AUXILIARY_EXAMINATION_PROJECT",length = 200,nullable = true)
     @FhirFieldValidate(name="AUXILIARY_EXAMINATION_PROJECT",displayName="辅助检查项目",maxLength=200,required=false,valuesRange="")   
     private String auxiliaryExaminationProject;
    /**
     *名称:检测日期
     *
 	 *
 	 *
     */
     @Column(name="TEST_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="TEST_DATE",displayName="检测日期",required=false,valuesRange="")   
     private Date testDate;
    /**
     *名称:辅助检查结果
     *
 	 *
 	 *
     */
     @Column(name="AUXILIARY_EXAMINATION_RESULTS",length = 40,nullable = true)
     @FhirFieldValidate(name="AUXILIARY_EXAMINATION_RESULTS",displayName="辅助检查结果",maxLength=40,required=false,valuesRange="")   
     private String auxiliaryExaminationResults;
    /**
     *名称:随访评价结果代码
     *
 	 *限制:CV0510012
 	 *
     */
     @Column(name="FOLLOWUP_EVALUATION_RESULTS_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="FOLLOWUP_EVALUATION_RESULTS_CODE",displayName="随访评价结果代码",maxLength=20,required=false,valuesRange="CV0510012")   
     private String followupEvaluationResultsCode;
    /**
     *名称:精神康复措施代码
     *
 	 *限制:CV0600209
 	 *
     */
     @Column(name="PSYCHIATRIC_REHABILITATION_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="PSYCHIATRIC_REHABILITATION_CODE",displayName="精神康复措施代码",maxLength=20,required=false,valuesRange="CV0600209")   
     private String psychiatricRehabilitationCode;
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
     @Column(name="REFERRAL_REASONS",length = 40,nullable = true)
     @FhirFieldValidate(name="REFERRAL_REASONS",displayName="转诊原因",maxLength=40,required=false,valuesRange="")   
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
     *名称:中药使用类别代码
     *
 	 *限制:CV0600101
 	 *
     */
     @Column(name="CN_MEDICATION_TYPE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="CN_MEDICATION_TYPE_CODE",displayName="中药使用类别代码",maxLength=20,required=false,valuesRange="CV0600101")   
     private String cnMedicationTypeCode;
    /**
     *名称:频率代码
     *
 	 *限制:CV9900341
 	 *
     */
     @Column(name="FREQ_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="FREQ_CODE",displayName="频率代码",maxLength=20,required=false,valuesRange="CV9900341")   
     private String freqCode;
    /**
     *名称:服药依从性代码
     *
 	 *限制:CV9900004
 	 *
     */
     @Column(name="MEDICATION_COMPLIANCE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="MEDICATION_COMPLIANCE_CODE",displayName="服药依从性代码",maxLength=20,required=false,valuesRange="CV9900004")   
     private String medicationComplianceCode;
    /**
     *名称:药物不良反应情况
     *
 	 *
 	 *
     */
     @Column(name="DRUG_ADVERSE_REACTION",length = 200,nullable = true)
     @FhirFieldValidate(name="DRUG_ADVERSE_REACTION",displayName="药物不良反应情况",maxLength=200,required=false,valuesRange="")   
     private String drugAdverseReaction;
    /**
     *名称:药物使用总剂量
     *
 	 *
 	 *
     */
     @Column(name="DRUG_TOTAL_DOSE",length = 8,nullable = true)
     @FhirFieldValidate(name="DRUG_TOTAL_DOSE",displayName="药物使用总剂量",maxLength=8,required=false,valuesRange="")   
     private Float drugTotalDose;
    /**
     *名称:药物使用总剂量单位
     *
 	 *
 	 *
     */
     @Column(name="DRUG_TOTAL_DOSE_UTIL",length = 40,nullable = true)
     @FhirFieldValidate(name="DRUG_TOTAL_DOSE_UTIL",displayName="药物使用总剂量单位",maxLength=40,required=false,valuesRange="")   
     private String drugTotalDoseUtil;
    /**
     *名称:院内药物编码
     *
 	 *
 	 *
     */
     @Column(name="MEDICATION_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="MEDICATION_CD",displayName="院内药物编码",maxLength=20,required=false,valuesRange="")   
     private String medicationCd;
    /**
     *名称:院内药物名称
     *
 	 *
 	 *
     */
     @Column(name="MEDICATION_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="MEDICATION_NAME",displayName="院内药物名称",maxLength=40,required=false,valuesRange="")   
     private String medicationName;
    /**
     *名称:药物剂型代码
     *
 	 *
 	 *
     */
     @Column(name="DRUG_DOSAGE_FORMS",length = 20,nullable = true)
     @FhirFieldValidate(name="DRUG_DOSAGE_FORMS",displayName="药物剂型代码",maxLength=20,required=false,valuesRange="")   
     private String drugDosageForms;
    /**
     *名称:药物剂型名称
     *
 	 *
 	 *
     */
     @Column(name="DRUG_DOSAGE_FORMS_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="DRUG_DOSAGE_FORMS_NAME",displayName="药物剂型名称",maxLength=40,required=false,valuesRange="")   
     private String drugDosageFormsName;
    /**
     *名称:医嘱开始时间
     *
 	 *
 	 *
     */
     @Column(name="START",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="START",displayName="医嘱开始时间",required=false,valuesRange="")   
     private Date start;
    /**
     *名称:执行天数
     *
 	 *
 	 *
     */
     @Column(name="DURATION",length = 8,nullable = true)
     @FhirFieldValidate(name="DURATION",displayName="执行天数",maxLength=8,required=false,valuesRange="")   
     private Float duration;
    /**
     *名称:用药途径代码
     *
 	 *限制:CV0600102
 	 *
     */
     @Column(name="DOSAGE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="DOSAGE_CODE",displayName="用药途径代码",maxLength=20,required=false,valuesRange="CV0600102")   
     private String dosageCode;
    /**
     *名称:特殊用法代码
     *
 	 *限制:CV9900285
 	 *
     */
     @Column(name="C_MED_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="C_MED_CODE",displayName="特殊用法代码",maxLength=20,required=false,valuesRange="CV9900285")   
     private String cMedCode;
    /**
     *名称:用药次剂量
     *
 	 *
 	 *
     */
     @Column(name="ONCE_VALUE",length = 8,nullable = true)
     @FhirFieldValidate(name="ONCE_VALUE",displayName="用药次剂量",maxLength=8,required=false,valuesRange="")   
     private Float onceValue;
    /**
     *名称:用药次剂量单位
     *
 	 *
 	 *
     */
     @Column(name="ONCE_UNIT",length = 20,nullable = true)
     @FhirFieldValidate(name="ONCE_UNIT",displayName="用药次剂量单位",maxLength=20,required=false,valuesRange="")   
     private String onceUnit;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getSeverePsychosisPatientsFollowUpServiceId(){
       	return this.severePsychosisPatientsFollowUpServiceId;
     }
     public void setSeverePsychosisPatientsFollowUpServiceId(String severePsychosisPatientsFollowUpServiceId){
       	this.severePsychosisPatientsFollowUpServiceId=severePsychosisPatientsFollowUpServiceId;
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
     public String getPhone(){
       	return this.phone;
     }
     public void setPhone(String phone){
       	this.phone=phone;
     }
     public String getHomeState(){
       	return this.homeState;
     }
     public void setHomeState(String homeState){
       	this.homeState=homeState;
     }
     public String getHomeCity(){
       	return this.homeCity;
     }
     public void setHomeCity(String homeCity){
       	this.homeCity=homeCity;
     }
     public String getHomeDistrict(){
       	return this.homeDistrict;
     }
     public void setHomeDistrict(String homeDistrict){
       	this.homeDistrict=homeDistrict;
     }
     public String getHomeLine(){
       	return this.homeLine;
     }
     public void setHomeLine(String homeLine){
       	this.homeLine=homeLine;
     }
     public String getHomeRoad(){
       	return this.homeRoad;
     }
     public void setHomeRoad(String homeRoad){
       	this.homeRoad=homeRoad;
     }
     public String getHomeHouseNo(){
       	return this.homeHouseNo;
     }
     public void setHomeHouseNo(String homeHouseNo){
       	this.homeHouseNo=homeHouseNo;
     }
     public String getHomeText(){
       	return this.homeText;
     }
     public void setHomeText(String homeText){
       	this.homeText=homeText;
     }
     public Boolean getSevereMentalIllnessPatientsVisitSigns(){
       	return this.severeMentalIllnessPatientsVisitSigns;
     }
     public void setSevereMentalIllnessPatientsVisitSigns(Boolean severeMentalIllnessPatientsVisitSigns){
       	this.severeMentalIllnessPatientsVisitSigns=severeMentalIllnessPatientsVisitSigns;
     }
     public String getStdSmiDangerLevel(){
       	return this.stdSmiDangerLevel;
     }
     public void setStdSmiDangerLevel(String stdSmiDangerLevel){
       	this.stdSmiDangerLevel=stdSmiDangerLevel;
     }
     public String getMentalSymptomCode(){
       	return this.mentalSymptomCode;
     }
     public void setMentalSymptomCode(String mentalSymptomCode){
       	this.mentalSymptomCode=mentalSymptomCode;
     }
     public String getInsightEvaluationResultCode(){
       	return this.insightEvaluationResultCode;
     }
     public void setInsightEvaluationResultCode(String insightEvaluationResultCode){
       	this.insightEvaluationResultCode=insightEvaluationResultCode;
     }
     public String getSleepCode(){
       	return this.sleepCode;
     }
     public void setSleepCode(String sleepCode){
       	this.sleepCode=sleepCode;
     }
     public String getDietaryStatus(){
       	return this.dietaryStatus;
     }
     public void setDietaryStatus(String dietaryStatus){
       	this.dietaryStatus=dietaryStatus;
     }
     public String getSocialFunctionClassificationCode(){
       	return this.socialFunctionClassificationCode;
     }
     public void setSocialFunctionClassificationCode(String socialFunctionClassificationCode){
       	this.socialFunctionClassificationCode=socialFunctionClassificationCode;
     }
     public String getSocialFunctionEvaluationCode(){
       	return this.socialFunctionEvaluationCode;
     }
     public void setSocialFunctionEvaluationCode(String socialFunctionEvaluationCode){
       	this.socialFunctionEvaluationCode=socialFunctionEvaluationCode;
     }
     public String getMentalIllnessOnFamilySocietyImpact(){
       	return this.mentalIllnessOnFamilySocietyImpact;
     }
     public void setMentalIllnessOnFamilySocietyImpact(String mentalIllnessOnFamilySocietyImpact){
       	this.mentalIllnessOnFamilySocietyImpact=mentalIllnessOnFamilySocietyImpact;
     }
     public Integer getIllnessOnFamilySocietyInfluenceTimes(){
       	return this.illnessOnFamilySocietyInfluenceTimes;
     }
     public void setIllnessOnFamilySocietyInfluenceTimes(Integer illnessOnFamilySocietyInfluenceTimes){
       	this.illnessOnFamilySocietyInfluenceTimes=illnessOnFamilySocietyInfluenceTimes;
     }
     public String getLockCaseCode(){
       	return this.lockCaseCode;
     }
     public void setLockCaseCode(String lockCaseCode){
       	this.lockCaseCode=lockCaseCode;
     }
     public String getInpatientCode(){
       	return this.inpatientCode;
     }
     public void setInpatientCode(String inpatientCode){
       	this.inpatientCode=inpatientCode;
     }
     public Boolean getAuxiliaryInspectionMark(){
       	return this.auxiliaryInspectionMark;
     }
     public void setAuxiliaryInspectionMark(Boolean auxiliaryInspectionMark){
       	this.auxiliaryInspectionMark=auxiliaryInspectionMark;
     }
     public String getAuxiliaryExaminationProject(){
       	return this.auxiliaryExaminationProject;
     }
     public void setAuxiliaryExaminationProject(String auxiliaryExaminationProject){
       	this.auxiliaryExaminationProject=auxiliaryExaminationProject;
     }
     public Date getTestDate(){
       	return this.testDate;
     }
     public void setTestDate(Date testDate){
       	this.testDate=testDate;
     }
     public String getAuxiliaryExaminationResults(){
       	return this.auxiliaryExaminationResults;
     }
     public void setAuxiliaryExaminationResults(String auxiliaryExaminationResults){
       	this.auxiliaryExaminationResults=auxiliaryExaminationResults;
     }
     public String getFollowupEvaluationResultsCode(){
       	return this.followupEvaluationResultsCode;
     }
     public void setFollowupEvaluationResultsCode(String followupEvaluationResultsCode){
       	this.followupEvaluationResultsCode=followupEvaluationResultsCode;
     }
     public String getPsychiatricRehabilitationCode(){
       	return this.psychiatricRehabilitationCode;
     }
     public void setPsychiatricRehabilitationCode(String psychiatricRehabilitationCode){
       	this.psychiatricRehabilitationCode=psychiatricRehabilitationCode;
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
     public String getCnMedicationTypeCode(){
       	return this.cnMedicationTypeCode;
     }
     public void setCnMedicationTypeCode(String cnMedicationTypeCode){
       	this.cnMedicationTypeCode=cnMedicationTypeCode;
     }
     public String getFreqCode(){
       	return this.freqCode;
     }
     public void setFreqCode(String freqCode){
       	this.freqCode=freqCode;
     }
     public String getMedicationComplianceCode(){
       	return this.medicationComplianceCode;
     }
     public void setMedicationComplianceCode(String medicationComplianceCode){
       	this.medicationComplianceCode=medicationComplianceCode;
     }
     public String getDrugAdverseReaction(){
       	return this.drugAdverseReaction;
     }
     public void setDrugAdverseReaction(String drugAdverseReaction){
       	this.drugAdverseReaction=drugAdverseReaction;
     }
     public Float getDrugTotalDose(){
       	return this.drugTotalDose;
     }
     public void setDrugTotalDose(Float drugTotalDose){
       	this.drugTotalDose=drugTotalDose;
     }
     public String getDrugTotalDoseUtil(){
       	return this.drugTotalDoseUtil;
     }
     public void setDrugTotalDoseUtil(String drugTotalDoseUtil){
       	this.drugTotalDoseUtil=drugTotalDoseUtil;
     }
     public String getMedicationCd(){
       	return this.medicationCd;
     }
     public void setMedicationCd(String medicationCd){
       	this.medicationCd=medicationCd;
     }
     public String getMedicationName(){
       	return this.medicationName;
     }
     public void setMedicationName(String medicationName){
       	this.medicationName=medicationName;
     }
     public String getDrugDosageForms(){
       	return this.drugDosageForms;
     }
     public void setDrugDosageForms(String drugDosageForms){
       	this.drugDosageForms=drugDosageForms;
     }
     public String getDrugDosageFormsName(){
       	return this.drugDosageFormsName;
     }
     public void setDrugDosageFormsName(String drugDosageFormsName){
       	this.drugDosageFormsName=drugDosageFormsName;
     }
     public Date getStart(){
       	return this.start;
     }
     public void setStart(Date start){
       	this.start=start;
     }
     public Float getDuration(){
       	return this.duration;
     }
     public void setDuration(Float duration){
       	this.duration=duration;
     }
     public String getDosageCode(){
       	return this.dosageCode;
     }
     public void setDosageCode(String dosageCode){
       	this.dosageCode=dosageCode;
     }
     public String getcMedCode(){
       	return this.cMedCode;
     }
     public void setcMedCode(String cMedCode){
       	this.cMedCode=cMedCode;
     }
     public Float getOnceValue(){
       	return this.onceValue;
     }
     public void setOnceValue(Float onceValue){
       	this.onceValue=onceValue;
     }
     public String getOnceUnit(){
       	return this.onceUnit;
     }
     public void setOnceUnit(String onceUnit){
       	this.onceUnit=onceUnit;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}