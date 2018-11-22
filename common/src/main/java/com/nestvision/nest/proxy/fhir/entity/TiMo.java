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
@Table(name = BaseEntity.TABLE_PREFIX + "TI_MO")
public class TiMo extends FhirResourceEntity {

    /**
     *名称:院内手术单id
     *备注:本次手术在院内系统中的唯一标识
 	 *
 	 *主键字段
     */
     @Column(name="OPERATION_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="OPERATION_ID",displayName="院内手术单id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String operationId;
    /**
     *名称:麻醉方法代码
     *
 	 *限制:CV0600103
 	 *
     */
     @Column(name="ANESTHESIA_METHOD_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="ANESTHESIA_METHOD_CD",displayName="麻醉方法代码",maxLength=20,required=false,valuesRange="CV0600103")   
     private String anesthesiaMethodCd;
    /**
     *名称:麻醉方法名称
     *
 	 *
 	 *
     */
     @Column(name="ANESTHESIA_METHOD_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="ANESTHESIA_METHOD_NAME",displayName="麻醉方法名称",maxLength=40,required=false,valuesRange="")   
     private String anesthesiaMethodName;
    /**
     *名称:手术编码
     *
 	 *限制:CV990113
 	 *
     */
     @Column(name="OPERATION_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="OPERATION_CD",displayName="手术编码",maxLength=20,required=false,valuesRange="CV990113")   
     private String operationCd;
    /**
     *名称:手术名称
     *
 	 *
 	 *
     */
     @Column(name="OPERATION_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="OPERATION_NAME",displayName="手术名称",maxLength=40,required=false,valuesRange="")   
     private String operationName;
    /**
     *名称:手术操作目标部位代码
     *
 	 *限制:CV0600227
 	 *
     */
     @Column(name="PART_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="PART_CODE",displayName="手术操作目标部位代码",maxLength=20,required=false,valuesRange="CV0600227")   
     private String partCode;
    /**
     *名称:手术操作目标部位名称
     *
 	 *限制:CV0600227
 	 *
     */
     @Column(name="PART_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="PART_NAME",displayName="手术操作目标部位名称",maxLength=20,required=false,valuesRange="CV0600227")   
     private String partName;
    /**
     *名称:手术者id
     *
 	 *
 	 *
     */
     @Column(name="OPERATIVE",length = 40,nullable = true)
     @FhirFieldValidate(name="OPERATIVE",displayName="手术者id",maxLength=40,required=false,valuesRange="")   
     private String operative;
    /**
     *名称:手术者姓名
     *
 	 *
 	 *
     */
     @Column(name="OPERATIVE_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="OPERATIVE_NAME",displayName="手术者姓名",maxLength=40,required=false,valuesRange="")   
     private String operativeName;
    /**
     *名称:I助id
     *
 	 *
 	 *
     */
     @Column(name="FIRST_ASSISTANT",length = 40,nullable = true)
     @FhirFieldValidate(name="FIRST_ASSISTANT",displayName="I助id",maxLength=40,required=false,valuesRange="")   
     private String firstAssistant;
    /**
     *名称:I助姓名
     *
 	 *
 	 *
     */
     @Column(name="FIRST_ASSISTANT_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="FIRST_ASSISTANT_NAME",displayName="I助姓名",maxLength=40,required=false,valuesRange="")   
     private String firstAssistantName;
    /**
     *名称:II助id
     *
 	 *
 	 *
     */
     @Column(name="SECOND_ASSISTANT",length = 40,nullable = true)
     @FhirFieldValidate(name="SECOND_ASSISTANT",displayName="II助id",maxLength=40,required=false,valuesRange="")   
     private String secondAssistant;
    /**
     *名称:II助姓名
     *
 	 *
 	 *
     */
     @Column(name="SECOND_ASSISTANT_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="SECOND_ASSISTANT_NAME",displayName="II助姓名",maxLength=40,required=false,valuesRange="")   
     private String secondAssistantName;
    /**
     *名称:麻醉者id
     *
 	 *
 	 *
     */
     @Column(name="ANAESTHETIC",length = 40,nullable = true)
     @FhirFieldValidate(name="ANAESTHETIC",displayName="麻醉者id",maxLength=40,required=false,valuesRange="")   
     private String anaesthetic;
    /**
     *名称:麻醉者姓名
     *
 	 *
 	 *
     */
     @Column(name="ANAESTHETIC_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="ANAESTHETIC_NAME",displayName="麻醉者姓名",maxLength=40,required=false,valuesRange="")   
     private String anaestheticName;
    /**
     *名称:手术开始时间
     *
 	 *
 	 *
     */
     @Column(name="PROCEDURE_START",nullable = false)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="PROCEDURE_START",displayName="手术开始时间",required=true,valuesRange="")   
     private Date procedureStart;
    /**
     *名称:手术结束时间
     *
 	 *
 	 *
     */
     @Column(name="PROCEDURE_END",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="PROCEDURE_END",displayName="手术结束时间",required=false,valuesRange="")   
     private Date procedureEnd;
    /**
     *名称:切口类别代码
     *
 	 *限制:CV0510022
 	 *
     */
     @Column(name="INCISION_TYPE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="INCISION_TYPE_CODE",displayName="切口类别代码",maxLength=20,required=false,valuesRange="CV0510022")   
     private String incisionTypeCode;
    /**
     *名称:切口愈合级别代码
     *
 	 *限制:CV550114
 	 *
     */
     @Column(name="INCISION_HEALING_RANK_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="INCISION_HEALING_RANK_CODE",displayName="切口愈合级别代码",maxLength=20,required=false,valuesRange="CV550114")   
     private String incisionHealingRankCode;
    /**
     *名称:是否主要术式
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="OP_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="OP_MARK",displayName="是否主要术式",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean opMark;
    /**
     *名称:是否主要手术或操作
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="OP_PRO_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="OP_PRO_MARK",displayName="是否主要手术或操作",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean opProMark;
    /**
     *名称:手术级别代码
     *
 	 *限制:CV9900040
 	 *
     */
     @Column(name="OP_LEVEL_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="OP_LEVEL_CD",displayName="手术级别代码",maxLength=20,required=false,valuesRange="CV9900040")   
     private String opLevelCd;
    /**
     *名称:麻醉分级代码
     *
 	 *限制:CV9900329
 	 *
     */
     @Column(name="ANESTHESIA_LEVEL_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="ANESTHESIA_LEVEL_CD",displayName="麻醉分级代码",maxLength=20,required=false,valuesRange="CV9900329")   
     private String anesthesiaLevelCd;
    /**
     *名称:手术操作序号
     *
 	 *
 	 *
     */
     @Column(name="OP_NO",length = 40,nullable = true)
     @FhirFieldValidate(name="OP_NO",displayName="手术操作序号",maxLength=40,required=false,valuesRange="")   
     private String opNo;
    /**
     *名称:手术患者类型代码
     *
 	 *限制:CV990105
 	 *
     */
     @Column(name="OPER_PATIENT_TYPE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="OPER_PATIENT_TYPE_CODE",displayName="手术患者类型代码",maxLength=20,required=false,valuesRange="CV990105")   
     private String operPatientTypeCode;
    /**
     *名称:输血反应标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="TRANSFUSE_REACTION_FLAG",length = 5,nullable = true)
     @FhirFieldValidate(name="TRANSFUSE_REACTION_FLAG",displayName="输血反应标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean transfuseReactionFlag;
    /**
     *名称:输红细胞量(单位)
     *
 	 *
 	 *
     */
     @Column(name="RED_BLOOD_CELL",length = 8,nullable = true)
     @FhirFieldValidate(name="RED_BLOOD_CELL",displayName="输红细胞量(单位)",maxLength=8,required=false,valuesRange="")   
     private Float redBloodCell;
    /**
     *名称:输血小板量(袋)
     *
 	 *
 	 *
     */
     @Column(name="PLATELET",length = 8,nullable = true)
     @FhirFieldValidate(name="PLATELET",displayName="输血小板量(袋)",maxLength=8,required=false,valuesRange="")   
     private Float platelet;
    /**
     *名称:输血浆量(ml)
     *
 	 *
 	 *
     */
     @Column(name="PLASMA",length = 8,nullable = true)
     @FhirFieldValidate(name="PLASMA",displayName="输血浆量(ml)",maxLength=8,required=false,valuesRange="")   
     private Float plasma;
    /**
     *名称:输全血量(ml)
     *
 	 *
 	 *
     */
     @Column(name="WHOLE_BLOOD",length = 8,nullable = true)
     @FhirFieldValidate(name="WHOLE_BLOOD",displayName="输全血量(ml)",maxLength=8,required=false,valuesRange="")   
     private Float wholeBlood;
    /**
     *名称:自身回收(ml)
     *
 	 *
 	 *
     */
     @Column(name="SELF_BLOOD",length = 8,nullable = true)
     @FhirFieldValidate(name="SELF_BLOOD",displayName="自身回收(ml)",maxLength=8,required=false,valuesRange="")   
     private Float selfBlood;
    /**
     *名称:输其它血制品量(ml)
     *
 	 *
 	 *
     */
     @Column(name="OTHER_BLOOD",length = 8,nullable = true)
     @FhirFieldValidate(name="OTHER_BLOOD",displayName="输其它血制品量(ml)",maxLength=8,required=false,valuesRange="")   
     private Float otherBlood;
    /**
     *名称:呼吸机使用时度（h）
     *
 	 *
 	 *
     */
     @Column(name="LIFE_SUPPORT_MACHINE_TIME",length = 8,nullable = true)
     @FhirFieldValidate(name="LIFE_SUPPORT_MACHINE_TIME",displayName="呼吸机使用时度（h）",maxLength=8,required=false,valuesRange="")   
     private Float lifeSupportMachineTime;
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
     private TiMedicalRecord tiMedicalRecord;
    
     public String getOperationId(){
       	return this.operationId;
     }
     public void setOperationId(String operationId){
       	this.operationId=operationId;
     }
     public String getAnesthesiaMethodCd(){
       	return this.anesthesiaMethodCd;
     }
     public void setAnesthesiaMethodCd(String anesthesiaMethodCd){
       	this.anesthesiaMethodCd=anesthesiaMethodCd;
     }
     public String getAnesthesiaMethodName(){
       	return this.anesthesiaMethodName;
     }
     public void setAnesthesiaMethodName(String anesthesiaMethodName){
       	this.anesthesiaMethodName=anesthesiaMethodName;
     }
     public String getOperationCd(){
       	return this.operationCd;
     }
     public void setOperationCd(String operationCd){
       	this.operationCd=operationCd;
     }
     public String getOperationName(){
       	return this.operationName;
     }
     public void setOperationName(String operationName){
       	this.operationName=operationName;
     }
     public String getPartCode(){
       	return this.partCode;
     }
     public void setPartCode(String partCode){
       	this.partCode=partCode;
     }
     public String getPartName(){
       	return this.partName;
     }
     public void setPartName(String partName){
       	this.partName=partName;
     }
     public String getOperative(){
       	return this.operative;
     }
     public void setOperative(String operative){
       	this.operative=operative;
     }
     public String getOperativeName(){
       	return this.operativeName;
     }
     public void setOperativeName(String operativeName){
       	this.operativeName=operativeName;
     }
     public String getFirstAssistant(){
       	return this.firstAssistant;
     }
     public void setFirstAssistant(String firstAssistant){
       	this.firstAssistant=firstAssistant;
     }
     public String getFirstAssistantName(){
       	return this.firstAssistantName;
     }
     public void setFirstAssistantName(String firstAssistantName){
       	this.firstAssistantName=firstAssistantName;
     }
     public String getSecondAssistant(){
       	return this.secondAssistant;
     }
     public void setSecondAssistant(String secondAssistant){
       	this.secondAssistant=secondAssistant;
     }
     public String getSecondAssistantName(){
       	return this.secondAssistantName;
     }
     public void setSecondAssistantName(String secondAssistantName){
       	this.secondAssistantName=secondAssistantName;
     }
     public String getAnaesthetic(){
       	return this.anaesthetic;
     }
     public void setAnaesthetic(String anaesthetic){
       	this.anaesthetic=anaesthetic;
     }
     public String getAnaestheticName(){
       	return this.anaestheticName;
     }
     public void setAnaestheticName(String anaestheticName){
       	this.anaestheticName=anaestheticName;
     }
     public Date getProcedureStart(){
       	return this.procedureStart;
     }
     public void setProcedureStart(Date procedureStart){
       	this.procedureStart=procedureStart;
     }
     public Date getProcedureEnd(){
       	return this.procedureEnd;
     }
     public void setProcedureEnd(Date procedureEnd){
       	this.procedureEnd=procedureEnd;
     }
     public String getIncisionTypeCode(){
       	return this.incisionTypeCode;
     }
     public void setIncisionTypeCode(String incisionTypeCode){
       	this.incisionTypeCode=incisionTypeCode;
     }
     public String getIncisionHealingRankCode(){
       	return this.incisionHealingRankCode;
     }
     public void setIncisionHealingRankCode(String incisionHealingRankCode){
       	this.incisionHealingRankCode=incisionHealingRankCode;
     }
     public Boolean getOpMark(){
       	return this.opMark;
     }
     public void setOpMark(Boolean opMark){
       	this.opMark=opMark;
     }
     public Boolean getOpProMark(){
       	return this.opProMark;
     }
     public void setOpProMark(Boolean opProMark){
       	this.opProMark=opProMark;
     }
     public String getOpLevelCd(){
       	return this.opLevelCd;
     }
     public void setOpLevelCd(String opLevelCd){
       	this.opLevelCd=opLevelCd;
     }
     public String getAnesthesiaLevelCd(){
       	return this.anesthesiaLevelCd;
     }
     public void setAnesthesiaLevelCd(String anesthesiaLevelCd){
       	this.anesthesiaLevelCd=anesthesiaLevelCd;
     }
     public String getOpNo(){
       	return this.opNo;
     }
     public void setOpNo(String opNo){
       	this.opNo=opNo;
     }
     public String getOperPatientTypeCode(){
       	return this.operPatientTypeCode;
     }
     public void setOperPatientTypeCode(String operPatientTypeCode){
       	this.operPatientTypeCode=operPatientTypeCode;
     }
     public Boolean getTransfuseReactionFlag(){
       	return this.transfuseReactionFlag;
     }
     public void setTransfuseReactionFlag(Boolean transfuseReactionFlag){
       	this.transfuseReactionFlag=transfuseReactionFlag;
     }
     public Float getRedBloodCell(){
       	return this.redBloodCell;
     }
     public void setRedBloodCell(Float redBloodCell){
       	this.redBloodCell=redBloodCell;
     }
     public Float getPlatelet(){
       	return this.platelet;
     }
     public void setPlatelet(Float platelet){
       	this.platelet=platelet;
     }
     public Float getPlasma(){
       	return this.plasma;
     }
     public void setPlasma(Float plasma){
       	this.plasma=plasma;
     }
     public Float getWholeBlood(){
       	return this.wholeBlood;
     }
     public void setWholeBlood(Float wholeBlood){
       	this.wholeBlood=wholeBlood;
     }
     public Float getSelfBlood(){
       	return this.selfBlood;
     }
     public void setSelfBlood(Float selfBlood){
       	this.selfBlood=selfBlood;
     }
     public Float getOtherBlood(){
       	return this.otherBlood;
     }
     public void setOtherBlood(Float otherBlood){
       	this.otherBlood=otherBlood;
     }
     public Float getLifeSupportMachineTime(){
       	return this.lifeSupportMachineTime;
     }
     public void setLifeSupportMachineTime(Float lifeSupportMachineTime){
       	this.lifeSupportMachineTime=lifeSupportMachineTime;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
	 public TiMedicalRecord getTiMedicalRecord(){
	 	return this.tiMedicalRecord;
	}
	 public void setTiMedicalRecord(TiMedicalRecord tiMedicalRecord){
		this.tiMedicalRecord=tiMedicalRecord;
	}
}