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
@Table(name = BaseEntity.TABLE_PREFIX + "HCR_PREOPERATIVE_DISCUSSION")
public class HcrPreoperativeDiscussion extends FhirResourceEntity {

    /**
     *名称:术前讨论id
     *
 	 *
 	 *主键字段
     */
     @Column(name="HCR_PREOPERATIVE_DISCUSSION_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="HCR_PREOPERATIVE_DISCUSSION_ID",displayName="术前讨论id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String hcrPreoperativeDiscussionId;
    /**
     *名称:讨论日期时间
     *
 	 *
 	 *
     */
     @Column(name="DISCUSSION_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DISCUSSION_DATE",displayName="讨论日期时间",required=false,valuesRange="")   
     private Date discussionDate;
    /**
     *名称:讨论地点
     *
 	 *
 	 *
     */
     @Column(name="DISCUSSION_SITES",length = 40,nullable = true)
     @FhirFieldValidate(name="DISCUSSION_SITES",displayName="讨论地点",maxLength=40,required=false,valuesRange="")   
     private String discussionSites;
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
     *名称:医师id
     *
 	 *
 	 *
     */
     @Column(name="DOCTOR_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="DOCTOR_ID",displayName="医师id",maxLength=40,required=false,valuesRange="")   
     private String doctorId;
    /**
     *名称:医师姓名
     *
 	 *
 	 *
     */
     @Column(name="DOCTOR_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="DOCTOR_NAME",displayName="医师姓名",maxLength=20,required=false,valuesRange="")   
     private String doctorName;
    /**
     *名称:医师签名日期
     *
 	 *
 	 *
     */
     @Column(name="DOCTOR_SIGN_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DOCTOR_SIGN_DATE",displayName="医师签名日期",required=false,valuesRange="")   
     private Date doctorSignDate;
    /**
     *名称:讨论主持人id
     *
 	 *
 	 *
     */
     @Column(name="DISCUSSION_MODERATOR_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="DISCUSSION_MODERATOR_ID",displayName="讨论主持人id",maxLength=40,required=false,valuesRange="")   
     private String discussionModeratorId;
    /**
     *名称:讨论主持人姓名
     *
 	 *
 	 *
     */
     @Column(name="DISCUSSION_MODERATOR_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="DISCUSSION_MODERATOR_NAME",displayName="讨论主持人姓名",maxLength=20,required=false,valuesRange="")   
     private String discussionModeratorName;
    /**
     *名称:讨论成员1id
     *
 	 *
 	 *
     */
     @Column(name="DISCUSSION_ONE_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="DISCUSSION_ONE_ID",displayName="讨论成员1id",maxLength=40,required=false,valuesRange="")   
     private String discussionOneId;
    /**
     *名称:讨论成员1姓名
     *
 	 *
 	 *
     */
     @Column(name="DISCUSSION_ONE_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="DISCUSSION_ONE_NAME",displayName="讨论成员1姓名",maxLength=20,required=false,valuesRange="")   
     private String discussionOneName;
    /**
     *名称:讨论成员2id
     *
 	 *
 	 *
     */
     @Column(name="DISCUSSION_TWO_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="DISCUSSION_TWO_ID",displayName="讨论成员2id",maxLength=40,required=false,valuesRange="")   
     private String discussionTwoId;
    /**
     *名称:讨论成员2姓名
     *
 	 *
 	 *
     */
     @Column(name="DISCUSSION_TWO_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="DISCUSSION_TWO_NAME",displayName="讨论成员2姓名",maxLength=20,required=false,valuesRange="")   
     private String discussionTwoName;
    /**
     *名称:讨论成员3id
     *
 	 *
 	 *
     */
     @Column(name="DISCUSSION_THREE_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="DISCUSSION_THREE_ID",displayName="讨论成员3id",maxLength=40,required=false,valuesRange="")   
     private String discussionThreeId;
    /**
     *名称:讨论成员3姓名
     *
 	 *
 	 *
     */
     @Column(name="DISCUSSION_THREE_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="DISCUSSION_THREE_NAME",displayName="讨论成员3姓名",maxLength=20,required=false,valuesRange="")   
     private String discussionThreeName;
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
     @Column(name="CN_FOUR_RESULT",length = 100,nullable = true)
     @FhirFieldValidate(name="CN_FOUR_RESULT",displayName="中医&quot;四诊&quot;观察结果",maxLength=100,required=false,valuesRange="")   
     private String cnFourResult;
    /**
     *名称:术前诊断-诊断依据代码
     *
 	 *限制:CV9900254
 	 *
     */
     @Column(name="HIGHEST_DIAG_CD",length = 20,nullable = false)
     @FhirFieldValidate(name="HIGHEST_DIAG_CD",displayName="术前诊断-诊断依据代码",maxLength=20,required=true,valuesRange="CV9900254")   
     private String highestDiagCd;
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
     *名称:手术者签名日期
     *
 	 *
 	 *
     */
     @Column(name="OPERATIVE_SIGN_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="OPERATIVE_SIGN_DATE",displayName="手术者签名日期",required=false,valuesRange="")   
     private Date operativeSignDate;
    /**
     *名称:手术者专业技术职务代码
     *
 	 *限制:CV9900374
 	 *
     */
     @Column(name="OPERATIVE_POST",length = 20,nullable = true)
     @FhirFieldValidate(name="OPERATIVE_POST",displayName="手术者专业技术职务代码",maxLength=20,required=false,valuesRange="CV9900374")   
     private String operativePost;
    /**
     *名称:麻醉医师id
     *
 	 *
 	 *
     */
     @Column(name="ANAESTHETIC",length = 40,nullable = true)
     @FhirFieldValidate(name="ANAESTHETIC",displayName="麻醉医师id",maxLength=40,required=false,valuesRange="")   
     private String anaesthetic;
    /**
     *名称:麻醉医师姓名
     *
 	 *
 	 *
     */
     @Column(name="ANAESTHETIC_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="ANAESTHETIC_NAME",displayName="麻醉医师姓名",maxLength=20,required=false,valuesRange="")   
     private String anaestheticName;
    /**
     *名称:麻醉医师签名日期
     *
 	 *
 	 *
     */
     @Column(name="ANAESTHETIC_SIGN_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="ANAESTHETIC_SIGN_DATE",displayName="麻醉医师签名日期",required=false,valuesRange="")   
     private Date anaestheticSignDate;
    /**
     *名称:麻醉医师专业技术职务代码
     *
 	 *限制:CV9900374
 	 *
     */
     @Column(name="ANAESTHETIC_POST",length = 20,nullable = true)
     @FhirFieldValidate(name="ANAESTHETIC_POST",displayName="麻醉医师专业技术职务代码",maxLength=20,required=false,valuesRange="CV9900374")   
     private String anaestheticPost;
    /**
     *名称:手术过程
     *
 	 *
 	 *
     */
     @Column(name="OPERATION_COURSES",length = 200,nullable = true)
     @FhirFieldValidate(name="OPERATION_COURSES",displayName="手术过程",maxLength=200,required=false,valuesRange="")   
     private String operationCourses;
    /**
     *名称:手术单号
     *
 	 *
 	 *
     */
     @Column(name="OPERATION_ID",length = 20,nullable = true)
     @FhirFieldValidate(name="OPERATION_ID",displayName="手术单号",maxLength=20,required=false,valuesRange="")   
     private String operationId;
    /**
     *名称:麻醉方法代码
     *
 	 *限制:CV0600103
 	 *
     */
     @Column(name="ANESTHESIA_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="ANESTHESIA_CODE",displayName="麻醉方法代码",maxLength=20,required=false,valuesRange="CV0600103")   
     private String anesthesiaCode;
    /**
     *名称:麻醉方法
     *
 	 *
 	 *
     */
     @Column(name="ANESTHESIA_WAY",length = 100,nullable = true)
     @FhirFieldValidate(name="ANESTHESIA_WAY",displayName="麻醉方法",maxLength=100,required=false,valuesRange="")   
     private String anesthesiaWay;
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
 	 *
 	 *
     */
     @Column(name="PART_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="PART_NAME",displayName="手术操作目标部位名称",maxLength=20,required=false,valuesRange="")   
     private String partName;
    /**
     *名称:手术开始时间
     *
 	 *
 	 *
     */
     @Column(name="PROCEDURE_START",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="PROCEDURE_START",displayName="手术开始时间",required=false,valuesRange="")   
     private Date procedureStart;
    /**
     *名称:手术结束时间
     *
 	 *
 	 *
     */
     @Column(name="PROCEDURE_END",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="PROCEDURE_END",displayName="手术结束时间",required=false,valuesRange="")   
     private Date procedureEnd;
    /**
     *名称:手术要点
     *
 	 *
 	 *
     */
     @Column(name="OPERATIVE_KEY_POINTS",length = 100,nullable = true)
     @FhirFieldValidate(name="OPERATIVE_KEY_POINTS",displayName="手术要点",maxLength=100,required=false,valuesRange="")   
     private String operativeKeyPoints;
    /**
     *名称:术前准备
     *
 	 *
 	 *
     */
     @Column(name="PRE_OPERATIVE_PREPARATION",length = 100,nullable = true)
     @FhirFieldValidate(name="PRE_OPERATIVE_PREPARATION",displayName="术前准备",maxLength=100,required=false,valuesRange="")   
     private String preOperativePreparation;
    /**
     *名称:手术指征
     *
 	 *
 	 *
     */
     @Column(name="OPERATION_INDICATION",length = 100,nullable = true)
     @FhirFieldValidate(name="OPERATION_INDICATION",displayName="手术指征",maxLength=100,required=false,valuesRange="")   
     private String operationIndication;
    /**
     *名称:手术方案
     *
 	 *
 	 *
     */
     @Column(name="OPERATIVE_PLAN",length = 100,nullable = true)
     @FhirFieldValidate(name="OPERATIVE_PLAN",displayName="手术方案",maxLength=100,required=false,valuesRange="")   
     private String operativePlan;
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
     *名称:讨论意见
     *
 	 *
 	 *
     */
     @Column(name="DISCUSS_OPINION",length = 200,nullable = true)
     @FhirFieldValidate(name="DISCUSS_OPINION",displayName="讨论意见",maxLength=200,required=false,valuesRange="")   
     private String discussOpinion;
    /**
     *名称:讨论结论
     *
 	 *
 	 *
     */
     @Column(name="DISCUSS_CONCLUDE",length = 200,nullable = true)
     @FhirFieldValidate(name="DISCUSS_CONCLUDE",displayName="讨论结论",maxLength=200,required=false,valuesRange="")   
     private String discussConclude;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getHcrPreoperativeDiscussionId(){
       	return this.hcrPreoperativeDiscussionId;
     }
     public void setHcrPreoperativeDiscussionId(String hcrPreoperativeDiscussionId){
       	this.hcrPreoperativeDiscussionId=hcrPreoperativeDiscussionId;
     }
     public Date getDiscussionDate(){
       	return this.discussionDate;
     }
     public void setDiscussionDate(Date discussionDate){
       	this.discussionDate=discussionDate;
     }
     public String getDiscussionSites(){
       	return this.discussionSites;
     }
     public void setDiscussionSites(String discussionSites){
       	this.discussionSites=discussionSites;
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
     public String getDoctorId(){
       	return this.doctorId;
     }
     public void setDoctorId(String doctorId){
       	this.doctorId=doctorId;
     }
     public String getDoctorName(){
       	return this.doctorName;
     }
     public void setDoctorName(String doctorName){
       	this.doctorName=doctorName;
     }
     public Date getDoctorSignDate(){
       	return this.doctorSignDate;
     }
     public void setDoctorSignDate(Date doctorSignDate){
       	this.doctorSignDate=doctorSignDate;
     }
     public String getDiscussionModeratorId(){
       	return this.discussionModeratorId;
     }
     public void setDiscussionModeratorId(String discussionModeratorId){
       	this.discussionModeratorId=discussionModeratorId;
     }
     public String getDiscussionModeratorName(){
       	return this.discussionModeratorName;
     }
     public void setDiscussionModeratorName(String discussionModeratorName){
       	this.discussionModeratorName=discussionModeratorName;
     }
     public String getDiscussionOneId(){
       	return this.discussionOneId;
     }
     public void setDiscussionOneId(String discussionOneId){
       	this.discussionOneId=discussionOneId;
     }
     public String getDiscussionOneName(){
       	return this.discussionOneName;
     }
     public void setDiscussionOneName(String discussionOneName){
       	this.discussionOneName=discussionOneName;
     }
     public String getDiscussionTwoId(){
       	return this.discussionTwoId;
     }
     public void setDiscussionTwoId(String discussionTwoId){
       	this.discussionTwoId=discussionTwoId;
     }
     public String getDiscussionTwoName(){
       	return this.discussionTwoName;
     }
     public void setDiscussionTwoName(String discussionTwoName){
       	this.discussionTwoName=discussionTwoName;
     }
     public String getDiscussionThreeId(){
       	return this.discussionThreeId;
     }
     public void setDiscussionThreeId(String discussionThreeId){
       	this.discussionThreeId=discussionThreeId;
     }
     public String getDiscussionThreeName(){
       	return this.discussionThreeName;
     }
     public void setDiscussionThreeName(String discussionThreeName){
       	this.discussionThreeName=discussionThreeName;
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
     public Date getStart(){
       	return this.start;
     }
     public void setStart(Date start){
       	this.start=start;
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
     public String getHighestDiagCd(){
       	return this.highestDiagCd;
     }
     public void setHighestDiagCd(String highestDiagCd){
       	this.highestDiagCd=highestDiagCd;
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
     public Date getOperativeSignDate(){
       	return this.operativeSignDate;
     }
     public void setOperativeSignDate(Date operativeSignDate){
       	this.operativeSignDate=operativeSignDate;
     }
     public String getOperativePost(){
       	return this.operativePost;
     }
     public void setOperativePost(String operativePost){
       	this.operativePost=operativePost;
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
     public Date getAnaestheticSignDate(){
       	return this.anaestheticSignDate;
     }
     public void setAnaestheticSignDate(Date anaestheticSignDate){
       	this.anaestheticSignDate=anaestheticSignDate;
     }
     public String getAnaestheticPost(){
       	return this.anaestheticPost;
     }
     public void setAnaestheticPost(String anaestheticPost){
       	this.anaestheticPost=anaestheticPost;
     }
     public String getOperationCourses(){
       	return this.operationCourses;
     }
     public void setOperationCourses(String operationCourses){
       	this.operationCourses=operationCourses;
     }
     public String getOperationId(){
       	return this.operationId;
     }
     public void setOperationId(String operationId){
       	this.operationId=operationId;
     }
     public String getAnesthesiaCode(){
       	return this.anesthesiaCode;
     }
     public void setAnesthesiaCode(String anesthesiaCode){
       	this.anesthesiaCode=anesthesiaCode;
     }
     public String getAnesthesiaWay(){
       	return this.anesthesiaWay;
     }
     public void setAnesthesiaWay(String anesthesiaWay){
       	this.anesthesiaWay=anesthesiaWay;
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
     public Date getProcedureStart(){
       	return this.procedureStart;
     }
     public void setProcedureStart(Date procedureStart){
       	this.procedureStart=procedureStart;
     }
     public Date getProcedureEnd(){
       	return this.procedureEnd;
     }
     public void setProcedureEnd(Date procedureEnd){
       	this.procedureEnd=procedureEnd;
     }
     public String getOperativeKeyPoints(){
       	return this.operativeKeyPoints;
     }
     public void setOperativeKeyPoints(String operativeKeyPoints){
       	this.operativeKeyPoints=operativeKeyPoints;
     }
     public String getPreOperativePreparation(){
       	return this.preOperativePreparation;
     }
     public void setPreOperativePreparation(String preOperativePreparation){
       	this.preOperativePreparation=preOperativePreparation;
     }
     public String getOperationIndication(){
       	return this.operationIndication;
     }
     public void setOperationIndication(String operationIndication){
       	this.operationIndication=operationIndication;
     }
     public String getOperativePlan(){
       	return this.operativePlan;
     }
     public void setOperativePlan(String operativePlan){
       	this.operativePlan=operativePlan;
     }
     public String getMattersNeedingAttention(){
       	return this.mattersNeedingAttention;
     }
     public void setMattersNeedingAttention(String mattersNeedingAttention){
       	this.mattersNeedingAttention=mattersNeedingAttention;
     }
     public String getDiscussOpinion(){
       	return this.discussOpinion;
     }
     public void setDiscussOpinion(String discussOpinion){
       	this.discussOpinion=discussOpinion;
     }
     public String getDiscussConclude(){
       	return this.discussConclude;
     }
     public void setDiscussConclude(String discussConclude){
       	this.discussConclude=discussConclude;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}