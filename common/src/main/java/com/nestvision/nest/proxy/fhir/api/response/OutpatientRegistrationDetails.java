package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.OutpatientRegistration;

public class OutpatientRegistrationDetails extends OutpatientRegistrationRecord {
    /**
     *名称:院内门诊流水号
     *备注:本次门诊就诊在院内系统中的唯一标识
 	 *
     */
     private String outpatientRegistrationId;
    /**
     *名称:患者id
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
     *名称:接诊医生id
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
     */
     private String receiveEmployeeId;
    /**
     *名称:接诊医师签名日期
     *
 	 *
     */
     private Long receiveAutographDate;
    /**
     *名称:挂号id
     *备注:引用门诊挂号表T_APPOINTMENT挂号号
 	 *
     */
     private String registerId;
    /**
     *名称:接诊时间
     *
 	 *
     */
     private Long receiveDate;
    /**
     *名称:接诊科室
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
     */
     private String serviceprovider;
    /**
     *名称:是否留观标志
     *
 	 *限制:CUS00004
     */
     private Boolean ifObserve;
    /**
     *名称:是否抢救标志
     *
 	 *限制:CUS00004
     */
     private Boolean ifRescue;
    /**
     *名称:主诉
     *
 	 *
     */
     private String chief;
    /**
     *名称:现病史
     *
 	 *
     */
     private String illness;
    /**
     *名称:既往史
     *
 	 *
     */
     private String history;
    /**
     *名称:个人史
     *
 	 *
     */
     private String perHistory;
    /**
     *名称:婚姻史
     *
 	 *
     */
     private String marHistory;
    /**
     *名称:生育史
     *
 	 *
     */
     private String childHistory;
    /**
     *名称:家族史
     *
 	 *
     */
     private String famHistory;
    /**
     *名称:体格检查
     *
 	 *
     */
     private String phyCheckup;
    /**
     *名称:处置
     *
 	 *
     */
     private String management;
    /**
     *名称:是否本地标志
     *
 	 *限制:CUS00004
     */
     private Boolean isLocalMark;
    /**
     *名称:初诊标志代码
     *
 	 *限制:CV9900267
     */
     private String newlyMark;
    /**
     *名称:是否转诊标志
     *
 	 *限制:CUS00004
     */
     private Boolean referralMark;
    /**
     *名称:患者既往健康状况代码
     *
 	 *限制:GBT22613
     */
     private String generalHealthMark;
    /**
     *名称:既往健康状况及重要相关病史的描述
     *
 	 *
     */
     private String pastDisHis;
    /**
     *名称:患者有无慢性病史
     *
 	 *限制:CV9900024
     */
     private String inpatChronicMark;
    /**
     *名称:患者有无传染病史
     *
 	 *限制:CV9900024
     */
     private String inpatInfectMark;
    /**
     *名称:患者既往所患各种急性或慢性传染性疾病名称
     *
 	 *
     */
     private String infectHistory;
    /**
     *名称:患者有无外伤史
     *
 	 *限制:CV9900024
     */
     private String inpatTraumaMark;
    /**
     *名称:对患者外伤史的描述
     *
 	 *
     */
     private String traumaHis;
    /**
     *名称:患者既往健康状况和疾病(含外伤) 的详细描述
     *
 	 *
     */
     private String disHis;
    /**
     *名称:患者有无预防接种史
     *
 	 *限制:CV9900024
     */
     private String inpatVaccinationMark;
    /**
     *名称:患者预防接种情况的详细描述
     *
 	 *
     */
     private String vaccHis;
    /**
     *名称:患者有无手术史
     *
 	 *限制:CV9900024
     */
     private String inpatOpMark;
    /**
     *名称:患者既往接受手术/操作经历的详细描述
     *
 	 *
     */
     private String opHis;
    /**
     *名称:患者有无输血史
     *
 	 *限制:CV9900024
     */
     private String inpatTransfusionMark;
    /**
     *名称:患者既往输血史的详细描述
     *
 	 *
     */
     private String transfusionHis;
    /**
     *名称:患者有无过敏史
     *
 	 *限制:CV9900024
     */
     private String inpatAlleMark;
    /**
     *名称:患者既往发生过敏情况的详细描述
     *
 	 *
     */
     private String alleHis;
    /**
     *名称:月经史
     *
 	 *
     */
     private String mensesHis;
    /**
     *名称:体格检查：体温
     *备注:体温的测量值，计量单位为℃
 	 *
     */
     private Float bodyTemperature;
    /**
     *名称:体格检查：脉搏
     *备注:患者每分钟脉搏次数的测量值，计量单位为次/min
 	 *
     */
     private Integer prFreq;
    /**
     *名称:体格检查：呼吸
     *备注:患者每分钟呼吸次数的测量值，计量单位为次/min
 	 *
     */
     private Integer breatheFreq;
    /**
     *名称:体格检查：收缩压
     *备注:收缩压的测量值，计量单位为mmHg
 	 *
     */
     private Integer sbp;
    /**
     *名称:体格检查：舒张压
     *备注:舒张压的测量值，计量单位为mmHg
 	 *
     */
     private Integer dbp;
    /**
     *名称:体格检查：身高
     *备注:患者身高的测量值，计量单位为cm
 	 *
     */
     private Float bodyHeight;
    /**
     *名称:体格检查：体重
     *备注:患者体重的测量值，计量单位为kg
 	 *
     */
     private Float bodyWeight;
    /**
     *名称:体格检查：一般状况
     *备注:对患者一般状况检查结果的详细描述，包括其发育状况、营养状况、体味、步态、面容与表情、意识，检查能否合作等等
 	 *
     */
     private String generalSituExamResult;
    /**
     *名称:体格检查：皮肤粘膜
     *备注:对患者皮肤和黏膜检查结果的详细描述
 	 *
     */
     private String skin;
    /**
     *名称:体格检查：淋巴结
     *备注:对患者全身浅表淋巴检查结果的详细描述
 	 *
     */
     private String ln;
    /**
     *名称:体格检查：头部
     *备注:对患者头部及其器官检查结果的详细描述
 	 *
     */
     private String head;
    /**
     *名称:体格检查：颈部
     *备注:对患者颈部检查结果的详细描述
 	 *
     */
     private String neck;
    /**
     *名称:体格检查：胸部
     *备注:对患者胸部(胸廊、肺部、心脏、血管)检查结果的详细描述，包括视触叩听的检查结呆
 	 *
     */
     private String chest;
    /**
     *名称:体格检查：肺
     *备注:患者肺部诊断结果的详细描述
 	 *
     */
     private String lungDiag;
    /**
     *名称:体格检查：腹部
     *备注:对患者腹部(肝脾等)检查结果的详细描述，包括视触叩听的检查结果
 	 *
     */
     private String belly;
    /**
     *名称:体格检查：肛门直肠
     *备注:对患者肛门指诊检查结果的详细描述
 	 *
     */
     private String dreResultDescr;
    /**
     *名称:体格检查：生殖器
     *备注:对患者外生殖器检查结果的详细描述
 	 *
     */
     private String anusPudendum;
    /**
     *名称:-体格检查：脊椎
     *备注:对患者脊柱检查结果的详细描述
 	 *
     */
     private String spine;
    /**
     *名称:体格检查：四肢
     *备注:对患者四肢检查结果的详细描述
 	 *
     */
     private String limbs;
    /**
     *名称:体格检查：神经系统
     *备注:对患者神经系统检查结果的详细描述
 	 *
     */
     private String mental;
    /**
     *名称:体格检查：呼吸系统
     *备注:对患者呼吸系统疾病的描述，如有无症状，有无呼吸系统慢性疾病
 	 *
     */
     private String respiratorySys;
    /**
     *名称:体格检查：循环系统
     *备注:对患者循环系统疾病的描述，如有无症状，有无病史
 	 *
     */
     private String circulationSys;
    /**
     *名称:体格检查：消化系统
     *备注:对患者消化系统疾病的描述，如有无症状，有无病史
 	 *
     */
     private String digestiveSys;
    /**
     *名称:体格检查：泌尿系统
     *备注:对患者泌尿系统疾病的描述，如有无症状，有无泌尿系统疾病
 	 *
     */
     private String urinarySys;
    /**
     *名称:体格检查：造血系统
     *备注:对患者造血系统疾病的描述，如有无症状，有无病史
 	 *
     */
     private String hemopoieticSys;
    /**
     *名称:体格检查：内分泌及代谢
     *备注:对患者内分泌及代谢疾病的描述，如有无症状，有无内分泌疾病
 	 *
     */
     private String endocrineMetabolism;
    /**
     *名称:体格检查：肌肉骨骼系统
     *备注:对患者肌肉骨骼系统疾病的描述，如有无症状，有无肌肉骨骼疾病
 	 *
     */
     private String musculoskeletalSys;
    /**
     *名称:患者腹部周长的测量值
     *备注:计量单位为cm
 	 *
     */
     private Float ac;
    /**
     *名称:专科情况检查
     *
 	 *
     */
     private String specialistChecks;
    /**
     *名称:治则治法
     *备注:根据辨证结果采用的治则治法名称术语
 	 *
     */
     private String therapeuticPrinciples;
    /**
     *名称:辨证依据
     *备注:中医证候辨证分型主要依据的详细描述
 	 *
     */
     private String dialectProof;
    /**
     *名称:中医"四诊"观察结果
     *备注:中医四诊观察结果的详细描述，包括望、闻、问、切四诊内容
 	 *
     */
     private String cnFourResult;
    /**
     *名称:其他医学处置
     *备注:临床医师对患者实施的除检查/检验、用药、手术/操作以外的医学处置的描述
 	 *
     */
     private String otherMedicalTreatment;
    /**
     *名称:健康问题评估
     *备注:根据患者疾病临床表现、实验室检查结果等作出的健康问题评估结果的详细描述
 	 *
     */
     private String healthProblemEval;
    /**
     *名称:卫生服务要求
     *备注:患者就诊时对本人所患疾病提出的卫生服务要求的详细描述
 	 *
     */
     private String healthServiceDemand;
    /**
     *名称:咨询问题
     *备注:对个体所患疾病提出的咨询问题的详细描述
 	 *
     */
     private String consultQuestion;
    /**
     *名称:患者去向代码
     *
 	 *限制:CV9900291
     */
     private String outCode;
     private String errorMessage;
     private String errorDetail;             
     public OutpatientRegistrationDetails(OutpatientRegistration outpatientRegistration) {
        super(outpatientRegistration);
         this.outpatientRegistrationId=outpatientRegistration.getOutpatientRegistrationId();
         this.patientId=outpatientRegistration.getPatientId();
         this.patientName=outpatientRegistration.getPatientName();
         this.receiveEmployeeId=outpatientRegistration.getReceiveEmployeeId();
         java.util.Date _receiveAutographDate = outpatientRegistration.getReceiveAutographDate();
         if(_receiveAutographDate!=null){
         	this.receiveAutographDate=_receiveAutographDate.getTime();
         }
         this.registerId=outpatientRegistration.getRegisterId();
         java.util.Date _receiveDate = outpatientRegistration.getReceiveDate();
         if(_receiveDate!=null){
         	this.receiveDate=_receiveDate.getTime();
         }
         this.serviceprovider=outpatientRegistration.getServiceprovider();
         this.ifObserve=outpatientRegistration.getIfObserve();
         this.ifRescue=outpatientRegistration.getIfRescue();
         this.chief=outpatientRegistration.getChief();
         this.illness=outpatientRegistration.getIllness();
         this.history=outpatientRegistration.getHistory();
         this.perHistory=outpatientRegistration.getPerHistory();
         this.marHistory=outpatientRegistration.getMarHistory();
         this.childHistory=outpatientRegistration.getChildHistory();
         this.famHistory=outpatientRegistration.getFamHistory();
         this.phyCheckup=outpatientRegistration.getPhyCheckup();
         this.management=outpatientRegistration.getManagement();
         this.isLocalMark=outpatientRegistration.getIsLocalMark();
         this.newlyMark=outpatientRegistration.getNewlyMark();
         this.referralMark=outpatientRegistration.getReferralMark();
         this.generalHealthMark=outpatientRegistration.getGeneralHealthMark();
         this.pastDisHis=outpatientRegistration.getPastDisHis();
         this.inpatChronicMark=outpatientRegistration.getInpatChronicMark();
         this.inpatInfectMark=outpatientRegistration.getInpatInfectMark();
         this.infectHistory=outpatientRegistration.getInfectHistory();
         this.inpatTraumaMark=outpatientRegistration.getInpatTraumaMark();
         this.traumaHis=outpatientRegistration.getTraumaHis();
         this.disHis=outpatientRegistration.getDisHis();
         this.inpatVaccinationMark=outpatientRegistration.getInpatVaccinationMark();
         this.vaccHis=outpatientRegistration.getVaccHis();
         this.inpatOpMark=outpatientRegistration.getInpatOpMark();
         this.opHis=outpatientRegistration.getOpHis();
         this.inpatTransfusionMark=outpatientRegistration.getInpatTransfusionMark();
         this.transfusionHis=outpatientRegistration.getTransfusionHis();
         this.inpatAlleMark=outpatientRegistration.getInpatAlleMark();
         this.alleHis=outpatientRegistration.getAlleHis();
         this.mensesHis=outpatientRegistration.getMensesHis();
         this.bodyTemperature=outpatientRegistration.getBodyTemperature();
         this.prFreq=outpatientRegistration.getPrFreq();
         this.breatheFreq=outpatientRegistration.getBreatheFreq();
         this.sbp=outpatientRegistration.getSbp();
         this.dbp=outpatientRegistration.getDbp();
         this.bodyHeight=outpatientRegistration.getBodyHeight();
         this.bodyWeight=outpatientRegistration.getBodyWeight();
         this.generalSituExamResult=outpatientRegistration.getGeneralSituExamResult();
         this.skin=outpatientRegistration.getSkin();
         this.ln=outpatientRegistration.getLn();
         this.head=outpatientRegistration.getHead();
         this.neck=outpatientRegistration.getNeck();
         this.chest=outpatientRegistration.getChest();
         this.lungDiag=outpatientRegistration.getLungDiag();
         this.belly=outpatientRegistration.getBelly();
         this.dreResultDescr=outpatientRegistration.getDreResultDescr();
         this.anusPudendum=outpatientRegistration.getAnusPudendum();
         this.spine=outpatientRegistration.getSpine();
         this.limbs=outpatientRegistration.getLimbs();
         this.mental=outpatientRegistration.getMental();
         this.respiratorySys=outpatientRegistration.getRespiratorySys();
         this.circulationSys=outpatientRegistration.getCirculationSys();
         this.digestiveSys=outpatientRegistration.getDigestiveSys();
         this.urinarySys=outpatientRegistration.getUrinarySys();
         this.hemopoieticSys=outpatientRegistration.getHemopoieticSys();
         this.endocrineMetabolism=outpatientRegistration.getEndocrineMetabolism();
         this.musculoskeletalSys=outpatientRegistration.getMusculoskeletalSys();
         this.ac=outpatientRegistration.getAc();
         this.specialistChecks=outpatientRegistration.getSpecialistChecks();
         this.therapeuticPrinciples=outpatientRegistration.getTherapeuticPrinciples();
         this.dialectProof=outpatientRegistration.getDialectProof();
         this.cnFourResult=outpatientRegistration.getCnFourResult();
         this.otherMedicalTreatment=outpatientRegistration.getOtherMedicalTreatment();
         this.healthProblemEval=outpatientRegistration.getHealthProblemEval();
         this.healthServiceDemand=outpatientRegistration.getHealthServiceDemand();
         this.consultQuestion=outpatientRegistration.getConsultQuestion();
         this.outCode=outpatientRegistration.getOutCode();
         this.errorMessage=outpatientRegistration.getErrorMessage();
         this.errorDetail=outpatientRegistration.getErrorDetail();      
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
      public String  getReceiveEmployeeId(){
       		return this.receiveEmployeeId;
      }    
      public Long  getReceiveAutographDate(){
       		return this.receiveAutographDate;
      }    
      public String  getRegisterId(){
       		return this.registerId;
      }    
      public Long  getReceiveDate(){
       		return this.receiveDate;
      }    
      public String  getServiceprovider(){
       		return this.serviceprovider;
      }    
      public Boolean  getIfObserve(){
       		return this.ifObserve;
      }    
      public Boolean  getIfRescue(){
       		return this.ifRescue;
      }    
      public String  getChief(){
       		return this.chief;
      }    
      public String  getIllness(){
       		return this.illness;
      }    
      public String  getHistory(){
       		return this.history;
      }    
      public String  getPerHistory(){
       		return this.perHistory;
      }    
      public String  getMarHistory(){
       		return this.marHistory;
      }    
      public String  getChildHistory(){
       		return this.childHistory;
      }    
      public String  getFamHistory(){
       		return this.famHistory;
      }    
      public String  getPhyCheckup(){
       		return this.phyCheckup;
      }    
      public String  getManagement(){
       		return this.management;
      }    
      public Boolean  getIsLocalMark(){
       		return this.isLocalMark;
      }    
      public String  getNewlyMark(){
       		return this.newlyMark;
      }    
      public Boolean  getReferralMark(){
       		return this.referralMark;
      }    
      public String  getGeneralHealthMark(){
       		return this.generalHealthMark;
      }    
      public String  getPastDisHis(){
       		return this.pastDisHis;
      }    
      public String  getInpatChronicMark(){
       		return this.inpatChronicMark;
      }    
      public String  getInpatInfectMark(){
       		return this.inpatInfectMark;
      }    
      public String  getInfectHistory(){
       		return this.infectHistory;
      }    
      public String  getInpatTraumaMark(){
       		return this.inpatTraumaMark;
      }    
      public String  getTraumaHis(){
       		return this.traumaHis;
      }    
      public String  getDisHis(){
       		return this.disHis;
      }    
      public String  getInpatVaccinationMark(){
       		return this.inpatVaccinationMark;
      }    
      public String  getVaccHis(){
       		return this.vaccHis;
      }    
      public String  getInpatOpMark(){
       		return this.inpatOpMark;
      }    
      public String  getOpHis(){
       		return this.opHis;
      }    
      public String  getInpatTransfusionMark(){
       		return this.inpatTransfusionMark;
      }    
      public String  getTransfusionHis(){
       		return this.transfusionHis;
      }    
      public String  getInpatAlleMark(){
       		return this.inpatAlleMark;
      }    
      public String  getAlleHis(){
       		return this.alleHis;
      }    
      public String  getMensesHis(){
       		return this.mensesHis;
      }    
      public Float  getBodyTemperature(){
       		return this.bodyTemperature;
      }    
      public Integer  getPrFreq(){
       		return this.prFreq;
      }    
      public Integer  getBreatheFreq(){
       		return this.breatheFreq;
      }    
      public Integer  getSbp(){
       		return this.sbp;
      }    
      public Integer  getDbp(){
       		return this.dbp;
      }    
      public Float  getBodyHeight(){
       		return this.bodyHeight;
      }    
      public Float  getBodyWeight(){
       		return this.bodyWeight;
      }    
      public String  getGeneralSituExamResult(){
       		return this.generalSituExamResult;
      }    
      public String  getSkin(){
       		return this.skin;
      }    
      public String  getLn(){
       		return this.ln;
      }    
      public String  getHead(){
       		return this.head;
      }    
      public String  getNeck(){
       		return this.neck;
      }    
      public String  getChest(){
       		return this.chest;
      }    
      public String  getLungDiag(){
       		return this.lungDiag;
      }    
      public String  getBelly(){
       		return this.belly;
      }    
      public String  getDreResultDescr(){
       		return this.dreResultDescr;
      }    
      public String  getAnusPudendum(){
       		return this.anusPudendum;
      }    
      public String  getSpine(){
       		return this.spine;
      }    
      public String  getLimbs(){
       		return this.limbs;
      }    
      public String  getMental(){
       		return this.mental;
      }    
      public String  getRespiratorySys(){
       		return this.respiratorySys;
      }    
      public String  getCirculationSys(){
       		return this.circulationSys;
      }    
      public String  getDigestiveSys(){
       		return this.digestiveSys;
      }    
      public String  getUrinarySys(){
       		return this.urinarySys;
      }    
      public String  getHemopoieticSys(){
       		return this.hemopoieticSys;
      }    
      public String  getEndocrineMetabolism(){
       		return this.endocrineMetabolism;
      }    
      public String  getMusculoskeletalSys(){
       		return this.musculoskeletalSys;
      }    
      public Float  getAc(){
       		return this.ac;
      }    
      public String  getSpecialistChecks(){
       		return this.specialistChecks;
      }    
      public String  getTherapeuticPrinciples(){
       		return this.therapeuticPrinciples;
      }    
      public String  getDialectProof(){
       		return this.dialectProof;
      }    
      public String  getCnFourResult(){
       		return this.cnFourResult;
      }    
      public String  getOtherMedicalTreatment(){
       		return this.otherMedicalTreatment;
      }    
      public String  getHealthProblemEval(){
       		return this.healthProblemEval;
      }    
      public String  getHealthServiceDemand(){
       		return this.healthServiceDemand;
      }    
      public String  getConsultQuestion(){
       		return this.consultQuestion;
      }    
      public String  getOutCode(){
       		return this.outCode;
      }    
	  public String getErrorMessage() {
	        return errorMessage;
	  }
	  public String getErrorDetail() {
	        return errorDetail;
	  }  
}