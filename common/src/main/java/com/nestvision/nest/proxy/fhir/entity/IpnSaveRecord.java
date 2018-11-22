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
@Table(name = BaseEntity.TABLE_PREFIX + "IPN_SAVE_RECORD")
public class IpnSaveRecord extends FhirResourceEntity {

    /**
     *名称:抢救记录id
     *
 	 *
 	 *主键字段
     */
     @Column(name="IPN_SAVE_RECORD_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="IPN_SAVE_RECORD_ID",displayName="抢救记录id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String ipnSaveRecordId;
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
     *名称:签名医师id
     *
 	 *
 	 *
     */
     @Column(name="SIGN_DOCTOR_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="SIGN_DOCTOR_ID",displayName="签名医师id",maxLength=40,required=false,valuesRange="")   
     private String signDoctorId;
    /**
     *名称:签名医师姓名
     *
 	 *
 	 *
     */
     @Column(name="SIGN_DOCTOR_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="SIGN_DOCTOR_NAME",displayName="签名医师姓名",maxLength=20,required=false,valuesRange="")   
     private String signDoctorName;
    /**
     *名称:医师签名日期
     *
 	 *
 	 *
     */
     @Column(name="SIGN_DOCTOR_SIGN_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="SIGN_DOCTOR_SIGN_DATE",displayName="医师签名日期",required=false,valuesRange="")   
     private Date signDoctorSignDate;
    /**
     *名称:签名医师专业技术职务代码
     *
 	 *限制:CV9900374
 	 *
     */
     @Column(name="SIGN_DOCTOR_POST",length = 20,nullable = true)
     @FhirFieldValidate(name="SIGN_DOCTOR_POST",displayName="签名医师专业技术职务代码",maxLength=20,required=false,valuesRange="CV9900374")   
     private String signDoctorPost;
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
     @Column(name="CN_FOUR_RESULT",length = 200,nullable = true)
     @FhirFieldValidate(name="CN_FOUR_RESULT",displayName="中医&quot;四诊&quot;观察结果",maxLength=200,required=false,valuesRange="")   
     private String cnFourResult;
    /**
     *名称:病情变化情况
     *
 	 *
 	 *
     */
     @Column(name="CONDITION_CHANGES",length = 100,nullable = true)
     @FhirFieldValidate(name="CONDITION_CHANGES",displayName="病情变化情况",maxLength=100,required=false,valuesRange="")   
     private String conditionChanges;
    /**
     *名称:诊断编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="DIAG_CODE",displayName="诊断编码",maxLength=20,required=false,valuesRange="CV990111")   
     private String diagCode;
    /**
     *名称:诊断编码名称
     *
 	 *
 	 *
     */
     @Column(name="DIAG_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="DIAG_NAME",displayName="诊断编码名称",maxLength=40,required=false,valuesRange="")   
     private String diagName;
    /**
     *名称:诊断日期
     *
 	 *
 	 *
     */
     @Column(name="DIAGNOSIS_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DIAGNOSIS_DATE",displayName="诊断日期",required=false,valuesRange="")   
     private Date diagnosisDate;
    /**
     *名称:介入物名称
     *备注:实施手术操作时使用/放置的材料/药物的名称
 	 *
 	 *
     */
     @Column(name="INTERVENTION",length = 100,nullable = true)
     @FhirFieldValidate(name="INTERVENTION",displayName="介入物名称",maxLength=100,required=false,valuesRange="")   
     private String intervention;
    /**
     *名称:操作方法
     *
 	 *
 	 *
     */
     @Column(name="OPERATION_METHOD",length = 40,nullable = true)
     @FhirFieldValidate(name="OPERATION_METHOD",displayName="操作方法",maxLength=40,required=false,valuesRange="")   
     private String operationMethod;
    /**
     *名称:操作次数
     *
 	 *
 	 *
     */
     @Column(name="OPERATION_TIMES",length = 20,nullable = true)
     @FhirFieldValidate(name="OPERATION_TIMES",displayName="操作次数",maxLength=20,required=false,valuesRange="")   
     private String operationTimes;
    /**
     *名称:抢救措施
     *
 	 *
 	 *
     */
     @Column(name="RESCUE_MEASURES",length = 40,nullable = true)
     @FhirFieldValidate(name="RESCUE_MEASURES",displayName="抢救措施",maxLength=40,required=false,valuesRange="")   
     private String rescueMeasures;
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
     *名称:抢救开始日期时间
     *
 	 *
 	 *
     */
     @Column(name="SAVE_START_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="SAVE_START_DATE",displayName="抢救开始日期时间",required=false,valuesRange="")   
     private Date saveStartDate;
    /**
     *名称:抢救结束日期时间
     *
 	 *
 	 *
     */
     @Column(name="SAVE_END_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="SAVE_END_DATE",displayName="抢救结束日期时间",required=false,valuesRange="")   
     private Date saveEndDate;
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
     *名称:检查结果代码
     *
 	 *限制:CV9900012
 	 *
     */
     @Column(name="TEST_RESULT_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="TEST_RESULT_CD",displayName="检查结果代码",maxLength=20,required=false,valuesRange="CV9900012")   
     private String testResultCd;
    /**
     *名称:结果值的解释
     *
 	 *
 	 *
     */
     @Column(name="RESULT_INTERPRE",length = 200,nullable = true)
     @FhirFieldValidate(name="RESULT_INTERPRE",displayName="结果值的解释",maxLength=200,required=false,valuesRange="")   
     private String resultInterpre;
    /**
     *名称:结果类型代码
     *
 	 *限制:CV9900325
 	 *
     */
     @Column(name="TEST_TYPE_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="TEST_TYPE_CD",displayName="结果类型代码",maxLength=20,required=false,valuesRange="CV9900325")   
     private String testTypeCd;
    /**
     *名称:检查结果的客观说明
     *
 	 *
 	 *
     */
     @Column(name="REPORT_DESCRIPTION",length = 200,nullable = true)
     @FhirFieldValidate(name="REPORT_DESCRIPTION",displayName="检查结果的客观说明",maxLength=200,required=false,valuesRange="")   
     private String reportDescription;
    /**
     *名称:检查结果的主观说明
     *
 	 *
 	 *
     */
     @Column(name="REPORT_IMPRESSION",length = 200,nullable = true)
     @FhirFieldValidate(name="REPORT_IMPRESSION",displayName="检查结果的主观说明",maxLength=200,required=false,valuesRange="")   
     private String reportImpression;
    /**
     *名称:原系统检验/检查报告观察ID
     *
 	 *
 	 *
     */
     @Column(name="EXAMINATION_OBSERVATION_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="EXAMINATION_OBSERVATION_ID",displayName="原系统检验/检查报告观察ID",maxLength=40,required=false,valuesRange="")   
     private String examinationObservationId;
    /**
     *名称:报告项目代码
     *
 	 *
 	 *
     */
     @Column(name="REPORT_ITEM_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="REPORT_ITEM_CODE",displayName="报告项目代码",maxLength=20,required=false,valuesRange="")   
     private String reportItemCode;
    /**
     *名称:报告项目名称
     *
 	 *
 	 *
     */
     @Column(name="REPORT_ITEM_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="REPORT_ITEM_NAME",displayName="报告项目名称",maxLength=40,required=false,valuesRange="")   
     private String reportItemName;
    /**
     *名称:结果值
     *
 	 *
 	 *
     */
     @Column(name="VALUE",length = 8,nullable = true)
     @FhirFieldValidate(name="VALUE",displayName="结果值",maxLength=8,required=false,valuesRange="")   
     private Float value;
    /**
     *名称:结果单位
     *
 	 *
 	 *
     */
     @Column(name="UNIT",length = 20,nullable = true)
     @FhirFieldValidate(name="UNIT",displayName="结果单位",maxLength=20,required=false,valuesRange="")   
     private String unit;
    /**
     *名称:标本采集时间
     *
 	 *
 	 *
     */
     @Column(name="EFFECTIVEDATETIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="EFFECTIVEDATETIME",displayName="标本采集时间",required=false,valuesRange="")   
     private Date effectivedatetime;
    /**
     *名称:报告时间
     *
 	 *
 	 *
     */
     @Column(name="ISSUED",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="ISSUED",displayName="报告时间",required=false,valuesRange="")   
     private Date issued;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getIpnSaveRecordId(){
       	return this.ipnSaveRecordId;
     }
     public void setIpnSaveRecordId(String ipnSaveRecordId){
       	this.ipnSaveRecordId=ipnSaveRecordId;
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
     public String getSignDoctorId(){
       	return this.signDoctorId;
     }
     public void setSignDoctorId(String signDoctorId){
       	this.signDoctorId=signDoctorId;
     }
     public String getSignDoctorName(){
       	return this.signDoctorName;
     }
     public void setSignDoctorName(String signDoctorName){
       	this.signDoctorName=signDoctorName;
     }
     public Date getSignDoctorSignDate(){
       	return this.signDoctorSignDate;
     }
     public void setSignDoctorSignDate(Date signDoctorSignDate){
       	this.signDoctorSignDate=signDoctorSignDate;
     }
     public String getSignDoctorPost(){
       	return this.signDoctorPost;
     }
     public void setSignDoctorPost(String signDoctorPost){
       	this.signDoctorPost=signDoctorPost;
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
     public String getConditionChanges(){
       	return this.conditionChanges;
     }
     public void setConditionChanges(String conditionChanges){
       	this.conditionChanges=conditionChanges;
     }
     public String getDiagCode(){
       	return this.diagCode;
     }
     public void setDiagCode(String diagCode){
       	this.diagCode=diagCode;
     }
     public String getDiagName(){
       	return this.diagName;
     }
     public void setDiagName(String diagName){
       	this.diagName=diagName;
     }
     public Date getDiagnosisDate(){
       	return this.diagnosisDate;
     }
     public void setDiagnosisDate(Date diagnosisDate){
       	this.diagnosisDate=diagnosisDate;
     }
     public String getIntervention(){
       	return this.intervention;
     }
     public void setIntervention(String intervention){
       	this.intervention=intervention;
     }
     public String getOperationMethod(){
       	return this.operationMethod;
     }
     public void setOperationMethod(String operationMethod){
       	this.operationMethod=operationMethod;
     }
     public String getOperationTimes(){
       	return this.operationTimes;
     }
     public void setOperationTimes(String operationTimes){
       	this.operationTimes=operationTimes;
     }
     public String getRescueMeasures(){
       	return this.rescueMeasures;
     }
     public void setRescueMeasures(String rescueMeasures){
       	this.rescueMeasures=rescueMeasures;
     }
     public String getOperationId(){
       	return this.operationId;
     }
     public void setOperationId(String operationId){
       	this.operationId=operationId;
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
     public Date getSaveStartDate(){
       	return this.saveStartDate;
     }
     public void setSaveStartDate(Date saveStartDate){
       	this.saveStartDate=saveStartDate;
     }
     public Date getSaveEndDate(){
       	return this.saveEndDate;
     }
     public void setSaveEndDate(Date saveEndDate){
       	this.saveEndDate=saveEndDate;
     }
     public String getMattersNeedingAttention(){
       	return this.mattersNeedingAttention;
     }
     public void setMattersNeedingAttention(String mattersNeedingAttention){
       	this.mattersNeedingAttention=mattersNeedingAttention;
     }
     public String getTestResultCd(){
       	return this.testResultCd;
     }
     public void setTestResultCd(String testResultCd){
       	this.testResultCd=testResultCd;
     }
     public String getResultInterpre(){
       	return this.resultInterpre;
     }
     public void setResultInterpre(String resultInterpre){
       	this.resultInterpre=resultInterpre;
     }
     public String getTestTypeCd(){
       	return this.testTypeCd;
     }
     public void setTestTypeCd(String testTypeCd){
       	this.testTypeCd=testTypeCd;
     }
     public String getReportDescription(){
       	return this.reportDescription;
     }
     public void setReportDescription(String reportDescription){
       	this.reportDescription=reportDescription;
     }
     public String getReportImpression(){
       	return this.reportImpression;
     }
     public void setReportImpression(String reportImpression){
       	this.reportImpression=reportImpression;
     }
     public String getExaminationObservationId(){
       	return this.examinationObservationId;
     }
     public void setExaminationObservationId(String examinationObservationId){
       	this.examinationObservationId=examinationObservationId;
     }
     public String getReportItemCode(){
       	return this.reportItemCode;
     }
     public void setReportItemCode(String reportItemCode){
       	this.reportItemCode=reportItemCode;
     }
     public String getReportItemName(){
       	return this.reportItemName;
     }
     public void setReportItemName(String reportItemName){
       	this.reportItemName=reportItemName;
     }
     public Float getValue(){
       	return this.value;
     }
     public void setValue(Float value){
       	this.value=value;
     }
     public String getUnit(){
       	return this.unit;
     }
     public void setUnit(String unit){
       	this.unit=unit;
     }
     public Date getEffectivedatetime(){
       	return this.effectivedatetime;
     }
     public void setEffectivedatetime(Date effectivedatetime){
       	this.effectivedatetime=effectivedatetime;
     }
     public Date getIssued(){
       	return this.issued;
     }
     public void setIssued(Date issued){
       	this.issued=issued;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}