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
@Table(name = BaseEntity.TABLE_PREFIX + "EXPENSIVE_MEDICAL_CONSUMABLES")
public class ExpensiveMedicalConsumables extends FhirResourceEntity {

    /**
     *名称:院内高值耗材使用记录id
     *
 	 *
 	 *主键字段
     */
     @Column(name="EXPENSIVE_MEDICAL_CONSUMABLES_USAGE_RECORDS_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="EXPENSIVE_MEDICAL_CONSUMABLES_USAGE_RECORDS_ID",displayName="院内高值耗材使用记录id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String expensiveMedicalConsumablesUsageRecordsId;
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
     *名称:特殊用法代码
     *
 	 *限制:CV9900285
 	 *
     */
     @Column(name="C_MED_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="C_MED_CODE",displayName="特殊用法代码",maxLength=20,required=false,valuesRange="CV9900285")   
     private String cMedCode;
    /**
     *名称:医嘱内容
     *
 	 *
 	 *
     */
     @Column(name="CN_PRESCRIBE",length = 200,nullable = true)
     @FhirFieldValidate(name="CN_PRESCRIBE",displayName="医嘱内容",maxLength=200,required=false,valuesRange="")   
     private String cnPrescribe;
    /**
     *名称:中药煎煮法
     *
 	 *
 	 *
     */
     @Column(name="CN_PRESCRIBE_DESCR",length = 40,nullable = true)
     @FhirFieldValidate(name="CN_PRESCRIBE_DESCR",displayName="中药煎煮法",maxLength=40,required=false,valuesRange="")   
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
     *名称:产品生产厂家
     *
 	 *
 	 *
     */
     @Column(name="FACTORY_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="FACTORY_NAME",displayName="产品生产厂家",maxLength=40,required=false,valuesRange="")   
     private String factoryName;
    /**
     *名称:产品供应商
     *
 	 *
 	 *
     */
     @Column(name="PROVIDER_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="PROVIDER_NAME",displayName="产品供应商",maxLength=40,required=false,valuesRange="")   
     private String providerName;
    /**
     *名称:植入性耗材标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IMPLANTABLE_CONSUMABLES_FLG",length = 5,nullable = true)
     @FhirFieldValidate(name="IMPLANTABLE_CONSUMABLES_FLG",displayName="植入性耗材标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean implantableConsumablesFlg;
    /**
     *名称:使用途径
     *
 	 *
 	 *
     */
     @Column(name="USE_WAY",length = 40,nullable = true)
     @FhirFieldValidate(name="USE_WAY",displayName="使用途径",maxLength=40,required=false,valuesRange="")   
     private String useWay;
    /**
     *名称:有效期
     *
 	 *
 	 *
     */
     @Column(name="EXPIRY",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="EXPIRY",displayName="有效期",required=false,valuesRange="")   
     private Date expiry;
    /**
     *名称:数量
     *
 	 *
 	 *
     */
     @Column(name="QUANTITY_VALUE",length = 8,nullable = true)
     @FhirFieldValidate(name="QUANTITY_VALUE",displayName="数量",maxLength=8,required=false,valuesRange="")   
     private Float quantityValue;
    /**
     *名称:单位
     *
 	 *
 	 *
     */
     @Column(name="QUANTITY_UNIT",length = 40,nullable = true)
     @FhirFieldValidate(name="QUANTITY_UNIT",displayName="单位",maxLength=40,required=false,valuesRange="")   
     private String quantityUnit;
    /**
     *名称:院内耗材id
     *
 	 *
 	 *
     */
     @Column(name="SUBSTANCE_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="SUBSTANCE_ID",displayName="院内耗材id",maxLength=40,required=false,valuesRange="")   
     private String substanceId;
    /**
     *名称:材料编码
     *
 	 *限制:CV9900399
 	 *
     */
     @Column(name="SUBSTANCE_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="SUBSTANCE_CD",displayName="材料编码",maxLength=20,required=false,valuesRange="CV9900399")   
     private String substanceCd;
    /**
     *名称:材料名称
     *
 	 *
 	 *
     */
     @Column(name="SUBSTANCE_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="SUBSTANCE_NAME",displayName="材料名称",maxLength=40,required=false,valuesRange="")   
     private String substanceName;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getExpensiveMedicalConsumablesUsageRecordsId(){
       	return this.expensiveMedicalConsumablesUsageRecordsId;
     }
     public void setExpensiveMedicalConsumablesUsageRecordsId(String expensiveMedicalConsumablesUsageRecordsId){
       	this.expensiveMedicalConsumablesUsageRecordsId=expensiveMedicalConsumablesUsageRecordsId;
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
     public String getcMedCode(){
       	return this.cMedCode;
     }
     public void setcMedCode(String cMedCode){
       	this.cMedCode=cMedCode;
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
     public String getFactoryName(){
       	return this.factoryName;
     }
     public void setFactoryName(String factoryName){
       	this.factoryName=factoryName;
     }
     public String getProviderName(){
       	return this.providerName;
     }
     public void setProviderName(String providerName){
       	this.providerName=providerName;
     }
     public Boolean getImplantableConsumablesFlg(){
       	return this.implantableConsumablesFlg;
     }
     public void setImplantableConsumablesFlg(Boolean implantableConsumablesFlg){
       	this.implantableConsumablesFlg=implantableConsumablesFlg;
     }
     public String getUseWay(){
       	return this.useWay;
     }
     public void setUseWay(String useWay){
       	this.useWay=useWay;
     }
     public Date getExpiry(){
       	return this.expiry;
     }
     public void setExpiry(Date expiry){
       	this.expiry=expiry;
     }
     public Float getQuantityValue(){
       	return this.quantityValue;
     }
     public void setQuantityValue(Float quantityValue){
       	this.quantityValue=quantityValue;
     }
     public String getQuantityUnit(){
       	return this.quantityUnit;
     }
     public void setQuantityUnit(String quantityUnit){
       	this.quantityUnit=quantityUnit;
     }
     public String getSubstanceId(){
       	return this.substanceId;
     }
     public void setSubstanceId(String substanceId){
       	this.substanceId=substanceId;
     }
     public String getSubstanceCd(){
       	return this.substanceCd;
     }
     public void setSubstanceCd(String substanceCd){
       	this.substanceCd=substanceCd;
     }
     public String getSubstanceName(){
       	return this.substanceName;
     }
     public void setSubstanceName(String substanceName){
       	this.substanceName=substanceName;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}