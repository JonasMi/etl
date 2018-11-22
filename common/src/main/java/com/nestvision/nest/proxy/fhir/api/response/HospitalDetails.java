package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.Hospital;

public class HospitalDetails extends HospitalRecord {
    /**
     *名称:名称
     *
 	 *
     */
     private String name;
    /**
     *名称:联系方式
     *
 	 *
     */
     private String phone;
    /**
     *名称:通信地址
     *
 	 *
     */
     private String address;
    /**
     *名称:邮政编码
     *
 	 *
     */
     private String zipcode;
    /**
     *名称:网站
     *
 	 *
     */
     private String website;
    /**
     *名称:所在地区（区县）
     *
 	 *
     */
     private String area;
    /**
     *名称:医院经纬度
     *
 	 *
     */
     private String latandlon;
    /**
     *名称:医院等级
     *
 	 *
     */
     private String orggrade;
    /**
     *名称:乘车方式
     *
 	 *
     */
     private String rideway;
    /**
     *名称:医院简介
     *
 	 *
     */
     private String orgintroduce;
    /**
     *名称:医院照片
     *备注:base64位编码
 	 *
     */
     private String orgphoto;
    /**
     *名称:医院状态
     *
 	 *限制:CV990103
     */
     private String orgstate;
     private String errorMessage;
     private String errorDetail;             
     public HospitalDetails(Hospital hospital) {
        super(hospital);
         this.name=hospital.getName();
         this.phone=hospital.getPhone();
         this.address=hospital.getAddress();
         this.zipcode=hospital.getZipcode();
         this.website=hospital.getWebsite();
         this.area=hospital.getArea();
         this.latandlon=hospital.getLatandlon();
         this.orggrade=hospital.getOrggrade();
         this.rideway=hospital.getRideway();
         this.orgintroduce=hospital.getOrgintroduce();
         this.orgphoto=hospital.getOrgphoto();
         this.orgstate=hospital.getOrgstate();
         this.errorMessage=hospital.getErrorMessage();
         this.errorDetail=hospital.getErrorDetail();      
    }
      public String  getName(){
       		return this.name;
      }    
      public String  getPhone(){
       		return this.phone;
      }    
      public String  getAddress(){
       		return this.address;
      }    
      public String  getZipcode(){
       		return this.zipcode;
      }    
      public String  getWebsite(){
       		return this.website;
      }    
      public String  getArea(){
       		return this.area;
      }    
      public String  getLatandlon(){
       		return this.latandlon;
      }    
      public String  getOrggrade(){
       		return this.orggrade;
      }    
      public String  getRideway(){
       		return this.rideway;
      }    
      public String  getOrgintroduce(){
       		return this.orgintroduce;
      }    
      public String  getOrgphoto(){
       		return this.orgphoto;
      }    
      public String  getOrgstate(){
       		return this.orgstate;
      }    
	  public String getErrorMessage() {
	        return errorMessage;
	  }
	  public String getErrorDetail() {
	        return errorDetail;
	  }  
}