package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.OutpatientPrescription;

public class OutpatientPrescriptionDetails extends OutpatientPrescriptionRecord {
    /**
     *名称:院内处方号
     *备注:门诊处方在院内系统中的唯一标识
 	 *
     */
     private String outpatientPrescriptionId;
    /**
     *名称:状态
     *
 	 *限制:CUS00008
     */
     private String status;
    /**
     *名称:门诊流水号
     *备注:引用门诊接诊表T_OUTPATIENT_REGISTRATION院内门诊流水号
 	 *
     */
     private String outpatientRegistrationId;
    /**
     *名称:患者ID
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
     *名称:开立时间
     *
 	 *
     */
     private Long datewritten;
    /**
     *名称:开立医生ID
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
     */
     private String prescriber;
    /**
     *名称:开立科室
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
     */
     private String orderDpid;
    /**
     *名称:取消日期时间
     *
 	 *
     */
     private Long dateended;
    /**
     *名称:停止医生
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
     */
     private String stopDoctorid;
    /**
     *名称:校对时间
     *
 	 *
     */
     private Long checkDate;
    /**
     *名称:校对护士
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
     */
     private String checkNurid;
    /**
     *名称:审核时间
     *
 	 *
     */
     private Long orderAuditorDate;
    /**
     *名称:审核人
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
     */
     private String orderAuditor;
    /**
     *名称:医嘱核对日期时间
     *
 	 *
     */
     private Long orderCheckTime;
    /**
     *名称:执行时间
     *
 	 *
     */
     private Long performTime;
    /**
     *名称:执行科室
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
     */
     private String performDeptCd;
    /**
     *名称:执行医生
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
     */
     private String performerCd;
    /**
     *名称:备注
     *
 	 *
     */
     private String note;
    /**
     *名称:皮试类型标志
     *
 	 *限制:CV9900287
     */
     private String skintestType;
    /**
     *名称:皮试结果
     *
 	 *
     */
     private String skintestResult;
    /**
     *名称:皮试护士
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
     */
     private String skintestNurid;
    /**
     *名称:第二皮试护士
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
     */
     private String skintestSenurid;
    /**
     *名称:处方类型代码
     *
 	 *限制:CV9900264
     */
     private String recipeTypeCode;
    /**
     *名称:申请单号
     *
 	 *
     */
     private String applyId;
    /**
     *名称:中药剂数
     *
 	 *
     */
     private Integer cMedNum;
    /**
     *名称:发药时间
     *
 	 *
     */
     private Long dispensingDtime;
    /**
     *名称:中药处方
     *备注:中药饮片处方的详细描述
 	 *
     */
     private String cnPrescribe;
    /**
     *名称:中药煎煮法
     *备注:中药饮片煎煮方法描述
 	 *
     */
     private String cnPrescribeDescr;
    /**
     *名称:中药服用方法代码
     *
 	 *限制:CV9900304
     */
     private String cnDrugWayCd;
    /**
     *名称:中药剂型
     *
 	 *限制:CV9900389
     */
     private String cnTypeCd;
    /**
     *名称:是否代办
     *
 	 *限制:CUS00004
     */
     private Boolean ifAgency;
    /**
     *名称:是否打印
     *
 	 *限制:CUS00004
     */
     private Boolean ifPrint;
    /**
     *名称:是否收费
     *
 	 *限制:CUS00004
     */
     private Boolean ifChange;
    /**
     *名称:代办人关系代码
     *
 	 *限制:GBT4761
     */
     private String agencyRelCode;
    /**
     *名称:代办人身份证号
     *
 	 *
     */
     private String idCard;
    /**
     *名称:调配者ID
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
     */
     private String allocatePsid;
    /**
     *名称:发药者ID
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
     */
     private String drugPsid;
    /**
     *名称:审核药剂师ID
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
     */
     private String precAuditPsid;
    /**
     *名称:核对药剂师ID
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
     */
     private String precCheckPsid;
    /**
     *名称:执行科室ID
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
     */
     private String performDept;
    /**
     *名称:执行人ID
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
     */
     private String precPerform;
    /**
     *名称:处方总金额
     *
 	 *
     */
     private Float totalAmount;
     private String errorMessage;
     private String errorDetail;             
     public OutpatientPrescriptionDetails(OutpatientPrescription outpatientPrescription) {
        super(outpatientPrescription);
         this.outpatientPrescriptionId=outpatientPrescription.getOutpatientPrescriptionId();
         this.status=outpatientPrescription.getStatus();
         this.outpatientRegistrationId=outpatientPrescription.getOutpatientRegistrationId();
         this.patientId=outpatientPrescription.getPatientId();
         this.patientName=outpatientPrescription.getPatientName();
         java.util.Date _datewritten = outpatientPrescription.getDatewritten();
         if(_datewritten!=null){
         	this.datewritten=_datewritten.getTime();
         }
         this.prescriber=outpatientPrescription.getPrescriber();
         this.orderDpid=outpatientPrescription.getOrderDpid();
         java.util.Date _dateended = outpatientPrescription.getDateended();
         if(_dateended!=null){
         	this.dateended=_dateended.getTime();
         }
         this.stopDoctorid=outpatientPrescription.getStopDoctorid();
         java.util.Date _checkDate = outpatientPrescription.getCheckDate();
         if(_checkDate!=null){
         	this.checkDate=_checkDate.getTime();
         }
         this.checkNurid=outpatientPrescription.getCheckNurid();
         java.util.Date _orderAuditorDate = outpatientPrescription.getOrderAuditorDate();
         if(_orderAuditorDate!=null){
         	this.orderAuditorDate=_orderAuditorDate.getTime();
         }
         this.orderAuditor=outpatientPrescription.getOrderAuditor();
         java.util.Date _orderCheckTime = outpatientPrescription.getOrderCheckTime();
         if(_orderCheckTime!=null){
         	this.orderCheckTime=_orderCheckTime.getTime();
         }
         java.util.Date _performTime = outpatientPrescription.getPerformTime();
         if(_performTime!=null){
         	this.performTime=_performTime.getTime();
         }
         this.performDeptCd=outpatientPrescription.getPerformDeptCd();
         this.performerCd=outpatientPrescription.getPerformerCd();
         this.note=outpatientPrescription.getNote();
         this.skintestType=outpatientPrescription.getSkintestType();
         this.skintestResult=outpatientPrescription.getSkintestResult();
         this.skintestNurid=outpatientPrescription.getSkintestNurid();
         this.skintestSenurid=outpatientPrescription.getSkintestSenurid();
         this.recipeTypeCode=outpatientPrescription.getRecipeTypeCode();
         this.applyId=outpatientPrescription.getApplyId();
         this.cMedNum=outpatientPrescription.getcMedNum();
         java.util.Date _dispensingDtime = outpatientPrescription.getDispensingDtime();
         if(_dispensingDtime!=null){
         	this.dispensingDtime=_dispensingDtime.getTime();
         }
         this.cnPrescribe=outpatientPrescription.getCnPrescribe();
         this.cnPrescribeDescr=outpatientPrescription.getCnPrescribeDescr();
         this.cnDrugWayCd=outpatientPrescription.getCnDrugWayCd();
         this.cnTypeCd=outpatientPrescription.getCnTypeCd();
         this.ifAgency=outpatientPrescription.getIfAgency();
         this.ifPrint=outpatientPrescription.getIfPrint();
         this.ifChange=outpatientPrescription.getIfChange();
         this.agencyRelCode=outpatientPrescription.getAgencyRelCode();
         this.idCard=outpatientPrescription.getIdCard();
         this.allocatePsid=outpatientPrescription.getAllocatePsid();
         this.drugPsid=outpatientPrescription.getDrugPsid();
         this.precAuditPsid=outpatientPrescription.getPrecAuditPsid();
         this.precCheckPsid=outpatientPrescription.getPrecCheckPsid();
         this.performDept=outpatientPrescription.getPerformDept();
         this.precPerform=outpatientPrescription.getPrecPerform();
         this.totalAmount=outpatientPrescription.getTotalAmount();
         this.errorMessage=outpatientPrescription.getErrorMessage();
         this.errorDetail=outpatientPrescription.getErrorDetail();      
    }
      public String  getOutpatientPrescriptionId(){
       		return this.outpatientPrescriptionId;
      }    
      public String  getStatus(){
       		return this.status;
      }    
      public String  getOutpatientRegistrationId(){
       		return this.outpatientRegistrationId;
      }    
      public String  getPatientId(){
       		return this.patientId;
      }    
      public String  getPatientName(){
       		return this.patientName;
      }    
      public Long  getDatewritten(){
       		return this.datewritten;
      }    
      public String  getPrescriber(){
       		return this.prescriber;
      }    
      public String  getOrderDpid(){
       		return this.orderDpid;
      }    
      public Long  getDateended(){
       		return this.dateended;
      }    
      public String  getStopDoctorid(){
       		return this.stopDoctorid;
      }    
      public Long  getCheckDate(){
       		return this.checkDate;
      }    
      public String  getCheckNurid(){
       		return this.checkNurid;
      }    
      public Long  getOrderAuditorDate(){
       		return this.orderAuditorDate;
      }    
      public String  getOrderAuditor(){
       		return this.orderAuditor;
      }    
      public Long  getOrderCheckTime(){
       		return this.orderCheckTime;
      }    
      public Long  getPerformTime(){
       		return this.performTime;
      }    
      public String  getPerformDeptCd(){
       		return this.performDeptCd;
      }    
      public String  getPerformerCd(){
       		return this.performerCd;
      }    
      public String  getNote(){
       		return this.note;
      }    
      public String  getSkintestType(){
       		return this.skintestType;
      }    
      public String  getSkintestResult(){
       		return this.skintestResult;
      }    
      public String  getSkintestNurid(){
       		return this.skintestNurid;
      }    
      public String  getSkintestSenurid(){
       		return this.skintestSenurid;
      }    
      public String  getRecipeTypeCode(){
       		return this.recipeTypeCode;
      }    
      public String  getApplyId(){
       		return this.applyId;
      }    
      public Integer  getcMedNum(){
       		return this.cMedNum;
      }    
      public Long  getDispensingDtime(){
       		return this.dispensingDtime;
      }    
      public String  getCnPrescribe(){
       		return this.cnPrescribe;
      }    
      public String  getCnPrescribeDescr(){
       		return this.cnPrescribeDescr;
      }    
      public String  getCnDrugWayCd(){
       		return this.cnDrugWayCd;
      }    
      public String  getCnTypeCd(){
       		return this.cnTypeCd;
      }    
      public Boolean  getIfAgency(){
       		return this.ifAgency;
      }    
      public Boolean  getIfPrint(){
       		return this.ifPrint;
      }    
      public Boolean  getIfChange(){
       		return this.ifChange;
      }    
      public String  getAgencyRelCode(){
       		return this.agencyRelCode;
      }    
      public String  getIdCard(){
       		return this.idCard;
      }    
      public String  getAllocatePsid(){
       		return this.allocatePsid;
      }    
      public String  getDrugPsid(){
       		return this.drugPsid;
      }    
      public String  getPrecAuditPsid(){
       		return this.precAuditPsid;
      }    
      public String  getPrecCheckPsid(){
       		return this.precCheckPsid;
      }    
      public String  getPerformDept(){
       		return this.performDept;
      }    
      public String  getPrecPerform(){
       		return this.precPerform;
      }    
      public Float  getTotalAmount(){
       		return this.totalAmount;
      }    
	  public String getErrorMessage() {
	        return errorMessage;
	  }
	  public String getErrorDetail() {
	        return errorDetail;
	  }  
}