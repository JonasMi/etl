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
@Table(name = BaseEntity.TABLE_PREFIX + "DISCHARGE_SUMMARY")
public class DischargeSummary extends FhirResourceEntity {

    /**
     *名称:出院小结id
     *
 	 *
 	 *主键字段
     */
     @Column(name="DISCHARGE_SUMMARY_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="DISCHARGE_SUMMARY_ID",displayName="出院小结id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String dischargeSummaryId;
    /**
     *名称:出院小结类型
     *
 	 *限制:CV990108
 	 *
     */
     @Column(name="DISCHARGE_SUMMARY_TYPE",length = 20,nullable = true)
     @FhirFieldValidate(name="DISCHARGE_SUMMARY_TYPE",displayName="出院小结类型",maxLength=20,required=false,valuesRange="CV990108")   
     private String dischargeSummaryType;
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
     *名称:患者年龄
     *
 	 *
 	 *
     */
     @Column(name="AGE",length = 8,nullable = true)
     @FhirFieldValidate(name="AGE",displayName="患者年龄",maxLength=8,required=false,valuesRange="")   
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
     *名称:民族代码
     *
 	 *限制:CV9900377
 	 *
     */
     @Column(name="NATION_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="NATION_CD",displayName="民族代码",maxLength=20,required=false,valuesRange="CV9900377")   
     private String nationCd;
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
     *名称:工作住址-省（自治区、直辖市）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="WORK_STATE",length = 10,nullable = true)
     @FhirFieldValidate(name="WORK_STATE",displayName="工作住址-省（自治区、直辖市）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String workState;
    /**
     *名称:工作住址-市（地区）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="WORK_CITY",length = 10,nullable = true)
     @FhirFieldValidate(name="WORK_CITY",displayName="工作住址-市（地区）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String workCity;
    /**
     *名称:工作住址-县（区）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="WORK_DISTRICT",length = 10,nullable = true)
     @FhirFieldValidate(name="WORK_DISTRICT",displayName="工作住址-县（区）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String workDistrict;
    /**
     *名称:工作住址-乡（镇、街道办事处）
     *
 	 *
 	 *
     */
     @Column(name="WORK_LINE",length = 100,nullable = true)
     @FhirFieldValidate(name="WORK_LINE",displayName="工作住址-乡（镇、街道办事处）",maxLength=100,required=false,valuesRange="")   
     private String workLine;
    /**
     *名称:工作住址-村（街、路、弄等）
     *
 	 *
 	 *
     */
     @Column(name="WORK_ROAD",length = 100,nullable = true)
     @FhirFieldValidate(name="WORK_ROAD",displayName="工作住址-村（街、路、弄等）",maxLength=100,required=false,valuesRange="")   
     private String workRoad;
    /**
     *名称:工作住址-门牌号码
     *
 	 *
 	 *
     */
     @Column(name="WORK_HOUSE_NO",length = 50,nullable = true)
     @FhirFieldValidate(name="WORK_HOUSE_NO",displayName="工作住址-门牌号码",maxLength=50,required=false,valuesRange="")   
     private String workHouseNo;
    /**
     *名称:工作地址邮政编码
     *
 	 *
 	 *
     */
     @Column(name="WORK_POST_CD",length = 50,nullable = true)
     @FhirFieldValidate(name="WORK_POST_CD",displayName="工作地址邮政编码",maxLength=50,required=false,valuesRange="")   
     private String workPostCd;
    /**
     *名称:工作地址详细信息
     *
 	 *
 	 *
     */
     @Column(name="WORK_ADDRESS_DETAILS",length = 50,nullable = true)
     @FhirFieldValidate(name="WORK_ADDRESS_DETAILS",displayName="工作地址详细信息",maxLength=50,required=false,valuesRange="")   
     private String workAddressDetails;
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
     *名称:现居住地址邮政编码
     *
 	 *
 	 *
     */
     @Column(name="TEMP_POST_CD",length = 50,nullable = true)
     @FhirFieldValidate(name="TEMP_POST_CD",displayName="现居住地址邮政编码",maxLength=50,required=false,valuesRange="")   
     private String tempPostCd;
    /**
     *名称:现居住址详细信息
     *
 	 *
 	 *
     */
     @Column(name="TEMP_ADDRESS_DETAILS",length = 50,nullable = true)
     @FhirFieldValidate(name="TEMP_ADDRESS_DETAILS",displayName="现居住址详细信息",maxLength=50,required=false,valuesRange="")   
     private String tempAddressDetails;
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
     *名称:法定审核者签名日期
     *
 	 *
 	 *
     */
     @Column(name="STATUTORY_AUDIT_SIGN_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="STATUTORY_AUDIT_SIGN_DATE",displayName="法定审核者签名日期",required=false,valuesRange="")   
     private Date statutoryAuditSignDate;
    /**
     *名称:法定审核者id
     *
 	 *
 	 *
     */
     @Column(name="STATUTORY_AUDIT_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="STATUTORY_AUDIT_ID",displayName="法定审核者id",maxLength=40,required=false,valuesRange="")   
     private String statutoryAuditId;
    /**
     *名称:法定审核者姓名
     *
 	 *
 	 *
     */
     @Column(name="STATUTORY_AUDIT_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="STATUTORY_AUDIT_NAME",displayName="法定审核者姓名",maxLength=20,required=false,valuesRange="")   
     private String statutoryAuditName;
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
     *名称:主治医师签名日期
     *
 	 *
 	 *
     */
     @Column(name="ATTENDING_PHYSICIAN_SIGN_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="ATTENDING_PHYSICIAN_SIGN_DATE",displayName="主治医师签名日期",required=false,valuesRange="")   
     private Date attendingPhysicianSignDate;
    /**
     *名称:主治医师id
     *
 	 *
 	 *
     */
     @Column(name="ATTENDING_PHYSICIAN_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="ATTENDING_PHYSICIAN_ID",displayName="主治医师id",maxLength=40,required=false,valuesRange="")   
     private String attendingPhysicianId;
    /**
     *名称:主治医师姓名
     *
 	 *
 	 *
     */
     @Column(name="ATTENDING_PHYSICIAN_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="ATTENDING_PHYSICIAN_NAME",displayName="主治医师姓名",maxLength=20,required=false,valuesRange="")   
     private String attendingPhysicianName;
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
     @Column(name="START_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="START_TIME",displayName="入院时间",required=false,valuesRange="")   
     private Date startTime;
    /**
     *名称:出院时间
     *
 	 *
 	 *
     */
     @Column(name="END_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="END_TIME",displayName="出院时间",required=false,valuesRange="")   
     private Date endTime;
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
     @Column(name="WARD_NO",length = 40,nullable = true)
     @FhirFieldValidate(name="WARD_NO",displayName="病房号",maxLength=40,required=false,valuesRange="")   
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
     @Column(name="BED_NUM",length = 40,nullable = true)
     @FhirFieldValidate(name="BED_NUM",displayName="床位号",maxLength=40,required=false,valuesRange="")   
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
     *名称:住院天数
     *
 	 *
 	 *
     */
     @Column(name="INPATIENT_DAYS",length = 8,nullable = true)
     @FhirFieldValidate(name="INPATIENT_DAYS",displayName="住院天数",maxLength=8,required=false,valuesRange="")   
     private Float inpatientDays;
    /**
     *名称:入院情况
     *
 	 *
 	 *
     */
     @Column(name="INPATIENT_CIRCUMSTANCE",length = 200,nullable = true)
     @FhirFieldValidate(name="INPATIENT_CIRCUMSTANCE",displayName="入院情况",maxLength=200,required=false,valuesRange="")   
     private String inpatientCircumstance;
    /**
     *名称:入院诊断-中医征候诊断代码
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="IN_CN_SYM_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="IN_CN_SYM_DIAG_CODE",displayName="入院诊断-中医征候诊断代码",maxLength=20,required=false,valuesRange="CV9900357")   
     private String inCnSymDiagCode;
    /**
     *名称:入院诊断-中医病名诊断代码
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="IN_CN_DIS_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="IN_CN_DIS_DIAG_CODE",displayName="入院诊断-中医病名诊断代码",maxLength=20,required=false,valuesRange="CV9900357")   
     private String inCnDisDiagCode;
    /**
     *名称:入院诊断-诊断编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="IN_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="IN_DIAG_CODE",displayName="入院诊断-诊断编码",maxLength=20,required=false,valuesRange="CV990111")   
     private String inDiagCode;
    /**
     *名称:入院诊断-诊断名称
     *
 	 *
 	 *
     */
     @Column(name="IN_DIAG_VALUE",length = 20,nullable = true)
     @FhirFieldValidate(name="IN_DIAG_VALUE",displayName="入院诊断-诊断名称",maxLength=20,required=false,valuesRange="")   
     private String inDiagValue;
    /**
     *名称:入院诊断-诊断日期
     *
 	 *
 	 *
     */
     @Column(name="IN_DIAG_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="IN_DIAG_DATE",displayName="入院诊断-诊断日期",required=false,valuesRange="")   
     private Date inDiagDate;
    /**
     *名称:出院诊断-中医征候诊断代码
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="OUT_CN_SYM_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="OUT_CN_SYM_DIAG_CODE",displayName="出院诊断-中医征候诊断代码",maxLength=20,required=false,valuesRange="CV9900357")   
     private String outCnSymDiagCode;
    /**
     *名称:出院诊断-中医病名诊断代码
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="OUT_CN_DIS_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="OUT_CN_DIS_DIAG_CODE",displayName="出院诊断-中医病名诊断代码",maxLength=20,required=false,valuesRange="CV9900357")   
     private String outCnDisDiagCode;
    /**
     *名称:出院诊断-出院时症状与体征
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="OUT_DISCHARGE_SYMPTOM_AND_SIGN",length = 20,nullable = true)
     @FhirFieldValidate(name="OUT_DISCHARGE_SYMPTOM_AND_SIGN",displayName="出院诊断-出院时症状与体征",maxLength=20,required=false,valuesRange="CV9900357")   
     private String outDischargeSymptomAndSign;
    /**
     *名称:出院诊断-出院情况
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="OUT_DISCHARGE_CIRCUMSTANCE",length = 100,nullable = true)
     @FhirFieldValidate(name="OUT_DISCHARGE_CIRCUMSTANCE",displayName="出院诊断-出院情况",maxLength=100,required=false,valuesRange="CV9900357")   
     private String outDischargeCircumstance;
    /**
     *名称:出院诊断-治疗结果代码
     *
 	 *限制:CV0510010
 	 *
     */
     @Column(name="OUT_TREATMENT_RESULT_CODE",length = 40,nullable = true)
     @FhirFieldValidate(name="OUT_TREATMENT_RESULT_CODE",displayName="出院诊断-治疗结果代码",maxLength=40,required=false,valuesRange="CV0510010")   
     private String outTreatmentResultCode;
    /**
     *名称:出院诊断-诊断编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="OUT_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="OUT_DIAG_CODE",displayName="出院诊断-诊断编码",maxLength=20,required=false,valuesRange="CV990111")   
     private String outDiagCode;
    /**
     *名称:出院诊断-诊断名称
     *
 	 *
 	 *
     */
     @Column(name="OUT_DIAG_VALUE",length = 20,nullable = true)
     @FhirFieldValidate(name="OUT_DIAG_VALUE",displayName="出院诊断-诊断名称",maxLength=20,required=false,valuesRange="")   
     private String outDiagValue;
    /**
     *名称:出院诊断-诊断日期
     *
 	 *
 	 *
     */
     @Column(name="OUT_DIAG_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="OUT_DIAG_DATE",displayName="出院诊断-诊断日期",required=false,valuesRange="")   
     private Date outDiagDate;
    /**
     *名称:切口类别代码
     *
 	 *限制:CV0510022
 	 *
     */
     @Column(name="INCISION_TYPE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="INCISION_TYPE_CODE",displayName="切口类别代码",maxLength=20,required=false,valuesRange="CV0510022")   
     private String incisionTypeCode;
    /**
     *名称:切口愈合级别代码
     *
 	 *限制:CV550114
 	 *
     */
     @Column(name="INCISION_HEALING_RANK_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="INCISION_HEALING_RANK_CODE",displayName="切口愈合级别代码",maxLength=20,required=false,valuesRange="CV550114")   
     private String incisionHealingRankCode;
    /**
     *名称:手术过程
     *
 	 *
 	 *
     */
     @Column(name="OPERATION_COURSES",length = 2000,nullable = true)
     @FhirFieldValidate(name="OPERATION_COURSES",displayName="手术过程",maxLength=2000,required=false,valuesRange="")   
     private String operationCourses;
    /**
     *名称:手术单号
     *
 	 *
 	 *
     */
     @Column(name="OPERATION_ID",length = 20,nullable = true)
     @FhirFieldValidate(name="OPERATION_ID",displayName="手术单号",maxLength=20,required=false,valuesRange="")   
     private String operationId;
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
     *名称:治则治法
     *
 	 *
 	 *
     */
     @Column(name="THERAPEUTIC_PRINCIPLES",length = 200,nullable = true)
     @FhirFieldValidate(name="THERAPEUTIC_PRINCIPLES",displayName="治则治法",maxLength=200,required=false,valuesRange="")   
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
     *名称:出院医嘱
     *
 	 *
 	 *
     */
     @Column(name="DISCHARGE_ADVICE",length = 200,nullable = true)
     @FhirFieldValidate(name="DISCHARGE_ADVICE",displayName="出院医嘱",maxLength=200,required=false,valuesRange="")   
     private String dischargeAdvice;
    /**
     *名称:中药煎煮法
     *
 	 *
 	 *
     */
     @Column(name="CN_PRESCRIBE_DESCR",length = 200,nullable = true)
     @FhirFieldValidate(name="CN_PRESCRIBE_DESCR",displayName="中药煎煮法",maxLength=200,required=false,valuesRange="")   
     private String cnPrescribeDescr;
    /**
     *名称:中药服用方法代码
     *
 	 *限制:CV9900304
 	 *
     */
     @Column(name="CN_DRUG_WAY_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="CN_DRUG_WAY_CD",displayName="中药服用方法代码",maxLength=20,required=false,valuesRange="CV9900304")   
     private String cnDrugWayCd;
    /**
     *名称:阳性辅助检查结果
     *
 	 *
 	 *
     */
     @Column(name="POSITIVE_AUX_INSPECTION_RESULT",length = 200,nullable = true)
     @FhirFieldValidate(name="POSITIVE_AUX_INSPECTION_RESULT",displayName="阳性辅助检查结果",maxLength=200,required=false,valuesRange="")   
     private String positiveAuxInspectionResult;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getDischargeSummaryId(){
       	return this.dischargeSummaryId;
     }
     public void setDischargeSummaryId(String dischargeSummaryId){
       	this.dischargeSummaryId=dischargeSummaryId;
     }
     public String getDischargeSummaryType(){
       	return this.dischargeSummaryType;
     }
     public void setDischargeSummaryType(String dischargeSummaryType){
       	this.dischargeSummaryType=dischargeSummaryType;
     }
     public Date getDate(){
       	return this.date;
     }
     public void setDate(Date date){
       	this.date=date;
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
     public String getNationCd(){
       	return this.nationCd;
     }
     public void setNationCd(String nationCd){
       	this.nationCd=nationCd;
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
     public String getWorkState(){
       	return this.workState;
     }
     public void setWorkState(String workState){
       	this.workState=workState;
     }
     public String getWorkCity(){
       	return this.workCity;
     }
     public void setWorkCity(String workCity){
       	this.workCity=workCity;
     }
     public String getWorkDistrict(){
       	return this.workDistrict;
     }
     public void setWorkDistrict(String workDistrict){
       	this.workDistrict=workDistrict;
     }
     public String getWorkLine(){
       	return this.workLine;
     }
     public void setWorkLine(String workLine){
       	this.workLine=workLine;
     }
     public String getWorkRoad(){
       	return this.workRoad;
     }
     public void setWorkRoad(String workRoad){
       	this.workRoad=workRoad;
     }
     public String getWorkHouseNo(){
       	return this.workHouseNo;
     }
     public void setWorkHouseNo(String workHouseNo){
       	this.workHouseNo=workHouseNo;
     }
     public String getWorkPostCd(){
       	return this.workPostCd;
     }
     public void setWorkPostCd(String workPostCd){
       	this.workPostCd=workPostCd;
     }
     public String getWorkAddressDetails(){
       	return this.workAddressDetails;
     }
     public void setWorkAddressDetails(String workAddressDetails){
       	this.workAddressDetails=workAddressDetails;
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
     public String getTempAddressDetails(){
       	return this.tempAddressDetails;
     }
     public void setTempAddressDetails(String tempAddressDetails){
       	this.tempAddressDetails=tempAddressDetails;
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
     public Date getStatutoryAuditSignDate(){
       	return this.statutoryAuditSignDate;
     }
     public void setStatutoryAuditSignDate(Date statutoryAuditSignDate){
       	this.statutoryAuditSignDate=statutoryAuditSignDate;
     }
     public String getStatutoryAuditId(){
       	return this.statutoryAuditId;
     }
     public void setStatutoryAuditId(String statutoryAuditId){
       	this.statutoryAuditId=statutoryAuditId;
     }
     public String getStatutoryAuditName(){
       	return this.statutoryAuditName;
     }
     public void setStatutoryAuditName(String statutoryAuditName){
       	this.statutoryAuditName=statutoryAuditName;
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
     public Date getResidentDoctorSignDate(){
       	return this.residentDoctorSignDate;
     }
     public void setResidentDoctorSignDate(Date residentDoctorSignDate){
       	this.residentDoctorSignDate=residentDoctorSignDate;
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
     public Date getAttendingPhysicianSignDate(){
       	return this.attendingPhysicianSignDate;
     }
     public void setAttendingPhysicianSignDate(Date attendingPhysicianSignDate){
       	this.attendingPhysicianSignDate=attendingPhysicianSignDate;
     }
     public String getAttendingPhysicianId(){
       	return this.attendingPhysicianId;
     }
     public void setAttendingPhysicianId(String attendingPhysicianId){
       	this.attendingPhysicianId=attendingPhysicianId;
     }
     public String getAttendingPhysicianName(){
       	return this.attendingPhysicianName;
     }
     public void setAttendingPhysicianName(String attendingPhysicianName){
       	this.attendingPhysicianName=attendingPhysicianName;
     }
     public String getInpatientRegistrationId(){
       	return this.inpatientRegistrationId;
     }
     public void setInpatientRegistrationId(String inpatientRegistrationId){
       	this.inpatientRegistrationId=inpatientRegistrationId;
     }
     public Date getStartTime(){
       	return this.startTime;
     }
     public void setStartTime(Date startTime){
       	this.startTime=startTime;
     }
     public Date getEndTime(){
       	return this.endTime;
     }
     public void setEndTime(Date endTime){
       	this.endTime=endTime;
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
     public Float getInpatientDays(){
       	return this.inpatientDays;
     }
     public void setInpatientDays(Float inpatientDays){
       	this.inpatientDays=inpatientDays;
     }
     public String getInpatientCircumstance(){
       	return this.inpatientCircumstance;
     }
     public void setInpatientCircumstance(String inpatientCircumstance){
       	this.inpatientCircumstance=inpatientCircumstance;
     }
     public String getInCnSymDiagCode(){
       	return this.inCnSymDiagCode;
     }
     public void setInCnSymDiagCode(String inCnSymDiagCode){
       	this.inCnSymDiagCode=inCnSymDiagCode;
     }
     public String getInCnDisDiagCode(){
       	return this.inCnDisDiagCode;
     }
     public void setInCnDisDiagCode(String inCnDisDiagCode){
       	this.inCnDisDiagCode=inCnDisDiagCode;
     }
     public String getInDiagCode(){
       	return this.inDiagCode;
     }
     public void setInDiagCode(String inDiagCode){
       	this.inDiagCode=inDiagCode;
     }
     public String getInDiagValue(){
       	return this.inDiagValue;
     }
     public void setInDiagValue(String inDiagValue){
       	this.inDiagValue=inDiagValue;
     }
     public Date getInDiagDate(){
       	return this.inDiagDate;
     }
     public void setInDiagDate(Date inDiagDate){
       	this.inDiagDate=inDiagDate;
     }
     public String getOutCnSymDiagCode(){
       	return this.outCnSymDiagCode;
     }
     public void setOutCnSymDiagCode(String outCnSymDiagCode){
       	this.outCnSymDiagCode=outCnSymDiagCode;
     }
     public String getOutCnDisDiagCode(){
       	return this.outCnDisDiagCode;
     }
     public void setOutCnDisDiagCode(String outCnDisDiagCode){
       	this.outCnDisDiagCode=outCnDisDiagCode;
     }
     public String getOutDischargeSymptomAndSign(){
       	return this.outDischargeSymptomAndSign;
     }
     public void setOutDischargeSymptomAndSign(String outDischargeSymptomAndSign){
       	this.outDischargeSymptomAndSign=outDischargeSymptomAndSign;
     }
     public String getOutDischargeCircumstance(){
       	return this.outDischargeCircumstance;
     }
     public void setOutDischargeCircumstance(String outDischargeCircumstance){
       	this.outDischargeCircumstance=outDischargeCircumstance;
     }
     public String getOutTreatmentResultCode(){
       	return this.outTreatmentResultCode;
     }
     public void setOutTreatmentResultCode(String outTreatmentResultCode){
       	this.outTreatmentResultCode=outTreatmentResultCode;
     }
     public String getOutDiagCode(){
       	return this.outDiagCode;
     }
     public void setOutDiagCode(String outDiagCode){
       	this.outDiagCode=outDiagCode;
     }
     public String getOutDiagValue(){
       	return this.outDiagValue;
     }
     public void setOutDiagValue(String outDiagValue){
       	this.outDiagValue=outDiagValue;
     }
     public Date getOutDiagDate(){
       	return this.outDiagDate;
     }
     public void setOutDiagDate(Date outDiagDate){
       	this.outDiagDate=outDiagDate;
     }
     public String getIncisionTypeCode(){
       	return this.incisionTypeCode;
     }
     public void setIncisionTypeCode(String incisionTypeCode){
       	this.incisionTypeCode=incisionTypeCode;
     }
     public String getIncisionHealingRankCode(){
       	return this.incisionHealingRankCode;
     }
     public void setIncisionHealingRankCode(String incisionHealingRankCode){
       	this.incisionHealingRankCode=incisionHealingRankCode;
     }
     public String getOperationCourses(){
       	return this.operationCourses;
     }
     public void setOperationCourses(String operationCourses){
       	this.operationCourses=operationCourses;
     }
     public String getOperationId(){
       	return this.operationId;
     }
     public void setOperationId(String operationId){
       	this.operationId=operationId;
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
     public String getDischargeAdvice(){
       	return this.dischargeAdvice;
     }
     public void setDischargeAdvice(String dischargeAdvice){
       	this.dischargeAdvice=dischargeAdvice;
     }
     public String getCnPrescribeDescr(){
       	return this.cnPrescribeDescr;
     }
     public void setCnPrescribeDescr(String cnPrescribeDescr){
       	this.cnPrescribeDescr=cnPrescribeDescr;
     }
     public String getCnDrugWayCd(){
       	return this.cnDrugWayCd;
     }
     public void setCnDrugWayCd(String cnDrugWayCd){
       	this.cnDrugWayCd=cnDrugWayCd;
     }
     public String getPositiveAuxInspectionResult(){
       	return this.positiveAuxInspectionResult;
     }
     public void setPositiveAuxInspectionResult(String positiveAuxInspectionResult){
       	this.positiveAuxInspectionResult=positiveAuxInspectionResult;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}