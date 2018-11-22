package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.AdultHealthExamination;

public class AdultHealthExaminationDetails extends AdultHealthExaminationRecord {
    /**
     *名称:成人健康体检id
     *
 	 *
     */
     private String adultHealthExaminationId;
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
     *名称:联系方式
     *
 	 *
     */
     private String phone;
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
     *名称:症状描述
     *
 	 *
     */
     private String symptomDescription;
    /**
     *名称:症状代码
     *
 	 *限制:CV990111
     */
     private String symptomCd;
    /**
     *名称:症状名称
     *
 	 *
     */
     private String symptomName;
    /**
     *名称:症状-诊断日期
     *
 	 *
     */
     private Long admissionDiagnosisDate;
    /**
     *名称:体温（℃）
     *
 	 *
     */
     private Float bodyTemperature;
    /**
     *名称:脉率（次/min）
     *
 	 *
     */
     private Float pulses;
    /**
     *名称:呼吸频率（次/min）
     *
 	 *
     */
     private Float breathingRate;
    /**
     *名称:左侧收缩压（mmHg）
     *
 	 *
     */
     private Float leftSystolicPressure;
    /**
     *名称:左侧舒张压（mmHg）
     *
 	 *
     */
     private Float leftDiastolicPressure;
    /**
     *名称:右侧收缩压（mmHg）
     *
 	 *
     */
     private Float rightSystolicPressure;
    /**
     *名称:右侧舒张压（mmHg）
     *
 	 *
     */
     private Float rightDiastolicPressure;
    /**
     *名称:身高（cm）
     *
 	 *
     */
     private Float prenatalHeight;
    /**
     *名称:体重（kg）
     *
 	 *
     */
     private Float weight;
    /**
     *名称:腰围（cm）
     *
 	 *
     */
     private Float waist;
    /**
     *名称:体质指数
     *
 	 *
     */
     private String bodyMassIndex;
    /**
     *名称:心率（次/min）
     *
 	 *
     */
     private Float heartRate;
    /**
     *名称:口唇外观检查结果代码
     *
 	 *限制:CV0410007
     */
     private String lipAppearanceCode;
    /**
     *名称:齿列类别代码
     *
 	 *限制:CV0410010
     */
     private String dentitionClassCode;
    /**
     *名称:齿列描述
     *
 	 *
     */
     private String dentitionDescription;
    /**
     *名称:咽部检查结果代码
     *
 	 *限制:CV9900015
     */
     private String pharyngealExaminationResultCode;
    /**
     *名称:左眼裸眼远视力值
     *
 	 *
     */
     private Float farVisualAcuity;
    /**
     *名称:左眼矫正远视力值
     *
 	 *
     */
     private Float leftCorrectedVisualAcuity;
    /**
     *名称:右眼矫正远视力值
     *
 	 *
     */
     private Float rightCorrectedVisualAcuity;
    /**
     *名称:眼底检查结果异常标志
     *
 	 *限制:CUS00004
     */
     private Boolean fundusExaminationResultsAbnormalMark;
    /**
     *名称:眼底检查结果异常描述
     *
 	 *
     */
     private String fundusExaminationResultsAbnormalDescribe;
    /**
     *名称:巩膜检查结果代码
     *
 	 *限制:CV0410006
     */
     private String scleralExaminationResultCode;
    /**
     *名称:听力检测结果代码
     *
 	 *限制:CV9900016
     */
     private String hearingTestResultCode;
    /**
     *名称:腹部压痛标志
     *
 	 *限制:CUS00004
     */
     private Boolean abdominalTendernessSign;
    /**
     *名称:腹部压痛描述
     *
 	 *
     */
     private String abdominalTendernessDescribe;
    /**
     *名称:腹部包块标志
     *
 	 *限制:CUS00004
     */
     private Boolean abdominalMassSign;
    /**
     *名称:腹部包块描述
     *
 	 *
     */
     private String abdominalMassDescribe;
    /**
     *名称:肝大标志
     *
 	 *限制:CUS00004
     */
     private Boolean liverSign;
    /**
     *名称:肝大描述
     *
 	 *
     */
     private String liverDescribe;
    /**
     *名称:脾大标志
     *
 	 *限制:CUS00004
     */
     private Boolean splenomegalySign;
    /**
     *名称:脾大描述
     *
 	 *
     */
     private String splenomegalyDescribe;
    /**
     *名称:腹部移动性浊音标志
     *
 	 *限制:CUS00004
     */
     private Boolean abdominalShiftingDullnessSign;
    /**
     *名称:腹部移动性浊音描述
     *
 	 *
     */
     private String abdominalShiftingDullnessDescribe;
    /**
     *名称:运动功能状态代码
     *
 	 *限制:CV9900007
     */
     private String motionFunctionStatusCode;
    /**
     *名称:心律类别代码
     *
 	 *限制:CV9900008
     */
     private String heartTypeCode;
    /**
     *名称:心脏杂音标志
     *
 	 *限制:CUS00004
     */
     private Boolean cardiacMurmurSign;
    /**
     *名称:心脏杂音描述
     *
 	 *
     */
     private String cardiacMurmurDescribe;
    /**
     *名称:足背动脉搏动代码
     *
 	 *限制:CV0410015
     */
     private String dorsalisPedisPulseCode;
    /**
     *名称:肺部异常呼吸音标志
     *
 	 *限制:CUS00004
     */
     private Boolean lungAbnormalBreathSoundsSign;
    /**
     *名称:肺部异常呼吸音描述
     *
 	 *
     */
     private String lungAbnormalBreathSoundsDescribe;
    /**
     *名称:肺部罗音标志
     *
 	 *限制:CUS00004
     */
     private Boolean lungRaleSign;
    /**
     *名称:肺部罗音描述
     *
 	 *
     */
     private String lungRaleDescribe;
    /**
     *名称:桶状胸标志
     *
 	 *限制:CUS00004
     */
     private Boolean barrelChestSign;
    /**
     *名称:皮肤检查结果代码
     *
 	 *限制:CV0410004
     */
     private String skinTestResultCode;
    /**
     *名称:淋巴结检查结果代码
     *
 	 *限制:CV0410011
     */
     private String lymphNodeExaminationResultCode;
    /**
     *名称:下肢水肿检查结果代码
     *
 	 *限制:CV0410014
     */
     private String lowerExtremityEdemaTestResultCode;
    /**
     *名称:肛门指诊检查结果类别代码
     *
 	 *限制:CV0410013
     */
     private String analExaminationResultsCode;
    /**
     *名称:乳腺检查结果代码
     *
 	 *限制:CV0410012
     */
     private String breastExaminationResultsCode;
    /**
     *名称:外阴异常标志
     *
 	 *限制:CUS00004
     */
     private Boolean vulvaAbnormalitySign;
    /**
     *名称:外阴异常描述
     *
 	 *
     */
     private String vulvaAbnormalityDescribe;
    /**
     *名称:阴道异常标志
     *
 	 *限制:CUS00004
     */
     private Boolean abnormalVaginaSign;
    /**
     *名称:阴道异常描述
     *
 	 *
     */
     private String abnormalVaginaDescribe;
    /**
     *名称:宫颈异常标志
     *
 	 *限制:CUS00004
     */
     private Boolean cervicalAbnormalitySign;
    /**
     *名称:宫颈异常描述
     *
 	 *
     */
     private String cervicalAbnormalityDescribe;
    /**
     *名称:宫体异常标志
     *
 	 *限制:CUS00004
     */
     private Boolean uterineBodyAbnormalSign;
    /**
     *名称:宫体异常描述
     *
 	 *
     */
     private String uterineBodyAbnormalDescribe;
    /**
     *名称:附件异常标志
     *
 	 *限制:CUS00004
     */
     private Boolean enclosureAbnormalSign;
    /**
     *名称:附件异常描述
     *
 	 *
     */
     private String enclosureAbnormalDescribe;
    /**
     *名称:血红蛋白
     *
 	 *
     */
     private Float hemoglobin;
    /**
     *名称:白细胞
     *
 	 *
     */
     private Float whiteBloodCell;
    /**
     *名称:血小板
     *
 	 *
     */
     private Float platelet;
    /**
     *名称:尿蛋白定性检测结果代码
     *
 	 *限制:CV0450015
     */
     private String urineProteinQualitativeTestResultCode;
    /**
     *名称:尿糖定性检测结果代码
     *
 	 *限制:CV0450015
     */
     private String niaotangQualitativeTestResultCode;
    /**
     *名称:尿酮体定性检测结果代码
     *
 	 *限制:CV0450015
     */
     private String urineKetoneQualitativeTestResultCode;
    /**
     *名称:尿潜血定性检测结果代码
     *
 	 *限制:CV0450015
     */
     private String bldQualitativeTestResultCode;
    /**
     *名称:血糖检测值（mmol/L）
     *
 	 *
     */
     private Float bloodSugar;
    /**
     *名称:尿微量白蛋白(mg/dL)
     *
 	 *
     */
     private Float urineMicroalbumin;
    /**
     *名称:大便潜血
     *
 	 *
     */
     private Float fecalOccultBlood;
    /**
     *名称:糖化血红蛋白(%)
     *
 	 *
     */
     private Float glycosylatedHemoglobin;
    /**
     *名称:血清谷丙转氨酶
     *
 	 *
     */
     private Float serumAlanineAminotransferase;
    /**
     *名称:血清谷草转氨酶
     *
 	 *
     */
     private Float serumAspartateAminotransferase;
    /**
     *名称:白蛋白(mg/dL)
     *
 	 *
     */
     private Float albumin;
    /**
     *名称:总胆红素
     *
 	 *
     */
     private Float totalBilirubin;
    /**
     *名称:结合胆红素
     *
 	 *
     */
     private Float conjugatedBilirubin;
    /**
     *名称:血清肌酐
     *
 	 *
     */
     private Float scr;
    /**
     *名称:血尿素氮
     *
 	 *
     */
     private Float bloodUreaNitrogen;
    /**
     *名称:血钾浓度(mmol/L)
     *
 	 *
     */
     private Float bloodPotassiumConcentration;
    /**
     *名称:血钠浓度(mmol/L)
     *
 	 *
     */
     private Float serumSodiumConcentration;
    /**
     *名称:总胆固醇(mmol/L)
     *
 	 *
     */
     private Float totalCholesterol;
    /**
     *名称:甘油三酯(mmol/L)
     *
 	 *
     */
     private Float triglyceride;
    /**
     *名称:血清低密度酯蛋白胆固醇(mmol/L)
     *
 	 *
     */
     private Float serumLowDensityLipoproteinCholesterol;
    /**
     *名称:乙型肝炎表面抗原定性检测结果分类代码
     *
 	 *限制:CV990107
     */
     private String hepatitisBSurfaceAntigen;
    /**
     *名称:乙型肝炎表面抗体定性检测结果分类代码
     *
 	 *限制:CV990107
     */
     private String hepatitisBSurfaceAntibody;
    /**
     *名称:乙型肝炎e抗原定性检测结果分类代码
     *
 	 *限制:CV990107
     */
     private String hepatitisBEAntigen;
    /**
     *名称:乙型肝炎e抗体定性检测结果分类代码
     *
 	 *限制:CV990107
     */
     private String hepatitisBEAntibody;
    /**
     *名称:乙型肝炎核心抗体定性检测结果分类代码
     *
 	 *限制:CV990107
     */
     private String hepatitisBCoreAntibody;
    /**
     *名称:胸部X线检查异常标志
     *
 	 *限制:CUS00004
     */
     private Boolean abnormalChestXRaySign;
    /**
     *名称:胸部X线检查异常描述
     *
 	 *
     */
     private String abnormalChestXRayDescribe;
    /**
     *名称:心电图异常标志
     *
 	 *限制:CUS00004
     */
     private Boolean ecgAbnormalitySign;
    /**
     *名称:心电图异常描述
     *
 	 *
     */
     private String ecgAbnormalityDescribe;
    /**
     *名称:B超检查异常标志
     *
 	 *限制:CUS00004
     */
     private Boolean abnormalUltrasonographySign;
    /**
     *名称:B超检查异常描述
     *
 	 *
     */
     private String abnormalUltrasonographyDescribe;
    /**
     *名称:宫颈涂片异常标志
     *
 	 *限制:CUS00004
     */
     private Boolean cervicalSmearAbnormalitySign;
    /**
     *名称:宫颈涂片异常描述
     *
 	 *
     */
     private String cervicalSmearAbnormalityDescribe;
    /**
     *名称:家族性疾病名称代码
     *
 	 *限制:CV0210005
     */
     private String familyDiseaseNameCode;
    /**
     *名称:曾住院医疗机构名称
     *
 	 *
     */
     private String registeredMedicalInstitutionName;
    /**
     *名称:曾住院病案号
     *
 	 *
     */
     private String inpatientMedicalRecordNumber;
    /**
     *名称:住院原因
     *
 	 *
     */
     private String hospitalizationCauses;
    /**
     *名称:曾建立家庭病床医疗机构名称
     *
 	 *
     */
     private String onceEstablishFamilyBedOrgName;
    /**
     *名称:曾建立家庭病床病案号
     *
 	 *
     */
     private String onceEstablishFamilyBedMedicalRecordNumber;
    /**
     *名称:家庭病床建立原因
     *
 	 *
     */
     private String establishFamilyBedsReason;
    /**
     *名称:接种时间
     *
 	 *
     */
     private Long inoculationTime;
    /**
     *名称:免疫剂次
     *
 	 *
     */
     private Float immuneDose;
    /**
     *名称:疫苗编码
     *
 	 *限制:CV0850001
     */
     private String vaccineNameCode;
    /**
     *名称:疫苗批次
     *
 	 *
     */
     private String vaccineBatch;
    /**
     *名称:疫苗的生产厂家
     *
 	 *
     */
     private String vaccineManufacturers;
    /**
     *名称:免疫接种医师
     *
 	 *
     */
     private String vaccinationPhysician;
    /**
     *名称:接种机构师
     *
 	 *
     */
     private String inoculationMechanism;
    /**
     *名称:有危害因素接触职业描述
     *
 	 *
     */
     private String occupationalExposureToHazardousFactors;
    /**
     *名称:从事有危害因素职业时长(年)
     *
 	 *
     */
     private Float engagedInHazardousFactors;
    /**
     *名称:职业病危害因素类别代码
     *
 	 *限制:CV0300203
     */
     private String occupationalHazardFactorsCode;
    /**
     *名称:职业暴露危险因素名称
     *
 	 *
     */
     private String occupationalExposureRiskFactorsName;
    /**
     *名称:职业防护措施标志
     *
 	 *限制:CUS00004
     */
     private Boolean occupationalProtectionMeasures;
    /**
     *名称:身体活动频率代码
     *
 	 *限制:CV0300111
     */
     private String physicalActivityFrequencyCode;
    /**
     *名称:每次锻炼时间（min）
     *
 	 *
     */
     private Float eachExerciseTime;
    /**
     *名称:坚持锻炼时间（年）
     *
 	 *
     */
     private Float adhereToExerciseTime;
    /**
     *名称:锻炼方式
     *
 	 *
     */
     private String exerciseMode;
    /**
     *名称:饮食习惯代码
     *
 	 *限制:CV0300107
     */
     private String dietCode;
    /**
     *名称:吸烟状况
     *
 	 *
     */
     private String smokingStatus;
    /**
     *名称:日吸烟量
     *
 	 *
     */
     private Float daySmokingAmount;
    /**
     *名称:开始吸烟年龄（岁）
     *
 	 *
     */
     private Float startSmokingAge;
    /**
     *名称:戒烟年龄（岁）
     *
 	 *
     */
     private Float smokingCessationAge;
    /**
     *名称:饮酒频率代码
     *
 	 *限制:CV0300104
     */
     private String drinkingFrequency;
    /**
     *名称:日饮酒量（mL）
     *
 	 *
     */
     private Float drinkingPerDay;
    /**
     *名称:饮酒标志
     *
 	 *限制:CUS00004
     */
     private Boolean ifDrinking;
    /**
     *名称:戒酒年龄（岁）
     *
 	 *
     */
     private Float abstinenceAge;
    /**
     *名称:开始饮酒年龄（岁）
     *
 	 *
     */
     private Float drinkingAge;
    /**
     *名称:戒酒标志
     *
 	 *限制:CUS00004
     */
     private Boolean abstinenceSign;
    /**
     *名称:饮酒种类代码
     *
 	 *限制:CV0300105
     */
     private String drinkingTypeCode;
    /**
     *名称:老年人健康状态自我评估代码
     *
 	 *限制:CV0401013
     */
     private String elderlyHealthStatusAssessmentCode;
    /**
     *名称:老年人生活自理能力自我评估代码
     *
 	 *限制:CV0401014
     */
     private String elderlySelfAssessmentCode;
    /**
     *名称:认知状态粗筛结果分类代码
     *
 	 *限制:CV9900010
     */
     private String screeningCognitiveStateClassificationCode;
    /**
     *名称:老年人认知功能评分
     *
 	 *
     */
     private Float cognitiveFunctionScore;
    /**
     *名称:情感状态粗筛结果代码
     *
 	 *限制:CV9900010
     */
     private String theEmotionalStateOfCoarseCode;
    /**
     *名称:老年人抑郁评分
     *
 	 *
     */
     private Float geriatricDepressionScore;
    /**
     *名称:健康评价异常标志
     *
 	 *限制:CUS00004
     */
     private Boolean healthEvaluationAbnormalSigns;
    /**
     *名称:健康评价异常描述
     *
 	 *
     */
     private String healthEvaluationExceptionDescription;
    /**
     *名称:健康指导代码
     *
 	 *限制:CV9900017
     */
     private String healthInstructionCode;
    /**
     *名称:危险因素控制建议代码
     *
 	 *限制:CV0600218
     */
     private String riskFactorControlCode;
    /**
     *名称:诊断编码
     *
 	 *限制:CV990111
     */
     private String diagnosis;
    /**
     *名称:诊断编码名称
     *
 	 *
     */
     private String diagnosisName;
    /**
     *名称:诊断日期
     *
 	 *
     */
     private Long diagnosisDate;
    /**
     *名称:中医体质分类代码
     *
 	 *限制:CV0501005
     */
     private String tcmConstitutionClassificationCode;
    /**
     *名称:中医体质分类判定结果代码
     *
 	 *限制:CV9900018
     */
     private String tcmConstitutionClassificationResultCode;
    /**
     *名称:频率代码
     *
 	 *限制:CV9900341
     */
     private String freqCode;
    /**
     *名称:服药依从性代码
     *
 	 *限制:CV9900004
     */
     private String medicationComplianceCode;
    /**
     *名称:院内药物编码
     *
 	 *
     */
     private String medicationCd;
    /**
     *名称:院内药物名称
     *
 	 *
     */
     private String medicationName;
    /**
     *名称:药物剂型代码
     *
 	 *
     */
     private String drugDosageForms;
    /**
     *名称:药物剂型名称
     *
 	 *
     */
     private String drugDosageFormsName;
    /**
     *名称:医嘱开始时间
     *
 	 *
     */
     private Long start;
    /**
     *名称:执行天数
     *
 	 *
     */
     private Float duration;
    /**
     *名称:用药途径代码
     *
 	 *限制:CV0600102
     */
     private String dosageCode;
    /**
     *名称:特殊用法代码
     *
 	 *限制:CV9900285
     */
     private String cMedCode;
    /**
     *名称:用药次剂量
     *
 	 *
     */
     private Float onceValue;
    /**
     *名称:用药次剂量单位
     *
 	 *
     */
     private String onceUnit;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
     */
     private String upHospitalName;
     private String errorMessage;
     private String errorDetail;             
     public AdultHealthExaminationDetails(AdultHealthExamination adultHealthExamination) {
        super(adultHealthExamination);
         this.adultHealthExaminationId=adultHealthExamination.getAdultHealthExaminationId();
         java.util.Date _date = adultHealthExamination.getDate();
         if(_date!=null){
         	this.date=_date.getTime();
         }
         this.authorId=adultHealthExamination.getAuthorId();
         this.authorName=adultHealthExamination.getAuthorName();
         this.patientId=adultHealthExamination.getPatientId();
         this.idCard=adultHealthExamination.getIdCard();
         this.healthFileNumber=adultHealthExamination.getHealthFileNumber();
         this.healthCard=adultHealthExamination.getHealthCard();
         this.name=adultHealthExamination.getName();
         this.gender=adultHealthExamination.getGender();
         java.util.Date _birthdate = adultHealthExamination.getBirthdate();
         if(_birthdate!=null){
         	this.birthdate=_birthdate.getTime();
         }
         this.phone=adultHealthExamination.getPhone();
         this.homeState=adultHealthExamination.getHomeState();
         this.homeCity=adultHealthExamination.getHomeCity();
         this.homeDistrict=adultHealthExamination.getHomeDistrict();
         this.homeLine=adultHealthExamination.getHomeLine();
         this.homeRoad=adultHealthExamination.getHomeRoad();
         this.homeHouseNo=adultHealthExamination.getHomeHouseNo();
         this.homeText=adultHealthExamination.getHomeText();
         this.symptomDescription=adultHealthExamination.getSymptomDescription();
         this.symptomCd=adultHealthExamination.getSymptomCd();
         this.symptomName=adultHealthExamination.getSymptomName();
         java.util.Date _admissionDiagnosisDate = adultHealthExamination.getAdmissionDiagnosisDate();
         if(_admissionDiagnosisDate!=null){
         	this.admissionDiagnosisDate=_admissionDiagnosisDate.getTime();
         }
         this.bodyTemperature=adultHealthExamination.getBodyTemperature();
         this.pulses=adultHealthExamination.getPulses();
         this.breathingRate=adultHealthExamination.getBreathingRate();
         this.leftSystolicPressure=adultHealthExamination.getLeftSystolicPressure();
         this.leftDiastolicPressure=adultHealthExamination.getLeftDiastolicPressure();
         this.rightSystolicPressure=adultHealthExamination.getRightSystolicPressure();
         this.rightDiastolicPressure=adultHealthExamination.getRightDiastolicPressure();
         this.prenatalHeight=adultHealthExamination.getPrenatalHeight();
         this.weight=adultHealthExamination.getWeight();
         this.waist=adultHealthExamination.getWaist();
         this.bodyMassIndex=adultHealthExamination.getBodyMassIndex();
         this.heartRate=adultHealthExamination.getHeartRate();
         this.lipAppearanceCode=adultHealthExamination.getLipAppearanceCode();
         this.dentitionClassCode=adultHealthExamination.getDentitionClassCode();
         this.dentitionDescription=adultHealthExamination.getDentitionDescription();
         this.pharyngealExaminationResultCode=adultHealthExamination.getPharyngealExaminationResultCode();
         this.farVisualAcuity=adultHealthExamination.getFarVisualAcuity();
         this.leftCorrectedVisualAcuity=adultHealthExamination.getLeftCorrectedVisualAcuity();
         this.rightCorrectedVisualAcuity=adultHealthExamination.getRightCorrectedVisualAcuity();
         this.fundusExaminationResultsAbnormalMark=adultHealthExamination.getFundusExaminationResultsAbnormalMark();
         this.fundusExaminationResultsAbnormalDescribe=adultHealthExamination.getFundusExaminationResultsAbnormalDescribe();
         this.scleralExaminationResultCode=adultHealthExamination.getScleralExaminationResultCode();
         this.hearingTestResultCode=adultHealthExamination.getHearingTestResultCode();
         this.abdominalTendernessSign=adultHealthExamination.getAbdominalTendernessSign();
         this.abdominalTendernessDescribe=adultHealthExamination.getAbdominalTendernessDescribe();
         this.abdominalMassSign=adultHealthExamination.getAbdominalMassSign();
         this.abdominalMassDescribe=adultHealthExamination.getAbdominalMassDescribe();
         this.liverSign=adultHealthExamination.getLiverSign();
         this.liverDescribe=adultHealthExamination.getLiverDescribe();
         this.splenomegalySign=adultHealthExamination.getSplenomegalySign();
         this.splenomegalyDescribe=adultHealthExamination.getSplenomegalyDescribe();
         this.abdominalShiftingDullnessSign=adultHealthExamination.getAbdominalShiftingDullnessSign();
         this.abdominalShiftingDullnessDescribe=adultHealthExamination.getAbdominalShiftingDullnessDescribe();
         this.motionFunctionStatusCode=adultHealthExamination.getMotionFunctionStatusCode();
         this.heartTypeCode=adultHealthExamination.getHeartTypeCode();
         this.cardiacMurmurSign=adultHealthExamination.getCardiacMurmurSign();
         this.cardiacMurmurDescribe=adultHealthExamination.getCardiacMurmurDescribe();
         this.dorsalisPedisPulseCode=adultHealthExamination.getDorsalisPedisPulseCode();
         this.lungAbnormalBreathSoundsSign=adultHealthExamination.getLungAbnormalBreathSoundsSign();
         this.lungAbnormalBreathSoundsDescribe=adultHealthExamination.getLungAbnormalBreathSoundsDescribe();
         this.lungRaleSign=adultHealthExamination.getLungRaleSign();
         this.lungRaleDescribe=adultHealthExamination.getLungRaleDescribe();
         this.barrelChestSign=adultHealthExamination.getBarrelChestSign();
         this.skinTestResultCode=adultHealthExamination.getSkinTestResultCode();
         this.lymphNodeExaminationResultCode=adultHealthExamination.getLymphNodeExaminationResultCode();
         this.lowerExtremityEdemaTestResultCode=adultHealthExamination.getLowerExtremityEdemaTestResultCode();
         this.analExaminationResultsCode=adultHealthExamination.getAnalExaminationResultsCode();
         this.breastExaminationResultsCode=adultHealthExamination.getBreastExaminationResultsCode();
         this.vulvaAbnormalitySign=adultHealthExamination.getVulvaAbnormalitySign();
         this.vulvaAbnormalityDescribe=adultHealthExamination.getVulvaAbnormalityDescribe();
         this.abnormalVaginaSign=adultHealthExamination.getAbnormalVaginaSign();
         this.abnormalVaginaDescribe=adultHealthExamination.getAbnormalVaginaDescribe();
         this.cervicalAbnormalitySign=adultHealthExamination.getCervicalAbnormalitySign();
         this.cervicalAbnormalityDescribe=adultHealthExamination.getCervicalAbnormalityDescribe();
         this.uterineBodyAbnormalSign=adultHealthExamination.getUterineBodyAbnormalSign();
         this.uterineBodyAbnormalDescribe=adultHealthExamination.getUterineBodyAbnormalDescribe();
         this.enclosureAbnormalSign=adultHealthExamination.getEnclosureAbnormalSign();
         this.enclosureAbnormalDescribe=adultHealthExamination.getEnclosureAbnormalDescribe();
         this.hemoglobin=adultHealthExamination.getHemoglobin();
         this.whiteBloodCell=adultHealthExamination.getWhiteBloodCell();
         this.platelet=adultHealthExamination.getPlatelet();
         this.urineProteinQualitativeTestResultCode=adultHealthExamination.getUrineProteinQualitativeTestResultCode();
         this.niaotangQualitativeTestResultCode=adultHealthExamination.getNiaotangQualitativeTestResultCode();
         this.urineKetoneQualitativeTestResultCode=adultHealthExamination.getUrineKetoneQualitativeTestResultCode();
         this.bldQualitativeTestResultCode=adultHealthExamination.getBldQualitativeTestResultCode();
         this.bloodSugar=adultHealthExamination.getBloodSugar();
         this.urineMicroalbumin=adultHealthExamination.getUrineMicroalbumin();
         this.fecalOccultBlood=adultHealthExamination.getFecalOccultBlood();
         this.glycosylatedHemoglobin=adultHealthExamination.getGlycosylatedHemoglobin();
         this.serumAlanineAminotransferase=adultHealthExamination.getSerumAlanineAminotransferase();
         this.serumAspartateAminotransferase=adultHealthExamination.getSerumAspartateAminotransferase();
         this.albumin=adultHealthExamination.getAlbumin();
         this.totalBilirubin=adultHealthExamination.getTotalBilirubin();
         this.conjugatedBilirubin=adultHealthExamination.getConjugatedBilirubin();
         this.scr=adultHealthExamination.getScr();
         this.bloodUreaNitrogen=adultHealthExamination.getBloodUreaNitrogen();
         this.bloodPotassiumConcentration=adultHealthExamination.getBloodPotassiumConcentration();
         this.serumSodiumConcentration=adultHealthExamination.getSerumSodiumConcentration();
         this.totalCholesterol=adultHealthExamination.getTotalCholesterol();
         this.triglyceride=adultHealthExamination.getTriglyceride();
         this.serumLowDensityLipoproteinCholesterol=adultHealthExamination.getSerumLowDensityLipoproteinCholesterol();
         this.hepatitisBSurfaceAntigen=adultHealthExamination.getHepatitisBSurfaceAntigen();
         this.hepatitisBSurfaceAntibody=adultHealthExamination.getHepatitisBSurfaceAntibody();
         this.hepatitisBEAntigen=adultHealthExamination.getHepatitisBEAntigen();
         this.hepatitisBEAntibody=adultHealthExamination.getHepatitisBEAntibody();
         this.hepatitisBCoreAntibody=adultHealthExamination.getHepatitisBCoreAntibody();
         this.abnormalChestXRaySign=adultHealthExamination.getAbnormalChestXRaySign();
         this.abnormalChestXRayDescribe=adultHealthExamination.getAbnormalChestXRayDescribe();
         this.ecgAbnormalitySign=adultHealthExamination.getEcgAbnormalitySign();
         this.ecgAbnormalityDescribe=adultHealthExamination.getEcgAbnormalityDescribe();
         this.abnormalUltrasonographySign=adultHealthExamination.getAbnormalUltrasonographySign();
         this.abnormalUltrasonographyDescribe=adultHealthExamination.getAbnormalUltrasonographyDescribe();
         this.cervicalSmearAbnormalitySign=adultHealthExamination.getCervicalSmearAbnormalitySign();
         this.cervicalSmearAbnormalityDescribe=adultHealthExamination.getCervicalSmearAbnormalityDescribe();
         this.familyDiseaseNameCode=adultHealthExamination.getFamilyDiseaseNameCode();
         this.registeredMedicalInstitutionName=adultHealthExamination.getRegisteredMedicalInstitutionName();
         this.inpatientMedicalRecordNumber=adultHealthExamination.getInpatientMedicalRecordNumber();
         this.hospitalizationCauses=adultHealthExamination.getHospitalizationCauses();
         this.onceEstablishFamilyBedOrgName=adultHealthExamination.getOnceEstablishFamilyBedOrgName();
         this.onceEstablishFamilyBedMedicalRecordNumber=adultHealthExamination.getOnceEstablishFamilyBedMedicalRecordNumber();
         this.establishFamilyBedsReason=adultHealthExamination.getEstablishFamilyBedsReason();
         java.util.Date _inoculationTime = adultHealthExamination.getInoculationTime();
         if(_inoculationTime!=null){
         	this.inoculationTime=_inoculationTime.getTime();
         }
         this.immuneDose=adultHealthExamination.getImmuneDose();
         this.vaccineNameCode=adultHealthExamination.getVaccineNameCode();
         this.vaccineBatch=adultHealthExamination.getVaccineBatch();
         this.vaccineManufacturers=adultHealthExamination.getVaccineManufacturers();
         this.vaccinationPhysician=adultHealthExamination.getVaccinationPhysician();
         this.inoculationMechanism=adultHealthExamination.getInoculationMechanism();
         this.occupationalExposureToHazardousFactors=adultHealthExamination.getOccupationalExposureToHazardousFactors();
         this.engagedInHazardousFactors=adultHealthExamination.getEngagedInHazardousFactors();
         this.occupationalHazardFactorsCode=adultHealthExamination.getOccupationalHazardFactorsCode();
         this.occupationalExposureRiskFactorsName=adultHealthExamination.getOccupationalExposureRiskFactorsName();
         this.occupationalProtectionMeasures=adultHealthExamination.getOccupationalProtectionMeasures();
         this.physicalActivityFrequencyCode=adultHealthExamination.getPhysicalActivityFrequencyCode();
         this.eachExerciseTime=adultHealthExamination.getEachExerciseTime();
         this.adhereToExerciseTime=adultHealthExamination.getAdhereToExerciseTime();
         this.exerciseMode=adultHealthExamination.getExerciseMode();
         this.dietCode=adultHealthExamination.getDietCode();
         this.smokingStatus=adultHealthExamination.getSmokingStatus();
         this.daySmokingAmount=adultHealthExamination.getDaySmokingAmount();
         this.startSmokingAge=adultHealthExamination.getStartSmokingAge();
         this.smokingCessationAge=adultHealthExamination.getSmokingCessationAge();
         this.drinkingFrequency=adultHealthExamination.getDrinkingFrequency();
         this.drinkingPerDay=adultHealthExamination.getDrinkingPerDay();
         this.ifDrinking=adultHealthExamination.getIfDrinking();
         this.abstinenceAge=adultHealthExamination.getAbstinenceAge();
         this.drinkingAge=adultHealthExamination.getDrinkingAge();
         this.abstinenceSign=adultHealthExamination.getAbstinenceSign();
         this.drinkingTypeCode=adultHealthExamination.getDrinkingTypeCode();
         this.elderlyHealthStatusAssessmentCode=adultHealthExamination.getElderlyHealthStatusAssessmentCode();
         this.elderlySelfAssessmentCode=adultHealthExamination.getElderlySelfAssessmentCode();
         this.screeningCognitiveStateClassificationCode=adultHealthExamination.getScreeningCognitiveStateClassificationCode();
         this.cognitiveFunctionScore=adultHealthExamination.getCognitiveFunctionScore();
         this.theEmotionalStateOfCoarseCode=adultHealthExamination.getTheEmotionalStateOfCoarseCode();
         this.geriatricDepressionScore=adultHealthExamination.getGeriatricDepressionScore();
         this.healthEvaluationAbnormalSigns=adultHealthExamination.getHealthEvaluationAbnormalSigns();
         this.healthEvaluationExceptionDescription=adultHealthExamination.getHealthEvaluationExceptionDescription();
         this.healthInstructionCode=adultHealthExamination.getHealthInstructionCode();
         this.riskFactorControlCode=adultHealthExamination.getRiskFactorControlCode();
         this.diagnosis=adultHealthExamination.getDiagnosis();
         this.diagnosisName=adultHealthExamination.getDiagnosisName();
         java.util.Date _diagnosisDate = adultHealthExamination.getDiagnosisDate();
         if(_diagnosisDate!=null){
         	this.diagnosisDate=_diagnosisDate.getTime();
         }
         this.tcmConstitutionClassificationCode=adultHealthExamination.getTcmConstitutionClassificationCode();
         this.tcmConstitutionClassificationResultCode=adultHealthExamination.getTcmConstitutionClassificationResultCode();
         this.freqCode=adultHealthExamination.getFreqCode();
         this.medicationComplianceCode=adultHealthExamination.getMedicationComplianceCode();
         this.medicationCd=adultHealthExamination.getMedicationCd();
         this.medicationName=adultHealthExamination.getMedicationName();
         this.drugDosageForms=adultHealthExamination.getDrugDosageForms();
         this.drugDosageFormsName=adultHealthExamination.getDrugDosageFormsName();
         java.util.Date _start = adultHealthExamination.getStart();
         if(_start!=null){
         	this.start=_start.getTime();
         }
         this.duration=adultHealthExamination.getDuration();
         this.dosageCode=adultHealthExamination.getDosageCode();
         this.cMedCode=adultHealthExamination.getcMedCode();
         this.onceValue=adultHealthExamination.getOnceValue();
         this.onceUnit=adultHealthExamination.getOnceUnit();
         this.upHospitalName=adultHealthExamination.getUpHospitalName();
         this.errorMessage=adultHealthExamination.getErrorMessage();
         this.errorDetail=adultHealthExamination.getErrorDetail();      
    }
      public String  getAdultHealthExaminationId(){
       		return this.adultHealthExaminationId;
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
      public String  getPhone(){
       		return this.phone;
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
      public String  getSymptomDescription(){
       		return this.symptomDescription;
      }    
      public String  getSymptomCd(){
       		return this.symptomCd;
      }    
      public String  getSymptomName(){
       		return this.symptomName;
      }    
      public Long  getAdmissionDiagnosisDate(){
       		return this.admissionDiagnosisDate;
      }    
      public Float  getBodyTemperature(){
       		return this.bodyTemperature;
      }    
      public Float  getPulses(){
       		return this.pulses;
      }    
      public Float  getBreathingRate(){
       		return this.breathingRate;
      }    
      public Float  getLeftSystolicPressure(){
       		return this.leftSystolicPressure;
      }    
      public Float  getLeftDiastolicPressure(){
       		return this.leftDiastolicPressure;
      }    
      public Float  getRightSystolicPressure(){
       		return this.rightSystolicPressure;
      }    
      public Float  getRightDiastolicPressure(){
       		return this.rightDiastolicPressure;
      }    
      public Float  getPrenatalHeight(){
       		return this.prenatalHeight;
      }    
      public Float  getWeight(){
       		return this.weight;
      }    
      public Float  getWaist(){
       		return this.waist;
      }    
      public String  getBodyMassIndex(){
       		return this.bodyMassIndex;
      }    
      public Float  getHeartRate(){
       		return this.heartRate;
      }    
      public String  getLipAppearanceCode(){
       		return this.lipAppearanceCode;
      }    
      public String  getDentitionClassCode(){
       		return this.dentitionClassCode;
      }    
      public String  getDentitionDescription(){
       		return this.dentitionDescription;
      }    
      public String  getPharyngealExaminationResultCode(){
       		return this.pharyngealExaminationResultCode;
      }    
      public Float  getFarVisualAcuity(){
       		return this.farVisualAcuity;
      }    
      public Float  getLeftCorrectedVisualAcuity(){
       		return this.leftCorrectedVisualAcuity;
      }    
      public Float  getRightCorrectedVisualAcuity(){
       		return this.rightCorrectedVisualAcuity;
      }    
      public Boolean  getFundusExaminationResultsAbnormalMark(){
       		return this.fundusExaminationResultsAbnormalMark;
      }    
      public String  getFundusExaminationResultsAbnormalDescribe(){
       		return this.fundusExaminationResultsAbnormalDescribe;
      }    
      public String  getScleralExaminationResultCode(){
       		return this.scleralExaminationResultCode;
      }    
      public String  getHearingTestResultCode(){
       		return this.hearingTestResultCode;
      }    
      public Boolean  getAbdominalTendernessSign(){
       		return this.abdominalTendernessSign;
      }    
      public String  getAbdominalTendernessDescribe(){
       		return this.abdominalTendernessDescribe;
      }    
      public Boolean  getAbdominalMassSign(){
       		return this.abdominalMassSign;
      }    
      public String  getAbdominalMassDescribe(){
       		return this.abdominalMassDescribe;
      }    
      public Boolean  getLiverSign(){
       		return this.liverSign;
      }    
      public String  getLiverDescribe(){
       		return this.liverDescribe;
      }    
      public Boolean  getSplenomegalySign(){
       		return this.splenomegalySign;
      }    
      public String  getSplenomegalyDescribe(){
       		return this.splenomegalyDescribe;
      }    
      public Boolean  getAbdominalShiftingDullnessSign(){
       		return this.abdominalShiftingDullnessSign;
      }    
      public String  getAbdominalShiftingDullnessDescribe(){
       		return this.abdominalShiftingDullnessDescribe;
      }    
      public String  getMotionFunctionStatusCode(){
       		return this.motionFunctionStatusCode;
      }    
      public String  getHeartTypeCode(){
       		return this.heartTypeCode;
      }    
      public Boolean  getCardiacMurmurSign(){
       		return this.cardiacMurmurSign;
      }    
      public String  getCardiacMurmurDescribe(){
       		return this.cardiacMurmurDescribe;
      }    
      public String  getDorsalisPedisPulseCode(){
       		return this.dorsalisPedisPulseCode;
      }    
      public Boolean  getLungAbnormalBreathSoundsSign(){
       		return this.lungAbnormalBreathSoundsSign;
      }    
      public String  getLungAbnormalBreathSoundsDescribe(){
       		return this.lungAbnormalBreathSoundsDescribe;
      }    
      public Boolean  getLungRaleSign(){
       		return this.lungRaleSign;
      }    
      public String  getLungRaleDescribe(){
       		return this.lungRaleDescribe;
      }    
      public Boolean  getBarrelChestSign(){
       		return this.barrelChestSign;
      }    
      public String  getSkinTestResultCode(){
       		return this.skinTestResultCode;
      }    
      public String  getLymphNodeExaminationResultCode(){
       		return this.lymphNodeExaminationResultCode;
      }    
      public String  getLowerExtremityEdemaTestResultCode(){
       		return this.lowerExtremityEdemaTestResultCode;
      }    
      public String  getAnalExaminationResultsCode(){
       		return this.analExaminationResultsCode;
      }    
      public String  getBreastExaminationResultsCode(){
       		return this.breastExaminationResultsCode;
      }    
      public Boolean  getVulvaAbnormalitySign(){
       		return this.vulvaAbnormalitySign;
      }    
      public String  getVulvaAbnormalityDescribe(){
       		return this.vulvaAbnormalityDescribe;
      }    
      public Boolean  getAbnormalVaginaSign(){
       		return this.abnormalVaginaSign;
      }    
      public String  getAbnormalVaginaDescribe(){
       		return this.abnormalVaginaDescribe;
      }    
      public Boolean  getCervicalAbnormalitySign(){
       		return this.cervicalAbnormalitySign;
      }    
      public String  getCervicalAbnormalityDescribe(){
       		return this.cervicalAbnormalityDescribe;
      }    
      public Boolean  getUterineBodyAbnormalSign(){
       		return this.uterineBodyAbnormalSign;
      }    
      public String  getUterineBodyAbnormalDescribe(){
       		return this.uterineBodyAbnormalDescribe;
      }    
      public Boolean  getEnclosureAbnormalSign(){
       		return this.enclosureAbnormalSign;
      }    
      public String  getEnclosureAbnormalDescribe(){
       		return this.enclosureAbnormalDescribe;
      }    
      public Float  getHemoglobin(){
       		return this.hemoglobin;
      }    
      public Float  getWhiteBloodCell(){
       		return this.whiteBloodCell;
      }    
      public Float  getPlatelet(){
       		return this.platelet;
      }    
      public String  getUrineProteinQualitativeTestResultCode(){
       		return this.urineProteinQualitativeTestResultCode;
      }    
      public String  getNiaotangQualitativeTestResultCode(){
       		return this.niaotangQualitativeTestResultCode;
      }    
      public String  getUrineKetoneQualitativeTestResultCode(){
       		return this.urineKetoneQualitativeTestResultCode;
      }    
      public String  getBldQualitativeTestResultCode(){
       		return this.bldQualitativeTestResultCode;
      }    
      public Float  getBloodSugar(){
       		return this.bloodSugar;
      }    
      public Float  getUrineMicroalbumin(){
       		return this.urineMicroalbumin;
      }    
      public Float  getFecalOccultBlood(){
       		return this.fecalOccultBlood;
      }    
      public Float  getGlycosylatedHemoglobin(){
       		return this.glycosylatedHemoglobin;
      }    
      public Float  getSerumAlanineAminotransferase(){
       		return this.serumAlanineAminotransferase;
      }    
      public Float  getSerumAspartateAminotransferase(){
       		return this.serumAspartateAminotransferase;
      }    
      public Float  getAlbumin(){
       		return this.albumin;
      }    
      public Float  getTotalBilirubin(){
       		return this.totalBilirubin;
      }    
      public Float  getConjugatedBilirubin(){
       		return this.conjugatedBilirubin;
      }    
      public Float  getScr(){
       		return this.scr;
      }    
      public Float  getBloodUreaNitrogen(){
       		return this.bloodUreaNitrogen;
      }    
      public Float  getBloodPotassiumConcentration(){
       		return this.bloodPotassiumConcentration;
      }    
      public Float  getSerumSodiumConcentration(){
       		return this.serumSodiumConcentration;
      }    
      public Float  getTotalCholesterol(){
       		return this.totalCholesterol;
      }    
      public Float  getTriglyceride(){
       		return this.triglyceride;
      }    
      public Float  getSerumLowDensityLipoproteinCholesterol(){
       		return this.serumLowDensityLipoproteinCholesterol;
      }    
      public String  getHepatitisBSurfaceAntigen(){
       		return this.hepatitisBSurfaceAntigen;
      }    
      public String  getHepatitisBSurfaceAntibody(){
       		return this.hepatitisBSurfaceAntibody;
      }    
      public String  getHepatitisBEAntigen(){
       		return this.hepatitisBEAntigen;
      }    
      public String  getHepatitisBEAntibody(){
       		return this.hepatitisBEAntibody;
      }    
      public String  getHepatitisBCoreAntibody(){
       		return this.hepatitisBCoreAntibody;
      }    
      public Boolean  getAbnormalChestXRaySign(){
       		return this.abnormalChestXRaySign;
      }    
      public String  getAbnormalChestXRayDescribe(){
       		return this.abnormalChestXRayDescribe;
      }    
      public Boolean  getEcgAbnormalitySign(){
       		return this.ecgAbnormalitySign;
      }    
      public String  getEcgAbnormalityDescribe(){
       		return this.ecgAbnormalityDescribe;
      }    
      public Boolean  getAbnormalUltrasonographySign(){
       		return this.abnormalUltrasonographySign;
      }    
      public String  getAbnormalUltrasonographyDescribe(){
       		return this.abnormalUltrasonographyDescribe;
      }    
      public Boolean  getCervicalSmearAbnormalitySign(){
       		return this.cervicalSmearAbnormalitySign;
      }    
      public String  getCervicalSmearAbnormalityDescribe(){
       		return this.cervicalSmearAbnormalityDescribe;
      }    
      public String  getFamilyDiseaseNameCode(){
       		return this.familyDiseaseNameCode;
      }    
      public String  getRegisteredMedicalInstitutionName(){
       		return this.registeredMedicalInstitutionName;
      }    
      public String  getInpatientMedicalRecordNumber(){
       		return this.inpatientMedicalRecordNumber;
      }    
      public String  getHospitalizationCauses(){
       		return this.hospitalizationCauses;
      }    
      public String  getOnceEstablishFamilyBedOrgName(){
       		return this.onceEstablishFamilyBedOrgName;
      }    
      public String  getOnceEstablishFamilyBedMedicalRecordNumber(){
       		return this.onceEstablishFamilyBedMedicalRecordNumber;
      }    
      public String  getEstablishFamilyBedsReason(){
       		return this.establishFamilyBedsReason;
      }    
      public Long  getInoculationTime(){
       		return this.inoculationTime;
      }    
      public Float  getImmuneDose(){
       		return this.immuneDose;
      }    
      public String  getVaccineNameCode(){
       		return this.vaccineNameCode;
      }    
      public String  getVaccineBatch(){
       		return this.vaccineBatch;
      }    
      public String  getVaccineManufacturers(){
       		return this.vaccineManufacturers;
      }    
      public String  getVaccinationPhysician(){
       		return this.vaccinationPhysician;
      }    
      public String  getInoculationMechanism(){
       		return this.inoculationMechanism;
      }    
      public String  getOccupationalExposureToHazardousFactors(){
       		return this.occupationalExposureToHazardousFactors;
      }    
      public Float  getEngagedInHazardousFactors(){
       		return this.engagedInHazardousFactors;
      }    
      public String  getOccupationalHazardFactorsCode(){
       		return this.occupationalHazardFactorsCode;
      }    
      public String  getOccupationalExposureRiskFactorsName(){
       		return this.occupationalExposureRiskFactorsName;
      }    
      public Boolean  getOccupationalProtectionMeasures(){
       		return this.occupationalProtectionMeasures;
      }    
      public String  getPhysicalActivityFrequencyCode(){
       		return this.physicalActivityFrequencyCode;
      }    
      public Float  getEachExerciseTime(){
       		return this.eachExerciseTime;
      }    
      public Float  getAdhereToExerciseTime(){
       		return this.adhereToExerciseTime;
      }    
      public String  getExerciseMode(){
       		return this.exerciseMode;
      }    
      public String  getDietCode(){
       		return this.dietCode;
      }    
      public String  getSmokingStatus(){
       		return this.smokingStatus;
      }    
      public Float  getDaySmokingAmount(){
       		return this.daySmokingAmount;
      }    
      public Float  getStartSmokingAge(){
       		return this.startSmokingAge;
      }    
      public Float  getSmokingCessationAge(){
       		return this.smokingCessationAge;
      }    
      public String  getDrinkingFrequency(){
       		return this.drinkingFrequency;
      }    
      public Float  getDrinkingPerDay(){
       		return this.drinkingPerDay;
      }    
      public Boolean  getIfDrinking(){
       		return this.ifDrinking;
      }    
      public Float  getAbstinenceAge(){
       		return this.abstinenceAge;
      }    
      public Float  getDrinkingAge(){
       		return this.drinkingAge;
      }    
      public Boolean  getAbstinenceSign(){
       		return this.abstinenceSign;
      }    
      public String  getDrinkingTypeCode(){
       		return this.drinkingTypeCode;
      }    
      public String  getElderlyHealthStatusAssessmentCode(){
       		return this.elderlyHealthStatusAssessmentCode;
      }    
      public String  getElderlySelfAssessmentCode(){
       		return this.elderlySelfAssessmentCode;
      }    
      public String  getScreeningCognitiveStateClassificationCode(){
       		return this.screeningCognitiveStateClassificationCode;
      }    
      public Float  getCognitiveFunctionScore(){
       		return this.cognitiveFunctionScore;
      }    
      public String  getTheEmotionalStateOfCoarseCode(){
       		return this.theEmotionalStateOfCoarseCode;
      }    
      public Float  getGeriatricDepressionScore(){
       		return this.geriatricDepressionScore;
      }    
      public Boolean  getHealthEvaluationAbnormalSigns(){
       		return this.healthEvaluationAbnormalSigns;
      }    
      public String  getHealthEvaluationExceptionDescription(){
       		return this.healthEvaluationExceptionDescription;
      }    
      public String  getHealthInstructionCode(){
       		return this.healthInstructionCode;
      }    
      public String  getRiskFactorControlCode(){
       		return this.riskFactorControlCode;
      }    
      public String  getDiagnosis(){
       		return this.diagnosis;
      }    
      public String  getDiagnosisName(){
       		return this.diagnosisName;
      }    
      public Long  getDiagnosisDate(){
       		return this.diagnosisDate;
      }    
      public String  getTcmConstitutionClassificationCode(){
       		return this.tcmConstitutionClassificationCode;
      }    
      public String  getTcmConstitutionClassificationResultCode(){
       		return this.tcmConstitutionClassificationResultCode;
      }    
      public String  getFreqCode(){
       		return this.freqCode;
      }    
      public String  getMedicationComplianceCode(){
       		return this.medicationComplianceCode;
      }    
      public String  getMedicationCd(){
       		return this.medicationCd;
      }    
      public String  getMedicationName(){
       		return this.medicationName;
      }    
      public String  getDrugDosageForms(){
       		return this.drugDosageForms;
      }    
      public String  getDrugDosageFormsName(){
       		return this.drugDosageFormsName;
      }    
      public Long  getStart(){
       		return this.start;
      }    
      public Float  getDuration(){
       		return this.duration;
      }    
      public String  getDosageCode(){
       		return this.dosageCode;
      }    
      public String  getcMedCode(){
       		return this.cMedCode;
      }    
      public Float  getOnceValue(){
       		return this.onceValue;
      }    
      public String  getOnceUnit(){
       		return this.onceUnit;
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