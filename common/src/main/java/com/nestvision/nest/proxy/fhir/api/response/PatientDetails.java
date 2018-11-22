package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.Patient;

public class PatientDetails extends PatientRecord {
    /**
     *名称:院内患者ID
     *备注:患者信息在院内系统中的唯一标识
 	 *
     */
     private String patientId;
    /**
     *名称:就诊卡号
     *
 	 *
     */
     private String patientServiceNo;
    /**
     *名称:证件类别代码
     *
 	 *限制:CUS00018
     */
     private String idTypeCode;
    /**
     *名称:证件号码
     *
 	 *
     */
     private String idNo;
    /**
     *名称:社保卡号
     *
 	 *
     */
     private String socialInsuranceCard;
    /**
     *名称:医疗保险卡号
     *
 	 *
     */
     private String medicalInsuranceCard;
    /**
     *名称:城乡居民健康档案编号
     *
 	 *
     */
     private String healthFileNumber;
    /**
     *名称:新农合卡号
     *
 	 *
     */
     private String ncmsCard;
    /**
     *名称:健康卡号
     *
 	 *
     */
     private String healthCard;
    /**
     *名称:健康卡临时卡号
     *
 	 *
     */
     private String healthCardTemp;
    /**
     *名称:姓名
     *
 	 *
     */
     private String name;
    /**
     *名称:年龄
     *
 	 *
     */
     private Integer age;
    /**
     *名称:实足年龄
     *
 	 *
     */
     private Integer exactAge;
    /**
     *名称:家庭联系方式
     *
 	 *
     */
     private String homePhone;
    /**
     *名称:工作联系方式
     *
 	 *
     */
     private String workPhone;
    /**
     *名称:个人联系方式
     *
 	 *
     */
     private String mobilePhone;
    /**
     *名称:临时联系方式
     *
 	 *
     */
     private String tempPhone;
    /**
     *名称:电子邮箱
     *
 	 *
     */
     private String tempEmail;
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
     *名称:婚姻状况代码
     *
 	 *限制:GBT22612
     */
     private String maritalstatus;
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
     *名称:现居住住址-省（自治区、直辖市）代码
     *
 	 *限制:GBT2260
     */
     private String tempState;
    /**
     *名称:现居住住址-市（地区）代码
     *
 	 *限制:GBT2260
     */
     private String tempCity;
    /**
     *名称:现居住住址-县（区）代码
     *
 	 *限制:GBT2260
     */
     private String tempDistrict;
    /**
     *名称:现居住住址-乡（镇、街道办事处）
     *
 	 *
     */
     private String tempLine;
    /**
     *名称:现居住住址-村（街、路、弄等）
     *
 	 *
     */
     private String tempRoad;
    /**
     *名称:现居住住址-门牌号码
     *
 	 *
     */
     private String tempHouseNo;
    /**
     *名称:现居住住址-详细信息
     *
 	 *
     */
     private String tempText;
    /**
     *名称:现地址邮政编码
     *
 	 *
     */
     private String tempPostCd;
    /**
     *名称:工作单位住址-省（自治区、直辖市）代码
     *
 	 *限制:GBT2260
     */
     private String workState;
    /**
     *名称:工作单位住址-市（地区）代码
     *
 	 *限制:GBT2260
     */
     private String workCity;
    /**
     *名称:工作单位住址-县（区）代码
     *
 	 *限制:GBT2260
     */
     private String workDistrict;
    /**
     *名称:工作单位住址-乡（镇、街道办事处）
     *
 	 *
     */
     private String workLine;
    /**
     *名称:工作单位住址-村（街、路、弄等）
     *
 	 *
     */
     private String workRoad;
    /**
     *名称:工作单位住址-门牌号码
     *
 	 *
     */
     private String workHouseNo;
    /**
     *名称:工作单位住址-详细信息
     *
 	 *
     */
     private String workText;
    /**
     *名称:工作单位邮政编码
     *
 	 *
     */
     private String workPostCd;
    /**
     *名称:出生地-省（自治区、直辖市）代码
     *
 	 *限制:GBT2260
     */
     private String birthState;
    /**
     *名称:出生地-市（地区）代码
     *
 	 *限制:GBT2260
     */
     private String birthCity;
    /**
     *名称:出生地-县（区）代码
     *
 	 *限制:GBT2260
     */
     private String birthDistrict;
    /**
     *名称:出生地-乡（镇、街道办事处）
     *
 	 *
     */
     private String birthLine;
    /**
     *名称:出生地-村（街、路、弄等）
     *
 	 *
     */
     private String birthRoad;
    /**
     *名称:出生地-门牌号码
     *
 	 *
     */
     private String birthHouseNo;
    /**
     *名称:户籍登记所在地址的省、自治区或直辖市名称
     *
 	 *限制:GBT2260
     */
     private String rprAddrProvince;
    /**
     *名称:户籍登记所在地址的市、地区或州的名称
     *
 	 *限制:GBT2260
     */
     private String rprAddrCity;
    /**
     *名称:户籍登记所在地址的县（区）的名称
     *
 	 *限制:GBT2260
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
     *名称:户口地址邮编
     *
 	 *
     */
     private String rprPost;
    /**
     *名称:户口电话
     *
 	 *
     */
     private String rprPhone;
    /**
     *名称:户口地址
     *
 	 *
     */
     private String rprAddr;
    /**
     *名称:籍贯-省代码
     *
 	 *限制:GBT2260
     */
     private String nativeProvince;
    /**
     *名称:籍贯-市代码
     *
 	 *限制:GBT2260
     */
     private String nativeCity;
    /**
     *名称:行政区划代码
     *
 	 *限制:GBT2260
     */
     private String administration;
    /**
     *名称:民族代码
     *
 	 *限制:CV9900377
     */
     private String nationCd;
    /**
     *名称:国籍代码
     *
 	 *限制:GBT2659
     */
     private String nationalityCode;
    /**
     *名称:职业代码
     *
 	 *限制:GBT22614
     */
     private String occupationCd;
    /**
     *名称:医疗保险类别代码
     *
 	 *限制:CV9900281
     */
     private String medicalInsuranceCategory;
    /**
     *名称:工作单位
     *
 	 *
     */
     private String workUnit;
    /**
     *名称:患者类型
     *
 	 *限制:CV0900404
     */
     private String patientType;
    /**
     *名称:是否有过敏史
     *
 	 *限制:CUS00004
     */
     private Boolean ifRritability;
    /**
     *名称:过敏史其他描述
     *
 	 *
     */
     private String rritability;
    /**
     *名称:ABO血型代码
     *
 	 *限制:CV0450005
     */
     private String aboCd;
    /**
     *名称:RH血型代码
     *
 	 *限制:CV0450020
     */
     private String rhCd;
    /**
     *名称:RH阴性代码
     *
 	 *限制:CV9900361
     */
     private String rhNegCd;
    /**
     *名称:宗教信仰代码
     *
 	 *限制:GA21412
     */
     private String religionCode;
    /**
     *名称:英文姓名
     *
 	 *
     */
     private String englishName;
    /**
     *名称:死亡日期
     *
 	 *
     */
     private Long dieDate;
    /**
     *名称:新生儿体重
     *
 	 *
     */
     private Float bodyWeight;
    /**
     *名称:新生儿入院时体重
     *
 	 *
     */
     private Float inpatWeight;
    /**
     *名称:学历代码
     *
 	 *限制:GBT4658
     */
     private String educationCd;
    /**
     *名称:常住地址户籍标志
     *
 	 *限制:CUS00004
     */
     private Boolean usualTypeMark;
    /**
     *名称:服务处所
     *
 	 *
     */
     private String servicePremises;
    /**
     *名称:服务处所类型代码
     *
 	 *限制:CV9900292
     */
     private String servicePremisesTypeCd;
    /**
     *名称:进入服务场所日期
     *
 	 *
     */
     private Long inDate;
    /**
     *名称:进入原因代码
     *
 	 *限制:CV9900295
     */
     private String inReasonCd;
    /**
     *名称:退出日期
     *
 	 *
     */
     private Long outDate;
    /**
     *名称:退出原因代码
     *
 	 *限制:CV9900296
     */
     private String outReasonCd;
    /**
     *名称:管理单位号码
     *
 	 *
     */
     private String manageUnitNo;
    /**
     *名称:退伍军人标志
     *
 	 *限制:CUS00004
     */
     private Boolean veteransMilitaryMark;
    /**
     *名称:卡号
     *
 	 *
     */
     private String cardNo;
    /**
     *名称:发卡地区
     *
 	 *限制:GBT2260
     */
     private String cardArea;
    /**
     *名称:保险类型
     *
 	 *
     */
     private String insureType;
    /**
     *名称:医疗待遇代码
     *
 	 *
     */
     private String medicalTreatmentCd;
    /**
     *名称:患者就诊类别描述
     *
 	 *
     */
     private String patientTypeDescr;
    /**
     *名称:责任医师id
     *
 	 *
     */
     private String responsDocCode;
    /**
     *名称:其他职业描述
     *
 	 *
     */
     private String otherOcccDescr;
    /**
     *名称:发证机关
     *
 	 *
     */
     private String issuingAgency;
    /**
     *名称:发证机关所在地
     *
 	 *
     */
     private String issuingAgencyCd;
    /**
     *名称:有效期
     *
 	 *
     */
     private String validDate;
    /**
     *名称:建档日期
     *
 	 *
     */
     private Long registerDate;
    /**
     *名称:建档人员代码
     *
 	 *
     */
     private String registerPersonCode;
    /**
     *名称:建档人员姓名
     *
 	 *
     */
     private String registerPersonName;
    /**
     *名称:注册机构代码
     *
 	 *
     */
     private String registerOrgCode;
    /**
     *名称:注册机构名称
     *
 	 *
     */
     private String registerOrgName;
    /**
     *名称:建档医疗机构代码
     *
 	 *
     */
     private String constrOrgCode;
    /**
     *名称:开发商机构代码
     *
 	 *
     */
     private String providerOrgCode;
    /**
     *名称:备注
     *
 	 *
     */
     private String remark;
     private String errorMessage;
     private String errorDetail;             
     public PatientDetails(Patient patient) {
        super(patient);
         this.patientId=patient.getPatientId();
         this.patientServiceNo=patient.getPatientServiceNo();
         this.idTypeCode=patient.getIdTypeCode();
         this.idNo=patient.getIdNo();
         this.socialInsuranceCard=patient.getSocialInsuranceCard();
         this.medicalInsuranceCard=patient.getMedicalInsuranceCard();
         this.healthFileNumber=patient.getHealthFileNumber();
         this.ncmsCard=patient.getNcmsCard();
         this.healthCard=patient.getHealthCard();
         this.healthCardTemp=patient.getHealthCardTemp();
         this.name=patient.getName();
         this.age=patient.getAge();
         this.exactAge=patient.getExactAge();
         this.homePhone=patient.getHomePhone();
         this.workPhone=patient.getWorkPhone();
         this.mobilePhone=patient.getMobilePhone();
         this.tempPhone=patient.getTempPhone();
         this.tempEmail=patient.getTempEmail();
         this.gender=patient.getGender();
         java.util.Date _birthdate = patient.getBirthdate();
         if(_birthdate!=null){
         	this.birthdate=_birthdate.getTime();
         }
         this.maritalstatus=patient.getMaritalstatus();
         this.homeState=patient.getHomeState();
         this.homeCity=patient.getHomeCity();
         this.homeDistrict=patient.getHomeDistrict();
         this.homeLine=patient.getHomeLine();
         this.homeRoad=patient.getHomeRoad();
         this.homeHouseNo=patient.getHomeHouseNo();
         this.homeText=patient.getHomeText();
         this.tempState=patient.getTempState();
         this.tempCity=patient.getTempCity();
         this.tempDistrict=patient.getTempDistrict();
         this.tempLine=patient.getTempLine();
         this.tempRoad=patient.getTempRoad();
         this.tempHouseNo=patient.getTempHouseNo();
         this.tempText=patient.getTempText();
         this.tempPostCd=patient.getTempPostCd();
         this.workState=patient.getWorkState();
         this.workCity=patient.getWorkCity();
         this.workDistrict=patient.getWorkDistrict();
         this.workLine=patient.getWorkLine();
         this.workRoad=patient.getWorkRoad();
         this.workHouseNo=patient.getWorkHouseNo();
         this.workText=patient.getWorkText();
         this.workPostCd=patient.getWorkPostCd();
         this.birthState=patient.getBirthState();
         this.birthCity=patient.getBirthCity();
         this.birthDistrict=patient.getBirthDistrict();
         this.birthLine=patient.getBirthLine();
         this.birthRoad=patient.getBirthRoad();
         this.birthHouseNo=patient.getBirthHouseNo();
         this.rprAddrProvince=patient.getRprAddrProvince();
         this.rprAddrCity=patient.getRprAddrCity();
         this.rprAddrArea=patient.getRprAddrArea();
         this.rprAddrStreet=patient.getRprAddrStreet();
         this.rprAddrVillage=patient.getRprAddrVillage();
         this.rprAddrHouse=patient.getRprAddrHouse();
         this.rprPost=patient.getRprPost();
         this.rprPhone=patient.getRprPhone();
         this.rprAddr=patient.getRprAddr();
         this.nativeProvince=patient.getNativeProvince();
         this.nativeCity=patient.getNativeCity();
         this.administration=patient.getAdministration();
         this.nationCd=patient.getNationCd();
         this.nationalityCode=patient.getNationalityCode();
         this.occupationCd=patient.getOccupationCd();
         this.medicalInsuranceCategory=patient.getMedicalInsuranceCategory();
         this.workUnit=patient.getWorkUnit();
         this.patientType=patient.getPatientType();
         this.ifRritability=patient.getIfRritability();
         this.rritability=patient.getRritability();
         this.aboCd=patient.getAboCd();
         this.rhCd=patient.getRhCd();
         this.rhNegCd=patient.getRhNegCd();
         this.religionCode=patient.getReligionCode();
         this.englishName=patient.getEnglishName();
         java.util.Date _dieDate = patient.getDieDate();
         if(_dieDate!=null){
         	this.dieDate=_dieDate.getTime();
         }
         this.bodyWeight=patient.getBodyWeight();
         this.inpatWeight=patient.getInpatWeight();
         this.educationCd=patient.getEducationCd();
         this.usualTypeMark=patient.getUsualTypeMark();
         this.servicePremises=patient.getServicePremises();
         this.servicePremisesTypeCd=patient.getServicePremisesTypeCd();
         java.util.Date _inDate = patient.getInDate();
         if(_inDate!=null){
         	this.inDate=_inDate.getTime();
         }
         this.inReasonCd=patient.getInReasonCd();
         java.util.Date _outDate = patient.getOutDate();
         if(_outDate!=null){
         	this.outDate=_outDate.getTime();
         }
         this.outReasonCd=patient.getOutReasonCd();
         this.manageUnitNo=patient.getManageUnitNo();
         this.veteransMilitaryMark=patient.getVeteransMilitaryMark();
         this.cardNo=patient.getCardNo();
         this.cardArea=patient.getCardArea();
         this.insureType=patient.getInsureType();
         this.medicalTreatmentCd=patient.getMedicalTreatmentCd();
         this.patientTypeDescr=patient.getPatientTypeDescr();
         this.responsDocCode=patient.getResponsDocCode();
         this.otherOcccDescr=patient.getOtherOcccDescr();
         this.issuingAgency=patient.getIssuingAgency();
         this.issuingAgencyCd=patient.getIssuingAgencyCd();
         this.validDate=patient.getValidDate();
         java.util.Date _registerDate = patient.getRegisterDate();
         if(_registerDate!=null){
         	this.registerDate=_registerDate.getTime();
         }
         this.registerPersonCode=patient.getRegisterPersonCode();
         this.registerPersonName=patient.getRegisterPersonName();
         this.registerOrgCode=patient.getRegisterOrgCode();
         this.registerOrgName=patient.getRegisterOrgName();
         this.constrOrgCode=patient.getConstrOrgCode();
         this.providerOrgCode=patient.getProviderOrgCode();
         this.remark=patient.getRemark();
         this.errorMessage=patient.getErrorMessage();
         this.errorDetail=patient.getErrorDetail();      
    }
      public String  getPatientId(){
       		return this.patientId;
      }    
      public String  getPatientServiceNo(){
       		return this.patientServiceNo;
      }    
      public String  getIdTypeCode(){
       		return this.idTypeCode;
      }    
      public String  getIdNo(){
       		return this.idNo;
      }    
      public String  getSocialInsuranceCard(){
       		return this.socialInsuranceCard;
      }    
      public String  getMedicalInsuranceCard(){
       		return this.medicalInsuranceCard;
      }    
      public String  getHealthFileNumber(){
       		return this.healthFileNumber;
      }    
      public String  getNcmsCard(){
       		return this.ncmsCard;
      }    
      public String  getHealthCard(){
       		return this.healthCard;
      }    
      public String  getHealthCardTemp(){
       		return this.healthCardTemp;
      }    
      public String  getName(){
       		return this.name;
      }    
      public Integer  getAge(){
       		return this.age;
      }    
      public Integer  getExactAge(){
       		return this.exactAge;
      }    
      public String  getHomePhone(){
       		return this.homePhone;
      }    
      public String  getWorkPhone(){
       		return this.workPhone;
      }    
      public String  getMobilePhone(){
       		return this.mobilePhone;
      }    
      public String  getTempPhone(){
       		return this.tempPhone;
      }    
      public String  getTempEmail(){
       		return this.tempEmail;
      }    
      public String  getGender(){
       		return this.gender;
      }    
      public Long  getBirthdate(){
       		return this.birthdate;
      }    
      public String  getMaritalstatus(){
       		return this.maritalstatus;
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
      public String  getTempState(){
       		return this.tempState;
      }    
      public String  getTempCity(){
       		return this.tempCity;
      }    
      public String  getTempDistrict(){
       		return this.tempDistrict;
      }    
      public String  getTempLine(){
       		return this.tempLine;
      }    
      public String  getTempRoad(){
       		return this.tempRoad;
      }    
      public String  getTempHouseNo(){
       		return this.tempHouseNo;
      }    
      public String  getTempText(){
       		return this.tempText;
      }    
      public String  getTempPostCd(){
       		return this.tempPostCd;
      }    
      public String  getWorkState(){
       		return this.workState;
      }    
      public String  getWorkCity(){
       		return this.workCity;
      }    
      public String  getWorkDistrict(){
       		return this.workDistrict;
      }    
      public String  getWorkLine(){
       		return this.workLine;
      }    
      public String  getWorkRoad(){
       		return this.workRoad;
      }    
      public String  getWorkHouseNo(){
       		return this.workHouseNo;
      }    
      public String  getWorkText(){
       		return this.workText;
      }    
      public String  getWorkPostCd(){
       		return this.workPostCd;
      }    
      public String  getBirthState(){
       		return this.birthState;
      }    
      public String  getBirthCity(){
       		return this.birthCity;
      }    
      public String  getBirthDistrict(){
       		return this.birthDistrict;
      }    
      public String  getBirthLine(){
       		return this.birthLine;
      }    
      public String  getBirthRoad(){
       		return this.birthRoad;
      }    
      public String  getBirthHouseNo(){
       		return this.birthHouseNo;
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
      public String  getRprPost(){
       		return this.rprPost;
      }    
      public String  getRprPhone(){
       		return this.rprPhone;
      }    
      public String  getRprAddr(){
       		return this.rprAddr;
      }    
      public String  getNativeProvince(){
       		return this.nativeProvince;
      }    
      public String  getNativeCity(){
       		return this.nativeCity;
      }    
      public String  getAdministration(){
       		return this.administration;
      }    
      public String  getNationCd(){
       		return this.nationCd;
      }    
      public String  getNationalityCode(){
       		return this.nationalityCode;
      }    
      public String  getOccupationCd(){
       		return this.occupationCd;
      }    
      public String  getMedicalInsuranceCategory(){
       		return this.medicalInsuranceCategory;
      }    
      public String  getWorkUnit(){
       		return this.workUnit;
      }    
      public String  getPatientType(){
       		return this.patientType;
      }    
      public Boolean  getIfRritability(){
       		return this.ifRritability;
      }    
      public String  getRritability(){
       		return this.rritability;
      }    
      public String  getAboCd(){
       		return this.aboCd;
      }    
      public String  getRhCd(){
       		return this.rhCd;
      }    
      public String  getRhNegCd(){
       		return this.rhNegCd;
      }    
      public String  getReligionCode(){
       		return this.religionCode;
      }    
      public String  getEnglishName(){
       		return this.englishName;
      }    
      public Long  getDieDate(){
       		return this.dieDate;
      }    
      public Float  getBodyWeight(){
       		return this.bodyWeight;
      }    
      public Float  getInpatWeight(){
       		return this.inpatWeight;
      }    
      public String  getEducationCd(){
       		return this.educationCd;
      }    
      public Boolean  getUsualTypeMark(){
       		return this.usualTypeMark;
      }    
      public String  getServicePremises(){
       		return this.servicePremises;
      }    
      public String  getServicePremisesTypeCd(){
       		return this.servicePremisesTypeCd;
      }    
      public Long  getInDate(){
       		return this.inDate;
      }    
      public String  getInReasonCd(){
       		return this.inReasonCd;
      }    
      public Long  getOutDate(){
       		return this.outDate;
      }    
      public String  getOutReasonCd(){
       		return this.outReasonCd;
      }    
      public String  getManageUnitNo(){
       		return this.manageUnitNo;
      }    
      public Boolean  getVeteransMilitaryMark(){
       		return this.veteransMilitaryMark;
      }    
      public String  getCardNo(){
       		return this.cardNo;
      }    
      public String  getCardArea(){
       		return this.cardArea;
      }    
      public String  getInsureType(){
       		return this.insureType;
      }    
      public String  getMedicalTreatmentCd(){
       		return this.medicalTreatmentCd;
      }    
      public String  getPatientTypeDescr(){
       		return this.patientTypeDescr;
      }    
      public String  getResponsDocCode(){
       		return this.responsDocCode;
      }    
      public String  getOtherOcccDescr(){
       		return this.otherOcccDescr;
      }    
      public String  getIssuingAgency(){
       		return this.issuingAgency;
      }    
      public String  getIssuingAgencyCd(){
       		return this.issuingAgencyCd;
      }    
      public String  getValidDate(){
       		return this.validDate;
      }    
      public Long  getRegisterDate(){
       		return this.registerDate;
      }    
      public String  getRegisterPersonCode(){
       		return this.registerPersonCode;
      }    
      public String  getRegisterPersonName(){
       		return this.registerPersonName;
      }    
      public String  getRegisterOrgCode(){
       		return this.registerOrgCode;
      }    
      public String  getRegisterOrgName(){
       		return this.registerOrgName;
      }    
      public String  getConstrOrgCode(){
       		return this.constrOrgCode;
      }    
      public String  getProviderOrgCode(){
       		return this.providerOrgCode;
      }    
      public String  getRemark(){
       		return this.remark;
      }    
	  public String getErrorMessage() {
	        return errorMessage;
	  }
	  public String getErrorDetail() {
	        return errorDetail;
	  }  
}