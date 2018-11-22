package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.MedicalRecord;

public class MedicalRecordDetails extends MedicalRecordRecord {
    /**
     *名称:院内住院病案首页id
     *
 	 *
     */
     private String medicalRecordId;
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
     *名称:院内就诊卡
     *
 	 *
     */
     private String patientServiceNo;
    /**
     *名称:身份证号
     *
 	 *
     */
     private String idCard;
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
     *名称:电话号码
     *
 	 *
     */
     private String phone;
    /**
     *名称:工作单位电话号码
     *
 	 *
     */
     private String workPhone;
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
     *名称:工作地址-省（自治区、直辖市）代码
     *
 	 *限制:GBT2260
     */
     private String workState;
    /**
     *名称:工作地址-市（地区）代码
     *
 	 *限制:GBT2260
     */
     private String workCity;
    /**
     *名称:工作地址-县（区）代码
     *
 	 *限制:GBT2260
     */
     private String workDistrict;
    /**
     *名称:工作地址-乡（镇、街道办事处）
     *
 	 *
     */
     private String workLine;
    /**
     *名称:工作地址-村（街、路、弄等）
     *
 	 *
     */
     private String workRoad;
    /**
     *名称:工作地址-门牌号码
     *
 	 *
     */
     private String workHouseNo;
    /**
     *名称:工作地址-邮政编码
     *
 	 *
     */
     private String workPostCd;
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
     *名称:联系人-现居住住址-省（自治区、直辖市）代码
     *
 	 *限制:GBT2260
     */
     private String contactsState;
    /**
     *名称:联系人-现居住住址-市（地区）代码
     *
 	 *限制:GBT2260
     */
     private String contactsCity;
    /**
     *名称:联系人-现居住住址-县（区）代码
     *
 	 *限制:GBT2260
     */
     private String contactsDistrict;
    /**
     *名称:联系人-现居住住址-乡（镇、街道办事处）
     *
 	 *
     */
     private String contactsLine;
    /**
     *名称:联系人-现居住住址-村（街、路、弄等）
     *
 	 *
     */
     private String contactsRoad;
    /**
     *名称:联系人-现居住住址-门牌号码
     *
 	 *
     */
     private String contactsHouseNo;
    /**
     *名称:联系人-现居住地址邮政编码
     *
 	 *
     */
     private String contactsPostCd;
    /**
     *名称:联系人-现居住址详细信息
     *
 	 *
     */
     private String contactsAddressDetails;
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
     *名称:医疗保险类别代码
     *
 	 *
     */
     private String medicalInsuranceCategory;
    /**
     *名称:国籍代码
     *
 	 *限制:GBT2659
     */
     private String nationalityCode;
    /**
     *名称:工作单位
     *
 	 *
     */
     private String workUnit;
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
     *名称:出生地省代码
     *
 	 *限制:GBT2260
     */
     private String birthProCode;
    /**
     *名称:出生地市代码
     *
 	 *限制:GBT2260
     */
     private String birthCityCode;
    /**
     *名称:出生地县代码
     *
 	 *限制:GBT2260
     */
     private String birthCouCode;
    /**
     *名称:出生地址的村或城市的街、路、里、弄等名称
     *
 	 *
     */
     private String birthAddressVillage;
    /**
     *名称:出生地址的门牌号码
     *
 	 *
     */
     private String birthAddressHouse;
    /**
     *名称:出生地址的乡、镇或城市的街道办事处名称
     *
 	 *
     */
     private String birthAddressStreet;
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
     *名称:户口地址邮编
     *
 	 *
     */
     private String rprPost;
    /**
     *名称:年龄
     *
 	 *
     */
     private Float age;
    /**
     *名称:是否有过敏史
     *
 	 *限制:CUS00004
     */
     private Boolean ifRritability;
    /**
     *名称:过敏史描述
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
     *名称:科主任id
     *
 	 *
     */
     private String departmentHeadId;
    /**
     *名称:科主任姓名
     *
 	 *
     */
     private String departmentHeadName;
    /**
     *名称:科主任签名日期
     *
 	 *
     */
     private Long departmentHeadDate;
    /**
     *名称:主(副主)任医师id
     *
 	 *
     */
     private String chiefPhysicianId;
    /**
     *名称:主(副主)任医师姓名
     *
 	 *
     */
     private String chiefPhysicianName;
    /**
     *名称:主(副主)任医师签名日期
     *
 	 *
     */
     private Long chiefPhysicianSignDate;
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
     *名称:责任护士id
     *
 	 *
     */
     private String responsibilityNurseId;
    /**
     *名称:责任护士姓名
     *
 	 *
     */
     private String responsibilityNurseName;
    /**
     *名称:责任护士签名日期
     *
 	 *
     */
     private Long responsibilityNurseDate;
    /**
     *名称:进修医师id
     *
 	 *
     */
     private String refresherDoctorId;
    /**
     *名称:进修医师姓名
     *
 	 *
     */
     private String refresherDoctorName;
    /**
     *名称:进修医师签名日期
     *
 	 *
     */
     private Long refresherDoctorDate;
    /**
     *名称:实习医师id
     *
 	 *
     */
     private String internId;
    /**
     *名称:实习医师姓名
     *
 	 *
     */
     private String internName;
    /**
     *名称:实习医师签名日期
     *
 	 *
     */
     private Long internDate;
    /**
     *名称:编码员id
     *
 	 *
     */
     private String coderId;
    /**
     *名称:编码员姓名
     *
 	 *
     */
     private String coderName;
    /**
     *名称:编码员签名日期
     *
 	 *
     */
     private Long coderDate;
    /**
     *名称:研究生实习医师id
     *
 	 *
     */
     private String graduateInternId;
    /**
     *名称:研究生实习医师姓名
     *
 	 *
     */
     private String graduateInternName;
    /**
     *名称:研究生实习医师签名日期
     *
 	 *
     */
     private Long graduateInternDate;
    /**
     *名称:住院流水号
     *
 	 *
     */
     private String inpatientRegistrationId;
    /**
     *名称:住院号
     *
 	 *
     */
     private String inhId;
    /**
     *名称:入院时间
     *
 	 *
     */
     private Long start;
    /**
     *名称:出院时间
     *
 	 *
     */
     private Long end;
    /**
     *名称:入院科室id
     *
 	 *
     */
     private String inDeptId;
    /**
     *名称:入院科室名称
     *
 	 *
     */
     private String inDeptName;
    /**
     *名称:入院科室标准编码
     *
 	 *限制:CV9900051
     */
     private String inDeptCd;
    /**
     *名称:入院途径
     *
 	 *限制:CV0900403
     */
     private String inModeCode;
    /**
     *名称:入院病区代码
     *
 	 *
     */
     private String inInpatientArea;
    /**
     *名称:入院病房号
     *
 	 *
     */
     private String inpatWardNo;
    /**
     *名称:入院床位号
     *
 	 *
     */
     private String inBedNum;
    /**
     *名称:住院原因代码
     *
 	 *限制:CV0600212
     */
     private String inhospitalReasonCd;
    /**
     *名称:医疗付费方式
     *
 	 *限制:CV9900376
     */
     private String feeCode;
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
     *名称:住院病房号
     *
 	 *
     */
     private String wardNo;
    /**
     *名称:住院病区
     *
 	 *
     */
     private String wardArea;
    /**
     *名称:住院床位号
     *
 	 *
     */
     private String bedNum;
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
     *名称:出院病区代码
     *
 	 *
     */
     private String outInpatientArea;
    /**
     *名称:出院病房号
     *
 	 *
     */
     private String outpatWardNo;
    /**
     *名称:出院床位号
     *
 	 *
     */
     private String outBedNum;
    /**
     *名称:病案首页报告单号
     *
 	 *
     */
     private String reportFormNo;
    /**
     *名称:病案首页类型
     *
 	 *限制:CV9900328
     */
     private String medicalRecordType;
    /**
     *名称:病案号
     *
 	 *
     */
     private String caseNo;
    /**
     *名称:治疗类别代码
     *
 	 *限制:CV9900320
     */
     private String inpatTypeCd;
    /**
     *名称:是否本地标志
     *
 	 *限制:CUS00004
     */
     private Boolean isLocalMark;
    /**
     *名称:是否转诊标志
     *
 	 *限制:CUS00004
     */
     private Boolean referralMark;
    /**
     *名称:是否实施临床路径
     *
 	 *限制:CUS00004
     */
     private Boolean clinPathMark;
    /**
     *名称:实施临床路径标志代码
     *
 	 *限制:CV9900321
     */
     private String clinicalPathwayCd;
    /**
     *名称:是否使用医疗机构中药制剂标志
     *
 	 *限制:CUS00004
     */
     private Boolean tcmMedicalCd;
    /**
     *名称:是否使用中医诊疗设备标志
     *
 	 *限制:CUS00004
     */
     private Boolean tcmDiagTreatDeviceCd;
    /**
     *名称:是否使用中医诊疗技术标志
     *
 	 *限制:CUS00004
     */
     private Boolean tcmDiagTreatTechCd;
    /**
     *名称:是否辨证施护标志
     *
 	 *限制:CUS00004
     */
     private Boolean syndromeNursingCd;
    /**
     *名称:死亡标志
     *
 	 *限制:CUS00004
     */
     private Boolean ifDead;
    /**
     *名称:死亡时间
     *
 	 *
     */
     private Long deathTime;
    /**
     *名称:死亡原因描述
     *
 	 *
     */
     private String deathCause;
    /**
     *名称:死亡根本原因诊断代码
     *
 	 *
     */
     private String deathCauseDiagnosticCode;
    /**
     *名称:输液反应标志
     *
 	 *限制:CUS00004
     */
     private Boolean infusionReactionMark;
    /**
     *名称:随访时间间隔(天)
     *
 	 *
     */
     private Float followInterval;
    /**
     *名称:科研病例标志
     *
 	 *限制:CUS00004
     */
     private Boolean researchExampleMark;
    /**
     *名称:手术为本院第一例标志
     *
 	 *限制:CUS00004
     */
     private Boolean firstOperationMark;
    /**
     *名称:治疗为本院第一例标志
     *
 	 *限制:CUS00004
     */
     private Boolean firstTreatmentMark;
    /**
     *名称:检查为本院第一例标志
     *
 	 *限制:CUS00004
     */
     private Boolean firstExamMark;
    /**
     *名称:诊断为本院第一例标志
     *
 	 *限制:CUS00004
     */
     private Boolean firstDiagnosisMark;
    /**
     *名称:传染性标志
     *
 	 *限制:CUS00004
     */
     private Boolean infectiousMark;
    /**
     *名称:传染病分类代码
     *
 	 *限制:CV990104
     */
     private String infectiousTypeCode;
    /**
     *名称:传染上报标志
     *
 	 *限制:CUS00004
     */
     private Boolean infectReportCd;
    /**
     *名称:过敏源代码
     *
 	 *限制:CV0501038
     */
     private String allergensCode;
    /**
     *名称:HbsAg检查结果代码
     *
 	 *限制:CV510309
     */
     private String hbsagCode;
    /**
     *名称:HCV_Ab检查结果代码
     *
 	 *限制:CV510309
     */
     private String hcvAbCode;
    /**
     *名称:HIV_Ab检查结果代码
     *
 	 *限制:CV510309
     */
     private String hivAbCode;
    /**
     *名称:门诊与出院诊断对比符合情况代码
     *
 	 *限制:CV550113
     */
     private String clinic2outCode;
    /**
     *名称:入院与出院诊断对比符合情况代码
     *
 	 *限制:CV550113
     */
     private String in2outCode;
    /**
     *名称:术前与术后诊断对比符合情况代码
     *
 	 *限制:CV550113
     */
     private String preOper2operCode;
    /**
     *名称:放射与术后诊断对比符合情况代码
     *
 	 *限制:CV550113
     */
     private String radiation2operCode;
    /**
     *名称:临床与病理诊断对比符合情况代码
     *
 	 *限制:CV550113
     */
     private String clinic2pathologyCode;
    /**
     *名称:放射与病理诊断对比符合情况代码
     *
 	 *限制:CV550113
     */
     private String radiation2pathologyCode;
    /**
     *名称:临床与尸检诊断对比符合情况代码
     *
 	 *限制:CV550113
     */
     private String clinic2autopsyCode;
    /**
     *名称:感染次数
     *
 	 *
     */
     private Float infectiousnessTimes;
    /**
     *名称:抢救次数
     *
 	 *
     */
     private Float saveTimes;
    /**
     *名称:抢救成功次数
     *
 	 *
     */
     private Float saveSuccessTimes;
    /**
     *名称:特级护理天数
     *
 	 *
     */
     private Float protectSpecial;
    /**
     *名称:一级护理天数
     *
 	 *
     */
     private Float protectI;
    /**
     *名称:二级护理天数
     *
 	 *
     */
     private Float protectIi;
    /**
     *名称:三级护理天数
     *
 	 *
     */
     private Float protectIii;
    /**
     *名称:重症监护
     *
 	 *
     */
     private String intensiveCareTherapy;
    /**
     *名称:随诊周数
     *
 	 *
     */
     private Float followUpWeeks;
    /**
     *名称:随诊月数
     *
 	 *
     */
     private Float followUpMonths;
    /**
     *名称:随诊年数
     *
 	 *
     */
     private Float followUpYears;
    /**
     *名称:住院患者示教病例标志
     *
 	 *限制:CUS00004
     */
     private Boolean teachingExampleMark;
    /**
     *名称:住院患者随诊标志
     *
 	 *限制:CUS00004
     */
     private Boolean followMark;
    /**
     *名称:婴幼儿年龄（天）
     *
 	 *
     */
     private Float ageBaby;
    /**
     *名称:住院者疾病状态代码
     *
 	 *限制:CV0501001
     */
     private String inpatIllStateCd;
    /**
     *名称:颅脑损伤患者入院前昏迷时间的天数
     *
 	 *
     */
     private Integer inpatBefComaD;
    /**
     *名称:颅脑损伤患者入院前昏迷时间的小时数
     *
 	 *
     */
     private Integer inpatBefComaH;
    /**
     *名称:颅脑损伤患者入院前昏迷时间的分钟数
     *
 	 *
     */
     private Integer inpatBefComaM;
    /**
     *名称:颅脑损伤患者入院后昏迷时间的天数
     *
 	 *
     */
     private Integer inpatAftComaD;
    /**
     *名称:颅脑损伤患者入院后昏迷时间的小时数
     *
 	 *
     */
     private Integer inpatAftComaH;
    /**
     *名称:颅脑损伤患者入院后昏迷时间的分钟数
     *
 	 *
     */
     private Integer inpatAftComaM;
    /**
     *名称:日常生活能力评定量表得分-入院
     *
 	 *
     */
     private Float lifeSkillsInhosp;
    /**
     *名称:日常生活能力评定量表得分-出院
     *
 	 *
     */
     private Float lifeSkillsOuthosp;
    /**
     *名称:离院方式
     *
 	 *限制:CV0600226
     */
     private String outModeCode;
    /**
     *名称:拟接收医疗机构代码
     *
 	 *
     */
     private String receiveHosCd;
    /**
     *名称:拟接收医疗机构名称
     *
 	 *
     */
     private String receiveHosName;
    /**
     *名称:住院次数
     *
 	 *
     */
     private Integer inpatTimes;
    /**
     *名称:住院天数
     *
 	 *
     */
     private Integer inpatDays;
    /**
     *名称:死亡患者尸检标志
     *
 	 *限制:CUS00004
     */
     private Boolean autopsyMark;
    /**
     *名称:病案质量
     *
 	 *限制:CV550115
     */
     private String medicalRecordQualityCd;
    /**
     *名称:质控日期
     *
 	 *
     */
     private Long qualityControlDate;
    /**
     *名称:质控医师签名日期
     *
 	 *
     */
     private Long qcDoctDate;
    /**
     *名称:质控护士签名日期
     *
 	 *
     */
     private Long qcNurseDate;
    /**
     *名称:质控医生id
     *
 	 *
     */
     private String qcDoctorId;
    /**
     *名称:质控医生姓名
     *
 	 *
     */
     private String qcDoctorName;
    /**
     *名称:质控护士id
     *
 	 *
     */
     private String qcNurseId;
    /**
     *名称:质控护士姓名
     *
 	 *
     */
     private String qcNurseName;
    /**
     *名称:出院31天内再住院标志
     *
 	 *限制:CUS00004
     */
     private Boolean reInpatFlg;
    /**
     *名称:出院31天内再住院目的
     *
 	 *
     */
     private String reInpatPurpose;
    /**
     *名称:个人承担费用
     *
 	 *
     */
     private Float psnExpense;
    /**
     *名称:一般医疗服务费
     *
 	 *
     */
     private Float feeGeneralMedical;
    /**
     *名称:一般治疗操作费
     *
 	 *
     */
     private Float feeGeneralTreat;
    /**
     *名称:护理费
     *
 	 *
     */
     private Float feeTend;
    /**
     *名称:综合医疗服务其他费用
     *
 	 *
     */
     private Float feeMedicalOther;
    /**
     *名称:病理诊断费
     *
 	 *
     */
     private Float feePathology;
    /**
     *名称:实验室诊断费
     *
 	 *
     */
     private Float feeLaboratory;
    /**
     *名称:影像学诊断费
     *
 	 *
     */
     private Float feeImaging;
    /**
     *名称:临床诊断项目费
     *
 	 *
     */
     private Float feeClinc;
    /**
     *名称:非手术治疗项目费
     *
 	 *
     */
     private Float feeNonsurgicalTreat;
    /**
     *名称:临床物理治疗费
     *
 	 *
     */
     private Float feeClinPhysical;
    /**
     *名称:手术治疗费
     *
 	 *
     */
     private Float feeSurgicalTreat;
    /**
     *名称:麻醉费
     *
 	 *
     */
     private Float feeAnaes;
    /**
     *名称:手术费
     *
 	 *
     */
     private Float feeOperation;
    /**
     *名称:康复费
     *
 	 *
     */
     private Float feeRecovery;
    /**
     *名称:中医治疗费
     *
 	 *
     */
     private Float feeCnTreatment;
    /**
     *名称:西药费
     *
 	 *
     */
     private Float feeWesternMedicine;
    /**
     *名称:抗菌药物费用
     *
 	 *
     */
     private Float feeAntimicrobial;
    /**
     *名称:中成药费
     *
 	 *
     */
     private Float feeCnMedicine;
    /**
     *名称:中草药费
     *
 	 *
     */
     private Float feeCnHerbalMedicine;
    /**
     *名称:血费
     *
 	 *
     */
     private Float feeBlood;
    /**
     *名称:白蛋白类制品费
     *
 	 *
     */
     private Float feeAlbumin;
    /**
     *名称:球蛋白类制品费
     *
 	 *
     */
     private Float feeGlobulin;
    /**
     *名称:凝血因子类制品费
     *
 	 *
     */
     private Float feeBcf;
    /**
     *名称:细胞因子类制品费
     *
 	 *
     */
     private Float feeCytokine;
    /**
     *名称:检查用一次性医用材料费
     *
 	 *
     */
     private Float feeCheckMaterial;
    /**
     *名称:治疗用一次性医用材料费
     *
 	 *
     */
     private Float feeTreatMaterial;
    /**
     *名称:手术用一次性医用材料费
     *
 	 *
     */
     private Float feeOperMaterial;
    /**
     *名称:其他费
     *
 	 *
     */
     private Float feeOther;
    /**
     *名称:婴儿费
     *
 	 *
     */
     private Float feeBaby;
    /**
     *名称:陪床费
     *
 	 *
     */
     private Float feeExtraBed;
    /**
     *名称:床位费
     *
 	 *
     */
     private Float feeBed;
    /**
     *名称:放射费
     *
 	 *
     */
     private Float feeRadiation;
    /**
     *名称:化验费
     *
 	 *
     */
     private Float feeAssay;
    /**
     *名称:输氧费用
     *
 	 *
     */
     private Float feeOxygen;
    /**
     *名称:接生费
     *
 	 *
     */
     private Float feeDeliver;
    /**
     *名称:检查费
     *
 	 *
     */
     private Float feeCheck;
    /**
     *名称:总金额
     *
 	 *
     */
     private Float total;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
     */
     private String upHospitalName;
     private String errorMessage;
     private String errorDetail;             
     public MedicalRecordDetails(MedicalRecord medicalRecord) {
        super(medicalRecord);
         this.medicalRecordId=medicalRecord.getMedicalRecordId();
         java.util.Date _date = medicalRecord.getDate();
         if(_date!=null){
         	this.date=_date.getTime();
         }
         this.patientId=medicalRecord.getPatientId();
         this.patientServiceNo=medicalRecord.getPatientServiceNo();
         this.idCard=medicalRecord.getIdCard();
         this.socialInsuranceCard=medicalRecord.getSocialInsuranceCard();
         this.medicalInsuranceCard=medicalRecord.getMedicalInsuranceCard();
         this.healthFileNumber=medicalRecord.getHealthFileNumber();
         this.ncmsCard=medicalRecord.getNcmsCard();
         this.healthCard=medicalRecord.getHealthCard();
         this.name=medicalRecord.getName();
         this.gender=medicalRecord.getGender();
         java.util.Date _birthdate = medicalRecord.getBirthdate();
         if(_birthdate!=null){
         	this.birthdate=_birthdate.getTime();
         }
         this.phone=medicalRecord.getPhone();
         this.workPhone=medicalRecord.getWorkPhone();
         this.tempState=medicalRecord.getTempState();
         this.tempCity=medicalRecord.getTempCity();
         this.tempDistrict=medicalRecord.getTempDistrict();
         this.tempLine=medicalRecord.getTempLine();
         this.tempRoad=medicalRecord.getTempRoad();
         this.tempHouseNo=medicalRecord.getTempHouseNo();
         this.tempPostCd=medicalRecord.getTempPostCd();
         this.workState=medicalRecord.getWorkState();
         this.workCity=medicalRecord.getWorkCity();
         this.workDistrict=medicalRecord.getWorkDistrict();
         this.workLine=medicalRecord.getWorkLine();
         this.workRoad=medicalRecord.getWorkRoad();
         this.workHouseNo=medicalRecord.getWorkHouseNo();
         this.workPostCd=medicalRecord.getWorkPostCd();
         this.maritalstatus=medicalRecord.getMaritalstatus();
         this.relationship=medicalRecord.getRelationship();
         this.contactsName=medicalRecord.getContactsName();
         this.contactsPhone=medicalRecord.getContactsPhone();
         this.contactsState=medicalRecord.getContactsState();
         this.contactsCity=medicalRecord.getContactsCity();
         this.contactsDistrict=medicalRecord.getContactsDistrict();
         this.contactsLine=medicalRecord.getContactsLine();
         this.contactsRoad=medicalRecord.getContactsRoad();
         this.contactsHouseNo=medicalRecord.getContactsHouseNo();
         this.contactsPostCd=medicalRecord.getContactsPostCd();
         this.contactsAddressDetails=medicalRecord.getContactsAddressDetails();
         this.nationCd=medicalRecord.getNationCd();
         this.occupationCd=medicalRecord.getOccupationCd();
         this.medicalInsuranceCategory=medicalRecord.getMedicalInsuranceCategory();
         this.nationalityCode=medicalRecord.getNationalityCode();
         this.workUnit=medicalRecord.getWorkUnit();
         this.bodyWeight=medicalRecord.getBodyWeight();
         this.inpatWeight=medicalRecord.getInpatWeight();
         this.nativeProvince=medicalRecord.getNativeProvince();
         this.nativeCity=medicalRecord.getNativeCity();
         this.birthProCode=medicalRecord.getBirthProCode();
         this.birthCityCode=medicalRecord.getBirthCityCode();
         this.birthCouCode=medicalRecord.getBirthCouCode();
         this.birthAddressVillage=medicalRecord.getBirthAddressVillage();
         this.birthAddressHouse=medicalRecord.getBirthAddressHouse();
         this.birthAddressStreet=medicalRecord.getBirthAddressStreet();
         this.rprAddrProvince=medicalRecord.getRprAddrProvince();
         this.rprAddrCity=medicalRecord.getRprAddrCity();
         this.rprAddrArea=medicalRecord.getRprAddrArea();
         this.rprAddrStreet=medicalRecord.getRprAddrStreet();
         this.rprAddrVillage=medicalRecord.getRprAddrVillage();
         this.rprAddrHouse=medicalRecord.getRprAddrHouse();
         this.rprPost=medicalRecord.getRprPost();
         this.age=medicalRecord.getAge();
         this.ifRritability=medicalRecord.getIfRritability();
         this.rritability=medicalRecord.getRritability();
         this.aboCd=medicalRecord.getAboCd();
         this.rhCd=medicalRecord.getRhCd();
         this.departmentHeadId=medicalRecord.getDepartmentHeadId();
         this.departmentHeadName=medicalRecord.getDepartmentHeadName();
         java.util.Date _departmentHeadDate = medicalRecord.getDepartmentHeadDate();
         if(_departmentHeadDate!=null){
         	this.departmentHeadDate=_departmentHeadDate.getTime();
         }
         this.chiefPhysicianId=medicalRecord.getChiefPhysicianId();
         this.chiefPhysicianName=medicalRecord.getChiefPhysicianName();
         java.util.Date _chiefPhysicianSignDate = medicalRecord.getChiefPhysicianSignDate();
         if(_chiefPhysicianSignDate!=null){
         	this.chiefPhysicianSignDate=_chiefPhysicianSignDate.getTime();
         }
         this.attendingDoctorId=medicalRecord.getAttendingDoctorId();
         this.attendingDoctorName=medicalRecord.getAttendingDoctorName();
         java.util.Date _attendingDoctorSignDate = medicalRecord.getAttendingDoctorSignDate();
         if(_attendingDoctorSignDate!=null){
         	this.attendingDoctorSignDate=_attendingDoctorSignDate.getTime();
         }
         this.residentDoctorId=medicalRecord.getResidentDoctorId();
         this.residentDoctorName=medicalRecord.getResidentDoctorName();
         java.util.Date _residentDoctorSignDate = medicalRecord.getResidentDoctorSignDate();
         if(_residentDoctorSignDate!=null){
         	this.residentDoctorSignDate=_residentDoctorSignDate.getTime();
         }
         this.responsibilityNurseId=medicalRecord.getResponsibilityNurseId();
         this.responsibilityNurseName=medicalRecord.getResponsibilityNurseName();
         java.util.Date _responsibilityNurseDate = medicalRecord.getResponsibilityNurseDate();
         if(_responsibilityNurseDate!=null){
         	this.responsibilityNurseDate=_responsibilityNurseDate.getTime();
         }
         this.refresherDoctorId=medicalRecord.getRefresherDoctorId();
         this.refresherDoctorName=medicalRecord.getRefresherDoctorName();
         java.util.Date _refresherDoctorDate = medicalRecord.getRefresherDoctorDate();
         if(_refresherDoctorDate!=null){
         	this.refresherDoctorDate=_refresherDoctorDate.getTime();
         }
         this.internId=medicalRecord.getInternId();
         this.internName=medicalRecord.getInternName();
         java.util.Date _internDate = medicalRecord.getInternDate();
         if(_internDate!=null){
         	this.internDate=_internDate.getTime();
         }
         this.coderId=medicalRecord.getCoderId();
         this.coderName=medicalRecord.getCoderName();
         java.util.Date _coderDate = medicalRecord.getCoderDate();
         if(_coderDate!=null){
         	this.coderDate=_coderDate.getTime();
         }
         this.graduateInternId=medicalRecord.getGraduateInternId();
         this.graduateInternName=medicalRecord.getGraduateInternName();
         java.util.Date _graduateInternDate = medicalRecord.getGraduateInternDate();
         if(_graduateInternDate!=null){
         	this.graduateInternDate=_graduateInternDate.getTime();
         }
         this.inpatientRegistrationId=medicalRecord.getInpatientRegistrationId();
         this.inhId=medicalRecord.getInhId();
         java.util.Date _start = medicalRecord.getStart();
         if(_start!=null){
         	this.start=_start.getTime();
         }
         java.util.Date _end = medicalRecord.getEnd();
         if(_end!=null){
         	this.end=_end.getTime();
         }
         this.inDeptId=medicalRecord.getInDeptId();
         this.inDeptName=medicalRecord.getInDeptName();
         this.inDeptCd=medicalRecord.getInDeptCd();
         this.inModeCode=medicalRecord.getInModeCode();
         this.inInpatientArea=medicalRecord.getInInpatientArea();
         this.inpatWardNo=medicalRecord.getInpatWardNo();
         this.inBedNum=medicalRecord.getInBedNum();
         this.inhospitalReasonCd=medicalRecord.getInhospitalReasonCd();
         this.feeCode=medicalRecord.getFeeCode();
         this.visitingDeptId=medicalRecord.getVisitingDeptId();
         this.visitingDeptName=medicalRecord.getVisitingDeptName();
         this.visitingDeptCd=medicalRecord.getVisitingDeptCd();
         this.wardNo=medicalRecord.getWardNo();
         this.wardArea=medicalRecord.getWardArea();
         this.bedNum=medicalRecord.getBedNum();
         this.outDeptId=medicalRecord.getOutDeptId();
         this.outDeptName=medicalRecord.getOutDeptName();
         this.outDeptCd=medicalRecord.getOutDeptCd();
         this.outInpatientArea=medicalRecord.getOutInpatientArea();
         this.outpatWardNo=medicalRecord.getOutpatWardNo();
         this.outBedNum=medicalRecord.getOutBedNum();
         this.reportFormNo=medicalRecord.getReportFormNo();
         this.medicalRecordType=medicalRecord.getMedicalRecordType();
         this.caseNo=medicalRecord.getCaseNo();
         this.inpatTypeCd=medicalRecord.getInpatTypeCd();
         this.isLocalMark=medicalRecord.getIsLocalMark();
         this.referralMark=medicalRecord.getReferralMark();
         this.clinPathMark=medicalRecord.getClinPathMark();
         this.clinicalPathwayCd=medicalRecord.getClinicalPathwayCd();
         this.tcmMedicalCd=medicalRecord.getTcmMedicalCd();
         this.tcmDiagTreatDeviceCd=medicalRecord.getTcmDiagTreatDeviceCd();
         this.tcmDiagTreatTechCd=medicalRecord.getTcmDiagTreatTechCd();
         this.syndromeNursingCd=medicalRecord.getSyndromeNursingCd();
         this.ifDead=medicalRecord.getIfDead();
         java.util.Date _deathTime = medicalRecord.getDeathTime();
         if(_deathTime!=null){
         	this.deathTime=_deathTime.getTime();
         }
         this.deathCause=medicalRecord.getDeathCause();
         this.deathCauseDiagnosticCode=medicalRecord.getDeathCauseDiagnosticCode();
         this.infusionReactionMark=medicalRecord.getInfusionReactionMark();
         this.followInterval=medicalRecord.getFollowInterval();
         this.researchExampleMark=medicalRecord.getResearchExampleMark();
         this.firstOperationMark=medicalRecord.getFirstOperationMark();
         this.firstTreatmentMark=medicalRecord.getFirstTreatmentMark();
         this.firstExamMark=medicalRecord.getFirstExamMark();
         this.firstDiagnosisMark=medicalRecord.getFirstDiagnosisMark();
         this.infectiousMark=medicalRecord.getInfectiousMark();
         this.infectiousTypeCode=medicalRecord.getInfectiousTypeCode();
         this.infectReportCd=medicalRecord.getInfectReportCd();
         this.allergensCode=medicalRecord.getAllergensCode();
         this.hbsagCode=medicalRecord.getHbsagCode();
         this.hcvAbCode=medicalRecord.getHcvAbCode();
         this.hivAbCode=medicalRecord.getHivAbCode();
         this.clinic2outCode=medicalRecord.getClinic2outCode();
         this.in2outCode=medicalRecord.getIn2outCode();
         this.preOper2operCode=medicalRecord.getPreOper2operCode();
         this.radiation2operCode=medicalRecord.getRadiation2operCode();
         this.clinic2pathologyCode=medicalRecord.getClinic2pathologyCode();
         this.radiation2pathologyCode=medicalRecord.getRadiation2pathologyCode();
         this.clinic2autopsyCode=medicalRecord.getClinic2autopsyCode();
         this.infectiousnessTimes=medicalRecord.getInfectiousnessTimes();
         this.saveTimes=medicalRecord.getSaveTimes();
         this.saveSuccessTimes=medicalRecord.getSaveSuccessTimes();
         this.protectSpecial=medicalRecord.getProtectSpecial();
         this.protectI=medicalRecord.getProtectI();
         this.protectIi=medicalRecord.getProtectIi();
         this.protectIii=medicalRecord.getProtectIii();
         this.intensiveCareTherapy=medicalRecord.getIntensiveCareTherapy();
         this.followUpWeeks=medicalRecord.getFollowUpWeeks();
         this.followUpMonths=medicalRecord.getFollowUpMonths();
         this.followUpYears=medicalRecord.getFollowUpYears();
         this.teachingExampleMark=medicalRecord.getTeachingExampleMark();
         this.followMark=medicalRecord.getFollowMark();
         this.ageBaby=medicalRecord.getAgeBaby();
         this.inpatIllStateCd=medicalRecord.getInpatIllStateCd();
         this.inpatBefComaD=medicalRecord.getInpatBefComaD();
         this.inpatBefComaH=medicalRecord.getInpatBefComaH();
         this.inpatBefComaM=medicalRecord.getInpatBefComaM();
         this.inpatAftComaD=medicalRecord.getInpatAftComaD();
         this.inpatAftComaH=medicalRecord.getInpatAftComaH();
         this.inpatAftComaM=medicalRecord.getInpatAftComaM();
         this.lifeSkillsInhosp=medicalRecord.getLifeSkillsInhosp();
         this.lifeSkillsOuthosp=medicalRecord.getLifeSkillsOuthosp();
         this.outModeCode=medicalRecord.getOutModeCode();
         this.receiveHosCd=medicalRecord.getReceiveHosCd();
         this.receiveHosName=medicalRecord.getReceiveHosName();
         this.inpatTimes=medicalRecord.getInpatTimes();
         this.inpatDays=medicalRecord.getInpatDays();
         this.autopsyMark=medicalRecord.getAutopsyMark();
         this.medicalRecordQualityCd=medicalRecord.getMedicalRecordQualityCd();
         java.util.Date _qualityControlDate = medicalRecord.getQualityControlDate();
         if(_qualityControlDate!=null){
         	this.qualityControlDate=_qualityControlDate.getTime();
         }
         java.util.Date _qcDoctDate = medicalRecord.getQcDoctDate();
         if(_qcDoctDate!=null){
         	this.qcDoctDate=_qcDoctDate.getTime();
         }
         java.util.Date _qcNurseDate = medicalRecord.getQcNurseDate();
         if(_qcNurseDate!=null){
         	this.qcNurseDate=_qcNurseDate.getTime();
         }
         this.qcDoctorId=medicalRecord.getQcDoctorId();
         this.qcDoctorName=medicalRecord.getQcDoctorName();
         this.qcNurseId=medicalRecord.getQcNurseId();
         this.qcNurseName=medicalRecord.getQcNurseName();
         this.reInpatFlg=medicalRecord.getReInpatFlg();
         this.reInpatPurpose=medicalRecord.getReInpatPurpose();
         this.psnExpense=medicalRecord.getPsnExpense();
         this.feeGeneralMedical=medicalRecord.getFeeGeneralMedical();
         this.feeGeneralTreat=medicalRecord.getFeeGeneralTreat();
         this.feeTend=medicalRecord.getFeeTend();
         this.feeMedicalOther=medicalRecord.getFeeMedicalOther();
         this.feePathology=medicalRecord.getFeePathology();
         this.feeLaboratory=medicalRecord.getFeeLaboratory();
         this.feeImaging=medicalRecord.getFeeImaging();
         this.feeClinc=medicalRecord.getFeeClinc();
         this.feeNonsurgicalTreat=medicalRecord.getFeeNonsurgicalTreat();
         this.feeClinPhysical=medicalRecord.getFeeClinPhysical();
         this.feeSurgicalTreat=medicalRecord.getFeeSurgicalTreat();
         this.feeAnaes=medicalRecord.getFeeAnaes();
         this.feeOperation=medicalRecord.getFeeOperation();
         this.feeRecovery=medicalRecord.getFeeRecovery();
         this.feeCnTreatment=medicalRecord.getFeeCnTreatment();
         this.feeWesternMedicine=medicalRecord.getFeeWesternMedicine();
         this.feeAntimicrobial=medicalRecord.getFeeAntimicrobial();
         this.feeCnMedicine=medicalRecord.getFeeCnMedicine();
         this.feeCnHerbalMedicine=medicalRecord.getFeeCnHerbalMedicine();
         this.feeBlood=medicalRecord.getFeeBlood();
         this.feeAlbumin=medicalRecord.getFeeAlbumin();
         this.feeGlobulin=medicalRecord.getFeeGlobulin();
         this.feeBcf=medicalRecord.getFeeBcf();
         this.feeCytokine=medicalRecord.getFeeCytokine();
         this.feeCheckMaterial=medicalRecord.getFeeCheckMaterial();
         this.feeTreatMaterial=medicalRecord.getFeeTreatMaterial();
         this.feeOperMaterial=medicalRecord.getFeeOperMaterial();
         this.feeOther=medicalRecord.getFeeOther();
         this.feeBaby=medicalRecord.getFeeBaby();
         this.feeExtraBed=medicalRecord.getFeeExtraBed();
         this.feeBed=medicalRecord.getFeeBed();
         this.feeRadiation=medicalRecord.getFeeRadiation();
         this.feeAssay=medicalRecord.getFeeAssay();
         this.feeOxygen=medicalRecord.getFeeOxygen();
         this.feeDeliver=medicalRecord.getFeeDeliver();
         this.feeCheck=medicalRecord.getFeeCheck();
         this.total=medicalRecord.getTotal();
         this.upHospitalName=medicalRecord.getUpHospitalName();
         this.errorMessage=medicalRecord.getErrorMessage();
         this.errorDetail=medicalRecord.getErrorDetail();      
    }
      public String  getMedicalRecordId(){
       		return this.medicalRecordId;
      }    
      public Long  getDate(){
       		return this.date;
      }    
      public String  getPatientId(){
       		return this.patientId;
      }    
      public String  getPatientServiceNo(){
       		return this.patientServiceNo;
      }    
      public String  getIdCard(){
       		return this.idCard;
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
      public String  getName(){
       		return this.name;
      }    
      public String  getGender(){
       		return this.gender;
      }    
      public Long  getBirthdate(){
       		return this.birthdate;
      }    
      public String  getPhone(){
       		return this.phone;
      }    
      public String  getWorkPhone(){
       		return this.workPhone;
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
      public String  getContactsState(){
       		return this.contactsState;
      }    
      public String  getContactsCity(){
       		return this.contactsCity;
      }    
      public String  getContactsDistrict(){
       		return this.contactsDistrict;
      }    
      public String  getContactsLine(){
       		return this.contactsLine;
      }    
      public String  getContactsRoad(){
       		return this.contactsRoad;
      }    
      public String  getContactsHouseNo(){
       		return this.contactsHouseNo;
      }    
      public String  getContactsPostCd(){
       		return this.contactsPostCd;
      }    
      public String  getContactsAddressDetails(){
       		return this.contactsAddressDetails;
      }    
      public String  getNationCd(){
       		return this.nationCd;
      }    
      public String  getOccupationCd(){
       		return this.occupationCd;
      }    
      public String  getMedicalInsuranceCategory(){
       		return this.medicalInsuranceCategory;
      }    
      public String  getNationalityCode(){
       		return this.nationalityCode;
      }    
      public String  getWorkUnit(){
       		return this.workUnit;
      }    
      public Float  getBodyWeight(){
       		return this.bodyWeight;
      }    
      public Float  getInpatWeight(){
       		return this.inpatWeight;
      }    
      public String  getNativeProvince(){
       		return this.nativeProvince;
      }    
      public String  getNativeCity(){
       		return this.nativeCity;
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
      public String  getBirthAddressHouse(){
       		return this.birthAddressHouse;
      }    
      public String  getBirthAddressStreet(){
       		return this.birthAddressStreet;
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
      public Float  getAge(){
       		return this.age;
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
      public String  getDepartmentHeadId(){
       		return this.departmentHeadId;
      }    
      public String  getDepartmentHeadName(){
       		return this.departmentHeadName;
      }    
      public Long  getDepartmentHeadDate(){
       		return this.departmentHeadDate;
      }    
      public String  getChiefPhysicianId(){
       		return this.chiefPhysicianId;
      }    
      public String  getChiefPhysicianName(){
       		return this.chiefPhysicianName;
      }    
      public Long  getChiefPhysicianSignDate(){
       		return this.chiefPhysicianSignDate;
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
      public String  getResidentDoctorId(){
       		return this.residentDoctorId;
      }    
      public String  getResidentDoctorName(){
       		return this.residentDoctorName;
      }    
      public Long  getResidentDoctorSignDate(){
       		return this.residentDoctorSignDate;
      }    
      public String  getResponsibilityNurseId(){
       		return this.responsibilityNurseId;
      }    
      public String  getResponsibilityNurseName(){
       		return this.responsibilityNurseName;
      }    
      public Long  getResponsibilityNurseDate(){
       		return this.responsibilityNurseDate;
      }    
      public String  getRefresherDoctorId(){
       		return this.refresherDoctorId;
      }    
      public String  getRefresherDoctorName(){
       		return this.refresherDoctorName;
      }    
      public Long  getRefresherDoctorDate(){
       		return this.refresherDoctorDate;
      }    
      public String  getInternId(){
       		return this.internId;
      }    
      public String  getInternName(){
       		return this.internName;
      }    
      public Long  getInternDate(){
       		return this.internDate;
      }    
      public String  getCoderId(){
       		return this.coderId;
      }    
      public String  getCoderName(){
       		return this.coderName;
      }    
      public Long  getCoderDate(){
       		return this.coderDate;
      }    
      public String  getGraduateInternId(){
       		return this.graduateInternId;
      }    
      public String  getGraduateInternName(){
       		return this.graduateInternName;
      }    
      public Long  getGraduateInternDate(){
       		return this.graduateInternDate;
      }    
      public String  getInpatientRegistrationId(){
       		return this.inpatientRegistrationId;
      }    
      public String  getInhId(){
       		return this.inhId;
      }    
      public Long  getStart(){
       		return this.start;
      }    
      public Long  getEnd(){
       		return this.end;
      }    
      public String  getInDeptId(){
       		return this.inDeptId;
      }    
      public String  getInDeptName(){
       		return this.inDeptName;
      }    
      public String  getInDeptCd(){
       		return this.inDeptCd;
      }    
      public String  getInModeCode(){
       		return this.inModeCode;
      }    
      public String  getInInpatientArea(){
       		return this.inInpatientArea;
      }    
      public String  getInpatWardNo(){
       		return this.inpatWardNo;
      }    
      public String  getInBedNum(){
       		return this.inBedNum;
      }    
      public String  getInhospitalReasonCd(){
       		return this.inhospitalReasonCd;
      }    
      public String  getFeeCode(){
       		return this.feeCode;
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
      public String  getOutDeptId(){
       		return this.outDeptId;
      }    
      public String  getOutDeptName(){
       		return this.outDeptName;
      }    
      public String  getOutDeptCd(){
       		return this.outDeptCd;
      }    
      public String  getOutInpatientArea(){
       		return this.outInpatientArea;
      }    
      public String  getOutpatWardNo(){
       		return this.outpatWardNo;
      }    
      public String  getOutBedNum(){
       		return this.outBedNum;
      }    
      public String  getReportFormNo(){
       		return this.reportFormNo;
      }    
      public String  getMedicalRecordType(){
       		return this.medicalRecordType;
      }    
      public String  getCaseNo(){
       		return this.caseNo;
      }    
      public String  getInpatTypeCd(){
       		return this.inpatTypeCd;
      }    
      public Boolean  getIsLocalMark(){
       		return this.isLocalMark;
      }    
      public Boolean  getReferralMark(){
       		return this.referralMark;
      }    
      public Boolean  getClinPathMark(){
       		return this.clinPathMark;
      }    
      public String  getClinicalPathwayCd(){
       		return this.clinicalPathwayCd;
      }    
      public Boolean  getTcmMedicalCd(){
       		return this.tcmMedicalCd;
      }    
      public Boolean  getTcmDiagTreatDeviceCd(){
       		return this.tcmDiagTreatDeviceCd;
      }    
      public Boolean  getTcmDiagTreatTechCd(){
       		return this.tcmDiagTreatTechCd;
      }    
      public Boolean  getSyndromeNursingCd(){
       		return this.syndromeNursingCd;
      }    
      public Boolean  getIfDead(){
       		return this.ifDead;
      }    
      public Long  getDeathTime(){
       		return this.deathTime;
      }    
      public String  getDeathCause(){
       		return this.deathCause;
      }    
      public String  getDeathCauseDiagnosticCode(){
       		return this.deathCauseDiagnosticCode;
      }    
      public Boolean  getInfusionReactionMark(){
       		return this.infusionReactionMark;
      }    
      public Float  getFollowInterval(){
       		return this.followInterval;
      }    
      public Boolean  getResearchExampleMark(){
       		return this.researchExampleMark;
      }    
      public Boolean  getFirstOperationMark(){
       		return this.firstOperationMark;
      }    
      public Boolean  getFirstTreatmentMark(){
       		return this.firstTreatmentMark;
      }    
      public Boolean  getFirstExamMark(){
       		return this.firstExamMark;
      }    
      public Boolean  getFirstDiagnosisMark(){
       		return this.firstDiagnosisMark;
      }    
      public Boolean  getInfectiousMark(){
       		return this.infectiousMark;
      }    
      public String  getInfectiousTypeCode(){
       		return this.infectiousTypeCode;
      }    
      public Boolean  getInfectReportCd(){
       		return this.infectReportCd;
      }    
      public String  getAllergensCode(){
       		return this.allergensCode;
      }    
      public String  getHbsagCode(){
       		return this.hbsagCode;
      }    
      public String  getHcvAbCode(){
       		return this.hcvAbCode;
      }    
      public String  getHivAbCode(){
       		return this.hivAbCode;
      }    
      public String  getClinic2outCode(){
       		return this.clinic2outCode;
      }    
      public String  getIn2outCode(){
       		return this.in2outCode;
      }    
      public String  getPreOper2operCode(){
       		return this.preOper2operCode;
      }    
      public String  getRadiation2operCode(){
       		return this.radiation2operCode;
      }    
      public String  getClinic2pathologyCode(){
       		return this.clinic2pathologyCode;
      }    
      public String  getRadiation2pathologyCode(){
       		return this.radiation2pathologyCode;
      }    
      public String  getClinic2autopsyCode(){
       		return this.clinic2autopsyCode;
      }    
      public Float  getInfectiousnessTimes(){
       		return this.infectiousnessTimes;
      }    
      public Float  getSaveTimes(){
       		return this.saveTimes;
      }    
      public Float  getSaveSuccessTimes(){
       		return this.saveSuccessTimes;
      }    
      public Float  getProtectSpecial(){
       		return this.protectSpecial;
      }    
      public Float  getProtectI(){
       		return this.protectI;
      }    
      public Float  getProtectIi(){
       		return this.protectIi;
      }    
      public Float  getProtectIii(){
       		return this.protectIii;
      }    
      public String  getIntensiveCareTherapy(){
       		return this.intensiveCareTherapy;
      }    
      public Float  getFollowUpWeeks(){
       		return this.followUpWeeks;
      }    
      public Float  getFollowUpMonths(){
       		return this.followUpMonths;
      }    
      public Float  getFollowUpYears(){
       		return this.followUpYears;
      }    
      public Boolean  getTeachingExampleMark(){
       		return this.teachingExampleMark;
      }    
      public Boolean  getFollowMark(){
       		return this.followMark;
      }    
      public Float  getAgeBaby(){
       		return this.ageBaby;
      }    
      public String  getInpatIllStateCd(){
       		return this.inpatIllStateCd;
      }    
      public Integer  getInpatBefComaD(){
       		return this.inpatBefComaD;
      }    
      public Integer  getInpatBefComaH(){
       		return this.inpatBefComaH;
      }    
      public Integer  getInpatBefComaM(){
       		return this.inpatBefComaM;
      }    
      public Integer  getInpatAftComaD(){
       		return this.inpatAftComaD;
      }    
      public Integer  getInpatAftComaH(){
       		return this.inpatAftComaH;
      }    
      public Integer  getInpatAftComaM(){
       		return this.inpatAftComaM;
      }    
      public Float  getLifeSkillsInhosp(){
       		return this.lifeSkillsInhosp;
      }    
      public Float  getLifeSkillsOuthosp(){
       		return this.lifeSkillsOuthosp;
      }    
      public String  getOutModeCode(){
       		return this.outModeCode;
      }    
      public String  getReceiveHosCd(){
       		return this.receiveHosCd;
      }    
      public String  getReceiveHosName(){
       		return this.receiveHosName;
      }    
      public Integer  getInpatTimes(){
       		return this.inpatTimes;
      }    
      public Integer  getInpatDays(){
       		return this.inpatDays;
      }    
      public Boolean  getAutopsyMark(){
       		return this.autopsyMark;
      }    
      public String  getMedicalRecordQualityCd(){
       		return this.medicalRecordQualityCd;
      }    
      public Long  getQualityControlDate(){
       		return this.qualityControlDate;
      }    
      public Long  getQcDoctDate(){
       		return this.qcDoctDate;
      }    
      public Long  getQcNurseDate(){
       		return this.qcNurseDate;
      }    
      public String  getQcDoctorId(){
       		return this.qcDoctorId;
      }    
      public String  getQcDoctorName(){
       		return this.qcDoctorName;
      }    
      public String  getQcNurseId(){
       		return this.qcNurseId;
      }    
      public String  getQcNurseName(){
       		return this.qcNurseName;
      }    
      public Boolean  getReInpatFlg(){
       		return this.reInpatFlg;
      }    
      public String  getReInpatPurpose(){
       		return this.reInpatPurpose;
      }    
      public Float  getPsnExpense(){
       		return this.psnExpense;
      }    
      public Float  getFeeGeneralMedical(){
       		return this.feeGeneralMedical;
      }    
      public Float  getFeeGeneralTreat(){
       		return this.feeGeneralTreat;
      }    
      public Float  getFeeTend(){
       		return this.feeTend;
      }    
      public Float  getFeeMedicalOther(){
       		return this.feeMedicalOther;
      }    
      public Float  getFeePathology(){
       		return this.feePathology;
      }    
      public Float  getFeeLaboratory(){
       		return this.feeLaboratory;
      }    
      public Float  getFeeImaging(){
       		return this.feeImaging;
      }    
      public Float  getFeeClinc(){
       		return this.feeClinc;
      }    
      public Float  getFeeNonsurgicalTreat(){
       		return this.feeNonsurgicalTreat;
      }    
      public Float  getFeeClinPhysical(){
       		return this.feeClinPhysical;
      }    
      public Float  getFeeSurgicalTreat(){
       		return this.feeSurgicalTreat;
      }    
      public Float  getFeeAnaes(){
       		return this.feeAnaes;
      }    
      public Float  getFeeOperation(){
       		return this.feeOperation;
      }    
      public Float  getFeeRecovery(){
       		return this.feeRecovery;
      }    
      public Float  getFeeCnTreatment(){
       		return this.feeCnTreatment;
      }    
      public Float  getFeeWesternMedicine(){
       		return this.feeWesternMedicine;
      }    
      public Float  getFeeAntimicrobial(){
       		return this.feeAntimicrobial;
      }    
      public Float  getFeeCnMedicine(){
       		return this.feeCnMedicine;
      }    
      public Float  getFeeCnHerbalMedicine(){
       		return this.feeCnHerbalMedicine;
      }    
      public Float  getFeeBlood(){
       		return this.feeBlood;
      }    
      public Float  getFeeAlbumin(){
       		return this.feeAlbumin;
      }    
      public Float  getFeeGlobulin(){
       		return this.feeGlobulin;
      }    
      public Float  getFeeBcf(){
       		return this.feeBcf;
      }    
      public Float  getFeeCytokine(){
       		return this.feeCytokine;
      }    
      public Float  getFeeCheckMaterial(){
       		return this.feeCheckMaterial;
      }    
      public Float  getFeeTreatMaterial(){
       		return this.feeTreatMaterial;
      }    
      public Float  getFeeOperMaterial(){
       		return this.feeOperMaterial;
      }    
      public Float  getFeeOther(){
       		return this.feeOther;
      }    
      public Float  getFeeBaby(){
       		return this.feeBaby;
      }    
      public Float  getFeeExtraBed(){
       		return this.feeExtraBed;
      }    
      public Float  getFeeBed(){
       		return this.feeBed;
      }    
      public Float  getFeeRadiation(){
       		return this.feeRadiation;
      }    
      public Float  getFeeAssay(){
       		return this.feeAssay;
      }    
      public Float  getFeeOxygen(){
       		return this.feeOxygen;
      }    
      public Float  getFeeDeliver(){
       		return this.feeDeliver;
      }    
      public Float  getFeeCheck(){
       		return this.feeCheck;
      }    
      public Float  getTotal(){
       		return this.total;
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