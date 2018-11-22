package com.nestvision.nest.proxy.fhir.entity;
import java.util.List;
import javax.persistence.Temporal;
import java.util.Date;
import javax.persistence.TemporalType;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.nestvision.nest.proxy.base.entity.BaseEntity;
import com.nestvision.nest.proxy.fhir.anotaion.FhirFieldValidate;

@Entity
@Table(name = BaseEntity.TABLE_PREFIX + "PATIENT")
public class Patient extends FhirResourceEntity {

    /**
     *名称:院内患者ID
     *备注:患者信息在院内系统中的唯一标识
 	 *
 	 *主键字段
     */
     @Column(name="PATIENT_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="PATIENT_ID",displayName="院内患者ID",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String patientId;
    /**
     *名称:就诊卡号
     *
 	 *
 	 *
     */
     @Column(name="PATIENT_SERVICE_NO",length = 40,nullable = true)
     @FhirFieldValidate(name="PATIENT_SERVICE_NO",displayName="就诊卡号",maxLength=40,required=false,valuesRange="")   
     private String patientServiceNo;
    /**
     *名称:证件类别代码
     *
 	 *限制:CUS00018
 	 *
     */
     @Column(name="ID_TYPE_CODE",length = 10,nullable = false)
     @FhirFieldValidate(name="ID_TYPE_CODE",displayName="证件类别代码",maxLength=10,required=true,valuesRange="CUS00018")   
     private String idTypeCode;
    /**
     *名称:证件号码
     *
 	 *
 	 *
     */
     @Column(name="ID_NO",length = 50,nullable = false)
     @FhirFieldValidate(name="ID_NO",displayName="证件号码",maxLength=50,required=true,valuesRange="")   
     private String idNo;
    /**
     *名称:社保卡号
     *
 	 *
 	 *
     */
     @Column(name="SOCIAL_INSURANCE_CARD",length = 40,nullable = true)
     @FhirFieldValidate(name="SOCIAL_INSURANCE_CARD",displayName="社保卡号",maxLength=40,required=false,valuesRange="")   
     private String socialInsuranceCard;
    /**
     *名称:医疗保险卡号
     *
 	 *
 	 *
     */
     @Column(name="MEDICAL_INSURANCE_CARD",length = 40,nullable = true)
     @FhirFieldValidate(name="MEDICAL_INSURANCE_CARD",displayName="医疗保险卡号",maxLength=40,required=false,valuesRange="")   
     private String medicalInsuranceCard;
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
     *名称:新农合卡号
     *
 	 *
 	 *
     */
     @Column(name="NCMS_CARD",length = 40,nullable = true)
     @FhirFieldValidate(name="NCMS_CARD",displayName="新农合卡号",maxLength=40,required=false,valuesRange="")   
     private String ncmsCard;
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
     *名称:健康卡临时卡号
     *
 	 *
 	 *
     */
     @Column(name="HEALTH_CARD_TEMP",length = 40,nullable = true)
     @FhirFieldValidate(name="HEALTH_CARD_TEMP",displayName="健康卡临时卡号",maxLength=40,required=false,valuesRange="")   
     private String healthCardTemp;
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
     *名称:年龄
     *
 	 *
 	 *
     */
     @Column(name="AGE",length = 3,nullable = true)
     @FhirFieldValidate(name="AGE",displayName="年龄",maxLength=3,required=false,valuesRange="")   
     private Integer age;
    /**
     *名称:实足年龄
     *
 	 *
 	 *
     */
     @Column(name="EXACT_AGE",length = 3,nullable = true)
     @FhirFieldValidate(name="EXACT_AGE",displayName="实足年龄",maxLength=3,required=false,valuesRange="")   
     private Integer exactAge;
    /**
     *名称:家庭联系方式
     *
 	 *
 	 *
     */
     @Column(name="HOME_PHONE",length = 20,nullable = true)
     @FhirFieldValidate(name="HOME_PHONE",displayName="家庭联系方式",maxLength=20,required=false,valuesRange="")   
     private String homePhone;
    /**
     *名称:工作联系方式
     *
 	 *
 	 *
     */
     @Column(name="WORK_PHONE",length = 20,nullable = true)
     @FhirFieldValidate(name="WORK_PHONE",displayName="工作联系方式",maxLength=20,required=false,valuesRange="")   
     private String workPhone;
    /**
     *名称:个人联系方式
     *
 	 *
 	 *
     */
     @Column(name="MOBILE_PHONE",length = 20,nullable = true)
     @FhirFieldValidate(name="MOBILE_PHONE",displayName="个人联系方式",maxLength=20,required=false,valuesRange="")   
     private String mobilePhone;
    /**
     *名称:临时联系方式
     *
 	 *
 	 *
     */
     @Column(name="TEMP_PHONE",length = 20,nullable = true)
     @FhirFieldValidate(name="TEMP_PHONE",displayName="临时联系方式",maxLength=20,required=false,valuesRange="")   
     private String tempPhone;
    /**
     *名称:电子邮箱
     *
 	 *
 	 *
     */
     @Column(name="TEMP_EMAIL",length = 20,nullable = true)
     @FhirFieldValidate(name="TEMP_EMAIL",displayName="电子邮箱",maxLength=20,required=false,valuesRange="")   
     private String tempEmail;
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
     @Column(name="BIRTHDATE",nullable = false)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="BIRTHDATE",displayName="出生日期",required=true,valuesRange="")   
     private Date birthdate;
    /**
     *名称:婚姻状况代码
     *
 	 *限制:GBT22612
 	 *
     */
     @Column(name="MARITALSTATUS",length = 20,nullable = false)
     @FhirFieldValidate(name="MARITALSTATUS",displayName="婚姻状况代码",maxLength=20,required=true,valuesRange="GBT22612")   
     private String maritalstatus;
    /**
     *名称:家庭住址-省（自治区、直辖市）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="HOME_STATE",length = 10,nullable = true)
     @FhirFieldValidate(name="HOME_STATE",displayName="家庭住址-省（自治区、直辖市）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String homeState;
    /**
     *名称:家庭住址-市（地区）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="HOME_CITY",length = 10,nullable = true)
     @FhirFieldValidate(name="HOME_CITY",displayName="家庭住址-市（地区）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String homeCity;
    /**
     *名称:家庭住址-县（区）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="HOME_DISTRICT",length = 10,nullable = true)
     @FhirFieldValidate(name="HOME_DISTRICT",displayName="家庭住址-县（区）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String homeDistrict;
    /**
     *名称:家庭住址-乡（镇、街道办事处）
     *
 	 *
 	 *
     */
     @Column(name="HOME_LINE",length = 100,nullable = true)
     @FhirFieldValidate(name="HOME_LINE",displayName="家庭住址-乡（镇、街道办事处）",maxLength=100,required=false,valuesRange="")   
     private String homeLine;
    /**
     *名称:家庭住址-村（街、路、弄等）
     *
 	 *
 	 *
     */
     @Column(name="HOME_ROAD",length = 100,nullable = true)
     @FhirFieldValidate(name="HOME_ROAD",displayName="家庭住址-村（街、路、弄等）",maxLength=100,required=false,valuesRange="")   
     private String homeRoad;
    /**
     *名称:家庭住址-门牌号码
     *
 	 *
 	 *
     */
     @Column(name="HOME_HOUSE_NO",length = 50,nullable = true)
     @FhirFieldValidate(name="HOME_HOUSE_NO",displayName="家庭住址-门牌号码",maxLength=50,required=false,valuesRange="")   
     private String homeHouseNo;
    /**
     *名称:家庭住址-详细信息
     *
 	 *
 	 *
     */
     @Column(name="HOME_TEXT",length = 500,nullable = true)
     @FhirFieldValidate(name="HOME_TEXT",displayName="家庭住址-详细信息",maxLength=500,required=false,valuesRange="")   
     private String homeText;
    /**
     *名称:现居住住址-省（自治区、直辖市）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="TEMP_STATE",length = 10,nullable = true)
     @FhirFieldValidate(name="TEMP_STATE",displayName="现居住住址-省（自治区、直辖市）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String tempState;
    /**
     *名称:现居住住址-市（地区）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="TEMP_CITY",length = 10,nullable = true)
     @FhirFieldValidate(name="TEMP_CITY",displayName="现居住住址-市（地区）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String tempCity;
    /**
     *名称:现居住住址-县（区）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="TEMP_DISTRICT",length = 10,nullable = true)
     @FhirFieldValidate(name="TEMP_DISTRICT",displayName="现居住住址-县（区）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String tempDistrict;
    /**
     *名称:现居住住址-乡（镇、街道办事处）
     *
 	 *
 	 *
     */
     @Column(name="TEMP_LINE",length = 100,nullable = true)
     @FhirFieldValidate(name="TEMP_LINE",displayName="现居住住址-乡（镇、街道办事处）",maxLength=100,required=false,valuesRange="")   
     private String tempLine;
    /**
     *名称:现居住住址-村（街、路、弄等）
     *
 	 *
 	 *
     */
     @Column(name="TEMP_ROAD",length = 100,nullable = true)
     @FhirFieldValidate(name="TEMP_ROAD",displayName="现居住住址-村（街、路、弄等）",maxLength=100,required=false,valuesRange="")   
     private String tempRoad;
    /**
     *名称:现居住住址-门牌号码
     *
 	 *
 	 *
     */
     @Column(name="TEMP_HOUSE_NO",length = 50,nullable = true)
     @FhirFieldValidate(name="TEMP_HOUSE_NO",displayName="现居住住址-门牌号码",maxLength=50,required=false,valuesRange="")   
     private String tempHouseNo;
    /**
     *名称:现居住住址-详细信息
     *
 	 *
 	 *
     */
     @Column(name="TEMP_TEXT",length = 500,nullable = true)
     @FhirFieldValidate(name="TEMP_TEXT",displayName="现居住住址-详细信息",maxLength=500,required=false,valuesRange="")   
     private String tempText;
    /**
     *名称:现地址邮政编码
     *
 	 *
 	 *
     */
     @Column(name="TEMP_POST_CD",length = 50,nullable = true)
     @FhirFieldValidate(name="TEMP_POST_CD",displayName="现地址邮政编码",maxLength=50,required=false,valuesRange="")   
     private String tempPostCd;
    /**
     *名称:工作单位住址-省（自治区、直辖市）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="WORK_STATE",length = 10,nullable = true)
     @FhirFieldValidate(name="WORK_STATE",displayName="工作单位住址-省（自治区、直辖市）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String workState;
    /**
     *名称:工作单位住址-市（地区）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="WORK_CITY",length = 10,nullable = true)
     @FhirFieldValidate(name="WORK_CITY",displayName="工作单位住址-市（地区）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String workCity;
    /**
     *名称:工作单位住址-县（区）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="WORK_DISTRICT",length = 10,nullable = true)
     @FhirFieldValidate(name="WORK_DISTRICT",displayName="工作单位住址-县（区）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String workDistrict;
    /**
     *名称:工作单位住址-乡（镇、街道办事处）
     *
 	 *
 	 *
     */
     @Column(name="WORK_LINE",length = 100,nullable = true)
     @FhirFieldValidate(name="WORK_LINE",displayName="工作单位住址-乡（镇、街道办事处）",maxLength=100,required=false,valuesRange="")   
     private String workLine;
    /**
     *名称:工作单位住址-村（街、路、弄等）
     *
 	 *
 	 *
     */
     @Column(name="WORK_ROAD",length = 100,nullable = true)
     @FhirFieldValidate(name="WORK_ROAD",displayName="工作单位住址-村（街、路、弄等）",maxLength=100,required=false,valuesRange="")   
     private String workRoad;
    /**
     *名称:工作单位住址-门牌号码
     *
 	 *
 	 *
     */
     @Column(name="WORK_HOUSE_NO",length = 50,nullable = true)
     @FhirFieldValidate(name="WORK_HOUSE_NO",displayName="工作单位住址-门牌号码",maxLength=50,required=false,valuesRange="")   
     private String workHouseNo;
    /**
     *名称:工作单位住址-详细信息
     *
 	 *
 	 *
     */
     @Column(name="WORK_TEXT",length = 500,nullable = true)
     @FhirFieldValidate(name="WORK_TEXT",displayName="工作单位住址-详细信息",maxLength=500,required=false,valuesRange="")   
     private String workText;
    /**
     *名称:工作单位邮政编码
     *
 	 *
 	 *
     */
     @Column(name="WORK_POST_CD",length = 50,nullable = true)
     @FhirFieldValidate(name="WORK_POST_CD",displayName="工作单位邮政编码",maxLength=50,required=false,valuesRange="")   
     private String workPostCd;
    /**
     *名称:出生地-省（自治区、直辖市）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="BIRTH_STATE",length = 10,nullable = true)
     @FhirFieldValidate(name="BIRTH_STATE",displayName="出生地-省（自治区、直辖市）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String birthState;
    /**
     *名称:出生地-市（地区）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="BIRTH_CITY",length = 10,nullable = true)
     @FhirFieldValidate(name="BIRTH_CITY",displayName="出生地-市（地区）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String birthCity;
    /**
     *名称:出生地-县（区）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="BIRTH_DISTRICT",length = 10,nullable = true)
     @FhirFieldValidate(name="BIRTH_DISTRICT",displayName="出生地-县（区）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String birthDistrict;
    /**
     *名称:出生地-乡（镇、街道办事处）
     *
 	 *
 	 *
     */
     @Column(name="BIRTH_LINE",length = 100,nullable = true)
     @FhirFieldValidate(name="BIRTH_LINE",displayName="出生地-乡（镇、街道办事处）",maxLength=100,required=false,valuesRange="")   
     private String birthLine;
    /**
     *名称:出生地-村（街、路、弄等）
     *
 	 *
 	 *
     */
     @Column(name="BIRTH_ROAD",length = 100,nullable = true)
     @FhirFieldValidate(name="BIRTH_ROAD",displayName="出生地-村（街、路、弄等）",maxLength=100,required=false,valuesRange="")   
     private String birthRoad;
    /**
     *名称:出生地-门牌号码
     *
 	 *
 	 *
     */
     @Column(name="BIRTH_HOUSE_NO",length = 50,nullable = true)
     @FhirFieldValidate(name="BIRTH_HOUSE_NO",displayName="出生地-门牌号码",maxLength=50,required=false,valuesRange="")   
     private String birthHouseNo;
    /**
     *名称:户籍登记所在地址的省、自治区或直辖市名称
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="RPR_ADDR_PROVINCE",length = 50,nullable = true)
     @FhirFieldValidate(name="RPR_ADDR_PROVINCE",displayName="户籍登记所在地址的省、自治区或直辖市名称",maxLength=50,required=false,valuesRange="GBT2260")   
     private String rprAddrProvince;
    /**
     *名称:户籍登记所在地址的市、地区或州的名称
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="RPR_ADDR_CITY",length = 50,nullable = true)
     @FhirFieldValidate(name="RPR_ADDR_CITY",displayName="户籍登记所在地址的市、地区或州的名称",maxLength=50,required=false,valuesRange="GBT2260")   
     private String rprAddrCity;
    /**
     *名称:户籍登记所在地址的县（区）的名称
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="RPR_ADDR_AREA",length = 50,nullable = true)
     @FhirFieldValidate(name="RPR_ADDR_AREA",displayName="户籍登记所在地址的县（区）的名称",maxLength=50,required=false,valuesRange="GBT2260")   
     private String rprAddrArea;
    /**
     *名称:户籍登记所在地址的乡、镇或城市的街道办事处名称
     *
 	 *
 	 *
     */
     @Column(name="RPR_ADDR_STREET",length = 100,nullable = true)
     @FhirFieldValidate(name="RPR_ADDR_STREET",displayName="户籍登记所在地址的乡、镇或城市的街道办事处名称",maxLength=100,required=false,valuesRange="")   
     private String rprAddrStreet;
    /**
     *名称:户籍登记所在地址的村或城市的街、路、里、弄等名称
     *
 	 *
 	 *
     */
     @Column(name="RPR_ADDR_VILLAGE",length = 100,nullable = true)
     @FhirFieldValidate(name="RPR_ADDR_VILLAGE",displayName="户籍登记所在地址的村或城市的街、路、里、弄等名称",maxLength=100,required=false,valuesRange="")   
     private String rprAddrVillage;
    /**
     *名称:户籍登记所在地址的门牌号码
     *
 	 *
 	 *
     */
     @Column(name="RPR_ADDR_HOUSE",length = 50,nullable = true)
     @FhirFieldValidate(name="RPR_ADDR_HOUSE",displayName="户籍登记所在地址的门牌号码",maxLength=50,required=false,valuesRange="")   
     private String rprAddrHouse;
    /**
     *名称:户口地址邮编
     *
 	 *
 	 *
     */
     @Column(name="RPR_POST",length = 50,nullable = true)
     @FhirFieldValidate(name="RPR_POST",displayName="户口地址邮编",maxLength=50,required=false,valuesRange="")   
     private String rprPost;
    /**
     *名称:户口电话
     *
 	 *
 	 *
     */
     @Column(name="RPR_PHONE",length = 50,nullable = true)
     @FhirFieldValidate(name="RPR_PHONE",displayName="户口电话",maxLength=50,required=false,valuesRange="")   
     private String rprPhone;
    /**
     *名称:户口地址
     *
 	 *
 	 *
     */
     @Column(name="RPR_ADDR",length = 100,nullable = true)
     @FhirFieldValidate(name="RPR_ADDR",displayName="户口地址",maxLength=100,required=false,valuesRange="")   
     private String rprAddr;
    /**
     *名称:籍贯-省代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="NATIVE_PROVINCE",length = 20,nullable = true)
     @FhirFieldValidate(name="NATIVE_PROVINCE",displayName="籍贯-省代码",maxLength=20,required=false,valuesRange="GBT2260")   
     private String nativeProvince;
    /**
     *名称:籍贯-市代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="NATIVE_CITY",length = 20,nullable = true)
     @FhirFieldValidate(name="NATIVE_CITY",displayName="籍贯-市代码",maxLength=20,required=false,valuesRange="GBT2260")   
     private String nativeCity;
    /**
     *名称:行政区划代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="ADMINISTRATION",length = 20,nullable = true)
     @FhirFieldValidate(name="ADMINISTRATION",displayName="行政区划代码",maxLength=20,required=false,valuesRange="GBT2260")   
     private String administration;
    /**
     *名称:民族代码
     *
 	 *限制:CV9900377
 	 *
     */
     @Column(name="NATION_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="NATION_CD",displayName="民族代码",maxLength=20,required=false,valuesRange="CV9900377")   
     private String nationCd;
    /**
     *名称:国籍代码
     *
 	 *限制:GBT2659
 	 *
     */
     @Column(name="NATIONALITY_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="NATIONALITY_CODE",displayName="国籍代码",maxLength=20,required=false,valuesRange="GBT2659")   
     private String nationalityCode;
    /**
     *名称:职业代码
     *
 	 *限制:GBT22614
 	 *
     */
     @Column(name="OCCUPATION_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="OCCUPATION_CD",displayName="职业代码",maxLength=20,required=false,valuesRange="GBT22614")   
     private String occupationCd;
    /**
     *名称:医疗保险类别代码
     *
 	 *限制:CV9900281
 	 *
     */
     @Column(name="MEDICAL_INSURANCE_CATEGORY",length = 20,nullable = false)
     @FhirFieldValidate(name="MEDICAL_INSURANCE_CATEGORY",displayName="医疗保险类别代码",maxLength=20,required=true,valuesRange="CV9900281")   
     private String medicalInsuranceCategory;
    /**
     *名称:工作单位
     *
 	 *
 	 *
     */
     @Column(name="WORK_UNIT",length = 100,nullable = true)
     @FhirFieldValidate(name="WORK_UNIT",displayName="工作单位",maxLength=100,required=false,valuesRange="")   
     private String workUnit;
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
     *名称:是否有过敏史
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_RRITABILITY",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_RRITABILITY",displayName="是否有过敏史",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifRritability;
    /**
     *名称:过敏史其他描述
     *
 	 *
 	 *
     */
     @Column(name="RRITABILITY",length = 1000,nullable = true)
     @FhirFieldValidate(name="RRITABILITY",displayName="过敏史其他描述",maxLength=1000,required=false,valuesRange="")   
     private String rritability;
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
     *名称:RH阴性代码
     *
 	 *限制:CV9900361
 	 *
     */
     @Column(name="RH_NEG_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="RH_NEG_CD",displayName="RH阴性代码",maxLength=20,required=false,valuesRange="CV9900361")   
     private String rhNegCd;
    /**
     *名称:宗教信仰代码
     *
 	 *限制:GA21412
 	 *
     */
     @Column(name="RELIGION_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="RELIGION_CODE",displayName="宗教信仰代码",maxLength=20,required=false,valuesRange="GA21412")   
     private String religionCode;
    /**
     *名称:英文姓名
     *
 	 *
 	 *
     */
     @Column(name="ENGLISH_NAME",length = 50,nullable = true)
     @FhirFieldValidate(name="ENGLISH_NAME",displayName="英文姓名",maxLength=50,required=false,valuesRange="")   
     private String englishName;
    /**
     *名称:死亡日期
     *
 	 *
 	 *
     */
     @Column(name="DIE_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DIE_DATE",displayName="死亡日期",required=false,valuesRange="")   
     private Date dieDate;
    /**
     *名称:新生儿体重
     *
 	 *
 	 *
     */
     @Column(name="BODY_WEIGHT",length = 8,nullable = true)
     @FhirFieldValidate(name="BODY_WEIGHT",displayName="新生儿体重",maxLength=8,required=false,valuesRange="")   
     private Float bodyWeight;
    /**
     *名称:新生儿入院时体重
     *
 	 *
 	 *
     */
     @Column(name="INPAT_WEIGHT",length = 8,nullable = true)
     @FhirFieldValidate(name="INPAT_WEIGHT",displayName="新生儿入院时体重",maxLength=8,required=false,valuesRange="")   
     private Float inpatWeight;
    /**
     *名称:学历代码
     *
 	 *限制:GBT4658
 	 *
     */
     @Column(name="EDUCATION_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="EDUCATION_CD",displayName="学历代码",maxLength=20,required=false,valuesRange="GBT4658")   
     private String educationCd;
    /**
     *名称:常住地址户籍标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="USUAL_TYPE_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="USUAL_TYPE_MARK",displayName="常住地址户籍标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean usualTypeMark;
    /**
     *名称:服务处所
     *
 	 *
 	 *
     */
     @Column(name="SERVICE_PREMISES",length = 100,nullable = true)
     @FhirFieldValidate(name="SERVICE_PREMISES",displayName="服务处所",maxLength=100,required=false,valuesRange="")   
     private String servicePremises;
    /**
     *名称:服务处所类型代码
     *
 	 *限制:CV9900292
 	 *
     */
     @Column(name="SERVICE_PREMISES_TYPE_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="SERVICE_PREMISES_TYPE_CD",displayName="服务处所类型代码",maxLength=20,required=false,valuesRange="CV9900292")   
     private String servicePremisesTypeCd;
    /**
     *名称:进入服务场所日期
     *
 	 *
 	 *
     */
     @Column(name="IN_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="IN_DATE",displayName="进入服务场所日期",required=false,valuesRange="")   
     private Date inDate;
    /**
     *名称:进入原因代码
     *
 	 *限制:CV9900295
 	 *
     */
     @Column(name="IN_REASON_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="IN_REASON_CD",displayName="进入原因代码",maxLength=20,required=false,valuesRange="CV9900295")   
     private String inReasonCd;
    /**
     *名称:退出日期
     *
 	 *
 	 *
     */
     @Column(name="OUT_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="OUT_DATE",displayName="退出日期",required=false,valuesRange="")   
     private Date outDate;
    /**
     *名称:退出原因代码
     *
 	 *限制:CV9900296
 	 *
     */
     @Column(name="OUT_REASON_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="OUT_REASON_CD",displayName="退出原因代码",maxLength=20,required=false,valuesRange="CV9900296")   
     private String outReasonCd;
    /**
     *名称:管理单位号码
     *
 	 *
 	 *
     */
     @Column(name="MANAGE_UNIT_NO",length = 100,nullable = true)
     @FhirFieldValidate(name="MANAGE_UNIT_NO",displayName="管理单位号码",maxLength=100,required=false,valuesRange="")   
     private String manageUnitNo;
    /**
     *名称:退伍军人标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="VETERANS_MILITARY_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="VETERANS_MILITARY_MARK",displayName="退伍军人标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean veteransMilitaryMark;
    /**
     *名称:卡号
     *
 	 *
 	 *
     */
     @Column(name="CARD_NO",length = 50,nullable = true)
     @FhirFieldValidate(name="CARD_NO",displayName="卡号",maxLength=50,required=false,valuesRange="")   
     private String cardNo;
    /**
     *名称:发卡地区
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="CARD_AREA",length = 20,nullable = true)
     @FhirFieldValidate(name="CARD_AREA",displayName="发卡地区",maxLength=20,required=false,valuesRange="GBT2260")   
     private String cardArea;
    /**
     *名称:保险类型
     *
 	 *
 	 *
     */
     @Column(name="INSURE_TYPE",length = 20,nullable = true)
     @FhirFieldValidate(name="INSURE_TYPE",displayName="保险类型",maxLength=20,required=false,valuesRange="")   
     private String insureType;
    /**
     *名称:医疗待遇代码
     *
 	 *
 	 *
     */
     @Column(name="MEDICAL_TREATMENT_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="MEDICAL_TREATMENT_CD",displayName="医疗待遇代码",maxLength=20,required=false,valuesRange="")   
     private String medicalTreatmentCd;
    /**
     *名称:患者就诊类别描述
     *
 	 *
 	 *
     */
     @Column(name="PATIENT_TYPE_DESCR",length = 50,nullable = true)
     @FhirFieldValidate(name="PATIENT_TYPE_DESCR",displayName="患者就诊类别描述",maxLength=50,required=false,valuesRange="")   
     private String patientTypeDescr;
    /**
     *名称:责任医师id
     *
 	 *
 	 *
     */
     @Column(name="RESPONS_DOC_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="RESPONS_DOC_CODE",displayName="责任医师id",maxLength=20,required=false,valuesRange="")   
     private String responsDocCode;
    /**
     *名称:其他职业描述
     *
 	 *
 	 *
     */
     @Column(name="OTHER_OCCC_DESCR",length = 100,nullable = true)
     @FhirFieldValidate(name="OTHER_OCCC_DESCR",displayName="其他职业描述",maxLength=100,required=false,valuesRange="")   
     private String otherOcccDescr;
    /**
     *名称:发证机关
     *
 	 *
 	 *
     */
     @Column(name="ISSUING_AGENCY",length = 100,nullable = true)
     @FhirFieldValidate(name="ISSUING_AGENCY",displayName="发证机关",maxLength=100,required=false,valuesRange="")   
     private String issuingAgency;
    /**
     *名称:发证机关所在地
     *
 	 *
 	 *
     */
     @Column(name="ISSUING_AGENCY_CD",length = 100,nullable = true)
     @FhirFieldValidate(name="ISSUING_AGENCY_CD",displayName="发证机关所在地",maxLength=100,required=false,valuesRange="")   
     private String issuingAgencyCd;
    /**
     *名称:有效期
     *
 	 *
 	 *
     */
     @Column(name="VALID_DATE",length = 50,nullable = true)
     @FhirFieldValidate(name="VALID_DATE",displayName="有效期",maxLength=50,required=false,valuesRange="")   
     private String validDate;
    /**
     *名称:建档日期
     *
 	 *
 	 *
     */
     @Column(name="REGISTER_DATE",nullable = false)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="REGISTER_DATE",displayName="建档日期",required=true,valuesRange="")   
     private Date registerDate;
    /**
     *名称:建档人员代码
     *
 	 *
 	 *
     */
     @Column(name="REGISTER_PERSON_CODE",length = 50,nullable = true)
     @FhirFieldValidate(name="REGISTER_PERSON_CODE",displayName="建档人员代码",maxLength=50,required=false,valuesRange="")   
     private String registerPersonCode;
    /**
     *名称:建档人员姓名
     *
 	 *
 	 *
     */
     @Column(name="REGISTER_PERSON_NAME",length = 50,nullable = false)
     @FhirFieldValidate(name="REGISTER_PERSON_NAME",displayName="建档人员姓名",maxLength=50,required=true,valuesRange="")   
     private String registerPersonName;
    /**
     *名称:注册机构代码
     *
 	 *
 	 *
     */
     @Column(name="REGISTER_ORG_CODE",length = 50,nullable = false)
     @FhirFieldValidate(name="REGISTER_ORG_CODE",displayName="注册机构代码",maxLength=50,required=true,valuesRange="")   
     private String registerOrgCode;
    /**
     *名称:注册机构名称
     *
 	 *
 	 *
     */
     @Column(name="REGISTER_ORG_NAME",length = 50,nullable = false)
     @FhirFieldValidate(name="REGISTER_ORG_NAME",displayName="注册机构名称",maxLength=50,required=true,valuesRange="")   
     private String registerOrgName;
    /**
     *名称:建档医疗机构代码
     *
 	 *
 	 *
     */
     @Column(name="CONSTR_ORG_CODE",length = 50,nullable = true)
     @FhirFieldValidate(name="CONSTR_ORG_CODE",displayName="建档医疗机构代码",maxLength=50,required=false,valuesRange="")   
     private String constrOrgCode;
    /**
     *名称:开发商机构代码
     *
 	 *
 	 *
     */
     @Column(name="PROVIDER_ORG_CODE",length = 50,nullable = true)
     @FhirFieldValidate(name="PROVIDER_ORG_CODE",displayName="开发商机构代码",maxLength=50,required=false,valuesRange="")   
     private String providerOrgCode;
    /**
     *名称:备注
     *
 	 *
 	 *
     */
     @Column(name="REMARK",length = 200,nullable = true)
     @FhirFieldValidate(name="REMARK",displayName="备注",maxLength=200,required=false,valuesRange="")   
     private String remark;
     @javax.persistence.OrderBy("upTime DESC")
     @OneToMany(mappedBy="patient",cascade=CascadeType.ALL,fetch=javax.persistence.FetchType.EAGER)
     @org.hibernate.annotations.Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
     private List<PatientTelecom> patientTelecoms;
    
     public String getPatientId(){
       	return this.patientId;
     }
     public void setPatientId(String patientId){
       	this.patientId=patientId;
     }
     public String getPatientServiceNo(){
       	return this.patientServiceNo;
     }
     public void setPatientServiceNo(String patientServiceNo){
       	this.patientServiceNo=patientServiceNo;
     }
     public String getIdTypeCode(){
       	return this.idTypeCode;
     }
     public void setIdTypeCode(String idTypeCode){
       	this.idTypeCode=idTypeCode;
     }
     public String getIdNo(){
       	return this.idNo;
     }
     public void setIdNo(String idNo){
       	this.idNo=idNo;
     }
     public String getSocialInsuranceCard(){
       	return this.socialInsuranceCard;
     }
     public void setSocialInsuranceCard(String socialInsuranceCard){
       	this.socialInsuranceCard=socialInsuranceCard;
     }
     public String getMedicalInsuranceCard(){
       	return this.medicalInsuranceCard;
     }
     public void setMedicalInsuranceCard(String medicalInsuranceCard){
       	this.medicalInsuranceCard=medicalInsuranceCard;
     }
     public String getHealthFileNumber(){
       	return this.healthFileNumber;
     }
     public void setHealthFileNumber(String healthFileNumber){
       	this.healthFileNumber=healthFileNumber;
     }
     public String getNcmsCard(){
       	return this.ncmsCard;
     }
     public void setNcmsCard(String ncmsCard){
       	this.ncmsCard=ncmsCard;
     }
     public String getHealthCard(){
       	return this.healthCard;
     }
     public void setHealthCard(String healthCard){
       	this.healthCard=healthCard;
     }
     public String getHealthCardTemp(){
       	return this.healthCardTemp;
     }
     public void setHealthCardTemp(String healthCardTemp){
       	this.healthCardTemp=healthCardTemp;
     }
     public String getName(){
       	return this.name;
     }
     public void setName(String name){
       	this.name=name;
     }
     public Integer getAge(){
       	return this.age;
     }
     public void setAge(Integer age){
       	this.age=age;
     }
     public Integer getExactAge(){
       	return this.exactAge;
     }
     public void setExactAge(Integer exactAge){
       	this.exactAge=exactAge;
     }
     public String getHomePhone(){
       	return this.homePhone;
     }
     public void setHomePhone(String homePhone){
       	this.homePhone=homePhone;
     }
     public String getWorkPhone(){
       	return this.workPhone;
     }
     public void setWorkPhone(String workPhone){
       	this.workPhone=workPhone;
     }
     public String getMobilePhone(){
       	return this.mobilePhone;
     }
     public void setMobilePhone(String mobilePhone){
       	this.mobilePhone=mobilePhone;
     }
     public String getTempPhone(){
       	return this.tempPhone;
     }
     public void setTempPhone(String tempPhone){
       	this.tempPhone=tempPhone;
     }
     public String getTempEmail(){
       	return this.tempEmail;
     }
     public void setTempEmail(String tempEmail){
       	this.tempEmail=tempEmail;
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
     public String getMaritalstatus(){
       	return this.maritalstatus;
     }
     public void setMaritalstatus(String maritalstatus){
       	this.maritalstatus=maritalstatus;
     }
     public String getHomeState(){
       	return this.homeState;
     }
     public void setHomeState(String homeState){
       	this.homeState=homeState;
     }
     public String getHomeCity(){
       	return this.homeCity;
     }
     public void setHomeCity(String homeCity){
       	this.homeCity=homeCity;
     }
     public String getHomeDistrict(){
       	return this.homeDistrict;
     }
     public void setHomeDistrict(String homeDistrict){
       	this.homeDistrict=homeDistrict;
     }
     public String getHomeLine(){
       	return this.homeLine;
     }
     public void setHomeLine(String homeLine){
       	this.homeLine=homeLine;
     }
     public String getHomeRoad(){
       	return this.homeRoad;
     }
     public void setHomeRoad(String homeRoad){
       	this.homeRoad=homeRoad;
     }
     public String getHomeHouseNo(){
       	return this.homeHouseNo;
     }
     public void setHomeHouseNo(String homeHouseNo){
       	this.homeHouseNo=homeHouseNo;
     }
     public String getHomeText(){
       	return this.homeText;
     }
     public void setHomeText(String homeText){
       	this.homeText=homeText;
     }
     public String getTempState(){
       	return this.tempState;
     }
     public void setTempState(String tempState){
       	this.tempState=tempState;
     }
     public String getTempCity(){
       	return this.tempCity;
     }
     public void setTempCity(String tempCity){
       	this.tempCity=tempCity;
     }
     public String getTempDistrict(){
       	return this.tempDistrict;
     }
     public void setTempDistrict(String tempDistrict){
       	this.tempDistrict=tempDistrict;
     }
     public String getTempLine(){
       	return this.tempLine;
     }
     public void setTempLine(String tempLine){
       	this.tempLine=tempLine;
     }
     public String getTempRoad(){
       	return this.tempRoad;
     }
     public void setTempRoad(String tempRoad){
       	this.tempRoad=tempRoad;
     }
     public String getTempHouseNo(){
       	return this.tempHouseNo;
     }
     public void setTempHouseNo(String tempHouseNo){
       	this.tempHouseNo=tempHouseNo;
     }
     public String getTempText(){
       	return this.tempText;
     }
     public void setTempText(String tempText){
       	this.tempText=tempText;
     }
     public String getTempPostCd(){
       	return this.tempPostCd;
     }
     public void setTempPostCd(String tempPostCd){
       	this.tempPostCd=tempPostCd;
     }
     public String getWorkState(){
       	return this.workState;
     }
     public void setWorkState(String workState){
       	this.workState=workState;
     }
     public String getWorkCity(){
       	return this.workCity;
     }
     public void setWorkCity(String workCity){
       	this.workCity=workCity;
     }
     public String getWorkDistrict(){
       	return this.workDistrict;
     }
     public void setWorkDistrict(String workDistrict){
       	this.workDistrict=workDistrict;
     }
     public String getWorkLine(){
       	return this.workLine;
     }
     public void setWorkLine(String workLine){
       	this.workLine=workLine;
     }
     public String getWorkRoad(){
       	return this.workRoad;
     }
     public void setWorkRoad(String workRoad){
       	this.workRoad=workRoad;
     }
     public String getWorkHouseNo(){
       	return this.workHouseNo;
     }
     public void setWorkHouseNo(String workHouseNo){
       	this.workHouseNo=workHouseNo;
     }
     public String getWorkText(){
       	return this.workText;
     }
     public void setWorkText(String workText){
       	this.workText=workText;
     }
     public String getWorkPostCd(){
       	return this.workPostCd;
     }
     public void setWorkPostCd(String workPostCd){
       	this.workPostCd=workPostCd;
     }
     public String getBirthState(){
       	return this.birthState;
     }
     public void setBirthState(String birthState){
       	this.birthState=birthState;
     }
     public String getBirthCity(){
       	return this.birthCity;
     }
     public void setBirthCity(String birthCity){
       	this.birthCity=birthCity;
     }
     public String getBirthDistrict(){
       	return this.birthDistrict;
     }
     public void setBirthDistrict(String birthDistrict){
       	this.birthDistrict=birthDistrict;
     }
     public String getBirthLine(){
       	return this.birthLine;
     }
     public void setBirthLine(String birthLine){
       	this.birthLine=birthLine;
     }
     public String getBirthRoad(){
       	return this.birthRoad;
     }
     public void setBirthRoad(String birthRoad){
       	this.birthRoad=birthRoad;
     }
     public String getBirthHouseNo(){
       	return this.birthHouseNo;
     }
     public void setBirthHouseNo(String birthHouseNo){
       	this.birthHouseNo=birthHouseNo;
     }
     public String getRprAddrProvince(){
       	return this.rprAddrProvince;
     }
     public void setRprAddrProvince(String rprAddrProvince){
       	this.rprAddrProvince=rprAddrProvince;
     }
     public String getRprAddrCity(){
       	return this.rprAddrCity;
     }
     public void setRprAddrCity(String rprAddrCity){
       	this.rprAddrCity=rprAddrCity;
     }
     public String getRprAddrArea(){
       	return this.rprAddrArea;
     }
     public void setRprAddrArea(String rprAddrArea){
       	this.rprAddrArea=rprAddrArea;
     }
     public String getRprAddrStreet(){
       	return this.rprAddrStreet;
     }
     public void setRprAddrStreet(String rprAddrStreet){
       	this.rprAddrStreet=rprAddrStreet;
     }
     public String getRprAddrVillage(){
       	return this.rprAddrVillage;
     }
     public void setRprAddrVillage(String rprAddrVillage){
       	this.rprAddrVillage=rprAddrVillage;
     }
     public String getRprAddrHouse(){
       	return this.rprAddrHouse;
     }
     public void setRprAddrHouse(String rprAddrHouse){
       	this.rprAddrHouse=rprAddrHouse;
     }
     public String getRprPost(){
       	return this.rprPost;
     }
     public void setRprPost(String rprPost){
       	this.rprPost=rprPost;
     }
     public String getRprPhone(){
       	return this.rprPhone;
     }
     public void setRprPhone(String rprPhone){
       	this.rprPhone=rprPhone;
     }
     public String getRprAddr(){
       	return this.rprAddr;
     }
     public void setRprAddr(String rprAddr){
       	this.rprAddr=rprAddr;
     }
     public String getNativeProvince(){
       	return this.nativeProvince;
     }
     public void setNativeProvince(String nativeProvince){
       	this.nativeProvince=nativeProvince;
     }
     public String getNativeCity(){
       	return this.nativeCity;
     }
     public void setNativeCity(String nativeCity){
       	this.nativeCity=nativeCity;
     }
     public String getAdministration(){
       	return this.administration;
     }
     public void setAdministration(String administration){
       	this.administration=administration;
     }
     public String getNationCd(){
       	return this.nationCd;
     }
     public void setNationCd(String nationCd){
       	this.nationCd=nationCd;
     }
     public String getNationalityCode(){
       	return this.nationalityCode;
     }
     public void setNationalityCode(String nationalityCode){
       	this.nationalityCode=nationalityCode;
     }
     public String getOccupationCd(){
       	return this.occupationCd;
     }
     public void setOccupationCd(String occupationCd){
       	this.occupationCd=occupationCd;
     }
     public String getMedicalInsuranceCategory(){
       	return this.medicalInsuranceCategory;
     }
     public void setMedicalInsuranceCategory(String medicalInsuranceCategory){
       	this.medicalInsuranceCategory=medicalInsuranceCategory;
     }
     public String getWorkUnit(){
       	return this.workUnit;
     }
     public void setWorkUnit(String workUnit){
       	this.workUnit=workUnit;
     }
     public String getPatientType(){
       	return this.patientType;
     }
     public void setPatientType(String patientType){
       	this.patientType=patientType;
     }
     public Boolean getIfRritability(){
       	return this.ifRritability;
     }
     public void setIfRritability(Boolean ifRritability){
       	this.ifRritability=ifRritability;
     }
     public String getRritability(){
       	return this.rritability;
     }
     public void setRritability(String rritability){
       	this.rritability=rritability;
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
     public String getRhNegCd(){
       	return this.rhNegCd;
     }
     public void setRhNegCd(String rhNegCd){
       	this.rhNegCd=rhNegCd;
     }
     public String getReligionCode(){
       	return this.religionCode;
     }
     public void setReligionCode(String religionCode){
       	this.religionCode=religionCode;
     }
     public String getEnglishName(){
       	return this.englishName;
     }
     public void setEnglishName(String englishName){
       	this.englishName=englishName;
     }
     public Date getDieDate(){
       	return this.dieDate;
     }
     public void setDieDate(Date dieDate){
       	this.dieDate=dieDate;
     }
     public Float getBodyWeight(){
       	return this.bodyWeight;
     }
     public void setBodyWeight(Float bodyWeight){
       	this.bodyWeight=bodyWeight;
     }
     public Float getInpatWeight(){
       	return this.inpatWeight;
     }
     public void setInpatWeight(Float inpatWeight){
       	this.inpatWeight=inpatWeight;
     }
     public String getEducationCd(){
       	return this.educationCd;
     }
     public void setEducationCd(String educationCd){
       	this.educationCd=educationCd;
     }
     public Boolean getUsualTypeMark(){
       	return this.usualTypeMark;
     }
     public void setUsualTypeMark(Boolean usualTypeMark){
       	this.usualTypeMark=usualTypeMark;
     }
     public String getServicePremises(){
       	return this.servicePremises;
     }
     public void setServicePremises(String servicePremises){
       	this.servicePremises=servicePremises;
     }
     public String getServicePremisesTypeCd(){
       	return this.servicePremisesTypeCd;
     }
     public void setServicePremisesTypeCd(String servicePremisesTypeCd){
       	this.servicePremisesTypeCd=servicePremisesTypeCd;
     }
     public Date getInDate(){
       	return this.inDate;
     }
     public void setInDate(Date inDate){
       	this.inDate=inDate;
     }
     public String getInReasonCd(){
       	return this.inReasonCd;
     }
     public void setInReasonCd(String inReasonCd){
       	this.inReasonCd=inReasonCd;
     }
     public Date getOutDate(){
       	return this.outDate;
     }
     public void setOutDate(Date outDate){
       	this.outDate=outDate;
     }
     public String getOutReasonCd(){
       	return this.outReasonCd;
     }
     public void setOutReasonCd(String outReasonCd){
       	this.outReasonCd=outReasonCd;
     }
     public String getManageUnitNo(){
       	return this.manageUnitNo;
     }
     public void setManageUnitNo(String manageUnitNo){
       	this.manageUnitNo=manageUnitNo;
     }
     public Boolean getVeteransMilitaryMark(){
       	return this.veteransMilitaryMark;
     }
     public void setVeteransMilitaryMark(Boolean veteransMilitaryMark){
       	this.veteransMilitaryMark=veteransMilitaryMark;
     }
     public String getCardNo(){
       	return this.cardNo;
     }
     public void setCardNo(String cardNo){
       	this.cardNo=cardNo;
     }
     public String getCardArea(){
       	return this.cardArea;
     }
     public void setCardArea(String cardArea){
       	this.cardArea=cardArea;
     }
     public String getInsureType(){
       	return this.insureType;
     }
     public void setInsureType(String insureType){
       	this.insureType=insureType;
     }
     public String getMedicalTreatmentCd(){
       	return this.medicalTreatmentCd;
     }
     public void setMedicalTreatmentCd(String medicalTreatmentCd){
       	this.medicalTreatmentCd=medicalTreatmentCd;
     }
     public String getPatientTypeDescr(){
       	return this.patientTypeDescr;
     }
     public void setPatientTypeDescr(String patientTypeDescr){
       	this.patientTypeDescr=patientTypeDescr;
     }
     public String getResponsDocCode(){
       	return this.responsDocCode;
     }
     public void setResponsDocCode(String responsDocCode){
       	this.responsDocCode=responsDocCode;
     }
     public String getOtherOcccDescr(){
       	return this.otherOcccDescr;
     }
     public void setOtherOcccDescr(String otherOcccDescr){
       	this.otherOcccDescr=otherOcccDescr;
     }
     public String getIssuingAgency(){
       	return this.issuingAgency;
     }
     public void setIssuingAgency(String issuingAgency){
       	this.issuingAgency=issuingAgency;
     }
     public String getIssuingAgencyCd(){
       	return this.issuingAgencyCd;
     }
     public void setIssuingAgencyCd(String issuingAgencyCd){
       	this.issuingAgencyCd=issuingAgencyCd;
     }
     public String getValidDate(){
       	return this.validDate;
     }
     public void setValidDate(String validDate){
       	this.validDate=validDate;
     }
     public Date getRegisterDate(){
       	return this.registerDate;
     }
     public void setRegisterDate(Date registerDate){
       	this.registerDate=registerDate;
     }
     public String getRegisterPersonCode(){
       	return this.registerPersonCode;
     }
     public void setRegisterPersonCode(String registerPersonCode){
       	this.registerPersonCode=registerPersonCode;
     }
     public String getRegisterPersonName(){
       	return this.registerPersonName;
     }
     public void setRegisterPersonName(String registerPersonName){
       	this.registerPersonName=registerPersonName;
     }
     public String getRegisterOrgCode(){
       	return this.registerOrgCode;
     }
     public void setRegisterOrgCode(String registerOrgCode){
       	this.registerOrgCode=registerOrgCode;
     }
     public String getRegisterOrgName(){
       	return this.registerOrgName;
     }
     public void setRegisterOrgName(String registerOrgName){
       	this.registerOrgName=registerOrgName;
     }
     public String getConstrOrgCode(){
       	return this.constrOrgCode;
     }
     public void setConstrOrgCode(String constrOrgCode){
       	this.constrOrgCode=constrOrgCode;
     }
     public String getProviderOrgCode(){
       	return this.providerOrgCode;
     }
     public void setProviderOrgCode(String providerOrgCode){
       	this.providerOrgCode=providerOrgCode;
     }
     public String getRemark(){
       	return this.remark;
     }
     public void setRemark(String remark){
       	this.remark=remark;
     }
     public List<PatientTelecom> getPatientTelecoms(){
       	return this.patientTelecoms;
    }
     public void setPatientTelecoms(List<PatientTelecom> patientTelecoms){
        this.patientTelecoms=patientTelecoms;
    }
}