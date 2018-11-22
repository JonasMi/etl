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
@Table(name = BaseEntity.TABLE_PREFIX + "PREOPERATIVE_INTERVIEW_RECORD")
public class PreoperativeInterviewRecord extends FhirResourceEntity {

    /**
     *名称:院内麻醉术前访视记录id
     *
 	 *
 	 *主键字段
     */
     @Column(name="PREOPERATIVE_INTERVIEW_RECORD_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="PREOPERATIVE_INTERVIEW_RECORD_ID",displayName="院内麻醉术前访视记录id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String preoperativeInterviewRecordId;
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
     *名称:就诊类型
     *
 	 *限制:CV9900340
 	 *
     */
     @Column(name="VISITING_TYPE",length = 20,nullable = true)
     @FhirFieldValidate(name="VISITING_TYPE",displayName="就诊类型",maxLength=20,required=false,valuesRange="CV9900340")   
     private String visitingType;
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
     *名称:术前合并疾病
     *备注:患者在接受手术前，除与手术相关的诊断外，同时合并的其他疾病
 	 *
 	 *
     */
     @Column(name="DISEASE_BEFORE_OPERATION",length = 200,nullable = true)
     @FhirFieldValidate(name="DISEASE_BEFORE_OPERATION",displayName="术前合并疾病",maxLength=200,required=false,valuesRange="")   
     private String diseaseBeforeOperation;
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
     *名称:现病史
     *
 	 *
 	 *
     */
     @Column(name="ILLNESS",columnDefinition="text")
     @FhirFieldValidate(name="ILLNESS",displayName="现病史",required=false,valuesRange="")   
     private String illness;
    /**
     *名称:过敏史描述
     *
 	 *
 	 *
     */
     @Column(name="RRITABILITY",columnDefinition="text")
     @FhirFieldValidate(name="RRITABILITY",displayName="过敏史描述",required=false,valuesRange="")   
     private String rritability;
    /**
     *名称:体重
     *备注:患者体重的测量值，计量单位为kg
 	 *
 	 *
     */
     @Column(name="BODY_WEIGHT",length = 8,nullable = true)
     @FhirFieldValidate(name="BODY_WEIGHT",displayName="体重",maxLength=8,required=false,valuesRange="")   
     private Float bodyWeight;
    /**
     *名称:一般状况
     *备注:对患者一般状况检查结果的详细描述，包括其发育状况、营养状况、体味、步态、面容与表情、意识，检查能否合作等等
 	 *
 	 *
     */
     @Column(name="GENERAL_SITU_EXAM_RESULT",columnDefinition="text")
     @FhirFieldValidate(name="GENERAL_SITU_EXAM_RESULT",displayName="一般状况",required=false,valuesRange="")   
     private String generalSituExamResult;
    /**
     *名称:精神状态正常标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="SPIRIT_NORMAL_STATUS",length = 5,nullable = true)
     @FhirFieldValidate(name="SPIRIT_NORMAL_STATUS",displayName="精神状态正常标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean spiritNormalStatus;
    /**
     *名称:心脏听诊结果
     *
 	 *
 	 *
     */
     @Column(name="CARDIAC_AUSCULTATION_RESULT",length = 200,nullable = true)
     @FhirFieldValidate(name="CARDIAC_AUSCULTATION_RESULT",displayName="心脏听诊结果",maxLength=200,required=false,valuesRange="")   
     private String cardiacAuscultationResult;
    /**
     *名称:肺部听诊结果
     *
 	 *
 	 *
     */
     @Column(name="LUNG_AUSCULTATION_RESULT",length = 200,nullable = true)
     @FhirFieldValidate(name="LUNG_AUSCULTATION_RESULT",displayName="肺部听诊结果",maxLength=200,required=false,valuesRange="")   
     private String lungAuscultationResult;
    /**
     *名称:四肢检查结果
     *
 	 *
 	 *
     */
     @Column(name="LIMBS",length = 200,nullable = true)
     @FhirFieldValidate(name="LIMBS",displayName="四肢检查结果",maxLength=200,required=false,valuesRange="")   
     private String limbs;
    /**
     *名称:脊柱检查结果
     *
 	 *
 	 *
     */
     @Column(name="SPINE",length = 200,nullable = true)
     @FhirFieldValidate(name="SPINE",displayName="脊柱检查结果",maxLength=200,required=false,valuesRange="")   
     private String spine;
    /**
     *名称:腹部检查结果
     *
 	 *
 	 *
     */
     @Column(name="BELLY",length = 200,nullable = true)
     @FhirFieldValidate(name="BELLY",displayName="腹部检查结果",maxLength=200,required=false,valuesRange="")   
     private String belly;
    /**
     *名称:气管检查结果
     *
 	 *
 	 *
     */
     @Column(name="TRACHEA",length = 200,nullable = true)
     @FhirFieldValidate(name="TRACHEA",displayName="气管检查结果",maxLength=200,required=false,valuesRange="")   
     private String trachea;
    /**
     *名称:牙齿检查结果
     *
 	 *
 	 *
     */
     @Column(name="DENTAL_EXAMINATION_RESULT",length = 200,nullable = true)
     @FhirFieldValidate(name="DENTAL_EXAMINATION_RESULT",displayName="牙齿检查结果",maxLength=200,required=false,valuesRange="")   
     private String dentalExaminationResult;
    /**
     *名称:ABO血型代码
     *
 	 *限制:CV0450005
 	 *
     */
     @Column(name="ABO_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="ABO_CD",displayName="ABO血型代码",maxLength=20,required=false,valuesRange="CV0450005")   
     private String aboCd;
    /**
     *名称:RH血型代码
     *
 	 *限制:CV0450020
 	 *
     */
     @Column(name="RH_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="RH_CD",displayName="RH血型代码",maxLength=20,required=false,valuesRange="CV0450020")   
     private String rhCd;
    /**
     *名称:心电图检查结果
     *
 	 *
 	 *
     */
     @Column(name="ECG_RESULT",length = 200,nullable = true)
     @FhirFieldValidate(name="ECG_RESULT",displayName="心电图检查结果",maxLength=200,required=false,valuesRange="")   
     private String ecgResult;
    /**
     *名称:胸部X线检查结果
     *
 	 *
 	 *
     */
     @Column(name="XRAY_EXAM_RESULT",length = 200,nullable = true)
     @FhirFieldValidate(name="XRAY_EXAM_RESULT",displayName="胸部X线检查结果",maxLength=200,required=false,valuesRange="")   
     private String xrayExamResult;
    /**
     *名称:CT检查结果
     *
 	 *
 	 *
     */
     @Column(name="CT_EXAM_RESULT",length = 200,nullable = true)
     @FhirFieldValidate(name="CT_EXAM_RESULT",displayName="CT检查结果",maxLength=200,required=false,valuesRange="")   
     private String ctExamResult;
    /**
     *名称:B超检查结果
     *
 	 *
 	 *
     */
     @Column(name="BSCAN_RESULT_DESCR",length = 200,nullable = true)
     @FhirFieldValidate(name="BSCAN_RESULT_DESCR",displayName="B超检查结果",maxLength=200,required=false,valuesRange="")   
     private String bscanResultDescr;
    /**
     *名称:MRI超检查结果
     *
 	 *
 	 *
     */
     @Column(name="MRI_EXAM_RESULT",length = 200,nullable = true)
     @FhirFieldValidate(name="MRI_EXAM_RESULT",displayName="MRI超检查结果",maxLength=200,required=false,valuesRange="")   
     private String mriExamResult;
    /**
     *名称:肺功能检查结果
     *
 	 *
 	 *
     */
     @Column(name="PULMONARY_EXAM_RESULT",length = 200,nullable = true)
     @FhirFieldValidate(name="PULMONARY_EXAM_RESULT",displayName="肺功能检查结果",maxLength=200,required=false,valuesRange="")   
     private String pulmonaryExamResult;
    /**
     *名称:血常规检查结果
     *
 	 *
 	 *
     */
     @Column(name="ROUTINE_TEST_RESULT",length = 200,nullable = true)
     @FhirFieldValidate(name="ROUTINE_TEST_RESULT",displayName="血常规检查结果",maxLength=200,required=false,valuesRange="")   
     private String routineTestResult;
    /**
     *名称:尿常规检查结果
     *
 	 *
 	 *
     */
     @Column(name="URINE_TEST_RESULT",length = 200,nullable = true)
     @FhirFieldValidate(name="URINE_TEST_RESULT",displayName="尿常规检查结果",maxLength=200,required=false,valuesRange="")   
     private String urineTestResult;
    /**
     *名称:凝血功能检查结果
     *
 	 *
 	 *
     */
     @Column(name="BLOOD_COAGULA_TEST_RESULT",length = 200,nullable = true)
     @FhirFieldValidate(name="BLOOD_COAGULA_TEST_RESULT",displayName="凝血功能检查结果",maxLength=200,required=false,valuesRange="")   
     private String bloodCoagulaTestResult;
    /**
     *名称:肝功能检查结果
     *
 	 *
 	 *
     */
     @Column(name="LIVER_TEST_RESULT",length = 200,nullable = true)
     @FhirFieldValidate(name="LIVER_TEST_RESULT",displayName="肝功能检查结果",maxLength=200,required=false,valuesRange="")   
     private String liverTestResult;
    /**
     *名称:血气分析检查结果
     *
 	 *
 	 *
     */
     @Column(name="BLOOD_GAS_TEST_RESULT",length = 200,nullable = true)
     @FhirFieldValidate(name="BLOOD_GAS_TEST_RESULT",displayName="血气分析检查结果",maxLength=200,required=false,valuesRange="")   
     private String bloodGasTestResult;
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
     *名称:手术间编号
     *
 	 *
 	 *
     */
     @Column(name="OP_ROOM",length = 20,nullable = true)
     @FhirFieldValidate(name="OP_ROOM",displayName="手术间编号",maxLength=20,required=false,valuesRange="")   
     private String opRoom;
    /**
     *名称:拟实施麻醉方法代码
     *
 	 *
 	 *
     */
     @Column(name="PROPOSED_ANESTHESIA_METHOD",length = 20,nullable = true)
     @FhirFieldValidate(name="PROPOSED_ANESTHESIA_METHOD",displayName="拟实施麻醉方法代码",maxLength=20,required=false,valuesRange="")   
     private String proposedAnesthesiaMethod;
    /**
     *名称:术前麻醉医嘱
     *
 	 *
 	 *
     */
     @Column(name="OP_PRE_ANES_ORDER",length = 100,nullable = true)
     @FhirFieldValidate(name="OP_PRE_ANES_ORDER",displayName="术前麻醉医嘱",maxLength=100,required=false,valuesRange="")   
     private String opPreAnesOrder;
    /**
     *名称:麻醉适应证
     *
 	 *
 	 *
     */
     @Column(name="ANES_INDICATION",length = 100,nullable = true)
     @FhirFieldValidate(name="ANES_INDICATION",displayName="麻醉适应证",maxLength=100,required=false,valuesRange="")   
     private String anesIndication;
    /**
     *名称:注意事项
     *
 	 *
 	 *
     */
     @Column(name="MATTERS_NEEDING_ATTENTION",length = 200,nullable = true)
     @FhirFieldValidate(name="MATTERS_NEEDING_ATTENTION",displayName="注意事项",maxLength=200,required=false,valuesRange="")   
     private String mattersNeedingAttention;
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
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getPreoperativeInterviewRecordId(){
       	return this.preoperativeInterviewRecordId;
     }
     public void setPreoperativeInterviewRecordId(String preoperativeInterviewRecordId){
       	this.preoperativeInterviewRecordId=preoperativeInterviewRecordId;
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
     public String getVisitingType(){
       	return this.visitingType;
     }
     public void setVisitingType(String visitingType){
       	this.visitingType=visitingType;
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
     public String getDiseaseBeforeOperation(){
       	return this.diseaseBeforeOperation;
     }
     public void setDiseaseBeforeOperation(String diseaseBeforeOperation){
       	this.diseaseBeforeOperation=diseaseBeforeOperation;
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
     public String getIllness(){
       	return this.illness;
     }
     public void setIllness(String illness){
       	this.illness=illness;
     }
     public String getRritability(){
       	return this.rritability;
     }
     public void setRritability(String rritability){
       	this.rritability=rritability;
     }
     public Float getBodyWeight(){
       	return this.bodyWeight;
     }
     public void setBodyWeight(Float bodyWeight){
       	this.bodyWeight=bodyWeight;
     }
     public String getGeneralSituExamResult(){
       	return this.generalSituExamResult;
     }
     public void setGeneralSituExamResult(String generalSituExamResult){
       	this.generalSituExamResult=generalSituExamResult;
     }
     public Boolean getSpiritNormalStatus(){
       	return this.spiritNormalStatus;
     }
     public void setSpiritNormalStatus(Boolean spiritNormalStatus){
       	this.spiritNormalStatus=spiritNormalStatus;
     }
     public String getCardiacAuscultationResult(){
       	return this.cardiacAuscultationResult;
     }
     public void setCardiacAuscultationResult(String cardiacAuscultationResult){
       	this.cardiacAuscultationResult=cardiacAuscultationResult;
     }
     public String getLungAuscultationResult(){
       	return this.lungAuscultationResult;
     }
     public void setLungAuscultationResult(String lungAuscultationResult){
       	this.lungAuscultationResult=lungAuscultationResult;
     }
     public String getLimbs(){
       	return this.limbs;
     }
     public void setLimbs(String limbs){
       	this.limbs=limbs;
     }
     public String getSpine(){
       	return this.spine;
     }
     public void setSpine(String spine){
       	this.spine=spine;
     }
     public String getBelly(){
       	return this.belly;
     }
     public void setBelly(String belly){
       	this.belly=belly;
     }
     public String getTrachea(){
       	return this.trachea;
     }
     public void setTrachea(String trachea){
       	this.trachea=trachea;
     }
     public String getDentalExaminationResult(){
       	return this.dentalExaminationResult;
     }
     public void setDentalExaminationResult(String dentalExaminationResult){
       	this.dentalExaminationResult=dentalExaminationResult;
     }
     public String getAboCd(){
       	return this.aboCd;
     }
     public void setAboCd(String aboCd){
       	this.aboCd=aboCd;
     }
     public String getRhCd(){
       	return this.rhCd;
     }
     public void setRhCd(String rhCd){
       	this.rhCd=rhCd;
     }
     public String getEcgResult(){
       	return this.ecgResult;
     }
     public void setEcgResult(String ecgResult){
       	this.ecgResult=ecgResult;
     }
     public String getXrayExamResult(){
       	return this.xrayExamResult;
     }
     public void setXrayExamResult(String xrayExamResult){
       	this.xrayExamResult=xrayExamResult;
     }
     public String getCtExamResult(){
       	return this.ctExamResult;
     }
     public void setCtExamResult(String ctExamResult){
       	this.ctExamResult=ctExamResult;
     }
     public String getBscanResultDescr(){
       	return this.bscanResultDescr;
     }
     public void setBscanResultDescr(String bscanResultDescr){
       	this.bscanResultDescr=bscanResultDescr;
     }
     public String getMriExamResult(){
       	return this.mriExamResult;
     }
     public void setMriExamResult(String mriExamResult){
       	this.mriExamResult=mriExamResult;
     }
     public String getPulmonaryExamResult(){
       	return this.pulmonaryExamResult;
     }
     public void setPulmonaryExamResult(String pulmonaryExamResult){
       	this.pulmonaryExamResult=pulmonaryExamResult;
     }
     public String getRoutineTestResult(){
       	return this.routineTestResult;
     }
     public void setRoutineTestResult(String routineTestResult){
       	this.routineTestResult=routineTestResult;
     }
     public String getUrineTestResult(){
       	return this.urineTestResult;
     }
     public void setUrineTestResult(String urineTestResult){
       	this.urineTestResult=urineTestResult;
     }
     public String getBloodCoagulaTestResult(){
       	return this.bloodCoagulaTestResult;
     }
     public void setBloodCoagulaTestResult(String bloodCoagulaTestResult){
       	this.bloodCoagulaTestResult=bloodCoagulaTestResult;
     }
     public String getLiverTestResult(){
       	return this.liverTestResult;
     }
     public void setLiverTestResult(String liverTestResult){
       	this.liverTestResult=liverTestResult;
     }
     public String getBloodGasTestResult(){
       	return this.bloodGasTestResult;
     }
     public void setBloodGasTestResult(String bloodGasTestResult){
       	this.bloodGasTestResult=bloodGasTestResult;
     }
     public String getOperationCd(){
       	return this.operationCd;
     }
     public void setOperationCd(String operationCd){
       	this.operationCd=operationCd;
     }
     public String getOpRoom(){
       	return this.opRoom;
     }
     public void setOpRoom(String opRoom){
       	this.opRoom=opRoom;
     }
     public String getProposedAnesthesiaMethod(){
       	return this.proposedAnesthesiaMethod;
     }
     public void setProposedAnesthesiaMethod(String proposedAnesthesiaMethod){
       	this.proposedAnesthesiaMethod=proposedAnesthesiaMethod;
     }
     public String getOpPreAnesOrder(){
       	return this.opPreAnesOrder;
     }
     public void setOpPreAnesOrder(String opPreAnesOrder){
       	this.opPreAnesOrder=opPreAnesOrder;
     }
     public String getAnesIndication(){
       	return this.anesIndication;
     }
     public void setAnesIndication(String anesIndication){
       	this.anesIndication=anesIndication;
     }
     public String getMattersNeedingAttention(){
       	return this.mattersNeedingAttention;
     }
     public void setMattersNeedingAttention(String mattersNeedingAttention){
       	this.mattersNeedingAttention=mattersNeedingAttention;
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