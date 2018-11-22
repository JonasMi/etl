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
@Table(name = BaseEntity.TABLE_PREFIX + "OUTPATIENT_MEDICAL_RECORD")
public class OutpatientMedicalRecord extends FhirResourceEntity {

    /**
     *名称:门（急）诊病历id
     *
 	 *
 	 *主键字段
     */
     @Column(name="OUTPATIENT_MEDICAL_RECORD_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="OUTPATIENT_MEDICAL_RECORD_ID",displayName="门（急）诊病历id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String outpatientMedicalRecordId;
    /**
     *名称:记录日期
     *
 	 *
 	 *
     */
     @Column(name="DATE",nullable = false)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DATE",displayName="记录日期",required=true,valuesRange="")   
     private Date date;
    /**
     *名称:院内患者ID
     *
 	 *
 	 *
     */
     @Column(name="PATIENT_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="PATIENT_ID",displayName="院内患者ID",maxLength=40,required=false,valuesRange="")   
     private String patientId;
    /**
     *名称:身份证号
     *
 	 *
 	 *
     */
     @Column(name="ID_CARD",length = 40,nullable = true)
     @FhirFieldValidate(name="ID_CARD",displayName="身份证号",maxLength=40,required=false,valuesRange="")   
     private String idCard;
    /**
     *名称:姓名
     *
 	 *
 	 *
     */
     @Column(name="NAME",length = 20,nullable = false)
     @FhirFieldValidate(name="NAME",displayName="姓名",maxLength=20,required=true,valuesRange="")   
     private String name;
    /**
     *名称:性别
     *
 	 *限制:GBT22611
 	 *
     */
     @Column(name="GENDER",length = 10,nullable = false)
     @FhirFieldValidate(name="GENDER",displayName="性别",maxLength=10,required=true,valuesRange="GBT22611")   
     private String gender;
    /**
     *名称:出生日期
     *
 	 *
 	 *
     */
     @Column(name="BIRTHDATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="BIRTHDATE",displayName="出生日期",required=false,valuesRange="")   
     private Date birthdate;
    /**
     *名称:责任医师姓名
     *
 	 *
 	 *
     */
     @Column(name="RESPONS_DOC_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="RESPONS_DOC_NAME",displayName="责任医师姓名",maxLength=20,required=false,valuesRange="")   
     private String responsDocName;
    /**
     *名称:年龄
     *
 	 *
 	 *
     */
     @Column(name="AGE",length = 8,nullable = true)
     @FhirFieldValidate(name="AGE",displayName="年龄",maxLength=8,required=false,valuesRange="")   
     private Float age;
    /**
     *名称:文档创建者id
     *
 	 *
 	 *
     */
     @Column(name="AUTHOR_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="AUTHOR_ID",displayName="文档创建者id",maxLength=40,required=false,valuesRange="")   
     private String authorId;
    /**
     *名称:文档创建者姓名
     *
 	 *
 	 *
     */
     @Column(name="AUTHOR_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="AUTHOR_NAME",displayName="文档创建者姓名",maxLength=20,required=false,valuesRange="")   
     private String authorName;
    /**
     *名称:患者过敏史标志
     *
 	 *限制:CV9900024
 	 *
     */
     @Column(name="INPAT_ALLE_MARK",length = 20,nullable = true)
     @FhirFieldValidate(name="INPAT_ALLE_MARK",displayName="患者过敏史标志",maxLength=20,required=false,valuesRange="CV9900024")   
     private String inpatAlleMark;
    /**
     *名称:过敏史描述
     *
 	 *
 	 *
     */
     @Column(name="RRITABILITY",length = 200,nullable = true)
     @FhirFieldValidate(name="RRITABILITY",displayName="过敏史描述",maxLength=200,required=false,valuesRange="")   
     private String rritability;
    /**
     *名称:主诉
     *
 	 *
 	 *
     */
     @Column(name="CHIEF",columnDefinition="text")
     @FhirFieldValidate(name="CHIEF",displayName="主诉",required=false,valuesRange="")   
     private String chief;
    /**
     *名称:现病史
     *
 	 *
 	 *
     */
     @Column(name="ILLNESS",columnDefinition="text")
     @FhirFieldValidate(name="ILLNESS",displayName="现病史",required=false,valuesRange="")   
     private String illness;
    /**
     *名称:既往史
     *
 	 *
 	 *
     */
     @Column(name="HISTORY",columnDefinition="text")
     @FhirFieldValidate(name="HISTORY",displayName="既往史",required=false,valuesRange="")   
     private String history;
    /**
     *名称:体格检查
     *
 	 *
 	 *
     */
     @Column(name="PHY_CHECKUP",columnDefinition="text")
     @FhirFieldValidate(name="PHY_CHECKUP",displayName="体格检查",required=false,valuesRange="")   
     private String phyCheckup;
    /**
     *名称:辅助检查项目
     *
 	 *
 	 *
     */
     @Column(name="AUXILIARY_EXAMINATION_PROJECT",length = 200,nullable = true)
     @FhirFieldValidate(name="AUXILIARY_EXAMINATION_PROJECT",displayName="辅助检查项目",maxLength=200,required=false,valuesRange="")   
     private String auxiliaryExaminationProject;
    /**
     *名称:辅助检查结果
     *
 	 *
 	 *
     */
     @Column(name="AUXILIARY_EXAMINATION_RESULTS",length = 200,nullable = true)
     @FhirFieldValidate(name="AUXILIARY_EXAMINATION_RESULTS",displayName="辅助检查结果",maxLength=200,required=false,valuesRange="")   
     private String auxiliaryExaminationResults;
    /**
     *名称:初诊标志代码
     *
 	 *
 	 *
     */
     @Column(name="NEWLY_MARK",length = 20,nullable = true)
     @FhirFieldValidate(name="NEWLY_MARK",displayName="初诊标志代码",maxLength=20,required=false,valuesRange="")   
     private String newlyMark;
    /**
     *名称:中医"四诊"观察结果
     *
 	 *
 	 *
     */
     @Column(name="CN_FOUR_RESULT",length = 200,nullable = true)
     @FhirFieldValidate(name="CN_FOUR_RESULT",displayName="中医&quot;四诊&quot;观察结果",maxLength=200,required=false,valuesRange="")   
     private String cnFourResult;
    /**
     *名称:西医诊断编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="DIAGNOSTIC_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="DIAGNOSTIC_CODE",displayName="西医诊断编码",maxLength=20,required=false,valuesRange="CV990111")   
     private String diagnosticCode;
    /**
     *名称:西医诊断编码名称
     *
 	 *
 	 *
     */
     @Column(name="DIAGNOSTIC_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="DIAGNOSTIC_NAME",displayName="西医诊断编码名称",maxLength=40,required=false,valuesRange="")   
     private String diagnosticName;
    /**
     *名称:中医病名诊断代码
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="CN_DIS_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="CN_DIS_DIAG_CODE",displayName="中医病名诊断代码",maxLength=20,required=false,valuesRange="CV9900357")   
     private String cnDisDiagCode;
    /**
     *名称:中医病名诊断名称
     *
 	 *
 	 *
     */
     @Column(name="CN_DIS_DIAG_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="CN_DIS_DIAG_NAME",displayName="中医病名诊断名称",maxLength=40,required=false,valuesRange="")   
     private String cnDisDiagName;
    /**
     *名称:中医证候诊断代码
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="CN_SYM_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="CN_SYM_DIAG_CODE",displayName="中医证候诊断代码",maxLength=20,required=false,valuesRange="CV9900357")   
     private String cnSymDiagCode;
    /**
     *名称:中医证候诊断名称
     *
 	 *
 	 *
     */
     @Column(name="CN_SYM_DIAG_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="CN_SYM_DIAG_NAME",displayName="中医证候诊断名称",maxLength=40,required=false,valuesRange="")   
     private String cnSymDiagName;
    /**
     *名称:辨证依据
     *
 	 *
 	 *
     */
     @Column(name="DIALECT_PROOF",length = 1000,nullable = true)
     @FhirFieldValidate(name="DIALECT_PROOF",displayName="辨证依据",maxLength=1000,required=false,valuesRange="")   
     private String dialectProof;
    /**
     *名称:治则治法
     *
 	 *
 	 *
     */
     @Column(name="THERAPEUTIC_PRINCIPLES",length = 1000,nullable = true)
     @FhirFieldValidate(name="THERAPEUTIC_PRINCIPLES",displayName="治则治法",maxLength=1000,required=false,valuesRange="")   
     private String therapeuticPrinciples;
    /**
     *名称:医嘱类型代码
     *
 	 *限制:CV9900229
 	 *
     */
     @Column(name="ORDER_TYPE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="ORDER_TYPE_CODE",displayName="医嘱类型代码",maxLength=20,required=false,valuesRange="CV9900229")   
     private String orderTypeCode;
    /**
     *名称:医嘱计划开始日期时间
     *
 	 *
 	 *
     */
     @Column(name="ORDER_PLAN_ST_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="ORDER_PLAN_ST_DATE",displayName="医嘱计划开始日期时间",required=false,valuesRange="")   
     private Date orderPlanStDate;
    /**
     *名称:医嘱计划结束日期时间
     *
 	 *
 	 *
     */
     @Column(name="ORDER_PLAN_END_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="ORDER_PLAN_END_DATE",displayName="医嘱计划结束日期时间",required=false,valuesRange="")   
     private Date orderPlanEndDate;
    /**
     *名称:医嘱计划信息
     *
 	 *
 	 *
     */
     @Column(name="ORDER_PLAN_MSG",length = 200,nullable = true)
     @FhirFieldValidate(name="ORDER_PLAN_MSG",displayName="医嘱计划信息",maxLength=200,required=false,valuesRange="")   
     private String orderPlanMsg;
    /**
     *名称:执行时间
     *
 	 *
 	 *
     */
     @Column(name="PERFORM_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="PERFORM_TIME",displayName="执行时间",required=false,valuesRange="")   
     private Date performTime;
    /**
     *名称:执行科室
     *
 	 *
 	 *
     */
     @Column(name="PERFORM_DEPT",length = 40,nullable = true)
     @FhirFieldValidate(name="PERFORM_DEPT",displayName="执行科室",maxLength=40,required=false,valuesRange="")   
     private String performDept;
    /**
     *名称:执行医生
     *
 	 *
 	 *
     */
     @Column(name="PERFORMER_EMP",length = 40,nullable = true)
     @FhirFieldValidate(name="PERFORMER_EMP",displayName="执行医生",maxLength=40,required=false,valuesRange="")   
     private String performerEmp;
    /**
     *名称:开立科室
     *
 	 *
 	 *
     */
     @Column(name="ORDER_DP",length = 40,nullable = true)
     @FhirFieldValidate(name="ORDER_DP",displayName="开立科室",maxLength=40,required=false,valuesRange="")   
     private String orderDp;
    /**
     *名称:审核时间
     *
 	 *
 	 *
     */
     @Column(name="ORDER_AUDITOR_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="ORDER_AUDITOR_DATE",displayName="审核时间",required=false,valuesRange="")   
     private Date orderAuditorDate;
    /**
     *名称:审核人
     *
 	 *
 	 *
     */
     @Column(name="ORDER_AUDITOR",length = 40,nullable = true)
     @FhirFieldValidate(name="ORDER_AUDITOR",displayName="审核人",maxLength=40,required=false,valuesRange="")   
     private String orderAuditor;
    /**
     *名称:取消医嘱医生
     *
 	 *
 	 *
     */
     @Column(name="STOP_DOCTOR",length = 40,nullable = true)
     @FhirFieldValidate(name="STOP_DOCTOR",displayName="取消医嘱医生",maxLength=40,required=false,valuesRange="")   
     private String stopDoctor;
    /**
     *名称:开立时间
     *
 	 *
 	 *
     */
     @Column(name="DATEWRITTEN",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DATEWRITTEN",displayName="开立时间",required=false,valuesRange="")   
     private Date datewritten;
    /**
     *名称:开立医生
     *
 	 *
 	 *
     */
     @Column(name="PRESCRIBER",length = 40,nullable = true)
     @FhirFieldValidate(name="PRESCRIBER",displayName="开立医生",maxLength=40,required=false,valuesRange="")   
     private String prescriber;
    /**
     *名称:取消时间
     *
 	 *
 	 *
     */
     @Column(name="DATEENDED",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DATEENDED",displayName="取消时间",required=false,valuesRange="")   
     private Date dateended;
    /**
     *名称:医嘱备注信息
     *
 	 *
 	 *
     */
     @Column(name="NOTE",length = 200,nullable = true)
     @FhirFieldValidate(name="NOTE",displayName="医嘱备注信息",maxLength=200,required=false,valuesRange="")   
     private String note;
    /**
     *名称:医嘱正文
     *
 	 *
 	 *
     */
     @Column(name="TEXT",length = 500,nullable = true)
     @FhirFieldValidate(name="TEXT",displayName="医嘱正文",maxLength=500,required=false,valuesRange="")   
     private String text;
    /**
     *名称:医嘱开始时间
     *
 	 *
 	 *
     */
     @Column(name="BOUNDSPERIOD_START",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="BOUNDSPERIOD_START",displayName="医嘱开始时间",required=false,valuesRange="")   
     private Date boundsperiodStart;
    /**
     *名称:门诊流水号
     *
 	 *
 	 *
     */
     @Column(name="OUTPATIENT_REGISTRATION_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="OUTPATIENT_REGISTRATION_ID",displayName="门诊流水号",maxLength=40,required=false,valuesRange="")   
     private String outpatientRegistrationId;
    /**
     *名称:就诊时间
     *
 	 *
 	 *
     */
     @Column(name="VISITING_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="VISITING_TIME",displayName="就诊时间",required=false,valuesRange="")   
     private Date visitingTime;
    /**
     *名称:就诊科室id
     *
 	 *
 	 *
     */
     @Column(name="VISITING_DEPT_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="VISITING_DEPT_ID",displayName="就诊科室id",maxLength=40,required=false,valuesRange="")   
     private String visitingDeptId;
    /**
     *名称:就诊科室名称
     *
 	 *
 	 *
     */
     @Column(name="VISITING_DEPT_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="VISITING_DEPT_NAME",displayName="就诊科室名称",maxLength=40,required=false,valuesRange="")   
     private String visitingDeptName;
    /**
     *名称:就诊科室标准编码
     *
 	 *限制:CV9900051
 	 *
     */
     @Column(name="VISITING_DEPT_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="VISITING_DEPT_CD",displayName="就诊科室标准编码",maxLength=20,required=false,valuesRange="CV9900051")   
     private String visitingDeptCd;
    /**
     *名称:备注
     *
 	 *
 	 *
     */
     @Column(name="REMARKS",length = 100,nullable = true)
     @FhirFieldValidate(name="REMARKS",displayName="备注",maxLength=100,required=false,valuesRange="")   
     private String remarks;
    /**
     *名称:上传机构名称
     *备注:医疗机构在爱心医疗云平台中的唯一编码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getOutpatientMedicalRecordId(){
       	return this.outpatientMedicalRecordId;
     }
     public void setOutpatientMedicalRecordId(String outpatientMedicalRecordId){
       	this.outpatientMedicalRecordId=outpatientMedicalRecordId;
     }
     public Date getDate(){
       	return this.date;
     }
     public void setDate(Date date){
       	this.date=date;
     }
     public String getPatientId(){
       	return this.patientId;
     }
     public void setPatientId(String patientId){
       	this.patientId=patientId;
     }
     public String getIdCard(){
       	return this.idCard;
     }
     public void setIdCard(String idCard){
       	this.idCard=idCard;
     }
     public String getName(){
       	return this.name;
     }
     public void setName(String name){
       	this.name=name;
     }
     public String getGender(){
       	return this.gender;
     }
     public void setGender(String gender){
       	this.gender=gender;
     }
     public Date getBirthdate(){
       	return this.birthdate;
     }
     public void setBirthdate(Date birthdate){
       	this.birthdate=birthdate;
     }
     public String getResponsDocName(){
       	return this.responsDocName;
     }
     public void setResponsDocName(String responsDocName){
       	this.responsDocName=responsDocName;
     }
     public Float getAge(){
       	return this.age;
     }
     public void setAge(Float age){
       	this.age=age;
     }
     public String getAuthorId(){
       	return this.authorId;
     }
     public void setAuthorId(String authorId){
       	this.authorId=authorId;
     }
     public String getAuthorName(){
       	return this.authorName;
     }
     public void setAuthorName(String authorName){
       	this.authorName=authorName;
     }
     public String getInpatAlleMark(){
       	return this.inpatAlleMark;
     }
     public void setInpatAlleMark(String inpatAlleMark){
       	this.inpatAlleMark=inpatAlleMark;
     }
     public String getRritability(){
       	return this.rritability;
     }
     public void setRritability(String rritability){
       	this.rritability=rritability;
     }
     public String getChief(){
       	return this.chief;
     }
     public void setChief(String chief){
       	this.chief=chief;
     }
     public String getIllness(){
       	return this.illness;
     }
     public void setIllness(String illness){
       	this.illness=illness;
     }
     public String getHistory(){
       	return this.history;
     }
     public void setHistory(String history){
       	this.history=history;
     }
     public String getPhyCheckup(){
       	return this.phyCheckup;
     }
     public void setPhyCheckup(String phyCheckup){
       	this.phyCheckup=phyCheckup;
     }
     public String getAuxiliaryExaminationProject(){
       	return this.auxiliaryExaminationProject;
     }
     public void setAuxiliaryExaminationProject(String auxiliaryExaminationProject){
       	this.auxiliaryExaminationProject=auxiliaryExaminationProject;
     }
     public String getAuxiliaryExaminationResults(){
       	return this.auxiliaryExaminationResults;
     }
     public void setAuxiliaryExaminationResults(String auxiliaryExaminationResults){
       	this.auxiliaryExaminationResults=auxiliaryExaminationResults;
     }
     public String getNewlyMark(){
       	return this.newlyMark;
     }
     public void setNewlyMark(String newlyMark){
       	this.newlyMark=newlyMark;
     }
     public String getCnFourResult(){
       	return this.cnFourResult;
     }
     public void setCnFourResult(String cnFourResult){
       	this.cnFourResult=cnFourResult;
     }
     public String getDiagnosticCode(){
       	return this.diagnosticCode;
     }
     public void setDiagnosticCode(String diagnosticCode){
       	this.diagnosticCode=diagnosticCode;
     }
     public String getDiagnosticName(){
       	return this.diagnosticName;
     }
     public void setDiagnosticName(String diagnosticName){
       	this.diagnosticName=diagnosticName;
     }
     public String getCnDisDiagCode(){
       	return this.cnDisDiagCode;
     }
     public void setCnDisDiagCode(String cnDisDiagCode){
       	this.cnDisDiagCode=cnDisDiagCode;
     }
     public String getCnDisDiagName(){
       	return this.cnDisDiagName;
     }
     public void setCnDisDiagName(String cnDisDiagName){
       	this.cnDisDiagName=cnDisDiagName;
     }
     public String getCnSymDiagCode(){
       	return this.cnSymDiagCode;
     }
     public void setCnSymDiagCode(String cnSymDiagCode){
       	this.cnSymDiagCode=cnSymDiagCode;
     }
     public String getCnSymDiagName(){
       	return this.cnSymDiagName;
     }
     public void setCnSymDiagName(String cnSymDiagName){
       	this.cnSymDiagName=cnSymDiagName;
     }
     public String getDialectProof(){
       	return this.dialectProof;
     }
     public void setDialectProof(String dialectProof){
       	this.dialectProof=dialectProof;
     }
     public String getTherapeuticPrinciples(){
       	return this.therapeuticPrinciples;
     }
     public void setTherapeuticPrinciples(String therapeuticPrinciples){
       	this.therapeuticPrinciples=therapeuticPrinciples;
     }
     public String getOrderTypeCode(){
       	return this.orderTypeCode;
     }
     public void setOrderTypeCode(String orderTypeCode){
       	this.orderTypeCode=orderTypeCode;
     }
     public Date getOrderPlanStDate(){
       	return this.orderPlanStDate;
     }
     public void setOrderPlanStDate(Date orderPlanStDate){
       	this.orderPlanStDate=orderPlanStDate;
     }
     public Date getOrderPlanEndDate(){
       	return this.orderPlanEndDate;
     }
     public void setOrderPlanEndDate(Date orderPlanEndDate){
       	this.orderPlanEndDate=orderPlanEndDate;
     }
     public String getOrderPlanMsg(){
       	return this.orderPlanMsg;
     }
     public void setOrderPlanMsg(String orderPlanMsg){
       	this.orderPlanMsg=orderPlanMsg;
     }
     public Date getPerformTime(){
       	return this.performTime;
     }
     public void setPerformTime(Date performTime){
       	this.performTime=performTime;
     }
     public String getPerformDept(){
       	return this.performDept;
     }
     public void setPerformDept(String performDept){
       	this.performDept=performDept;
     }
     public String getPerformerEmp(){
       	return this.performerEmp;
     }
     public void setPerformerEmp(String performerEmp){
       	this.performerEmp=performerEmp;
     }
     public String getOrderDp(){
       	return this.orderDp;
     }
     public void setOrderDp(String orderDp){
       	this.orderDp=orderDp;
     }
     public Date getOrderAuditorDate(){
       	return this.orderAuditorDate;
     }
     public void setOrderAuditorDate(Date orderAuditorDate){
       	this.orderAuditorDate=orderAuditorDate;
     }
     public String getOrderAuditor(){
       	return this.orderAuditor;
     }
     public void setOrderAuditor(String orderAuditor){
       	this.orderAuditor=orderAuditor;
     }
     public String getStopDoctor(){
       	return this.stopDoctor;
     }
     public void setStopDoctor(String stopDoctor){
       	this.stopDoctor=stopDoctor;
     }
     public Date getDatewritten(){
       	return this.datewritten;
     }
     public void setDatewritten(Date datewritten){
       	this.datewritten=datewritten;
     }
     public String getPrescriber(){
       	return this.prescriber;
     }
     public void setPrescriber(String prescriber){
       	this.prescriber=prescriber;
     }
     public Date getDateended(){
       	return this.dateended;
     }
     public void setDateended(Date dateended){
       	this.dateended=dateended;
     }
     public String getNote(){
       	return this.note;
     }
     public void setNote(String note){
       	this.note=note;
     }
     public String getText(){
       	return this.text;
     }
     public void setText(String text){
       	this.text=text;
     }
     public Date getBoundsperiodStart(){
       	return this.boundsperiodStart;
     }
     public void setBoundsperiodStart(Date boundsperiodStart){
       	this.boundsperiodStart=boundsperiodStart;
     }
     public String getOutpatientRegistrationId(){
       	return this.outpatientRegistrationId;
     }
     public void setOutpatientRegistrationId(String outpatientRegistrationId){
       	this.outpatientRegistrationId=outpatientRegistrationId;
     }
     public Date getVisitingTime(){
       	return this.visitingTime;
     }
     public void setVisitingTime(Date visitingTime){
       	this.visitingTime=visitingTime;
     }
     public String getVisitingDeptId(){
       	return this.visitingDeptId;
     }
     public void setVisitingDeptId(String visitingDeptId){
       	this.visitingDeptId=visitingDeptId;
     }
     public String getVisitingDeptName(){
       	return this.visitingDeptName;
     }
     public void setVisitingDeptName(String visitingDeptName){
       	this.visitingDeptName=visitingDeptName;
     }
     public String getVisitingDeptCd(){
       	return this.visitingDeptCd;
     }
     public void setVisitingDeptCd(String visitingDeptCd){
       	this.visitingDeptCd=visitingDeptCd;
     }
     public String getRemarks(){
       	return this.remarks;
     }
     public void setRemarks(String remarks){
       	this.remarks=remarks;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}