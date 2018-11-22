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
@Table(name = BaseEntity.TABLE_PREFIX + "FIRST_PRENATAL_FOLLOWUP")
public class FirstPrenatalFollowup extends FhirResourceEntity {

    /**
     *名称:首次产前随访服务id
     *
 	 *
 	 *主键字段
     */
     @Column(name="FIRST_PRENATAL_FOLLOW_UP_SERVICE_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="FIRST_PRENATAL_FOLLOW_UP_SERVICE_ID",displayName="首次产前随访服务id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String firstPrenatalFollowUpServiceId;
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
     *名称:联系人关系代码
     *
 	 *限制:GBT4761
 	 *
     */
     @Column(name="RELATIONSHIP",length = 20,nullable = true)
     @FhirFieldValidate(name="RELATIONSHIP",displayName="联系人关系代码",maxLength=20,required=false,valuesRange="GBT4761")   
     private String relationship;
    /**
     *名称:联系人姓名
     *
 	 *
 	 *
     */
     @Column(name="CONTACTS_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="CONTACTS_NAME",displayName="联系人姓名",maxLength=20,required=false,valuesRange="")   
     private String contactsName;
    /**
     *名称:联系人电话号码
     *
 	 *
 	 *
     */
     @Column(name="CONTACTS_PHONE",length = 20,nullable = true)
     @FhirFieldValidate(name="CONTACTS_PHONE",displayName="联系人电话号码",maxLength=20,required=false,valuesRange="")   
     private String contactsPhone;
    /**
     *名称:孕次
     *
 	 *
 	 *
     */
     @Column(name="GRAVIDITY",length = 8,nullable = true)
     @FhirFieldValidate(name="GRAVIDITY",displayName="孕次",maxLength=8,required=false,valuesRange="")   
     private Float gravidity;
    /**
     *名称:产次
     *
 	 *
 	 *
     */
     @Column(name="PARITY",length = 8,nullable = true)
     @FhirFieldValidate(name="PARITY",displayName="产次",maxLength=8,required=false,valuesRange="")   
     private Float parity;
    /**
     *名称:阴道分娩次数
     *
 	 *
 	 *
     */
     @Column(name="VAGINAL_DELIVERY_TIMES",length = 8,nullable = true)
     @FhirFieldValidate(name="VAGINAL_DELIVERY_TIMES",displayName="阴道分娩次数",maxLength=8,required=false,valuesRange="")   
     private Float vaginalDeliveryTimes;
    /**
     *名称:阴道分娩次数
     *
 	 *
 	 *
     */
     @Column(name="CESAREAN_SECTION",length = 8,nullable = true)
     @FhirFieldValidate(name="CESAREAN_SECTION",displayName="阴道分娩次数",maxLength=8,required=false,valuesRange="")   
     private Float cesareanSection;
    /**
     *名称:末次月经日期明确标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_LAST_MENSTRUAL",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_LAST_MENSTRUAL",displayName="末次月经日期明确标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifLastMenstrual;
    /**
     *名称:预产期
     *
 	 *
 	 *
     */
     @Column(name="EXPECTED_CHILDBIRTH_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="EXPECTED_CHILDBIRTH_DATE",displayName="预产期",required=false,valuesRange="")   
     private Date expectedChildbirthDate;
    /**
     *名称:流产总次数
     *
 	 *
 	 *
     */
     @Column(name="ABORTION_TOTAL_NUMBER",length = 8,nullable = true)
     @FhirFieldValidate(name="ABORTION_TOTAL_NUMBER",displayName="流产总次数",maxLength=8,required=false,valuesRange="")   
     private Float abortionTotalNumber;
    /**
     *名称:死产例数
     *
 	 *
 	 *
     */
     @Column(name="STILLBIRTH_CASES_NUMBER",length = 8,nullable = true)
     @FhirFieldValidate(name="STILLBIRTH_CASES_NUMBER",displayName="死产例数",maxLength=8,required=false,valuesRange="")   
     private Float stillbirthCasesNumber;
    /**
     *名称:死胎例数
     *
 	 *
 	 *
     */
     @Column(name="CASES_NUMBER",length = 8,nullable = true)
     @FhirFieldValidate(name="CASES_NUMBER",displayName="死胎例数",maxLength=8,required=false,valuesRange="")   
     private Float casesNumber;
    /**
     *名称:新生儿死亡倒数
     *
 	 *
 	 *
     */
     @Column(name="NEONATAL_DEATH_RECIPROCAL",length = 8,nullable = true)
     @FhirFieldValidate(name="NEONATAL_DEATH_RECIPROCAL",displayName="新生儿死亡倒数",maxLength=8,required=false,valuesRange="")   
     private Float neonatalDeathReciprocal;
    /**
     *名称:出生缺陷儿例数
     *
 	 *
 	 *
     */
     @Column(name="BIRTH_DEFECTS_NUMBER",length = 8,nullable = true)
     @FhirFieldValidate(name="BIRTH_DEFECTS_NUMBER",displayName="出生缺陷儿例数",maxLength=8,required=false,valuesRange="")   
     private Float birthDefectsNumber;
    /**
     *名称:既往史
     *
 	 *
 	 *
     */
     @Column(name="HISTORY",columnDefinition="text")
     @FhirFieldValidate(name="HISTORY",displayName="既往史",required=false,valuesRange="")   
     private String history;
    /**
     *名称:妇科手术史标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_GYNECOLOGIC_SURGERY_HISTORY",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_GYNECOLOGIC_SURGERY_HISTORY",displayName="妇科手术史标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifGynecologicSurgeryHistory;
    /**
     *名称:妇科手术史
     *
 	 *
 	 *
     */
     @Column(name="GYNECOLOGIC_SURGERY_HISTORY",columnDefinition="text")
     @FhirFieldValidate(name="GYNECOLOGIC_SURGERY_HISTORY",displayName="妇科手术史",required=false,valuesRange="")   
     private String gynecologicSurgeryHistory;
    /**
     *名称:妊娠合并症/并发症史
     *
 	 *
 	 *
     */
     @Column(name="PREGNANCY_COMPLICATIONS",columnDefinition="text")
     @FhirFieldValidate(name="PREGNANCY_COMPLICATIONS",displayName="妊娠合并症/并发症史",required=false,valuesRange="")   
     private String pregnancyComplications;
    /**
     *名称:接触有害因素类别代码
     *
 	 *限制:CV0300403
 	 *
     */
     @Column(name="EXPOSURE_HAZARDOUS_FACTORS",length = 20,nullable = true)
     @FhirFieldValidate(name="EXPOSURE_HAZARDOUS_FACTORS",displayName="接触有害因素类别代码",maxLength=20,required=false,valuesRange="CV0300403")   
     private String exposureHazardousFactors;
    /**
     *名称:家族既往患病种类代码
     *
 	 *限制:CV0210005
 	 *
     */
     @Column(name="FAMILY_HISTORY_DISEASE",length = 20,nullable = true)
     @FhirFieldValidate(name="FAMILY_HISTORY_DISEASE",displayName="家族既往患病种类代码",maxLength=20,required=false,valuesRange="CV0210005")   
     private String familyHistoryDisease;
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
     *名称:体质指数
     *
 	 *
 	 *
     */
     @Column(name="BODY_MASS_INDEX",length = 40,nullable = true)
     @FhirFieldValidate(name="BODY_MASS_INDEX",displayName="体质指数",maxLength=40,required=false,valuesRange="")   
     private String bodyMassIndex;
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
     *名称:阴道异常标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="VAGINA_ABNORMAL_SIGN",length = 5,nullable = true)
     @FhirFieldValidate(name="VAGINA_ABNORMAL_SIGN",displayName="阴道异常标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean vaginaAbnormalSign;
    /**
     *名称:阴道异常描述
     *
 	 *
 	 *
     */
     @Column(name="VAGINA_ABNORMAL_DESCRIBE",length = 40,nullable = true)
     @FhirFieldValidate(name="VAGINA_ABNORMAL_DESCRIBE",displayName="阴道异常描述",maxLength=40,required=false,valuesRange="")   
     private String vaginaAbnormalDescribe;
    /**
     *名称:宫颈异常标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="CERVICAL_ABNORMAL_SIGN",length = 5,nullable = true)
     @FhirFieldValidate(name="CERVICAL_ABNORMAL_SIGN",displayName="宫颈异常标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean cervicalAbnormalSign;
    /**
     *名称:宫颈异常描述
     *
 	 *
 	 *
     */
     @Column(name="CERVICAL_ABNORMAL_DESCRIBE",length = 40,nullable = true)
     @FhirFieldValidate(name="CERVICAL_ABNORMAL_DESCRIBE",displayName="宫颈异常描述",maxLength=40,required=false,valuesRange="")   
     private String cervicalAbnormalDescribe;
    /**
     *名称:宫体异常标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="PALACE_ABNORMAL_SIGN",length = 5,nullable = true)
     @FhirFieldValidate(name="PALACE_ABNORMAL_SIGN",displayName="宫体异常标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean palaceAbnormalSign;
    /**
     *名称:宫体异常描述
     *
 	 *
 	 *
     */
     @Column(name="PALACE_ABNORMAL_DESCRIBE",length = 40,nullable = true)
     @FhirFieldValidate(name="PALACE_ABNORMAL_DESCRIBE",displayName="宫体异常描述",maxLength=40,required=false,valuesRange="")   
     private String palaceAbnormalDescribe;
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
     *名称:尿蛋白定量检测值（mg/24h）
     *
 	 *
 	 *
     */
     @Column(name="URINE_PROTEIN",length = 8,nullable = true)
     @FhirFieldValidate(name="URINE_PROTEIN",displayName="尿蛋白定量检测值（mg/24h）",maxLength=8,required=false,valuesRange="")   
     private Float urineProtein;
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
     *名称:尿糖定量检测（mmol/L）
     *
 	 *
 	 *
     */
     @Column(name="NIAOTANG",length = 8,nullable = true)
     @FhirFieldValidate(name="NIAOTANG",displayName="尿糖定量检测（mmol/L）",maxLength=8,required=false,valuesRange="")   
     private Float niaotang;
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
     *名称:白蛋白
     *
 	 *
 	 *
     */
     @Column(name="ALBUMIN",length = 8,nullable = true)
     @FhirFieldValidate(name="ALBUMIN",displayName="白蛋白",maxLength=8,required=false,valuesRange="")   
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
     *名称:ABO血型代码
     *
 	 *限制:CV0450005
 	 *
     */
     @Column(name="ABO_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="ABO_CD",displayName="ABO血型代码",maxLength=20,required=false,valuesRange="CV0450005")   
     private String aboCd;
    /**
     *名称:RH血型代码
     *
 	 *限制:CV0450020
 	 *
     */
     @Column(name="RH_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="RH_CD",displayName="RH血型代码",maxLength=20,required=false,valuesRange="CV0450020")   
     private String rhCd;
    /**
     *名称:阴道分泌物检查结果代码
     *
 	 *限制:CV0450019
 	 *
     */
     @Column(name="VAGINAL_SECRETION_EXAMINATION_RESULT_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="VAGINAL_SECRETION_EXAMINATION_RESULT_CODE",displayName="阴道分泌物检查结果代码",maxLength=20,required=false,valuesRange="CV0450019")   
     private String vaginalSecretionExaminationResultCode;
    /**
     *名称:阴道分泌物清洁度代码
     *
 	 *限制:CV0450010
 	 *
     */
     @Column(name="VAGINAL_CLEANER_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="VAGINAL_CLEANER_CODE",displayName="阴道分泌物清洁度代码",maxLength=20,required=false,valuesRange="CV0450010")   
     private String vaginalCleanerCode;
    /**
     *名称:B超检查结果
     *
 	 *
 	 *
     */
     @Column(name="BSCAN_RESULT_DESCR",length = 100,nullable = true)
     @FhirFieldValidate(name="BSCAN_RESULT_DESCR",displayName="B超检查结果",maxLength=100,required=false,valuesRange="")   
     private String bscanResultDescr;
    /**
     *名称:孕产妇健康评估异常标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="MATERNAL_HEALTH_ASSESSMENT",length = 5,nullable = true)
     @FhirFieldValidate(name="MATERNAL_HEALTH_ASSESSMENT",displayName="孕产妇健康评估异常标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean maternalHealthAssessment;
    /**
     *名称:孕产妇健康评估异常结果描述
     *
 	 *
 	 *
     */
     @Column(name="MATERNAL_HEALTH_RESULT_DESCR",length = 100,nullable = true)
     @FhirFieldValidate(name="MATERNAL_HEALTH_RESULT_DESCR",displayName="孕产妇健康评估异常结果描述",maxLength=100,required=false,valuesRange="")   
     private String maternalHealthResultDescr;
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
    
     public String getFirstPrenatalFollowUpServiceId(){
       	return this.firstPrenatalFollowUpServiceId;
     }
     public void setFirstPrenatalFollowUpServiceId(String firstPrenatalFollowUpServiceId){
       	this.firstPrenatalFollowUpServiceId=firstPrenatalFollowUpServiceId;
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
     public String getRelationship(){
       	return this.relationship;
     }
     public void setRelationship(String relationship){
       	this.relationship=relationship;
     }
     public String getContactsName(){
       	return this.contactsName;
     }
     public void setContactsName(String contactsName){
       	this.contactsName=contactsName;
     }
     public String getContactsPhone(){
       	return this.contactsPhone;
     }
     public void setContactsPhone(String contactsPhone){
       	this.contactsPhone=contactsPhone;
     }
     public Float getGravidity(){
       	return this.gravidity;
     }
     public void setGravidity(Float gravidity){
       	this.gravidity=gravidity;
     }
     public Float getParity(){
       	return this.parity;
     }
     public void setParity(Float parity){
       	this.parity=parity;
     }
     public Float getVaginalDeliveryTimes(){
       	return this.vaginalDeliveryTimes;
     }
     public void setVaginalDeliveryTimes(Float vaginalDeliveryTimes){
       	this.vaginalDeliveryTimes=vaginalDeliveryTimes;
     }
     public Float getCesareanSection(){
       	return this.cesareanSection;
     }
     public void setCesareanSection(Float cesareanSection){
       	this.cesareanSection=cesareanSection;
     }
     public Boolean getIfLastMenstrual(){
       	return this.ifLastMenstrual;
     }
     public void setIfLastMenstrual(Boolean ifLastMenstrual){
       	this.ifLastMenstrual=ifLastMenstrual;
     }
     public Date getExpectedChildbirthDate(){
       	return this.expectedChildbirthDate;
     }
     public void setExpectedChildbirthDate(Date expectedChildbirthDate){
       	this.expectedChildbirthDate=expectedChildbirthDate;
     }
     public Float getAbortionTotalNumber(){
       	return this.abortionTotalNumber;
     }
     public void setAbortionTotalNumber(Float abortionTotalNumber){
       	this.abortionTotalNumber=abortionTotalNumber;
     }
     public Float getStillbirthCasesNumber(){
       	return this.stillbirthCasesNumber;
     }
     public void setStillbirthCasesNumber(Float stillbirthCasesNumber){
       	this.stillbirthCasesNumber=stillbirthCasesNumber;
     }
     public Float getCasesNumber(){
       	return this.casesNumber;
     }
     public void setCasesNumber(Float casesNumber){
       	this.casesNumber=casesNumber;
     }
     public Float getNeonatalDeathReciprocal(){
       	return this.neonatalDeathReciprocal;
     }
     public void setNeonatalDeathReciprocal(Float neonatalDeathReciprocal){
       	this.neonatalDeathReciprocal=neonatalDeathReciprocal;
     }
     public Float getBirthDefectsNumber(){
       	return this.birthDefectsNumber;
     }
     public void setBirthDefectsNumber(Float birthDefectsNumber){
       	this.birthDefectsNumber=birthDefectsNumber;
     }
     public String getHistory(){
       	return this.history;
     }
     public void setHistory(String history){
       	this.history=history;
     }
     public Boolean getIfGynecologicSurgeryHistory(){
       	return this.ifGynecologicSurgeryHistory;
     }
     public void setIfGynecologicSurgeryHistory(Boolean ifGynecologicSurgeryHistory){
       	this.ifGynecologicSurgeryHistory=ifGynecologicSurgeryHistory;
     }
     public String getGynecologicSurgeryHistory(){
       	return this.gynecologicSurgeryHistory;
     }
     public void setGynecologicSurgeryHistory(String gynecologicSurgeryHistory){
       	this.gynecologicSurgeryHistory=gynecologicSurgeryHistory;
     }
     public String getPregnancyComplications(){
       	return this.pregnancyComplications;
     }
     public void setPregnancyComplications(String pregnancyComplications){
       	this.pregnancyComplications=pregnancyComplications;
     }
     public String getExposureHazardousFactors(){
       	return this.exposureHazardousFactors;
     }
     public void setExposureHazardousFactors(String exposureHazardousFactors){
       	this.exposureHazardousFactors=exposureHazardousFactors;
     }
     public String getFamilyHistoryDisease(){
       	return this.familyHistoryDisease;
     }
     public void setFamilyHistoryDisease(String familyHistoryDisease){
       	this.familyHistoryDisease=familyHistoryDisease;
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
     public String getBodyMassIndex(){
       	return this.bodyMassIndex;
     }
     public void setBodyMassIndex(String bodyMassIndex){
       	this.bodyMassIndex=bodyMassIndex;
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
     public Boolean getVaginaAbnormalSign(){
       	return this.vaginaAbnormalSign;
     }
     public void setVaginaAbnormalSign(Boolean vaginaAbnormalSign){
       	this.vaginaAbnormalSign=vaginaAbnormalSign;
     }
     public String getVaginaAbnormalDescribe(){
       	return this.vaginaAbnormalDescribe;
     }
     public void setVaginaAbnormalDescribe(String vaginaAbnormalDescribe){
       	this.vaginaAbnormalDescribe=vaginaAbnormalDescribe;
     }
     public Boolean getCervicalAbnormalSign(){
       	return this.cervicalAbnormalSign;
     }
     public void setCervicalAbnormalSign(Boolean cervicalAbnormalSign){
       	this.cervicalAbnormalSign=cervicalAbnormalSign;
     }
     public String getCervicalAbnormalDescribe(){
       	return this.cervicalAbnormalDescribe;
     }
     public void setCervicalAbnormalDescribe(String cervicalAbnormalDescribe){
       	this.cervicalAbnormalDescribe=cervicalAbnormalDescribe;
     }
     public Boolean getPalaceAbnormalSign(){
       	return this.palaceAbnormalSign;
     }
     public void setPalaceAbnormalSign(Boolean palaceAbnormalSign){
       	this.palaceAbnormalSign=palaceAbnormalSign;
     }
     public String getPalaceAbnormalDescribe(){
       	return this.palaceAbnormalDescribe;
     }
     public void setPalaceAbnormalDescribe(String palaceAbnormalDescribe){
       	this.palaceAbnormalDescribe=palaceAbnormalDescribe;
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
     public Float getUrineProtein(){
       	return this.urineProtein;
     }
     public void setUrineProtein(Float urineProtein){
       	this.urineProtein=urineProtein;
     }
     public String getUrineProteinQualitativeTestResultCode(){
       	return this.urineProteinQualitativeTestResultCode;
     }
     public void setUrineProteinQualitativeTestResultCode(String urineProteinQualitativeTestResultCode){
       	this.urineProteinQualitativeTestResultCode=urineProteinQualitativeTestResultCode;
     }
     public Float getNiaotang(){
       	return this.niaotang;
     }
     public void setNiaotang(Float niaotang){
       	this.niaotang=niaotang;
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
     public String getAboCd(){
       	return this.aboCd;
     }
     public void setAboCd(String aboCd){
       	this.aboCd=aboCd;
     }
     public String getRhCd(){
       	return this.rhCd;
     }
     public void setRhCd(String rhCd){
       	this.rhCd=rhCd;
     }
     public String getVaginalSecretionExaminationResultCode(){
       	return this.vaginalSecretionExaminationResultCode;
     }
     public void setVaginalSecretionExaminationResultCode(String vaginalSecretionExaminationResultCode){
       	this.vaginalSecretionExaminationResultCode=vaginalSecretionExaminationResultCode;
     }
     public String getVaginalCleanerCode(){
       	return this.vaginalCleanerCode;
     }
     public void setVaginalCleanerCode(String vaginalCleanerCode){
       	this.vaginalCleanerCode=vaginalCleanerCode;
     }
     public String getBscanResultDescr(){
       	return this.bscanResultDescr;
     }
     public void setBscanResultDescr(String bscanResultDescr){
       	this.bscanResultDescr=bscanResultDescr;
     }
     public Boolean getMaternalHealthAssessment(){
       	return this.maternalHealthAssessment;
     }
     public void setMaternalHealthAssessment(Boolean maternalHealthAssessment){
       	this.maternalHealthAssessment=maternalHealthAssessment;
     }
     public String getMaternalHealthResultDescr(){
       	return this.maternalHealthResultDescr;
     }
     public void setMaternalHealthResultDescr(String maternalHealthResultDescr){
       	this.maternalHealthResultDescr=maternalHealthResultDescr;
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