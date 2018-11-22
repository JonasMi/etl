package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.InpatientSymptom;

public class InpatientSymptomDetails extends InpatientSymptomRecord {
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
     *名称:记录医生所在科室id
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
     */
     private String dpId;
    /**
     *名称:发病时间
     *
 	 *
     */
     private Long onsetDate;
     private String errorMessage;
     private String errorDetail;             
     public InpatientSymptomDetails(InpatientSymptom inpatientSymptom) {
        super(inpatientSymptom);
         this.diagnosisId=inpatientSymptom.getDiagnosisId();
         this.patientId=inpatientSymptom.getPatientId();
         this.patientName=inpatientSymptom.getPatientName();
         this.inpatientRegistrationId=inpatientSymptom.getInpatientRegistrationId();
         this.diagnosisEmpId=inpatientSymptom.getDiagnosisEmpId();
         this.diagnosisCd=inpatientSymptom.getDiagnosisCd();
         this.diagnosisValue=inpatientSymptom.getDiagnosisValue();
         java.util.Date _onsetdatetime = inpatientSymptom.getOnsetdatetime();
         if(_onsetdatetime!=null){
         	this.onsetdatetime=_onsetdatetime.getTime();
         }
         this.dpId=inpatientSymptom.getDpId();
         java.util.Date _onsetDate = inpatientSymptom.getOnsetDate();
         if(_onsetDate!=null){
         	this.onsetDate=_onsetDate.getTime();
         }
         this.errorMessage=inpatientSymptom.getErrorMessage();
         this.errorDetail=inpatientSymptom.getErrorDetail();      
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
      public String  getDpId(){
       		return this.dpId;
      }    
      public Long  getOnsetDate(){
       		return this.onsetDate;
      }    
	  public String getErrorMessage() {
	        return errorMessage;
	  }
	  public String getErrorDetail() {
	        return errorDetail;
	  }  
}