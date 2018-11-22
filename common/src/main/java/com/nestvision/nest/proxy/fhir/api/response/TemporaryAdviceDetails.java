package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.TemporaryAdvice;

public class TemporaryAdviceDetails extends TemporaryAdviceRecord {
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
     *名称:医嘱正文
     *
 	 *
     */
     private String text;
    /**
     *名称:备注
     *
 	 *
     */
     private String note;
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
     private String errorMessage;
     private String errorDetail;             
     public TemporaryAdviceDetails(TemporaryAdvice temporaryAdvice) {
        super(temporaryAdvice);
         this.inpatientRegistrationId=temporaryAdvice.getInpatientRegistrationId();
         this.adviceSequence=temporaryAdvice.getAdviceSequence();
         this.adviceSubSequence=temporaryAdvice.getAdviceSubSequence();
         this.status=temporaryAdvice.getStatus();
         this.patientId=temporaryAdvice.getPatientId();
         this.patientName=temporaryAdvice.getPatientName();
         java.util.Date _datewritten = temporaryAdvice.getDatewritten();
         if(_datewritten!=null){
         	this.datewritten=_datewritten.getTime();
         }
         this.prescriber=temporaryAdvice.getPrescriber();
         this.orderDpid=temporaryAdvice.getOrderDpid();
         java.util.Date _dateended = temporaryAdvice.getDateended();
         if(_dateended!=null){
         	this.dateended=_dateended.getTime();
         }
         this.stopDoctorid=temporaryAdvice.getStopDoctorid();
         java.util.Date _checkDate = temporaryAdvice.getCheckDate();
         if(_checkDate!=null){
         	this.checkDate=_checkDate.getTime();
         }
         this.checkNurid=temporaryAdvice.getCheckNurid();
         java.util.Date _orderAuditorDate = temporaryAdvice.getOrderAuditorDate();
         if(_orderAuditorDate!=null){
         	this.orderAuditorDate=_orderAuditorDate.getTime();
         }
         this.orderAuditor=temporaryAdvice.getOrderAuditor();
         java.util.Date _orderCheckTime = temporaryAdvice.getOrderCheckTime();
         if(_orderCheckTime!=null){
         	this.orderCheckTime=_orderCheckTime.getTime();
         }
         java.util.Date _performTime = temporaryAdvice.getPerformTime();
         if(_performTime!=null){
         	this.performTime=_performTime.getTime();
         }
         this.performDeptCd=temporaryAdvice.getPerformDeptCd();
         this.performerCd=temporaryAdvice.getPerformerCd();
         this.text=temporaryAdvice.getText();
         this.note=temporaryAdvice.getNote();
         java.util.Date _start = temporaryAdvice.getStart();
         if(_start!=null){
         	this.start=_start.getTime();
         }
         java.util.Date _end = temporaryAdvice.getEnd();
         if(_end!=null){
         	this.end=_end.getTime();
         }
         this.duration=temporaryAdvice.getDuration();
         this.dosageCode=temporaryAdvice.getDosageCode();
         this.cMedCode=temporaryAdvice.getcMedCode();
         this.onceValue=temporaryAdvice.getOnceValue();
         this.onceUnit=temporaryAdvice.getOnceUnit();
         this.drugTotalDose=temporaryAdvice.getDrugTotalDose();
         this.drugTotalDoseUtil=temporaryAdvice.getDrugTotalDoseUtil();
         this.feeCode=temporaryAdvice.getFeeCode();
         this.orderTypeCode=temporaryAdvice.getOrderTypeCode();
         this.stMark=temporaryAdvice.getStMark();
         this.skintestType=temporaryAdvice.getSkintestType();
         this.skintestResult=temporaryAdvice.getSkintestResult();
         this.skintestNurid=temporaryAdvice.getSkintestNurid();
         this.skintestSenurid=temporaryAdvice.getSkintestSenurid();
         this.itemSpec=temporaryAdvice.getItemSpec();
         this.prescriptionItemCode=temporaryAdvice.getPrescriptionItemCode();
         this.itemNumber=temporaryAdvice.getItemNumber();
         this.itemUnit=temporaryAdvice.getItemUnit();
         this.itemAmount=temporaryAdvice.getItemAmount();
         this.itemPrice=temporaryAdvice.getItemPrice();
         java.util.Date _dispensingDtime = temporaryAdvice.getDispensingDtime();
         if(_dispensingDtime!=null){
         	this.dispensingDtime=_dispensingDtime.getTime();
         }
         this.groupNo=temporaryAdvice.getGroupNo();
         java.util.Date _orderPlanStDate = temporaryAdvice.getOrderPlanStDate();
         if(_orderPlanStDate!=null){
         	this.orderPlanStDate=_orderPlanStDate.getTime();
         }
         java.util.Date _orderPlanEndDate = temporaryAdvice.getOrderPlanEndDate();
         if(_orderPlanEndDate!=null){
         	this.orderPlanEndDate=_orderPlanEndDate.getTime();
         }
         this.errorMessage=temporaryAdvice.getErrorMessage();
         this.errorDetail=temporaryAdvice.getErrorDetail();      
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
      public String  getText(){
       		return this.text;
      }    
      public String  getNote(){
       		return this.note;
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
	  public String getErrorMessage() {
	        return errorMessage;
	  }
	  public String getErrorDetail() {
	        return errorDetail;
	  }  
}