package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.Department;

public class DepartmentDetails extends DepartmentRecord {
    /**
     *名称:院内科室id
     *备注:科室在院内系统中的唯一标识
 	 *
     */
     private String departmentId;
    /**
     *名称:科室类型
     *
 	 *限制:CV9900276
     */
     private String dpType;
    /**
     *名称:科室名称
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
     *名称:上级科室id
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
     */
     private String partof;
    /**
     *名称:是否末级科室
     *
 	 *限制:CUS00004
     */
     private Boolean ifEnd;
    /**
     *名称:科室归类代码
     *备注:科室在市平台的标准编码
 	 *限制:CV9900051
     */
     private String classification;
    /**
     *名称:取号地点
     *
 	 *
     */
     private String takeNoPlace;
     private String errorMessage;
     private String errorDetail;             
     public DepartmentDetails(Department department) {
        super(department);
         this.departmentId=department.getDepartmentId();
         this.dpType=department.getDpType();
         this.name=department.getName();
         this.phone=department.getPhone();
         this.partof=department.getPartof();
         this.ifEnd=department.getIfEnd();
         this.classification=department.getClassification();
         this.takeNoPlace=department.getTakeNoPlace();
         this.errorMessage=department.getErrorMessage();
         this.errorDetail=department.getErrorDetail();      
    }
      public String  getDepartmentId(){
       		return this.departmentId;
      }    
      public String  getDpType(){
       		return this.dpType;
      }    
      public String  getName(){
       		return this.name;
      }    
      public String  getPhone(){
       		return this.phone;
      }    
      public String  getPartof(){
       		return this.partof;
      }    
      public Boolean  getIfEnd(){
       		return this.ifEnd;
      }    
      public String  getClassification(){
       		return this.classification;
      }    
      public String  getTakeNoPlace(){
       		return this.takeNoPlace;
      }    
	  public String getErrorMessage() {
	        return errorMessage;
	  }
	  public String getErrorDetail() {
	        return errorDetail;
	  }  
}