package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.Medication;

public class MedicationDetails extends MedicationRecord {
    /**
     *名称:院内药品编码
     *备注:药品在院内系统中的编码
 	 *
     */
     private String medicationCd;
    /**
     *名称:院内药品名称
     *
 	 *
     */
     private String medicationName;
    /**
     *名称:医保系统药物编码
     *
 	 *
     */
     private String medicalInsurance;
    /**
     *名称:医保系统药物名称
     *
 	 *
     */
     private String medicalInsuranceName;
    /**
     *名称:农合系统药物编码
     *
 	 *
     */
     private String agricultural;
    /**
     *名称:农合系统药物名称
     *
 	 *
     */
     private String agriculturalName;
    /**
     *名称:国药准字系统药物编码
     *备注:药品在市平台中的标准编码
 	 *限制:CV990110
     */
     private String standardCd;
    /**
     *名称:国药准字系统药物名称
     *
 	 *
     */
     private String standardName;
    /**
     *名称:是否是品牌药物
     *
 	 *限制:CUS00004
     */
     private Boolean isbrand;
    /**
     *名称:药品生产商名字
     *
 	 *
     */
     private String manufacturer;
    /**
     *名称:药物剂型代码
     *
 	 *限制:CV0850002
     */
     private String drugDosageForms;
    /**
     *名称:药物剂型名称
     *
 	 *限制:CV0850002
     */
     private String drugDosageName;
    /**
     *名称:生产批次号
     *
 	 *
     */
     private String lotnumber;
    /**
     *名称:过期时间
     *
 	 *
     */
     private Long expirationdate;
    /**
     *名称:包装类型
     *
 	 *限制:CV9900363
     */
     private String medicationPackageFormCodes;
    /**
     *名称:是否OTC
     *
 	 *限制:CUS00004
     */
     private Boolean isOtc;
    /**
     *名称:商品名
     *
 	 *
     */
     private String aliasName;
    /**
     *名称:规格
     *
 	 *
     */
     private String spec;
    /**
     *名称:大包装单位
     *
 	 *
     */
     private String routeUnit;
    /**
     *名称:小包装单位
     *
 	 *
     */
     private String leastUnit;
    /**
     *名称:大、小包装换算
     *
 	 *
     */
     private Float proportion;
    /**
     *名称:门诊使用单位
     *
 	 *限制:CV9900268
     */
     private String cliUnitCheck;
    /**
     *名称:住院使用单位
     *
 	 *限制:CV9900268
     */
     private String inhUnitCheck;
    /**
     *名称:是否基础药
     *
 	 *限制:CUS00004
     */
     private Boolean ifBasic;
    /**
     *名称:是否进口药
     *
 	 *限制:CUS00004
     */
     private Boolean ifImport;
    /**
     *名称:是否毒、麻类药物
     *
 	 *限制:CUS00004
     */
     private Boolean ifPoison;
    /**
     *名称:是否精神类药物
     *
 	 *限制:CUS00004
     */
     private Boolean ifPsychotropic;
    /**
     *名称:是否贵重药品
     *
 	 *限制:CUS00004
     */
     private Boolean ifPrecious;
    /**
     *名称:是否抗菌药物标志
     *
 	 *限制:CUS00004
     */
     private Boolean ifAntibiotic;
    /**
     *名称:抗菌药等级
     *
 	 *限制:CV9900275
     */
     private String antibioticType;
    /**
     *名称:药品类别代码
     *
 	 *限制:CV9900044
     */
     private String medicationTypeCode;
    /**
     *名称:中药类别代码
     *
 	 *限制:CV0600101
     */
     private String cnMedicationTypeCode;
    /**
     *名称:药物类型代码
     *
 	 *限制:CV0530106
     */
     private String drugTypeCode;
    /**
     *名称:DDD值/最小剂量
     *
 	 *
     */
     private Float dddValue;
    /**
     *名称:药物不良反应情况
     *
 	 *
     */
     private String drugAdverseReaction;
    /**
     *名称:医保报销标志
     *
 	 *限制:CV9900286
     */
     private String medicationCategory;
    /**
     *名称:农合报销标志
     *
 	 *限制:CV9900373
     */
     private String ncmsMedicationCategory;
     private String errorMessage;
     private String errorDetail;             
     public MedicationDetails(Medication medication) {
        super(medication);
         this.medicationCd=medication.getMedicationCd();
         this.medicationName=medication.getMedicationName();
         this.medicalInsurance=medication.getMedicalInsurance();
         this.medicalInsuranceName=medication.getMedicalInsuranceName();
         this.agricultural=medication.getAgricultural();
         this.agriculturalName=medication.getAgriculturalName();
         this.standardCd=medication.getStandardCd();
         this.standardName=medication.getStandardName();
         this.isbrand=medication.getIsbrand();
         this.manufacturer=medication.getManufacturer();
         this.drugDosageForms=medication.getDrugDosageForms();
         this.drugDosageName=medication.getDrugDosageName();
         this.lotnumber=medication.getLotnumber();
         java.util.Date _expirationdate = medication.getExpirationdate();
         if(_expirationdate!=null){
         	this.expirationdate=_expirationdate.getTime();
         }
         this.medicationPackageFormCodes=medication.getMedicationPackageFormCodes();
         this.isOtc=medication.getIsOtc();
         this.aliasName=medication.getAliasName();
         this.spec=medication.getSpec();
         this.routeUnit=medication.getRouteUnit();
         this.leastUnit=medication.getLeastUnit();
         this.proportion=medication.getProportion();
         this.cliUnitCheck=medication.getCliUnitCheck();
         this.inhUnitCheck=medication.getInhUnitCheck();
         this.ifBasic=medication.getIfBasic();
         this.ifImport=medication.getIfImport();
         this.ifPoison=medication.getIfPoison();
         this.ifPsychotropic=medication.getIfPsychotropic();
         this.ifPrecious=medication.getIfPrecious();
         this.ifAntibiotic=medication.getIfAntibiotic();
         this.antibioticType=medication.getAntibioticType();
         this.medicationTypeCode=medication.getMedicationTypeCode();
         this.cnMedicationTypeCode=medication.getCnMedicationTypeCode();
         this.drugTypeCode=medication.getDrugTypeCode();
         this.dddValue=medication.getDddValue();
         this.drugAdverseReaction=medication.getDrugAdverseReaction();
         this.medicationCategory=medication.getMedicationCategory();
         this.ncmsMedicationCategory=medication.getNcmsMedicationCategory();
         this.errorMessage=medication.getErrorMessage();
         this.errorDetail=medication.getErrorDetail();      
    }
      public String  getMedicationCd(){
       		return this.medicationCd;
      }    
      public String  getMedicationName(){
       		return this.medicationName;
      }    
      public String  getMedicalInsurance(){
       		return this.medicalInsurance;
      }    
      public String  getMedicalInsuranceName(){
       		return this.medicalInsuranceName;
      }    
      public String  getAgricultural(){
       		return this.agricultural;
      }    
      public String  getAgriculturalName(){
       		return this.agriculturalName;
      }    
      public String  getStandardCd(){
       		return this.standardCd;
      }    
      public String  getStandardName(){
       		return this.standardName;
      }    
      public Boolean  getIsbrand(){
       		return this.isbrand;
      }    
      public String  getManufacturer(){
       		return this.manufacturer;
      }    
      public String  getDrugDosageForms(){
       		return this.drugDosageForms;
      }    
      public String  getDrugDosageName(){
       		return this.drugDosageName;
      }    
      public String  getLotnumber(){
       		return this.lotnumber;
      }    
      public Long  getExpirationdate(){
       		return this.expirationdate;
      }    
      public String  getMedicationPackageFormCodes(){
       		return this.medicationPackageFormCodes;
      }    
      public Boolean  getIsOtc(){
       		return this.isOtc;
      }    
      public String  getAliasName(){
       		return this.aliasName;
      }    
      public String  getSpec(){
       		return this.spec;
      }    
      public String  getRouteUnit(){
       		return this.routeUnit;
      }    
      public String  getLeastUnit(){
       		return this.leastUnit;
      }    
      public Float  getProportion(){
       		return this.proportion;
      }    
      public String  getCliUnitCheck(){
       		return this.cliUnitCheck;
      }    
      public String  getInhUnitCheck(){
       		return this.inhUnitCheck;
      }    
      public Boolean  getIfBasic(){
       		return this.ifBasic;
      }    
      public Boolean  getIfImport(){
       		return this.ifImport;
      }    
      public Boolean  getIfPoison(){
       		return this.ifPoison;
      }    
      public Boolean  getIfPsychotropic(){
       		return this.ifPsychotropic;
      }    
      public Boolean  getIfPrecious(){
       		return this.ifPrecious;
      }    
      public Boolean  getIfAntibiotic(){
       		return this.ifAntibiotic;
      }    
      public String  getAntibioticType(){
       		return this.antibioticType;
      }    
      public String  getMedicationTypeCode(){
       		return this.medicationTypeCode;
      }    
      public String  getCnMedicationTypeCode(){
       		return this.cnMedicationTypeCode;
      }    
      public String  getDrugTypeCode(){
       		return this.drugTypeCode;
      }    
      public Float  getDddValue(){
       		return this.dddValue;
      }    
      public String  getDrugAdverseReaction(){
       		return this.drugAdverseReaction;
      }    
      public String  getMedicationCategory(){
       		return this.medicationCategory;
      }    
      public String  getNcmsMedicationCategory(){
       		return this.ncmsMedicationCategory;
      }    
	  public String getErrorMessage() {
	        return errorMessage;
	  }
	  public String getErrorDetail() {
	        return errorDetail;
	  }  
}