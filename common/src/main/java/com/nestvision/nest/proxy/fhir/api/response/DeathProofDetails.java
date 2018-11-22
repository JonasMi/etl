package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.DeathProof;

public class DeathProofDetails extends DeathProofRecord {
    /**
     *名称:死亡医学证明id
     *
 	 *
     */
     private String deathProofId;
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
     *名称:民族代码
     *
 	 *限制:CV9900377
     */
     private String nationCd;
    /**
     *名称:学历代码
     *
 	 *限制:GBT4658
     */
     private String educationCd;
    /**
     *名称:职业代码
     *
 	 *限制:GBT22614
     */
     private String occupationCd;
    /**
     *名称:户籍登记所在地址的省、自治区或直辖市名称
     *
 	 *
     */
     private String rprAddrProvince;
    /**
     *名称:户籍登记所在地址的市、地区或州的名称
     *
 	 *
     */
     private String rprAddrCity;
    /**
     *名称:户籍登记所在地址的县（区）的名称
     *
 	 *
     */
     private String rprAddrArea;
    /**
     *名称:户籍登记所在地址的乡、镇或城市的街道办事处名称
     *
 	 *
     */
     private String rprAddrStreet;
    /**
     *名称:户籍登记所在地址的村或城市的街、路、里、弄等名称
     *
 	 *
     */
     private String rprAddrVillage;
    /**
     *名称:户籍登记所在地址的门牌号码
     *
 	 *
     */
     private String rprAddrHouse;
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
     *名称:婚姻状况代码
     *
 	 *限制:GBT22612
     */
     private String maritalstatus;
    /**
     *名称:联系人关系代码
     *
 	 *限制:GBT4761
     */
     private String relationship;
    /**
     *名称:联系人姓名
     *
 	 *
     */
     private String contactsName;
    /**
     *名称:联系人电话号码
     *
 	 *
     */
     private String contactsPhone;
    /**
     *名称:死亡日期
     *
 	 *
     */
     private Long deathDate;
    /**
     *名称:死亡地点类别
     *
 	 *限制:CV0201103
     */
     private String deathPlaceCategory;
    /**
     *名称:死亡医院
     *
 	 *
     */
     private String deathHospital;
    /**
     *名称:发病到死亡时长
     *
 	 *
     */
     private Float onsetToDeath;
    /**
     *名称:最高诊断机构级别
     *
 	 *限制:CV0810004
     */
     private String highestDiagnosticLevel;
    /**
     *名称:死亡最高诊断依据类别代码
     *
 	 *限制:CV0501037
     */
     private String highestDeathDiagnosisCategoryCode;
    /**
     *名称:直接死亡原因代码
     *
 	 *限制:CV990111
     */
     private String directDeathReasonCd;
    /**
     *名称:直接死亡原因名称
     *
 	 *
     */
     private String directDeathReasonName;
    /**
     *名称:其他疾病诊断代码
     *
 	 *限制:CV990111
     */
     private String otherDiseaseDiagnosisCd;
    /**
     *名称:其他疾病诊断名称
     *
 	 *
     */
     private String otherDiseaseDiagnosisName;
    /**
     *名称:根本死亡原因编码
     *
 	 *限制:CV990111
     */
     private String underlyingDeathCauseCd;
    /**
     *名称:根本死亡原因名称
     *
 	 *
     */
     private String underlyingDeathCauseName;
    /**
     *名称:诊断日期
     *
 	 *
     */
     private Long diagnosisDate;
    /**
     *名称:医师签名
     *
 	 *
     */
     private String physician;
    /**
     *名称:上传机构名称
     *备注:医疗机构在爱心医疗云平台中的唯一编码
 	 *
     */
     private String upHospitalName;
     private String errorMessage;
     private String errorDetail;             
     public DeathProofDetails(DeathProof deathProof) {
        super(deathProof);
         this.deathProofId=deathProof.getDeathProofId();
         java.util.Date _date = deathProof.getDate();
         if(_date!=null){
         	this.date=_date.getTime();
         }
         this.authorId=deathProof.getAuthorId();
         this.authorName=deathProof.getAuthorName();
         this.patientId=deathProof.getPatientId();
         this.idCard=deathProof.getIdCard();
         this.healthFileNumber=deathProof.getHealthFileNumber();
         this.healthCard=deathProof.getHealthCard();
         this.name=deathProof.getName();
         this.gender=deathProof.getGender();
         java.util.Date _birthdate = deathProof.getBirthdate();
         if(_birthdate!=null){
         	this.birthdate=_birthdate.getTime();
         }
         this.nationCd=deathProof.getNationCd();
         this.educationCd=deathProof.getEducationCd();
         this.occupationCd=deathProof.getOccupationCd();
         this.rprAddrProvince=deathProof.getRprAddrProvince();
         this.rprAddrCity=deathProof.getRprAddrCity();
         this.rprAddrArea=deathProof.getRprAddrArea();
         this.rprAddrStreet=deathProof.getRprAddrStreet();
         this.rprAddrVillage=deathProof.getRprAddrVillage();
         this.rprAddrHouse=deathProof.getRprAddrHouse();
         this.homeState=deathProof.getHomeState();
         this.homeCity=deathProof.getHomeCity();
         this.homeDistrict=deathProof.getHomeDistrict();
         this.homeLine=deathProof.getHomeLine();
         this.homeRoad=deathProof.getHomeRoad();
         this.homeHouseNo=deathProof.getHomeHouseNo();
         this.homeText=deathProof.getHomeText();
         this.maritalstatus=deathProof.getMaritalstatus();
         this.relationship=deathProof.getRelationship();
         this.contactsName=deathProof.getContactsName();
         this.contactsPhone=deathProof.getContactsPhone();
         java.util.Date _deathDate = deathProof.getDeathDate();
         if(_deathDate!=null){
         	this.deathDate=_deathDate.getTime();
         }
         this.deathPlaceCategory=deathProof.getDeathPlaceCategory();
         this.deathHospital=deathProof.getDeathHospital();
         this.onsetToDeath=deathProof.getOnsetToDeath();
         this.highestDiagnosticLevel=deathProof.getHighestDiagnosticLevel();
         this.highestDeathDiagnosisCategoryCode=deathProof.getHighestDeathDiagnosisCategoryCode();
         this.directDeathReasonCd=deathProof.getDirectDeathReasonCd();
         this.directDeathReasonName=deathProof.getDirectDeathReasonName();
         this.otherDiseaseDiagnosisCd=deathProof.getOtherDiseaseDiagnosisCd();
         this.otherDiseaseDiagnosisName=deathProof.getOtherDiseaseDiagnosisName();
         this.underlyingDeathCauseCd=deathProof.getUnderlyingDeathCauseCd();
         this.underlyingDeathCauseName=deathProof.getUnderlyingDeathCauseName();
         java.util.Date _diagnosisDate = deathProof.getDiagnosisDate();
         if(_diagnosisDate!=null){
         	this.diagnosisDate=_diagnosisDate.getTime();
         }
         this.physician=deathProof.getPhysician();
         this.upHospitalName=deathProof.getUpHospitalName();
         this.errorMessage=deathProof.getErrorMessage();
         this.errorDetail=deathProof.getErrorDetail();      
    }
      public String  getDeathProofId(){
       		return this.deathProofId;
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
      public String  getNationCd(){
       		return this.nationCd;
      }    
      public String  getEducationCd(){
       		return this.educationCd;
      }    
      public String  getOccupationCd(){
       		return this.occupationCd;
      }    
      public String  getRprAddrProvince(){
       		return this.rprAddrProvince;
      }    
      public String  getRprAddrCity(){
       		return this.rprAddrCity;
      }    
      public String  getRprAddrArea(){
       		return this.rprAddrArea;
      }    
      public String  getRprAddrStreet(){
       		return this.rprAddrStreet;
      }    
      public String  getRprAddrVillage(){
       		return this.rprAddrVillage;
      }    
      public String  getRprAddrHouse(){
       		return this.rprAddrHouse;
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
      public String  getMaritalstatus(){
       		return this.maritalstatus;
      }    
      public String  getRelationship(){
       		return this.relationship;
      }    
      public String  getContactsName(){
       		return this.contactsName;
      }    
      public String  getContactsPhone(){
       		return this.contactsPhone;
      }    
      public Long  getDeathDate(){
       		return this.deathDate;
      }    
      public String  getDeathPlaceCategory(){
       		return this.deathPlaceCategory;
      }    
      public String  getDeathHospital(){
       		return this.deathHospital;
      }    
      public Float  getOnsetToDeath(){
       		return this.onsetToDeath;
      }    
      public String  getHighestDiagnosticLevel(){
       		return this.highestDiagnosticLevel;
      }    
      public String  getHighestDeathDiagnosisCategoryCode(){
       		return this.highestDeathDiagnosisCategoryCode;
      }    
      public String  getDirectDeathReasonCd(){
       		return this.directDeathReasonCd;
      }    
      public String  getDirectDeathReasonName(){
       		return this.directDeathReasonName;
      }    
      public String  getOtherDiseaseDiagnosisCd(){
       		return this.otherDiseaseDiagnosisCd;
      }    
      public String  getOtherDiseaseDiagnosisName(){
       		return this.otherDiseaseDiagnosisName;
      }    
      public String  getUnderlyingDeathCauseCd(){
       		return this.underlyingDeathCauseCd;
      }    
      public String  getUnderlyingDeathCauseName(){
       		return this.underlyingDeathCauseName;
      }    
      public Long  getDiagnosisDate(){
       		return this.diagnosisDate;
      }    
      public String  getPhysician(){
       		return this.physician;
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