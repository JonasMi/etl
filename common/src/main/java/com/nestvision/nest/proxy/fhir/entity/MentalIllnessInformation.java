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
@Table(name = BaseEntity.TABLE_PREFIX + "MENTAL_ILLNESS_INFORMATION")
public class MentalIllnessInformation extends FhirResourceEntity {

    /**
     *名称:重性精神疾病患者个人信息登记id
     *
 	 *
 	 *主键字段
     */
     @Column(name="SMIPIR_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="SMIPIR_ID",displayName="重性精神疾病患者个人信息登记id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String smipirId;
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
     *名称:联系人电话号码
     *
 	 *
 	 *
     */
     @Column(name="CONTACTS_PHONE",length = 20,nullable = true)
     @FhirFieldValidate(name="CONTACTS_PHONE",displayName="联系人电话号码",maxLength=20,required=false,valuesRange="")   
     private String contactsPhone;
    /**
     *名称:联系人-家庭住址-省（自治区、直辖市）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="CONTACTS_HOME_STATE",length = 10,nullable = true)
     @FhirFieldValidate(name="CONTACTS_HOME_STATE",displayName="联系人-家庭住址-省（自治区、直辖市）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String contactsHomeState;
    /**
     *名称:联系人-家庭住址-市（地区）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="CONTACTS_HOME_CITY",length = 10,nullable = true)
     @FhirFieldValidate(name="CONTACTS_HOME_CITY",displayName="联系人-家庭住址-市（地区）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String contactsHomeCity;
    /**
     *名称:联系人-家庭住址-县（区）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="CONTACTS_HOME_DISTRICT",length = 10,nullable = true)
     @FhirFieldValidate(name="CONTACTS_HOME_DISTRICT",displayName="联系人-家庭住址-县（区）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String contactsHomeDistrict;
    /**
     *名称:联系人-家庭住址-乡（镇、街道办事处）
     *
 	 *
 	 *
     */
     @Column(name="CONTACTS_HOME_LINE",length = 100,nullable = true)
     @FhirFieldValidate(name="CONTACTS_HOME_LINE",displayName="联系人-家庭住址-乡（镇、街道办事处）",maxLength=100,required=false,valuesRange="")   
     private String contactsHomeLine;
    /**
     *名称:联系人-家庭住址-村（街、路、弄等）
     *
 	 *
 	 *
     */
     @Column(name="CONTACTS_HOME_ROAD",length = 100,nullable = true)
     @FhirFieldValidate(name="CONTACTS_HOME_ROAD",displayName="联系人-家庭住址-村（街、路、弄等）",maxLength=100,required=false,valuesRange="")   
     private String contactsHomeRoad;
    /**
     *名称:联系人-家庭住址-门牌号码
     *
 	 *
 	 *
     */
     @Column(name="CONTACTS_HOME_HOUSE_NO",length = 50,nullable = true)
     @FhirFieldValidate(name="CONTACTS_HOME_HOUSE_NO",displayName="联系人-家庭住址-门牌号码",maxLength=50,required=false,valuesRange="")   
     private String contactsHomeHouseNo;
    /**
     *名称:联系人-家庭住址-详细信息
     *
 	 *
 	 *
     */
     @Column(name="CONTACTS_HOME_TEXT",length = 500,nullable = true)
     @FhirFieldValidate(name="CONTACTS_HOME_TEXT",displayName="联系人-家庭住址-详细信息",maxLength=500,required=false,valuesRange="")   
     private String contactsHomeText;
    /**
     *名称:知情同意管理标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="INFORMED_CONSENT_MANAGEMENT_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="INFORMED_CONSENT_MANAGEMENT_MARK",displayName="知情同意管理标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean informedConsentManagementMark;
    /**
     *名称:知情同意签字人姓名
     *
 	 *
 	 *
     */
     @Column(name="INFORMED_CONSENT_SIGNATURE",length = 40,nullable = true)
     @FhirFieldValidate(name="INFORMED_CONSENT_SIGNATURE",displayName="知情同意签字人姓名",maxLength=40,required=false,valuesRange="")   
     private String informedConsentSignature;
    /**
     *名称:知情同意签字日期
     *
 	 *
 	 *
     */
     @Column(name="INFORMED_CONSENT_SIGNATURE_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="INFORMED_CONSENT_SIGNATURE_DATE",displayName="知情同意签字日期",required=false,valuesRange="")   
     private Date informedConsentSignatureDate;
    /**
     *名称:重性精神疾病患者首次发病年龄（岁）
     *
 	 *
 	 *
     */
     @Column(name="SEVERE_MENTAL_ILLNESS_PATIENTS_FIRST_ONSET_AGE",length = 8,nullable = true)
     @FhirFieldValidate(name="SEVERE_MENTAL_ILLNESS_PATIENTS_FIRST_ONSET_AGE",displayName="重性精神疾病患者首次发病年龄（岁）",maxLength=8,required=false,valuesRange="")   
     private Float severeMentalIllnessPatientsFirstOnsetAge;
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
     *名称:既往门诊治疗情况代码
     *
 	 *
 	 *
     */
     @Column(name="PREVIOUS_OUTPATIENT_TREATMENT_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="PREVIOUS_OUTPATIENT_TREATMENT_CODE",displayName="既往门诊治疗情况代码",maxLength=20,required=false,valuesRange="")   
     private String previousOutpatientTreatmentCode;
    /**
     *名称:首次抗精神神病治疗日期
     *
 	 *
 	 *
     */
     @Column(name="FIRST_TREATMENT_ANTIPSYCHOTIC_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="FIRST_TREATMENT_ANTIPSYCHOTIC_DATE",displayName="首次抗精神神病治疗日期",required=false,valuesRange="")   
     private Date firstTreatmentAntipsychoticDate;
    /**
     *名称:既往精神专科住院次数
     *
 	 *
 	 *
     */
     @Column(name="PAST_PSYCHIATRIC_HOSPITAL_TIMES",length = 4,nullable = true)
     @FhirFieldValidate(name="PAST_PSYCHIATRIC_HOSPITAL_TIMES",displayName="既往精神专科住院次数",maxLength=4,required=false,valuesRange="")   
     private Integer pastPsychiatricHospitalTimes;
    /**
     *名称:疾病转归代码
     *
 	 *限制:CV0510010
 	 *
     */
     @Column(name="TREATMENT_RESULT_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="TREATMENT_RESULT_CODE",displayName="疾病转归代码",maxLength=20,required=false,valuesRange="CV0510010")   
     private String treatmentResultCode;
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
     *名称:经济情况代码
     *
 	 *限制:CV9900069
 	 *
     */
     @Column(name="ECONOMIC_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="ECONOMIC_CODE",displayName="经济情况代码",maxLength=20,required=false,valuesRange="CV9900069")   
     private String economicCode;
    /**
     *名称:重性精神疾病名称代码
     *
 	 *限制:CV0501036
 	 *
     */
     @Column(name="SEVERE_MENTAL_ILLNESS_NAME_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="SEVERE_MENTAL_ILLNESS_NAME_CODE",displayName="重性精神疾病名称代码",maxLength=20,required=false,valuesRange="CV0501036")   
     private String severeMentalIllnessNameCode;
    /**
     *名称:确诊医疗机构名称
     *
 	 *
 	 *
     */
     @Column(name="DIAGNOSTIC_MEDICAL_INSTITUTION_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="DIAGNOSTIC_MEDICAL_INSTITUTION_NAME",displayName="确诊医疗机构名称",maxLength=40,required=false,valuesRange="")   
     private String diagnosticMedicalInstitutionName;
    /**
     *名称:专科医生意见
     *
 	 *
 	 *
     */
     @Column(name="SPECIALIST_ADVICE",length = 200,nullable = true)
     @FhirFieldValidate(name="SPECIALIST_ADVICE",displayName="专科医生意见",maxLength=200,required=false,valuesRange="")   
     private String specialistAdvice;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getSmipirId(){
       	return this.smipirId;
     }
     public void setSmipirId(String smipirId){
       	this.smipirId=smipirId;
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
     public String getContactsPhone(){
       	return this.contactsPhone;
     }
     public void setContactsPhone(String contactsPhone){
       	this.contactsPhone=contactsPhone;
     }
     public String getContactsHomeState(){
       	return this.contactsHomeState;
     }
     public void setContactsHomeState(String contactsHomeState){
       	this.contactsHomeState=contactsHomeState;
     }
     public String getContactsHomeCity(){
       	return this.contactsHomeCity;
     }
     public void setContactsHomeCity(String contactsHomeCity){
       	this.contactsHomeCity=contactsHomeCity;
     }
     public String getContactsHomeDistrict(){
       	return this.contactsHomeDistrict;
     }
     public void setContactsHomeDistrict(String contactsHomeDistrict){
       	this.contactsHomeDistrict=contactsHomeDistrict;
     }
     public String getContactsHomeLine(){
       	return this.contactsHomeLine;
     }
     public void setContactsHomeLine(String contactsHomeLine){
       	this.contactsHomeLine=contactsHomeLine;
     }
     public String getContactsHomeRoad(){
       	return this.contactsHomeRoad;
     }
     public void setContactsHomeRoad(String contactsHomeRoad){
       	this.contactsHomeRoad=contactsHomeRoad;
     }
     public String getContactsHomeHouseNo(){
       	return this.contactsHomeHouseNo;
     }
     public void setContactsHomeHouseNo(String contactsHomeHouseNo){
       	this.contactsHomeHouseNo=contactsHomeHouseNo;
     }
     public String getContactsHomeText(){
       	return this.contactsHomeText;
     }
     public void setContactsHomeText(String contactsHomeText){
       	this.contactsHomeText=contactsHomeText;
     }
     public Boolean getInformedConsentManagementMark(){
       	return this.informedConsentManagementMark;
     }
     public void setInformedConsentManagementMark(Boolean informedConsentManagementMark){
       	this.informedConsentManagementMark=informedConsentManagementMark;
     }
     public String getInformedConsentSignature(){
       	return this.informedConsentSignature;
     }
     public void setInformedConsentSignature(String informedConsentSignature){
       	this.informedConsentSignature=informedConsentSignature;
     }
     public Date getInformedConsentSignatureDate(){
       	return this.informedConsentSignatureDate;
     }
     public void setInformedConsentSignatureDate(Date informedConsentSignatureDate){
       	this.informedConsentSignatureDate=informedConsentSignatureDate;
     }
     public Float getSevereMentalIllnessPatientsFirstOnsetAge(){
       	return this.severeMentalIllnessPatientsFirstOnsetAge;
     }
     public void setSevereMentalIllnessPatientsFirstOnsetAge(Float severeMentalIllnessPatientsFirstOnsetAge){
       	this.severeMentalIllnessPatientsFirstOnsetAge=severeMentalIllnessPatientsFirstOnsetAge;
     }
     public String getMentalSymptomCode(){
       	return this.mentalSymptomCode;
     }
     public void setMentalSymptomCode(String mentalSymptomCode){
       	this.mentalSymptomCode=mentalSymptomCode;
     }
     public String getPreviousOutpatientTreatmentCode(){
       	return this.previousOutpatientTreatmentCode;
     }
     public void setPreviousOutpatientTreatmentCode(String previousOutpatientTreatmentCode){
       	this.previousOutpatientTreatmentCode=previousOutpatientTreatmentCode;
     }
     public Date getFirstTreatmentAntipsychoticDate(){
       	return this.firstTreatmentAntipsychoticDate;
     }
     public void setFirstTreatmentAntipsychoticDate(Date firstTreatmentAntipsychoticDate){
       	this.firstTreatmentAntipsychoticDate=firstTreatmentAntipsychoticDate;
     }
     public Integer getPastPsychiatricHospitalTimes(){
       	return this.pastPsychiatricHospitalTimes;
     }
     public void setPastPsychiatricHospitalTimes(Integer pastPsychiatricHospitalTimes){
       	this.pastPsychiatricHospitalTimes=pastPsychiatricHospitalTimes;
     }
     public String getTreatmentResultCode(){
       	return this.treatmentResultCode;
     }
     public void setTreatmentResultCode(String treatmentResultCode){
       	this.treatmentResultCode=treatmentResultCode;
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
     public String getEconomicCode(){
       	return this.economicCode;
     }
     public void setEconomicCode(String economicCode){
       	this.economicCode=economicCode;
     }
     public String getSevereMentalIllnessNameCode(){
       	return this.severeMentalIllnessNameCode;
     }
     public void setSevereMentalIllnessNameCode(String severeMentalIllnessNameCode){
       	this.severeMentalIllnessNameCode=severeMentalIllnessNameCode;
     }
     public String getDiagnosticMedicalInstitutionName(){
       	return this.diagnosticMedicalInstitutionName;
     }
     public void setDiagnosticMedicalInstitutionName(String diagnosticMedicalInstitutionName){
       	this.diagnosticMedicalInstitutionName=diagnosticMedicalInstitutionName;
     }
     public String getSpecialistAdvice(){
       	return this.specialistAdvice;
     }
     public void setSpecialistAdvice(String specialistAdvice){
       	this.specialistAdvice=specialistAdvice;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}