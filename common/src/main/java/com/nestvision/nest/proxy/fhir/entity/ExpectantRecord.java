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
@Table(name = BaseEntity.TABLE_PREFIX + "EXPECTANT_RECORD")
public class ExpectantRecord extends FhirResourceEntity {

    /**
     *名称:院内待产记录id
     *
 	 *
 	 *主键字段
     */
     @Column(name="EXPECTANT_RECORD_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="EXPECTANT_RECORD_ID",displayName="院内待产记录id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String expectantRecordId;
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
     *名称:待产日期时间
     *
 	 *
 	 *
     */
     @Column(name="DELIVERY_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DELIVERY_TIME",displayName="待产日期时间",required=false,valuesRange="")   
     private Date deliveryTime;
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
     *名称:末次月经日期
     *
 	 *
 	 *
     */
     @Column(name="MENSES_LAST_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="MENSES_LAST_DATE",displayName="末次月经日期",required=false,valuesRange="")   
     private Date mensesLastDate;
    /**
     *名称:受孕形式代码
     *
 	 *限制:CV9900344
 	 *
     */
     @Column(name="CONCEPTION_FORM_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="CONCEPTION_FORM_CD",displayName="受孕形式代码",maxLength=20,required=false,valuesRange="CV9900344")   
     private String conceptionFormCd;
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
     *名称:产前检查标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="PREGNANCY_EXAMINE_CD",length = 5,nullable = true)
     @FhirFieldValidate(name="PREGNANCY_EXAMINE_CD",displayName="产前检查标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean pregnancyExamineCd;
    /**
     *名称:产前检查异常情况
     *
 	 *
 	 *
     */
     @Column(name="ANTENATAL_EXAM_ABNORMAL",length = 100,nullable = true)
     @FhirFieldValidate(name="ANTENATAL_EXAM_ABNORMAL",displayName="产前检查异常情况",maxLength=100,required=false,valuesRange="")   
     private String antenatalExamAbnormal;
    /**
     *名称:此次妊娠特殊情况
     *
 	 *
 	 *
     */
     @Column(name="PREGNANCY_SPECIAL_CIRCUMSTANCES",length = 100,nullable = true)
     @FhirFieldValidate(name="PREGNANCY_SPECIAL_CIRCUMSTANCES",displayName="此次妊娠特殊情况",maxLength=100,required=false,valuesRange="")   
     private String pregnancySpecialCircumstances;
    /**
     *名称:孕前体重
     *备注:kg
 	 *
 	 *
     */
     @Column(name="PREPREGNANCY_WEIGHT",length = 8,nullable = true)
     @FhirFieldValidate(name="PREPREGNANCY_WEIGHT",displayName="孕前体重",maxLength=8,required=false,valuesRange="")   
     private Float prepregnancyWeight;
    /**
     *名称:身高
     *备注:cm
 	 *
 	 *
     */
     @Column(name="PRENATAL_HEIGHT",length = 8,nullable = true)
     @FhirFieldValidate(name="PRENATAL_HEIGHT",displayName="身高",maxLength=8,required=false,valuesRange="")   
     private Float prenatalHeight;
    /**
     *名称:产前体重
     *备注:kg
 	 *
 	 *
     */
     @Column(name="PRENATAL_WEIGHT",length = 8,nullable = true)
     @FhirFieldValidate(name="PRENATAL_WEIGHT",displayName="产前体重",maxLength=8,required=false,valuesRange="")   
     private Float prenatalWeight;
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
     *名称:体温
     *备注:℃
 	 *
 	 *
     */
     @Column(name="BODY_TEMPERATURE",length = 8,nullable = true)
     @FhirFieldValidate(name="BODY_TEMPERATURE",displayName="体温",maxLength=8,required=false,valuesRange="")   
     private Float bodyTemperature;
    /**
     *名称:脉率
     *备注:次/min
 	 *
 	 *
     */
     @Column(name="PULSES",length = 8,nullable = true)
     @FhirFieldValidate(name="PULSES",displayName="脉率",maxLength=8,required=false,valuesRange="")   
     private Float pulses;
    /**
     *名称:呼吸频率
     *备注:次/min
 	 *
 	 *
     */
     @Column(name="BREATHING_RATE",length = 8,nullable = true)
     @FhirFieldValidate(name="BREATHING_RATE",displayName="呼吸频率",maxLength=8,required=false,valuesRange="")   
     private Float breathingRate;
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
     *名称:手术史
     *
 	 *
 	 *
     */
     @Column(name="OP_HIS",columnDefinition="text")
     @FhirFieldValidate(name="OP_HIS",displayName="手术史",required=false,valuesRange="")   
     private String opHis;
    /**
     *名称:既往孕产史
     *
 	 *
 	 *
     */
     @Column(name="MATERNAL_HISTORY",columnDefinition="text")
     @FhirFieldValidate(name="MATERNAL_HISTORY",displayName="既往孕产史",required=false,valuesRange="")   
     private String maternalHistory;
    /**
     *名称:宫底高度
     *备注:cm
 	 *
 	 *
     */
     @Column(name="UTERUS_HEIGHT",length = 8,nullable = true)
     @FhirFieldValidate(name="UTERUS_HEIGHT",displayName="宫底高度",maxLength=8,required=false,valuesRange="")   
     private Float uterusHeight;
    /**
     *名称:腹围
     *备注:cm
 	 *
 	 *
     */
     @Column(name="ABDOMINAL_GIRTH",length = 8,nullable = true)
     @FhirFieldValidate(name="ABDOMINAL_GIRTH",displayName="腹围",maxLength=8,required=false,valuesRange="")   
     private Float abdominalGirth;
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
     *名称:胎心率
     *备注:次/min
 	 *
 	 *
     */
     @Column(name="FETAL_HEART_RATE",length = 8,nullable = true)
     @FhirFieldValidate(name="FETAL_HEART_RATE",displayName="胎心率",maxLength=8,required=false,valuesRange="")   
     private Float fetalHeartRate;
    /**
     *名称:头位难产情况的评估
     *
 	 *
 	 *
     */
     @Column(name="HEAD_DIFFER_SITUATION_EVA",length = 100,nullable = true)
     @FhirFieldValidate(name="HEAD_DIFFER_SITUATION_EVA",displayName="头位难产情况的评估",maxLength=100,required=false,valuesRange="")   
     private String headDifferSituationEva;
    /**
     *名称:出口横径
     *备注:cm
 	 *
 	 *
     */
     @Column(name="TRANSVERSE_OUTLET",length = 8,nullable = true)
     @FhirFieldValidate(name="TRANSVERSE_OUTLET",displayName="出口横径",maxLength=8,required=false,valuesRange="")   
     private Float transverseOutlet;
    /**
     *名称:骶耻外径
     *备注:cm
 	 *
 	 *
     */
     @Column(name="EXTERNAL_CONJUGATE",length = 8,nullable = true)
     @FhirFieldValidate(name="EXTERNAL_CONJUGATE",displayName="骶耻外径",maxLength=8,required=false,valuesRange="")   
     private Float externalConjugate;
    /**
     *名称:坐骨结节间径
     *备注:cm
 	 *
 	 *
     */
     @Column(name="BIISCHIAL_DIAMETER",length = 8,nullable = true)
     @FhirFieldValidate(name="BIISCHIAL_DIAMETER",displayName="坐骨结节间径",maxLength=8,required=false,valuesRange="")   
     private Float biischialDiameter;
    /**
     *名称:宫缩情况
     *
 	 *
 	 *
     */
     @Column(name="CONTRACTION_STATE",length = 100,nullable = true)
     @FhirFieldValidate(name="CONTRACTION_STATE",displayName="宫缩情况",maxLength=100,required=false,valuesRange="")   
     private String contractionState;
    /**
     *名称:宫颈厚度
     *
 	 *
 	 *
     */
     @Column(name="CERVICAL_THICKNESS",length = 100,nullable = true)
     @FhirFieldValidate(name="CERVICAL_THICKNESS",displayName="宫颈厚度",maxLength=100,required=false,valuesRange="")   
     private String cervicalThickness;
    /**
     *名称:宫口情况
     *
 	 *
 	 *
     */
     @Column(name="PALACE_MOUTH_STATE",length = 100,nullable = true)
     @FhirFieldValidate(name="PALACE_MOUTH_STATE",displayName="宫口情况",maxLength=100,required=false,valuesRange="")   
     private String palaceMouthState;
    /**
     *名称:胎膜是否破
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="MEMBRANE_CD",length = 5,nullable = true)
     @FhirFieldValidate(name="MEMBRANE_CD",displayName="胎膜是否破",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean membraneCd;
    /**
     *名称:胎膜情况代码
     *
 	 *限制:CV9900345
 	 *
     */
     @Column(name="PROM_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="PROM_CODE",displayName="胎膜情况代码",maxLength=20,required=false,valuesRange="CV9900345")   
     private String promCode;
    /**
     *名称:破膜方式代码
     *
 	 *限制:CV9900397
 	 *
     */
     @Column(name="RUPTURE_WAY_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="RUPTURE_WAY_CD",displayName="破膜方式代码",maxLength=20,required=false,valuesRange="CV9900397")   
     private String ruptureWayCd;
    /**
     *名称:先露位置
     *
 	 *
 	 *
     */
     @Column(name="PRE_PART_STATION",length = 100,nullable = true)
     @FhirFieldValidate(name="PRE_PART_STATION",displayName="先露位置",maxLength=100,required=false,valuesRange="")   
     private String prePartStation;
    /**
     *名称:羊水情况
     *
 	 *
 	 *
     */
     @Column(name="AMNIOTIC_FLUID_STATE",length = 100,nullable = true)
     @FhirFieldValidate(name="AMNIOTIC_FLUID_STATE",displayName="羊水情况",maxLength=100,required=false,valuesRange="")   
     private String amnioticFluidState;
    /**
     *名称:膀胱充盈标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="FILLING_BLADDER_CD",length = 5,nullable = true)
     @FhirFieldValidate(name="FILLING_BLADDER_CD",displayName="膀胱充盈标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean fillingBladderCd;
    /**
     *名称:肠胀气标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="INTESTINAL_INFLATION_CD",length = 5,nullable = true)
     @FhirFieldValidate(name="INTESTINAL_INFLATION_CD",displayName="肠胀气标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean intestinalInflationCd;
    /**
     *名称:检查方式代码
     *
 	 *限制:CV9900346
 	 *
     */
     @Column(name="EXAM_METHOD_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="EXAM_METHOD_CD",displayName="检查方式代码",maxLength=20,required=false,valuesRange="CV9900346")   
     private String examMethodCd;
    /**
     *名称:处置计划
     *备注:对产妇情况进行综合评估的基础上，为其制定的处置计划的详细描述
 	 *
 	 *
     */
     @Column(name="TREATMENT_PLAN",length = 200,nullable = true)
     @FhirFieldValidate(name="TREATMENT_PLAN",displayName="处置计划",maxLength=200,required=false,valuesRange="")   
     private String treatmentPlan;
    /**
     *名称:计划选取的分娩方式
     *
 	 *
 	 *
     */
     @Column(name="PLAN_DELIVERY_METHOD",length = 100,nullable = true)
     @FhirFieldValidate(name="PLAN_DELIVERY_METHOD",displayName="计划选取的分娩方式",maxLength=100,required=false,valuesRange="")   
     private String planDeliveryMethod;
    /**
     *名称:产程记录日期时间
     *
 	 *
 	 *
     */
     @Column(name="LABOR_RECORD_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="LABOR_RECORD_TIME",displayName="产程记录日期时间",required=false,valuesRange="")   
     private Date laborRecordTime;
    /**
     *名称:产程经过
     *
 	 *
 	 *
     */
     @Column(name="LABOR_COURSE",length = 500,nullable = true)
     @FhirFieldValidate(name="LABOR_COURSE",displayName="产程经过",maxLength=500,required=false,valuesRange="")   
     private String laborCourse;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getExpectantRecordId(){
       	return this.expectantRecordId;
     }
     public void setExpectantRecordId(String expectantRecordId){
       	this.expectantRecordId=expectantRecordId;
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
     public Date getDeliveryTime(){
       	return this.deliveryTime;
     }
     public void setDeliveryTime(Date deliveryTime){
       	this.deliveryTime=deliveryTime;
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
     public Date getMensesLastDate(){
       	return this.mensesLastDate;
     }
     public void setMensesLastDate(Date mensesLastDate){
       	this.mensesLastDate=mensesLastDate;
     }
     public String getConceptionFormCd(){
       	return this.conceptionFormCd;
     }
     public void setConceptionFormCd(String conceptionFormCd){
       	this.conceptionFormCd=conceptionFormCd;
     }
     public Date getExpectedChildbirthDate(){
       	return this.expectedChildbirthDate;
     }
     public void setExpectedChildbirthDate(Date expectedChildbirthDate){
       	this.expectedChildbirthDate=expectedChildbirthDate;
     }
     public Boolean getPregnancyExamineCd(){
       	return this.pregnancyExamineCd;
     }
     public void setPregnancyExamineCd(Boolean pregnancyExamineCd){
       	this.pregnancyExamineCd=pregnancyExamineCd;
     }
     public String getAntenatalExamAbnormal(){
       	return this.antenatalExamAbnormal;
     }
     public void setAntenatalExamAbnormal(String antenatalExamAbnormal){
       	this.antenatalExamAbnormal=antenatalExamAbnormal;
     }
     public String getPregnancySpecialCircumstances(){
       	return this.pregnancySpecialCircumstances;
     }
     public void setPregnancySpecialCircumstances(String pregnancySpecialCircumstances){
       	this.pregnancySpecialCircumstances=pregnancySpecialCircumstances;
     }
     public Float getPrepregnancyWeight(){
       	return this.prepregnancyWeight;
     }
     public void setPrepregnancyWeight(Float prepregnancyWeight){
       	this.prepregnancyWeight=prepregnancyWeight;
     }
     public Float getPrenatalHeight(){
       	return this.prenatalHeight;
     }
     public void setPrenatalHeight(Float prenatalHeight){
       	this.prenatalHeight=prenatalHeight;
     }
     public Float getPrenatalWeight(){
       	return this.prenatalWeight;
     }
     public void setPrenatalWeight(Float prenatalWeight){
       	this.prenatalWeight=prenatalWeight;
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
     public Float getBodyTemperature(){
       	return this.bodyTemperature;
     }
     public void setBodyTemperature(Float bodyTemperature){
       	this.bodyTemperature=bodyTemperature;
     }
     public Float getPulses(){
       	return this.pulses;
     }
     public void setPulses(Float pulses){
       	this.pulses=pulses;
     }
     public Float getBreathingRate(){
       	return this.breathingRate;
     }
     public void setBreathingRate(Float breathingRate){
       	this.breathingRate=breathingRate;
     }
     public String getHistory(){
       	return this.history;
     }
     public void setHistory(String history){
       	this.history=history;
     }
     public String getOpHis(){
       	return this.opHis;
     }
     public void setOpHis(String opHis){
       	this.opHis=opHis;
     }
     public String getMaternalHistory(){
       	return this.maternalHistory;
     }
     public void setMaternalHistory(String maternalHistory){
       	this.maternalHistory=maternalHistory;
     }
     public Float getUterusHeight(){
       	return this.uterusHeight;
     }
     public void setUterusHeight(Float uterusHeight){
       	this.uterusHeight=uterusHeight;
     }
     public Float getAbdominalGirth(){
       	return this.abdominalGirth;
     }
     public void setAbdominalGirth(Float abdominalGirth){
       	this.abdominalGirth=abdominalGirth;
     }
     public String getFetusPositionCd(){
       	return this.fetusPositionCd;
     }
     public void setFetusPositionCd(String fetusPositionCd){
       	this.fetusPositionCd=fetusPositionCd;
     }
     public Float getFetalHeartRate(){
       	return this.fetalHeartRate;
     }
     public void setFetalHeartRate(Float fetalHeartRate){
       	this.fetalHeartRate=fetalHeartRate;
     }
     public String getHeadDifferSituationEva(){
       	return this.headDifferSituationEva;
     }
     public void setHeadDifferSituationEva(String headDifferSituationEva){
       	this.headDifferSituationEva=headDifferSituationEva;
     }
     public Float getTransverseOutlet(){
       	return this.transverseOutlet;
     }
     public void setTransverseOutlet(Float transverseOutlet){
       	this.transverseOutlet=transverseOutlet;
     }
     public Float getExternalConjugate(){
       	return this.externalConjugate;
     }
     public void setExternalConjugate(Float externalConjugate){
       	this.externalConjugate=externalConjugate;
     }
     public Float getBiischialDiameter(){
       	return this.biischialDiameter;
     }
     public void setBiischialDiameter(Float biischialDiameter){
       	this.biischialDiameter=biischialDiameter;
     }
     public String getContractionState(){
       	return this.contractionState;
     }
     public void setContractionState(String contractionState){
       	this.contractionState=contractionState;
     }
     public String getCervicalThickness(){
       	return this.cervicalThickness;
     }
     public void setCervicalThickness(String cervicalThickness){
       	this.cervicalThickness=cervicalThickness;
     }
     public String getPalaceMouthState(){
       	return this.palaceMouthState;
     }
     public void setPalaceMouthState(String palaceMouthState){
       	this.palaceMouthState=palaceMouthState;
     }
     public Boolean getMembraneCd(){
       	return this.membraneCd;
     }
     public void setMembraneCd(Boolean membraneCd){
       	this.membraneCd=membraneCd;
     }
     public String getPromCode(){
       	return this.promCode;
     }
     public void setPromCode(String promCode){
       	this.promCode=promCode;
     }
     public String getRuptureWayCd(){
       	return this.ruptureWayCd;
     }
     public void setRuptureWayCd(String ruptureWayCd){
       	this.ruptureWayCd=ruptureWayCd;
     }
     public String getPrePartStation(){
       	return this.prePartStation;
     }
     public void setPrePartStation(String prePartStation){
       	this.prePartStation=prePartStation;
     }
     public String getAmnioticFluidState(){
       	return this.amnioticFluidState;
     }
     public void setAmnioticFluidState(String amnioticFluidState){
       	this.amnioticFluidState=amnioticFluidState;
     }
     public Boolean getFillingBladderCd(){
       	return this.fillingBladderCd;
     }
     public void setFillingBladderCd(Boolean fillingBladderCd){
       	this.fillingBladderCd=fillingBladderCd;
     }
     public Boolean getIntestinalInflationCd(){
       	return this.intestinalInflationCd;
     }
     public void setIntestinalInflationCd(Boolean intestinalInflationCd){
       	this.intestinalInflationCd=intestinalInflationCd;
     }
     public String getExamMethodCd(){
       	return this.examMethodCd;
     }
     public void setExamMethodCd(String examMethodCd){
       	this.examMethodCd=examMethodCd;
     }
     public String getTreatmentPlan(){
       	return this.treatmentPlan;
     }
     public void setTreatmentPlan(String treatmentPlan){
       	this.treatmentPlan=treatmentPlan;
     }
     public String getPlanDeliveryMethod(){
       	return this.planDeliveryMethod;
     }
     public void setPlanDeliveryMethod(String planDeliveryMethod){
       	this.planDeliveryMethod=planDeliveryMethod;
     }
     public Date getLaborRecordTime(){
       	return this.laborRecordTime;
     }
     public void setLaborRecordTime(Date laborRecordTime){
       	this.laborRecordTime=laborRecordTime;
     }
     public String getLaborCourse(){
       	return this.laborCourse;
     }
     public void setLaborCourse(String laborCourse){
       	this.laborCourse=laborCourse;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}