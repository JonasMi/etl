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
@Table(name = BaseEntity.TABLE_PREFIX + "INPATIENT_REGISTRATION")
public class InpatientRegistration extends FhirResourceEntity {

    /**
     *名称:院内住院流水号
     *备注:本次住院就诊在院内系统中的唯一标识
 	 *
 	 *主键字段
     */
     @Column(name="INPATIENT_REGISTRATION_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="INPATIENT_REGISTRATION_ID",displayName="院内住院流水号",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String inpatientRegistrationId;
    /**
     *名称:患者id
     *备注:引用患者信息表T_PATIENT院内患者id
 	 *
 	 *
     */
     @Column(name="PATIENT_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="PATIENT_ID",displayName="患者id",maxLength=40,required=true,valuesRange="")   
     private String patientId;
    /**
     *名称:患者姓名
     *
 	 *
 	 *
     */
     @Column(name="PATIENT_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="PATIENT_NAME",displayName="患者姓名",maxLength=40,required=true,valuesRange="")   
     private String patientName;
    /**
     *名称:住院医师id
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="RESIDENT_PHYSICIAN_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="RESIDENT_PHYSICIAN_ID",displayName="住院医师id",maxLength=40,required=false,valuesRange="")   
     private String residentPhysicianId;
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
     *名称:入院方式
     *
 	 *
 	 *
     */
     @Column(name="ADMISSION_METHOD",length = 100,nullable = true)
     @FhirFieldValidate(name="ADMISSION_METHOD",displayName="入院方式",maxLength=100,required=false,valuesRange="")   
     private String admissionMethod;
    /**
     *名称:入院科室id
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
 	 *
     */
     @Column(name="IN_DPID",length = 40,nullable = false)
     @FhirFieldValidate(name="IN_DPID",displayName="入院科室id",maxLength=40,required=true,valuesRange="")   
     private String inDpid;
    /**
     *名称:入院时情况
     *
 	 *
 	 *
     */
     @Column(name="IN_SITUATION",length = 200,nullable = true)
     @FhirFieldValidate(name="IN_SITUATION",displayName="入院时情况",maxLength=200,required=false,valuesRange="")   
     private String inSituation;
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
     *名称:入院病区
     *
 	 *
 	 *
     */
     @Column(name="IN_INPATIENT_AREA",length = 50,nullable = true)
     @FhirFieldValidate(name="IN_INPATIENT_AREA",displayName="入院病区",maxLength=50,required=false,valuesRange="")   
     private String inInpatientArea;
    /**
     *名称:床位id
     *备注:引用床位信息表T_BED院内床位id
 	 *
 	 *
     */
     @Column(name="BED_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="BED_ID",displayName="床位id",maxLength=40,required=false,valuesRange="")   
     private String bedId;
    /**
     *名称:住院科室id
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
 	 *
     */
     @Column(name="SERVICEPROVIDER",length = 40,nullable = true)
     @FhirFieldValidate(name="SERVICEPROVIDER",displayName="住院科室id",maxLength=40,required=false,valuesRange="")   
     private String serviceprovider;
    /**
     *名称:出院科室
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
 	 *
     */
     @Column(name="OUT_DPID",length = 40,nullable = true)
     @FhirFieldValidate(name="OUT_DPID",displayName="出院科室",maxLength=40,required=false,valuesRange="")   
     private String outDpid;
    /**
     *名称:出院病区
     *
 	 *
 	 *
     */
     @Column(name="OUT_INPATIENT_AREA",length = 50,nullable = true)
     @FhirFieldValidate(name="OUT_INPATIENT_AREA",displayName="出院病区",maxLength=50,required=false,valuesRange="")   
     private String outInpatientArea;
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
     *名称:住院天数
     *
 	 *
 	 *
     */
     @Column(name="INPAT_DAYS",length = 3,nullable = true)
     @FhirFieldValidate(name="INPAT_DAYS",displayName="住院天数",maxLength=3,required=false,valuesRange="")   
     private Integer inpatDays;
    /**
     *名称:离院方式
     *
 	 *限制:CV0600226
 	 *
     */
     @Column(name="OUT_MODE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="OUT_MODE_CODE",displayName="离院方式",maxLength=20,required=false,valuesRange="CV0600226")   
     private String outModeCode;
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
     *名称:住院原因代码
     *
 	 *限制:CV0600212
 	 *
     */
     @Column(name="INHOSPITAL_REASON_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="INHOSPITAL_REASON_CD",displayName="住院原因代码",maxLength=20,required=false,valuesRange="CV0600212")   
     private String inhospitalReasonCd;
    
     public String getInpatientRegistrationId(){
       	return this.inpatientRegistrationId;
     }
     public void setInpatientRegistrationId(String inpatientRegistrationId){
       	this.inpatientRegistrationId=inpatientRegistrationId;
     }
     public String getPatientId(){
       	return this.patientId;
     }
     public void setPatientId(String patientId){
       	this.patientId=patientId;
     }
     public String getPatientName(){
       	return this.patientName;
     }
     public void setPatientName(String patientName){
       	this.patientName=patientName;
     }
     public String getResidentPhysicianId(){
       	return this.residentPhysicianId;
     }
     public void setResidentPhysicianId(String residentPhysicianId){
       	this.residentPhysicianId=residentPhysicianId;
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
     public String getAdmissionMethod(){
       	return this.admissionMethod;
     }
     public void setAdmissionMethod(String admissionMethod){
       	this.admissionMethod=admissionMethod;
     }
     public String getInDpid(){
       	return this.inDpid;
     }
     public void setInDpid(String inDpid){
       	this.inDpid=inDpid;
     }
     public String getInSituation(){
       	return this.inSituation;
     }
     public void setInSituation(String inSituation){
       	this.inSituation=inSituation;
     }
     public String getInModeCode(){
       	return this.inModeCode;
     }
     public void setInModeCode(String inModeCode){
       	this.inModeCode=inModeCode;
     }
     public String getInInpatientArea(){
       	return this.inInpatientArea;
     }
     public void setInInpatientArea(String inInpatientArea){
       	this.inInpatientArea=inInpatientArea;
     }
     public String getBedId(){
       	return this.bedId;
     }
     public void setBedId(String bedId){
       	this.bedId=bedId;
     }
     public String getServiceprovider(){
       	return this.serviceprovider;
     }
     public void setServiceprovider(String serviceprovider){
       	this.serviceprovider=serviceprovider;
     }
     public String getOutDpid(){
       	return this.outDpid;
     }
     public void setOutDpid(String outDpid){
       	this.outDpid=outDpid;
     }
     public String getOutInpatientArea(){
       	return this.outInpatientArea;
     }
     public void setOutInpatientArea(String outInpatientArea){
       	this.outInpatientArea=outInpatientArea;
     }
     public Integer getInpatTimes(){
       	return this.inpatTimes;
     }
     public void setInpatTimes(Integer inpatTimes){
       	this.inpatTimes=inpatTimes;
     }
     public Integer getInpatDays(){
       	return this.inpatDays;
     }
     public void setInpatDays(Integer inpatDays){
       	this.inpatDays=inpatDays;
     }
     public String getOutModeCode(){
       	return this.outModeCode;
     }
     public void setOutModeCode(String outModeCode){
       	this.outModeCode=outModeCode;
     }
     public String getFeeCode(){
       	return this.feeCode;
     }
     public void setFeeCode(String feeCode){
       	this.feeCode=feeCode;
     }
     public String getInhospitalReasonCd(){
       	return this.inhospitalReasonCd;
     }
     public void setInhospitalReasonCd(String inhospitalReasonCd){
       	this.inhospitalReasonCd=inhospitalReasonCd;
     }
}