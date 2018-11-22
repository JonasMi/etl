package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.PathologyDiagnosis;

public class PathologyDiagnosisDetails extends PathologyDiagnosisRecord {
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
     *名称:病理标本编号
     *
 	 *
     */
     private String pathhologyNo;
    /**
     *名称:分化程度代码
     *
 	 *限制:CV9900255
     */
     private String differentiationCd;
    /**
     *名称:最高诊断依据代码
     *
 	 *限制:CV9900254
     */
     private String highestDiagCd;
    /**
     *名称:诊断顺位
     *
 	 *
     */
     private Float admitDiag;
     private String errorMessage;
     private String errorDetail;             
     public PathologyDiagnosisDetails(PathologyDiagnosis pathologyDiagnosis) {
        super(pathologyDiagnosis);
         this.diagnosisId=pathologyDiagnosis.getDiagnosisId();
         this.patientId=pathologyDiagnosis.getPatientId();
         this.patientName=pathologyDiagnosis.getPatientName();
         this.inpatientRegistrationId=pathologyDiagnosis.getInpatientRegistrationId();
         this.diagnosisEmpId=pathologyDiagnosis.getDiagnosisEmpId();
         this.diagnosisCd=pathologyDiagnosis.getDiagnosisCd();
         this.diagnosisValue=pathologyDiagnosis.getDiagnosisValue();
         java.util.Date _onsetdatetime = pathologyDiagnosis.getOnsetdatetime();
         if(_onsetdatetime!=null){
         	this.onsetdatetime=_onsetdatetime.getTime();
         }
         this.pathhologyNo=pathologyDiagnosis.getPathhologyNo();
         this.differentiationCd=pathologyDiagnosis.getDifferentiationCd();
         this.highestDiagCd=pathologyDiagnosis.getHighestDiagCd();
         this.admitDiag=pathologyDiagnosis.getAdmitDiag();
         this.errorMessage=pathologyDiagnosis.getErrorMessage();
         this.errorDetail=pathologyDiagnosis.getErrorDetail();      
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
      public String  getPathhologyNo(){
       		return this.pathhologyNo;
      }    
      public String  getDifferentiationCd(){
       		return this.differentiationCd;
      }    
      public String  getHighestDiagCd(){
       		return this.highestDiagCd;
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