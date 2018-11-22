package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.DischargeSummary;

public class DischargeSummaryDetails extends DischargeSummaryRecord {
    /**
     *名称:出院小结id
     *
 	 *
     */
     private String dischargeSummaryId;
    /**
     *名称:出院小结类型
     *
 	 *限制:CV990108
     */
     private String dischargeSummaryType;
    /**
     *名称:记录日期
     *
 	 *
     */
     private Long date;
    /**
     *名称:患者年龄
     *
 	 *
     */
     private Float age;
    /**
     *名称:患者类型
     *
 	 *限制:CV0900404
     */
     private String patientType;
    /**
     *名称:职业代码
     *
 	 *限制:GBT22614
     */
     private String occupationCd;
    /**
     *名称:工作单位
     *
 	 *
     */
     private String workUnit;
    /**
     *名称:出生地住址-省（自治区、直辖市）代码
     *
 	 *限制:GBT2260
     */
     private String birthProCode;
    /**
     *名称:出生地住址-市（地区）代码
     *
 	 *限制:GBT2260
     */
     private String birthCityCode;
    /**
     *名称:出生地住址-县（区）代码
     *
 	 *限制:GBT2260
     */
     private String birthCouCode;
    /**
     *名称:出生地住址-村（街、路、弄等）
     *
 	 *
     */
     private String birthAddressVillage;
    /**
     *名称:民族代码
     *
 	 *限制:CV9900377
     */
     private String nationCd;
    /**
     *名称:院内患者ID
     *
 	 *
     */
     private String patientId;
    /**
     *名称:身份证号
     *
 	 *
     */
     private String idCard;
    /**
     *名称:城乡居民健康档案编号
     *
 	 *
     */
     private String healthFileNumber;
    /**
     *名称:健康卡号
     *
 	 *
     */
     private String healthCard;
    /**
     *名称:姓名
     *
 	 *
     */
     private String name;
    /**
     *名称:联系电话
     *
 	 *
     */
     private String telecom;
    /**
     *名称:性别
     *
 	 *限制:GBT22611
     */
     private String gender;
    /**
     *名称:出生日期
     *
 	 *
     */
     private Long birthdate;
    /**
     *名称:工作住址-省（自治区、直辖市）代码
     *
 	 *限制:GBT2260
     */
     private String workState;
    /**
     *名称:工作住址-市（地区）代码
     *
 	 *限制:GBT2260
     */
     private String workCity;
    /**
     *名称:工作住址-县（区）代码
     *
 	 *限制:GBT2260
     */
     private String workDistrict;
    /**
     *名称:工作住址-乡（镇、街道办事处）
     *
 	 *
     */
     private String workLine;
    /**
     *名称:工作住址-村（街、路、弄等）
     *
 	 *
     */
     private String workRoad;
    /**
     *名称:工作住址-门牌号码
     *
 	 *
     */
     private String workHouseNo;
    /**
     *名称:工作地址邮政编码
     *
 	 *
     */
     private String workPostCd;
    /**
     *名称:工作地址详细信息
     *
 	 *
     */
     private String workAddressDetails;
    /**
     *名称:现居住住址-省（自治区、直辖市）代码
     *
 	 *限制:GBT2260
     */
     private String tempState;
    /**
     *名称:现居住住址-市（地区）代码
     *
 	 *限制:GBT2260
     */
     private String tempCity;
    /**
     *名称:现居住住址-县（区）代码
     *
 	 *限制:GBT2260
     */
     private String tempDistrict;
    /**
     *名称:现居住住址-乡（镇、街道办事处）
     *
 	 *
     */
     private String tempLine;
    /**
     *名称:现居住住址-村（街、路、弄等）
     *
 	 *
     */
     private String tempRoad;
    /**
     *名称:现居住住址-门牌号码
     *
 	 *
     */
     private String tempHouseNo;
    /**
     *名称:现居住地址邮政编码
     *
 	 *
     */
     private String tempPostCd;
    /**
     *名称:现居住址详细信息
     *
 	 *
     */
     private String tempAddressDetails;
    /**
     *名称:婚姻状况代码
     *
 	 *限制:GBT22612
     */
     private String maritalstatus;
    /**
     *名称:联系人关系代码
     *
 	 *限制:GBT4761
     */
     private String relationship;
    /**
     *名称:联系人姓名
     *
 	 *
     */
     private String contactsName;
    /**
     *名称:联系人电话号码
     *
 	 *
     */
     private String contactsPhone;
    /**
     *名称:文档创建者id
     *
 	 *
     */
     private String authorId;
    /**
     *名称:文档创建者姓名
     *
 	 *
     */
     private String authorName;
    /**
     *名称:法定审核者签名日期
     *
 	 *
     */
     private Long statutoryAuditSignDate;
    /**
     *名称:法定审核者id
     *
 	 *
     */
     private String statutoryAuditId;
    /**
     *名称:法定审核者姓名
     *
 	 *
     */
     private String statutoryAuditName;
    /**
     *名称:文档审核者签名日期
     *
 	 *
     */
     private Long documentVerifierSignDate;
    /**
     *名称:文档审核者id
     *
 	 *
     */
     private String documentVerifierId;
    /**
     *名称:文档审核者姓名
     *
 	 *
     */
     private String documentVerifierName;
    /**
     *名称:住院医师签名日期
     *
 	 *
     */
     private Long residentDoctorSignDate;
    /**
     *名称:住院医师id
     *
 	 *
     */
     private String residentDoctorId;
    /**
     *名称:住院医师姓名
     *
 	 *
     */
     private String residentDoctorName;
    /**
     *名称:主治医师签名日期
     *
 	 *
     */
     private Long attendingPhysicianSignDate;
    /**
     *名称:主治医师id
     *
 	 *
     */
     private String attendingPhysicianId;
    /**
     *名称:主治医师姓名
     *
 	 *
     */
     private String attendingPhysicianName;
    /**
     *名称:住院流水号
     *
 	 *
     */
     private String inpatientRegistrationId;
    /**
     *名称:入院时间
     *
 	 *
     */
     private Long startTime;
    /**
     *名称:出院时间
     *
 	 *
     */
     private Long endTime;
    /**
     *名称:住院号
     *
 	 *
     */
     private String inhId;
    /**
     *名称:就诊科室id
     *
 	 *
     */
     private String visitingDeptId;
    /**
     *名称:就诊科室名称
     *
 	 *
     */
     private String visitingDeptName;
    /**
     *名称:就诊科室标准编码
     *
 	 *限制:CV9900051
     */
     private String visitingDeptCd;
    /**
     *名称:病房号
     *
 	 *
     */
     private String wardNo;
    /**
     *名称:病区
     *
 	 *
     */
     private String wardArea;
    /**
     *名称:床位号
     *
 	 *
     */
     private String bedNum;
    /**
     *名称:中医"四诊"观察结果
     *
 	 *
     */
     private String cnFourResult;
    /**
     *名称:住院天数
     *
 	 *
     */
     private Float inpatientDays;
    /**
     *名称:入院情况
     *
 	 *
     */
     private String inpatientCircumstance;
    /**
     *名称:入院诊断-中医征候诊断代码
     *
 	 *限制:CV9900357
     */
     private String inCnSymDiagCode;
    /**
     *名称:入院诊断-中医病名诊断代码
     *
 	 *限制:CV9900357
     */
     private String inCnDisDiagCode;
    /**
     *名称:入院诊断-诊断编码
     *
 	 *限制:CV990111
     */
     private String inDiagCode;
    /**
     *名称:入院诊断-诊断名称
     *
 	 *
     */
     private String inDiagValue;
    /**
     *名称:入院诊断-诊断日期
     *
 	 *
     */
     private Long inDiagDate;
    /**
     *名称:出院诊断-中医征候诊断代码
     *
 	 *限制:CV9900357
     */
     private String outCnSymDiagCode;
    /**
     *名称:出院诊断-中医病名诊断代码
     *
 	 *限制:CV9900357
     */
     private String outCnDisDiagCode;
    /**
     *名称:出院诊断-出院时症状与体征
     *
 	 *限制:CV9900357
     */
     private String outDischargeSymptomAndSign;
    /**
     *名称:出院诊断-出院情况
     *
 	 *限制:CV9900357
     */
     private String outDischargeCircumstance;
    /**
     *名称:出院诊断-治疗结果代码
     *
 	 *限制:CV0510010
     */
     private String outTreatmentResultCode;
    /**
     *名称:出院诊断-诊断编码
     *
 	 *限制:CV990111
     */
     private String outDiagCode;
    /**
     *名称:出院诊断-诊断名称
     *
 	 *
     */
     private String outDiagValue;
    /**
     *名称:出院诊断-诊断日期
     *
 	 *
     */
     private Long outDiagDate;
    /**
     *名称:切口类别代码
     *
 	 *限制:CV0510022
     */
     private String incisionTypeCode;
    /**
     *名称:切口愈合级别代码
     *
 	 *限制:CV550114
     */
     private String incisionHealingRankCode;
    /**
     *名称:手术过程
     *
 	 *
     */
     private String operationCourses;
    /**
     *名称:手术单号
     *
 	 *
     */
     private String operationId;
    /**
     *名称:麻醉方法代码
     *
 	 *限制:CV0600103
     */
     private String anesthesiaCode;
    /**
     *名称:麻醉方法
     *
 	 *
     */
     private String anesthesiaWay;
    /**
     *名称:手术开始时间
     *
 	 *
     */
     private Long procedureStart;
    /**
     *名称:手术结束时间
     *
 	 *
     */
     private Long procedureEnd;
    /**
     *名称:治则治法
     *
 	 *
     */
     private String therapeuticPrinciples;
    /**
     *名称:诊疗过程描述
     *
 	 *
     */
     private String treatRescueCourse;
    /**
     *名称:出院医嘱
     *
 	 *
     */
     private String dischargeAdvice;
    /**
     *名称:中药煎煮法
     *
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
     *名称:阳性辅助检查结果
     *
 	 *
     */
     private String positiveAuxInspectionResult;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
     */
     private String upHospitalName;
     private String errorMessage;
     private String errorDetail;             
     public DischargeSummaryDetails(DischargeSummary dischargeSummary) {
        super(dischargeSummary);
         this.dischargeSummaryId=dischargeSummary.getDischargeSummaryId();
         this.dischargeSummaryType=dischargeSummary.getDischargeSummaryType();
         java.util.Date _date = dischargeSummary.getDate();
         if(_date!=null){
         	this.date=_date.getTime();
         }
         this.age=dischargeSummary.getAge();
         this.patientType=dischargeSummary.getPatientType();
         this.occupationCd=dischargeSummary.getOccupationCd();
         this.workUnit=dischargeSummary.getWorkUnit();
         this.birthProCode=dischargeSummary.getBirthProCode();
         this.birthCityCode=dischargeSummary.getBirthCityCode();
         this.birthCouCode=dischargeSummary.getBirthCouCode();
         this.birthAddressVillage=dischargeSummary.getBirthAddressVillage();
         this.nationCd=dischargeSummary.getNationCd();
         this.patientId=dischargeSummary.getPatientId();
         this.idCard=dischargeSummary.getIdCard();
         this.healthFileNumber=dischargeSummary.getHealthFileNumber();
         this.healthCard=dischargeSummary.getHealthCard();
         this.name=dischargeSummary.getName();
         this.telecom=dischargeSummary.getTelecom();
         this.gender=dischargeSummary.getGender();
         java.util.Date _birthdate = dischargeSummary.getBirthdate();
         if(_birthdate!=null){
         	this.birthdate=_birthdate.getTime();
         }
         this.workState=dischargeSummary.getWorkState();
         this.workCity=dischargeSummary.getWorkCity();
         this.workDistrict=dischargeSummary.getWorkDistrict();
         this.workLine=dischargeSummary.getWorkLine();
         this.workRoad=dischargeSummary.getWorkRoad();
         this.workHouseNo=dischargeSummary.getWorkHouseNo();
         this.workPostCd=dischargeSummary.getWorkPostCd();
         this.workAddressDetails=dischargeSummary.getWorkAddressDetails();
         this.tempState=dischargeSummary.getTempState();
         this.tempCity=dischargeSummary.getTempCity();
         this.tempDistrict=dischargeSummary.getTempDistrict();
         this.tempLine=dischargeSummary.getTempLine();
         this.tempRoad=dischargeSummary.getTempRoad();
         this.tempHouseNo=dischargeSummary.getTempHouseNo();
         this.tempPostCd=dischargeSummary.getTempPostCd();
         this.tempAddressDetails=dischargeSummary.getTempAddressDetails();
         this.maritalstatus=dischargeSummary.getMaritalstatus();
         this.relationship=dischargeSummary.getRelationship();
         this.contactsName=dischargeSummary.getContactsName();
         this.contactsPhone=dischargeSummary.getContactsPhone();
         this.authorId=dischargeSummary.getAuthorId();
         this.authorName=dischargeSummary.getAuthorName();
         java.util.Date _statutoryAuditSignDate = dischargeSummary.getStatutoryAuditSignDate();
         if(_statutoryAuditSignDate!=null){
         	this.statutoryAuditSignDate=_statutoryAuditSignDate.getTime();
         }
         this.statutoryAuditId=dischargeSummary.getStatutoryAuditId();
         this.statutoryAuditName=dischargeSummary.getStatutoryAuditName();
         java.util.Date _documentVerifierSignDate = dischargeSummary.getDocumentVerifierSignDate();
         if(_documentVerifierSignDate!=null){
         	this.documentVerifierSignDate=_documentVerifierSignDate.getTime();
         }
         this.documentVerifierId=dischargeSummary.getDocumentVerifierId();
         this.documentVerifierName=dischargeSummary.getDocumentVerifierName();
         java.util.Date _residentDoctorSignDate = dischargeSummary.getResidentDoctorSignDate();
         if(_residentDoctorSignDate!=null){
         	this.residentDoctorSignDate=_residentDoctorSignDate.getTime();
         }
         this.residentDoctorId=dischargeSummary.getResidentDoctorId();
         this.residentDoctorName=dischargeSummary.getResidentDoctorName();
         java.util.Date _attendingPhysicianSignDate = dischargeSummary.getAttendingPhysicianSignDate();
         if(_attendingPhysicianSignDate!=null){
         	this.attendingPhysicianSignDate=_attendingPhysicianSignDate.getTime();
         }
         this.attendingPhysicianId=dischargeSummary.getAttendingPhysicianId();
         this.attendingPhysicianName=dischargeSummary.getAttendingPhysicianName();
         this.inpatientRegistrationId=dischargeSummary.getInpatientRegistrationId();
         java.util.Date _startTime = dischargeSummary.getStartTime();
         if(_startTime!=null){
         	this.startTime=_startTime.getTime();
         }
         java.util.Date _endTime = dischargeSummary.getEndTime();
         if(_endTime!=null){
         	this.endTime=_endTime.getTime();
         }
         this.inhId=dischargeSummary.getInhId();
         this.visitingDeptId=dischargeSummary.getVisitingDeptId();
         this.visitingDeptName=dischargeSummary.getVisitingDeptName();
         this.visitingDeptCd=dischargeSummary.getVisitingDeptCd();
         this.wardNo=dischargeSummary.getWardNo();
         this.wardArea=dischargeSummary.getWardArea();
         this.bedNum=dischargeSummary.getBedNum();
         this.cnFourResult=dischargeSummary.getCnFourResult();
         this.inpatientDays=dischargeSummary.getInpatientDays();
         this.inpatientCircumstance=dischargeSummary.getInpatientCircumstance();
         this.inCnSymDiagCode=dischargeSummary.getInCnSymDiagCode();
         this.inCnDisDiagCode=dischargeSummary.getInCnDisDiagCode();
         this.inDiagCode=dischargeSummary.getInDiagCode();
         this.inDiagValue=dischargeSummary.getInDiagValue();
         java.util.Date _inDiagDate = dischargeSummary.getInDiagDate();
         if(_inDiagDate!=null){
         	this.inDiagDate=_inDiagDate.getTime();
         }
         this.outCnSymDiagCode=dischargeSummary.getOutCnSymDiagCode();
         this.outCnDisDiagCode=dischargeSummary.getOutCnDisDiagCode();
         this.outDischargeSymptomAndSign=dischargeSummary.getOutDischargeSymptomAndSign();
         this.outDischargeCircumstance=dischargeSummary.getOutDischargeCircumstance();
         this.outTreatmentResultCode=dischargeSummary.getOutTreatmentResultCode();
         this.outDiagCode=dischargeSummary.getOutDiagCode();
         this.outDiagValue=dischargeSummary.getOutDiagValue();
         java.util.Date _outDiagDate = dischargeSummary.getOutDiagDate();
         if(_outDiagDate!=null){
         	this.outDiagDate=_outDiagDate.getTime();
         }
         this.incisionTypeCode=dischargeSummary.getIncisionTypeCode();
         this.incisionHealingRankCode=dischargeSummary.getIncisionHealingRankCode();
         this.operationCourses=dischargeSummary.getOperationCourses();
         this.operationId=dischargeSummary.getOperationId();
         this.anesthesiaCode=dischargeSummary.getAnesthesiaCode();
         this.anesthesiaWay=dischargeSummary.getAnesthesiaWay();
         java.util.Date _procedureStart = dischargeSummary.getProcedureStart();
         if(_procedureStart!=null){
         	this.procedureStart=_procedureStart.getTime();
         }
         java.util.Date _procedureEnd = dischargeSummary.getProcedureEnd();
         if(_procedureEnd!=null){
         	this.procedureEnd=_procedureEnd.getTime();
         }
         this.therapeuticPrinciples=dischargeSummary.getTherapeuticPrinciples();
         this.treatRescueCourse=dischargeSummary.getTreatRescueCourse();
         this.dischargeAdvice=dischargeSummary.getDischargeAdvice();
         this.cnPrescribeDescr=dischargeSummary.getCnPrescribeDescr();
         this.cnDrugWayCd=dischargeSummary.getCnDrugWayCd();
         this.positiveAuxInspectionResult=dischargeSummary.getPositiveAuxInspectionResult();
         this.upHospitalName=dischargeSummary.getUpHospitalName();
         this.errorMessage=dischargeSummary.getErrorMessage();
         this.errorDetail=dischargeSummary.getErrorDetail();      
    }
      public String  getDischargeSummaryId(){
       		return this.dischargeSummaryId;
      }    
      public String  getDischargeSummaryType(){
       		return this.dischargeSummaryType;
      }    
      public Long  getDate(){
       		return this.date;
      }    
      public Float  getAge(){
       		return this.age;
      }    
      public String  getPatientType(){
       		return this.patientType;
      }    
      public String  getOccupationCd(){
       		return this.occupationCd;
      }    
      public String  getWorkUnit(){
       		return this.workUnit;
      }    
      public String  getBirthProCode(){
       		return this.birthProCode;
      }    
      public String  getBirthCityCode(){
       		return this.birthCityCode;
      }    
      public String  getBirthCouCode(){
       		return this.birthCouCode;
      }    
      public String  getBirthAddressVillage(){
       		return this.birthAddressVillage;
      }    
      public String  getNationCd(){
       		return this.nationCd;
      }    
      public String  getPatientId(){
       		return this.patientId;
      }    
      public String  getIdCard(){
       		return this.idCard;
      }    
      public String  getHealthFileNumber(){
       		return this.healthFileNumber;
      }    
      public String  getHealthCard(){
       		return this.healthCard;
      }    
      public String  getName(){
       		return this.name;
      }    
      public String  getTelecom(){
       		return this.telecom;
      }    
      public String  getGender(){
       		return this.gender;
      }    
      public Long  getBirthdate(){
       		return this.birthdate;
      }    
      public String  getWorkState(){
       		return this.workState;
      }    
      public String  getWorkCity(){
       		return this.workCity;
      }    
      public String  getWorkDistrict(){
       		return this.workDistrict;
      }    
      public String  getWorkLine(){
       		return this.workLine;
      }    
      public String  getWorkRoad(){
       		return this.workRoad;
      }    
      public String  getWorkHouseNo(){
       		return this.workHouseNo;
      }    
      public String  getWorkPostCd(){
       		return this.workPostCd;
      }    
      public String  getWorkAddressDetails(){
       		return this.workAddressDetails;
      }    
      public String  getTempState(){
       		return this.tempState;
      }    
      public String  getTempCity(){
       		return this.tempCity;
      }    
      public String  getTempDistrict(){
       		return this.tempDistrict;
      }    
      public String  getTempLine(){
       		return this.tempLine;
      }    
      public String  getTempRoad(){
       		return this.tempRoad;
      }    
      public String  getTempHouseNo(){
       		return this.tempHouseNo;
      }    
      public String  getTempPostCd(){
       		return this.tempPostCd;
      }    
      public String  getTempAddressDetails(){
       		return this.tempAddressDetails;
      }    
      public String  getMaritalstatus(){
       		return this.maritalstatus;
      }    
      public String  getRelationship(){
       		return this.relationship;
      }    
      public String  getContactsName(){
       		return this.contactsName;
      }    
      public String  getContactsPhone(){
       		return this.contactsPhone;
      }    
      public String  getAuthorId(){
       		return this.authorId;
      }    
      public String  getAuthorName(){
       		return this.authorName;
      }    
      public Long  getStatutoryAuditSignDate(){
       		return this.statutoryAuditSignDate;
      }    
      public String  getStatutoryAuditId(){
       		return this.statutoryAuditId;
      }    
      public String  getStatutoryAuditName(){
       		return this.statutoryAuditName;
      }    
      public Long  getDocumentVerifierSignDate(){
       		return this.documentVerifierSignDate;
      }    
      public String  getDocumentVerifierId(){
       		return this.documentVerifierId;
      }    
      public String  getDocumentVerifierName(){
       		return this.documentVerifierName;
      }    
      public Long  getResidentDoctorSignDate(){
       		return this.residentDoctorSignDate;
      }    
      public String  getResidentDoctorId(){
       		return this.residentDoctorId;
      }    
      public String  getResidentDoctorName(){
       		return this.residentDoctorName;
      }    
      public Long  getAttendingPhysicianSignDate(){
       		return this.attendingPhysicianSignDate;
      }    
      public String  getAttendingPhysicianId(){
       		return this.attendingPhysicianId;
      }    
      public String  getAttendingPhysicianName(){
       		return this.attendingPhysicianName;
      }    
      public String  getInpatientRegistrationId(){
       		return this.inpatientRegistrationId;
      }    
      public Long  getStartTime(){
       		return this.startTime;
      }    
      public Long  getEndTime(){
       		return this.endTime;
      }    
      public String  getInhId(){
       		return this.inhId;
      }    
      public String  getVisitingDeptId(){
       		return this.visitingDeptId;
      }    
      public String  getVisitingDeptName(){
       		return this.visitingDeptName;
      }    
      public String  getVisitingDeptCd(){
       		return this.visitingDeptCd;
      }    
      public String  getWardNo(){
       		return this.wardNo;
      }    
      public String  getWardArea(){
       		return this.wardArea;
      }    
      public String  getBedNum(){
       		return this.bedNum;
      }    
      public String  getCnFourResult(){
       		return this.cnFourResult;
      }    
      public Float  getInpatientDays(){
       		return this.inpatientDays;
      }    
      public String  getInpatientCircumstance(){
       		return this.inpatientCircumstance;
      }    
      public String  getInCnSymDiagCode(){
       		return this.inCnSymDiagCode;
      }    
      public String  getInCnDisDiagCode(){
       		return this.inCnDisDiagCode;
      }    
      public String  getInDiagCode(){
       		return this.inDiagCode;
      }    
      public String  getInDiagValue(){
       		return this.inDiagValue;
      }    
      public Long  getInDiagDate(){
       		return this.inDiagDate;
      }    
      public String  getOutCnSymDiagCode(){
       		return this.outCnSymDiagCode;
      }    
      public String  getOutCnDisDiagCode(){
       		return this.outCnDisDiagCode;
      }    
      public String  getOutDischargeSymptomAndSign(){
       		return this.outDischargeSymptomAndSign;
      }    
      public String  getOutDischargeCircumstance(){
       		return this.outDischargeCircumstance;
      }    
      public String  getOutTreatmentResultCode(){
       		return this.outTreatmentResultCode;
      }    
      public String  getOutDiagCode(){
       		return this.outDiagCode;
      }    
      public String  getOutDiagValue(){
       		return this.outDiagValue;
      }    
      public Long  getOutDiagDate(){
       		return this.outDiagDate;
      }    
      public String  getIncisionTypeCode(){
       		return this.incisionTypeCode;
      }    
      public String  getIncisionHealingRankCode(){
       		return this.incisionHealingRankCode;
      }    
      public String  getOperationCourses(){
       		return this.operationCourses;
      }    
      public String  getOperationId(){
       		return this.operationId;
      }    
      public String  getAnesthesiaCode(){
       		return this.anesthesiaCode;
      }    
      public String  getAnesthesiaWay(){
       		return this.anesthesiaWay;
      }    
      public Long  getProcedureStart(){
       		return this.procedureStart;
      }    
      public Long  getProcedureEnd(){
       		return this.procedureEnd;
      }    
      public String  getTherapeuticPrinciples(){
       		return this.therapeuticPrinciples;
      }    
      public String  getTreatRescueCourse(){
       		return this.treatRescueCourse;
      }    
      public String  getDischargeAdvice(){
       		return this.dischargeAdvice;
      }    
      public String  getCnPrescribeDescr(){
       		return this.cnPrescribeDescr;
      }    
      public String  getCnDrugWayCd(){
       		return this.cnDrugWayCd;
      }    
      public String  getPositiveAuxInspectionResult(){
       		return this.positiveAuxInspectionResult;
      }    
      public String  getUpHospitalName(){
       		return this.upHospitalName;
      }    
	  public String getErrorMessage() {
	        return errorMessage;
	  }
	  public String getErrorDetail() {
	        return errorDetail;
	  }  
}