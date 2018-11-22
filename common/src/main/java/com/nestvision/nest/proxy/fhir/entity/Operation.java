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
@Table(name = BaseEntity.TABLE_PREFIX + "OPERATION")
public class Operation extends FhirResourceEntity {

    /**
     *名称:院内手术记录id
     *备注:手术记录在院内系统中的唯一标识
 	 *
 	 *主键字段
     */
     @Column(name="OPERATION_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="OPERATION_ID",displayName="院内手术记录id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String operationId;
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
     *名称:状态
     *
 	 *限制:CUS00015
 	 *
     */
     @Column(name="STATUS",length = 20,nullable = false)
     @FhirFieldValidate(name="STATUS",displayName="状态",maxLength=20,required=true,valuesRange="CUS00015")   
     private String status;
    /**
     *名称:麻醉方法代码
     *
 	 *限制:CV0600103
 	 *
     */
     @Column(name="ANESTHESIA_METHOD_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="ANESTHESIA_METHOD_CD",displayName="麻醉方法代码",maxLength=20,required=false,valuesRange="CV0600103")   
     private String anesthesiaMethodCd;
    /**
     *名称:麻醉方法名称
     *
 	 *
 	 *
     */
     @Column(name="ANESTHESIA_METHOD_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="ANESTHESIA_METHOD_NAME",displayName="麻醉方法名称",maxLength=40,required=false,valuesRange="")   
     private String anesthesiaMethodName;
    /**
     *名称:手术编码
     *
 	 *限制:CV990113
 	 *
     */
     @Column(name="OPERATION_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="OPERATION_CD",displayName="手术编码",maxLength=20,required=false,valuesRange="CV990113")   
     private String operationCd;
    /**
     *名称:手术名称
     *
 	 *
 	 *
     */
     @Column(name="OPERATION_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="OPERATION_NAME",displayName="手术名称",maxLength=40,required=false,valuesRange="")   
     private String operationName;
    /**
     *名称:手术操作体位代码
     *
 	 *限制:CV9900041
 	 *
     */
     @Column(name="OPERATING_POSITION",length = 20,nullable = true)
     @FhirFieldValidate(name="OPERATING_POSITION",displayName="手术操作体位代码",maxLength=20,required=false,valuesRange="CV9900041")   
     private String operatingPosition;
    /**
     *名称:手术操作体位名称
     *
 	 *限制:CV9900041
 	 *
     */
     @Column(name="OPERATING_POSITION_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="OPERATING_POSITION_NAME",displayName="手术操作体位名称",maxLength=20,required=false,valuesRange="CV9900041")   
     private String operatingPositionName;
    /**
     *名称:手术操作目标部位代码
     *
 	 *限制:CV0600227
 	 *
     */
     @Column(name="PART_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="PART_CODE",displayName="手术操作目标部位代码",maxLength=20,required=false,valuesRange="CV0600227")   
     private String partCode;
    /**
     *名称:手术操作目标部位名称
     *
 	 *限制:CV0600227
 	 *
     */
     @Column(name="PART_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="PART_NAME",displayName="手术操作目标部位名称",maxLength=20,required=false,valuesRange="CV0600227")   
     private String partName;
    /**
     *名称:病案管理者id
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="MEDICAL_RECORD_MANAGER",length = 40,nullable = true)
     @FhirFieldValidate(name="MEDICAL_RECORD_MANAGER",displayName="病案管理者id",maxLength=40,required=false,valuesRange="")   
     private String medicalRecordManager;
    /**
     *名称:器材管理者id
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="EQUIPMENT_MANAGER",length = 40,nullable = true)
     @FhirFieldValidate(name="EQUIPMENT_MANAGER",displayName="器材管理者id",maxLength=40,required=false,valuesRange="")   
     private String equipmentManager;
    /**
     *名称:巡台护士id
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="PATROL_NURSE",length = 40,nullable = true)
     @FhirFieldValidate(name="PATROL_NURSE",displayName="巡台护士id",maxLength=40,required=false,valuesRange="")   
     private String patrolNurse;
    /**
     *名称:手术者id
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="OPERATIVE",length = 40,nullable = true)
     @FhirFieldValidate(name="OPERATIVE",displayName="手术者id",maxLength=40,required=false,valuesRange="")   
     private String operative;
    /**
     *名称:I助id
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="FIRST_ASSISTANT",length = 40,nullable = true)
     @FhirFieldValidate(name="FIRST_ASSISTANT",displayName="I助id",maxLength=40,required=false,valuesRange="")   
     private String firstAssistant;
    /**
     *名称:II助id
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="SECOND_ASSISTANT",length = 40,nullable = true)
     @FhirFieldValidate(name="SECOND_ASSISTANT",displayName="II助id",maxLength=40,required=false,valuesRange="")   
     private String secondAssistant;
    /**
     *名称:麻醉者id
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="ANAESTHETIC",length = 40,nullable = true)
     @FhirFieldValidate(name="ANAESTHETIC",displayName="麻醉者id",maxLength=40,required=false,valuesRange="")   
     private String anaesthetic;
    /**
     *名称:通知者id
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="NOTIFY",length = 40,nullable = true)
     @FhirFieldValidate(name="NOTIFY",displayName="通知者id",maxLength=40,required=false,valuesRange="")   
     private String notify;
    /**
     *名称:手术开始时间
     *
 	 *
 	 *
     */
     @Column(name="START",nullable = false)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="START",displayName="手术开始时间",required=true,valuesRange="")   
     private Date start;
    /**
     *名称:手术结束时间
     *
 	 *
 	 *
     */
     @Column(name="END",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="END",displayName="手术结束时间",required=false,valuesRange="")   
     private Date end;
    /**
     *名称:床位id
     *备注:引用床位信息表T_BED院内床位id
 	 *
 	 *
     */
     @Column(name="BED_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="BED_ID",displayName="床位id",maxLength=40,required=false,valuesRange="")   
     private String bedId;
    /**
     *名称:手术申请单id
     *备注:引用手术申请表T_OPERATION_ORDER院内手术申请单id
 	 *
 	 *
     */
     @Column(name="OPERATION_ORDER_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="OPERATION_ORDER_ID",displayName="手术申请单id",maxLength=40,required=false,valuesRange="")   
     private String operationOrderId;
    /**
     *名称:切口类别代码
     *
 	 *限制:CV0510022
 	 *
     */
     @Column(name="NOTCH_TYPE",length = 20,nullable = true)
     @FhirFieldValidate(name="NOTCH_TYPE",displayName="切口类别代码",maxLength=20,required=false,valuesRange="CV0510022")   
     private String notchType;
    /**
     *名称:切口愈合级别代码
     *
 	 *限制:CV550114
 	 *
     */
     @Column(name="INCISION_HEALING_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="INCISION_HEALING_CD",displayName="切口愈合级别代码",maxLength=20,required=false,valuesRange="CV550114")   
     private String incisionHealingCd;
    /**
     *名称:手术通知时间
     *
 	 *
 	 *
     */
     @Column(name="NOTICE_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="NOTICE_DATE",displayName="手术通知时间",required=false,valuesRange="")   
     private Date noticeDate;
    /**
     *名称:是否主要术式
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="OP_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="OP_MARK",displayName="是否主要术式",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean opMark;
    /**
     *名称:是否主要手术或操作
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="OP_PRO_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="OP_PRO_MARK",displayName="是否主要手术或操作",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean opProMark;
    /**
     *名称:手术级别代码
     *
 	 *限制:CV9900040
 	 *
     */
     @Column(name="OP_LEVEL_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="OP_LEVEL_CD",displayName="手术级别代码",maxLength=20,required=false,valuesRange="CV9900040")   
     private String opLevelCd;
    /**
     *名称:麻醉分级代码
     *
 	 *限制:CV9900329
 	 *
     */
     @Column(name="ANESTHESIA_LEVEL_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="ANESTHESIA_LEVEL_CD",displayName="麻醉分级代码",maxLength=20,required=false,valuesRange="CV9900329")   
     private String anesthesiaLevelCd;
    /**
     *名称:手术类型
     *
 	 *限制:CV9900270
 	 *
     */
     @Column(name="OP_TYPE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="OP_TYPE_CODE",displayName="手术类型",maxLength=20,required=false,valuesRange="CV9900270")   
     private String opTypeCode;
    /**
     *名称:记录时间
     *
 	 *
 	 *
     */
     @Column(name="AUTHOR_DTIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="AUTHOR_DTIME",displayName="记录时间",required=false,valuesRange="")   
     private Date authorDtime;
    /**
     *名称:手术切口描述
     *备注:对手术中皮肤切口情况的具体描述
 	 *
 	 *
     */
     @Column(name="WOUND_DESCR",length = 1000,nullable = true)
     @FhirFieldValidate(name="WOUND_DESCR",displayName="手术切口描述",maxLength=1000,required=false,valuesRange="")   
     private String woundDescr;
    /**
     *名称:输血量
     *
 	 *
 	 *
     */
     @Column(name="TRANSFUSION_ITEM_AMOUNT",length = 8,nullable = true)
     @FhirFieldValidate(name="TRANSFUSION_ITEM_AMOUNT",displayName="输血量",maxLength=8,required=false,valuesRange="")   
     private Float transfusionItemAmount;
    /**
     *名称:输液量
     *
 	 *
 	 *
     */
     @Column(name="INFUSION_AMOUNT",length = 8,nullable = true)
     @FhirFieldValidate(name="INFUSION_AMOUNT",displayName="输液量",maxLength=8,required=false,valuesRange="")   
     private Float infusionAmount;
    /**
     *名称:出血量
     *
 	 *
 	 *
     */
     @Column(name="LOSSBLOOD_AMOUNT",length = 8,nullable = true)
     @FhirFieldValidate(name="LOSSBLOOD_AMOUNT",displayName="出血量",maxLength=8,required=false,valuesRange="")   
     private Float lossbloodAmount;
    /**
     *名称:引流标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_DRAIN",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_DRAIN",displayName="引流标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifDrain;
    /**
     *名称:引流材料数量
     *
 	 *
 	 *
     */
     @Column(name="DRAIN_MATERIAL_AMOUNT",length = 8,nullable = true)
     @FhirFieldValidate(name="DRAIN_MATERIAL_AMOUNT",displayName="引流材料数量",maxLength=8,required=false,valuesRange="")   
     private Float drainMaterialAmount;
    /**
     *名称:引流材料名称
     *备注:对手术中引流材料名称的具体描述
 	 *
 	 *
     */
     @Column(name="DRAIN_MATERIAL_NAME",length = 200,nullable = true)
     @FhirFieldValidate(name="DRAIN_MATERIAL_NAME",displayName="引流材料名称",maxLength=200,required=false,valuesRange="")   
     private String drainMaterialName;
    /**
     *名称:放置部位
     *备注:引流管放置在患者体内的具体位置的描述
 	 *
 	 *
     */
     @Column(name="PLACED_PART",length = 200,nullable = true)
     @FhirFieldValidate(name="PLACED_PART",displayName="放置部位",maxLength=200,required=false,valuesRange="")   
     private String placedPart;
    /**
     *名称:术前用药
     *备注:对患者术前用药情况的描述
 	 *
 	 *
     */
     @Column(name="OP_PRE_DRUG",length = 200,nullable = true)
     @FhirFieldValidate(name="OP_PRE_DRUG",displayName="术前用药",maxLength=200,required=false,valuesRange="")   
     private String opPreDrug;
    /**
     *名称:术中用药
     *备注:对患者术中用药情况的描述
 	 *
 	 *
     */
     @Column(name="OP_DRUG",length = 200,nullable = true)
     @FhirFieldValidate(name="OP_DRUG",displayName="术中用药",maxLength=200,required=false,valuesRange="")   
     private String opDrug;
    /**
     *名称:手术经过
     *
 	 *
 	 *
     */
     @Column(name="OPERATION_COURSE",length = 2000,nullable = true)
     @FhirFieldValidate(name="OPERATION_COURSE",displayName="手术经过",maxLength=2000,required=false,valuesRange="")   
     private String operationCourse;
    /**
     *名称:介入物名称
     *备注:实施手术操作时使用/放置的材料/药物的名称
 	 *
 	 *
     */
     @Column(name="INTERVENTION",length = 1000,nullable = true)
     @FhirFieldValidate(name="INTERVENTION",displayName="介入物名称",maxLength=1000,required=false,valuesRange="")   
     private String intervention;
    /**
     *名称:皮肤消毒描述
     *备注:对手术中皮肤消毒情况的具体描述
 	 *
 	 *
     */
     @Column(name="SKIN_THIMEROSAL",length = 1000,nullable = true)
     @FhirFieldValidate(name="SKIN_THIMEROSAL",displayName="皮肤消毒描述",maxLength=1000,required=false,valuesRange="")   
     private String skinThimerosal;
    /**
     *名称:输血反应标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="TRANSFUSE_REACTION_FLAG",length = 5,nullable = true)
     @FhirFieldValidate(name="TRANSFUSE_REACTION_FLAG",displayName="输血反应标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean transfuseReactionFlag;
    /**
     *名称:手术操作序号
     *
 	 *
 	 *
     */
     @Column(name="OP_NO",length = 40,nullable = true)
     @FhirFieldValidate(name="OP_NO",displayName="手术操作序号",maxLength=40,required=false,valuesRange="")   
     private String opNo;
    /**
     *名称:记录者id
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="AUTHOR_CODE",length = 40,nullable = true)
     @FhirFieldValidate(name="AUTHOR_CODE",displayName="记录者id",maxLength=40,required=false,valuesRange="")   
     private String authorCode;
    /**
     *名称:术前诊断的值
     *
 	 *
 	 *
     */
     @Column(name="PRE_DIAGNOSIS_DN",length = 200,nullable = true)
     @FhirFieldValidate(name="PRE_DIAGNOSIS_DN",displayName="术前诊断的值",maxLength=200,required=false,valuesRange="")   
     private String preDiagnosisDn;
    
     public String getOperationId(){
       	return this.operationId;
     }
     public void setOperationId(String operationId){
       	this.operationId=operationId;
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
     public String getStatus(){
       	return this.status;
     }
     public void setStatus(String status){
       	this.status=status;
     }
     public String getAnesthesiaMethodCd(){
       	return this.anesthesiaMethodCd;
     }
     public void setAnesthesiaMethodCd(String anesthesiaMethodCd){
       	this.anesthesiaMethodCd=anesthesiaMethodCd;
     }
     public String getAnesthesiaMethodName(){
       	return this.anesthesiaMethodName;
     }
     public void setAnesthesiaMethodName(String anesthesiaMethodName){
       	this.anesthesiaMethodName=anesthesiaMethodName;
     }
     public String getOperationCd(){
       	return this.operationCd;
     }
     public void setOperationCd(String operationCd){
       	this.operationCd=operationCd;
     }
     public String getOperationName(){
       	return this.operationName;
     }
     public void setOperationName(String operationName){
       	this.operationName=operationName;
     }
     public String getOperatingPosition(){
       	return this.operatingPosition;
     }
     public void setOperatingPosition(String operatingPosition){
       	this.operatingPosition=operatingPosition;
     }
     public String getOperatingPositionName(){
       	return this.operatingPositionName;
     }
     public void setOperatingPositionName(String operatingPositionName){
       	this.operatingPositionName=operatingPositionName;
     }
     public String getPartCode(){
       	return this.partCode;
     }
     public void setPartCode(String partCode){
       	this.partCode=partCode;
     }
     public String getPartName(){
       	return this.partName;
     }
     public void setPartName(String partName){
       	this.partName=partName;
     }
     public String getMedicalRecordManager(){
       	return this.medicalRecordManager;
     }
     public void setMedicalRecordManager(String medicalRecordManager){
       	this.medicalRecordManager=medicalRecordManager;
     }
     public String getEquipmentManager(){
       	return this.equipmentManager;
     }
     public void setEquipmentManager(String equipmentManager){
       	this.equipmentManager=equipmentManager;
     }
     public String getPatrolNurse(){
       	return this.patrolNurse;
     }
     public void setPatrolNurse(String patrolNurse){
       	this.patrolNurse=patrolNurse;
     }
     public String getOperative(){
       	return this.operative;
     }
     public void setOperative(String operative){
       	this.operative=operative;
     }
     public String getFirstAssistant(){
       	return this.firstAssistant;
     }
     public void setFirstAssistant(String firstAssistant){
       	this.firstAssistant=firstAssistant;
     }
     public String getSecondAssistant(){
       	return this.secondAssistant;
     }
     public void setSecondAssistant(String secondAssistant){
       	this.secondAssistant=secondAssistant;
     }
     public String getAnaesthetic(){
       	return this.anaesthetic;
     }
     public void setAnaesthetic(String anaesthetic){
       	this.anaesthetic=anaesthetic;
     }
     public String getNotify(){
       	return this.notify;
     }
     public void setNotify(String notify){
       	this.notify=notify;
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
     public String getBedId(){
       	return this.bedId;
     }
     public void setBedId(String bedId){
       	this.bedId=bedId;
     }
     public String getOperationOrderId(){
       	return this.operationOrderId;
     }
     public void setOperationOrderId(String operationOrderId){
       	this.operationOrderId=operationOrderId;
     }
     public String getNotchType(){
       	return this.notchType;
     }
     public void setNotchType(String notchType){
       	this.notchType=notchType;
     }
     public String getIncisionHealingCd(){
       	return this.incisionHealingCd;
     }
     public void setIncisionHealingCd(String incisionHealingCd){
       	this.incisionHealingCd=incisionHealingCd;
     }
     public Date getNoticeDate(){
       	return this.noticeDate;
     }
     public void setNoticeDate(Date noticeDate){
       	this.noticeDate=noticeDate;
     }
     public Boolean getOpMark(){
       	return this.opMark;
     }
     public void setOpMark(Boolean opMark){
       	this.opMark=opMark;
     }
     public Boolean getOpProMark(){
       	return this.opProMark;
     }
     public void setOpProMark(Boolean opProMark){
       	this.opProMark=opProMark;
     }
     public String getOpLevelCd(){
       	return this.opLevelCd;
     }
     public void setOpLevelCd(String opLevelCd){
       	this.opLevelCd=opLevelCd;
     }
     public String getAnesthesiaLevelCd(){
       	return this.anesthesiaLevelCd;
     }
     public void setAnesthesiaLevelCd(String anesthesiaLevelCd){
       	this.anesthesiaLevelCd=anesthesiaLevelCd;
     }
     public String getOpTypeCode(){
       	return this.opTypeCode;
     }
     public void setOpTypeCode(String opTypeCode){
       	this.opTypeCode=opTypeCode;
     }
     public Date getAuthorDtime(){
       	return this.authorDtime;
     }
     public void setAuthorDtime(Date authorDtime){
       	this.authorDtime=authorDtime;
     }
     public String getWoundDescr(){
       	return this.woundDescr;
     }
     public void setWoundDescr(String woundDescr){
       	this.woundDescr=woundDescr;
     }
     public Float getTransfusionItemAmount(){
       	return this.transfusionItemAmount;
     }
     public void setTransfusionItemAmount(Float transfusionItemAmount){
       	this.transfusionItemAmount=transfusionItemAmount;
     }
     public Float getInfusionAmount(){
       	return this.infusionAmount;
     }
     public void setInfusionAmount(Float infusionAmount){
       	this.infusionAmount=infusionAmount;
     }
     public Float getLossbloodAmount(){
       	return this.lossbloodAmount;
     }
     public void setLossbloodAmount(Float lossbloodAmount){
       	this.lossbloodAmount=lossbloodAmount;
     }
     public Boolean getIfDrain(){
       	return this.ifDrain;
     }
     public void setIfDrain(Boolean ifDrain){
       	this.ifDrain=ifDrain;
     }
     public Float getDrainMaterialAmount(){
       	return this.drainMaterialAmount;
     }
     public void setDrainMaterialAmount(Float drainMaterialAmount){
       	this.drainMaterialAmount=drainMaterialAmount;
     }
     public String getDrainMaterialName(){
       	return this.drainMaterialName;
     }
     public void setDrainMaterialName(String drainMaterialName){
       	this.drainMaterialName=drainMaterialName;
     }
     public String getPlacedPart(){
       	return this.placedPart;
     }
     public void setPlacedPart(String placedPart){
       	this.placedPart=placedPart;
     }
     public String getOpPreDrug(){
       	return this.opPreDrug;
     }
     public void setOpPreDrug(String opPreDrug){
       	this.opPreDrug=opPreDrug;
     }
     public String getOpDrug(){
       	return this.opDrug;
     }
     public void setOpDrug(String opDrug){
       	this.opDrug=opDrug;
     }
     public String getOperationCourse(){
       	return this.operationCourse;
     }
     public void setOperationCourse(String operationCourse){
       	this.operationCourse=operationCourse;
     }
     public String getIntervention(){
       	return this.intervention;
     }
     public void setIntervention(String intervention){
       	this.intervention=intervention;
     }
     public String getSkinThimerosal(){
       	return this.skinThimerosal;
     }
     public void setSkinThimerosal(String skinThimerosal){
       	this.skinThimerosal=skinThimerosal;
     }
     public Boolean getTransfuseReactionFlag(){
       	return this.transfuseReactionFlag;
     }
     public void setTransfuseReactionFlag(Boolean transfuseReactionFlag){
       	this.transfuseReactionFlag=transfuseReactionFlag;
     }
     public String getOpNo(){
       	return this.opNo;
     }
     public void setOpNo(String opNo){
       	this.opNo=opNo;
     }
     public String getAuthorCode(){
       	return this.authorCode;
     }
     public void setAuthorCode(String authorCode){
       	this.authorCode=authorCode;
     }
     public String getPreDiagnosisDn(){
       	return this.preDiagnosisDn;
     }
     public void setPreDiagnosisDn(String preDiagnosisDn){
       	this.preDiagnosisDn=preDiagnosisDn;
     }
}