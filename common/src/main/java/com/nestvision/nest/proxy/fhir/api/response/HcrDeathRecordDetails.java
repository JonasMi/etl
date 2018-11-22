package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.HcrDeathRecord;

public class HcrDeathRecordDetails extends HcrDeathRecordRecord {
    /**
     *名称:死亡记录id
     *
 	 *
     */
     private String hcrDeathRecordId;
    /**
     *名称:记录日期
     *
 	 *
     */
     private Long date;
    /**
     *名称:患者年龄
     *
 	 *
     */
     private Float age;
    /**
     *名称:民族代码
     *
 	 *限制:CV9900377
     */
     private String nationCd;
    /**
     *名称:职业代码
     *
 	 *限制:GBT22614
     */
     private String occupationCd;
    /**
     *名称:学历代码
     *
 	 *限制:GBT4658
     */
     private String educationCd;
    /**
     *名称:出生日期
     *
 	 *
     */
     private Long birthdate;
    /**
     *名称:出生地住址-省（自治区、直辖市）代码
     *
 	 *限制:GBT2260
     */
     private String birthProCode;
    /**
     *名称:出生地住址-市（地区）代码
     *
 	 *限制:GBT2260
     */
     private String birthCityCode;
    /**
     *名称:出生地住址-县（区）代码
     *
 	 *限制:GBT2260
     */
     private String birthCouCode;
    /**
     *名称:出生地住址-村（街、路、弄等）
     *
 	 *
     */
     private String birthAddressVillage;
    /**
     *名称:国籍代码
     *
 	 *限制:GBT2659
     */
     private String nationalityCode;
    /**
     *名称:行政区划代码
     *
 	 *限制:GBT2260
     */
     private String administration;
    /**
     *名称:工作单位
     *
 	 *
     */
     private String workUnit;
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
     *名称:联系电话
     *
 	 *
     */
     private String telecom;
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
     *名称:家庭住址-邮政编码
     *
 	 *
     */
     private String homePostCd;
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
     *名称:现居住地址-邮政编码
     *
 	 *
     */
     private String tempPostCd;
    /**
     *名称:现居住地址-详细信息
     *
 	 *
     */
     private String tempText;
    /**
     *名称:工作住址-省（自治区、直辖市）代码
     *
 	 *限制:GBT2260
     */
     private String workState;
    /**
     *名称:工作住址-市（地区）代码
     *
 	 *限制:GBT2260
     */
     private String workCity;
    /**
     *名称:工作住址-县（区）代码
     *
 	 *限制:GBT2260
     */
     private String workDistrict;
    /**
     *名称:工作住址-乡（镇、街道办事处）
     *
 	 *
     */
     private String workLine;
    /**
     *名称:工作住址-村（街、路、弄等）
     *
 	 *
     */
     private String workRoad;
    /**
     *名称:工作住址-门牌号码
     *
 	 *
     */
     private String workHouseNo;
    /**
     *名称:工作住址-邮政编码
     *
 	 *
     */
     private String workPostCd;
    /**
     *名称:工作住址-详细信息
     *
 	 *
     */
     private String workAddressDetails;
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
     *名称:联系人地址-省（自治区、直辖市）代码
     *
 	 *限制:GBT2260
     */
     private String contactsTempState;
    /**
     *名称:联系人地址-市（地区）代码
     *
 	 *限制:GBT2260
     */
     private String contactsTempCity;
    /**
     *名称:联系人地址-县（区）代码
     *
 	 *限制:GBT2260
     */
     private String contactsTempDistrict;
    /**
     *名称:联系人地址-乡（镇、街道办事处）
     *
 	 *
     */
     private String contactsTempLine;
    /**
     *名称:联系人地址-村（街、路、弄等）
     *
 	 *
     */
     private String contactsTempRoad;
    /**
     *名称:联系人地址-门牌号码
     *
 	 *
     */
     private String contactsTempHouseNo;
    /**
     *名称:联系人地址-详细信息
     *
 	 *
     */
     private String contactsAddressDetails;
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
     *名称:住院医师签名日期
     *
 	 *
     */
     private Long residentDoctorSignDate;
    /**
     *名称:住院医师id
     *
 	 *
     */
     private String residentDoctorId;
    /**
     *名称:住院医师姓名
     *
 	 *
     */
     private String residentDoctorName;
    /**
     *名称:住院医师职务代码
     *
 	 *限制:CV9900374
     */
     private String residentDoctorPostCode;
    /**
     *名称:主治医师签名日期
     *
 	 *
     */
     private Long attendingDoctorSignDate;
    /**
     *名称:主治医师id
     *
 	 *
     */
     private String attendingDoctorId;
    /**
     *名称:主治医师姓名
     *
 	 *
     */
     private String attendingDoctorName;
    /**
     *名称:主治医师职务代码
     *
 	 *限制:CV9900374
     */
     private String attendingDoctorPostCode;
    /**
     *名称:主任医师签名日期
     *
 	 *
     */
     private Long directorDoctorSignDate;
    /**
     *名称:主任医师id
     *
 	 *
     */
     private String directorDoctorId;
    /**
     *名称:主任医师姓名
     *
 	 *
     */
     private String directorDoctorName;
    /**
     *名称:主任医师职务代码
     *
 	 *限制:CV9900374
     */
     private String directorDoctorPostCode;
    /**
     *名称:病房号
     *
 	 *
     */
     private String wardNo;
    /**
     *名称:病区
     *
 	 *
     */
     private String wardArea;
    /**
     *名称:床位号
     *
 	 *
     */
     private String bedNum;
    /**
     *名称:住院流水号
     *
 	 *
     */
     private String inpatientRegistrationId;
    /**
     *名称:就诊科室id
     *
 	 *
     */
     private String visitingDeptId;
    /**
     *名称:就诊科室名称
     *
 	 *
     */
     private String visitingDeptName;
    /**
     *名称:就诊科室标准编码
     *
 	 *限制:CV9900051
     */
     private String visitingDeptCd;
    /**
     *名称:入院时间
     *
 	 *
     */
     private Long start;
    /**
     *名称:住院号
     *
 	 *
     */
     private String inhId;
    /**
     *名称:死亡原因代码
     *
 	 *限制:CV990111
     */
     private String deathCauseCode;
    /**
     *名称:死亡原因名称
     *
 	 *
     */
     private String deathCauseName;
    /**
     *名称:死亡时间
     *
 	 *
     */
     private Long deathTime;
    /**
     *名称:死亡地点类别
     *
 	 *限制:CV0201103
     */
     private String deathPlaceCategory;
    /**
     *名称:死亡原因分类代码
     *
 	 *限制:CV9900379
     */
     private String deathCauseClassificationCode;
    /**
     *名称:主要致死疾病的最高诊断机构级别代码
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
     *名称:死亡诊断编码
     *
 	 *限制:CV990111
     */
     private String deathDiagCode;
    /**
     *名称:死亡诊断名称
     *
 	 *
     */
     private String deathDiagName;
    /**
     *名称:入院诊断-入院情况
     *
 	 *
     */
     private String inpatientDiagDetails;
    /**
     *名称:入院诊断-诊断编码
     *
 	 *限制:CV990111
     */
     private String inpatientDiagCode;
    /**
     *名称:入院诊断-诊断名称
     *
 	 *
     */
     private String inpatientDiagName;
    /**
     *名称:入院诊断-诊断日期
     *
 	 *
     */
     private Long inpatientDiagDate;
    /**
     *名称:住院过程-诊疗过程描述
     *
 	 *
     */
     private String treatRescueCourse;
    /**
     *名称:尸检意见-家属是否同意尸体解剖标志
     *
 	 *限制:CUS00004
     */
     private Boolean familyAdviceForDissect;
    /**
     *名称:就诊时间
     *
 	 *
     */
     private Long visitingTime;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
     */
     private String upHospitalName;
     private String errorMessage;
     private String errorDetail;             
     public HcrDeathRecordDetails(HcrDeathRecord hcrDeathRecord) {
        super(hcrDeathRecord);
         this.hcrDeathRecordId=hcrDeathRecord.getHcrDeathRecordId();
         java.util.Date _date = hcrDeathRecord.getDate();
         if(_date!=null){
         	this.date=_date.getTime();
         }
         this.age=hcrDeathRecord.getAge();
         this.nationCd=hcrDeathRecord.getNationCd();
         this.occupationCd=hcrDeathRecord.getOccupationCd();
         this.educationCd=hcrDeathRecord.getEducationCd();
         java.util.Date _birthdate = hcrDeathRecord.getBirthdate();
         if(_birthdate!=null){
         	this.birthdate=_birthdate.getTime();
         }
         this.birthProCode=hcrDeathRecord.getBirthProCode();
         this.birthCityCode=hcrDeathRecord.getBirthCityCode();
         this.birthCouCode=hcrDeathRecord.getBirthCouCode();
         this.birthAddressVillage=hcrDeathRecord.getBirthAddressVillage();
         this.nationalityCode=hcrDeathRecord.getNationalityCode();
         this.administration=hcrDeathRecord.getAdministration();
         this.workUnit=hcrDeathRecord.getWorkUnit();
         this.patientId=hcrDeathRecord.getPatientId();
         this.idCard=hcrDeathRecord.getIdCard();
         this.healthFileNumber=hcrDeathRecord.getHealthFileNumber();
         this.healthCard=hcrDeathRecord.getHealthCard();
         this.name=hcrDeathRecord.getName();
         this.gender=hcrDeathRecord.getGender();
         this.telecom=hcrDeathRecord.getTelecom();
         this.homeState=hcrDeathRecord.getHomeState();
         this.homeCity=hcrDeathRecord.getHomeCity();
         this.homeDistrict=hcrDeathRecord.getHomeDistrict();
         this.homeLine=hcrDeathRecord.getHomeLine();
         this.homeRoad=hcrDeathRecord.getHomeRoad();
         this.homeHouseNo=hcrDeathRecord.getHomeHouseNo();
         this.homeText=hcrDeathRecord.getHomeText();
         this.homePostCd=hcrDeathRecord.getHomePostCd();
         this.tempState=hcrDeathRecord.getTempState();
         this.tempCity=hcrDeathRecord.getTempCity();
         this.tempDistrict=hcrDeathRecord.getTempDistrict();
         this.tempLine=hcrDeathRecord.getTempLine();
         this.tempRoad=hcrDeathRecord.getTempRoad();
         this.tempHouseNo=hcrDeathRecord.getTempHouseNo();
         this.tempPostCd=hcrDeathRecord.getTempPostCd();
         this.tempText=hcrDeathRecord.getTempText();
         this.workState=hcrDeathRecord.getWorkState();
         this.workCity=hcrDeathRecord.getWorkCity();
         this.workDistrict=hcrDeathRecord.getWorkDistrict();
         this.workLine=hcrDeathRecord.getWorkLine();
         this.workRoad=hcrDeathRecord.getWorkRoad();
         this.workHouseNo=hcrDeathRecord.getWorkHouseNo();
         this.workPostCd=hcrDeathRecord.getWorkPostCd();
         this.workAddressDetails=hcrDeathRecord.getWorkAddressDetails();
         this.maritalstatus=hcrDeathRecord.getMaritalstatus();
         this.relationship=hcrDeathRecord.getRelationship();
         this.contactsName=hcrDeathRecord.getContactsName();
         this.contactsPhone=hcrDeathRecord.getContactsPhone();
         this.contactsTempState=hcrDeathRecord.getContactsTempState();
         this.contactsTempCity=hcrDeathRecord.getContactsTempCity();
         this.contactsTempDistrict=hcrDeathRecord.getContactsTempDistrict();
         this.contactsTempLine=hcrDeathRecord.getContactsTempLine();
         this.contactsTempRoad=hcrDeathRecord.getContactsTempRoad();
         this.contactsTempHouseNo=hcrDeathRecord.getContactsTempHouseNo();
         this.contactsAddressDetails=hcrDeathRecord.getContactsAddressDetails();
         this.authorId=hcrDeathRecord.getAuthorId();
         this.authorName=hcrDeathRecord.getAuthorName();
         java.util.Date _residentDoctorSignDate = hcrDeathRecord.getResidentDoctorSignDate();
         if(_residentDoctorSignDate!=null){
         	this.residentDoctorSignDate=_residentDoctorSignDate.getTime();
         }
         this.residentDoctorId=hcrDeathRecord.getResidentDoctorId();
         this.residentDoctorName=hcrDeathRecord.getResidentDoctorName();
         this.residentDoctorPostCode=hcrDeathRecord.getResidentDoctorPostCode();
         java.util.Date _attendingDoctorSignDate = hcrDeathRecord.getAttendingDoctorSignDate();
         if(_attendingDoctorSignDate!=null){
         	this.attendingDoctorSignDate=_attendingDoctorSignDate.getTime();
         }
         this.attendingDoctorId=hcrDeathRecord.getAttendingDoctorId();
         this.attendingDoctorName=hcrDeathRecord.getAttendingDoctorName();
         this.attendingDoctorPostCode=hcrDeathRecord.getAttendingDoctorPostCode();
         java.util.Date _directorDoctorSignDate = hcrDeathRecord.getDirectorDoctorSignDate();
         if(_directorDoctorSignDate!=null){
         	this.directorDoctorSignDate=_directorDoctorSignDate.getTime();
         }
         this.directorDoctorId=hcrDeathRecord.getDirectorDoctorId();
         this.directorDoctorName=hcrDeathRecord.getDirectorDoctorName();
         this.directorDoctorPostCode=hcrDeathRecord.getDirectorDoctorPostCode();
         this.wardNo=hcrDeathRecord.getWardNo();
         this.wardArea=hcrDeathRecord.getWardArea();
         this.bedNum=hcrDeathRecord.getBedNum();
         this.inpatientRegistrationId=hcrDeathRecord.getInpatientRegistrationId();
         this.visitingDeptId=hcrDeathRecord.getVisitingDeptId();
         this.visitingDeptName=hcrDeathRecord.getVisitingDeptName();
         this.visitingDeptCd=hcrDeathRecord.getVisitingDeptCd();
         java.util.Date _start = hcrDeathRecord.getStart();
         if(_start!=null){
         	this.start=_start.getTime();
         }
         this.inhId=hcrDeathRecord.getInhId();
         this.deathCauseCode=hcrDeathRecord.getDeathCauseCode();
         this.deathCauseName=hcrDeathRecord.getDeathCauseName();
         java.util.Date _deathTime = hcrDeathRecord.getDeathTime();
         if(_deathTime!=null){
         	this.deathTime=_deathTime.getTime();
         }
         this.deathPlaceCategory=hcrDeathRecord.getDeathPlaceCategory();
         this.deathCauseClassificationCode=hcrDeathRecord.getDeathCauseClassificationCode();
         this.highestDiagnosticLevel=hcrDeathRecord.getHighestDiagnosticLevel();
         this.highestDeathDiagnosisCategoryCode=hcrDeathRecord.getHighestDeathDiagnosisCategoryCode();
         this.deathDiagCode=hcrDeathRecord.getDeathDiagCode();
         this.deathDiagName=hcrDeathRecord.getDeathDiagName();
         this.inpatientDiagDetails=hcrDeathRecord.getInpatientDiagDetails();
         this.inpatientDiagCode=hcrDeathRecord.getInpatientDiagCode();
         this.inpatientDiagName=hcrDeathRecord.getInpatientDiagName();
         java.util.Date _inpatientDiagDate = hcrDeathRecord.getInpatientDiagDate();
         if(_inpatientDiagDate!=null){
         	this.inpatientDiagDate=_inpatientDiagDate.getTime();
         }
         this.treatRescueCourse=hcrDeathRecord.getTreatRescueCourse();
         this.familyAdviceForDissect=hcrDeathRecord.getFamilyAdviceForDissect();
         java.util.Date _visitingTime = hcrDeathRecord.getVisitingTime();
         if(_visitingTime!=null){
         	this.visitingTime=_visitingTime.getTime();
         }
         this.upHospitalName=hcrDeathRecord.getUpHospitalName();
         this.errorMessage=hcrDeathRecord.getErrorMessage();
         this.errorDetail=hcrDeathRecord.getErrorDetail();      
    }
      public String  getHcrDeathRecordId(){
       		return this.hcrDeathRecordId;
      }    
      public Long  getDate(){
       		return this.date;
      }    
      public Float  getAge(){
       		return this.age;
      }    
      public String  getNationCd(){
       		return this.nationCd;
      }    
      public String  getOccupationCd(){
       		return this.occupationCd;
      }    
      public String  getEducationCd(){
       		return this.educationCd;
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
      public String  getBirthAddressVillage(){
       		return this.birthAddressVillage;
      }    
      public String  getNationalityCode(){
       		return this.nationalityCode;
      }    
      public String  getAdministration(){
       		return this.administration;
      }    
      public String  getWorkUnit(){
       		return this.workUnit;
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
      public String  getTelecom(){
       		return this.telecom;
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
      public String  getHomePostCd(){
       		return this.homePostCd;
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
      public String  getTempPostCd(){
       		return this.tempPostCd;
      }    
      public String  getTempText(){
       		return this.tempText;
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
      public String  getWorkPostCd(){
       		return this.workPostCd;
      }    
      public String  getWorkAddressDetails(){
       		return this.workAddressDetails;
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
      public String  getContactsTempState(){
       		return this.contactsTempState;
      }    
      public String  getContactsTempCity(){
       		return this.contactsTempCity;
      }    
      public String  getContactsTempDistrict(){
       		return this.contactsTempDistrict;
      }    
      public String  getContactsTempLine(){
       		return this.contactsTempLine;
      }    
      public String  getContactsTempRoad(){
       		return this.contactsTempRoad;
      }    
      public String  getContactsTempHouseNo(){
       		return this.contactsTempHouseNo;
      }    
      public String  getContactsAddressDetails(){
       		return this.contactsAddressDetails;
      }    
      public String  getAuthorId(){
       		return this.authorId;
      }    
      public String  getAuthorName(){
       		return this.authorName;
      }    
      public Long  getResidentDoctorSignDate(){
       		return this.residentDoctorSignDate;
      }    
      public String  getResidentDoctorId(){
       		return this.residentDoctorId;
      }    
      public String  getResidentDoctorName(){
       		return this.residentDoctorName;
      }    
      public String  getResidentDoctorPostCode(){
       		return this.residentDoctorPostCode;
      }    
      public Long  getAttendingDoctorSignDate(){
       		return this.attendingDoctorSignDate;
      }    
      public String  getAttendingDoctorId(){
       		return this.attendingDoctorId;
      }    
      public String  getAttendingDoctorName(){
       		return this.attendingDoctorName;
      }    
      public String  getAttendingDoctorPostCode(){
       		return this.attendingDoctorPostCode;
      }    
      public Long  getDirectorDoctorSignDate(){
       		return this.directorDoctorSignDate;
      }    
      public String  getDirectorDoctorId(){
       		return this.directorDoctorId;
      }    
      public String  getDirectorDoctorName(){
       		return this.directorDoctorName;
      }    
      public String  getDirectorDoctorPostCode(){
       		return this.directorDoctorPostCode;
      }    
      public String  getWardNo(){
       		return this.wardNo;
      }    
      public String  getWardArea(){
       		return this.wardArea;
      }    
      public String  getBedNum(){
       		return this.bedNum;
      }    
      public String  getInpatientRegistrationId(){
       		return this.inpatientRegistrationId;
      }    
      public String  getVisitingDeptId(){
       		return this.visitingDeptId;
      }    
      public String  getVisitingDeptName(){
       		return this.visitingDeptName;
      }    
      public String  getVisitingDeptCd(){
       		return this.visitingDeptCd;
      }    
      public Long  getStart(){
       		return this.start;
      }    
      public String  getInhId(){
       		return this.inhId;
      }    
      public String  getDeathCauseCode(){
       		return this.deathCauseCode;
      }    
      public String  getDeathCauseName(){
       		return this.deathCauseName;
      }    
      public Long  getDeathTime(){
       		return this.deathTime;
      }    
      public String  getDeathPlaceCategory(){
       		return this.deathPlaceCategory;
      }    
      public String  getDeathCauseClassificationCode(){
       		return this.deathCauseClassificationCode;
      }    
      public String  getHighestDiagnosticLevel(){
       		return this.highestDiagnosticLevel;
      }    
      public String  getHighestDeathDiagnosisCategoryCode(){
       		return this.highestDeathDiagnosisCategoryCode;
      }    
      public String  getDeathDiagCode(){
       		return this.deathDiagCode;
      }    
      public String  getDeathDiagName(){
       		return this.deathDiagName;
      }    
      public String  getInpatientDiagDetails(){
       		return this.inpatientDiagDetails;
      }    
      public String  getInpatientDiagCode(){
       		return this.inpatientDiagCode;
      }    
      public String  getInpatientDiagName(){
       		return this.inpatientDiagName;
      }    
      public Long  getInpatientDiagDate(){
       		return this.inpatientDiagDate;
      }    
      public String  getTreatRescueCourse(){
       		return this.treatRescueCourse;
      }    
      public Boolean  getFamilyAdviceForDissect(){
       		return this.familyAdviceForDissect;
      }    
      public Long  getVisitingTime(){
       		return this.visitingTime;
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