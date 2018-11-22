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
@Table(name = BaseEntity.TABLE_PREFIX + "IPN_DAILY_DISEASE_RECORD")
public class IpnDailyDiseaseRecord extends FhirResourceEntity {

    /**
     *名称:日常病程记录id
     *
 	 *
 	 *主键字段
     */
     @Column(name="IPN_DAILY_DISEASE_RECORD_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="IPN_DAILY_DISEASE_RECORD_ID",displayName="日常病程记录id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String ipnDailyDiseaseRecordId;
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
     *名称:中医"四诊"观察结果
     *
 	 *
 	 *
     */
     @Column(name="CN_FOUR_RESULT",length = 200,nullable = true)
     @FhirFieldValidate(name="CN_FOUR_RESULT",displayName="中医&quot;四诊&quot;观察结果",maxLength=200,required=false,valuesRange="")   
     private String cnFourResult;
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
     *名称:经治医师专业技术职务代码
     *
 	 *限制:CV9900374
 	 *
     */
     @Column(name="CERTIFIED_PHYSICIAN_POST",length = 20,nullable = true)
     @FhirFieldValidate(name="CERTIFIED_PHYSICIAN_POST",displayName="经治医师专业技术职务代码",maxLength=20,required=false,valuesRange="CV9900374")   
     private String certifiedPhysicianPost;
    /**
     *名称:住院病程描述
     *
 	 *
 	 *
     */
     @Column(name="INPATIENT_PROGRESS",length = 40,nullable = true)
     @FhirFieldValidate(name="INPATIENT_PROGRESS",displayName="住院病程描述",maxLength=40,required=false,valuesRange="")   
     private String inpatientProgress;
    /**
     *名称:辩证论治
     *
 	 *
 	 *
     */
     @Column(name="DIALECTICAL_TREATMENT",length = 100,nullable = true)
     @FhirFieldValidate(name="DIALECTICAL_TREATMENT",displayName="辩证论治",maxLength=100,required=false,valuesRange="")   
     private String dialecticalTreatment;
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
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getIpnDailyDiseaseRecordId(){
       	return this.ipnDailyDiseaseRecordId;
     }
     public void setIpnDailyDiseaseRecordId(String ipnDailyDiseaseRecordId){
       	this.ipnDailyDiseaseRecordId=ipnDailyDiseaseRecordId;
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
     public Date getStart(){
       	return this.start;
     }
     public void setStart(Date start){
       	this.start=start;
     }
     public String getCnFourResult(){
       	return this.cnFourResult;
     }
     public void setCnFourResult(String cnFourResult){
       	this.cnFourResult=cnFourResult;
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
     public String getCertifiedPhysicianPost(){
       	return this.certifiedPhysicianPost;
     }
     public void setCertifiedPhysicianPost(String certifiedPhysicianPost){
       	this.certifiedPhysicianPost=certifiedPhysicianPost;
     }
     public String getInpatientProgress(){
       	return this.inpatientProgress;
     }
     public void setInpatientProgress(String inpatientProgress){
       	this.inpatientProgress=inpatientProgress;
     }
     public String getDialecticalTreatment(){
       	return this.dialecticalTreatment;
     }
     public void setDialecticalTreatment(String dialecticalTreatment){
       	this.dialecticalTreatment=dialecticalTreatment;
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
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}