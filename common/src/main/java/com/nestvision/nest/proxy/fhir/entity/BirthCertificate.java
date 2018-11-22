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
@Table(name = BaseEntity.TABLE_PREFIX + "BIRTH_CERTIFICATE")
public class BirthCertificate extends FhirResourceEntity {

    /**
     *名称:出生医学证明id
     *
 	 *
 	 *主键字段
     */
     @Column(name="BIRTH_CERTIFICATE_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="BIRTH_CERTIFICATE_ID",displayName="出生医学证明id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String birthCertificateId;
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
     *名称:出生地-省（自治区、直辖市）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="BIRTH_PRO_CODE",length = 10,nullable = true)
     @FhirFieldValidate(name="BIRTH_PRO_CODE",displayName="出生地-省（自治区、直辖市）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String birthProCode;
    /**
     *名称:出生地-市（地区）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="BIRTH_CITY_CODE",length = 10,nullable = true)
     @FhirFieldValidate(name="BIRTH_CITY_CODE",displayName="出生地-市（地区）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String birthCityCode;
    /**
     *名称:出生地-县（区）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="BIRTH_COU_CODE",length = 10,nullable = true)
     @FhirFieldValidate(name="BIRTH_COU_CODE",displayName="出生地-县（区）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String birthCouCode;
    /**
     *名称:出生地-乡（镇、街道办事处）
     *
 	 *
 	 *
     */
     @Column(name="BIRTH_ADDRESS_STREET",length = 100,nullable = true)
     @FhirFieldValidate(name="BIRTH_ADDRESS_STREET",displayName="出生地-乡（镇、街道办事处）",maxLength=100,required=false,valuesRange="")   
     private String birthAddressStreet;
    /**
     *名称:出生地-村（街、路、弄等）
     *
 	 *
 	 *
     */
     @Column(name="BIRTH_ADDRESS_VILLAGE",length = 100,nullable = true)
     @FhirFieldValidate(name="BIRTH_ADDRESS_VILLAGE",displayName="出生地-村（街、路、弄等）",maxLength=100,required=false,valuesRange="")   
     private String birthAddressVillage;
    /**
     *名称:出生地-门牌号码
     *
 	 *
 	 *
     */
     @Column(name="BIRTH_ADDRESS_HOUSE",length = 50,nullable = true)
     @FhirFieldValidate(name="BIRTH_ADDRESS_HOUSE",displayName="出生地-门牌号码",maxLength=50,required=false,valuesRange="")   
     private String birthAddressHouse;
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
     *名称:父亲姓名
     *
 	 *
 	 *
     */
     @Column(name="FATHER_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="FATHER_NAME",displayName="父亲姓名",maxLength=20,required=false,valuesRange="")   
     private String fatherName;
    /**
     *名称:父亲-国籍代码
     *
 	 *限制:GBT2659
 	 *
     */
     @Column(name="FATHER_NATIONALITY_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="FATHER_NATIONALITY_CODE",displayName="父亲-国籍代码",maxLength=20,required=false,valuesRange="GBT2659")   
     private String fatherNationalityCode;
    /**
     *名称:父亲-民族代码
     *
 	 *限制:CV9900377
 	 *
     */
     @Column(name="FATHER_NATION_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="FATHER_NATION_CD",displayName="父亲-民族代码",maxLength=20,required=false,valuesRange="CV9900377")   
     private String fatherNationCd;
    /**
     *名称:父亲-身份证号
     *
 	 *
 	 *
     */
     @Column(name="FATHER_ID_CARD",length = 40,nullable = true)
     @FhirFieldValidate(name="FATHER_ID_CARD",displayName="父亲-身份证号",maxLength=40,required=false,valuesRange="")   
     private String fatherIdCard;
    /**
     *名称:母亲姓名
     *
 	 *
 	 *
     */
     @Column(name="MOTHER_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="MOTHER_NAME",displayName="母亲姓名",maxLength=20,required=false,valuesRange="")   
     private String motherName;
    /**
     *名称:母亲-国籍代码
     *
 	 *限制:GBT2659
 	 *
     */
     @Column(name="MOTHER_NATIONALITY_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="MOTHER_NATIONALITY_CODE",displayName="母亲-国籍代码",maxLength=20,required=false,valuesRange="GBT2659")   
     private String motherNationalityCode;
    /**
     *名称:母亲-民族代码
     *
 	 *限制:CV9900377
 	 *
     */
     @Column(name="MOTHER_NATION_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="MOTHER_NATION_CD",displayName="母亲-民族代码",maxLength=20,required=false,valuesRange="CV9900377")   
     private String motherNationCd;
    /**
     *名称:母亲-身份证号
     *
 	 *
 	 *
     */
     @Column(name="MOTHER_ID_CARD",length = 40,nullable = true)
     @FhirFieldValidate(name="MOTHER_ID_CARD",displayName="母亲-身份证号",maxLength=40,required=false,valuesRange="")   
     private String motherIdCard;
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
     *名称:健康状况代码
     *
 	 *限制:GBT22613
 	 *
     */
     @Column(name="GENERAL_HEALTH_MARK",length = 20,nullable = true)
     @FhirFieldValidate(name="GENERAL_HEALTH_MARK",displayName="健康状况代码",maxLength=20,required=false,valuesRange="GBT22613")   
     private String generalHealthMark;
    /**
     *名称:出生身长
     *
 	 *
 	 *
     */
     @Column(name="BIRTH_LENGTH",length = 8,nullable = true)
     @FhirFieldValidate(name="BIRTH_LENGTH",displayName="出生身长",maxLength=8,required=false,valuesRange="")   
     private Float birthLength;
    /**
     *名称:出生体重（g）
     *
 	 *
 	 *
     */
     @Column(name="BIRTH_WEIGHT",length = 8,nullable = true)
     @FhirFieldValidate(name="BIRTH_WEIGHT",displayName="出生体重（g）",maxLength=8,required=false,valuesRange="")   
     private Float birthWeight;
    /**
     *名称:出生（分娩）地点类别代码
     *
 	 *限制:CV0201102
 	 *
     */
     @Column(name="BIRTH_PLACE_TYPE_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="BIRTH_PLACE_TYPE_CD",displayName="出生（分娩）地点类别代码",maxLength=20,required=false,valuesRange="CV0201102")   
     private String birthPlaceTypeCd;
    /**
     *名称:接生人员名字
     *
 	 *
 	 *
     */
     @Column(name="MIDWIFE",length = 40,nullable = true)
     @FhirFieldValidate(name="MIDWIFE",displayName="接生人员名字",maxLength=40,required=false,valuesRange="")   
     private String midwife;
    /**
     *名称:接生单位名称
     *
 	 *
 	 *
     */
     @Column(name="MIDWIFERY_UNIT",length = 40,nullable = true)
     @FhirFieldValidate(name="MIDWIFERY_UNIT",displayName="接生单位名称",maxLength=40,required=false,valuesRange="")   
     private String midwiferyUnit;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getBirthCertificateId(){
       	return this.birthCertificateId;
     }
     public void setBirthCertificateId(String birthCertificateId){
       	this.birthCertificateId=birthCertificateId;
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
     public String getBirthProCode(){
       	return this.birthProCode;
     }
     public void setBirthProCode(String birthProCode){
       	this.birthProCode=birthProCode;
     }
     public String getBirthCityCode(){
       	return this.birthCityCode;
     }
     public void setBirthCityCode(String birthCityCode){
       	this.birthCityCode=birthCityCode;
     }
     public String getBirthCouCode(){
       	return this.birthCouCode;
     }
     public void setBirthCouCode(String birthCouCode){
       	this.birthCouCode=birthCouCode;
     }
     public String getBirthAddressStreet(){
       	return this.birthAddressStreet;
     }
     public void setBirthAddressStreet(String birthAddressStreet){
       	this.birthAddressStreet=birthAddressStreet;
     }
     public String getBirthAddressVillage(){
       	return this.birthAddressVillage;
     }
     public void setBirthAddressVillage(String birthAddressVillage){
       	this.birthAddressVillage=birthAddressVillage;
     }
     public String getBirthAddressHouse(){
       	return this.birthAddressHouse;
     }
     public void setBirthAddressHouse(String birthAddressHouse){
       	this.birthAddressHouse=birthAddressHouse;
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
     public String getFatherName(){
       	return this.fatherName;
     }
     public void setFatherName(String fatherName){
       	this.fatherName=fatherName;
     }
     public String getFatherNationalityCode(){
       	return this.fatherNationalityCode;
     }
     public void setFatherNationalityCode(String fatherNationalityCode){
       	this.fatherNationalityCode=fatherNationalityCode;
     }
     public String getFatherNationCd(){
       	return this.fatherNationCd;
     }
     public void setFatherNationCd(String fatherNationCd){
       	this.fatherNationCd=fatherNationCd;
     }
     public String getFatherIdCard(){
       	return this.fatherIdCard;
     }
     public void setFatherIdCard(String fatherIdCard){
       	this.fatherIdCard=fatherIdCard;
     }
     public String getMotherName(){
       	return this.motherName;
     }
     public void setMotherName(String motherName){
       	this.motherName=motherName;
     }
     public String getMotherNationalityCode(){
       	return this.motherNationalityCode;
     }
     public void setMotherNationalityCode(String motherNationalityCode){
       	this.motherNationalityCode=motherNationalityCode;
     }
     public String getMotherNationCd(){
       	return this.motherNationCd;
     }
     public void setMotherNationCd(String motherNationCd){
       	this.motherNationCd=motherNationCd;
     }
     public String getMotherIdCard(){
       	return this.motherIdCard;
     }
     public void setMotherIdCard(String motherIdCard){
       	this.motherIdCard=motherIdCard;
     }
     public Float getGestationalWeek(){
       	return this.gestationalWeek;
     }
     public void setGestationalWeek(Float gestationalWeek){
       	this.gestationalWeek=gestationalWeek;
     }
     public String getGeneralHealthMark(){
       	return this.generalHealthMark;
     }
     public void setGeneralHealthMark(String generalHealthMark){
       	this.generalHealthMark=generalHealthMark;
     }
     public Float getBirthLength(){
       	return this.birthLength;
     }
     public void setBirthLength(Float birthLength){
       	this.birthLength=birthLength;
     }
     public Float getBirthWeight(){
       	return this.birthWeight;
     }
     public void setBirthWeight(Float birthWeight){
       	this.birthWeight=birthWeight;
     }
     public String getBirthPlaceTypeCd(){
       	return this.birthPlaceTypeCd;
     }
     public void setBirthPlaceTypeCd(String birthPlaceTypeCd){
       	this.birthPlaceTypeCd=birthPlaceTypeCd;
     }
     public String getMidwife(){
       	return this.midwife;
     }
     public void setMidwife(String midwife){
       	this.midwife=midwife;
     }
     public String getMidwiferyUnit(){
       	return this.midwiferyUnit;
     }
     public void setMidwiferyUnit(String midwiferyUnit){
       	this.midwiferyUnit=midwiferyUnit;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}