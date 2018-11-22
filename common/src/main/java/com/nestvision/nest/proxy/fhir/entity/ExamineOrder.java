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
@Table(name = BaseEntity.TABLE_PREFIX + "EXAMINE_ORDER")
public class ExamineOrder extends FhirResourceEntity {

    /**
     *名称:院内检验申请单id
     *备注:检验申请单在院内系统中的唯一标识
 	 *
 	 *主键字段
     */
     @Column(name="EXAMINATION_ORDER_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="EXAMINATION_ORDER_ID",displayName="院内检验申请单id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String examinationOrderId;
    /**
     *名称:申请状态
     *
 	 *限制:CUS00009
 	 *
     */
     @Column(name="STATUS",length = 20,nullable = true)
     @FhirFieldValidate(name="STATUS",displayName="申请状态",maxLength=20,required=false,valuesRange="CUS00009")   
     private String status;
    /**
     *名称:优先等级
     *
 	 *限制:CUS00010
 	 *
     */
     @Column(name="PRIORITY",length = 20,nullable = true)
     @FhirFieldValidate(name="PRIORITY",displayName="优先等级",maxLength=20,required=false,valuesRange="CUS00010")   
     private String priority;
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
     *名称:申请医生ID
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="ORDERER_EMPLOYEE_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="ORDERER_EMPLOYEE_ID",displayName="申请医生ID",maxLength=40,required=false,valuesRange="")   
     private String ordererEmployeeId;
    /**
     *名称:检验总项目代码
     *
 	 *
 	 *
     */
     @Column(name="EXAMINATION_ITEM_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="EXAMINATION_ITEM_CD",displayName="检验总项目代码",maxLength=20,required=false,valuesRange="")   
     private String examinationItemCd;
    /**
     *名称:检验总项目名字
     *
 	 *
 	 *
     */
     @Column(name="EXAMINATION_ITEM_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="EXAMINATION_ITEM_NAME",displayName="检验总项目名字",maxLength=20,required=false,valuesRange="")   
     private String examinationItemName;
    /**
     *名称:标本采集部位代码
     *
 	 *限制:CV9900316
 	 *
     */
     @Column(name="SPECIMENS_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="SPECIMENS_CODE",displayName="标本采集部位代码",maxLength=20,required=false,valuesRange="CV9900316")   
     private String specimensCode;
    /**
     *名称:标本采集部位名称
     *
 	 *
 	 *
     */
     @Column(name="SPECIMENS_NAME",length = 50,nullable = true)
     @FhirFieldValidate(name="SPECIMENS_NAME",displayName="标本采集部位名称",maxLength=50,required=false,valuesRange="")   
     private String specimensName;
    /**
     *名称:申请科室id
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
 	 *
     */
     @Column(name="ORDER_DPID",length = 40,nullable = false)
     @FhirFieldValidate(name="ORDER_DPID",displayName="申请科室id",maxLength=40,required=true,valuesRange="")   
     private String orderDpid;
    /**
     *名称:检验科室id
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
 	 *
     */
     @Column(name="DP_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="DP_ID",displayName="检验科室id",maxLength=40,required=false,valuesRange="")   
     private String dpId;
    /**
     *名称:申请时间
     *
 	 *
 	 *
     */
     @Column(name="ORDER_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="ORDER_DATE",displayName="申请时间",required=false,valuesRange="")   
     private Date orderDate;
    /**
     *名称:检查目的
     *
 	 *
 	 *
     */
     @Column(name="INSPECTION_OBJECTIVE",length = 500,nullable = true)
     @FhirFieldValidate(name="INSPECTION_OBJECTIVE",displayName="检查目的",maxLength=500,required=false,valuesRange="")   
     private String inspectionObjective;
    /**
     *名称:对应医嘱类型
     *
 	 *限制:CV9900390
 	 *
     */
     @Column(name="ORDER_TYPE_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="ORDER_TYPE_CD",displayName="对应医嘱类型",maxLength=20,required=false,valuesRange="CV9900390")   
     private String orderTypeCd;
    /**
     *名称:对应医嘱号
     *
 	 *
 	 *
     */
     @Column(name="ADVICE_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="ADVICE_ID",displayName="对应医嘱号",maxLength=40,required=false,valuesRange="")   
     private String adviceId;
    /**
     *名称:检验类别代码
     *
 	 *限制:CV9900393
 	 *
     */
     @Column(name="EXAMINATION_TYPE",length = 20,nullable = true)
     @FhirFieldValidate(name="EXAMINATION_TYPE",displayName="检验类别代码",maxLength=20,required=false,valuesRange="CV9900393")   
     private String examinationType;
    /**
     *名称:检验类别名称
     *
 	 *限制:CV9900393
 	 *
     */
     @Column(name="EXAMINATION_TYPE_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="EXAMINATION_TYPE_NAME",displayName="检验类别名称",maxLength=40,required=false,valuesRange="CV9900393")   
     private String examinationTypeName;
    
     public String getExaminationOrderId(){
       	return this.examinationOrderId;
     }
     public void setExaminationOrderId(String examinationOrderId){
       	this.examinationOrderId=examinationOrderId;
     }
     public String getStatus(){
       	return this.status;
     }
     public void setStatus(String status){
       	this.status=status;
     }
     public String getPriority(){
       	return this.priority;
     }
     public void setPriority(String priority){
       	this.priority=priority;
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
     public String getOrdererEmployeeId(){
       	return this.ordererEmployeeId;
     }
     public void setOrdererEmployeeId(String ordererEmployeeId){
       	this.ordererEmployeeId=ordererEmployeeId;
     }
     public String getExaminationItemCd(){
       	return this.examinationItemCd;
     }
     public void setExaminationItemCd(String examinationItemCd){
       	this.examinationItemCd=examinationItemCd;
     }
     public String getExaminationItemName(){
       	return this.examinationItemName;
     }
     public void setExaminationItemName(String examinationItemName){
       	this.examinationItemName=examinationItemName;
     }
     public String getSpecimensCode(){
       	return this.specimensCode;
     }
     public void setSpecimensCode(String specimensCode){
       	this.specimensCode=specimensCode;
     }
     public String getSpecimensName(){
       	return this.specimensName;
     }
     public void setSpecimensName(String specimensName){
       	this.specimensName=specimensName;
     }
     public String getOrderDpid(){
       	return this.orderDpid;
     }
     public void setOrderDpid(String orderDpid){
       	this.orderDpid=orderDpid;
     }
     public String getDpId(){
       	return this.dpId;
     }
     public void setDpId(String dpId){
       	this.dpId=dpId;
     }
     public Date getOrderDate(){
       	return this.orderDate;
     }
     public void setOrderDate(Date orderDate){
       	this.orderDate=orderDate;
     }
     public String getInspectionObjective(){
       	return this.inspectionObjective;
     }
     public void setInspectionObjective(String inspectionObjective){
       	this.inspectionObjective=inspectionObjective;
     }
     public String getOrderTypeCd(){
       	return this.orderTypeCd;
     }
     public void setOrderTypeCd(String orderTypeCd){
       	this.orderTypeCd=orderTypeCd;
     }
     public String getAdviceId(){
       	return this.adviceId;
     }
     public void setAdviceId(String adviceId){
       	this.adviceId=adviceId;
     }
     public String getExaminationType(){
       	return this.examinationType;
     }
     public void setExaminationType(String examinationType){
       	this.examinationType=examinationType;
     }
     public String getExaminationTypeName(){
       	return this.examinationTypeName;
     }
     public void setExaminationTypeName(String examinationTypeName){
       	this.examinationTypeName=examinationTypeName;
     }
}