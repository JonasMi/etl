package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.Clinictype;

public class ClinictypeDetails extends ClinictypeRecord {
    /**
     *名称:院内号别编码
     *备注:号别在院内系统中的唯一标识
 	 *
     */
     private String itemCode;
    /**
     *名称:对应科室id
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
     */
     private String dpId;
    /**
     *名称:号别类型代码
     *
 	 *限制:CV9900261
     */
     private String clinicCode;
    /**
     *名称:挂号费
     *
 	 *
     */
     private Float reFee;
    /**
     *名称:诊疗费
     *
 	 *
     */
     private Float dtFee;
     private String errorMessage;
     private String errorDetail;             
     public ClinictypeDetails(Clinictype clinictype) {
        super(clinictype);
         this.itemCode=clinictype.getItemCode();
         this.dpId=clinictype.getDpId();
         this.clinicCode=clinictype.getClinicCode();
         this.reFee=clinictype.getReFee();
         this.dtFee=clinictype.getDtFee();
         this.errorMessage=clinictype.getErrorMessage();
         this.errorDetail=clinictype.getErrorDetail();      
    }
      public String  getItemCode(){
       		return this.itemCode;
      }    
      public String  getDpId(){
       		return this.dpId;
      }    
      public String  getClinicCode(){
       		return this.clinicCode;
      }    
      public Float  getReFee(){
       		return this.reFee;
      }    
      public Float  getDtFee(){
       		return this.dtFee;
      }    
	  public String getErrorMessage() {
	        return errorMessage;
	  }
	  public String getErrorDetail() {
	        return errorDetail;
	  }  
}