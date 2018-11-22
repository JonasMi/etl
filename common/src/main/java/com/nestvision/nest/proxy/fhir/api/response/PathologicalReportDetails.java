package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.PathologicalReport;

public class PathologicalReportDetails extends PathologicalReportRecord {
    /**
     *名称:病理号
     *备注:病理报告在院内系统中的唯一标识
 	 *
     */
     private String pathologicalReportId;
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
 	 *
     */
     private String gender;
    /**
     *名称:出生日期
     *
 	 *
     */
     private Long birthdate;
    /**
     *名称:门诊或住院标识
     *
 	 *
     */
     private String visitMark;
    /**
     *名称:就诊流水号
     *备注:引用门诊接诊表T_OUTPATIENT_REGISTRATION院内门诊流水号或引用住院接诊表T_INPATIENT_REGISTRATION院内住院流水号
 	 *
     */
     private String registrationId;
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
     *名称:送检日期
     *
 	 *
     */
     private Long inspectionDate;
    /**
     *名称:送检单位
     *
 	 *
     */
     private String inspectionUnit;
    /**
     *名称:临床诊断
     *
 	 *
     */
     private String clinicalDiagnosis;
    /**
     *名称:送检材料/部位
     *
 	 *
     */
     private String inspectionMaterialsParts;
    /**
     *名称:肉眼检查
     *
 	 *
     */
     private String nakedEyeExamination;
    /**
     *名称:图像（base64Binary）
     *
 	 *
     */
     private String image;
    /**
     *名称:病理诊断
     *
 	 *
     */
     private String pathologicDiagnosis;
    /**
     *名称:诊断日期
     *
 	 *
     */
     private Long diagnosisDate;
    /**
     *名称:复诊医师
     *
 	 *
     */
     private String revisitDoctor;
    /**
     *名称:初诊医师
     *
 	 *
     */
     private String primaryDoctor;
    /**
     *名称:上传机构名称
     *备注:医疗机构在爱心医疗云平台中的唯一编码
 	 *
     */
     private String upHospitalName;
     private String errorMessage;
     private String errorDetail;             
     public PathologicalReportDetails(PathologicalReport pathologicalReport) {
        super(pathologicalReport);
         this.pathologicalReportId=pathologicalReport.getPathologicalReportId();
         java.util.Date _recordDate = pathologicalReport.getRecordDate();
         if(_recordDate!=null){
         	this.recordDate=_recordDate.getTime();
         }
         this.patientId=pathologicalReport.getPatientId();
         this.idCard=pathologicalReport.getIdCard();
         this.age=pathologicalReport.getAge();
         this.name=pathologicalReport.getName();
         this.gender=pathologicalReport.getGender();
         java.util.Date _birthdate = pathologicalReport.getBirthdate();
         if(_birthdate!=null){
         	this.birthdate=_birthdate.getTime();
         }
         this.visitMark=pathologicalReport.getVisitMark();
         this.registrationId=pathologicalReport.getRegistrationId();
         this.inhId=pathologicalReport.getInhId();
         this.visitingDeptId=pathologicalReport.getVisitingDeptId();
         this.visitingDeptName=pathologicalReport.getVisitingDeptName();
         java.util.Date _inspectionDate = pathologicalReport.getInspectionDate();
         if(_inspectionDate!=null){
         	this.inspectionDate=_inspectionDate.getTime();
         }
         this.inspectionUnit=pathologicalReport.getInspectionUnit();
         this.clinicalDiagnosis=pathologicalReport.getClinicalDiagnosis();
         this.inspectionMaterialsParts=pathologicalReport.getInspectionMaterialsParts();
         this.nakedEyeExamination=pathologicalReport.getNakedEyeExamination();
         this.image=pathologicalReport.getImage();
         this.pathologicDiagnosis=pathologicalReport.getPathologicDiagnosis();
         java.util.Date _diagnosisDate = pathologicalReport.getDiagnosisDate();
         if(_diagnosisDate!=null){
         	this.diagnosisDate=_diagnosisDate.getTime();
         }
         this.revisitDoctor=pathologicalReport.getRevisitDoctor();
         this.primaryDoctor=pathologicalReport.getPrimaryDoctor();
         this.upHospitalName=pathologicalReport.getUpHospitalName();
         this.errorMessage=pathologicalReport.getErrorMessage();
         this.errorDetail=pathologicalReport.getErrorDetail();      
    }
      public String  getPathologicalReportId(){
       		return this.pathologicalReportId;
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
      public String  getVisitMark(){
       		return this.visitMark;
      }    
      public String  getRegistrationId(){
       		return this.registrationId;
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
      public Long  getInspectionDate(){
       		return this.inspectionDate;
      }    
      public String  getInspectionUnit(){
       		return this.inspectionUnit;
      }    
      public String  getClinicalDiagnosis(){
       		return this.clinicalDiagnosis;
      }    
      public String  getInspectionMaterialsParts(){
       		return this.inspectionMaterialsParts;
      }    
      public String  getNakedEyeExamination(){
       		return this.nakedEyeExamination;
      }    
      public String  getImage(){
       		return this.image;
      }    
      public String  getPathologicDiagnosis(){
       		return this.pathologicDiagnosis;
      }    
      public Long  getDiagnosisDate(){
       		return this.diagnosisDate;
      }    
      public String  getRevisitDoctor(){
       		return this.revisitDoctor;
      }    
      public String  getPrimaryDoctor(){
       		return this.primaryDoctor;
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