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
@Table(name = BaseEntity.TABLE_PREFIX + "MEDICAL_RECORD_OUTLINE")
public class MedicalRecordOutline extends FhirResourceEntity {

    /**
     *名称:院内系统病历概要id
     *
 	 *
 	 *主键字段
     */
     @Column(name="MEDICAL_RECORD_OUTLINE_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="MEDICAL_RECORD_OUTLINE_ID",displayName="院内系统病历概要id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String medicalRecordOutlineId;
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
     *名称:联系电话
     *
 	 *
 	 *
     */
     @Column(name="TELECOM",length = 20,nullable = true)
     @FhirFieldValidate(name="TELECOM",displayName="联系电话",maxLength=20,required=false,valuesRange="")   
     private String telecom;
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
     *名称:职业代码
     *
 	 *限制:GBT22614
 	 *
     */
     @Column(name="OCCUPATION_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="OCCUPATION_CD",displayName="职业代码",maxLength=20,required=false,valuesRange="GBT22614")   
     private String occupationCd;
    /**
     *名称:工作单位
     *
 	 *
 	 *
     */
     @Column(name="WORK_UNIT",length = 40,nullable = true)
     @FhirFieldValidate(name="WORK_UNIT",displayName="工作单位",maxLength=40,required=false,valuesRange="")   
     private String workUnit;
    /**
     *名称:工作单位联系方式
     *
 	 *
 	 *
     */
     @Column(name="CONTACT_NUMBER",length = 40,nullable = true)
     @FhirFieldValidate(name="CONTACT_NUMBER",displayName="工作单位联系方式",maxLength=40,required=false,valuesRange="")   
     private String contactNumber;
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
     *名称:责任医师姓名
     *
 	 *
 	 *
     */
     @Column(name="RESPONS_DOC_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="RESPONS_DOC_NAME",displayName="责任医师姓名",maxLength=20,required=false,valuesRange="")   
     private String responsDocName;
    /**
     *名称:现居住住址-省（自治区、直辖市）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="TEMP_STATE",length = 10,nullable = true)
     @FhirFieldValidate(name="TEMP_STATE",displayName="现居住住址-省（自治区、直辖市）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String tempState;
    /**
     *名称:现居住住址-市（地区）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="TEMP_CITY",length = 10,nullable = true)
     @FhirFieldValidate(name="TEMP_CITY",displayName="现居住住址-市（地区）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String tempCity;
    /**
     *名称:现居住住址-县（区）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="TEMP_DISTRICT",length = 10,nullable = true)
     @FhirFieldValidate(name="TEMP_DISTRICT",displayName="现居住住址-县（区）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String tempDistrict;
    /**
     *名称:现居住住址-乡（镇、街道办事处）
     *
 	 *
 	 *
     */
     @Column(name="TEMP_LINE",length = 100,nullable = true)
     @FhirFieldValidate(name="TEMP_LINE",displayName="现居住住址-乡（镇、街道办事处）",maxLength=100,required=false,valuesRange="")   
     private String tempLine;
    /**
     *名称:现居住住址-村（街、路、弄等）
     *
 	 *
 	 *
     */
     @Column(name="TEMP_ROAD",length = 100,nullable = true)
     @FhirFieldValidate(name="TEMP_ROAD",displayName="现居住住址-村（街、路、弄等）",maxLength=100,required=false,valuesRange="")   
     private String tempRoad;
    /**
     *名称:现居住住址-门牌号码
     *
 	 *
 	 *
     */
     @Column(name="TEMP_HOUSE_NO",length = 50,nullable = true)
     @FhirFieldValidate(name="TEMP_HOUSE_NO",displayName="现居住住址-门牌号码",maxLength=50,required=false,valuesRange="")   
     private String tempHouseNo;
    /**
     *名称:现地址邮政编码
     *
 	 *
 	 *
     */
     @Column(name="TEMP_POST_CD",length = 50,nullable = true)
     @FhirFieldValidate(name="TEMP_POST_CD",displayName="现地址邮政编码",maxLength=50,required=false,valuesRange="")   
     private String tempPostCd;
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
     *名称:联系人地址-省（自治区、直辖市）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="CONTACTS_TEMP_STATE",length = 10,nullable = true)
     @FhirFieldValidate(name="CONTACTS_TEMP_STATE",displayName="联系人地址-省（自治区、直辖市）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String contactsTempState;
    /**
     *名称:联系人地址-市（地区）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="CONTACTS_TEMP_CITY",length = 10,nullable = true)
     @FhirFieldValidate(name="CONTACTS_TEMP_CITY",displayName="联系人地址-市（地区）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String contactsTempCity;
    /**
     *名称:联系人地址-县（区）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="CONTACTS_TEMP_DISTRICT",length = 10,nullable = true)
     @FhirFieldValidate(name="CONTACTS_TEMP_DISTRICT",displayName="联系人地址-县（区）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String contactsTempDistrict;
    /**
     *名称:联系人地址-乡（镇、街道办事处）
     *
 	 *
 	 *
     */
     @Column(name="CONTACTS_TEMP_LINE",length = 100,nullable = true)
     @FhirFieldValidate(name="CONTACTS_TEMP_LINE",displayName="联系人地址-乡（镇、街道办事处）",maxLength=100,required=false,valuesRange="")   
     private String contactsTempLine;
    /**
     *名称:联系人地址-村（街、路、弄等）
     *
 	 *
 	 *
     */
     @Column(name="CONTACTS_TEMP_ROAD",length = 100,nullable = true)
     @FhirFieldValidate(name="CONTACTS_TEMP_ROAD",displayName="联系人地址-村（街、路、弄等）",maxLength=100,required=false,valuesRange="")   
     private String contactsTempRoad;
    /**
     *名称:联系人地址-门牌号码
     *
 	 *
 	 *
     */
     @Column(name="CONTACTS_TEMP_HOUSE_NO",length = 50,nullable = true)
     @FhirFieldValidate(name="CONTACTS_TEMP_HOUSE_NO",displayName="联系人地址-门牌号码",maxLength=50,required=false,valuesRange="")   
     private String contactsTempHouseNo;
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
     *名称:手术史
     *
 	 *
 	 *
     */
     @Column(name="OP_HIS",columnDefinition="text")
     @FhirFieldValidate(name="OP_HIS",displayName="手术史",required=false,valuesRange="")   
     private String opHis;
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
     *名称:输血史描述
     *
 	 *
 	 *
     */
     @Column(name="TRANSFUSION_HIS",columnDefinition="text")
     @FhirFieldValidate(name="TRANSFUSION_HIS",displayName="输血史描述",required=false,valuesRange="")   
     private String transfusionHis;
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
     *名称:预防接种史描述
     *
 	 *
 	 *
     */
     @Column(name="VACC_HIS",columnDefinition="text")
     @FhirFieldValidate(name="VACC_HIS",displayName="预防接种史描述",required=false,valuesRange="")   
     private String vaccHis;
    /**
     *名称:个人史
     *备注:患者个人生活习惯及有无烟、酒、药物等嗜好，职业与工作条件及有无工业毒物、粉尘、放射性物质接触史，有无冶游史的描述
 	 *
 	 *
     */
     @Column(name="PER_HISTORY",columnDefinition="text")
     @FhirFieldValidate(name="PER_HISTORY",displayName="个人史",required=false,valuesRange="")   
     private String perHistory;
    /**
     *名称:月经史
     *
 	 *
 	 *
     */
     @Column(name="MENSES_HIS",columnDefinition="text")
     @FhirFieldValidate(name="MENSES_HIS",displayName="月经史",required=false,valuesRange="")   
     private String mensesHis;
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
     *名称:死因代码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="DEATH_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="DEATH_CODE",displayName="死因代码",maxLength=20,required=false,valuesRange="CV990111")   
     private String deathCode;
    /**
     *名称:就诊原因
     *
 	 *
 	 *
     */
     @Column(name="IN_REASON",length = 100,nullable = true)
     @FhirFieldValidate(name="IN_REASON",displayName="就诊原因",maxLength=100,required=false,valuesRange="")   
     private String inReason;
    /**
     *名称:其他医学处置
     *
 	 *
 	 *
     */
     @Column(name="OTHER_MEDICAL_TREATMENT",length = 1000,nullable = true)
     @FhirFieldValidate(name="OTHER_MEDICAL_TREATMENT",displayName="其他医学处置",maxLength=1000,required=false,valuesRange="")   
     private String otherMedicalTreatment;
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
     *名称:出院时间
     *
 	 *
 	 *
     */
     @Column(name="END",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="END",displayName="出院时间",required=false,valuesRange="")   
     private Date end;
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
     *名称:西医诊断-编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="DIAGNOSTIC_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="DIAGNOSTIC_CODE",displayName="西医诊断-编码",maxLength=20,required=false,valuesRange="CV990111")   
     private String diagnosticCode;
    /**
     *名称:西医诊断-编码名称
     *
 	 *
 	 *
     */
     @Column(name="DIAGNOSTIC_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="DIAGNOSTIC_NAME",displayName="西医诊断-编码名称",maxLength=40,required=false,valuesRange="")   
     private String diagnosticName;
    /**
     *名称:西医诊断-发病时间
     *
 	 *
 	 *
     */
     @Column(name="ONSET_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="ONSET_DATE",displayName="西医诊断-发病时间",required=false,valuesRange="")   
     private Date onsetDate;
    /**
     *名称:西医诊断-病情转归代码
     *
 	 *
 	 *
     */
     @Column(name="TREATMENT_RESULT_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="TREATMENT_RESULT_CODE",displayName="西医诊断-病情转归代码",maxLength=20,required=false,valuesRange="")   
     private String treatmentResultCode;
    /**
     *名称:其他西医诊断编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="OTHER_DIAGNOSTIC_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="OTHER_DIAGNOSTIC_CODE",displayName="其他西医诊断编码",maxLength=20,required=false,valuesRange="CV990111")   
     private String otherDiagnosticCode;
    /**
     *名称:其他西医诊断编码
     *
 	 *
 	 *
     */
     @Column(name="OTHER_DIAGNOSTIC_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="OTHER_DIAGNOSTIC_NAME",displayName="其他西医诊断编码",maxLength=40,required=false,valuesRange="")   
     private String otherDiagnosticName;
    /**
     *名称:中医征候诊断代码
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="CN_SYM_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="CN_SYM_DIAG_CODE",displayName="中医征候诊断代码",maxLength=20,required=false,valuesRange="CV9900357")   
     private String cnSymDiagCode;
    /**
     *名称:中医病名诊断代码
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="CN_DIS_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="CN_DIS_DIAG_CODE",displayName="中医病名诊断代码",maxLength=20,required=false,valuesRange="CV9900357")   
     private String cnDisDiagCode;
    /**
     *名称:中医病名/中医征候诊断病情转归代码
     *
 	 *限制:CV0510010
 	 *
     */
     @Column(name="CN_TREATMENT_RESULT_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="CN_TREATMENT_RESULT_CODE",displayName="中医病名/中医征候诊断病情转归代码",maxLength=20,required=false,valuesRange="CV0510010")   
     private String cnTreatmentResultCode;
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
     *名称:关键药物名称
     *
 	 *
 	 *
     */
     @Column(name="CRUCIAL_DRUG_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="CRUCIAL_DRUG_NAME",displayName="关键药物名称",maxLength=40,required=false,valuesRange="")   
     private String crucialDrugName;
    /**
     *名称:关键药物用法
     *
 	 *
 	 *
     */
     @Column(name="CRUCIAL_DRUG_USAGE",length = 40,nullable = true)
     @FhirFieldValidate(name="CRUCIAL_DRUG_USAGE",displayName="关键药物用法",maxLength=40,required=false,valuesRange="")   
     private String crucialDrugUsage;
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
     *名称:中药使用类别代码
     *
 	 *限制:CV0600101
 	 *
     */
     @Column(name="CN_MEDICATION_TYPE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="CN_MEDICATION_TYPE_CODE",displayName="中药使用类别代码",maxLength=20,required=false,valuesRange="CV0600101")   
     private String cnMedicationTypeCode;
    /**
     *名称:医疗保险类别代码
     *
 	 *
 	 *
     */
     @Column(name="MEDICAL_INSURANCE_CATEGORY",length = 20,nullable = true)
     @FhirFieldValidate(name="MEDICAL_INSURANCE_CATEGORY",displayName="医疗保险类别代码",maxLength=20,required=false,valuesRange="")   
     private String medicalInsuranceCategory;
    /**
     *名称:医疗付费方式
     *
 	 *限制:CV9900376
 	 *
     */
     @Column(name="FEE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="FEE_CODE",displayName="医疗付费方式",maxLength=20,required=false,valuesRange="CV9900376")   
     private String feeCode;
    /**
     *名称:个人承担费用
     *
 	 *
 	 *
     */
     @Column(name="PSN_EXPENSE",length = 8,nullable = true)
     @FhirFieldValidate(name="PSN_EXPENSE",displayName="个人承担费用",maxLength=8,required=false,valuesRange="")   
     private Float psnExpense;
    /**
     *名称:门诊费用金额
     *
 	 *
 	 *
     */
     @Column(name="OUTPATIENT_EXPENSES",length = 8,nullable = true)
     @FhirFieldValidate(name="OUTPATIENT_EXPENSES",displayName="门诊费用金额",maxLength=8,required=false,valuesRange="")   
     private Float outpatientExpenses;
    /**
     *名称:住院费用金额
     *
 	 *
 	 *
     */
     @Column(name="INPATIENT_EXPENSES",length = 8,nullable = true)
     @FhirFieldValidate(name="INPATIENT_EXPENSES",displayName="住院费用金额",maxLength=8,required=false,valuesRange="")   
     private Float inpatientExpenses;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getMedicalRecordOutlineId(){
       	return this.medicalRecordOutlineId;
     }
     public void setMedicalRecordOutlineId(String medicalRecordOutlineId){
       	this.medicalRecordOutlineId=medicalRecordOutlineId;
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
     public String getTelecom(){
       	return this.telecom;
     }
     public void setTelecom(String telecom){
       	this.telecom=telecom;
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
     public String getOccupationCd(){
       	return this.occupationCd;
     }
     public void setOccupationCd(String occupationCd){
       	this.occupationCd=occupationCd;
     }
     public String getWorkUnit(){
       	return this.workUnit;
     }
     public void setWorkUnit(String workUnit){
       	this.workUnit=workUnit;
     }
     public String getContactNumber(){
       	return this.contactNumber;
     }
     public void setContactNumber(String contactNumber){
       	this.contactNumber=contactNumber;
     }
     public String getPatientType(){
       	return this.patientType;
     }
     public void setPatientType(String patientType){
       	this.patientType=patientType;
     }
     public String getResponsDocName(){
       	return this.responsDocName;
     }
     public void setResponsDocName(String responsDocName){
       	this.responsDocName=responsDocName;
     }
     public String getTempState(){
       	return this.tempState;
     }
     public void setTempState(String tempState){
       	this.tempState=tempState;
     }
     public String getTempCity(){
       	return this.tempCity;
     }
     public void setTempCity(String tempCity){
       	this.tempCity=tempCity;
     }
     public String getTempDistrict(){
       	return this.tempDistrict;
     }
     public void setTempDistrict(String tempDistrict){
       	this.tempDistrict=tempDistrict;
     }
     public String getTempLine(){
       	return this.tempLine;
     }
     public void setTempLine(String tempLine){
       	this.tempLine=tempLine;
     }
     public String getTempRoad(){
       	return this.tempRoad;
     }
     public void setTempRoad(String tempRoad){
       	this.tempRoad=tempRoad;
     }
     public String getTempHouseNo(){
       	return this.tempHouseNo;
     }
     public void setTempHouseNo(String tempHouseNo){
       	this.tempHouseNo=tempHouseNo;
     }
     public String getTempPostCd(){
       	return this.tempPostCd;
     }
     public void setTempPostCd(String tempPostCd){
       	this.tempPostCd=tempPostCd;
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
     public String getContactsTempState(){
       	return this.contactsTempState;
     }
     public void setContactsTempState(String contactsTempState){
       	this.contactsTempState=contactsTempState;
     }
     public String getContactsTempCity(){
       	return this.contactsTempCity;
     }
     public void setContactsTempCity(String contactsTempCity){
       	this.contactsTempCity=contactsTempCity;
     }
     public String getContactsTempDistrict(){
       	return this.contactsTempDistrict;
     }
     public void setContactsTempDistrict(String contactsTempDistrict){
       	this.contactsTempDistrict=contactsTempDistrict;
     }
     public String getContactsTempLine(){
       	return this.contactsTempLine;
     }
     public void setContactsTempLine(String contactsTempLine){
       	this.contactsTempLine=contactsTempLine;
     }
     public String getContactsTempRoad(){
       	return this.contactsTempRoad;
     }
     public void setContactsTempRoad(String contactsTempRoad){
       	this.contactsTempRoad=contactsTempRoad;
     }
     public String getContactsTempHouseNo(){
       	return this.contactsTempHouseNo;
     }
     public void setContactsTempHouseNo(String contactsTempHouseNo){
       	this.contactsTempHouseNo=contactsTempHouseNo;
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
     public String getOpHis(){
       	return this.opHis;
     }
     public void setOpHis(String opHis){
       	this.opHis=opHis;
     }
     public String getObstetricalHistory(){
       	return this.obstetricalHistory;
     }
     public void setObstetricalHistory(String obstetricalHistory){
       	this.obstetricalHistory=obstetricalHistory;
     }
     public String getTransfusionHis(){
       	return this.transfusionHis;
     }
     public void setTransfusionHis(String transfusionHis){
       	this.transfusionHis=transfusionHis;
     }
     public String getRritability(){
       	return this.rritability;
     }
     public void setRritability(String rritability){
       	this.rritability=rritability;
     }
     public String getVaccHis(){
       	return this.vaccHis;
     }
     public void setVaccHis(String vaccHis){
       	this.vaccHis=vaccHis;
     }
     public String getPerHistory(){
       	return this.perHistory;
     }
     public void setPerHistory(String perHistory){
       	this.perHistory=perHistory;
     }
     public String getMensesHis(){
       	return this.mensesHis;
     }
     public void setMensesHis(String mensesHis){
       	this.mensesHis=mensesHis;
     }
     public String getFamHistory(){
       	return this.famHistory;
     }
     public void setFamHistory(String famHistory){
       	this.famHistory=famHistory;
     }
     public String getDeathCode(){
       	return this.deathCode;
     }
     public void setDeathCode(String deathCode){
       	this.deathCode=deathCode;
     }
     public String getInReason(){
       	return this.inReason;
     }
     public void setInReason(String inReason){
       	this.inReason=inReason;
     }
     public String getOtherMedicalTreatment(){
       	return this.otherMedicalTreatment;
     }
     public void setOtherMedicalTreatment(String otherMedicalTreatment){
       	this.otherMedicalTreatment=otherMedicalTreatment;
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
     public Date getEnd(){
       	return this.end;
     }
     public void setEnd(Date end){
       	this.end=end;
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
     public String getDiagnosticCode(){
       	return this.diagnosticCode;
     }
     public void setDiagnosticCode(String diagnosticCode){
       	this.diagnosticCode=diagnosticCode;
     }
     public String getDiagnosticName(){
       	return this.diagnosticName;
     }
     public void setDiagnosticName(String diagnosticName){
       	this.diagnosticName=diagnosticName;
     }
     public Date getOnsetDate(){
       	return this.onsetDate;
     }
     public void setOnsetDate(Date onsetDate){
       	this.onsetDate=onsetDate;
     }
     public String getTreatmentResultCode(){
       	return this.treatmentResultCode;
     }
     public void setTreatmentResultCode(String treatmentResultCode){
       	this.treatmentResultCode=treatmentResultCode;
     }
     public String getOtherDiagnosticCode(){
       	return this.otherDiagnosticCode;
     }
     public void setOtherDiagnosticCode(String otherDiagnosticCode){
       	this.otherDiagnosticCode=otherDiagnosticCode;
     }
     public String getOtherDiagnosticName(){
       	return this.otherDiagnosticName;
     }
     public void setOtherDiagnosticName(String otherDiagnosticName){
       	this.otherDiagnosticName=otherDiagnosticName;
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
     public String getCnTreatmentResultCode(){
       	return this.cnTreatmentResultCode;
     }
     public void setCnTreatmentResultCode(String cnTreatmentResultCode){
       	this.cnTreatmentResultCode=cnTreatmentResultCode;
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
     public String getCrucialDrugName(){
       	return this.crucialDrugName;
     }
     public void setCrucialDrugName(String crucialDrugName){
       	this.crucialDrugName=crucialDrugName;
     }
     public String getCrucialDrugUsage(){
       	return this.crucialDrugUsage;
     }
     public void setCrucialDrugUsage(String crucialDrugUsage){
       	this.crucialDrugUsage=crucialDrugUsage;
     }
     public String getDrugAdverseReaction(){
       	return this.drugAdverseReaction;
     }
     public void setDrugAdverseReaction(String drugAdverseReaction){
       	this.drugAdverseReaction=drugAdverseReaction;
     }
     public String getCnMedicationTypeCode(){
       	return this.cnMedicationTypeCode;
     }
     public void setCnMedicationTypeCode(String cnMedicationTypeCode){
       	this.cnMedicationTypeCode=cnMedicationTypeCode;
     }
     public String getMedicalInsuranceCategory(){
       	return this.medicalInsuranceCategory;
     }
     public void setMedicalInsuranceCategory(String medicalInsuranceCategory){
       	this.medicalInsuranceCategory=medicalInsuranceCategory;
     }
     public String getFeeCode(){
       	return this.feeCode;
     }
     public void setFeeCode(String feeCode){
       	this.feeCode=feeCode;
     }
     public Float getPsnExpense(){
       	return this.psnExpense;
     }
     public void setPsnExpense(Float psnExpense){
       	this.psnExpense=psnExpense;
     }
     public Float getOutpatientExpenses(){
       	return this.outpatientExpenses;
     }
     public void setOutpatientExpenses(Float outpatientExpenses){
       	this.outpatientExpenses=outpatientExpenses;
     }
     public Float getInpatientExpenses(){
       	return this.inpatientExpenses;
     }
     public void setInpatientExpenses(Float inpatientExpenses){
       	this.inpatientExpenses=inpatientExpenses;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}