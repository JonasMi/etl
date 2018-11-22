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
@Table(name = BaseEntity.TABLE_PREFIX + "EMPLOYEE")
public class Employee extends FhirResourceEntity {

    /**
     *名称:院内人员id
     *备注:医务人员在院内系统中的唯一标识
 	 *
 	 *主键字段
     */
     @Column(name="EMPLOYEE_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="EMPLOYEE_ID",displayName="院内人员id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String employeeId;
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
     @Column(name="GENDER",length = 20,nullable = true)
     @FhirFieldValidate(name="GENDER",displayName="性别",maxLength=20,required=false,valuesRange="GBT22611")   
     private String gender;
    /**
     *名称:出生日期
     *
 	 *
 	 *
     */
     @Column(name="BIRTHDATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="BIRTHDATE",displayName="出生日期",required=false,valuesRange="")   
     private Date birthdate;
    /**
     *名称:所在科室id
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
 	 *
     */
     @Column(name="DEPARTMENT_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="DEPARTMENT_ID",displayName="所在科室id",maxLength=40,required=false,valuesRange="")   
     private String departmentId;
    /**
     *名称:岗位代码
     *
 	 *限制:CUS00003
 	 *
     */
     @Column(name="PRACTITIONER_ROLE",length = 20,nullable = true)
     @FhirFieldValidate(name="PRACTITIONER_ROLE",displayName="岗位代码",maxLength=20,required=false,valuesRange="CUS00003")   
     private String practitionerRole;
    /**
     *名称:专业技术职务代码
     *
 	 *限制:CV9900374
 	 *
     */
     @Column(name="POST",length = 20,nullable = true)
     @FhirFieldValidate(name="POST",displayName="专业技术职务代码",maxLength=20,required=false,valuesRange="CV9900374")   
     private String post;
    /**
     *名称:从业资格证号
     *
 	 *
 	 *
     */
     @Column(name="QUALIFICATION_CERTIFICATE_NO",length = 40,nullable = true)
     @FhirFieldValidate(name="QUALIFICATION_CERTIFICATE_NO",displayName="从业资格证号",maxLength=40,required=false,valuesRange="")   
     private String qualificationCertificateNo;
    /**
     *名称:执业范围
     *
 	 *
 	 *
     */
     @Column(name="PRA_SCOPE",length = 200,nullable = true)
     @FhirFieldValidate(name="PRA_SCOPE",displayName="执业范围",maxLength=200,required=false,valuesRange="")   
     private String praScope;
    /**
     *名称:是否拥有处方权
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_PRESCRIBE",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_PRESCRIBE",displayName="是否拥有处方权",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifPrescribe;
    /**
     *名称:是否可以开立毒麻药品
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_POISON",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_POISON",displayName="是否可以开立毒麻药品",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifPoison;
    /**
     *名称:是否可以开立精神药品
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_PSYCHOTROPIC",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_PSYCHOTROPIC",displayName="是否可以开立精神药品",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifPsychotropic;
    /**
     *名称:抗生素使用权限
     *
 	 *限制:CV9900274
 	 *
     */
     @Column(name="ANTIBIOTIC_USE_PERMISSION",length = 20,nullable = true)
     @FhirFieldValidate(name="ANTIBIOTIC_USE_PERMISSION",displayName="抗生素使用权限",maxLength=20,required=false,valuesRange="CV9900274")   
     private String antibioticUsePermission;
    
     public String getEmployeeId(){
       	return this.employeeId;
     }
     public void setEmployeeId(String employeeId){
       	this.employeeId=employeeId;
     }
     public String getIdCard(){
       	return this.idCard;
     }
     public void setIdCard(String idCard){
       	this.idCard=idCard;
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
     public Date getBirthdate(){
       	return this.birthdate;
     }
     public void setBirthdate(Date birthdate){
       	this.birthdate=birthdate;
     }
     public String getDepartmentId(){
       	return this.departmentId;
     }
     public void setDepartmentId(String departmentId){
       	this.departmentId=departmentId;
     }
     public String getPractitionerRole(){
       	return this.practitionerRole;
     }
     public void setPractitionerRole(String practitionerRole){
       	this.practitionerRole=practitionerRole;
     }
     public String getPost(){
       	return this.post;
     }
     public void setPost(String post){
       	this.post=post;
     }
     public String getQualificationCertificateNo(){
       	return this.qualificationCertificateNo;
     }
     public void setQualificationCertificateNo(String qualificationCertificateNo){
       	this.qualificationCertificateNo=qualificationCertificateNo;
     }
     public String getPraScope(){
       	return this.praScope;
     }
     public void setPraScope(String praScope){
       	this.praScope=praScope;
     }
     public Boolean getIfPrescribe(){
       	return this.ifPrescribe;
     }
     public void setIfPrescribe(Boolean ifPrescribe){
       	this.ifPrescribe=ifPrescribe;
     }
     public Boolean getIfPoison(){
       	return this.ifPoison;
     }
     public void setIfPoison(Boolean ifPoison){
       	this.ifPoison=ifPoison;
     }
     public Boolean getIfPsychotropic(){
       	return this.ifPsychotropic;
     }
     public void setIfPsychotropic(Boolean ifPsychotropic){
       	this.ifPsychotropic=ifPsychotropic;
     }
     public String getAntibioticUsePermission(){
       	return this.antibioticUsePermission;
     }
     public void setAntibioticUsePermission(String antibioticUsePermission){
       	this.antibioticUsePermission=antibioticUsePermission;
     }
}