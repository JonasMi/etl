package com.nestvision.nest.proxy.fhir.entity;
import java.util.List;
import javax.persistence.Temporal;
import java.util.Date;
import javax.persistence.TemporalType;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.nestvision.nest.proxy.base.entity.BaseEntity;
import com.nestvision.nest.proxy.fhir.anotaion.FhirFieldValidate;

@Entity
@Table(name = BaseEntity.TABLE_PREFIX + "APPOINTMENT")
public class Appointment extends FhirResourceEntity {

    /**
     *名称:挂号号
     *备注:挂号信息在院内系统中的唯一标识
 	 *
 	 *主键字段
     */
     @Column(name="REGISTER_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="REGISTER_ID",displayName="挂号号",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String registerId;
    /**
     *名称:预约号
     *
 	 *
 	 *
     */
     @Column(name="APPOINTMENT_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="APPOINTMENT_ID",displayName="预约号",maxLength=40,required=false,valuesRange="")   
     private String appointmentId;
    /**
     *名称:状态
     *
 	 *限制:CUS00007
 	 *
     */
     @Column(name="STATUS",length = 20,nullable = true)
     @FhirFieldValidate(name="STATUS",displayName="状态",maxLength=20,required=false,valuesRange="CUS00007")   
     private String status;
    /**
     *名称:等级
     *
 	 *
 	 *
     */
     @Column(name="PRIORITY",length = 20,nullable = true)
     @FhirFieldValidate(name="PRIORITY",displayName="等级",maxLength=20,required=false,valuesRange="")   
     private String priority;
    /**
     *名称:预计就诊开始时间
     *
 	 *
 	 *
     */
     @Column(name="START_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="START_TIME",displayName="预计就诊开始时间",required=false,valuesRange="")   
     private Date startTime;
    /**
     *名称:预计就诊结束时间
     *
 	 *
 	 *
     */
     @Column(name="END_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="END_TIME",displayName="预计就诊结束时间",required=false,valuesRange="")   
     private Date endTime;
    /**
     *名称:号源id
     *备注:引用号源信息表T_SLOT院内号源id
 	 *
 	 *
     */
     @Column(name="NUMBER_SOURCE_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="NUMBER_SOURCE_ID",displayName="号源id",maxLength=40,required=true,valuesRange="")   
     private String numberSourceId;
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
     @Column(name="PATIENT_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="PATIENT_NAME",displayName="患者姓名",maxLength=40,required=false,valuesRange="")   
     private String patientName;
    /**
     *名称:挂号医生id
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="REGISTER_EMPLOYEE_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="REGISTER_EMPLOYEE_ID",displayName="挂号医生id",maxLength=40,required=false,valuesRange="")   
     private String registerEmployeeId;
    /**
     *名称:挂号医生姓名
     *
 	 *
 	 *
     */
     @Column(name="REGISTER_EMPLOYEE_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="REGISTER_EMPLOYEE_NAME",displayName="挂号医生姓名",maxLength=40,required=false,valuesRange="")   
     private String registerEmployeeName;
    /**
     *名称:专家ID
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="EXPERT_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="EXPERT_ID",displayName="专家ID",maxLength=40,required=true,valuesRange="")   
     private String expertId;
    /**
     *名称:专家姓名
     *
 	 *
 	 *
     */
     @Column(name="EXPERT_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="EXPERT_NAME",displayName="专家姓名",maxLength=40,required=false,valuesRange="")   
     private String expertName;
    /**
     *名称:挂号费
     *
 	 *
 	 *
     */
     @Column(name="RE_FEE",length = 8,nullable = true)
     @FhirFieldValidate(name="RE_FEE",displayName="挂号费",maxLength=8,required=false,valuesRange="")   
     private Float reFee;
    /**
     *名称:诊疗费
     *
 	 *
 	 *
     */
     @Column(name="DT_FEE",length = 8,nullable = true)
     @FhirFieldValidate(name="DT_FEE",displayName="诊疗费",maxLength=8,required=false,valuesRange="")   
     private Float dtFee;
    /**
     *名称:病历本费
     *
 	 *
 	 *
     */
     @Column(name="RB_FEE",length = 8,nullable = true)
     @FhirFieldValidate(name="RB_FEE",displayName="病历本费",maxLength=8,required=false,valuesRange="")   
     private Float rbFee;
    /**
     *名称:是否门诊特殊病
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_SPECIAL",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_SPECIAL",displayName="是否门诊特殊病",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifSpecial;
    /**
     *名称:就诊方式代码
     *
 	 *限制:CV9900263
 	 *
     */
     @Column(name="REG_SOURCE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="REG_SOURCE_CODE",displayName="就诊方式代码",maxLength=20,required=false,valuesRange="CV9900263")   
     private String regSourceCode;
    /**
     *名称:挂号科室id
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
 	 *
     */
     @Column(name="REGISTER_DP_CODE",length = 40,nullable = true)
     @FhirFieldValidate(name="REGISTER_DP_CODE",displayName="挂号科室id",maxLength=40,required=false,valuesRange="")   
     private String registerDpCode;
    /**
     *名称:医疗（保险）类别代码
     *
 	 *限制:CV9900281
 	 *
     */
     @Column(name="MEDICAL_INSURANCE_TYPE",length = 20,nullable = false)
     @FhirFieldValidate(name="MEDICAL_INSURANCE_TYPE",displayName="医疗（保险）类别代码",maxLength=20,required=true,valuesRange="CV9900281")   
     private String medicalInsuranceType;
    /**
     *名称:就诊类别
     *
 	 *限制:CV9900133
 	 *
     */
     @Column(name="REG_TYPE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="REG_TYPE_CODE",displayName="就诊类别",maxLength=20,required=false,valuesRange="CV9900133")   
     private String regTypeCode;
    /**
     *名称:挂号时间
     *
 	 *
 	 *
     */
     @Column(name="REGISTER_TIME",nullable = false)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="REGISTER_TIME",displayName="挂号时间",required=true,valuesRange="")   
     private Date registerTime;
    /**
     *名称:就诊顺序号
     *
 	 *
 	 *
     */
     @Column(name="REG_NO",length = 40,nullable = false)
     @FhirFieldValidate(name="REG_NO",displayName="就诊顺序号",maxLength=40,required=true,valuesRange="")   
     private String regNo;
     @javax.persistence.OrderBy("upTime DESC")
     @OneToMany(mappedBy="appointment",cascade=CascadeType.ALL,fetch=javax.persistence.FetchType.EAGER)
     @org.hibernate.annotations.Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
     private List<AppointmentPay> appointmentPays;
    
     public String getRegisterId(){
       	return this.registerId;
     }
     public void setRegisterId(String registerId){
       	this.registerId=registerId;
     }
     public String getAppointmentId(){
       	return this.appointmentId;
     }
     public void setAppointmentId(String appointmentId){
       	this.appointmentId=appointmentId;
     }
     public String getStatus(){
       	return this.status;
     }
     public void setStatus(String status){
       	this.status=status;
     }
     public String getPriority(){
       	return this.priority;
     }
     public void setPriority(String priority){
       	this.priority=priority;
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
     public String getNumberSourceId(){
       	return this.numberSourceId;
     }
     public void setNumberSourceId(String numberSourceId){
       	this.numberSourceId=numberSourceId;
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
     public String getRegisterEmployeeId(){
       	return this.registerEmployeeId;
     }
     public void setRegisterEmployeeId(String registerEmployeeId){
       	this.registerEmployeeId=registerEmployeeId;
     }
     public String getRegisterEmployeeName(){
       	return this.registerEmployeeName;
     }
     public void setRegisterEmployeeName(String registerEmployeeName){
       	this.registerEmployeeName=registerEmployeeName;
     }
     public String getExpertId(){
       	return this.expertId;
     }
     public void setExpertId(String expertId){
       	this.expertId=expertId;
     }
     public String getExpertName(){
       	return this.expertName;
     }
     public void setExpertName(String expertName){
       	this.expertName=expertName;
     }
     public Float getReFee(){
       	return this.reFee;
     }
     public void setReFee(Float reFee){
       	this.reFee=reFee;
     }
     public Float getDtFee(){
       	return this.dtFee;
     }
     public void setDtFee(Float dtFee){
       	this.dtFee=dtFee;
     }
     public Float getRbFee(){
       	return this.rbFee;
     }
     public void setRbFee(Float rbFee){
       	this.rbFee=rbFee;
     }
     public Boolean getIfSpecial(){
       	return this.ifSpecial;
     }
     public void setIfSpecial(Boolean ifSpecial){
       	this.ifSpecial=ifSpecial;
     }
     public String getRegSourceCode(){
       	return this.regSourceCode;
     }
     public void setRegSourceCode(String regSourceCode){
       	this.regSourceCode=regSourceCode;
     }
     public String getRegisterDpCode(){
       	return this.registerDpCode;
     }
     public void setRegisterDpCode(String registerDpCode){
       	this.registerDpCode=registerDpCode;
     }
     public String getMedicalInsuranceType(){
       	return this.medicalInsuranceType;
     }
     public void setMedicalInsuranceType(String medicalInsuranceType){
       	this.medicalInsuranceType=medicalInsuranceType;
     }
     public String getRegTypeCode(){
       	return this.regTypeCode;
     }
     public void setRegTypeCode(String regTypeCode){
       	this.regTypeCode=regTypeCode;
     }
     public Date getRegisterTime(){
       	return this.registerTime;
     }
     public void setRegisterTime(Date registerTime){
       	this.registerTime=registerTime;
     }
     public String getRegNo(){
       	return this.regNo;
     }
     public void setRegNo(String regNo){
       	this.regNo=regNo;
     }
     public List<AppointmentPay> getAppointmentPays(){
       	return this.appointmentPays;
    }
     public void setAppointmentPays(List<AppointmentPay> appointmentPays){
        this.appointmentPays=appointmentPays;
    }
}