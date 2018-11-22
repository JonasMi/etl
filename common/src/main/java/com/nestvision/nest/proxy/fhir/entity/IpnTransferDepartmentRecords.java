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
@Table(name = BaseEntity.TABLE_PREFIX + "IPN_TRANSFER_DEPARTMENT_RECORDS")
public class IpnTransferDepartmentRecords extends FhirResourceEntity {

    /**
     *名称:转科记录id
     *
 	 *
 	 *主键字段
     */
     @Column(name="IPN_TRANSFER_DEPARTMENT_RECORDS_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="IPN_TRANSFER_DEPARTMENT_RECORDS_ID",displayName="转科记录id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String ipnTransferDepartmentRecordsId;
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
     *名称:年龄
     *
 	 *
 	 *
     */
     @Column(name="AGE",length = 8,nullable = true)
     @FhirFieldValidate(name="AGE",displayName="年龄",maxLength=8,required=false,valuesRange="")   
     private Float age;
    /**
     *名称:联系人关系代码
     *
 	 *限制:GBT4761
 	 *
     */
     @Column(name="RELATIONSHIP",length = 20,nullable = true)
     @FhirFieldValidate(name="RELATIONSHIP",displayName="联系人关系代码",maxLength=20,required=false,valuesRange="GBT4761")   
     private String relationship;
    /**
     *名称:联系人姓名
     *
 	 *
 	 *
     */
     @Column(name="CONTACTS_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="CONTACTS_NAME",displayName="联系人姓名",maxLength=20,required=false,valuesRange="")   
     private String contactsName;
    /**
     *名称:联系人电话号码
     *
 	 *
 	 *
     */
     @Column(name="CONTACTS_PHONE",length = 20,nullable = true)
     @FhirFieldValidate(name="CONTACTS_PHONE",displayName="联系人电话号码",maxLength=20,required=false,valuesRange="")   
     private String contactsPhone;
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
     *名称:是否有过敏史
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_RRITABILITY",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_RRITABILITY",displayName="是否有过敏史",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifRritability;
    /**
     *名称:过敏史其他描述
     *
 	 *
 	 *
     */
     @Column(name="RRITABILITY",columnDefinition="text")
     @FhirFieldValidate(name="RRITABILITY",displayName="过敏史其他描述",required=false,valuesRange="")   
     private String rritability;
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
     *名称:住院号
     *
 	 *
 	 *
     */
     @Column(name="INH_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="INH_ID",displayName="住院号",maxLength=40,required=false,valuesRange="")   
     private String inhId;
    /**
     *名称:住院流水号
     *
 	 *
 	 *
     */
     @Column(name="INPATIENT_REGISTRATION_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="INPATIENT_REGISTRATION_ID",displayName="住院流水号",maxLength=40,required=true,valuesRange="")   
     private String inpatientRegistrationId;
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
     *名称:主诉
     *
 	 *
 	 *
     */
     @Column(name="CHIEF",columnDefinition="text")
     @FhirFieldValidate(name="CHIEF",displayName="主诉",required=false,valuesRange="")   
     private String chief;
    /**
     *名称:入院诊断-中医征候诊断代码
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="IN_CN_SYM_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="IN_CN_SYM_DIAG_CODE",displayName="入院诊断-中医征候诊断代码",maxLength=20,required=false,valuesRange="CV9900357")   
     private String inCnSymDiagCode;
    /**
     *名称:入院诊断-中医病名诊断代码
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="IN_CN_DIS_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="IN_CN_DIS_DIAG_CODE",displayName="入院诊断-中医病名诊断代码",maxLength=20,required=false,valuesRange="CV9900357")   
     private String inCnDisDiagCode;
    /**
     *名称:入院诊断-诊断编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="IN_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="IN_DIAG_CODE",displayName="入院诊断-诊断编码",maxLength=20,required=false,valuesRange="CV990111")   
     private String inDiagCode;
    /**
     *名称:入院诊断-诊断名称
     *
 	 *
 	 *
     */
     @Column(name="IN_DIAG_VALUE",length = 20,nullable = true)
     @FhirFieldValidate(name="IN_DIAG_VALUE",displayName="入院诊断-诊断名称",maxLength=20,required=false,valuesRange="")   
     private String inDiagValue;
    /**
     *名称:入院诊断-诊断日期
     *
 	 *
 	 *
     */
     @Column(name="IN_DIAG_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="IN_DIAG_DATE",displayName="入院诊断-诊断日期",required=false,valuesRange="")   
     private Date inDiagDate;
    /**
     *名称:入院诊断-入院情况
     *
 	 *
 	 *
     */
     @Column(name="IN_DIAG_DETAILS",length = 100,nullable = true)
     @FhirFieldValidate(name="IN_DIAG_DETAILS",displayName="入院诊断-入院情况",maxLength=100,required=false,valuesRange="")   
     private String inDiagDetails;
    /**
     *名称:诊断记录-目前情况
     *
 	 *
 	 *
     */
     @Column(name="IN_DIAG_RECORD_CURRENT_CIRCUMSTANCES",length = 100,nullable = true)
     @FhirFieldValidate(name="IN_DIAG_RECORD_CURRENT_CIRCUMSTANCES",displayName="诊断记录-目前情况",maxLength=100,required=false,valuesRange="")   
     private String inDiagRecordCurrentCircumstances;
    /**
     *名称:诊断记录-中医征候诊断代码
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="IN_RECORD_CN_SYM_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="IN_RECORD_CN_SYM_DIAG_CODE",displayName="诊断记录-中医征候诊断代码",maxLength=20,required=false,valuesRange="CV9900357")   
     private String inRecordCnSymDiagCode;
    /**
     *名称:诊断记录-中医病名诊断代码
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="IN_RECORD_CN_DIS_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="IN_RECORD_CN_DIS_DIAG_CODE",displayName="诊断记录-中医病名诊断代码",maxLength=20,required=false,valuesRange="CV9900357")   
     private String inRecordCnDisDiagCode;
    /**
     *名称:诊断记录-诊断编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="IN_RECORD_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="IN_RECORD_DIAG_CODE",displayName="诊断记录-诊断编码",maxLength=20,required=false,valuesRange="CV990111")   
     private String inRecordDiagCode;
    /**
     *名称:诊断记录-诊断日期
     *
 	 *
 	 *
     */
     @Column(name="IN_RECORD_DIAG_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="IN_RECORD_DIAG_DATE",displayName="诊断记录-诊断日期",required=false,valuesRange="")   
     private Date inRecordDiagDate;
    /**
     *名称:诊断记录-诊断名称
     *
 	 *
 	 *
     */
     @Column(name="IN_RECORD_DIAG_VALUE",length = 20,nullable = true)
     @FhirFieldValidate(name="IN_RECORD_DIAG_VALUE",displayName="诊断记录-诊断名称",maxLength=20,required=false,valuesRange="")   
     private String inRecordDiagValue;
    /**
     *名称:转出科室id
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
 	 *
     */
     @Column(name="OUT_DPID_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="OUT_DPID_ID",displayName="转出科室id",maxLength=40,required=false,valuesRange="")   
     private String outDpidId;
    /**
     *名称:转出科室名称
     *
 	 *
 	 *
     */
     @Column(name="OUT_DPID_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="OUT_DPID_NAME",displayName="转出科室名称",maxLength=40,required=false,valuesRange="")   
     private String outDpidName;
    /**
     *名称:转入时间
     *
 	 *
 	 *
     */
     @Column(name="IN_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="IN_DATE",displayName="转入时间",required=false,valuesRange="")   
     private Date inDate;
    /**
     *名称:转出时间
     *
 	 *
 	 *
     */
     @Column(name="OUT_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="OUT_DATE",displayName="转出时间",required=false,valuesRange="")   
     private Date outDate;
    /**
     *名称:转科目的
     *
 	 *
 	 *
     */
     @Column(name="TRANSFER_REASON",length = 500,nullable = true)
     @FhirFieldValidate(name="TRANSFER_REASON",displayName="转科目的",maxLength=500,required=false,valuesRange="")   
     private String transferReason;
    /**
     *名称:原系统转诊id
     *
 	 *
 	 *
     */
     @Column(name="INPATIENT_TRANSFER_ID",length = 20,nullable = true)
     @FhirFieldValidate(name="INPATIENT_TRANSFER_ID",displayName="原系统转诊id",maxLength=20,required=false,valuesRange="")   
     private String inpatientTransferId;
    /**
     *名称:转诊状态
     *
 	 *限制:CUS00017
 	 *
     */
     @Column(name="TRANSFER_STATUS",length = 20,nullable = true)
     @FhirFieldValidate(name="TRANSFER_STATUS",displayName="转诊状态",maxLength=20,required=false,valuesRange="CUS00017")   
     private String transferStatus;
    /**
     *名称:转出操作人id
     *
 	 *
 	 *
     */
     @Column(name="ROLL_OUT_OPERATOR_ID",length = 20,nullable = true)
     @FhirFieldValidate(name="ROLL_OUT_OPERATOR_ID",displayName="转出操作人id",maxLength=20,required=false,valuesRange="")   
     private String rollOutOperatorId;
    /**
     *名称:转出操作人姓名
     *
 	 *
 	 *
     */
     @Column(name="ROLL_OUT_OPERATOR_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="ROLL_OUT_OPERATOR_NAME",displayName="转出操作人姓名",maxLength=20,required=false,valuesRange="")   
     private String rollOutOperatorName;
    /**
     *名称:转出操作人专业技术职务代码
     *
 	 *限制:CV9900374
 	 *
     */
     @Column(name="ROLL_OUT_OPERATOR_POST",length = 20,nullable = true)
     @FhirFieldValidate(name="ROLL_OUT_OPERATOR_POST",displayName="转出操作人专业技术职务代码",maxLength=20,required=false,valuesRange="CV9900374")   
     private String rollOutOperatorPost;
    /**
     *名称:转入操作人id
     *
 	 *
 	 *
     */
     @Column(name="ROLL_IN_OPERATOR_ID",length = 20,nullable = true)
     @FhirFieldValidate(name="ROLL_IN_OPERATOR_ID",displayName="转入操作人id",maxLength=20,required=false,valuesRange="")   
     private String rollInOperatorId;
    /**
     *名称:转入操作人姓名
     *
 	 *
 	 *
     */
     @Column(name="ROLL_IN_OPERATOR_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="ROLL_IN_OPERATOR_NAME",displayName="转入操作人姓名",maxLength=20,required=false,valuesRange="")   
     private String rollInOperatorName;
    /**
     *名称:转入操作人专业技术职务代码
     *
 	 *限制:CV9900374
 	 *
     */
     @Column(name="ROLL_IN_OPERATOR_POST",length = 20,nullable = true)
     @FhirFieldValidate(name="ROLL_IN_OPERATOR_POST",displayName="转入操作人专业技术职务代码",maxLength=20,required=false,valuesRange="CV9900374")   
     private String rollInOperatorPost;
    /**
     *名称:转入科室id
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
 	 *
     */
     @Column(name="IN_DPID_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="IN_DPID_ID",displayName="转入科室id",maxLength=40,required=false,valuesRange="")   
     private String inDpidId;
    /**
     *名称:转入科室名称
     *
 	 *
 	 *
     */
     @Column(name="IN_DPID_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="IN_DPID_NAME",displayName="转入科室名称",maxLength=40,required=false,valuesRange="")   
     private String inDpidName;
    /**
     *名称:治则治法代码
     *备注:根据辨证结果采用的治则治法名称术语
 	 *限制:GBT167513
 	 *
     */
     @Column(name="THERAPEUTIC_PRINCIPLES",length = 10,nullable = true)
     @FhirFieldValidate(name="THERAPEUTIC_PRINCIPLES",displayName="治则治法代码",maxLength=10,required=false,valuesRange="GBT167513")   
     private String therapeuticPrinciples;
    /**
     *名称:注意事项
     *
 	 *
 	 *
     */
     @Column(name="MATTERS_NEEDING_ATTENTION",length = 500,nullable = true)
     @FhirFieldValidate(name="MATTERS_NEEDING_ATTENTION",displayName="注意事项",maxLength=500,required=false,valuesRange="")   
     private String mattersNeedingAttention;
    /**
     *名称:转入诊疗计划
     *
 	 *
 	 *
     */
     @Column(name="REFERRALREQUEST_TREATMENT_OPTIONS",length = 500,nullable = true)
     @FhirFieldValidate(name="REFERRALREQUEST_TREATMENT_OPTIONS",displayName="转入诊疗计划",maxLength=500,required=false,valuesRange="")   
     private String referralrequestTreatmentOptions;
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
     *名称:医嘱内容
     *备注:中药饮片煎煮方法描述
 	 *
 	 *
     */
     @Column(name="CN_PRESCRIBE",length = 100,nullable = true)
     @FhirFieldValidate(name="CN_PRESCRIBE",displayName="医嘱内容",maxLength=100,required=false,valuesRange="")   
     private String cnPrescribe;
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
     *名称:诊疗过程描述
     *
 	 *
 	 *
     */
     @Column(name="TREAT_RESCUE_COURSE",length = 500,nullable = true)
     @FhirFieldValidate(name="TREAT_RESCUE_COURSE",displayName="诊疗过程描述",maxLength=500,required=false,valuesRange="")   
     private String treatRescueCourse;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
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
    
     public String getIpnTransferDepartmentRecordsId(){
       	return this.ipnTransferDepartmentRecordsId;
     }
     public void setIpnTransferDepartmentRecordsId(String ipnTransferDepartmentRecordsId){
       	this.ipnTransferDepartmentRecordsId=ipnTransferDepartmentRecordsId;
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
     public Float getAge(){
       	return this.age;
     }
     public void setAge(Float age){
       	this.age=age;
     }
     public String getRelationship(){
       	return this.relationship;
     }
     public void setRelationship(String relationship){
       	this.relationship=relationship;
     }
     public String getContactsName(){
       	return this.contactsName;
     }
     public void setContactsName(String contactsName){
       	this.contactsName=contactsName;
     }
     public String getContactsPhone(){
       	return this.contactsPhone;
     }
     public void setContactsPhone(String contactsPhone){
       	this.contactsPhone=contactsPhone;
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
     public Boolean getIfRritability(){
       	return this.ifRritability;
     }
     public void setIfRritability(Boolean ifRritability){
       	this.ifRritability=ifRritability;
     }
     public String getRritability(){
       	return this.rritability;
     }
     public void setRritability(String rritability){
       	this.rritability=rritability;
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
     public String getInhId(){
       	return this.inhId;
     }
     public void setInhId(String inhId){
       	this.inhId=inhId;
     }
     public String getInpatientRegistrationId(){
       	return this.inpatientRegistrationId;
     }
     public void setInpatientRegistrationId(String inpatientRegistrationId){
       	this.inpatientRegistrationId=inpatientRegistrationId;
     }
     public String getCnFourResult(){
       	return this.cnFourResult;
     }
     public void setCnFourResult(String cnFourResult){
       	this.cnFourResult=cnFourResult;
     }
     public String getChief(){
       	return this.chief;
     }
     public void setChief(String chief){
       	this.chief=chief;
     }
     public String getInCnSymDiagCode(){
       	return this.inCnSymDiagCode;
     }
     public void setInCnSymDiagCode(String inCnSymDiagCode){
       	this.inCnSymDiagCode=inCnSymDiagCode;
     }
     public String getInCnDisDiagCode(){
       	return this.inCnDisDiagCode;
     }
     public void setInCnDisDiagCode(String inCnDisDiagCode){
       	this.inCnDisDiagCode=inCnDisDiagCode;
     }
     public String getInDiagCode(){
       	return this.inDiagCode;
     }
     public void setInDiagCode(String inDiagCode){
       	this.inDiagCode=inDiagCode;
     }
     public String getInDiagValue(){
       	return this.inDiagValue;
     }
     public void setInDiagValue(String inDiagValue){
       	this.inDiagValue=inDiagValue;
     }
     public Date getInDiagDate(){
       	return this.inDiagDate;
     }
     public void setInDiagDate(Date inDiagDate){
       	this.inDiagDate=inDiagDate;
     }
     public String getInDiagDetails(){
       	return this.inDiagDetails;
     }
     public void setInDiagDetails(String inDiagDetails){
       	this.inDiagDetails=inDiagDetails;
     }
     public String getInDiagRecordCurrentCircumstances(){
       	return this.inDiagRecordCurrentCircumstances;
     }
     public void setInDiagRecordCurrentCircumstances(String inDiagRecordCurrentCircumstances){
       	this.inDiagRecordCurrentCircumstances=inDiagRecordCurrentCircumstances;
     }
     public String getInRecordCnSymDiagCode(){
       	return this.inRecordCnSymDiagCode;
     }
     public void setInRecordCnSymDiagCode(String inRecordCnSymDiagCode){
       	this.inRecordCnSymDiagCode=inRecordCnSymDiagCode;
     }
     public String getInRecordCnDisDiagCode(){
       	return this.inRecordCnDisDiagCode;
     }
     public void setInRecordCnDisDiagCode(String inRecordCnDisDiagCode){
       	this.inRecordCnDisDiagCode=inRecordCnDisDiagCode;
     }
     public String getInRecordDiagCode(){
       	return this.inRecordDiagCode;
     }
     public void setInRecordDiagCode(String inRecordDiagCode){
       	this.inRecordDiagCode=inRecordDiagCode;
     }
     public Date getInRecordDiagDate(){
       	return this.inRecordDiagDate;
     }
     public void setInRecordDiagDate(Date inRecordDiagDate){
       	this.inRecordDiagDate=inRecordDiagDate;
     }
     public String getInRecordDiagValue(){
       	return this.inRecordDiagValue;
     }
     public void setInRecordDiagValue(String inRecordDiagValue){
       	this.inRecordDiagValue=inRecordDiagValue;
     }
     public String getOutDpidId(){
       	return this.outDpidId;
     }
     public void setOutDpidId(String outDpidId){
       	this.outDpidId=outDpidId;
     }
     public String getOutDpidName(){
       	return this.outDpidName;
     }
     public void setOutDpidName(String outDpidName){
       	this.outDpidName=outDpidName;
     }
     public Date getInDate(){
       	return this.inDate;
     }
     public void setInDate(Date inDate){
       	this.inDate=inDate;
     }
     public Date getOutDate(){
       	return this.outDate;
     }
     public void setOutDate(Date outDate){
       	this.outDate=outDate;
     }
     public String getTransferReason(){
       	return this.transferReason;
     }
     public void setTransferReason(String transferReason){
       	this.transferReason=transferReason;
     }
     public String getInpatientTransferId(){
       	return this.inpatientTransferId;
     }
     public void setInpatientTransferId(String inpatientTransferId){
       	this.inpatientTransferId=inpatientTransferId;
     }
     public String getTransferStatus(){
       	return this.transferStatus;
     }
     public void setTransferStatus(String transferStatus){
       	this.transferStatus=transferStatus;
     }
     public String getRollOutOperatorId(){
       	return this.rollOutOperatorId;
     }
     public void setRollOutOperatorId(String rollOutOperatorId){
       	this.rollOutOperatorId=rollOutOperatorId;
     }
     public String getRollOutOperatorName(){
       	return this.rollOutOperatorName;
     }
     public void setRollOutOperatorName(String rollOutOperatorName){
       	this.rollOutOperatorName=rollOutOperatorName;
     }
     public String getRollOutOperatorPost(){
       	return this.rollOutOperatorPost;
     }
     public void setRollOutOperatorPost(String rollOutOperatorPost){
       	this.rollOutOperatorPost=rollOutOperatorPost;
     }
     public String getRollInOperatorId(){
       	return this.rollInOperatorId;
     }
     public void setRollInOperatorId(String rollInOperatorId){
       	this.rollInOperatorId=rollInOperatorId;
     }
     public String getRollInOperatorName(){
       	return this.rollInOperatorName;
     }
     public void setRollInOperatorName(String rollInOperatorName){
       	this.rollInOperatorName=rollInOperatorName;
     }
     public String getRollInOperatorPost(){
       	return this.rollInOperatorPost;
     }
     public void setRollInOperatorPost(String rollInOperatorPost){
       	this.rollInOperatorPost=rollInOperatorPost;
     }
     public String getInDpidId(){
       	return this.inDpidId;
     }
     public void setInDpidId(String inDpidId){
       	this.inDpidId=inDpidId;
     }
     public String getInDpidName(){
       	return this.inDpidName;
     }
     public void setInDpidName(String inDpidName){
       	this.inDpidName=inDpidName;
     }
     public String getTherapeuticPrinciples(){
       	return this.therapeuticPrinciples;
     }
     public void setTherapeuticPrinciples(String therapeuticPrinciples){
       	this.therapeuticPrinciples=therapeuticPrinciples;
     }
     public String getMattersNeedingAttention(){
       	return this.mattersNeedingAttention;
     }
     public void setMattersNeedingAttention(String mattersNeedingAttention){
       	this.mattersNeedingAttention=mattersNeedingAttention;
     }
     public String getReferralrequestTreatmentOptions(){
       	return this.referralrequestTreatmentOptions;
     }
     public void setReferralrequestTreatmentOptions(String referralrequestTreatmentOptions){
       	this.referralrequestTreatmentOptions=referralrequestTreatmentOptions;
     }
     public String getCnPrescribeDescr(){
       	return this.cnPrescribeDescr;
     }
     public void setCnPrescribeDescr(String cnPrescribeDescr){
       	this.cnPrescribeDescr=cnPrescribeDescr;
     }
     public String getCnPrescribe(){
       	return this.cnPrescribe;
     }
     public void setCnPrescribe(String cnPrescribe){
       	this.cnPrescribe=cnPrescribe;
     }
     public String getCnDrugWayCd(){
       	return this.cnDrugWayCd;
     }
     public void setCnDrugWayCd(String cnDrugWayCd){
       	this.cnDrugWayCd=cnDrugWayCd;
     }
     public String getTreatRescueCourse(){
       	return this.treatRescueCourse;
     }
     public void setTreatRescueCourse(String treatRescueCourse){
       	this.treatRescueCourse=treatRescueCourse;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
     public Date getStart(){
       	return this.start;
     }
     public void setStart(Date start){
       	this.start=start;
     }
}