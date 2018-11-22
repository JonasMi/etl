package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.Operation;

public class OperationDetails extends OperationRecord {
    /**
     *名称:院内手术记录id
     *备注:手术记录在院内系统中的唯一标识
 	 *
     */
     private String operationId;
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
     *名称:门诊或住院标识
     *
 	 *限制:CUS00010
     */
     private String visitMark;
    /**
     *名称:就诊流水号
     *备注:引用门诊接诊表T_OUTPATIENT_REGISTRATION院内门诊流水号或引用住院接诊表T_INPATIENT_REGISTRATION院内住院流水号
 	 *
     */
     private String registrationId;
    /**
     *名称:状态
     *
 	 *限制:CUS00015
     */
     private String status;
    /**
     *名称:麻醉方法代码
     *
 	 *限制:CV0600103
     */
     private String anesthesiaMethodCd;
    /**
     *名称:麻醉方法名称
     *
 	 *
     */
     private String anesthesiaMethodName;
    /**
     *名称:手术编码
     *
 	 *限制:CV990113
     */
     private String operationCd;
    /**
     *名称:手术名称
     *
 	 *
     */
     private String operationName;
    /**
     *名称:手术操作体位代码
     *
 	 *限制:CV9900041
     */
     private String operatingPosition;
    /**
     *名称:手术操作体位名称
     *
 	 *限制:CV9900041
     */
     private String operatingPositionName;
    /**
     *名称:手术操作目标部位代码
     *
 	 *限制:CV0600227
     */
     private String partCode;
    /**
     *名称:手术操作目标部位名称
     *
 	 *限制:CV0600227
     */
     private String partName;
    /**
     *名称:病案管理者id
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
     */
     private String medicalRecordManager;
    /**
     *名称:器材管理者id
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
     */
     private String equipmentManager;
    /**
     *名称:巡台护士id
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
     */
     private String patrolNurse;
    /**
     *名称:手术者id
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
     */
     private String operative;
    /**
     *名称:I助id
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
     */
     private String firstAssistant;
    /**
     *名称:II助id
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
     */
     private String secondAssistant;
    /**
     *名称:麻醉者id
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
     */
     private String anaesthetic;
    /**
     *名称:通知者id
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
     */
     private String notify;
    /**
     *名称:手术开始时间
     *
 	 *
     */
     private Long start;
    /**
     *名称:手术结束时间
     *
 	 *
     */
     private Long end;
    /**
     *名称:床位id
     *备注:引用床位信息表T_BED院内床位id
 	 *
     */
     private String bedId;
    /**
     *名称:手术申请单id
     *备注:引用手术申请表T_OPERATION_ORDER院内手术申请单id
 	 *
     */
     private String operationOrderId;
    /**
     *名称:切口类别代码
     *
 	 *限制:CV0510022
     */
     private String notchType;
    /**
     *名称:切口愈合级别代码
     *
 	 *限制:CV550114
     */
     private String incisionHealingCd;
    /**
     *名称:手术通知时间
     *
 	 *
     */
     private Long noticeDate;
    /**
     *名称:是否主要术式
     *
 	 *限制:CUS00004
     */
     private Boolean opMark;
    /**
     *名称:是否主要手术或操作
     *
 	 *限制:CUS00004
     */
     private Boolean opProMark;
    /**
     *名称:手术级别代码
     *
 	 *限制:CV9900040
     */
     private String opLevelCd;
    /**
     *名称:麻醉分级代码
     *
 	 *限制:CV9900329
     */
     private String anesthesiaLevelCd;
    /**
     *名称:手术类型
     *
 	 *限制:CV9900270
     */
     private String opTypeCode;
    /**
     *名称:记录时间
     *
 	 *
     */
     private Long authorDtime;
    /**
     *名称:手术切口描述
     *备注:对手术中皮肤切口情况的具体描述
 	 *
     */
     private String woundDescr;
    /**
     *名称:输血量
     *
 	 *
     */
     private Float transfusionItemAmount;
    /**
     *名称:输液量
     *
 	 *
     */
     private Float infusionAmount;
    /**
     *名称:出血量
     *
 	 *
     */
     private Float lossbloodAmount;
    /**
     *名称:引流标志
     *
 	 *限制:CUS00004
     */
     private Boolean ifDrain;
    /**
     *名称:引流材料数量
     *
 	 *
     */
     private Float drainMaterialAmount;
    /**
     *名称:引流材料名称
     *备注:对手术中引流材料名称的具体描述
 	 *
     */
     private String drainMaterialName;
    /**
     *名称:放置部位
     *备注:引流管放置在患者体内的具体位置的描述
 	 *
     */
     private String placedPart;
    /**
     *名称:术前用药
     *备注:对患者术前用药情况的描述
 	 *
     */
     private String opPreDrug;
    /**
     *名称:术中用药
     *备注:对患者术中用药情况的描述
 	 *
     */
     private String opDrug;
    /**
     *名称:手术经过
     *
 	 *
     */
     private String operationCourse;
    /**
     *名称:介入物名称
     *备注:实施手术操作时使用/放置的材料/药物的名称
 	 *
     */
     private String intervention;
    /**
     *名称:皮肤消毒描述
     *备注:对手术中皮肤消毒情况的具体描述
 	 *
     */
     private String skinThimerosal;
    /**
     *名称:输血反应标志
     *
 	 *限制:CUS00004
     */
     private Boolean transfuseReactionFlag;
    /**
     *名称:手术操作序号
     *
 	 *
     */
     private String opNo;
    /**
     *名称:记录者id
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
     */
     private String authorCode;
    /**
     *名称:术前诊断的值
     *
 	 *
     */
     private String preDiagnosisDn;
     private String errorMessage;
     private String errorDetail;             
     public OperationDetails(Operation operation) {
        super(operation);
         this.operationId=operation.getOperationId();
         this.patientId=operation.getPatientId();
         this.patientName=operation.getPatientName();
         this.visitMark=operation.getVisitMark();
         this.registrationId=operation.getRegistrationId();
         this.status=operation.getStatus();
         this.anesthesiaMethodCd=operation.getAnesthesiaMethodCd();
         this.anesthesiaMethodName=operation.getAnesthesiaMethodName();
         this.operationCd=operation.getOperationCd();
         this.operationName=operation.getOperationName();
         this.operatingPosition=operation.getOperatingPosition();
         this.operatingPositionName=operation.getOperatingPositionName();
         this.partCode=operation.getPartCode();
         this.partName=operation.getPartName();
         this.medicalRecordManager=operation.getMedicalRecordManager();
         this.equipmentManager=operation.getEquipmentManager();
         this.patrolNurse=operation.getPatrolNurse();
         this.operative=operation.getOperative();
         this.firstAssistant=operation.getFirstAssistant();
         this.secondAssistant=operation.getSecondAssistant();
         this.anaesthetic=operation.getAnaesthetic();
         this.notify=operation.getNotify();
         java.util.Date _start = operation.getStart();
         if(_start!=null){
         	this.start=_start.getTime();
         }
         java.util.Date _end = operation.getEnd();
         if(_end!=null){
         	this.end=_end.getTime();
         }
         this.bedId=operation.getBedId();
         this.operationOrderId=operation.getOperationOrderId();
         this.notchType=operation.getNotchType();
         this.incisionHealingCd=operation.getIncisionHealingCd();
         java.util.Date _noticeDate = operation.getNoticeDate();
         if(_noticeDate!=null){
         	this.noticeDate=_noticeDate.getTime();
         }
         this.opMark=operation.getOpMark();
         this.opProMark=operation.getOpProMark();
         this.opLevelCd=operation.getOpLevelCd();
         this.anesthesiaLevelCd=operation.getAnesthesiaLevelCd();
         this.opTypeCode=operation.getOpTypeCode();
         java.util.Date _authorDtime = operation.getAuthorDtime();
         if(_authorDtime!=null){
         	this.authorDtime=_authorDtime.getTime();
         }
         this.woundDescr=operation.getWoundDescr();
         this.transfusionItemAmount=operation.getTransfusionItemAmount();
         this.infusionAmount=operation.getInfusionAmount();
         this.lossbloodAmount=operation.getLossbloodAmount();
         this.ifDrain=operation.getIfDrain();
         this.drainMaterialAmount=operation.getDrainMaterialAmount();
         this.drainMaterialName=operation.getDrainMaterialName();
         this.placedPart=operation.getPlacedPart();
         this.opPreDrug=operation.getOpPreDrug();
         this.opDrug=operation.getOpDrug();
         this.operationCourse=operation.getOperationCourse();
         this.intervention=operation.getIntervention();
         this.skinThimerosal=operation.getSkinThimerosal();
         this.transfuseReactionFlag=operation.getTransfuseReactionFlag();
         this.opNo=operation.getOpNo();
         this.authorCode=operation.getAuthorCode();
         this.preDiagnosisDn=operation.getPreDiagnosisDn();
         this.errorMessage=operation.getErrorMessage();
         this.errorDetail=operation.getErrorDetail();      
    }
      public String  getOperationId(){
       		return this.operationId;
      }    
      public String  getPatientId(){
       		return this.patientId;
      }    
      public String  getPatientName(){
       		return this.patientName;
      }    
      public String  getVisitMark(){
       		return this.visitMark;
      }    
      public String  getRegistrationId(){
       		return this.registrationId;
      }    
      public String  getStatus(){
       		return this.status;
      }    
      public String  getAnesthesiaMethodCd(){
       		return this.anesthesiaMethodCd;
      }    
      public String  getAnesthesiaMethodName(){
       		return this.anesthesiaMethodName;
      }    
      public String  getOperationCd(){
       		return this.operationCd;
      }    
      public String  getOperationName(){
       		return this.operationName;
      }    
      public String  getOperatingPosition(){
       		return this.operatingPosition;
      }    
      public String  getOperatingPositionName(){
       		return this.operatingPositionName;
      }    
      public String  getPartCode(){
       		return this.partCode;
      }    
      public String  getPartName(){
       		return this.partName;
      }    
      public String  getMedicalRecordManager(){
       		return this.medicalRecordManager;
      }    
      public String  getEquipmentManager(){
       		return this.equipmentManager;
      }    
      public String  getPatrolNurse(){
       		return this.patrolNurse;
      }    
      public String  getOperative(){
       		return this.operative;
      }    
      public String  getFirstAssistant(){
       		return this.firstAssistant;
      }    
      public String  getSecondAssistant(){
       		return this.secondAssistant;
      }    
      public String  getAnaesthetic(){
       		return this.anaesthetic;
      }    
      public String  getNotify(){
       		return this.notify;
      }    
      public Long  getStart(){
       		return this.start;
      }    
      public Long  getEnd(){
       		return this.end;
      }    
      public String  getBedId(){
       		return this.bedId;
      }    
      public String  getOperationOrderId(){
       		return this.operationOrderId;
      }    
      public String  getNotchType(){
       		return this.notchType;
      }    
      public String  getIncisionHealingCd(){
       		return this.incisionHealingCd;
      }    
      public Long  getNoticeDate(){
       		return this.noticeDate;
      }    
      public Boolean  getOpMark(){
       		return this.opMark;
      }    
      public Boolean  getOpProMark(){
       		return this.opProMark;
      }    
      public String  getOpLevelCd(){
       		return this.opLevelCd;
      }    
      public String  getAnesthesiaLevelCd(){
       		return this.anesthesiaLevelCd;
      }    
      public String  getOpTypeCode(){
       		return this.opTypeCode;
      }    
      public Long  getAuthorDtime(){
       		return this.authorDtime;
      }    
      public String  getWoundDescr(){
       		return this.woundDescr;
      }    
      public Float  getTransfusionItemAmount(){
       		return this.transfusionItemAmount;
      }    
      public Float  getInfusionAmount(){
       		return this.infusionAmount;
      }    
      public Float  getLossbloodAmount(){
       		return this.lossbloodAmount;
      }    
      public Boolean  getIfDrain(){
       		return this.ifDrain;
      }    
      public Float  getDrainMaterialAmount(){
       		return this.drainMaterialAmount;
      }    
      public String  getDrainMaterialName(){
       		return this.drainMaterialName;
      }    
      public String  getPlacedPart(){
       		return this.placedPart;
      }    
      public String  getOpPreDrug(){
       		return this.opPreDrug;
      }    
      public String  getOpDrug(){
       		return this.opDrug;
      }    
      public String  getOperationCourse(){
       		return this.operationCourse;
      }    
      public String  getIntervention(){
       		return this.intervention;
      }    
      public String  getSkinThimerosal(){
       		return this.skinThimerosal;
      }    
      public Boolean  getTransfuseReactionFlag(){
       		return this.transfuseReactionFlag;
      }    
      public String  getOpNo(){
       		return this.opNo;
      }    
      public String  getAuthorCode(){
       		return this.authorCode;
      }    
      public String  getPreDiagnosisDn(){
       		return this.preDiagnosisDn;
      }    
	  public String getErrorMessage() {
	        return errorMessage;
	  }
	  public String getErrorDetail() {
	        return errorDetail;
	  }  
}