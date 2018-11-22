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
@Table(name = BaseEntity.TABLE_PREFIX + "HYPERTENSION_PATIENTS_FOLLOWUP")
public class HypertensionPatientsFollowup extends FhirResourceEntity {

    /**
     *名称:高血压患者随访服务id
     *
 	 *
 	 *主键字段
     */
     @Column(name="HYPERTENSION_PATIENTS_FOLLOW_UP_SERVICE_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="HYPERTENSION_PATIENTS_FOLLOW_UP_SERVICE_ID",displayName="高血压患者随访服务id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String hypertensionPatientsFollowUpServiceId;
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
     *名称:婚姻状况代码
     *
 	 *限制:GBT22612
 	 *
     */
     @Column(name="MARITALSTATUS",length = 20,nullable = false)
     @FhirFieldValidate(name="MARITALSTATUS",displayName="婚姻状况代码",maxLength=20,required=true,valuesRange="GBT22612")   
     private String maritalstatus;
    /**
     *名称:随访方式代码
     *
 	 *限制:CV0600207
 	 *
     */
     @Column(name="VISIT_WAY_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="VISIT_WAY_CD",displayName="随访方式代码",maxLength=20,required=false,valuesRange="CV0600207")   
     private String visitWayCd;
    /**
     *名称:随访日期
     *
 	 *
 	 *
     */
     @Column(name="FOLLOWUP_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="FOLLOWUP_DATE",displayName="随访日期",required=false,valuesRange="")   
     private Date followupDate;
    /**
     *名称:收缩压(收缩压的测量值，计量单位为mmHg)
     *
 	 *
 	 *
     */
     @Column(name="SBP",length = 4,nullable = true)
     @FhirFieldValidate(name="SBP",displayName="收缩压(收缩压的测量值，计量单位为mmHg)",maxLength=4,required=false,valuesRange="")   
     private Integer sbp;
    /**
     *名称:舒张压(舒张压的测量值，计量单位为mmHg)
     *
 	 *
 	 *
     */
     @Column(name="DBP",length = 4,nullable = true)
     @FhirFieldValidate(name="DBP",displayName="舒张压(舒张压的测量值，计量单位为mmHg)",maxLength=4,required=false,valuesRange="")   
     private Integer dbp;
    /**
     *名称:体重（g）
     *
 	 *
 	 *
     */
     @Column(name="BIRTH_WEIGHT",length = 8,nullable = true)
     @FhirFieldValidate(name="BIRTH_WEIGHT",displayName="体重（g）",maxLength=8,required=false,valuesRange="")   
     private Float birthWeight;
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
     *名称:其他阳性体征
     *
 	 *
 	 *
     */
     @Column(name="OTHER_POSITIVE_SIGNS",length = 200,nullable = true)
     @FhirFieldValidate(name="OTHER_POSITIVE_SIGNS",displayName="其他阳性体征",maxLength=200,required=false,valuesRange="")   
     private String otherPositiveSigns;
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
     *名称:日饮酒量
     *
 	 *
 	 *
     */
     @Column(name="DAY_ALCOHOL_CONSUMPTION",length = 8,nullable = true)
     @FhirFieldValidate(name="DAY_ALCOHOL_CONSUMPTION",displayName="日饮酒量",maxLength=8,required=false,valuesRange="")   
     private Float dayAlcoholConsumption;
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
     *名称:每次锻炼时间
     *
 	 *
 	 *
     */
     @Column(name="EACH_EXERCISE_TIME",length = 8,nullable = true)
     @FhirFieldValidate(name="EACH_EXERCISE_TIME",displayName="每次锻炼时间",maxLength=8,required=false,valuesRange="")   
     private Float eachExerciseTime;
    /**
     *名称:心理调整评价结果代码
     *
 	 *限制:CV9900156
 	 *
     */
     @Column(name="PSYCHOLOGICAL_ADJUSTMENT_EVALUATION_RESULT_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="PSYCHOLOGICAL_ADJUSTMENT_EVALUATION_RESULT_CODE",displayName="心理调整评价结果代码",maxLength=20,required=false,valuesRange="CV9900156")   
     private String psychologicalAdjustmentEvaluationResultCode;
    /**
     *名称:随访遵医行为评价结果代码
     *
 	 *限制:CV9900155
 	 *
     */
     @Column(name="FOLLOWUP_EVALUATION_RESULTS",length = 20,nullable = true)
     @FhirFieldValidate(name="FOLLOWUP_EVALUATION_RESULTS",displayName="随访遵医行为评价结果代码",maxLength=20,required=false,valuesRange="CV9900155")   
     private String followupEvaluationResults;
    /**
     *名称:目标体重
     *
 	 *
 	 *
     */
     @Column(name="TARGET_WEIGHT",length = 8,nullable = true)
     @FhirFieldValidate(name="TARGET_WEIGHT",displayName="目标体重",maxLength=8,required=false,valuesRange="")   
     private Float targetWeight;
    /**
     *名称:目标体质指数
     *
 	 *
 	 *
     */
     @Column(name="TARGET_BODY_MASS_INDEX",length = 8,nullable = true)
     @FhirFieldValidate(name="TARGET_BODY_MASS_INDEX",displayName="目标体质指数",maxLength=8,required=false,valuesRange="")   
     private Float targetBodyMassIndex;
    /**
     *名称:目标日吸烟量
     *
 	 *
 	 *
     */
     @Column(name="TARGET_DAY_SMOKING_AMOUNT",length = 8,nullable = true)
     @FhirFieldValidate(name="TARGET_DAY_SMOKING_AMOUNT",displayName="目标日吸烟量",maxLength=8,required=false,valuesRange="")   
     private Float targetDaySmokingAmount;
    /**
     *名称:目标日饮酒量
     *
 	 *
 	 *
     */
     @Column(name="TARGET_DAY_ALCOHOL_CONSUMPTION",length = 8,nullable = true)
     @FhirFieldValidate(name="TARGET_DAY_ALCOHOL_CONSUMPTION",displayName="目标日饮酒量",maxLength=8,required=false,valuesRange="")   
     private Float targetDayAlcoholConsumption;
    /**
     *名称:目标身体活动频率代码
     *
 	 *
 	 *
     */
     @Column(name="TARGET_PHYSICAL_ACTIVITY_FREQUENCY_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="TARGET_PHYSICAL_ACTIVITY_FREQUENCY_CODE",displayName="目标身体活动频率代码",maxLength=20,required=false,valuesRange="")   
     private String targetPhysicalActivityFrequencyCode;
    /**
     *名称:目标每次锻炼时间
     *
 	 *
 	 *
     */
     @Column(name="TARGET_EACH_EXERCISE_TIME",length = 8,nullable = true)
     @FhirFieldValidate(name="TARGET_EACH_EXERCISE_TIME",displayName="目标每次锻炼时间",maxLength=8,required=false,valuesRange="")   
     private Float targetEachExerciseTime;
    /**
     *名称:辅助检查项目
     *
 	 *
 	 *
     */
     @Column(name="AUXILIARY_EXAMINATION_PROJECT",length = 100,nullable = true)
     @FhirFieldValidate(name="AUXILIARY_EXAMINATION_PROJECT",displayName="辅助检查项目",maxLength=100,required=false,valuesRange="")   
     private String auxiliaryExaminationProject;
    /**
     *名称:辅助检查结果
     *
 	 *
 	 *
     */
     @Column(name="AUXILIARY_EXAMINATION_RESULTS",length = 200,nullable = true)
     @FhirFieldValidate(name="AUXILIARY_EXAMINATION_RESULTS",displayName="辅助检查结果",maxLength=200,required=false,valuesRange="")   
     private String auxiliaryExaminationResults;
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
     *名称:诊断日期
     *
 	 *
 	 *
     */
     @Column(name="ADMISSION_DIAGNOSIS_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="ADMISSION_DIAGNOSIS_DATE",displayName="诊断日期",required=false,valuesRange="")   
     private Date admissionDiagnosisDate;
    /**
     *名称:中药使用类别代码
     *
 	 *限制:CV0600101
 	 *
     */
     @Column(name="CN_MEDICATION_TYPE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="CN_MEDICATION_TYPE_CODE",displayName="中药使用类别代码",maxLength=20,required=false,valuesRange="CV0600101")   
     private String cnMedicationTypeCode;
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
     *名称:药物不良反应情况
     *
 	 *
 	 *
     */
     @Column(name="DRUG_ADVERSE_REACTION",length = 200,nullable = true)
     @FhirFieldValidate(name="DRUG_ADVERSE_REACTION",displayName="药物不良反应情况",maxLength=200,required=false,valuesRange="")   
     private String drugAdverseReaction;
    /**
     *名称:药物使用总剂量
     *
 	 *
 	 *
     */
     @Column(name="DRUG_TOTAL_DOSE",length = 8,nullable = true)
     @FhirFieldValidate(name="DRUG_TOTAL_DOSE",displayName="药物使用总剂量",maxLength=8,required=false,valuesRange="")   
     private Float drugTotalDose;
    /**
     *名称:药物使用总剂量单位
     *
 	 *
 	 *
     */
     @Column(name="DRUG_TOTAL_DOSE_UTIL",length = 40,nullable = true)
     @FhirFieldValidate(name="DRUG_TOTAL_DOSE_UTIL",displayName="药物使用总剂量单位",maxLength=40,required=false,valuesRange="")   
     private String drugTotalDoseUtil;
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
     *名称:随访评价结果代码
     *
 	 *限制:CV0510012
 	 *
     */
     @Column(name="FOLLOWUP_EVALUATION_RESULTS_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="FOLLOWUP_EVALUATION_RESULTS_CODE",displayName="随访评价结果代码",maxLength=20,required=false,valuesRange="CV0510012")   
     private String followupEvaluationResultsCode;
    /**
     *名称:转诊标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="REFERRAL_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="REFERRAL_MARK",displayName="转诊标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean referralMark;
    /**
     *名称:转诊原因
     *
 	 *
 	 *
     */
     @Column(name="REFERRAL_REASONS",length = 200,nullable = true)
     @FhirFieldValidate(name="REFERRAL_REASONS",displayName="转诊原因",maxLength=200,required=false,valuesRange="")   
     private String referralReasons;
    /**
     *名称:转入机构的名称
     *
 	 *
 	 *
     */
     @Column(name="REFERRAL_IN_ORG",length = 40,nullable = true)
     @FhirFieldValidate(name="REFERRAL_IN_ORG",displayName="转入机构的名称",maxLength=40,required=false,valuesRange="")   
     private String referralInOrg;
    /**
     *名称:转入科室的名称
     *
 	 *
 	 *
     */
     @Column(name="REFERRAL_IN_DEP",length = 40,nullable = true)
     @FhirFieldValidate(name="REFERRAL_IN_DEP",displayName="转入科室的名称",maxLength=40,required=false,valuesRange="")   
     private String referralInDep;
    /**
     *名称:下次随访日期
     *
 	 *
 	 *
     */
     @Column(name="NEXT_FOLLOW_UP_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="NEXT_FOLLOW_UP_DATE",displayName="下次随访日期",required=false,valuesRange="")   
     private Date nextFollowUpDate;
    /**
     *名称:下次访视地点
     *
 	 *
 	 *
     */
     @Column(name="NEXT_VISIT_LOCATION",length = 40,nullable = true)
     @FhirFieldValidate(name="NEXT_VISIT_LOCATION",displayName="下次访视地点",maxLength=40,required=false,valuesRange="")   
     private String nextVisitLocation;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getHypertensionPatientsFollowUpServiceId(){
       	return this.hypertensionPatientsFollowUpServiceId;
     }
     public void setHypertensionPatientsFollowUpServiceId(String hypertensionPatientsFollowUpServiceId){
       	this.hypertensionPatientsFollowUpServiceId=hypertensionPatientsFollowUpServiceId;
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
     public String getMaritalstatus(){
       	return this.maritalstatus;
     }
     public void setMaritalstatus(String maritalstatus){
       	this.maritalstatus=maritalstatus;
     }
     public String getVisitWayCd(){
       	return this.visitWayCd;
     }
     public void setVisitWayCd(String visitWayCd){
       	this.visitWayCd=visitWayCd;
     }
     public Date getFollowupDate(){
       	return this.followupDate;
     }
     public void setFollowupDate(Date followupDate){
       	this.followupDate=followupDate;
     }
     public Integer getSbp(){
       	return this.sbp;
     }
     public void setSbp(Integer sbp){
       	this.sbp=sbp;
     }
     public Integer getDbp(){
       	return this.dbp;
     }
     public void setDbp(Integer dbp){
       	this.dbp=dbp;
     }
     public Float getBirthWeight(){
       	return this.birthWeight;
     }
     public void setBirthWeight(Float birthWeight){
       	this.birthWeight=birthWeight;
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
     public String getOtherPositiveSigns(){
       	return this.otherPositiveSigns;
     }
     public void setOtherPositiveSigns(String otherPositiveSigns){
       	this.otherPositiveSigns=otherPositiveSigns;
     }
     public Float getDaySmokingAmount(){
       	return this.daySmokingAmount;
     }
     public void setDaySmokingAmount(Float daySmokingAmount){
       	this.daySmokingAmount=daySmokingAmount;
     }
     public Float getDayAlcoholConsumption(){
       	return this.dayAlcoholConsumption;
     }
     public void setDayAlcoholConsumption(Float dayAlcoholConsumption){
       	this.dayAlcoholConsumption=dayAlcoholConsumption;
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
     public String getPsychologicalAdjustmentEvaluationResultCode(){
       	return this.psychologicalAdjustmentEvaluationResultCode;
     }
     public void setPsychologicalAdjustmentEvaluationResultCode(String psychologicalAdjustmentEvaluationResultCode){
       	this.psychologicalAdjustmentEvaluationResultCode=psychologicalAdjustmentEvaluationResultCode;
     }
     public String getFollowupEvaluationResults(){
       	return this.followupEvaluationResults;
     }
     public void setFollowupEvaluationResults(String followupEvaluationResults){
       	this.followupEvaluationResults=followupEvaluationResults;
     }
     public Float getTargetWeight(){
       	return this.targetWeight;
     }
     public void setTargetWeight(Float targetWeight){
       	this.targetWeight=targetWeight;
     }
     public Float getTargetBodyMassIndex(){
       	return this.targetBodyMassIndex;
     }
     public void setTargetBodyMassIndex(Float targetBodyMassIndex){
       	this.targetBodyMassIndex=targetBodyMassIndex;
     }
     public Float getTargetDaySmokingAmount(){
       	return this.targetDaySmokingAmount;
     }
     public void setTargetDaySmokingAmount(Float targetDaySmokingAmount){
       	this.targetDaySmokingAmount=targetDaySmokingAmount;
     }
     public Float getTargetDayAlcoholConsumption(){
       	return this.targetDayAlcoholConsumption;
     }
     public void setTargetDayAlcoholConsumption(Float targetDayAlcoholConsumption){
       	this.targetDayAlcoholConsumption=targetDayAlcoholConsumption;
     }
     public String getTargetPhysicalActivityFrequencyCode(){
       	return this.targetPhysicalActivityFrequencyCode;
     }
     public void setTargetPhysicalActivityFrequencyCode(String targetPhysicalActivityFrequencyCode){
       	this.targetPhysicalActivityFrequencyCode=targetPhysicalActivityFrequencyCode;
     }
     public Float getTargetEachExerciseTime(){
       	return this.targetEachExerciseTime;
     }
     public void setTargetEachExerciseTime(Float targetEachExerciseTime){
       	this.targetEachExerciseTime=targetEachExerciseTime;
     }
     public String getAuxiliaryExaminationProject(){
       	return this.auxiliaryExaminationProject;
     }
     public void setAuxiliaryExaminationProject(String auxiliaryExaminationProject){
       	this.auxiliaryExaminationProject=auxiliaryExaminationProject;
     }
     public String getAuxiliaryExaminationResults(){
       	return this.auxiliaryExaminationResults;
     }
     public void setAuxiliaryExaminationResults(String auxiliaryExaminationResults){
       	this.auxiliaryExaminationResults=auxiliaryExaminationResults;
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
     public String getCnMedicationTypeCode(){
       	return this.cnMedicationTypeCode;
     }
     public void setCnMedicationTypeCode(String cnMedicationTypeCode){
       	this.cnMedicationTypeCode=cnMedicationTypeCode;
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
     public String getDrugAdverseReaction(){
       	return this.drugAdverseReaction;
     }
     public void setDrugAdverseReaction(String drugAdverseReaction){
       	this.drugAdverseReaction=drugAdverseReaction;
     }
     public Float getDrugTotalDose(){
       	return this.drugTotalDose;
     }
     public void setDrugTotalDose(Float drugTotalDose){
       	this.drugTotalDose=drugTotalDose;
     }
     public String getDrugTotalDoseUtil(){
       	return this.drugTotalDoseUtil;
     }
     public void setDrugTotalDoseUtil(String drugTotalDoseUtil){
       	this.drugTotalDoseUtil=drugTotalDoseUtil;
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
     public String getFollowupEvaluationResultsCode(){
       	return this.followupEvaluationResultsCode;
     }
     public void setFollowupEvaluationResultsCode(String followupEvaluationResultsCode){
       	this.followupEvaluationResultsCode=followupEvaluationResultsCode;
     }
     public Boolean getReferralMark(){
       	return this.referralMark;
     }
     public void setReferralMark(Boolean referralMark){
       	this.referralMark=referralMark;
     }
     public String getReferralReasons(){
       	return this.referralReasons;
     }
     public void setReferralReasons(String referralReasons){
       	this.referralReasons=referralReasons;
     }
     public String getReferralInOrg(){
       	return this.referralInOrg;
     }
     public void setReferralInOrg(String referralInOrg){
       	this.referralInOrg=referralInOrg;
     }
     public String getReferralInDep(){
       	return this.referralInDep;
     }
     public void setReferralInDep(String referralInDep){
       	this.referralInDep=referralInDep;
     }
     public Date getNextFollowUpDate(){
       	return this.nextFollowUpDate;
     }
     public void setNextFollowUpDate(Date nextFollowUpDate){
       	this.nextFollowUpDate=nextFollowUpDate;
     }
     public String getNextVisitLocation(){
       	return this.nextVisitLocation;
     }
     public void setNextVisitLocation(String nextVisitLocation){
       	this.nextVisitLocation=nextVisitLocation;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}