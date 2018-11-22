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
@Table(name = BaseEntity.TABLE_PREFIX + "REFERRAL")
public class Referral extends FhirResourceEntity {

    /**
     *名称:院内转科id
     *备注:转科信息在院内系统中的唯一标识
 	 *
 	 *主键字段
     */
     @Column(name="INPATIENT_TRANSFER_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="INPATIENT_TRANSFER_ID",displayName="院内转科id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String inpatientTransferId;
    /**
     *名称:转诊状态
     *
 	 *限制:CUS00017
 	 *
     */
     @Column(name="STATUS",length = 20,nullable = false)
     @FhirFieldValidate(name="STATUS",displayName="转诊状态",maxLength=20,required=true,valuesRange="CUS00017")   
     private String status;
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
     *名称:住院流水号
     *备注:引用住院接诊表T_INPATIENT_REGISTRATION院内住院流水号
 	 *
 	 *
     */
     @Column(name="INPATIENT_REGISTRATION_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="INPATIENT_REGISTRATION_ID",displayName="住院流水号",maxLength=40,required=true,valuesRange="")   
     private String inpatientRegistrationId;
    /**
     *名称:转出操作人id
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="OUT_EMP_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="OUT_EMP_ID",displayName="转出操作人id",maxLength=40,required=false,valuesRange="")   
     private String outEmpId;
    /**
     *名称:转出科室id
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
 	 *
     */
     @Column(name="OUT_DPID",length = 40,nullable = true)
     @FhirFieldValidate(name="OUT_DPID",displayName="转出科室id",maxLength=40,required=false,valuesRange="")   
     private String outDpid;
    /**
     *名称:转出床位信息id
     *备注:引用床位信息表T_BED院内床位id
 	 *
 	 *
     */
     @Column(name="OUT_BEDNO",length = 40,nullable = true)
     @FhirFieldValidate(name="OUT_BEDNO",displayName="转出床位信息id",maxLength=40,required=false,valuesRange="")   
     private String outBedno;
    /**
     *名称:转出时间
     *
 	 *
 	 *
     */
     @Column(name="OUT_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="OUT_DATE",displayName="转出时间",required=false,valuesRange="")   
     private Date outDate;
    /**
     *名称:转入操作人id
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="IN_EMP_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="IN_EMP_ID",displayName="转入操作人id",maxLength=40,required=false,valuesRange="")   
     private String inEmpId;
    /**
     *名称:转入科室id
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
 	 *
     */
     @Column(name="IN_DPID",length = 40,nullable = true)
     @FhirFieldValidate(name="IN_DPID",displayName="转入科室id",maxLength=40,required=false,valuesRange="")   
     private String inDpid;
    /**
     *名称:转入床位信息id
     *备注:引用床位信息表T_BED院内床位id
 	 *
 	 *
     */
     @Column(name="IN_BEDNO",length = 40,nullable = true)
     @FhirFieldValidate(name="IN_BEDNO",displayName="转入床位信息id",maxLength=40,required=false,valuesRange="")   
     private String inBedno;
    /**
     *名称:转入时间
     *
 	 *
 	 *
     */
     @Column(name="IN_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="IN_DATE",displayName="转入时间",required=false,valuesRange="")   
     private Date inDate;
    /**
     *名称:转诊原因
     *
 	 *
 	 *
     */
     @Column(name="TRANSFER_REASON",length = 500,nullable = true)
     @FhirFieldValidate(name="TRANSFER_REASON",displayName="转诊原因",maxLength=500,required=false,valuesRange="")   
     private String transferReason;
    /**
     *名称:转诊记录
     *
 	 *
 	 *
     */
     @Column(name="TRANSFER_RECORD",length = 500,nullable = true)
     @FhirFieldValidate(name="TRANSFER_RECORD",displayName="转诊记录",maxLength=500,required=false,valuesRange="")   
     private String transferRecord;
    
     public String getInpatientTransferId(){
       	return this.inpatientTransferId;
     }
     public void setInpatientTransferId(String inpatientTransferId){
       	this.inpatientTransferId=inpatientTransferId;
     }
     public String getStatus(){
       	return this.status;
     }
     public void setStatus(String status){
       	this.status=status;
     }
     public String getPatientId(){
       	return this.patientId;
     }
     public void setPatientId(String patientId){
       	this.patientId=patientId;
     }
     public String getInpatientRegistrationId(){
       	return this.inpatientRegistrationId;
     }
     public void setInpatientRegistrationId(String inpatientRegistrationId){
       	this.inpatientRegistrationId=inpatientRegistrationId;
     }
     public String getOutEmpId(){
       	return this.outEmpId;
     }
     public void setOutEmpId(String outEmpId){
       	this.outEmpId=outEmpId;
     }
     public String getOutDpid(){
       	return this.outDpid;
     }
     public void setOutDpid(String outDpid){
       	this.outDpid=outDpid;
     }
     public String getOutBedno(){
       	return this.outBedno;
     }
     public void setOutBedno(String outBedno){
       	this.outBedno=outBedno;
     }
     public Date getOutDate(){
       	return this.outDate;
     }
     public void setOutDate(Date outDate){
       	this.outDate=outDate;
     }
     public String getInEmpId(){
       	return this.inEmpId;
     }
     public void setInEmpId(String inEmpId){
       	this.inEmpId=inEmpId;
     }
     public String getInDpid(){
       	return this.inDpid;
     }
     public void setInDpid(String inDpid){
       	this.inDpid=inDpid;
     }
     public String getInBedno(){
       	return this.inBedno;
     }
     public void setInBedno(String inBedno){
       	this.inBedno=inBedno;
     }
     public Date getInDate(){
       	return this.inDate;
     }
     public void setInDate(Date inDate){
       	this.inDate=inDate;
     }
     public String getTransferReason(){
       	return this.transferReason;
     }
     public void setTransferReason(String transferReason){
       	this.transferReason=transferReason;
     }
     public String getTransferRecord(){
       	return this.transferRecord;
     }
     public void setTransferRecord(String transferRecord){
       	this.transferRecord=transferRecord;
     }
}