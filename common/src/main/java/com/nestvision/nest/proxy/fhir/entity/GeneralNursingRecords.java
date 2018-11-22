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
@Table(name = BaseEntity.TABLE_PREFIX + "GENERAL_NURSING_RECORDS")
public class GeneralNursingRecords extends FhirResourceEntity {

    /**
     *名称:院内一般护理记录id
     *
 	 *
 	 *主键字段
     */
     @Column(name="GENERAL_NURSING_RECORDS_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="GENERAL_NURSING_RECORDS_ID",displayName="院内一般护理记录id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String generalNursingRecordsId;
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
     *名称:病案号
     *
 	 *
 	 *
     */
     @Column(name="CASE_NO",length = 40,nullable = true)
     @FhirFieldValidate(name="CASE_NO",displayName="病案号",maxLength=40,required=false,valuesRange="")   
     private String caseNo;
    /**
     *名称:住院次数
     *
 	 *
 	 *
     */
     @Column(name="INPAT_TIMES",length = 3,nullable = true)
     @FhirFieldValidate(name="INPAT_TIMES",displayName="住院次数",maxLength=3,required=false,valuesRange="")   
     private Integer inpatTimes;
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
     *名称:住院流水号
     *
 	 *
 	 *
     */
     @Column(name="INPATIENT_REGISTRATION_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="INPATIENT_REGISTRATION_ID",displayName="住院流水号",maxLength=40,required=true,valuesRange="")   
     private String inpatientRegistrationId;
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
     *名称:中医"四诊"观察结果
     *
 	 *
 	 *
     */
     @Column(name="CN_FOUR_RESULT",length = 200,nullable = true)
     @FhirFieldValidate(name="CN_FOUR_RESULT",displayName="中医&quot;四诊&quot;观察结果",maxLength=200,required=false,valuesRange="")   
     private String cnFourResult;
    /**
     *名称:入院途径
     *
 	 *限制:CV0900403
 	 *
     */
     @Column(name="IN_MODE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="IN_MODE_CODE",displayName="入院途径",maxLength=20,required=false,valuesRange="CV0900403")   
     private String inModeCode;
    /**
     *名称:住院原因代码
     *
 	 *限制:CV0600212
 	 *
     */
     @Column(name="INHOSPITAL_REASON_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="INHOSPITAL_REASON_CD",displayName="住院原因代码",maxLength=20,required=false,valuesRange="CV0600212")   
     private String inhospitalReasonCd;
    /**
     *名称:入病房方式
     *
 	 *
 	 *
     */
     @Column(name="INHOSPITAL_WAY",length = 40,nullable = true)
     @FhirFieldValidate(name="INHOSPITAL_WAY",displayName="入病房方式",maxLength=40,required=false,valuesRange="")   
     private String inhospitalWay;
    /**
     *名称:过敏史描述
     *
 	 *
 	 *
     */
     @Column(name="RRITABILITY",length = 40,nullable = true)
     @FhirFieldValidate(name="RRITABILITY",displayName="过敏史描述",maxLength=40,required=false,valuesRange="")   
     private String rritability;
    /**
     *名称:是否有过敏史
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_RRITABILITY",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_RRITABILITY",displayName="是否有过敏史",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifRritability;
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
     *名称:体重(kg)
     *
 	 *
 	 *
     */
     @Column(name="WEIGHT",length = 8,nullable = true)
     @FhirFieldValidate(name="WEIGHT",displayName="体重(kg)",maxLength=8,required=false,valuesRange="")   
     private Float weight;
    /**
     *名称:收缩压（mmHg）
     *
 	 *
 	 *
     */
     @Column(name="SBP",length = 8,nullable = true)
     @FhirFieldValidate(name="SBP",displayName="收缩压（mmHg）",maxLength=8,required=false,valuesRange="")   
     private Float sbp;
    /**
     *名称:舒张压（mmHg）
     *
 	 *
 	 *
     */
     @Column(name="DBP",length = 8,nullable = true)
     @FhirFieldValidate(name="DBP",displayName="舒张压（mmHg）",maxLength=8,required=false,valuesRange="")   
     private Float dbp;
    /**
     *名称:血糖检测值（mmol/L）
     *
 	 *
 	 *
     */
     @Column(name="GLU",length = 8,nullable = true)
     @FhirFieldValidate(name="GLU",displayName="血糖检测值（mmol/L）",maxLength=8,required=false,valuesRange="")   
     private Float glu;
    /**
     *名称:血氧饱和度（%）
     *
 	 *
 	 *
     */
     @Column(name="SAO2",length = 8,nullable = true)
     @FhirFieldValidate(name="SAO2",displayName="血氧饱和度（%）",maxLength=8,required=false,valuesRange="")   
     private Float sao2;
    /**
     *名称:足背动脉搏动标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="DORSALIS_PEDIS_ARTERY_PULSE",length = 5,nullable = true)
     @FhirFieldValidate(name="DORSALIS_PEDIS_ARTERY_PULSE",displayName="足背动脉搏动标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean dorsalisPedisArteryPulse;
    /**
     *名称:饮食情况代码
     *
 	 *限制:CV9900003
 	 *
     */
     @Column(name="DIETARY_STATUS",length = 20,nullable = true)
     @FhirFieldValidate(name="DIETARY_STATUS",displayName="饮食情况代码",maxLength=20,required=false,valuesRange="CV9900003")   
     private String dietaryStatus;
    /**
     *名称:饮食指导代码
     *
 	 *限制:CV9900333
 	 *
     */
     @Column(name="DIET_GUIDE",length = 20,nullable = true)
     @FhirFieldValidate(name="DIET_GUIDE",displayName="饮食指导代码",maxLength=20,required=false,valuesRange="CV9900333")   
     private String dietGuide;
    /**
     *名称:护理等级代码
     *
 	 *限制:CV9900330
 	 *
     */
     @Column(name="NURSING_TYPE",length = 20,nullable = true)
     @FhirFieldValidate(name="NURSING_TYPE",displayName="护理等级代码",maxLength=20,required=false,valuesRange="CV9900330")   
     private String nursingType;
    /**
     *名称:护理类型代码表
     *
 	 *限制:CV9900331
 	 *
     */
     @Column(name="NURSING_GRADE",length = 20,nullable = true)
     @FhirFieldValidate(name="NURSING_GRADE",displayName="护理类型代码表",maxLength=20,required=false,valuesRange="CV9900331")   
     private String nursingGrade;
    /**
     *名称:导管护理
     *
 	 *
 	 *
     */
     @Column(name="CATHETER_CARE_DESCRIPTION",length = 200,nullable = true)
     @FhirFieldValidate(name="CATHETER_CARE_DESCRIPTION",displayName="导管护理",maxLength=200,required=false,valuesRange="")   
     private String catheterCareDescription;
    /**
     *名称:体位护理
     *
 	 *
 	 *
     */
     @Column(name="POSITION_NURSE_DESCRIPTION",length = 200,nullable = true)
     @FhirFieldValidate(name="POSITION_NURSE_DESCRIPTION",displayName="体位护理",maxLength=200,required=false,valuesRange="")   
     private String positionNurseDescription;
    /**
     *名称:皮肤护理
     *
 	 *
 	 *
     */
     @Column(name="SKIN_NURSE_DESCRIPTION",length = 200,nullable = true)
     @FhirFieldValidate(name="SKIN_NURSE_DESCRIPTION",displayName="皮肤护理",maxLength=200,required=false,valuesRange="")   
     private String skinNurseDescription;
    /**
     *名称:营养护理
     *
 	 *
 	 *
     */
     @Column(name="NUTRITION_CARE_DESCRIPTION",length = 200,nullable = true)
     @FhirFieldValidate(name="NUTRITION_CARE_DESCRIPTION",displayName="营养护理",maxLength=200,required=false,valuesRange="")   
     private String nutritionCareDescription;
    /**
     *名称:气管护理代码
     *
 	 *限制:CV9900332
 	 *
     */
     @Column(name="TRACHEA_NURSE_DESCRIPTION",length = 20,nullable = true)
     @FhirFieldValidate(name="TRACHEA_NURSE_DESCRIPTION",displayName="气管护理代码",maxLength=20,required=false,valuesRange="CV9900332")   
     private String tracheaNurseDescription;
    /**
     *名称:安全护理代码表
     *
 	 *限制:CV9900335
 	 *
     */
     @Column(name="SECURITY_NURSE_DESCRIPTION",length = 20,nullable = true)
     @FhirFieldValidate(name="SECURITY_NURSE_DESCRIPTION",displayName="安全护理代码表",maxLength=20,required=false,valuesRange="CV9900335")   
     private String securityNurseDescription;
    /**
     *名称:心理护理代码
     *
 	 *限制:CV9900334
 	 *
     */
     @Column(name="PSYCHOLOGICAL_NURSING",length = 20,nullable = true)
     @FhirFieldValidate(name="PSYCHOLOGICAL_NURSING",displayName="心理护理代码",maxLength=20,required=false,valuesRange="CV9900334")   
     private String psychologicalNursing;
    /**
     *名称:简要病情
     *
 	 *
 	 *
     */
     @Column(name="BRIEF_ILLNESS_DESCRIPTION",length = 200,nullable = true)
     @FhirFieldValidate(name="BRIEF_ILLNESS_DESCRIPTION",displayName="简要病情",maxLength=200,required=false,valuesRange="")   
     private String briefIllnessDescription;
    /**
     *名称:护理观察项目名称
     *
 	 *
 	 *
     */
     @Column(name="OBSERVATION_PROJECT_NAME",length = 200,nullable = true)
     @FhirFieldValidate(name="OBSERVATION_PROJECT_NAME",displayName="护理观察项目名称",maxLength=200,required=false,valuesRange="")   
     private String observationProjectName;
    /**
     *名称:护理观察结果
     *
 	 *
 	 *
     */
     @Column(name="OBSERVATION_RESULTS_DESCRIPTION",length = 200,nullable = true)
     @FhirFieldValidate(name="OBSERVATION_RESULTS_DESCRIPTION",displayName="护理观察结果",maxLength=200,required=false,valuesRange="")   
     private String observationResultsDescription;
    /**
     *名称:护理操作名称
     *
 	 *
 	 *
     */
     @Column(name="NURSING_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="NURSING_NAME",displayName="护理操作名称",maxLength=40,required=false,valuesRange="")   
     private String nursingName;
    /**
     *名称:护理操作项目类目名称
     *
 	 *
 	 *
     */
     @Column(name="NURSING_ITEM_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="NURSING_ITEM_NAME",displayName="护理操作项目类目名称",maxLength=40,required=false,valuesRange="")   
     private String nursingItemName;
    /**
     *名称:护理操作结果描述
     *
 	 *
 	 *
     */
     @Column(name="NURSING_RESULT_DESCRIPTION",length = 200,nullable = true)
     @FhirFieldValidate(name="NURSING_RESULT_DESCRIPTION",displayName="护理操作结果描述",maxLength=200,required=false,valuesRange="")   
     private String nursingResultDescription;
    /**
     *名称:呼吸机监护项目
     *
 	 *
 	 *
     */
     @Column(name="BREATHING_MACHINE_MONITORING_DESCRIPTION",length = 40,nullable = true)
     @FhirFieldValidate(name="BREATHING_MACHINE_MONITORING_DESCRIPTION",displayName="呼吸机监护项目",maxLength=40,required=false,valuesRange="")   
     private String breathingMachineMonitoringDescription;
    /**
     *名称:发出手术安全核对表标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="SURGICAL_SAFETY_CHECKLIST",length = 5,nullable = true)
     @FhirFieldValidate(name="SURGICAL_SAFETY_CHECKLIST",displayName="发出手术安全核对表标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean surgicalSafetyChecklist;
    /**
     *名称:收回手术安全核对表标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="RECOVER_SURGICAL_SAFETY_CHECKLIST",length = 5,nullable = true)
     @FhirFieldValidate(name="RECOVER_SURGICAL_SAFETY_CHECKLIST",displayName="收回手术安全核对表标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean recoverSurgicalSafetyChecklist;
    /**
     *名称:发出手术风险评估表标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="OPERATION_RISK_ASSESSMENT",length = 5,nullable = true)
     @FhirFieldValidate(name="OPERATION_RISK_ASSESSMENT",displayName="发出手术风险评估表标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean operationRiskAssessment;
    /**
     *名称:收回手术风险评估表标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="RECOVERY_OPERATION_RISK_ASSESSMENT",length = 5,nullable = true)
     @FhirFieldValidate(name="RECOVERY_OPERATION_RISK_ASSESSMENT",displayName="收回手术风险评估表标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean recoveryOperationRiskAssessment;
    /**
     *名称:隔离标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="ISOLATED_SIGNS",length = 5,nullable = true)
     @FhirFieldValidate(name="ISOLATED_SIGNS",displayName="隔离标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean isolatedSigns;
    /**
     *名称:隔离种类代码
     *
 	 *限制:CV9900336
 	 *
     */
     @Column(name="ISOLATION_TYPE",length = 20,nullable = true)
     @FhirFieldValidate(name="ISOLATION_TYPE",displayName="隔离种类代码",maxLength=20,required=false,valuesRange="CV9900336")   
     private String isolationType;
    /**
     *名称:中医症候代码
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="CN_SYM_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="CN_SYM_DIAG_CODE",displayName="中医症候代码",maxLength=20,required=false,valuesRange="CV9900357")   
     private String cnSymDiagCode;
    /**
     *名称:中医病名代码
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="CN_DIS_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="CN_DIS_DIAG_CODE",displayName="中医病名代码",maxLength=20,required=false,valuesRange="CV9900357")   
     private String cnDisDiagCode;
    /**
     *名称:诊断编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="DIAG_CODE",displayName="诊断编码",maxLength=20,required=false,valuesRange="CV990111")   
     private String diagCode;
    /**
     *名称:诊断编码名称
     *
 	 *
 	 *
     */
     @Column(name="DIAG_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="DIAG_NAME",displayName="诊断编码名称",maxLength=40,required=false,valuesRange="")   
     private String diagName;
    /**
     *名称:诊断日期
     *
 	 *
 	 *
     */
     @Column(name="DIAG_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DIAG_DATE",displayName="诊断日期",required=false,valuesRange="")   
     private Date diagDate;
    /**
     *名称:责任护士id
     *
 	 *
 	 *
     */
     @Column(name="RESPONSIBILITY_NURSE_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="RESPONSIBILITY_NURSE_ID",displayName="责任护士id",maxLength=40,required=false,valuesRange="")   
     private String responsibilityNurseId;
    /**
     *名称:责任护士姓名
     *
 	 *
 	 *
     */
     @Column(name="RESPONSIBILITY_NURSE_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="RESPONSIBILITY_NURSE_NAME",displayName="责任护士姓名",maxLength=40,required=false,valuesRange="")   
     private String responsibilityNurseName;
    /**
     *名称:责任护士签名日期
     *
 	 *
 	 *
     */
     @Column(name="RESPONSIBILITY_NURSE_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="RESPONSIBILITY_NURSE_DATE",displayName="责任护士签名日期",required=false,valuesRange="")   
     private Date responsibilityNurseDate;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getGeneralNursingRecordsId(){
       	return this.generalNursingRecordsId;
     }
     public void setGeneralNursingRecordsId(String generalNursingRecordsId){
       	this.generalNursingRecordsId=generalNursingRecordsId;
     }
     public Date getDate(){
       	return this.date;
     }
     public void setDate(Date date){
       	this.date=date;
     }
     public String getCaseNo(){
       	return this.caseNo;
     }
     public void setCaseNo(String caseNo){
       	this.caseNo=caseNo;
     }
     public Integer getInpatTimes(){
       	return this.inpatTimes;
     }
     public void setInpatTimes(Integer inpatTimes){
       	this.inpatTimes=inpatTimes;
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
     public String getInpatientRegistrationId(){
       	return this.inpatientRegistrationId;
     }
     public void setInpatientRegistrationId(String inpatientRegistrationId){
       	this.inpatientRegistrationId=inpatientRegistrationId;
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
     public String getCnFourResult(){
       	return this.cnFourResult;
     }
     public void setCnFourResult(String cnFourResult){
       	this.cnFourResult=cnFourResult;
     }
     public String getInModeCode(){
       	return this.inModeCode;
     }
     public void setInModeCode(String inModeCode){
       	this.inModeCode=inModeCode;
     }
     public String getInhospitalReasonCd(){
       	return this.inhospitalReasonCd;
     }
     public void setInhospitalReasonCd(String inhospitalReasonCd){
       	this.inhospitalReasonCd=inhospitalReasonCd;
     }
     public String getInhospitalWay(){
       	return this.inhospitalWay;
     }
     public void setInhospitalWay(String inhospitalWay){
       	this.inhospitalWay=inhospitalWay;
     }
     public String getRritability(){
       	return this.rritability;
     }
     public void setRritability(String rritability){
       	this.rritability=rritability;
     }
     public Boolean getIfRritability(){
       	return this.ifRritability;
     }
     public void setIfRritability(Boolean ifRritability){
       	this.ifRritability=ifRritability;
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
     public Float getGlu(){
       	return this.glu;
     }
     public void setGlu(Float glu){
       	this.glu=glu;
     }
     public Float getSao2(){
       	return this.sao2;
     }
     public void setSao2(Float sao2){
       	this.sao2=sao2;
     }
     public Boolean getDorsalisPedisArteryPulse(){
       	return this.dorsalisPedisArteryPulse;
     }
     public void setDorsalisPedisArteryPulse(Boolean dorsalisPedisArteryPulse){
       	this.dorsalisPedisArteryPulse=dorsalisPedisArteryPulse;
     }
     public String getDietaryStatus(){
       	return this.dietaryStatus;
     }
     public void setDietaryStatus(String dietaryStatus){
       	this.dietaryStatus=dietaryStatus;
     }
     public String getDietGuide(){
       	return this.dietGuide;
     }
     public void setDietGuide(String dietGuide){
       	this.dietGuide=dietGuide;
     }
     public String getNursingType(){
       	return this.nursingType;
     }
     public void setNursingType(String nursingType){
       	this.nursingType=nursingType;
     }
     public String getNursingGrade(){
       	return this.nursingGrade;
     }
     public void setNursingGrade(String nursingGrade){
       	this.nursingGrade=nursingGrade;
     }
     public String getCatheterCareDescription(){
       	return this.catheterCareDescription;
     }
     public void setCatheterCareDescription(String catheterCareDescription){
       	this.catheterCareDescription=catheterCareDescription;
     }
     public String getPositionNurseDescription(){
       	return this.positionNurseDescription;
     }
     public void setPositionNurseDescription(String positionNurseDescription){
       	this.positionNurseDescription=positionNurseDescription;
     }
     public String getSkinNurseDescription(){
       	return this.skinNurseDescription;
     }
     public void setSkinNurseDescription(String skinNurseDescription){
       	this.skinNurseDescription=skinNurseDescription;
     }
     public String getNutritionCareDescription(){
       	return this.nutritionCareDescription;
     }
     public void setNutritionCareDescription(String nutritionCareDescription){
       	this.nutritionCareDescription=nutritionCareDescription;
     }
     public String getTracheaNurseDescription(){
       	return this.tracheaNurseDescription;
     }
     public void setTracheaNurseDescription(String tracheaNurseDescription){
       	this.tracheaNurseDescription=tracheaNurseDescription;
     }
     public String getSecurityNurseDescription(){
       	return this.securityNurseDescription;
     }
     public void setSecurityNurseDescription(String securityNurseDescription){
       	this.securityNurseDescription=securityNurseDescription;
     }
     public String getPsychologicalNursing(){
       	return this.psychologicalNursing;
     }
     public void setPsychologicalNursing(String psychologicalNursing){
       	this.psychologicalNursing=psychologicalNursing;
     }
     public String getBriefIllnessDescription(){
       	return this.briefIllnessDescription;
     }
     public void setBriefIllnessDescription(String briefIllnessDescription){
       	this.briefIllnessDescription=briefIllnessDescription;
     }
     public String getObservationProjectName(){
       	return this.observationProjectName;
     }
     public void setObservationProjectName(String observationProjectName){
       	this.observationProjectName=observationProjectName;
     }
     public String getObservationResultsDescription(){
       	return this.observationResultsDescription;
     }
     public void setObservationResultsDescription(String observationResultsDescription){
       	this.observationResultsDescription=observationResultsDescription;
     }
     public String getNursingName(){
       	return this.nursingName;
     }
     public void setNursingName(String nursingName){
       	this.nursingName=nursingName;
     }
     public String getNursingItemName(){
       	return this.nursingItemName;
     }
     public void setNursingItemName(String nursingItemName){
       	this.nursingItemName=nursingItemName;
     }
     public String getNursingResultDescription(){
       	return this.nursingResultDescription;
     }
     public void setNursingResultDescription(String nursingResultDescription){
       	this.nursingResultDescription=nursingResultDescription;
     }
     public String getBreathingMachineMonitoringDescription(){
       	return this.breathingMachineMonitoringDescription;
     }
     public void setBreathingMachineMonitoringDescription(String breathingMachineMonitoringDescription){
       	this.breathingMachineMonitoringDescription=breathingMachineMonitoringDescription;
     }
     public Boolean getSurgicalSafetyChecklist(){
       	return this.surgicalSafetyChecklist;
     }
     public void setSurgicalSafetyChecklist(Boolean surgicalSafetyChecklist){
       	this.surgicalSafetyChecklist=surgicalSafetyChecklist;
     }
     public Boolean getRecoverSurgicalSafetyChecklist(){
       	return this.recoverSurgicalSafetyChecklist;
     }
     public void setRecoverSurgicalSafetyChecklist(Boolean recoverSurgicalSafetyChecklist){
       	this.recoverSurgicalSafetyChecklist=recoverSurgicalSafetyChecklist;
     }
     public Boolean getOperationRiskAssessment(){
       	return this.operationRiskAssessment;
     }
     public void setOperationRiskAssessment(Boolean operationRiskAssessment){
       	this.operationRiskAssessment=operationRiskAssessment;
     }
     public Boolean getRecoveryOperationRiskAssessment(){
       	return this.recoveryOperationRiskAssessment;
     }
     public void setRecoveryOperationRiskAssessment(Boolean recoveryOperationRiskAssessment){
       	this.recoveryOperationRiskAssessment=recoveryOperationRiskAssessment;
     }
     public Boolean getIsolatedSigns(){
       	return this.isolatedSigns;
     }
     public void setIsolatedSigns(Boolean isolatedSigns){
       	this.isolatedSigns=isolatedSigns;
     }
     public String getIsolationType(){
       	return this.isolationType;
     }
     public void setIsolationType(String isolationType){
       	this.isolationType=isolationType;
     }
     public String getCnSymDiagCode(){
       	return this.cnSymDiagCode;
     }
     public void setCnSymDiagCode(String cnSymDiagCode){
       	this.cnSymDiagCode=cnSymDiagCode;
     }
     public String getCnDisDiagCode(){
       	return this.cnDisDiagCode;
     }
     public void setCnDisDiagCode(String cnDisDiagCode){
       	this.cnDisDiagCode=cnDisDiagCode;
     }
     public String getDiagCode(){
       	return this.diagCode;
     }
     public void setDiagCode(String diagCode){
       	this.diagCode=diagCode;
     }
     public String getDiagName(){
       	return this.diagName;
     }
     public void setDiagName(String diagName){
       	this.diagName=diagName;
     }
     public Date getDiagDate(){
       	return this.diagDate;
     }
     public void setDiagDate(Date diagDate){
       	this.diagDate=diagDate;
     }
     public String getResponsibilityNurseId(){
       	return this.responsibilityNurseId;
     }
     public void setResponsibilityNurseId(String responsibilityNurseId){
       	this.responsibilityNurseId=responsibilityNurseId;
     }
     public String getResponsibilityNurseName(){
       	return this.responsibilityNurseName;
     }
     public void setResponsibilityNurseName(String responsibilityNurseName){
       	this.responsibilityNurseName=responsibilityNurseName;
     }
     public Date getResponsibilityNurseDate(){
       	return this.responsibilityNurseDate;
     }
     public void setResponsibilityNurseDate(Date responsibilityNurseDate){
       	this.responsibilityNurseDate=responsibilityNurseDate;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}