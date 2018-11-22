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
@Table(name = BaseEntity.TABLE_PREFIX + "TREATMENT_RECORD")
public class TreatmentRecord extends FhirResourceEntity {

    /**
     *名称:院内治疗记录id
     *
 	 *
 	 *主键字段
     */
     @Column(name="TREATMENT_RECORD_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="TREATMENT_RECORD_ID",displayName="院内治疗记录id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String treatmentRecordId;
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
     *名称:有创诊疗操作标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_INVASIVE_TREATMENT",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_INVASIVE_TREATMENT",displayName="有创诊疗操作标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifInvasiveTreatment;
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
     *名称:过敏史其他描述
     *
 	 *
 	 *
     */
     @Column(name="RRITABILITY",columnDefinition="text")
     @FhirFieldValidate(name="RRITABILITY",displayName="过敏史其他描述",required=false,valuesRange="")   
     private String rritability;
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
     *名称:入院诊断编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="ADMISSION_DIAGNOSIS",length = 20,nullable = true)
     @FhirFieldValidate(name="ADMISSION_DIAGNOSIS",displayName="入院诊断编码",maxLength=20,required=false,valuesRange="CV990111")   
     private String admissionDiagnosis;
    /**
     *名称:入院诊断编码名称
     *
 	 *
 	 *
     */
     @Column(name="ADMISSION_DIAGNOSIS_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="ADMISSION_DIAGNOSIS_NAME",displayName="入院诊断编码名称",maxLength=40,required=false,valuesRange="")   
     private String admissionDiagnosisName;
    /**
     *名称:诊断日期
     *
 	 *
 	 *
     */
     @Column(name="ADMISSION_DIAGNOSIS_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="ADMISSION_DIAGNOSIS_DATE",displayName="诊断日期",required=false,valuesRange="")   
     private Date admissionDiagnosisDate;
    /**
     *名称:处理及指导意见
     *
 	 *
 	 *
     */
     @Column(name="TREATMENT_GUIDANCE",length = 200,nullable = true)
     @FhirFieldValidate(name="TREATMENT_GUIDANCE",displayName="处理及指导意见",maxLength=200,required=false,valuesRange="")   
     private String treatmentGuidance;
    /**
     *名称:医嘱使用备注
     *
 	 *
 	 *
     */
     @Column(name="ORDERS_REMARKS",length = 200,nullable = true)
     @FhirFieldValidate(name="ORDERS_REMARKS",displayName="医嘱使用备注",maxLength=200,required=false,valuesRange="")   
     private String ordersRemarks;
    /**
     *名称:今后治疗方案
     *
 	 *
 	 *
     */
     @Column(name="FUTURE_TREATMENT_OPTIONS",length = 500,nullable = true)
     @FhirFieldValidate(name="FUTURE_TREATMENT_OPTIONS",displayName="今后治疗方案",maxLength=500,required=false,valuesRange="")   
     private String futureTreatmentOptions;
    /**
     *名称:随访方式代码
     *
 	 *限制:CV0600207
 	 *
     */
     @Column(name="VISIT_WAY_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="VISIT_WAY_CD",displayName="随访方式代码",maxLength=20,required=false,valuesRange="CV0600207")   
     private String visitWayCd;
    /**
     *名称:随访日期
     *
 	 *
 	 *
     */
     @Column(name="FOLLOWUP_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="FOLLOWUP_DATE",displayName="随访日期",required=false,valuesRange="")   
     private Date followupDate;
    /**
     *名称:随访周期建议代码
     *
 	 *限制:CV0600208
 	 *
     */
     @Column(name="FOLLOWUP_PERIOD_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="FOLLOWUP_PERIOD_CD",displayName="随访周期建议代码",maxLength=20,required=false,valuesRange="CV0600208")   
     private String followupPeriodCd;
    /**
     *名称:介入物名称
     *
 	 *
 	 *
     */
     @Column(name="INTERVENTION",length = 40,nullable = true)
     @FhirFieldValidate(name="INTERVENTION",displayName="介入物名称",maxLength=40,required=false,valuesRange="")   
     private String intervention;
    /**
     *名称:操作方法
     *
 	 *
 	 *
     */
     @Column(name="OPERATION_METHOD",length = 40,nullable = true)
     @FhirFieldValidate(name="OPERATION_METHOD",displayName="操作方法",maxLength=40,required=false,valuesRange="")   
     private String operationMethod;
    /**
     *名称:操作次数
     *
 	 *
 	 *
     */
     @Column(name="OPERATION_TIMES",length = 20,nullable = true)
     @FhirFieldValidate(name="OPERATION_TIMES",displayName="操作次数",maxLength=20,required=false,valuesRange="")   
     private String operationTimes;
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
     *名称:药物用法
     *
 	 *
 	 *
     */
     @Column(name="DRUGS_USAGE",length = 100,nullable = true)
     @FhirFieldValidate(name="DRUGS_USAGE",displayName="药物用法",maxLength=100,required=false,valuesRange="")   
     private String drugsUsage;
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
     *名称:执行医生id
     *
 	 *
 	 *
     */
     @Column(name="PERFORMER_EMPID",length = 40,nullable = true)
     @FhirFieldValidate(name="PERFORMER_EMPID",displayName="执行医生id",maxLength=40,required=false,valuesRange="")   
     private String performerEmpid;
    /**
     *名称:执行医生姓名
     *
 	 *
 	 *
     */
     @Column(name="PERFORMER_EMP_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="PERFORMER_EMP_NAME",displayName="执行医生姓名",maxLength=40,required=false,valuesRange="")   
     private String performerEmpName;
    /**
     *名称:执行时间
     *
 	 *
 	 *
     */
     @Column(name="PERFORM_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="PERFORM_TIME",displayName="执行时间",required=false,valuesRange="")   
     private Date performTime;
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
     *名称:商品名
     *
 	 *
 	 *
     */
     @Column(name="ALIAS_NAME",length = 80,nullable = true)
     @FhirFieldValidate(name="ALIAS_NAME",displayName="商品名",maxLength=80,required=false,valuesRange="")   
     private String aliasName;
    /**
     *名称:规格
     *
 	 *
 	 *
     */
     @Column(name="SPEC",length = 40,nullable = true)
     @FhirFieldValidate(name="SPEC",displayName="规格",maxLength=40,required=false,valuesRange="")   
     private String spec;
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
     *名称:药物剂型代码
     *
 	 *
 	 *
     */
     @Column(name="DRUG_DOSAGE_FORMS",length = 20,nullable = true)
     @FhirFieldValidate(name="DRUG_DOSAGE_FORMS",displayName="药物剂型代码",maxLength=20,required=false,valuesRange="")   
     private String drugDosageForms;
    /**
     *名称:药物剂型名称
     *
 	 *
 	 *
     */
     @Column(name="DRUG_DOSAGE_FORMS_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="DRUG_DOSAGE_FORMS_NAME",displayName="药物剂型名称",maxLength=40,required=false,valuesRange="")   
     private String drugDosageFormsName;
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
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getTreatmentRecordId(){
       	return this.treatmentRecordId;
     }
     public void setTreatmentRecordId(String treatmentRecordId){
       	this.treatmentRecordId=treatmentRecordId;
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
     public Boolean getIfInvasiveTreatment(){
       	return this.ifInvasiveTreatment;
     }
     public void setIfInvasiveTreatment(Boolean ifInvasiveTreatment){
       	this.ifInvasiveTreatment=ifInvasiveTreatment;
     }
     public Boolean getIfRritability(){
       	return this.ifRritability;
     }
     public void setIfRritability(Boolean ifRritability){
       	this.ifRritability=ifRritability;
     }
     public String getRritability(){
       	return this.rritability;
     }
     public void setRritability(String rritability){
       	this.rritability=rritability;
     }
     public Float getWeight(){
       	return this.weight;
     }
     public void setWeight(Float weight){
       	this.weight=weight;
     }
     public String getAdmissionDiagnosis(){
       	return this.admissionDiagnosis;
     }
     public void setAdmissionDiagnosis(String admissionDiagnosis){
       	this.admissionDiagnosis=admissionDiagnosis;
     }
     public String getAdmissionDiagnosisName(){
       	return this.admissionDiagnosisName;
     }
     public void setAdmissionDiagnosisName(String admissionDiagnosisName){
       	this.admissionDiagnosisName=admissionDiagnosisName;
     }
     public Date getAdmissionDiagnosisDate(){
       	return this.admissionDiagnosisDate;
     }
     public void setAdmissionDiagnosisDate(Date admissionDiagnosisDate){
       	this.admissionDiagnosisDate=admissionDiagnosisDate;
     }
     public String getTreatmentGuidance(){
       	return this.treatmentGuidance;
     }
     public void setTreatmentGuidance(String treatmentGuidance){
       	this.treatmentGuidance=treatmentGuidance;
     }
     public String getOrdersRemarks(){
       	return this.ordersRemarks;
     }
     public void setOrdersRemarks(String ordersRemarks){
       	this.ordersRemarks=ordersRemarks;
     }
     public String getFutureTreatmentOptions(){
       	return this.futureTreatmentOptions;
     }
     public void setFutureTreatmentOptions(String futureTreatmentOptions){
       	this.futureTreatmentOptions=futureTreatmentOptions;
     }
     public String getVisitWayCd(){
       	return this.visitWayCd;
     }
     public void setVisitWayCd(String visitWayCd){
       	this.visitWayCd=visitWayCd;
     }
     public Date getFollowupDate(){
       	return this.followupDate;
     }
     public void setFollowupDate(Date followupDate){
       	this.followupDate=followupDate;
     }
     public String getFollowupPeriodCd(){
       	return this.followupPeriodCd;
     }
     public void setFollowupPeriodCd(String followupPeriodCd){
       	this.followupPeriodCd=followupPeriodCd;
     }
     public String getIntervention(){
       	return this.intervention;
     }
     public void setIntervention(String intervention){
       	this.intervention=intervention;
     }
     public String getOperationMethod(){
       	return this.operationMethod;
     }
     public void setOperationMethod(String operationMethod){
       	this.operationMethod=operationMethod;
     }
     public String getOperationTimes(){
       	return this.operationTimes;
     }
     public void setOperationTimes(String operationTimes){
       	this.operationTimes=operationTimes;
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
     public String getDrugsUsage(){
       	return this.drugsUsage;
     }
     public void setDrugsUsage(String drugsUsage){
       	this.drugsUsage=drugsUsage;
     }
     public String getCnMedicationTypeCode(){
       	return this.cnMedicationTypeCode;
     }
     public void setCnMedicationTypeCode(String cnMedicationTypeCode){
       	this.cnMedicationTypeCode=cnMedicationTypeCode;
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
     public String getPerformerEmpid(){
       	return this.performerEmpid;
     }
     public void setPerformerEmpid(String performerEmpid){
       	this.performerEmpid=performerEmpid;
     }
     public String getPerformerEmpName(){
       	return this.performerEmpName;
     }
     public void setPerformerEmpName(String performerEmpName){
       	this.performerEmpName=performerEmpName;
     }
     public Date getPerformTime(){
       	return this.performTime;
     }
     public void setPerformTime(Date performTime){
       	this.performTime=performTime;
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
     public String getAliasName(){
       	return this.aliasName;
     }
     public void setAliasName(String aliasName){
       	this.aliasName=aliasName;
     }
     public String getSpec(){
       	return this.spec;
     }
     public void setSpec(String spec){
       	this.spec=spec;
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
     public String getDrugDosageForms(){
       	return this.drugDosageForms;
     }
     public void setDrugDosageForms(String drugDosageForms){
       	this.drugDosageForms=drugDosageForms;
     }
     public String getDrugDosageFormsName(){
       	return this.drugDosageFormsName;
     }
     public void setDrugDosageFormsName(String drugDosageFormsName){
       	this.drugDosageFormsName=drugDosageFormsName;
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
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}