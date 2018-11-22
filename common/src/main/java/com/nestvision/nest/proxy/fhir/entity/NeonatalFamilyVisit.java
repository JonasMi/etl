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
@Table(name = BaseEntity.TABLE_PREFIX + "NEONATAL_FAMILY_VISIT")
public class NeonatalFamilyVisit extends FhirResourceEntity {

    /**
     *名称:新生儿家庭访视id
     *
 	 *
 	 *主键字段
     */
     @Column(name="NEONATAL_FAMILY_VISIT_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="NEONATAL_FAMILY_VISIT_ID",displayName="新生儿家庭访视id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String neonatalFamilyVisitId;
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
     *名称:父亲-职业代码
     *
 	 *限制:GBT22614
 	 *
     */
     @Column(name="FATHER_OCCUPATION_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="FATHER_OCCUPATION_CD",displayName="父亲-职业代码",maxLength=20,required=false,valuesRange="GBT22614")   
     private String fatherOccupationCd;
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
     *名称:母亲-职业代码
     *
 	 *限制:GBT22614
 	 *
     */
     @Column(name="MOTHER_OCCUPATION_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="MOTHER_OCCUPATION_CD",displayName="母亲-职业代码",maxLength=20,required=false,valuesRange="GBT22614")   
     private String motherOccupationCd;
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
     *名称:助产机构名称
     *
 	 *
 	 *
     */
     @Column(name="MIDWIFERY_ORGANIZATION_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="MIDWIFERY_ORGANIZATION_NAME",displayName="助产机构名称",maxLength=40,required=false,valuesRange="")   
     private String midwiferyOrganizationName;
    /**
     *名称:母亲妊娠合并症
     *
 	 *
 	 *
     */
     @Column(name="MATERNAL_PREGNANCY_COMPLICATIONS",length = 40,nullable = true)
     @FhirFieldValidate(name="MATERNAL_PREGNANCY_COMPLICATIONS",displayName="母亲妊娠合并症",maxLength=40,required=false,valuesRange="")   
     private String maternalPregnancyComplications;
    /**
     *名称:分娩方式
     *
 	 *限制:CV0210003
 	 *
     */
     @Column(name="MODE_DELIVERY",length = 20,nullable = true)
     @FhirFieldValidate(name="MODE_DELIVERY",displayName="分娩方式",maxLength=20,required=false,valuesRange="CV0210003")   
     private String modeDelivery;
    /**
     *名称:新生儿窒息标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="ASPHYXIA_NEWBORN_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="ASPHYXIA_NEWBORN_MARK",displayName="新生儿窒息标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean asphyxiaNewbornMark;
    /**
     *名称:Apgar评分值
     *
 	 *
 	 *
     */
     @Column(name="APGAR_SCORE",length = 8,nullable = true)
     @FhirFieldValidate(name="APGAR_SCORE",displayName="Apgar评分值",maxLength=8,required=false,valuesRange="")   
     private Float apgarScore;
    /**
     *名称:喂养方式
     *
 	 *限制:CV9900005
 	 *
     */
     @Column(name="FEEDING_MODE",length = 20,nullable = true)
     @FhirFieldValidate(name="FEEDING_MODE",displayName="喂养方式",maxLength=20,required=false,valuesRange="CV9900005")   
     private String feedingMode;
    /**
     *名称:每天吃奶次数
     *
 	 *
 	 *
     */
     @Column(name="AT_TIMES_DAY",length = 8,nullable = true)
     @FhirFieldValidate(name="AT_TIMES_DAY",displayName="每天吃奶次数",maxLength=8,required=false,valuesRange="")   
     private Float atTimesDay;
    /**
     *名称:每天吃奶量(ml)
     *
 	 *
 	 *
     */
     @Column(name="DAILY_FEEDING_AMOUNT",length = 8,nullable = true)
     @FhirFieldValidate(name="DAILY_FEEDING_AMOUNT",displayName="每天吃奶量(ml)",maxLength=8,required=false,valuesRange="")   
     private Float dailyFeedingAmount;
    /**
     *名称:呕吐标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="VOMITING_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="VOMITING_MARK",displayName="呕吐标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean vomitingMark;
    /**
     *名称:新生儿大便性状代码
     *
 	 *限制:CV0401012
 	 *
     */
     @Column(name="CHILDREN_STOOL_CHARACTER_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="CHILDREN_STOOL_CHARACTER_CODE",displayName="新生儿大便性状代码",maxLength=20,required=false,valuesRange="CV0401012")   
     private String childrenStoolCharacterCode;
    /**
     *名称:大便次数
     *
 	 *
 	 *
     */
     @Column(name="STOOL_FREQUENCY",length = 8,nullable = true)
     @FhirFieldValidate(name="STOOL_FREQUENCY",displayName="大便次数",maxLength=8,required=false,valuesRange="")   
     private Float stoolFrequency;
    /**
     *名称:耳外观检查异常标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="EAR_APPEARANCE_ABNORMAL_SIGN",length = 5,nullable = true)
     @FhirFieldValidate(name="EAR_APPEARANCE_ABNORMAL_SIGN",displayName="耳外观检查异常标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean earAppearanceAbnormalSign;
    /**
     *名称:耳外观检查异常结果描述
     *
 	 *
 	 *
     */
     @Column(name="EAR_APPEARANCE_RESULT",length = 40,nullable = true)
     @FhirFieldValidate(name="EAR_APPEARANCE_RESULT",displayName="耳外观检查异常结果描述",maxLength=40,required=false,valuesRange="")   
     private String earAppearanceResult;
    /**
     *名称:新生儿疾病筛查代码
     *
 	 *限制:CV0450008
 	 *
     */
     @Column(name="NEONATAL_DISEASE_SCREENING_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="NEONATAL_DISEASE_SCREENING_CODE",displayName="新生儿疾病筛查代码",maxLength=20,required=false,valuesRange="CV0450008")   
     private String neonatalDiseaseScreeningCode;
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
     *名称:身长（cm）
     *
 	 *
 	 *
     */
     @Column(name="BIRTH_LENGTH",length = 8,nullable = true)
     @FhirFieldValidate(name="BIRTH_LENGTH",displayName="身长（cm）",maxLength=8,required=false,valuesRange="")   
     private Float birthLength;
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
     *名称:新生儿出生体重（g）
     *
 	 *
 	 *
     */
     @Column(name="NEWBORN_BIRTH_WEIGHT",length = 8,nullable = true)
     @FhirFieldValidate(name="NEWBORN_BIRTH_WEIGHT",displayName="新生儿出生体重（g）",maxLength=8,required=false,valuesRange="")   
     private Float newbornBirthWeight;
    /**
     *名称:出生身长（cm）
     *
 	 *
 	 *
     */
     @Column(name="NEWBORN_BIRTH_LENGTH",length = 8,nullable = true)
     @FhirFieldValidate(name="NEWBORN_BIRTH_LENGTH",displayName="出生身长（cm）",maxLength=8,required=false,valuesRange="")   
     private Float newbornBirthLength;
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
     *名称:黄疸部位代码
     *
 	 *限制:CV0410009
 	 *
     */
     @Column(name="AUNDICE_SITE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="AUNDICE_SITE_CODE",displayName="黄疸部位代码",maxLength=20,required=false,valuesRange="CV0410009")   
     private String aundiceSiteCode;
    /**
     *名称:新生儿面色代码
     *
 	 *限制:CV0410008
 	 *
     */
     @Column(name="FACE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="FACE_CODE",displayName="新生儿面色代码",maxLength=20,required=false,valuesRange="CV0410008")   
     private String faceCode;
    /**
     *名称:新生儿畸形标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="NEONATAL_MALFORMATION",length = 5,nullable = true)
     @FhirFieldValidate(name="NEONATAL_MALFORMATION",displayName="新生儿畸形标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean neonatalMalformation;
    /**
     *名称:新生儿畸形描述
     *
 	 *
 	 *
     */
     @Column(name="NEONATAL_MALFORMATION_DESCRIPTION",length = 40,nullable = true)
     @FhirFieldValidate(name="NEONATAL_MALFORMATION_DESCRIPTION",displayName="新生儿畸形描述",maxLength=40,required=false,valuesRange="")   
     private String neonatalMalformationDescription;
    /**
     *名称:前囟闭合标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="ANTERIOR_FONTANELLE_CLOSED_SIGN",length = 5,nullable = true)
     @FhirFieldValidate(name="ANTERIOR_FONTANELLE_CLOSED_SIGN",displayName="前囟闭合标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean anteriorFontanelleClosedSign;
    /**
     *名称:前囟横径
     *
 	 *
 	 *
     */
     @Column(name="TRANSVERSE_DIAMETER_ANTERIOR_FONTANEL",length = 8,nullable = true)
     @FhirFieldValidate(name="TRANSVERSE_DIAMETER_ANTERIOR_FONTANEL",displayName="前囟横径",maxLength=8,required=false,valuesRange="")   
     private Float transverseDiameterAnteriorFontanel;
    /**
     *名称:前囟纵径
     *
 	 *
 	 *
     */
     @Column(name="ANTERIOR_LONGITUDINAL_DIAMETER",length = 8,nullable = true)
     @FhirFieldValidate(name="ANTERIOR_LONGITUDINAL_DIAMETER",displayName="前囟纵径",maxLength=8,required=false,valuesRange="")   
     private Float anteriorLongitudinalDiameter;
    /**
     *名称:前囟张力代码
     *
 	 *限制:CV0410018
 	 *
     */
     @Column(name="ANTERIOR_FONTANEL_TENSION_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="ANTERIOR_FONTANEL_TENSION_CODE",displayName="前囟张力代码",maxLength=20,required=false,valuesRange="CV0410018")   
     private String anteriorFontanelTensionCode;
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
     *名称:眼外观检查异常标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="EYE_APPEARANCE_CHECK",length = 5,nullable = true)
     @FhirFieldValidate(name="EYE_APPEARANCE_CHECK",displayName="眼外观检查异常标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean eyeAppearanceCheck;
    /**
     *名称:眼外观检查异常结果描述
     *
 	 *
 	 *
     */
     @Column(name="EYE_APPEARANCE_INSPECTION_RESULTS",length = 40,nullable = true)
     @FhirFieldValidate(name="EYE_APPEARANCE_INSPECTION_RESULTS",displayName="眼外观检查异常结果描述",maxLength=40,required=false,valuesRange="")   
     private String eyeAppearanceInspectionResults;
    /**
     *名称:四肢活动度异常标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="LIMB_ACTIVITY_ABNORMAL_SIGN",length = 5,nullable = true)
     @FhirFieldValidate(name="LIMB_ACTIVITY_ABNORMAL_SIGN",displayName="四肢活动度异常标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean limbActivityAbnormalSign;
    /**
     *名称:四肢活动度异常结果描述
     *
 	 *
 	 *
     */
     @Column(name="LIMB_MOBILITY_ABNORMAL_RESULTS",length = 40,nullable = true)
     @FhirFieldValidate(name="LIMB_MOBILITY_ABNORMAL_RESULTS",displayName="四肢活动度异常结果描述",maxLength=40,required=false,valuesRange="")   
     private String limbMobilityAbnormalResults;
    /**
     *名称:颈部包块标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="NECK_MASS",length = 5,nullable = true)
     @FhirFieldValidate(name="NECK_MASS",displayName="颈部包块标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean neckMass;
    /**
     *名称:颈部包块检查结果描述
     *
 	 *
 	 *
     */
     @Column(name="CERVICAL_MASS_EXAMINATION_RESULTS",length = 40,nullable = true)
     @FhirFieldValidate(name="CERVICAL_MASS_EXAMINATION_RESULTS",displayName="颈部包块检查结果描述",maxLength=40,required=false,valuesRange="")   
     private String cervicalMassExaminationResults;
    /**
     *名称:鼻检查异常标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="NASAL_EXAMINATION_ABNORMAL_SIGNS",length = 5,nullable = true)
     @FhirFieldValidate(name="NASAL_EXAMINATION_ABNORMAL_SIGNS",displayName="鼻检查异常标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean nasalExaminationAbnormalSigns;
    /**
     *名称:鼻检查异常结果描述
     *
 	 *
 	 *
     */
     @Column(name="NASAL_EXAMINATION_RESULTS",length = 40,nullable = true)
     @FhirFieldValidate(name="NASAL_EXAMINATION_RESULTS",displayName="鼻检查异常结果描述",maxLength=40,required=false,valuesRange="")   
     private String nasalExaminationResults;
    /**
     *名称:口腔检查异常标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="ORAL_EXAMINATION_ABNORMAL_SIGN",length = 5,nullable = true)
     @FhirFieldValidate(name="ORAL_EXAMINATION_ABNORMAL_SIGN",displayName="口腔检查异常标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean oralExaminationAbnormalSign;
    /**
     *名称:口腔检查异常结果描述
     *
 	 *
 	 *
     */
     @Column(name="ORAL_EXAMINATION_RESULTS",length = 40,nullable = true)
     @FhirFieldValidate(name="ORAL_EXAMINATION_RESULTS",displayName="口腔检查异常结果描述",maxLength=40,required=false,valuesRange="")   
     private String oralExaminationResults;
    /**
     *名称:肛门检查异常标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="ANUS_ABNORMAL_SIGN",length = 5,nullable = true)
     @FhirFieldValidate(name="ANUS_ABNORMAL_SIGN",displayName="肛门检查异常标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean anusAbnormalSign;
    /**
     *名称:肛门检查异常结果描述
     *
 	 *
 	 *
     */
     @Column(name="ANUS_EXAMINATION_RESULTS",length = 40,nullable = true)
     @FhirFieldValidate(name="ANUS_EXAMINATION_RESULTS",displayName="肛门检查异常结果描述",maxLength=40,required=false,valuesRange="")   
     private String anusExaminationResults;
    /**
     *名称:心脏听诊异常标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="CARDIAC_AUSCULTATION_ABNORMAL_SIGN",length = 5,nullable = true)
     @FhirFieldValidate(name="CARDIAC_AUSCULTATION_ABNORMAL_SIGN",displayName="心脏听诊异常标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean cardiacAuscultationAbnormalSign;
    /**
     *名称:心脏听诊异常结果描述
     *
 	 *
 	 *
     */
     @Column(name="CARDIAC_AUSCULTATION_RESULTS",length = 40,nullable = true)
     @FhirFieldValidate(name="CARDIAC_AUSCULTATION_RESULTS",displayName="心脏听诊异常结果描述",maxLength=40,required=false,valuesRange="")   
     private String cardiacAuscultationResults;
    /**
     *名称:肺部听诊异常标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="LUNG_AUSCULTATION_ABNORMAL_SIGN",length = 5,nullable = true)
     @FhirFieldValidate(name="LUNG_AUSCULTATION_ABNORMAL_SIGN",displayName="肺部听诊异常标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean lungAuscultationAbnormalSign;
    /**
     *名称:肺部听诊异常结果描述
     *
 	 *
 	 *
     */
     @Column(name="LUNG_AUSCULTATION_RESULTS",length = 40,nullable = true)
     @FhirFieldValidate(name="LUNG_AUSCULTATION_RESULTS",displayName="肺部听诊异常结果描述",maxLength=40,required=false,valuesRange="")   
     private String lungAuscultationResults;
    /**
     *名称:外生殖器检查异常标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="EXTERNAL_GENITAL_ORGANS_ABNORMAL_SIGN",length = 5,nullable = true)
     @FhirFieldValidate(name="EXTERNAL_GENITAL_ORGANS_ABNORMAL_SIGN",displayName="外生殖器检查异常标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean externalGenitalOrgansAbnormalSign;
    /**
     *名称:外生殖器检查异常结果描述
     *
 	 *
 	 *
     */
     @Column(name="EXTERNAL_GENITAL_ORGANS_RESULTS",length = 40,nullable = true)
     @FhirFieldValidate(name="EXTERNAL_GENITAL_ORGANS_RESULTS",displayName="外生殖器检查异常结果描述",maxLength=40,required=false,valuesRange="")   
     private String externalGenitalOrgansResults;
    /**
     *名称:腹部触诊异常标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="ABDOMINAL_PALPATION_ABNORMAL_SIGN",length = 5,nullable = true)
     @FhirFieldValidate(name="ABDOMINAL_PALPATION_ABNORMAL_SIGN",displayName="腹部触诊异常标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean abdominalPalpationAbnormalSign;
    /**
     *名称:腹部触诊异常结果描述
     *
 	 *
 	 *
     */
     @Column(name="ABDOMINAL_PALPATION_RESULTS",length = 40,nullable = true)
     @FhirFieldValidate(name="ABDOMINAL_PALPATION_RESULTS",displayName="腹部触诊异常结果描述",maxLength=40,required=false,valuesRange="")   
     private String abdominalPalpationResults;
    /**
     *名称:脐带脱落标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="UMBILICAL_CORD",length = 5,nullable = true)
     @FhirFieldValidate(name="UMBILICAL_CORD",displayName="脐带脱落标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean umbilicalCord;
    /**
     *名称:脐带检查结果代码
     *
 	 *限制:CV0410019
 	 *
     */
     @Column(name="UMBILICAL_CORD_EXAMINATION_RESULTS_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="UMBILICAL_CORD_EXAMINATION_RESULTS_CODE",displayName="脐带检查结果代码",maxLength=20,required=false,valuesRange="CV0410019")   
     private String umbilicalCordExaminationResultsCode;
    /**
     *名称:脊柱检查异常标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="SPINAL_EXAMINATION_ABNORMAL_SIGN",length = 5,nullable = true)
     @FhirFieldValidate(name="SPINAL_EXAMINATION_ABNORMAL_SIGN",displayName="脊柱检查异常标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean spinalExaminationAbnormalSign;
    /**
     *名称:脊柱检查异常结果描述
     *
 	 *
 	 *
     */
     @Column(name="SPINAL_EXAMINATION_RESULTS",length = 40,nullable = true)
     @FhirFieldValidate(name="SPINAL_EXAMINATION_RESULTS",displayName="脊柱检查异常结果描述",maxLength=40,required=false,valuesRange="")   
     private String spinalExaminationResults;
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
     @Column(name="REFERRAL_REASONS",length = 40,nullable = true)
     @FhirFieldValidate(name="REFERRAL_REASONS",displayName="转诊原因",maxLength=40,required=false,valuesRange="")   
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
    
     public String getNeonatalFamilyVisitId(){
       	return this.neonatalFamilyVisitId;
     }
     public void setNeonatalFamilyVisitId(String neonatalFamilyVisitId){
       	this.neonatalFamilyVisitId=neonatalFamilyVisitId;
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
     public String getFatherOccupationCd(){
       	return this.fatherOccupationCd;
     }
     public void setFatherOccupationCd(String fatherOccupationCd){
       	this.fatherOccupationCd=fatherOccupationCd;
     }
     public String getMotherName(){
       	return this.motherName;
     }
     public void setMotherName(String motherName){
       	this.motherName=motherName;
     }
     public String getMotherOccupationCd(){
       	return this.motherOccupationCd;
     }
     public void setMotherOccupationCd(String motherOccupationCd){
       	this.motherOccupationCd=motherOccupationCd;
     }
     public Float getGestationalWeek(){
       	return this.gestationalWeek;
     }
     public void setGestationalWeek(Float gestationalWeek){
       	this.gestationalWeek=gestationalWeek;
     }
     public String getMidwiferyOrganizationName(){
       	return this.midwiferyOrganizationName;
     }
     public void setMidwiferyOrganizationName(String midwiferyOrganizationName){
       	this.midwiferyOrganizationName=midwiferyOrganizationName;
     }
     public String getMaternalPregnancyComplications(){
       	return this.maternalPregnancyComplications;
     }
     public void setMaternalPregnancyComplications(String maternalPregnancyComplications){
       	this.maternalPregnancyComplications=maternalPregnancyComplications;
     }
     public String getModeDelivery(){
       	return this.modeDelivery;
     }
     public void setModeDelivery(String modeDelivery){
       	this.modeDelivery=modeDelivery;
     }
     public Boolean getAsphyxiaNewbornMark(){
       	return this.asphyxiaNewbornMark;
     }
     public void setAsphyxiaNewbornMark(Boolean asphyxiaNewbornMark){
       	this.asphyxiaNewbornMark=asphyxiaNewbornMark;
     }
     public Float getApgarScore(){
       	return this.apgarScore;
     }
     public void setApgarScore(Float apgarScore){
       	this.apgarScore=apgarScore;
     }
     public String getFeedingMode(){
       	return this.feedingMode;
     }
     public void setFeedingMode(String feedingMode){
       	this.feedingMode=feedingMode;
     }
     public Float getAtTimesDay(){
       	return this.atTimesDay;
     }
     public void setAtTimesDay(Float atTimesDay){
       	this.atTimesDay=atTimesDay;
     }
     public Float getDailyFeedingAmount(){
       	return this.dailyFeedingAmount;
     }
     public void setDailyFeedingAmount(Float dailyFeedingAmount){
       	this.dailyFeedingAmount=dailyFeedingAmount;
     }
     public Boolean getVomitingMark(){
       	return this.vomitingMark;
     }
     public void setVomitingMark(Boolean vomitingMark){
       	this.vomitingMark=vomitingMark;
     }
     public String getChildrenStoolCharacterCode(){
       	return this.childrenStoolCharacterCode;
     }
     public void setChildrenStoolCharacterCode(String childrenStoolCharacterCode){
       	this.childrenStoolCharacterCode=childrenStoolCharacterCode;
     }
     public Float getStoolFrequency(){
       	return this.stoolFrequency;
     }
     public void setStoolFrequency(Float stoolFrequency){
       	this.stoolFrequency=stoolFrequency;
     }
     public Boolean getEarAppearanceAbnormalSign(){
       	return this.earAppearanceAbnormalSign;
     }
     public void setEarAppearanceAbnormalSign(Boolean earAppearanceAbnormalSign){
       	this.earAppearanceAbnormalSign=earAppearanceAbnormalSign;
     }
     public String getEarAppearanceResult(){
       	return this.earAppearanceResult;
     }
     public void setEarAppearanceResult(String earAppearanceResult){
       	this.earAppearanceResult=earAppearanceResult;
     }
     public String getNeonatalDiseaseScreeningCode(){
       	return this.neonatalDiseaseScreeningCode;
     }
     public void setNeonatalDiseaseScreeningCode(String neonatalDiseaseScreeningCode){
       	this.neonatalDiseaseScreeningCode=neonatalDiseaseScreeningCode;
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
     public Float getNewbornBirthWeight(){
       	return this.newbornBirthWeight;
     }
     public void setNewbornBirthWeight(Float newbornBirthWeight){
       	this.newbornBirthWeight=newbornBirthWeight;
     }
     public Float getNewbornBirthLength(){
       	return this.newbornBirthLength;
     }
     public void setNewbornBirthLength(Float newbornBirthLength){
       	this.newbornBirthLength=newbornBirthLength;
     }
     public String getSkinTestResultCode(){
       	return this.skinTestResultCode;
     }
     public void setSkinTestResultCode(String skinTestResultCode){
       	this.skinTestResultCode=skinTestResultCode;
     }
     public String getAundiceSiteCode(){
       	return this.aundiceSiteCode;
     }
     public void setAundiceSiteCode(String aundiceSiteCode){
       	this.aundiceSiteCode=aundiceSiteCode;
     }
     public String getFaceCode(){
       	return this.faceCode;
     }
     public void setFaceCode(String faceCode){
       	this.faceCode=faceCode;
     }
     public Boolean getNeonatalMalformation(){
       	return this.neonatalMalformation;
     }
     public void setNeonatalMalformation(Boolean neonatalMalformation){
       	this.neonatalMalformation=neonatalMalformation;
     }
     public String getNeonatalMalformationDescription(){
       	return this.neonatalMalformationDescription;
     }
     public void setNeonatalMalformationDescription(String neonatalMalformationDescription){
       	this.neonatalMalformationDescription=neonatalMalformationDescription;
     }
     public Boolean getAnteriorFontanelleClosedSign(){
       	return this.anteriorFontanelleClosedSign;
     }
     public void setAnteriorFontanelleClosedSign(Boolean anteriorFontanelleClosedSign){
       	this.anteriorFontanelleClosedSign=anteriorFontanelleClosedSign;
     }
     public Float getTransverseDiameterAnteriorFontanel(){
       	return this.transverseDiameterAnteriorFontanel;
     }
     public void setTransverseDiameterAnteriorFontanel(Float transverseDiameterAnteriorFontanel){
       	this.transverseDiameterAnteriorFontanel=transverseDiameterAnteriorFontanel;
     }
     public Float getAnteriorLongitudinalDiameter(){
       	return this.anteriorLongitudinalDiameter;
     }
     public void setAnteriorLongitudinalDiameter(Float anteriorLongitudinalDiameter){
       	this.anteriorLongitudinalDiameter=anteriorLongitudinalDiameter;
     }
     public String getAnteriorFontanelTensionCode(){
       	return this.anteriorFontanelTensionCode;
     }
     public void setAnteriorFontanelTensionCode(String anteriorFontanelTensionCode){
       	this.anteriorFontanelTensionCode=anteriorFontanelTensionCode;
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
     public Boolean getEyeAppearanceCheck(){
       	return this.eyeAppearanceCheck;
     }
     public void setEyeAppearanceCheck(Boolean eyeAppearanceCheck){
       	this.eyeAppearanceCheck=eyeAppearanceCheck;
     }
     public String getEyeAppearanceInspectionResults(){
       	return this.eyeAppearanceInspectionResults;
     }
     public void setEyeAppearanceInspectionResults(String eyeAppearanceInspectionResults){
       	this.eyeAppearanceInspectionResults=eyeAppearanceInspectionResults;
     }
     public Boolean getLimbActivityAbnormalSign(){
       	return this.limbActivityAbnormalSign;
     }
     public void setLimbActivityAbnormalSign(Boolean limbActivityAbnormalSign){
       	this.limbActivityAbnormalSign=limbActivityAbnormalSign;
     }
     public String getLimbMobilityAbnormalResults(){
       	return this.limbMobilityAbnormalResults;
     }
     public void setLimbMobilityAbnormalResults(String limbMobilityAbnormalResults){
       	this.limbMobilityAbnormalResults=limbMobilityAbnormalResults;
     }
     public Boolean getNeckMass(){
       	return this.neckMass;
     }
     public void setNeckMass(Boolean neckMass){
       	this.neckMass=neckMass;
     }
     public String getCervicalMassExaminationResults(){
       	return this.cervicalMassExaminationResults;
     }
     public void setCervicalMassExaminationResults(String cervicalMassExaminationResults){
       	this.cervicalMassExaminationResults=cervicalMassExaminationResults;
     }
     public Boolean getNasalExaminationAbnormalSigns(){
       	return this.nasalExaminationAbnormalSigns;
     }
     public void setNasalExaminationAbnormalSigns(Boolean nasalExaminationAbnormalSigns){
       	this.nasalExaminationAbnormalSigns=nasalExaminationAbnormalSigns;
     }
     public String getNasalExaminationResults(){
       	return this.nasalExaminationResults;
     }
     public void setNasalExaminationResults(String nasalExaminationResults){
       	this.nasalExaminationResults=nasalExaminationResults;
     }
     public Boolean getOralExaminationAbnormalSign(){
       	return this.oralExaminationAbnormalSign;
     }
     public void setOralExaminationAbnormalSign(Boolean oralExaminationAbnormalSign){
       	this.oralExaminationAbnormalSign=oralExaminationAbnormalSign;
     }
     public String getOralExaminationResults(){
       	return this.oralExaminationResults;
     }
     public void setOralExaminationResults(String oralExaminationResults){
       	this.oralExaminationResults=oralExaminationResults;
     }
     public Boolean getAnusAbnormalSign(){
       	return this.anusAbnormalSign;
     }
     public void setAnusAbnormalSign(Boolean anusAbnormalSign){
       	this.anusAbnormalSign=anusAbnormalSign;
     }
     public String getAnusExaminationResults(){
       	return this.anusExaminationResults;
     }
     public void setAnusExaminationResults(String anusExaminationResults){
       	this.anusExaminationResults=anusExaminationResults;
     }
     public Boolean getCardiacAuscultationAbnormalSign(){
       	return this.cardiacAuscultationAbnormalSign;
     }
     public void setCardiacAuscultationAbnormalSign(Boolean cardiacAuscultationAbnormalSign){
       	this.cardiacAuscultationAbnormalSign=cardiacAuscultationAbnormalSign;
     }
     public String getCardiacAuscultationResults(){
       	return this.cardiacAuscultationResults;
     }
     public void setCardiacAuscultationResults(String cardiacAuscultationResults){
       	this.cardiacAuscultationResults=cardiacAuscultationResults;
     }
     public Boolean getLungAuscultationAbnormalSign(){
       	return this.lungAuscultationAbnormalSign;
     }
     public void setLungAuscultationAbnormalSign(Boolean lungAuscultationAbnormalSign){
       	this.lungAuscultationAbnormalSign=lungAuscultationAbnormalSign;
     }
     public String getLungAuscultationResults(){
       	return this.lungAuscultationResults;
     }
     public void setLungAuscultationResults(String lungAuscultationResults){
       	this.lungAuscultationResults=lungAuscultationResults;
     }
     public Boolean getExternalGenitalOrgansAbnormalSign(){
       	return this.externalGenitalOrgansAbnormalSign;
     }
     public void setExternalGenitalOrgansAbnormalSign(Boolean externalGenitalOrgansAbnormalSign){
       	this.externalGenitalOrgansAbnormalSign=externalGenitalOrgansAbnormalSign;
     }
     public String getExternalGenitalOrgansResults(){
       	return this.externalGenitalOrgansResults;
     }
     public void setExternalGenitalOrgansResults(String externalGenitalOrgansResults){
       	this.externalGenitalOrgansResults=externalGenitalOrgansResults;
     }
     public Boolean getAbdominalPalpationAbnormalSign(){
       	return this.abdominalPalpationAbnormalSign;
     }
     public void setAbdominalPalpationAbnormalSign(Boolean abdominalPalpationAbnormalSign){
       	this.abdominalPalpationAbnormalSign=abdominalPalpationAbnormalSign;
     }
     public String getAbdominalPalpationResults(){
       	return this.abdominalPalpationResults;
     }
     public void setAbdominalPalpationResults(String abdominalPalpationResults){
       	this.abdominalPalpationResults=abdominalPalpationResults;
     }
     public Boolean getUmbilicalCord(){
       	return this.umbilicalCord;
     }
     public void setUmbilicalCord(Boolean umbilicalCord){
       	this.umbilicalCord=umbilicalCord;
     }
     public String getUmbilicalCordExaminationResultsCode(){
       	return this.umbilicalCordExaminationResultsCode;
     }
     public void setUmbilicalCordExaminationResultsCode(String umbilicalCordExaminationResultsCode){
       	this.umbilicalCordExaminationResultsCode=umbilicalCordExaminationResultsCode;
     }
     public Boolean getSpinalExaminationAbnormalSign(){
       	return this.spinalExaminationAbnormalSign;
     }
     public void setSpinalExaminationAbnormalSign(Boolean spinalExaminationAbnormalSign){
       	this.spinalExaminationAbnormalSign=spinalExaminationAbnormalSign;
     }
     public String getSpinalExaminationResults(){
       	return this.spinalExaminationResults;
     }
     public void setSpinalExaminationResults(String spinalExaminationResults){
       	this.spinalExaminationResults=spinalExaminationResults;
     }
     public String getHealthInstructionCode(){
       	return this.healthInstructionCode;
     }
     public void setHealthInstructionCode(String healthInstructionCode){
       	this.healthInstructionCode=healthInstructionCode;
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