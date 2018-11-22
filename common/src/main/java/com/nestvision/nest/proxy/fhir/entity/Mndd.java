package com.nestvision.nest.proxy.fhir.entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import java.util.Date;
import javax.persistence.TemporalType;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.nestvision.nest.proxy.base.entity.BaseEntity;
import com.nestvision.nest.proxy.fhir.anotaion.FhirFieldValidate;

@Entity
@Table(name = BaseEntity.TABLE_PREFIX + "MNDD")
public class Mndd extends FhirResourceEntity {

    /**
     *名称:院内新生儿缺陷诊断记录id
     *备注:本次诊断在院内系统中的唯一标识
 	 *
 	 *主键字段
     */
     @Column(name="DIAGNOSIS_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="DIAGNOSIS_ID",displayName="院内新生儿缺陷诊断记录id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String diagnosisId;
    /**
     *名称:诊断ICD-10编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="DIAGNOSIS_CD",length = 20,nullable = false)
     @FhirFieldValidate(name="DIAGNOSIS_CD",displayName="诊断ICD-10编码",maxLength=20,required=true,valuesRange="CV990111")   
     private String diagnosisCd;
    /**
     *名称:诊断ICD-10编码的值
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="DIAGNOSIS_VALUE",length = 100,nullable = true)
     @FhirFieldValidate(name="DIAGNOSIS_VALUE",displayName="诊断ICD-10编码的值",maxLength=100,required=false,valuesRange="CV990111")   
     private String diagnosisValue;
    /**
     *名称:诊断时间
     *
 	 *
 	 *
     */
     @Column(name="ONSETDATETIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="ONSETDATETIME",displayName="诊断时间",required=false,valuesRange="")   
     private Date onsetdatetime;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
     @ManyToOne
     @JoinColumn(name="F_UID")
     private MedicalRecord medicalRecord;
    
     public String getDiagnosisId(){
       	return this.diagnosisId;
     }
     public void setDiagnosisId(String diagnosisId){
       	this.diagnosisId=diagnosisId;
     }
     public String getDiagnosisCd(){
       	return this.diagnosisCd;
     }
     public void setDiagnosisCd(String diagnosisCd){
       	this.diagnosisCd=diagnosisCd;
     }
     public String getDiagnosisValue(){
       	return this.diagnosisValue;
     }
     public void setDiagnosisValue(String diagnosisValue){
       	this.diagnosisValue=diagnosisValue;
     }
     public Date getOnsetdatetime(){
       	return this.onsetdatetime;
     }
     public void setOnsetdatetime(Date onsetdatetime){
       	this.onsetdatetime=onsetdatetime;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
	 public MedicalRecord getMedicalRecord(){
	 	return this.medicalRecord;
	}
	 public void setMedicalRecord(MedicalRecord medicalRecord){
		this.medicalRecord=medicalRecord;
	}
}