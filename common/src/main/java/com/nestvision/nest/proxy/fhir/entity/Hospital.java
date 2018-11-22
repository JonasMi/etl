package com.nestvision.nest.proxy.fhir.entity;
import javax.persistence.Lob;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.nestvision.nest.proxy.base.entity.BaseEntity;
import com.nestvision.nest.proxy.fhir.anotaion.FhirFieldValidate;

@Entity
@Table(name = BaseEntity.TABLE_PREFIX + "HOSPITAL")
public class Hospital extends FhirResourceEntity {

    /**
     *名称:名称
     *
 	 *
 	 *
     */
     @Column(name="NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="NAME",displayName="名称",maxLength=40,required=true,valuesRange="")   
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
     *名称:通信地址
     *
 	 *
 	 *
     */
     @Column(name="ADDRESS",length = 40,nullable = true)
     @FhirFieldValidate(name="ADDRESS",displayName="通信地址",maxLength=40,required=false,valuesRange="")   
     private String address;
    /**
     *名称:邮政编码
     *
 	 *
 	 *
     */
     @Column(name="ZIPCODE",length = 20,nullable = true)
     @FhirFieldValidate(name="ZIPCODE",displayName="邮政编码",maxLength=20,required=false,valuesRange="")   
     private String zipcode;
    /**
     *名称:网站
     *
 	 *
 	 *
     */
     @Column(name="WEBSITE",length = 20,nullable = true)
     @FhirFieldValidate(name="WEBSITE",displayName="网站",maxLength=20,required=false,valuesRange="")   
     private String website;
    /**
     *名称:所在地区（区县）
     *
 	 *
 	 *
     */
     @Column(name="AREA",length = 20,nullable = true)
     @FhirFieldValidate(name="AREA",displayName="所在地区（区县）",maxLength=20,required=false,valuesRange="")   
     private String area;
    /**
     *名称:医院经纬度
     *
 	 *
 	 *
     */
     @Column(name="LATANDLON",length = 20,nullable = true)
     @FhirFieldValidate(name="LATANDLON",displayName="医院经纬度",maxLength=20,required=false,valuesRange="")   
     private String latandlon;
    /**
     *名称:医院等级
     *
 	 *
 	 *
     */
     @Column(name="ORGGRADE",length = 20,nullable = true)
     @FhirFieldValidate(name="ORGGRADE",displayName="医院等级",maxLength=20,required=false,valuesRange="")   
     private String orggrade;
    /**
     *名称:乘车方式
     *
 	 *
 	 *
     */
     @Column(name="RIDEWAY",length = 200,nullable = true)
     @FhirFieldValidate(name="RIDEWAY",displayName="乘车方式",maxLength=200,required=false,valuesRange="")   
     private String rideway;
    /**
     *名称:医院简介
     *
 	 *
 	 *
     */
     @Column(name="ORGINTRODUCE",length = 2000,nullable = true)
     @FhirFieldValidate(name="ORGINTRODUCE",displayName="医院简介",maxLength=2000,required=false,valuesRange="")   
     private String orgintroduce;
    /**
     *名称:医院照片
     *备注:base64位编码
 	 *
 	 *
     */
     @Lob  
     @Column(name="ORGPHOTO",nullable = true)
     @FhirFieldValidate(name="ORGPHOTO",displayName="医院照片",required=false,valuesRange="")   
     private String orgphoto;
    /**
     *名称:医院状态
     *
 	 *限制:CV990103
 	 *
     */
     @Column(name="ORGSTATE",length = 10,nullable = true)
     @FhirFieldValidate(name="ORGSTATE",displayName="医院状态",maxLength=10,required=false,valuesRange="CV990103")   
     private String orgstate;
    
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
     public String getAddress(){
       	return this.address;
     }
     public void setAddress(String address){
       	this.address=address;
     }
     public String getZipcode(){
       	return this.zipcode;
     }
     public void setZipcode(String zipcode){
       	this.zipcode=zipcode;
     }
     public String getWebsite(){
       	return this.website;
     }
     public void setWebsite(String website){
       	this.website=website;
     }
     public String getArea(){
       	return this.area;
     }
     public void setArea(String area){
       	this.area=area;
     }
     public String getLatandlon(){
       	return this.latandlon;
     }
     public void setLatandlon(String latandlon){
       	this.latandlon=latandlon;
     }
     public String getOrggrade(){
       	return this.orggrade;
     }
     public void setOrggrade(String orggrade){
       	this.orggrade=orggrade;
     }
     public String getRideway(){
       	return this.rideway;
     }
     public void setRideway(String rideway){
       	this.rideway=rideway;
     }
     public String getOrgintroduce(){
       	return this.orgintroduce;
     }
     public void setOrgintroduce(String orgintroduce){
       	this.orgintroduce=orgintroduce;
     }
     public String getOrgphoto(){
       	return this.orgphoto;
     }
     public void setOrgphoto(String orgphoto){
       	this.orgphoto=orgphoto;
     }
     public String getOrgstate(){
       	return this.orgstate;
     }
     public void setOrgstate(String orgstate){
       	this.orgstate=orgstate;
     }
}