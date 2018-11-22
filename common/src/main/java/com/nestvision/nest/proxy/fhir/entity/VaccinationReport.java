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
@Table(name = BaseEntity.TABLE_PREFIX + "VACCINATION_REPORT")
public class VaccinationReport extends FhirResourceEntity {

    /**
     *名称:预防接种报告id
     *
 	 *
 	 *主键字段
     */
     @Column(name="VACCINATION_REPORT_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="VACCINATION_REPORT_ID",displayName="预防接种报告id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String vaccinationReportId;
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
     *名称:迁入时间
     *
 	 *
 	 *
     */
     @Column(name="MIGRATION_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="MIGRATION_TIME",displayName="迁入时间",required=false,valuesRange="")   
     private Date migrationTime;
    /**
     *名称:迁出时间
     *
 	 *
 	 *
     */
     @Column(name="MOVEOUT_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="MOVEOUT_TIME",displayName="迁出时间",required=false,valuesRange="")   
     private Date moveoutTime;
    /**
     *名称:搬迁原因
     *
 	 *
 	 *
     */
     @Column(name="REASON_FOR_REMOVAL",length = 200,nullable = true)
     @FhirFieldValidate(name="REASON_FOR_REMOVAL",displayName="搬迁原因",maxLength=200,required=false,valuesRange="")   
     private String reasonForRemoval;
    /**
     *名称:既往所患传染病名称描述
     *
 	 *
 	 *
     */
     @Column(name="INFECTIOUS_NAME_DISEASE",length = 200,nullable = true)
     @FhirFieldValidate(name="INFECTIOUS_NAME_DISEASE",displayName="既往所患传染病名称描述",maxLength=200,required=false,valuesRange="")   
     private String infectiousNameDisease;
    /**
     *名称:接种日期
     *
 	 *
 	 *
     */
     @Column(name="VACCINATION_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="VACCINATION_DATE",displayName="接种日期",required=false,valuesRange="")   
     private Date vaccinationDate;
    /**
     *名称:接种剂次
     *
 	 *
 	 *
     */
     @Column(name="INOCULUM_DOSE",length = 8,nullable = true)
     @FhirFieldValidate(name="INOCULUM_DOSE",displayName="接种剂次",maxLength=8,required=false,valuesRange="")   
     private Float inoculumDose;
    /**
     *名称:接种部位
     *
 	 *
 	 *
     */
     @Column(name="INOCULATION_SITE",length = 200,nullable = true)
     @FhirFieldValidate(name="INOCULATION_SITE",displayName="接种部位",maxLength=200,required=false,valuesRange="")   
     private String inoculationSite;
    /**
     *名称:接种医生编号
     *
 	 *
 	 *
     */
     @Column(name="VACCINATION_DOCTOR_NUMBER",length = 40,nullable = true)
     @FhirFieldValidate(name="VACCINATION_DOCTOR_NUMBER",displayName="接种医生编号",maxLength=40,required=false,valuesRange="")   
     private String vaccinationDoctorNumber;
    /**
     *名称:接种医生名称
     *
 	 *
 	 *
     */
     @Column(name="VACCINATION_DOCTOR_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="VACCINATION_DOCTOR_NAME",displayName="接种医生名称",maxLength=40,required=false,valuesRange="")   
     private String vaccinationDoctorName;
    /**
     *名称:接种机构编号
     *
 	 *
 	 *
     */
     @Column(name="VACCINATION_ORG_NUMBER",length = 40,nullable = true)
     @FhirFieldValidate(name="VACCINATION_ORG_NUMBER",displayName="接种机构编号",maxLength=40,required=false,valuesRange="")   
     private String vaccinationOrgNumber;
    /**
     *名称:接种机构名称
     *
 	 *
 	 *
     */
     @Column(name="VACCINATION_ORG_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="VACCINATION_ORG_NAME",displayName="接种机构名称",maxLength=40,required=false,valuesRange="")   
     private String vaccinationOrgName;
    /**
     *名称:疫苗异常反应史
     *
 	 *
 	 *
     */
     @Column(name="REACTIONS_ABNORMAL_DESCRIPTION_HISTORY",length = 1000,nullable = true)
     @FhirFieldValidate(name="REACTIONS_ABNORMAL_DESCRIPTION_HISTORY",displayName="疫苗异常反应史",maxLength=1000,required=false,valuesRange="")   
     private String reactionsAbnormalDescriptionHistory;
    /**
     *名称:接种禁忌
     *
 	 *
 	 *
     */
     @Column(name="VACCINATION_TABOO",length = 200,nullable = true)
     @FhirFieldValidate(name="VACCINATION_TABOO",displayName="接种禁忌",maxLength=200,required=false,valuesRange="")   
     private String vaccinationTaboo;
    /**
     *名称:疫苗有效期
     *
 	 *
 	 *
     */
     @Column(name="VACCINE_VALIDITY",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="VACCINE_VALIDITY",displayName="疫苗有效期",required=false,valuesRange="")   
     private Date vaccineValidity;
    /**
     *名称:疫苗批号
     *
 	 *
 	 *
     */
     @Column(name="VACCINE_LOT",length = 40,nullable = true)
     @FhirFieldValidate(name="VACCINE_LOT",displayName="疫苗批号",maxLength=40,required=false,valuesRange="")   
     private String vaccineLot;
    /**
     *名称:疫苗名称
     *
 	 *
 	 *
     */
     @Column(name="VACCINE_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="VACCINE_NAME",displayName="疫苗名称",maxLength=40,required=false,valuesRange="")   
     private String vaccineName;
    /**
     *名称:疫苗生产厂商编号
     *
 	 *
 	 *
     */
     @Column(name="VACCINE_ORG_NUMBER",length = 40,nullable = true)
     @FhirFieldValidate(name="VACCINE_ORG_NUMBER",displayName="疫苗生产厂商编号",maxLength=40,required=false,valuesRange="")   
     private String vaccineOrgNumber;
    /**
     *名称:疫苗生产厂商名称
     *
 	 *
 	 *
     */
     @Column(name="VACCINE_ORG_NAME",length = 80,nullable = true)
     @FhirFieldValidate(name="VACCINE_ORG_NAME",displayName="疫苗生产厂商名称",maxLength=80,required=false,valuesRange="")   
     private String vaccineOrgName;
    /**
     *名称:引起不良反应的可疑疫苗名称代码
     *
 	 *限制:CV0850001
 	 *
     */
     @Column(name="VACCINE_NAME_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="VACCINE_NAME_CODE",displayName="引起不良反应的可疑疫苗名称代码",maxLength=20,required=false,valuesRange="CV0850001")   
     private String vaccineNameCode;
    /**
     *名称:预防接种后不良反应临床诊断代码
     *
 	 *限制:CV0501032
 	 *
     */
     @Column(name="ADVERSE_REACTIONS_SUSPECT_VACCINE_NAME_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="ADVERSE_REACTIONS_SUSPECT_VACCINE_NAME_CODE",displayName="预防接种后不良反应临床诊断代码",maxLength=20,required=false,valuesRange="CV0501032")   
     private String adverseReactionsSuspectVaccineNameCode;
    /**
     *名称:不良反应发生日期
     *
 	 *
 	 *
     */
     @Column(name="ADVERSE_REACTIONS_OCCURRENCE_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="ADVERSE_REACTIONS_OCCURRENCE_DATE",displayName="不良反应发生日期",required=false,valuesRange="")   
     private Date adverseReactionsOccurrenceDate;
    /**
     *名称:不良反应处理结果
     *
 	 *
 	 *
     */
     @Column(name="ADVERSE_DRUG_REACTION",length = 200,nullable = true)
     @FhirFieldValidate(name="ADVERSE_DRUG_REACTION",displayName="不良反应处理结果",maxLength=200,required=false,valuesRange="")   
     private String adverseDrugReaction;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getVaccinationReportId(){
       	return this.vaccinationReportId;
     }
     public void setVaccinationReportId(String vaccinationReportId){
       	this.vaccinationReportId=vaccinationReportId;
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
     public Date getMigrationTime(){
       	return this.migrationTime;
     }
     public void setMigrationTime(Date migrationTime){
       	this.migrationTime=migrationTime;
     }
     public Date getMoveoutTime(){
       	return this.moveoutTime;
     }
     public void setMoveoutTime(Date moveoutTime){
       	this.moveoutTime=moveoutTime;
     }
     public String getReasonForRemoval(){
       	return this.reasonForRemoval;
     }
     public void setReasonForRemoval(String reasonForRemoval){
       	this.reasonForRemoval=reasonForRemoval;
     }
     public String getInfectiousNameDisease(){
       	return this.infectiousNameDisease;
     }
     public void setInfectiousNameDisease(String infectiousNameDisease){
       	this.infectiousNameDisease=infectiousNameDisease;
     }
     public Date getVaccinationDate(){
       	return this.vaccinationDate;
     }
     public void setVaccinationDate(Date vaccinationDate){
       	this.vaccinationDate=vaccinationDate;
     }
     public Float getInoculumDose(){
       	return this.inoculumDose;
     }
     public void setInoculumDose(Float inoculumDose){
       	this.inoculumDose=inoculumDose;
     }
     public String getInoculationSite(){
       	return this.inoculationSite;
     }
     public void setInoculationSite(String inoculationSite){
       	this.inoculationSite=inoculationSite;
     }
     public String getVaccinationDoctorNumber(){
       	return this.vaccinationDoctorNumber;
     }
     public void setVaccinationDoctorNumber(String vaccinationDoctorNumber){
       	this.vaccinationDoctorNumber=vaccinationDoctorNumber;
     }
     public String getVaccinationDoctorName(){
       	return this.vaccinationDoctorName;
     }
     public void setVaccinationDoctorName(String vaccinationDoctorName){
       	this.vaccinationDoctorName=vaccinationDoctorName;
     }
     public String getVaccinationOrgNumber(){
       	return this.vaccinationOrgNumber;
     }
     public void setVaccinationOrgNumber(String vaccinationOrgNumber){
       	this.vaccinationOrgNumber=vaccinationOrgNumber;
     }
     public String getVaccinationOrgName(){
       	return this.vaccinationOrgName;
     }
     public void setVaccinationOrgName(String vaccinationOrgName){
       	this.vaccinationOrgName=vaccinationOrgName;
     }
     public String getReactionsAbnormalDescriptionHistory(){
       	return this.reactionsAbnormalDescriptionHistory;
     }
     public void setReactionsAbnormalDescriptionHistory(String reactionsAbnormalDescriptionHistory){
       	this.reactionsAbnormalDescriptionHistory=reactionsAbnormalDescriptionHistory;
     }
     public String getVaccinationTaboo(){
       	return this.vaccinationTaboo;
     }
     public void setVaccinationTaboo(String vaccinationTaboo){
       	this.vaccinationTaboo=vaccinationTaboo;
     }
     public Date getVaccineValidity(){
       	return this.vaccineValidity;
     }
     public void setVaccineValidity(Date vaccineValidity){
       	this.vaccineValidity=vaccineValidity;
     }
     public String getVaccineLot(){
       	return this.vaccineLot;
     }
     public void setVaccineLot(String vaccineLot){
       	this.vaccineLot=vaccineLot;
     }
     public String getVaccineName(){
       	return this.vaccineName;
     }
     public void setVaccineName(String vaccineName){
       	this.vaccineName=vaccineName;
     }
     public String getVaccineOrgNumber(){
       	return this.vaccineOrgNumber;
     }
     public void setVaccineOrgNumber(String vaccineOrgNumber){
       	this.vaccineOrgNumber=vaccineOrgNumber;
     }
     public String getVaccineOrgName(){
       	return this.vaccineOrgName;
     }
     public void setVaccineOrgName(String vaccineOrgName){
       	this.vaccineOrgName=vaccineOrgName;
     }
     public String getVaccineNameCode(){
       	return this.vaccineNameCode;
     }
     public void setVaccineNameCode(String vaccineNameCode){
       	this.vaccineNameCode=vaccineNameCode;
     }
     public String getAdverseReactionsSuspectVaccineNameCode(){
       	return this.adverseReactionsSuspectVaccineNameCode;
     }
     public void setAdverseReactionsSuspectVaccineNameCode(String adverseReactionsSuspectVaccineNameCode){
       	this.adverseReactionsSuspectVaccineNameCode=adverseReactionsSuspectVaccineNameCode;
     }
     public Date getAdverseReactionsOccurrenceDate(){
       	return this.adverseReactionsOccurrenceDate;
     }
     public void setAdverseReactionsOccurrenceDate(Date adverseReactionsOccurrenceDate){
       	this.adverseReactionsOccurrenceDate=adverseReactionsOccurrenceDate;
     }
     public String getAdverseDrugReaction(){
       	return this.adverseDrugReaction;
     }
     public void setAdverseDrugReaction(String adverseDrugReaction){
       	this.adverseDrugReaction=adverseDrugReaction;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}