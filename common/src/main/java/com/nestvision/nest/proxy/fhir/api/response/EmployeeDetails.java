package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.Employee;

public class EmployeeDetails extends EmployeeRecord {
    /**
     *名称:院内人员id
     *备注:医务人员在院内系统中的唯一标识
 	 *
     */
     private String employeeId;
    /**
     *名称:身份证号
     *
 	 *
     */
     private String idCard;
    /**
     *名称:姓名
     *
 	 *
     */
     private String name;
    /**
     *名称:性别
     *
 	 *限制:GBT22611
     */
     private String gender;
    /**
     *名称:出生日期
     *
 	 *
     */
     private Long birthdate;
    /**
     *名称:所在科室id
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
     */
     private String departmentId;
    /**
     *名称:岗位代码
     *
 	 *限制:CUS00003
     */
     private String practitionerRole;
    /**
     *名称:专业技术职务代码
     *
 	 *限制:CV9900374
     */
     private String post;
    /**
     *名称:从业资格证号
     *
 	 *
     */
     private String qualificationCertificateNo;
    /**
     *名称:执业范围
     *
 	 *
     */
     private String praScope;
    /**
     *名称:是否拥有处方权
     *
 	 *限制:CUS00004
     */
     private Boolean ifPrescribe;
    /**
     *名称:是否可以开立毒麻药品
     *
 	 *限制:CUS00004
     */
     private Boolean ifPoison;
    /**
     *名称:是否可以开立精神药品
     *
 	 *限制:CUS00004
     */
     private Boolean ifPsychotropic;
    /**
     *名称:抗生素使用权限
     *
 	 *限制:CV9900274
     */
     private String antibioticUsePermission;
     private String errorMessage;
     private String errorDetail;             
     public EmployeeDetails(Employee employee) {
        super(employee);
         this.employeeId=employee.getEmployeeId();
         this.idCard=employee.getIdCard();
         this.name=employee.getName();
         this.gender=employee.getGender();
         java.util.Date _birthdate = employee.getBirthdate();
         if(_birthdate!=null){
         	this.birthdate=_birthdate.getTime();
         }
         this.departmentId=employee.getDepartmentId();
         this.practitionerRole=employee.getPractitionerRole();
         this.post=employee.getPost();
         this.qualificationCertificateNo=employee.getQualificationCertificateNo();
         this.praScope=employee.getPraScope();
         this.ifPrescribe=employee.getIfPrescribe();
         this.ifPoison=employee.getIfPoison();
         this.ifPsychotropic=employee.getIfPsychotropic();
         this.antibioticUsePermission=employee.getAntibioticUsePermission();
         this.errorMessage=employee.getErrorMessage();
         this.errorDetail=employee.getErrorDetail();      
    }
      public String  getEmployeeId(){
       		return this.employeeId;
      }    
      public String  getIdCard(){
       		return this.idCard;
      }    
      public String  getName(){
       		return this.name;
      }    
      public String  getGender(){
       		return this.gender;
      }    
      public Long  getBirthdate(){
       		return this.birthdate;
      }    
      public String  getDepartmentId(){
       		return this.departmentId;
      }    
      public String  getPractitionerRole(){
       		return this.practitionerRole;
      }    
      public String  getPost(){
       		return this.post;
      }    
      public String  getQualificationCertificateNo(){
       		return this.qualificationCertificateNo;
      }    
      public String  getPraScope(){
       		return this.praScope;
      }    
      public Boolean  getIfPrescribe(){
       		return this.ifPrescribe;
      }    
      public Boolean  getIfPoison(){
       		return this.ifPoison;
      }    
      public Boolean  getIfPsychotropic(){
       		return this.ifPsychotropic;
      }    
      public String  getAntibioticUsePermission(){
       		return this.antibioticUsePermission;
      }    
	  public String getErrorMessage() {
	        return errorMessage;
	  }
	  public String getErrorDetail() {
	        return errorDetail;
	  }  
}