package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.ExamineReport;

public class ExamineReportDetails extends ExamineReportRecord {
    /**
     *名称:院内检验报告单id
     *备注:检验报告单在院内系统中的唯一标识
 	 *
     */
     private String examinationResultId;
    /**
     *名称:报告状态
     *
 	 *限制:CUS00012
     */
     private String status;
    /**
     *名称:报告项目代码
     *
 	 *
     */
     private String reportItemCode;
    /**
     *名称:报告项目名称
     *
 	 *
     */
     private String reportItemName;
    /**
     *名称:患者ID
     *备注:引用患者信息表T_PATIENT院内患者id
 	 *
     */
     private String patientId;
    /**
     *名称:患者姓名
     *
 	 *
     */
     private String patientName;
    /**
     *名称:门诊或住院标识
     *
 	 *限制:CUS00010
     */
     private String visitMark;
    /**
     *名称:就诊流水号
     *备注:引用门诊接诊表T_OUTPATIENT_REGISTRATION院内门诊流水号或引用住院接诊表T_INPATIENT_REGISTRATION院内住院流水号
 	 *
     */
     private String registrationId;
    /**
     *名称:标本采集时间
     *
 	 *
     */
     private Long effectivedatetime;
    /**
     *名称:报告时间
     *
 	 *
     */
     private Long issued;
    /**
     *名称:执行报告的医生id
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
     */
     private String performerEmployeeId;
    /**
     *名称:检验申请单ID
     *备注:引用检验申请表T_EXAMINE_ORDER院内检查申请单id
 	 *
     */
     private String examinationOrderId;
    /**
     *名称:报告结论
     *
 	 *
     */
     private String conclusion;
    /**
     *名称:检验类别代码
     *
 	 *限制:CV9900391
     */
     private String examinationType;
    /**
     *名称:检验类别名称
     *
 	 *限制:CV9900391
     */
     private String examinationTypeName;
    /**
     *名称:异常标志
     *
 	 *限制:CV9900012
     */
     private String abnormal;
    /**
     *名称:序号
     *
 	 *
     */
     private String reportNo;
    /**
     *名称:报告审核者ID
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
     */
     private String auditId;
    /**
     *名称:报告科室ID
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
     */
     private String reportDpid;
    /**
     *名称:报告审核时间
     *
 	 *
     */
     private Long auditDate;
    /**
     *名称:文档创建时间
     *
 	 *
     */
     private Long effectiveDtime;
    /**
     *名称:保密级别
     *
 	 *
     */
     private String confidentiality;
    /**
     *名称:可互认标志
     *
 	 *限制:CUS00004
     */
     private Boolean recognitionCd;
    /**
     *名称:条形码
     *备注:检验标本的条形码
 	 *
     */
     private String barcodeNo;
    /**
     *名称:打印时间
     *
 	 *
     */
     private Long printTime;
    /**
     *名称:打印人
     *
 	 *
     */
     private String printOperator;
     private String errorMessage;
     private String errorDetail;             
     public ExamineReportDetails(ExamineReport examineReport) {
        super(examineReport);
         this.examinationResultId=examineReport.getExaminationResultId();
         this.status=examineReport.getStatus();
         this.reportItemCode=examineReport.getReportItemCode();
         this.reportItemName=examineReport.getReportItemName();
         this.patientId=examineReport.getPatientId();
         this.patientName=examineReport.getPatientName();
         this.visitMark=examineReport.getVisitMark();
         this.registrationId=examineReport.getRegistrationId();
         java.util.Date _effectivedatetime = examineReport.getEffectivedatetime();
         if(_effectivedatetime!=null){
         	this.effectivedatetime=_effectivedatetime.getTime();
         }
         java.util.Date _issued = examineReport.getIssued();
         if(_issued!=null){
         	this.issued=_issued.getTime();
         }
         this.performerEmployeeId=examineReport.getPerformerEmployeeId();
         this.examinationOrderId=examineReport.getExaminationOrderId();
         this.conclusion=examineReport.getConclusion();
         this.examinationType=examineReport.getExaminationType();
         this.examinationTypeName=examineReport.getExaminationTypeName();
         this.abnormal=examineReport.getAbnormal();
         this.reportNo=examineReport.getReportNo();
         this.auditId=examineReport.getAuditId();
         this.reportDpid=examineReport.getReportDpid();
         java.util.Date _auditDate = examineReport.getAuditDate();
         if(_auditDate!=null){
         	this.auditDate=_auditDate.getTime();
         }
         java.util.Date _effectiveDtime = examineReport.getEffectiveDtime();
         if(_effectiveDtime!=null){
         	this.effectiveDtime=_effectiveDtime.getTime();
         }
         this.confidentiality=examineReport.getConfidentiality();
         this.recognitionCd=examineReport.getRecognitionCd();
         this.barcodeNo=examineReport.getBarcodeNo();
         java.util.Date _printTime = examineReport.getPrintTime();
         if(_printTime!=null){
         	this.printTime=_printTime.getTime();
         }
         this.printOperator=examineReport.getPrintOperator();
         this.errorMessage=examineReport.getErrorMessage();
         this.errorDetail=examineReport.getErrorDetail();      
    }
      public String  getExaminationResultId(){
       		return this.examinationResultId;
      }    
      public String  getStatus(){
       		return this.status;
      }    
      public String  getReportItemCode(){
       		return this.reportItemCode;
      }    
      public String  getReportItemName(){
       		return this.reportItemName;
      }    
      public String  getPatientId(){
       		return this.patientId;
      }    
      public String  getPatientName(){
       		return this.patientName;
      }    
      public String  getVisitMark(){
       		return this.visitMark;
      }    
      public String  getRegistrationId(){
       		return this.registrationId;
      }    
      public Long  getEffectivedatetime(){
       		return this.effectivedatetime;
      }    
      public Long  getIssued(){
       		return this.issued;
      }    
      public String  getPerformerEmployeeId(){
       		return this.performerEmployeeId;
      }    
      public String  getExaminationOrderId(){
       		return this.examinationOrderId;
      }    
      public String  getConclusion(){
       		return this.conclusion;
      }    
      public String  getExaminationType(){
       		return this.examinationType;
      }    
      public String  getExaminationTypeName(){
       		return this.examinationTypeName;
      }    
      public String  getAbnormal(){
       		return this.abnormal;
      }    
      public String  getReportNo(){
       		return this.reportNo;
      }    
      public String  getAuditId(){
       		return this.auditId;
      }    
      public String  getReportDpid(){
       		return this.reportDpid;
      }    
      public Long  getAuditDate(){
       		return this.auditDate;
      }    
      public Long  getEffectiveDtime(){
       		return this.effectiveDtime;
      }    
      public String  getConfidentiality(){
       		return this.confidentiality;
      }    
      public Boolean  getRecognitionCd(){
       		return this.recognitionCd;
      }    
      public String  getBarcodeNo(){
       		return this.barcodeNo;
      }    
      public Long  getPrintTime(){
       		return this.printTime;
      }    
      public String  getPrintOperator(){
       		return this.printOperator;
      }    
	  public String getErrorMessage() {
	        return errorMessage;
	  }
	  public String getErrorDetail() {
	        return errorDetail;
	  }  
}