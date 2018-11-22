package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.OutpatientDiagnosis;

public class OutpatientDiagnosisDetails extends OutpatientDiagnosisRecord {
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
     *名称:门诊流水号
     *备注:引用门诊接诊表T_OUTPATIENT_REGISTRATION院内门诊流水号
 	 *
     */
     private String outpatientRegistrationId;
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
     *名称:诊断序号
     *
 	 *
     */
     private String patientSerialNo;
    /**
     *名称:是否传染病标志
     *
 	 *限制:CUS00004
     */
     private Boolean ifInfection;
    /**
     *名称:传染上报标志
     *
 	 *限制:CUS00004
     */
     private Boolean infectReportCd;
    /**
     *名称:中医征候诊断代码
     *
 	 *限制:CV9900357
     */
     private String cnSymDiagCode;
    /**
     *名称:诊断顺位
     *
 	 *
     */
     private Float admitDiag;
    /**
     *名称:中医病名诊断代码
     *
 	 *限制:CV9900357
     */
     private String cnDisDiagCode;
     private String errorMessage;
     private String errorDetail;             
     public OutpatientDiagnosisDetails(OutpatientDiagnosis outpatientDiagnosis) {
        super(outpatientDiagnosis);
         this.diagnosisId=outpatientDiagnosis.getDiagnosisId();
         this.patientId=outpatientDiagnosis.getPatientId();
         this.patientName=outpatientDiagnosis.getPatientName();
         this.outpatientRegistrationId=outpatientDiagnosis.getOutpatientRegistrationId();
         this.diagnosisEmpId=outpatientDiagnosis.getDiagnosisEmpId();
         this.diagnosisCd=outpatientDiagnosis.getDiagnosisCd();
         this.diagnosisValue=outpatientDiagnosis.getDiagnosisValue();
         java.util.Date _onsetdatetime = outpatientDiagnosis.getOnsetdatetime();
         if(_onsetdatetime!=null){
         	this.onsetdatetime=_onsetdatetime.getTime();
         }
         this.patientSerialNo=outpatientDiagnosis.getPatientSerialNo();
         this.ifInfection=outpatientDiagnosis.getIfInfection();
         this.infectReportCd=outpatientDiagnosis.getInfectReportCd();
         this.cnSymDiagCode=outpatientDiagnosis.getCnSymDiagCode();
         this.admitDiag=outpatientDiagnosis.getAdmitDiag();
         this.cnDisDiagCode=outpatientDiagnosis.getCnDisDiagCode();
         this.errorMessage=outpatientDiagnosis.getErrorMessage();
         this.errorDetail=outpatientDiagnosis.getErrorDetail();      
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
      public String  getOutpatientRegistrationId(){
       		return this.outpatientRegistrationId;
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
      public String  getPatientSerialNo(){
       		return this.patientSerialNo;
      }    
      public Boolean  getIfInfection(){
       		return this.ifInfection;
      }    
      public Boolean  getInfectReportCd(){
       		return this.infectReportCd;
      }    
      public String  getCnSymDiagCode(){
       		return this.cnSymDiagCode;
      }    
      public Float  getAdmitDiag(){
       		return this.admitDiag;
      }    
      public String  getCnDisDiagCode(){
       		return this.cnDisDiagCode;
      }    
	  public String getErrorMessage() {
	        return errorMessage;
	  }
	  public String getErrorDetail() {
	        return errorDetail;
	  }  
}