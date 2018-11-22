package com.nestvision.nest.proxy.fhir.entity;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.nestvision.nest.proxy.base.entity.BaseEntity;
import com.nestvision.nest.proxy.fhir.anotaion.FhirFieldValidate;

@Entity
@Table(name = BaseEntity.TABLE_PREFIX + "HCR_DEATH_CAUSE_LINE_RECORD")
public class HcrDeathCauseLineRecord extends FhirResourceEntity {

    /**
     *名称:死亡记录id
     *备注:引用住院病程记录-死亡记录HCR_DEATH_RECORD死亡记录HCR_DEATH_RECORD_ID
 	 *
 	 *主键字段
     */
     @Column(name="HCR_DEATH_RECORD_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="HCR_DEATH_RECORD_ID",displayName="死亡记录id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String hcrDeathRecordId;
    /**
     *名称:死因链-序列号
     *
 	 *
 	 *主键字段
     */
     @Column(name="CHAIN_DEATH_CHAIN",length = 40,nullable = false)
     @FhirFieldValidate(name="CHAIN_DEATH_CHAIN",displayName="死因链-序列号",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String chainDeathChain;
    /**
     *名称:死因链-顺序代码
     *
 	 *限制:CV990109
 	 *
     */
     @Column(name="CHAIN_DEATH_SEQUENCE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="CHAIN_DEATH_SEQUENCE_CODE",displayName="死因链-顺序代码",maxLength=20,required=false,valuesRange="CV990109")   
     private String chainDeathSequenceCode;
    /**
     *名称:死因链-疾病代码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="CHAIN_DEATH_ILLNESS_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="CHAIN_DEATH_ILLNESS_CODE",displayName="死因链-疾病代码",maxLength=20,required=false,valuesRange="CV990111")   
     private String chainDeathIllnessCode;
    /**
     *名称:死因链-时间间隔-单位代码
     *
 	 *限制:CV9900384
 	 *
     */
     @Column(name="CHAIN_TIME_INTERVAL_UNIT_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="CHAIN_TIME_INTERVAL_UNIT_CODE",displayName="死因链-时间间隔-单位代码",maxLength=20,required=false,valuesRange="CV9900384")   
     private String chainTimeIntervalUnitCode;
    /**
     *名称:死因链-时间间隔-时长
     *
 	 *
 	 *
     */
     @Column(name="CHAIN_TIME_INTERVAL_TIME",length = 8,nullable = true)
     @FhirFieldValidate(name="CHAIN_TIME_INTERVAL_TIME",displayName="死因链-时间间隔-时长",maxLength=8,required=false,valuesRange="")   
     private Float chainTimeIntervalTime;
    /**
     *名称:死因链-死亡原因详细描述
     *
 	 *
 	 *
     */
     @Column(name="CHAIN_DEATH_CAUSE",columnDefinition="text")
     @FhirFieldValidate(name="CHAIN_DEATH_CAUSE",displayName="死因链-死亡原因详细描述",required=false,valuesRange="")   
     private String chainDeathCause;
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
     private HcrDeathRecord hcrDeathRecord;
    
     public String getHcrDeathRecordId(){
       	return this.hcrDeathRecordId;
     }
     public void setHcrDeathRecordId(String hcrDeathRecordId){
       	this.hcrDeathRecordId=hcrDeathRecordId;
     }
     public String getChainDeathChain(){
       	return this.chainDeathChain;
     }
     public void setChainDeathChain(String chainDeathChain){
       	this.chainDeathChain=chainDeathChain;
     }
     public String getChainDeathSequenceCode(){
       	return this.chainDeathSequenceCode;
     }
     public void setChainDeathSequenceCode(String chainDeathSequenceCode){
       	this.chainDeathSequenceCode=chainDeathSequenceCode;
     }
     public String getChainDeathIllnessCode(){
       	return this.chainDeathIllnessCode;
     }
     public void setChainDeathIllnessCode(String chainDeathIllnessCode){
       	this.chainDeathIllnessCode=chainDeathIllnessCode;
     }
     public String getChainTimeIntervalUnitCode(){
       	return this.chainTimeIntervalUnitCode;
     }
     public void setChainTimeIntervalUnitCode(String chainTimeIntervalUnitCode){
       	this.chainTimeIntervalUnitCode=chainTimeIntervalUnitCode;
     }
     public Float getChainTimeIntervalTime(){
       	return this.chainTimeIntervalTime;
     }
     public void setChainTimeIntervalTime(Float chainTimeIntervalTime){
       	this.chainTimeIntervalTime=chainTimeIntervalTime;
     }
     public String getChainDeathCause(){
       	return this.chainDeathCause;
     }
     public void setChainDeathCause(String chainDeathCause){
       	this.chainDeathCause=chainDeathCause;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
	 public HcrDeathRecord getHcrDeathRecord(){
	 	return this.hcrDeathRecord;
	}
	 public void setHcrDeathRecord(HcrDeathRecord hcrDeathRecord){
		this.hcrDeathRecord=hcrDeathRecord;
	}
}