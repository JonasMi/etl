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
@Table(name = BaseEntity.TABLE_PREFIX + "CHILDREN_PHYSICAL_EXAMINATION")
public class ChildrenPhysicalExamination extends FhirResourceEntity {

    /**
     *名称:儿童健康体检id
     *
 	 *
 	 *主键字段
     */
     @Column(name="CHILDREN_PHYSICAL_EXAMINATION_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="CHILDREN_PHYSICAL_EXAMINATION_ID",displayName="儿童健康体检id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String childrenPhysicalExaminationId;
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
     *名称:新生儿面色代码
     *
 	 *限制:CV0410008
 	 *
     */
     @Column(name="FACE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="FACE_CODE",displayName="新生儿面色代码",maxLength=20,required=false,valuesRange="CV0410008")   
     private String faceCode;
    /**
     *名称:可疑佝偻病症状代码
     *
 	 *限制:CV0410021
 	 *
     */
     @Column(name="RICKETS_SYMPTOM_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="RICKETS_SYMPTOM_CODE",displayName="可疑佝偻病症状代码",maxLength=20,required=false,valuesRange="CV0410021")   
     private String ricketsSymptomCode;
    /**
     *名称:可疑佝偻病体征代码
     *
 	 *限制:CV0410022
 	 *
     */
     @Column(name="RICKETS_SIGN_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="RICKETS_SIGN_CODE",displayName="可疑佝偻病体征代码",maxLength=20,required=false,valuesRange="CV0410022")   
     private String ricketsSignCode;
    /**
     *名称:皮肤检查异常标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="SKIN_INSPECT_ABNORMAL_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="SKIN_INSPECT_ABNORMAL_MARK",displayName="皮肤检查异常标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean skinInspectAbnormalMark;
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
     *名称:新生儿听力筛查结果代码
     *
 	 *限制:CV9900025
 	 *
     */
     @Column(name="HEARING_SCREENING_RESULTS_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="HEARING_SCREENING_RESULTS_CODE",displayName="新生儿听力筛查结果代码",maxLength=20,required=false,valuesRange="CV9900025")   
     private String hearingScreeningResultsCode;
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
     *名称:出牙数
     *
 	 *
 	 *
     */
     @Column(name="TEETHING_NUM",length = 8,nullable = true)
     @FhirFieldValidate(name="TEETHING_NUM",displayName="出牙数",maxLength=8,required=false,valuesRange="")   
     private Float teethingNum;
    /**
     *名称:龋齿数
     *
 	 *
 	 *
     */
     @Column(name="DENTAL_CARIES_NUM",length = 8,nullable = true)
     @FhirFieldValidate(name="DENTAL_CARIES_NUM",displayName="龋齿数",maxLength=8,required=false,valuesRange="")   
     private Float dentalCariesNum;
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
     *名称:户外活动时长
     *
 	 *
 	 *
     */
     @Column(name="OUTDOOR_ACTIVITY_LENGTH",length = 8,nullable = true)
     @FhirFieldValidate(name="OUTDOOR_ACTIVITY_LENGTH",displayName="户外活动时长",maxLength=8,required=false,valuesRange="")   
     private Float outdoorActivityLength;
    /**
     *名称:两次随访间患病标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="TWO_FOLLOW_UP_VISITS_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="TWO_FOLLOW_UP_VISITS_MARK",displayName="两次随访间患病标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean twoFollowUpVisitsMark;
    /**
     *名称:两次随访间患肺炎住院次数
     *
 	 *
 	 *
     */
     @Column(name="PNEUMONIA_TIMES",length = 4,nullable = true)
     @FhirFieldValidate(name="PNEUMONIA_TIMES",displayName="两次随访间患肺炎住院次数",maxLength=4,required=false,valuesRange="")   
     private Integer pneumoniaTimes;
    /**
     *名称:两次随访间患腹泻住院次数
     *
 	 *
 	 *
     */
     @Column(name="DIARRHEA_TIMES",length = 4,nullable = true)
     @FhirFieldValidate(name="DIARRHEA_TIMES",displayName="两次随访间患腹泻住院次数",maxLength=4,required=false,valuesRange="")   
     private Integer diarrheaTimes;
    /**
     *名称:两次随访间因外伤住院次数
     *
 	 *
 	 *
     */
     @Column(name="TRAUMA_TIMES",length = 4,nullable = true)
     @FhirFieldValidate(name="TRAUMA_TIMES",displayName="两次随访间因外伤住院次数",maxLength=4,required=false,valuesRange="")   
     private Integer traumaTimes;
    /**
     *名称:两次随访间患其他疾病情况
     *
 	 *
 	 *
     */
     @Column(name="OTHER_DISEASE_CONDITION",length = 40,nullable = true)
     @FhirFieldValidate(name="OTHER_DISEASE_CONDITION",displayName="两次随访间患其他疾病情况",maxLength=40,required=false,valuesRange="")   
     private String otherDiseaseCondition;
    /**
     *名称:血红蛋白(g/L)
     *
 	 *
 	 *
     */
     @Column(name="HEMOGLOBIN",length = 8,nullable = true)
     @FhirFieldValidate(name="HEMOGLOBIN",displayName="血红蛋白(g/L)",maxLength=8,required=false,valuesRange="")   
     private Float hemoglobin;
    /**
     *名称:年龄别身高评价结果代码
     *
 	 *限制:CV0510006
 	 *
     */
     @Column(name="HEIGHT_EVALUATION_RESULT_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="HEIGHT_EVALUATION_RESULT_CODE",displayName="年龄别身高评价结果代码",maxLength=20,required=false,valuesRange="CV0510006")   
     private String heightEvaluationResultCode;
    /**
     *名称:年龄别体重评价结果代码
     *
 	 *限制:CV0510006
 	 *
     */
     @Column(name="WEIGHT_EVALUATION_RESULT_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="WEIGHT_EVALUATION_RESULT_CODE",displayName="年龄别体重评价结果代码",maxLength=20,required=false,valuesRange="CV0510006")   
     private String weightEvaluationResultCode;
    /**
     *名称:体格发育评价代码
     *
 	 *限制:CV0510006
 	 *
     */
     @Column(name="PHYSIQUE_EVALUATION_RESULT_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="PHYSIQUE_EVALUATION_RESULT_CODE",displayName="体格发育评价代码",maxLength=20,required=false,valuesRange="CV0510006")   
     private String physiqueEvaluationResultCode;
    /**
     *名称:儿童发育评估通过标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="CHILD_EVALUATION_ADOPT_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="CHILD_EVALUATION_ADOPT_MARK",displayName="儿童发育评估通过标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean childEvaluationAdoptMark;
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
     *名称:频率代码
     *
 	 *限制:CV9900341
 	 *
     */
     @Column(name="FREQ_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="FREQ_CODE",displayName="频率代码",maxLength=20,required=false,valuesRange="CV9900341")   
     private String freqCode;
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
    
     public String getChildrenPhysicalExaminationId(){
       	return this.childrenPhysicalExaminationId;
     }
     public void setChildrenPhysicalExaminationId(String childrenPhysicalExaminationId){
       	this.childrenPhysicalExaminationId=childrenPhysicalExaminationId;
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
     public String getFaceCode(){
       	return this.faceCode;
     }
     public void setFaceCode(String faceCode){
       	this.faceCode=faceCode;
     }
     public String getRicketsSymptomCode(){
       	return this.ricketsSymptomCode;
     }
     public void setRicketsSymptomCode(String ricketsSymptomCode){
       	this.ricketsSymptomCode=ricketsSymptomCode;
     }
     public String getRicketsSignCode(){
       	return this.ricketsSignCode;
     }
     public void setRicketsSignCode(String ricketsSignCode){
       	this.ricketsSignCode=ricketsSignCode;
     }
     public Boolean getSkinInspectAbnormalMark(){
       	return this.skinInspectAbnormalMark;
     }
     public void setSkinInspectAbnormalMark(Boolean skinInspectAbnormalMark){
       	this.skinInspectAbnormalMark=skinInspectAbnormalMark;
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
     public String getHearingScreeningResultsCode(){
       	return this.hearingScreeningResultsCode;
     }
     public void setHearingScreeningResultsCode(String hearingScreeningResultsCode){
       	this.hearingScreeningResultsCode=hearingScreeningResultsCode;
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
     public Float getTeethingNum(){
       	return this.teethingNum;
     }
     public void setTeethingNum(Float teethingNum){
       	this.teethingNum=teethingNum;
     }
     public Float getDentalCariesNum(){
       	return this.dentalCariesNum;
     }
     public void setDentalCariesNum(Float dentalCariesNum){
       	this.dentalCariesNum=dentalCariesNum;
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
     public Float getOutdoorActivityLength(){
       	return this.outdoorActivityLength;
     }
     public void setOutdoorActivityLength(Float outdoorActivityLength){
       	this.outdoorActivityLength=outdoorActivityLength;
     }
     public Boolean getTwoFollowUpVisitsMark(){
       	return this.twoFollowUpVisitsMark;
     }
     public void setTwoFollowUpVisitsMark(Boolean twoFollowUpVisitsMark){
       	this.twoFollowUpVisitsMark=twoFollowUpVisitsMark;
     }
     public Integer getPneumoniaTimes(){
       	return this.pneumoniaTimes;
     }
     public void setPneumoniaTimes(Integer pneumoniaTimes){
       	this.pneumoniaTimes=pneumoniaTimes;
     }
     public Integer getDiarrheaTimes(){
       	return this.diarrheaTimes;
     }
     public void setDiarrheaTimes(Integer diarrheaTimes){
       	this.diarrheaTimes=diarrheaTimes;
     }
     public Integer getTraumaTimes(){
       	return this.traumaTimes;
     }
     public void setTraumaTimes(Integer traumaTimes){
       	this.traumaTimes=traumaTimes;
     }
     public String getOtherDiseaseCondition(){
       	return this.otherDiseaseCondition;
     }
     public void setOtherDiseaseCondition(String otherDiseaseCondition){
       	this.otherDiseaseCondition=otherDiseaseCondition;
     }
     public Float getHemoglobin(){
       	return this.hemoglobin;
     }
     public void setHemoglobin(Float hemoglobin){
       	this.hemoglobin=hemoglobin;
     }
     public String getHeightEvaluationResultCode(){
       	return this.heightEvaluationResultCode;
     }
     public void setHeightEvaluationResultCode(String heightEvaluationResultCode){
       	this.heightEvaluationResultCode=heightEvaluationResultCode;
     }
     public String getWeightEvaluationResultCode(){
       	return this.weightEvaluationResultCode;
     }
     public void setWeightEvaluationResultCode(String weightEvaluationResultCode){
       	this.weightEvaluationResultCode=weightEvaluationResultCode;
     }
     public String getPhysiqueEvaluationResultCode(){
       	return this.physiqueEvaluationResultCode;
     }
     public void setPhysiqueEvaluationResultCode(String physiqueEvaluationResultCode){
       	this.physiqueEvaluationResultCode=physiqueEvaluationResultCode;
     }
     public Boolean getChildEvaluationAdoptMark(){
       	return this.childEvaluationAdoptMark;
     }
     public void setChildEvaluationAdoptMark(Boolean childEvaluationAdoptMark){
       	this.childEvaluationAdoptMark=childEvaluationAdoptMark;
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
     public String getFreqCode(){
       	return this.freqCode;
     }
     public void setFreqCode(String freqCode){
       	this.freqCode=freqCode;
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