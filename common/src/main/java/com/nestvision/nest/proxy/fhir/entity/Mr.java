package com.nestvision.nest.proxy.fhir.entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import java.util.Date;
import javax.persistence.TemporalType;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.nestvision.nest.proxy.base.entity.BaseEntity;
import com.nestvision.nest.proxy.fhir.anotaion.FhirFieldValidate;

@Entity
@Table(name = BaseEntity.TABLE_PREFIX + "MR")
public class Mr extends FhirResourceEntity {

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
     @Column(name="STATUS",length = 20,nullable = true)
     @FhirFieldValidate(name="STATUS",displayName="转诊状态",maxLength=20,required=false,valuesRange="CUS00017")   
     private String status;
    /**
     *名称:转出科室id
     *
 	 *
 	 *
     */
     @Column(name="OUT_DPID_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="OUT_DPID_ID",displayName="转出科室id",maxLength=40,required=false,valuesRange="")   
     private String outDpidId;
    /**
     *名称:转出科室名称
     *
 	 *
 	 *
     */
     @Column(name="OUT_DPID_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="OUT_DPID_NAME",displayName="转出科室名称",maxLength=40,required=false,valuesRange="")   
     private String outDpidName;
    /**
     *名称:转出床位号
     *
 	 *
 	 *
     */
     @Column(name="OUT_BEDNO_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="OUT_BEDNO_ID",displayName="转出床位号",maxLength=40,required=false,valuesRange="")   
     private String outBednoId;
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
     *
 	 *
 	 *
     */
     @Column(name="IN_EMP_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="IN_EMP_ID",displayName="转入操作人id",maxLength=40,required=false,valuesRange="")   
     private String inEmpId;
    /**
     *名称:转入操作人姓名
     *
 	 *
 	 *
     */
     @Column(name="IN_EMP_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="IN_EMP_NAME",displayName="转入操作人姓名",maxLength=40,required=false,valuesRange="")   
     private String inEmpName;
    /**
     *名称:转入科室id
     *
 	 *
 	 *
     */
     @Column(name="IN_DPID_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="IN_DPID_ID",displayName="转入科室id",maxLength=40,required=false,valuesRange="")   
     private String inDpidId;
    /**
     *名称:转入科室名称
     *
 	 *
 	 *
     */
     @Column(name="IN_DPID_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="IN_DPID_NAME",displayName="转入科室名称",maxLength=40,required=false,valuesRange="")   
     private String inDpidName;
    /**
     *名称:转入床位号
     *
 	 *
 	 *
     */
     @Column(name="IN_BEDNO",length = 40,nullable = true)
     @FhirFieldValidate(name="IN_BEDNO",displayName="转入床位号",maxLength=40,required=false,valuesRange="")   
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
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
     @ManyToOne
     @JoinColumn(name="F_UID")
     private MedicalRecord medicalRecord;
    
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
     public String getOutDpidId(){
       	return this.outDpidId;
     }
     public void setOutDpidId(String outDpidId){
       	this.outDpidId=outDpidId;
     }
     public String getOutDpidName(){
       	return this.outDpidName;
     }
     public void setOutDpidName(String outDpidName){
       	this.outDpidName=outDpidName;
     }
     public String getOutBednoId(){
       	return this.outBednoId;
     }
     public void setOutBednoId(String outBednoId){
       	this.outBednoId=outBednoId;
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
     public String getInEmpName(){
       	return this.inEmpName;
     }
     public void setInEmpName(String inEmpName){
       	this.inEmpName=inEmpName;
     }
     public String getInDpidId(){
       	return this.inDpidId;
     }
     public void setInDpidId(String inDpidId){
       	this.inDpidId=inDpidId;
     }
     public String getInDpidName(){
       	return this.inDpidName;
     }
     public void setInDpidName(String inDpidName){
       	this.inDpidName=inDpidName;
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
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
	 public MedicalRecord getMedicalRecord(){
	 	return this.medicalRecord;
	}
	 public void setMedicalRecord(MedicalRecord medicalRecord){
		this.medicalRecord=medicalRecord;
	}
}