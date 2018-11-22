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
@Table(name = BaseEntity.TABLE_PREFIX + "EXAMINE_SPECIMEN")
public class ExamineSpecimen extends FhirResourceEntity {

    /**
     *名称:院内标本信息id
     *备注:标本信息在院内系统中的唯一id
 	 *
 	 *主键字段
     */
     @Column(name="SPECIMEN_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="SPECIMEN_ID",displayName="院内标本信息id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String specimenId;
    /**
     *名称:院内检验报告单id
     *备注:引用检验报告主表T_EXAMINE_REPORT院内检验报告单id
 	 *
 	 *
     */
     @Column(name="EXAMINATION_RESULT_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="EXAMINATION_RESULT_ID",displayName="院内检验报告单id",maxLength=40,required=true,valuesRange="")   
     private String examinationResultId;
    /**
     *名称:状态
     *
 	 *限制:CUS00013
 	 *
     */
     @Column(name="STATUS",length = 20,nullable = true)
     @FhirFieldValidate(name="STATUS",displayName="状态",maxLength=20,required=false,valuesRange="CUS00013")   
     private String status;
    /**
     *名称:标本类型
     *
 	 *限制:CV519701
 	 *
     */
     @Column(name="SAMPLE_TYPE_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="SAMPLE_TYPE_CD",displayName="标本类型",maxLength=20,required=false,valuesRange="CV519701")   
     private String sampleTypeCd;
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
     *名称:接收标本日期
     *
 	 *
 	 *
     */
     @Column(name="RECEIVEDTIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="RECEIVEDTIME",displayName="接收标本日期",required=false,valuesRange="")   
     private Date receivedtime;
    /**
     *名称:标本采样者
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="COLLECTOR",length = 40,nullable = true)
     @FhirFieldValidate(name="COLLECTOR",displayName="标本采样者",maxLength=40,required=false,valuesRange="")   
     private String collector;
    /**
     *名称:采集标本时间
     *
 	 *
 	 *
     */
     @Column(name="COLLECTED_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="COLLECTED_TIME",displayName="采集标本时间",required=false,valuesRange="")   
     private Date collectedTime;
    /**
     *名称:采集标本值
     *
 	 *
 	 *
     */
     @Column(name="VALUE",length = 8,nullable = false)
     @FhirFieldValidate(name="VALUE",displayName="采集标本值",maxLength=8,required=true,valuesRange="")   
     private Float value;
    /**
     *名称:采集标本单位
     *
 	 *
 	 *
     */
     @Column(name="UNIT",length = 40,nullable = false)
     @FhirFieldValidate(name="UNIT",displayName="采集标本单位",maxLength=40,required=true,valuesRange="")   
     private String unit;
    /**
     *名称:标本采集部位代码
     *
 	 *限制:CV9900316
 	 *
     */
     @Column(name="SPECIMEN_DETERMINER_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="SPECIMEN_DETERMINER_CD",displayName="标本采集部位代码",maxLength=20,required=false,valuesRange="CV9900316")   
     private String specimenDeterminerCd;
    /**
     *名称:标本编号
     *
 	 *
 	 *
     */
     @Column(name="SAMPLE_NO",length = 40,nullable = false)
     @FhirFieldValidate(name="SAMPLE_NO",displayName="标本编号",maxLength=40,required=true,valuesRange="")   
     private String sampleNo;
    /**
     *名称:标本名称
     *
 	 *
 	 *
     */
     @Column(name="SPECIMEN_NAME",length = 50,nullable = false)
     @FhirFieldValidate(name="SPECIMEN_NAME",displayName="标本名称",maxLength=50,required=true,valuesRange="")   
     private String specimenName;
    /**
     *名称:标本类型
     *备注:检验标本的类型详细描述
 	 *
 	 *
     */
     @Column(name="SPECIMEN_CLASS",length = 50,nullable = true)
     @FhirFieldValidate(name="SPECIMEN_CLASS",displayName="标本类型",maxLength=50,required=false,valuesRange="")   
     private String specimenClass;
    /**
     *名称:标本核收者医生id
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="SAMPLE_COLLECTOR_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="SAMPLE_COLLECTOR_CODE",displayName="标本核收者医生id",maxLength=20,required=false,valuesRange="")   
     private String sampleCollectorCode;
    /**
     *名称:标本危险程度代码
     *
 	 *限制:CV9900317
 	 *
     */
     @Column(name="SPECIMEN_RISK_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="SPECIMEN_RISK_CD",displayName="标本危险程度代码",maxLength=20,required=false,valuesRange="CV9900317")   
     private String specimenRiskCd;
    /**
     *名称:标本质量代码
     *
 	 *限制:CV9900318
 	 *
     */
     @Column(name="SPECIMEN_QUANTITY_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="SPECIMEN_QUANTITY_CD",displayName="标本质量代码",maxLength=20,required=false,valuesRange="CV9900318")   
     private String specimenQuantityCd;
    /**
     *名称:标本拒绝原因代码
     *
 	 *限制:CV9900319
 	 *
     */
     @Column(name="SPECIMEN_REJECTREASON_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="SPECIMEN_REJECTREASON_CD",displayName="标本拒绝原因代码",maxLength=20,required=false,valuesRange="CV9900319")   
     private String specimenRejectreasonCd;
     @ManyToOne
     @JoinColumn(name="F_UID")
     private ExamineReport examineReport;
    
     public String getSpecimenId(){
       	return this.specimenId;
     }
     public void setSpecimenId(String specimenId){
       	this.specimenId=specimenId;
     }
     public String getExaminationResultId(){
       	return this.examinationResultId;
     }
     public void setExaminationResultId(String examinationResultId){
       	this.examinationResultId=examinationResultId;
     }
     public String getStatus(){
       	return this.status;
     }
     public void setStatus(String status){
       	this.status=status;
     }
     public String getSampleTypeCd(){
       	return this.sampleTypeCd;
     }
     public void setSampleTypeCd(String sampleTypeCd){
       	this.sampleTypeCd=sampleTypeCd;
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
     public Date getReceivedtime(){
       	return this.receivedtime;
     }
     public void setReceivedtime(Date receivedtime){
       	this.receivedtime=receivedtime;
     }
     public String getCollector(){
       	return this.collector;
     }
     public void setCollector(String collector){
       	this.collector=collector;
     }
     public Date getCollectedTime(){
       	return this.collectedTime;
     }
     public void setCollectedTime(Date collectedTime){
       	this.collectedTime=collectedTime;
     }
     public Float getValue(){
       	return this.value;
     }
     public void setValue(Float value){
       	this.value=value;
     }
     public String getUnit(){
       	return this.unit;
     }
     public void setUnit(String unit){
       	this.unit=unit;
     }
     public String getSpecimenDeterminerCd(){
       	return this.specimenDeterminerCd;
     }
     public void setSpecimenDeterminerCd(String specimenDeterminerCd){
       	this.specimenDeterminerCd=specimenDeterminerCd;
     }
     public String getSampleNo(){
       	return this.sampleNo;
     }
     public void setSampleNo(String sampleNo){
       	this.sampleNo=sampleNo;
     }
     public String getSpecimenName(){
       	return this.specimenName;
     }
     public void setSpecimenName(String specimenName){
       	this.specimenName=specimenName;
     }
     public String getSpecimenClass(){
       	return this.specimenClass;
     }
     public void setSpecimenClass(String specimenClass){
       	this.specimenClass=specimenClass;
     }
     public String getSampleCollectorCode(){
       	return this.sampleCollectorCode;
     }
     public void setSampleCollectorCode(String sampleCollectorCode){
       	this.sampleCollectorCode=sampleCollectorCode;
     }
     public String getSpecimenRiskCd(){
       	return this.specimenRiskCd;
     }
     public void setSpecimenRiskCd(String specimenRiskCd){
       	this.specimenRiskCd=specimenRiskCd;
     }
     public String getSpecimenQuantityCd(){
       	return this.specimenQuantityCd;
     }
     public void setSpecimenQuantityCd(String specimenQuantityCd){
       	this.specimenQuantityCd=specimenQuantityCd;
     }
     public String getSpecimenRejectreasonCd(){
       	return this.specimenRejectreasonCd;
     }
     public void setSpecimenRejectreasonCd(String specimenRejectreasonCd){
       	this.specimenRejectreasonCd=specimenRejectreasonCd;
     }
	 public ExamineReport getExamineReport(){
	 	return this.examineReport;
	}
	 public void setExamineReport(ExamineReport examineReport){
		this.examineReport=examineReport;
	}
}