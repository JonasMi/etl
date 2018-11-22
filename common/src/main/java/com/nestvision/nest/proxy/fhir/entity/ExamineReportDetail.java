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
@Table(name = BaseEntity.TABLE_PREFIX + "EXAMINE_REPORT_DETAIL")
public class ExamineReportDetail extends FhirResourceEntity {

    /**
     *名称:院内检验报告单id
     *备注:引用检验报告主表T_EXAMINE_REPORT院内检验报告单id
 	 *
 	 *主键字段
     */
     @Column(name="EXAMINATION_RESULT_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="EXAMINATION_RESULT_ID",displayName="院内检验报告单id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String examinationResultId;
    /**
     *名称:明细序号
     *
 	 *
 	 *主键字段
     */
     @Column(name="OBSERVATION_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="OBSERVATION_ID",displayName="明细序号",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String observationId;
    /**
     *名称:明细项目代码
     *
 	 *
 	 *
     */
     @Column(name="REPORT_ITEM_CODE",length = 20,nullable = false)
     @FhirFieldValidate(name="REPORT_ITEM_CODE",displayName="明细项目代码",maxLength=20,required=true,valuesRange="")   
     private String reportItemCode;
    /**
     *名称:明细项目名称
     *
 	 *
 	 *
     */
     @Column(name="REPORT_ITEM_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="REPORT_ITEM_NAME",displayName="明细项目名称",maxLength=40,required=true,valuesRange="")   
     private String reportItemName;
    /**
     *名称:报告项目英文描述
     *
 	 *
 	 *
     */
     @Column(name="REPORT_ENGLISH",length = 200,nullable = true)
     @FhirFieldValidate(name="REPORT_ENGLISH",displayName="报告项目英文描述",maxLength=200,required=false,valuesRange="")   
     private String reportEnglish;
    /**
     *名称:检验设备名称
     *
 	 *
 	 *
     */
     @Column(name="EQUIPMENT",length = 50,nullable = true)
     @FhirFieldValidate(name="EQUIPMENT",displayName="检验设备名称",maxLength=50,required=false,valuesRange="")   
     private String equipment;
    /**
     *名称:检查所见
     *
 	 *
 	 *
     */
     @Column(name="FINDINGS",length = 200,nullable = true)
     @FhirFieldValidate(name="FINDINGS",displayName="检查所见",maxLength=200,required=false,valuesRange="")   
     private String findings;
    /**
     *名称:提示
     *
 	 *
 	 *
     */
     @Column(name="TIP",length = 200,nullable = true)
     @FhirFieldValidate(name="TIP",displayName="提示",maxLength=200,required=false,valuesRange="")   
     private String tip;
    /**
     *名称:参考值备注
     *
 	 *
 	 *
     */
     @Column(name="NORM_VALUE_NOTES",length = 200,nullable = true)
     @FhirFieldValidate(name="NORM_VALUE_NOTES",displayName="参考值备注",maxLength=200,required=false,valuesRange="")   
     private String normValueNotes;
    /**
     *名称:结果值的解释
     *
 	 *
 	 *
     */
     @Column(name="RESULT_INTERPRE",length = 200,nullable = true)
     @FhirFieldValidate(name="RESULT_INTERPRE",displayName="结果值的解释",maxLength=200,required=false,valuesRange="")   
     private String resultInterpre;
    /**
     *名称:检验结果代码
     *
 	 *限制:CV9900012
 	 *
     */
     @Column(name="TEST_RESULT_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="TEST_RESULT_CD",displayName="检验结果代码",maxLength=20,required=false,valuesRange="CV9900012")   
     private String testResultCd;
    /**
     *名称:结果类型代码
     *
 	 *限制:CV9900325
 	 *
     */
     @Column(name="TEST_TYPE_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="TEST_TYPE_CD",displayName="结果类型代码",maxLength=20,required=false,valuesRange="CV9900325")   
     private String testTypeCd;
    /**
     *名称:检验结果的客观说明
     *
 	 *
 	 *
     */
     @Column(name="REPORT_DESCRIPTION",length = 200,nullable = true)
     @FhirFieldValidate(name="REPORT_DESCRIPTION",displayName="检验结果的客观说明",maxLength=200,required=false,valuesRange="")   
     private String reportDescription;
    /**
     *名称:检验结果的主观说明
     *
 	 *
 	 *
     */
     @Column(name="REPORT_IMPRESSION",length = 200,nullable = true)
     @FhirFieldValidate(name="REPORT_IMPRESSION",displayName="检验结果的主观说明",maxLength=200,required=false,valuesRange="")   
     private String reportImpression;
    /**
     *名称:检验日期
     *
 	 *
 	 *
     */
     @Column(name="TEST_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="TEST_DATE",displayName="检验日期",required=false,valuesRange="")   
     private Date testDate;
    /**
     *名称:观察执行时间
     *
 	 *
 	 *
     */
     @Column(name="ISSUED",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="ISSUED",displayName="观察执行时间",required=false,valuesRange="")   
     private Date issued;
    /**
     *名称:执行医生ID
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="PERFORMER_EMPLOYEE_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="PERFORMER_EMPLOYEE_ID",displayName="执行医生ID",maxLength=40,required=false,valuesRange="")   
     private String performerEmployeeId;
    /**
     *名称:结果值
     *
 	 *
 	 *
     */
     @Column(name="VALUE",length = 8,nullable = true)
     @FhirFieldValidate(name="VALUE",displayName="结果值",maxLength=8,required=false,valuesRange="")   
     private Float value;
    /**
     *名称:结果单位
     *
 	 *
 	 *
     */
     @Column(name="UNIT",length = 20,nullable = true)
     @FhirFieldValidate(name="UNIT",displayName="结果单位",maxLength=20,required=false,valuesRange="")   
     private String unit;
    /**
     *名称:检验方法
     *
 	 *
 	 *
     */
     @Column(name="METHOD",length = 50,nullable = true)
     @FhirFieldValidate(name="METHOD",displayName="检验方法",maxLength=50,required=false,valuesRange="")   
     private String method;
    /**
     *名称:正常参考值下限
     *
 	 *
 	 *
     */
     @Column(name="LOW_VALUE",length = 8,nullable = true)
     @FhirFieldValidate(name="LOW_VALUE",displayName="正常参考值下限",maxLength=8,required=false,valuesRange="")   
     private Float lowValue;
    /**
     *名称:正常参考值下限单位
     *
 	 *
 	 *
     */
     @Column(name="LOW_UNIT",length = 20,nullable = true)
     @FhirFieldValidate(name="LOW_UNIT",displayName="正常参考值下限单位",maxLength=20,required=false,valuesRange="")   
     private String lowUnit;
    /**
     *名称:正常参考值上限
     *
 	 *
 	 *
     */
     @Column(name="HIGH_VALUE",length = 8,nullable = true)
     @FhirFieldValidate(name="HIGH_VALUE",displayName="正常参考值上限",maxLength=8,required=false,valuesRange="")   
     private Float highValue;
    /**
     *名称:正常参考值上限单位
     *
 	 *
 	 *
     */
     @Column(name="HIGH_UNIT",length = 20,nullable = true)
     @FhirFieldValidate(name="HIGH_UNIT",displayName="正常参考值上限单位",maxLength=20,required=false,valuesRange="")   
     private String highUnit;
    /**
     *名称:正常参考值范围
     *备注:比如：135g/l-180g/l
 	 *
 	 *
     */
     @Column(name="REFERENCERANGE",length = 40,nullable = true)
     @FhirFieldValidate(name="REFERENCERANGE",displayName="正常参考值范围",maxLength=40,required=false,valuesRange="")   
     private String referencerange;
     @ManyToOne
     @JoinColumn(name="F_UID")
     private ExamineReport examineReport;
    
     public String getExaminationResultId(){
       	return this.examinationResultId;
     }
     public void setExaminationResultId(String examinationResultId){
       	this.examinationResultId=examinationResultId;
     }
     public String getObservationId(){
       	return this.observationId;
     }
     public void setObservationId(String observationId){
       	this.observationId=observationId;
     }
     public String getReportItemCode(){
       	return this.reportItemCode;
     }
     public void setReportItemCode(String reportItemCode){
       	this.reportItemCode=reportItemCode;
     }
     public String getReportItemName(){
       	return this.reportItemName;
     }
     public void setReportItemName(String reportItemName){
       	this.reportItemName=reportItemName;
     }
     public String getReportEnglish(){
       	return this.reportEnglish;
     }
     public void setReportEnglish(String reportEnglish){
       	this.reportEnglish=reportEnglish;
     }
     public String getEquipment(){
       	return this.equipment;
     }
     public void setEquipment(String equipment){
       	this.equipment=equipment;
     }
     public String getFindings(){
       	return this.findings;
     }
     public void setFindings(String findings){
       	this.findings=findings;
     }
     public String getTip(){
       	return this.tip;
     }
     public void setTip(String tip){
       	this.tip=tip;
     }
     public String getNormValueNotes(){
       	return this.normValueNotes;
     }
     public void setNormValueNotes(String normValueNotes){
       	this.normValueNotes=normValueNotes;
     }
     public String getResultInterpre(){
       	return this.resultInterpre;
     }
     public void setResultInterpre(String resultInterpre){
       	this.resultInterpre=resultInterpre;
     }
     public String getTestResultCd(){
       	return this.testResultCd;
     }
     public void setTestResultCd(String testResultCd){
       	this.testResultCd=testResultCd;
     }
     public String getTestTypeCd(){
       	return this.testTypeCd;
     }
     public void setTestTypeCd(String testTypeCd){
       	this.testTypeCd=testTypeCd;
     }
     public String getReportDescription(){
       	return this.reportDescription;
     }
     public void setReportDescription(String reportDescription){
       	this.reportDescription=reportDescription;
     }
     public String getReportImpression(){
       	return this.reportImpression;
     }
     public void setReportImpression(String reportImpression){
       	this.reportImpression=reportImpression;
     }
     public Date getTestDate(){
       	return this.testDate;
     }
     public void setTestDate(Date testDate){
       	this.testDate=testDate;
     }
     public Date getIssued(){
       	return this.issued;
     }
     public void setIssued(Date issued){
       	this.issued=issued;
     }
     public String getPerformerEmployeeId(){
       	return this.performerEmployeeId;
     }
     public void setPerformerEmployeeId(String performerEmployeeId){
       	this.performerEmployeeId=performerEmployeeId;
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
     public String getMethod(){
       	return this.method;
     }
     public void setMethod(String method){
       	this.method=method;
     }
     public Float getLowValue(){
       	return this.lowValue;
     }
     public void setLowValue(Float lowValue){
       	this.lowValue=lowValue;
     }
     public String getLowUnit(){
       	return this.lowUnit;
     }
     public void setLowUnit(String lowUnit){
       	this.lowUnit=lowUnit;
     }
     public Float getHighValue(){
       	return this.highValue;
     }
     public void setHighValue(Float highValue){
       	this.highValue=highValue;
     }
     public String getHighUnit(){
       	return this.highUnit;
     }
     public void setHighUnit(String highUnit){
       	this.highUnit=highUnit;
     }
     public String getReferencerange(){
       	return this.referencerange;
     }
     public void setReferencerange(String referencerange){
       	this.referencerange=referencerange;
     }
	 public ExamineReport getExamineReport(){
	 	return this.examineReport;
	}
	 public void setExamineReport(ExamineReport examineReport){
		this.examineReport=examineReport;
	}
}