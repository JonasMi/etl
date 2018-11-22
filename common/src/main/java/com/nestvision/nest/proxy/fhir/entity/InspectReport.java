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
@Table(name = BaseEntity.TABLE_PREFIX + "INSPECT_REPORT")
public class InspectReport extends FhirResourceEntity {

    /**
     *名称:院内检查报告单id
     *备注:检查报告单在院内系统中的唯一标识
 	 *
 	 *主键字段
     */
     @Column(name="INSPECTION_RESULT_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="INSPECTION_RESULT_ID",displayName="院内检查报告单id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String inspectionResultId;
    /**
     *名称:报告状态
     *
 	 *限制:CUS00012
 	 *
     */
     @Column(name="STATUS",length = 20,nullable = false)
     @FhirFieldValidate(name="STATUS",displayName="报告状态",maxLength=20,required=true,valuesRange="CUS00012")   
     private String status;
    /**
     *名称:报告项目代码
     *
 	 *
 	 *
     */
     @Column(name="REPORT_ITEM_CODE",length = 20,nullable = false)
     @FhirFieldValidate(name="REPORT_ITEM_CODE",displayName="报告项目代码",maxLength=20,required=true,valuesRange="")   
     private String reportItemCode;
    /**
     *名称:报告项目名称
     *
 	 *
 	 *
     */
     @Column(name="REPORT_ITEM_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="REPORT_ITEM_NAME",displayName="报告项目名称",maxLength=40,required=true,valuesRange="")   
     private String reportItemName;
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
     *名称:检查类别代码
     *
 	 *限制:CV9900391
 	 *
     */
     @Column(name="INSPECTION_TYPE",length = 20,nullable = true)
     @FhirFieldValidate(name="INSPECTION_TYPE",displayName="检查类别代码",maxLength=20,required=false,valuesRange="CV9900391")   
     private String inspectionType;
    /**
     *名称:检查类别名称
     *
 	 *限制:CV9900391
 	 *
     */
     @Column(name="INSPECTION_TYPE_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="INSPECTION_TYPE_NAME",displayName="检查类别名称",maxLength=40,required=false,valuesRange="CV9900391")   
     private String inspectionTypeName;
    /**
     *名称:标本采集时间
     *
 	 *
 	 *
     */
     @Column(name="EFFECTIVEDATETIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="EFFECTIVEDATETIME",displayName="标本采集时间",required=false,valuesRange="")   
     private Date effectivedatetime;
    /**
     *名称:报告时间
     *
 	 *
 	 *
     */
     @Column(name="ISSUED",nullable = false)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="ISSUED",displayName="报告时间",required=true,valuesRange="")   
     private Date issued;
    /**
     *名称:执行报告的医生id
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="PERFORMER_EMPLOYEE_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="PERFORMER_EMPLOYEE_ID",displayName="执行报告的医生id",maxLength=40,required=true,valuesRange="")   
     private String performerEmployeeId;
    /**
     *名称:检查申请单ID
     *备注:引用检查申请表T_INSPECT_ORDER院内检查申请单id
 	 *
 	 *
     */
     @Column(name="INSPECTION_ORDER_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="INSPECTION_ORDER_ID",displayName="检查申请单ID",maxLength=40,required=true,valuesRange="")   
     private String inspectionOrderId;
    /**
     *名称:报告结论
     *
 	 *
 	 *
     */
     @Column(name="CONCLUSION",length = 200,nullable = true)
     @FhirFieldValidate(name="CONCLUSION",displayName="报告结论",maxLength=200,required=false,valuesRange="")   
     private String conclusion;
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
     *名称:检查设备名称
     *
 	 *
 	 *
     */
     @Column(name="EQUIPMENT",length = 50,nullable = true)
     @FhirFieldValidate(name="EQUIPMENT",displayName="检查设备名称",maxLength=50,required=false,valuesRange="")   
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
     *名称:检查结果代码
     *
 	 *限制:CV9900012
 	 *
     */
     @Column(name="TEST_RESULT_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="TEST_RESULT_CD",displayName="检查结果代码",maxLength=20,required=false,valuesRange="CV9900012")   
     private String testResultCd;
    /**
     *名称:检查结果的客观说明
     *
 	 *
 	 *
     */
     @Column(name="REPORT_DESCRIPTION",length = 200,nullable = true)
     @FhirFieldValidate(name="REPORT_DESCRIPTION",displayName="检查结果的客观说明",maxLength=200,required=false,valuesRange="")   
     private String reportDescription;
    /**
     *名称:检查结果的主观说明
     *
 	 *
 	 *
     */
     @Column(name="REPORT_IMPRESSION",length = 200,nullable = true)
     @FhirFieldValidate(name="REPORT_IMPRESSION",displayName="检查结果的主观说明",maxLength=200,required=false,valuesRange="")   
     private String reportImpression;
    /**
     *名称:检查时间
     *
 	 *
 	 *
     */
     @Column(name="INSPECT_ISSUED",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="INSPECT_ISSUED",displayName="检查时间",required=false,valuesRange="")   
     private Date inspectIssued;
    /**
     *名称:检查医生id
     *
 	 *
 	 *
     */
     @Column(name="INSPECT_EMPLOYEE_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="INSPECT_EMPLOYEE_ID",displayName="检查医生id",maxLength=40,required=false,valuesRange="")   
     private String inspectEmployeeId;
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
     *名称:检查方法
     *
 	 *
 	 *
     */
     @Column(name="METHOD",length = 50,nullable = true)
     @FhirFieldValidate(name="METHOD",displayName="检查方法",maxLength=50,required=false,valuesRange="")   
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
    /**
     *名称:异常标志
     *
 	 *限制:CV9900012
 	 *
     */
     @Column(name="ABNORMAL",length = 20,nullable = true)
     @FhirFieldValidate(name="ABNORMAL",displayName="异常标志",maxLength=20,required=false,valuesRange="CV9900012")   
     private String abnormal;
    /**
     *名称:序号
     *
 	 *
 	 *
     */
     @Column(name="REPORT_NO",length = 40,nullable = true)
     @FhirFieldValidate(name="REPORT_NO",displayName="序号",maxLength=40,required=false,valuesRange="")   
     private String reportNo;
    /**
     *名称:报告审核者ID
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="AUDIT_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="AUDIT_ID",displayName="报告审核者ID",maxLength=40,required=false,valuesRange="")   
     private String auditId;
    /**
     *名称:报告审核时间
     *
 	 *
 	 *
     */
     @Column(name="AUDIT_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="AUDIT_DATE",displayName="报告审核时间",required=false,valuesRange="")   
     private Date auditDate;
    /**
     *名称:文档创建时间
     *
 	 *
 	 *
     */
     @Column(name="EFFECTIVE_DTIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="EFFECTIVE_DTIME",displayName="文档创建时间",required=false,valuesRange="")   
     private Date effectiveDtime;
    /**
     *名称:保密级别
     *
 	 *
 	 *
     */
     @Column(name="CONFIDENTIALITY",length = 40,nullable = true)
     @FhirFieldValidate(name="CONFIDENTIALITY",displayName="保密级别",maxLength=40,required=false,valuesRange="")   
     private String confidentiality;
    /**
     *名称:可互认标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="RECOGNITION_CD",length = 5,nullable = true)
     @FhirFieldValidate(name="RECOGNITION_CD",displayName="可互认标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean recognitionCd;
    /**
     *名称:报告备注
     *
 	 *
 	 *
     */
     @Column(name="REPORT_REMARK",length = 200,nullable = true)
     @FhirFieldValidate(name="REPORT_REMARK",displayName="报告备注",maxLength=200,required=false,valuesRange="")   
     private String reportRemark;
    /**
     *名称:打印时间
     *
 	 *
 	 *
     */
     @Column(name="PRINT_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="PRINT_TIME",displayName="打印时间",required=false,valuesRange="")   
     private Date printTime;
    
     public String getInspectionResultId(){
       	return this.inspectionResultId;
     }
     public void setInspectionResultId(String inspectionResultId){
       	this.inspectionResultId=inspectionResultId;
     }
     public String getStatus(){
       	return this.status;
     }
     public void setStatus(String status){
       	this.status=status;
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
     public String getInspectionType(){
       	return this.inspectionType;
     }
     public void setInspectionType(String inspectionType){
       	this.inspectionType=inspectionType;
     }
     public String getInspectionTypeName(){
       	return this.inspectionTypeName;
     }
     public void setInspectionTypeName(String inspectionTypeName){
       	this.inspectionTypeName=inspectionTypeName;
     }
     public Date getEffectivedatetime(){
       	return this.effectivedatetime;
     }
     public void setEffectivedatetime(Date effectivedatetime){
       	this.effectivedatetime=effectivedatetime;
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
     public String getInspectionOrderId(){
       	return this.inspectionOrderId;
     }
     public void setInspectionOrderId(String inspectionOrderId){
       	this.inspectionOrderId=inspectionOrderId;
     }
     public String getConclusion(){
       	return this.conclusion;
     }
     public void setConclusion(String conclusion){
       	this.conclusion=conclusion;
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
     public String getTestResultCd(){
       	return this.testResultCd;
     }
     public void setTestResultCd(String testResultCd){
       	this.testResultCd=testResultCd;
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
     public Date getInspectIssued(){
       	return this.inspectIssued;
     }
     public void setInspectIssued(Date inspectIssued){
       	this.inspectIssued=inspectIssued;
     }
     public String getInspectEmployeeId(){
       	return this.inspectEmployeeId;
     }
     public void setInspectEmployeeId(String inspectEmployeeId){
       	this.inspectEmployeeId=inspectEmployeeId;
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
     public String getAbnormal(){
       	return this.abnormal;
     }
     public void setAbnormal(String abnormal){
       	this.abnormal=abnormal;
     }
     public String getReportNo(){
       	return this.reportNo;
     }
     public void setReportNo(String reportNo){
       	this.reportNo=reportNo;
     }
     public String getAuditId(){
       	return this.auditId;
     }
     public void setAuditId(String auditId){
       	this.auditId=auditId;
     }
     public Date getAuditDate(){
       	return this.auditDate;
     }
     public void setAuditDate(Date auditDate){
       	this.auditDate=auditDate;
     }
     public Date getEffectiveDtime(){
       	return this.effectiveDtime;
     }
     public void setEffectiveDtime(Date effectiveDtime){
       	this.effectiveDtime=effectiveDtime;
     }
     public String getConfidentiality(){
       	return this.confidentiality;
     }
     public void setConfidentiality(String confidentiality){
       	this.confidentiality=confidentiality;
     }
     public Boolean getRecognitionCd(){
       	return this.recognitionCd;
     }
     public void setRecognitionCd(Boolean recognitionCd){
       	this.recognitionCd=recognitionCd;
     }
     public String getReportRemark(){
       	return this.reportRemark;
     }
     public void setReportRemark(String reportRemark){
       	this.reportRemark=reportRemark;
     }
     public Date getPrintTime(){
       	return this.printTime;
     }
     public void setPrintTime(Date printTime){
       	this.printTime=printTime;
     }
}