package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.AdmissionRecord;

public class AdmissionRecordDetails extends AdmissionRecordRecord {
    /**
     *名称:院内入院记录id
     *
 	 *
     */
     private String admissionRecordId;
    /**
     *名称:记录日期
     *
 	 *
     */
     private Long date;
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
     *名称:年龄
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
     *名称:工作单位
     *
 	 *
     */
     private String workUnit;
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
     *名称:住院流水号
     *
 	 *
     */
     private String inpatientRegistrationId;
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
     *名称:中医"四诊"观察结果
     *
 	 *
     */
     private String cnFourResult;
    /**
     *名称:出院科室id
     *
 	 *
     */
     private String outDeptId;
    /**
     *名称:出院科室名称
     *
 	 *
     */
     private String outDeptName;
    /**
     *名称:出院科室标准编码
     *
 	 *限制:CV9900051
     */
     private String outDeptCd;
    /**
     *名称:住院天数
     *
 	 *
     */
     private Float inpatientDays;
    /**
     *名称:死亡时间
     *
 	 *
     */
     private Long deathTime;
    /**
     *名称:出院病房
     *
 	 *
     */
     private String outpatWardNo;
    /**
     *名称:死亡原因描述
     *
 	 *
     */
     private String deathCause;
    /**
     *名称:死亡诊断代码
     *
 	 *限制:CV990111
     */
     private String deathDiagnosticCode;
    /**
     *名称:治疗结果代码
     *
 	 *限制:CV0510010
     */
     private String treatmentResultCode;
    /**
     *名称:出院医嘱
     *
 	 *
     */
     private String dischargeOrder;
    /**
     *名称:病历陈述时间
     *
 	 *
     */
     private Long presentationTime;
    /**
     *名称:入院记录类型代码
     *
 	 *限制:CV990107
     */
     private String admissionRecordTypeCode;
    /**
     *名称:护理科室id
     *
 	 *
     */
     private String nursingDeptId;
    /**
     *名称:护理科室名称
     *
 	 *
     */
     private String nursingDeptName;
    /**
     *名称:护理科室标准编码
     *
 	 *限制:CV9900051
     */
     private String nursingDeptCd;
    /**
     *名称:最终审核者者id
     *
 	 *
     */
     private String auditorId;
    /**
     *名称:最终审核者姓名
     *
 	 *
     */
     private String auditorName;
    /**
     *名称:最终审核者签名日期
     *
 	 *
     */
     private Long auditorDate;
    /**
     *名称:最终审核者专业技术职务代码
     *
 	 *限制:CV9900374
     */
     private String auditorPost;
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
     *名称:住院医师签名日期
     *
 	 *
     */
     private Long residentDoctorSignDate;
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
     *名称:主治医师签名日期
     *
 	 *
     */
     private Long attendingDoctorSignDate;
    /**
     *名称:记录者id
     *
 	 *
     */
     private String recorderId;
    /**
     *名称:记录者姓名
     *
 	 *
     */
     private String recorderName;
    /**
     *名称:记录者签名日期
     *
 	 *
     */
     private Long recorderSignDate;
    /**
     *名称:接诊医师id
     *
 	 *
     */
     private String receiveEmployeeId;
    /**
     *名称:接诊医师姓名
     *
 	 *
     */
     private String receiveEmployeeName;
    /**
     *名称:接诊医师签名日期
     *
 	 *
     */
     private Long receiveEmployeeDate;
    /**
     *名称:接诊医师专业技术职务代码
     *
 	 *限制:CV9900374
     */
     private String receiveEmployeePost;
    /**
     *名称:主管护士id
     *
 	 *
     */
     private String chargeNurseId;
    /**
     *名称:主管护士姓名
     *
 	 *
     */
     private String chargeNurseName;
    /**
     *名称:主管护士签名日期
     *
 	 *
     */
     private Long chargeNurseDate;
    /**
     *名称:主诉
     *
 	 *
     */
     private String chief;
    /**
     *名称:现病史
     *
 	 *
     */
     private String illness;
    /**
     *名称:既往史
     *
 	 *
     */
     private String history;
    /**
     *名称:健康状况标志
     *
 	 *限制:CUS00004
     */
     private Boolean healthMark;
    /**
     *名称:疾病史（含外伤）
     *
 	 *
     */
     private String historyOfDisease;
    /**
     *名称:传染性标志
     *
 	 *限制:CUS00004
     */
     private Boolean infectiousMark;
    /**
     *名称:传染病史
     *
 	 *
     */
     private String infectionHistory;
    /**
     *名称:婚育史
     *
 	 *
     */
     private String obstetricalHistory;
    /**
     *名称:过敏史描述
     *
 	 *
     */
     private String rritability;
    /**
     *名称:手术史
     *
 	 *
     */
     private String opHis;
    /**
     *名称:预防接种史描述
     *
 	 *
     */
     private String vaccHis;
    /**
     *名称:输血史描述
     *
 	 *
     */
     private String transfusionHis;
    /**
     *名称:个人史
     *
 	 *
     */
     private String perHistory;
    /**
     *名称:月经史
     *
 	 *
     */
     private String mensesHis;
    /**
     *名称:家族史
     *
 	 *
     */
     private String famHistory;
    /**
     *名称:体格检查：体温
     *备注:(体温的测量值，计量单位为℃)
 	 *
     */
     private Float bodyTemperature;
    /**
     *名称:体格检查：脉搏
     *备注:(患者每分钟脉搏次数的测量值，计量单位为次/min)
 	 *
     */
     private Integer prFreq;
    /**
     *名称:体格检查：呼吸
     *备注:(患者每分钟呼吸次数的测量值，计量单位为次/min)
 	 *
     */
     private Integer breatheFreq;
    /**
     *名称:体格检查：收缩压
     *备注:(收缩压的测量值，计量单位为mmHg)
 	 *
     */
     private Integer sbp;
    /**
     *名称:体格检查：舒张压
     *备注:(舒张压的测量值，计量单位为mmHg)
 	 *
     */
     private Integer dbp;
    /**
     *名称:体格检查：身高
     *备注:(患者身高的测量值，计量单位为cm)
 	 *
     */
     private Float bodyHeight;
    /**
     *名称:体格检查：体重
     *备注:(患者体重的测量值，计量单位为kg)
 	 *
     */
     private Float bodyWeight;
    /**
     *名称:体格检查：一般状况
     *
 	 *
     */
     private String generalSituExamResult;
    /**
     *名称:体格检查：皮肤粘膜
     *
 	 *
     */
     private String skin;
    /**
     *名称:体格检查：淋巴结
     *
 	 *
     */
     private String ln;
    /**
     *名称:体格检查：头部
     *
 	 *
     */
     private String head;
    /**
     *名称:体格检查：颈部
     *
 	 *
     */
     private String neck;
    /**
     *名称:体格检查：胸部
     *
 	 *
     */
     private String chest;
    /**
     *名称:体格检查：腹部
     *
 	 *
     */
     private String belly;
    /**
     *名称:体格检查：肛门直肠
     *
 	 *
     */
     private String dreResultDescr;
    /**
     *名称:体格检查：生殖器
     *
 	 *
     */
     private String anusPudendum;
    /**
     *名称:体格检查：脊椎
     *
 	 *
     */
     private String spine;
    /**
     *名称:体格检查：四肢
     *
 	 *
     */
     private String limbs;
    /**
     *名称:体格检查：神经系统
     *
 	 *
     */
     private String mental;
    /**
     *名称:专科情况检查
     *
 	 *
     */
     private String specialistChecks;
    /**
     *名称:体格检查：肺
     *
 	 *
     */
     private String lung;
    /**
     *名称:体格检查：心
     *
 	 *
     */
     private String heart;
    /**
     *名称:体格检查：周围血管
     *
 	 *
     */
     private String peripheralVessels;
    /**
     *名称:辅助检查结果
     *
 	 *
     */
     private String auxiliaryExaminationResults;
    /**
     *名称:陈述内容可靠标志
     *
 	 *限制:CUS00004
     */
     private Boolean statementsReliability;
    /**
     *名称:治则治法
     *
 	 *限制:GBT167513
     */
     private String therapeuticPrinciples;
    /**
     *名称:诊疗过程描述
     *
 	 *
     */
     private String treatRescueCourse;
    /**
     *名称:初步诊断-记录id
     *
 	 *
     */
     private String preliminaryDiagId;
    /**
     *名称:初步诊断-中医症候代码
     *
 	 *限制:CV9900357
     */
     private String preliminaryCnSymDiagCode;
    /**
     *名称:初步诊断-中医病名代码
     *
 	 *限制:CV9900357
     */
     private String preliminaryCnDisDiagCode;
    /**
     *名称:初步诊断-西医诊断顺位
     *
 	 *
     */
     private Float preliminaryAdmitDiag;
    /**
     *名称:初步诊断-中医诊断顺位
     *
 	 *
     */
     private Float preliminaryTcmAdmitDiag;
    /**
     *名称:初步诊断-诊断编码
     *
 	 *限制:CV990111
     */
     private String preliminaryDiagCode;
    /**
     *名称:初步诊断-诊断编码名称
     *
 	 *
     */
     private String preliminaryDiagName;
    /**
     *名称:初步诊断-诊断日期
     *
 	 *
     */
     private Long preliminaryDiagDate;
    /**
     *名称:修正诊断-记录id
     *
 	 *
     */
     private String correctDiagId;
    /**
     *名称:修正诊断-中医症候代码
     *
 	 *限制:CV9900357
     */
     private String correctCnSymDiagCode;
    /**
     *名称:修正诊断-中医病名代码
     *
 	 *限制:CV9900357
     */
     private String correctCnDisDiagCode;
    /**
     *名称:修正诊断-西医诊断顺位
     *
 	 *
     */
     private Float correctAdmitDiag;
    /**
     *名称:修正诊断-中医诊断顺位
     *
 	 *
     */
     private Float correctTcmAdmitDiag;
    /**
     *名称:修正诊断-诊断编码
     *
 	 *限制:CV990111
     */
     private String correctDiagCode;
    /**
     *名称:修正诊断-诊断编码名称
     *
 	 *
     */
     private String correctDiagName;
    /**
     *名称:修正诊断-诊断日期
     *
 	 *
     */
     private Long correctDiagDate;
    /**
     *名称:确定诊断-记录id
     *
 	 *
     */
     private String determineDiagId;
    /**
     *名称:确定诊断-中医症候代码
     *
 	 *限制:CV9900357
     */
     private String determineCnSymDiagCode;
    /**
     *名称:确定诊断-中医病名代码
     *
 	 *限制:CV9900357
     */
     private String determineCnDisDiagCode;
    /**
     *名称:确定诊断-西医诊断顺位
     *
 	 *
     */
     private Float determineAdmitDiag;
    /**
     *名称:确定诊断-中医诊断顺位
     *
 	 *
     */
     private Float determineTcmAdmitDiag;
    /**
     *名称:确定诊断-诊断编码
     *
 	 *限制:CV990111
     */
     private String determineDiagCode;
    /**
     *名称:确定诊断-诊断编码名称
     *
 	 *
     */
     private String determineDiagName;
    /**
     *名称:确定诊断-诊断日期
     *
 	 *
     */
     private Long determineDiagDate;
    /**
     *名称:补充诊断-记录id
     *
 	 *
     */
     private String supplementDiagId;
    /**
     *名称:补充诊断-中医症候代码
     *
 	 *限制:CV9900357
     */
     private String supplementCnSymDiagCode;
    /**
     *名称:补充诊断-中医病名代码
     *
 	 *限制:CV9900357
     */
     private String supplementCnDisDiagCode;
    /**
     *名称:补充诊断-西医诊断顺位
     *
 	 *
     */
     private Float supplementAdmitDiag;
    /**
     *名称:补充诊断-中医诊断顺位
     *
 	 *
     */
     private Float supplementTcmAdmitDiag;
    /**
     *名称:补充诊断-诊断编码
     *
 	 *限制:CV990111
     */
     private String supplementDiagCode;
    /**
     *名称:补充诊断-诊断编码名称
     *
 	 *
     */
     private String supplementDiagName;
    /**
     *名称:补充诊断-诊断日期
     *
 	 *
     */
     private Long supplementDiagDate;
    /**
     *名称:入院诊断-记录id
     *
 	 *
     */
     private String inhosDiagId;
    /**
     *名称:入院情况
     *
 	 *
     */
     private String inpatientDetails;
    /**
     *名称:入院诊断-中医症候代码
     *
 	 *限制:CV9900357
     */
     private String inhosCnSymDiagCode;
    /**
     *名称:入院诊断-中医病名代码
     *
 	 *限制:CV9900357
     */
     private String inhosCnDisDiagCode;
    /**
     *名称:入院诊断-西医诊断顺位
     *
 	 *
     */
     private Float inhosAdmitDiag;
    /**
     *名称:入院诊断-中医诊断顺位
     *
 	 *
     */
     private Float inhosTcmAdmitDiag;
    /**
     *名称:入院诊断-诊断编码
     *
 	 *限制:CV990111
     */
     private String inhosDiagCode;
    /**
     *名称:入院诊断-诊断编码名称
     *
 	 *
     */
     private String inhosDiagName;
    /**
     *名称:入院诊断-诊断日期
     *
 	 *
     */
     private Long inhosDiagDate;
    /**
     *名称:出院诊断-记录id
     *
 	 *
     */
     private String outhosDiagId;
    /**
     *名称:出院情况
     *
 	 *
     */
     private String outpatientDetails;
    /**
     *名称:出院诊断-诊断编码
     *
 	 *限制:CV990111
     */
     private String outhosDiagCode;
    /**
     *名称:出院诊断-诊断编码名称
     *
 	 *
     */
     private String outhosDiagName;
    /**
     *名称:出院诊断-诊断日期
     *
 	 *
     */
     private Long outhosDiagDate;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
     */
     private String upHospitalName;
     private String errorMessage;
     private String errorDetail;             
     public AdmissionRecordDetails(AdmissionRecord admissionRecord) {
        super(admissionRecord);
         this.admissionRecordId=admissionRecord.getAdmissionRecordId();
         java.util.Date _date = admissionRecord.getDate();
         if(_date!=null){
         	this.date=_date.getTime();
         }
         this.patientId=admissionRecord.getPatientId();
         this.idCard=admissionRecord.getIdCard();
         this.healthFileNumber=admissionRecord.getHealthFileNumber();
         this.healthCard=admissionRecord.getHealthCard();
         this.name=admissionRecord.getName();
         this.gender=admissionRecord.getGender();
         java.util.Date _birthdate = admissionRecord.getBirthdate();
         if(_birthdate!=null){
         	this.birthdate=_birthdate.getTime();
         }
         this.age=admissionRecord.getAge();
         this.nationCd=admissionRecord.getNationCd();
         this.occupationCd=admissionRecord.getOccupationCd();
         this.relationship=admissionRecord.getRelationship();
         this.contactsName=admissionRecord.getContactsName();
         this.contactsPhone=admissionRecord.getContactsPhone();
         this.homeState=admissionRecord.getHomeState();
         this.homeCity=admissionRecord.getHomeCity();
         this.homeDistrict=admissionRecord.getHomeDistrict();
         this.homeLine=admissionRecord.getHomeLine();
         this.homeRoad=admissionRecord.getHomeRoad();
         this.homeHouseNo=admissionRecord.getHomeHouseNo();
         this.homeText=admissionRecord.getHomeText();
         this.maritalstatus=admissionRecord.getMaritalstatus();
         this.tempState=admissionRecord.getTempState();
         this.tempCity=admissionRecord.getTempCity();
         this.tempDistrict=admissionRecord.getTempDistrict();
         this.tempLine=admissionRecord.getTempLine();
         this.tempRoad=admissionRecord.getTempRoad();
         this.tempHouseNo=admissionRecord.getTempHouseNo();
         this.tempPostCd=admissionRecord.getTempPostCd();
         this.tempText=admissionRecord.getTempText();
         this.birthProCode=admissionRecord.getBirthProCode();
         this.birthCityCode=admissionRecord.getBirthCityCode();
         this.birthCouCode=admissionRecord.getBirthCouCode();
         this.birthAddressVillage=admissionRecord.getBirthAddressVillage();
         this.workUnit=admissionRecord.getWorkUnit();
         this.authorId=admissionRecord.getAuthorId();
         this.authorName=admissionRecord.getAuthorName();
         this.inpatientRegistrationId=admissionRecord.getInpatientRegistrationId();
         java.util.Date _start = admissionRecord.getStart();
         if(_start!=null){
         	this.start=_start.getTime();
         }
         this.inhId=admissionRecord.getInhId();
         this.visitingDeptId=admissionRecord.getVisitingDeptId();
         this.visitingDeptName=admissionRecord.getVisitingDeptName();
         this.visitingDeptCd=admissionRecord.getVisitingDeptCd();
         this.wardNo=admissionRecord.getWardNo();
         this.wardArea=admissionRecord.getWardArea();
         this.bedNum=admissionRecord.getBedNum();
         this.cnFourResult=admissionRecord.getCnFourResult();
         this.outDeptId=admissionRecord.getOutDeptId();
         this.outDeptName=admissionRecord.getOutDeptName();
         this.outDeptCd=admissionRecord.getOutDeptCd();
         this.inpatientDays=admissionRecord.getInpatientDays();
         java.util.Date _deathTime = admissionRecord.getDeathTime();
         if(_deathTime!=null){
         	this.deathTime=_deathTime.getTime();
         }
         this.outpatWardNo=admissionRecord.getOutpatWardNo();
         this.deathCause=admissionRecord.getDeathCause();
         this.deathDiagnosticCode=admissionRecord.getDeathDiagnosticCode();
         this.treatmentResultCode=admissionRecord.getTreatmentResultCode();
         this.dischargeOrder=admissionRecord.getDischargeOrder();
         java.util.Date _presentationTime = admissionRecord.getPresentationTime();
         if(_presentationTime!=null){
         	this.presentationTime=_presentationTime.getTime();
         }
         this.admissionRecordTypeCode=admissionRecord.getAdmissionRecordTypeCode();
         this.nursingDeptId=admissionRecord.getNursingDeptId();
         this.nursingDeptName=admissionRecord.getNursingDeptName();
         this.nursingDeptCd=admissionRecord.getNursingDeptCd();
         this.auditorId=admissionRecord.getAuditorId();
         this.auditorName=admissionRecord.getAuditorName();
         java.util.Date _auditorDate = admissionRecord.getAuditorDate();
         if(_auditorDate!=null){
         	this.auditorDate=_auditorDate.getTime();
         }
         this.auditorPost=admissionRecord.getAuditorPost();
         this.residentDoctorId=admissionRecord.getResidentDoctorId();
         this.residentDoctorName=admissionRecord.getResidentDoctorName();
         java.util.Date _residentDoctorSignDate = admissionRecord.getResidentDoctorSignDate();
         if(_residentDoctorSignDate!=null){
         	this.residentDoctorSignDate=_residentDoctorSignDate.getTime();
         }
         this.attendingDoctorId=admissionRecord.getAttendingDoctorId();
         this.attendingDoctorName=admissionRecord.getAttendingDoctorName();
         java.util.Date _attendingDoctorSignDate = admissionRecord.getAttendingDoctorSignDate();
         if(_attendingDoctorSignDate!=null){
         	this.attendingDoctorSignDate=_attendingDoctorSignDate.getTime();
         }
         this.recorderId=admissionRecord.getRecorderId();
         this.recorderName=admissionRecord.getRecorderName();
         java.util.Date _recorderSignDate = admissionRecord.getRecorderSignDate();
         if(_recorderSignDate!=null){
         	this.recorderSignDate=_recorderSignDate.getTime();
         }
         this.receiveEmployeeId=admissionRecord.getReceiveEmployeeId();
         this.receiveEmployeeName=admissionRecord.getReceiveEmployeeName();
         java.util.Date _receiveEmployeeDate = admissionRecord.getReceiveEmployeeDate();
         if(_receiveEmployeeDate!=null){
         	this.receiveEmployeeDate=_receiveEmployeeDate.getTime();
         }
         this.receiveEmployeePost=admissionRecord.getReceiveEmployeePost();
         this.chargeNurseId=admissionRecord.getChargeNurseId();
         this.chargeNurseName=admissionRecord.getChargeNurseName();
         java.util.Date _chargeNurseDate = admissionRecord.getChargeNurseDate();
         if(_chargeNurseDate!=null){
         	this.chargeNurseDate=_chargeNurseDate.getTime();
         }
         this.chief=admissionRecord.getChief();
         this.illness=admissionRecord.getIllness();
         this.history=admissionRecord.getHistory();
         this.healthMark=admissionRecord.getHealthMark();
         this.historyOfDisease=admissionRecord.getHistoryOfDisease();
         this.infectiousMark=admissionRecord.getInfectiousMark();
         this.infectionHistory=admissionRecord.getInfectionHistory();
         this.obstetricalHistory=admissionRecord.getObstetricalHistory();
         this.rritability=admissionRecord.getRritability();
         this.opHis=admissionRecord.getOpHis();
         this.vaccHis=admissionRecord.getVaccHis();
         this.transfusionHis=admissionRecord.getTransfusionHis();
         this.perHistory=admissionRecord.getPerHistory();
         this.mensesHis=admissionRecord.getMensesHis();
         this.famHistory=admissionRecord.getFamHistory();
         this.bodyTemperature=admissionRecord.getBodyTemperature();
         this.prFreq=admissionRecord.getPrFreq();
         this.breatheFreq=admissionRecord.getBreatheFreq();
         this.sbp=admissionRecord.getSbp();
         this.dbp=admissionRecord.getDbp();
         this.bodyHeight=admissionRecord.getBodyHeight();
         this.bodyWeight=admissionRecord.getBodyWeight();
         this.generalSituExamResult=admissionRecord.getGeneralSituExamResult();
         this.skin=admissionRecord.getSkin();
         this.ln=admissionRecord.getLn();
         this.head=admissionRecord.getHead();
         this.neck=admissionRecord.getNeck();
         this.chest=admissionRecord.getChest();
         this.belly=admissionRecord.getBelly();
         this.dreResultDescr=admissionRecord.getDreResultDescr();
         this.anusPudendum=admissionRecord.getAnusPudendum();
         this.spine=admissionRecord.getSpine();
         this.limbs=admissionRecord.getLimbs();
         this.mental=admissionRecord.getMental();
         this.specialistChecks=admissionRecord.getSpecialistChecks();
         this.lung=admissionRecord.getLung();
         this.heart=admissionRecord.getHeart();
         this.peripheralVessels=admissionRecord.getPeripheralVessels();
         this.auxiliaryExaminationResults=admissionRecord.getAuxiliaryExaminationResults();
         this.statementsReliability=admissionRecord.getStatementsReliability();
         this.therapeuticPrinciples=admissionRecord.getTherapeuticPrinciples();
         this.treatRescueCourse=admissionRecord.getTreatRescueCourse();
         this.preliminaryDiagId=admissionRecord.getPreliminaryDiagId();
         this.preliminaryCnSymDiagCode=admissionRecord.getPreliminaryCnSymDiagCode();
         this.preliminaryCnDisDiagCode=admissionRecord.getPreliminaryCnDisDiagCode();
         this.preliminaryAdmitDiag=admissionRecord.getPreliminaryAdmitDiag();
         this.preliminaryTcmAdmitDiag=admissionRecord.getPreliminaryTcmAdmitDiag();
         this.preliminaryDiagCode=admissionRecord.getPreliminaryDiagCode();
         this.preliminaryDiagName=admissionRecord.getPreliminaryDiagName();
         java.util.Date _preliminaryDiagDate = admissionRecord.getPreliminaryDiagDate();
         if(_preliminaryDiagDate!=null){
         	this.preliminaryDiagDate=_preliminaryDiagDate.getTime();
         }
         this.correctDiagId=admissionRecord.getCorrectDiagId();
         this.correctCnSymDiagCode=admissionRecord.getCorrectCnSymDiagCode();
         this.correctCnDisDiagCode=admissionRecord.getCorrectCnDisDiagCode();
         this.correctAdmitDiag=admissionRecord.getCorrectAdmitDiag();
         this.correctTcmAdmitDiag=admissionRecord.getCorrectTcmAdmitDiag();
         this.correctDiagCode=admissionRecord.getCorrectDiagCode();
         this.correctDiagName=admissionRecord.getCorrectDiagName();
         java.util.Date _correctDiagDate = admissionRecord.getCorrectDiagDate();
         if(_correctDiagDate!=null){
         	this.correctDiagDate=_correctDiagDate.getTime();
         }
         this.determineDiagId=admissionRecord.getDetermineDiagId();
         this.determineCnSymDiagCode=admissionRecord.getDetermineCnSymDiagCode();
         this.determineCnDisDiagCode=admissionRecord.getDetermineCnDisDiagCode();
         this.determineAdmitDiag=admissionRecord.getDetermineAdmitDiag();
         this.determineTcmAdmitDiag=admissionRecord.getDetermineTcmAdmitDiag();
         this.determineDiagCode=admissionRecord.getDetermineDiagCode();
         this.determineDiagName=admissionRecord.getDetermineDiagName();
         java.util.Date _determineDiagDate = admissionRecord.getDetermineDiagDate();
         if(_determineDiagDate!=null){
         	this.determineDiagDate=_determineDiagDate.getTime();
         }
         this.supplementDiagId=admissionRecord.getSupplementDiagId();
         this.supplementCnSymDiagCode=admissionRecord.getSupplementCnSymDiagCode();
         this.supplementCnDisDiagCode=admissionRecord.getSupplementCnDisDiagCode();
         this.supplementAdmitDiag=admissionRecord.getSupplementAdmitDiag();
         this.supplementTcmAdmitDiag=admissionRecord.getSupplementTcmAdmitDiag();
         this.supplementDiagCode=admissionRecord.getSupplementDiagCode();
         this.supplementDiagName=admissionRecord.getSupplementDiagName();
         java.util.Date _supplementDiagDate = admissionRecord.getSupplementDiagDate();
         if(_supplementDiagDate!=null){
         	this.supplementDiagDate=_supplementDiagDate.getTime();
         }
         this.inhosDiagId=admissionRecord.getInhosDiagId();
         this.inpatientDetails=admissionRecord.getInpatientDetails();
         this.inhosCnSymDiagCode=admissionRecord.getInhosCnSymDiagCode();
         this.inhosCnDisDiagCode=admissionRecord.getInhosCnDisDiagCode();
         this.inhosAdmitDiag=admissionRecord.getInhosAdmitDiag();
         this.inhosTcmAdmitDiag=admissionRecord.getInhosTcmAdmitDiag();
         this.inhosDiagCode=admissionRecord.getInhosDiagCode();
         this.inhosDiagName=admissionRecord.getInhosDiagName();
         java.util.Date _inhosDiagDate = admissionRecord.getInhosDiagDate();
         if(_inhosDiagDate!=null){
         	this.inhosDiagDate=_inhosDiagDate.getTime();
         }
         this.outhosDiagId=admissionRecord.getOuthosDiagId();
         this.outpatientDetails=admissionRecord.getOutpatientDetails();
         this.outhosDiagCode=admissionRecord.getOuthosDiagCode();
         this.outhosDiagName=admissionRecord.getOuthosDiagName();
         java.util.Date _outhosDiagDate = admissionRecord.getOuthosDiagDate();
         if(_outhosDiagDate!=null){
         	this.outhosDiagDate=_outhosDiagDate.getTime();
         }
         this.upHospitalName=admissionRecord.getUpHospitalName();
         this.errorMessage=admissionRecord.getErrorMessage();
         this.errorDetail=admissionRecord.getErrorDetail();      
    }
      public String  getAdmissionRecordId(){
       		return this.admissionRecordId;
      }    
      public Long  getDate(){
       		return this.date;
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
      public Float  getAge(){
       		return this.age;
      }    
      public String  getNationCd(){
       		return this.nationCd;
      }    
      public String  getOccupationCd(){
       		return this.occupationCd;
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
      public String  getWorkUnit(){
       		return this.workUnit;
      }    
      public String  getAuthorId(){
       		return this.authorId;
      }    
      public String  getAuthorName(){
       		return this.authorName;
      }    
      public String  getInpatientRegistrationId(){
       		return this.inpatientRegistrationId;
      }    
      public Long  getStart(){
       		return this.start;
      }    
      public String  getInhId(){
       		return this.inhId;
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
      public String  getWardNo(){
       		return this.wardNo;
      }    
      public String  getWardArea(){
       		return this.wardArea;
      }    
      public String  getBedNum(){
       		return this.bedNum;
      }    
      public String  getCnFourResult(){
       		return this.cnFourResult;
      }    
      public String  getOutDeptId(){
       		return this.outDeptId;
      }    
      public String  getOutDeptName(){
       		return this.outDeptName;
      }    
      public String  getOutDeptCd(){
       		return this.outDeptCd;
      }    
      public Float  getInpatientDays(){
       		return this.inpatientDays;
      }    
      public Long  getDeathTime(){
       		return this.deathTime;
      }    
      public String  getOutpatWardNo(){
       		return this.outpatWardNo;
      }    
      public String  getDeathCause(){
       		return this.deathCause;
      }    
      public String  getDeathDiagnosticCode(){
       		return this.deathDiagnosticCode;
      }    
      public String  getTreatmentResultCode(){
       		return this.treatmentResultCode;
      }    
      public String  getDischargeOrder(){
       		return this.dischargeOrder;
      }    
      public Long  getPresentationTime(){
       		return this.presentationTime;
      }    
      public String  getAdmissionRecordTypeCode(){
       		return this.admissionRecordTypeCode;
      }    
      public String  getNursingDeptId(){
       		return this.nursingDeptId;
      }    
      public String  getNursingDeptName(){
       		return this.nursingDeptName;
      }    
      public String  getNursingDeptCd(){
       		return this.nursingDeptCd;
      }    
      public String  getAuditorId(){
       		return this.auditorId;
      }    
      public String  getAuditorName(){
       		return this.auditorName;
      }    
      public Long  getAuditorDate(){
       		return this.auditorDate;
      }    
      public String  getAuditorPost(){
       		return this.auditorPost;
      }    
      public String  getResidentDoctorId(){
       		return this.residentDoctorId;
      }    
      public String  getResidentDoctorName(){
       		return this.residentDoctorName;
      }    
      public Long  getResidentDoctorSignDate(){
       		return this.residentDoctorSignDate;
      }    
      public String  getAttendingDoctorId(){
       		return this.attendingDoctorId;
      }    
      public String  getAttendingDoctorName(){
       		return this.attendingDoctorName;
      }    
      public Long  getAttendingDoctorSignDate(){
       		return this.attendingDoctorSignDate;
      }    
      public String  getRecorderId(){
       		return this.recorderId;
      }    
      public String  getRecorderName(){
       		return this.recorderName;
      }    
      public Long  getRecorderSignDate(){
       		return this.recorderSignDate;
      }    
      public String  getReceiveEmployeeId(){
       		return this.receiveEmployeeId;
      }    
      public String  getReceiveEmployeeName(){
       		return this.receiveEmployeeName;
      }    
      public Long  getReceiveEmployeeDate(){
       		return this.receiveEmployeeDate;
      }    
      public String  getReceiveEmployeePost(){
       		return this.receiveEmployeePost;
      }    
      public String  getChargeNurseId(){
       		return this.chargeNurseId;
      }    
      public String  getChargeNurseName(){
       		return this.chargeNurseName;
      }    
      public Long  getChargeNurseDate(){
       		return this.chargeNurseDate;
      }    
      public String  getChief(){
       		return this.chief;
      }    
      public String  getIllness(){
       		return this.illness;
      }    
      public String  getHistory(){
       		return this.history;
      }    
      public Boolean  getHealthMark(){
       		return this.healthMark;
      }    
      public String  getHistoryOfDisease(){
       		return this.historyOfDisease;
      }    
      public Boolean  getInfectiousMark(){
       		return this.infectiousMark;
      }    
      public String  getInfectionHistory(){
       		return this.infectionHistory;
      }    
      public String  getObstetricalHistory(){
       		return this.obstetricalHistory;
      }    
      public String  getRritability(){
       		return this.rritability;
      }    
      public String  getOpHis(){
       		return this.opHis;
      }    
      public String  getVaccHis(){
       		return this.vaccHis;
      }    
      public String  getTransfusionHis(){
       		return this.transfusionHis;
      }    
      public String  getPerHistory(){
       		return this.perHistory;
      }    
      public String  getMensesHis(){
       		return this.mensesHis;
      }    
      public String  getFamHistory(){
       		return this.famHistory;
      }    
      public Float  getBodyTemperature(){
       		return this.bodyTemperature;
      }    
      public Integer  getPrFreq(){
       		return this.prFreq;
      }    
      public Integer  getBreatheFreq(){
       		return this.breatheFreq;
      }    
      public Integer  getSbp(){
       		return this.sbp;
      }    
      public Integer  getDbp(){
       		return this.dbp;
      }    
      public Float  getBodyHeight(){
       		return this.bodyHeight;
      }    
      public Float  getBodyWeight(){
       		return this.bodyWeight;
      }    
      public String  getGeneralSituExamResult(){
       		return this.generalSituExamResult;
      }    
      public String  getSkin(){
       		return this.skin;
      }    
      public String  getLn(){
       		return this.ln;
      }    
      public String  getHead(){
       		return this.head;
      }    
      public String  getNeck(){
       		return this.neck;
      }    
      public String  getChest(){
       		return this.chest;
      }    
      public String  getBelly(){
       		return this.belly;
      }    
      public String  getDreResultDescr(){
       		return this.dreResultDescr;
      }    
      public String  getAnusPudendum(){
       		return this.anusPudendum;
      }    
      public String  getSpine(){
       		return this.spine;
      }    
      public String  getLimbs(){
       		return this.limbs;
      }    
      public String  getMental(){
       		return this.mental;
      }    
      public String  getSpecialistChecks(){
       		return this.specialistChecks;
      }    
      public String  getLung(){
       		return this.lung;
      }    
      public String  getHeart(){
       		return this.heart;
      }    
      public String  getPeripheralVessels(){
       		return this.peripheralVessels;
      }    
      public String  getAuxiliaryExaminationResults(){
       		return this.auxiliaryExaminationResults;
      }    
      public Boolean  getStatementsReliability(){
       		return this.statementsReliability;
      }    
      public String  getTherapeuticPrinciples(){
       		return this.therapeuticPrinciples;
      }    
      public String  getTreatRescueCourse(){
       		return this.treatRescueCourse;
      }    
      public String  getPreliminaryDiagId(){
       		return this.preliminaryDiagId;
      }    
      public String  getPreliminaryCnSymDiagCode(){
       		return this.preliminaryCnSymDiagCode;
      }    
      public String  getPreliminaryCnDisDiagCode(){
       		return this.preliminaryCnDisDiagCode;
      }    
      public Float  getPreliminaryAdmitDiag(){
       		return this.preliminaryAdmitDiag;
      }    
      public Float  getPreliminaryTcmAdmitDiag(){
       		return this.preliminaryTcmAdmitDiag;
      }    
      public String  getPreliminaryDiagCode(){
       		return this.preliminaryDiagCode;
      }    
      public String  getPreliminaryDiagName(){
       		return this.preliminaryDiagName;
      }    
      public Long  getPreliminaryDiagDate(){
       		return this.preliminaryDiagDate;
      }    
      public String  getCorrectDiagId(){
       		return this.correctDiagId;
      }    
      public String  getCorrectCnSymDiagCode(){
       		return this.correctCnSymDiagCode;
      }    
      public String  getCorrectCnDisDiagCode(){
       		return this.correctCnDisDiagCode;
      }    
      public Float  getCorrectAdmitDiag(){
       		return this.correctAdmitDiag;
      }    
      public Float  getCorrectTcmAdmitDiag(){
       		return this.correctTcmAdmitDiag;
      }    
      public String  getCorrectDiagCode(){
       		return this.correctDiagCode;
      }    
      public String  getCorrectDiagName(){
       		return this.correctDiagName;
      }    
      public Long  getCorrectDiagDate(){
       		return this.correctDiagDate;
      }    
      public String  getDetermineDiagId(){
       		return this.determineDiagId;
      }    
      public String  getDetermineCnSymDiagCode(){
       		return this.determineCnSymDiagCode;
      }    
      public String  getDetermineCnDisDiagCode(){
       		return this.determineCnDisDiagCode;
      }    
      public Float  getDetermineAdmitDiag(){
       		return this.determineAdmitDiag;
      }    
      public Float  getDetermineTcmAdmitDiag(){
       		return this.determineTcmAdmitDiag;
      }    
      public String  getDetermineDiagCode(){
       		return this.determineDiagCode;
      }    
      public String  getDetermineDiagName(){
       		return this.determineDiagName;
      }    
      public Long  getDetermineDiagDate(){
       		return this.determineDiagDate;
      }    
      public String  getSupplementDiagId(){
       		return this.supplementDiagId;
      }    
      public String  getSupplementCnSymDiagCode(){
       		return this.supplementCnSymDiagCode;
      }    
      public String  getSupplementCnDisDiagCode(){
       		return this.supplementCnDisDiagCode;
      }    
      public Float  getSupplementAdmitDiag(){
       		return this.supplementAdmitDiag;
      }    
      public Float  getSupplementTcmAdmitDiag(){
       		return this.supplementTcmAdmitDiag;
      }    
      public String  getSupplementDiagCode(){
       		return this.supplementDiagCode;
      }    
      public String  getSupplementDiagName(){
       		return this.supplementDiagName;
      }    
      public Long  getSupplementDiagDate(){
       		return this.supplementDiagDate;
      }    
      public String  getInhosDiagId(){
       		return this.inhosDiagId;
      }    
      public String  getInpatientDetails(){
       		return this.inpatientDetails;
      }    
      public String  getInhosCnSymDiagCode(){
       		return this.inhosCnSymDiagCode;
      }    
      public String  getInhosCnDisDiagCode(){
       		return this.inhosCnDisDiagCode;
      }    
      public Float  getInhosAdmitDiag(){
       		return this.inhosAdmitDiag;
      }    
      public Float  getInhosTcmAdmitDiag(){
       		return this.inhosTcmAdmitDiag;
      }    
      public String  getInhosDiagCode(){
       		return this.inhosDiagCode;
      }    
      public String  getInhosDiagName(){
       		return this.inhosDiagName;
      }    
      public Long  getInhosDiagDate(){
       		return this.inhosDiagDate;
      }    
      public String  getOuthosDiagId(){
       		return this.outhosDiagId;
      }    
      public String  getOutpatientDetails(){
       		return this.outpatientDetails;
      }    
      public String  getOuthosDiagCode(){
       		return this.outhosDiagCode;
      }    
      public String  getOuthosDiagName(){
       		return this.outhosDiagName;
      }    
      public Long  getOuthosDiagDate(){
       		return this.outhosDiagDate;
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