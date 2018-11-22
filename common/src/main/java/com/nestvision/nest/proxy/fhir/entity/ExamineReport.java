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
@Table(name = BaseEntity.TABLE_PREFIX + "EXAMINE_REPORT")
public class ExamineReport extends FhirResourceEntity {

    /**
     *名称:院内检验报告单id
     *备注:检验报告单在院内系统中的唯一标识
 	 *
 	 *主键字段
     */
     @Column(name="EXAMINATION_RESULT_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="EXAMINATION_RESULT_ID",displayName="院内检验报告单id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String examinationResultId;
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
     *名称:检验申请单ID
     *备注:引用检验申请表T_EXAMINE_ORDER院内检查申请单id
 	 *
 	 *
     */
     @Column(name="EXAMINATION_ORDER_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="EXAMINATION_ORDER_ID",displayName="检验申请单ID",maxLength=40,required=true,valuesRange="")   
     private String examinationOrderId;
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
     *名称:检验类别代码
     *
 	 *限制:CV9900391
 	 *
     */
     @Column(name="EXAMINATION_TYPE",length = 20,nullable = true)
     @FhirFieldValidate(name="EXAMINATION_TYPE",displayName="检验类别代码",maxLength=20,required=false,valuesRange="CV9900391")   
     private String examinationType;
    /**
     *名称:检验类别名称
     *
 	 *限制:CV9900391
 	 *
     */
     @Column(name="EXAMINATION_TYPE_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="EXAMINATION_TYPE_NAME",displayName="检验类别名称",maxLength=40,required=false,valuesRange="CV9900391")   
     private String examinationTypeName;
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
     *名称:报告科室ID
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="REPORT_DPID",length = 40,nullable = false)
     @FhirFieldValidate(name="REPORT_DPID",displayName="报告科室ID",maxLength=40,required=true,valuesRange="")   
     private String reportDpid;
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
     @Column(name="CONFIDENTIALITY",length = 20,nullable = true)
     @FhirFieldValidate(name="CONFIDENTIALITY",displayName="保密级别",maxLength=20,required=false,valuesRange="")   
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
     *名称:条形码
     *备注:检验标本的条形码
 	 *
 	 *
     */
     @Column(name="BARCODE_NO",length = 40,nullable = true)
     @FhirFieldValidate(name="BARCODE_NO",displayName="条形码",maxLength=40,required=false,valuesRange="")   
     private String barcodeNo;
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
    /**
     *名称:打印人
     *
 	 *
 	 *
     */
     @Column(name="PRINT_OPERATOR",length = 20,nullable = true)
     @FhirFieldValidate(name="PRINT_OPERATOR",displayName="打印人",maxLength=20,required=false,valuesRange="")   
     private String printOperator;
     @javax.persistence.OrderBy("upTime DESC")
     @OneToMany(mappedBy="examineReport",cascade=CascadeType.ALL,fetch=javax.persistence.FetchType.EAGER)
     @org.hibernate.annotations.Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
     private List<ExamineReportDetail> examineReportDetails;
     @javax.persistence.OrderBy("upTime DESC")
     @OneToMany(mappedBy="examineReport",cascade=CascadeType.ALL,fetch=javax.persistence.FetchType.EAGER)
     @org.hibernate.annotations.Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
     private List<ExamineMedia> examineMedias;
     @javax.persistence.OrderBy("upTime DESC")
     @OneToMany(mappedBy="examineReport",cascade=CascadeType.ALL,fetch=javax.persistence.FetchType.EAGER)
     @org.hibernate.annotations.Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
     private List<ExamineSpecimen> examineSpecimens;
    
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
     public String getExaminationOrderId(){
       	return this.examinationOrderId;
     }
     public void setExaminationOrderId(String examinationOrderId){
       	this.examinationOrderId=examinationOrderId;
     }
     public String getConclusion(){
       	return this.conclusion;
     }
     public void setConclusion(String conclusion){
       	this.conclusion=conclusion;
     }
     public String getExaminationType(){
       	return this.examinationType;
     }
     public void setExaminationType(String examinationType){
       	this.examinationType=examinationType;
     }
     public String getExaminationTypeName(){
       	return this.examinationTypeName;
     }
     public void setExaminationTypeName(String examinationTypeName){
       	this.examinationTypeName=examinationTypeName;
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
     public String getReportDpid(){
       	return this.reportDpid;
     }
     public void setReportDpid(String reportDpid){
       	this.reportDpid=reportDpid;
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
     public String getBarcodeNo(){
       	return this.barcodeNo;
     }
     public void setBarcodeNo(String barcodeNo){
       	this.barcodeNo=barcodeNo;
     }
     public Date getPrintTime(){
       	return this.printTime;
     }
     public void setPrintTime(Date printTime){
       	this.printTime=printTime;
     }
     public String getPrintOperator(){
       	return this.printOperator;
     }
     public void setPrintOperator(String printOperator){
       	this.printOperator=printOperator;
     }
     public List<ExamineReportDetail> getExamineReportDetails(){
       	return this.examineReportDetails;
    }
     public void setExamineReportDetails(List<ExamineReportDetail> examineReportDetails){
        this.examineReportDetails=examineReportDetails;
    }
     public List<ExamineMedia> getExamineMedias(){
       	return this.examineMedias;
    }
     public void setExamineMedias(List<ExamineMedia> examineMedias){
        this.examineMedias=examineMedias;
    }
     public List<ExamineSpecimen> getExamineSpecimens(){
       	return this.examineSpecimens;
    }
     public void setExamineSpecimens(List<ExamineSpecimen> examineSpecimens){
        this.examineSpecimens=examineSpecimens;
    }
}