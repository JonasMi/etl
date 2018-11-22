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
@Table(name = BaseEntity.TABLE_PREFIX + "ADMISSION_RECORD")
public class AdmissionRecord extends FhirResourceEntity {

    /**
     *名称:院内入院记录id
     *
 	 *
 	 *主键字段
     */
     @Column(name="ADMISSION_RECORD_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="ADMISSION_RECORD_ID",displayName="院内入院记录id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String admissionRecordId;
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
     *名称:现居住地址-邮政编码
     *
 	 *
 	 *
     */
     @Column(name="TEMP_POST_CD",length = 50,nullable = true)
     @FhirFieldValidate(name="TEMP_POST_CD",displayName="现居住地址-邮政编码",maxLength=50,required=false,valuesRange="")   
     private String tempPostCd;
    /**
     *名称:现居住地址-详细信息
     *
 	 *
 	 *
     */
     @Column(name="TEMP_TEXT",length = 500,nullable = true)
     @FhirFieldValidate(name="TEMP_TEXT",displayName="现居住地址-详细信息",maxLength=500,required=false,valuesRange="")   
     private String tempText;
    /**
     *名称:出生地住址-省（自治区、直辖市）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="BIRTH_PRO_CODE",length = 10,nullable = true)
     @FhirFieldValidate(name="BIRTH_PRO_CODE",displayName="出生地住址-省（自治区、直辖市）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String birthProCode;
    /**
     *名称:出生地住址-市（地区）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="BIRTH_CITY_CODE",length = 10,nullable = true)
     @FhirFieldValidate(name="BIRTH_CITY_CODE",displayName="出生地住址-市（地区）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String birthCityCode;
    /**
     *名称:出生地住址-县（区）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="BIRTH_COU_CODE",length = 10,nullable = true)
     @FhirFieldValidate(name="BIRTH_COU_CODE",displayName="出生地住址-县（区）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String birthCouCode;
    /**
     *名称:出生地住址-村（街、路、弄等）
     *
 	 *
 	 *
     */
     @Column(name="BIRTH_ADDRESS_VILLAGE",length = 100,nullable = true)
     @FhirFieldValidate(name="BIRTH_ADDRESS_VILLAGE",displayName="出生地住址-村（街、路、弄等）",maxLength=100,required=false,valuesRange="")   
     private String birthAddressVillage;
    /**
     *名称:工作单位
     *
 	 *
 	 *
     */
     @Column(name="WORK_UNIT",length = 100,nullable = true)
     @FhirFieldValidate(name="WORK_UNIT",displayName="工作单位",maxLength=100,required=false,valuesRange="")   
     private String workUnit;
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
     @Column(name="CN_FOUR_RESULT",length = 100,nullable = true)
     @FhirFieldValidate(name="CN_FOUR_RESULT",displayName="中医&quot;四诊&quot;观察结果",maxLength=100,required=false,valuesRange="")   
     private String cnFourResult;
    /**
     *名称:出院科室id
     *
 	 *
 	 *
     */
     @Column(name="OUT_DEPT_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="OUT_DEPT_ID",displayName="出院科室id",maxLength=40,required=false,valuesRange="")   
     private String outDeptId;
    /**
     *名称:出院科室名称
     *
 	 *
 	 *
     */
     @Column(name="OUT_DEPT_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="OUT_DEPT_NAME",displayName="出院科室名称",maxLength=40,required=false,valuesRange="")   
     private String outDeptName;
    /**
     *名称:出院科室标准编码
     *
 	 *限制:CV9900051
 	 *
     */
     @Column(name="OUT_DEPT_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="OUT_DEPT_CD",displayName="出院科室标准编码",maxLength=20,required=false,valuesRange="CV9900051")   
     private String outDeptCd;
    /**
     *名称:住院天数
     *
 	 *
 	 *
     */
     @Column(name="INPATIENT_DAYS",length = 8,nullable = true)
     @FhirFieldValidate(name="INPATIENT_DAYS",displayName="住院天数",maxLength=8,required=false,valuesRange="")   
     private Float inpatientDays;
    /**
     *名称:死亡时间
     *
 	 *
 	 *
     */
     @Column(name="DEATH_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DEATH_TIME",displayName="死亡时间",required=false,valuesRange="")   
     private Date deathTime;
    /**
     *名称:出院病房
     *
 	 *
 	 *
     */
     @Column(name="OUTPAT_WARD_NO",length = 40,nullable = true)
     @FhirFieldValidate(name="OUTPAT_WARD_NO",displayName="出院病房",maxLength=40,required=false,valuesRange="")   
     private String outpatWardNo;
    /**
     *名称:死亡原因描述
     *
 	 *
 	 *
     */
     @Column(name="DEATH_CAUSE",length = 200,nullable = true)
     @FhirFieldValidate(name="DEATH_CAUSE",displayName="死亡原因描述",maxLength=200,required=false,valuesRange="")   
     private String deathCause;
    /**
     *名称:死亡诊断代码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="DEATH_DIAGNOSTIC_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="DEATH_DIAGNOSTIC_CODE",displayName="死亡诊断代码",maxLength=20,required=false,valuesRange="CV990111")   
     private String deathDiagnosticCode;
    /**
     *名称:治疗结果代码
     *
 	 *限制:CV0510010
 	 *
     */
     @Column(name="TREATMENT_RESULT_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="TREATMENT_RESULT_CODE",displayName="治疗结果代码",maxLength=20,required=false,valuesRange="CV0510010")   
     private String treatmentResultCode;
    /**
     *名称:出院医嘱
     *
 	 *
 	 *
     */
     @Column(name="DISCHARGE_ORDER",length = 200,nullable = true)
     @FhirFieldValidate(name="DISCHARGE_ORDER",displayName="出院医嘱",maxLength=200,required=false,valuesRange="")   
     private String dischargeOrder;
    /**
     *名称:病历陈述时间
     *
 	 *
 	 *
     */
     @Column(name="PRESENTATION_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="PRESENTATION_TIME",displayName="病历陈述时间",required=false,valuesRange="")   
     private Date presentationTime;
    /**
     *名称:入院记录类型代码
     *
 	 *限制:CV990107
 	 *
     */
     @Column(name="ADMISSION_RECORD_TYPE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="ADMISSION_RECORD_TYPE_CODE",displayName="入院记录类型代码",maxLength=20,required=false,valuesRange="CV990107")   
     private String admissionRecordTypeCode;
    /**
     *名称:护理科室id
     *
 	 *
 	 *
     */
     @Column(name="NURSING_DEPT_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="NURSING_DEPT_ID",displayName="护理科室id",maxLength=40,required=false,valuesRange="")   
     private String nursingDeptId;
    /**
     *名称:护理科室名称
     *
 	 *
 	 *
     */
     @Column(name="NURSING_DEPT_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="NURSING_DEPT_NAME",displayName="护理科室名称",maxLength=40,required=false,valuesRange="")   
     private String nursingDeptName;
    /**
     *名称:护理科室标准编码
     *
 	 *限制:CV9900051
 	 *
     */
     @Column(name="NURSING_DEPT_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="NURSING_DEPT_CD",displayName="护理科室标准编码",maxLength=20,required=false,valuesRange="CV9900051")   
     private String nursingDeptCd;
    /**
     *名称:最终审核者者id
     *
 	 *
 	 *
     */
     @Column(name="AUDITOR_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="AUDITOR_ID",displayName="最终审核者者id",maxLength=40,required=false,valuesRange="")   
     private String auditorId;
    /**
     *名称:最终审核者姓名
     *
 	 *
 	 *
     */
     @Column(name="AUDITOR_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="AUDITOR_NAME",displayName="最终审核者姓名",maxLength=40,required=false,valuesRange="")   
     private String auditorName;
    /**
     *名称:最终审核者签名日期
     *
 	 *
 	 *
     */
     @Column(name="AUDITOR_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="AUDITOR_DATE",displayName="最终审核者签名日期",required=false,valuesRange="")   
     private Date auditorDate;
    /**
     *名称:最终审核者专业技术职务代码
     *
 	 *限制:CV9900374
 	 *
     */
     @Column(name="AUDITOR_POST",length = 20,nullable = true)
     @FhirFieldValidate(name="AUDITOR_POST",displayName="最终审核者专业技术职务代码",maxLength=20,required=false,valuesRange="CV9900374")   
     private String auditorPost;
    /**
     *名称:住院医师id
     *
 	 *
 	 *
     */
     @Column(name="RESIDENT_DOCTOR_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="RESIDENT_DOCTOR_ID",displayName="住院医师id",maxLength=40,required=false,valuesRange="")   
     private String residentDoctorId;
    /**
     *名称:住院医师姓名
     *
 	 *
 	 *
     */
     @Column(name="RESIDENT_DOCTOR_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="RESIDENT_DOCTOR_NAME",displayName="住院医师姓名",maxLength=20,required=false,valuesRange="")   
     private String residentDoctorName;
    /**
     *名称:住院医师签名日期
     *
 	 *
 	 *
     */
     @Column(name="RESIDENT_DOCTOR_SIGN_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="RESIDENT_DOCTOR_SIGN_DATE",displayName="住院医师签名日期",required=false,valuesRange="")   
     private Date residentDoctorSignDate;
    /**
     *名称:主治医师id
     *
 	 *
 	 *
     */
     @Column(name="ATTENDING_DOCTOR_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="ATTENDING_DOCTOR_ID",displayName="主治医师id",maxLength=40,required=false,valuesRange="")   
     private String attendingDoctorId;
    /**
     *名称:主治医师姓名
     *
 	 *
 	 *
     */
     @Column(name="ATTENDING_DOCTOR_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="ATTENDING_DOCTOR_NAME",displayName="主治医师姓名",maxLength=20,required=false,valuesRange="")   
     private String attendingDoctorName;
    /**
     *名称:主治医师签名日期
     *
 	 *
 	 *
     */
     @Column(name="ATTENDING_DOCTOR_SIGN_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="ATTENDING_DOCTOR_SIGN_DATE",displayName="主治医师签名日期",required=false,valuesRange="")   
     private Date attendingDoctorSignDate;
    /**
     *名称:记录者id
     *
 	 *
 	 *
     */
     @Column(name="RECORDER_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="RECORDER_ID",displayName="记录者id",maxLength=40,required=false,valuesRange="")   
     private String recorderId;
    /**
     *名称:记录者姓名
     *
 	 *
 	 *
     */
     @Column(name="RECORDER_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="RECORDER_NAME",displayName="记录者姓名",maxLength=20,required=false,valuesRange="")   
     private String recorderName;
    /**
     *名称:记录者签名日期
     *
 	 *
 	 *
     */
     @Column(name="RECORDER_SIGN_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="RECORDER_SIGN_DATE",displayName="记录者签名日期",required=false,valuesRange="")   
     private Date recorderSignDate;
    /**
     *名称:接诊医师id
     *
 	 *
 	 *
     */
     @Column(name="RECEIVE_EMPLOYEE_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="RECEIVE_EMPLOYEE_ID",displayName="接诊医师id",maxLength=40,required=false,valuesRange="")   
     private String receiveEmployeeId;
    /**
     *名称:接诊医师姓名
     *
 	 *
 	 *
     */
     @Column(name="RECEIVE_EMPLOYEE_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="RECEIVE_EMPLOYEE_NAME",displayName="接诊医师姓名",maxLength=40,required=false,valuesRange="")   
     private String receiveEmployeeName;
    /**
     *名称:接诊医师签名日期
     *
 	 *
 	 *
     */
     @Column(name="RECEIVE_EMPLOYEE_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="RECEIVE_EMPLOYEE_DATE",displayName="接诊医师签名日期",required=false,valuesRange="")   
     private Date receiveEmployeeDate;
    /**
     *名称:接诊医师专业技术职务代码
     *
 	 *限制:CV9900374
 	 *
     */
     @Column(name="RECEIVE_EMPLOYEE_POST",length = 20,nullable = true)
     @FhirFieldValidate(name="RECEIVE_EMPLOYEE_POST",displayName="接诊医师专业技术职务代码",maxLength=20,required=false,valuesRange="CV9900374")   
     private String receiveEmployeePost;
    /**
     *名称:主管护士id
     *
 	 *
 	 *
     */
     @Column(name="CHARGE_NURSE_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="CHARGE_NURSE_ID",displayName="主管护士id",maxLength=40,required=false,valuesRange="")   
     private String chargeNurseId;
    /**
     *名称:主管护士姓名
     *
 	 *
 	 *
     */
     @Column(name="CHARGE_NURSE_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="CHARGE_NURSE_NAME",displayName="主管护士姓名",maxLength=40,required=false,valuesRange="")   
     private String chargeNurseName;
    /**
     *名称:主管护士签名日期
     *
 	 *
 	 *
     */
     @Column(name="CHARGE_NURSE_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="CHARGE_NURSE_DATE",displayName="主管护士签名日期",required=false,valuesRange="")   
     private Date chargeNurseDate;
    /**
     *名称:主诉
     *
 	 *
 	 *
     */
     @Column(name="CHIEF",columnDefinition="text")
     @FhirFieldValidate(name="CHIEF",displayName="主诉",required=false,valuesRange="")   
     private String chief;
    /**
     *名称:现病史
     *
 	 *
 	 *
     */
     @Column(name="ILLNESS",columnDefinition="text")
     @FhirFieldValidate(name="ILLNESS",displayName="现病史",required=false,valuesRange="")   
     private String illness;
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
     *名称:健康状况标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="HEALTH_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="HEALTH_MARK",displayName="健康状况标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean healthMark;
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
     *名称:传染性标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="INFECTIOUS_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="INFECTIOUS_MARK",displayName="传染性标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean infectiousMark;
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
     *名称:婚育史
     *
 	 *
 	 *
     */
     @Column(name="OBSTETRICAL_HISTORY",columnDefinition="text")
     @FhirFieldValidate(name="OBSTETRICAL_HISTORY",displayName="婚育史",required=false,valuesRange="")   
     private String obstetricalHistory;
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
     *名称:手术史
     *
 	 *
 	 *
     */
     @Column(name="OP_HIS",columnDefinition="text")
     @FhirFieldValidate(name="OP_HIS",displayName="手术史",required=false,valuesRange="")   
     private String opHis;
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
     *名称:输血史描述
     *
 	 *
 	 *
     */
     @Column(name="TRANSFUSION_HIS",columnDefinition="text")
     @FhirFieldValidate(name="TRANSFUSION_HIS",displayName="输血史描述",required=false,valuesRange="")   
     private String transfusionHis;
    /**
     *名称:个人史
     *
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
     *名称:体格检查：体温
     *备注:(体温的测量值，计量单位为℃)
 	 *
 	 *
     */
     @Column(name="BODY_TEMPERATURE",length = 8,nullable = true)
     @FhirFieldValidate(name="BODY_TEMPERATURE",displayName="体格检查：体温",maxLength=8,required=false,valuesRange="")   
     private Float bodyTemperature;
    /**
     *名称:体格检查：脉搏
     *备注:(患者每分钟脉搏次数的测量值，计量单位为次/min)
 	 *
 	 *
     */
     @Column(name="PR_FREQ",length = 4,nullable = true)
     @FhirFieldValidate(name="PR_FREQ",displayName="体格检查：脉搏",maxLength=4,required=false,valuesRange="")   
     private Integer prFreq;
    /**
     *名称:体格检查：呼吸
     *备注:(患者每分钟呼吸次数的测量值，计量单位为次/min)
 	 *
 	 *
     */
     @Column(name="BREATHE_FREQ",length = 4,nullable = true)
     @FhirFieldValidate(name="BREATHE_FREQ",displayName="体格检查：呼吸",maxLength=4,required=false,valuesRange="")   
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
     *名称:体格检查：一般状况
     *
 	 *
 	 *
     */
     @Column(name="GENERAL_SITU_EXAM_RESULT",length = 200,nullable = true)
     @FhirFieldValidate(name="GENERAL_SITU_EXAM_RESULT",displayName="体格检查：一般状况",maxLength=200,required=false,valuesRange="")   
     private String generalSituExamResult;
    /**
     *名称:体格检查：皮肤粘膜
     *
 	 *
 	 *
     */
     @Column(name="SKIN",length = 200,nullable = true)
     @FhirFieldValidate(name="SKIN",displayName="体格检查：皮肤粘膜",maxLength=200,required=false,valuesRange="")   
     private String skin;
    /**
     *名称:体格检查：淋巴结
     *
 	 *
 	 *
     */
     @Column(name="LN",length = 200,nullable = true)
     @FhirFieldValidate(name="LN",displayName="体格检查：淋巴结",maxLength=200,required=false,valuesRange="")   
     private String ln;
    /**
     *名称:体格检查：头部
     *
 	 *
 	 *
     */
     @Column(name="HEAD",length = 200,nullable = true)
     @FhirFieldValidate(name="HEAD",displayName="体格检查：头部",maxLength=200,required=false,valuesRange="")   
     private String head;
    /**
     *名称:体格检查：颈部
     *
 	 *
 	 *
     */
     @Column(name="NECK",length = 200,nullable = true)
     @FhirFieldValidate(name="NECK",displayName="体格检查：颈部",maxLength=200,required=false,valuesRange="")   
     private String neck;
    /**
     *名称:体格检查：胸部
     *
 	 *
 	 *
     */
     @Column(name="CHEST",length = 200,nullable = true)
     @FhirFieldValidate(name="CHEST",displayName="体格检查：胸部",maxLength=200,required=false,valuesRange="")   
     private String chest;
    /**
     *名称:体格检查：腹部
     *
 	 *
 	 *
     */
     @Column(name="BELLY",length = 200,nullable = true)
     @FhirFieldValidate(name="BELLY",displayName="体格检查：腹部",maxLength=200,required=false,valuesRange="")   
     private String belly;
    /**
     *名称:体格检查：肛门直肠
     *
 	 *
 	 *
     */
     @Column(name="DRE_RESULT_DESCR",length = 200,nullable = true)
     @FhirFieldValidate(name="DRE_RESULT_DESCR",displayName="体格检查：肛门直肠",maxLength=200,required=false,valuesRange="")   
     private String dreResultDescr;
    /**
     *名称:体格检查：生殖器
     *
 	 *
 	 *
     */
     @Column(name="ANUS_PUDENDUM",length = 200,nullable = true)
     @FhirFieldValidate(name="ANUS_PUDENDUM",displayName="体格检查：生殖器",maxLength=200,required=false,valuesRange="")   
     private String anusPudendum;
    /**
     *名称:体格检查：脊椎
     *
 	 *
 	 *
     */
     @Column(name="SPINE",length = 200,nullable = true)
     @FhirFieldValidate(name="SPINE",displayName="体格检查：脊椎",maxLength=200,required=false,valuesRange="")   
     private String spine;
    /**
     *名称:体格检查：四肢
     *
 	 *
 	 *
     */
     @Column(name="LIMBS",length = 200,nullable = true)
     @FhirFieldValidate(name="LIMBS",displayName="体格检查：四肢",maxLength=200,required=false,valuesRange="")   
     private String limbs;
    /**
     *名称:体格检查：神经系统
     *
 	 *
 	 *
     */
     @Column(name="MENTAL",length = 200,nullable = true)
     @FhirFieldValidate(name="MENTAL",displayName="体格检查：神经系统",maxLength=200,required=false,valuesRange="")   
     private String mental;
    /**
     *名称:专科情况检查
     *
 	 *
 	 *
     */
     @Column(name="SPECIALIST_CHECKS",length = 200,nullable = true)
     @FhirFieldValidate(name="SPECIALIST_CHECKS",displayName="专科情况检查",maxLength=200,required=false,valuesRange="")   
     private String specialistChecks;
    /**
     *名称:体格检查：肺
     *
 	 *
 	 *
     */
     @Column(name="LUNG",length = 200,nullable = true)
     @FhirFieldValidate(name="LUNG",displayName="体格检查：肺",maxLength=200,required=false,valuesRange="")   
     private String lung;
    /**
     *名称:体格检查：心
     *
 	 *
 	 *
     */
     @Column(name="HEART",length = 200,nullable = true)
     @FhirFieldValidate(name="HEART",displayName="体格检查：心",maxLength=200,required=false,valuesRange="")   
     private String heart;
    /**
     *名称:体格检查：周围血管
     *
 	 *
 	 *
     */
     @Column(name="PERIPHERAL_VESSELS",length = 200,nullable = true)
     @FhirFieldValidate(name="PERIPHERAL_VESSELS",displayName="体格检查：周围血管",maxLength=200,required=false,valuesRange="")   
     private String peripheralVessels;
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
     *名称:陈述内容可靠标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="STATEMENTS_RELIABILITY",length = 5,nullable = true)
     @FhirFieldValidate(name="STATEMENTS_RELIABILITY",displayName="陈述内容可靠标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean statementsReliability;
    /**
     *名称:治则治法
     *
 	 *限制:GBT167513
 	 *
     */
     @Column(name="THERAPEUTIC_PRINCIPLES",length = 20,nullable = true)
     @FhirFieldValidate(name="THERAPEUTIC_PRINCIPLES",displayName="治则治法",maxLength=20,required=false,valuesRange="GBT167513")   
     private String therapeuticPrinciples;
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
     *名称:初步诊断-记录id
     *
 	 *
 	 *
     */
     @Column(name="PRELIMINARY_DIAG_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="PRELIMINARY_DIAG_ID",displayName="初步诊断-记录id",maxLength=40,required=false,valuesRange="")   
     private String preliminaryDiagId;
    /**
     *名称:初步诊断-中医症候代码
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="PRELIMINARY_CN_SYM_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="PRELIMINARY_CN_SYM_DIAG_CODE",displayName="初步诊断-中医症候代码",maxLength=20,required=false,valuesRange="CV9900357")   
     private String preliminaryCnSymDiagCode;
    /**
     *名称:初步诊断-中医病名代码
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="PRELIMINARY_CN_DIS_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="PRELIMINARY_CN_DIS_DIAG_CODE",displayName="初步诊断-中医病名代码",maxLength=20,required=false,valuesRange="CV9900357")   
     private String preliminaryCnDisDiagCode;
    /**
     *名称:初步诊断-西医诊断顺位
     *
 	 *
 	 *
     */
     @Column(name="PRELIMINARY_ADMIT_DIAG",length = 8,nullable = true)
     @FhirFieldValidate(name="PRELIMINARY_ADMIT_DIAG",displayName="初步诊断-西医诊断顺位",maxLength=8,required=false,valuesRange="")   
     private Float preliminaryAdmitDiag;
    /**
     *名称:初步诊断-中医诊断顺位
     *
 	 *
 	 *
     */
     @Column(name="PRELIMINARY_TCM_ADMIT_DIAG",length = 8,nullable = true)
     @FhirFieldValidate(name="PRELIMINARY_TCM_ADMIT_DIAG",displayName="初步诊断-中医诊断顺位",maxLength=8,required=false,valuesRange="")   
     private Float preliminaryTcmAdmitDiag;
    /**
     *名称:初步诊断-诊断编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="PRELIMINARY_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="PRELIMINARY_DIAG_CODE",displayName="初步诊断-诊断编码",maxLength=20,required=false,valuesRange="CV990111")   
     private String preliminaryDiagCode;
    /**
     *名称:初步诊断-诊断编码名称
     *
 	 *
 	 *
     */
     @Column(name="PRELIMINARY_DIAG_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="PRELIMINARY_DIAG_NAME",displayName="初步诊断-诊断编码名称",maxLength=40,required=false,valuesRange="")   
     private String preliminaryDiagName;
    /**
     *名称:初步诊断-诊断日期
     *
 	 *
 	 *
     */
     @Column(name="PRELIMINARY_DIAG_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="PRELIMINARY_DIAG_DATE",displayName="初步诊断-诊断日期",required=false,valuesRange="")   
     private Date preliminaryDiagDate;
    /**
     *名称:修正诊断-记录id
     *
 	 *
 	 *
     */
     @Column(name="CORRECT_DIAG_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="CORRECT_DIAG_ID",displayName="修正诊断-记录id",maxLength=40,required=false,valuesRange="")   
     private String correctDiagId;
    /**
     *名称:修正诊断-中医症候代码
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="CORRECT_CN_SYM_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="CORRECT_CN_SYM_DIAG_CODE",displayName="修正诊断-中医症候代码",maxLength=20,required=false,valuesRange="CV9900357")   
     private String correctCnSymDiagCode;
    /**
     *名称:修正诊断-中医病名代码
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="CORRECT_CN_DIS_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="CORRECT_CN_DIS_DIAG_CODE",displayName="修正诊断-中医病名代码",maxLength=20,required=false,valuesRange="CV9900357")   
     private String correctCnDisDiagCode;
    /**
     *名称:修正诊断-西医诊断顺位
     *
 	 *
 	 *
     */
     @Column(name="CORRECT_ADMIT_DIAG",length = 8,nullable = true)
     @FhirFieldValidate(name="CORRECT_ADMIT_DIAG",displayName="修正诊断-西医诊断顺位",maxLength=8,required=false,valuesRange="")   
     private Float correctAdmitDiag;
    /**
     *名称:修正诊断-中医诊断顺位
     *
 	 *
 	 *
     */
     @Column(name="CORRECT_TCM_ADMIT_DIAG",length = 8,nullable = true)
     @FhirFieldValidate(name="CORRECT_TCM_ADMIT_DIAG",displayName="修正诊断-中医诊断顺位",maxLength=8,required=false,valuesRange="")   
     private Float correctTcmAdmitDiag;
    /**
     *名称:修正诊断-诊断编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="CORRECT_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="CORRECT_DIAG_CODE",displayName="修正诊断-诊断编码",maxLength=20,required=false,valuesRange="CV990111")   
     private String correctDiagCode;
    /**
     *名称:修正诊断-诊断编码名称
     *
 	 *
 	 *
     */
     @Column(name="CORRECT_DIAG_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="CORRECT_DIAG_NAME",displayName="修正诊断-诊断编码名称",maxLength=40,required=false,valuesRange="")   
     private String correctDiagName;
    /**
     *名称:修正诊断-诊断日期
     *
 	 *
 	 *
     */
     @Column(name="CORRECT_DIAG_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="CORRECT_DIAG_DATE",displayName="修正诊断-诊断日期",required=false,valuesRange="")   
     private Date correctDiagDate;
    /**
     *名称:确定诊断-记录id
     *
 	 *
 	 *
     */
     @Column(name="DETERMINE_DIAG_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="DETERMINE_DIAG_ID",displayName="确定诊断-记录id",maxLength=40,required=false,valuesRange="")   
     private String determineDiagId;
    /**
     *名称:确定诊断-中医症候代码
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="DETERMINE_CN_SYM_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="DETERMINE_CN_SYM_DIAG_CODE",displayName="确定诊断-中医症候代码",maxLength=20,required=false,valuesRange="CV9900357")   
     private String determineCnSymDiagCode;
    /**
     *名称:确定诊断-中医病名代码
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="DETERMINE_CN_DIS_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="DETERMINE_CN_DIS_DIAG_CODE",displayName="确定诊断-中医病名代码",maxLength=20,required=false,valuesRange="CV9900357")   
     private String determineCnDisDiagCode;
    /**
     *名称:确定诊断-西医诊断顺位
     *
 	 *
 	 *
     */
     @Column(name="DETERMINE_ADMIT_DIAG",length = 8,nullable = true)
     @FhirFieldValidate(name="DETERMINE_ADMIT_DIAG",displayName="确定诊断-西医诊断顺位",maxLength=8,required=false,valuesRange="")   
     private Float determineAdmitDiag;
    /**
     *名称:确定诊断-中医诊断顺位
     *
 	 *
 	 *
     */
     @Column(name="DETERMINE_TCM_ADMIT_DIAG",length = 8,nullable = true)
     @FhirFieldValidate(name="DETERMINE_TCM_ADMIT_DIAG",displayName="确定诊断-中医诊断顺位",maxLength=8,required=false,valuesRange="")   
     private Float determineTcmAdmitDiag;
    /**
     *名称:确定诊断-诊断编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="DETERMINE_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="DETERMINE_DIAG_CODE",displayName="确定诊断-诊断编码",maxLength=20,required=false,valuesRange="CV990111")   
     private String determineDiagCode;
    /**
     *名称:确定诊断-诊断编码名称
     *
 	 *
 	 *
     */
     @Column(name="DETERMINE_DIAG_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="DETERMINE_DIAG_NAME",displayName="确定诊断-诊断编码名称",maxLength=40,required=false,valuesRange="")   
     private String determineDiagName;
    /**
     *名称:确定诊断-诊断日期
     *
 	 *
 	 *
     */
     @Column(name="DETERMINE_DIAG_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DETERMINE_DIAG_DATE",displayName="确定诊断-诊断日期",required=false,valuesRange="")   
     private Date determineDiagDate;
    /**
     *名称:补充诊断-记录id
     *
 	 *
 	 *
     */
     @Column(name="SUPPLEMENT_DIAG_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="SUPPLEMENT_DIAG_ID",displayName="补充诊断-记录id",maxLength=40,required=false,valuesRange="")   
     private String supplementDiagId;
    /**
     *名称:补充诊断-中医症候代码
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="SUPPLEMENT_CN_SYM_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="SUPPLEMENT_CN_SYM_DIAG_CODE",displayName="补充诊断-中医症候代码",maxLength=20,required=false,valuesRange="CV9900357")   
     private String supplementCnSymDiagCode;
    /**
     *名称:补充诊断-中医病名代码
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="SUPPLEMENT_CN_DIS_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="SUPPLEMENT_CN_DIS_DIAG_CODE",displayName="补充诊断-中医病名代码",maxLength=20,required=false,valuesRange="CV9900357")   
     private String supplementCnDisDiagCode;
    /**
     *名称:补充诊断-西医诊断顺位
     *
 	 *
 	 *
     */
     @Column(name="SUPPLEMENT_ADMIT_DIAG",length = 8,nullable = true)
     @FhirFieldValidate(name="SUPPLEMENT_ADMIT_DIAG",displayName="补充诊断-西医诊断顺位",maxLength=8,required=false,valuesRange="")   
     private Float supplementAdmitDiag;
    /**
     *名称:补充诊断-中医诊断顺位
     *
 	 *
 	 *
     */
     @Column(name="SUPPLEMENT_TCM_ADMIT_DIAG",length = 8,nullable = true)
     @FhirFieldValidate(name="SUPPLEMENT_TCM_ADMIT_DIAG",displayName="补充诊断-中医诊断顺位",maxLength=8,required=false,valuesRange="")   
     private Float supplementTcmAdmitDiag;
    /**
     *名称:补充诊断-诊断编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="SUPPLEMENT_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="SUPPLEMENT_DIAG_CODE",displayName="补充诊断-诊断编码",maxLength=20,required=false,valuesRange="CV990111")   
     private String supplementDiagCode;
    /**
     *名称:补充诊断-诊断编码名称
     *
 	 *
 	 *
     */
     @Column(name="SUPPLEMENT_DIAG_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="SUPPLEMENT_DIAG_NAME",displayName="补充诊断-诊断编码名称",maxLength=40,required=false,valuesRange="")   
     private String supplementDiagName;
    /**
     *名称:补充诊断-诊断日期
     *
 	 *
 	 *
     */
     @Column(name="SUPPLEMENT_DIAG_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="SUPPLEMENT_DIAG_DATE",displayName="补充诊断-诊断日期",required=false,valuesRange="")   
     private Date supplementDiagDate;
    /**
     *名称:入院诊断-记录id
     *
 	 *
 	 *
     */
     @Column(name="INHOS_DIAG_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="INHOS_DIAG_ID",displayName="入院诊断-记录id",maxLength=40,required=false,valuesRange="")   
     private String inhosDiagId;
    /**
     *名称:入院情况
     *
 	 *
 	 *
     */
     @Column(name="INPATIENT_DETAILS",length = 200,nullable = true)
     @FhirFieldValidate(name="INPATIENT_DETAILS",displayName="入院情况",maxLength=200,required=false,valuesRange="")   
     private String inpatientDetails;
    /**
     *名称:入院诊断-中医症候代码
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="INHOS_CN_SYM_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="INHOS_CN_SYM_DIAG_CODE",displayName="入院诊断-中医症候代码",maxLength=20,required=false,valuesRange="CV9900357")   
     private String inhosCnSymDiagCode;
    /**
     *名称:入院诊断-中医病名代码
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="INHOS_CN_DIS_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="INHOS_CN_DIS_DIAG_CODE",displayName="入院诊断-中医病名代码",maxLength=20,required=false,valuesRange="CV9900357")   
     private String inhosCnDisDiagCode;
    /**
     *名称:入院诊断-西医诊断顺位
     *
 	 *
 	 *
     */
     @Column(name="INHOS_ADMIT_DIAG",length = 8,nullable = true)
     @FhirFieldValidate(name="INHOS_ADMIT_DIAG",displayName="入院诊断-西医诊断顺位",maxLength=8,required=false,valuesRange="")   
     private Float inhosAdmitDiag;
    /**
     *名称:入院诊断-中医诊断顺位
     *
 	 *
 	 *
     */
     @Column(name="INHOS_TCM_ADMIT_DIAG",length = 8,nullable = true)
     @FhirFieldValidate(name="INHOS_TCM_ADMIT_DIAG",displayName="入院诊断-中医诊断顺位",maxLength=8,required=false,valuesRange="")   
     private Float inhosTcmAdmitDiag;
    /**
     *名称:入院诊断-诊断编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="INHOS_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="INHOS_DIAG_CODE",displayName="入院诊断-诊断编码",maxLength=20,required=false,valuesRange="CV990111")   
     private String inhosDiagCode;
    /**
     *名称:入院诊断-诊断编码名称
     *
 	 *
 	 *
     */
     @Column(name="INHOS_DIAG_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="INHOS_DIAG_NAME",displayName="入院诊断-诊断编码名称",maxLength=40,required=false,valuesRange="")   
     private String inhosDiagName;
    /**
     *名称:入院诊断-诊断日期
     *
 	 *
 	 *
     */
     @Column(name="INHOS_DIAG_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="INHOS_DIAG_DATE",displayName="入院诊断-诊断日期",required=false,valuesRange="")   
     private Date inhosDiagDate;
    /**
     *名称:出院诊断-记录id
     *
 	 *
 	 *
     */
     @Column(name="OUTHOS_DIAG_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="OUTHOS_DIAG_ID",displayName="出院诊断-记录id",maxLength=40,required=false,valuesRange="")   
     private String outhosDiagId;
    /**
     *名称:出院情况
     *
 	 *
 	 *
     */
     @Column(name="OUTPATIENT_DETAILS",length = 200,nullable = true)
     @FhirFieldValidate(name="OUTPATIENT_DETAILS",displayName="出院情况",maxLength=200,required=false,valuesRange="")   
     private String outpatientDetails;
    /**
     *名称:出院诊断-诊断编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="OUTHOS_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="OUTHOS_DIAG_CODE",displayName="出院诊断-诊断编码",maxLength=20,required=false,valuesRange="CV990111")   
     private String outhosDiagCode;
    /**
     *名称:出院诊断-诊断编码名称
     *
 	 *
 	 *
     */
     @Column(name="OUTHOS_DIAG_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="OUTHOS_DIAG_NAME",displayName="出院诊断-诊断编码名称",maxLength=40,required=false,valuesRange="")   
     private String outhosDiagName;
    /**
     *名称:出院诊断-诊断日期
     *
 	 *
 	 *
     */
     @Column(name="OUTHOS_DIAG_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="OUTHOS_DIAG_DATE",displayName="出院诊断-诊断日期",required=false,valuesRange="")   
     private Date outhosDiagDate;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getAdmissionRecordId(){
       	return this.admissionRecordId;
     }
     public void setAdmissionRecordId(String admissionRecordId){
       	this.admissionRecordId=admissionRecordId;
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
     public String getTempText(){
       	return this.tempText;
     }
     public void setTempText(String tempText){
       	this.tempText=tempText;
     }
     public String getBirthProCode(){
       	return this.birthProCode;
     }
     public void setBirthProCode(String birthProCode){
       	this.birthProCode=birthProCode;
     }
     public String getBirthCityCode(){
       	return this.birthCityCode;
     }
     public void setBirthCityCode(String birthCityCode){
       	this.birthCityCode=birthCityCode;
     }
     public String getBirthCouCode(){
       	return this.birthCouCode;
     }
     public void setBirthCouCode(String birthCouCode){
       	this.birthCouCode=birthCouCode;
     }
     public String getBirthAddressVillage(){
       	return this.birthAddressVillage;
     }
     public void setBirthAddressVillage(String birthAddressVillage){
       	this.birthAddressVillage=birthAddressVillage;
     }
     public String getWorkUnit(){
       	return this.workUnit;
     }
     public void setWorkUnit(String workUnit){
       	this.workUnit=workUnit;
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
     public String getOutDeptId(){
       	return this.outDeptId;
     }
     public void setOutDeptId(String outDeptId){
       	this.outDeptId=outDeptId;
     }
     public String getOutDeptName(){
       	return this.outDeptName;
     }
     public void setOutDeptName(String outDeptName){
       	this.outDeptName=outDeptName;
     }
     public String getOutDeptCd(){
       	return this.outDeptCd;
     }
     public void setOutDeptCd(String outDeptCd){
       	this.outDeptCd=outDeptCd;
     }
     public Float getInpatientDays(){
       	return this.inpatientDays;
     }
     public void setInpatientDays(Float inpatientDays){
       	this.inpatientDays=inpatientDays;
     }
     public Date getDeathTime(){
       	return this.deathTime;
     }
     public void setDeathTime(Date deathTime){
       	this.deathTime=deathTime;
     }
     public String getOutpatWardNo(){
       	return this.outpatWardNo;
     }
     public void setOutpatWardNo(String outpatWardNo){
       	this.outpatWardNo=outpatWardNo;
     }
     public String getDeathCause(){
       	return this.deathCause;
     }
     public void setDeathCause(String deathCause){
       	this.deathCause=deathCause;
     }
     public String getDeathDiagnosticCode(){
       	return this.deathDiagnosticCode;
     }
     public void setDeathDiagnosticCode(String deathDiagnosticCode){
       	this.deathDiagnosticCode=deathDiagnosticCode;
     }
     public String getTreatmentResultCode(){
       	return this.treatmentResultCode;
     }
     public void setTreatmentResultCode(String treatmentResultCode){
       	this.treatmentResultCode=treatmentResultCode;
     }
     public String getDischargeOrder(){
       	return this.dischargeOrder;
     }
     public void setDischargeOrder(String dischargeOrder){
       	this.dischargeOrder=dischargeOrder;
     }
     public Date getPresentationTime(){
       	return this.presentationTime;
     }
     public void setPresentationTime(Date presentationTime){
       	this.presentationTime=presentationTime;
     }
     public String getAdmissionRecordTypeCode(){
       	return this.admissionRecordTypeCode;
     }
     public void setAdmissionRecordTypeCode(String admissionRecordTypeCode){
       	this.admissionRecordTypeCode=admissionRecordTypeCode;
     }
     public String getNursingDeptId(){
       	return this.nursingDeptId;
     }
     public void setNursingDeptId(String nursingDeptId){
       	this.nursingDeptId=nursingDeptId;
     }
     public String getNursingDeptName(){
       	return this.nursingDeptName;
     }
     public void setNursingDeptName(String nursingDeptName){
       	this.nursingDeptName=nursingDeptName;
     }
     public String getNursingDeptCd(){
       	return this.nursingDeptCd;
     }
     public void setNursingDeptCd(String nursingDeptCd){
       	this.nursingDeptCd=nursingDeptCd;
     }
     public String getAuditorId(){
       	return this.auditorId;
     }
     public void setAuditorId(String auditorId){
       	this.auditorId=auditorId;
     }
     public String getAuditorName(){
       	return this.auditorName;
     }
     public void setAuditorName(String auditorName){
       	this.auditorName=auditorName;
     }
     public Date getAuditorDate(){
       	return this.auditorDate;
     }
     public void setAuditorDate(Date auditorDate){
       	this.auditorDate=auditorDate;
     }
     public String getAuditorPost(){
       	return this.auditorPost;
     }
     public void setAuditorPost(String auditorPost){
       	this.auditorPost=auditorPost;
     }
     public String getResidentDoctorId(){
       	return this.residentDoctorId;
     }
     public void setResidentDoctorId(String residentDoctorId){
       	this.residentDoctorId=residentDoctorId;
     }
     public String getResidentDoctorName(){
       	return this.residentDoctorName;
     }
     public void setResidentDoctorName(String residentDoctorName){
       	this.residentDoctorName=residentDoctorName;
     }
     public Date getResidentDoctorSignDate(){
       	return this.residentDoctorSignDate;
     }
     public void setResidentDoctorSignDate(Date residentDoctorSignDate){
       	this.residentDoctorSignDate=residentDoctorSignDate;
     }
     public String getAttendingDoctorId(){
       	return this.attendingDoctorId;
     }
     public void setAttendingDoctorId(String attendingDoctorId){
       	this.attendingDoctorId=attendingDoctorId;
     }
     public String getAttendingDoctorName(){
       	return this.attendingDoctorName;
     }
     public void setAttendingDoctorName(String attendingDoctorName){
       	this.attendingDoctorName=attendingDoctorName;
     }
     public Date getAttendingDoctorSignDate(){
       	return this.attendingDoctorSignDate;
     }
     public void setAttendingDoctorSignDate(Date attendingDoctorSignDate){
       	this.attendingDoctorSignDate=attendingDoctorSignDate;
     }
     public String getRecorderId(){
       	return this.recorderId;
     }
     public void setRecorderId(String recorderId){
       	this.recorderId=recorderId;
     }
     public String getRecorderName(){
       	return this.recorderName;
     }
     public void setRecorderName(String recorderName){
       	this.recorderName=recorderName;
     }
     public Date getRecorderSignDate(){
       	return this.recorderSignDate;
     }
     public void setRecorderSignDate(Date recorderSignDate){
       	this.recorderSignDate=recorderSignDate;
     }
     public String getReceiveEmployeeId(){
       	return this.receiveEmployeeId;
     }
     public void setReceiveEmployeeId(String receiveEmployeeId){
       	this.receiveEmployeeId=receiveEmployeeId;
     }
     public String getReceiveEmployeeName(){
       	return this.receiveEmployeeName;
     }
     public void setReceiveEmployeeName(String receiveEmployeeName){
       	this.receiveEmployeeName=receiveEmployeeName;
     }
     public Date getReceiveEmployeeDate(){
       	return this.receiveEmployeeDate;
     }
     public void setReceiveEmployeeDate(Date receiveEmployeeDate){
       	this.receiveEmployeeDate=receiveEmployeeDate;
     }
     public String getReceiveEmployeePost(){
       	return this.receiveEmployeePost;
     }
     public void setReceiveEmployeePost(String receiveEmployeePost){
       	this.receiveEmployeePost=receiveEmployeePost;
     }
     public String getChargeNurseId(){
       	return this.chargeNurseId;
     }
     public void setChargeNurseId(String chargeNurseId){
       	this.chargeNurseId=chargeNurseId;
     }
     public String getChargeNurseName(){
       	return this.chargeNurseName;
     }
     public void setChargeNurseName(String chargeNurseName){
       	this.chargeNurseName=chargeNurseName;
     }
     public Date getChargeNurseDate(){
       	return this.chargeNurseDate;
     }
     public void setChargeNurseDate(Date chargeNurseDate){
       	this.chargeNurseDate=chargeNurseDate;
     }
     public String getChief(){
       	return this.chief;
     }
     public void setChief(String chief){
       	this.chief=chief;
     }
     public String getIllness(){
       	return this.illness;
     }
     public void setIllness(String illness){
       	this.illness=illness;
     }
     public String getHistory(){
       	return this.history;
     }
     public void setHistory(String history){
       	this.history=history;
     }
     public Boolean getHealthMark(){
       	return this.healthMark;
     }
     public void setHealthMark(Boolean healthMark){
       	this.healthMark=healthMark;
     }
     public String getHistoryOfDisease(){
       	return this.historyOfDisease;
     }
     public void setHistoryOfDisease(String historyOfDisease){
       	this.historyOfDisease=historyOfDisease;
     }
     public Boolean getInfectiousMark(){
       	return this.infectiousMark;
     }
     public void setInfectiousMark(Boolean infectiousMark){
       	this.infectiousMark=infectiousMark;
     }
     public String getInfectionHistory(){
       	return this.infectionHistory;
     }
     public void setInfectionHistory(String infectionHistory){
       	this.infectionHistory=infectionHistory;
     }
     public String getObstetricalHistory(){
       	return this.obstetricalHistory;
     }
     public void setObstetricalHistory(String obstetricalHistory){
       	this.obstetricalHistory=obstetricalHistory;
     }
     public String getRritability(){
       	return this.rritability;
     }
     public void setRritability(String rritability){
       	this.rritability=rritability;
     }
     public String getOpHis(){
       	return this.opHis;
     }
     public void setOpHis(String opHis){
       	this.opHis=opHis;
     }
     public String getVaccHis(){
       	return this.vaccHis;
     }
     public void setVaccHis(String vaccHis){
       	this.vaccHis=vaccHis;
     }
     public String getTransfusionHis(){
       	return this.transfusionHis;
     }
     public void setTransfusionHis(String transfusionHis){
       	this.transfusionHis=transfusionHis;
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
     public String getGeneralSituExamResult(){
       	return this.generalSituExamResult;
     }
     public void setGeneralSituExamResult(String generalSituExamResult){
       	this.generalSituExamResult=generalSituExamResult;
     }
     public String getSkin(){
       	return this.skin;
     }
     public void setSkin(String skin){
       	this.skin=skin;
     }
     public String getLn(){
       	return this.ln;
     }
     public void setLn(String ln){
       	this.ln=ln;
     }
     public String getHead(){
       	return this.head;
     }
     public void setHead(String head){
       	this.head=head;
     }
     public String getNeck(){
       	return this.neck;
     }
     public void setNeck(String neck){
       	this.neck=neck;
     }
     public String getChest(){
       	return this.chest;
     }
     public void setChest(String chest){
       	this.chest=chest;
     }
     public String getBelly(){
       	return this.belly;
     }
     public void setBelly(String belly){
       	this.belly=belly;
     }
     public String getDreResultDescr(){
       	return this.dreResultDescr;
     }
     public void setDreResultDescr(String dreResultDescr){
       	this.dreResultDescr=dreResultDescr;
     }
     public String getAnusPudendum(){
       	return this.anusPudendum;
     }
     public void setAnusPudendum(String anusPudendum){
       	this.anusPudendum=anusPudendum;
     }
     public String getSpine(){
       	return this.spine;
     }
     public void setSpine(String spine){
       	this.spine=spine;
     }
     public String getLimbs(){
       	return this.limbs;
     }
     public void setLimbs(String limbs){
       	this.limbs=limbs;
     }
     public String getMental(){
       	return this.mental;
     }
     public void setMental(String mental){
       	this.mental=mental;
     }
     public String getSpecialistChecks(){
       	return this.specialistChecks;
     }
     public void setSpecialistChecks(String specialistChecks){
       	this.specialistChecks=specialistChecks;
     }
     public String getLung(){
       	return this.lung;
     }
     public void setLung(String lung){
       	this.lung=lung;
     }
     public String getHeart(){
       	return this.heart;
     }
     public void setHeart(String heart){
       	this.heart=heart;
     }
     public String getPeripheralVessels(){
       	return this.peripheralVessels;
     }
     public void setPeripheralVessels(String peripheralVessels){
       	this.peripheralVessels=peripheralVessels;
     }
     public String getAuxiliaryExaminationResults(){
       	return this.auxiliaryExaminationResults;
     }
     public void setAuxiliaryExaminationResults(String auxiliaryExaminationResults){
       	this.auxiliaryExaminationResults=auxiliaryExaminationResults;
     }
     public Boolean getStatementsReliability(){
       	return this.statementsReliability;
     }
     public void setStatementsReliability(Boolean statementsReliability){
       	this.statementsReliability=statementsReliability;
     }
     public String getTherapeuticPrinciples(){
       	return this.therapeuticPrinciples;
     }
     public void setTherapeuticPrinciples(String therapeuticPrinciples){
       	this.therapeuticPrinciples=therapeuticPrinciples;
     }
     public String getTreatRescueCourse(){
       	return this.treatRescueCourse;
     }
     public void setTreatRescueCourse(String treatRescueCourse){
       	this.treatRescueCourse=treatRescueCourse;
     }
     public String getPreliminaryDiagId(){
       	return this.preliminaryDiagId;
     }
     public void setPreliminaryDiagId(String preliminaryDiagId){
       	this.preliminaryDiagId=preliminaryDiagId;
     }
     public String getPreliminaryCnSymDiagCode(){
       	return this.preliminaryCnSymDiagCode;
     }
     public void setPreliminaryCnSymDiagCode(String preliminaryCnSymDiagCode){
       	this.preliminaryCnSymDiagCode=preliminaryCnSymDiagCode;
     }
     public String getPreliminaryCnDisDiagCode(){
       	return this.preliminaryCnDisDiagCode;
     }
     public void setPreliminaryCnDisDiagCode(String preliminaryCnDisDiagCode){
       	this.preliminaryCnDisDiagCode=preliminaryCnDisDiagCode;
     }
     public Float getPreliminaryAdmitDiag(){
       	return this.preliminaryAdmitDiag;
     }
     public void setPreliminaryAdmitDiag(Float preliminaryAdmitDiag){
       	this.preliminaryAdmitDiag=preliminaryAdmitDiag;
     }
     public Float getPreliminaryTcmAdmitDiag(){
       	return this.preliminaryTcmAdmitDiag;
     }
     public void setPreliminaryTcmAdmitDiag(Float preliminaryTcmAdmitDiag){
       	this.preliminaryTcmAdmitDiag=preliminaryTcmAdmitDiag;
     }
     public String getPreliminaryDiagCode(){
       	return this.preliminaryDiagCode;
     }
     public void setPreliminaryDiagCode(String preliminaryDiagCode){
       	this.preliminaryDiagCode=preliminaryDiagCode;
     }
     public String getPreliminaryDiagName(){
       	return this.preliminaryDiagName;
     }
     public void setPreliminaryDiagName(String preliminaryDiagName){
       	this.preliminaryDiagName=preliminaryDiagName;
     }
     public Date getPreliminaryDiagDate(){
       	return this.preliminaryDiagDate;
     }
     public void setPreliminaryDiagDate(Date preliminaryDiagDate){
       	this.preliminaryDiagDate=preliminaryDiagDate;
     }
     public String getCorrectDiagId(){
       	return this.correctDiagId;
     }
     public void setCorrectDiagId(String correctDiagId){
       	this.correctDiagId=correctDiagId;
     }
     public String getCorrectCnSymDiagCode(){
       	return this.correctCnSymDiagCode;
     }
     public void setCorrectCnSymDiagCode(String correctCnSymDiagCode){
       	this.correctCnSymDiagCode=correctCnSymDiagCode;
     }
     public String getCorrectCnDisDiagCode(){
       	return this.correctCnDisDiagCode;
     }
     public void setCorrectCnDisDiagCode(String correctCnDisDiagCode){
       	this.correctCnDisDiagCode=correctCnDisDiagCode;
     }
     public Float getCorrectAdmitDiag(){
       	return this.correctAdmitDiag;
     }
     public void setCorrectAdmitDiag(Float correctAdmitDiag){
       	this.correctAdmitDiag=correctAdmitDiag;
     }
     public Float getCorrectTcmAdmitDiag(){
       	return this.correctTcmAdmitDiag;
     }
     public void setCorrectTcmAdmitDiag(Float correctTcmAdmitDiag){
       	this.correctTcmAdmitDiag=correctTcmAdmitDiag;
     }
     public String getCorrectDiagCode(){
       	return this.correctDiagCode;
     }
     public void setCorrectDiagCode(String correctDiagCode){
       	this.correctDiagCode=correctDiagCode;
     }
     public String getCorrectDiagName(){
       	return this.correctDiagName;
     }
     public void setCorrectDiagName(String correctDiagName){
       	this.correctDiagName=correctDiagName;
     }
     public Date getCorrectDiagDate(){
       	return this.correctDiagDate;
     }
     public void setCorrectDiagDate(Date correctDiagDate){
       	this.correctDiagDate=correctDiagDate;
     }
     public String getDetermineDiagId(){
       	return this.determineDiagId;
     }
     public void setDetermineDiagId(String determineDiagId){
       	this.determineDiagId=determineDiagId;
     }
     public String getDetermineCnSymDiagCode(){
       	return this.determineCnSymDiagCode;
     }
     public void setDetermineCnSymDiagCode(String determineCnSymDiagCode){
       	this.determineCnSymDiagCode=determineCnSymDiagCode;
     }
     public String getDetermineCnDisDiagCode(){
       	return this.determineCnDisDiagCode;
     }
     public void setDetermineCnDisDiagCode(String determineCnDisDiagCode){
       	this.determineCnDisDiagCode=determineCnDisDiagCode;
     }
     public Float getDetermineAdmitDiag(){
       	return this.determineAdmitDiag;
     }
     public void setDetermineAdmitDiag(Float determineAdmitDiag){
       	this.determineAdmitDiag=determineAdmitDiag;
     }
     public Float getDetermineTcmAdmitDiag(){
       	return this.determineTcmAdmitDiag;
     }
     public void setDetermineTcmAdmitDiag(Float determineTcmAdmitDiag){
       	this.determineTcmAdmitDiag=determineTcmAdmitDiag;
     }
     public String getDetermineDiagCode(){
       	return this.determineDiagCode;
     }
     public void setDetermineDiagCode(String determineDiagCode){
       	this.determineDiagCode=determineDiagCode;
     }
     public String getDetermineDiagName(){
       	return this.determineDiagName;
     }
     public void setDetermineDiagName(String determineDiagName){
       	this.determineDiagName=determineDiagName;
     }
     public Date getDetermineDiagDate(){
       	return this.determineDiagDate;
     }
     public void setDetermineDiagDate(Date determineDiagDate){
       	this.determineDiagDate=determineDiagDate;
     }
     public String getSupplementDiagId(){
       	return this.supplementDiagId;
     }
     public void setSupplementDiagId(String supplementDiagId){
       	this.supplementDiagId=supplementDiagId;
     }
     public String getSupplementCnSymDiagCode(){
       	return this.supplementCnSymDiagCode;
     }
     public void setSupplementCnSymDiagCode(String supplementCnSymDiagCode){
       	this.supplementCnSymDiagCode=supplementCnSymDiagCode;
     }
     public String getSupplementCnDisDiagCode(){
       	return this.supplementCnDisDiagCode;
     }
     public void setSupplementCnDisDiagCode(String supplementCnDisDiagCode){
       	this.supplementCnDisDiagCode=supplementCnDisDiagCode;
     }
     public Float getSupplementAdmitDiag(){
       	return this.supplementAdmitDiag;
     }
     public void setSupplementAdmitDiag(Float supplementAdmitDiag){
       	this.supplementAdmitDiag=supplementAdmitDiag;
     }
     public Float getSupplementTcmAdmitDiag(){
       	return this.supplementTcmAdmitDiag;
     }
     public void setSupplementTcmAdmitDiag(Float supplementTcmAdmitDiag){
       	this.supplementTcmAdmitDiag=supplementTcmAdmitDiag;
     }
     public String getSupplementDiagCode(){
       	return this.supplementDiagCode;
     }
     public void setSupplementDiagCode(String supplementDiagCode){
       	this.supplementDiagCode=supplementDiagCode;
     }
     public String getSupplementDiagName(){
       	return this.supplementDiagName;
     }
     public void setSupplementDiagName(String supplementDiagName){
       	this.supplementDiagName=supplementDiagName;
     }
     public Date getSupplementDiagDate(){
       	return this.supplementDiagDate;
     }
     public void setSupplementDiagDate(Date supplementDiagDate){
       	this.supplementDiagDate=supplementDiagDate;
     }
     public String getInhosDiagId(){
       	return this.inhosDiagId;
     }
     public void setInhosDiagId(String inhosDiagId){
       	this.inhosDiagId=inhosDiagId;
     }
     public String getInpatientDetails(){
       	return this.inpatientDetails;
     }
     public void setInpatientDetails(String inpatientDetails){
       	this.inpatientDetails=inpatientDetails;
     }
     public String getInhosCnSymDiagCode(){
       	return this.inhosCnSymDiagCode;
     }
     public void setInhosCnSymDiagCode(String inhosCnSymDiagCode){
       	this.inhosCnSymDiagCode=inhosCnSymDiagCode;
     }
     public String getInhosCnDisDiagCode(){
       	return this.inhosCnDisDiagCode;
     }
     public void setInhosCnDisDiagCode(String inhosCnDisDiagCode){
       	this.inhosCnDisDiagCode=inhosCnDisDiagCode;
     }
     public Float getInhosAdmitDiag(){
       	return this.inhosAdmitDiag;
     }
     public void setInhosAdmitDiag(Float inhosAdmitDiag){
       	this.inhosAdmitDiag=inhosAdmitDiag;
     }
     public Float getInhosTcmAdmitDiag(){
       	return this.inhosTcmAdmitDiag;
     }
     public void setInhosTcmAdmitDiag(Float inhosTcmAdmitDiag){
       	this.inhosTcmAdmitDiag=inhosTcmAdmitDiag;
     }
     public String getInhosDiagCode(){
       	return this.inhosDiagCode;
     }
     public void setInhosDiagCode(String inhosDiagCode){
       	this.inhosDiagCode=inhosDiagCode;
     }
     public String getInhosDiagName(){
       	return this.inhosDiagName;
     }
     public void setInhosDiagName(String inhosDiagName){
       	this.inhosDiagName=inhosDiagName;
     }
     public Date getInhosDiagDate(){
       	return this.inhosDiagDate;
     }
     public void setInhosDiagDate(Date inhosDiagDate){
       	this.inhosDiagDate=inhosDiagDate;
     }
     public String getOuthosDiagId(){
       	return this.outhosDiagId;
     }
     public void setOuthosDiagId(String outhosDiagId){
       	this.outhosDiagId=outhosDiagId;
     }
     public String getOutpatientDetails(){
       	return this.outpatientDetails;
     }
     public void setOutpatientDetails(String outpatientDetails){
       	this.outpatientDetails=outpatientDetails;
     }
     public String getOuthosDiagCode(){
       	return this.outhosDiagCode;
     }
     public void setOuthosDiagCode(String outhosDiagCode){
       	this.outhosDiagCode=outhosDiagCode;
     }
     public String getOuthosDiagName(){
       	return this.outhosDiagName;
     }
     public void setOuthosDiagName(String outhosDiagName){
       	this.outhosDiagName=outhosDiagName;
     }
     public Date getOuthosDiagDate(){
       	return this.outhosDiagDate;
     }
     public void setOuthosDiagDate(Date outhosDiagDate){
       	this.outhosDiagDate=outhosDiagDate;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}