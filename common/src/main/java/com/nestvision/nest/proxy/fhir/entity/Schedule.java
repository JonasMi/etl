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
@Table(name = BaseEntity.TABLE_PREFIX + "SCHEDULE")
public class Schedule extends FhirResourceEntity {

    /**
     *名称:院内排班id
     *备注:号别在院内系统中的唯一标识
 	 *
 	 *主键字段
     */
     @Column(name="SCHEDULE_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="SCHEDULE_ID",displayName="院内排班id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String scheduleId;
    /**
     *名称:被安排的医务人员ID号
     *备注:引用医务人员表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="EMPLOYEE_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="EMPLOYEE_ID",displayName="被安排的医务人员ID号",maxLength=40,required=false,valuesRange="")   
     private String employeeId;
    /**
     *名称:排班日期
     *
 	 *
 	 *
     */
     @Column(name="ARR_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="ARR_DATE",displayName="排班日期",required=false,valuesRange="")   
     private Date arrDate;
    /**
     *名称:号别信息id
     *备注:引用号别信息表T_CLINICTYPE院内号别编码
 	 *
 	 *
     */
     @Column(name="CHARGE_TYPE",length = 40,nullable = false)
     @FhirFieldValidate(name="CHARGE_TYPE",displayName="号别信息id",maxLength=40,required=true,valuesRange="")   
     private String chargeType;
    /**
     *名称:允许预约量
     *
 	 *
 	 *
     */
     @Column(name="ALLOW_RESERVATION_NUM",length = 3,nullable = true)
     @FhirFieldValidate(name="ALLOW_RESERVATION_NUM",displayName="允许预约量",maxLength=3,required=false,valuesRange="")   
     private Integer allowReservationNum;
    /**
     *名称:允许挂号量
     *
 	 *
 	 *
     */
     @Column(name="ALLOW_REGISTRATION_NUM",length = 3,nullable = true)
     @FhirFieldValidate(name="ALLOW_REGISTRATION_NUM",displayName="允许挂号量",maxLength=3,required=false,valuesRange="")   
     private Integer allowRegistrationNum;
    /**
     *名称:时间段代码
     *
 	 *限制:CV9900282
 	 *
     */
     @Column(name="PRE_TIME_CODE",length = 20,nullable = false)
     @FhirFieldValidate(name="PRE_TIME_CODE",displayName="时间段代码",maxLength=20,required=true,valuesRange="CV9900282")   
     private String preTimeCode;
    /**
     *名称:排班时间段开始时间
     *
 	 *
 	 *
     */
     @Column(name="START",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="START",displayName="排班时间段开始时间",required=false,valuesRange="")   
     private Date start;
    /**
     *名称:排班时间段结束时间
     *
 	 *
 	 *
     */
     @Column(name="END",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="END",displayName="排班时间段结束时间",required=false,valuesRange="")   
     private Date end;
    /**
     *名称:备注
     *
 	 *
 	 *
     */
     @Column(name="COMMENT",length = 200,nullable = true)
     @FhirFieldValidate(name="COMMENT",displayName="备注",maxLength=200,required=false,valuesRange="")   
     private String comment;
    /**
     *名称:是否停诊
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_STOP_DIAGNOSIS",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_STOP_DIAGNOSIS",displayName="是否停诊",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifStopDiagnosis;
    /**
     *名称:替诊医生
     *备注:引用医务人员表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="REPLACE_DIAGNOSIS_DOCTOR",length = 40,nullable = true)
     @FhirFieldValidate(name="REPLACE_DIAGNOSIS_DOCTOR",displayName="替诊医生",maxLength=40,required=false,valuesRange="")   
     private String replaceDiagnosisDoctor;
    /**
     *名称:停诊原因
     *
 	 *
 	 *
     */
     @Column(name="STOP_DIAGNOSIS_REASON",length = 200,nullable = true)
     @FhirFieldValidate(name="STOP_DIAGNOSIS_REASON",displayName="停诊原因",maxLength=200,required=false,valuesRange="")   
     private String stopDiagnosisReason;
    /**
     *名称:停诊起始日期
     *
 	 *
 	 *
     */
     @Column(name="STOP_DIAGNOSIS_STARTDATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="STOP_DIAGNOSIS_STARTDATE",displayName="停诊起始日期",required=false,valuesRange="")   
     private Date stopDiagnosisStartdate;
    /**
     *名称:停诊结束日期
     *
 	 *
 	 *
     */
     @Column(name="STOP_DIAGNOSIS_ENDDATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="STOP_DIAGNOSIS_ENDDATE",displayName="停诊结束日期",required=false,valuesRange="")   
     private Date stopDiagnosisEnddate;
    
     public String getScheduleId(){
       	return this.scheduleId;
     }
     public void setScheduleId(String scheduleId){
       	this.scheduleId=scheduleId;
     }
     public String getEmployeeId(){
       	return this.employeeId;
     }
     public void setEmployeeId(String employeeId){
       	this.employeeId=employeeId;
     }
     public Date getArrDate(){
       	return this.arrDate;
     }
     public void setArrDate(Date arrDate){
       	this.arrDate=arrDate;
     }
     public String getChargeType(){
       	return this.chargeType;
     }
     public void setChargeType(String chargeType){
       	this.chargeType=chargeType;
     }
     public Integer getAllowReservationNum(){
       	return this.allowReservationNum;
     }
     public void setAllowReservationNum(Integer allowReservationNum){
       	this.allowReservationNum=allowReservationNum;
     }
     public Integer getAllowRegistrationNum(){
       	return this.allowRegistrationNum;
     }
     public void setAllowRegistrationNum(Integer allowRegistrationNum){
       	this.allowRegistrationNum=allowRegistrationNum;
     }
     public String getPreTimeCode(){
       	return this.preTimeCode;
     }
     public void setPreTimeCode(String preTimeCode){
       	this.preTimeCode=preTimeCode;
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
     public String getComment(){
       	return this.comment;
     }
     public void setComment(String comment){
       	this.comment=comment;
     }
     public Boolean getIfStopDiagnosis(){
       	return this.ifStopDiagnosis;
     }
     public void setIfStopDiagnosis(Boolean ifStopDiagnosis){
       	this.ifStopDiagnosis=ifStopDiagnosis;
     }
     public String getReplaceDiagnosisDoctor(){
       	return this.replaceDiagnosisDoctor;
     }
     public void setReplaceDiagnosisDoctor(String replaceDiagnosisDoctor){
       	this.replaceDiagnosisDoctor=replaceDiagnosisDoctor;
     }
     public String getStopDiagnosisReason(){
       	return this.stopDiagnosisReason;
     }
     public void setStopDiagnosisReason(String stopDiagnosisReason){
       	this.stopDiagnosisReason=stopDiagnosisReason;
     }
     public Date getStopDiagnosisStartdate(){
       	return this.stopDiagnosisStartdate;
     }
     public void setStopDiagnosisStartdate(Date stopDiagnosisStartdate){
       	this.stopDiagnosisStartdate=stopDiagnosisStartdate;
     }
     public Date getStopDiagnosisEnddate(){
       	return this.stopDiagnosisEnddate;
     }
     public void setStopDiagnosisEnddate(Date stopDiagnosisEnddate){
       	this.stopDiagnosisEnddate=stopDiagnosisEnddate;
     }
}