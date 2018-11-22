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
@Table(name = BaseEntity.TABLE_PREFIX + "ADMISSION_ASSESSMENT_RECORDS")
public class AdmissionAssessmentRecords extends FhirResourceEntity {

    /**
     *名称:院内入院评估记录id
     *
 	 *
 	 *主键字段
     */
     @Column(name="ADMISSION_ASSESSMENT_RECORDS_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="ADMISSION_ASSESSMENT_RECORDS_ID",displayName="院内入院评估记录id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String admissionAssessmentRecordsId;
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
     *名称:婚姻状况代码
     *
 	 *限制:GBT22612
 	 *
     */
     @Column(name="MARITALSTATUS",length = 20,nullable = true)
     @FhirFieldValidate(name="MARITALSTATUS",displayName="婚姻状况代码",maxLength=20,required=false,valuesRange="GBT22612")   
     private String maritalstatus;
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
     *名称:电话号码
     *
 	 *
 	 *
     */
     @Column(name="TELECOM",length = 20,nullable = true)
     @FhirFieldValidate(name="TELECOM",displayName="电话号码",maxLength=20,required=false,valuesRange="")   
     private String telecom;
    /**
     *名称:工作单位电话号码
     *
 	 *
 	 *
     */
     @Column(name="WORK_PHONE",length = 20,nullable = true)
     @FhirFieldValidate(name="WORK_PHONE",displayName="工作单位电话号码",maxLength=20,required=false,valuesRange="")   
     private String workPhone;
    /**
     *名称:电子邮箱地址
     *
 	 *
 	 *
     */
     @Column(name="EMAIL",length = 40,nullable = true)
     @FhirFieldValidate(name="EMAIL",displayName="电子邮箱地址",maxLength=40,required=false,valuesRange="")   
     private String email;
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
     *名称:民族代码
     *
 	 *限制:CV9900377
 	 *
     */
     @Column(name="NATION_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="NATION_CD",displayName="民族代码",maxLength=20,required=false,valuesRange="CV9900377")   
     private String nationCd;
    /**
     *名称:职业代码
     *
 	 *限制:GBT22614
 	 *
     */
     @Column(name="OCCUPATION_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="OCCUPATION_CD",displayName="职业代码",maxLength=20,required=false,valuesRange="GBT22614")   
     private String occupationCd;
    /**
     *名称:学历代码
     *
 	 *限制:GBT4658
 	 *
     */
     @Column(name="EDUCATION_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="EDUCATION_CD",displayName="学历代码",maxLength=20,required=false,valuesRange="GBT4658")   
     private String educationCd;
    /**
     *名称:国籍代码
     *
 	 *限制:GBT2659
 	 *
     */
     @Column(name="NATIONALITY_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="NATIONALITY_CODE",displayName="国籍代码",maxLength=20,required=false,valuesRange="GBT2659")   
     private String nationalityCode;
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
     @FhirFieldValidate(name="VISIT_MARK",displayName="门诊或住院标识",maxLength=10,required=true,valuesRange="CUS00011")   
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
     *名称:备注
     *
 	 *
 	 *
     */
     @Column(name="REMARKS",columnDefinition="text")
     @FhirFieldValidate(name="REMARKS",displayName="备注",required=false,valuesRange="")   
     private String remarks;
    /**
     *名称:文档管理者id
     *
 	 *
 	 *
     */
     @Column(name="DOCUMENT_MANAGER_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="DOCUMENT_MANAGER_ID",displayName="文档管理者id",maxLength=40,required=false,valuesRange="")   
     private String documentManagerId;
    /**
     *名称:文档管理者姓名
     *
 	 *
 	 *
     */
     @Column(name="DOCUMENT_MANAGER_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="DOCUMENT_MANAGER_NAME",displayName="文档管理者姓名",maxLength=40,required=false,valuesRange="")   
     private String documentManagerName;
    /**
     *名称:文档管理者签名日期
     *
 	 *
 	 *
     */
     @Column(name="DOCUMENT_MANAGER_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DOCUMENT_MANAGER_DATE",displayName="文档管理者签名日期",required=false,valuesRange="")   
     private Date documentManagerDate;
    /**
     *名称:文档审核者签名日期
     *
 	 *
 	 *
     */
     @Column(name="DOCUMENT_VERIFIER_SIGN_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DOCUMENT_VERIFIER_SIGN_DATE",displayName="文档审核者签名日期",required=false,valuesRange="")   
     private Date documentVerifierSignDate;
    /**
     *名称:文档审核者id
     *
 	 *
 	 *
     */
     @Column(name="DOCUMENT_VERIFIER_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="DOCUMENT_VERIFIER_ID",displayName="文档审核者id",maxLength=40,required=false,valuesRange="")   
     private String documentVerifierId;
    /**
     *名称:文档审核者姓名
     *
 	 *
 	 *
     */
     @Column(name="DOCUMENT_VERIFIER_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="DOCUMENT_VERIFIER_NAME",displayName="文档审核者姓名",maxLength=20,required=false,valuesRange="")   
     private String documentVerifierName;
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
     *名称:接诊护士id
     *
 	 *
 	 *
     */
     @Column(name="TREATMENT_NURSE_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="TREATMENT_NURSE_ID",displayName="接诊护士id",maxLength=40,required=false,valuesRange="")   
     private String treatmentNurseId;
    /**
     *名称:接诊护士姓名
     *
 	 *
 	 *
     */
     @Column(name="TREATMENT_NURSE_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="TREATMENT_NURSE_NAME",displayName="接诊护士姓名",maxLength=40,required=false,valuesRange="")   
     private String treatmentNurseName;
    /**
     *名称:接诊护士签名日期
     *
 	 *
 	 *
     */
     @Column(name="TREATMENT_NURSE_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="TREATMENT_NURSE_DATE",displayName="接诊护士签名日期",required=false,valuesRange="")   
     private Date treatmentNurseDate;
    /**
     *名称:主要症状名称
     *
 	 *
 	 *
     */
     @Column(name="MAIN_SYMPTOMS_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="MAIN_SYMPTOMS_NAME",displayName="主要症状名称",maxLength=40,required=false,valuesRange="")   
     private String mainSymptomsName;
    /**
     *名称:主要症状描述
     *
 	 *
 	 *
     */
     @Column(name="MAIN_SYMPTOMS_DESCRIBED",length = 40,nullable = true)
     @FhirFieldValidate(name="MAIN_SYMPTOMS_DESCRIBED",displayName="主要症状描述",maxLength=40,required=false,valuesRange="")   
     private String mainSymptomsDescribed;
    /**
     *名称:体重
     *
 	 *
 	 *
     */
     @Column(name="WEIGHT",length = 8,nullable = true)
     @FhirFieldValidate(name="WEIGHT",displayName="体重",maxLength=8,required=false,valuesRange="")   
     private Float weight;
    /**
     *名称:体格检查：体温
     *备注:(体温的测量值，计量单位为℃)
 	 *
 	 *
     */
     @Column(name="BODY_TEMPERATURE",length = 8,nullable = true)
     @FhirFieldValidate(name="BODY_TEMPERATURE",displayName="体格检查：体温",maxLength=8,required=false,valuesRange="")   
     private Float bodyTemperature;
    /**
     *名称:体格检查：脉率
     *备注:(患者每分钟脉搏次数的测量值，计量单位为次/min)
 	 *
 	 *
     */
     @Column(name="PR_FREQ",length = 4,nullable = true)
     @FhirFieldValidate(name="PR_FREQ",displayName="体格检查：脉率",maxLength=4,required=false,valuesRange="")   
     private Integer prFreq;
    /**
     *名称:体格检查：呼吸频率
     *备注:（次/min）
 	 *
 	 *
     */
     @Column(name="BREATHE_FREQ",length = 4,nullable = true)
     @FhirFieldValidate(name="BREATHE_FREQ",displayName="体格检查：呼吸频率",maxLength=4,required=false,valuesRange="")   
     private Integer breatheFreq;
    /**
     *名称:体格检查：收缩压
     *备注:(收缩压的测量值，计量单位为mmHg)
 	 *
 	 *
     */
     @Column(name="SBP",length = 4,nullable = true)
     @FhirFieldValidate(name="SBP",displayName="体格检查：收缩压",maxLength=4,required=false,valuesRange="")   
     private Integer sbp;
    /**
     *名称:体格检查：舒张压
     *备注:(舒张压的测量值，计量单位为mmHg)
 	 *
 	 *
     */
     @Column(name="DBP",length = 4,nullable = true)
     @FhirFieldValidate(name="DBP",displayName="体格检查：舒张压",maxLength=4,required=false,valuesRange="")   
     private Integer dbp;
    /**
     *名称:体格检查：身高
     *备注:(患者身高的测量值，计量单位为cm)
 	 *
 	 *
     */
     @Column(name="BODY_HEIGHT",length = 8,nullable = true)
     @FhirFieldValidate(name="BODY_HEIGHT",displayName="体格检查：身高",maxLength=8,required=false,valuesRange="")   
     private Float bodyHeight;
    /**
     *名称:体格检查：体重
     *备注:(患者体重的测量值，计量单位为kg)
 	 *
 	 *
     */
     @Column(name="BODY_WEIGHT",length = 8,nullable = true)
     @FhirFieldValidate(name="BODY_WEIGHT",displayName="体格检查：体重",maxLength=8,required=false,valuesRange="")   
     private Float bodyWeight;
    /**
     *名称:疾病史（含外伤）
     *
 	 *
 	 *
     */
     @Column(name="HISTORY_OF_DISEASE",columnDefinition="text")
     @FhirFieldValidate(name="HISTORY_OF_DISEASE",displayName="疾病史（含外伤）",required=false,valuesRange="")   
     private String historyOfDisease;
    /**
     *名称:传染病史
     *
 	 *
 	 *
     */
     @Column(name="INFECTION_HISTORY",columnDefinition="text")
     @FhirFieldValidate(name="INFECTION_HISTORY",displayName="传染病史",required=false,valuesRange="")   
     private String infectionHistory;
    /**
     *名称:预防接种史描述
     *
 	 *
 	 *
     */
     @Column(name="VACC_HIS",columnDefinition="text")
     @FhirFieldValidate(name="VACC_HIS",displayName="预防接种史描述",required=false,valuesRange="")   
     private String vaccHis;
    /**
     *名称:手术史
     *
 	 *
 	 *
     */
     @Column(name="OP_HIS",columnDefinition="text")
     @FhirFieldValidate(name="OP_HIS",displayName="手术史",required=false,valuesRange="")   
     private String opHis;
    /**
     *名称:输血史描述
     *
 	 *
 	 *
     */
     @Column(name="TRANSFUSION_HIS",columnDefinition="text")
     @FhirFieldValidate(name="TRANSFUSION_HIS",displayName="输血史描述",required=false,valuesRange="")   
     private String transfusionHis;
    /**
     *名称:婚育史
     *
 	 *
 	 *
     */
     @Column(name="OBSTETRICAL_HISTORY",columnDefinition="text")
     @FhirFieldValidate(name="OBSTETRICAL_HISTORY",displayName="婚育史",required=false,valuesRange="")   
     private String obstetricalHistory;
    /**
     *名称:一般健康状况标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="HEALTH_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="HEALTH_MARK",displayName="一般健康状况标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean healthMark;
    /**
     *名称:患者传染性标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="INFECTIOUS_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="INFECTIOUS_MARK",displayName="患者传染性标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean infectiousMark;
    /**
     *名称:过敏史描述
     *
 	 *
 	 *
     */
     @Column(name="RRITABILITY",columnDefinition="text")
     @FhirFieldValidate(name="RRITABILITY",displayName="过敏史描述",required=false,valuesRange="")   
     private String rritability;
    /**
     *名称:家族史
     *
 	 *
 	 *
     */
     @Column(name="FAM_HISTORY",columnDefinition="text")
     @FhirFieldValidate(name="FAM_HISTORY",displayName="家族史",required=false,valuesRange="")   
     private String famHistory;
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
     *名称:发育程度代码
     *
 	 *限制:CV9900337
 	 *
     */
     @Column(name="DEVELOPMENT_DEGREE",length = 20,nullable = true)
     @FhirFieldValidate(name="DEVELOPMENT_DEGREE",displayName="发育程度代码",maxLength=20,required=false,valuesRange="CV9900337")   
     private String developmentDegree;
    /**
     *名称:精神状态正常标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="SPIRIT_NORMAL_STATUS",length = 5,nullable = true)
     @FhirFieldValidate(name="SPIRIT_NORMAL_STATUS",displayName="精神状态正常标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean spiritNormalStatus;
    /**
     *名称:睡眠状况
     *
 	 *
 	 *
     */
     @Column(name="SLEEP_STATUS",length = 100,nullable = true)
     @FhirFieldValidate(name="SLEEP_STATUS",displayName="睡眠状况",maxLength=100,required=false,valuesRange="")   
     private String sleepStatus;
    /**
     *名称:特殊情况
     *
 	 *
 	 *
     */
     @Column(name="EXCEPTIONAL_CASE",length = 100,nullable = true)
     @FhirFieldValidate(name="EXCEPTIONAL_CASE",displayName="特殊情况",maxLength=100,required=false,valuesRange="")   
     private String exceptionalCase;
    /**
     *名称:心理状态代码
     *
 	 *限制:CV0510002
 	 *
     */
     @Column(name="MENTAL_STATE",length = 20,nullable = true)
     @FhirFieldValidate(name="MENTAL_STATE",displayName="心理状态代码",maxLength=20,required=false,valuesRange="CV0510002")   
     private String mentalState;
    /**
     *名称:营养状态代码
     *
 	 *限制:CV9900338
 	 *
     */
     @Column(name="NUTRITIONAL_STATUS",length = 20,nullable = true)
     @FhirFieldValidate(name="NUTRITIONAL_STATUS",displayName="营养状态代码",maxLength=20,required=false,valuesRange="CV9900338")   
     private String nutritionalStatus;
    /**
     *名称:自理能力代码
     *
 	 *限制:CV9900339
 	 *
     */
     @Column(name="OF_DAILY",length = 20,nullable = true)
     @FhirFieldValidate(name="OF_DAILY",displayName="自理能力代码",maxLength=20,required=false,valuesRange="CV9900339")   
     private String ofDaily;
    /**
     *名称:吸烟标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_SMOKING",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_SMOKING",displayName="吸烟标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifSmoking;
    /**
     *名称:吸烟状况代码
     *
 	 *限制:CV0300101
 	 *
     */
     @Column(name="SMOKING_STATE",length = 20,nullable = true)
     @FhirFieldValidate(name="SMOKING_STATE",displayName="吸烟状况代码",maxLength=20,required=false,valuesRange="CV0300101")   
     private String smokingState;
    /**
     *名称:日吸烟量(支)
     *
 	 *
 	 *
     */
     @Column(name="SMOKING_PER_DAY",length = 8,nullable = true)
     @FhirFieldValidate(name="SMOKING_PER_DAY",displayName="日吸烟量(支)",maxLength=8,required=false,valuesRange="")   
     private Float smokingPerDay;
    /**
     *名称:停止吸烟天数
     *
 	 *
 	 *
     */
     @Column(name="STOP_SMOKING_DAYS",length = 8,nullable = true)
     @FhirFieldValidate(name="STOP_SMOKING_DAYS",displayName="停止吸烟天数",maxLength=8,required=false,valuesRange="")   
     private Float stopSmokingDays;
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
     *名称:饮食情况代码
     *
 	 *限制:CV9900003
 	 *
     */
     @Column(name="DIETARY_STATUS",length = 20,nullable = true)
     @FhirFieldValidate(name="DIETARY_STATUS",displayName="饮食情况代码",maxLength=20,required=false,valuesRange="CV9900003")   
     private String dietaryStatus;
    /**
     *名称:护理观察项目名称
     *
 	 *
 	 *
     */
     @Column(name="OBSERVATION_PROJECT_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="OBSERVATION_PROJECT_NAME",displayName="护理观察项目名称",maxLength=40,required=false,valuesRange="")   
     private String observationProjectName;
    /**
     *名称:护理观察结果
     *
 	 *
 	 *
     */
     @Column(name="OBSERVATION_RESULTS_DESCRIPTION",length = 100,nullable = true)
     @FhirFieldValidate(name="OBSERVATION_RESULTS_DESCRIPTION",displayName="护理观察结果",maxLength=100,required=false,valuesRange="")   
     private String observationResultsDescription;
    /**
     *名称:通知医师标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_NOTIFY_PHYSICIAN",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_NOTIFY_PHYSICIAN",displayName="通知医师标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifNotifyPhysician;
    /**
     *名称:通知医师日期时间
     *
 	 *
 	 *
     */
     @Column(name="NOTIFY_PHYSICIAN_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="NOTIFY_PHYSICIAN_TIME",displayName="通知医师日期时间",required=false,valuesRange="")   
     private Date notifyPhysicianTime;
    /**
     *名称:评估日期时间
     *
 	 *
 	 *
     */
     @Column(name="ASSESSMENT_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="ASSESSMENT_TIME",displayName="评估日期时间",required=false,valuesRange="")   
     private Date assessmentTime;
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
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getAdmissionAssessmentRecordsId(){
       	return this.admissionAssessmentRecordsId;
     }
     public void setAdmissionAssessmentRecordsId(String admissionAssessmentRecordsId){
       	this.admissionAssessmentRecordsId=admissionAssessmentRecordsId;
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
     public Date getBirthdate(){
       	return this.birthdate;
     }
     public void setBirthdate(Date birthdate){
       	this.birthdate=birthdate;
     }
     public String getMaritalstatus(){
       	return this.maritalstatus;
     }
     public void setMaritalstatus(String maritalstatus){
       	this.maritalstatus=maritalstatus;
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
     public String getTelecom(){
       	return this.telecom;
     }
     public void setTelecom(String telecom){
       	this.telecom=telecom;
     }
     public String getWorkPhone(){
       	return this.workPhone;
     }
     public void setWorkPhone(String workPhone){
       	this.workPhone=workPhone;
     }
     public String getEmail(){
       	return this.email;
     }
     public void setEmail(String email){
       	this.email=email;
     }
     public Float getAge(){
       	return this.age;
     }
     public void setAge(Float age){
       	this.age=age;
     }
     public String getNationCd(){
       	return this.nationCd;
     }
     public void setNationCd(String nationCd){
       	this.nationCd=nationCd;
     }
     public String getOccupationCd(){
       	return this.occupationCd;
     }
     public void setOccupationCd(String occupationCd){
       	this.occupationCd=occupationCd;
     }
     public String getEducationCd(){
       	return this.educationCd;
     }
     public void setEducationCd(String educationCd){
       	this.educationCd=educationCd;
     }
     public String getNationalityCode(){
       	return this.nationalityCode;
     }
     public void setNationalityCode(String nationalityCode){
       	this.nationalityCode=nationalityCode;
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
     public String getRemarks(){
       	return this.remarks;
     }
     public void setRemarks(String remarks){
       	this.remarks=remarks;
     }
     public String getDocumentManagerId(){
       	return this.documentManagerId;
     }
     public void setDocumentManagerId(String documentManagerId){
       	this.documentManagerId=documentManagerId;
     }
     public String getDocumentManagerName(){
       	return this.documentManagerName;
     }
     public void setDocumentManagerName(String documentManagerName){
       	this.documentManagerName=documentManagerName;
     }
     public Date getDocumentManagerDate(){
       	return this.documentManagerDate;
     }
     public void setDocumentManagerDate(Date documentManagerDate){
       	this.documentManagerDate=documentManagerDate;
     }
     public Date getDocumentVerifierSignDate(){
       	return this.documentVerifierSignDate;
     }
     public void setDocumentVerifierSignDate(Date documentVerifierSignDate){
       	this.documentVerifierSignDate=documentVerifierSignDate;
     }
     public String getDocumentVerifierId(){
       	return this.documentVerifierId;
     }
     public void setDocumentVerifierId(String documentVerifierId){
       	this.documentVerifierId=documentVerifierId;
     }
     public String getDocumentVerifierName(){
       	return this.documentVerifierName;
     }
     public void setDocumentVerifierName(String documentVerifierName){
       	this.documentVerifierName=documentVerifierName;
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
     public String getTreatmentNurseId(){
       	return this.treatmentNurseId;
     }
     public void setTreatmentNurseId(String treatmentNurseId){
       	this.treatmentNurseId=treatmentNurseId;
     }
     public String getTreatmentNurseName(){
       	return this.treatmentNurseName;
     }
     public void setTreatmentNurseName(String treatmentNurseName){
       	this.treatmentNurseName=treatmentNurseName;
     }
     public Date getTreatmentNurseDate(){
       	return this.treatmentNurseDate;
     }
     public void setTreatmentNurseDate(Date treatmentNurseDate){
       	this.treatmentNurseDate=treatmentNurseDate;
     }
     public String getMainSymptomsName(){
       	return this.mainSymptomsName;
     }
     public void setMainSymptomsName(String mainSymptomsName){
       	this.mainSymptomsName=mainSymptomsName;
     }
     public String getMainSymptomsDescribed(){
       	return this.mainSymptomsDescribed;
     }
     public void setMainSymptomsDescribed(String mainSymptomsDescribed){
       	this.mainSymptomsDescribed=mainSymptomsDescribed;
     }
     public Float getWeight(){
       	return this.weight;
     }
     public void setWeight(Float weight){
       	this.weight=weight;
     }
     public Float getBodyTemperature(){
       	return this.bodyTemperature;
     }
     public void setBodyTemperature(Float bodyTemperature){
       	this.bodyTemperature=bodyTemperature;
     }
     public Integer getPrFreq(){
       	return this.prFreq;
     }
     public void setPrFreq(Integer prFreq){
       	this.prFreq=prFreq;
     }
     public Integer getBreatheFreq(){
       	return this.breatheFreq;
     }
     public void setBreatheFreq(Integer breatheFreq){
       	this.breatheFreq=breatheFreq;
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
     public Float getBodyHeight(){
       	return this.bodyHeight;
     }
     public void setBodyHeight(Float bodyHeight){
       	this.bodyHeight=bodyHeight;
     }
     public Float getBodyWeight(){
       	return this.bodyWeight;
     }
     public void setBodyWeight(Float bodyWeight){
       	this.bodyWeight=bodyWeight;
     }
     public String getHistoryOfDisease(){
       	return this.historyOfDisease;
     }
     public void setHistoryOfDisease(String historyOfDisease){
       	this.historyOfDisease=historyOfDisease;
     }
     public String getInfectionHistory(){
       	return this.infectionHistory;
     }
     public void setInfectionHistory(String infectionHistory){
       	this.infectionHistory=infectionHistory;
     }
     public String getVaccHis(){
       	return this.vaccHis;
     }
     public void setVaccHis(String vaccHis){
       	this.vaccHis=vaccHis;
     }
     public String getOpHis(){
       	return this.opHis;
     }
     public void setOpHis(String opHis){
       	this.opHis=opHis;
     }
     public String getTransfusionHis(){
       	return this.transfusionHis;
     }
     public void setTransfusionHis(String transfusionHis){
       	this.transfusionHis=transfusionHis;
     }
     public String getObstetricalHistory(){
       	return this.obstetricalHistory;
     }
     public void setObstetricalHistory(String obstetricalHistory){
       	this.obstetricalHistory=obstetricalHistory;
     }
     public Boolean getHealthMark(){
       	return this.healthMark;
     }
     public void setHealthMark(Boolean healthMark){
       	this.healthMark=healthMark;
     }
     public Boolean getInfectiousMark(){
       	return this.infectiousMark;
     }
     public void setInfectiousMark(Boolean infectiousMark){
       	this.infectiousMark=infectiousMark;
     }
     public String getRritability(){
       	return this.rritability;
     }
     public void setRritability(String rritability){
       	this.rritability=rritability;
     }
     public String getFamHistory(){
       	return this.famHistory;
     }
     public void setFamHistory(String famHistory){
       	this.famHistory=famHistory;
     }
     public Float getApgarScore(){
       	return this.apgarScore;
     }
     public void setApgarScore(Float apgarScore){
       	this.apgarScore=apgarScore;
     }
     public String getDevelopmentDegree(){
       	return this.developmentDegree;
     }
     public void setDevelopmentDegree(String developmentDegree){
       	this.developmentDegree=developmentDegree;
     }
     public Boolean getSpiritNormalStatus(){
       	return this.spiritNormalStatus;
     }
     public void setSpiritNormalStatus(Boolean spiritNormalStatus){
       	this.spiritNormalStatus=spiritNormalStatus;
     }
     public String getSleepStatus(){
       	return this.sleepStatus;
     }
     public void setSleepStatus(String sleepStatus){
       	this.sleepStatus=sleepStatus;
     }
     public String getExceptionalCase(){
       	return this.exceptionalCase;
     }
     public void setExceptionalCase(String exceptionalCase){
       	this.exceptionalCase=exceptionalCase;
     }
     public String getMentalState(){
       	return this.mentalState;
     }
     public void setMentalState(String mentalState){
       	this.mentalState=mentalState;
     }
     public String getNutritionalStatus(){
       	return this.nutritionalStatus;
     }
     public void setNutritionalStatus(String nutritionalStatus){
       	this.nutritionalStatus=nutritionalStatus;
     }
     public String getOfDaily(){
       	return this.ofDaily;
     }
     public void setOfDaily(String ofDaily){
       	this.ofDaily=ofDaily;
     }
     public Boolean getIfSmoking(){
       	return this.ifSmoking;
     }
     public void setIfSmoking(Boolean ifSmoking){
       	this.ifSmoking=ifSmoking;
     }
     public String getSmokingState(){
       	return this.smokingState;
     }
     public void setSmokingState(String smokingState){
       	this.smokingState=smokingState;
     }
     public Float getSmokingPerDay(){
       	return this.smokingPerDay;
     }
     public void setSmokingPerDay(Float smokingPerDay){
       	this.smokingPerDay=smokingPerDay;
     }
     public Float getStopSmokingDays(){
       	return this.stopSmokingDays;
     }
     public void setStopSmokingDays(Float stopSmokingDays){
       	this.stopSmokingDays=stopSmokingDays;
     }
     public Boolean getIfDrinking(){
       	return this.ifDrinking;
     }
     public void setIfDrinking(Boolean ifDrinking){
       	this.ifDrinking=ifDrinking;
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
     public String getDietaryStatus(){
       	return this.dietaryStatus;
     }
     public void setDietaryStatus(String dietaryStatus){
       	this.dietaryStatus=dietaryStatus;
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
     public Boolean getIfNotifyPhysician(){
       	return this.ifNotifyPhysician;
     }
     public void setIfNotifyPhysician(Boolean ifNotifyPhysician){
       	this.ifNotifyPhysician=ifNotifyPhysician;
     }
     public Date getNotifyPhysicianTime(){
       	return this.notifyPhysicianTime;
     }
     public void setNotifyPhysicianTime(Date notifyPhysicianTime){
       	this.notifyPhysicianTime=notifyPhysicianTime;
     }
     public Date getAssessmentTime(){
       	return this.assessmentTime;
     }
     public void setAssessmentTime(Date assessmentTime){
       	this.assessmentTime=assessmentTime;
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
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}