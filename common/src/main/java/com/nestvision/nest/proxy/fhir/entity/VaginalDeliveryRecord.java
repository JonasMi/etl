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
@Table(name = BaseEntity.TABLE_PREFIX + "VAGINAL_DELIVERY_RECORD")
public class VaginalDeliveryRecord extends FhirResourceEntity {

    /**
     *名称:院内阴道分娩记录id
     *
 	 *
 	 *主键字段
     */
     @Column(name="VAGINAL_DELIVERY_RECORD_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="VAGINAL_DELIVERY_RECORD_ID",displayName="院内阴道分娩记录id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String vaginalDeliveryRecordId;
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
     *名称:门诊或住院标识
     *
 	 *限制:CUS00010
 	 *
     */
     @Column(name="VISIT_MARK",length = 10,nullable = false)
     @FhirFieldValidate(name="VISIT_MARK",displayName="门诊或住院标识",maxLength=10,required=true,valuesRange="CUS00010")   
     private String visitMark;
    /**
     *名称:就诊流水号
     *
 	 *
 	 *
     */
     @Column(name="REGISTRATION_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="REGISTRATION_ID",displayName="就诊流水号",maxLength=40,required=true,valuesRange="")   
     private String registrationId;
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
     *名称:就诊时间
     *
 	 *
 	 *
     */
     @Column(name="VISITING_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="VISITING_TIME",displayName="就诊时间",required=false,valuesRange="")   
     private Date visitingTime;
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
     *名称:产程检查者id
     *
 	 *
 	 *
     */
     @Column(name="BIRTH_CONTROL_EXAMINER_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="BIRTH_CONTROL_EXAMINER_ID",displayName="产程检查者id",maxLength=40,required=false,valuesRange="")   
     private String birthControlExaminerId;
    /**
     *名称:产程检查者姓名
     *
 	 *
 	 *
     */
     @Column(name="BIRTH_CONTROL_EXAMINER_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="BIRTH_CONTROL_EXAMINER_NAME",displayName="产程检查者姓名",maxLength=40,required=false,valuesRange="")   
     private String birthControlExaminerName;
    /**
     *名称:产程检查者签名日期
     *
 	 *
 	 *
     */
     @Column(name="BIRTH_CONTROL_EXAMINER_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="BIRTH_CONTROL_EXAMINER_DATE",displayName="产程检查者签名日期",required=false,valuesRange="")   
     private Date birthControlExaminerDate;
    /**
     *名称:记录人id
     *
 	 *
 	 *
     */
     @Column(name="RECORDER_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="RECORDER_ID",displayName="记录人id",maxLength=40,required=false,valuesRange="")   
     private String recorderId;
    /**
     *名称:记录人姓名
     *
 	 *
 	 *
     */
     @Column(name="RECORDER_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="RECORDER_NAME",displayName="记录人姓名",maxLength=40,required=false,valuesRange="")   
     private String recorderName;
    /**
     *名称:记录人签名日期
     *
 	 *
 	 *
     */
     @Column(name="RECORDER_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="RECORDER_DATE",displayName="记录人签名日期",required=false,valuesRange="")   
     private Date recorderDate;
    /**
     *名称:孕次
     *
 	 *
 	 *
     */
     @Column(name="GRAVIDITY",length = 8,nullable = true)
     @FhirFieldValidate(name="GRAVIDITY",displayName="孕次",maxLength=8,required=false,valuesRange="")   
     private Float gravidity;
    /**
     *名称:产次
     *
 	 *
 	 *
     */
     @Column(name="PARITY",length = 8,nullable = true)
     @FhirFieldValidate(name="PARITY",displayName="产次",maxLength=8,required=false,valuesRange="")   
     private Float parity;
    /**
     *名称:预产期
     *
 	 *
 	 *
     */
     @Column(name="EXPECTED_CHILDBIRTH_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="EXPECTED_CHILDBIRTH_DATE",displayName="预产期",required=false,valuesRange="")   
     private Date expectedChildbirthDate;
    /**
     *名称:临产日期时间
     *
 	 *
 	 *
     */
     @Column(name="DELIVERY_DATETIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DELIVERY_DATETIME",displayName="临产日期时间",required=false,valuesRange="")   
     private Date deliveryDatetime;
    /**
     *名称:胎膜破裂日期时间
     *
 	 *
 	 *
     */
     @Column(name="RUPTURE_MEMBRANES_DATETIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="RUPTURE_MEMBRANES_DATETIME",displayName="胎膜破裂日期时间",required=false,valuesRange="")   
     private Date ruptureMembranesDatetime;
    /**
     *名称:前羊水性状
     *
 	 *
 	 *
     */
     @Column(name="PRE_AMN_FLUID_DESCR",length = 100,nullable = true)
     @FhirFieldValidate(name="PRE_AMN_FLUID_DESCR",displayName="前羊水性状",maxLength=100,required=false,valuesRange="")   
     private String preAmnFluidDescr;
    /**
     *名称:前羊水量
     *备注:mL
 	 *
 	 *
     */
     @Column(name="PRE_AMN_FLUID_AMOUNT",length = 8,nullable = true)
     @FhirFieldValidate(name="PRE_AMN_FLUID_AMOUNT",displayName="前羊水量",maxLength=8,required=false,valuesRange="")   
     private Float preAmnFluidAmount;
    /**
     *名称:宫缩开始日期时间
     *
 	 *
 	 *
     */
     @Column(name="UTERINE_CONTRACTION_STDATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="UTERINE_CONTRACTION_STDATE",displayName="宫缩开始日期时间",required=false,valuesRange="")   
     private Date uterineContractionStdate;
    /**
     *名称:第1产程时长
     *备注:min
 	 *
 	 *
     */
     @Column(name="FIRST_LABOR_TIME",length = 8,nullable = true)
     @FhirFieldValidate(name="FIRST_LABOR_TIME",displayName="第1产程时长",maxLength=8,required=false,valuesRange="")   
     private Float firstLaborTime;
    /**
     *名称:宫口开全日期时间
     *
 	 *
 	 *
     */
     @Column(name="CONTRACTION_START_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="CONTRACTION_START_TIME",displayName="宫口开全日期时间",required=false,valuesRange="")   
     private Date contractionStartTime;
    /**
     *名称:第2产程时长
     *备注:min
 	 *
 	 *
     */
     @Column(name="SECOND_LABOR_TIME",length = 8,nullable = true)
     @FhirFieldValidate(name="SECOND_LABOR_TIME",displayName="第2产程时长",maxLength=8,required=false,valuesRange="")   
     private Float secondLaborTime;
    /**
     *名称:胎儿娩出日期时间
     *
 	 *
 	 *
     */
     @Column(name="DELIVERY_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DELIVERY_TIME",displayName="胎儿娩出日期时间",required=false,valuesRange="")   
     private Date deliveryTime;
    /**
     *名称:第3产程时长
     *备注:min
 	 *
 	 *
     */
     @Column(name="THIRD_LABOR_TIME",length = 8,nullable = true)
     @FhirFieldValidate(name="THIRD_LABOR_TIME",displayName="第3产程时长",maxLength=8,required=false,valuesRange="")   
     private Float thirdLaborTime;
    /**
     *名称:胎盘娩出日期时间
     *
 	 *
 	 *
     */
     @Column(name="PLACENTA_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="PLACENTA_TIME",displayName="胎盘娩出日期时间",required=false,valuesRange="")   
     private Date placentaTime;
    /**
     *名称:总产程时长
     *备注:min
 	 *
 	 *
     */
     @Column(name="TOTAL_LABOR_TIME",length = 8,nullable = true)
     @FhirFieldValidate(name="TOTAL_LABOR_TIME",displayName="总产程时长",maxLength=8,required=false,valuesRange="")   
     private Float totalLaborTime;
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
     *名称:胎儿娩出助产标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_MIDWIFERY",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_MIDWIFERY",displayName="胎儿娩出助产标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifMidwifery;
    /**
     *名称:助产方式
     *
 	 *
 	 *
     */
     @Column(name="MIDWIFERY_WAY",length = 100,nullable = true)
     @FhirFieldValidate(name="MIDWIFERY_WAY",displayName="助产方式",maxLength=100,required=false,valuesRange="")   
     private String midwiferyWay;
    /**
     *名称:胎盘娩出情况
     *
 	 *
 	 *
     */
     @Column(name="PLACENTA_SITU",length = 100,nullable = true)
     @FhirFieldValidate(name="PLACENTA_SITU",displayName="胎盘娩出情况",maxLength=100,required=false,valuesRange="")   
     private String placentaSitu;
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
     *名称:羊水性状
     *
 	 *
 	 *
     */
     @Column(name="AMN_FLUID_DESCR",length = 100,nullable = true)
     @FhirFieldValidate(name="AMN_FLUID_DESCR",displayName="羊水性状",maxLength=100,required=false,valuesRange="")   
     private String amnFluidDescr;
    /**
     *名称:羊水量
     *备注:mL
 	 *
 	 *
     */
     @Column(name="AMN_FLUID_AMOUNT",length = 8,nullable = true)
     @FhirFieldValidate(name="AMN_FLUID_AMOUNT",displayName="羊水量",maxLength=8,required=false,valuesRange="")   
     private Float amnFluidAmount;
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
     *名称:脐带异常标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_ABNORMAL_UMBILICAL_CORD",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_ABNORMAL_UMBILICAL_CORD",displayName="脐带异常标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifAbnormalUmbilicalCord;
    /**
     *名称:产时用药
     *
 	 *
 	 *
     */
     @Column(name="PRODUCTION_DRUGS",length = 40,nullable = true)
     @FhirFieldValidate(name="PRODUCTION_DRUGS",displayName="产时用药",maxLength=40,required=false,valuesRange="")   
     private String productionDrugs;
    /**
     *名称:预防措施
     *
 	 *
 	 *
     */
     @Column(name="PREVENTIVE_MEASURE",length = 200,nullable = true)
     @FhirFieldValidate(name="PREVENTIVE_MEASURE",displayName="预防措施",maxLength=200,required=false,valuesRange="")   
     private String preventiveMeasure;
    /**
     *名称:产妇会阴切开标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="EPISIOTOMY_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="EPISIOTOMY_MARK",displayName="产妇会阴切开标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean episiotomyMark;
    /**
     *名称:会阴切开位置
     *
 	 *
 	 *
     */
     @Column(name="EPISIOTOMY",length = 200,nullable = true)
     @FhirFieldValidate(name="EPISIOTOMY",displayName="会阴切开位置",maxLength=200,required=false,valuesRange="")   
     private String episiotomy;
    /**
     *名称:会阴缝合针数
     *
 	 *
 	 *
     */
     @Column(name="PERINEUM_STITCHES",length = 3,nullable = true)
     @FhirFieldValidate(name="PERINEUM_STITCHES",displayName="会阴缝合针数",maxLength=3,required=false,valuesRange="")   
     private Integer perineumStitches;
    /**
     *名称:会阴裂伤情况代码
     *
 	 *限制:CV0501010
 	 *
     */
     @Column(name="PERINEAL_LACER_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="PERINEAL_LACER_CD",displayName="会阴裂伤情况代码",maxLength=20,required=false,valuesRange="CV0501010")   
     private String perinealLacerCd;
    /**
     *名称:会阴血肿标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="PERINEAL_HEMATOMA_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="PERINEAL_HEMATOMA_MARK",displayName="会阴血肿标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean perinealHematomaMark;
    /**
     *名称:会阴血肿大小
     *
 	 *
 	 *
     */
     @Column(name="PERINEAL_HEMATOMA_SIZE",length = 40,nullable = true)
     @FhirFieldValidate(name="PERINEAL_HEMATOMA_SIZE",displayName="会阴血肿大小",maxLength=40,required=false,valuesRange="")   
     private String perinealHematomaSize;
    /**
     *名称:会阴血肿处理
     *
 	 *
 	 *
     */
     @Column(name="PERINEAL_HEMATOMA_DEAL",length = 100,nullable = true)
     @FhirFieldValidate(name="PERINEAL_HEMATOMA_DEAL",displayName="会阴血肿处理",maxLength=100,required=false,valuesRange="")   
     private String perinealHematomaDeal;
    /**
     *名称:麻醉方法代码
     *
 	 *限制:CV0600103
 	 *
     */
     @Column(name="ANESTHESIA_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="ANESTHESIA_CODE",displayName="麻醉方法代码",maxLength=20,required=false,valuesRange="CV0600103")   
     private String anesthesiaCode;
    /**
     *名称:麻醉药物名称
     *
 	 *
 	 *
     */
     @Column(name="ANES_DRUG_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="ANES_DRUG_NAME",displayName="麻醉药物名称",maxLength=40,required=false,valuesRange="")   
     private String anesDrugName;
    /**
     *名称:阴道裂伤标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_VAGINA_LACER",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_VAGINA_LACER",displayName="阴道裂伤标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifVaginaLacer;
    /**
     *名称:阴道血肿标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_VAGINA_HEMATOMA",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_VAGINA_HEMATOMA",displayName="阴道血肿标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifVaginaHematoma;
    /**
     *名称:阴道裂伤标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_CERVICAL_LACER",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_CERVICAL_LACER",displayName="阴道裂伤标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifCervicalLacer;
    /**
     *名称:宫颈缝合情况
     *
 	 *
 	 *
     */
     @Column(name="CERVICAL_SUTURE",length = 100,nullable = true)
     @FhirFieldValidate(name="CERVICAL_SUTURE",displayName="宫颈缝合情况",maxLength=100,required=false,valuesRange="")   
     private String cervicalSuture;
    /**
     *名称:产后用药
     *
 	 *
 	 *
     */
     @Column(name="POSTPARTUM_MEDICATION",length = 100,nullable = true)
     @FhirFieldValidate(name="POSTPARTUM_MEDICATION",displayName="产后用药",maxLength=100,required=false,valuesRange="")   
     private String postpartumMedication;
    /**
     *名称:分娩过程摘要
     *
 	 *
 	 *
     */
     @Column(name="SUMMARY_DELIVERY_PROCESS",length = 200,nullable = true)
     @FhirFieldValidate(name="SUMMARY_DELIVERY_PROCESS",displayName="分娩过程摘要",maxLength=200,required=false,valuesRange="")   
     private String summaryDeliveryProcess;
    /**
     *名称:宫缩情况
     *
 	 *
 	 *
     */
     @Column(name="UTERINE_CONTRACTION",length = 200,nullable = true)
     @FhirFieldValidate(name="UTERINE_CONTRACTION",displayName="宫缩情况",maxLength=200,required=false,valuesRange="")   
     private String uterineContraction;
    /**
     *名称:子宫情况
     *
 	 *
 	 *
     */
     @Column(name="UTERINE_CONDITIONS",length = 500,nullable = true)
     @FhirFieldValidate(name="UTERINE_CONDITIONS",displayName="子宫情况",maxLength=500,required=false,valuesRange="")   
     private String uterineConditions;
    /**
     *名称:恶露状况
     *
 	 *
 	 *
     */
     @Column(name="LOCHIA_SITUATION",length = 500,nullable = true)
     @FhirFieldValidate(name="LOCHIA_SITUATION",displayName="恶露状况",maxLength=500,required=false,valuesRange="")   
     private String lochiaSituation;
    /**
     *名称:会阴情况
     *
 	 *
 	 *
     */
     @Column(name="PERINEAL_CONDITION",length = 500,nullable = true)
     @FhirFieldValidate(name="PERINEAL_CONDITION",displayName="会阴情况",maxLength=500,required=false,valuesRange="")   
     private String perinealCondition;
    /**
     *名称:修补手术过程
     *
 	 *
 	 *
     */
     @Column(name="REPAIR_PROCEDURE",length = 500,nullable = true)
     @FhirFieldValidate(name="REPAIR_PROCEDURE",displayName="修补手术过程",maxLength=500,required=false,valuesRange="")   
     private String repairProcedure;
    /**
     *名称:存脐带血情况标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="CORD_BLOOD_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="CORD_BLOOD_MARK",displayName="存脐带血情况标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean cordBloodMark;
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
     *名称:收缩压
     *备注:mmHg
 	 *
 	 *
     */
     @Column(name="SBP",length = 8,nullable = true)
     @FhirFieldValidate(name="SBP",displayName="收缩压",maxLength=8,required=false,valuesRange="")   
     private Float sbp;
    /**
     *名称:舒张压
     *备注:mmHg
 	 *
 	 *
     */
     @Column(name="DBP",length = 8,nullable = true)
     @FhirFieldValidate(name="DBP",displayName="舒张压",maxLength=8,required=false,valuesRange="")   
     private Float dbp;
    /**
     *名称:脉搏
     *备注:次/min
 	 *
 	 *
     */
     @Column(name="PULSES",length = 8,nullable = true)
     @FhirFieldValidate(name="PULSES",displayName="脉搏",maxLength=8,required=false,valuesRange="")   
     private Float pulses;
    /**
     *名称:产后心率
     *备注:次/min
 	 *
 	 *
     */
     @Column(name="POSTPARTUM_HEART_RATE",length = 8,nullable = true)
     @FhirFieldValidate(name="POSTPARTUM_HEART_RATE",displayName="产后心率",maxLength=8,required=false,valuesRange="")   
     private Float postpartumHeartRate;
    /**
     *名称:产后出血量
     *备注:mL
 	 *
 	 *
     */
     @Column(name="POSTPARTUM_LOSSBLOOD_AMOUNT",length = 8,nullable = true)
     @FhirFieldValidate(name="POSTPARTUM_LOSSBLOOD_AMOUNT",displayName="产后出血量",maxLength=8,required=false,valuesRange="")   
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
     *名称:产后宫底高度
     *备注:cm
 	 *
 	 *
     */
     @Column(name="POSTPARTUM_FUNDUS_HEIGHT",length = 8,nullable = true)
     @FhirFieldValidate(name="POSTPARTUM_FUNDUS_HEIGHT",displayName="产后宫底高度",maxLength=8,required=false,valuesRange="")   
     private Float postpartumFundusHeight;
    /**
     *名称:肛查
     *
 	 *
 	 *
     */
     @Column(name="ANUS_EXAM",length = 200,nullable = true)
     @FhirFieldValidate(name="ANUS_EXAM",displayName="肛查",maxLength=200,required=false,valuesRange="")   
     private String anusExam;
    /**
     *名称:新生儿性别代码
     *
 	 *限制:GBT22611
 	 *
     */
     @Column(name="GENDER_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="GENDER_CODE",displayName="新生儿性别代码",maxLength=20,required=false,valuesRange="GBT22611")   
     private String genderCode;
    /**
     *名称:新生儿出生体重
     *备注:g
 	 *
 	 *
     */
     @Column(name="BIRTH_WEIGHT",length = 8,nullable = true)
     @FhirFieldValidate(name="BIRTH_WEIGHT",displayName="新生儿出生体重",maxLength=8,required=false,valuesRange="")   
     private Float birthWeight;
    /**
     *名称:新生儿出生身长
     *备注:cm
 	 *
 	 *
     */
     @Column(name="BIRTH_LENGTH",length = 8,nullable = true)
     @FhirFieldValidate(name="BIRTH_LENGTH",displayName="新生儿出生身长",maxLength=8,required=false,valuesRange="")   
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
    
     public String getVaginalDeliveryRecordId(){
       	return this.vaginalDeliveryRecordId;
     }
     public void setVaginalDeliveryRecordId(String vaginalDeliveryRecordId){
       	this.vaginalDeliveryRecordId=vaginalDeliveryRecordId;
     }
     public Date getDate(){
       	return this.date;
     }
     public void setDate(Date date){
       	this.date=date;
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
     public String getVisitMark(){
       	return this.visitMark;
     }
     public void setVisitMark(String visitMark){
       	this.visitMark=visitMark;
     }
     public String getRegistrationId(){
       	return this.registrationId;
     }
     public void setRegistrationId(String registrationId){
       	this.registrationId=registrationId;
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
     public Date getVisitingTime(){
       	return this.visitingTime;
     }
     public void setVisitingTime(Date visitingTime){
       	this.visitingTime=visitingTime;
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
     public String getBirthControlExaminerId(){
       	return this.birthControlExaminerId;
     }
     public void setBirthControlExaminerId(String birthControlExaminerId){
       	this.birthControlExaminerId=birthControlExaminerId;
     }
     public String getBirthControlExaminerName(){
       	return this.birthControlExaminerName;
     }
     public void setBirthControlExaminerName(String birthControlExaminerName){
       	this.birthControlExaminerName=birthControlExaminerName;
     }
     public Date getBirthControlExaminerDate(){
       	return this.birthControlExaminerDate;
     }
     public void setBirthControlExaminerDate(Date birthControlExaminerDate){
       	this.birthControlExaminerDate=birthControlExaminerDate;
     }
     public String getRecorderId(){
       	return this.recorderId;
     }
     public void setRecorderId(String recorderId){
       	this.recorderId=recorderId;
     }
     public String getRecorderName(){
       	return this.recorderName;
     }
     public void setRecorderName(String recorderName){
       	this.recorderName=recorderName;
     }
     public Date getRecorderDate(){
       	return this.recorderDate;
     }
     public void setRecorderDate(Date recorderDate){
       	this.recorderDate=recorderDate;
     }
     public Float getGravidity(){
       	return this.gravidity;
     }
     public void setGravidity(Float gravidity){
       	this.gravidity=gravidity;
     }
     public Float getParity(){
       	return this.parity;
     }
     public void setParity(Float parity){
       	this.parity=parity;
     }
     public Date getExpectedChildbirthDate(){
       	return this.expectedChildbirthDate;
     }
     public void setExpectedChildbirthDate(Date expectedChildbirthDate){
       	this.expectedChildbirthDate=expectedChildbirthDate;
     }
     public Date getDeliveryDatetime(){
       	return this.deliveryDatetime;
     }
     public void setDeliveryDatetime(Date deliveryDatetime){
       	this.deliveryDatetime=deliveryDatetime;
     }
     public Date getRuptureMembranesDatetime(){
       	return this.ruptureMembranesDatetime;
     }
     public void setRuptureMembranesDatetime(Date ruptureMembranesDatetime){
       	this.ruptureMembranesDatetime=ruptureMembranesDatetime;
     }
     public String getPreAmnFluidDescr(){
       	return this.preAmnFluidDescr;
     }
     public void setPreAmnFluidDescr(String preAmnFluidDescr){
       	this.preAmnFluidDescr=preAmnFluidDescr;
     }
     public Float getPreAmnFluidAmount(){
       	return this.preAmnFluidAmount;
     }
     public void setPreAmnFluidAmount(Float preAmnFluidAmount){
       	this.preAmnFluidAmount=preAmnFluidAmount;
     }
     public Date getUterineContractionStdate(){
       	return this.uterineContractionStdate;
     }
     public void setUterineContractionStdate(Date uterineContractionStdate){
       	this.uterineContractionStdate=uterineContractionStdate;
     }
     public Float getFirstLaborTime(){
       	return this.firstLaborTime;
     }
     public void setFirstLaborTime(Float firstLaborTime){
       	this.firstLaborTime=firstLaborTime;
     }
     public Date getContractionStartTime(){
       	return this.contractionStartTime;
     }
     public void setContractionStartTime(Date contractionStartTime){
       	this.contractionStartTime=contractionStartTime;
     }
     public Float getSecondLaborTime(){
       	return this.secondLaborTime;
     }
     public void setSecondLaborTime(Float secondLaborTime){
       	this.secondLaborTime=secondLaborTime;
     }
     public Date getDeliveryTime(){
       	return this.deliveryTime;
     }
     public void setDeliveryTime(Date deliveryTime){
       	this.deliveryTime=deliveryTime;
     }
     public Float getThirdLaborTime(){
       	return this.thirdLaborTime;
     }
     public void setThirdLaborTime(Float thirdLaborTime){
       	this.thirdLaborTime=thirdLaborTime;
     }
     public Date getPlacentaTime(){
       	return this.placentaTime;
     }
     public void setPlacentaTime(Date placentaTime){
       	this.placentaTime=placentaTime;
     }
     public Float getTotalLaborTime(){
       	return this.totalLaborTime;
     }
     public void setTotalLaborTime(Float totalLaborTime){
       	this.totalLaborTime=totalLaborTime;
     }
     public String getFetusPositionCd(){
       	return this.fetusPositionCd;
     }
     public void setFetusPositionCd(String fetusPositionCd){
       	this.fetusPositionCd=fetusPositionCd;
     }
     public Boolean getIfMidwifery(){
       	return this.ifMidwifery;
     }
     public void setIfMidwifery(Boolean ifMidwifery){
       	this.ifMidwifery=ifMidwifery;
     }
     public String getMidwiferyWay(){
       	return this.midwiferyWay;
     }
     public void setMidwiferyWay(String midwiferyWay){
       	this.midwiferyWay=midwiferyWay;
     }
     public String getPlacentaSitu(){
       	return this.placentaSitu;
     }
     public void setPlacentaSitu(String placentaSitu){
       	this.placentaSitu=placentaSitu;
     }
     public Boolean getAmnioticCompleteMark(){
       	return this.amnioticCompleteMark;
     }
     public void setAmnioticCompleteMark(Boolean amnioticCompleteMark){
       	this.amnioticCompleteMark=amnioticCompleteMark;
     }
     public String getAmnFluidDescr(){
       	return this.amnFluidDescr;
     }
     public void setAmnFluidDescr(String amnFluidDescr){
       	this.amnFluidDescr=amnFluidDescr;
     }
     public Float getAmnFluidAmount(){
       	return this.amnFluidAmount;
     }
     public void setAmnFluidAmount(Float amnFluidAmount){
       	this.amnFluidAmount=amnFluidAmount;
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
     public Boolean getIfAbnormalUmbilicalCord(){
       	return this.ifAbnormalUmbilicalCord;
     }
     public void setIfAbnormalUmbilicalCord(Boolean ifAbnormalUmbilicalCord){
       	this.ifAbnormalUmbilicalCord=ifAbnormalUmbilicalCord;
     }
     public String getProductionDrugs(){
       	return this.productionDrugs;
     }
     public void setProductionDrugs(String productionDrugs){
       	this.productionDrugs=productionDrugs;
     }
     public String getPreventiveMeasure(){
       	return this.preventiveMeasure;
     }
     public void setPreventiveMeasure(String preventiveMeasure){
       	this.preventiveMeasure=preventiveMeasure;
     }
     public Boolean getEpisiotomyMark(){
       	return this.episiotomyMark;
     }
     public void setEpisiotomyMark(Boolean episiotomyMark){
       	this.episiotomyMark=episiotomyMark;
     }
     public String getEpisiotomy(){
       	return this.episiotomy;
     }
     public void setEpisiotomy(String episiotomy){
       	this.episiotomy=episiotomy;
     }
     public Integer getPerineumStitches(){
       	return this.perineumStitches;
     }
     public void setPerineumStitches(Integer perineumStitches){
       	this.perineumStitches=perineumStitches;
     }
     public String getPerinealLacerCd(){
       	return this.perinealLacerCd;
     }
     public void setPerinealLacerCd(String perinealLacerCd){
       	this.perinealLacerCd=perinealLacerCd;
     }
     public Boolean getPerinealHematomaMark(){
       	return this.perinealHematomaMark;
     }
     public void setPerinealHematomaMark(Boolean perinealHematomaMark){
       	this.perinealHematomaMark=perinealHematomaMark;
     }
     public String getPerinealHematomaSize(){
       	return this.perinealHematomaSize;
     }
     public void setPerinealHematomaSize(String perinealHematomaSize){
       	this.perinealHematomaSize=perinealHematomaSize;
     }
     public String getPerinealHematomaDeal(){
       	return this.perinealHematomaDeal;
     }
     public void setPerinealHematomaDeal(String perinealHematomaDeal){
       	this.perinealHematomaDeal=perinealHematomaDeal;
     }
     public String getAnesthesiaCode(){
       	return this.anesthesiaCode;
     }
     public void setAnesthesiaCode(String anesthesiaCode){
       	this.anesthesiaCode=anesthesiaCode;
     }
     public String getAnesDrugName(){
       	return this.anesDrugName;
     }
     public void setAnesDrugName(String anesDrugName){
       	this.anesDrugName=anesDrugName;
     }
     public Boolean getIfVaginaLacer(){
       	return this.ifVaginaLacer;
     }
     public void setIfVaginaLacer(Boolean ifVaginaLacer){
       	this.ifVaginaLacer=ifVaginaLacer;
     }
     public Boolean getIfVaginaHematoma(){
       	return this.ifVaginaHematoma;
     }
     public void setIfVaginaHematoma(Boolean ifVaginaHematoma){
       	this.ifVaginaHematoma=ifVaginaHematoma;
     }
     public Boolean getIfCervicalLacer(){
       	return this.ifCervicalLacer;
     }
     public void setIfCervicalLacer(Boolean ifCervicalLacer){
       	this.ifCervicalLacer=ifCervicalLacer;
     }
     public String getCervicalSuture(){
       	return this.cervicalSuture;
     }
     public void setCervicalSuture(String cervicalSuture){
       	this.cervicalSuture=cervicalSuture;
     }
     public String getPostpartumMedication(){
       	return this.postpartumMedication;
     }
     public void setPostpartumMedication(String postpartumMedication){
       	this.postpartumMedication=postpartumMedication;
     }
     public String getSummaryDeliveryProcess(){
       	return this.summaryDeliveryProcess;
     }
     public void setSummaryDeliveryProcess(String summaryDeliveryProcess){
       	this.summaryDeliveryProcess=summaryDeliveryProcess;
     }
     public String getUterineContraction(){
       	return this.uterineContraction;
     }
     public void setUterineContraction(String uterineContraction){
       	this.uterineContraction=uterineContraction;
     }
     public String getUterineConditions(){
       	return this.uterineConditions;
     }
     public void setUterineConditions(String uterineConditions){
       	this.uterineConditions=uterineConditions;
     }
     public String getLochiaSituation(){
       	return this.lochiaSituation;
     }
     public void setLochiaSituation(String lochiaSituation){
       	this.lochiaSituation=lochiaSituation;
     }
     public String getPerinealCondition(){
       	return this.perinealCondition;
     }
     public void setPerinealCondition(String perinealCondition){
       	this.perinealCondition=perinealCondition;
     }
     public String getRepairProcedure(){
       	return this.repairProcedure;
     }
     public void setRepairProcedure(String repairProcedure){
       	this.repairProcedure=repairProcedure;
     }
     public Boolean getCordBloodMark(){
       	return this.cordBloodMark;
     }
     public void setCordBloodMark(Boolean cordBloodMark){
       	this.cordBloodMark=cordBloodMark;
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
     public String getAnusExam(){
       	return this.anusExam;
     }
     public void setAnusExam(String anusExam){
       	this.anusExam=anusExam;
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