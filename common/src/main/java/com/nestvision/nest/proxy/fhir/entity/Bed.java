package com.nestvision.nest.proxy.fhir.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.nestvision.nest.proxy.base.entity.BaseEntity;
import com.nestvision.nest.proxy.fhir.anotaion.FhirFieldValidate;

@Entity
@Table(name = BaseEntity.TABLE_PREFIX + "BED")
public class Bed extends FhirResourceEntity {

    /**
     *名称:院内床位id
     *备注:床位在院内系统中的唯一标识
 	 *
 	 *主键字段
     */
     @Column(name="BED_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="BED_ID",displayName="院内床位id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String bedId;
    /**
     *名称:使用状态
     *
 	 *限制:CUS00005
 	 *
     */
     @Column(name="STATUS",length = 20,nullable = true)
     @FhirFieldValidate(name="STATUS",displayName="使用状态",maxLength=20,required=false,valuesRange="CUS00005")   
     private String status;
    /**
     *名称:床位类型代码
     *
 	 *限制:CV9900278
 	 *
     */
     @Column(name="TYPE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="TYPE_CODE",displayName="床位类型代码",maxLength=20,required=false,valuesRange="CV9900278")   
     private String typeCode;
    /**
     *名称:病房号
     *
 	 *
 	 *
     */
     @Column(name="WARD_NO",length = 40,nullable = true)
     @FhirFieldValidate(name="WARD_NO",displayName="病房号",maxLength=40,required=false,valuesRange="")   
     private String wardNo;
    /**
     *名称:病区
     *
 	 *
 	 *
     */
     @Column(name="WARD_AREA",length = 100,nullable = true)
     @FhirFieldValidate(name="WARD_AREA",displayName="病区",maxLength=100,required=false,valuesRange="")   
     private String wardArea;
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
     *名称:床位等级代码
     *
 	 *限制:CV9900262
 	 *
     */
     @Column(name="LEVEL_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="LEVEL_CODE",displayName="床位等级代码",maxLength=20,required=false,valuesRange="CV9900262")   
     private String levelCode;
    
     public String getBedId(){
       	return this.bedId;
     }
     public void setBedId(String bedId){
       	this.bedId=bedId;
     }
     public String getStatus(){
       	return this.status;
     }
     public void setStatus(String status){
       	this.status=status;
     }
     public String getTypeCode(){
       	return this.typeCode;
     }
     public void setTypeCode(String typeCode){
       	this.typeCode=typeCode;
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
     public String getDepartmentId(){
       	return this.departmentId;
     }
     public void setDepartmentId(String departmentId){
       	this.departmentId=departmentId;
     }
     public String getLevelCode(){
       	return this.levelCode;
     }
     public void setLevelCode(String levelCode){
       	this.levelCode=levelCode;
     }
}