package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.InspectReport;

public class InspectReportDetails extends InspectReportRecord {
    /**
     *名称:院内检查报告单id
     *备注:检查报告单在院内系统中的唯一标识
 	 *
     */
     private String inspectionResultId;
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
     *名称:检查类别代码
     *
 	 *限制:CV9900391
     */
     private String inspectionType;
    /**
     *名称:检查类别名称
     *
 	 *限制:CV9900391
     */
     private String inspectionTypeName;
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
     *名称:检查申请单ID
     *备注:引用检查申请表T_INSPECT_ORDER院内检查申请单id
 	 *
     */
     private String inspectionOrderId;
    /**
     *名称:报告结论
     *
 	 *
     */
     private String conclusion;
    /**
     *名称:报告项目英文描述
     *
 	 *
     */
     private String reportEnglish;
    /**
     *名称:检查设备名称
     *
 	 *
     */
     private String equipment;
    /**
     *名称:检查所见
     *
 	 *
     */
     private String findings;
    /**
     *名称:检查结果代码
     *
 	 *限制:CV9900012
     */
     private String testResultCd;
    /**
     *名称:检查结果的客观说明
     *
 	 *
     */
     private String reportDescription;
    /**
     *名称:检查结果的主观说明
     *
 	 *
     */
     private String reportImpression;
    /**
     *名称:检查时间
     *
 	 *
     */
     private Long inspectIssued;
    /**
     *名称:检查医生id
     *
 	 *
     */
     private String inspectEmployeeId;
    /**
     *名称:结果值
     *
 	 *
     */
     private Float value;
    /**
     *名称:结果单位
     *
 	 *
     */
     private String unit;
    /**
     *名称:检查方法
     *
 	 *
     */
     private String method;
    /**
     *名称:正常参考值下限
     *
 	 *
     */
     private Float lowValue;
    /**
     *名称:正常参考值下限单位
     *
 	 *
     */
     private String lowUnit;
    /**
     *名称:正常参考值上限
     *
 	 *
     */
     private Float highValue;
    /**
     *名称:正常参考值上限单位
     *
 	 *
     */
     private String highUnit;
    /**
     *名称:正常参考值范围
     *备注:比如：135g/l-180g/l
 	 *
     */
     private String referencerange;
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
     *名称:报告备注
     *
 	 *
     */
     private String reportRemark;
    /**
     *名称:打印时间
     *
 	 *
     */
     private Long printTime;
     private String errorMessage;
     private String errorDetail;             
     public InspectReportDetails(InspectReport inspectReport) {
        super(inspectReport);
         this.inspectionResultId=inspectReport.getInspectionResultId();
         this.status=inspectReport.getStatus();
         this.reportItemCode=inspectReport.getReportItemCode();
         this.reportItemName=inspectReport.getReportItemName();
         this.patientId=inspectReport.getPatientId();
         this.patientName=inspectReport.getPatientName();
         this.visitMark=inspectReport.getVisitMark();
         this.registrationId=inspectReport.getRegistrationId();
         this.inspectionType=inspectReport.getInspectionType();
         this.inspectionTypeName=inspectReport.getInspectionTypeName();
         java.util.Date _effectivedatetime = inspectReport.getEffectivedatetime();
         if(_effectivedatetime!=null){
         	this.effectivedatetime=_effectivedatetime.getTime();
         }
         java.util.Date _issued = inspectReport.getIssued();
         if(_issued!=null){
         	this.issued=_issued.getTime();
         }
         this.performerEmployeeId=inspectReport.getPerformerEmployeeId();
         this.inspectionOrderId=inspectReport.getInspectionOrderId();
         this.conclusion=inspectReport.getConclusion();
         this.reportEnglish=inspectReport.getReportEnglish();
         this.equipment=inspectReport.getEquipment();
         this.findings=inspectReport.getFindings();
         this.testResultCd=inspectReport.getTestResultCd();
         this.reportDescription=inspectReport.getReportDescription();
         this.reportImpression=inspectReport.getReportImpression();
         java.util.Date _inspectIssued = inspectReport.getInspectIssued();
         if(_inspectIssued!=null){
         	this.inspectIssued=_inspectIssued.getTime();
         }
         this.inspectEmployeeId=inspectReport.getInspectEmployeeId();
         this.value=inspectReport.getValue();
         this.unit=inspectReport.getUnit();
         this.method=inspectReport.getMethod();
         this.lowValue=inspectReport.getLowValue();
         this.lowUnit=inspectReport.getLowUnit();
         this.highValue=inspectReport.getHighValue();
         this.highUnit=inspectReport.getHighUnit();
         this.referencerange=inspectReport.getReferencerange();
         this.abnormal=inspectReport.getAbnormal();
         this.reportNo=inspectReport.getReportNo();
         this.auditId=inspectReport.getAuditId();
         java.util.Date _auditDate = inspectReport.getAuditDate();
         if(_auditDate!=null){
         	this.auditDate=_auditDate.getTime();
         }
         java.util.Date _effectiveDtime = inspectReport.getEffectiveDtime();
         if(_effectiveDtime!=null){
         	this.effectiveDtime=_effectiveDtime.getTime();
         }
         this.confidentiality=inspectReport.getConfidentiality();
         this.recognitionCd=inspectReport.getRecognitionCd();
         this.reportRemark=inspectReport.getReportRemark();
         java.util.Date _printTime = inspectReport.getPrintTime();
         if(_printTime!=null){
         	this.printTime=_printTime.getTime();
         }
         this.errorMessage=inspectReport.getErrorMessage();
         this.errorDetail=inspectReport.getErrorDetail();      
    }
      public String  getInspectionResultId(){
       		return this.inspectionResultId;
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
      public String  getInspectionType(){
       		return this.inspectionType;
      }    
      public String  getInspectionTypeName(){
       		return this.inspectionTypeName;
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
      public String  getInspectionOrderId(){
       		return this.inspectionOrderId;
      }    
      public String  getConclusion(){
       		return this.conclusion;
      }    
      public String  getReportEnglish(){
       		return this.reportEnglish;
      }    
      public String  getEquipment(){
       		return this.equipment;
      }    
      public String  getFindings(){
       		return this.findings;
      }    
      public String  getTestResultCd(){
       		return this.testResultCd;
      }    
      public String  getReportDescription(){
       		return this.reportDescription;
      }    
      public String  getReportImpression(){
       		return this.reportImpression;
      }    
      public Long  getInspectIssued(){
       		return this.inspectIssued;
      }    
      public String  getInspectEmployeeId(){
       		return this.inspectEmployeeId;
      }    
      public Float  getValue(){
       		return this.value;
      }    
      public String  getUnit(){
       		return this.unit;
      }    
      public String  getMethod(){
       		return this.method;
      }    
      public Float  getLowValue(){
       		return this.lowValue;
      }    
      public String  getLowUnit(){
       		return this.lowUnit;
      }    
      public Float  getHighValue(){
       		return this.highValue;
      }    
      public String  getHighUnit(){
       		return this.highUnit;
      }    
      public String  getReferencerange(){
       		return this.referencerange;
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
      public String  getReportRemark(){
       		return this.reportRemark;
      }    
      public Long  getPrintTime(){
       		return this.printTime;
      }    
	  public String getErrorMessage() {
	        return errorMessage;
	  }
	  public String getErrorDetail() {
	        return errorDetail;
	  }  
}