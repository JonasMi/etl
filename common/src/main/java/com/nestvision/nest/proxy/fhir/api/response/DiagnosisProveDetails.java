package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.DiagnosisProve;

public class DiagnosisProveDetails extends DiagnosisProveRecord {
    /**
     *名称:诊断证明id
     *备注:诊断证明在院内系统中的唯一标识
 	 *
     */
     private String diagnosisProveId;
    /**
     *名称:记录日期
     *备注:出门（急）诊病历报告的日期时间
 	 *
     */
     private Long recordDate;
    /**
     *名称:患者ID
     *备注:引用患者信息表T_PATIENT院内患者id
 	 *
     */
     private String patientId;
    /**
     *名称:身份证号
     *
 	 *
     */
     private String idCard;
    /**
     *名称:年龄
     *
 	 *
     */
     private Integer age;
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
     *名称:住院流水号
     *备注:引用住院基础信息表T_INPATIENT院内住院流水号
 	 *
     */
     private String inpatientRegistrationId;
    /**
     *名称:入院时间
     *
 	 *
     */
     private Long start;
    /**
     *名称:出院时间
     *
 	 *
     */
     private Long end;
    /**
     *名称:住院天数
     *
 	 *
     */
     private Integer inpatDays;
    /**
     *名称:住院号
     *
 	 *
     */
     private String inhId;
    /**
     *名称:就诊科室id
     *
 	 *
     */
     private String visitingDeptId;
    /**
     *名称:就诊科室名称
     *
 	 *
     */
     private String visitingDeptName;
    /**
     *名称:治疗过程描述
     *
 	 *
     */
     private String treatRescueCourse;
    /**
     *名称:出院主要诊断名称
     *
 	 *
     */
     private String outMainDiagnosisName;
    /**
     *名称:出院伴随诊断名称
     *
 	 *
     */
     private String outAccompanyDiagnosisName;
    /**
     *名称:出院建议及带药
     *
 	 *
     */
     private String dischargeAdviceMedicine;
    /**
     *名称:医师签名
     *
 	 *
     */
     private String physician;
    /**
     *名称:上传机构名称
     *备注:医疗机构在爱心医疗云平台中的唯一编码
 	 *
     */
     private String upHospitalName;
     private String errorMessage;
     private String errorDetail;             
     public DiagnosisProveDetails(DiagnosisProve diagnosisProve) {
        super(diagnosisProve);
         this.diagnosisProveId=diagnosisProve.getDiagnosisProveId();
         java.util.Date _recordDate = diagnosisProve.getRecordDate();
         if(_recordDate!=null){
         	this.recordDate=_recordDate.getTime();
         }
         this.patientId=diagnosisProve.getPatientId();
         this.idCard=diagnosisProve.getIdCard();
         this.age=diagnosisProve.getAge();
         this.name=diagnosisProve.getName();
         this.gender=diagnosisProve.getGender();
         java.util.Date _birthdate = diagnosisProve.getBirthdate();
         if(_birthdate!=null){
         	this.birthdate=_birthdate.getTime();
         }
         this.inpatientRegistrationId=diagnosisProve.getInpatientRegistrationId();
         java.util.Date _start = diagnosisProve.getStart();
         if(_start!=null){
         	this.start=_start.getTime();
         }
         java.util.Date _end = diagnosisProve.getEnd();
         if(_end!=null){
         	this.end=_end.getTime();
         }
         this.inpatDays=diagnosisProve.getInpatDays();
         this.inhId=diagnosisProve.getInhId();
         this.visitingDeptId=diagnosisProve.getVisitingDeptId();
         this.visitingDeptName=diagnosisProve.getVisitingDeptName();
         this.treatRescueCourse=diagnosisProve.getTreatRescueCourse();
         this.outMainDiagnosisName=diagnosisProve.getOutMainDiagnosisName();
         this.outAccompanyDiagnosisName=diagnosisProve.getOutAccompanyDiagnosisName();
         this.dischargeAdviceMedicine=diagnosisProve.getDischargeAdviceMedicine();
         this.physician=diagnosisProve.getPhysician();
         this.upHospitalName=diagnosisProve.getUpHospitalName();
         this.errorMessage=diagnosisProve.getErrorMessage();
         this.errorDetail=diagnosisProve.getErrorDetail();      
    }
      public String  getDiagnosisProveId(){
       		return this.diagnosisProveId;
      }    
      public Long  getRecordDate(){
       		return this.recordDate;
      }    
      public String  getPatientId(){
       		return this.patientId;
      }    
      public String  getIdCard(){
       		return this.idCard;
      }    
      public Integer  getAge(){
       		return this.age;
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
      public String  getInpatientRegistrationId(){
       		return this.inpatientRegistrationId;
      }    
      public Long  getStart(){
       		return this.start;
      }    
      public Long  getEnd(){
       		return this.end;
      }    
      public Integer  getInpatDays(){
       		return this.inpatDays;
      }    
      public String  getInhId(){
       		return this.inhId;
      }    
      public String  getVisitingDeptId(){
       		return this.visitingDeptId;
      }    
      public String  getVisitingDeptName(){
       		return this.visitingDeptName;
      }    
      public String  getTreatRescueCourse(){
       		return this.treatRescueCourse;
      }    
      public String  getOutMainDiagnosisName(){
       		return this.outMainDiagnosisName;
      }    
      public String  getOutAccompanyDiagnosisName(){
       		return this.outAccompanyDiagnosisName;
      }    
      public String  getDischargeAdviceMedicine(){
       		return this.dischargeAdviceMedicine;
      }    
      public String  getPhysician(){
       		return this.physician;
      }    
      public String  getUpHospitalName(){
       		return this.upHospitalName;
      }    
	  public String getErrorMessage() {
	        return errorMessage;
	  }
	  public String getErrorDetail() {
	        return errorDetail;
	  }  
}