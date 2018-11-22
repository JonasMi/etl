package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.Bed;

public class BedDetails extends BedRecord {
    /**
     *名称:院内床位id
     *备注:床位在院内系统中的唯一标识
 	 *
     */
     private String bedId;
    /**
     *名称:使用状态
     *
 	 *限制:CUS00005
     */
     private String status;
    /**
     *名称:床位类型代码
     *
 	 *限制:CV9900278
     */
     private String typeCode;
    /**
     *名称:病房号
     *
 	 *
     */
     private String wardNo;
    /**
     *名称:病区
     *
 	 *
     */
     private String wardArea;
    /**
     *名称:所在科室id
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
     */
     private String departmentId;
    /**
     *名称:床位等级代码
     *
 	 *限制:CV9900262
     */
     private String levelCode;
     private String errorMessage;
     private String errorDetail;             
     public BedDetails(Bed bed) {
        super(bed);
         this.bedId=bed.getBedId();
         this.status=bed.getStatus();
         this.typeCode=bed.getTypeCode();
         this.wardNo=bed.getWardNo();
         this.wardArea=bed.getWardArea();
         this.departmentId=bed.getDepartmentId();
         this.levelCode=bed.getLevelCode();
         this.errorMessage=bed.getErrorMessage();
         this.errorDetail=bed.getErrorDetail();      
    }
      public String  getBedId(){
       		return this.bedId;
      }    
      public String  getStatus(){
       		return this.status;
      }    
      public String  getTypeCode(){
       		return this.typeCode;
      }    
      public String  getWardNo(){
       		return this.wardNo;
      }    
      public String  getWardArea(){
       		return this.wardArea;
      }    
      public String  getDepartmentId(){
       		return this.departmentId;
      }    
      public String  getLevelCode(){
       		return this.levelCode;
      }    
	  public String getErrorMessage() {
	        return errorMessage;
	  }
	  public String getErrorDetail() {
	        return errorDetail;
	  }  
}