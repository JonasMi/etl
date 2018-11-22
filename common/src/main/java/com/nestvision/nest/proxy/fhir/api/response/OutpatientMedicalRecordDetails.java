package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.OutpatientMedicalRecord;

public class OutpatientMedicalRecordDetails extends OutpatientMedicalRecordRecord {
    /**
     *名称:门（急）诊病历id
     *
 	 *
     */
     private String outpatientMedicalRecordId;
    /**
     *名称:记录日期
     *
 	 *
     */
     private Long date;
    /**
     *名称:院内患者ID
     *
 	 *
     */
     private String patientId;
    /**
     *名称:身份证号
     *
 	 *
     */
     private String idCard;
    /**
     *名称:姓名
     *
 	 *
     */
     private String name;
    /**
     *名称:性别
     *
 	 *限制:GBT22611
     */
     private String gender;
    /**
     *名称:出生日期
     *
 	 *
     */
     private Long birthdate;
    /**
     *名称:责任医师姓名
     *
 	 *
     */
     private String responsDocName;
    /**
     *名称:年龄
     *
 	 *
     */
     private Float age;
    /**
     *名称:文档创建者id
     *
 	 *
     */
     private String authorId;
    /**
     *名称:文档创建者姓名
     *
 	 *
     */
     private String authorName;
    /**
     *名称:患者过敏史标志
     *
 	 *限制:CV9900024
     */
     private String inpatAlleMark;
    /**
     *名称:过敏史描述
     *
 	 *
     */
     private String rritability;
    /**
     *名称:主诉
     *
 	 *
     */
     private String chief;
    /**
     *名称:现病史
     *
 	 *
     */
     private String illness;
    /**
     *名称:既往史
     *
 	 *
     */
     private String history;
    /**
     *名称:体格检查
     *
 	 *
     */
     private String phyCheckup;
    /**
     *名称:辅助检查项目
     *
 	 *
     */
     private String auxiliaryExaminationProject;
    /**
     *名称:辅助检查结果
     *
 	 *
     */
     private String auxiliaryExaminationResults;
    /**
     *名称:初诊标志代码
     *
 	 *
     */
     private String newlyMark;
    /**
     *名称:中医"四诊"观察结果
     *
 	 *
     */
     private String cnFourResult;
    /**
     *名称:西医诊断编码
     *
 	 *限制:CV990111
     */
     private String diagnosticCode;
    /**
     *名称:西医诊断编码名称
     *
 	 *
     */
     private String diagnosticName;
    /**
     *名称:中医病名诊断代码
     *
 	 *限制:CV9900357
     */
     private String cnDisDiagCode;
    /**
     *名称:中医病名诊断名称
     *
 	 *
     */
     private String cnDisDiagName;
    /**
     *名称:中医证候诊断代码
     *
 	 *限制:CV9900357
     */
     private String cnSymDiagCode;
    /**
     *名称:中医证候诊断名称
     *
 	 *
     */
     private String cnSymDiagName;
    /**
     *名称:辨证依据
     *
 	 *
     */
     private String dialectProof;
    /**
     *名称:治则治法
     *
 	 *
     */
     private String therapeuticPrinciples;
    /**
     *名称:医嘱类型代码
     *
 	 *限制:CV9900229
     */
     private String orderTypeCode;
    /**
     *名称:医嘱计划开始日期时间
     *
 	 *
     */
     private Long orderPlanStDate;
    /**
     *名称:医嘱计划结束日期时间
     *
 	 *
     */
     private Long orderPlanEndDate;
    /**
     *名称:医嘱计划信息
     *
 	 *
     */
     private String orderPlanMsg;
    /**
     *名称:执行时间
     *
 	 *
     */
     private Long performTime;
    /**
     *名称:执行科室
     *
 	 *
     */
     private String performDept;
    /**
     *名称:执行医生
     *
 	 *
     */
     private String performerEmp;
    /**
     *名称:开立科室
     *
 	 *
     */
     private String orderDp;
    /**
     *名称:审核时间
     *
 	 *
     */
     private Long orderAuditorDate;
    /**
     *名称:审核人
     *
 	 *
     */
     private String orderAuditor;
    /**
     *名称:取消医嘱医生
     *
 	 *
     */
     private String stopDoctor;
    /**
     *名称:开立时间
     *
 	 *
     */
     private Long datewritten;
    /**
     *名称:开立医生
     *
 	 *
     */
     private String prescriber;
    /**
     *名称:取消时间
     *
 	 *
     */
     private Long dateended;
    /**
     *名称:医嘱备注信息
     *
 	 *
     */
     private String note;
    /**
     *名称:医嘱正文
     *
 	 *
     */
     private String text;
    /**
     *名称:医嘱开始时间
     *
 	 *
     */
     private Long boundsperiodStart;
    /**
     *名称:门诊流水号
     *
 	 *
     */
     private String outpatientRegistrationId;
    /**
     *名称:就诊时间
     *
 	 *
     */
     private Long visitingTime;
    /**
     *名称:就诊科室id
     *
 	 *
     */
     private String visitingDeptId;
    /**
     *名称:就诊科室名称
     *
 	 *
     */
     private String visitingDeptName;
    /**
     *名称:就诊科室标准编码
     *
 	 *限制:CV9900051
     */
     private String visitingDeptCd;
    /**
     *名称:备注
     *
 	 *
     */
     private String remarks;
    /**
     *名称:上传机构名称
     *备注:医疗机构在爱心医疗云平台中的唯一编码
 	 *
     */
     private String upHospitalName;
     private String errorMessage;
     private String errorDetail;             
     public OutpatientMedicalRecordDetails(OutpatientMedicalRecord outpatientMedicalRecord) {
        super(outpatientMedicalRecord);
         this.outpatientMedicalRecordId=outpatientMedicalRecord.getOutpatientMedicalRecordId();
         java.util.Date _date = outpatientMedicalRecord.getDate();
         if(_date!=null){
         	this.date=_date.getTime();
         }
         this.patientId=outpatientMedicalRecord.getPatientId();
         this.idCard=outpatientMedicalRecord.getIdCard();
         this.name=outpatientMedicalRecord.getName();
         this.gender=outpatientMedicalRecord.getGender();
         java.util.Date _birthdate = outpatientMedicalRecord.getBirthdate();
         if(_birthdate!=null){
         	this.birthdate=_birthdate.getTime();
         }
         this.responsDocName=outpatientMedicalRecord.getResponsDocName();
         this.age=outpatientMedicalRecord.getAge();
         this.authorId=outpatientMedicalRecord.getAuthorId();
         this.authorName=outpatientMedicalRecord.getAuthorName();
         this.inpatAlleMark=outpatientMedicalRecord.getInpatAlleMark();
         this.rritability=outpatientMedicalRecord.getRritability();
         this.chief=outpatientMedicalRecord.getChief();
         this.illness=outpatientMedicalRecord.getIllness();
         this.history=outpatientMedicalRecord.getHistory();
         this.phyCheckup=outpatientMedicalRecord.getPhyCheckup();
         this.auxiliaryExaminationProject=outpatientMedicalRecord.getAuxiliaryExaminationProject();
         this.auxiliaryExaminationResults=outpatientMedicalRecord.getAuxiliaryExaminationResults();
         this.newlyMark=outpatientMedicalRecord.getNewlyMark();
         this.cnFourResult=outpatientMedicalRecord.getCnFourResult();
         this.diagnosticCode=outpatientMedicalRecord.getDiagnosticCode();
         this.diagnosticName=outpatientMedicalRecord.getDiagnosticName();
         this.cnDisDiagCode=outpatientMedicalRecord.getCnDisDiagCode();
         this.cnDisDiagName=outpatientMedicalRecord.getCnDisDiagName();
         this.cnSymDiagCode=outpatientMedicalRecord.getCnSymDiagCode();
         this.cnSymDiagName=outpatientMedicalRecord.getCnSymDiagName();
         this.dialectProof=outpatientMedicalRecord.getDialectProof();
         this.therapeuticPrinciples=outpatientMedicalRecord.getTherapeuticPrinciples();
         this.orderTypeCode=outpatientMedicalRecord.getOrderTypeCode();
         java.util.Date _orderPlanStDate = outpatientMedicalRecord.getOrderPlanStDate();
         if(_orderPlanStDate!=null){
         	this.orderPlanStDate=_orderPlanStDate.getTime();
         }
         java.util.Date _orderPlanEndDate = outpatientMedicalRecord.getOrderPlanEndDate();
         if(_orderPlanEndDate!=null){
         	this.orderPlanEndDate=_orderPlanEndDate.getTime();
         }
         this.orderPlanMsg=outpatientMedicalRecord.getOrderPlanMsg();
         java.util.Date _performTime = outpatientMedicalRecord.getPerformTime();
         if(_performTime!=null){
         	this.performTime=_performTime.getTime();
         }
         this.performDept=outpatientMedicalRecord.getPerformDept();
         this.performerEmp=outpatientMedicalRecord.getPerformerEmp();
         this.orderDp=outpatientMedicalRecord.getOrderDp();
         java.util.Date _orderAuditorDate = outpatientMedicalRecord.getOrderAuditorDate();
         if(_orderAuditorDate!=null){
         	this.orderAuditorDate=_orderAuditorDate.getTime();
         }
         this.orderAuditor=outpatientMedicalRecord.getOrderAuditor();
         this.stopDoctor=outpatientMedicalRecord.getStopDoctor();
         java.util.Date _datewritten = outpatientMedicalRecord.getDatewritten();
         if(_datewritten!=null){
         	this.datewritten=_datewritten.getTime();
         }
         this.prescriber=outpatientMedicalRecord.getPrescriber();
         java.util.Date _dateended = outpatientMedicalRecord.getDateended();
         if(_dateended!=null){
         	this.dateended=_dateended.getTime();
         }
         this.note=outpatientMedicalRecord.getNote();
         this.text=outpatientMedicalRecord.getText();
         java.util.Date _boundsperiodStart = outpatientMedicalRecord.getBoundsperiodStart();
         if(_boundsperiodStart!=null){
         	this.boundsperiodStart=_boundsperiodStart.getTime();
         }
         this.outpatientRegistrationId=outpatientMedicalRecord.getOutpatientRegistrationId();
         java.util.Date _visitingTime = outpatientMedicalRecord.getVisitingTime();
         if(_visitingTime!=null){
         	this.visitingTime=_visitingTime.getTime();
         }
         this.visitingDeptId=outpatientMedicalRecord.getVisitingDeptId();
         this.visitingDeptName=outpatientMedicalRecord.getVisitingDeptName();
         this.visitingDeptCd=outpatientMedicalRecord.getVisitingDeptCd();
         this.remarks=outpatientMedicalRecord.getRemarks();
         this.upHospitalName=outpatientMedicalRecord.getUpHospitalName();
         this.errorMessage=outpatientMedicalRecord.getErrorMessage();
         this.errorDetail=outpatientMedicalRecord.getErrorDetail();      
    }
      public String  getOutpatientMedicalRecordId(){
       		return this.outpatientMedicalRecordId;
      }    
      public Long  getDate(){
       		return this.date;
      }    
      public String  getPatientId(){
       		return this.patientId;
      }    
      public String  getIdCard(){
       		return this.idCard;
      }    
      public String  getName(){
       		return this.name;
      }    
      public String  getGender(){
       		return this.gender;
      }    
      public Long  getBirthdate(){
       		return this.birthdate;
      }    
      public String  getResponsDocName(){
       		return this.responsDocName;
      }    
      public Float  getAge(){
       		return this.age;
      }    
      public String  getAuthorId(){
       		return this.authorId;
      }    
      public String  getAuthorName(){
       		return this.authorName;
      }    
      public String  getInpatAlleMark(){
       		return this.inpatAlleMark;
      }    
      public String  getRritability(){
       		return this.rritability;
      }    
      public String  getChief(){
       		return this.chief;
      }    
      public String  getIllness(){
       		return this.illness;
      }    
      public String  getHistory(){
       		return this.history;
      }    
      public String  getPhyCheckup(){
       		return this.phyCheckup;
      }    
      public String  getAuxiliaryExaminationProject(){
       		return this.auxiliaryExaminationProject;
      }    
      public String  getAuxiliaryExaminationResults(){
       		return this.auxiliaryExaminationResults;
      }    
      public String  getNewlyMark(){
       		return this.newlyMark;
      }    
      public String  getCnFourResult(){
       		return this.cnFourResult;
      }    
      public String  getDiagnosticCode(){
       		return this.diagnosticCode;
      }    
      public String  getDiagnosticName(){
       		return this.diagnosticName;
      }    
      public String  getCnDisDiagCode(){
       		return this.cnDisDiagCode;
      }    
      public String  getCnDisDiagName(){
       		return this.cnDisDiagName;
      }    
      public String  getCnSymDiagCode(){
       		return this.cnSymDiagCode;
      }    
      public String  getCnSymDiagName(){
       		return this.cnSymDiagName;
      }    
      public String  getDialectProof(){
       		return this.dialectProof;
      }    
      public String  getTherapeuticPrinciples(){
       		return this.therapeuticPrinciples;
      }    
      public String  getOrderTypeCode(){
       		return this.orderTypeCode;
      }    
      public Long  getOrderPlanStDate(){
       		return this.orderPlanStDate;
      }    
      public Long  getOrderPlanEndDate(){
       		return this.orderPlanEndDate;
      }    
      public String  getOrderPlanMsg(){
       		return this.orderPlanMsg;
      }    
      public Long  getPerformTime(){
       		return this.performTime;
      }    
      public String  getPerformDept(){
       		return this.performDept;
      }    
      public String  getPerformerEmp(){
       		return this.performerEmp;
      }    
      public String  getOrderDp(){
       		return this.orderDp;
      }    
      public Long  getOrderAuditorDate(){
       		return this.orderAuditorDate;
      }    
      public String  getOrderAuditor(){
       		return this.orderAuditor;
      }    
      public String  getStopDoctor(){
       		return this.stopDoctor;
      }    
      public Long  getDatewritten(){
       		return this.datewritten;
      }    
      public String  getPrescriber(){
       		return this.prescriber;
      }    
      public Long  getDateended(){
       		return this.dateended;
      }    
      public String  getNote(){
       		return this.note;
      }    
      public String  getText(){
       		return this.text;
      }    
      public Long  getBoundsperiodStart(){
       		return this.boundsperiodStart;
      }    
      public String  getOutpatientRegistrationId(){
       		return this.outpatientRegistrationId;
      }    
      public Long  getVisitingTime(){
       		return this.visitingTime;
      }    
      public String  getVisitingDeptId(){
       		return this.visitingDeptId;
      }    
      public String  getVisitingDeptName(){
       		return this.visitingDeptName;
      }    
      public String  getVisitingDeptCd(){
       		return this.visitingDeptCd;
      }    
      public String  getRemarks(){
       		return this.remarks;
      }    
      public String  getUpHospitalName(){
       		return this.upHospitalName;
      }    
	  public String getErrorMessage() {
	        return errorMessage;
	  }
	  public String getErrorDetail() {
	        return errorDetail;
	  }  
}