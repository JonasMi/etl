package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.OuthospitalOtherDiagnosis;

public class OuthospitalOtherDiagnosisDetails extends OuthospitalOtherDiagnosisRecord {
    /**
     *名称:院内诊断记录id
     *备注:本次诊断在院内系统中的唯一标识
 	 *
     */
     private String diagnosisId;
    /**
     *名称:患者id
     *备注:引用患者信息表T_PATIENT院内患者id
 	 *
     */
     private String patientId;
    /**
     *名称:患者姓名
     *
 	 *
     */
     private String patientName;
    /**
     *名称:住院流水号
     *备注:引用住院接诊表T_INPATIENT_REGISTRATION院内门诊流水号
 	 *
     */
     private String inpatientRegistrationId;
    /**
     *名称:诊断医生信息 id
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
     */
     private String diagnosisEmpId;
    /**
     *名称:诊断ICD-10编码
     *
 	 *限制:CV990111
     */
     private String diagnosisCd;
    /**
     *名称:诊断ICD-10编码的值
     *
 	 *限制:CV990111
     */
     private String diagnosisValue;
    /**
     *名称:诊断时间
     *
 	 *
     */
     private Long onsetdatetime;
    /**
     *名称:中西医诊断标志
     *
 	 *限制:CV9900033
     */
     private String tcmWesternCd;
    /**
     *名称:入院病情代码
     *
 	 *限制:CV0510019
     */
     private String inhosIllnessCd;
    /**
     *名称:治疗结果代码
     *
 	 *限制:CV0510010
     */
     private String treatResultCd;
    /**
     *名称:诊断性质代码
     *
 	 *限制:CV9900315
     */
     private String propertyCd;
    /**
     *名称:诊断说明
     *
 	 *
     */
     private String diagExplan;
    /**
     *名称:诊断顺位
     *
 	 *
     */
     private Float admitDiag;
     private String errorMessage;
     private String errorDetail;             
     public OuthospitalOtherDiagnosisDetails(OuthospitalOtherDiagnosis outhospitalOtherDiagnosis) {
        super(outhospitalOtherDiagnosis);
         this.diagnosisId=outhospitalOtherDiagnosis.getDiagnosisId();
         this.patientId=outhospitalOtherDiagnosis.getPatientId();
         this.patientName=outhospitalOtherDiagnosis.getPatientName();
         this.inpatientRegistrationId=outhospitalOtherDiagnosis.getInpatientRegistrationId();
         this.diagnosisEmpId=outhospitalOtherDiagnosis.getDiagnosisEmpId();
         this.diagnosisCd=outhospitalOtherDiagnosis.getDiagnosisCd();
         this.diagnosisValue=outhospitalOtherDiagnosis.getDiagnosisValue();
         java.util.Date _onsetdatetime = outhospitalOtherDiagnosis.getOnsetdatetime();
         if(_onsetdatetime!=null){
         	this.onsetdatetime=_onsetdatetime.getTime();
         }
         this.tcmWesternCd=outhospitalOtherDiagnosis.getTcmWesternCd();
         this.inhosIllnessCd=outhospitalOtherDiagnosis.getInhosIllnessCd();
         this.treatResultCd=outhospitalOtherDiagnosis.getTreatResultCd();
         this.propertyCd=outhospitalOtherDiagnosis.getPropertyCd();
         this.diagExplan=outhospitalOtherDiagnosis.getDiagExplan();
         this.admitDiag=outhospitalOtherDiagnosis.getAdmitDiag();
         this.errorMessage=outhospitalOtherDiagnosis.getErrorMessage();
         this.errorDetail=outhospitalOtherDiagnosis.getErrorDetail();      
    }
      public String  getDiagnosisId(){
       		return this.diagnosisId;
      }    
      public String  getPatientId(){
       		return this.patientId;
      }    
      public String  getPatientName(){
       		return this.patientName;
      }    
      public String  getInpatientRegistrationId(){
       		return this.inpatientRegistrationId;
      }    
      public String  getDiagnosisEmpId(){
       		return this.diagnosisEmpId;
      }    
      public String  getDiagnosisCd(){
       		return this.diagnosisCd;
      }    
      public String  getDiagnosisValue(){
       		return this.diagnosisValue;
      }    
      public Long  getOnsetdatetime(){
       		return this.onsetdatetime;
      }    
      public String  getTcmWesternCd(){
       		return this.tcmWesternCd;
      }    
      public String  getInhosIllnessCd(){
       		return this.inhosIllnessCd;
      }    
      public String  getTreatResultCd(){
       		return this.treatResultCd;
      }    
      public String  getPropertyCd(){
       		return this.propertyCd;
      }    
      public String  getDiagExplan(){
       		return this.diagExplan;
      }    
      public Float  getAdmitDiag(){
       		return this.admitDiag;
      }    
	  public String getErrorMessage() {
	        return errorMessage;
	  }
	  public String getErrorDetail() {
	        return errorDetail;
	  }  
}