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
@Table(name = BaseEntity.TABLE_PREFIX + "TEMPORARY_ADVICE")
public class TemporaryAdvice extends FhirResourceEntity {

    /**
     *名称:住院流水号
     *备注:引用住院接诊表T_INPATIENT_REGISTRATION院内住院流水号INPATIENT_REGISTRATION_ID
 	 *
 	 *
     */
     @Column(name="INPATIENT_REGISTRATION_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="INPATIENT_REGISTRATION_ID",displayName="住院流水号",maxLength=40,required=true,valuesRange="")   
     private String inpatientRegistrationId;
    /**
     *名称:医嘱序号
     *
 	 *
 	 *主键字段
     */
     @Column(name="ADVICE_SEQUENCE",length = 40,nullable = false)
     @FhirFieldValidate(name="ADVICE_SEQUENCE",displayName="医嘱序号",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String adviceSequence;
    /**
     *名称:医嘱子序号
     *
 	 *
 	 *主键字段
     */
     @Column(name="ADVICE_SUB_SEQUENCE",length = 40,nullable = false)
     @FhirFieldValidate(name="ADVICE_SUB_SEQUENCE",displayName="医嘱子序号",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String adviceSubSequence;
    /**
     *名称:状态
     *
 	 *限制:CUS00008
 	 *
     */
     @Column(name="STATUS",length = 20,nullable = true)
     @FhirFieldValidate(name="STATUS",displayName="状态",maxLength=20,required=false,valuesRange="CUS00008")   
     private String status;
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
     *名称:开立医生ID
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="PRESCRIBER",length = 40,nullable = true)
     @FhirFieldValidate(name="PRESCRIBER",displayName="开立医生ID",maxLength=40,required=false,valuesRange="")   
     private String prescriber;
    /**
     *名称:开立科室
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
 	 *
     */
     @Column(name="ORDER_DPID",length = 40,nullable = true)
     @FhirFieldValidate(name="ORDER_DPID",displayName="开立科室",maxLength=40,required=false,valuesRange="")   
     private String orderDpid;
    /**
     *名称:停止时间
     *
 	 *
 	 *
     */
     @Column(name="DATEENDED",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DATEENDED",displayName="停止时间",required=false,valuesRange="")   
     private Date dateended;
    /**
     *名称:停止医生
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="STOP_DOCTORID",length = 40,nullable = true)
     @FhirFieldValidate(name="STOP_DOCTORID",displayName="停止医生",maxLength=40,required=false,valuesRange="")   
     private String stopDoctorid;
    /**
     *名称:校对时间
     *
 	 *
 	 *
     */
     @Column(name="CHECK_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="CHECK_DATE",displayName="校对时间",required=false,valuesRange="")   
     private Date checkDate;
    /**
     *名称:校对护士
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="CHECK_NURID",length = 40,nullable = true)
     @FhirFieldValidate(name="CHECK_NURID",displayName="校对护士",maxLength=40,required=false,valuesRange="")   
     private String checkNurid;
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
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="ORDER_AUDITOR",length = 40,nullable = true)
     @FhirFieldValidate(name="ORDER_AUDITOR",displayName="审核人",maxLength=40,required=false,valuesRange="")   
     private String orderAuditor;
    /**
     *名称:医嘱核对日期时间
     *
 	 *
 	 *
     */
     @Column(name="ORDER_CHECK_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="ORDER_CHECK_TIME",displayName="医嘱核对日期时间",required=false,valuesRange="")   
     private Date orderCheckTime;
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
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
 	 *
     */
     @Column(name="PERFORM_DEPT_CD",length = 40,nullable = true)
     @FhirFieldValidate(name="PERFORM_DEPT_CD",displayName="执行科室",maxLength=40,required=false,valuesRange="")   
     private String performDeptCd;
    /**
     *名称:执行医生
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="PERFORMER_CD",length = 40,nullable = true)
     @FhirFieldValidate(name="PERFORMER_CD",displayName="执行医生",maxLength=40,required=false,valuesRange="")   
     private String performerCd;
    /**
     *名称:医嘱正文
     *
 	 *
 	 *
     */
     @Column(name="TEXT",length = 200,nullable = true)
     @FhirFieldValidate(name="TEXT",displayName="医嘱正文",maxLength=200,required=false,valuesRange="")   
     private String text;
    /**
     *名称:备注
     *
 	 *
 	 *
     */
     @Column(name="NOTE",length = 500,nullable = true)
     @FhirFieldValidate(name="NOTE",displayName="备注",maxLength=500,required=false,valuesRange="")   
     private String note;
    /**
     *名称:医嘱开始时间
     *
 	 *
 	 *
     */
     @Column(name="START",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="START",displayName="医嘱开始时间",required=false,valuesRange="")   
     private Date start;
    /**
     *名称:用药停止日期时间
     *
 	 *
 	 *
     */
     @Column(name="END",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="END",displayName="用药停止日期时间",required=false,valuesRange="")   
     private Date end;
    /**
     *名称:执行天数
     *
 	 *
 	 *
     */
     @Column(name="DURATION",length = 8,nullable = true)
     @FhirFieldValidate(name="DURATION",displayName="执行天数",maxLength=8,required=false,valuesRange="")   
     private Float duration;
    /**
     *名称:用药途径代码
     *
 	 *限制:CV0600102
 	 *
     */
     @Column(name="DOSAGE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="DOSAGE_CODE",displayName="用药途径代码",maxLength=20,required=false,valuesRange="CV0600102")   
     private String dosageCode;
    /**
     *名称:特殊用法代码
     *
 	 *限制:CV9900285
 	 *
     */
     @Column(name="C_MED_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="C_MED_CODE",displayName="特殊用法代码",maxLength=20,required=false,valuesRange="CV9900285")   
     private String cMedCode;
    /**
     *名称:用药次剂量
     *
 	 *
 	 *
     */
     @Column(name="ONCE_VALUE",length = 8,nullable = true)
     @FhirFieldValidate(name="ONCE_VALUE",displayName="用药次剂量",maxLength=8,required=false,valuesRange="")   
     private Float onceValue;
    /**
     *名称:用药次剂量单位
     *
 	 *
 	 *
     */
     @Column(name="ONCE_UNIT",length = 20,nullable = true)
     @FhirFieldValidate(name="ONCE_UNIT",displayName="用药次剂量单位",maxLength=20,required=false,valuesRange="")   
     private String onceUnit;
    /**
     *名称:用药总剂量
     *
 	 *
 	 *
     */
     @Column(name="DRUG_TOTAL_DOSE",length = 8,nullable = true)
     @FhirFieldValidate(name="DRUG_TOTAL_DOSE",displayName="用药总剂量",maxLength=8,required=false,valuesRange="")   
     private Float drugTotalDose;
    /**
     *名称:用药总剂量单位
     *
 	 *
 	 *
     */
     @Column(name="DRUG_TOTAL_DOSE_UTIL",length = 20,nullable = true)
     @FhirFieldValidate(name="DRUG_TOTAL_DOSE_UTIL",displayName="用药总剂量单位",maxLength=20,required=false,valuesRange="")   
     private String drugTotalDoseUtil;
    /**
     *名称:医疗付费方式代码
     *
 	 *限制:CV9900376
 	 *
     */
     @Column(name="FEE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="FEE_CODE",displayName="医疗付费方式代码",maxLength=20,required=false,valuesRange="CV9900376")   
     private String feeCode;
    /**
     *名称:医嘱类型代码
     *
 	 *限制:CV9900229
 	 *
     */
     @Column(name="ORDER_TYPE_CODE",length = 20,nullable = false)
     @FhirFieldValidate(name="ORDER_TYPE_CODE",displayName="医嘱类型代码",maxLength=20,required=true,valuesRange="CV9900229")   
     private String orderTypeCode;
    /**
     *名称:是否需要皮试
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="ST_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="ST_MARK",displayName="是否需要皮试",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean stMark;
    /**
     *名称:皮试类型标志
     *
 	 *限制:CV9900287
 	 *
     */
     @Column(name="SKINTEST_TYPE",length = 20,nullable = true)
     @FhirFieldValidate(name="SKINTEST_TYPE",displayName="皮试类型标志",maxLength=20,required=false,valuesRange="CV9900287")   
     private String skintestType;
    /**
     *名称:皮试结果
     *
 	 *
 	 *
     */
     @Column(name="SKINTEST_RESULT",length = 100,nullable = true)
     @FhirFieldValidate(name="SKINTEST_RESULT",displayName="皮试结果",maxLength=100,required=false,valuesRange="")   
     private String skintestResult;
    /**
     *名称:皮试护士
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="SKINTEST_NURID",length = 40,nullable = true)
     @FhirFieldValidate(name="SKINTEST_NURID",displayName="皮试护士",maxLength=40,required=false,valuesRange="")   
     private String skintestNurid;
    /**
     *名称:第二皮试护士
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="SKINTEST_SENURID",length = 40,nullable = true)
     @FhirFieldValidate(name="SKINTEST_SENURID",displayName="第二皮试护士",maxLength=40,required=false,valuesRange="")   
     private String skintestSenurid;
    /**
     *名称:项目规格
     *
 	 *
 	 *
     */
     @Column(name="ITEM_SPEC",length = 40,nullable = true)
     @FhirFieldValidate(name="ITEM_SPEC",displayName="项目规格",maxLength=40,required=false,valuesRange="")   
     private String itemSpec;
    /**
     *名称:医嘱项目
     *备注:引用药品信息表T_MEDICATION院内药品编码或引用收费项目信息表T_CHARGING_ITEM院内收费项目编码
 	 *
 	 *
     */
     @Column(name="PRESCRIPTION_ITEM_CODE",length = 40,nullable = true)
     @FhirFieldValidate(name="PRESCRIPTION_ITEM_CODE",displayName="医嘱项目",maxLength=40,required=false,valuesRange="")   
     private String prescriptionItemCode;
    /**
     *名称:数量
     *
 	 *
 	 *
     */
     @Column(name="ITEM_NUMBER",length = 8,nullable = true)
     @FhirFieldValidate(name="ITEM_NUMBER",displayName="数量",maxLength=8,required=false,valuesRange="")   
     private Float itemNumber;
    /**
     *名称:项目单位
     *
 	 *
 	 *
     */
     @Column(name="ITEM_UNIT",length = 20,nullable = true)
     @FhirFieldValidate(name="ITEM_UNIT",displayName="项目单位",maxLength=20,required=false,valuesRange="")   
     private String itemUnit;
    /**
     *名称:金额
     *
 	 *
 	 *
     */
     @Column(name="ITEM_AMOUNT",length = 8,nullable = true)
     @FhirFieldValidate(name="ITEM_AMOUNT",displayName="金额",maxLength=8,required=false,valuesRange="")   
     private Float itemAmount;
    /**
     *名称:单价
     *
 	 *
 	 *
     */
     @Column(name="ITEM_PRICE",length = 8,nullable = true)
     @FhirFieldValidate(name="ITEM_PRICE",displayName="单价",maxLength=8,required=false,valuesRange="")   
     private Float itemPrice;
    /**
     *名称:发药时间
     *
 	 *
 	 *
     */
     @Column(name="DISPENSING_DTIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DISPENSING_DTIME",displayName="发药时间",required=false,valuesRange="")   
     private Date dispensingDtime;
    /**
     *名称:成组号
     *备注:患者用药时，某些药物是一组,药物搭配用
 	 *
 	 *
     */
     @Column(name="GROUP_NO",length = 40,nullable = true)
     @FhirFieldValidate(name="GROUP_NO",displayName="成组号",maxLength=40,required=false,valuesRange="")   
     private String groupNo;
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
    
     public String getInpatientRegistrationId(){
       	return this.inpatientRegistrationId;
     }
     public void setInpatientRegistrationId(String inpatientRegistrationId){
       	this.inpatientRegistrationId=inpatientRegistrationId;
     }
     public String getAdviceSequence(){
       	return this.adviceSequence;
     }
     public void setAdviceSequence(String adviceSequence){
       	this.adviceSequence=adviceSequence;
     }
     public String getAdviceSubSequence(){
       	return this.adviceSubSequence;
     }
     public void setAdviceSubSequence(String adviceSubSequence){
       	this.adviceSubSequence=adviceSubSequence;
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
     public String getPatientName(){
       	return this.patientName;
     }
     public void setPatientName(String patientName){
       	this.patientName=patientName;
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
     public String getOrderDpid(){
       	return this.orderDpid;
     }
     public void setOrderDpid(String orderDpid){
       	this.orderDpid=orderDpid;
     }
     public Date getDateended(){
       	return this.dateended;
     }
     public void setDateended(Date dateended){
       	this.dateended=dateended;
     }
     public String getStopDoctorid(){
       	return this.stopDoctorid;
     }
     public void setStopDoctorid(String stopDoctorid){
       	this.stopDoctorid=stopDoctorid;
     }
     public Date getCheckDate(){
       	return this.checkDate;
     }
     public void setCheckDate(Date checkDate){
       	this.checkDate=checkDate;
     }
     public String getCheckNurid(){
       	return this.checkNurid;
     }
     public void setCheckNurid(String checkNurid){
       	this.checkNurid=checkNurid;
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
     public Date getOrderCheckTime(){
       	return this.orderCheckTime;
     }
     public void setOrderCheckTime(Date orderCheckTime){
       	this.orderCheckTime=orderCheckTime;
     }
     public Date getPerformTime(){
       	return this.performTime;
     }
     public void setPerformTime(Date performTime){
       	this.performTime=performTime;
     }
     public String getPerformDeptCd(){
       	return this.performDeptCd;
     }
     public void setPerformDeptCd(String performDeptCd){
       	this.performDeptCd=performDeptCd;
     }
     public String getPerformerCd(){
       	return this.performerCd;
     }
     public void setPerformerCd(String performerCd){
       	this.performerCd=performerCd;
     }
     public String getText(){
       	return this.text;
     }
     public void setText(String text){
       	this.text=text;
     }
     public String getNote(){
       	return this.note;
     }
     public void setNote(String note){
       	this.note=note;
     }
     public Date getStart(){
       	return this.start;
     }
     public void setStart(Date start){
       	this.start=start;
     }
     public Date getEnd(){
       	return this.end;
     }
     public void setEnd(Date end){
       	this.end=end;
     }
     public Float getDuration(){
       	return this.duration;
     }
     public void setDuration(Float duration){
       	this.duration=duration;
     }
     public String getDosageCode(){
       	return this.dosageCode;
     }
     public void setDosageCode(String dosageCode){
       	this.dosageCode=dosageCode;
     }
     public String getcMedCode(){
       	return this.cMedCode;
     }
     public void setcMedCode(String cMedCode){
       	this.cMedCode=cMedCode;
     }
     public Float getOnceValue(){
       	return this.onceValue;
     }
     public void setOnceValue(Float onceValue){
       	this.onceValue=onceValue;
     }
     public String getOnceUnit(){
       	return this.onceUnit;
     }
     public void setOnceUnit(String onceUnit){
       	this.onceUnit=onceUnit;
     }
     public Float getDrugTotalDose(){
       	return this.drugTotalDose;
     }
     public void setDrugTotalDose(Float drugTotalDose){
       	this.drugTotalDose=drugTotalDose;
     }
     public String getDrugTotalDoseUtil(){
       	return this.drugTotalDoseUtil;
     }
     public void setDrugTotalDoseUtil(String drugTotalDoseUtil){
       	this.drugTotalDoseUtil=drugTotalDoseUtil;
     }
     public String getFeeCode(){
       	return this.feeCode;
     }
     public void setFeeCode(String feeCode){
       	this.feeCode=feeCode;
     }
     public String getOrderTypeCode(){
       	return this.orderTypeCode;
     }
     public void setOrderTypeCode(String orderTypeCode){
       	this.orderTypeCode=orderTypeCode;
     }
     public Boolean getStMark(){
       	return this.stMark;
     }
     public void setStMark(Boolean stMark){
       	this.stMark=stMark;
     }
     public String getSkintestType(){
       	return this.skintestType;
     }
     public void setSkintestType(String skintestType){
       	this.skintestType=skintestType;
     }
     public String getSkintestResult(){
       	return this.skintestResult;
     }
     public void setSkintestResult(String skintestResult){
       	this.skintestResult=skintestResult;
     }
     public String getSkintestNurid(){
       	return this.skintestNurid;
     }
     public void setSkintestNurid(String skintestNurid){
       	this.skintestNurid=skintestNurid;
     }
     public String getSkintestSenurid(){
       	return this.skintestSenurid;
     }
     public void setSkintestSenurid(String skintestSenurid){
       	this.skintestSenurid=skintestSenurid;
     }
     public String getItemSpec(){
       	return this.itemSpec;
     }
     public void setItemSpec(String itemSpec){
       	this.itemSpec=itemSpec;
     }
     public String getPrescriptionItemCode(){
       	return this.prescriptionItemCode;
     }
     public void setPrescriptionItemCode(String prescriptionItemCode){
       	this.prescriptionItemCode=prescriptionItemCode;
     }
     public Float getItemNumber(){
       	return this.itemNumber;
     }
     public void setItemNumber(Float itemNumber){
       	this.itemNumber=itemNumber;
     }
     public String getItemUnit(){
       	return this.itemUnit;
     }
     public void setItemUnit(String itemUnit){
       	this.itemUnit=itemUnit;
     }
     public Float getItemAmount(){
       	return this.itemAmount;
     }
     public void setItemAmount(Float itemAmount){
       	this.itemAmount=itemAmount;
     }
     public Float getItemPrice(){
       	return this.itemPrice;
     }
     public void setItemPrice(Float itemPrice){
       	this.itemPrice=itemPrice;
     }
     public Date getDispensingDtime(){
       	return this.dispensingDtime;
     }
     public void setDispensingDtime(Date dispensingDtime){
       	this.dispensingDtime=dispensingDtime;
     }
     public String getGroupNo(){
       	return this.groupNo;
     }
     public void setGroupNo(String groupNo){
       	this.groupNo=groupNo;
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
}