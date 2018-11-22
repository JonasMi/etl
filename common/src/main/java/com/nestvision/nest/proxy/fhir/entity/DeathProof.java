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
@Table(name = BaseEntity.TABLE_PREFIX + "DEATH_PROOF")
public class DeathProof extends FhirResourceEntity {

    /**
     *名称:死亡医学证明id
     *
 	 *
 	 *主键字段
     */
     @Column(name="DEATH_PROOF_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="DEATH_PROOF_ID",displayName="死亡医学证明id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String deathProofId;
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
     *名称:民族代码
     *
 	 *限制:CV9900377
 	 *
     */
     @Column(name="NATION_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="NATION_CD",displayName="民族代码",maxLength=20,required=false,valuesRange="CV9900377")   
     private String nationCd;
    /**
     *名称:学历代码
     *
 	 *限制:GBT4658
 	 *
     */
     @Column(name="EDUCATION_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="EDUCATION_CD",displayName="学历代码",maxLength=20,required=false,valuesRange="GBT4658")   
     private String educationCd;
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
     *名称:婚姻状况代码
     *
 	 *限制:GBT22612
 	 *
     */
     @Column(name="MARITALSTATUS",length = 20,nullable = true)
     @FhirFieldValidate(name="MARITALSTATUS",displayName="婚姻状况代码",maxLength=20,required=false,valuesRange="GBT22612")   
     private String maritalstatus;
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
     *名称:死亡日期
     *
 	 *
 	 *
     */
     @Column(name="DEATH_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DEATH_DATE",displayName="死亡日期",required=false,valuesRange="")   
     private Date deathDate;
    /**
     *名称:死亡地点类别
     *
 	 *限制:CV0201103
 	 *
     */
     @Column(name="DEATH_PLACE_CATEGORY",length = 20,nullable = true)
     @FhirFieldValidate(name="DEATH_PLACE_CATEGORY",displayName="死亡地点类别",maxLength=20,required=false,valuesRange="CV0201103")   
     private String deathPlaceCategory;
    /**
     *名称:死亡医院
     *
 	 *
 	 *
     */
     @Column(name="DEATH_HOSPITAL",length = 40,nullable = true)
     @FhirFieldValidate(name="DEATH_HOSPITAL",displayName="死亡医院",maxLength=40,required=false,valuesRange="")   
     private String deathHospital;
    /**
     *名称:发病到死亡时长
     *
 	 *
 	 *
     */
     @Column(name="ONSET_TO_DEATH",length = 8,nullable = true)
     @FhirFieldValidate(name="ONSET_TO_DEATH",displayName="发病到死亡时长",maxLength=8,required=false,valuesRange="")   
     private Float onsetToDeath;
    /**
     *名称:最高诊断机构级别
     *
 	 *限制:CV0810004
 	 *
     */
     @Column(name="HIGHEST_DIAGNOSTIC_LEVEL",length = 20,nullable = true)
     @FhirFieldValidate(name="HIGHEST_DIAGNOSTIC_LEVEL",displayName="最高诊断机构级别",maxLength=20,required=false,valuesRange="CV0810004")   
     private String highestDiagnosticLevel;
    /**
     *名称:死亡最高诊断依据类别代码
     *
 	 *限制:CV0501037
 	 *
     */
     @Column(name="HIGHEST_DEATH_DIAGNOSIS_CATEGORY_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="HIGHEST_DEATH_DIAGNOSIS_CATEGORY_CODE",displayName="死亡最高诊断依据类别代码",maxLength=20,required=false,valuesRange="CV0501037")   
     private String highestDeathDiagnosisCategoryCode;
    /**
     *名称:直接死亡原因代码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="DIRECT_DEATH_REASON_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="DIRECT_DEATH_REASON_CD",displayName="直接死亡原因代码",maxLength=20,required=false,valuesRange="CV990111")   
     private String directDeathReasonCd;
    /**
     *名称:直接死亡原因名称
     *
 	 *
 	 *
     */
     @Column(name="DIRECT_DEATH_REASON_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="DIRECT_DEATH_REASON_NAME",displayName="直接死亡原因名称",maxLength=40,required=false,valuesRange="")   
     private String directDeathReasonName;
    /**
     *名称:其他疾病诊断代码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="OTHER_DISEASE_DIAGNOSIS_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="OTHER_DISEASE_DIAGNOSIS_CD",displayName="其他疾病诊断代码",maxLength=20,required=false,valuesRange="CV990111")   
     private String otherDiseaseDiagnosisCd;
    /**
     *名称:其他疾病诊断名称
     *
 	 *
 	 *
     */
     @Column(name="OTHER_DISEASE_DIAGNOSIS_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="OTHER_DISEASE_DIAGNOSIS_NAME",displayName="其他疾病诊断名称",maxLength=40,required=false,valuesRange="")   
     private String otherDiseaseDiagnosisName;
    /**
     *名称:根本死亡原因编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="UNDERLYING_DEATH_CAUSE_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="UNDERLYING_DEATH_CAUSE_CD",displayName="根本死亡原因编码",maxLength=20,required=false,valuesRange="CV990111")   
     private String underlyingDeathCauseCd;
    /**
     *名称:根本死亡原因名称
     *
 	 *
 	 *
     */
     @Column(name="UNDERLYING_DEATH_CAUSE_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="UNDERLYING_DEATH_CAUSE_NAME",displayName="根本死亡原因名称",maxLength=40,required=false,valuesRange="")   
     private String underlyingDeathCauseName;
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
     *名称:医师签名
     *
 	 *
 	 *
     */
     @Column(name="PHYSICIAN",length = 20,nullable = true)
     @FhirFieldValidate(name="PHYSICIAN",displayName="医师签名",maxLength=20,required=false,valuesRange="")   
     private String physician;
    /**
     *名称:上传机构名称
     *备注:医疗机构在爱心医疗云平台中的唯一编码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getDeathProofId(){
       	return this.deathProofId;
     }
     public void setDeathProofId(String deathProofId){
       	this.deathProofId=deathProofId;
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
     public String getNationCd(){
       	return this.nationCd;
     }
     public void setNationCd(String nationCd){
       	this.nationCd=nationCd;
     }
     public String getEducationCd(){
       	return this.educationCd;
     }
     public void setEducationCd(String educationCd){
       	this.educationCd=educationCd;
     }
     public String getOccupationCd(){
       	return this.occupationCd;
     }
     public void setOccupationCd(String occupationCd){
       	this.occupationCd=occupationCd;
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
     public String getMaritalstatus(){
       	return this.maritalstatus;
     }
     public void setMaritalstatus(String maritalstatus){
       	this.maritalstatus=maritalstatus;
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
     public Date getDeathDate(){
       	return this.deathDate;
     }
     public void setDeathDate(Date deathDate){
       	this.deathDate=deathDate;
     }
     public String getDeathPlaceCategory(){
       	return this.deathPlaceCategory;
     }
     public void setDeathPlaceCategory(String deathPlaceCategory){
       	this.deathPlaceCategory=deathPlaceCategory;
     }
     public String getDeathHospital(){
       	return this.deathHospital;
     }
     public void setDeathHospital(String deathHospital){
       	this.deathHospital=deathHospital;
     }
     public Float getOnsetToDeath(){
       	return this.onsetToDeath;
     }
     public void setOnsetToDeath(Float onsetToDeath){
       	this.onsetToDeath=onsetToDeath;
     }
     public String getHighestDiagnosticLevel(){
       	return this.highestDiagnosticLevel;
     }
     public void setHighestDiagnosticLevel(String highestDiagnosticLevel){
       	this.highestDiagnosticLevel=highestDiagnosticLevel;
     }
     public String getHighestDeathDiagnosisCategoryCode(){
       	return this.highestDeathDiagnosisCategoryCode;
     }
     public void setHighestDeathDiagnosisCategoryCode(String highestDeathDiagnosisCategoryCode){
       	this.highestDeathDiagnosisCategoryCode=highestDeathDiagnosisCategoryCode;
     }
     public String getDirectDeathReasonCd(){
       	return this.directDeathReasonCd;
     }
     public void setDirectDeathReasonCd(String directDeathReasonCd){
       	this.directDeathReasonCd=directDeathReasonCd;
     }
     public String getDirectDeathReasonName(){
       	return this.directDeathReasonName;
     }
     public void setDirectDeathReasonName(String directDeathReasonName){
       	this.directDeathReasonName=directDeathReasonName;
     }
     public String getOtherDiseaseDiagnosisCd(){
       	return this.otherDiseaseDiagnosisCd;
     }
     public void setOtherDiseaseDiagnosisCd(String otherDiseaseDiagnosisCd){
       	this.otherDiseaseDiagnosisCd=otherDiseaseDiagnosisCd;
     }
     public String getOtherDiseaseDiagnosisName(){
       	return this.otherDiseaseDiagnosisName;
     }
     public void setOtherDiseaseDiagnosisName(String otherDiseaseDiagnosisName){
       	this.otherDiseaseDiagnosisName=otherDiseaseDiagnosisName;
     }
     public String getUnderlyingDeathCauseCd(){
       	return this.underlyingDeathCauseCd;
     }
     public void setUnderlyingDeathCauseCd(String underlyingDeathCauseCd){
       	this.underlyingDeathCauseCd=underlyingDeathCauseCd;
     }
     public String getUnderlyingDeathCauseName(){
       	return this.underlyingDeathCauseName;
     }
     public void setUnderlyingDeathCauseName(String underlyingDeathCauseName){
       	this.underlyingDeathCauseName=underlyingDeathCauseName;
     }
     public Date getDiagnosisDate(){
       	return this.diagnosisDate;
     }
     public void setDiagnosisDate(Date diagnosisDate){
       	this.diagnosisDate=diagnosisDate;
     }
     public String getPhysician(){
       	return this.physician;
     }
     public void setPhysician(String physician){
       	this.physician=physician;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}