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
@Table(name = BaseEntity.TABLE_PREFIX + "OUTPATIENT_PRESCRIPTION")
public class OutpatientPrescription extends FhirResourceEntity {

    /**
     *名称:院内处方号
     *备注:门诊处方在院内系统中的唯一标识
 	 *
 	 *主键字段
     */
     @Column(name="OUTPATIENT_PRESCRIPTION_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="OUTPATIENT_PRESCRIPTION_ID",displayName="院内处方号",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String outpatientPrescriptionId;
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
     *名称:门诊流水号
     *备注:引用门诊接诊表T_OUTPATIENT_REGISTRATION院内门诊流水号
 	 *
 	 *
     */
     @Column(name="OUTPATIENT_REGISTRATION_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="OUTPATIENT_REGISTRATION_ID",displayName="门诊流水号",maxLength=40,required=true,valuesRange="")   
     private String outpatientRegistrationId;
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
     @Column(name="DATEWRITTEN",nullable = false)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DATEWRITTEN",displayName="开立时间",required=true,valuesRange="")   
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
     *名称:取消日期时间
     *
 	 *
 	 *
     */
     @Column(name="DATEENDED",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DATEENDED",displayName="取消日期时间",required=false,valuesRange="")   
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
     *名称:备注
     *
 	 *
 	 *
     */
     @Column(name="NOTE",length = 500,nullable = true)
     @FhirFieldValidate(name="NOTE",displayName="备注",maxLength=500,required=false,valuesRange="")   
     private String note;
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
     *名称:处方类型代码
     *
 	 *限制:CV9900264
 	 *
     */
     @Column(name="RECIPE_TYPE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="RECIPE_TYPE_CODE",displayName="处方类型代码",maxLength=20,required=false,valuesRange="CV9900264")   
     private String recipeTypeCode;
    /**
     *名称:申请单号
     *
 	 *
 	 *
     */
     @Column(name="APPLY_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="APPLY_ID",displayName="申请单号",maxLength=40,required=false,valuesRange="")   
     private String applyId;
    /**
     *名称:中药剂数
     *
 	 *
 	 *
     */
     @Column(name="C_MED_NUM",length = 8,nullable = true)
     @FhirFieldValidate(name="C_MED_NUM",displayName="中药剂数",maxLength=8,required=false,valuesRange="")   
     private Integer cMedNum;
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
     *名称:中药处方
     *备注:中药饮片处方的详细描述
 	 *
 	 *
     */
     @Column(name="CN_PRESCRIBE",length = 100,nullable = true)
     @FhirFieldValidate(name="CN_PRESCRIBE",displayName="中药处方",maxLength=100,required=false,valuesRange="")   
     private String cnPrescribe;
    /**
     *名称:中药煎煮法
     *备注:中药饮片煎煮方法描述
 	 *
 	 *
     */
     @Column(name="CN_PRESCRIBE_DESCR",length = 100,nullable = true)
     @FhirFieldValidate(name="CN_PRESCRIBE_DESCR",displayName="中药煎煮法",maxLength=100,required=false,valuesRange="")   
     private String cnPrescribeDescr;
    /**
     *名称:中药服用方法代码
     *
 	 *限制:CV9900304
 	 *
     */
     @Column(name="CN_DRUG_WAY_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="CN_DRUG_WAY_CD",displayName="中药服用方法代码",maxLength=20,required=false,valuesRange="CV9900304")   
     private String cnDrugWayCd;
    /**
     *名称:中药剂型
     *
 	 *限制:CV9900389
 	 *
     */
     @Column(name="CN_TYPE_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="CN_TYPE_CD",displayName="中药剂型",maxLength=20,required=false,valuesRange="CV9900389")   
     private String cnTypeCd;
    /**
     *名称:是否代办
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_AGENCY",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_AGENCY",displayName="是否代办",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifAgency;
    /**
     *名称:是否打印
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_PRINT",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_PRINT",displayName="是否打印",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifPrint;
    /**
     *名称:是否收费
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_CHANGE",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_CHANGE",displayName="是否收费",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifChange;
    /**
     *名称:代办人关系代码
     *
 	 *限制:GBT4761
 	 *
     */
     @Column(name="AGENCY_REL_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="AGENCY_REL_CODE",displayName="代办人关系代码",maxLength=20,required=false,valuesRange="GBT4761")   
     private String agencyRelCode;
    /**
     *名称:代办人身份证号
     *
 	 *
 	 *
     */
     @Column(name="ID_CARD",length = 40,nullable = true)
     @FhirFieldValidate(name="ID_CARD",displayName="代办人身份证号",maxLength=40,required=false,valuesRange="")   
     private String idCard;
    /**
     *名称:调配者ID
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="ALLOCATE_PSID",length = 40,nullable = true)
     @FhirFieldValidate(name="ALLOCATE_PSID",displayName="调配者ID",maxLength=40,required=false,valuesRange="")   
     private String allocatePsid;
    /**
     *名称:发药者ID
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="DRUG_PSID",length = 40,nullable = true)
     @FhirFieldValidate(name="DRUG_PSID",displayName="发药者ID",maxLength=40,required=false,valuesRange="")   
     private String drugPsid;
    /**
     *名称:审核药剂师ID
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="PREC_AUDIT_PSID",length = 40,nullable = true)
     @FhirFieldValidate(name="PREC_AUDIT_PSID",displayName="审核药剂师ID",maxLength=40,required=false,valuesRange="")   
     private String precAuditPsid;
    /**
     *名称:核对药剂师ID
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="PREC_CHECK_PSID",length = 40,nullable = true)
     @FhirFieldValidate(name="PREC_CHECK_PSID",displayName="核对药剂师ID",maxLength=40,required=false,valuesRange="")   
     private String precCheckPsid;
    /**
     *名称:执行科室ID
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
 	 *
     */
     @Column(name="PERFORM_DEPT",length = 40,nullable = true)
     @FhirFieldValidate(name="PERFORM_DEPT",displayName="执行科室ID",maxLength=40,required=false,valuesRange="")   
     private String performDept;
    /**
     *名称:执行人ID
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="PREC_PERFORM",length = 40,nullable = true)
     @FhirFieldValidate(name="PREC_PERFORM",displayName="执行人ID",maxLength=40,required=false,valuesRange="")   
     private String precPerform;
    /**
     *名称:处方总金额
     *
 	 *
 	 *
     */
     @Column(name="TOTAL_AMOUNT",length = 8,nullable = true)
     @FhirFieldValidate(name="TOTAL_AMOUNT",displayName="处方总金额",maxLength=8,required=false,valuesRange="")   
     private Float totalAmount;
     @javax.persistence.OrderBy("upTime DESC")
     @OneToMany(mappedBy="outpatientPrescription",cascade=CascadeType.ALL,fetch=javax.persistence.FetchType.EAGER)
     @org.hibernate.annotations.Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
     private List<OutpatientPrescriptionDetail> outpatientPrescriptionDetails;
    
     public String getOutpatientPrescriptionId(){
       	return this.outpatientPrescriptionId;
     }
     public void setOutpatientPrescriptionId(String outpatientPrescriptionId){
       	this.outpatientPrescriptionId=outpatientPrescriptionId;
     }
     public String getStatus(){
       	return this.status;
     }
     public void setStatus(String status){
       	this.status=status;
     }
     public String getOutpatientRegistrationId(){
       	return this.outpatientRegistrationId;
     }
     public void setOutpatientRegistrationId(String outpatientRegistrationId){
       	this.outpatientRegistrationId=outpatientRegistrationId;
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
     public String getNote(){
       	return this.note;
     }
     public void setNote(String note){
       	this.note=note;
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
     public String getRecipeTypeCode(){
       	return this.recipeTypeCode;
     }
     public void setRecipeTypeCode(String recipeTypeCode){
       	this.recipeTypeCode=recipeTypeCode;
     }
     public String getApplyId(){
       	return this.applyId;
     }
     public void setApplyId(String applyId){
       	this.applyId=applyId;
     }
     public Integer getcMedNum(){
       	return this.cMedNum;
     }
     public void setcMedNum(Integer cMedNum){
       	this.cMedNum=cMedNum;
     }
     public Date getDispensingDtime(){
       	return this.dispensingDtime;
     }
     public void setDispensingDtime(Date dispensingDtime){
       	this.dispensingDtime=dispensingDtime;
     }
     public String getCnPrescribe(){
       	return this.cnPrescribe;
     }
     public void setCnPrescribe(String cnPrescribe){
       	this.cnPrescribe=cnPrescribe;
     }
     public String getCnPrescribeDescr(){
       	return this.cnPrescribeDescr;
     }
     public void setCnPrescribeDescr(String cnPrescribeDescr){
       	this.cnPrescribeDescr=cnPrescribeDescr;
     }
     public String getCnDrugWayCd(){
       	return this.cnDrugWayCd;
     }
     public void setCnDrugWayCd(String cnDrugWayCd){
       	this.cnDrugWayCd=cnDrugWayCd;
     }
     public String getCnTypeCd(){
       	return this.cnTypeCd;
     }
     public void setCnTypeCd(String cnTypeCd){
       	this.cnTypeCd=cnTypeCd;
     }
     public Boolean getIfAgency(){
       	return this.ifAgency;
     }
     public void setIfAgency(Boolean ifAgency){
       	this.ifAgency=ifAgency;
     }
     public Boolean getIfPrint(){
       	return this.ifPrint;
     }
     public void setIfPrint(Boolean ifPrint){
       	this.ifPrint=ifPrint;
     }
     public Boolean getIfChange(){
       	return this.ifChange;
     }
     public void setIfChange(Boolean ifChange){
       	this.ifChange=ifChange;
     }
     public String getAgencyRelCode(){
       	return this.agencyRelCode;
     }
     public void setAgencyRelCode(String agencyRelCode){
       	this.agencyRelCode=agencyRelCode;
     }
     public String getIdCard(){
       	return this.idCard;
     }
     public void setIdCard(String idCard){
       	this.idCard=idCard;
     }
     public String getAllocatePsid(){
       	return this.allocatePsid;
     }
     public void setAllocatePsid(String allocatePsid){
       	this.allocatePsid=allocatePsid;
     }
     public String getDrugPsid(){
       	return this.drugPsid;
     }
     public void setDrugPsid(String drugPsid){
       	this.drugPsid=drugPsid;
     }
     public String getPrecAuditPsid(){
       	return this.precAuditPsid;
     }
     public void setPrecAuditPsid(String precAuditPsid){
       	this.precAuditPsid=precAuditPsid;
     }
     public String getPrecCheckPsid(){
       	return this.precCheckPsid;
     }
     public void setPrecCheckPsid(String precCheckPsid){
       	this.precCheckPsid=precCheckPsid;
     }
     public String getPerformDept(){
       	return this.performDept;
     }
     public void setPerformDept(String performDept){
       	this.performDept=performDept;
     }
     public String getPrecPerform(){
       	return this.precPerform;
     }
     public void setPrecPerform(String precPerform){
       	this.precPerform=precPerform;
     }
     public Float getTotalAmount(){
       	return this.totalAmount;
     }
     public void setTotalAmount(Float totalAmount){
       	this.totalAmount=totalAmount;
     }
     public List<OutpatientPrescriptionDetail> getOutpatientPrescriptionDetails(){
       	return this.outpatientPrescriptionDetails;
    }
     public void setOutpatientPrescriptionDetails(List<OutpatientPrescriptionDetail> outpatientPrescriptionDetails){
        this.outpatientPrescriptionDetails=outpatientPrescriptionDetails;
    }
}