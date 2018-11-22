package com.nestvision.nest.proxy.fhir.entity;
import javax.persistence.Temporal;
import java.util.Date;
import javax.persistence.TemporalType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.nestvision.nest.proxy.base.entity.BaseEntity;
import com.nestvision.nest.proxy.fhir.anotaion.FhirFieldValidate;

@Entity
@Table(name = BaseEntity.TABLE_PREFIX + "MEDICATION")
public class Medication extends FhirResourceEntity {

    /**
     *名称:院内药品编码
     *备注:药品在院内系统中的编码
 	 *
 	 *主键字段
     */
     @Column(name="MEDICATION_CD",length = 40,nullable = false)
     @FhirFieldValidate(name="MEDICATION_CD",displayName="院内药品编码",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String medicationCd;
    /**
     *名称:院内药品名称
     *
 	 *
 	 *
     */
     @Column(name="MEDICATION_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="MEDICATION_NAME",displayName="院内药品名称",maxLength=40,required=true,valuesRange="")   
     private String medicationName;
    /**
     *名称:医保系统药物编码
     *
 	 *
 	 *
     */
     @Column(name="MEDICAL_INSURANCE",length = 100,nullable = true)
     @FhirFieldValidate(name="MEDICAL_INSURANCE",displayName="医保系统药物编码",maxLength=100,required=false,valuesRange="")   
     private String medicalInsurance;
    /**
     *名称:医保系统药物名称
     *
 	 *
 	 *
     */
     @Column(name="MEDICAL_INSURANCE_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="MEDICAL_INSURANCE_NAME",displayName="医保系统药物名称",maxLength=40,required=false,valuesRange="")   
     private String medicalInsuranceName;
    /**
     *名称:农合系统药物编码
     *
 	 *
 	 *
     */
     @Column(name="AGRICULTURAL",length = 100,nullable = true)
     @FhirFieldValidate(name="AGRICULTURAL",displayName="农合系统药物编码",maxLength=100,required=false,valuesRange="")   
     private String agricultural;
    /**
     *名称:农合系统药物名称
     *
 	 *
 	 *
     */
     @Column(name="AGRICULTURAL_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="AGRICULTURAL_NAME",displayName="农合系统药物名称",maxLength=40,required=false,valuesRange="")   
     private String agriculturalName;
    /**
     *名称:国药准字系统药物编码
     *备注:药品在市平台中的标准编码
 	 *限制:CV990110
 	 *
     */
     @Column(name="STANDARD_CD",length = 40,nullable = true)
     @FhirFieldValidate(name="STANDARD_CD",displayName="国药准字系统药物编码",maxLength=40,required=false,valuesRange="CV990110")   
     private String standardCd;
    /**
     *名称:国药准字系统药物名称
     *
 	 *
 	 *
     */
     @Column(name="STANDARD_NAME",length = 100,nullable = true)
     @FhirFieldValidate(name="STANDARD_NAME",displayName="国药准字系统药物名称",maxLength=100,required=false,valuesRange="")   
     private String standardName;
    /**
     *名称:是否是品牌药物
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="ISBRAND",length = 5,nullable = true)
     @FhirFieldValidate(name="ISBRAND",displayName="是否是品牌药物",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean isbrand;
    /**
     *名称:药品生产商名字
     *
 	 *
 	 *
     */
     @Column(name="MANUFACTURER",length = 100,nullable = true)
     @FhirFieldValidate(name="MANUFACTURER",displayName="药品生产商名字",maxLength=100,required=false,valuesRange="")   
     private String manufacturer;
    /**
     *名称:药物剂型代码
     *
 	 *限制:CV0850002
 	 *
     */
     @Column(name="DRUG_DOSAGE_FORMS",length = 20,nullable = true)
     @FhirFieldValidate(name="DRUG_DOSAGE_FORMS",displayName="药物剂型代码",maxLength=20,required=false,valuesRange="CV0850002")   
     private String drugDosageForms;
    /**
     *名称:药物剂型名称
     *
 	 *限制:CV0850002
 	 *
     */
     @Column(name="DRUG_DOSAGE_NAME",length = 50,nullable = true)
     @FhirFieldValidate(name="DRUG_DOSAGE_NAME",displayName="药物剂型名称",maxLength=50,required=false,valuesRange="CV0850002")   
     private String drugDosageName;
    /**
     *名称:生产批次号
     *
 	 *
 	 *
     */
     @Column(name="LOTNUMBER",length = 40,nullable = true)
     @FhirFieldValidate(name="LOTNUMBER",displayName="生产批次号",maxLength=40,required=false,valuesRange="")   
     private String lotnumber;
    /**
     *名称:过期时间
     *
 	 *
 	 *
     */
     @Column(name="EXPIRATIONDATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="EXPIRATIONDATE",displayName="过期时间",required=false,valuesRange="")   
     private Date expirationdate;
    /**
     *名称:包装类型
     *
 	 *限制:CV9900363
 	 *
     */
     @Column(name="MEDICATION_PACKAGE_FORM_CODES",length = 20,nullable = true)
     @FhirFieldValidate(name="MEDICATION_PACKAGE_FORM_CODES",displayName="包装类型",maxLength=20,required=false,valuesRange="CV9900363")   
     private String medicationPackageFormCodes;
    /**
     *名称:是否OTC
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IS_OTC",length = 5,nullable = true)
     @FhirFieldValidate(name="IS_OTC",displayName="是否OTC",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean isOtc;
    /**
     *名称:商品名
     *
 	 *
 	 *
     */
     @Column(name="ALIAS_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="ALIAS_NAME",displayName="商品名",maxLength=40,required=false,valuesRange="")   
     private String aliasName;
    /**
     *名称:规格
     *
 	 *
 	 *
     */
     @Column(name="SPEC",length = 40,nullable = true)
     @FhirFieldValidate(name="SPEC",displayName="规格",maxLength=40,required=false,valuesRange="")   
     private String spec;
    /**
     *名称:大包装单位
     *
 	 *
 	 *
     */
     @Column(name="ROUTE_UNIT",length = 40,nullable = true)
     @FhirFieldValidate(name="ROUTE_UNIT",displayName="大包装单位",maxLength=40,required=false,valuesRange="")   
     private String routeUnit;
    /**
     *名称:小包装单位
     *
 	 *
 	 *
     */
     @Column(name="LEAST_UNIT",length = 40,nullable = true)
     @FhirFieldValidate(name="LEAST_UNIT",displayName="小包装单位",maxLength=40,required=false,valuesRange="")   
     private String leastUnit;
    /**
     *名称:大、小包装换算
     *
 	 *
 	 *
     */
     @Column(name="PROPORTION",length = 8,nullable = true)
     @FhirFieldValidate(name="PROPORTION",displayName="大、小包装换算",maxLength=8,required=false,valuesRange="")   
     private Float proportion;
    /**
     *名称:门诊使用单位
     *
 	 *限制:CV9900268
 	 *
     */
     @Column(name="CLI_UNIT_CHECK",length = 10,nullable = true)
     @FhirFieldValidate(name="CLI_UNIT_CHECK",displayName="门诊使用单位",maxLength=10,required=false,valuesRange="CV9900268")   
     private String cliUnitCheck;
    /**
     *名称:住院使用单位
     *
 	 *限制:CV9900268
 	 *
     */
     @Column(name="INH_UNIT_CHECK",length = 10,nullable = true)
     @FhirFieldValidate(name="INH_UNIT_CHECK",displayName="住院使用单位",maxLength=10,required=false,valuesRange="CV9900268")   
     private String inhUnitCheck;
    /**
     *名称:是否基础药
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_BASIC",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_BASIC",displayName="是否基础药",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifBasic;
    /**
     *名称:是否进口药
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_IMPORT",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_IMPORT",displayName="是否进口药",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifImport;
    /**
     *名称:是否毒、麻类药物
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_POISON",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_POISON",displayName="是否毒、麻类药物",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifPoison;
    /**
     *名称:是否精神类药物
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_PSYCHOTROPIC",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_PSYCHOTROPIC",displayName="是否精神类药物",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifPsychotropic;
    /**
     *名称:是否贵重药品
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_PRECIOUS",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_PRECIOUS",displayName="是否贵重药品",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifPrecious;
    /**
     *名称:是否抗菌药物标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_ANTIBIOTIC",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_ANTIBIOTIC",displayName="是否抗菌药物标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifAntibiotic;
    /**
     *名称:抗菌药等级
     *
 	 *限制:CV9900275
 	 *
     */
     @Column(name="ANTIBIOTIC_TYPE",length = 20,nullable = true)
     @FhirFieldValidate(name="ANTIBIOTIC_TYPE",displayName="抗菌药等级",maxLength=20,required=false,valuesRange="CV9900275")   
     private String antibioticType;
    /**
     *名称:药品类别代码
     *
 	 *限制:CV9900044
 	 *
     */
     @Column(name="MEDICATION_TYPE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="MEDICATION_TYPE_CODE",displayName="药品类别代码",maxLength=20,required=false,valuesRange="CV9900044")   
     private String medicationTypeCode;
    /**
     *名称:中药类别代码
     *
 	 *限制:CV0600101
 	 *
     */
     @Column(name="CN_MEDICATION_TYPE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="CN_MEDICATION_TYPE_CODE",displayName="中药类别代码",maxLength=20,required=false,valuesRange="CV0600101")   
     private String cnMedicationTypeCode;
    /**
     *名称:药物类型代码
     *
 	 *限制:CV0530106
 	 *
     */
     @Column(name="DRUG_TYPE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="DRUG_TYPE_CODE",displayName="药物类型代码",maxLength=20,required=false,valuesRange="CV0530106")   
     private String drugTypeCode;
    /**
     *名称:DDD值/最小剂量
     *
 	 *
 	 *
     */
     @Column(name="DDD_VALUE",length = 8,nullable = true)
     @FhirFieldValidate(name="DDD_VALUE",displayName="DDD值/最小剂量",maxLength=8,required=false,valuesRange="")   
     private Float dddValue;
    /**
     *名称:药物不良反应情况
     *
 	 *
 	 *
     */
     @Column(name="DRUG_ADVERSE_REACTION",length = 200,nullable = true)
     @FhirFieldValidate(name="DRUG_ADVERSE_REACTION",displayName="药物不良反应情况",maxLength=200,required=false,valuesRange="")   
     private String drugAdverseReaction;
    /**
     *名称:医保报销标志
     *
 	 *限制:CV9900286
 	 *
     */
     @Column(name="MEDICATION_CATEGORY",length = 20,nullable = true)
     @FhirFieldValidate(name="MEDICATION_CATEGORY",displayName="医保报销标志",maxLength=20,required=false,valuesRange="CV9900286")   
     private String medicationCategory;
    /**
     *名称:农合报销标志
     *
 	 *限制:CV9900373
 	 *
     */
     @Column(name="NCMS_MEDICATION_CATEGORY",length = 20,nullable = true)
     @FhirFieldValidate(name="NCMS_MEDICATION_CATEGORY",displayName="农合报销标志",maxLength=20,required=false,valuesRange="CV9900373")   
     private String ncmsMedicationCategory;
    
     public String getMedicationCd(){
       	return this.medicationCd;
     }
     public void setMedicationCd(String medicationCd){
       	this.medicationCd=medicationCd;
     }
     public String getMedicationName(){
       	return this.medicationName;
     }
     public void setMedicationName(String medicationName){
       	this.medicationName=medicationName;
     }
     public String getMedicalInsurance(){
       	return this.medicalInsurance;
     }
     public void setMedicalInsurance(String medicalInsurance){
       	this.medicalInsurance=medicalInsurance;
     }
     public String getMedicalInsuranceName(){
       	return this.medicalInsuranceName;
     }
     public void setMedicalInsuranceName(String medicalInsuranceName){
       	this.medicalInsuranceName=medicalInsuranceName;
     }
     public String getAgricultural(){
       	return this.agricultural;
     }
     public void setAgricultural(String agricultural){
       	this.agricultural=agricultural;
     }
     public String getAgriculturalName(){
       	return this.agriculturalName;
     }
     public void setAgriculturalName(String agriculturalName){
       	this.agriculturalName=agriculturalName;
     }
     public String getStandardCd(){
       	return this.standardCd;
     }
     public void setStandardCd(String standardCd){
       	this.standardCd=standardCd;
     }
     public String getStandardName(){
       	return this.standardName;
     }
     public void setStandardName(String standardName){
       	this.standardName=standardName;
     }
     public Boolean getIsbrand(){
       	return this.isbrand;
     }
     public void setIsbrand(Boolean isbrand){
       	this.isbrand=isbrand;
     }
     public String getManufacturer(){
       	return this.manufacturer;
     }
     public void setManufacturer(String manufacturer){
       	this.manufacturer=manufacturer;
     }
     public String getDrugDosageForms(){
       	return this.drugDosageForms;
     }
     public void setDrugDosageForms(String drugDosageForms){
       	this.drugDosageForms=drugDosageForms;
     }
     public String getDrugDosageName(){
       	return this.drugDosageName;
     }
     public void setDrugDosageName(String drugDosageName){
       	this.drugDosageName=drugDosageName;
     }
     public String getLotnumber(){
       	return this.lotnumber;
     }
     public void setLotnumber(String lotnumber){
       	this.lotnumber=lotnumber;
     }
     public Date getExpirationdate(){
       	return this.expirationdate;
     }
     public void setExpirationdate(Date expirationdate){
       	this.expirationdate=expirationdate;
     }
     public String getMedicationPackageFormCodes(){
       	return this.medicationPackageFormCodes;
     }
     public void setMedicationPackageFormCodes(String medicationPackageFormCodes){
       	this.medicationPackageFormCodes=medicationPackageFormCodes;
     }
     public Boolean getIsOtc(){
       	return this.isOtc;
     }
     public void setIsOtc(Boolean isOtc){
       	this.isOtc=isOtc;
     }
     public String getAliasName(){
       	return this.aliasName;
     }
     public void setAliasName(String aliasName){
       	this.aliasName=aliasName;
     }
     public String getSpec(){
       	return this.spec;
     }
     public void setSpec(String spec){
       	this.spec=spec;
     }
     public String getRouteUnit(){
       	return this.routeUnit;
     }
     public void setRouteUnit(String routeUnit){
       	this.routeUnit=routeUnit;
     }
     public String getLeastUnit(){
       	return this.leastUnit;
     }
     public void setLeastUnit(String leastUnit){
       	this.leastUnit=leastUnit;
     }
     public Float getProportion(){
       	return this.proportion;
     }
     public void setProportion(Float proportion){
       	this.proportion=proportion;
     }
     public String getCliUnitCheck(){
       	return this.cliUnitCheck;
     }
     public void setCliUnitCheck(String cliUnitCheck){
       	this.cliUnitCheck=cliUnitCheck;
     }
     public String getInhUnitCheck(){
       	return this.inhUnitCheck;
     }
     public void setInhUnitCheck(String inhUnitCheck){
       	this.inhUnitCheck=inhUnitCheck;
     }
     public Boolean getIfBasic(){
       	return this.ifBasic;
     }
     public void setIfBasic(Boolean ifBasic){
       	this.ifBasic=ifBasic;
     }
     public Boolean getIfImport(){
       	return this.ifImport;
     }
     public void setIfImport(Boolean ifImport){
       	this.ifImport=ifImport;
     }
     public Boolean getIfPoison(){
       	return this.ifPoison;
     }
     public void setIfPoison(Boolean ifPoison){
       	this.ifPoison=ifPoison;
     }
     public Boolean getIfPsychotropic(){
       	return this.ifPsychotropic;
     }
     public void setIfPsychotropic(Boolean ifPsychotropic){
       	this.ifPsychotropic=ifPsychotropic;
     }
     public Boolean getIfPrecious(){
       	return this.ifPrecious;
     }
     public void setIfPrecious(Boolean ifPrecious){
       	this.ifPrecious=ifPrecious;
     }
     public Boolean getIfAntibiotic(){
       	return this.ifAntibiotic;
     }
     public void setIfAntibiotic(Boolean ifAntibiotic){
       	this.ifAntibiotic=ifAntibiotic;
     }
     public String getAntibioticType(){
       	return this.antibioticType;
     }
     public void setAntibioticType(String antibioticType){
       	this.antibioticType=antibioticType;
     }
     public String getMedicationTypeCode(){
       	return this.medicationTypeCode;
     }
     public void setMedicationTypeCode(String medicationTypeCode){
       	this.medicationTypeCode=medicationTypeCode;
     }
     public String getCnMedicationTypeCode(){
       	return this.cnMedicationTypeCode;
     }
     public void setCnMedicationTypeCode(String cnMedicationTypeCode){
       	this.cnMedicationTypeCode=cnMedicationTypeCode;
     }
     public String getDrugTypeCode(){
       	return this.drugTypeCode;
     }
     public void setDrugTypeCode(String drugTypeCode){
       	this.drugTypeCode=drugTypeCode;
     }
     public Float getDddValue(){
       	return this.dddValue;
     }
     public void setDddValue(Float dddValue){
       	this.dddValue=dddValue;
     }
     public String getDrugAdverseReaction(){
       	return this.drugAdverseReaction;
     }
     public void setDrugAdverseReaction(String drugAdverseReaction){
       	this.drugAdverseReaction=drugAdverseReaction;
     }
     public String getMedicationCategory(){
       	return this.medicationCategory;
     }
     public void setMedicationCategory(String medicationCategory){
       	this.medicationCategory=medicationCategory;
     }
     public String getNcmsMedicationCategory(){
       	return this.ncmsMedicationCategory;
     }
     public void setNcmsMedicationCategory(String ncmsMedicationCategory){
       	this.ncmsMedicationCategory=ncmsMedicationCategory;
     }
}