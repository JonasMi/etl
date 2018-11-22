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
@Table(name = BaseEntity.TABLE_PREFIX + "CESAREAN_SECTION_RECORD")
public class CesareanSectionRecord extends FhirResourceEntity {

    /**
     *名称:院内剖宫产记录id
     *
 	 *
 	 *主键字段
     */
     @Column(name="CESAREAN_SECTION_RECORD_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="CESAREAN_SECTION_RECORD_ID",displayName="院内剖宫产记录id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String cesareanSectionRecordId;
    /**
     *名称:记录日期
     *
 	 *
 	 *
     */
     @Column(name="DATE",nullable = false)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DATE",displayName="记录日期",required=true,valuesRange="")   
     private Date date;
    /**
     *名称:病案号
     *
 	 *
 	 *
     */
     @Column(name="CASE_NO",length = 40,nullable = true)
     @FhirFieldValidate(name="CASE_NO",displayName="病案号",maxLength=40,required=false,valuesRange="")   
     private String caseNo;
    /**
     *名称:住院次数
     *
 	 *
 	 *
     */
     @Column(name="INPAT_TIMES",length = 3,nullable = true)
     @FhirFieldValidate(name="INPAT_TIMES",displayName="住院次数",maxLength=3,required=false,valuesRange="")   
     private Integer inpatTimes;
    /**
     *名称:备注
     *
 	 *
 	 *
     */
     @Column(name="REMARKS",length = 200,nullable = true)
     @FhirFieldValidate(name="REMARKS",displayName="备注",maxLength=200,required=false,valuesRange="")   
     private String remarks;
    /**
     *名称:院内患者ID
     *
 	 *
 	 *
     */
     @Column(name="PATIENT_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="PATIENT_ID",displayName="院内患者ID",maxLength=40,required=false,valuesRange="")   
     private String patientId;
    /**
     *名称:身份证号
     *
 	 *
 	 *
     */
     @Column(name="ID_CARD",length = 40,nullable = true)
     @FhirFieldValidate(name="ID_CARD",displayName="身份证号",maxLength=40,required=false,valuesRange="")   
     private String idCard;
    /**
     *名称:城乡居民健康档案编号
     *
 	 *
 	 *
     */
     @Column(name="HEALTH_FILE_NUMBER",length = 40,nullable = true)
     @FhirFieldValidate(name="HEALTH_FILE_NUMBER",displayName="城乡居民健康档案编号",maxLength=40,required=false,valuesRange="")   
     private String healthFileNumber;
    /**
     *名称:健康卡号
     *
 	 *
 	 *
     */
     @Column(name="HEALTH_CARD",length = 40,nullable = true)
     @FhirFieldValidate(name="HEALTH_CARD",displayName="健康卡号",maxLength=40,required=false,valuesRange="")   
     private String healthCard;
    /**
     *名称:姓名
     *
 	 *
 	 *
     */
     @Column(name="NAME",length = 20,nullable = false)
     @FhirFieldValidate(name="NAME",displayName="姓名",maxLength=20,required=true,valuesRange="")   
     private String name;
    /**
     *名称:性别
     *
 	 *限制:GBT22611
 	 *
     */
     @Column(name="GENDER",length = 10,nullable = false)
     @FhirFieldValidate(name="GENDER",displayName="性别",maxLength=10,required=true,valuesRange="GBT22611")   
     private String gender;
    /**
     *名称:电话号码
     *
 	 *
 	 *
     */
     @Column(name="TELECOM",length = 20,nullable = true)
     @FhirFieldValidate(name="TELECOM",displayName="电话号码",maxLength=20,required=false,valuesRange="")   
     private String telecom;
    /**
     *名称:年龄
     *
 	 *
 	 *
     */
     @Column(name="AGE",length = 8,nullable = true)
     @FhirFieldValidate(name="AGE",displayName="年龄",maxLength=8,required=false,valuesRange="")   
     private Float age;
    /**
     *名称:患者类型
     *
 	 *限制:CV0900404
 	 *
     */
     @Column(name="PATIENT_TYPE",length = 20,nullable = true)
     @FhirFieldValidate(name="PATIENT_TYPE",displayName="患者类型",maxLength=20,required=false,valuesRange="CV0900404")   
     private String patientType;
    /**
     *名称:联系人关系代码
     *
 	 *限制:GBT4761
 	 *
     */
     @Column(name="RELATIONSHIP",length = 20,nullable = true)
     @FhirFieldValidate(name="RELATIONSHIP",displayName="联系人关系代码",maxLength=20,required=false,valuesRange="GBT4761")   
     private String relationship;
    /**
     *名称:联系人姓名
     *
 	 *
 	 *
     */
     @Column(name="CONTACTS_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="CONTACTS_NAME",displayName="联系人姓名",maxLength=20,required=false,valuesRange="")   
     private String contactsName;
    /**
     *名称:联系人电话号码
     *
 	 *
 	 *
     */
     @Column(name="CONTACTS_PHONE",length = 20,nullable = true)
     @FhirFieldValidate(name="CONTACTS_PHONE",displayName="联系人电话号码",maxLength=20,required=false,valuesRange="")   
     private String contactsPhone;
    /**
     *名称:文档创建者id
     *
 	 *
 	 *
     */
     @Column(name="AUTHOR_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="AUTHOR_ID",displayName="文档创建者id",maxLength=40,required=false,valuesRange="")   
     private String authorId;
    /**
     *名称:文档创建者姓名
     *
 	 *
 	 *
     */
     @Column(name="AUTHOR_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="AUTHOR_NAME",displayName="文档创建者姓名",maxLength=20,required=false,valuesRange="")   
     private String authorName;
    /**
     *名称:住院流水号
     *
 	 *
 	 *
     */
     @Column(name="INPATIENT_REGISTRATION_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="INPATIENT_REGISTRATION_ID",displayName="住院流水号",maxLength=40,required=true,valuesRange="")   
     private String inpatientRegistrationId;
    /**
     *名称:入院时间
     *
 	 *
 	 *
     */
     @Column(name="START",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="START",displayName="入院时间",required=false,valuesRange="")   
     private Date start;
    /**
     *名称:住院号
     *
 	 *
 	 *
     */
     @Column(name="INH_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="INH_ID",displayName="住院号",maxLength=40,required=false,valuesRange="")   
     private String inhId;
    /**
     *名称:就诊科室id
     *
 	 *
 	 *
     */
     @Column(name="VISITING_DEPT_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="VISITING_DEPT_ID",displayName="就诊科室id",maxLength=40,required=false,valuesRange="")   
     private String visitingDeptId;
    /**
     *名称:就诊科室名称
     *
 	 *
 	 *
     */
     @Column(name="VISITING_DEPT_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="VISITING_DEPT_NAME",displayName="就诊科室名称",maxLength=40,required=false,valuesRange="")   
     private String visitingDeptName;
    /**
     *名称:就诊科室标准编码
     *
 	 *限制:CV9900051
 	 *
     */
     @Column(name="VISITING_DEPT_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="VISITING_DEPT_CD",displayName="就诊科室标准编码",maxLength=20,required=false,valuesRange="CV9900051")   
     private String visitingDeptCd;
    /**
     *名称:病房号
     *
 	 *
 	 *
     */
     @Column(name="WARD_NO",length = 20,nullable = true)
     @FhirFieldValidate(name="WARD_NO",displayName="病房号",maxLength=20,required=false,valuesRange="")   
     private String wardNo;
    /**
     *名称:病区
     *
 	 *
 	 *
     */
     @Column(name="WARD_AREA",length = 40,nullable = true)
     @FhirFieldValidate(name="WARD_AREA",displayName="病区",maxLength=40,required=false,valuesRange="")   
     private String wardArea;
    /**
     *名称:床位号
     *
 	 *
 	 *
     */
     @Column(name="BED_NUM",length = 20,nullable = true)
     @FhirFieldValidate(name="BED_NUM",displayName="床位号",maxLength=20,required=false,valuesRange="")   
     private String bedNum;
    /**
     *名称:护婴者id
     *
 	 *
 	 *
     */
     @Column(name="PROTECT_BABY_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="PROTECT_BABY_ID",displayName="护婴者id",maxLength=40,required=false,valuesRange="")   
     private String protectBabyId;
    /**
     *名称:护婴者姓名
     *
 	 *
 	 *
     */
     @Column(name="PROTECT_BABY_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="PROTECT_BABY_NAME",displayName="护婴者姓名",maxLength=40,required=false,valuesRange="")   
     private String protectBabyName;
    /**
     *名称:护婴者签名日期
     *
 	 *
 	 *
     */
     @Column(name="PROTECT_BABY_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="PROTECT_BABY_DATE",displayName="护婴者签名日期",required=false,valuesRange="")   
     private Date protectBabyDate;
    /**
     *名称:指导者id
     *
 	 *
 	 *
     */
     @Column(name="INSTRUCTOR_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="INSTRUCTOR_ID",displayName="指导者id",maxLength=40,required=false,valuesRange="")   
     private String instructorId;
    /**
     *名称:指导者姓名
     *
 	 *
 	 *
     */
     @Column(name="INSTRUCTOR_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="INSTRUCTOR_NAME",displayName="指导者姓名",maxLength=40,required=false,valuesRange="")   
     private String instructorName;
    /**
     *名称:指导者签名日期
     *
 	 *
 	 *
     */
     @Column(name="INSTRUCTOR_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="INSTRUCTOR_DATE",displayName="指导者签名日期",required=false,valuesRange="")   
     private Date instructorDate;
    /**
     *名称:胎膜完整情况标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="AMNIOTIC_COMPLETE_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="AMNIOTIC_COMPLETE_MARK",displayName="胎膜完整情况标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean amnioticCompleteMark;
    /**
     *名称:脐带长度
     *备注:cm
 	 *
 	 *
     */
     @Column(name="CHORDA_UMBILICALIS_LENGTH",length = 8,nullable = true)
     @FhirFieldValidate(name="CHORDA_UMBILICALIS_LENGTH",displayName="脐带长度",maxLength=8,required=false,valuesRange="")   
     private Float chordaUmbilicalisLength;
    /**
     *名称:绕颈身
     *备注:周
 	 *
 	 *
     */
     @Column(name="RAOGENG_BODY",length = 8,nullable = true)
     @FhirFieldValidate(name="RAOGENG_BODY",displayName="绕颈身",maxLength=8,required=false,valuesRange="")   
     private Float raogengBody;
    /**
     *名称:产前诊断
     *
 	 *
 	 *
     */
     @Column(name="PRENATAL_DIAG_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="PRENATAL_DIAG_NAME",displayName="产前诊断",maxLength=40,required=false,valuesRange="")   
     private String prenatalDiagName;
    /**
     *名称:手术指征
     *
 	 *
 	 *
     */
     @Column(name="OPERATION_INDICATION",length = 100,nullable = true)
     @FhirFieldValidate(name="OPERATION_INDICATION",displayName="手术指征",maxLength=100,required=false,valuesRange="")   
     private String operationIndication;
    /**
     *名称:剖宫产手术过程
     *
 	 *
 	 *
     */
     @Column(name="OPERATION_DESCRIBE",length = 200,nullable = true)
     @FhirFieldValidate(name="OPERATION_DESCRIBE",displayName="剖宫产手术过程",maxLength=200,required=false,valuesRange="")   
     private String operationDescribe;
    /**
     *名称:子宫情况
     *
 	 *
 	 *
     */
     @Column(name="UTERINE_CONDITIONS",length = 200,nullable = true)
     @FhirFieldValidate(name="UTERINE_CONDITIONS",displayName="子宫情况",maxLength=200,required=false,valuesRange="")   
     private String uterineConditions;
    /**
     *名称:胎方位代码
     *
 	 *限制:CV0501007
 	 *
     */
     @Column(name="FETUS_POSITION_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="FETUS_POSITION_CD",displayName="胎方位代码",maxLength=20,required=false,valuesRange="CV0501007")   
     private String fetusPositionCd;
    /**
     *名称:胎儿娩出方式
     *
 	 *
 	 *
     */
     @Column(name="DELIVERY_BABY_METHOD",length = 100,nullable = true)
     @FhirFieldValidate(name="DELIVERY_BABY_METHOD",displayName="胎儿娩出方式",maxLength=100,required=false,valuesRange="")   
     private String deliveryBabyMethod;
    /**
     *名称:胎盘黄染
     *
 	 *
 	 *
     */
     @Column(name="PLACENTA_YELLOW",length = 100,nullable = true)
     @FhirFieldValidate(name="PLACENTA_YELLOW",displayName="胎盘黄染",maxLength=100,required=false,valuesRange="")   
     private String placentaYellow;
    /**
     *名称:胎膜黄染
     *
 	 *
 	 *
     */
     @Column(name="MEMBRANE_YELLOW",length = 100,nullable = true)
     @FhirFieldValidate(name="MEMBRANE_YELLOW",displayName="胎膜黄染",maxLength=100,required=false,valuesRange="")   
     private String membraneYellow;
    /**
     *名称:脐带缠绕情况
     *
 	 *
 	 *
     */
     @Column(name="CORD_ENTANGLEMENT_STATE",length = 200,nullable = true)
     @FhirFieldValidate(name="CORD_ENTANGLEMENT_STATE",displayName="脐带缠绕情况",maxLength=200,required=false,valuesRange="")   
     private String cordEntanglementState;
    /**
     *名称:脐带扭转（周）
     *
 	 *
 	 *
     */
     @Column(name="UMBILICAL_CORD_TORSION",length = 8,nullable = true)
     @FhirFieldValidate(name="UMBILICAL_CORD_TORSION",displayName="脐带扭转（周）",maxLength=8,required=false,valuesRange="")   
     private Float umbilicalCordTorsion;
    /**
     *名称:留存脐带血情况标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="SAVE_CORD_BLOOD_CD",length = 5,nullable = true)
     @FhirFieldValidate(name="SAVE_CORD_BLOOD_CD",displayName="留存脐带血情况标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean saveCordBloodCd;
    /**
     *名称:子宫壁缝合情况
     *
 	 *
 	 *
     */
     @Column(name="UTERINE_SUTURE_STATE",length = 200,nullable = true)
     @FhirFieldValidate(name="UTERINE_SUTURE_STATE",displayName="子宫壁缝合情况",maxLength=200,required=false,valuesRange="")   
     private String uterineSutureState;
    /**
     *名称:宫缩剂名称
     *
 	 *
 	 *
     */
     @Column(name="UTEROTONIC_NAME",length = 100,nullable = true)
     @FhirFieldValidate(name="UTEROTONIC_NAME",displayName="宫缩剂名称",maxLength=100,required=false,valuesRange="")   
     private String uterotonicName;
    /**
     *名称:宫缩剂使用方法
     *
 	 *
 	 *
     */
     @Column(name="UTEROTONIC_USE_WAY",length = 100,nullable = true)
     @FhirFieldValidate(name="UTEROTONIC_USE_WAY",displayName="宫缩剂使用方法",maxLength=100,required=false,valuesRange="")   
     private String uterotonicUseWay;
    /**
     *名称:手术用药
     *
 	 *
 	 *
     */
     @Column(name="OPERATION_DRUG",length = 100,nullable = true)
     @FhirFieldValidate(name="OPERATION_DRUG",displayName="手术用药",maxLength=100,required=false,valuesRange="")   
     private String operationDrug;
    /**
     *名称:手术用药量
     *
 	 *
 	 *
     */
     @Column(name="OPERATION_DRUG_AMOUNT",length = 100,nullable = true)
     @FhirFieldValidate(name="OPERATION_DRUG_AMOUNT",displayName="手术用药量",maxLength=100,required=false,valuesRange="")   
     private String operationDrugAmount;
    /**
     *名称:腹腔探查子宫
     *
 	 *
 	 *
     */
     @Column(name="EXPLORATION_UTERUS",length = 100,nullable = true)
     @FhirFieldValidate(name="EXPLORATION_UTERUS",displayName="腹腔探查子宫",maxLength=100,required=false,valuesRange="")   
     private String explorationUterus;
    /**
     *名称:腹腔探查附件
     *
 	 *
 	 *
     */
     @Column(name="EXPLORATION_ADNEXA",length = 100,nullable = true)
     @FhirFieldValidate(name="EXPLORATION_ADNEXA",displayName="腹腔探查附件",maxLength=100,required=false,valuesRange="")   
     private String explorationAdnexa;
    /**
     *名称:宫腔探查异常情况标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="UTEROTONIC_YC_CD",length = 5,nullable = true)
     @FhirFieldValidate(name="UTEROTONIC_YC_CD",displayName="宫腔探查异常情况标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean uterotonicYcCd;
    /**
     *名称:宫腔探查肌瘤标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="UTEROTONIC_JL_CD",length = 5,nullable = true)
     @FhirFieldValidate(name="UTEROTONIC_JL_CD",displayName="宫腔探查肌瘤标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean uterotonicJlCd;
    /**
     *名称:宫腔探查处理情况
     *
 	 *
 	 *
     */
     @Column(name="UTERINE_PROBE",length = 200,nullable = true)
     @FhirFieldValidate(name="UTERINE_PROBE",displayName="宫腔探查处理情况",maxLength=200,required=false,valuesRange="")   
     private String uterineProbe;
    /**
     *名称:手术时产妇情况
     *
 	 *
 	 *
     */
     @Column(name="OPERATION_MATERNAL_STATE",length = 200,nullable = true)
     @FhirFieldValidate(name="OPERATION_MATERNAL_STATE",displayName="手术时产妇情况",maxLength=200,required=false,valuesRange="")   
     private String operationMaternalState;
    /**
     *名称:输血成分
     *
 	 *
 	 *
     */
     @Column(name="TRANSFUSION_COMPONENT",length = 100,nullable = true)
     @FhirFieldValidate(name="TRANSFUSION_COMPONENT",displayName="输血成分",maxLength=100,required=false,valuesRange="")   
     private String transfusionComponent;
    /**
     *名称:其他用药
     *
 	 *
 	 *
     */
     @Column(name="OTHER_DRUG",length = 100,nullable = true)
     @FhirFieldValidate(name="OTHER_DRUG",displayName="其他用药",maxLength=100,required=false,valuesRange="")   
     private String otherDrug;
    /**
     *名称:其他情况
     *
 	 *
 	 *
     */
     @Column(name="OTHER_STATE",length = 100,nullable = true)
     @FhirFieldValidate(name="OTHER_STATE",displayName="其他情况",maxLength=100,required=false,valuesRange="")   
     private String otherState;
    /**
     *名称:手术全程时间（min）
     *
 	 *
 	 *
     */
     @Column(name="OPERATION_WHOLE_TIME",length = 8,nullable = true)
     @FhirFieldValidate(name="OPERATION_WHOLE_TIME",displayName="手术全程时间（min）",maxLength=8,required=false,valuesRange="")   
     private Float operationWholeTime;
    /**
     *名称:麻醉体位
     *
 	 *
 	 *
     */
     @Column(name="ANES_POSITION",length = 40,nullable = true)
     @FhirFieldValidate(name="ANES_POSITION",displayName="麻醉体位",maxLength=40,required=false,valuesRange="")   
     private String anesPosition;
    /**
     *名称:麻醉效果
     *
 	 *
 	 *
     */
     @Column(name="ANES_EFFECT",length = 40,nullable = true)
     @FhirFieldValidate(name="ANES_EFFECT",displayName="麻醉效果",maxLength=40,required=false,valuesRange="")   
     private String anesEffect;
    /**
     *名称:出血量（mL）
     *
 	 *
 	 *
     */
     @Column(name="LOSSBLOOD_AMOUNT",length = 8,nullable = true)
     @FhirFieldValidate(name="LOSSBLOOD_AMOUNT",displayName="出血量（mL）",maxLength=8,required=false,valuesRange="")   
     private Float lossbloodAmount;
    /**
     *名称:输血量
     *
 	 *
 	 *
     */
     @Column(name="TRANSFUSION_ITEM_AMOUNT",length = 8,nullable = true)
     @FhirFieldValidate(name="TRANSFUSION_ITEM_AMOUNT",displayName="输血量",maxLength=8,required=false,valuesRange="")   
     private Float transfusionItemAmount;
    /**
     *名称:输液量
     *
 	 *
 	 *
     */
     @Column(name="INFUSION_AMOUNT",length = 8,nullable = true)
     @FhirFieldValidate(name="INFUSION_AMOUNT",displayName="输液量",maxLength=8,required=false,valuesRange="")   
     private Float infusionAmount;
    /**
     *名称:供氧时间（min）
     *
 	 *
 	 *
     */
     @Column(name="OXYGEN_TIME",length = 8,nullable = true)
     @FhirFieldValidate(name="OXYGEN_TIME",displayName="供氧时间（min）",maxLength=8,required=false,valuesRange="")   
     private Float oxygenTime;
    /**
     *名称:手术单id号
     *
 	 *
 	 *
     */
     @Column(name="OPERATION_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="OPERATION_ID",displayName="手术单id号",maxLength=40,required=false,valuesRange="")   
     private String operationId;
    /**
     *名称:待产日期时间
     *
 	 *
 	 *
     */
     @Column(name="EXPECTANT_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="EXPECTANT_TIME",displayName="待产日期时间",required=false,valuesRange="")   
     private Date expectantTime;
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
     *名称:器材管理者id
     *
 	 *
 	 *
     */
     @Column(name="EQUIPMENT_MANAGER",length = 40,nullable = true)
     @FhirFieldValidate(name="EQUIPMENT_MANAGER",displayName="器材管理者id",maxLength=40,required=false,valuesRange="")   
     private String equipmentManager;
    /**
     *名称:器材管理者姓名
     *
 	 *
 	 *
     */
     @Column(name="EQUIPMENT_MANAGER_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="EQUIPMENT_MANAGER_NAME",displayName="器材管理者姓名",maxLength=40,required=false,valuesRange="")   
     private String equipmentManagerName;
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
     @Column(name="PROCEDURE_START",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="PROCEDURE_START",displayName="手术开始时间",required=false,valuesRange="")   
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
     *名称:产后诊断
     *
 	 *
 	 *
     */
     @Column(name="OP_POST_DIAG",length = 40,nullable = true)
     @FhirFieldValidate(name="OP_POST_DIAG",displayName="产后诊断",maxLength=40,required=false,valuesRange="")   
     private String opPostDiag;
    /**
     *名称:产后观察日期时间
     *
 	 *
 	 *
     */
     @Column(name="POSTPARTUM_OBS_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="POSTPARTUM_OBS_TIME",displayName="产后观察日期时间",required=false,valuesRange="")   
     private Date postpartumObsTime;
    /**
     *名称:产后检查时间（min）
     *
 	 *
 	 *
     */
     @Column(name="POSTPARTUM_EXAMINATION_TIME",length = 8,nullable = true)
     @FhirFieldValidate(name="POSTPARTUM_EXAMINATION_TIME",displayName="产后检查时间（min）",maxLength=8,required=false,valuesRange="")   
     private Float postpartumExaminationTime;
    /**
     *名称:收缩压（mmHg）
     *
 	 *
 	 *
     */
     @Column(name="SBP",length = 8,nullable = true)
     @FhirFieldValidate(name="SBP",displayName="收缩压（mmHg）",maxLength=8,required=false,valuesRange="")   
     private Float sbp;
    /**
     *名称:舒张压（mmHg）
     *
 	 *
 	 *
     */
     @Column(name="DBP",length = 8,nullable = true)
     @FhirFieldValidate(name="DBP",displayName="舒张压（mmHg）",maxLength=8,required=false,valuesRange="")   
     private Float dbp;
    /**
     *名称:脉搏（次/min）
     *
 	 *
 	 *
     */
     @Column(name="PULSES",length = 8,nullable = true)
     @FhirFieldValidate(name="PULSES",displayName="脉搏（次/min）",maxLength=8,required=false,valuesRange="")   
     private Float pulses;
    /**
     *名称:产后心率（次/min）
     *
 	 *
 	 *
     */
     @Column(name="POSTPARTUM_HEART_RATE",length = 8,nullable = true)
     @FhirFieldValidate(name="POSTPARTUM_HEART_RATE",displayName="产后心率（次/min）",maxLength=8,required=false,valuesRange="")   
     private Float postpartumHeartRate;
    /**
     *名称:产后出血量（mL）
     *
 	 *
 	 *
     */
     @Column(name="POSTPARTUM_LOSSBLOOD_AMOUNT",length = 8,nullable = true)
     @FhirFieldValidate(name="POSTPARTUM_LOSSBLOOD_AMOUNT",displayName="产后出血量（mL）",maxLength=8,required=false,valuesRange="")   
     private Float postpartumLossbloodAmount;
    /**
     *名称:产后宫缩
     *
 	 *
 	 *
     */
     @Column(name="POSTPARTUM_UC",length = 8,nullable = true)
     @FhirFieldValidate(name="POSTPARTUM_UC",displayName="产后宫缩",maxLength=8,required=false,valuesRange="")   
     private Float postpartumUc;
    /**
     *名称:产后宫底高度（cm）
     *
 	 *
 	 *
     */
     @Column(name="POSTPARTUM_FUNDUS_HEIGHT",length = 8,nullable = true)
     @FhirFieldValidate(name="POSTPARTUM_FUNDUS_HEIGHT",displayName="产后宫底高度（cm）",maxLength=8,required=false,valuesRange="")   
     private Float postpartumFundusHeight;
    /**
     *名称:性别代码
     *
 	 *限制:GBT22611
 	 *
     */
     @Column(name="GENDER_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="GENDER_CODE",displayName="性别代码",maxLength=20,required=false,valuesRange="GBT22611")   
     private String genderCode;
    /**
     *名称:新生儿出生体重（g）
     *
 	 *
 	 *
     */
     @Column(name="BIRTH_WEIGHT",length = 8,nullable = true)
     @FhirFieldValidate(name="BIRTH_WEIGHT",displayName="新生儿出生体重（g）",maxLength=8,required=false,valuesRange="")   
     private Float birthWeight;
    /**
     *名称:新生儿出生身长（cm）
     *
 	 *
 	 *
     */
     @Column(name="BIRTH_LENGTH",length = 8,nullable = true)
     @FhirFieldValidate(name="BIRTH_LENGTH",displayName="新生儿出生身长（cm）",maxLength=8,required=false,valuesRange="")   
     private Float birthLength;
    /**
     *名称:产瘤大小
     *
 	 *
 	 *
     */
     @Column(name="TUMOR_SIZE",length = 40,nullable = true)
     @FhirFieldValidate(name="TUMOR_SIZE",displayName="产瘤大小",maxLength=40,required=false,valuesRange="")   
     private String tumorSize;
    /**
     *名称:产瘤部位
     *
 	 *
 	 *
     */
     @Column(name="TUMOR_PART",length = 40,nullable = true)
     @FhirFieldValidate(name="TUMOR_PART",displayName="产瘤部位",maxLength=40,required=false,valuesRange="")   
     private String tumorPart;
    /**
     *名称:Apgar评分间隔时间代码
     *
 	 *限制:CV9900342
 	 *
     */
     @Column(name="APGAR_SCORE_INTERVAL_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="APGAR_SCORE_INTERVAL_CD",displayName="Apgar评分间隔时间代码",maxLength=20,required=false,valuesRange="CV9900342")   
     private String apgarScoreIntervalCd;
    /**
     *名称:Apgar评分值
     *
 	 *
 	 *
     */
     @Column(name="APGAR_SCORE",length = 8,nullable = true)
     @FhirFieldValidate(name="APGAR_SCORE",displayName="Apgar评分值",maxLength=8,required=false,valuesRange="")   
     private Float apgarScore;
    /**
     *名称:分娩结局代码
     *
 	 *限制:CV9900306
 	 *
     */
     @Column(name="DELIVERY_OUTCOME_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="DELIVERY_OUTCOME_CD",displayName="分娩结局代码",maxLength=20,required=false,valuesRange="CV9900306")   
     private String deliveryOutcomeCd;
    /**
     *名称:新生儿异常情况代码
     *
 	 *限制:CV9900343
 	 *
     */
     @Column(name="NEWBORN_ABNORMAL_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="NEWBORN_ABNORMAL_CD",displayName="新生儿异常情况代码",maxLength=20,required=false,valuesRange="CV9900343")   
     private String newbornAbnormalCd;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getCesareanSectionRecordId(){
       	return this.cesareanSectionRecordId;
     }
     public void setCesareanSectionRecordId(String cesareanSectionRecordId){
       	this.cesareanSectionRecordId=cesareanSectionRecordId;
     }
     public Date getDate(){
       	return this.date;
     }
     public void setDate(Date date){
       	this.date=date;
     }
     public String getCaseNo(){
       	return this.caseNo;
     }
     public void setCaseNo(String caseNo){
       	this.caseNo=caseNo;
     }
     public Integer getInpatTimes(){
       	return this.inpatTimes;
     }
     public void setInpatTimes(Integer inpatTimes){
       	this.inpatTimes=inpatTimes;
     }
     public String getRemarks(){
       	return this.remarks;
     }
     public void setRemarks(String remarks){
       	this.remarks=remarks;
     }
     public String getPatientId(){
       	return this.patientId;
     }
     public void setPatientId(String patientId){
       	this.patientId=patientId;
     }
     public String getIdCard(){
       	return this.idCard;
     }
     public void setIdCard(String idCard){
       	this.idCard=idCard;
     }
     public String getHealthFileNumber(){
       	return this.healthFileNumber;
     }
     public void setHealthFileNumber(String healthFileNumber){
       	this.healthFileNumber=healthFileNumber;
     }
     public String getHealthCard(){
       	return this.healthCard;
     }
     public void setHealthCard(String healthCard){
       	this.healthCard=healthCard;
     }
     public String getName(){
       	return this.name;
     }
     public void setName(String name){
       	this.name=name;
     }
     public String getGender(){
       	return this.gender;
     }
     public void setGender(String gender){
       	this.gender=gender;
     }
     public String getTelecom(){
       	return this.telecom;
     }
     public void setTelecom(String telecom){
       	this.telecom=telecom;
     }
     public Float getAge(){
       	return this.age;
     }
     public void setAge(Float age){
       	this.age=age;
     }
     public String getPatientType(){
       	return this.patientType;
     }
     public void setPatientType(String patientType){
       	this.patientType=patientType;
     }
     public String getRelationship(){
       	return this.relationship;
     }
     public void setRelationship(String relationship){
       	this.relationship=relationship;
     }
     public String getContactsName(){
       	return this.contactsName;
     }
     public void setContactsName(String contactsName){
       	this.contactsName=contactsName;
     }
     public String getContactsPhone(){
       	return this.contactsPhone;
     }
     public void setContactsPhone(String contactsPhone){
       	this.contactsPhone=contactsPhone;
     }
     public String getAuthorId(){
       	return this.authorId;
     }
     public void setAuthorId(String authorId){
       	this.authorId=authorId;
     }
     public String getAuthorName(){
       	return this.authorName;
     }
     public void setAuthorName(String authorName){
       	this.authorName=authorName;
     }
     public String getInpatientRegistrationId(){
       	return this.inpatientRegistrationId;
     }
     public void setInpatientRegistrationId(String inpatientRegistrationId){
       	this.inpatientRegistrationId=inpatientRegistrationId;
     }
     public Date getStart(){
       	return this.start;
     }
     public void setStart(Date start){
       	this.start=start;
     }
     public String getInhId(){
       	return this.inhId;
     }
     public void setInhId(String inhId){
       	this.inhId=inhId;
     }
     public String getVisitingDeptId(){
       	return this.visitingDeptId;
     }
     public void setVisitingDeptId(String visitingDeptId){
       	this.visitingDeptId=visitingDeptId;
     }
     public String getVisitingDeptName(){
       	return this.visitingDeptName;
     }
     public void setVisitingDeptName(String visitingDeptName){
       	this.visitingDeptName=visitingDeptName;
     }
     public String getVisitingDeptCd(){
       	return this.visitingDeptCd;
     }
     public void setVisitingDeptCd(String visitingDeptCd){
       	this.visitingDeptCd=visitingDeptCd;
     }
     public String getWardNo(){
       	return this.wardNo;
     }
     public void setWardNo(String wardNo){
       	this.wardNo=wardNo;
     }
     public String getWardArea(){
       	return this.wardArea;
     }
     public void setWardArea(String wardArea){
       	this.wardArea=wardArea;
     }
     public String getBedNum(){
       	return this.bedNum;
     }
     public void setBedNum(String bedNum){
       	this.bedNum=bedNum;
     }
     public String getProtectBabyId(){
       	return this.protectBabyId;
     }
     public void setProtectBabyId(String protectBabyId){
       	this.protectBabyId=protectBabyId;
     }
     public String getProtectBabyName(){
       	return this.protectBabyName;
     }
     public void setProtectBabyName(String protectBabyName){
       	this.protectBabyName=protectBabyName;
     }
     public Date getProtectBabyDate(){
       	return this.protectBabyDate;
     }
     public void setProtectBabyDate(Date protectBabyDate){
       	this.protectBabyDate=protectBabyDate;
     }
     public String getInstructorId(){
       	return this.instructorId;
     }
     public void setInstructorId(String instructorId){
       	this.instructorId=instructorId;
     }
     public String getInstructorName(){
       	return this.instructorName;
     }
     public void setInstructorName(String instructorName){
       	this.instructorName=instructorName;
     }
     public Date getInstructorDate(){
       	return this.instructorDate;
     }
     public void setInstructorDate(Date instructorDate){
       	this.instructorDate=instructorDate;
     }
     public Boolean getAmnioticCompleteMark(){
       	return this.amnioticCompleteMark;
     }
     public void setAmnioticCompleteMark(Boolean amnioticCompleteMark){
       	this.amnioticCompleteMark=amnioticCompleteMark;
     }
     public Float getChordaUmbilicalisLength(){
       	return this.chordaUmbilicalisLength;
     }
     public void setChordaUmbilicalisLength(Float chordaUmbilicalisLength){
       	this.chordaUmbilicalisLength=chordaUmbilicalisLength;
     }
     public Float getRaogengBody(){
       	return this.raogengBody;
     }
     public void setRaogengBody(Float raogengBody){
       	this.raogengBody=raogengBody;
     }
     public String getPrenatalDiagName(){
       	return this.prenatalDiagName;
     }
     public void setPrenatalDiagName(String prenatalDiagName){
       	this.prenatalDiagName=prenatalDiagName;
     }
     public String getOperationIndication(){
       	return this.operationIndication;
     }
     public void setOperationIndication(String operationIndication){
       	this.operationIndication=operationIndication;
     }
     public String getOperationDescribe(){
       	return this.operationDescribe;
     }
     public void setOperationDescribe(String operationDescribe){
       	this.operationDescribe=operationDescribe;
     }
     public String getUterineConditions(){
       	return this.uterineConditions;
     }
     public void setUterineConditions(String uterineConditions){
       	this.uterineConditions=uterineConditions;
     }
     public String getFetusPositionCd(){
       	return this.fetusPositionCd;
     }
     public void setFetusPositionCd(String fetusPositionCd){
       	this.fetusPositionCd=fetusPositionCd;
     }
     public String getDeliveryBabyMethod(){
       	return this.deliveryBabyMethod;
     }
     public void setDeliveryBabyMethod(String deliveryBabyMethod){
       	this.deliveryBabyMethod=deliveryBabyMethod;
     }
     public String getPlacentaYellow(){
       	return this.placentaYellow;
     }
     public void setPlacentaYellow(String placentaYellow){
       	this.placentaYellow=placentaYellow;
     }
     public String getMembraneYellow(){
       	return this.membraneYellow;
     }
     public void setMembraneYellow(String membraneYellow){
       	this.membraneYellow=membraneYellow;
     }
     public String getCordEntanglementState(){
       	return this.cordEntanglementState;
     }
     public void setCordEntanglementState(String cordEntanglementState){
       	this.cordEntanglementState=cordEntanglementState;
     }
     public Float getUmbilicalCordTorsion(){
       	return this.umbilicalCordTorsion;
     }
     public void setUmbilicalCordTorsion(Float umbilicalCordTorsion){
       	this.umbilicalCordTorsion=umbilicalCordTorsion;
     }
     public Boolean getSaveCordBloodCd(){
       	return this.saveCordBloodCd;
     }
     public void setSaveCordBloodCd(Boolean saveCordBloodCd){
       	this.saveCordBloodCd=saveCordBloodCd;
     }
     public String getUterineSutureState(){
       	return this.uterineSutureState;
     }
     public void setUterineSutureState(String uterineSutureState){
       	this.uterineSutureState=uterineSutureState;
     }
     public String getUterotonicName(){
       	return this.uterotonicName;
     }
     public void setUterotonicName(String uterotonicName){
       	this.uterotonicName=uterotonicName;
     }
     public String getUterotonicUseWay(){
       	return this.uterotonicUseWay;
     }
     public void setUterotonicUseWay(String uterotonicUseWay){
       	this.uterotonicUseWay=uterotonicUseWay;
     }
     public String getOperationDrug(){
       	return this.operationDrug;
     }
     public void setOperationDrug(String operationDrug){
       	this.operationDrug=operationDrug;
     }
     public String getOperationDrugAmount(){
       	return this.operationDrugAmount;
     }
     public void setOperationDrugAmount(String operationDrugAmount){
       	this.operationDrugAmount=operationDrugAmount;
     }
     public String getExplorationUterus(){
       	return this.explorationUterus;
     }
     public void setExplorationUterus(String explorationUterus){
       	this.explorationUterus=explorationUterus;
     }
     public String getExplorationAdnexa(){
       	return this.explorationAdnexa;
     }
     public void setExplorationAdnexa(String explorationAdnexa){
       	this.explorationAdnexa=explorationAdnexa;
     }
     public Boolean getUterotonicYcCd(){
       	return this.uterotonicYcCd;
     }
     public void setUterotonicYcCd(Boolean uterotonicYcCd){
       	this.uterotonicYcCd=uterotonicYcCd;
     }
     public Boolean getUterotonicJlCd(){
       	return this.uterotonicJlCd;
     }
     public void setUterotonicJlCd(Boolean uterotonicJlCd){
       	this.uterotonicJlCd=uterotonicJlCd;
     }
     public String getUterineProbe(){
       	return this.uterineProbe;
     }
     public void setUterineProbe(String uterineProbe){
       	this.uterineProbe=uterineProbe;
     }
     public String getOperationMaternalState(){
       	return this.operationMaternalState;
     }
     public void setOperationMaternalState(String operationMaternalState){
       	this.operationMaternalState=operationMaternalState;
     }
     public String getTransfusionComponent(){
       	return this.transfusionComponent;
     }
     public void setTransfusionComponent(String transfusionComponent){
       	this.transfusionComponent=transfusionComponent;
     }
     public String getOtherDrug(){
       	return this.otherDrug;
     }
     public void setOtherDrug(String otherDrug){
       	this.otherDrug=otherDrug;
     }
     public String getOtherState(){
       	return this.otherState;
     }
     public void setOtherState(String otherState){
       	this.otherState=otherState;
     }
     public Float getOperationWholeTime(){
       	return this.operationWholeTime;
     }
     public void setOperationWholeTime(Float operationWholeTime){
       	this.operationWholeTime=operationWholeTime;
     }
     public String getAnesPosition(){
       	return this.anesPosition;
     }
     public void setAnesPosition(String anesPosition){
       	this.anesPosition=anesPosition;
     }
     public String getAnesEffect(){
       	return this.anesEffect;
     }
     public void setAnesEffect(String anesEffect){
       	this.anesEffect=anesEffect;
     }
     public Float getLossbloodAmount(){
       	return this.lossbloodAmount;
     }
     public void setLossbloodAmount(Float lossbloodAmount){
       	this.lossbloodAmount=lossbloodAmount;
     }
     public Float getTransfusionItemAmount(){
       	return this.transfusionItemAmount;
     }
     public void setTransfusionItemAmount(Float transfusionItemAmount){
       	this.transfusionItemAmount=transfusionItemAmount;
     }
     public Float getInfusionAmount(){
       	return this.infusionAmount;
     }
     public void setInfusionAmount(Float infusionAmount){
       	this.infusionAmount=infusionAmount;
     }
     public Float getOxygenTime(){
       	return this.oxygenTime;
     }
     public void setOxygenTime(Float oxygenTime){
       	this.oxygenTime=oxygenTime;
     }
     public String getOperationId(){
       	return this.operationId;
     }
     public void setOperationId(String operationId){
       	this.operationId=operationId;
     }
     public Date getExpectantTime(){
       	return this.expectantTime;
     }
     public void setExpectantTime(Date expectantTime){
       	this.expectantTime=expectantTime;
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
     public String getEquipmentManager(){
       	return this.equipmentManager;
     }
     public void setEquipmentManager(String equipmentManager){
       	this.equipmentManager=equipmentManager;
     }
     public String getEquipmentManagerName(){
       	return this.equipmentManagerName;
     }
     public void setEquipmentManagerName(String equipmentManagerName){
       	this.equipmentManagerName=equipmentManagerName;
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
     public String getOpPostDiag(){
       	return this.opPostDiag;
     }
     public void setOpPostDiag(String opPostDiag){
       	this.opPostDiag=opPostDiag;
     }
     public Date getPostpartumObsTime(){
       	return this.postpartumObsTime;
     }
     public void setPostpartumObsTime(Date postpartumObsTime){
       	this.postpartumObsTime=postpartumObsTime;
     }
     public Float getPostpartumExaminationTime(){
       	return this.postpartumExaminationTime;
     }
     public void setPostpartumExaminationTime(Float postpartumExaminationTime){
       	this.postpartumExaminationTime=postpartumExaminationTime;
     }
     public Float getSbp(){
       	return this.sbp;
     }
     public void setSbp(Float sbp){
       	this.sbp=sbp;
     }
     public Float getDbp(){
       	return this.dbp;
     }
     public void setDbp(Float dbp){
       	this.dbp=dbp;
     }
     public Float getPulses(){
       	return this.pulses;
     }
     public void setPulses(Float pulses){
       	this.pulses=pulses;
     }
     public Float getPostpartumHeartRate(){
       	return this.postpartumHeartRate;
     }
     public void setPostpartumHeartRate(Float postpartumHeartRate){
       	this.postpartumHeartRate=postpartumHeartRate;
     }
     public Float getPostpartumLossbloodAmount(){
       	return this.postpartumLossbloodAmount;
     }
     public void setPostpartumLossbloodAmount(Float postpartumLossbloodAmount){
       	this.postpartumLossbloodAmount=postpartumLossbloodAmount;
     }
     public Float getPostpartumUc(){
       	return this.postpartumUc;
     }
     public void setPostpartumUc(Float postpartumUc){
       	this.postpartumUc=postpartumUc;
     }
     public Float getPostpartumFundusHeight(){
       	return this.postpartumFundusHeight;
     }
     public void setPostpartumFundusHeight(Float postpartumFundusHeight){
       	this.postpartumFundusHeight=postpartumFundusHeight;
     }
     public String getGenderCode(){
       	return this.genderCode;
     }
     public void setGenderCode(String genderCode){
       	this.genderCode=genderCode;
     }
     public Float getBirthWeight(){
       	return this.birthWeight;
     }
     public void setBirthWeight(Float birthWeight){
       	this.birthWeight=birthWeight;
     }
     public Float getBirthLength(){
       	return this.birthLength;
     }
     public void setBirthLength(Float birthLength){
       	this.birthLength=birthLength;
     }
     public String getTumorSize(){
       	return this.tumorSize;
     }
     public void setTumorSize(String tumorSize){
       	this.tumorSize=tumorSize;
     }
     public String getTumorPart(){
       	return this.tumorPart;
     }
     public void setTumorPart(String tumorPart){
       	this.tumorPart=tumorPart;
     }
     public String getApgarScoreIntervalCd(){
       	return this.apgarScoreIntervalCd;
     }
     public void setApgarScoreIntervalCd(String apgarScoreIntervalCd){
       	this.apgarScoreIntervalCd=apgarScoreIntervalCd;
     }
     public Float getApgarScore(){
       	return this.apgarScore;
     }
     public void setApgarScore(Float apgarScore){
       	this.apgarScore=apgarScore;
     }
     public String getDeliveryOutcomeCd(){
       	return this.deliveryOutcomeCd;
     }
     public void setDeliveryOutcomeCd(String deliveryOutcomeCd){
       	this.deliveryOutcomeCd=deliveryOutcomeCd;
     }
     public String getNewbornAbnormalCd(){
       	return this.newbornAbnormalCd;
     }
     public void setNewbornAbnormalCd(String newbornAbnormalCd){
       	this.newbornAbnormalCd=newbornAbnormalCd;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}