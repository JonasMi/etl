package com.nestvision.nest.proxy.fhir.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.nestvision.nest.proxy.base.entity.BaseEntity;
import com.nestvision.nest.proxy.fhir.anotaion.FhirFieldValidate;

@Entity
@Table(name = BaseEntity.TABLE_PREFIX + "DEPARTMENT")
public class Department extends FhirResourceEntity {

    /**
     *名称:院内科室id
     *备注:科室在院内系统中的唯一标识
 	 *
 	 *主键字段
     */
     @Column(name="DEPARTMENT_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="DEPARTMENT_ID",displayName="院内科室id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String departmentId;
    /**
     *名称:科室类型
     *
 	 *限制:CV9900276
 	 *
     */
     @Column(name="DP_TYPE",length = 20,nullable = true)
     @FhirFieldValidate(name="DP_TYPE",displayName="科室类型",maxLength=20,required=false,valuesRange="CV9900276")   
     private String dpType;
    /**
     *名称:科室名称
     *
 	 *
 	 *
     */
     @Column(name="NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="NAME",displayName="科室名称",maxLength=40,required=true,valuesRange="")   
     private String name;
    /**
     *名称:联系方式
     *
 	 *
 	 *
     */
     @Column(name="PHONE",length = 20,nullable = true)
     @FhirFieldValidate(name="PHONE",displayName="联系方式",maxLength=20,required=false,valuesRange="")   
     private String phone;
    /**
     *名称:上级科室id
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
 	 *
     */
     @Column(name="PARTOF",length = 40,nullable = true)
     @FhirFieldValidate(name="PARTOF",displayName="上级科室id",maxLength=40,required=false,valuesRange="")   
     private String partof;
    /**
     *名称:是否末级科室
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_END",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_END",displayName="是否末级科室",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifEnd;
    /**
     *名称:科室归类代码
     *备注:科室在市平台的标准编码
 	 *限制:CV9900051
 	 *
     */
     @Column(name="CLASSIFICATION",length = 20,nullable = false)
     @FhirFieldValidate(name="CLASSIFICATION",displayName="科室归类代码",maxLength=20,required=true,valuesRange="CV9900051")   
     private String classification;
    /**
     *名称:取号地点
     *
 	 *
 	 *
     */
     @Column(name="TAKE_NO_PLACE",length = 200,nullable = true)
     @FhirFieldValidate(name="TAKE_NO_PLACE",displayName="取号地点",maxLength=200,required=false,valuesRange="")   
     private String takeNoPlace;
    
     public String getDepartmentId(){
       	return this.departmentId;
     }
     public void setDepartmentId(String departmentId){
       	this.departmentId=departmentId;
     }
     public String getDpType(){
       	return this.dpType;
     }
     public void setDpType(String dpType){
       	this.dpType=dpType;
     }
     public String getName(){
       	return this.name;
     }
     public void setName(String name){
       	this.name=name;
     }
     public String getPhone(){
       	return this.phone;
     }
     public void setPhone(String phone){
       	this.phone=phone;
     }
     public String getPartof(){
       	return this.partof;
     }
     public void setPartof(String partof){
       	this.partof=partof;
     }
     public Boolean getIfEnd(){
       	return this.ifEnd;
     }
     public void setIfEnd(Boolean ifEnd){
       	this.ifEnd=ifEnd;
     }
     public String getClassification(){
       	return this.classification;
     }
     public void setClassification(String classification){
       	this.classification=classification;
     }
     public String getTakeNoPlace(){
       	return this.takeNoPlace;
     }
     public void setTakeNoPlace(String takeNoPlace){
       	this.takeNoPlace=takeNoPlace;
     }
}