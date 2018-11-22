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
@Table(name = BaseEntity.TABLE_PREFIX + "ANAESTHESIA_RECORD")
public class AnaesthesiaRecord extends FhirResourceEntity {

    /**
     *名称:院内麻醉记录id
     *
 	 *
 	 *
     */
     @Column(name="ANAESTHESIA_RECORD_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="ANAESTHESIA_RECORD_ID",displayName="院内麻醉记录id",maxLength=40,required=true,valuesRange="")   
     private String anaesthesiaRecordId;
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
     *名称:电话号码
     *
 	 *
 	 *
     */
     @Column(name="TELECOM",length = 20,nullable = true)
     @FhirFieldValidate(name="TELECOM",displayName="电话号码",maxLength=20,required=false,valuesRange="")   
     private String telecom;
    /**
     *名称:年龄
     *
 	 *
 	 *
     */
     @Column(name="AGE",length = 8,nullable = true)
     @FhirFieldValidate(name="AGE",displayName="年龄",maxLength=8,required=false,valuesRange="")   
     private Float age;
    /**
     *名称:患者类型
     *
 	 *限制:CV0900404
 	 *
     */
     @Column(name="PATIENT_TYPE",length = 20,nullable = true)
     @FhirFieldValidate(name="PATIENT_TYPE",displayName="患者类型",maxLength=20,required=false,valuesRange="CV0900404")   
     private String patientType;
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
     *名称:门诊或住院标识
     *
 	 *限制:CUS00010
 	 *
     */
     @Column(name="VISIT_MARK",length = 10,nullable = false)
     @FhirFieldValidate(name="VISIT_MARK",displayName="门诊或住院标识",maxLength=10,required=true,valuesRange="CUS00010")   
     private String visitMark;
    /**
     *名称:就诊流水号
     *
 	 *
 	 *
     */
     @Column(name="REGISTRATION_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="REGISTRATION_ID",displayName="就诊流水号",maxLength=40,required=true,valuesRange="")   
     private String registrationId;
    /**
     *名称:入院时间
     *
 	 *
 	 *
     */
     @Column(name="START",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="START",displayName="入院时间",required=false,valuesRange="")   
     private Date start;
    /**
     *名称:住院号
     *
 	 *
 	 *
     */
     @Column(name="INH_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="INH_ID",displayName="住院号",maxLength=40,required=false,valuesRange="")   
     private String inhId;
    /**
     *名称:就诊时间
     *
 	 *
 	 *
     */
     @Column(name="VISITING_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="VISITING_TIME",displayName="就诊时间",required=false,valuesRange="")   
     private Date visitingTime;
    /**
     *名称:就诊科室id
     *
 	 *
 	 *
     */
     @Column(name="VISITING_DEPT_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="VISITING_DEPT_ID",displayName="就诊科室id",maxLength=40,required=false,valuesRange="")   
     private String visitingDeptId;
    /**
     *名称:就诊科室名称
     *
 	 *
 	 *
     */
     @Column(name="VISITING_DEPT_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="VISITING_DEPT_NAME",displayName="就诊科室名称",maxLength=40,required=false,valuesRange="")   
     private String visitingDeptName;
    /**
     *名称:就诊科室标准编码
     *
 	 *限制:CV9900051
 	 *
     */
     @Column(name="VISITING_DEPT_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="VISITING_DEPT_CD",displayName="就诊科室标准编码",maxLength=20,required=false,valuesRange="CV9900051")   
     private String visitingDeptCd;
    /**
     *名称:就诊类型
     *
 	 *限制:CV9900340
 	 *
     */
     @Column(name="VISITING_TYPE",length = 20,nullable = true)
     @FhirFieldValidate(name="VISITING_TYPE",displayName="就诊类型",maxLength=20,required=false,valuesRange="CV9900340")   
     private String visitingType;
    /**
     *名称:病房号
     *
 	 *
 	 *
     */
     @Column(name="WARD_NO",length = 20,nullable = true)
     @FhirFieldValidate(name="WARD_NO",displayName="病房号",maxLength=20,required=false,valuesRange="")   
     private String wardNo;
    /**
     *名称:病区
     *
 	 *
 	 *
     */
     @Column(name="WARD_AREA",length = 40,nullable = true)
     @FhirFieldValidate(name="WARD_AREA",displayName="病区",maxLength=40,required=false,valuesRange="")   
     private String wardArea;
    /**
     *名称:床位号
     *
 	 *
 	 *
     */
     @Column(name="BED_NUM",length = 20,nullable = true)
     @FhirFieldValidate(name="BED_NUM",displayName="床位号",maxLength=20,required=false,valuesRange="")   
     private String bedNum;
    /**
     *名称:麻醉医师id
     *
 	 *
 	 *
     */
     @Column(name="ANAESTHETIC",length = 40,nullable = true)
     @FhirFieldValidate(name="ANAESTHETIC",displayName="麻醉医师id",maxLength=40,required=false,valuesRange="")   
     private String anaesthetic;
    /**
     *名称:麻醉医师姓名
     *
 	 *
 	 *
     */
     @Column(name="ANAESTHETIC_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="ANAESTHETIC_NAME",displayName="麻醉医师姓名",maxLength=20,required=false,valuesRange="")   
     private String anaestheticName;
    /**
     *名称:麻醉医师签名日期
     *
 	 *
 	 *
     */
     @Column(name="ANAESTHETIC_SIGN_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="ANAESTHETIC_SIGN_DATE",displayName="麻醉医师签名日期",required=false,valuesRange="")   
     private Date anaestheticSignDate;
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
     *名称:术前诊断-诊断编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="PREOPERATIVE_DIAGNOSIS",length = 20,nullable = true)
     @FhirFieldValidate(name="PREOPERATIVE_DIAGNOSIS",displayName="术前诊断-诊断编码",maxLength=20,required=false,valuesRange="CV990111")   
     private String preoperativeDiagnosis;
    /**
     *名称:术前诊断-诊断编码名称
     *
 	 *
 	 *
     */
     @Column(name="PREOPERATIVE_DIAGNOSIS_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="PREOPERATIVE_DIAGNOSIS_NAME",displayName="术前诊断-诊断编码名称",maxLength=40,required=false,valuesRange="")   
     private String preoperativeDiagnosisName;
    /**
     *名称:术前诊断-诊断日期
     *
 	 *
 	 *
     */
     @Column(name="PREOPERATIVE_DIAGNOSIS_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="PREOPERATIVE_DIAGNOSIS_DATE",displayName="术前诊断-诊断日期",required=false,valuesRange="")   
     private Date preoperativeDiagnosisDate;
    /**
     *名称:术后诊断-诊断编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="AFTER_OPERATION_DIAGNOSIS",length = 20,nullable = true)
     @FhirFieldValidate(name="AFTER_OPERATION_DIAGNOSIS",displayName="术后诊断-诊断编码",maxLength=20,required=false,valuesRange="CV990111")   
     private String afterOperationDiagnosis;
    /**
     *名称:术后诊断-诊断编码名称
     *
 	 *
 	 *
     */
     @Column(name="AFTER_OPERATION_DIAGNOSIS_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="AFTER_OPERATION_DIAGNOSIS_NAME",displayName="术后诊断-诊断编码名称",maxLength=40,required=false,valuesRange="")   
     private String afterOperationDiagnosisName;
    /**
     *名称:术后诊断-诊断日期
     *
 	 *
 	 *
     */
     @Column(name="AFTER_OPERATION_DIAGNOSIS_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="AFTER_OPERATION_DIAGNOSIS_DATE",displayName="术后诊断-诊断日期",required=false,valuesRange="")   
     private Date afterOperationDiagnosisDate;
    /**
     *名称:药物用法
     *
 	 *
 	 *
     */
     @Column(name="DRUGS_USAGE",length = 100,nullable = true)
     @FhirFieldValidate(name="DRUGS_USAGE",displayName="药物用法",maxLength=100,required=false,valuesRange="")   
     private String drugsUsage;
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
     @Column(name="DRUG_TOTAL_DOSE_UTIL",length = 20,nullable = true)
     @FhirFieldValidate(name="DRUG_TOTAL_DOSE_UTIL",displayName="药物使用总剂量单位",maxLength=20,required=false,valuesRange="")   
     private String drugTotalDoseUtil;
    /**
     *名称:商品名
     *
 	 *
 	 *
     */
     @Column(name="ALIAS_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="ALIAS_NAME",displayName="商品名",maxLength=40,required=false,valuesRange="")   
     private String aliasName;
    /**
     *名称:院内药品编码
     *
 	 *
 	 *
     */
     @Column(name="MEDICATION_CD",length = 40,nullable = true)
     @FhirFieldValidate(name="MEDICATION_CD",displayName="院内药品编码",maxLength=40,required=false,valuesRange="")   
     private String medicationCd;
    /**
     *名称:院内药品名称
     *
 	 *
 	 *
     */
     @Column(name="MEDICATION_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="MEDICATION_NAME",displayName="院内药品名称",maxLength=40,required=false,valuesRange="")   
     private String medicationName;
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
     *名称:术中输液项目
     *
 	 *
 	 *
     */
     @Column(name="OP_INFUSION_ITEM",length = 100,nullable = true)
     @FhirFieldValidate(name="OP_INFUSION_ITEM",displayName="术中输液项目",maxLength=100,required=false,valuesRange="")   
     private String opInfusionItem;
    /**
     *名称:输血日期时间
     *
 	 *
 	 *
     */
     @Column(name="BLOOD_TRANSF_DTIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="BLOOD_TRANSF_DTIME",displayName="输血日期时间",required=false,valuesRange="")   
     private Date bloodTransfDtime;
    /**
     *名称:输血量
     *
 	 *
 	 *
     */
     @Column(name="TRANSFUSION_ITEM_AMOUNT",length = 8,nullable = true)
     @FhirFieldValidate(name="TRANSFUSION_ITEM_AMOUNT",displayName="输血量",maxLength=8,required=false,valuesRange="")   
     private Float transfusionItemAmount;
    /**
     *名称:输血量计量单位
     *
 	 *
 	 *
     */
     @Column(name="TRANSFUSION_ITEM_UNIT",length = 20,nullable = true)
     @FhirFieldValidate(name="TRANSFUSION_ITEM_UNIT",displayName="输血量计量单位",maxLength=20,required=false,valuesRange="")   
     private String transfusionItemUnit;
    /**
     *名称:输血反应标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="TRANSFUSE_REACTION_FLAG",length = 5,nullable = true)
     @FhirFieldValidate(name="TRANSFUSE_REACTION_FLAG",displayName="输血反应标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean transfuseReactionFlag;
    /**
     *名称:ASA分级标准代码
     *
 	 *限制:CV9900329
 	 *
     */
     @Column(name="ASA_GRADING_STANDARD_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="ASA_GRADING_STANDARD_CODE",displayName="ASA分级标准代码",maxLength=20,required=false,valuesRange="CV9900329")   
     private String asaGradingStandardCode;
    /**
     *名称:气管插管分类
     *备注:标识全身麻醉时气管插管分类的描述
 	 *
 	 *
     */
     @Column(name="TRACHEA_CANNULA_CLASS",length = 40,nullable = true)
     @FhirFieldValidate(name="TRACHEA_CANNULA_CLASS",displayName="气管插管分类",maxLength=40,required=false,valuesRange="")   
     private String tracheaCannulaClass;
    /**
     *名称:麻醉药物名称
     *
 	 *
 	 *
     */
     @Column(name="ANES_DRUG_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="ANES_DRUG_NAME",displayName="麻醉药物名称",maxLength=40,required=false,valuesRange="")   
     private String anesDrugName;
    /**
     *名称:呼吸类型代码
     *
 	 *限制:CV9900347
 	 *
     */
     @Column(name="BREATHE_TYPE_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="BREATHE_TYPE_CD",displayName="呼吸类型代码",maxLength=20,required=false,valuesRange="CV9900347")   
     private String breatheTypeCd;
    /**
     *名称:麻醉描述
     *
 	 *
 	 *
     */
     @Column(name="ANES_DESCR",length = 40,nullable = true)
     @FhirFieldValidate(name="ANES_DESCR",displayName="麻醉描述",maxLength=40,required=false,valuesRange="")   
     private String anesDescr;
    /**
     *名称:麻醉合并症标志代码
     *
 	 *限制:CV9900348
 	 *
     */
     @Column(name="ANES_COMP_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="ANES_COMP_CD",displayName="麻醉合并症标志代码",maxLength=20,required=false,valuesRange="CV9900348")   
     private String anesCompCd;
    /**
     *名称:穿刺过程
     *
 	 *
 	 *
     */
     @Column(name="PUNCTURE_PROCESS",length = 100,nullable = true)
     @FhirFieldValidate(name="PUNCTURE_PROCESS",displayName="穿刺过程",maxLength=100,required=false,valuesRange="")   
     private String punctureProcess;
    /**
     *名称:麻醉效果
     *
 	 *
 	 *
     */
     @Column(name="ANES_EFFECT",length = 100,nullable = true)
     @FhirFieldValidate(name="ANES_EFFECT",displayName="麻醉效果",maxLength=100,required=false,valuesRange="")   
     private String anesEffect;
    /**
     *名称:麻醉前用药
     *
 	 *
 	 *
     */
     @Column(name="ANES_PRE_DRUG",length = 100,nullable = true)
     @FhirFieldValidate(name="ANES_PRE_DRUG",displayName="麻醉前用药",maxLength=100,required=false,valuesRange="")   
     private String anesPreDrug;
    /**
     *名称:手术开始时间
     *
 	 *
 	 *
     */
     @Column(name="PROCEDURE_START",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="PROCEDURE_START",displayName="手术开始时间",required=false,valuesRange="")   
     private Date procedureStart;
    /**
     *名称:手术结束时间
     *
 	 *
 	 *
     */
     @Column(name="PROCEDURE_END",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="PROCEDURE_END",displayName="手术结束时间",required=false,valuesRange="")   
     private Date procedureEnd;
    /**
     *名称:手术间编号
     *
 	 *
 	 *
     */
     @Column(name="OP_ROOM",length = 20,nullable = true)
     @FhirFieldValidate(name="OP_ROOM",displayName="手术间编号",maxLength=20,required=false,valuesRange="")   
     private String opRoom;
    /**
     *名称:诊疗过程描述
     *
 	 *
 	 *
     */
     @Column(name="TREAT_RESCUE_COURSE",length = 500,nullable = true)
     @FhirFieldValidate(name="TREAT_RESCUE_COURSE",displayName="诊疗过程描述",maxLength=500,required=false,valuesRange="")   
     private String treatRescueCourse;
    /**
     *名称:电子申请单编号
     *
 	 *
 	 *
     */
     @Column(name="E_ORDER_NO",length = 40,nullable = true)
     @FhirFieldValidate(name="E_ORDER_NO",displayName="电子申请单编号",maxLength=40,required=false,valuesRange="")   
     private String eOrderNo;
    /**
     *名称:麻醉单id
     *
 	 *
 	 *
     */
     @Column(name="ANAESTHESIA_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="ANAESTHESIA_ID",displayName="麻醉单id",maxLength=40,required=false,valuesRange="")   
     private String anaesthesiaId;
    /**
     *名称:麻醉方法代码
     *
 	 *限制:CV0600103
 	 *
     */
     @Column(name="ANESTHESIA_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="ANESTHESIA_CODE",displayName="麻醉方法代码",maxLength=20,required=false,valuesRange="CV0600103")   
     private String anesthesiaCode;
    /**
     *名称:麻醉方法
     *
 	 *
 	 *
     */
     @Column(name="ANESTHESIA_WAY",length = 100,nullable = true)
     @FhirFieldValidate(name="ANESTHESIA_WAY",displayName="麻醉方法",maxLength=100,required=false,valuesRange="")   
     private String anesthesiaWay;
    /**
     *名称:手术编码
     *
 	 *限制:CV990113
 	 *
     */
     @Column(name="OPERATION_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="OPERATION_CD",displayName="手术编码",maxLength=20,required=false,valuesRange="CV990113")   
     private String operationCd;
    /**
     *名称:手术名称
     *
 	 *
 	 *
     */
     @Column(name="OPERATION_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="OPERATION_NAME",displayName="手术名称",maxLength=40,required=false,valuesRange="")   
     private String operationName;
    /**
     *名称:输血品种编码
     *
 	 *限制:CV530201
 	 *
     */
     @Column(name="TRANSFUSION_VARIETY_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="TRANSFUSION_VARIETY_CODE",displayName="输血品种编码",maxLength=20,required=false,valuesRange="CV530201")   
     private String transfusionVarietyCode;
    /**
     *名称:输血品种编码名称
     *
 	 *
 	 *
     */
     @Column(name="TRANSFUSION_VARIETY_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="TRANSFUSION_VARIETY_NAME",displayName="输血品种编码名称",maxLength=40,required=false,valuesRange="")   
     private String transfusionVarietyName;
    /**
     *名称:麻醉部位代码
     *
 	 *限制:CV0600227
 	 *
     */
     @Column(name="ANESTHESIA_SITE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="ANESTHESIA_SITE_CODE",displayName="麻醉部位代码",maxLength=20,required=false,valuesRange="CV0600227")   
     private String anesthesiaSiteCode;
    /**
     *名称:麻醉部位代码
     *
 	 *
 	 *
     */
     @Column(name="ANESTHESIA_SITE_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="ANESTHESIA_SITE_NAME",displayName="麻醉部位代码",maxLength=40,required=false,valuesRange="")   
     private String anesthesiaSiteName;
    /**
     *名称:手术操作目标部位代码
     *
 	 *限制:CV0600227
 	 *
     */
     @Column(name="PART_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="PART_CODE",displayName="手术操作目标部位代码",maxLength=20,required=false,valuesRange="CV0600227")   
     private String partCode;
    /**
     *名称:手术操作目标部位名称
     *
 	 *限制:CV0600227
 	 *
     */
     @Column(name="PART_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="PART_NAME",displayName="手术操作目标部位名称",maxLength=20,required=false,valuesRange="CV0600227")   
     private String partName;
    /**
     *名称:通知者id
     *
 	 *
 	 *
     */
     @Column(name="NOTIFY",length = 40,nullable = true)
     @FhirFieldValidate(name="NOTIFY",displayName="通知者id",maxLength=40,required=false,valuesRange="")   
     private String notify;
    /**
     *名称:手术者id
     *
 	 *
 	 *
     */
     @Column(name="OPERATIVE",length = 40,nullable = true)
     @FhirFieldValidate(name="OPERATIVE",displayName="手术者id",maxLength=40,required=false,valuesRange="")   
     private String operative;
    /**
     *名称:手术者姓名
     *
 	 *
 	 *
     */
     @Column(name="OPERATIVE_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="OPERATIVE_NAME",displayName="手术者姓名",maxLength=40,required=false,valuesRange="")   
     private String operativeName;
    /**
     *名称:麻醉开始时间
     *
 	 *
 	 *
     */
     @Column(name="ANESTHESIA_START_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="ANESTHESIA_START_TIME",displayName="麻醉开始时间",required=false,valuesRange="")   
     private Date anesthesiaStartTime;
    /**
     *名称:麻醉结束时间
     *
 	 *
 	 *
     */
     @Column(name="ANESTHESIA_END_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="ANESTHESIA_END_TIME",displayName="麻醉结束时间",required=false,valuesRange="")   
     private Date anesthesiaEndTime;
    /**
     *名称:常规监测项目名称
     *
 	 *
 	 *
     */
     @Column(name="ROUTE_MONITOR_ITEM_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="ROUTE_MONITOR_ITEM_NAME",displayName="常规监测项目名称",maxLength=40,required=false,valuesRange="")   
     private String routeMonitorItemName;
    /**
     *名称:常规监测项目结果
     *
 	 *
 	 *
     */
     @Column(name="ROUTE_MONITOR_ITEM_RESULT",length = 40,nullable = true)
     @FhirFieldValidate(name="ROUTE_MONITOR_ITEM_RESULT",displayName="常规监测项目结果",maxLength=40,required=false,valuesRange="")   
     private String routeMonitorItemResult;
    /**
     *名称:特殊监测项目名称
     *
 	 *
 	 *
     */
     @Column(name="SPEC_MONITOR_ITEM_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="SPEC_MONITOR_ITEM_NAME",displayName="特殊监测项目名称",maxLength=40,required=false,valuesRange="")   
     private String specMonitorItemName;
    /**
     *名称:特殊监测项目结果
     *
 	 *
 	 *
     */
     @Column(name="SPEC_MONITOR_ITEM_RESULT",length = 40,nullable = true)
     @FhirFieldValidate(name="SPEC_MONITOR_ITEM_RESULT",displayName="特殊监测项目结果",maxLength=40,required=false,valuesRange="")   
     private String specMonitorItemResult;
    /**
     *名称:体温
     *备注:单位：℃
 	 *
 	 *
     */
     @Column(name="BODY_TEMPERATURE",length = 8,nullable = true)
     @FhirFieldValidate(name="BODY_TEMPERATURE",displayName="体温",maxLength=8,required=false,valuesRange="")   
     private Float bodyTemperature;
    /**
     *名称:心率
     *备注:次/min
 	 *
 	 *
     */
     @Column(name="HEART_RATE",length = 8,nullable = true)
     @FhirFieldValidate(name="HEART_RATE",displayName="心率",maxLength=8,required=false,valuesRange="")   
     private Float heartRate;
    /**
     *名称:脉率
     *备注:次/min
 	 *
 	 *
     */
     @Column(name="PULSES",length = 8,nullable = true)
     @FhirFieldValidate(name="PULSES",displayName="脉率",maxLength=8,required=false,valuesRange="")   
     private Float pulses;
    /**
     *名称:呼吸频率
     *备注:次/min
 	 *
 	 *
     */
     @Column(name="BREATHING_RATE",length = 8,nullable = true)
     @FhirFieldValidate(name="BREATHING_RATE",displayName="呼吸频率",maxLength=8,required=false,valuesRange="")   
     private Float breathingRate;
    /**
     *名称:体重
     *备注:kg
 	 *
 	 *
     */
     @Column(name="WEIGHT",length = 8,nullable = true)
     @FhirFieldValidate(name="WEIGHT",displayName="体重",maxLength=8,required=false,valuesRange="")   
     private Float weight;
    /**
     *名称:收缩压
     *备注:mmHg
 	 *
 	 *
     */
     @Column(name="SBP",length = 8,nullable = true)
     @FhirFieldValidate(name="SBP",displayName="收缩压",maxLength=8,required=false,valuesRange="")   
     private Float sbp;
    /**
     *名称:舒张压
     *备注:mmHg
 	 *
 	 *
     */
     @Column(name="DBP",length = 8,nullable = true)
     @FhirFieldValidate(name="DBP",displayName="舒张压",maxLength=8,required=false,valuesRange="")   
     private Float dbp;
    /**
     *名称:出血量
     *备注:mL
 	 *
 	 *
     */
     @Column(name="LOSSBLOOD_AMOUNT",length = 8,nullable = true)
     @FhirFieldValidate(name="LOSSBLOOD_AMOUNT",displayName="出血量",maxLength=8,required=false,valuesRange="")   
     private Float lossbloodAmount;
    /**
     *名称:患者去向代码
     *
 	 *限制:CV9900291
 	 *
     */
     @Column(name="OUT_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="OUT_CODE",displayName="患者去向代码",maxLength=20,required=false,valuesRange="CV9900291")   
     private String outCode;
    /**
     *名称:备注
     *
 	 *
 	 *
     */
     @Column(name="REMARKS",columnDefinition="text")
     @FhirFieldValidate(name="REMARKS",displayName="备注",required=false,valuesRange="")   
     private String remarks;
    /**
     *名称:出手术室日期时间
     *
 	 *
 	 *
     */
     @Column(name="OUT_OPERATION_ROOM_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="OUT_OPERATION_ROOM_TIME",displayName="出手术室日期时间",required=false,valuesRange="")   
     private Date outOperationRoomTime;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getAnaesthesiaRecordId(){
       	return this.anaesthesiaRecordId;
     }
     public void setAnaesthesiaRecordId(String anaesthesiaRecordId){
       	this.anaesthesiaRecordId=anaesthesiaRecordId;
     }
     public Date getDate(){
       	return this.date;
     }
     public void setDate(Date date){
       	this.date=date;
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
     public String getTelecom(){
       	return this.telecom;
     }
     public void setTelecom(String telecom){
       	this.telecom=telecom;
     }
     public Float getAge(){
       	return this.age;
     }
     public void setAge(Float age){
       	this.age=age;
     }
     public String getPatientType(){
       	return this.patientType;
     }
     public void setPatientType(String patientType){
       	this.patientType=patientType;
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
     public String getVisitMark(){
       	return this.visitMark;
     }
     public void setVisitMark(String visitMark){
       	this.visitMark=visitMark;
     }
     public String getRegistrationId(){
       	return this.registrationId;
     }
     public void setRegistrationId(String registrationId){
       	this.registrationId=registrationId;
     }
     public Date getStart(){
       	return this.start;
     }
     public void setStart(Date start){
       	this.start=start;
     }
     public String getInhId(){
       	return this.inhId;
     }
     public void setInhId(String inhId){
       	this.inhId=inhId;
     }
     public Date getVisitingTime(){
       	return this.visitingTime;
     }
     public void setVisitingTime(Date visitingTime){
       	this.visitingTime=visitingTime;
     }
     public String getVisitingDeptId(){
       	return this.visitingDeptId;
     }
     public void setVisitingDeptId(String visitingDeptId){
       	this.visitingDeptId=visitingDeptId;
     }
     public String getVisitingDeptName(){
       	return this.visitingDeptName;
     }
     public void setVisitingDeptName(String visitingDeptName){
       	this.visitingDeptName=visitingDeptName;
     }
     public String getVisitingDeptCd(){
       	return this.visitingDeptCd;
     }
     public void setVisitingDeptCd(String visitingDeptCd){
       	this.visitingDeptCd=visitingDeptCd;
     }
     public String getVisitingType(){
       	return this.visitingType;
     }
     public void setVisitingType(String visitingType){
       	this.visitingType=visitingType;
     }
     public String getWardNo(){
       	return this.wardNo;
     }
     public void setWardNo(String wardNo){
       	this.wardNo=wardNo;
     }
     public String getWardArea(){
       	return this.wardArea;
     }
     public void setWardArea(String wardArea){
       	this.wardArea=wardArea;
     }
     public String getBedNum(){
       	return this.bedNum;
     }
     public void setBedNum(String bedNum){
       	this.bedNum=bedNum;
     }
     public String getAnaesthetic(){
       	return this.anaesthetic;
     }
     public void setAnaesthetic(String anaesthetic){
       	this.anaesthetic=anaesthetic;
     }
     public String getAnaestheticName(){
       	return this.anaestheticName;
     }
     public void setAnaestheticName(String anaestheticName){
       	this.anaestheticName=anaestheticName;
     }
     public Date getAnaestheticSignDate(){
       	return this.anaestheticSignDate;
     }
     public void setAnaestheticSignDate(Date anaestheticSignDate){
       	this.anaestheticSignDate=anaestheticSignDate;
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
     public String getPreoperativeDiagnosis(){
       	return this.preoperativeDiagnosis;
     }
     public void setPreoperativeDiagnosis(String preoperativeDiagnosis){
       	this.preoperativeDiagnosis=preoperativeDiagnosis;
     }
     public String getPreoperativeDiagnosisName(){
       	return this.preoperativeDiagnosisName;
     }
     public void setPreoperativeDiagnosisName(String preoperativeDiagnosisName){
       	this.preoperativeDiagnosisName=preoperativeDiagnosisName;
     }
     public Date getPreoperativeDiagnosisDate(){
       	return this.preoperativeDiagnosisDate;
     }
     public void setPreoperativeDiagnosisDate(Date preoperativeDiagnosisDate){
       	this.preoperativeDiagnosisDate=preoperativeDiagnosisDate;
     }
     public String getAfterOperationDiagnosis(){
       	return this.afterOperationDiagnosis;
     }
     public void setAfterOperationDiagnosis(String afterOperationDiagnosis){
       	this.afterOperationDiagnosis=afterOperationDiagnosis;
     }
     public String getAfterOperationDiagnosisName(){
       	return this.afterOperationDiagnosisName;
     }
     public void setAfterOperationDiagnosisName(String afterOperationDiagnosisName){
       	this.afterOperationDiagnosisName=afterOperationDiagnosisName;
     }
     public Date getAfterOperationDiagnosisDate(){
       	return this.afterOperationDiagnosisDate;
     }
     public void setAfterOperationDiagnosisDate(Date afterOperationDiagnosisDate){
       	this.afterOperationDiagnosisDate=afterOperationDiagnosisDate;
     }
     public String getDrugsUsage(){
       	return this.drugsUsage;
     }
     public void setDrugsUsage(String drugsUsage){
       	this.drugsUsage=drugsUsage;
     }
     public String getFreqCode(){
       	return this.freqCode;
     }
     public void setFreqCode(String freqCode){
       	this.freqCode=freqCode;
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
     public String getAliasName(){
       	return this.aliasName;
     }
     public void setAliasName(String aliasName){
       	this.aliasName=aliasName;
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
     public String getDosageCode(){
       	return this.dosageCode;
     }
     public void setDosageCode(String dosageCode){
       	this.dosageCode=dosageCode;
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
     public String getOpInfusionItem(){
       	return this.opInfusionItem;
     }
     public void setOpInfusionItem(String opInfusionItem){
       	this.opInfusionItem=opInfusionItem;
     }
     public Date getBloodTransfDtime(){
       	return this.bloodTransfDtime;
     }
     public void setBloodTransfDtime(Date bloodTransfDtime){
       	this.bloodTransfDtime=bloodTransfDtime;
     }
     public Float getTransfusionItemAmount(){
       	return this.transfusionItemAmount;
     }
     public void setTransfusionItemAmount(Float transfusionItemAmount){
       	this.transfusionItemAmount=transfusionItemAmount;
     }
     public String getTransfusionItemUnit(){
       	return this.transfusionItemUnit;
     }
     public void setTransfusionItemUnit(String transfusionItemUnit){
       	this.transfusionItemUnit=transfusionItemUnit;
     }
     public Boolean getTransfuseReactionFlag(){
       	return this.transfuseReactionFlag;
     }
     public void setTransfuseReactionFlag(Boolean transfuseReactionFlag){
       	this.transfuseReactionFlag=transfuseReactionFlag;
     }
     public String getAsaGradingStandardCode(){
       	return this.asaGradingStandardCode;
     }
     public void setAsaGradingStandardCode(String asaGradingStandardCode){
       	this.asaGradingStandardCode=asaGradingStandardCode;
     }
     public String getTracheaCannulaClass(){
       	return this.tracheaCannulaClass;
     }
     public void setTracheaCannulaClass(String tracheaCannulaClass){
       	this.tracheaCannulaClass=tracheaCannulaClass;
     }
     public String getAnesDrugName(){
       	return this.anesDrugName;
     }
     public void setAnesDrugName(String anesDrugName){
       	this.anesDrugName=anesDrugName;
     }
     public String getBreatheTypeCd(){
       	return this.breatheTypeCd;
     }
     public void setBreatheTypeCd(String breatheTypeCd){
       	this.breatheTypeCd=breatheTypeCd;
     }
     public String getAnesDescr(){
       	return this.anesDescr;
     }
     public void setAnesDescr(String anesDescr){
       	this.anesDescr=anesDescr;
     }
     public String getAnesCompCd(){
       	return this.anesCompCd;
     }
     public void setAnesCompCd(String anesCompCd){
       	this.anesCompCd=anesCompCd;
     }
     public String getPunctureProcess(){
       	return this.punctureProcess;
     }
     public void setPunctureProcess(String punctureProcess){
       	this.punctureProcess=punctureProcess;
     }
     public String getAnesEffect(){
       	return this.anesEffect;
     }
     public void setAnesEffect(String anesEffect){
       	this.anesEffect=anesEffect;
     }
     public String getAnesPreDrug(){
       	return this.anesPreDrug;
     }
     public void setAnesPreDrug(String anesPreDrug){
       	this.anesPreDrug=anesPreDrug;
     }
     public Date getProcedureStart(){
       	return this.procedureStart;
     }
     public void setProcedureStart(Date procedureStart){
       	this.procedureStart=procedureStart;
     }
     public Date getProcedureEnd(){
       	return this.procedureEnd;
     }
     public void setProcedureEnd(Date procedureEnd){
       	this.procedureEnd=procedureEnd;
     }
     public String getOpRoom(){
       	return this.opRoom;
     }
     public void setOpRoom(String opRoom){
       	this.opRoom=opRoom;
     }
     public String getTreatRescueCourse(){
       	return this.treatRescueCourse;
     }
     public void setTreatRescueCourse(String treatRescueCourse){
       	this.treatRescueCourse=treatRescueCourse;
     }
     public String geteOrderNo(){
       	return this.eOrderNo;
     }
     public void seteOrderNo(String eOrderNo){
       	this.eOrderNo=eOrderNo;
     }
     public String getAnaesthesiaId(){
       	return this.anaesthesiaId;
     }
     public void setAnaesthesiaId(String anaesthesiaId){
       	this.anaesthesiaId=anaesthesiaId;
     }
     public String getAnesthesiaCode(){
       	return this.anesthesiaCode;
     }
     public void setAnesthesiaCode(String anesthesiaCode){
       	this.anesthesiaCode=anesthesiaCode;
     }
     public String getAnesthesiaWay(){
       	return this.anesthesiaWay;
     }
     public void setAnesthesiaWay(String anesthesiaWay){
       	this.anesthesiaWay=anesthesiaWay;
     }
     public String getOperationCd(){
       	return this.operationCd;
     }
     public void setOperationCd(String operationCd){
       	this.operationCd=operationCd;
     }
     public String getOperationName(){
       	return this.operationName;
     }
     public void setOperationName(String operationName){
       	this.operationName=operationName;
     }
     public String getTransfusionVarietyCode(){
       	return this.transfusionVarietyCode;
     }
     public void setTransfusionVarietyCode(String transfusionVarietyCode){
       	this.transfusionVarietyCode=transfusionVarietyCode;
     }
     public String getTransfusionVarietyName(){
       	return this.transfusionVarietyName;
     }
     public void setTransfusionVarietyName(String transfusionVarietyName){
       	this.transfusionVarietyName=transfusionVarietyName;
     }
     public String getAnesthesiaSiteCode(){
       	return this.anesthesiaSiteCode;
     }
     public void setAnesthesiaSiteCode(String anesthesiaSiteCode){
       	this.anesthesiaSiteCode=anesthesiaSiteCode;
     }
     public String getAnesthesiaSiteName(){
       	return this.anesthesiaSiteName;
     }
     public void setAnesthesiaSiteName(String anesthesiaSiteName){
       	this.anesthesiaSiteName=anesthesiaSiteName;
     }
     public String getPartCode(){
       	return this.partCode;
     }
     public void setPartCode(String partCode){
       	this.partCode=partCode;
     }
     public String getPartName(){
       	return this.partName;
     }
     public void setPartName(String partName){
       	this.partName=partName;
     }
     public String getNotify(){
       	return this.notify;
     }
     public void setNotify(String notify){
       	this.notify=notify;
     }
     public String getOperative(){
       	return this.operative;
     }
     public void setOperative(String operative){
       	this.operative=operative;
     }
     public String getOperativeName(){
       	return this.operativeName;
     }
     public void setOperativeName(String operativeName){
       	this.operativeName=operativeName;
     }
     public Date getAnesthesiaStartTime(){
       	return this.anesthesiaStartTime;
     }
     public void setAnesthesiaStartTime(Date anesthesiaStartTime){
       	this.anesthesiaStartTime=anesthesiaStartTime;
     }
     public Date getAnesthesiaEndTime(){
       	return this.anesthesiaEndTime;
     }
     public void setAnesthesiaEndTime(Date anesthesiaEndTime){
       	this.anesthesiaEndTime=anesthesiaEndTime;
     }
     public String getRouteMonitorItemName(){
       	return this.routeMonitorItemName;
     }
     public void setRouteMonitorItemName(String routeMonitorItemName){
       	this.routeMonitorItemName=routeMonitorItemName;
     }
     public String getRouteMonitorItemResult(){
       	return this.routeMonitorItemResult;
     }
     public void setRouteMonitorItemResult(String routeMonitorItemResult){
       	this.routeMonitorItemResult=routeMonitorItemResult;
     }
     public String getSpecMonitorItemName(){
       	return this.specMonitorItemName;
     }
     public void setSpecMonitorItemName(String specMonitorItemName){
       	this.specMonitorItemName=specMonitorItemName;
     }
     public String getSpecMonitorItemResult(){
       	return this.specMonitorItemResult;
     }
     public void setSpecMonitorItemResult(String specMonitorItemResult){
       	this.specMonitorItemResult=specMonitorItemResult;
     }
     public Float getBodyTemperature(){
       	return this.bodyTemperature;
     }
     public void setBodyTemperature(Float bodyTemperature){
       	this.bodyTemperature=bodyTemperature;
     }
     public Float getHeartRate(){
       	return this.heartRate;
     }
     public void setHeartRate(Float heartRate){
       	this.heartRate=heartRate;
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
     public Float getWeight(){
       	return this.weight;
     }
     public void setWeight(Float weight){
       	this.weight=weight;
     }
     public Float getSbp(){
       	return this.sbp;
     }
     public void setSbp(Float sbp){
       	this.sbp=sbp;
     }
     public Float getDbp(){
       	return this.dbp;
     }
     public void setDbp(Float dbp){
       	this.dbp=dbp;
     }
     public Float getLossbloodAmount(){
       	return this.lossbloodAmount;
     }
     public void setLossbloodAmount(Float lossbloodAmount){
       	this.lossbloodAmount=lossbloodAmount;
     }
     public String getOutCode(){
       	return this.outCode;
     }
     public void setOutCode(String outCode){
       	this.outCode=outCode;
     }
     public String getRemarks(){
       	return this.remarks;
     }
     public void setRemarks(String remarks){
       	this.remarks=remarks;
     }
     public Date getOutOperationRoomTime(){
       	return this.outOperationRoomTime;
     }
     public void setOutOperationRoomTime(Date outOperationRoomTime){
       	this.outOperationRoomTime=outOperationRoomTime;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}