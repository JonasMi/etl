package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.BirthCertificate;

public class BirthCertificateDetails extends BirthCertificateRecord {
    /**
     *名称:出生医学证明id
     *
 	 *
     */
     private String birthCertificateId;
    /**
     *名称:记录日期
     *
 	 *
     */
     private Long date;
    /**
     *名称:文档创建者id
     *
 	 *
     */
     private String authorId;
    /**
     *名称:文档创建者姓名
     *
 	 *
     */
     private String authorName;
    /**
     *名称:院内患者ID
     *
 	 *
     */
     private String patientId;
    /**
     *名称:身份证号
     *
 	 *
     */
     private String idCard;
    /**
     *名称:城乡居民健康档案编号
     *
 	 *
     */
     private String healthFileNumber;
    /**
     *名称:健康卡号
     *
 	 *
     */
     private String healthCard;
    /**
     *名称:姓名
     *
 	 *
     */
     private String name;
    /**
     *名称:性别
     *
 	 *限制:GBT22611
     */
     private String gender;
    /**
     *名称:出生日期
     *
 	 *
     */
     private Long birthdate;
    /**
     *名称:出生地-省（自治区、直辖市）代码
     *
 	 *限制:GBT2260
     */
     private String birthProCode;
    /**
     *名称:出生地-市（地区）代码
     *
 	 *限制:GBT2260
     */
     private String birthCityCode;
    /**
     *名称:出生地-县（区）代码
     *
 	 *限制:GBT2260
     */
     private String birthCouCode;
    /**
     *名称:出生地-乡（镇、街道办事处）
     *
 	 *
     */
     private String birthAddressStreet;
    /**
     *名称:出生地-村（街、路、弄等）
     *
 	 *
     */
     private String birthAddressVillage;
    /**
     *名称:出生地-门牌号码
     *
 	 *
     */
     private String birthAddressHouse;
    /**
     *名称:家庭住址-省（自治区、直辖市）代码
     *
 	 *限制:GBT2260
     */
     private String homeState;
    /**
     *名称:家庭住址-市（地区）代码
     *
 	 *限制:GBT2260
     */
     private String homeCity;
    /**
     *名称:家庭住址-县（区）代码
     *
 	 *限制:GBT2260
     */
     private String homeDistrict;
    /**
     *名称:家庭住址-乡（镇、街道办事处）
     *
 	 *
     */
     private String homeLine;
    /**
     *名称:家庭住址-村（街、路、弄等）
     *
 	 *
     */
     private String homeRoad;
    /**
     *名称:家庭住址-门牌号码
     *
 	 *
     */
     private String homeHouseNo;
    /**
     *名称:家庭住址-详细信息
     *
 	 *
     */
     private String homeText;
    /**
     *名称:父亲姓名
     *
 	 *
     */
     private String fatherName;
    /**
     *名称:父亲-国籍代码
     *
 	 *限制:GBT2659
     */
     private String fatherNationalityCode;
    /**
     *名称:父亲-民族代码
     *
 	 *限制:CV9900377
     */
     private String fatherNationCd;
    /**
     *名称:父亲-身份证号
     *
 	 *
     */
     private String fatherIdCard;
    /**
     *名称:母亲姓名
     *
 	 *
     */
     private String motherName;
    /**
     *名称:母亲-国籍代码
     *
 	 *限制:GBT2659
     */
     private String motherNationalityCode;
    /**
     *名称:母亲-民族代码
     *
 	 *限制:CV9900377
     */
     private String motherNationCd;
    /**
     *名称:母亲-身份证号
     *
 	 *
     */
     private String motherIdCard;
    /**
     *名称:出生孕周
     *
 	 *
     */
     private Float gestationalWeek;
    /**
     *名称:健康状况代码
     *
 	 *限制:GBT22613
     */
     private String generalHealthMark;
    /**
     *名称:出生身长
     *
 	 *
     */
     private Float birthLength;
    /**
     *名称:出生体重（g）
     *
 	 *
     */
     private Float birthWeight;
    /**
     *名称:出生（分娩）地点类别代码
     *
 	 *限制:CV0201102
     */
     private String birthPlaceTypeCd;
    /**
     *名称:接生人员名字
     *
 	 *
     */
     private String midwife;
    /**
     *名称:接生单位名称
     *
 	 *
     */
     private String midwiferyUnit;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
     */
     private String upHospitalName;
     private String errorMessage;
     private String errorDetail;             
     public BirthCertificateDetails(BirthCertificate birthCertificate) {
        super(birthCertificate);
         this.birthCertificateId=birthCertificate.getBirthCertificateId();
         java.util.Date _date = birthCertificate.getDate();
         if(_date!=null){
         	this.date=_date.getTime();
         }
         this.authorId=birthCertificate.getAuthorId();
         this.authorName=birthCertificate.getAuthorName();
         this.patientId=birthCertificate.getPatientId();
         this.idCard=birthCertificate.getIdCard();
         this.healthFileNumber=birthCertificate.getHealthFileNumber();
         this.healthCard=birthCertificate.getHealthCard();
         this.name=birthCertificate.getName();
         this.gender=birthCertificate.getGender();
         java.util.Date _birthdate = birthCertificate.getBirthdate();
         if(_birthdate!=null){
         	this.birthdate=_birthdate.getTime();
         }
         this.birthProCode=birthCertificate.getBirthProCode();
         this.birthCityCode=birthCertificate.getBirthCityCode();
         this.birthCouCode=birthCertificate.getBirthCouCode();
         this.birthAddressStreet=birthCertificate.getBirthAddressStreet();
         this.birthAddressVillage=birthCertificate.getBirthAddressVillage();
         this.birthAddressHouse=birthCertificate.getBirthAddressHouse();
         this.homeState=birthCertificate.getHomeState();
         this.homeCity=birthCertificate.getHomeCity();
         this.homeDistrict=birthCertificate.getHomeDistrict();
         this.homeLine=birthCertificate.getHomeLine();
         this.homeRoad=birthCertificate.getHomeRoad();
         this.homeHouseNo=birthCertificate.getHomeHouseNo();
         this.homeText=birthCertificate.getHomeText();
         this.fatherName=birthCertificate.getFatherName();
         this.fatherNationalityCode=birthCertificate.getFatherNationalityCode();
         this.fatherNationCd=birthCertificate.getFatherNationCd();
         this.fatherIdCard=birthCertificate.getFatherIdCard();
         this.motherName=birthCertificate.getMotherName();
         this.motherNationalityCode=birthCertificate.getMotherNationalityCode();
         this.motherNationCd=birthCertificate.getMotherNationCd();
         this.motherIdCard=birthCertificate.getMotherIdCard();
         this.gestationalWeek=birthCertificate.getGestationalWeek();
         this.generalHealthMark=birthCertificate.getGeneralHealthMark();
         this.birthLength=birthCertificate.getBirthLength();
         this.birthWeight=birthCertificate.getBirthWeight();
         this.birthPlaceTypeCd=birthCertificate.getBirthPlaceTypeCd();
         this.midwife=birthCertificate.getMidwife();
         this.midwiferyUnit=birthCertificate.getMidwiferyUnit();
         this.upHospitalName=birthCertificate.getUpHospitalName();
         this.errorMessage=birthCertificate.getErrorMessage();
         this.errorDetail=birthCertificate.getErrorDetail();      
    }
      public String  getBirthCertificateId(){
       		return this.birthCertificateId;
      }    
      public Long  getDate(){
       		return this.date;
      }    
      public String  getAuthorId(){
       		return this.authorId;
      }    
      public String  getAuthorName(){
       		return this.authorName;
      }    
      public String  getPatientId(){
       		return this.patientId;
      }    
      public String  getIdCard(){
       		return this.idCard;
      }    
      public String  getHealthFileNumber(){
       		return this.healthFileNumber;
      }    
      public String  getHealthCard(){
       		return this.healthCard;
      }    
      public String  getName(){
       		return this.name;
      }    
      public String  getGender(){
       		return this.gender;
      }    
      public Long  getBirthdate(){
       		return this.birthdate;
      }    
      public String  getBirthProCode(){
       		return this.birthProCode;
      }    
      public String  getBirthCityCode(){
       		return this.birthCityCode;
      }    
      public String  getBirthCouCode(){
       		return this.birthCouCode;
      }    
      public String  getBirthAddressStreet(){
       		return this.birthAddressStreet;
      }    
      public String  getBirthAddressVillage(){
       		return this.birthAddressVillage;
      }    
      public String  getBirthAddressHouse(){
       		return this.birthAddressHouse;
      }    
      public String  getHomeState(){
       		return this.homeState;
      }    
      public String  getHomeCity(){
       		return this.homeCity;
      }    
      public String  getHomeDistrict(){
       		return this.homeDistrict;
      }    
      public String  getHomeLine(){
       		return this.homeLine;
      }    
      public String  getHomeRoad(){
       		return this.homeRoad;
      }    
      public String  getHomeHouseNo(){
       		return this.homeHouseNo;
      }    
      public String  getHomeText(){
       		return this.homeText;
      }    
      public String  getFatherName(){
       		return this.fatherName;
      }    
      public String  getFatherNationalityCode(){
       		return this.fatherNationalityCode;
      }    
      public String  getFatherNationCd(){
       		return this.fatherNationCd;
      }    
      public String  getFatherIdCard(){
       		return this.fatherIdCard;
      }    
      public String  getMotherName(){
       		return this.motherName;
      }    
      public String  getMotherNationalityCode(){
       		return this.motherNationalityCode;
      }    
      public String  getMotherNationCd(){
       		return this.motherNationCd;
      }    
      public String  getMotherIdCard(){
       		return this.motherIdCard;
      }    
      public Float  getGestationalWeek(){
       		return this.gestationalWeek;
      }    
      public String  getGeneralHealthMark(){
       		return this.generalHealthMark;
      }    
      public Float  getBirthLength(){
       		return this.birthLength;
      }    
      public Float  getBirthWeight(){
       		return this.birthWeight;
      }    
      public String  getBirthPlaceTypeCd(){
       		return this.birthPlaceTypeCd;
      }    
      public String  getMidwife(){
       		return this.midwife;
      }    
      public String  getMidwiferyUnit(){
       		return this.midwiferyUnit;
      }    
      public String  getUpHospitalName(){
       		return this.upHospitalName;
      }    
	  public String getErrorMessage() {
	        return errorMessage;
	  }
	  public String getErrorDetail() {
	        return errorDetail;
	  }  
}