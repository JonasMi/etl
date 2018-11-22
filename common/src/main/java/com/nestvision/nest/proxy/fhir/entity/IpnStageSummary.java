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
@Table(name = BaseEntity.TABLE_PREFIX + "IPN_STAGE_SUMMARY")
public class IpnStageSummary extends FhirResourceEntity {

    /**
     *名称:阶段小结id
     *
 	 *
 	 *主键字段
     */
     @Column(name="IPN_STAGE_SUMMARY_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="IPN_STAGE_SUMMARY_ID",displayName="阶段小结id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String ipnStageSummaryId;
    /**
     *名称:病案号
     *
 	 *
 	 *
     */
     @Column(name="CASE_NO",length = 20,nullable = true)
     @FhirFieldValidate(name="CASE_NO",displayName="病案号",maxLength=20,required=false,valuesRange="")   
     private String caseNo;
    /**
     *名称:住院次数
     *
 	 *
 	 *
     */
     @Column(name="INPAT_TIMES",length = 8,nullable = true)
     @FhirFieldValidate(name="INPAT_TIMES",displayName="住院次数",maxLength=8,required=false,valuesRange="")   
     private Integer inpatTimes;
    /**
     *名称:备注
     *
 	 *
 	 *
     */
     @Column(name="REMARKS",columnDefinition="text")
     @FhirFieldValidate(name="REMARKS",displayName="备注",required=false,valuesRange="")   
     private String remarks;
    /**
     *名称:小结日期时间
     *
 	 *
 	 *
     */
     @Column(name="DOCUMENTATIONOF_SERVICEEVENT_EFFECTIVETIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DOCUMENTATIONOF_SERVICEEVENT_EFFECTIVETIME",displayName="小结日期时间",required=false,valuesRange="")   
     private Date documentationofServiceeventEffectivetime;
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
     *名称:经治医师id
     *
 	 *
 	 *
     */
     @Column(name="CERTIFIED_PHYSICIAN_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="CERTIFIED_PHYSICIAN_ID",displayName="经治医师id",maxLength=40,required=false,valuesRange="")   
     private String certifiedPhysicianId;
    /**
     *名称:经治医师姓名
     *
 	 *
 	 *
     */
     @Column(name="CERTIFIED_PHYSICIAN_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="CERTIFIED_PHYSICIAN_NAME",displayName="经治医师姓名",maxLength=20,required=false,valuesRange="")   
     private String certifiedPhysicianName;
    /**
     *名称:经治医师签名日期
     *
 	 *
 	 *
     */
     @Column(name="CERTIFIED_PHYSICIAN_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="CERTIFIED_PHYSICIAN_DATE",displayName="经治医师签名日期",required=false,valuesRange="")   
     private Date certifiedPhysicianDate;
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
     *名称:今后治疗方案
     *
 	 *
 	 *
     */
     @Column(name="FUTURE_TREATMENT_OPTIONS",length = 500,nullable = true)
     @FhirFieldValidate(name="FUTURE_TREATMENT_OPTIONS",displayName="今后治疗方案",maxLength=500,required=false,valuesRange="")   
     private String futureTreatmentOptions;
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
    
     public String getIpnStageSummaryId(){
       	return this.ipnStageSummaryId;
     }
     public void setIpnStageSummaryId(String ipnStageSummaryId){
       	this.ipnStageSummaryId=ipnStageSummaryId;
     }
     public String getCaseNo(){
       	return this.caseNo;
     }
     public void setCaseNo(String caseNo){
       	this.caseNo=caseNo;
     }
     public Integer getInpatTimes(){
       	return this.inpatTimes;
     }
     public void setInpatTimes(Integer inpatTimes){
       	this.inpatTimes=inpatTimes;
     }
     public String getRemarks(){
       	return this.remarks;
     }
     public void setRemarks(String remarks){
       	this.remarks=remarks;
     }
     public Date getDocumentationofServiceeventEffectivetime(){
       	return this.documentationofServiceeventEffectivetime;
     }
     public void setDocumentationofServiceeventEffectivetime(Date documentationofServiceeventEffectivetime){
       	this.documentationofServiceeventEffectivetime=documentationofServiceeventEffectivetime;
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
     public String getCertifiedPhysicianId(){
       	return this.certifiedPhysicianId;
     }
     public void setCertifiedPhysicianId(String certifiedPhysicianId){
       	this.certifiedPhysicianId=certifiedPhysicianId;
     }
     public String getCertifiedPhysicianName(){
       	return this.certifiedPhysicianName;
     }
     public void setCertifiedPhysicianName(String certifiedPhysicianName){
       	this.certifiedPhysicianName=certifiedPhysicianName;
     }
     public Date getCertifiedPhysicianDate(){
       	return this.certifiedPhysicianDate;
     }
     public void setCertifiedPhysicianDate(Date certifiedPhysicianDate){
       	this.certifiedPhysicianDate=certifiedPhysicianDate;
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
     public String getFutureTreatmentOptions(){
       	return this.futureTreatmentOptions;
     }
     public void setFutureTreatmentOptions(String futureTreatmentOptions){
       	this.futureTreatmentOptions=futureTreatmentOptions;
     }
     public String getTherapeuticPrinciples(){
       	return this.therapeuticPrinciples;
     }
     public void setTherapeuticPrinciples(String therapeuticPrinciples){
       	this.therapeuticPrinciples=therapeuticPrinciples;
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