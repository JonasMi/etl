package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.ChargingItem;

public class ChargingItemDetails extends ChargingItemRecord {
    /**
     *名称:院内收费项目编码
     *备注:收费项目在院内系统中的唯一标识
 	 *
     */
     private String itemCode;
    /**
     *名称:收费项目名称
     *
 	 *
     */
     private String itemName;
    /**
     *名称:门诊费用类型代码
     *
 	 *限制:CV9900326
     */
     private String outpFeeTypeCode;
    /**
     *名称:住院费用类型代码
     *
 	 *限制:CV9900326
     */
     private String hospFeeTypeCode;
    /**
     *名称:项目规格
     *
 	 *
     */
     private String itemSpec;
    /**
     *名称:单位
     *
 	 *
     */
     private String itemUnit;
    /**
     *名称:单价
     *
 	 *
     */
     private Float itemPrice;
    /**
     *名称:对应农合编码
     *
 	 *
     */
     private String ncmsMedication;
    /**
     *名称:对应医保编码
     *
 	 *
     */
     private String medicalInsurance;
    /**
     *名称:收费依据
     *
 	 *
     */
     private String feeBasis;
    /**
     *名称:医保报销标志
     *
 	 *限制:CV9900286
     */
     private String medicationCategory;
    /**
     *名称:农合报销标志
     *
 	 *限制:CV9900373
     */
     private String ncmsMedicationCategory;
    /**
     *名称:收费项目标准编码
     *
 	 *限制:CV990112
     */
     private String itemStdCode;
     private String errorMessage;
     private String errorDetail;             
     public ChargingItemDetails(ChargingItem chargingItem) {
        super(chargingItem);
         this.itemCode=chargingItem.getItemCode();
         this.itemName=chargingItem.getItemName();
         this.outpFeeTypeCode=chargingItem.getOutpFeeTypeCode();
         this.hospFeeTypeCode=chargingItem.getHospFeeTypeCode();
         this.itemSpec=chargingItem.getItemSpec();
         this.itemUnit=chargingItem.getItemUnit();
         this.itemPrice=chargingItem.getItemPrice();
         this.ncmsMedication=chargingItem.getNcmsMedication();
         this.medicalInsurance=chargingItem.getMedicalInsurance();
         this.feeBasis=chargingItem.getFeeBasis();
         this.medicationCategory=chargingItem.getMedicationCategory();
         this.ncmsMedicationCategory=chargingItem.getNcmsMedicationCategory();
         this.itemStdCode=chargingItem.getItemStdCode();
         this.errorMessage=chargingItem.getErrorMessage();
         this.errorDetail=chargingItem.getErrorDetail();      
    }
      public String  getItemCode(){
       		return this.itemCode;
      }    
      public String  getItemName(){
       		return this.itemName;
      }    
      public String  getOutpFeeTypeCode(){
       		return this.outpFeeTypeCode;
      }    
      public String  getHospFeeTypeCode(){
       		return this.hospFeeTypeCode;
      }    
      public String  getItemSpec(){
       		return this.itemSpec;
      }    
      public String  getItemUnit(){
       		return this.itemUnit;
      }    
      public Float  getItemPrice(){
       		return this.itemPrice;
      }    
      public String  getNcmsMedication(){
       		return this.ncmsMedication;
      }    
      public String  getMedicalInsurance(){
       		return this.medicalInsurance;
      }    
      public String  getFeeBasis(){
       		return this.feeBasis;
      }    
      public String  getMedicationCategory(){
       		return this.medicationCategory;
      }    
      public String  getNcmsMedicationCategory(){
       		return this.ncmsMedicationCategory;
      }    
      public String  getItemStdCode(){
       		return this.itemStdCode;
      }    
	  public String getErrorMessage() {
	        return errorMessage;
	  }
	  public String getErrorDetail() {
	        return errorDetail;
	  }  
}