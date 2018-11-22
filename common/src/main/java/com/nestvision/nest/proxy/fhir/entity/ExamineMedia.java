package com.nestvision.nest.proxy.fhir.entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.nestvision.nest.proxy.base.entity.BaseEntity;
import com.nestvision.nest.proxy.fhir.anotaion.FhirFieldValidate;

@Entity
@Table(name = BaseEntity.TABLE_PREFIX + "EXAMINE_MEDIA")
public class ExamineMedia extends FhirResourceEntity {

    /**
     *名称:院内图片媒体信息id
     *备注:图片媒体信息在院内系统中的唯一id
 	 *
 	 *主键字段
     */
     @Column(name="MEDIA_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="MEDIA_ID",displayName="院内图片媒体信息id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String mediaId;
    /**
     *名称:院内检验报告单id
     *备注:引用检验报告主表T_EXAMINE_REPORT院内检验报告单id
 	 *
 	 *
     */
     @Column(name="EXAMINATION_RESULT_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="EXAMINATION_RESULT_ID",displayName="院内检验报告单id",maxLength=40,required=true,valuesRange="")   
     private String examinationResultId;
    /**
     *名称:患者id
     *备注:引用患者信息表T_PATIENT院内患者id
 	 *
 	 *
     */
     @Column(name="PATIENT_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="PATIENT_ID",displayName="患者id",maxLength=40,required=true,valuesRange="")   
     private String patientId;
    /**
     *名称:患者姓名
     *
 	 *
 	 *
     */
     @Column(name="PATIENT_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="PATIENT_NAME",displayName="患者姓名",maxLength=40,required=true,valuesRange="")   
     private String patientName;
    /**
     *名称:生成图像的人
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="OPERATOR",length = 40,nullable = true)
     @FhirFieldValidate(name="OPERATOR",displayName="生成图像的人",maxLength=40,required=false,valuesRange="")   
     private String operator;
    /**
     *名称:图片信息
     *备注:base64位编码
 	 *
 	 *
     */
     @Lob  
     @Column(name="DATA",nullable = true)
     @FhirFieldValidate(name="DATA",displayName="图片信息",required=false,valuesRange="")   
     private String data;
    /**
     *名称:图片路径
     *
 	 *
 	 *
     */
     @Column(name="URL",length = 100,nullable = true)
     @FhirFieldValidate(name="URL",displayName="图片路径",maxLength=100,required=false,valuesRange="")   
     private String url;
     @ManyToOne
     @JoinColumn(name="F_UID")
     private ExamineReport examineReport;
    
     public String getMediaId(){
       	return this.mediaId;
     }
     public void setMediaId(String mediaId){
       	this.mediaId=mediaId;
     }
     public String getExaminationResultId(){
       	return this.examinationResultId;
     }
     public void setExaminationResultId(String examinationResultId){
       	this.examinationResultId=examinationResultId;
     }
     public String getPatientId(){
       	return this.patientId;
     }
     public void setPatientId(String patientId){
       	this.patientId=patientId;
     }
     public String getPatientName(){
       	return this.patientName;
     }
     public void setPatientName(String patientName){
       	this.patientName=patientName;
     }
     public String getOperator(){
       	return this.operator;
     }
     public void setOperator(String operator){
       	this.operator=operator;
     }
     public String getData(){
       	return this.data;
     }
     public void setData(String data){
       	this.data=data;
     }
     public String getUrl(){
       	return this.url;
     }
     public void setUrl(String url){
       	this.url=url;
     }
	 public ExamineReport getExamineReport(){
	 	return this.examineReport;
	}
	 public void setExamineReport(ExamineReport examineReport){
		this.examineReport=examineReport;
	}
}