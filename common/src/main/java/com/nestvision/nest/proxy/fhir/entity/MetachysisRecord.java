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
@Table(name = BaseEntity.TABLE_PREFIX + "METACHYSIS_RECORD")
public class MetachysisRecord extends FhirResourceEntity {

    /**
     *名称:院内输血记录id
     *
 	 *
 	 *
     */
     @Column(name="METACHYSIS_RECORD_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="METACHYSIS_RECORD_ID",displayName="院内输血记录id",maxLength=40,required=true,valuesRange="")   
     private String metachysisRecordId;
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
     *名称:诊断编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="DIAGNOSIS",length = 20,nullable = true)
     @FhirFieldValidate(name="DIAGNOSIS",displayName="诊断编码",maxLength=20,required=false,valuesRange="CV990111")   
     private String diagnosis;
    /**
     *名称:诊断编码名称
     *
 	 *
 	 *
     */
     @Column(name="DIAGNOSIS_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="DIAGNOSIS_NAME",displayName="诊断编码名称",maxLength=40,required=false,valuesRange="")   
     private String diagnosisName;
    /**
     *名称:诊断日期
     *
 	 *
 	 *
     */
     @Column(name="DIAGNOSIS_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DIAGNOSIS_DATE",displayName="诊断日期",required=false,valuesRange="")   
     private Date diagnosisDate;
    /**
     *名称:输血史标识代码
     *
 	 *限制:CV9900024
 	 *
     */
     @Column(name="TRANSFUSE_HISTORY_FLAG",length = 20,nullable = true)
     @FhirFieldValidate(name="TRANSFUSE_HISTORY_FLAG",displayName="输血史标识代码",maxLength=20,required=false,valuesRange="CV9900024")   
     private String transfuseHistoryFlag;
    /**
     *名称:输血性质代码
     *
 	 *
 	 *
     */
     @Column(name="TRANS_KIND",length = 20,nullable = true)
     @FhirFieldValidate(name="TRANS_KIND",displayName="输血性质代码",maxLength=20,required=false,valuesRange="")   
     private String transKind;
    /**
     *名称:申请ABO血型代码
     *
 	 *限制:CV0450005
 	 *
     */
     @Column(name="APPLY_ABO_BLOOD_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="APPLY_ABO_BLOOD_CODE",displayName="申请ABO血型代码",maxLength=20,required=false,valuesRange="CV0450005")   
     private String applyAboBloodCode;
    /**
     *名称:申请Rh血型代码
     *
 	 *限制:CV0450020
 	 *
     */
     @Column(name="APPLY_RH_BLOOD_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="APPLY_RH_BLOOD_CODE",displayName="申请Rh血型代码",maxLength=20,required=false,valuesRange="CV0450020")   
     private String applyRhBloodCode;
    /**
     *名称:输血指征
     *
 	 *
 	 *
     */
     @Column(name="TRANSFUSION_INDICATION",length = 100,nullable = true)
     @FhirFieldValidate(name="TRANSFUSION_INDICATION",displayName="输血指征",maxLength=100,required=false,valuesRange="")   
     private String transfusionIndication;
    /**
     *名称:输血过程记录
     *
 	 *
 	 *
     */
     @Column(name="TRANSFUSION_PROCESS_REC",length = 100,nullable = true)
     @FhirFieldValidate(name="TRANSFUSION_PROCESS_REC",displayName="输血过程记录",maxLength=100,required=false,valuesRange="")   
     private String transfusionProcessRec;
    /**
     *名称:血袋编码
     *
 	 *
 	 *
     */
     @Column(name="BAGS_CODING",length = 20,nullable = true)
     @FhirFieldValidate(name="BAGS_CODING",displayName="血袋编码",maxLength=20,required=false,valuesRange="")   
     private String bagsCoding;
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
     @Column(name="TRANSFUSION_ITEM_UNIT",length = 40,nullable = true)
     @FhirFieldValidate(name="TRANSFUSION_ITEM_UNIT",displayName="输血量计量单位",maxLength=40,required=false,valuesRange="")   
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
     *名称:输血次数
     *
 	 *
 	 *
     */
     @Column(name="TRANSFUSION_COUNT",length = 3,nullable = true)
     @FhirFieldValidate(name="TRANSFUSION_COUNT",displayName="输血次数",maxLength=3,required=false,valuesRange="")   
     private Integer transfusionCount;
    /**
     *名称:输血原因
     *
 	 *
 	 *
     */
     @Column(name="BLOOD_TRANSF_CAUSE",length = 100,nullable = true)
     @FhirFieldValidate(name="BLOOD_TRANSF_CAUSE",displayName="输血原因",maxLength=100,required=false,valuesRange="")   
     private String bloodTransfCause;
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
     *名称:输血医生id
     *
 	 *
 	 *
     */
     @Column(name="TRANSFUSION_EMP_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="TRANSFUSION_EMP_ID",displayName="输血医生id",maxLength=40,required=false,valuesRange="")   
     private String transfusionEmpId;
    /**
     *名称:输血医生姓名
     *
 	 *
 	 *
     */
     @Column(name="TRANSFUSION_EMP_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="TRANSFUSION_EMP_NAME",displayName="输血医生姓名",maxLength=40,required=false,valuesRange="")   
     private String transfusionEmpName;
    /**
     *名称:输血开始时间
     *
 	 *
 	 *
     */
     @Column(name="TRANSFUSION_START_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="TRANSFUSION_START_TIME",displayName="输血开始时间",required=false,valuesRange="")   
     private Date transfusionStartTime;
    /**
     *名称:输血结束时间
     *
 	 *
 	 *
     */
     @Column(name="TRANSFUSION_END_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="TRANSFUSION_END_TIME",displayName="输血结束时间",required=false,valuesRange="")   
     private Date transfusionEndTime;
    /**
     *名称:输血反应类型
     *
 	 *限制:CV9900084
 	 *
     */
     @Column(name="TRANSFUSION_REACTION_TYPE",length = 20,nullable = true)
     @FhirFieldValidate(name="TRANSFUSION_REACTION_TYPE",displayName="输血反应类型",maxLength=20,required=false,valuesRange="CV9900084")   
     private String transfusionReactionType;
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
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getMetachysisRecordId(){
       	return this.metachysisRecordId;
     }
     public void setMetachysisRecordId(String metachysisRecordId){
       	this.metachysisRecordId=metachysisRecordId;
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
     public String getDiagnosis(){
       	return this.diagnosis;
     }
     public void setDiagnosis(String diagnosis){
       	this.diagnosis=diagnosis;
     }
     public String getDiagnosisName(){
       	return this.diagnosisName;
     }
     public void setDiagnosisName(String diagnosisName){
       	this.diagnosisName=diagnosisName;
     }
     public Date getDiagnosisDate(){
       	return this.diagnosisDate;
     }
     public void setDiagnosisDate(Date diagnosisDate){
       	this.diagnosisDate=diagnosisDate;
     }
     public String getTransfuseHistoryFlag(){
       	return this.transfuseHistoryFlag;
     }
     public void setTransfuseHistoryFlag(String transfuseHistoryFlag){
       	this.transfuseHistoryFlag=transfuseHistoryFlag;
     }
     public String getTransKind(){
       	return this.transKind;
     }
     public void setTransKind(String transKind){
       	this.transKind=transKind;
     }
     public String getApplyAboBloodCode(){
       	return this.applyAboBloodCode;
     }
     public void setApplyAboBloodCode(String applyAboBloodCode){
       	this.applyAboBloodCode=applyAboBloodCode;
     }
     public String getApplyRhBloodCode(){
       	return this.applyRhBloodCode;
     }
     public void setApplyRhBloodCode(String applyRhBloodCode){
       	this.applyRhBloodCode=applyRhBloodCode;
     }
     public String getTransfusionIndication(){
       	return this.transfusionIndication;
     }
     public void setTransfusionIndication(String transfusionIndication){
       	this.transfusionIndication=transfusionIndication;
     }
     public String getTransfusionProcessRec(){
       	return this.transfusionProcessRec;
     }
     public void setTransfusionProcessRec(String transfusionProcessRec){
       	this.transfusionProcessRec=transfusionProcessRec;
     }
     public String getBagsCoding(){
       	return this.bagsCoding;
     }
     public void setBagsCoding(String bagsCoding){
       	this.bagsCoding=bagsCoding;
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
     public Integer getTransfusionCount(){
       	return this.transfusionCount;
     }
     public void setTransfusionCount(Integer transfusionCount){
       	this.transfusionCount=transfusionCount;
     }
     public String getBloodTransfCause(){
       	return this.bloodTransfCause;
     }
     public void setBloodTransfCause(String bloodTransfCause){
       	this.bloodTransfCause=bloodTransfCause;
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
     public String getTransfusionEmpId(){
       	return this.transfusionEmpId;
     }
     public void setTransfusionEmpId(String transfusionEmpId){
       	this.transfusionEmpId=transfusionEmpId;
     }
     public String getTransfusionEmpName(){
       	return this.transfusionEmpName;
     }
     public void setTransfusionEmpName(String transfusionEmpName){
       	this.transfusionEmpName=transfusionEmpName;
     }
     public Date getTransfusionStartTime(){
       	return this.transfusionStartTime;
     }
     public void setTransfusionStartTime(Date transfusionStartTime){
       	this.transfusionStartTime=transfusionStartTime;
     }
     public Date getTransfusionEndTime(){
       	return this.transfusionEndTime;
     }
     public void setTransfusionEndTime(Date transfusionEndTime){
       	this.transfusionEndTime=transfusionEndTime;
     }
     public String getTransfusionReactionType(){
       	return this.transfusionReactionType;
     }
     public void setTransfusionReactionType(String transfusionReactionType){
       	this.transfusionReactionType=transfusionReactionType;
     }
     public String getRemarks(){
       	return this.remarks;
     }
     public void setRemarks(String remarks){
       	this.remarks=remarks;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}