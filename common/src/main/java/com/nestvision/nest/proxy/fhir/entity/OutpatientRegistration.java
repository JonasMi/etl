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
@Table(name = BaseEntity.TABLE_PREFIX + "OUTPATIENT_REGISTRATION")
public class OutpatientRegistration extends FhirResourceEntity {

    /**
     *名称:院内门诊流水号
     *备注:本次门诊就诊在院内系统中的唯一标识
 	 *
 	 *主键字段
     */
     @Column(name="OUTPATIENT_REGISTRATION_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="OUTPATIENT_REGISTRATION_ID",displayName="院内门诊流水号",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String outpatientRegistrationId;
    /**
     *名称:患者id
     *备注:引用患者信息表T_PATIENT院内患者id
 	 *
 	 *
     */
     @Column(name="PATIENT_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="PATIENT_ID",displayName="患者id",maxLength=40,required=true,valuesRange="")   
     private String patientId;
    /**
     *名称:患者姓名
     *
 	 *
 	 *
     */
     @Column(name="PATIENT_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="PATIENT_NAME",displayName="患者姓名",maxLength=40,required=true,valuesRange="")   
     private String patientName;
    /**
     *名称:接诊医生id
     *备注:引用医务人员信息表T_EMPLOYEE院内人员id
 	 *
 	 *
     */
     @Column(name="RECEIVE_EMPLOYEE_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="RECEIVE_EMPLOYEE_ID",displayName="接诊医生id",maxLength=40,required=false,valuesRange="")   
     private String receiveEmployeeId;
    /**
     *名称:接诊医师签名日期
     *
 	 *
 	 *
     */
     @Column(name="RECEIVE_AUTOGRAPH_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="RECEIVE_AUTOGRAPH_DATE",displayName="接诊医师签名日期",required=false,valuesRange="")   
     private Date receiveAutographDate;
    /**
     *名称:挂号id
     *备注:引用门诊挂号表T_APPOINTMENT挂号号
 	 *
 	 *
     */
     @Column(name="REGISTER_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="REGISTER_ID",displayName="挂号id",maxLength=40,required=true,valuesRange="")   
     private String registerId;
    /**
     *名称:接诊时间
     *
 	 *
 	 *
     */
     @Column(name="RECEIVE_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="RECEIVE_DATE",displayName="接诊时间",required=false,valuesRange="")   
     private Date receiveDate;
    /**
     *名称:接诊科室
     *备注:引用科室信息表T_DEPARTMENT院内科室id
 	 *
 	 *
     */
     @Column(name="SERVICEPROVIDER",length = 40,nullable = false)
     @FhirFieldValidate(name="SERVICEPROVIDER",displayName="接诊科室",maxLength=40,required=true,valuesRange="")   
     private String serviceprovider;
    /**
     *名称:是否留观标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_OBSERVE",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_OBSERVE",displayName="是否留观标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifObserve;
    /**
     *名称:是否抢救标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_RESCUE",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_RESCUE",displayName="是否抢救标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifRescue;
    /**
     *名称:主诉
     *
 	 *
 	 *
     */
     @Column(name="CHIEF",columnDefinition="text")
     @FhirFieldValidate(name="CHIEF",displayName="主诉",required=false,valuesRange="")   
     private String chief;
    /**
     *名称:现病史
     *
 	 *
 	 *
     */
     @Column(name="ILLNESS",columnDefinition="text")
     @FhirFieldValidate(name="ILLNESS",displayName="现病史",required=false,valuesRange="")   
     private String illness;
    /**
     *名称:既往史
     *
 	 *
 	 *
     */
     @Column(name="HISTORY",columnDefinition="text")
     @FhirFieldValidate(name="HISTORY",displayName="既往史",required=false,valuesRange="")   
     private String history;
    /**
     *名称:个人史
     *
 	 *
 	 *
     */
     @Column(name="PER_HISTORY",columnDefinition="text")
     @FhirFieldValidate(name="PER_HISTORY",displayName="个人史",required=false,valuesRange="")   
     private String perHistory;
    /**
     *名称:婚姻史
     *
 	 *
 	 *
     */
     @Column(name="MAR_HISTORY",columnDefinition="text")
     @FhirFieldValidate(name="MAR_HISTORY",displayName="婚姻史",required=false,valuesRange="")   
     private String marHistory;
    /**
     *名称:生育史
     *
 	 *
 	 *
     */
     @Column(name="CHILD_HISTORY",columnDefinition="text")
     @FhirFieldValidate(name="CHILD_HISTORY",displayName="生育史",required=false,valuesRange="")   
     private String childHistory;
    /**
     *名称:家族史
     *
 	 *
 	 *
     */
     @Column(name="FAM_HISTORY",columnDefinition="text")
     @FhirFieldValidate(name="FAM_HISTORY",displayName="家族史",required=false,valuesRange="")   
     private String famHistory;
    /**
     *名称:体格检查
     *
 	 *
 	 *
     */
     @Column(name="PHY_CHECKUP",columnDefinition="text")
     @FhirFieldValidate(name="PHY_CHECKUP",displayName="体格检查",required=false,valuesRange="")   
     private String phyCheckup;
    /**
     *名称:处置
     *
 	 *
 	 *
     */
     @Column(name="MANAGEMENT",columnDefinition="text")
     @FhirFieldValidate(name="MANAGEMENT",displayName="处置",required=false,valuesRange="")   
     private String management;
    /**
     *名称:是否本地标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IS_LOCAL_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="IS_LOCAL_MARK",displayName="是否本地标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean isLocalMark;
    /**
     *名称:初诊标志代码
     *
 	 *限制:CV9900267
 	 *
     */
     @Column(name="NEWLY_MARK",length = 20,nullable = false)
     @FhirFieldValidate(name="NEWLY_MARK",displayName="初诊标志代码",maxLength=20,required=true,valuesRange="CV9900267")   
     private String newlyMark;
    /**
     *名称:是否转诊标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="REFERRAL_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="REFERRAL_MARK",displayName="是否转诊标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean referralMark;
    /**
     *名称:患者既往健康状况代码
     *
 	 *限制:GBT22613
 	 *
     */
     @Column(name="GENERAL_HEALTH_MARK",length = 20,nullable = true)
     @FhirFieldValidate(name="GENERAL_HEALTH_MARK",displayName="患者既往健康状况代码",maxLength=20,required=false,valuesRange="GBT22613")   
     private String generalHealthMark;
    /**
     *名称:既往健康状况及重要相关病史的描述
     *
 	 *
 	 *
     */
     @Column(name="PAST_DIS_HIS",columnDefinition="text")
     @FhirFieldValidate(name="PAST_DIS_HIS",displayName="既往健康状况及重要相关病史的描述",required=false,valuesRange="")   
     private String pastDisHis;
    /**
     *名称:患者有无慢性病史
     *
 	 *限制:CV9900024
 	 *
     */
     @Column(name="INPAT_CHRONIC_MARK",length = 20,nullable = true)
     @FhirFieldValidate(name="INPAT_CHRONIC_MARK",displayName="患者有无慢性病史",maxLength=20,required=false,valuesRange="CV9900024")   
     private String inpatChronicMark;
    /**
     *名称:患者有无传染病史
     *
 	 *限制:CV9900024
 	 *
     */
     @Column(name="INPAT_INFECT_MARK",length = 20,nullable = true)
     @FhirFieldValidate(name="INPAT_INFECT_MARK",displayName="患者有无传染病史",maxLength=20,required=false,valuesRange="CV9900024")   
     private String inpatInfectMark;
    /**
     *名称:患者既往所患各种急性或慢性传染性疾病名称
     *
 	 *
 	 *
     */
     @Column(name="INFECT_HISTORY",columnDefinition="text")
     @FhirFieldValidate(name="INFECT_HISTORY",displayName="患者既往所患各种急性或慢性传染性疾病名称",required=false,valuesRange="")   
     private String infectHistory;
    /**
     *名称:患者有无外伤史
     *
 	 *限制:CV9900024
 	 *
     */
     @Column(name="INPAT_TRAUMA_MARK",length = 20,nullable = true)
     @FhirFieldValidate(name="INPAT_TRAUMA_MARK",displayName="患者有无外伤史",maxLength=20,required=false,valuesRange="CV9900024")   
     private String inpatTraumaMark;
    /**
     *名称:对患者外伤史的描述
     *
 	 *
 	 *
     */
     @Column(name="TRAUMA_HIS",columnDefinition="text")
     @FhirFieldValidate(name="TRAUMA_HIS",displayName="对患者外伤史的描述",required=false,valuesRange="")   
     private String traumaHis;
    /**
     *名称:患者既往健康状况和疾病(含外伤) 的详细描述
     *
 	 *
 	 *
     */
     @Column(name="DIS_HIS",columnDefinition="text")
     @FhirFieldValidate(name="DIS_HIS",displayName="患者既往健康状况和疾病(含外伤) 的详细描述",required=false,valuesRange="")   
     private String disHis;
    /**
     *名称:患者有无预防接种史
     *
 	 *限制:CV9900024
 	 *
     */
     @Column(name="INPAT_VACCINATION_MARK",length = 20,nullable = true)
     @FhirFieldValidate(name="INPAT_VACCINATION_MARK",displayName="患者有无预防接种史",maxLength=20,required=false,valuesRange="CV9900024")   
     private String inpatVaccinationMark;
    /**
     *名称:患者预防接种情况的详细描述
     *
 	 *
 	 *
     */
     @Column(name="VACC_HIS",columnDefinition="text")
     @FhirFieldValidate(name="VACC_HIS",displayName="患者预防接种情况的详细描述",required=false,valuesRange="")   
     private String vaccHis;
    /**
     *名称:患者有无手术史
     *
 	 *限制:CV9900024
 	 *
     */
     @Column(name="INPAT_OP_MARK",length = 20,nullable = true)
     @FhirFieldValidate(name="INPAT_OP_MARK",displayName="患者有无手术史",maxLength=20,required=false,valuesRange="CV9900024")   
     private String inpatOpMark;
    /**
     *名称:患者既往接受手术/操作经历的详细描述
     *
 	 *
 	 *
     */
     @Column(name="OP_HIS",columnDefinition="text")
     @FhirFieldValidate(name="OP_HIS",displayName="患者既往接受手术/操作经历的详细描述",required=false,valuesRange="")   
     private String opHis;
    /**
     *名称:患者有无输血史
     *
 	 *限制:CV9900024
 	 *
     */
     @Column(name="INPAT_TRANSFUSION_MARK",length = 20,nullable = true)
     @FhirFieldValidate(name="INPAT_TRANSFUSION_MARK",displayName="患者有无输血史",maxLength=20,required=false,valuesRange="CV9900024")   
     private String inpatTransfusionMark;
    /**
     *名称:患者既往输血史的详细描述
     *
 	 *
 	 *
     */
     @Column(name="TRANSFUSION_HIS",columnDefinition="text")
     @FhirFieldValidate(name="TRANSFUSION_HIS",displayName="患者既往输血史的详细描述",required=false,valuesRange="")   
     private String transfusionHis;
    /**
     *名称:患者有无过敏史
     *
 	 *限制:CV9900024
 	 *
     */
     @Column(name="INPAT_ALLE_MARK",length = 20,nullable = true)
     @FhirFieldValidate(name="INPAT_ALLE_MARK",displayName="患者有无过敏史",maxLength=20,required=false,valuesRange="CV9900024")   
     private String inpatAlleMark;
    /**
     *名称:患者既往发生过敏情况的详细描述
     *
 	 *
 	 *
     */
     @Column(name="ALLE_HIS",columnDefinition="text")
     @FhirFieldValidate(name="ALLE_HIS",displayName="患者既往发生过敏情况的详细描述",required=false,valuesRange="")   
     private String alleHis;
    /**
     *名称:月经史
     *
 	 *
 	 *
     */
     @Column(name="MENSES_HIS",columnDefinition="text")
     @FhirFieldValidate(name="MENSES_HIS",displayName="月经史",required=false,valuesRange="")   
     private String mensesHis;
    /**
     *名称:体格检查：体温
     *备注:体温的测量值，计量单位为℃
 	 *
 	 *
     */
     @Column(name="BODY_TEMPERATURE",length = 8,nullable = true)
     @FhirFieldValidate(name="BODY_TEMPERATURE",displayName="体格检查：体温",maxLength=8,required=false,valuesRange="")   
     private Float bodyTemperature;
    /**
     *名称:体格检查：脉搏
     *备注:患者每分钟脉搏次数的测量值，计量单位为次/min
 	 *
 	 *
     */
     @Column(name="PR_FREQ",length = 8,nullable = true)
     @FhirFieldValidate(name="PR_FREQ",displayName="体格检查：脉搏",maxLength=8,required=false,valuesRange="")   
     private Integer prFreq;
    /**
     *名称:体格检查：呼吸
     *备注:患者每分钟呼吸次数的测量值，计量单位为次/min
 	 *
 	 *
     */
     @Column(name="BREATHE_FREQ",length = 8,nullable = true)
     @FhirFieldValidate(name="BREATHE_FREQ",displayName="体格检查：呼吸",maxLength=8,required=false,valuesRange="")   
     private Integer breatheFreq;
    /**
     *名称:体格检查：收缩压
     *备注:收缩压的测量值，计量单位为mmHg
 	 *
 	 *
     */
     @Column(name="SBP",length = 8,nullable = true)
     @FhirFieldValidate(name="SBP",displayName="体格检查：收缩压",maxLength=8,required=false,valuesRange="")   
     private Integer sbp;
    /**
     *名称:体格检查：舒张压
     *备注:舒张压的测量值，计量单位为mmHg
 	 *
 	 *
     */
     @Column(name="DBP",length = 8,nullable = true)
     @FhirFieldValidate(name="DBP",displayName="体格检查：舒张压",maxLength=8,required=false,valuesRange="")   
     private Integer dbp;
    /**
     *名称:体格检查：身高
     *备注:患者身高的测量值，计量单位为cm
 	 *
 	 *
     */
     @Column(name="BODY_HEIGHT",length = 8,nullable = true)
     @FhirFieldValidate(name="BODY_HEIGHT",displayName="体格检查：身高",maxLength=8,required=false,valuesRange="")   
     private Float bodyHeight;
    /**
     *名称:体格检查：体重
     *备注:患者体重的测量值，计量单位为kg
 	 *
 	 *
     */
     @Column(name="BODY_WEIGHT",length = 8,nullable = true)
     @FhirFieldValidate(name="BODY_WEIGHT",displayName="体格检查：体重",maxLength=8,required=false,valuesRange="")   
     private Float bodyWeight;
    /**
     *名称:体格检查：一般状况
     *备注:对患者一般状况检查结果的详细描述，包括其发育状况、营养状况、体味、步态、面容与表情、意识，检查能否合作等等
 	 *
 	 *
     */
     @Column(name="GENERAL_SITU_EXAM_RESULT",columnDefinition="text")
     @FhirFieldValidate(name="GENERAL_SITU_EXAM_RESULT",displayName="体格检查：一般状况",required=false,valuesRange="")   
     private String generalSituExamResult;
    /**
     *名称:体格检查：皮肤粘膜
     *备注:对患者皮肤和黏膜检查结果的详细描述
 	 *
 	 *
     */
     @Column(name="SKIN",columnDefinition="text")
     @FhirFieldValidate(name="SKIN",displayName="体格检查：皮肤粘膜",required=false,valuesRange="")   
     private String skin;
    /**
     *名称:体格检查：淋巴结
     *备注:对患者全身浅表淋巴检查结果的详细描述
 	 *
 	 *
     */
     @Column(name="LN",columnDefinition="text")
     @FhirFieldValidate(name="LN",displayName="体格检查：淋巴结",required=false,valuesRange="")   
     private String ln;
    /**
     *名称:体格检查：头部
     *备注:对患者头部及其器官检查结果的详细描述
 	 *
 	 *
     */
     @Column(name="HEAD",columnDefinition="text")
     @FhirFieldValidate(name="HEAD",displayName="体格检查：头部",required=false,valuesRange="")   
     private String head;
    /**
     *名称:体格检查：颈部
     *备注:对患者颈部检查结果的详细描述
 	 *
 	 *
     */
     @Column(name="NECK",columnDefinition="text")
     @FhirFieldValidate(name="NECK",displayName="体格检查：颈部",required=false,valuesRange="")   
     private String neck;
    /**
     *名称:体格检查：胸部
     *备注:对患者胸部(胸廊、肺部、心脏、血管)检查结果的详细描述，包括视触叩听的检查结呆
 	 *
 	 *
     */
     @Column(name="CHEST",columnDefinition="text")
     @FhirFieldValidate(name="CHEST",displayName="体格检查：胸部",required=false,valuesRange="")   
     private String chest;
    /**
     *名称:体格检查：肺
     *备注:患者肺部诊断结果的详细描述
 	 *
 	 *
     */
     @Column(name="LUNG_DIAG",columnDefinition="text")
     @FhirFieldValidate(name="LUNG_DIAG",displayName="体格检查：肺",required=false,valuesRange="")   
     private String lungDiag;
    /**
     *名称:体格检查：腹部
     *备注:对患者腹部(肝脾等)检查结果的详细描述，包括视触叩听的检查结果
 	 *
 	 *
     */
     @Column(name="BELLY",columnDefinition="text")
     @FhirFieldValidate(name="BELLY",displayName="体格检查：腹部",required=false,valuesRange="")   
     private String belly;
    /**
     *名称:体格检查：肛门直肠
     *备注:对患者肛门指诊检查结果的详细描述
 	 *
 	 *
     */
     @Column(name="DRE_RESULT_DESCR",columnDefinition="text")
     @FhirFieldValidate(name="DRE_RESULT_DESCR",displayName="体格检查：肛门直肠",required=false,valuesRange="")   
     private String dreResultDescr;
    /**
     *名称:体格检查：生殖器
     *备注:对患者外生殖器检查结果的详细描述
 	 *
 	 *
     */
     @Column(name="ANUS_PUDENDUM",columnDefinition="text")
     @FhirFieldValidate(name="ANUS_PUDENDUM",displayName="体格检查：生殖器",required=false,valuesRange="")   
     private String anusPudendum;
    /**
     *名称:-体格检查：脊椎
     *备注:对患者脊柱检查结果的详细描述
 	 *
 	 *
     */
     @Column(name="SPINE",columnDefinition="text")
     @FhirFieldValidate(name="SPINE",displayName="-体格检查：脊椎",required=false,valuesRange="")   
     private String spine;
    /**
     *名称:体格检查：四肢
     *备注:对患者四肢检查结果的详细描述
 	 *
 	 *
     */
     @Column(name="LIMBS",columnDefinition="text")
     @FhirFieldValidate(name="LIMBS",displayName="体格检查：四肢",required=false,valuesRange="")   
     private String limbs;
    /**
     *名称:体格检查：神经系统
     *备注:对患者神经系统检查结果的详细描述
 	 *
 	 *
     */
     @Column(name="MENTAL",columnDefinition="text")
     @FhirFieldValidate(name="MENTAL",displayName="体格检查：神经系统",required=false,valuesRange="")   
     private String mental;
    /**
     *名称:体格检查：呼吸系统
     *备注:对患者呼吸系统疾病的描述，如有无症状，有无呼吸系统慢性疾病
 	 *
 	 *
     */
     @Column(name="RESPIRATORY_SYS",columnDefinition="text")
     @FhirFieldValidate(name="RESPIRATORY_SYS",displayName="体格检查：呼吸系统",required=false,valuesRange="")   
     private String respiratorySys;
    /**
     *名称:体格检查：循环系统
     *备注:对患者循环系统疾病的描述，如有无症状，有无病史
 	 *
 	 *
     */
     @Column(name="CIRCULATION_SYS",columnDefinition="text")
     @FhirFieldValidate(name="CIRCULATION_SYS",displayName="体格检查：循环系统",required=false,valuesRange="")   
     private String circulationSys;
    /**
     *名称:体格检查：消化系统
     *备注:对患者消化系统疾病的描述，如有无症状，有无病史
 	 *
 	 *
     */
     @Column(name="DIGESTIVE_SYS",columnDefinition="text")
     @FhirFieldValidate(name="DIGESTIVE_SYS",displayName="体格检查：消化系统",required=false,valuesRange="")   
     private String digestiveSys;
    /**
     *名称:体格检查：泌尿系统
     *备注:对患者泌尿系统疾病的描述，如有无症状，有无泌尿系统疾病
 	 *
 	 *
     */
     @Column(name="URINARY_SYS",columnDefinition="text")
     @FhirFieldValidate(name="URINARY_SYS",displayName="体格检查：泌尿系统",required=false,valuesRange="")   
     private String urinarySys;
    /**
     *名称:体格检查：造血系统
     *备注:对患者造血系统疾病的描述，如有无症状，有无病史
 	 *
 	 *
     */
     @Column(name="HEMOPOIETIC_SYS",columnDefinition="text")
     @FhirFieldValidate(name="HEMOPOIETIC_SYS",displayName="体格检查：造血系统",required=false,valuesRange="")   
     private String hemopoieticSys;
    /**
     *名称:体格检查：内分泌及代谢
     *备注:对患者内分泌及代谢疾病的描述，如有无症状，有无内分泌疾病
 	 *
 	 *
     */
     @Column(name="ENDOCRINE_METABOLISM",columnDefinition="text")
     @FhirFieldValidate(name="ENDOCRINE_METABOLISM",displayName="体格检查：内分泌及代谢",required=false,valuesRange="")   
     private String endocrineMetabolism;
    /**
     *名称:体格检查：肌肉骨骼系统
     *备注:对患者肌肉骨骼系统疾病的描述，如有无症状，有无肌肉骨骼疾病
 	 *
 	 *
     */
     @Column(name="MUSCULOSKELETAL_SYS",columnDefinition="text")
     @FhirFieldValidate(name="MUSCULOSKELETAL_SYS",displayName="体格检查：肌肉骨骼系统",required=false,valuesRange="")   
     private String musculoskeletalSys;
    /**
     *名称:患者腹部周长的测量值
     *备注:计量单位为cm
 	 *
 	 *
     */
     @Column(name="AC",length = 8,nullable = true)
     @FhirFieldValidate(name="AC",displayName="患者腹部周长的测量值",maxLength=8,required=false,valuesRange="")   
     private Float ac;
    /**
     *名称:专科情况检查
     *
 	 *
 	 *
     */
     @Column(name="SPECIALIST_CHECKS",columnDefinition="text")
     @FhirFieldValidate(name="SPECIALIST_CHECKS",displayName="专科情况检查",required=false,valuesRange="")   
     private String specialistChecks;
    /**
     *名称:治则治法
     *备注:根据辨证结果采用的治则治法名称术语
 	 *
 	 *
     */
     @Column(name="THERAPEUTIC_PRINCIPLES",columnDefinition="text")
     @FhirFieldValidate(name="THERAPEUTIC_PRINCIPLES",displayName="治则治法",required=false,valuesRange="")   
     private String therapeuticPrinciples;
    /**
     *名称:辨证依据
     *备注:中医证候辨证分型主要依据的详细描述
 	 *
 	 *
     */
     @Column(name="DIALECT_PROOF",columnDefinition="text")
     @FhirFieldValidate(name="DIALECT_PROOF",displayName="辨证依据",required=false,valuesRange="")   
     private String dialectProof;
    /**
     *名称:中医"四诊"观察结果
     *备注:中医四诊观察结果的详细描述，包括望、闻、问、切四诊内容
 	 *
 	 *
     */
     @Column(name="CN_FOUR_RESULT",columnDefinition="text")
     @FhirFieldValidate(name="CN_FOUR_RESULT",displayName="中医&quot;四诊&quot;观察结果",required=false,valuesRange="")   
     private String cnFourResult;
    /**
     *名称:其他医学处置
     *备注:临床医师对患者实施的除检查/检验、用药、手术/操作以外的医学处置的描述
 	 *
 	 *
     */
     @Column(name="OTHER_MEDICAL_TREATMENT",columnDefinition="text")
     @FhirFieldValidate(name="OTHER_MEDICAL_TREATMENT",displayName="其他医学处置",required=false,valuesRange="")   
     private String otherMedicalTreatment;
    /**
     *名称:健康问题评估
     *备注:根据患者疾病临床表现、实验室检查结果等作出的健康问题评估结果的详细描述
 	 *
 	 *
     */
     @Column(name="HEALTH_PROBLEM_EVAL",columnDefinition="text")
     @FhirFieldValidate(name="HEALTH_PROBLEM_EVAL",displayName="健康问题评估",required=false,valuesRange="")   
     private String healthProblemEval;
    /**
     *名称:卫生服务要求
     *备注:患者就诊时对本人所患疾病提出的卫生服务要求的详细描述
 	 *
 	 *
     */
     @Column(name="HEALTH_SERVICE_DEMAND",columnDefinition="text")
     @FhirFieldValidate(name="HEALTH_SERVICE_DEMAND",displayName="卫生服务要求",required=false,valuesRange="")   
     private String healthServiceDemand;
    /**
     *名称:咨询问题
     *备注:对个体所患疾病提出的咨询问题的详细描述
 	 *
 	 *
     */
     @Column(name="CONSULT_QUESTION",columnDefinition="text")
     @FhirFieldValidate(name="CONSULT_QUESTION",displayName="咨询问题",required=false,valuesRange="")   
     private String consultQuestion;
    /**
     *名称:患者去向代码
     *
 	 *限制:CV9900291
 	 *
     */
     @Column(name="OUT_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="OUT_CODE",displayName="患者去向代码",maxLength=20,required=false,valuesRange="CV9900291")   
     private String outCode;
    
     public String getOutpatientRegistrationId(){
       	return this.outpatientRegistrationId;
     }
     public void setOutpatientRegistrationId(String outpatientRegistrationId){
       	this.outpatientRegistrationId=outpatientRegistrationId;
     }
     public String getPatientId(){
       	return this.patientId;
     }
     public void setPatientId(String patientId){
       	this.patientId=patientId;
     }
     public String getPatientName(){
       	return this.patientName;
     }
     public void setPatientName(String patientName){
       	this.patientName=patientName;
     }
     public String getReceiveEmployeeId(){
       	return this.receiveEmployeeId;
     }
     public void setReceiveEmployeeId(String receiveEmployeeId){
       	this.receiveEmployeeId=receiveEmployeeId;
     }
     public Date getReceiveAutographDate(){
       	return this.receiveAutographDate;
     }
     public void setReceiveAutographDate(Date receiveAutographDate){
       	this.receiveAutographDate=receiveAutographDate;
     }
     public String getRegisterId(){
       	return this.registerId;
     }
     public void setRegisterId(String registerId){
       	this.registerId=registerId;
     }
     public Date getReceiveDate(){
       	return this.receiveDate;
     }
     public void setReceiveDate(Date receiveDate){
       	this.receiveDate=receiveDate;
     }
     public String getServiceprovider(){
       	return this.serviceprovider;
     }
     public void setServiceprovider(String serviceprovider){
       	this.serviceprovider=serviceprovider;
     }
     public Boolean getIfObserve(){
       	return this.ifObserve;
     }
     public void setIfObserve(Boolean ifObserve){
       	this.ifObserve=ifObserve;
     }
     public Boolean getIfRescue(){
       	return this.ifRescue;
     }
     public void setIfRescue(Boolean ifRescue){
       	this.ifRescue=ifRescue;
     }
     public String getChief(){
       	return this.chief;
     }
     public void setChief(String chief){
       	this.chief=chief;
     }
     public String getIllness(){
       	return this.illness;
     }
     public void setIllness(String illness){
       	this.illness=illness;
     }
     public String getHistory(){
       	return this.history;
     }
     public void setHistory(String history){
       	this.history=history;
     }
     public String getPerHistory(){
       	return this.perHistory;
     }
     public void setPerHistory(String perHistory){
       	this.perHistory=perHistory;
     }
     public String getMarHistory(){
       	return this.marHistory;
     }
     public void setMarHistory(String marHistory){
       	this.marHistory=marHistory;
     }
     public String getChildHistory(){
       	return this.childHistory;
     }
     public void setChildHistory(String childHistory){
       	this.childHistory=childHistory;
     }
     public String getFamHistory(){
       	return this.famHistory;
     }
     public void setFamHistory(String famHistory){
       	this.famHistory=famHistory;
     }
     public String getPhyCheckup(){
       	return this.phyCheckup;
     }
     public void setPhyCheckup(String phyCheckup){
       	this.phyCheckup=phyCheckup;
     }
     public String getManagement(){
       	return this.management;
     }
     public void setManagement(String management){
       	this.management=management;
     }
     public Boolean getIsLocalMark(){
       	return this.isLocalMark;
     }
     public void setIsLocalMark(Boolean isLocalMark){
       	this.isLocalMark=isLocalMark;
     }
     public String getNewlyMark(){
       	return this.newlyMark;
     }
     public void setNewlyMark(String newlyMark){
       	this.newlyMark=newlyMark;
     }
     public Boolean getReferralMark(){
       	return this.referralMark;
     }
     public void setReferralMark(Boolean referralMark){
       	this.referralMark=referralMark;
     }
     public String getGeneralHealthMark(){
       	return this.generalHealthMark;
     }
     public void setGeneralHealthMark(String generalHealthMark){
       	this.generalHealthMark=generalHealthMark;
     }
     public String getPastDisHis(){
       	return this.pastDisHis;
     }
     public void setPastDisHis(String pastDisHis){
       	this.pastDisHis=pastDisHis;
     }
     public String getInpatChronicMark(){
       	return this.inpatChronicMark;
     }
     public void setInpatChronicMark(String inpatChronicMark){
       	this.inpatChronicMark=inpatChronicMark;
     }
     public String getInpatInfectMark(){
       	return this.inpatInfectMark;
     }
     public void setInpatInfectMark(String inpatInfectMark){
       	this.inpatInfectMark=inpatInfectMark;
     }
     public String getInfectHistory(){
       	return this.infectHistory;
     }
     public void setInfectHistory(String infectHistory){
       	this.infectHistory=infectHistory;
     }
     public String getInpatTraumaMark(){
       	return this.inpatTraumaMark;
     }
     public void setInpatTraumaMark(String inpatTraumaMark){
       	this.inpatTraumaMark=inpatTraumaMark;
     }
     public String getTraumaHis(){
       	return this.traumaHis;
     }
     public void setTraumaHis(String traumaHis){
       	this.traumaHis=traumaHis;
     }
     public String getDisHis(){
       	return this.disHis;
     }
     public void setDisHis(String disHis){
       	this.disHis=disHis;
     }
     public String getInpatVaccinationMark(){
       	return this.inpatVaccinationMark;
     }
     public void setInpatVaccinationMark(String inpatVaccinationMark){
       	this.inpatVaccinationMark=inpatVaccinationMark;
     }
     public String getVaccHis(){
       	return this.vaccHis;
     }
     public void setVaccHis(String vaccHis){
       	this.vaccHis=vaccHis;
     }
     public String getInpatOpMark(){
       	return this.inpatOpMark;
     }
     public void setInpatOpMark(String inpatOpMark){
       	this.inpatOpMark=inpatOpMark;
     }
     public String getOpHis(){
       	return this.opHis;
     }
     public void setOpHis(String opHis){
       	this.opHis=opHis;
     }
     public String getInpatTransfusionMark(){
       	return this.inpatTransfusionMark;
     }
     public void setInpatTransfusionMark(String inpatTransfusionMark){
       	this.inpatTransfusionMark=inpatTransfusionMark;
     }
     public String getTransfusionHis(){
       	return this.transfusionHis;
     }
     public void setTransfusionHis(String transfusionHis){
       	this.transfusionHis=transfusionHis;
     }
     public String getInpatAlleMark(){
       	return this.inpatAlleMark;
     }
     public void setInpatAlleMark(String inpatAlleMark){
       	this.inpatAlleMark=inpatAlleMark;
     }
     public String getAlleHis(){
       	return this.alleHis;
     }
     public void setAlleHis(String alleHis){
       	this.alleHis=alleHis;
     }
     public String getMensesHis(){
       	return this.mensesHis;
     }
     public void setMensesHis(String mensesHis){
       	this.mensesHis=mensesHis;
     }
     public Float getBodyTemperature(){
       	return this.bodyTemperature;
     }
     public void setBodyTemperature(Float bodyTemperature){
       	this.bodyTemperature=bodyTemperature;
     }
     public Integer getPrFreq(){
       	return this.prFreq;
     }
     public void setPrFreq(Integer prFreq){
       	this.prFreq=prFreq;
     }
     public Integer getBreatheFreq(){
       	return this.breatheFreq;
     }
     public void setBreatheFreq(Integer breatheFreq){
       	this.breatheFreq=breatheFreq;
     }
     public Integer getSbp(){
       	return this.sbp;
     }
     public void setSbp(Integer sbp){
       	this.sbp=sbp;
     }
     public Integer getDbp(){
       	return this.dbp;
     }
     public void setDbp(Integer dbp){
       	this.dbp=dbp;
     }
     public Float getBodyHeight(){
       	return this.bodyHeight;
     }
     public void setBodyHeight(Float bodyHeight){
       	this.bodyHeight=bodyHeight;
     }
     public Float getBodyWeight(){
       	return this.bodyWeight;
     }
     public void setBodyWeight(Float bodyWeight){
       	this.bodyWeight=bodyWeight;
     }
     public String getGeneralSituExamResult(){
       	return this.generalSituExamResult;
     }
     public void setGeneralSituExamResult(String generalSituExamResult){
       	this.generalSituExamResult=generalSituExamResult;
     }
     public String getSkin(){
       	return this.skin;
     }
     public void setSkin(String skin){
       	this.skin=skin;
     }
     public String getLn(){
       	return this.ln;
     }
     public void setLn(String ln){
       	this.ln=ln;
     }
     public String getHead(){
       	return this.head;
     }
     public void setHead(String head){
       	this.head=head;
     }
     public String getNeck(){
       	return this.neck;
     }
     public void setNeck(String neck){
       	this.neck=neck;
     }
     public String getChest(){
       	return this.chest;
     }
     public void setChest(String chest){
       	this.chest=chest;
     }
     public String getLungDiag(){
       	return this.lungDiag;
     }
     public void setLungDiag(String lungDiag){
       	this.lungDiag=lungDiag;
     }
     public String getBelly(){
       	return this.belly;
     }
     public void setBelly(String belly){
       	this.belly=belly;
     }
     public String getDreResultDescr(){
       	return this.dreResultDescr;
     }
     public void setDreResultDescr(String dreResultDescr){
       	this.dreResultDescr=dreResultDescr;
     }
     public String getAnusPudendum(){
       	return this.anusPudendum;
     }
     public void setAnusPudendum(String anusPudendum){
       	this.anusPudendum=anusPudendum;
     }
     public String getSpine(){
       	return this.spine;
     }
     public void setSpine(String spine){
       	this.spine=spine;
     }
     public String getLimbs(){
       	return this.limbs;
     }
     public void setLimbs(String limbs){
       	this.limbs=limbs;
     }
     public String getMental(){
       	return this.mental;
     }
     public void setMental(String mental){
       	this.mental=mental;
     }
     public String getRespiratorySys(){
       	return this.respiratorySys;
     }
     public void setRespiratorySys(String respiratorySys){
       	this.respiratorySys=respiratorySys;
     }
     public String getCirculationSys(){
       	return this.circulationSys;
     }
     public void setCirculationSys(String circulationSys){
       	this.circulationSys=circulationSys;
     }
     public String getDigestiveSys(){
       	return this.digestiveSys;
     }
     public void setDigestiveSys(String digestiveSys){
       	this.digestiveSys=digestiveSys;
     }
     public String getUrinarySys(){
       	return this.urinarySys;
     }
     public void setUrinarySys(String urinarySys){
       	this.urinarySys=urinarySys;
     }
     public String getHemopoieticSys(){
       	return this.hemopoieticSys;
     }
     public void setHemopoieticSys(String hemopoieticSys){
       	this.hemopoieticSys=hemopoieticSys;
     }
     public String getEndocrineMetabolism(){
       	return this.endocrineMetabolism;
     }
     public void setEndocrineMetabolism(String endocrineMetabolism){
       	this.endocrineMetabolism=endocrineMetabolism;
     }
     public String getMusculoskeletalSys(){
       	return this.musculoskeletalSys;
     }
     public void setMusculoskeletalSys(String musculoskeletalSys){
       	this.musculoskeletalSys=musculoskeletalSys;
     }
     public Float getAc(){
       	return this.ac;
     }
     public void setAc(Float ac){
       	this.ac=ac;
     }
     public String getSpecialistChecks(){
       	return this.specialistChecks;
     }
     public void setSpecialistChecks(String specialistChecks){
       	this.specialistChecks=specialistChecks;
     }
     public String getTherapeuticPrinciples(){
       	return this.therapeuticPrinciples;
     }
     public void setTherapeuticPrinciples(String therapeuticPrinciples){
       	this.therapeuticPrinciples=therapeuticPrinciples;
     }
     public String getDialectProof(){
       	return this.dialectProof;
     }
     public void setDialectProof(String dialectProof){
       	this.dialectProof=dialectProof;
     }
     public String getCnFourResult(){
       	return this.cnFourResult;
     }
     public void setCnFourResult(String cnFourResult){
       	this.cnFourResult=cnFourResult;
     }
     public String getOtherMedicalTreatment(){
       	return this.otherMedicalTreatment;
     }
     public void setOtherMedicalTreatment(String otherMedicalTreatment){
       	this.otherMedicalTreatment=otherMedicalTreatment;
     }
     public String getHealthProblemEval(){
       	return this.healthProblemEval;
     }
     public void setHealthProblemEval(String healthProblemEval){
       	this.healthProblemEval=healthProblemEval;
     }
     public String getHealthServiceDemand(){
       	return this.healthServiceDemand;
     }
     public void setHealthServiceDemand(String healthServiceDemand){
       	this.healthServiceDemand=healthServiceDemand;
     }
     public String getConsultQuestion(){
       	return this.consultQuestion;
     }
     public void setConsultQuestion(String consultQuestion){
       	this.consultQuestion=consultQuestion;
     }
     public String getOutCode(){
       	return this.outCode;
     }
     public void setOutCode(String outCode){
       	this.outCode=outCode;
     }
}