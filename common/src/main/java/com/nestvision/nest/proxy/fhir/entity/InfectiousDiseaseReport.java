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
@Table(name = BaseEntity.TABLE_PREFIX + "INFECTIOUS_DISEASE_REPORT")
public class InfectiousDiseaseReport extends FhirResourceEntity {

    /**
     *名称:传染病报告id
     *
 	 *
 	 *主键字段
     */
     @Column(name="INFECTIOUS_DISEASE_REPORT_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="INFECTIOUS_DISEASE_REPORT_ID",displayName="传染病报告id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String infectiousDiseaseReportId;
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
     *名称:户籍登记所在地址的省、自治区或直辖市名称
     *
 	 *
 	 *
     */
     @Column(name="RPR_ADDR_PROVINCE",length = 40,nullable = true)
     @FhirFieldValidate(name="RPR_ADDR_PROVINCE",displayName="户籍登记所在地址的省、自治区或直辖市名称",maxLength=40,required=false,valuesRange="")   
     private String rprAddrProvince;
    /**
     *名称:户籍登记所在地址的市、地区或州的名称
     *
 	 *
 	 *
     */
     @Column(name="RPR_ADDR_CITY",length = 40,nullable = true)
     @FhirFieldValidate(name="RPR_ADDR_CITY",displayName="户籍登记所在地址的市、地区或州的名称",maxLength=40,required=false,valuesRange="")   
     private String rprAddrCity;
    /**
     *名称:户籍登记所在地址的县（区）的名称
     *
 	 *
 	 *
     */
     @Column(name="RPR_ADDR_AREA",length = 40,nullable = true)
     @FhirFieldValidate(name="RPR_ADDR_AREA",displayName="户籍登记所在地址的县（区）的名称",maxLength=40,required=false,valuesRange="")   
     private String rprAddrArea;
    /**
     *名称:户籍登记所在地址的乡、镇或城市的街道办事处名称
     *
 	 *
 	 *
     */
     @Column(name="RPR_ADDR_STREET",length = 40,nullable = true)
     @FhirFieldValidate(name="RPR_ADDR_STREET",displayName="户籍登记所在地址的乡、镇或城市的街道办事处名称",maxLength=40,required=false,valuesRange="")   
     private String rprAddrStreet;
    /**
     *名称:户籍登记所在地址的村或城市的街、路、里、弄等名称
     *
 	 *
 	 *
     */
     @Column(name="RPR_ADDR_VILLAGE",length = 40,nullable = true)
     @FhirFieldValidate(name="RPR_ADDR_VILLAGE",displayName="户籍登记所在地址的村或城市的街、路、里、弄等名称",maxLength=40,required=false,valuesRange="")   
     private String rprAddrVillage;
    /**
     *名称:户籍登记所在地址的门牌号码
     *
 	 *
 	 *
     */
     @Column(name="RPR_ADDR_HOUSE",length = 40,nullable = true)
     @FhirFieldValidate(name="RPR_ADDR_HOUSE",displayName="户籍登记所在地址的门牌号码",maxLength=40,required=false,valuesRange="")   
     private String rprAddrHouse;
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
     *名称:诊断编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="DIAGNOSIS",length = 20,nullable = true)
     @FhirFieldValidate(name="DIAGNOSIS",displayName="诊断编码",maxLength=20,required=false,valuesRange="CV990111")   
     private String diagnosis;
    /**
     *名称:诊断编码名称
     *
 	 *
 	 *
     */
     @Column(name="DIAGNOSIS_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="DIAGNOSIS_NAME",displayName="诊断编码名称",maxLength=40,required=false,valuesRange="")   
     private String diagnosisName;
    /**
     *名称:诊断日期
     *
 	 *
 	 *
     */
     @Column(name="DIAGNOSIS_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DIAGNOSIS_DATE",displayName="诊断日期",required=false,valuesRange="")   
     private Date diagnosisDate;
    /**
     *名称:传染病首次出现症状日期
     *
 	 *
 	 *
     */
     @Column(name="INFECTIOUS_DISEASE_FIRST_SYMPTOMS_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="INFECTIOUS_DISEASE_FIRST_SYMPTOMS_DATE",displayName="传染病首次出现症状日期",required=false,valuesRange="")   
     private Date infectiousDiseaseFirstSymptomsDate;
    /**
     *名称:传染病死亡日期
     *
 	 *
 	 *
     */
     @Column(name="INFECTIOUS_DISEASES_DEATH_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="INFECTIOUS_DISEASES_DEATH_DATE",displayName="传染病死亡日期",required=false,valuesRange="")   
     private Date infectiousDiseasesDeathDate;
    /**
     *名称:报告卡类别代码
     *
 	 *限制:CV9900063
 	 *
     */
     @Column(name="REPORT_CARD_TYPE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="REPORT_CARD_TYPE_CODE",displayName="报告卡类别代码",maxLength=20,required=false,valuesRange="CV9900063")   
     private String reportCardTypeCode;
    /**
     *名称:传染病患者归属代码
     *
 	 *限制:CV0201104
 	 *
     */
     @Column(name="INFECTIOUS_DISEASE_ATTRIBUTION_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="INFECTIOUS_DISEASE_ATTRIBUTION_CODE",displayName="传染病患者归属代码",maxLength=20,required=false,valuesRange="CV0201104")   
     private String infectiousDiseaseAttributionCode;
    /**
     *名称:退卡原因
     *
 	 *
 	 *
     */
     @Column(name="WITHDRAWAL_REASONS",length = 200,nullable = true)
     @FhirFieldValidate(name="WITHDRAWAL_REASONS",displayName="退卡原因",maxLength=200,required=false,valuesRange="")   
     private String withdrawalReasons;
    /**
     *名称:发病类别代码
     *
 	 *限制:CV9900064
 	 *
     */
     @Column(name="MORBIDITY_TYPE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="MORBIDITY_TYPE_CODE",displayName="发病类别代码",maxLength=20,required=false,valuesRange="CV9900064")   
     private String morbidityTypeCode;
    /**
     *名称:传染病类别代码
     *
 	 *限制:CV9900114
 	 *
     */
     @Column(name="INFECTIOUS_DISEASE_CATEGORY_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="INFECTIOUS_DISEASE_CATEGORY_CODE",displayName="传染病类别代码",maxLength=20,required=false,valuesRange="CV9900114")   
     private String infectiousDiseaseCategoryCode;
    /**
     *名称:传染病类别代码
     *
 	 *限制:CV0501017
 	 *
     */
     @Column(name="INFECTIOUS_DISEASE_NAME_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="INFECTIOUS_DISEASE_NAME_CODE",displayName="传染病类别代码",maxLength=20,required=false,valuesRange="CV0501017")   
     private String infectiousDiseaseNameCode;
    /**
     *名称:其他法定管理及重点监测传染病名称
     *
 	 *
 	 *
     */
     @Column(name="OTHER_INFECTIOUS_DISEASES_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="OTHER_INFECTIOUS_DISEASES_NAME",displayName="其他法定管理及重点监测传染病名称",maxLength=40,required=false,valuesRange="")   
     private String otherInfectiousDiseasesName;
    /**
     *名称:订正病名
     *
 	 *
 	 *
     */
     @Column(name="REVISED_DISEASE_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="REVISED_DISEASE_NAME",displayName="订正病名",maxLength=40,required=false,valuesRange="")   
     private String revisedDiseaseName;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getInfectiousDiseaseReportId(){
       	return this.infectiousDiseaseReportId;
     }
     public void setInfectiousDiseaseReportId(String infectiousDiseaseReportId){
       	this.infectiousDiseaseReportId=infectiousDiseaseReportId;
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
     public String getRprAddrProvince(){
       	return this.rprAddrProvince;
     }
     public void setRprAddrProvince(String rprAddrProvince){
       	this.rprAddrProvince=rprAddrProvince;
     }
     public String getRprAddrCity(){
       	return this.rprAddrCity;
     }
     public void setRprAddrCity(String rprAddrCity){
       	this.rprAddrCity=rprAddrCity;
     }
     public String getRprAddrArea(){
       	return this.rprAddrArea;
     }
     public void setRprAddrArea(String rprAddrArea){
       	this.rprAddrArea=rprAddrArea;
     }
     public String getRprAddrStreet(){
       	return this.rprAddrStreet;
     }
     public void setRprAddrStreet(String rprAddrStreet){
       	this.rprAddrStreet=rprAddrStreet;
     }
     public String getRprAddrVillage(){
       	return this.rprAddrVillage;
     }
     public void setRprAddrVillage(String rprAddrVillage){
       	this.rprAddrVillage=rprAddrVillage;
     }
     public String getRprAddrHouse(){
       	return this.rprAddrHouse;
     }
     public void setRprAddrHouse(String rprAddrHouse){
       	this.rprAddrHouse=rprAddrHouse;
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
     public String getDiagnosis(){
       	return this.diagnosis;
     }
     public void setDiagnosis(String diagnosis){
       	this.diagnosis=diagnosis;
     }
     public String getDiagnosisName(){
       	return this.diagnosisName;
     }
     public void setDiagnosisName(String diagnosisName){
       	this.diagnosisName=diagnosisName;
     }
     public Date getDiagnosisDate(){
       	return this.diagnosisDate;
     }
     public void setDiagnosisDate(Date diagnosisDate){
       	this.diagnosisDate=diagnosisDate;
     }
     public Date getInfectiousDiseaseFirstSymptomsDate(){
       	return this.infectiousDiseaseFirstSymptomsDate;
     }
     public void setInfectiousDiseaseFirstSymptomsDate(Date infectiousDiseaseFirstSymptomsDate){
       	this.infectiousDiseaseFirstSymptomsDate=infectiousDiseaseFirstSymptomsDate;
     }
     public Date getInfectiousDiseasesDeathDate(){
       	return this.infectiousDiseasesDeathDate;
     }
     public void setInfectiousDiseasesDeathDate(Date infectiousDiseasesDeathDate){
       	this.infectiousDiseasesDeathDate=infectiousDiseasesDeathDate;
     }
     public String getReportCardTypeCode(){
       	return this.reportCardTypeCode;
     }
     public void setReportCardTypeCode(String reportCardTypeCode){
       	this.reportCardTypeCode=reportCardTypeCode;
     }
     public String getInfectiousDiseaseAttributionCode(){
       	return this.infectiousDiseaseAttributionCode;
     }
     public void setInfectiousDiseaseAttributionCode(String infectiousDiseaseAttributionCode){
       	this.infectiousDiseaseAttributionCode=infectiousDiseaseAttributionCode;
     }
     public String getWithdrawalReasons(){
       	return this.withdrawalReasons;
     }
     public void setWithdrawalReasons(String withdrawalReasons){
       	this.withdrawalReasons=withdrawalReasons;
     }
     public String getMorbidityTypeCode(){
       	return this.morbidityTypeCode;
     }
     public void setMorbidityTypeCode(String morbidityTypeCode){
       	this.morbidityTypeCode=morbidityTypeCode;
     }
     public String getInfectiousDiseaseCategoryCode(){
       	return this.infectiousDiseaseCategoryCode;
     }
     public void setInfectiousDiseaseCategoryCode(String infectiousDiseaseCategoryCode){
       	this.infectiousDiseaseCategoryCode=infectiousDiseaseCategoryCode;
     }
     public String getInfectiousDiseaseNameCode(){
       	return this.infectiousDiseaseNameCode;
     }
     public void setInfectiousDiseaseNameCode(String infectiousDiseaseNameCode){
       	this.infectiousDiseaseNameCode=infectiousDiseaseNameCode;
     }
     public String getOtherInfectiousDiseasesName(){
       	return this.otherInfectiousDiseasesName;
     }
     public void setOtherInfectiousDiseasesName(String otherInfectiousDiseasesName){
       	this.otherInfectiousDiseasesName=otherInfectiousDiseasesName;
     }
     public String getRevisedDiseaseName(){
       	return this.revisedDiseaseName;
     }
     public void setRevisedDiseaseName(String revisedDiseaseName){
       	this.revisedDiseaseName=revisedDiseaseName;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}