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
@Table(name = BaseEntity.TABLE_PREFIX + "SURGICAL_NURSING_RECORD")
public class SurgicalNursingRecord extends FhirResourceEntity {

    /**
     *名称:院内手术护理记录id
     *
 	 *
 	 *主键字段
     */
     @Column(name="SURGICAL_NURSING_RECORD_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="SURGICAL_NURSING_RECORD_ID",displayName="院内手术护理记录id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String surgicalNursingRecordId;
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
     *名称:出生日期
     *
 	 *
 	 *
     */
     @Column(name="BIRTHDATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="BIRTHDATE",displayName="出生日期",required=false,valuesRange="")   
     private Date birthdate;
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
     *名称:中医"四诊"观察结果
     *
 	 *
 	 *
     */
     @Column(name="CN_FOUR_RESULT",length = 200,nullable = true)
     @FhirFieldValidate(name="CN_FOUR_RESULT",displayName="中医&quot;四诊&quot;观察结果",maxLength=200,required=false,valuesRange="")   
     private String cnFourResult;
    /**
     *名称:入院途径
     *
 	 *限制:CV0900403
 	 *
     */
     @Column(name="IN_MODE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="IN_MODE_CODE",displayName="入院途径",maxLength=20,required=false,valuesRange="CV0900403")   
     private String inModeCode;
    /**
     *名称:住院原因代码
     *
 	 *限制:CV0600212
 	 *
     */
     @Column(name="INHOSPITAL_REASON_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="INHOSPITAL_REASON_CD",displayName="住院原因代码",maxLength=20,required=false,valuesRange="CV0600212")   
     private String inhospitalReasonCd;
    /**
     *名称:入病房方式
     *
 	 *
 	 *
     */
     @Column(name="INHOSPITAL_WAY",length = 40,nullable = true)
     @FhirFieldValidate(name="INHOSPITAL_WAY",displayName="入病房方式",maxLength=40,required=false,valuesRange="")   
     private String inhospitalWay;
    /**
     *名称:交接护士id
     *
 	 *
 	 *
     */
     @Column(name="TRANSFER_NURSE_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="TRANSFER_NURSE_ID",displayName="交接护士id",maxLength=40,required=false,valuesRange="")   
     private String transferNurseId;
    /**
     *名称:交接护士姓名
     *
 	 *
 	 *
     */
     @Column(name="TRANSFER_NURSE_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="TRANSFER_NURSE_NAME",displayName="交接护士姓名",maxLength=40,required=false,valuesRange="")   
     private String transferNurseName;
    /**
     *名称:交接护士签名日期
     *
 	 *
 	 *
     */
     @Column(name="TRANSFER_NURSE_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="TRANSFER_NURSE_DATE",displayName="交接护士签名日期",required=false,valuesRange="")   
     private Date transferNurseDate;
    /**
     *名称:转运者id
     *
 	 *
 	 *
     */
     @Column(name="TRANSPORTERS_NURSE_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="TRANSPORTERS_NURSE_ID",displayName="转运者id",maxLength=40,required=false,valuesRange="")   
     private String transportersNurseId;
    /**
     *名称:转运者姓名
     *
 	 *
 	 *
     */
     @Column(name="TRANSPORTERS_NURSE_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="TRANSPORTERS_NURSE_NAME",displayName="转运者姓名",maxLength=40,required=false,valuesRange="")   
     private String transportersNurseName;
    /**
     *名称:转运者签名日期
     *
 	 *
 	 *
     */
     @Column(name="TRANSPORTERS_NURSE_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="TRANSPORTERS_NURSE_DATE",displayName="转运者签名日期",required=false,valuesRange="")   
     private Date transportersNurseDate;
    /**
     *名称:中医症候代码
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="CN_SYM_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="CN_SYM_DIAG_CODE",displayName="中医症候代码",maxLength=20,required=false,valuesRange="CV9900357")   
     private String cnSymDiagCode;
    /**
     *名称:中医病名代码
     *
 	 *限制:CV9900357
 	 *
     */
     @Column(name="CN_DIS_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="CN_DIS_DIAG_CODE",displayName="中医病名代码",maxLength=20,required=false,valuesRange="CV9900357")   
     private String cnDisDiagCode;
    /**
     *名称:诊断编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="DIAG_CODE",displayName="诊断编码",maxLength=20,required=false,valuesRange="CV990111")   
     private String diagCode;
    /**
     *名称:诊断编码名称
     *
 	 *
 	 *
     */
     @Column(name="DIAG_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="DIAG_NAME",displayName="诊断编码名称",maxLength=40,required=false,valuesRange="")   
     private String diagName;
    /**
     *名称:诊断日期
     *
 	 *
 	 *
     */
     @Column(name="DIAG_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DIAG_DATE",displayName="诊断日期",required=false,valuesRange="")   
     private Date diagDate;
    /**
     *名称:就诊类型
     *
 	 *限制:CV9900340
 	 *
     */
     @Column(name="VISITING_TYPE",length = 20,nullable = true)
     @FhirFieldValidate(name="VISITING_TYPE",displayName="就诊类型",maxLength=20,required=false,valuesRange="CV9900340")   
     private String visitingType;
    /**
     *名称:体重(kg)
     *
 	 *
 	 *
     */
     @Column(name="WEIGHT",length = 8,nullable = true)
     @FhirFieldValidate(name="WEIGHT",displayName="体重(kg)",maxLength=8,required=false,valuesRange="")   
     private Float weight;
    /**
     *名称:ABO血型代码
     *
 	 *限制:CV0450005
 	 *
     */
     @Column(name="ABO_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="ABO_CD",displayName="ABO血型代码",maxLength=20,required=false,valuesRange="CV0450005")   
     private String aboCd;
    /**
     *名称:RH血型代码
     *
 	 *限制:CV0450020
 	 *
     */
     @Column(name="RH_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="RH_CD",displayName="RH血型代码",maxLength=20,required=false,valuesRange="CV0450020")   
     private String rhCd;
    /**
     *名称:皮肤检查描述
     *
 	 *
 	 *
     */
     @Column(name="SKIN_CHECK_DESCRIPTION",columnDefinition="text")
     @FhirFieldValidate(name="SKIN_CHECK_DESCRIPTION",displayName="皮肤检查描述",required=false,valuesRange="")   
     private String skinCheckDescription;
    /**
     *名称:患者过敏史标志
     *
 	 *限制:CV9900024
 	 *
     */
     @Column(name="INPAT_ALLE_MARK",length = 20,nullable = true)
     @FhirFieldValidate(name="INPAT_ALLE_MARK",displayName="患者过敏史标志",maxLength=20,required=false,valuesRange="CV9900024")   
     private String inpatAlleMark;
    /**
     *名称:过敏史描述
     *
 	 *
 	 *
     */
     @Column(name="RRITABILITY",columnDefinition="text")
     @FhirFieldValidate(name="RRITABILITY",displayName="过敏史描述",required=false,valuesRange="")   
     private String rritability;
    /**
     *名称:病人交接核对项目
     *
 	 *
 	 *
     */
     @Column(name="PAT_HANDOVER_ITEM",length = 100,nullable = true)
     @FhirFieldValidate(name="PAT_HANDOVER_ITEM",displayName="病人交接核对项目",maxLength=100,required=false,valuesRange="")   
     private String patHandoverItem;
    /**
     *名称:护理操作名称
     *
 	 *
 	 *
     */
     @Column(name="NURSING_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="NURSING_NAME",displayName="护理操作名称",maxLength=40,required=false,valuesRange="")   
     private String nursingName;
    /**
     *名称:护理操作项目类目名称
     *
 	 *
 	 *
     */
     @Column(name="NURSING_ITEM_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="NURSING_ITEM_NAME",displayName="护理操作项目类目名称",maxLength=40,required=false,valuesRange="")   
     private String nursingItemName;
    /**
     *名称:护理操作结果描述
     *
 	 *
 	 *
     */
     @Column(name="NURSING_RESULT_DESCRIPTION",length = 200,nullable = true)
     @FhirFieldValidate(name="NURSING_RESULT_DESCRIPTION",displayName="护理操作结果描述",maxLength=200,required=false,valuesRange="")   
     private String nursingResultDescription;
    /**
     *名称:护理等级代码
     *
 	 *限制:CV9900330
 	 *
     */
     @Column(name="NURSING_TYPE",length = 20,nullable = true)
     @FhirFieldValidate(name="NURSING_TYPE",displayName="护理等级代码",maxLength=20,required=false,valuesRange="CV9900330")   
     private String nursingType;
    /**
     *名称:护理类型代码
     *
 	 *限制:CV9900331
 	 *
     */
     @Column(name="NURSING_GRADE",length = 20,nullable = true)
     @FhirFieldValidate(name="NURSING_GRADE",displayName="护理类型代码",maxLength=20,required=false,valuesRange="CV9900331")   
     private String nursingGrade;
    /**
     *名称:护理观察项目名称
     *
 	 *
 	 *
     */
     @Column(name="OBSERVATION_PROJECT_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="OBSERVATION_PROJECT_NAME",displayName="护理观察项目名称",maxLength=40,required=false,valuesRange="")   
     private String observationProjectName;
    /**
     *名称:护理观察结果
     *
 	 *
 	 *
     */
     @Column(name="OBSERVATION_RESULTS_DESCRIPTION",length = 200,nullable = true)
     @FhirFieldValidate(name="OBSERVATION_RESULTS_DESCRIPTION",displayName="护理观察结果",maxLength=200,required=false,valuesRange="")   
     private String observationResultsDescription;
    /**
     *名称:术中所用物品名称
     *
 	 *
 	 *
     */
     @Column(name="OPERATION_ITEMS_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="OPERATION_ITEMS_NAME",displayName="术中所用物品名称",maxLength=40,required=false,valuesRange="")   
     private String operationItemsName;
    /**
     *名称:术前清点标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_PREOPERATIVE_INVENTORY",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_PREOPERATIVE_INVENTORY",displayName="术前清点标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifPreoperativeInventory;
    /**
     *名称:关前核对标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_PRE_MATERIAL_CHECK",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_PRE_MATERIAL_CHECK",displayName="关前核对标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifPreMaterialCheck;
    /**
     *名称:关后核对标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_POST_MATERIAL_CHECK",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_POST_MATERIAL_CHECK",displayName="关后核对标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifPostMaterialCheck;
    /**
     *名称:术中病理标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="OP_PATHOLOGY_DN",length = 5,nullable = true)
     @FhirFieldValidate(name="OP_PATHOLOGY_DN",displayName="术中病理标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean opPathologyDn;
    /**
     *名称:准备事项
     *
 	 *
 	 *
     */
     @Column(name="PRE_OPERATIVE_PREPARATION",length = 200,nullable = true)
     @FhirFieldValidate(name="PRE_OPERATIVE_PREPARATION",displayName="准备事项",maxLength=200,required=false,valuesRange="")   
     private String preOperativePreparation;
    /**
     *名称:手术间编号
     *
 	 *
 	 *
     */
     @Column(name="OP_ROOM_NO",length = 40,nullable = true)
     @FhirFieldValidate(name="OP_ROOM_NO",displayName="手术间编号",maxLength=40,required=false,valuesRange="")   
     private String opRoomNo;
    /**
     *名称:入手术室日期时间
     *
 	 *
 	 *
     */
     @Column(name="IN_OPERATING_ROOM_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="IN_OPERATING_ROOM_TIME",displayName="入手术室日期时间",required=false,valuesRange="")   
     private Date inOperatingRoomTime;
    /**
     *名称:出手术室日期时间
     *
 	 *
 	 *
     */
     @Column(name="OUT_OPERATING_ROOM_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="OUT_OPERATING_ROOM_TIME",displayName="出手术室日期时间",required=false,valuesRange="")   
     private Date outOperatingRoomTime;
    /**
     *名称:切口类别代码
     *
 	 *限制:CV0510022
 	 *
     */
     @Column(name="INCISION_TYPE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="INCISION_TYPE_CODE",displayName="切口类别代码",maxLength=20,required=false,valuesRange="CV0510022")   
     private String incisionTypeCode;
    /**
     *名称:切口愈合级别代码
     *
 	 *限制:CV550114
 	 *
     */
     @Column(name="INCISION_HEALING_RANK_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="INCISION_HEALING_RANK_CODE",displayName="切口愈合级别代码",maxLength=20,required=false,valuesRange="CV550114")   
     private String incisionHealingRankCode;
    /**
     *名称:手术过程
     *
 	 *
 	 *
     */
     @Column(name="OPERATION_COURSES",length = 2000,nullable = true)
     @FhirFieldValidate(name="OPERATION_COURSES",displayName="手术过程",maxLength=2000,required=false,valuesRange="")   
     private String operationCourses;
    /**
     *名称:手术单号
     *
 	 *
 	 *
     */
     @Column(name="OPERATION_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="OPERATION_ID",displayName="手术单号",maxLength=40,required=false,valuesRange="")   
     private String operationId;
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
     *名称:麻醉方法
     *
 	 *
 	 *
     */
     @Column(name="ANESTHESIA_WAY",length = 100,nullable = true)
     @FhirFieldValidate(name="ANESTHESIA_WAY",displayName="麻醉方法",maxLength=100,required=false,valuesRange="")   
     private String anesthesiaWay;
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
 	 *
 	 *
     */
     @Column(name="PART_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="PART_NAME",displayName="手术操作目标部位名称",maxLength=20,required=false,valuesRange="")   
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
     *名称:巡台护士id
     *
 	 *
 	 *
     */
     @Column(name="PATROL_NURSE",length = 40,nullable = true)
     @FhirFieldValidate(name="PATROL_NURSE",displayName="巡台护士id",maxLength=40,required=false,valuesRange="")   
     private String patrolNurse;
    /**
     *名称:巡台护士姓名
     *
 	 *
 	 *
     */
     @Column(name="PATROL_NURSE_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="PATROL_NURSE_NAME",displayName="巡台护士姓名",maxLength=40,required=false,valuesRange="")   
     private String patrolNurseName;
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
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
    
     public String getSurgicalNursingRecordId(){
       	return this.surgicalNursingRecordId;
     }
     public void setSurgicalNursingRecordId(String surgicalNursingRecordId){
       	this.surgicalNursingRecordId=surgicalNursingRecordId;
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
     public Date getBirthdate(){
       	return this.birthdate;
     }
     public void setBirthdate(Date birthdate){
       	this.birthdate=birthdate;
     }
     public Float getAge(){
       	return this.age;
     }
     public void setAge(Float age){
       	this.age=age;
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
     public String getCnFourResult(){
       	return this.cnFourResult;
     }
     public void setCnFourResult(String cnFourResult){
       	this.cnFourResult=cnFourResult;
     }
     public String getInModeCode(){
       	return this.inModeCode;
     }
     public void setInModeCode(String inModeCode){
       	this.inModeCode=inModeCode;
     }
     public String getInhospitalReasonCd(){
       	return this.inhospitalReasonCd;
     }
     public void setInhospitalReasonCd(String inhospitalReasonCd){
       	this.inhospitalReasonCd=inhospitalReasonCd;
     }
     public String getInhospitalWay(){
       	return this.inhospitalWay;
     }
     public void setInhospitalWay(String inhospitalWay){
       	this.inhospitalWay=inhospitalWay;
     }
     public String getTransferNurseId(){
       	return this.transferNurseId;
     }
     public void setTransferNurseId(String transferNurseId){
       	this.transferNurseId=transferNurseId;
     }
     public String getTransferNurseName(){
       	return this.transferNurseName;
     }
     public void setTransferNurseName(String transferNurseName){
       	this.transferNurseName=transferNurseName;
     }
     public Date getTransferNurseDate(){
       	return this.transferNurseDate;
     }
     public void setTransferNurseDate(Date transferNurseDate){
       	this.transferNurseDate=transferNurseDate;
     }
     public String getTransportersNurseId(){
       	return this.transportersNurseId;
     }
     public void setTransportersNurseId(String transportersNurseId){
       	this.transportersNurseId=transportersNurseId;
     }
     public String getTransportersNurseName(){
       	return this.transportersNurseName;
     }
     public void setTransportersNurseName(String transportersNurseName){
       	this.transportersNurseName=transportersNurseName;
     }
     public Date getTransportersNurseDate(){
       	return this.transportersNurseDate;
     }
     public void setTransportersNurseDate(Date transportersNurseDate){
       	this.transportersNurseDate=transportersNurseDate;
     }
     public String getCnSymDiagCode(){
       	return this.cnSymDiagCode;
     }
     public void setCnSymDiagCode(String cnSymDiagCode){
       	this.cnSymDiagCode=cnSymDiagCode;
     }
     public String getCnDisDiagCode(){
       	return this.cnDisDiagCode;
     }
     public void setCnDisDiagCode(String cnDisDiagCode){
       	this.cnDisDiagCode=cnDisDiagCode;
     }
     public String getDiagCode(){
       	return this.diagCode;
     }
     public void setDiagCode(String diagCode){
       	this.diagCode=diagCode;
     }
     public String getDiagName(){
       	return this.diagName;
     }
     public void setDiagName(String diagName){
       	this.diagName=diagName;
     }
     public Date getDiagDate(){
       	return this.diagDate;
     }
     public void setDiagDate(Date diagDate){
       	this.diagDate=diagDate;
     }
     public String getVisitingType(){
       	return this.visitingType;
     }
     public void setVisitingType(String visitingType){
       	this.visitingType=visitingType;
     }
     public Float getWeight(){
       	return this.weight;
     }
     public void setWeight(Float weight){
       	this.weight=weight;
     }
     public String getAboCd(){
       	return this.aboCd;
     }
     public void setAboCd(String aboCd){
       	this.aboCd=aboCd;
     }
     public String getRhCd(){
       	return this.rhCd;
     }
     public void setRhCd(String rhCd){
       	this.rhCd=rhCd;
     }
     public String getSkinCheckDescription(){
       	return this.skinCheckDescription;
     }
     public void setSkinCheckDescription(String skinCheckDescription){
       	this.skinCheckDescription=skinCheckDescription;
     }
     public String getInpatAlleMark(){
       	return this.inpatAlleMark;
     }
     public void setInpatAlleMark(String inpatAlleMark){
       	this.inpatAlleMark=inpatAlleMark;
     }
     public String getRritability(){
       	return this.rritability;
     }
     public void setRritability(String rritability){
       	this.rritability=rritability;
     }
     public String getPatHandoverItem(){
       	return this.patHandoverItem;
     }
     public void setPatHandoverItem(String patHandoverItem){
       	this.patHandoverItem=patHandoverItem;
     }
     public String getNursingName(){
       	return this.nursingName;
     }
     public void setNursingName(String nursingName){
       	this.nursingName=nursingName;
     }
     public String getNursingItemName(){
       	return this.nursingItemName;
     }
     public void setNursingItemName(String nursingItemName){
       	this.nursingItemName=nursingItemName;
     }
     public String getNursingResultDescription(){
       	return this.nursingResultDescription;
     }
     public void setNursingResultDescription(String nursingResultDescription){
       	this.nursingResultDescription=nursingResultDescription;
     }
     public String getNursingType(){
       	return this.nursingType;
     }
     public void setNursingType(String nursingType){
       	this.nursingType=nursingType;
     }
     public String getNursingGrade(){
       	return this.nursingGrade;
     }
     public void setNursingGrade(String nursingGrade){
       	this.nursingGrade=nursingGrade;
     }
     public String getObservationProjectName(){
       	return this.observationProjectName;
     }
     public void setObservationProjectName(String observationProjectName){
       	this.observationProjectName=observationProjectName;
     }
     public String getObservationResultsDescription(){
       	return this.observationResultsDescription;
     }
     public void setObservationResultsDescription(String observationResultsDescription){
       	this.observationResultsDescription=observationResultsDescription;
     }
     public String getOperationItemsName(){
       	return this.operationItemsName;
     }
     public void setOperationItemsName(String operationItemsName){
       	this.operationItemsName=operationItemsName;
     }
     public Boolean getIfPreoperativeInventory(){
       	return this.ifPreoperativeInventory;
     }
     public void setIfPreoperativeInventory(Boolean ifPreoperativeInventory){
       	this.ifPreoperativeInventory=ifPreoperativeInventory;
     }
     public Boolean getIfPreMaterialCheck(){
       	return this.ifPreMaterialCheck;
     }
     public void setIfPreMaterialCheck(Boolean ifPreMaterialCheck){
       	this.ifPreMaterialCheck=ifPreMaterialCheck;
     }
     public Boolean getIfPostMaterialCheck(){
       	return this.ifPostMaterialCheck;
     }
     public void setIfPostMaterialCheck(Boolean ifPostMaterialCheck){
       	this.ifPostMaterialCheck=ifPostMaterialCheck;
     }
     public Boolean getOpPathologyDn(){
       	return this.opPathologyDn;
     }
     public void setOpPathologyDn(Boolean opPathologyDn){
       	this.opPathologyDn=opPathologyDn;
     }
     public String getPreOperativePreparation(){
       	return this.preOperativePreparation;
     }
     public void setPreOperativePreparation(String preOperativePreparation){
       	this.preOperativePreparation=preOperativePreparation;
     }
     public String getOpRoomNo(){
       	return this.opRoomNo;
     }
     public void setOpRoomNo(String opRoomNo){
       	this.opRoomNo=opRoomNo;
     }
     public Date getInOperatingRoomTime(){
       	return this.inOperatingRoomTime;
     }
     public void setInOperatingRoomTime(Date inOperatingRoomTime){
       	this.inOperatingRoomTime=inOperatingRoomTime;
     }
     public Date getOutOperatingRoomTime(){
       	return this.outOperatingRoomTime;
     }
     public void setOutOperatingRoomTime(Date outOperatingRoomTime){
       	this.outOperatingRoomTime=outOperatingRoomTime;
     }
     public String getIncisionTypeCode(){
       	return this.incisionTypeCode;
     }
     public void setIncisionTypeCode(String incisionTypeCode){
       	this.incisionTypeCode=incisionTypeCode;
     }
     public String getIncisionHealingRankCode(){
       	return this.incisionHealingRankCode;
     }
     public void setIncisionHealingRankCode(String incisionHealingRankCode){
       	this.incisionHealingRankCode=incisionHealingRankCode;
     }
     public String getOperationCourses(){
       	return this.operationCourses;
     }
     public void setOperationCourses(String operationCourses){
       	this.operationCourses=operationCourses;
     }
     public String getOperationId(){
       	return this.operationId;
     }
     public void setOperationId(String operationId){
       	this.operationId=operationId;
     }
     public String getAnesthesiaCode(){
       	return this.anesthesiaCode;
     }
     public void setAnesthesiaCode(String anesthesiaCode){
       	this.anesthesiaCode=anesthesiaCode;
     }
     public String getAnesthesiaWay(){
       	return this.anesthesiaWay;
     }
     public void setAnesthesiaWay(String anesthesiaWay){
       	this.anesthesiaWay=anesthesiaWay;
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
     public String getPatrolNurse(){
       	return this.patrolNurse;
     }
     public void setPatrolNurse(String patrolNurse){
       	this.patrolNurse=patrolNurse;
     }
     public String getPatrolNurseName(){
       	return this.patrolNurseName;
     }
     public void setPatrolNurseName(String patrolNurseName){
       	this.patrolNurseName=patrolNurseName;
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
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
}