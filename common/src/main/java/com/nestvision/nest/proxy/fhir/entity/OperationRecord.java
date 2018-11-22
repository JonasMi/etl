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
@Table(name = BaseEntity.TABLE_PREFIX + "OPERATION_RECORD")
public class OperationRecord extends FhirResourceEntity {

    /**
     *名称:院内一般手术记录id
     *
 	 *
 	 *主键字段
     */
     @Column(name="OPERATION_RECORD_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="OPERATION_RECORD_ID",displayName="院内一般手术记录id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String operationRecordId;
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
     *名称:城乡居民健康档案编号
     *
 	 *
 	 *
     */
     @Column(name="HEALTH_FILE_NUMBER",length = 40,nullable = true)
     @FhirFieldValidate(name="HEALTH_FILE_NUMBER",displayName="城乡居民健康档案编号",maxLength=40,required=false,valuesRange="")   
     private String healthFileNumber;
    /**
     *名称:健康卡号
     *
 	 *
 	 *
     */
     @Column(name="HEALTH_CARD",length = 40,nullable = true)
     @FhirFieldValidate(name="HEALTH_CARD",displayName="健康卡号",maxLength=40,required=false,valuesRange="")   
     private String healthCard;
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
     *名称:电话号码
     *
 	 *
 	 *
     */
     @Column(name="TELECOM",length = 20,nullable = true)
     @FhirFieldValidate(name="TELECOM",displayName="电话号码",maxLength=20,required=false,valuesRange="")   
     private String telecom;
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
     *名称:患者类型
     *
 	 *限制:CV0900404
 	 *
     */
     @Column(name="PATIENT_TYPE",length = 20,nullable = true)
     @FhirFieldValidate(name="PATIENT_TYPE",displayName="患者类型",maxLength=20,required=false,valuesRange="CV0900404")   
     private String patientType;
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
     *名称:门诊或住院标识
     *
 	 *限制:CUS00010
 	 *
     */
     @Column(name="VISIT_MARK",length = 10,nullable = false)
     @FhirFieldValidate(name="VISIT_MARK",displayName="门诊或住院标识",maxLength=10,required=true,valuesRange="CUS00010")   
     private String visitMark;
    /**
     *名称:就诊流水号
     *
 	 *
 	 *
     */
     @Column(name="REGISTRATION_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="REGISTRATION_ID",displayName="就诊流水号",maxLength=40,required=true,valuesRange="")   
     private String registrationId;
    /**
     *名称:入院时间
     *
 	 *
 	 *
     */
     @Column(name="START",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="START",displayName="入院时间",required=false,valuesRange="")   
     private Date start;
    /**
     *名称:住院号
     *
 	 *
 	 *
     */
     @Column(name="INH_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="INH_ID",displayName="住院号",maxLength=40,required=false,valuesRange="")   
     private String inhId;
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
     *名称:病房号
     *
 	 *
 	 *
     */
     @Column(name="WARD_NO",length = 20,nullable = true)
     @FhirFieldValidate(name="WARD_NO",displayName="病房号",maxLength=20,required=false,valuesRange="")   
     private String wardNo;
    /**
     *名称:病区
     *
 	 *
 	 *
     */
     @Column(name="WARD_AREA",length = 40,nullable = true)
     @FhirFieldValidate(name="WARD_AREA",displayName="病区",maxLength=40,required=false,valuesRange="")   
     private String wardArea;
    /**
     *名称:床位号
     *
 	 *
 	 *
     */
     @Column(name="BED_NUM",length = 20,nullable = true)
     @FhirFieldValidate(name="BED_NUM",displayName="床位号",maxLength=20,required=false,valuesRange="")   
     private String bedNum;
    /**
     *名称:手术史标志
     *
 	 *限制:CV9900024
 	 *
     */
     @Column(name="INPAT_OP_MARK",length = 20,nullable = true)
     @FhirFieldValidate(name="INPAT_OP_MARK",displayName="手术史标志",maxLength=20,required=false,valuesRange="CV9900024")   
     private String inpatOpMark;
    /**
     *名称:术前诊断-诊断编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="PREOPERATIVE_DIAGNOSIS",length = 20,nullable = true)
     @FhirFieldValidate(name="PREOPERATIVE_DIAGNOSIS",displayName="术前诊断-诊断编码",maxLength=20,required=false,valuesRange="CV990111")   
     private String preoperativeDiagnosis;
    /**
     *名称:术前诊断-诊断编码名称
     *
 	 *
 	 *
     */
     @Column(name="PREOPERATIVE_DIAGNOSIS_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="PREOPERATIVE_DIAGNOSIS_NAME",displayName="术前诊断-诊断编码名称",maxLength=40,required=false,valuesRange="")   
     private String preoperativeDiagnosisName;
    /**
     *名称:术前诊断-诊断日期
     *
 	 *
 	 *
     */
     @Column(name="PREOPERATIVE_DIAGNOSIS_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="PREOPERATIVE_DIAGNOSIS_DATE",displayName="术前诊断-诊断日期",required=false,valuesRange="")   
     private Date preoperativeDiagnosisDate;
    /**
     *名称:术后诊断-诊断编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="AFTER_OPERATION_DIAGNOSIS",length = 20,nullable = true)
     @FhirFieldValidate(name="AFTER_OPERATION_DIAGNOSIS",displayName="术后诊断-诊断编码",maxLength=20,required=false,valuesRange="CV990111")   
     private String afterOperationDiagnosis;
    /**
     *名称:术后诊断-诊断编码名称
     *
 	 *
 	 *
     */
     @Column(name="AFTER_OPERATION_DIAGNOSIS_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="AFTER_OPERATION_DIAGNOSIS_NAME",displayName="术后诊断-诊断编码名称",maxLength=40,required=false,valuesRange="")   
     private String afterOperationDiagnosisName;
    /**
     *名称:术后诊断-诊断日期
     *
 	 *
 	 *
     */
     @Column(name="AFTER_OPERATION_DIAGNOSIS_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="AFTER_OPERATION_DIAGNOSIS_DATE",displayName="术后诊断-诊断日期",required=false,valuesRange="")   
     private Date afterOperationDiagnosisDate;
    /**
     *名称:手术单id
     *
 	 *
 	 *
     */
     @Column(name="OPERATION_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="OPERATION_ID",displayName="手术单id",maxLength=40,required=false,valuesRange="")   
     private String operationId;
    /**
     *名称:手术间编号
     *
 	 *
 	 *
     */
     @Column(name="OP_ROOM",length = 40,nullable = true)
     @FhirFieldValidate(name="OP_ROOM",displayName="手术间编号",maxLength=40,required=false,valuesRange="")   
     private String opRoom;
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
     *名称:输血量
     *备注:单位：mL
 	 *
 	 *
     */
     @Column(name="TRANSFUSION_ITEM_AMOUNT",length = 8,nullable = true)
     @FhirFieldValidate(name="TRANSFUSION_ITEM_AMOUNT",displayName="输血量",maxLength=8,required=false,valuesRange="")   
     private Float transfusionItemAmount;
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
     *名称:术前用药
     *
 	 *
 	 *
     */
     @Column(name="OP_PRE_DRUG",length = 100,nullable = true)
     @FhirFieldValidate(name="OP_PRE_DRUG",displayName="术前用药",maxLength=100,required=false,valuesRange="")   
     private String opPreDrug;
    /**
     *名称:术中用药
     *
 	 *
 	 *
     */
     @Column(name="OP_DRUG",length = 100,nullable = true)
     @FhirFieldValidate(name="OP_DRUG",displayName="术中用药",maxLength=100,required=false,valuesRange="")   
     private String opDrug;
    /**
     *名称:出血量
     *备注:单位：mL
 	 *
 	 *
     */
     @Column(name="LOSSBLOOD_AMOUNT",length = 8,nullable = true)
     @FhirFieldValidate(name="LOSSBLOOD_AMOUNT",displayName="出血量",maxLength=8,required=false,valuesRange="")   
     private Float lossbloodAmount;
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
     *名称:手术经过
     *
 	 *
 	 *
     */
     @Column(name="OPERATION_COURSE",length = 1000,nullable = true)
     @FhirFieldValidate(name="OPERATION_COURSE",displayName="手术经过",maxLength=1000,required=false,valuesRange="")   
     private String operationCourse;
    /**
     *名称:介入物名称
     *
 	 *
 	 *
     */
     @Column(name="INTERVENTION",length = 40,nullable = true)
     @FhirFieldValidate(name="INTERVENTION",displayName="介入物名称",maxLength=40,required=false,valuesRange="")   
     private String intervention;
    /**
     *名称:皮肤消毒描述
     *
 	 *
 	 *
     */
     @Column(name="SKIN_THIMEROSAL",length = 100,nullable = true)
     @FhirFieldValidate(name="SKIN_THIMEROSAL",displayName="皮肤消毒描述",maxLength=100,required=false,valuesRange="")   
     private String skinThimerosal;
    /**
     *名称:手术切口描述
     *
 	 *
 	 *
     */
     @Column(name="WOUND_DESCR",length = 100,nullable = true)
     @FhirFieldValidate(name="WOUND_DESCR",displayName="手术切口描述",maxLength=100,required=false,valuesRange="")   
     private String woundDescr;
    /**
     *名称:引流标志代码
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_DRAIN",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_DRAIN",displayName="引流标志代码",maxLength=5,required=false,valuesRange="CUS00004")   
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
     *
 	 *
 	 *
     */
     @Column(name="DRAIN_MATERIAL_NAME",length = 100,nullable = true)
     @FhirFieldValidate(name="DRAIN_MATERIAL_NAME",displayName="引流材料名称",maxLength=100,required=false,valuesRange="")   
     private String drainMaterialName;
    /**
     *名称:放置部位
     *
 	 *
 	 *
     */
     @Column(name="PLACED_PART",length = 100,nullable = true)
     @FhirFieldValidate(name="PLACED_PART",displayName="放置部位",maxLength=100,required=false,valuesRange="")   
     private String placedPart;
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
     *名称:手术者id
     *
 	 *
 	 *
     */
     @Column(name="OPERATIVE",length = 40,nullable = true)
     @FhirFieldValidate(name="OPERATIVE",displayName="手术者id",maxLength=40,required=false,valuesRange="")   
     private String operative;
    /**
     *名称:手术者姓名
     *
 	 *
 	 *
     */
     @Column(name="OPERATIVE_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="OPERATIVE_NAME",displayName="手术者姓名",maxLength=40,required=false,valuesRange="")   
     private String operativeName;
    /**
     *名称:I助id
     *
 	 *
 	 *
     */
     @Column(name="FIRST_ASSISTANT",length = 40,nullable = true)
     @FhirFieldValidate(name="FIRST_ASSISTANT",displayName="I助id",maxLength=40,required=false,valuesRange="")   
     private String firstAssistant;
    /**
     *名称:I助姓名
     *
 	 *
 	 *
     */
     @Column(name="FIRST_ASSISTANT_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="FIRST_ASSISTANT_NAME",displayName="I助姓名",maxLength=40,required=false,valuesRange="")   
     private String firstAssistantName;
    /**
     *名称:II助id
     *
 	 *
 	 *
     */
     @Column(name="SECOND_ASSISTANT",length = 40,nullable = true)
     @FhirFieldValidate(name="SECOND_ASSISTANT",displayName="II助id",maxLength=40,required=false,valuesRange="")   
     private String secondAssistant;
    /**
     *名称:II助姓名
     *
 	 *
 	 *
     */
     @Column(name="SECOND_ASSISTANT_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="SECOND_ASSISTANT_NAME",displayName="II助姓名",maxLength=40,required=false,valuesRange="")   
     private String secondAssistantName;
    /**
     *名称:器材管理者id
     *
 	 *
 	 *
     */
     @Column(name="EQUIPMENT_MANAGER",length = 40,nullable = true)
     @FhirFieldValidate(name="EQUIPMENT_MANAGER",displayName="器材管理者id",maxLength=40,required=false,valuesRange="")   
     private String equipmentManager;
    /**
     *名称:器材管理者姓名
     *
 	 *
 	 *
     */
     @Column(name="EQUIPMENT_MANAGER_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="EQUIPMENT_MANAGER_NAME",displayName="器材管理者姓名",maxLength=40,required=false,valuesRange="")   
     private String equipmentManagerName;
    /**
     *名称:巡台护士id
     *
 	 *
 	 *
     */
     @Column(name="PATROL_NURSE",length = 40,nullable = true)
     @FhirFieldValidate(name="PATROL_NURSE",displayName="巡台护士id",maxLength=40,required=false,valuesRange="")   
     private String patrolNurse;
    /**
     *名称:巡台护士姓名
     *
 	 *
 	 *
     */
     @Column(name="PATROL_NURSE_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="PATROL_NURSE_NAME",displayName="巡台护士姓名",maxLength=40,required=false,valuesRange="")   
     private String patrolNurseName;
    /**
     *名称:麻醉者id
     *
 	 *
 	 *
     */
     @Column(name="ANAESTHETIC",length = 40,nullable = true)
     @FhirFieldValidate(name="ANAESTHETIC",displayName="麻醉者id",maxLength=40,required=false,valuesRange="")   
     private String anaesthetic;
    /**
     *名称:麻醉者姓名
     *
 	 *
 	 *
     */
     @Column(name="ANAESTHETIC_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="ANAESTHETIC_NAME",displayName="麻醉者姓名",maxLength=40,required=false,valuesRange="")   
     private String anaestheticName;
    /**
     *名称:手术开始时间
     *
 	 *
 	 *
     */
     @Column(name="PERFORMED_START",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="PERFORMED_START",displayName="手术开始时间",required=false,valuesRange="")   
     private Date performedStart;
    /**
     *名称:手术结束时间
     *
 	 *
 	 *
     */
     @Column(name="PERFORMED_END",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="PERFORMED_END",displayName="手术结束时间",required=false,valuesRange="")   
     private Date performedEnd;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getOperationRecordId(){
       	return this.operationRecordId;
     }
     public void setOperationRecordId(String operationRecordId){
       	this.operationRecordId=operationRecordId;
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
     public String getHealthFileNumber(){
       	return this.healthFileNumber;
     }
     public void setHealthFileNumber(String healthFileNumber){
       	this.healthFileNumber=healthFileNumber;
     }
     public String getHealthCard(){
       	return this.healthCard;
     }
     public void setHealthCard(String healthCard){
       	this.healthCard=healthCard;
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
     public String getTelecom(){
       	return this.telecom;
     }
     public void setTelecom(String telecom){
       	this.telecom=telecom;
     }
     public Float getAge(){
       	return this.age;
     }
     public void setAge(Float age){
       	this.age=age;
     }
     public String getPatientType(){
       	return this.patientType;
     }
     public void setPatientType(String patientType){
       	this.patientType=patientType;
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
     public Date getStart(){
       	return this.start;
     }
     public void setStart(Date start){
       	this.start=start;
     }
     public String getInhId(){
       	return this.inhId;
     }
     public void setInhId(String inhId){
       	this.inhId=inhId;
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
     public String getWardNo(){
       	return this.wardNo;
     }
     public void setWardNo(String wardNo){
       	this.wardNo=wardNo;
     }
     public String getWardArea(){
       	return this.wardArea;
     }
     public void setWardArea(String wardArea){
       	this.wardArea=wardArea;
     }
     public String getBedNum(){
       	return this.bedNum;
     }
     public void setBedNum(String bedNum){
       	this.bedNum=bedNum;
     }
     public String getInpatOpMark(){
       	return this.inpatOpMark;
     }
     public void setInpatOpMark(String inpatOpMark){
       	this.inpatOpMark=inpatOpMark;
     }
     public String getPreoperativeDiagnosis(){
       	return this.preoperativeDiagnosis;
     }
     public void setPreoperativeDiagnosis(String preoperativeDiagnosis){
       	this.preoperativeDiagnosis=preoperativeDiagnosis;
     }
     public String getPreoperativeDiagnosisName(){
       	return this.preoperativeDiagnosisName;
     }
     public void setPreoperativeDiagnosisName(String preoperativeDiagnosisName){
       	this.preoperativeDiagnosisName=preoperativeDiagnosisName;
     }
     public Date getPreoperativeDiagnosisDate(){
       	return this.preoperativeDiagnosisDate;
     }
     public void setPreoperativeDiagnosisDate(Date preoperativeDiagnosisDate){
       	this.preoperativeDiagnosisDate=preoperativeDiagnosisDate;
     }
     public String getAfterOperationDiagnosis(){
       	return this.afterOperationDiagnosis;
     }
     public void setAfterOperationDiagnosis(String afterOperationDiagnosis){
       	this.afterOperationDiagnosis=afterOperationDiagnosis;
     }
     public String getAfterOperationDiagnosisName(){
       	return this.afterOperationDiagnosisName;
     }
     public void setAfterOperationDiagnosisName(String afterOperationDiagnosisName){
       	this.afterOperationDiagnosisName=afterOperationDiagnosisName;
     }
     public Date getAfterOperationDiagnosisDate(){
       	return this.afterOperationDiagnosisDate;
     }
     public void setAfterOperationDiagnosisDate(Date afterOperationDiagnosisDate){
       	this.afterOperationDiagnosisDate=afterOperationDiagnosisDate;
     }
     public String getOperationId(){
       	return this.operationId;
     }
     public void setOperationId(String operationId){
       	this.operationId=operationId;
     }
     public String getOpRoom(){
       	return this.opRoom;
     }
     public void setOpRoom(String opRoom){
       	this.opRoom=opRoom;
     }
     public String getOpLevelCd(){
       	return this.opLevelCd;
     }
     public void setOpLevelCd(String opLevelCd){
       	this.opLevelCd=opLevelCd;
     }
     public Float getTransfusionItemAmount(){
       	return this.transfusionItemAmount;
     }
     public void setTransfusionItemAmount(Float transfusionItemAmount){
       	this.transfusionItemAmount=transfusionItemAmount;
     }
     public Boolean getTransfuseReactionFlag(){
       	return this.transfuseReactionFlag;
     }
     public void setTransfuseReactionFlag(Boolean transfuseReactionFlag){
       	this.transfuseReactionFlag=transfuseReactionFlag;
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
     public Float getLossbloodAmount(){
       	return this.lossbloodAmount;
     }
     public void setLossbloodAmount(Float lossbloodAmount){
       	this.lossbloodAmount=lossbloodAmount;
     }
     public Float getInfusionAmount(){
       	return this.infusionAmount;
     }
     public void setInfusionAmount(Float infusionAmount){
       	this.infusionAmount=infusionAmount;
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
     public String getWoundDescr(){
       	return this.woundDescr;
     }
     public void setWoundDescr(String woundDescr){
       	this.woundDescr=woundDescr;
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
     public String getOperative(){
       	return this.operative;
     }
     public void setOperative(String operative){
       	this.operative=operative;
     }
     public String getOperativeName(){
       	return this.operativeName;
     }
     public void setOperativeName(String operativeName){
       	this.operativeName=operativeName;
     }
     public String getFirstAssistant(){
       	return this.firstAssistant;
     }
     public void setFirstAssistant(String firstAssistant){
       	this.firstAssistant=firstAssistant;
     }
     public String getFirstAssistantName(){
       	return this.firstAssistantName;
     }
     public void setFirstAssistantName(String firstAssistantName){
       	this.firstAssistantName=firstAssistantName;
     }
     public String getSecondAssistant(){
       	return this.secondAssistant;
     }
     public void setSecondAssistant(String secondAssistant){
       	this.secondAssistant=secondAssistant;
     }
     public String getSecondAssistantName(){
       	return this.secondAssistantName;
     }
     public void setSecondAssistantName(String secondAssistantName){
       	this.secondAssistantName=secondAssistantName;
     }
     public String getEquipmentManager(){
       	return this.equipmentManager;
     }
     public void setEquipmentManager(String equipmentManager){
       	this.equipmentManager=equipmentManager;
     }
     public String getEquipmentManagerName(){
       	return this.equipmentManagerName;
     }
     public void setEquipmentManagerName(String equipmentManagerName){
       	this.equipmentManagerName=equipmentManagerName;
     }
     public String getPatrolNurse(){
       	return this.patrolNurse;
     }
     public void setPatrolNurse(String patrolNurse){
       	this.patrolNurse=patrolNurse;
     }
     public String getPatrolNurseName(){
       	return this.patrolNurseName;
     }
     public void setPatrolNurseName(String patrolNurseName){
       	this.patrolNurseName=patrolNurseName;
     }
     public String getAnaesthetic(){
       	return this.anaesthetic;
     }
     public void setAnaesthetic(String anaesthetic){
       	this.anaesthetic=anaesthetic;
     }
     public String getAnaestheticName(){
       	return this.anaestheticName;
     }
     public void setAnaestheticName(String anaestheticName){
       	this.anaestheticName=anaestheticName;
     }
     public Date getPerformedStart(){
       	return this.performedStart;
     }
     public void setPerformedStart(Date performedStart){
       	this.performedStart=performedStart;
     }
     public Date getPerformedEnd(){
       	return this.performedEnd;
     }
     public void setPerformedEnd(Date performedEnd){
       	this.performedEnd=performedEnd;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}