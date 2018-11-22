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
@Table(name = BaseEntity.TABLE_PREFIX + "ADMISSION_DISCHARGE_RECORD")
public class AdmissionDischargeRecord extends FhirResourceEntity {

    /**
     *名称:院内24h内入出院记录id
     *
 	 *
 	 *主键字段
     */
     @Column(name="ADMISSION_DISCHARGE_RECORD_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="ADMISSION_DISCHARGE_RECORD_ID",displayName="院内24h内入出院记录id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String admissionDischargeRecordId;
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
     *名称:中医"四诊"观察结果
     *
 	 *
 	 *
     */
     @Column(name="CN_FOUR_RESULT",length = 200,nullable = true)
     @FhirFieldValidate(name="CN_FOUR_RESULT",displayName="中医&quot;四诊&quot;观察结果",maxLength=200,required=false,valuesRange="")   
     private String cnFourResult;
    /**
     *名称:接诊医生id
     *
 	 *
 	 *
     */
     @Column(name="RECEIVE_EMPLOYEE_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="RECEIVE_EMPLOYEE_ID",displayName="接诊医生id",maxLength=40,required=false,valuesRange="")   
     private String receiveEmployeeId;
    /**
     *名称:接诊医生姓名
     *
 	 *
 	 *
     */
     @Column(name="RECEIVE_EMPLOYEE_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="RECEIVE_EMPLOYEE_NAME",displayName="接诊医生姓名",maxLength=40,required=false,valuesRange="")   
     private String receiveEmployeeName;
    /**
     *名称:接诊医生专业技术职务代码
     *
 	 *限制:CV9900374
 	 *
     */
     @Column(name="RECEIVE_EMPLOYEE_POST_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="RECEIVE_EMPLOYEE_POST_CD",displayName="接诊医生专业技术职务代码",maxLength=20,required=false,valuesRange="CV9900374")   
     private String receiveEmployeePostCd;
    /**
     *名称:病案号
     *
 	 *
 	 *
     */
     @Column(name="CASE_NO",length = 20,nullable = true)
     @FhirFieldValidate(name="CASE_NO",displayName="病案号",maxLength=20,required=false,valuesRange="")   
     private String caseNo;
    /**
     *名称:住院次数
     *
 	 *
 	 *
     */
     @Column(name="INPAT_TIMES",length = 8,nullable = true)
     @FhirFieldValidate(name="INPAT_TIMES",displayName="住院次数",maxLength=8,required=false,valuesRange="")   
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
     *名称:主(副主)任医师id
     *
 	 *
 	 *
     */
     @Column(name="CHIEF_PHYSICIAN_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="CHIEF_PHYSICIAN_ID",displayName="主(副主)任医师id",maxLength=40,required=false,valuesRange="")   
     private String chiefPhysicianId;
    /**
     *名称:主(副主)任医师姓名
     *
 	 *
 	 *
     */
     @Column(name="CHIEF_PHYSICIAN_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="CHIEF_PHYSICIAN_NAME",displayName="主(副主)任医师姓名",maxLength=20,required=false,valuesRange="")   
     private String chiefPhysicianName;
    /**
     *名称:主(副主)任医师签名日期
     *
 	 *
 	 *
     */
     @Column(name="CHIEF_PHYSICIAN_SIGN_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="CHIEF_PHYSICIAN_SIGN_DATE",displayName="主(副主)任医师签名日期",required=false,valuesRange="")   
     private Date chiefPhysicianSignDate;
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
     *名称:陈述内容可靠标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="STATEMENTS_RELIABILITY",length = 5,nullable = true)
     @FhirFieldValidate(name="STATEMENTS_RELIABILITY",displayName="陈述内容可靠标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean statementsReliability;
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
     *名称:症状描述
     *
 	 *
 	 *
     */
     @Column(name="SYMPTOM_DESCRIPTION",length = 40,nullable = true)
     @FhirFieldValidate(name="SYMPTOM_DESCRIPTION",displayName="症状描述",maxLength=40,required=false,valuesRange="")   
     private String symptomDescription;
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
     *名称:入院诊断-记录id
     *
 	 *
 	 *
     */
     @Column(name="INHOS_DIAG_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="INHOS_DIAG_ID",displayName="入院诊断-记录id",maxLength=40,required=false,valuesRange="")   
     private String inhosDiagId;
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
     *名称:入院情况
     *
 	 *
 	 *
     */
     @Column(name="INPATIENT_DETAILS",length = 200,nullable = true)
     @FhirFieldValidate(name="INPATIENT_DETAILS",displayName="入院情况",maxLength=200,required=false,valuesRange="")   
     private String inpatientDetails;
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
     *名称:出院诊断-中医症候代码
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="OUTHOS_CN_SYM_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="OUTHOS_CN_SYM_DIAG_CODE",displayName="出院诊断-中医症候代码",maxLength=20,required=false,valuesRange="CV9900357")   
     private String outhosCnSymDiagCode;
    /**
     *名称:出院诊断-中医病名代码
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="OUTHOS_CN_DIS_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="OUTHOS_CN_DIS_DIAG_CODE",displayName="出院诊断-中医病名代码",maxLength=20,required=false,valuesRange="CV9900357")   
     private String outhosCnDisDiagCode;
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
     *名称:出院情况
     *
 	 *
 	 *
     */
     @Column(name="OUTPATIENT_DETAILS",length = 200,nullable = true)
     @FhirFieldValidate(name="OUTPATIENT_DETAILS",displayName="出院情况",maxLength=200,required=false,valuesRange="")   
     private String outpatientDetails;
    /**
     *名称:医嘱内容
     *备注:中药饮片煎煮方法描述
 	 *
 	 *
     */
     @Column(name="CN_PRESCRIBE",length = 100,nullable = true)
     @FhirFieldValidate(name="CN_PRESCRIBE",displayName="医嘱内容",maxLength=100,required=false,valuesRange="")   
     private String cnPrescribe;
    /**
     *名称:中药煎煮法
     *备注:中药饮片煎煮方法描述
 	 *
 	 *
     */
     @Column(name="CN_PRESCRIBE_DESCR",length = 100,nullable = true)
     @FhirFieldValidate(name="CN_PRESCRIBE_DESCR",displayName="中药煎煮法",maxLength=100,required=false,valuesRange="")   
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
     *名称:开立时间
     *
 	 *
 	 *
     */
     @Column(name="DATEWRITTEN",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DATEWRITTEN",displayName="开立时间",required=false,valuesRange="")   
     private Date datewritten;
    /**
     *名称:开立医生id
     *
 	 *
 	 *
     */
     @Column(name="PRESCRIBER_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="PRESCRIBER_ID",displayName="开立医生id",maxLength=40,required=false,valuesRange="")   
     private String prescriberId;
    /**
     *名称:开立医生姓名
     *
 	 *
 	 *
     */
     @Column(name="PRESCRIBER_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="PRESCRIBER_NAME",displayName="开立医生姓名",maxLength=40,required=false,valuesRange="")   
     private String prescriberName;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getAdmissionDischargeRecordId(){
       	return this.admissionDischargeRecordId;
     }
     public void setAdmissionDischargeRecordId(String admissionDischargeRecordId){
       	this.admissionDischargeRecordId=admissionDischargeRecordId;
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
     public String getCnFourResult(){
       	return this.cnFourResult;
     }
     public void setCnFourResult(String cnFourResult){
       	this.cnFourResult=cnFourResult;
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
     public String getReceiveEmployeePostCd(){
       	return this.receiveEmployeePostCd;
     }
     public void setReceiveEmployeePostCd(String receiveEmployeePostCd){
       	this.receiveEmployeePostCd=receiveEmployeePostCd;
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
     public String getChiefPhysicianId(){
       	return this.chiefPhysicianId;
     }
     public void setChiefPhysicianId(String chiefPhysicianId){
       	this.chiefPhysicianId=chiefPhysicianId;
     }
     public String getChiefPhysicianName(){
       	return this.chiefPhysicianName;
     }
     public void setChiefPhysicianName(String chiefPhysicianName){
       	this.chiefPhysicianName=chiefPhysicianName;
     }
     public Date getChiefPhysicianSignDate(){
       	return this.chiefPhysicianSignDate;
     }
     public void setChiefPhysicianSignDate(Date chiefPhysicianSignDate){
       	this.chiefPhysicianSignDate=chiefPhysicianSignDate;
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
     public Boolean getStatementsReliability(){
       	return this.statementsReliability;
     }
     public void setStatementsReliability(Boolean statementsReliability){
       	this.statementsReliability=statementsReliability;
     }
     public String getSymptomName(){
       	return this.symptomName;
     }
     public void setSymptomName(String symptomName){
       	this.symptomName=symptomName;
     }
     public String getSymptomDescription(){
       	return this.symptomDescription;
     }
     public void setSymptomDescription(String symptomDescription){
       	this.symptomDescription=symptomDescription;
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
     public String getInhosDiagId(){
       	return this.inhosDiagId;
     }
     public void setInhosDiagId(String inhosDiagId){
       	this.inhosDiagId=inhosDiagId;
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
     public String getInpatientDetails(){
       	return this.inpatientDetails;
     }
     public void setInpatientDetails(String inpatientDetails){
       	this.inpatientDetails=inpatientDetails;
     }
     public String getOuthosDiagId(){
       	return this.outhosDiagId;
     }
     public void setOuthosDiagId(String outhosDiagId){
       	this.outhosDiagId=outhosDiagId;
     }
     public String getOuthosCnSymDiagCode(){
       	return this.outhosCnSymDiagCode;
     }
     public void setOuthosCnSymDiagCode(String outhosCnSymDiagCode){
       	this.outhosCnSymDiagCode=outhosCnSymDiagCode;
     }
     public String getOuthosCnDisDiagCode(){
       	return this.outhosCnDisDiagCode;
     }
     public void setOuthosCnDisDiagCode(String outhosCnDisDiagCode){
       	this.outhosCnDisDiagCode=outhosCnDisDiagCode;
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
     public String getOutpatientDetails(){
       	return this.outpatientDetails;
     }
     public void setOutpatientDetails(String outpatientDetails){
       	this.outpatientDetails=outpatientDetails;
     }
     public String getCnPrescribe(){
       	return this.cnPrescribe;
     }
     public void setCnPrescribe(String cnPrescribe){
       	this.cnPrescribe=cnPrescribe;
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
     public Date getDatewritten(){
       	return this.datewritten;
     }
     public void setDatewritten(Date datewritten){
       	this.datewritten=datewritten;
     }
     public String getPrescriberId(){
       	return this.prescriberId;
     }
     public void setPrescriberId(String prescriberId){
       	this.prescriberId=prescriberId;
     }
     public String getPrescriberName(){
       	return this.prescriberName;
     }
     public void setPrescriberName(String prescriberName){
       	this.prescriberName=prescriberName;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}