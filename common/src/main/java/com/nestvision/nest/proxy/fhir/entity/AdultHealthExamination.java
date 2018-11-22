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
@Table(name = BaseEntity.TABLE_PREFIX + "ADULT_HEALTH_EXAMINATION")
public class AdultHealthExamination extends FhirResourceEntity {

    /**
     *名称:成人健康体检id
     *
 	 *
 	 *主键字段
     */
     @Column(name="ADULT_HEALTH_EXAMINATION_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="ADULT_HEALTH_EXAMINATION_ID",displayName="成人健康体检id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String adultHealthExaminationId;
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
     *名称:联系方式
     *
 	 *
 	 *
     */
     @Column(name="PHONE",length = 20,nullable = true)
     @FhirFieldValidate(name="PHONE",displayName="联系方式",maxLength=20,required=false,valuesRange="")   
     private String phone;
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
     *名称:症状描述
     *
 	 *
 	 *
     */
     @Column(name="SYMPTOM_DESCRIPTION",length = 500,nullable = true)
     @FhirFieldValidate(name="SYMPTOM_DESCRIPTION",displayName="症状描述",maxLength=500,required=false,valuesRange="")   
     private String symptomDescription;
    /**
     *名称:症状代码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="SYMPTOM_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="SYMPTOM_CD",displayName="症状代码",maxLength=20,required=false,valuesRange="CV990111")   
     private String symptomCd;
    /**
     *名称:症状名称
     *
 	 *
 	 *
     */
     @Column(name="SYMPTOM_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="SYMPTOM_NAME",displayName="症状名称",maxLength=40,required=false,valuesRange="")   
     private String symptomName;
    /**
     *名称:症状-诊断日期
     *
 	 *
 	 *
     */
     @Column(name="ADMISSION_DIAGNOSIS_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="ADMISSION_DIAGNOSIS_DATE",displayName="症状-诊断日期",required=false,valuesRange="")   
     private Date admissionDiagnosisDate;
    /**
     *名称:体温（℃）
     *
 	 *
 	 *
     */
     @Column(name="BODY_TEMPERATURE",length = 8,nullable = true)
     @FhirFieldValidate(name="BODY_TEMPERATURE",displayName="体温（℃）",maxLength=8,required=false,valuesRange="")   
     private Float bodyTemperature;
    /**
     *名称:脉率（次/min）
     *
 	 *
 	 *
     */
     @Column(name="PULSES",length = 8,nullable = true)
     @FhirFieldValidate(name="PULSES",displayName="脉率（次/min）",maxLength=8,required=false,valuesRange="")   
     private Float pulses;
    /**
     *名称:呼吸频率（次/min）
     *
 	 *
 	 *
     */
     @Column(name="BREATHING_RATE",length = 8,nullable = true)
     @FhirFieldValidate(name="BREATHING_RATE",displayName="呼吸频率（次/min）",maxLength=8,required=false,valuesRange="")   
     private Float breathingRate;
    /**
     *名称:左侧收缩压（mmHg）
     *
 	 *
 	 *
     */
     @Column(name="LEFT_SYSTOLIC_PRESSURE",length = 8,nullable = true)
     @FhirFieldValidate(name="LEFT_SYSTOLIC_PRESSURE",displayName="左侧收缩压（mmHg）",maxLength=8,required=false,valuesRange="")   
     private Float leftSystolicPressure;
    /**
     *名称:左侧舒张压（mmHg）
     *
 	 *
 	 *
     */
     @Column(name="LEFT_DIASTOLIC_PRESSURE",length = 8,nullable = true)
     @FhirFieldValidate(name="LEFT_DIASTOLIC_PRESSURE",displayName="左侧舒张压（mmHg）",maxLength=8,required=false,valuesRange="")   
     private Float leftDiastolicPressure;
    /**
     *名称:右侧收缩压（mmHg）
     *
 	 *
 	 *
     */
     @Column(name="RIGHT_SYSTOLIC_PRESSURE",length = 8,nullable = true)
     @FhirFieldValidate(name="RIGHT_SYSTOLIC_PRESSURE",displayName="右侧收缩压（mmHg）",maxLength=8,required=false,valuesRange="")   
     private Float rightSystolicPressure;
    /**
     *名称:右侧舒张压（mmHg）
     *
 	 *
 	 *
     */
     @Column(name="RIGHT_DIASTOLIC_PRESSURE",length = 8,nullable = true)
     @FhirFieldValidate(name="RIGHT_DIASTOLIC_PRESSURE",displayName="右侧舒张压（mmHg）",maxLength=8,required=false,valuesRange="")   
     private Float rightDiastolicPressure;
    /**
     *名称:身高（cm）
     *
 	 *
 	 *
     */
     @Column(name="PRENATAL_HEIGHT",length = 8,nullable = true)
     @FhirFieldValidate(name="PRENATAL_HEIGHT",displayName="身高（cm）",maxLength=8,required=false,valuesRange="")   
     private Float prenatalHeight;
    /**
     *名称:体重（kg）
     *
 	 *
 	 *
     */
     @Column(name="WEIGHT",length = 8,nullable = true)
     @FhirFieldValidate(name="WEIGHT",displayName="体重（kg）",maxLength=8,required=false,valuesRange="")   
     private Float weight;
    /**
     *名称:腰围（cm）
     *
 	 *
 	 *
     */
     @Column(name="WAIST",length = 8,nullable = true)
     @FhirFieldValidate(name="WAIST",displayName="腰围（cm）",maxLength=8,required=false,valuesRange="")   
     private Float waist;
    /**
     *名称:体质指数
     *
 	 *
 	 *
     */
     @Column(name="BODY_MASS_INDEX",length = 40,nullable = true)
     @FhirFieldValidate(name="BODY_MASS_INDEX",displayName="体质指数",maxLength=40,required=false,valuesRange="")   
     private String bodyMassIndex;
    /**
     *名称:心率（次/min）
     *
 	 *
 	 *
     */
     @Column(name="HEART_RATE",length = 8,nullable = true)
     @FhirFieldValidate(name="HEART_RATE",displayName="心率（次/min）",maxLength=8,required=false,valuesRange="")   
     private Float heartRate;
    /**
     *名称:口唇外观检查结果代码
     *
 	 *限制:CV0410007
 	 *
     */
     @Column(name="LIP_APPEARANCE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="LIP_APPEARANCE_CODE",displayName="口唇外观检查结果代码",maxLength=20,required=false,valuesRange="CV0410007")   
     private String lipAppearanceCode;
    /**
     *名称:齿列类别代码
     *
 	 *限制:CV0410010
 	 *
     */
     @Column(name="DENTITION_CLASS_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="DENTITION_CLASS_CODE",displayName="齿列类别代码",maxLength=20,required=false,valuesRange="CV0410010")   
     private String dentitionClassCode;
    /**
     *名称:齿列描述
     *
 	 *
 	 *
     */
     @Column(name="DENTITION_DESCRIPTION",length = 40,nullable = true)
     @FhirFieldValidate(name="DENTITION_DESCRIPTION",displayName="齿列描述",maxLength=40,required=false,valuesRange="")   
     private String dentitionDescription;
    /**
     *名称:咽部检查结果代码
     *
 	 *限制:CV9900015
 	 *
     */
     @Column(name="PHARYNGEAL_EXAMINATION_RESULT_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="PHARYNGEAL_EXAMINATION_RESULT_CODE",displayName="咽部检查结果代码",maxLength=20,required=false,valuesRange="CV9900015")   
     private String pharyngealExaminationResultCode;
    /**
     *名称:左眼裸眼远视力值
     *
 	 *
 	 *
     */
     @Column(name="FAR_VISUAL_ACUITY",length = 8,nullable = true)
     @FhirFieldValidate(name="FAR_VISUAL_ACUITY",displayName="左眼裸眼远视力值",maxLength=8,required=false,valuesRange="")   
     private Float farVisualAcuity;
    /**
     *名称:左眼矫正远视力值
     *
 	 *
 	 *
     */
     @Column(name="LEFT_CORRECTED_VISUAL_ACUITY",length = 8,nullable = true)
     @FhirFieldValidate(name="LEFT_CORRECTED_VISUAL_ACUITY",displayName="左眼矫正远视力值",maxLength=8,required=false,valuesRange="")   
     private Float leftCorrectedVisualAcuity;
    /**
     *名称:右眼矫正远视力值
     *
 	 *
 	 *
     */
     @Column(name="RIGHT_CORRECTED_VISUAL_ACUITY",length = 8,nullable = true)
     @FhirFieldValidate(name="RIGHT_CORRECTED_VISUAL_ACUITY",displayName="右眼矫正远视力值",maxLength=8,required=false,valuesRange="")   
     private Float rightCorrectedVisualAcuity;
    /**
     *名称:眼底检查结果异常标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="FUNDUS_EXAMINATION_RESULTS_ABNORMAL_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="FUNDUS_EXAMINATION_RESULTS_ABNORMAL_MARK",displayName="眼底检查结果异常标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean fundusExaminationResultsAbnormalMark;
    /**
     *名称:眼底检查结果异常描述
     *
 	 *
 	 *
     */
     @Column(name="FUNDUS_EXAMINATION_RESULTS_ABNORMAL_DESCRIBE",length = 40,nullable = true)
     @FhirFieldValidate(name="FUNDUS_EXAMINATION_RESULTS_ABNORMAL_DESCRIBE",displayName="眼底检查结果异常描述",maxLength=40,required=false,valuesRange="")   
     private String fundusExaminationResultsAbnormalDescribe;
    /**
     *名称:巩膜检查结果代码
     *
 	 *限制:CV0410006
 	 *
     */
     @Column(name="SCLERAL_EXAMINATION_RESULT_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="SCLERAL_EXAMINATION_RESULT_CODE",displayName="巩膜检查结果代码",maxLength=20,required=false,valuesRange="CV0410006")   
     private String scleralExaminationResultCode;
    /**
     *名称:听力检测结果代码
     *
 	 *限制:CV9900016
 	 *
     */
     @Column(name="HEARING_TEST_RESULT_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="HEARING_TEST_RESULT_CODE",displayName="听力检测结果代码",maxLength=20,required=false,valuesRange="CV9900016")   
     private String hearingTestResultCode;
    /**
     *名称:腹部压痛标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="ABDOMINAL_TENDERNESS_SIGN",length = 5,nullable = true)
     @FhirFieldValidate(name="ABDOMINAL_TENDERNESS_SIGN",displayName="腹部压痛标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean abdominalTendernessSign;
    /**
     *名称:腹部压痛描述
     *
 	 *
 	 *
     */
     @Column(name="ABDOMINAL_TENDERNESS_DESCRIBE",length = 40,nullable = true)
     @FhirFieldValidate(name="ABDOMINAL_TENDERNESS_DESCRIBE",displayName="腹部压痛描述",maxLength=40,required=false,valuesRange="")   
     private String abdominalTendernessDescribe;
    /**
     *名称:腹部包块标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="ABDOMINAL_MASS_SIGN",length = 5,nullable = true)
     @FhirFieldValidate(name="ABDOMINAL_MASS_SIGN",displayName="腹部包块标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean abdominalMassSign;
    /**
     *名称:腹部包块描述
     *
 	 *
 	 *
     */
     @Column(name="ABDOMINAL_MASS_DESCRIBE",length = 40,nullable = true)
     @FhirFieldValidate(name="ABDOMINAL_MASS_DESCRIBE",displayName="腹部包块描述",maxLength=40,required=false,valuesRange="")   
     private String abdominalMassDescribe;
    /**
     *名称:肝大标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="LIVER_SIGN",length = 5,nullable = true)
     @FhirFieldValidate(name="LIVER_SIGN",displayName="肝大标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean liverSign;
    /**
     *名称:肝大描述
     *
 	 *
 	 *
     */
     @Column(name="LIVER_DESCRIBE",length = 40,nullable = true)
     @FhirFieldValidate(name="LIVER_DESCRIBE",displayName="肝大描述",maxLength=40,required=false,valuesRange="")   
     private String liverDescribe;
    /**
     *名称:脾大标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="SPLENOMEGALY_SIGN",length = 5,nullable = true)
     @FhirFieldValidate(name="SPLENOMEGALY_SIGN",displayName="脾大标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean splenomegalySign;
    /**
     *名称:脾大描述
     *
 	 *
 	 *
     */
     @Column(name="SPLENOMEGALY_DESCRIBE",length = 40,nullable = true)
     @FhirFieldValidate(name="SPLENOMEGALY_DESCRIBE",displayName="脾大描述",maxLength=40,required=false,valuesRange="")   
     private String splenomegalyDescribe;
    /**
     *名称:腹部移动性浊音标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="ABDOMINAL_SHIFTING_DULLNESS_SIGN",length = 5,nullable = true)
     @FhirFieldValidate(name="ABDOMINAL_SHIFTING_DULLNESS_SIGN",displayName="腹部移动性浊音标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean abdominalShiftingDullnessSign;
    /**
     *名称:腹部移动性浊音描述
     *
 	 *
 	 *
     */
     @Column(name="ABDOMINAL_SHIFTING_DULLNESS_DESCRIBE",length = 40,nullable = true)
     @FhirFieldValidate(name="ABDOMINAL_SHIFTING_DULLNESS_DESCRIBE",displayName="腹部移动性浊音描述",maxLength=40,required=false,valuesRange="")   
     private String abdominalShiftingDullnessDescribe;
    /**
     *名称:运动功能状态代码
     *
 	 *限制:CV9900007
 	 *
     */
     @Column(name="MOTION_FUNCTION_STATUS_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="MOTION_FUNCTION_STATUS_CODE",displayName="运动功能状态代码",maxLength=20,required=false,valuesRange="CV9900007")   
     private String motionFunctionStatusCode;
    /**
     *名称:心律类别代码
     *
 	 *限制:CV9900008
 	 *
     */
     @Column(name="HEART_TYPE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="HEART_TYPE_CODE",displayName="心律类别代码",maxLength=20,required=false,valuesRange="CV9900008")   
     private String heartTypeCode;
    /**
     *名称:心脏杂音标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="CARDIAC_MURMUR_SIGN",length = 5,nullable = true)
     @FhirFieldValidate(name="CARDIAC_MURMUR_SIGN",displayName="心脏杂音标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean cardiacMurmurSign;
    /**
     *名称:心脏杂音描述
     *
 	 *
 	 *
     */
     @Column(name="CARDIAC_MURMUR_DESCRIBE",length = 40,nullable = true)
     @FhirFieldValidate(name="CARDIAC_MURMUR_DESCRIBE",displayName="心脏杂音描述",maxLength=40,required=false,valuesRange="")   
     private String cardiacMurmurDescribe;
    /**
     *名称:足背动脉搏动代码
     *
 	 *限制:CV0410015
 	 *
     */
     @Column(name="DORSALIS_PEDIS_PULSE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="DORSALIS_PEDIS_PULSE_CODE",displayName="足背动脉搏动代码",maxLength=20,required=false,valuesRange="CV0410015")   
     private String dorsalisPedisPulseCode;
    /**
     *名称:肺部异常呼吸音标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="LUNG_ABNORMAL_BREATH_SOUNDS_SIGN",length = 5,nullable = true)
     @FhirFieldValidate(name="LUNG_ABNORMAL_BREATH_SOUNDS_SIGN",displayName="肺部异常呼吸音标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean lungAbnormalBreathSoundsSign;
    /**
     *名称:肺部异常呼吸音描述
     *
 	 *
 	 *
     */
     @Column(name="LUNG_ABNORMAL_BREATH_SOUNDS_DESCRIBE",length = 40,nullable = true)
     @FhirFieldValidate(name="LUNG_ABNORMAL_BREATH_SOUNDS_DESCRIBE",displayName="肺部异常呼吸音描述",maxLength=40,required=false,valuesRange="")   
     private String lungAbnormalBreathSoundsDescribe;
    /**
     *名称:肺部罗音标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="LUNG_RALE_SIGN",length = 5,nullable = true)
     @FhirFieldValidate(name="LUNG_RALE_SIGN",displayName="肺部罗音标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean lungRaleSign;
    /**
     *名称:肺部罗音描述
     *
 	 *
 	 *
     */
     @Column(name="LUNG_RALE_DESCRIBE",length = 40,nullable = true)
     @FhirFieldValidate(name="LUNG_RALE_DESCRIBE",displayName="肺部罗音描述",maxLength=40,required=false,valuesRange="")   
     private String lungRaleDescribe;
    /**
     *名称:桶状胸标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="BARREL_CHEST_SIGN",length = 5,nullable = true)
     @FhirFieldValidate(name="BARREL_CHEST_SIGN",displayName="桶状胸标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean barrelChestSign;
    /**
     *名称:皮肤检查结果代码
     *
 	 *限制:CV0410004
 	 *
     */
     @Column(name="SKIN_TEST_RESULT_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="SKIN_TEST_RESULT_CODE",displayName="皮肤检查结果代码",maxLength=20,required=false,valuesRange="CV0410004")   
     private String skinTestResultCode;
    /**
     *名称:淋巴结检查结果代码
     *
 	 *限制:CV0410011
 	 *
     */
     @Column(name="LYMPH_NODE_EXAMINATION_RESULT_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="LYMPH_NODE_EXAMINATION_RESULT_CODE",displayName="淋巴结检查结果代码",maxLength=20,required=false,valuesRange="CV0410011")   
     private String lymphNodeExaminationResultCode;
    /**
     *名称:下肢水肿检查结果代码
     *
 	 *限制:CV0410014
 	 *
     */
     @Column(name="LOWER_EXTREMITY_EDEMA_TEST_RESULT_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="LOWER_EXTREMITY_EDEMA_TEST_RESULT_CODE",displayName="下肢水肿检查结果代码",maxLength=20,required=false,valuesRange="CV0410014")   
     private String lowerExtremityEdemaTestResultCode;
    /**
     *名称:肛门指诊检查结果类别代码
     *
 	 *限制:CV0410013
 	 *
     */
     @Column(name="ANAL_EXAMINATION_RESULTS_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="ANAL_EXAMINATION_RESULTS_CODE",displayName="肛门指诊检查结果类别代码",maxLength=20,required=false,valuesRange="CV0410013")   
     private String analExaminationResultsCode;
    /**
     *名称:乳腺检查结果代码
     *
 	 *限制:CV0410012
 	 *
     */
     @Column(name="BREAST_EXAMINATION_RESULTS_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="BREAST_EXAMINATION_RESULTS_CODE",displayName="乳腺检查结果代码",maxLength=20,required=false,valuesRange="CV0410012")   
     private String breastExaminationResultsCode;
    /**
     *名称:外阴异常标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="VULVA_ABNORMALITY_SIGN",length = 5,nullable = true)
     @FhirFieldValidate(name="VULVA_ABNORMALITY_SIGN",displayName="外阴异常标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean vulvaAbnormalitySign;
    /**
     *名称:外阴异常描述
     *
 	 *
 	 *
     */
     @Column(name="VULVA_ABNORMALITY_DESCRIBE",length = 40,nullable = true)
     @FhirFieldValidate(name="VULVA_ABNORMALITY_DESCRIBE",displayName="外阴异常描述",maxLength=40,required=false,valuesRange="")   
     private String vulvaAbnormalityDescribe;
    /**
     *名称:阴道异常标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="ABNORMAL_VAGINA_SIGN",length = 5,nullable = true)
     @FhirFieldValidate(name="ABNORMAL_VAGINA_SIGN",displayName="阴道异常标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean abnormalVaginaSign;
    /**
     *名称:阴道异常描述
     *
 	 *
 	 *
     */
     @Column(name="ABNORMAL_VAGINA_DESCRIBE",length = 40,nullable = true)
     @FhirFieldValidate(name="ABNORMAL_VAGINA_DESCRIBE",displayName="阴道异常描述",maxLength=40,required=false,valuesRange="")   
     private String abnormalVaginaDescribe;
    /**
     *名称:宫颈异常标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="CERVICAL_ABNORMALITY_SIGN",length = 5,nullable = true)
     @FhirFieldValidate(name="CERVICAL_ABNORMALITY_SIGN",displayName="宫颈异常标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean cervicalAbnormalitySign;
    /**
     *名称:宫颈异常描述
     *
 	 *
 	 *
     */
     @Column(name="CERVICAL_ABNORMALITY_DESCRIBE",length = 40,nullable = true)
     @FhirFieldValidate(name="CERVICAL_ABNORMALITY_DESCRIBE",displayName="宫颈异常描述",maxLength=40,required=false,valuesRange="")   
     private String cervicalAbnormalityDescribe;
    /**
     *名称:宫体异常标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="UTERINE_BODY_ABNORMAL_SIGN",length = 5,nullable = true)
     @FhirFieldValidate(name="UTERINE_BODY_ABNORMAL_SIGN",displayName="宫体异常标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean uterineBodyAbnormalSign;
    /**
     *名称:宫体异常描述
     *
 	 *
 	 *
     */
     @Column(name="UTERINE_BODY_ABNORMAL_DESCRIBE",length = 40,nullable = true)
     @FhirFieldValidate(name="UTERINE_BODY_ABNORMAL_DESCRIBE",displayName="宫体异常描述",maxLength=40,required=false,valuesRange="")   
     private String uterineBodyAbnormalDescribe;
    /**
     *名称:附件异常标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="ENCLOSURE_ABNORMAL_SIGN",length = 5,nullable = true)
     @FhirFieldValidate(name="ENCLOSURE_ABNORMAL_SIGN",displayName="附件异常标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean enclosureAbnormalSign;
    /**
     *名称:附件异常描述
     *
 	 *
 	 *
     */
     @Column(name="ENCLOSURE_ABNORMAL_DESCRIBE",length = 40,nullable = true)
     @FhirFieldValidate(name="ENCLOSURE_ABNORMAL_DESCRIBE",displayName="附件异常描述",maxLength=40,required=false,valuesRange="")   
     private String enclosureAbnormalDescribe;
    /**
     *名称:血红蛋白
     *
 	 *
 	 *
     */
     @Column(name="HEMOGLOBIN",length = 8,nullable = true)
     @FhirFieldValidate(name="HEMOGLOBIN",displayName="血红蛋白",maxLength=8,required=false,valuesRange="")   
     private Float hemoglobin;
    /**
     *名称:白细胞
     *
 	 *
 	 *
     */
     @Column(name="WHITE_BLOOD_CELL",length = 8,nullable = true)
     @FhirFieldValidate(name="WHITE_BLOOD_CELL",displayName="白细胞",maxLength=8,required=false,valuesRange="")   
     private Float whiteBloodCell;
    /**
     *名称:血小板
     *
 	 *
 	 *
     */
     @Column(name="PLATELET",length = 8,nullable = true)
     @FhirFieldValidate(name="PLATELET",displayName="血小板",maxLength=8,required=false,valuesRange="")   
     private Float platelet;
    /**
     *名称:尿蛋白定性检测结果代码
     *
 	 *限制:CV0450015
 	 *
     */
     @Column(name="URINE_PROTEIN_QUALITATIVE_TEST_RESULT_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="URINE_PROTEIN_QUALITATIVE_TEST_RESULT_CODE",displayName="尿蛋白定性检测结果代码",maxLength=20,required=false,valuesRange="CV0450015")   
     private String urineProteinQualitativeTestResultCode;
    /**
     *名称:尿糖定性检测结果代码
     *
 	 *限制:CV0450015
 	 *
     */
     @Column(name="NIAOTANG_QUALITATIVE_TEST_RESULT_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="NIAOTANG_QUALITATIVE_TEST_RESULT_CODE",displayName="尿糖定性检测结果代码",maxLength=20,required=false,valuesRange="CV0450015")   
     private String niaotangQualitativeTestResultCode;
    /**
     *名称:尿酮体定性检测结果代码
     *
 	 *限制:CV0450015
 	 *
     */
     @Column(name="URINE_KETONE_QUALITATIVE_TEST_RESULT_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="URINE_KETONE_QUALITATIVE_TEST_RESULT_CODE",displayName="尿酮体定性检测结果代码",maxLength=20,required=false,valuesRange="CV0450015")   
     private String urineKetoneQualitativeTestResultCode;
    /**
     *名称:尿潜血定性检测结果代码
     *
 	 *限制:CV0450015
 	 *
     */
     @Column(name="BLD_QUALITATIVE_TEST_RESULT_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="BLD_QUALITATIVE_TEST_RESULT_CODE",displayName="尿潜血定性检测结果代码",maxLength=20,required=false,valuesRange="CV0450015")   
     private String bldQualitativeTestResultCode;
    /**
     *名称:血糖检测值（mmol/L）
     *
 	 *
 	 *
     */
     @Column(name="BLOOD_SUGAR",length = 8,nullable = true)
     @FhirFieldValidate(name="BLOOD_SUGAR",displayName="血糖检测值（mmol/L）",maxLength=8,required=false,valuesRange="")   
     private Float bloodSugar;
    /**
     *名称:尿微量白蛋白(mg/dL)
     *
 	 *
 	 *
     */
     @Column(name="URINE_MICROALBUMIN",length = 8,nullable = true)
     @FhirFieldValidate(name="URINE_MICROALBUMIN",displayName="尿微量白蛋白(mg/dL)",maxLength=8,required=false,valuesRange="")   
     private Float urineMicroalbumin;
    /**
     *名称:大便潜血
     *
 	 *
 	 *
     */
     @Column(name="FECAL_OCCULT_BLOOD",length = 8,nullable = true)
     @FhirFieldValidate(name="FECAL_OCCULT_BLOOD",displayName="大便潜血",maxLength=8,required=false,valuesRange="")   
     private Float fecalOccultBlood;
    /**
     *名称:糖化血红蛋白(%)
     *
 	 *
 	 *
     */
     @Column(name="GLYCOSYLATED_HEMOGLOBIN",length = 8,nullable = true)
     @FhirFieldValidate(name="GLYCOSYLATED_HEMOGLOBIN",displayName="糖化血红蛋白(%)",maxLength=8,required=false,valuesRange="")   
     private Float glycosylatedHemoglobin;
    /**
     *名称:血清谷丙转氨酶
     *
 	 *
 	 *
     */
     @Column(name="SERUM_ALANINE_AMINOTRANSFERASE",length = 8,nullable = true)
     @FhirFieldValidate(name="SERUM_ALANINE_AMINOTRANSFERASE",displayName="血清谷丙转氨酶",maxLength=8,required=false,valuesRange="")   
     private Float serumAlanineAminotransferase;
    /**
     *名称:血清谷草转氨酶
     *
 	 *
 	 *
     */
     @Column(name="SERUM_ASPARTATE_AMINOTRANSFERASE",length = 8,nullable = true)
     @FhirFieldValidate(name="SERUM_ASPARTATE_AMINOTRANSFERASE",displayName="血清谷草转氨酶",maxLength=8,required=false,valuesRange="")   
     private Float serumAspartateAminotransferase;
    /**
     *名称:白蛋白(mg/dL)
     *
 	 *
 	 *
     */
     @Column(name="ALBUMIN",length = 8,nullable = true)
     @FhirFieldValidate(name="ALBUMIN",displayName="白蛋白(mg/dL)",maxLength=8,required=false,valuesRange="")   
     private Float albumin;
    /**
     *名称:总胆红素
     *
 	 *
 	 *
     */
     @Column(name="TOTAL_BILIRUBIN",length = 8,nullable = true)
     @FhirFieldValidate(name="TOTAL_BILIRUBIN",displayName="总胆红素",maxLength=8,required=false,valuesRange="")   
     private Float totalBilirubin;
    /**
     *名称:结合胆红素
     *
 	 *
 	 *
     */
     @Column(name="CONJUGATED_BILIRUBIN",length = 8,nullable = true)
     @FhirFieldValidate(name="CONJUGATED_BILIRUBIN",displayName="结合胆红素",maxLength=8,required=false,valuesRange="")   
     private Float conjugatedBilirubin;
    /**
     *名称:血清肌酐
     *
 	 *
 	 *
     */
     @Column(name="SCR",length = 8,nullable = true)
     @FhirFieldValidate(name="SCR",displayName="血清肌酐",maxLength=8,required=false,valuesRange="")   
     private Float scr;
    /**
     *名称:血尿素氮
     *
 	 *
 	 *
     */
     @Column(name="BLOOD_UREA_NITROGEN",length = 8,nullable = true)
     @FhirFieldValidate(name="BLOOD_UREA_NITROGEN",displayName="血尿素氮",maxLength=8,required=false,valuesRange="")   
     private Float bloodUreaNitrogen;
    /**
     *名称:血钾浓度(mmol/L)
     *
 	 *
 	 *
     */
     @Column(name="BLOOD_POTASSIUM_CONCENTRATION",length = 8,nullable = true)
     @FhirFieldValidate(name="BLOOD_POTASSIUM_CONCENTRATION",displayName="血钾浓度(mmol/L)",maxLength=8,required=false,valuesRange="")   
     private Float bloodPotassiumConcentration;
    /**
     *名称:血钠浓度(mmol/L)
     *
 	 *
 	 *
     */
     @Column(name="SERUM_SODIUM_CONCENTRATION",length = 8,nullable = true)
     @FhirFieldValidate(name="SERUM_SODIUM_CONCENTRATION",displayName="血钠浓度(mmol/L)",maxLength=8,required=false,valuesRange="")   
     private Float serumSodiumConcentration;
    /**
     *名称:总胆固醇(mmol/L)
     *
 	 *
 	 *
     */
     @Column(name="TOTAL_CHOLESTEROL",length = 8,nullable = true)
     @FhirFieldValidate(name="TOTAL_CHOLESTEROL",displayName="总胆固醇(mmol/L)",maxLength=8,required=false,valuesRange="")   
     private Float totalCholesterol;
    /**
     *名称:甘油三酯(mmol/L)
     *
 	 *
 	 *
     */
     @Column(name="TRIGLYCERIDE",length = 8,nullable = true)
     @FhirFieldValidate(name="TRIGLYCERIDE",displayName="甘油三酯(mmol/L)",maxLength=8,required=false,valuesRange="")   
     private Float triglyceride;
    /**
     *名称:血清低密度酯蛋白胆固醇(mmol/L)
     *
 	 *
 	 *
     */
     @Column(name="SERUM_LOW_DENSITY_LIPOPROTEIN_CHOLESTEROL",length = 8,nullable = true)
     @FhirFieldValidate(name="SERUM_LOW_DENSITY_LIPOPROTEIN_CHOLESTEROL",displayName="血清低密度酯蛋白胆固醇(mmol/L)",maxLength=8,required=false,valuesRange="")   
     private Float serumLowDensityLipoproteinCholesterol;
    /**
     *名称:乙型肝炎表面抗原定性检测结果分类代码
     *
 	 *限制:CV990107
 	 *
     */
     @Column(name="HEPATITIS_B_SURFACE_ANTIGEN",length = 20,nullable = true)
     @FhirFieldValidate(name="HEPATITIS_B_SURFACE_ANTIGEN",displayName="乙型肝炎表面抗原定性检测结果分类代码",maxLength=20,required=false,valuesRange="CV990107")   
     private String hepatitisBSurfaceAntigen;
    /**
     *名称:乙型肝炎表面抗体定性检测结果分类代码
     *
 	 *限制:CV990107
 	 *
     */
     @Column(name="HEPATITIS_B_SURFACE_ANTIBODY",length = 20,nullable = true)
     @FhirFieldValidate(name="HEPATITIS_B_SURFACE_ANTIBODY",displayName="乙型肝炎表面抗体定性检测结果分类代码",maxLength=20,required=false,valuesRange="CV990107")   
     private String hepatitisBSurfaceAntibody;
    /**
     *名称:乙型肝炎e抗原定性检测结果分类代码
     *
 	 *限制:CV990107
 	 *
     */
     @Column(name="HEPATITIS_B_E_ANTIGEN",length = 20,nullable = true)
     @FhirFieldValidate(name="HEPATITIS_B_E_ANTIGEN",displayName="乙型肝炎e抗原定性检测结果分类代码",maxLength=20,required=false,valuesRange="CV990107")   
     private String hepatitisBEAntigen;
    /**
     *名称:乙型肝炎e抗体定性检测结果分类代码
     *
 	 *限制:CV990107
 	 *
     */
     @Column(name="HEPATITIS_B_E_ANTIBODY",length = 20,nullable = true)
     @FhirFieldValidate(name="HEPATITIS_B_E_ANTIBODY",displayName="乙型肝炎e抗体定性检测结果分类代码",maxLength=20,required=false,valuesRange="CV990107")   
     private String hepatitisBEAntibody;
    /**
     *名称:乙型肝炎核心抗体定性检测结果分类代码
     *
 	 *限制:CV990107
 	 *
     */
     @Column(name="HEPATITIS_B_CORE_ANTIBODY",length = 20,nullable = true)
     @FhirFieldValidate(name="HEPATITIS_B_CORE_ANTIBODY",displayName="乙型肝炎核心抗体定性检测结果分类代码",maxLength=20,required=false,valuesRange="CV990107")   
     private String hepatitisBCoreAntibody;
    /**
     *名称:胸部X线检查异常标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="ABNORMAL_CHEST_X_RAY_SIGN",length = 5,nullable = true)
     @FhirFieldValidate(name="ABNORMAL_CHEST_X_RAY_SIGN",displayName="胸部X线检查异常标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean abnormalChestXRaySign;
    /**
     *名称:胸部X线检查异常描述
     *
 	 *
 	 *
     */
     @Column(name="ABNORMAL_CHEST_X_RAY_DESCRIBE",length = 40,nullable = true)
     @FhirFieldValidate(name="ABNORMAL_CHEST_X_RAY_DESCRIBE",displayName="胸部X线检查异常描述",maxLength=40,required=false,valuesRange="")   
     private String abnormalChestXRayDescribe;
    /**
     *名称:心电图异常标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="ECG_ABNORMALITY_SIGN",length = 5,nullable = true)
     @FhirFieldValidate(name="ECG_ABNORMALITY_SIGN",displayName="心电图异常标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ecgAbnormalitySign;
    /**
     *名称:心电图异常描述
     *
 	 *
 	 *
     */
     @Column(name="ECG_ABNORMALITY_DESCRIBE",length = 40,nullable = true)
     @FhirFieldValidate(name="ECG_ABNORMALITY_DESCRIBE",displayName="心电图异常描述",maxLength=40,required=false,valuesRange="")   
     private String ecgAbnormalityDescribe;
    /**
     *名称:B超检查异常标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="ABNORMAL_ULTRASONOGRAPHY_SIGN",length = 5,nullable = true)
     @FhirFieldValidate(name="ABNORMAL_ULTRASONOGRAPHY_SIGN",displayName="B超检查异常标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean abnormalUltrasonographySign;
    /**
     *名称:B超检查异常描述
     *
 	 *
 	 *
     */
     @Column(name="ABNORMAL_ULTRASONOGRAPHY_DESCRIBE",length = 40,nullable = true)
     @FhirFieldValidate(name="ABNORMAL_ULTRASONOGRAPHY_DESCRIBE",displayName="B超检查异常描述",maxLength=40,required=false,valuesRange="")   
     private String abnormalUltrasonographyDescribe;
    /**
     *名称:宫颈涂片异常标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="CERVICAL_SMEAR_ABNORMALITY_SIGN",length = 5,nullable = true)
     @FhirFieldValidate(name="CERVICAL_SMEAR_ABNORMALITY_SIGN",displayName="宫颈涂片异常标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean cervicalSmearAbnormalitySign;
    /**
     *名称:宫颈涂片异常描述
     *
 	 *
 	 *
     */
     @Column(name="CERVICAL_SMEAR_ABNORMALITY_DESCRIBE",length = 40,nullable = true)
     @FhirFieldValidate(name="CERVICAL_SMEAR_ABNORMALITY_DESCRIBE",displayName="宫颈涂片异常描述",maxLength=40,required=false,valuesRange="")   
     private String cervicalSmearAbnormalityDescribe;
    /**
     *名称:家族性疾病名称代码
     *
 	 *限制:CV0210005
 	 *
     */
     @Column(name="FAMILY_DISEASE_NAME_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="FAMILY_DISEASE_NAME_CODE",displayName="家族性疾病名称代码",maxLength=20,required=false,valuesRange="CV0210005")   
     private String familyDiseaseNameCode;
    /**
     *名称:曾住院医疗机构名称
     *
 	 *
 	 *
     */
     @Column(name="REGISTERED_MEDICAL_INSTITUTION_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="REGISTERED_MEDICAL_INSTITUTION_NAME",displayName="曾住院医疗机构名称",maxLength=40,required=false,valuesRange="")   
     private String registeredMedicalInstitutionName;
    /**
     *名称:曾住院病案号
     *
 	 *
 	 *
     */
     @Column(name="INPATIENT_MEDICAL_RECORD_NUMBER",length = 40,nullable = true)
     @FhirFieldValidate(name="INPATIENT_MEDICAL_RECORD_NUMBER",displayName="曾住院病案号",maxLength=40,required=false,valuesRange="")   
     private String inpatientMedicalRecordNumber;
    /**
     *名称:住院原因
     *
 	 *
 	 *
     */
     @Column(name="HOSPITALIZATION_CAUSES",length = 200,nullable = true)
     @FhirFieldValidate(name="HOSPITALIZATION_CAUSES",displayName="住院原因",maxLength=200,required=false,valuesRange="")   
     private String hospitalizationCauses;
    /**
     *名称:曾建立家庭病床医疗机构名称
     *
 	 *
 	 *
     */
     @Column(name="ONCE_ESTABLISH_FAMILY_BED_ORG_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="ONCE_ESTABLISH_FAMILY_BED_ORG_NAME",displayName="曾建立家庭病床医疗机构名称",maxLength=40,required=false,valuesRange="")   
     private String onceEstablishFamilyBedOrgName;
    /**
     *名称:曾建立家庭病床病案号
     *
 	 *
 	 *
     */
     @Column(name="ONCE_ESTABLISH_FAMILY_BED_MEDICAL_RECORD_NUMBER",length = 40,nullable = true)
     @FhirFieldValidate(name="ONCE_ESTABLISH_FAMILY_BED_MEDICAL_RECORD_NUMBER",displayName="曾建立家庭病床病案号",maxLength=40,required=false,valuesRange="")   
     private String onceEstablishFamilyBedMedicalRecordNumber;
    /**
     *名称:家庭病床建立原因
     *
 	 *
 	 *
     */
     @Column(name="ESTABLISH_FAMILY_BEDS_REASON",length = 200,nullable = true)
     @FhirFieldValidate(name="ESTABLISH_FAMILY_BEDS_REASON",displayName="家庭病床建立原因",maxLength=200,required=false,valuesRange="")   
     private String establishFamilyBedsReason;
    /**
     *名称:接种时间
     *
 	 *
 	 *
     */
     @Column(name="INOCULATION_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="INOCULATION_TIME",displayName="接种时间",required=false,valuesRange="")   
     private Date inoculationTime;
    /**
     *名称:免疫剂次
     *
 	 *
 	 *
     */
     @Column(name="IMMUNE_DOSE",length = 8,nullable = true)
     @FhirFieldValidate(name="IMMUNE_DOSE",displayName="免疫剂次",maxLength=8,required=false,valuesRange="")   
     private Float immuneDose;
    /**
     *名称:疫苗编码
     *
 	 *限制:CV0850001
 	 *
     */
     @Column(name="VACCINE_NAME_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="VACCINE_NAME_CODE",displayName="疫苗编码",maxLength=20,required=false,valuesRange="CV0850001")   
     private String vaccineNameCode;
    /**
     *名称:疫苗批次
     *
 	 *
 	 *
     */
     @Column(name="VACCINE_BATCH",length = 40,nullable = true)
     @FhirFieldValidate(name="VACCINE_BATCH",displayName="疫苗批次",maxLength=40,required=false,valuesRange="")   
     private String vaccineBatch;
    /**
     *名称:疫苗的生产厂家
     *
 	 *
 	 *
     */
     @Column(name="VACCINE_MANUFACTURERS",length = 40,nullable = true)
     @FhirFieldValidate(name="VACCINE_MANUFACTURERS",displayName="疫苗的生产厂家",maxLength=40,required=false,valuesRange="")   
     private String vaccineManufacturers;
    /**
     *名称:免疫接种医师
     *
 	 *
 	 *
     */
     @Column(name="VACCINATION_PHYSICIAN",length = 40,nullable = true)
     @FhirFieldValidate(name="VACCINATION_PHYSICIAN",displayName="免疫接种医师",maxLength=40,required=false,valuesRange="")   
     private String vaccinationPhysician;
    /**
     *名称:接种机构师
     *
 	 *
 	 *
     */
     @Column(name="INOCULATION_MECHANISM",length = 40,nullable = true)
     @FhirFieldValidate(name="INOCULATION_MECHANISM",displayName="接种机构师",maxLength=40,required=false,valuesRange="")   
     private String inoculationMechanism;
    /**
     *名称:有危害因素接触职业描述
     *
 	 *
 	 *
     */
     @Column(name="OCCUPATIONAL_EXPOSURE_TO_HAZARDOUS_FACTORS",length = 500,nullable = true)
     @FhirFieldValidate(name="OCCUPATIONAL_EXPOSURE_TO_HAZARDOUS_FACTORS",displayName="有危害因素接触职业描述",maxLength=500,required=false,valuesRange="")   
     private String occupationalExposureToHazardousFactors;
    /**
     *名称:从事有危害因素职业时长(年)
     *
 	 *
 	 *
     */
     @Column(name="ENGAGED_IN_HAZARDOUS_FACTORS",length = 8,nullable = true)
     @FhirFieldValidate(name="ENGAGED_IN_HAZARDOUS_FACTORS",displayName="从事有危害因素职业时长(年)",maxLength=8,required=false,valuesRange="")   
     private Float engagedInHazardousFactors;
    /**
     *名称:职业病危害因素类别代码
     *
 	 *限制:CV0300203
 	 *
     */
     @Column(name="OCCUPATIONAL_HAZARD_FACTORS_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="OCCUPATIONAL_HAZARD_FACTORS_CODE",displayName="职业病危害因素类别代码",maxLength=20,required=false,valuesRange="CV0300203")   
     private String occupationalHazardFactorsCode;
    /**
     *名称:职业暴露危险因素名称
     *
 	 *
 	 *
     */
     @Column(name="OCCUPATIONAL_EXPOSURE_RISK_FACTORS_NAME",length = 200,nullable = true)
     @FhirFieldValidate(name="OCCUPATIONAL_EXPOSURE_RISK_FACTORS_NAME",displayName="职业暴露危险因素名称",maxLength=200,required=false,valuesRange="")   
     private String occupationalExposureRiskFactorsName;
    /**
     *名称:职业防护措施标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="OCCUPATIONAL_PROTECTION_MEASURES",length = 5,nullable = true)
     @FhirFieldValidate(name="OCCUPATIONAL_PROTECTION_MEASURES",displayName="职业防护措施标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean occupationalProtectionMeasures;
    /**
     *名称:身体活动频率代码
     *
 	 *限制:CV0300111
 	 *
     */
     @Column(name="PHYSICAL_ACTIVITY_FREQUENCY_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="PHYSICAL_ACTIVITY_FREQUENCY_CODE",displayName="身体活动频率代码",maxLength=20,required=false,valuesRange="CV0300111")   
     private String physicalActivityFrequencyCode;
    /**
     *名称:每次锻炼时间（min）
     *
 	 *
 	 *
     */
     @Column(name="EACH_EXERCISE_TIME",length = 8,nullable = true)
     @FhirFieldValidate(name="EACH_EXERCISE_TIME",displayName="每次锻炼时间（min）",maxLength=8,required=false,valuesRange="")   
     private Float eachExerciseTime;
    /**
     *名称:坚持锻炼时间（年）
     *
 	 *
 	 *
     */
     @Column(name="ADHERE_TO_EXERCISE_TIME",length = 8,nullable = true)
     @FhirFieldValidate(name="ADHERE_TO_EXERCISE_TIME",displayName="坚持锻炼时间（年）",maxLength=8,required=false,valuesRange="")   
     private Float adhereToExerciseTime;
    /**
     *名称:锻炼方式
     *
 	 *
 	 *
     */
     @Column(name="EXERCISE_MODE",length = 200,nullable = true)
     @FhirFieldValidate(name="EXERCISE_MODE",displayName="锻炼方式",maxLength=200,required=false,valuesRange="")   
     private String exerciseMode;
    /**
     *名称:饮食习惯代码
     *
 	 *限制:CV0300107
 	 *
     */
     @Column(name="DIET_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="DIET_CODE",displayName="饮食习惯代码",maxLength=20,required=false,valuesRange="CV0300107")   
     private String dietCode;
    /**
     *名称:吸烟状况
     *
 	 *
 	 *
     */
     @Column(name="SMOKING_STATUS",length = 200,nullable = true)
     @FhirFieldValidate(name="SMOKING_STATUS",displayName="吸烟状况",maxLength=200,required=false,valuesRange="")   
     private String smokingStatus;
    /**
     *名称:日吸烟量
     *
 	 *
 	 *
     */
     @Column(name="DAY_SMOKING_AMOUNT",length = 8,nullable = true)
     @FhirFieldValidate(name="DAY_SMOKING_AMOUNT",displayName="日吸烟量",maxLength=8,required=false,valuesRange="")   
     private Float daySmokingAmount;
    /**
     *名称:开始吸烟年龄（岁）
     *
 	 *
 	 *
     */
     @Column(name="START_SMOKING_AGE",length = 8,nullable = true)
     @FhirFieldValidate(name="START_SMOKING_AGE",displayName="开始吸烟年龄（岁）",maxLength=8,required=false,valuesRange="")   
     private Float startSmokingAge;
    /**
     *名称:戒烟年龄（岁）
     *
 	 *
 	 *
     */
     @Column(name="SMOKING_CESSATION_AGE",length = 8,nullable = true)
     @FhirFieldValidate(name="SMOKING_CESSATION_AGE",displayName="戒烟年龄（岁）",maxLength=8,required=false,valuesRange="")   
     private Float smokingCessationAge;
    /**
     *名称:饮酒频率代码
     *
 	 *限制:CV0300104
 	 *
     */
     @Column(name="DRINKING_FREQUENCY",length = 20,nullable = true)
     @FhirFieldValidate(name="DRINKING_FREQUENCY",displayName="饮酒频率代码",maxLength=20,required=false,valuesRange="CV0300104")   
     private String drinkingFrequency;
    /**
     *名称:日饮酒量（mL）
     *
 	 *
 	 *
     */
     @Column(name="DRINKING_PER_DAY",length = 8,nullable = true)
     @FhirFieldValidate(name="DRINKING_PER_DAY",displayName="日饮酒量（mL）",maxLength=8,required=false,valuesRange="")   
     private Float drinkingPerDay;
    /**
     *名称:饮酒标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_DRINKING",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_DRINKING",displayName="饮酒标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifDrinking;
    /**
     *名称:戒酒年龄（岁）
     *
 	 *
 	 *
     */
     @Column(name="ABSTINENCE_AGE",length = 8,nullable = true)
     @FhirFieldValidate(name="ABSTINENCE_AGE",displayName="戒酒年龄（岁）",maxLength=8,required=false,valuesRange="")   
     private Float abstinenceAge;
    /**
     *名称:开始饮酒年龄（岁）
     *
 	 *
 	 *
     */
     @Column(name="DRINKING_AGE",length = 8,nullable = true)
     @FhirFieldValidate(name="DRINKING_AGE",displayName="开始饮酒年龄（岁）",maxLength=8,required=false,valuesRange="")   
     private Float drinkingAge;
    /**
     *名称:戒酒标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="ABSTINENCE_SIGN",length = 5,nullable = true)
     @FhirFieldValidate(name="ABSTINENCE_SIGN",displayName="戒酒标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean abstinenceSign;
    /**
     *名称:饮酒种类代码
     *
 	 *限制:CV0300105
 	 *
     */
     @Column(name="DRINKING_TYPE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="DRINKING_TYPE_CODE",displayName="饮酒种类代码",maxLength=20,required=false,valuesRange="CV0300105")   
     private String drinkingTypeCode;
    /**
     *名称:老年人健康状态自我评估代码
     *
 	 *限制:CV0401013
 	 *
     */
     @Column(name="ELDERLY_HEALTH_STATUS_ASSESSMENT_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="ELDERLY_HEALTH_STATUS_ASSESSMENT_CODE",displayName="老年人健康状态自我评估代码",maxLength=20,required=false,valuesRange="CV0401013")   
     private String elderlyHealthStatusAssessmentCode;
    /**
     *名称:老年人生活自理能力自我评估代码
     *
 	 *限制:CV0401014
 	 *
     */
     @Column(name="ELDERLY_SELF_ASSESSMENT_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="ELDERLY_SELF_ASSESSMENT_CODE",displayName="老年人生活自理能力自我评估代码",maxLength=20,required=false,valuesRange="CV0401014")   
     private String elderlySelfAssessmentCode;
    /**
     *名称:认知状态粗筛结果分类代码
     *
 	 *限制:CV9900010
 	 *
     */
     @Column(name="SCREENING_COGNITIVE_STATE_CLASSIFICATION_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="SCREENING_COGNITIVE_STATE_CLASSIFICATION_CODE",displayName="认知状态粗筛结果分类代码",maxLength=20,required=false,valuesRange="CV9900010")   
     private String screeningCognitiveStateClassificationCode;
    /**
     *名称:老年人认知功能评分
     *
 	 *
 	 *
     */
     @Column(name="COGNITIVE_FUNCTION_SCORE",length = 8,nullable = true)
     @FhirFieldValidate(name="COGNITIVE_FUNCTION_SCORE",displayName="老年人认知功能评分",maxLength=8,required=false,valuesRange="")   
     private Float cognitiveFunctionScore;
    /**
     *名称:情感状态粗筛结果代码
     *
 	 *限制:CV9900010
 	 *
     */
     @Column(name="THE_EMOTIONAL_STATE_OF_COARSE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="THE_EMOTIONAL_STATE_OF_COARSE_CODE",displayName="情感状态粗筛结果代码",maxLength=20,required=false,valuesRange="CV9900010")   
     private String theEmotionalStateOfCoarseCode;
    /**
     *名称:老年人抑郁评分
     *
 	 *
 	 *
     */
     @Column(name="GERIATRIC_DEPRESSION_SCORE",length = 8,nullable = true)
     @FhirFieldValidate(name="GERIATRIC_DEPRESSION_SCORE",displayName="老年人抑郁评分",maxLength=8,required=false,valuesRange="")   
     private Float geriatricDepressionScore;
    /**
     *名称:健康评价异常标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="HEALTH_EVALUATION_ABNORMAL_SIGNS",length = 5,nullable = true)
     @FhirFieldValidate(name="HEALTH_EVALUATION_ABNORMAL_SIGNS",displayName="健康评价异常标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean healthEvaluationAbnormalSigns;
    /**
     *名称:健康评价异常描述
     *
 	 *
 	 *
     */
     @Column(name="HEALTH_EVALUATION_EXCEPTION_DESCRIPTION",length = 40,nullable = true)
     @FhirFieldValidate(name="HEALTH_EVALUATION_EXCEPTION_DESCRIPTION",displayName="健康评价异常描述",maxLength=40,required=false,valuesRange="")   
     private String healthEvaluationExceptionDescription;
    /**
     *名称:健康指导代码
     *
 	 *限制:CV9900017
 	 *
     */
     @Column(name="HEALTH_INSTRUCTION_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="HEALTH_INSTRUCTION_CODE",displayName="健康指导代码",maxLength=20,required=false,valuesRange="CV9900017")   
     private String healthInstructionCode;
    /**
     *名称:危险因素控制建议代码
     *
 	 *限制:CV0600218
 	 *
     */
     @Column(name="RISK_FACTOR_CONTROL_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="RISK_FACTOR_CONTROL_CODE",displayName="危险因素控制建议代码",maxLength=20,required=false,valuesRange="CV0600218")   
     private String riskFactorControlCode;
    /**
     *名称:诊断编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="DIAGNOSIS",length = 20,nullable = true)
     @FhirFieldValidate(name="DIAGNOSIS",displayName="诊断编码",maxLength=20,required=false,valuesRange="CV990111")   
     private String diagnosis;
    /**
     *名称:诊断编码名称
     *
 	 *
 	 *
     */
     @Column(name="DIAGNOSIS_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="DIAGNOSIS_NAME",displayName="诊断编码名称",maxLength=40,required=false,valuesRange="")   
     private String diagnosisName;
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
     *名称:中医体质分类代码
     *
 	 *限制:CV0501005
 	 *
     */
     @Column(name="TCM_CONSTITUTION_CLASSIFICATION_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="TCM_CONSTITUTION_CLASSIFICATION_CODE",displayName="中医体质分类代码",maxLength=20,required=false,valuesRange="CV0501005")   
     private String tcmConstitutionClassificationCode;
    /**
     *名称:中医体质分类判定结果代码
     *
 	 *限制:CV9900018
 	 *
     */
     @Column(name="TCM_CONSTITUTION_CLASSIFICATION_RESULT_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="TCM_CONSTITUTION_CLASSIFICATION_RESULT_CODE",displayName="中医体质分类判定结果代码",maxLength=20,required=false,valuesRange="CV9900018")   
     private String tcmConstitutionClassificationResultCode;
    /**
     *名称:频率代码
     *
 	 *限制:CV9900341
 	 *
     */
     @Column(name="FREQ_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="FREQ_CODE",displayName="频率代码",maxLength=20,required=false,valuesRange="CV9900341")   
     private String freqCode;
    /**
     *名称:服药依从性代码
     *
 	 *限制:CV9900004
 	 *
     */
     @Column(name="MEDICATION_COMPLIANCE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="MEDICATION_COMPLIANCE_CODE",displayName="服药依从性代码",maxLength=20,required=false,valuesRange="CV9900004")   
     private String medicationComplianceCode;
    /**
     *名称:院内药物编码
     *
 	 *
 	 *
     */
     @Column(name="MEDICATION_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="MEDICATION_CD",displayName="院内药物编码",maxLength=20,required=false,valuesRange="")   
     private String medicationCd;
    /**
     *名称:院内药物名称
     *
 	 *
 	 *
     */
     @Column(name="MEDICATION_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="MEDICATION_NAME",displayName="院内药物名称",maxLength=40,required=false,valuesRange="")   
     private String medicationName;
    /**
     *名称:药物剂型代码
     *
 	 *
 	 *
     */
     @Column(name="DRUG_DOSAGE_FORMS",length = 20,nullable = true)
     @FhirFieldValidate(name="DRUG_DOSAGE_FORMS",displayName="药物剂型代码",maxLength=20,required=false,valuesRange="")   
     private String drugDosageForms;
    /**
     *名称:药物剂型名称
     *
 	 *
 	 *
     */
     @Column(name="DRUG_DOSAGE_FORMS_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="DRUG_DOSAGE_FORMS_NAME",displayName="药物剂型名称",maxLength=40,required=false,valuesRange="")   
     private String drugDosageFormsName;
    /**
     *名称:医嘱开始时间
     *
 	 *
 	 *
     */
     @Column(name="START",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="START",displayName="医嘱开始时间",required=false,valuesRange="")   
     private Date start;
    /**
     *名称:执行天数
     *
 	 *
 	 *
     */
     @Column(name="DURATION",length = 8,nullable = true)
     @FhirFieldValidate(name="DURATION",displayName="执行天数",maxLength=8,required=false,valuesRange="")   
     private Float duration;
    /**
     *名称:用药途径代码
     *
 	 *限制:CV0600102
 	 *
     */
     @Column(name="DOSAGE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="DOSAGE_CODE",displayName="用药途径代码",maxLength=20,required=false,valuesRange="CV0600102")   
     private String dosageCode;
    /**
     *名称:特殊用法代码
     *
 	 *限制:CV9900285
 	 *
     */
     @Column(name="C_MED_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="C_MED_CODE",displayName="特殊用法代码",maxLength=20,required=false,valuesRange="CV9900285")   
     private String cMedCode;
    /**
     *名称:用药次剂量
     *
 	 *
 	 *
     */
     @Column(name="ONCE_VALUE",length = 8,nullable = true)
     @FhirFieldValidate(name="ONCE_VALUE",displayName="用药次剂量",maxLength=8,required=false,valuesRange="")   
     private Float onceValue;
    /**
     *名称:用药次剂量单位
     *
 	 *
 	 *
     */
     @Column(name="ONCE_UNIT",length = 20,nullable = true)
     @FhirFieldValidate(name="ONCE_UNIT",displayName="用药次剂量单位",maxLength=20,required=false,valuesRange="")   
     private String onceUnit;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getAdultHealthExaminationId(){
       	return this.adultHealthExaminationId;
     }
     public void setAdultHealthExaminationId(String adultHealthExaminationId){
       	this.adultHealthExaminationId=adultHealthExaminationId;
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
     public String getPhone(){
       	return this.phone;
     }
     public void setPhone(String phone){
       	this.phone=phone;
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
     public String getSymptomDescription(){
       	return this.symptomDescription;
     }
     public void setSymptomDescription(String symptomDescription){
       	this.symptomDescription=symptomDescription;
     }
     public String getSymptomCd(){
       	return this.symptomCd;
     }
     public void setSymptomCd(String symptomCd){
       	this.symptomCd=symptomCd;
     }
     public String getSymptomName(){
       	return this.symptomName;
     }
     public void setSymptomName(String symptomName){
       	this.symptomName=symptomName;
     }
     public Date getAdmissionDiagnosisDate(){
       	return this.admissionDiagnosisDate;
     }
     public void setAdmissionDiagnosisDate(Date admissionDiagnosisDate){
       	this.admissionDiagnosisDate=admissionDiagnosisDate;
     }
     public Float getBodyTemperature(){
       	return this.bodyTemperature;
     }
     public void setBodyTemperature(Float bodyTemperature){
       	this.bodyTemperature=bodyTemperature;
     }
     public Float getPulses(){
       	return this.pulses;
     }
     public void setPulses(Float pulses){
       	this.pulses=pulses;
     }
     public Float getBreathingRate(){
       	return this.breathingRate;
     }
     public void setBreathingRate(Float breathingRate){
       	this.breathingRate=breathingRate;
     }
     public Float getLeftSystolicPressure(){
       	return this.leftSystolicPressure;
     }
     public void setLeftSystolicPressure(Float leftSystolicPressure){
       	this.leftSystolicPressure=leftSystolicPressure;
     }
     public Float getLeftDiastolicPressure(){
       	return this.leftDiastolicPressure;
     }
     public void setLeftDiastolicPressure(Float leftDiastolicPressure){
       	this.leftDiastolicPressure=leftDiastolicPressure;
     }
     public Float getRightSystolicPressure(){
       	return this.rightSystolicPressure;
     }
     public void setRightSystolicPressure(Float rightSystolicPressure){
       	this.rightSystolicPressure=rightSystolicPressure;
     }
     public Float getRightDiastolicPressure(){
       	return this.rightDiastolicPressure;
     }
     public void setRightDiastolicPressure(Float rightDiastolicPressure){
       	this.rightDiastolicPressure=rightDiastolicPressure;
     }
     public Float getPrenatalHeight(){
       	return this.prenatalHeight;
     }
     public void setPrenatalHeight(Float prenatalHeight){
       	this.prenatalHeight=prenatalHeight;
     }
     public Float getWeight(){
       	return this.weight;
     }
     public void setWeight(Float weight){
       	this.weight=weight;
     }
     public Float getWaist(){
       	return this.waist;
     }
     public void setWaist(Float waist){
       	this.waist=waist;
     }
     public String getBodyMassIndex(){
       	return this.bodyMassIndex;
     }
     public void setBodyMassIndex(String bodyMassIndex){
       	this.bodyMassIndex=bodyMassIndex;
     }
     public Float getHeartRate(){
       	return this.heartRate;
     }
     public void setHeartRate(Float heartRate){
       	this.heartRate=heartRate;
     }
     public String getLipAppearanceCode(){
       	return this.lipAppearanceCode;
     }
     public void setLipAppearanceCode(String lipAppearanceCode){
       	this.lipAppearanceCode=lipAppearanceCode;
     }
     public String getDentitionClassCode(){
       	return this.dentitionClassCode;
     }
     public void setDentitionClassCode(String dentitionClassCode){
       	this.dentitionClassCode=dentitionClassCode;
     }
     public String getDentitionDescription(){
       	return this.dentitionDescription;
     }
     public void setDentitionDescription(String dentitionDescription){
       	this.dentitionDescription=dentitionDescription;
     }
     public String getPharyngealExaminationResultCode(){
       	return this.pharyngealExaminationResultCode;
     }
     public void setPharyngealExaminationResultCode(String pharyngealExaminationResultCode){
       	this.pharyngealExaminationResultCode=pharyngealExaminationResultCode;
     }
     public Float getFarVisualAcuity(){
       	return this.farVisualAcuity;
     }
     public void setFarVisualAcuity(Float farVisualAcuity){
       	this.farVisualAcuity=farVisualAcuity;
     }
     public Float getLeftCorrectedVisualAcuity(){
       	return this.leftCorrectedVisualAcuity;
     }
     public void setLeftCorrectedVisualAcuity(Float leftCorrectedVisualAcuity){
       	this.leftCorrectedVisualAcuity=leftCorrectedVisualAcuity;
     }
     public Float getRightCorrectedVisualAcuity(){
       	return this.rightCorrectedVisualAcuity;
     }
     public void setRightCorrectedVisualAcuity(Float rightCorrectedVisualAcuity){
       	this.rightCorrectedVisualAcuity=rightCorrectedVisualAcuity;
     }
     public Boolean getFundusExaminationResultsAbnormalMark(){
       	return this.fundusExaminationResultsAbnormalMark;
     }
     public void setFundusExaminationResultsAbnormalMark(Boolean fundusExaminationResultsAbnormalMark){
       	this.fundusExaminationResultsAbnormalMark=fundusExaminationResultsAbnormalMark;
     }
     public String getFundusExaminationResultsAbnormalDescribe(){
       	return this.fundusExaminationResultsAbnormalDescribe;
     }
     public void setFundusExaminationResultsAbnormalDescribe(String fundusExaminationResultsAbnormalDescribe){
       	this.fundusExaminationResultsAbnormalDescribe=fundusExaminationResultsAbnormalDescribe;
     }
     public String getScleralExaminationResultCode(){
       	return this.scleralExaminationResultCode;
     }
     public void setScleralExaminationResultCode(String scleralExaminationResultCode){
       	this.scleralExaminationResultCode=scleralExaminationResultCode;
     }
     public String getHearingTestResultCode(){
       	return this.hearingTestResultCode;
     }
     public void setHearingTestResultCode(String hearingTestResultCode){
       	this.hearingTestResultCode=hearingTestResultCode;
     }
     public Boolean getAbdominalTendernessSign(){
       	return this.abdominalTendernessSign;
     }
     public void setAbdominalTendernessSign(Boolean abdominalTendernessSign){
       	this.abdominalTendernessSign=abdominalTendernessSign;
     }
     public String getAbdominalTendernessDescribe(){
       	return this.abdominalTendernessDescribe;
     }
     public void setAbdominalTendernessDescribe(String abdominalTendernessDescribe){
       	this.abdominalTendernessDescribe=abdominalTendernessDescribe;
     }
     public Boolean getAbdominalMassSign(){
       	return this.abdominalMassSign;
     }
     public void setAbdominalMassSign(Boolean abdominalMassSign){
       	this.abdominalMassSign=abdominalMassSign;
     }
     public String getAbdominalMassDescribe(){
       	return this.abdominalMassDescribe;
     }
     public void setAbdominalMassDescribe(String abdominalMassDescribe){
       	this.abdominalMassDescribe=abdominalMassDescribe;
     }
     public Boolean getLiverSign(){
       	return this.liverSign;
     }
     public void setLiverSign(Boolean liverSign){
       	this.liverSign=liverSign;
     }
     public String getLiverDescribe(){
       	return this.liverDescribe;
     }
     public void setLiverDescribe(String liverDescribe){
       	this.liverDescribe=liverDescribe;
     }
     public Boolean getSplenomegalySign(){
       	return this.splenomegalySign;
     }
     public void setSplenomegalySign(Boolean splenomegalySign){
       	this.splenomegalySign=splenomegalySign;
     }
     public String getSplenomegalyDescribe(){
       	return this.splenomegalyDescribe;
     }
     public void setSplenomegalyDescribe(String splenomegalyDescribe){
       	this.splenomegalyDescribe=splenomegalyDescribe;
     }
     public Boolean getAbdominalShiftingDullnessSign(){
       	return this.abdominalShiftingDullnessSign;
     }
     public void setAbdominalShiftingDullnessSign(Boolean abdominalShiftingDullnessSign){
       	this.abdominalShiftingDullnessSign=abdominalShiftingDullnessSign;
     }
     public String getAbdominalShiftingDullnessDescribe(){
       	return this.abdominalShiftingDullnessDescribe;
     }
     public void setAbdominalShiftingDullnessDescribe(String abdominalShiftingDullnessDescribe){
       	this.abdominalShiftingDullnessDescribe=abdominalShiftingDullnessDescribe;
     }
     public String getMotionFunctionStatusCode(){
       	return this.motionFunctionStatusCode;
     }
     public void setMotionFunctionStatusCode(String motionFunctionStatusCode){
       	this.motionFunctionStatusCode=motionFunctionStatusCode;
     }
     public String getHeartTypeCode(){
       	return this.heartTypeCode;
     }
     public void setHeartTypeCode(String heartTypeCode){
       	this.heartTypeCode=heartTypeCode;
     }
     public Boolean getCardiacMurmurSign(){
       	return this.cardiacMurmurSign;
     }
     public void setCardiacMurmurSign(Boolean cardiacMurmurSign){
       	this.cardiacMurmurSign=cardiacMurmurSign;
     }
     public String getCardiacMurmurDescribe(){
       	return this.cardiacMurmurDescribe;
     }
     public void setCardiacMurmurDescribe(String cardiacMurmurDescribe){
       	this.cardiacMurmurDescribe=cardiacMurmurDescribe;
     }
     public String getDorsalisPedisPulseCode(){
       	return this.dorsalisPedisPulseCode;
     }
     public void setDorsalisPedisPulseCode(String dorsalisPedisPulseCode){
       	this.dorsalisPedisPulseCode=dorsalisPedisPulseCode;
     }
     public Boolean getLungAbnormalBreathSoundsSign(){
       	return this.lungAbnormalBreathSoundsSign;
     }
     public void setLungAbnormalBreathSoundsSign(Boolean lungAbnormalBreathSoundsSign){
       	this.lungAbnormalBreathSoundsSign=lungAbnormalBreathSoundsSign;
     }
     public String getLungAbnormalBreathSoundsDescribe(){
       	return this.lungAbnormalBreathSoundsDescribe;
     }
     public void setLungAbnormalBreathSoundsDescribe(String lungAbnormalBreathSoundsDescribe){
       	this.lungAbnormalBreathSoundsDescribe=lungAbnormalBreathSoundsDescribe;
     }
     public Boolean getLungRaleSign(){
       	return this.lungRaleSign;
     }
     public void setLungRaleSign(Boolean lungRaleSign){
       	this.lungRaleSign=lungRaleSign;
     }
     public String getLungRaleDescribe(){
       	return this.lungRaleDescribe;
     }
     public void setLungRaleDescribe(String lungRaleDescribe){
       	this.lungRaleDescribe=lungRaleDescribe;
     }
     public Boolean getBarrelChestSign(){
       	return this.barrelChestSign;
     }
     public void setBarrelChestSign(Boolean barrelChestSign){
       	this.barrelChestSign=barrelChestSign;
     }
     public String getSkinTestResultCode(){
       	return this.skinTestResultCode;
     }
     public void setSkinTestResultCode(String skinTestResultCode){
       	this.skinTestResultCode=skinTestResultCode;
     }
     public String getLymphNodeExaminationResultCode(){
       	return this.lymphNodeExaminationResultCode;
     }
     public void setLymphNodeExaminationResultCode(String lymphNodeExaminationResultCode){
       	this.lymphNodeExaminationResultCode=lymphNodeExaminationResultCode;
     }
     public String getLowerExtremityEdemaTestResultCode(){
       	return this.lowerExtremityEdemaTestResultCode;
     }
     public void setLowerExtremityEdemaTestResultCode(String lowerExtremityEdemaTestResultCode){
       	this.lowerExtremityEdemaTestResultCode=lowerExtremityEdemaTestResultCode;
     }
     public String getAnalExaminationResultsCode(){
       	return this.analExaminationResultsCode;
     }
     public void setAnalExaminationResultsCode(String analExaminationResultsCode){
       	this.analExaminationResultsCode=analExaminationResultsCode;
     }
     public String getBreastExaminationResultsCode(){
       	return this.breastExaminationResultsCode;
     }
     public void setBreastExaminationResultsCode(String breastExaminationResultsCode){
       	this.breastExaminationResultsCode=breastExaminationResultsCode;
     }
     public Boolean getVulvaAbnormalitySign(){
       	return this.vulvaAbnormalitySign;
     }
     public void setVulvaAbnormalitySign(Boolean vulvaAbnormalitySign){
       	this.vulvaAbnormalitySign=vulvaAbnormalitySign;
     }
     public String getVulvaAbnormalityDescribe(){
       	return this.vulvaAbnormalityDescribe;
     }
     public void setVulvaAbnormalityDescribe(String vulvaAbnormalityDescribe){
       	this.vulvaAbnormalityDescribe=vulvaAbnormalityDescribe;
     }
     public Boolean getAbnormalVaginaSign(){
       	return this.abnormalVaginaSign;
     }
     public void setAbnormalVaginaSign(Boolean abnormalVaginaSign){
       	this.abnormalVaginaSign=abnormalVaginaSign;
     }
     public String getAbnormalVaginaDescribe(){
       	return this.abnormalVaginaDescribe;
     }
     public void setAbnormalVaginaDescribe(String abnormalVaginaDescribe){
       	this.abnormalVaginaDescribe=abnormalVaginaDescribe;
     }
     public Boolean getCervicalAbnormalitySign(){
       	return this.cervicalAbnormalitySign;
     }
     public void setCervicalAbnormalitySign(Boolean cervicalAbnormalitySign){
       	this.cervicalAbnormalitySign=cervicalAbnormalitySign;
     }
     public String getCervicalAbnormalityDescribe(){
       	return this.cervicalAbnormalityDescribe;
     }
     public void setCervicalAbnormalityDescribe(String cervicalAbnormalityDescribe){
       	this.cervicalAbnormalityDescribe=cervicalAbnormalityDescribe;
     }
     public Boolean getUterineBodyAbnormalSign(){
       	return this.uterineBodyAbnormalSign;
     }
     public void setUterineBodyAbnormalSign(Boolean uterineBodyAbnormalSign){
       	this.uterineBodyAbnormalSign=uterineBodyAbnormalSign;
     }
     public String getUterineBodyAbnormalDescribe(){
       	return this.uterineBodyAbnormalDescribe;
     }
     public void setUterineBodyAbnormalDescribe(String uterineBodyAbnormalDescribe){
       	this.uterineBodyAbnormalDescribe=uterineBodyAbnormalDescribe;
     }
     public Boolean getEnclosureAbnormalSign(){
       	return this.enclosureAbnormalSign;
     }
     public void setEnclosureAbnormalSign(Boolean enclosureAbnormalSign){
       	this.enclosureAbnormalSign=enclosureAbnormalSign;
     }
     public String getEnclosureAbnormalDescribe(){
       	return this.enclosureAbnormalDescribe;
     }
     public void setEnclosureAbnormalDescribe(String enclosureAbnormalDescribe){
       	this.enclosureAbnormalDescribe=enclosureAbnormalDescribe;
     }
     public Float getHemoglobin(){
       	return this.hemoglobin;
     }
     public void setHemoglobin(Float hemoglobin){
       	this.hemoglobin=hemoglobin;
     }
     public Float getWhiteBloodCell(){
       	return this.whiteBloodCell;
     }
     public void setWhiteBloodCell(Float whiteBloodCell){
       	this.whiteBloodCell=whiteBloodCell;
     }
     public Float getPlatelet(){
       	return this.platelet;
     }
     public void setPlatelet(Float platelet){
       	this.platelet=platelet;
     }
     public String getUrineProteinQualitativeTestResultCode(){
       	return this.urineProteinQualitativeTestResultCode;
     }
     public void setUrineProteinQualitativeTestResultCode(String urineProteinQualitativeTestResultCode){
       	this.urineProteinQualitativeTestResultCode=urineProteinQualitativeTestResultCode;
     }
     public String getNiaotangQualitativeTestResultCode(){
       	return this.niaotangQualitativeTestResultCode;
     }
     public void setNiaotangQualitativeTestResultCode(String niaotangQualitativeTestResultCode){
       	this.niaotangQualitativeTestResultCode=niaotangQualitativeTestResultCode;
     }
     public String getUrineKetoneQualitativeTestResultCode(){
       	return this.urineKetoneQualitativeTestResultCode;
     }
     public void setUrineKetoneQualitativeTestResultCode(String urineKetoneQualitativeTestResultCode){
       	this.urineKetoneQualitativeTestResultCode=urineKetoneQualitativeTestResultCode;
     }
     public String getBldQualitativeTestResultCode(){
       	return this.bldQualitativeTestResultCode;
     }
     public void setBldQualitativeTestResultCode(String bldQualitativeTestResultCode){
       	this.bldQualitativeTestResultCode=bldQualitativeTestResultCode;
     }
     public Float getBloodSugar(){
       	return this.bloodSugar;
     }
     public void setBloodSugar(Float bloodSugar){
       	this.bloodSugar=bloodSugar;
     }
     public Float getUrineMicroalbumin(){
       	return this.urineMicroalbumin;
     }
     public void setUrineMicroalbumin(Float urineMicroalbumin){
       	this.urineMicroalbumin=urineMicroalbumin;
     }
     public Float getFecalOccultBlood(){
       	return this.fecalOccultBlood;
     }
     public void setFecalOccultBlood(Float fecalOccultBlood){
       	this.fecalOccultBlood=fecalOccultBlood;
     }
     public Float getGlycosylatedHemoglobin(){
       	return this.glycosylatedHemoglobin;
     }
     public void setGlycosylatedHemoglobin(Float glycosylatedHemoglobin){
       	this.glycosylatedHemoglobin=glycosylatedHemoglobin;
     }
     public Float getSerumAlanineAminotransferase(){
       	return this.serumAlanineAminotransferase;
     }
     public void setSerumAlanineAminotransferase(Float serumAlanineAminotransferase){
       	this.serumAlanineAminotransferase=serumAlanineAminotransferase;
     }
     public Float getSerumAspartateAminotransferase(){
       	return this.serumAspartateAminotransferase;
     }
     public void setSerumAspartateAminotransferase(Float serumAspartateAminotransferase){
       	this.serumAspartateAminotransferase=serumAspartateAminotransferase;
     }
     public Float getAlbumin(){
       	return this.albumin;
     }
     public void setAlbumin(Float albumin){
       	this.albumin=albumin;
     }
     public Float getTotalBilirubin(){
       	return this.totalBilirubin;
     }
     public void setTotalBilirubin(Float totalBilirubin){
       	this.totalBilirubin=totalBilirubin;
     }
     public Float getConjugatedBilirubin(){
       	return this.conjugatedBilirubin;
     }
     public void setConjugatedBilirubin(Float conjugatedBilirubin){
       	this.conjugatedBilirubin=conjugatedBilirubin;
     }
     public Float getScr(){
       	return this.scr;
     }
     public void setScr(Float scr){
       	this.scr=scr;
     }
     public Float getBloodUreaNitrogen(){
       	return this.bloodUreaNitrogen;
     }
     public void setBloodUreaNitrogen(Float bloodUreaNitrogen){
       	this.bloodUreaNitrogen=bloodUreaNitrogen;
     }
     public Float getBloodPotassiumConcentration(){
       	return this.bloodPotassiumConcentration;
     }
     public void setBloodPotassiumConcentration(Float bloodPotassiumConcentration){
       	this.bloodPotassiumConcentration=bloodPotassiumConcentration;
     }
     public Float getSerumSodiumConcentration(){
       	return this.serumSodiumConcentration;
     }
     public void setSerumSodiumConcentration(Float serumSodiumConcentration){
       	this.serumSodiumConcentration=serumSodiumConcentration;
     }
     public Float getTotalCholesterol(){
       	return this.totalCholesterol;
     }
     public void setTotalCholesterol(Float totalCholesterol){
       	this.totalCholesterol=totalCholesterol;
     }
     public Float getTriglyceride(){
       	return this.triglyceride;
     }
     public void setTriglyceride(Float triglyceride){
       	this.triglyceride=triglyceride;
     }
     public Float getSerumLowDensityLipoproteinCholesterol(){
       	return this.serumLowDensityLipoproteinCholesterol;
     }
     public void setSerumLowDensityLipoproteinCholesterol(Float serumLowDensityLipoproteinCholesterol){
       	this.serumLowDensityLipoproteinCholesterol=serumLowDensityLipoproteinCholesterol;
     }
     public String getHepatitisBSurfaceAntigen(){
       	return this.hepatitisBSurfaceAntigen;
     }
     public void setHepatitisBSurfaceAntigen(String hepatitisBSurfaceAntigen){
       	this.hepatitisBSurfaceAntigen=hepatitisBSurfaceAntigen;
     }
     public String getHepatitisBSurfaceAntibody(){
       	return this.hepatitisBSurfaceAntibody;
     }
     public void setHepatitisBSurfaceAntibody(String hepatitisBSurfaceAntibody){
       	this.hepatitisBSurfaceAntibody=hepatitisBSurfaceAntibody;
     }
     public String getHepatitisBEAntigen(){
       	return this.hepatitisBEAntigen;
     }
     public void setHepatitisBEAntigen(String hepatitisBEAntigen){
       	this.hepatitisBEAntigen=hepatitisBEAntigen;
     }
     public String getHepatitisBEAntibody(){
       	return this.hepatitisBEAntibody;
     }
     public void setHepatitisBEAntibody(String hepatitisBEAntibody){
       	this.hepatitisBEAntibody=hepatitisBEAntibody;
     }
     public String getHepatitisBCoreAntibody(){
       	return this.hepatitisBCoreAntibody;
     }
     public void setHepatitisBCoreAntibody(String hepatitisBCoreAntibody){
       	this.hepatitisBCoreAntibody=hepatitisBCoreAntibody;
     }
     public Boolean getAbnormalChestXRaySign(){
       	return this.abnormalChestXRaySign;
     }
     public void setAbnormalChestXRaySign(Boolean abnormalChestXRaySign){
       	this.abnormalChestXRaySign=abnormalChestXRaySign;
     }
     public String getAbnormalChestXRayDescribe(){
       	return this.abnormalChestXRayDescribe;
     }
     public void setAbnormalChestXRayDescribe(String abnormalChestXRayDescribe){
       	this.abnormalChestXRayDescribe=abnormalChestXRayDescribe;
     }
     public Boolean getEcgAbnormalitySign(){
       	return this.ecgAbnormalitySign;
     }
     public void setEcgAbnormalitySign(Boolean ecgAbnormalitySign){
       	this.ecgAbnormalitySign=ecgAbnormalitySign;
     }
     public String getEcgAbnormalityDescribe(){
       	return this.ecgAbnormalityDescribe;
     }
     public void setEcgAbnormalityDescribe(String ecgAbnormalityDescribe){
       	this.ecgAbnormalityDescribe=ecgAbnormalityDescribe;
     }
     public Boolean getAbnormalUltrasonographySign(){
       	return this.abnormalUltrasonographySign;
     }
     public void setAbnormalUltrasonographySign(Boolean abnormalUltrasonographySign){
       	this.abnormalUltrasonographySign=abnormalUltrasonographySign;
     }
     public String getAbnormalUltrasonographyDescribe(){
       	return this.abnormalUltrasonographyDescribe;
     }
     public void setAbnormalUltrasonographyDescribe(String abnormalUltrasonographyDescribe){
       	this.abnormalUltrasonographyDescribe=abnormalUltrasonographyDescribe;
     }
     public Boolean getCervicalSmearAbnormalitySign(){
       	return this.cervicalSmearAbnormalitySign;
     }
     public void setCervicalSmearAbnormalitySign(Boolean cervicalSmearAbnormalitySign){
       	this.cervicalSmearAbnormalitySign=cervicalSmearAbnormalitySign;
     }
     public String getCervicalSmearAbnormalityDescribe(){
       	return this.cervicalSmearAbnormalityDescribe;
     }
     public void setCervicalSmearAbnormalityDescribe(String cervicalSmearAbnormalityDescribe){
       	this.cervicalSmearAbnormalityDescribe=cervicalSmearAbnormalityDescribe;
     }
     public String getFamilyDiseaseNameCode(){
       	return this.familyDiseaseNameCode;
     }
     public void setFamilyDiseaseNameCode(String familyDiseaseNameCode){
       	this.familyDiseaseNameCode=familyDiseaseNameCode;
     }
     public String getRegisteredMedicalInstitutionName(){
       	return this.registeredMedicalInstitutionName;
     }
     public void setRegisteredMedicalInstitutionName(String registeredMedicalInstitutionName){
       	this.registeredMedicalInstitutionName=registeredMedicalInstitutionName;
     }
     public String getInpatientMedicalRecordNumber(){
       	return this.inpatientMedicalRecordNumber;
     }
     public void setInpatientMedicalRecordNumber(String inpatientMedicalRecordNumber){
       	this.inpatientMedicalRecordNumber=inpatientMedicalRecordNumber;
     }
     public String getHospitalizationCauses(){
       	return this.hospitalizationCauses;
     }
     public void setHospitalizationCauses(String hospitalizationCauses){
       	this.hospitalizationCauses=hospitalizationCauses;
     }
     public String getOnceEstablishFamilyBedOrgName(){
       	return this.onceEstablishFamilyBedOrgName;
     }
     public void setOnceEstablishFamilyBedOrgName(String onceEstablishFamilyBedOrgName){
       	this.onceEstablishFamilyBedOrgName=onceEstablishFamilyBedOrgName;
     }
     public String getOnceEstablishFamilyBedMedicalRecordNumber(){
       	return this.onceEstablishFamilyBedMedicalRecordNumber;
     }
     public void setOnceEstablishFamilyBedMedicalRecordNumber(String onceEstablishFamilyBedMedicalRecordNumber){
       	this.onceEstablishFamilyBedMedicalRecordNumber=onceEstablishFamilyBedMedicalRecordNumber;
     }
     public String getEstablishFamilyBedsReason(){
       	return this.establishFamilyBedsReason;
     }
     public void setEstablishFamilyBedsReason(String establishFamilyBedsReason){
       	this.establishFamilyBedsReason=establishFamilyBedsReason;
     }
     public Date getInoculationTime(){
       	return this.inoculationTime;
     }
     public void setInoculationTime(Date inoculationTime){
       	this.inoculationTime=inoculationTime;
     }
     public Float getImmuneDose(){
       	return this.immuneDose;
     }
     public void setImmuneDose(Float immuneDose){
       	this.immuneDose=immuneDose;
     }
     public String getVaccineNameCode(){
       	return this.vaccineNameCode;
     }
     public void setVaccineNameCode(String vaccineNameCode){
       	this.vaccineNameCode=vaccineNameCode;
     }
     public String getVaccineBatch(){
       	return this.vaccineBatch;
     }
     public void setVaccineBatch(String vaccineBatch){
       	this.vaccineBatch=vaccineBatch;
     }
     public String getVaccineManufacturers(){
       	return this.vaccineManufacturers;
     }
     public void setVaccineManufacturers(String vaccineManufacturers){
       	this.vaccineManufacturers=vaccineManufacturers;
     }
     public String getVaccinationPhysician(){
       	return this.vaccinationPhysician;
     }
     public void setVaccinationPhysician(String vaccinationPhysician){
       	this.vaccinationPhysician=vaccinationPhysician;
     }
     public String getInoculationMechanism(){
       	return this.inoculationMechanism;
     }
     public void setInoculationMechanism(String inoculationMechanism){
       	this.inoculationMechanism=inoculationMechanism;
     }
     public String getOccupationalExposureToHazardousFactors(){
       	return this.occupationalExposureToHazardousFactors;
     }
     public void setOccupationalExposureToHazardousFactors(String occupationalExposureToHazardousFactors){
       	this.occupationalExposureToHazardousFactors=occupationalExposureToHazardousFactors;
     }
     public Float getEngagedInHazardousFactors(){
       	return this.engagedInHazardousFactors;
     }
     public void setEngagedInHazardousFactors(Float engagedInHazardousFactors){
       	this.engagedInHazardousFactors=engagedInHazardousFactors;
     }
     public String getOccupationalHazardFactorsCode(){
       	return this.occupationalHazardFactorsCode;
     }
     public void setOccupationalHazardFactorsCode(String occupationalHazardFactorsCode){
       	this.occupationalHazardFactorsCode=occupationalHazardFactorsCode;
     }
     public String getOccupationalExposureRiskFactorsName(){
       	return this.occupationalExposureRiskFactorsName;
     }
     public void setOccupationalExposureRiskFactorsName(String occupationalExposureRiskFactorsName){
       	this.occupationalExposureRiskFactorsName=occupationalExposureRiskFactorsName;
     }
     public Boolean getOccupationalProtectionMeasures(){
       	return this.occupationalProtectionMeasures;
     }
     public void setOccupationalProtectionMeasures(Boolean occupationalProtectionMeasures){
       	this.occupationalProtectionMeasures=occupationalProtectionMeasures;
     }
     public String getPhysicalActivityFrequencyCode(){
       	return this.physicalActivityFrequencyCode;
     }
     public void setPhysicalActivityFrequencyCode(String physicalActivityFrequencyCode){
       	this.physicalActivityFrequencyCode=physicalActivityFrequencyCode;
     }
     public Float getEachExerciseTime(){
       	return this.eachExerciseTime;
     }
     public void setEachExerciseTime(Float eachExerciseTime){
       	this.eachExerciseTime=eachExerciseTime;
     }
     public Float getAdhereToExerciseTime(){
       	return this.adhereToExerciseTime;
     }
     public void setAdhereToExerciseTime(Float adhereToExerciseTime){
       	this.adhereToExerciseTime=adhereToExerciseTime;
     }
     public String getExerciseMode(){
       	return this.exerciseMode;
     }
     public void setExerciseMode(String exerciseMode){
       	this.exerciseMode=exerciseMode;
     }
     public String getDietCode(){
       	return this.dietCode;
     }
     public void setDietCode(String dietCode){
       	this.dietCode=dietCode;
     }
     public String getSmokingStatus(){
       	return this.smokingStatus;
     }
     public void setSmokingStatus(String smokingStatus){
       	this.smokingStatus=smokingStatus;
     }
     public Float getDaySmokingAmount(){
       	return this.daySmokingAmount;
     }
     public void setDaySmokingAmount(Float daySmokingAmount){
       	this.daySmokingAmount=daySmokingAmount;
     }
     public Float getStartSmokingAge(){
       	return this.startSmokingAge;
     }
     public void setStartSmokingAge(Float startSmokingAge){
       	this.startSmokingAge=startSmokingAge;
     }
     public Float getSmokingCessationAge(){
       	return this.smokingCessationAge;
     }
     public void setSmokingCessationAge(Float smokingCessationAge){
       	this.smokingCessationAge=smokingCessationAge;
     }
     public String getDrinkingFrequency(){
       	return this.drinkingFrequency;
     }
     public void setDrinkingFrequency(String drinkingFrequency){
       	this.drinkingFrequency=drinkingFrequency;
     }
     public Float getDrinkingPerDay(){
       	return this.drinkingPerDay;
     }
     public void setDrinkingPerDay(Float drinkingPerDay){
       	this.drinkingPerDay=drinkingPerDay;
     }
     public Boolean getIfDrinking(){
       	return this.ifDrinking;
     }
     public void setIfDrinking(Boolean ifDrinking){
       	this.ifDrinking=ifDrinking;
     }
     public Float getAbstinenceAge(){
       	return this.abstinenceAge;
     }
     public void setAbstinenceAge(Float abstinenceAge){
       	this.abstinenceAge=abstinenceAge;
     }
     public Float getDrinkingAge(){
       	return this.drinkingAge;
     }
     public void setDrinkingAge(Float drinkingAge){
       	this.drinkingAge=drinkingAge;
     }
     public Boolean getAbstinenceSign(){
       	return this.abstinenceSign;
     }
     public void setAbstinenceSign(Boolean abstinenceSign){
       	this.abstinenceSign=abstinenceSign;
     }
     public String getDrinkingTypeCode(){
       	return this.drinkingTypeCode;
     }
     public void setDrinkingTypeCode(String drinkingTypeCode){
       	this.drinkingTypeCode=drinkingTypeCode;
     }
     public String getElderlyHealthStatusAssessmentCode(){
       	return this.elderlyHealthStatusAssessmentCode;
     }
     public void setElderlyHealthStatusAssessmentCode(String elderlyHealthStatusAssessmentCode){
       	this.elderlyHealthStatusAssessmentCode=elderlyHealthStatusAssessmentCode;
     }
     public String getElderlySelfAssessmentCode(){
       	return this.elderlySelfAssessmentCode;
     }
     public void setElderlySelfAssessmentCode(String elderlySelfAssessmentCode){
       	this.elderlySelfAssessmentCode=elderlySelfAssessmentCode;
     }
     public String getScreeningCognitiveStateClassificationCode(){
       	return this.screeningCognitiveStateClassificationCode;
     }
     public void setScreeningCognitiveStateClassificationCode(String screeningCognitiveStateClassificationCode){
       	this.screeningCognitiveStateClassificationCode=screeningCognitiveStateClassificationCode;
     }
     public Float getCognitiveFunctionScore(){
       	return this.cognitiveFunctionScore;
     }
     public void setCognitiveFunctionScore(Float cognitiveFunctionScore){
       	this.cognitiveFunctionScore=cognitiveFunctionScore;
     }
     public String getTheEmotionalStateOfCoarseCode(){
       	return this.theEmotionalStateOfCoarseCode;
     }
     public void setTheEmotionalStateOfCoarseCode(String theEmotionalStateOfCoarseCode){
       	this.theEmotionalStateOfCoarseCode=theEmotionalStateOfCoarseCode;
     }
     public Float getGeriatricDepressionScore(){
       	return this.geriatricDepressionScore;
     }
     public void setGeriatricDepressionScore(Float geriatricDepressionScore){
       	this.geriatricDepressionScore=geriatricDepressionScore;
     }
     public Boolean getHealthEvaluationAbnormalSigns(){
       	return this.healthEvaluationAbnormalSigns;
     }
     public void setHealthEvaluationAbnormalSigns(Boolean healthEvaluationAbnormalSigns){
       	this.healthEvaluationAbnormalSigns=healthEvaluationAbnormalSigns;
     }
     public String getHealthEvaluationExceptionDescription(){
       	return this.healthEvaluationExceptionDescription;
     }
     public void setHealthEvaluationExceptionDescription(String healthEvaluationExceptionDescription){
       	this.healthEvaluationExceptionDescription=healthEvaluationExceptionDescription;
     }
     public String getHealthInstructionCode(){
       	return this.healthInstructionCode;
     }
     public void setHealthInstructionCode(String healthInstructionCode){
       	this.healthInstructionCode=healthInstructionCode;
     }
     public String getRiskFactorControlCode(){
       	return this.riskFactorControlCode;
     }
     public void setRiskFactorControlCode(String riskFactorControlCode){
       	this.riskFactorControlCode=riskFactorControlCode;
     }
     public String getDiagnosis(){
       	return this.diagnosis;
     }
     public void setDiagnosis(String diagnosis){
       	this.diagnosis=diagnosis;
     }
     public String getDiagnosisName(){
       	return this.diagnosisName;
     }
     public void setDiagnosisName(String diagnosisName){
       	this.diagnosisName=diagnosisName;
     }
     public Date getDiagnosisDate(){
       	return this.diagnosisDate;
     }
     public void setDiagnosisDate(Date diagnosisDate){
       	this.diagnosisDate=diagnosisDate;
     }
     public String getTcmConstitutionClassificationCode(){
       	return this.tcmConstitutionClassificationCode;
     }
     public void setTcmConstitutionClassificationCode(String tcmConstitutionClassificationCode){
       	this.tcmConstitutionClassificationCode=tcmConstitutionClassificationCode;
     }
     public String getTcmConstitutionClassificationResultCode(){
       	return this.tcmConstitutionClassificationResultCode;
     }
     public void setTcmConstitutionClassificationResultCode(String tcmConstitutionClassificationResultCode){
       	this.tcmConstitutionClassificationResultCode=tcmConstitutionClassificationResultCode;
     }
     public String getFreqCode(){
       	return this.freqCode;
     }
     public void setFreqCode(String freqCode){
       	this.freqCode=freqCode;
     }
     public String getMedicationComplianceCode(){
       	return this.medicationComplianceCode;
     }
     public void setMedicationComplianceCode(String medicationComplianceCode){
       	this.medicationComplianceCode=medicationComplianceCode;
     }
     public String getMedicationCd(){
       	return this.medicationCd;
     }
     public void setMedicationCd(String medicationCd){
       	this.medicationCd=medicationCd;
     }
     public String getMedicationName(){
       	return this.medicationName;
     }
     public void setMedicationName(String medicationName){
       	this.medicationName=medicationName;
     }
     public String getDrugDosageForms(){
       	return this.drugDosageForms;
     }
     public void setDrugDosageForms(String drugDosageForms){
       	this.drugDosageForms=drugDosageForms;
     }
     public String getDrugDosageFormsName(){
       	return this.drugDosageFormsName;
     }
     public void setDrugDosageFormsName(String drugDosageFormsName){
       	this.drugDosageFormsName=drugDosageFormsName;
     }
     public Date getStart(){
       	return this.start;
     }
     public void setStart(Date start){
       	this.start=start;
     }
     public Float getDuration(){
       	return this.duration;
     }
     public void setDuration(Float duration){
       	this.duration=duration;
     }
     public String getDosageCode(){
       	return this.dosageCode;
     }
     public void setDosageCode(String dosageCode){
       	this.dosageCode=dosageCode;
     }
     public String getcMedCode(){
       	return this.cMedCode;
     }
     public void setcMedCode(String cMedCode){
       	this.cMedCode=cMedCode;
     }
     public Float getOnceValue(){
       	return this.onceValue;
     }
     public void setOnceValue(Float onceValue){
       	this.onceValue=onceValue;
     }
     public String getOnceUnit(){
       	return this.onceUnit;
     }
     public void setOnceUnit(String onceUnit){
       	this.onceUnit=onceUnit;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}