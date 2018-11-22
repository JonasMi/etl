package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.LongtermAdvice;

public class LongtermAdviceDetails extends LongtermAdviceRecord {
    /**
     *名称:住院流水号
     *备注:引用住院接诊表T_INPATIENT_REGISTRATION院内住院流水号INPATIENT_REGISTRATION_ID
 	 *
     */
     private String inpatientRegistrationId;
    /**
     *名称:医嘱序号
     *
 	 *
     */
     private String adviceSequence;
    /**
     *名称:医嘱子序号
     *
 	 *
     */
     private String adviceSubSequence;
    /**
     *名称:状态
     *
 	 *限制:CUS00008
     */
     private String status;
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
     *名称:停止时间
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
     *名称:停止护士
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
     */
     private String orderStopNurseCd;
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
     *名称:医嘱正文
     *
 	 *
     */
     private String text;
    /**
     *名称:医嘱开始时间
     *
 	 *
     */
     private Long start;
    /**
     *名称:用药停止日期时间
     *
 	 *
     */
     private Long end;
    /**
     *名称:执行天数
     *
 	 *
     */
     private Float duration;
    /**
     *名称:用药途径代码
     *
 	 *限制:CV0600102
     */
     private String dosageCode;
    /**
     *名称:特殊用法代码
     *
 	 *限制:CV9900285
     */
     private String cMedCode;
    /**
     *名称:用药次剂量
     *
 	 *
     */
     private Float onceValue;
    /**
     *名称:用药次剂量单位
     *
 	 *
     */
     private String onceUnit;
    /**
     *名称:用药总剂量
     *
 	 *
     */
     private Float drugTotalDose;
    /**
     *名称:用药总剂量单位
     *
 	 *
     */
     private String drugTotalDoseUtil;
    /**
     *名称:医疗付费方式代码
     *
 	 *限制:CV9900376
     */
     private String feeCode;
    /**
     *名称:医嘱类型代码
     *
 	 *限制:CV9900229
     */
     private String orderTypeCode;
    /**
     *名称:是否需要皮试
     *
 	 *限制:CUS00004
     */
     private Boolean stMark;
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
     *名称:项目规格
     *
 	 *
     */
     private String itemSpec;
    /**
     *名称:医嘱频率代码
     *
 	 *限制:CV9900341
     */
     private String freqCode;
    /**
     *名称:医嘱项目
     *备注:引用药品信息表T_MEDICATION院内药品编码或引用收费项目信息表T_CHARGING_ITEM院内收费项目编码
 	 *
     */
     private String prescriptionItemCode;
    /**
     *名称:数量
     *
 	 *
     */
     private Float itemNumber;
    /**
     *名称:项目单位
     *
 	 *
     */
     private String itemUnit;
    /**
     *名称:金额
     *
 	 *
     */
     private Float itemAmount;
    /**
     *名称:单价
     *
 	 *
     */
     private Float itemPrice;
    /**
     *名称:发药时间
     *
 	 *
     */
     private Long dispensingDtime;
    /**
     *名称:成组号
     *备注:患者用药时，某些药物是一组,药物搭配用
 	 *
     */
     private String groupNo;
    /**
     *名称:医嘱计划开始日期时间
     *
 	 *
     */
     private Long orderPlanStDate;
    /**
     *名称:医嘱计划结束日期时间
     *
 	 *
     */
     private Long orderPlanEndDate;
    /**
     *名称:关键药物名称
     *
 	 *
     */
     private String crucialDrugName;
    /**
     *名称:关键药物用法
     *
 	 *
     */
     private String crucialDrugUsage;
     private String errorMessage;
     private String errorDetail;             
     public LongtermAdviceDetails(LongtermAdvice longtermAdvice) {
        super(longtermAdvice);
         this.inpatientRegistrationId=longtermAdvice.getInpatientRegistrationId();
         this.adviceSequence=longtermAdvice.getAdviceSequence();
         this.adviceSubSequence=longtermAdvice.getAdviceSubSequence();
         this.status=longtermAdvice.getStatus();
         this.patientId=longtermAdvice.getPatientId();
         this.patientName=longtermAdvice.getPatientName();
         java.util.Date _datewritten = longtermAdvice.getDatewritten();
         if(_datewritten!=null){
         	this.datewritten=_datewritten.getTime();
         }
         this.prescriber=longtermAdvice.getPrescriber();
         this.orderDpid=longtermAdvice.getOrderDpid();
         java.util.Date _dateended = longtermAdvice.getDateended();
         if(_dateended!=null){
         	this.dateended=_dateended.getTime();
         }
         this.stopDoctorid=longtermAdvice.getStopDoctorid();
         this.orderStopNurseCd=longtermAdvice.getOrderStopNurseCd();
         java.util.Date _checkDate = longtermAdvice.getCheckDate();
         if(_checkDate!=null){
         	this.checkDate=_checkDate.getTime();
         }
         this.checkNurid=longtermAdvice.getCheckNurid();
         java.util.Date _orderAuditorDate = longtermAdvice.getOrderAuditorDate();
         if(_orderAuditorDate!=null){
         	this.orderAuditorDate=_orderAuditorDate.getTime();
         }
         this.orderAuditor=longtermAdvice.getOrderAuditor();
         java.util.Date _orderCheckTime = longtermAdvice.getOrderCheckTime();
         if(_orderCheckTime!=null){
         	this.orderCheckTime=_orderCheckTime.getTime();
         }
         java.util.Date _performTime = longtermAdvice.getPerformTime();
         if(_performTime!=null){
         	this.performTime=_performTime.getTime();
         }
         this.performDeptCd=longtermAdvice.getPerformDeptCd();
         this.performerCd=longtermAdvice.getPerformerCd();
         this.note=longtermAdvice.getNote();
         this.text=longtermAdvice.getText();
         java.util.Date _start = longtermAdvice.getStart();
         if(_start!=null){
         	this.start=_start.getTime();
         }
         java.util.Date _end = longtermAdvice.getEnd();
         if(_end!=null){
         	this.end=_end.getTime();
         }
         this.duration=longtermAdvice.getDuration();
         this.dosageCode=longtermAdvice.getDosageCode();
         this.cMedCode=longtermAdvice.getcMedCode();
         this.onceValue=longtermAdvice.getOnceValue();
         this.onceUnit=longtermAdvice.getOnceUnit();
         this.drugTotalDose=longtermAdvice.getDrugTotalDose();
         this.drugTotalDoseUtil=longtermAdvice.getDrugTotalDoseUtil();
         this.feeCode=longtermAdvice.getFeeCode();
         this.orderTypeCode=longtermAdvice.getOrderTypeCode();
         this.stMark=longtermAdvice.getStMark();
         this.skintestType=longtermAdvice.getSkintestType();
         this.skintestResult=longtermAdvice.getSkintestResult();
         this.skintestNurid=longtermAdvice.getSkintestNurid();
         this.skintestSenurid=longtermAdvice.getSkintestSenurid();
         this.itemSpec=longtermAdvice.getItemSpec();
         this.freqCode=longtermAdvice.getFreqCode();
         this.prescriptionItemCode=longtermAdvice.getPrescriptionItemCode();
         this.itemNumber=longtermAdvice.getItemNumber();
         this.itemUnit=longtermAdvice.getItemUnit();
         this.itemAmount=longtermAdvice.getItemAmount();
         this.itemPrice=longtermAdvice.getItemPrice();
         java.util.Date _dispensingDtime = longtermAdvice.getDispensingDtime();
         if(_dispensingDtime!=null){
         	this.dispensingDtime=_dispensingDtime.getTime();
         }
         this.groupNo=longtermAdvice.getGroupNo();
         java.util.Date _orderPlanStDate = longtermAdvice.getOrderPlanStDate();
         if(_orderPlanStDate!=null){
         	this.orderPlanStDate=_orderPlanStDate.getTime();
         }
         java.util.Date _orderPlanEndDate = longtermAdvice.getOrderPlanEndDate();
         if(_orderPlanEndDate!=null){
         	this.orderPlanEndDate=_orderPlanEndDate.getTime();
         }
         this.crucialDrugName=longtermAdvice.getCrucialDrugName();
         this.crucialDrugUsage=longtermAdvice.getCrucialDrugUsage();
         this.errorMessage=longtermAdvice.getErrorMessage();
         this.errorDetail=longtermAdvice.getErrorDetail();      
    }
      public String  getInpatientRegistrationId(){
       		return this.inpatientRegistrationId;
      }    
      public String  getAdviceSequence(){
       		return this.adviceSequence;
      }    
      public String  getAdviceSubSequence(){
       		return this.adviceSubSequence;
      }    
      public String  getStatus(){
       		return this.status;
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
      public String  getOrderStopNurseCd(){
       		return this.orderStopNurseCd;
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
      public String  getText(){
       		return this.text;
      }    
      public Long  getStart(){
       		return this.start;
      }    
      public Long  getEnd(){
       		return this.end;
      }    
      public Float  getDuration(){
       		return this.duration;
      }    
      public String  getDosageCode(){
       		return this.dosageCode;
      }    
      public String  getcMedCode(){
       		return this.cMedCode;
      }    
      public Float  getOnceValue(){
       		return this.onceValue;
      }    
      public String  getOnceUnit(){
       		return this.onceUnit;
      }    
      public Float  getDrugTotalDose(){
       		return this.drugTotalDose;
      }    
      public String  getDrugTotalDoseUtil(){
       		return this.drugTotalDoseUtil;
      }    
      public String  getFeeCode(){
       		return this.feeCode;
      }    
      public String  getOrderTypeCode(){
       		return this.orderTypeCode;
      }    
      public Boolean  getStMark(){
       		return this.stMark;
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
      public String  getItemSpec(){
       		return this.itemSpec;
      }    
      public String  getFreqCode(){
       		return this.freqCode;
      }    
      public String  getPrescriptionItemCode(){
       		return this.prescriptionItemCode;
      }    
      public Float  getItemNumber(){
       		return this.itemNumber;
      }    
      public String  getItemUnit(){
       		return this.itemUnit;
      }    
      public Float  getItemAmount(){
       		return this.itemAmount;
      }    
      public Float  getItemPrice(){
       		return this.itemPrice;
      }    
      public Long  getDispensingDtime(){
       		return this.dispensingDtime;
      }    
      public String  getGroupNo(){
       		return this.groupNo;
      }    
      public Long  getOrderPlanStDate(){
       		return this.orderPlanStDate;
      }    
      public Long  getOrderPlanEndDate(){
       		return this.orderPlanEndDate;
      }    
      public String  getCrucialDrugName(){
       		return this.crucialDrugName;
      }    
      public String  getCrucialDrugUsage(){
       		return this.crucialDrugUsage;
      }    
	  public String getErrorMessage() {
	        return errorMessage;
	  }
	  public String getErrorDetail() {
	        return errorDetail;
	  }  
}