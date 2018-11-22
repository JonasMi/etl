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
@Table(name = BaseEntity.TABLE_PREFIX + "OPERATION_ORDER")
public class OperationOrder extends FhirResourceEntity {

    /**
     *名称:院内手术申请单id
     *备注:手术申请单在院内系统中的唯一标识
 	 *
 	 *主键字段
     */
     @Column(name="OPERATION_ORDER_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="OPERATION_ORDER_ID",displayName="院内手术申请单id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String operationOrderId;
    /**
     *名称:患者ID
     *备注:引用患者信息表T_PATIENT院内患者id
 	 *
 	 *
     */
     @Column(name="PATIENT_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="PATIENT_ID",displayName="患者ID",maxLength=40,required=true,valuesRange="")   
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
     *名称:预计手术日期
     *
 	 *
 	 *
     */
     @Column(name="SCHEDULEDDATETIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="SCHEDULEDDATETIME",displayName="预计手术日期",required=false,valuesRange="")   
     private Date scheduleddatetime;
    /**
     *名称:门诊或住院标识
     *
 	 *限制:CUS00011
 	 *
     */
     @Column(name="VISIT_MARK",length = 10,nullable = false)
     @FhirFieldValidate(name="VISIT_MARK",displayName="门诊或住院标识",maxLength=10,required=true,valuesRange="CUS00011")   
     private String visitMark;
    /**
     *名称:就诊流水号
     *备注:引用门诊接诊表T_OUTPATIENT_REGISTRATION院内门诊流水号或引用住院接诊表T_INPATIENT_REGISTRATION院内住院流水号
 	 *
 	 *
     */
     @Column(name="REGISTRATION_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="REGISTRATION_ID",displayName="就诊流水号",maxLength=40,required=true,valuesRange="")   
     private String registrationId;
    /**
     *名称:状态
     *
 	 *限制:CUS00014
 	 *
     */
     @Column(name="STATUS",length = 20,nullable = true)
     @FhirFieldValidate(name="STATUS",displayName="状态",maxLength=20,required=false,valuesRange="CUS00014")   
     private String status;
    /**
     *名称:申请医生ID
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="ORDER_EMPLOYEE_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="ORDER_EMPLOYEE_ID",displayName="申请医生ID",maxLength=40,required=false,valuesRange="")   
     private String orderEmployeeId;
    /**
     *名称:申请科室
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
 	 *
     */
     @Column(name="ORDER_DPID",length = 40,nullable = true)
     @FhirFieldValidate(name="ORDER_DPID",displayName="申请科室",maxLength=40,required=false,valuesRange="")   
     private String orderDpid;
    /**
     *名称:手术日期类型
     *
 	 *限制:CV9900277
 	 *
     */
     @Column(name="OP_DATE_TYPE",length = 20,nullable = true)
     @FhirFieldValidate(name="OP_DATE_TYPE",displayName="手术日期类型",maxLength=20,required=false,valuesRange="CV9900277")   
     private String opDateType;
    
     public String getOperationOrderId(){
       	return this.operationOrderId;
     }
     public void setOperationOrderId(String operationOrderId){
       	this.operationOrderId=operationOrderId;
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
     public Date getScheduleddatetime(){
       	return this.scheduleddatetime;
     }
     public void setScheduleddatetime(Date scheduleddatetime){
       	this.scheduleddatetime=scheduleddatetime;
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
     public String getStatus(){
       	return this.status;
     }
     public void setStatus(String status){
       	this.status=status;
     }
     public String getOrderEmployeeId(){
       	return this.orderEmployeeId;
     }
     public void setOrderEmployeeId(String orderEmployeeId){
       	this.orderEmployeeId=orderEmployeeId;
     }
     public String getOrderDpid(){
       	return this.orderDpid;
     }
     public void setOrderDpid(String orderDpid){
       	this.orderDpid=orderDpid;
     }
     public String getOpDateType(){
       	return this.opDateType;
     }
     public void setOpDateType(String opDateType){
       	this.opDateType=opDateType;
     }
}