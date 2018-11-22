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
@Table(name = BaseEntity.TABLE_PREFIX + "INPATIENT_ADVICE")
public class InpatientAdvice extends FhirResourceEntity {

    /**
     *名称:住院医嘱id
     *
 	 *
 	 *主键字段
     */
     @Column(name="INPATIENT_ADVICE_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="INPATIENT_ADVICE_ID",displayName="住院医嘱id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String inpatientAdviceId;
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
     *名称:住院号
     *
 	 *
 	 *
     */
     @Column(name="INH_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="INH_ID",displayName="住院号",maxLength=40,required=false,valuesRange="")   
     private String inhId;
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
     *名称:体重
     *
 	 *
 	 *
     */
     @Column(name="WEIGHT",length = 8,nullable = true)
     @FhirFieldValidate(name="WEIGHT",displayName="体重",maxLength=8,required=false,valuesRange="")   
     private Float weight;
    /**
     *名称:医嘱计划信息
     *
 	 *
 	 *
     */
     @Column(name="ADVICE_PLAN_INFORMATION",length = 100,nullable = true)
     @FhirFieldValidate(name="ADVICE_PLAN_INFORMATION",displayName="医嘱计划信息",maxLength=100,required=false,valuesRange="")   
     private String advicePlanInformation;
    /**
     *名称:取消医嘱医生id
     *
 	 *
 	 *
     */
     @Column(name="CANCEL_DOCTOR_ID",length = 20,nullable = true)
     @FhirFieldValidate(name="CANCEL_DOCTOR_ID",displayName="取消医嘱医生id",maxLength=20,required=false,valuesRange="")   
     private String cancelDoctorId;
    /**
     *名称:取消医嘱医生姓名
     *
 	 *
 	 *
     */
     @Column(name="CANCEL_DOCTOR_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="CANCEL_DOCTOR_NAME",displayName="取消医嘱医生姓名",maxLength=20,required=false,valuesRange="")   
     private String cancelDoctorName;
    /**
     *名称:开立医生ID
     *
 	 *
 	 *
     */
     @Column(name="OPEN_ADVICE_DOCTOR_ID",length = 20,nullable = true)
     @FhirFieldValidate(name="OPEN_ADVICE_DOCTOR_ID",displayName="开立医生ID",maxLength=20,required=false,valuesRange="")   
     private String openAdviceDoctorId;
    /**
     *名称:开立医生姓名
     *
 	 *
 	 *
     */
     @Column(name="OPEN_ADVICE_DOCTOR_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="OPEN_ADVICE_DOCTOR_NAME",displayName="开立医生姓名",maxLength=20,required=false,valuesRange="")   
     private String openAdviceDoctorName;
    /**
     *名称:开立科室id
     *
 	 *
 	 *
     */
     @Column(name="OPEN_ADVICE_DOCTOR_ORG_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="OPEN_ADVICE_DOCTOR_ORG_ID",displayName="开立科室id",maxLength=40,required=false,valuesRange="")   
     private String openAdviceDoctorOrgId;
    /**
     *名称:开立科室名称
     *
 	 *
 	 *
     */
     @Column(name="OPEN_ADVICE_DOCTOR_ORG_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="OPEN_ADVICE_DOCTOR_ORG_NAME",displayName="开立科室名称",maxLength=40,required=false,valuesRange="")   
     private String openAdviceDoctorOrgName;
    /**
     *名称:开立科室标准代码
     *
 	 *限制:CV9900051
 	 *
     */
     @Column(name="OPEN_ADVICE_DOCTOR_STANDARD_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="OPEN_ADVICE_DOCTOR_STANDARD_CODE",displayName="开立科室标准代码",maxLength=20,required=false,valuesRange="CV9900051")   
     private String openAdviceDoctorStandardCode;
    /**
     *名称:医嘱审核人id
     *
 	 *
 	 *
     */
     @Column(name="ORDER_AUDITOR_ID",length = 20,nullable = true)
     @FhirFieldValidate(name="ORDER_AUDITOR_ID",displayName="医嘱审核人id",maxLength=20,required=false,valuesRange="")   
     private String orderAuditorId;
    /**
     *名称:医嘱审核人姓名
     *
 	 *
 	 *
     */
     @Column(name="ORDER_AUDITOR_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="ORDER_AUDITOR_NAME",displayName="医嘱审核人姓名",maxLength=20,required=false,valuesRange="")   
     private String orderAuditorName;
    /**
     *名称:医嘱核对护士id
     *
 	 *
 	 *
     */
     @Column(name="CHECK_NURID_ID",length = 20,nullable = true)
     @FhirFieldValidate(name="CHECK_NURID_ID",displayName="医嘱核对护士id",maxLength=20,required=false,valuesRange="")   
     private String checkNuridId;
    /**
     *名称:医嘱核对护士姓名
     *
 	 *
 	 *
     */
     @Column(name="CHECK_NURID_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="CHECK_NURID_NAME",displayName="医嘱核对护士姓名",maxLength=20,required=false,valuesRange="")   
     private String checkNuridName;
    /**
     *名称:医嘱停止医生id
     *
 	 *
 	 *
     */
     @Column(name="STOP_DOCTORID_ID",length = 20,nullable = true)
     @FhirFieldValidate(name="STOP_DOCTORID_ID",displayName="医嘱停止医生id",maxLength=20,required=false,valuesRange="")   
     private String stopDoctoridId;
    /**
     *名称:医嘱停止医生姓名
     *
 	 *
 	 *
     */
     @Column(name="STOP_DOCTORID_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="STOP_DOCTORID_NAME",displayName="医嘱停止医生姓名",maxLength=20,required=false,valuesRange="")   
     private String stopDoctoridName;
    /**
     *名称:医嘱执行医生id
     *
 	 *
 	 *
     */
     @Column(name="PERFORMER_CD_ID",length = 20,nullable = true)
     @FhirFieldValidate(name="PERFORMER_CD_ID",displayName="医嘱执行医生id",maxLength=20,required=false,valuesRange="")   
     private String performerCdId;
    /**
     *名称:医嘱执行医生姓名
     *
 	 *
 	 *
     */
     @Column(name="PERFORMER_CD_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="PERFORMER_CD_NAME",displayName="医嘱执行医生姓名",maxLength=20,required=false,valuesRange="")   
     private String performerCdName;
    /**
     *名称:医嘱执行科室标准编码
     *
 	 *限制:CV9900051
 	 *
     */
     @Column(name="PERFORM_DEPT_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="PERFORM_DEPT_CD",displayName="医嘱执行科室标准编码",maxLength=20,required=false,valuesRange="CV9900051")   
     private String performDeptCd;
    /**
     *名称:医嘱执行科室id
     *
 	 *
 	 *
     */
     @Column(name="PERFORM_DEPT_CD_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="PERFORM_DEPT_CD_ID",displayName="医嘱执行科室id",maxLength=40,required=false,valuesRange="")   
     private String performDeptCdId;
    /**
     *名称:医嘱执行科室名称
     *
 	 *
 	 *
     */
     @Column(name="PERFORM_DEPT_CD_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="PERFORM_DEPT_CD_NAME",displayName="医嘱执行科室名称",maxLength=40,required=false,valuesRange="")   
     private String performDeptCdName;
    /**
     *名称:医嘱项目类型
     *
 	 *限制:CV9900229
 	 *
     */
     @Column(name="ORDER_TYPE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="ORDER_TYPE_CODE",displayName="医嘱项目类型",maxLength=20,required=false,valuesRange="CV9900229")   
     private String orderTypeCode;
    /**
     *名称:医嘱计划开始日期时间
     *
 	 *
 	 *
     */
     @Column(name="ORDER_PLAN_ST_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="ORDER_PLAN_ST_DATE",displayName="医嘱计划开始日期时间",required=false,valuesRange="")   
     private Date orderPlanStDate;
    /**
     *名称:医嘱计划结束日期时间
     *
 	 *
 	 *
     */
     @Column(name="ORDER_PLAN_END_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="ORDER_PLAN_END_DATE",displayName="医嘱计划结束日期时间",required=false,valuesRange="")   
     private Date orderPlanEndDate;
    /**
     *名称:医嘱执行日期时间
     *
 	 *
 	 *
     */
     @Column(name="PERFORM_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="PERFORM_TIME",displayName="医嘱执行日期时间",required=false,valuesRange="")   
     private Date performTime;
    /**
     *名称:电子申请单编号
     *
 	 *
 	 *
     */
     @Column(name="APPLY_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="APPLY_ID",displayName="电子申请单编号",maxLength=40,required=false,valuesRange="")   
     private String applyId;
    /**
     *名称:处方药品组号
     *
 	 *
 	 *
     */
     @Column(name="PREC_DRUG_NO",length = 40,nullable = true)
     @FhirFieldValidate(name="PREC_DRUG_NO",displayName="处方药品组号",maxLength=40,required=false,valuesRange="")   
     private String precDrugNo;
    /**
     *名称:医嘱停止日期时间
     *
 	 *
 	 *
     */
     @Column(name="ORDER_END_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="ORDER_END_DATE",displayName="医嘱停止日期时间",required=false,valuesRange="")   
     private Date orderEndDate;
    /**
     *名称:医嘱备注信息
     *
 	 *
 	 *
     */
     @Column(name="ORDER_NOTE_REMARK",columnDefinition="text")
     @FhirFieldValidate(name="ORDER_NOTE_REMARK",displayName="医嘱备注信息",required=false,valuesRange="")   
     private String orderNoteRemark;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getInpatientAdviceId(){
       	return this.inpatientAdviceId;
     }
     public void setInpatientAdviceId(String inpatientAdviceId){
       	this.inpatientAdviceId=inpatientAdviceId;
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
     public String getInhId(){
       	return this.inhId;
     }
     public void setInhId(String inhId){
       	this.inhId=inhId;
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
     public Date getStart(){
       	return this.start;
     }
     public void setStart(Date start){
       	this.start=start;
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
     public Float getWeight(){
       	return this.weight;
     }
     public void setWeight(Float weight){
       	this.weight=weight;
     }
     public String getAdvicePlanInformation(){
       	return this.advicePlanInformation;
     }
     public void setAdvicePlanInformation(String advicePlanInformation){
       	this.advicePlanInformation=advicePlanInformation;
     }
     public String getCancelDoctorId(){
       	return this.cancelDoctorId;
     }
     public void setCancelDoctorId(String cancelDoctorId){
       	this.cancelDoctorId=cancelDoctorId;
     }
     public String getCancelDoctorName(){
       	return this.cancelDoctorName;
     }
     public void setCancelDoctorName(String cancelDoctorName){
       	this.cancelDoctorName=cancelDoctorName;
     }
     public String getOpenAdviceDoctorId(){
       	return this.openAdviceDoctorId;
     }
     public void setOpenAdviceDoctorId(String openAdviceDoctorId){
       	this.openAdviceDoctorId=openAdviceDoctorId;
     }
     public String getOpenAdviceDoctorName(){
       	return this.openAdviceDoctorName;
     }
     public void setOpenAdviceDoctorName(String openAdviceDoctorName){
       	this.openAdviceDoctorName=openAdviceDoctorName;
     }
     public String getOpenAdviceDoctorOrgId(){
       	return this.openAdviceDoctorOrgId;
     }
     public void setOpenAdviceDoctorOrgId(String openAdviceDoctorOrgId){
       	this.openAdviceDoctorOrgId=openAdviceDoctorOrgId;
     }
     public String getOpenAdviceDoctorOrgName(){
       	return this.openAdviceDoctorOrgName;
     }
     public void setOpenAdviceDoctorOrgName(String openAdviceDoctorOrgName){
       	this.openAdviceDoctorOrgName=openAdviceDoctorOrgName;
     }
     public String getOpenAdviceDoctorStandardCode(){
       	return this.openAdviceDoctorStandardCode;
     }
     public void setOpenAdviceDoctorStandardCode(String openAdviceDoctorStandardCode){
       	this.openAdviceDoctorStandardCode=openAdviceDoctorStandardCode;
     }
     public String getOrderAuditorId(){
       	return this.orderAuditorId;
     }
     public void setOrderAuditorId(String orderAuditorId){
       	this.orderAuditorId=orderAuditorId;
     }
     public String getOrderAuditorName(){
       	return this.orderAuditorName;
     }
     public void setOrderAuditorName(String orderAuditorName){
       	this.orderAuditorName=orderAuditorName;
     }
     public String getCheckNuridId(){
       	return this.checkNuridId;
     }
     public void setCheckNuridId(String checkNuridId){
       	this.checkNuridId=checkNuridId;
     }
     public String getCheckNuridName(){
       	return this.checkNuridName;
     }
     public void setCheckNuridName(String checkNuridName){
       	this.checkNuridName=checkNuridName;
     }
     public String getStopDoctoridId(){
       	return this.stopDoctoridId;
     }
     public void setStopDoctoridId(String stopDoctoridId){
       	this.stopDoctoridId=stopDoctoridId;
     }
     public String getStopDoctoridName(){
       	return this.stopDoctoridName;
     }
     public void setStopDoctoridName(String stopDoctoridName){
       	this.stopDoctoridName=stopDoctoridName;
     }
     public String getPerformerCdId(){
       	return this.performerCdId;
     }
     public void setPerformerCdId(String performerCdId){
       	this.performerCdId=performerCdId;
     }
     public String getPerformerCdName(){
       	return this.performerCdName;
     }
     public void setPerformerCdName(String performerCdName){
       	this.performerCdName=performerCdName;
     }
     public String getPerformDeptCd(){
       	return this.performDeptCd;
     }
     public void setPerformDeptCd(String performDeptCd){
       	this.performDeptCd=performDeptCd;
     }
     public String getPerformDeptCdId(){
       	return this.performDeptCdId;
     }
     public void setPerformDeptCdId(String performDeptCdId){
       	this.performDeptCdId=performDeptCdId;
     }
     public String getPerformDeptCdName(){
       	return this.performDeptCdName;
     }
     public void setPerformDeptCdName(String performDeptCdName){
       	this.performDeptCdName=performDeptCdName;
     }
     public String getOrderTypeCode(){
       	return this.orderTypeCode;
     }
     public void setOrderTypeCode(String orderTypeCode){
       	this.orderTypeCode=orderTypeCode;
     }
     public Date getOrderPlanStDate(){
       	return this.orderPlanStDate;
     }
     public void setOrderPlanStDate(Date orderPlanStDate){
       	this.orderPlanStDate=orderPlanStDate;
     }
     public Date getOrderPlanEndDate(){
       	return this.orderPlanEndDate;
     }
     public void setOrderPlanEndDate(Date orderPlanEndDate){
       	this.orderPlanEndDate=orderPlanEndDate;
     }
     public Date getPerformTime(){
       	return this.performTime;
     }
     public void setPerformTime(Date performTime){
       	this.performTime=performTime;
     }
     public String getApplyId(){
       	return this.applyId;
     }
     public void setApplyId(String applyId){
       	this.applyId=applyId;
     }
     public String getPrecDrugNo(){
       	return this.precDrugNo;
     }
     public void setPrecDrugNo(String precDrugNo){
       	this.precDrugNo=precDrugNo;
     }
     public Date getOrderEndDate(){
       	return this.orderEndDate;
     }
     public void setOrderEndDate(Date orderEndDate){
       	this.orderEndDate=orderEndDate;
     }
     public String getOrderNoteRemark(){
       	return this.orderNoteRemark;
     }
     public void setOrderNoteRemark(String orderNoteRemark){
       	this.orderNoteRemark=orderNoteRemark;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}