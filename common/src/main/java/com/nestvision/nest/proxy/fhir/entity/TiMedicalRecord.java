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
@Table(name = BaseEntity.TABLE_PREFIX + "TI_MEDICAL_RECORD")
public class TiMedicalRecord extends FhirResourceEntity {

    /**
     *名称:院内中医住院病案首页id
     *
 	 *
 	 *主键字段
     */
     @Column(name="TCM_INPATIENT_MEDICAL_RECORD_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="TCM_INPATIENT_MEDICAL_RECORD_ID",displayName="院内中医住院病案首页id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String tcmInpatientMedicalRecordId;
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
     @Column(name="PATIENT_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="PATIENT_ID",displayName="院内患者ID",maxLength=40,required=true,valuesRange="")   
     private String patientId;
    /**
     *名称:院内就诊卡
     *
 	 *
 	 *
     */
     @Column(name="PATIENT_SERVICE_NO",length = 40,nullable = true)
     @FhirFieldValidate(name="PATIENT_SERVICE_NO",displayName="院内就诊卡",maxLength=40,required=false,valuesRange="")   
     private String patientServiceNo;
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
     *名称:电话号码
     *
 	 *
 	 *
     */
     @Column(name="PHONE",length = 40,nullable = true)
     @FhirFieldValidate(name="PHONE",displayName="电话号码",maxLength=40,required=false,valuesRange="")   
     private String phone;
    /**
     *名称:工作单位电话号码
     *
 	 *
 	 *
     */
     @Column(name="WORK_PHONE",length = 40,nullable = true)
     @FhirFieldValidate(name="WORK_PHONE",displayName="工作单位电话号码",maxLength=40,required=false,valuesRange="")   
     private String workPhone;
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
     *名称:现居住地址-邮政编码
     *
 	 *
 	 *
     */
     @Column(name="TEMP_POST_CD",length = 50,nullable = true)
     @FhirFieldValidate(name="TEMP_POST_CD",displayName="现居住地址-邮政编码",maxLength=50,required=false,valuesRange="")   
     private String tempPostCd;
    /**
     *名称:工作地址-省（自治区、直辖市）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="WORK_STATE",length = 10,nullable = true)
     @FhirFieldValidate(name="WORK_STATE",displayName="工作地址-省（自治区、直辖市）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String workState;
    /**
     *名称:工作地址-市（地区）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="WORK_CITY",length = 10,nullable = true)
     @FhirFieldValidate(name="WORK_CITY",displayName="工作地址-市（地区）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String workCity;
    /**
     *名称:工作地址-县（区）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="WORK_DISTRICT",length = 10,nullable = true)
     @FhirFieldValidate(name="WORK_DISTRICT",displayName="工作地址-县（区）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String workDistrict;
    /**
     *名称:工作地址-乡（镇、街道办事处）
     *
 	 *
 	 *
     */
     @Column(name="WORK_LINE",length = 100,nullable = true)
     @FhirFieldValidate(name="WORK_LINE",displayName="工作地址-乡（镇、街道办事处）",maxLength=100,required=false,valuesRange="")   
     private String workLine;
    /**
     *名称:工作地址-村（街、路、弄等）
     *
 	 *
 	 *
     */
     @Column(name="WORK_ROAD",length = 100,nullable = true)
     @FhirFieldValidate(name="WORK_ROAD",displayName="工作地址-村（街、路、弄等）",maxLength=100,required=false,valuesRange="")   
     private String workRoad;
    /**
     *名称:工作地址-门牌号码
     *
 	 *
 	 *
     */
     @Column(name="WORK_HOUSE_NO",length = 50,nullable = true)
     @FhirFieldValidate(name="WORK_HOUSE_NO",displayName="工作地址-门牌号码",maxLength=50,required=false,valuesRange="")   
     private String workHouseNo;
    /**
     *名称:工作地址-邮政编码
     *
 	 *
 	 *
     */
     @Column(name="WORK_POST_CD",length = 50,nullable = true)
     @FhirFieldValidate(name="WORK_POST_CD",displayName="工作地址-邮政编码",maxLength=50,required=false,valuesRange="")   
     private String workPostCd;
    /**
     *名称:婚姻状况代码
     *
 	 *限制:GBT22612
 	 *
     */
     @Column(name="MARITALSTATUS",length = 20,nullable = true)
     @FhirFieldValidate(name="MARITALSTATUS",displayName="婚姻状况代码",maxLength=20,required=false,valuesRange="GBT22612")   
     private String maritalstatus;
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
     *名称:联系人-现居住住址-省（自治区、直辖市）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="CONTACTS_STATE",length = 10,nullable = true)
     @FhirFieldValidate(name="CONTACTS_STATE",displayName="联系人-现居住住址-省（自治区、直辖市）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String contactsState;
    /**
     *名称:联系人-现居住住址-市（地区）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="CONTACTS_CITY",length = 10,nullable = true)
     @FhirFieldValidate(name="CONTACTS_CITY",displayName="联系人-现居住住址-市（地区）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String contactsCity;
    /**
     *名称:联系人-现居住住址-县（区）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="CONTACTS_DISTRICT",length = 10,nullable = true)
     @FhirFieldValidate(name="CONTACTS_DISTRICT",displayName="联系人-现居住住址-县（区）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String contactsDistrict;
    /**
     *名称:联系人-现居住住址-乡（镇、街道办事处）
     *
 	 *
 	 *
     */
     @Column(name="CONTACTS_LINE",length = 100,nullable = true)
     @FhirFieldValidate(name="CONTACTS_LINE",displayName="联系人-现居住住址-乡（镇、街道办事处）",maxLength=100,required=false,valuesRange="")   
     private String contactsLine;
    /**
     *名称:联系人-现居住住址-村（街、路、弄等）
     *
 	 *
 	 *
     */
     @Column(name="CONTACTS_ROAD",length = 100,nullable = true)
     @FhirFieldValidate(name="CONTACTS_ROAD",displayName="联系人-现居住住址-村（街、路、弄等）",maxLength=100,required=false,valuesRange="")   
     private String contactsRoad;
    /**
     *名称:联系人-现居住住址-门牌号码
     *
 	 *
 	 *
     */
     @Column(name="CONTACTS_HOUSE_NO",length = 50,nullable = true)
     @FhirFieldValidate(name="CONTACTS_HOUSE_NO",displayName="联系人-现居住住址-门牌号码",maxLength=50,required=false,valuesRange="")   
     private String contactsHouseNo;
    /**
     *名称:联系人-现居住地址邮政编码
     *
 	 *
 	 *
     */
     @Column(name="CONTACTS_POST_CD",length = 50,nullable = true)
     @FhirFieldValidate(name="CONTACTS_POST_CD",displayName="联系人-现居住地址邮政编码",maxLength=50,required=false,valuesRange="")   
     private String contactsPostCd;
    /**
     *名称:联系人-现居住址详细信息
     *
 	 *
 	 *
     */
     @Column(name="CONTACTS_ADDRESS_DETAILS",length = 50,nullable = true)
     @FhirFieldValidate(name="CONTACTS_ADDRESS_DETAILS",displayName="联系人-现居住址详细信息",maxLength=50,required=false,valuesRange="")   
     private String contactsAddressDetails;
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
 	 *
 	 *
     */
     @Column(name="MEDICAL_INSURANCE_CATEGORY",length = 20,nullable = true)
     @FhirFieldValidate(name="MEDICAL_INSURANCE_CATEGORY",displayName="医疗保险类别代码",maxLength=20,required=false,valuesRange="")   
     private String medicalInsuranceCategory;
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
     *名称:工作单位
     *
 	 *
 	 *
     */
     @Column(name="WORK_UNIT",length = 40,nullable = true)
     @FhirFieldValidate(name="WORK_UNIT",displayName="工作单位",maxLength=40,required=false,valuesRange="")   
     private String workUnit;
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
     *名称:出生地省代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="BIRTH_PRO_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="BIRTH_PRO_CODE",displayName="出生地省代码",maxLength=20,required=false,valuesRange="GBT2260")   
     private String birthProCode;
    /**
     *名称:出生地市代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="BIRTH_CITY_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="BIRTH_CITY_CODE",displayName="出生地市代码",maxLength=20,required=false,valuesRange="GBT2260")   
     private String birthCityCode;
    /**
     *名称:出生地县代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="BIRTH_COU_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="BIRTH_COU_CODE",displayName="出生地县代码",maxLength=20,required=false,valuesRange="GBT2260")   
     private String birthCouCode;
    /**
     *名称:出生地址的村或城市的街、路、里、弄等名称
     *
 	 *
 	 *
     */
     @Column(name="BIRTH_ADDRESS_VILLAGE",length = 80,nullable = true)
     @FhirFieldValidate(name="BIRTH_ADDRESS_VILLAGE",displayName="出生地址的村或城市的街、路、里、弄等名称",maxLength=80,required=false,valuesRange="")   
     private String birthAddressVillage;
    /**
     *名称:出生地址的门牌号码
     *
 	 *
 	 *
     */
     @Column(name="BIRTH_ADDRESS_HOUSE",length = 40,nullable = true)
     @FhirFieldValidate(name="BIRTH_ADDRESS_HOUSE",displayName="出生地址的门牌号码",maxLength=40,required=false,valuesRange="")   
     private String birthAddressHouse;
    /**
     *名称:出生地址的乡、镇或城市的街道办事处名称
     *
 	 *
 	 *
     */
     @Column(name="BIRTH_ADDRESS_STREET",length = 80,nullable = true)
     @FhirFieldValidate(name="BIRTH_ADDRESS_STREET",displayName="出生地址的乡、镇或城市的街道办事处名称",maxLength=80,required=false,valuesRange="")   
     private String birthAddressStreet;
    /**
     *名称:户籍登记所在地址的省、自治区或直辖市名称
     *
 	 *
 	 *
     */
     @Column(name="RPR_ADDR_PROVINCE",length = 40,nullable = true)
     @FhirFieldValidate(name="RPR_ADDR_PROVINCE",displayName="户籍登记所在地址的省、自治区或直辖市名称",maxLength=40,required=false,valuesRange="")   
     private String rprAddrProvince;
    /**
     *名称:户籍登记所在地址的市、地区或州的名称
     *
 	 *
 	 *
     */
     @Column(name="RPR_ADDR_CITY",length = 40,nullable = true)
     @FhirFieldValidate(name="RPR_ADDR_CITY",displayName="户籍登记所在地址的市、地区或州的名称",maxLength=40,required=false,valuesRange="")   
     private String rprAddrCity;
    /**
     *名称:户籍登记所在地址的县（区）的名称
     *
 	 *
 	 *
     */
     @Column(name="RPR_ADDR_AREA",length = 40,nullable = true)
     @FhirFieldValidate(name="RPR_ADDR_AREA",displayName="户籍登记所在地址的县（区）的名称",maxLength=40,required=false,valuesRange="")   
     private String rprAddrArea;
    /**
     *名称:户籍登记所在地址的乡、镇或城市的街道办事处名称
     *
 	 *
 	 *
     */
     @Column(name="RPR_ADDR_STREET",length = 80,nullable = true)
     @FhirFieldValidate(name="RPR_ADDR_STREET",displayName="户籍登记所在地址的乡、镇或城市的街道办事处名称",maxLength=80,required=false,valuesRange="")   
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
     @Column(name="RPR_ADDR_HOUSE",length = 40,nullable = true)
     @FhirFieldValidate(name="RPR_ADDR_HOUSE",displayName="户籍登记所在地址的门牌号码",maxLength=40,required=false,valuesRange="")   
     private String rprAddrHouse;
    /**
     *名称:户口地址邮编
     *
 	 *
 	 *
     */
     @Column(name="RPR_POST",length = 40,nullable = true)
     @FhirFieldValidate(name="RPR_POST",displayName="户口地址邮编",maxLength=40,required=false,valuesRange="")   
     private String rprPost;
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
     *名称:是否有过敏史
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_RRITABILITY",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_RRITABILITY",displayName="是否有过敏史",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifRritability;
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
     *名称:科主任id
     *
 	 *
 	 *
     */
     @Column(name="DEPARTMENT_HEAD_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="DEPARTMENT_HEAD_ID",displayName="科主任id",maxLength=40,required=false,valuesRange="")   
     private String departmentHeadId;
    /**
     *名称:科主任姓名
     *
 	 *
 	 *
     */
     @Column(name="DEPARTMENT_HEAD_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="DEPARTMENT_HEAD_NAME",displayName="科主任姓名",maxLength=40,required=false,valuesRange="")   
     private String departmentHeadName;
    /**
     *名称:科主任签名日期
     *
 	 *
 	 *
     */
     @Column(name="DEPARTMENT_HEAD_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DEPARTMENT_HEAD_DATE",displayName="科主任签名日期",required=false,valuesRange="")   
     private Date departmentHeadDate;
    /**
     *名称:主(副主)任医师id
     *
 	 *
 	 *
     */
     @Column(name="CHIEF_PHYSICIAN_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="CHIEF_PHYSICIAN_ID",displayName="主(副主)任医师id",maxLength=40,required=false,valuesRange="")   
     private String chiefPhysicianId;
    /**
     *名称:主(副主)任医师姓名
     *
 	 *
 	 *
     */
     @Column(name="CHIEF_PHYSICIAN_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="CHIEF_PHYSICIAN_NAME",displayName="主(副主)任医师姓名",maxLength=20,required=false,valuesRange="")   
     private String chiefPhysicianName;
    /**
     *名称:主(副主)任医师签名日期
     *
 	 *
 	 *
     */
     @Column(name="CHIEF_PHYSICIAN_SIGN_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="CHIEF_PHYSICIAN_SIGN_DATE",displayName="主(副主)任医师签名日期",required=false,valuesRange="")   
     private Date chiefPhysicianSignDate;
    /**
     *名称:主治医师id
     *
 	 *
 	 *
     */
     @Column(name="ATTENDING_DOCTOR_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="ATTENDING_DOCTOR_ID",displayName="主治医师id",maxLength=40,required=false,valuesRange="")   
     private String attendingDoctorId;
    /**
     *名称:主治医师姓名
     *
 	 *
 	 *
     */
     @Column(name="ATTENDING_DOCTOR_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="ATTENDING_DOCTOR_NAME",displayName="主治医师姓名",maxLength=20,required=false,valuesRange="")   
     private String attendingDoctorName;
    /**
     *名称:主治医师签名日期
     *
 	 *
 	 *
     */
     @Column(name="ATTENDING_DOCTOR_SIGN_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="ATTENDING_DOCTOR_SIGN_DATE",displayName="主治医师签名日期",required=false,valuesRange="")   
     private Date attendingDoctorSignDate;
    /**
     *名称:住院医师id
     *
 	 *
 	 *
     */
     @Column(name="RESIDENT_DOCTOR_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="RESIDENT_DOCTOR_ID",displayName="住院医师id",maxLength=40,required=false,valuesRange="")   
     private String residentDoctorId;
    /**
     *名称:住院医师姓名
     *
 	 *
 	 *
     */
     @Column(name="RESIDENT_DOCTOR_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="RESIDENT_DOCTOR_NAME",displayName="住院医师姓名",maxLength=20,required=false,valuesRange="")   
     private String residentDoctorName;
    /**
     *名称:住院医师签名日期
     *
 	 *
 	 *
     */
     @Column(name="RESIDENT_DOCTOR_SIGN_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="RESIDENT_DOCTOR_SIGN_DATE",displayName="住院医师签名日期",required=false,valuesRange="")   
     private Date residentDoctorSignDate;
    /**
     *名称:责任护士id
     *
 	 *
 	 *
     */
     @Column(name="RESPONSIBILITY_NURSE_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="RESPONSIBILITY_NURSE_ID",displayName="责任护士id",maxLength=40,required=false,valuesRange="")   
     private String responsibilityNurseId;
    /**
     *名称:责任护士姓名
     *
 	 *
 	 *
     */
     @Column(name="RESPONSIBILITY_NURSE_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="RESPONSIBILITY_NURSE_NAME",displayName="责任护士姓名",maxLength=40,required=false,valuesRange="")   
     private String responsibilityNurseName;
    /**
     *名称:责任护士签名日期
     *
 	 *
 	 *
     */
     @Column(name="RESPONSIBILITY_NURSE_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="RESPONSIBILITY_NURSE_DATE",displayName="责任护士签名日期",required=false,valuesRange="")   
     private Date responsibilityNurseDate;
    /**
     *名称:进修医师id
     *
 	 *
 	 *
     */
     @Column(name="REFRESHER_DOCTOR_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="REFRESHER_DOCTOR_ID",displayName="进修医师id",maxLength=40,required=false,valuesRange="")   
     private String refresherDoctorId;
    /**
     *名称:进修医师姓名
     *
 	 *
 	 *
     */
     @Column(name="REFRESHER_DOCTOR_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="REFRESHER_DOCTOR_NAME",displayName="进修医师姓名",maxLength=40,required=false,valuesRange="")   
     private String refresherDoctorName;
    /**
     *名称:进修医师签名日期
     *
 	 *
 	 *
     */
     @Column(name="REFRESHER_DOCTOR_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="REFRESHER_DOCTOR_DATE",displayName="进修医师签名日期",required=false,valuesRange="")   
     private Date refresherDoctorDate;
    /**
     *名称:实习医师id
     *
 	 *
 	 *
     */
     @Column(name="INTERN_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="INTERN_ID",displayName="实习医师id",maxLength=40,required=false,valuesRange="")   
     private String internId;
    /**
     *名称:实习医师姓名
     *
 	 *
 	 *
     */
     @Column(name="INTERN_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="INTERN_NAME",displayName="实习医师姓名",maxLength=40,required=false,valuesRange="")   
     private String internName;
    /**
     *名称:实习医师签名日期
     *
 	 *
 	 *
     */
     @Column(name="INTERN_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="INTERN_DATE",displayName="实习医师签名日期",required=false,valuesRange="")   
     private Date internDate;
    /**
     *名称:编码员id
     *
 	 *
 	 *
     */
     @Column(name="CODER_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="CODER_ID",displayName="编码员id",maxLength=40,required=false,valuesRange="")   
     private String coderId;
    /**
     *名称:编码员姓名
     *
 	 *
 	 *
     */
     @Column(name="CODER_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="CODER_NAME",displayName="编码员姓名",maxLength=40,required=false,valuesRange="")   
     private String coderName;
    /**
     *名称:编码员签名日期
     *
 	 *
 	 *
     */
     @Column(name="CODER_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="CODER_DATE",displayName="编码员签名日期",required=false,valuesRange="")   
     private Date coderDate;
    /**
     *名称:研究生实习医师id
     *
 	 *
 	 *
     */
     @Column(name="GRADUATE_INTERN_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="GRADUATE_INTERN_ID",displayName="研究生实习医师id",maxLength=40,required=false,valuesRange="")   
     private String graduateInternId;
    /**
     *名称:研究生实习医师姓名
     *
 	 *
 	 *
     */
     @Column(name="GRADUATE_INTERN_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="GRADUATE_INTERN_NAME",displayName="研究生实习医师姓名",maxLength=40,required=false,valuesRange="")   
     private String graduateInternName;
    /**
     *名称:研究生实习医师签名日期
     *
 	 *
 	 *
     */
     @Column(name="GRADUATE_INTERN_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="GRADUATE_INTERN_DATE",displayName="研究生实习医师签名日期",required=false,valuesRange="")   
     private Date graduateInternDate;
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
     *名称:住院号
     *
 	 *
 	 *
     */
     @Column(name="INH_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="INH_ID",displayName="住院号",maxLength=40,required=false,valuesRange="")   
     private String inhId;
    /**
     *名称:入院时间
     *
 	 *
 	 *
     */
     @Column(name="START",nullable = false)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="START",displayName="入院时间",required=true,valuesRange="")   
     private Date start;
    /**
     *名称:出院时间
     *
 	 *
 	 *
     */
     @Column(name="END",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="END",displayName="出院时间",required=false,valuesRange="")   
     private Date end;
    /**
     *名称:入院科室id
     *
 	 *
 	 *
     */
     @Column(name="IN_DEPT_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="IN_DEPT_ID",displayName="入院科室id",maxLength=40,required=true,valuesRange="")   
     private String inDeptId;
    /**
     *名称:入院科室名称
     *
 	 *
 	 *
     */
     @Column(name="IN_DEPT_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="IN_DEPT_NAME",displayName="入院科室名称",maxLength=40,required=true,valuesRange="")   
     private String inDeptName;
    /**
     *名称:入院科室标准编码
     *
 	 *限制:CV9900051
 	 *
     */
     @Column(name="IN_DEPT_CD",length = 20,nullable = false)
     @FhirFieldValidate(name="IN_DEPT_CD",displayName="入院科室标准编码",maxLength=20,required=true,valuesRange="CV9900051")   
     private String inDeptCd;
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
     *名称:入院病区代码
     *
 	 *
 	 *
     */
     @Column(name="IN_INPATIENT_AREA",length = 40,nullable = true)
     @FhirFieldValidate(name="IN_INPATIENT_AREA",displayName="入院病区代码",maxLength=40,required=false,valuesRange="")   
     private String inInpatientArea;
    /**
     *名称:入院病房号
     *
 	 *
 	 *
     */
     @Column(name="INPAT_WARD_NO",length = 40,nullable = true)
     @FhirFieldValidate(name="INPAT_WARD_NO",displayName="入院病房号",maxLength=40,required=false,valuesRange="")   
     private String inpatWardNo;
    /**
     *名称:入院床位号
     *
 	 *
 	 *
     */
     @Column(name="IN_BED_NUM",length = 40,nullable = true)
     @FhirFieldValidate(name="IN_BED_NUM",displayName="入院床位号",maxLength=40,required=false,valuesRange="")   
     private String inBedNum;
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
     *名称:医疗付费方式
     *
 	 *限制:CV9900376
 	 *
     */
     @Column(name="FEE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="FEE_CODE",displayName="医疗付费方式",maxLength=20,required=false,valuesRange="CV9900376")   
     private String feeCode;
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
     *名称:住院病房号
     *
 	 *
 	 *
     */
     @Column(name="WARD_NO",length = 20,nullable = true)
     @FhirFieldValidate(name="WARD_NO",displayName="住院病房号",maxLength=20,required=false,valuesRange="")   
     private String wardNo;
    /**
     *名称:住院病区
     *
 	 *
 	 *
     */
     @Column(name="WARD_AREA",length = 40,nullable = true)
     @FhirFieldValidate(name="WARD_AREA",displayName="住院病区",maxLength=40,required=false,valuesRange="")   
     private String wardArea;
    /**
     *名称:住院床位号
     *
 	 *
 	 *
     */
     @Column(name="BED_NUM",length = 20,nullable = true)
     @FhirFieldValidate(name="BED_NUM",displayName="住院床位号",maxLength=20,required=false,valuesRange="")   
     private String bedNum;
    /**
     *名称:出院科室id
     *
 	 *
 	 *
     */
     @Column(name="OUT_DEPT_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="OUT_DEPT_ID",displayName="出院科室id",maxLength=40,required=true,valuesRange="")   
     private String outDeptId;
    /**
     *名称:出院科室名称
     *
 	 *
 	 *
     */
     @Column(name="OUT_DEPT_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="OUT_DEPT_NAME",displayName="出院科室名称",maxLength=40,required=true,valuesRange="")   
     private String outDeptName;
    /**
     *名称:出院科室标准编码
     *
 	 *限制:CV9900051
 	 *
     */
     @Column(name="OUT_DEPT_CD",length = 20,nullable = false)
     @FhirFieldValidate(name="OUT_DEPT_CD",displayName="出院科室标准编码",maxLength=20,required=true,valuesRange="CV9900051")   
     private String outDeptCd;
    /**
     *名称:出院病区代码
     *
 	 *
 	 *
     */
     @Column(name="OUT_INPATIENT_AREA",length = 40,nullable = true)
     @FhirFieldValidate(name="OUT_INPATIENT_AREA",displayName="出院病区代码",maxLength=40,required=false,valuesRange="")   
     private String outInpatientArea;
    /**
     *名称:出院病房号
     *
 	 *
 	 *
     */
     @Column(name="OUTPAT_WARD_NO",length = 40,nullable = true)
     @FhirFieldValidate(name="OUTPAT_WARD_NO",displayName="出院病房号",maxLength=40,required=false,valuesRange="")   
     private String outpatWardNo;
    /**
     *名称:出院床位号
     *
 	 *
 	 *
     */
     @Column(name="OUT_BED_NUM",length = 40,nullable = true)
     @FhirFieldValidate(name="OUT_BED_NUM",displayName="出院床位号",maxLength=40,required=false,valuesRange="")   
     private String outBedNum;
    /**
     *名称:病案首页报告单号
     *
 	 *
 	 *
     */
     @Column(name="REPORT_FORM_NO",length = 40,nullable = true)
     @FhirFieldValidate(name="REPORT_FORM_NO",displayName="病案首页报告单号",maxLength=40,required=false,valuesRange="")   
     private String reportFormNo;
    /**
     *名称:病案首页类型
     *
 	 *限制:CV9900328
 	 *
     */
     @Column(name="MEDICAL_RECORD_TYPE",length = 20,nullable = true)
     @FhirFieldValidate(name="MEDICAL_RECORD_TYPE",displayName="病案首页类型",maxLength=20,required=false,valuesRange="CV9900328")   
     private String medicalRecordType;
    /**
     *名称:病案号
     *
 	 *
 	 *
     */
     @Column(name="CASE_NO",length = 40,nullable = false)
     @FhirFieldValidate(name="CASE_NO",displayName="病案号",maxLength=40,required=true,valuesRange="")   
     private String caseNo;
    /**
     *名称:治疗类别代码
     *
 	 *限制:CV9900320
 	 *
     */
     @Column(name="INPAT_TYPE_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="INPAT_TYPE_CD",displayName="治疗类别代码",maxLength=20,required=false,valuesRange="CV9900320")   
     private String inpatTypeCd;
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
     *名称:是否转诊标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="REFERRAL_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="REFERRAL_MARK",displayName="是否转诊标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean referralMark;
    /**
     *名称:是否实施临床路径
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="CLIN_PATH_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="CLIN_PATH_MARK",displayName="是否实施临床路径",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean clinPathMark;
    /**
     *名称:实施临床路径标志代码
     *
 	 *限制:CV9900321
 	 *
     */
     @Column(name="CLINICAL_PATHWAY_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="CLINICAL_PATHWAY_CD",displayName="实施临床路径标志代码",maxLength=20,required=false,valuesRange="CV9900321")   
     private String clinicalPathwayCd;
    /**
     *名称:是否使用医疗机构中药制剂标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="TCM_MEDICAL_CD",length = 5,nullable = true)
     @FhirFieldValidate(name="TCM_MEDICAL_CD",displayName="是否使用医疗机构中药制剂标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean tcmMedicalCd;
    /**
     *名称:是否使用中医诊疗设备标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="TCM_DIAG_TREAT_DEVICE_CD",length = 5,nullable = true)
     @FhirFieldValidate(name="TCM_DIAG_TREAT_DEVICE_CD",displayName="是否使用中医诊疗设备标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean tcmDiagTreatDeviceCd;
    /**
     *名称:是否使用中医诊疗技术标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="TCM_DIAG_TREAT_TECH_CD",length = 5,nullable = true)
     @FhirFieldValidate(name="TCM_DIAG_TREAT_TECH_CD",displayName="是否使用中医诊疗技术标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean tcmDiagTreatTechCd;
    /**
     *名称:是否辨证施护标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="SYNDROME_NURSING_CD",length = 5,nullable = true)
     @FhirFieldValidate(name="SYNDROME_NURSING_CD",displayName="是否辨证施护标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean syndromeNursingCd;
    /**
     *名称:死亡标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="IF_DEAD",length = 5,nullable = true)
     @FhirFieldValidate(name="IF_DEAD",displayName="死亡标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean ifDead;
    /**
     *名称:死亡时间
     *
 	 *
 	 *
     */
     @Column(name="DEATH_TIME",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DEATH_TIME",displayName="死亡时间",required=false,valuesRange="")   
     private Date deathTime;
    /**
     *名称:死亡原因描述
     *
 	 *
 	 *
     */
     @Column(name="DEATH_CAUSE",length = 200,nullable = true)
     @FhirFieldValidate(name="DEATH_CAUSE",displayName="死亡原因描述",maxLength=200,required=false,valuesRange="")   
     private String deathCause;
    /**
     *名称:死亡根本原因诊断代码
     *
 	 *
 	 *
     */
     @Column(name="DEATH_CAUSE_DIAGNOSTIC_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="DEATH_CAUSE_DIAGNOSTIC_CODE",displayName="死亡根本原因诊断代码",maxLength=20,required=false,valuesRange="")   
     private String deathCauseDiagnosticCode;
    /**
     *名称:输液反应标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="INFUSION_REACTION_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="INFUSION_REACTION_MARK",displayName="输液反应标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean infusionReactionMark;
    /**
     *名称:随访时间间隔(天)
     *
 	 *
 	 *
     */
     @Column(name="FOLLOW_INTERVAL",length = 8,nullable = true)
     @FhirFieldValidate(name="FOLLOW_INTERVAL",displayName="随访时间间隔(天)",maxLength=8,required=false,valuesRange="")   
     private Float followInterval;
    /**
     *名称:科研病例标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="RESEARCH_EXAMPLE_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="RESEARCH_EXAMPLE_MARK",displayName="科研病例标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean researchExampleMark;
    /**
     *名称:手术为本院第一例标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="FIRST_OPERATION_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="FIRST_OPERATION_MARK",displayName="手术为本院第一例标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean firstOperationMark;
    /**
     *名称:治疗为本院第一例标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="FIRST_TREATMENT_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="FIRST_TREATMENT_MARK",displayName="治疗为本院第一例标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean firstTreatmentMark;
    /**
     *名称:检查为本院第一例标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="FIRST_EXAM_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="FIRST_EXAM_MARK",displayName="检查为本院第一例标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean firstExamMark;
    /**
     *名称:诊断为本院第一例标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="FIRST_DIAGNOSIS_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="FIRST_DIAGNOSIS_MARK",displayName="诊断为本院第一例标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean firstDiagnosisMark;
    /**
     *名称:传染性标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="INFECTIOUS_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="INFECTIOUS_MARK",displayName="传染性标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean infectiousMark;
    /**
     *名称:传染病分类代码
     *
 	 *限制:CV990104
 	 *
     */
     @Column(name="INFECTIOUS_TYPE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="INFECTIOUS_TYPE_CODE",displayName="传染病分类代码",maxLength=20,required=false,valuesRange="CV990104")   
     private String infectiousTypeCode;
    /**
     *名称:传染上报标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="INFECT_REPORT_CD",length = 5,nullable = true)
     @FhirFieldValidate(name="INFECT_REPORT_CD",displayName="传染上报标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean infectReportCd;
    /**
     *名称:过敏源代码
     *
 	 *限制:CV0501038
 	 *
     */
     @Column(name="ALLERGENS_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="ALLERGENS_CODE",displayName="过敏源代码",maxLength=20,required=false,valuesRange="CV0501038")   
     private String allergensCode;
    /**
     *名称:HbsAg检查结果代码
     *
 	 *限制:CV510309
 	 *
     */
     @Column(name="HBSAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="HBSAG_CODE",displayName="HbsAg检查结果代码",maxLength=20,required=false,valuesRange="CV510309")   
     private String hbsagCode;
    /**
     *名称:HCV_Ab检查结果代码
     *
 	 *限制:CV510309
 	 *
     */
     @Column(name="HCV_AB_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="HCV_AB_CODE",displayName="HCV_Ab检查结果代码",maxLength=20,required=false,valuesRange="CV510309")   
     private String hcvAbCode;
    /**
     *名称:HIV_Ab检查结果代码
     *
 	 *限制:CV510309
 	 *
     */
     @Column(name="HIV_AB_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="HIV_AB_CODE",displayName="HIV_Ab检查结果代码",maxLength=20,required=false,valuesRange="CV510309")   
     private String hivAbCode;
    /**
     *名称:门诊与出院诊断对比符合情况代码
     *
 	 *限制:CV550113
 	 *
     */
     @Column(name="CLINIC2OUT_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="CLINIC2OUT_CODE",displayName="门诊与出院诊断对比符合情况代码",maxLength=20,required=false,valuesRange="CV550113")   
     private String clinic2outCode;
    /**
     *名称:入院与出院诊断对比符合情况代码
     *
 	 *限制:CV550113
 	 *
     */
     @Column(name="IN2OUT_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="IN2OUT_CODE",displayName="入院与出院诊断对比符合情况代码",maxLength=20,required=false,valuesRange="CV550113")   
     private String in2outCode;
    /**
     *名称:术前与术后诊断对比符合情况代码
     *
 	 *限制:CV550113
 	 *
     */
     @Column(name="PRE_OPER2OPER_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="PRE_OPER2OPER_CODE",displayName="术前与术后诊断对比符合情况代码",maxLength=20,required=false,valuesRange="CV550113")   
     private String preOper2operCode;
    /**
     *名称:放射与术后诊断对比符合情况代码
     *
 	 *限制:CV550113
 	 *
     */
     @Column(name="RADIATION2OPER_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="RADIATION2OPER_CODE",displayName="放射与术后诊断对比符合情况代码",maxLength=20,required=false,valuesRange="CV550113")   
     private String radiation2operCode;
    /**
     *名称:临床与病理诊断对比符合情况代码
     *
 	 *限制:CV550113
 	 *
     */
     @Column(name="CLINIC2PATHOLOGY_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="CLINIC2PATHOLOGY_CODE",displayName="临床与病理诊断对比符合情况代码",maxLength=20,required=false,valuesRange="CV550113")   
     private String clinic2pathologyCode;
    /**
     *名称:放射与病理诊断对比符合情况代码
     *
 	 *限制:CV550113
 	 *
     */
     @Column(name="RADIATION2PATHOLOGY_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="RADIATION2PATHOLOGY_CODE",displayName="放射与病理诊断对比符合情况代码",maxLength=20,required=false,valuesRange="CV550113")   
     private String radiation2pathologyCode;
    /**
     *名称:临床与尸检诊断对比符合情况代码
     *
 	 *限制:CV550113
 	 *
     */
     @Column(name="CLINIC2AUTOPSY_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="CLINIC2AUTOPSY_CODE",displayName="临床与尸检诊断对比符合情况代码",maxLength=20,required=false,valuesRange="CV550113")   
     private String clinic2autopsyCode;
    /**
     *名称:感染次数
     *
 	 *
 	 *
     */
     @Column(name="INFECTIOUSNESS_TIMES",length = 8,nullable = true)
     @FhirFieldValidate(name="INFECTIOUSNESS_TIMES",displayName="感染次数",maxLength=8,required=false,valuesRange="")   
     private Float infectiousnessTimes;
    /**
     *名称:抢救次数
     *
 	 *
 	 *
     */
     @Column(name="SAVE_TIMES",length = 8,nullable = true)
     @FhirFieldValidate(name="SAVE_TIMES",displayName="抢救次数",maxLength=8,required=false,valuesRange="")   
     private Float saveTimes;
    /**
     *名称:抢救成功次数
     *
 	 *
 	 *
     */
     @Column(name="SAVE_SUCCESS_TIMES",length = 8,nullable = true)
     @FhirFieldValidate(name="SAVE_SUCCESS_TIMES",displayName="抢救成功次数",maxLength=8,required=false,valuesRange="")   
     private Float saveSuccessTimes;
    /**
     *名称:特级护理天数
     *
 	 *
 	 *
     */
     @Column(name="PROTECT_SPECIAL",length = 8,nullable = true)
     @FhirFieldValidate(name="PROTECT_SPECIAL",displayName="特级护理天数",maxLength=8,required=false,valuesRange="")   
     private Float protectSpecial;
    /**
     *名称:一级护理天数
     *
 	 *
 	 *
     */
     @Column(name="PROTECT_I",length = 8,nullable = true)
     @FhirFieldValidate(name="PROTECT_I",displayName="一级护理天数",maxLength=8,required=false,valuesRange="")   
     private Float protectI;
    /**
     *名称:二级护理天数
     *
 	 *
 	 *
     */
     @Column(name="PROTECT_II",length = 8,nullable = true)
     @FhirFieldValidate(name="PROTECT_II",displayName="二级护理天数",maxLength=8,required=false,valuesRange="")   
     private Float protectIi;
    /**
     *名称:三级护理天数
     *
 	 *
 	 *
     */
     @Column(name="PROTECT_III",length = 8,nullable = true)
     @FhirFieldValidate(name="PROTECT_III",displayName="三级护理天数",maxLength=8,required=false,valuesRange="")   
     private Float protectIii;
    /**
     *名称:重症监护
     *
 	 *
 	 *
     */
     @Column(name="INTENSIVE_CARE_THERAPY",columnDefinition="text")
     @FhirFieldValidate(name="INTENSIVE_CARE_THERAPY",displayName="重症监护",required=false,valuesRange="")   
     private String intensiveCareTherapy;
    /**
     *名称:随诊周数
     *
 	 *
 	 *
     */
     @Column(name="FOLLOW_UP_WEEKS",length = 8,nullable = true)
     @FhirFieldValidate(name="FOLLOW_UP_WEEKS",displayName="随诊周数",maxLength=8,required=false,valuesRange="")   
     private Float followUpWeeks;
    /**
     *名称:随诊月数
     *
 	 *
 	 *
     */
     @Column(name="FOLLOW_UP_MONTHS",length = 8,nullable = true)
     @FhirFieldValidate(name="FOLLOW_UP_MONTHS",displayName="随诊月数",maxLength=8,required=false,valuesRange="")   
     private Float followUpMonths;
    /**
     *名称:随诊年数
     *
 	 *
 	 *
     */
     @Column(name="FOLLOW_UP_YEARS",length = 8,nullable = true)
     @FhirFieldValidate(name="FOLLOW_UP_YEARS",displayName="随诊年数",maxLength=8,required=false,valuesRange="")   
     private Float followUpYears;
    /**
     *名称:住院患者示教病例标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="TEACHING_EXAMPLE_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="TEACHING_EXAMPLE_MARK",displayName="住院患者示教病例标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean teachingExampleMark;
    /**
     *名称:住院患者随诊标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="FOLLOW_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="FOLLOW_MARK",displayName="住院患者随诊标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean followMark;
    /**
     *名称:婴幼儿年龄（天）
     *
 	 *
 	 *
     */
     @Column(name="AGE_BABY",length = 8,nullable = true)
     @FhirFieldValidate(name="AGE_BABY",displayName="婴幼儿年龄（天）",maxLength=8,required=false,valuesRange="")   
     private Float ageBaby;
    /**
     *名称:住院者疾病状态代码
     *
 	 *限制:CV0501001
 	 *
     */
     @Column(name="INPAT_ILL_STATE_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="INPAT_ILL_STATE_CD",displayName="住院者疾病状态代码",maxLength=20,required=false,valuesRange="CV0501001")   
     private String inpatIllStateCd;
    /**
     *名称:颅脑损伤患者入院前昏迷时间的天数
     *
 	 *
 	 *
     */
     @Column(name="INPAT_BEF_COMA_D",length = 4,nullable = true)
     @FhirFieldValidate(name="INPAT_BEF_COMA_D",displayName="颅脑损伤患者入院前昏迷时间的天数",maxLength=4,required=false,valuesRange="")   
     private Integer inpatBefComaD;
    /**
     *名称:颅脑损伤患者入院前昏迷时间的小时数
     *
 	 *
 	 *
     */
     @Column(name="INPAT_BEF_COMA_H",length = 4,nullable = true)
     @FhirFieldValidate(name="INPAT_BEF_COMA_H",displayName="颅脑损伤患者入院前昏迷时间的小时数",maxLength=4,required=false,valuesRange="")   
     private Integer inpatBefComaH;
    /**
     *名称:颅脑损伤患者入院前昏迷时间的分钟数
     *
 	 *
 	 *
     */
     @Column(name="INPAT_BEF_COMA_M",length = 4,nullable = true)
     @FhirFieldValidate(name="INPAT_BEF_COMA_M",displayName="颅脑损伤患者入院前昏迷时间的分钟数",maxLength=4,required=false,valuesRange="")   
     private Integer inpatBefComaM;
    /**
     *名称:颅脑损伤患者入院后昏迷时间的天数
     *
 	 *
 	 *
     */
     @Column(name="INPAT_AFT_COMA_D",length = 4,nullable = true)
     @FhirFieldValidate(name="INPAT_AFT_COMA_D",displayName="颅脑损伤患者入院后昏迷时间的天数",maxLength=4,required=false,valuesRange="")   
     private Integer inpatAftComaD;
    /**
     *名称:颅脑损伤患者入院后昏迷时间的小时数
     *
 	 *
 	 *
     */
     @Column(name="INPAT_AFT_COMA_H",length = 4,nullable = true)
     @FhirFieldValidate(name="INPAT_AFT_COMA_H",displayName="颅脑损伤患者入院后昏迷时间的小时数",maxLength=4,required=false,valuesRange="")   
     private Integer inpatAftComaH;
    /**
     *名称:颅脑损伤患者入院后昏迷时间的分钟数
     *
 	 *
 	 *
     */
     @Column(name="INPAT_AFT_COMA_M",length = 4,nullable = true)
     @FhirFieldValidate(name="INPAT_AFT_COMA_M",displayName="颅脑损伤患者入院后昏迷时间的分钟数",maxLength=4,required=false,valuesRange="")   
     private Integer inpatAftComaM;
    /**
     *名称:日常生活能力评定量表得分-入院
     *
 	 *
 	 *
     */
     @Column(name="LIFE_SKILLS_INHOSP",length = 8,nullable = true)
     @FhirFieldValidate(name="LIFE_SKILLS_INHOSP",displayName="日常生活能力评定量表得分-入院",maxLength=8,required=false,valuesRange="")   
     private Float lifeSkillsInhosp;
    /**
     *名称:日常生活能力评定量表得分-出院
     *
 	 *
 	 *
     */
     @Column(name="LIFE_SKILLS_OUTHOSP",length = 8,nullable = true)
     @FhirFieldValidate(name="LIFE_SKILLS_OUTHOSP",displayName="日常生活能力评定量表得分-出院",maxLength=8,required=false,valuesRange="")   
     private Float lifeSkillsOuthosp;
    /**
     *名称:离院方式
     *
 	 *限制:CV0600226
 	 *
     */
     @Column(name="OUT_MODE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="OUT_MODE_CODE",displayName="离院方式",maxLength=20,required=false,valuesRange="CV0600226")   
     private String outModeCode;
    /**
     *名称:拟接收医疗机构代码
     *
 	 *
 	 *
     */
     @Column(name="RECEIVE_HOS_CD",length = 40,nullable = true)
     @FhirFieldValidate(name="RECEIVE_HOS_CD",displayName="拟接收医疗机构代码",maxLength=40,required=false,valuesRange="")   
     private String receiveHosCd;
    /**
     *名称:拟接收医疗机构名称
     *
 	 *
 	 *
     */
     @Column(name="RECEIVE_HOS_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="RECEIVE_HOS_NAME",displayName="拟接收医疗机构名称",maxLength=40,required=false,valuesRange="")   
     private String receiveHosName;
    /**
     *名称:住院次数
     *
 	 *
 	 *
     */
     @Column(name="INPAT_TIMES",length = 4,nullable = true)
     @FhirFieldValidate(name="INPAT_TIMES",displayName="住院次数",maxLength=4,required=false,valuesRange="")   
     private Integer inpatTimes;
    /**
     *名称:住院天数
     *
 	 *
 	 *
     */
     @Column(name="INPAT_DAYS",length = 4,nullable = true)
     @FhirFieldValidate(name="INPAT_DAYS",displayName="住院天数",maxLength=4,required=false,valuesRange="")   
     private Integer inpatDays;
    /**
     *名称:死亡患者尸检标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="AUTOPSY_MARK",length = 5,nullable = true)
     @FhirFieldValidate(name="AUTOPSY_MARK",displayName="死亡患者尸检标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean autopsyMark;
    /**
     *名称:病案质量
     *
 	 *限制:CV550115
 	 *
     */
     @Column(name="MEDICAL_RECORD_QUALITY_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="MEDICAL_RECORD_QUALITY_CD",displayName="病案质量",maxLength=20,required=false,valuesRange="CV550115")   
     private String medicalRecordQualityCd;
    /**
     *名称:质控日期
     *
 	 *
 	 *
     */
     @Column(name="QUALITY_CONTROL_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="QUALITY_CONTROL_DATE",displayName="质控日期",required=false,valuesRange="")   
     private Date qualityControlDate;
    /**
     *名称:质控医师签名日期
     *
 	 *
 	 *
     */
     @Column(name="QC_DOCT_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="QC_DOCT_DATE",displayName="质控医师签名日期",required=false,valuesRange="")   
     private Date qcDoctDate;
    /**
     *名称:质控护士签名日期
     *
 	 *
 	 *
     */
     @Column(name="QC_NURSE_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="QC_NURSE_DATE",displayName="质控护士签名日期",required=false,valuesRange="")   
     private Date qcNurseDate;
    /**
     *名称:质控医生id
     *
 	 *
 	 *
     */
     @Column(name="QC_DOCTOR_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="QC_DOCTOR_ID",displayName="质控医生id",maxLength=40,required=false,valuesRange="")   
     private String qcDoctorId;
    /**
     *名称:质控医生姓名
     *
 	 *
 	 *
     */
     @Column(name="QC_DOCTOR_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="QC_DOCTOR_NAME",displayName="质控医生姓名",maxLength=40,required=false,valuesRange="")   
     private String qcDoctorName;
    /**
     *名称:质控护士id
     *
 	 *
 	 *
     */
     @Column(name="QC_NURSE_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="QC_NURSE_ID",displayName="质控护士id",maxLength=40,required=false,valuesRange="")   
     private String qcNurseId;
    /**
     *名称:质控护士姓名
     *
 	 *
 	 *
     */
     @Column(name="QC_NURSE_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="QC_NURSE_NAME",displayName="质控护士姓名",maxLength=40,required=false,valuesRange="")   
     private String qcNurseName;
    /**
     *名称:出院31天内再住院标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="RE_INPAT_FLG",length = 5,nullable = true)
     @FhirFieldValidate(name="RE_INPAT_FLG",displayName="出院31天内再住院标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean reInpatFlg;
    /**
     *名称:出院31天内再住院目的
     *
 	 *
 	 *
     */
     @Column(name="RE_INPAT_PURPOSE",length = 200,nullable = true)
     @FhirFieldValidate(name="RE_INPAT_PURPOSE",displayName="出院31天内再住院目的",maxLength=200,required=false,valuesRange="")   
     private String reInpatPurpose;
    /**
     *名称:个人承担费用
     *
 	 *
 	 *
     */
     @Column(name="PSN_EXPENSE",length = 8,nullable = true)
     @FhirFieldValidate(name="PSN_EXPENSE",displayName="个人承担费用",maxLength=8,required=false,valuesRange="")   
     private Float psnExpense;
    /**
     *名称:一般医疗服务费
     *
 	 *
 	 *
     */
     @Column(name="FEE_GENERAL_MEDICAL",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_GENERAL_MEDICAL",displayName="一般医疗服务费",maxLength=8,required=false,valuesRange="")   
     private Float feeGeneralMedical;
    /**
     *名称:一般医疗服务费-中医辨证论治费
     *
 	 *
 	 *
     */
     @Column(name="FEE_GENERAL_TCM_TREATMENT",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_GENERAL_TCM_TREATMENT",displayName="一般医疗服务费-中医辨证论治费",maxLength=8,required=false,valuesRange="")   
     private Float feeGeneralTcmTreatment;
    /**
     *名称:一般医疗服务费-中医辨证论治会诊费
     *
 	 *
 	 *
     */
     @Column(name="FEE_GENERAL_TCM_CONSULT",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_GENERAL_TCM_CONSULT",displayName="一般医疗服务费-中医辨证论治会诊费",maxLength=8,required=false,valuesRange="")   
     private Float feeGeneralTcmConsult;
    /**
     *名称:一般治疗操作费
     *
 	 *
 	 *
     */
     @Column(name="FEE_GENERAL_TREAT",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_GENERAL_TREAT",displayName="一般治疗操作费",maxLength=8,required=false,valuesRange="")   
     private Float feeGeneralTreat;
    /**
     *名称:护理费
     *
 	 *
 	 *
     */
     @Column(name="FEE_TEND",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_TEND",displayName="护理费",maxLength=8,required=false,valuesRange="")   
     private Float feeTend;
    /**
     *名称:综合医疗服务其他费用
     *
 	 *
 	 *
     */
     @Column(name="FEE_MEDICAL_OTHER",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_MEDICAL_OTHER",displayName="综合医疗服务其他费用",maxLength=8,required=false,valuesRange="")   
     private Float feeMedicalOther;
    /**
     *名称:病理诊断费
     *
 	 *
 	 *
     */
     @Column(name="FEE_PATHOLOGY",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_PATHOLOGY",displayName="病理诊断费",maxLength=8,required=false,valuesRange="")   
     private Float feePathology;
    /**
     *名称:实验室诊断费
     *
 	 *
 	 *
     */
     @Column(name="FEE_LABORATORY",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_LABORATORY",displayName="实验室诊断费",maxLength=8,required=false,valuesRange="")   
     private Float feeLaboratory;
    /**
     *名称:影像学诊断费
     *
 	 *
 	 *
     */
     @Column(name="FEE_IMAGING",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_IMAGING",displayName="影像学诊断费",maxLength=8,required=false,valuesRange="")   
     private Float feeImaging;
    /**
     *名称:临床诊断项目费
     *
 	 *
 	 *
     */
     @Column(name="FEE_CLINC",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_CLINC",displayName="临床诊断项目费",maxLength=8,required=false,valuesRange="")   
     private Float feeClinc;
    /**
     *名称:非手术治疗项目费
     *
 	 *
 	 *
     */
     @Column(name="FEE_NONSURGICAL_TREAT",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_NONSURGICAL_TREAT",displayName="非手术治疗项目费",maxLength=8,required=false,valuesRange="")   
     private Float feeNonsurgicalTreat;
    /**
     *名称:临床物理治疗费
     *
 	 *
 	 *
     */
     @Column(name="FEE_CLIN_PHYSICAL",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_CLIN_PHYSICAL",displayName="临床物理治疗费",maxLength=8,required=false,valuesRange="")   
     private Float feeClinPhysical;
    /**
     *名称:手术治疗费
     *
 	 *
 	 *
     */
     @Column(name="FEE_SURGICAL_TREAT",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_SURGICAL_TREAT",displayName="手术治疗费",maxLength=8,required=false,valuesRange="")   
     private Float feeSurgicalTreat;
    /**
     *名称:麻醉费
     *
 	 *
 	 *
     */
     @Column(name="FEE_ANAES",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_ANAES",displayName="麻醉费",maxLength=8,required=false,valuesRange="")   
     private Float feeAnaes;
    /**
     *名称:手术费
     *
 	 *
 	 *
     */
     @Column(name="FEE_OPERATION",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_OPERATION",displayName="手术费",maxLength=8,required=false,valuesRange="")   
     private Float feeOperation;
    /**
     *名称:康复费
     *
 	 *
 	 *
     */
     @Column(name="FEE_RECOVERY",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_RECOVERY",displayName="康复费",maxLength=8,required=false,valuesRange="")   
     private Float feeRecovery;
    /**
     *名称:中医诊断费
     *
 	 *
 	 *
     */
     @Column(name="FEE_TCM_DIAG",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_TCM_DIAG",displayName="中医诊断费",maxLength=8,required=false,valuesRange="")   
     private Float feeTcmDiag;
    /**
     *名称:中医治疗费
     *
 	 *
 	 *
     */
     @Column(name="FEE_CN_TREATMENT",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_CN_TREATMENT",displayName="中医治疗费",maxLength=8,required=false,valuesRange="")   
     private Float feeCnTreatment;
    /**
     *名称:中医治疗费-中医外治费
     *
 	 *
 	 *
     */
     @Column(name="FEE_TCM_FOREIGN_RULE",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_TCM_FOREIGN_RULE",displayName="中医治疗费-中医外治费",maxLength=8,required=false,valuesRange="")   
     private Float feeTcmForeignRule;
    /**
     *名称:中医治疗费-中医骨伤费
     *
 	 *
 	 *
     */
     @Column(name="FEE_TCM_ORTHOPEDICS",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_TCM_ORTHOPEDICS",displayName="中医治疗费-中医骨伤费",maxLength=8,required=false,valuesRange="")   
     private Float feeTcmOrthopedics;
    /**
     *名称:中医治疗费-针刺与灸法费
     *
 	 *
 	 *
     */
     @Column(name="FEE_TCM_ACU_MOXI",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_TCM_ACU_MOXI",displayName="中医治疗费-针刺与灸法费",maxLength=8,required=false,valuesRange="")   
     private Float feeTcmAcuMoxi;
    /**
     *名称:中医治疗费-中医推拿治疗费
     *
 	 *
 	 *
     */
     @Column(name="FEE_TCM_MASSAGE",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_TCM_MASSAGE",displayName="中医治疗费-中医推拿治疗费",maxLength=8,required=false,valuesRange="")   
     private Float feeTcmMassage;
    /**
     *名称:中医治疗费-中医肛肠治疗费
     *
 	 *
 	 *
     */
     @Column(name="FEE_TCM_ANORECTAL",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_TCM_ANORECTAL",displayName="中医治疗费-中医肛肠治疗费",maxLength=8,required=false,valuesRange="")   
     private Float feeTcmAnorectal;
    /**
     *名称:中医治疗费-中医特殊治疗费
     *
 	 *
 	 *
     */
     @Column(name="FEE_TCM_SPECIAL",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_TCM_SPECIAL",displayName="中医治疗费-中医特殊治疗费",maxLength=8,required=false,valuesRange="")   
     private Float feeTcmSpecial;
    /**
     *名称:中医其他费
     *
 	 *
 	 *
     */
     @Column(name="FEE_TCM_OTHER",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_TCM_OTHER",displayName="中医其他费",maxLength=8,required=false,valuesRange="")   
     private Float feeTcmOther;
    /**
     *名称:中医其他费-中医特殊调配加工费
     *
 	 *
 	 *
     */
     @Column(name="FEE_TCM_SPECIAL_MIX",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_TCM_SPECIAL_MIX",displayName="中医其他费-中医特殊调配加工费",maxLength=8,required=false,valuesRange="")   
     private Float feeTcmSpecialMix;
    /**
     *名称:中医其他费-辨证施膳费
     *
 	 *
 	 *
     */
     @Column(name="FEE_TCM_DRUG_FOOD",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_TCM_DRUG_FOOD",displayName="中医其他费-辨证施膳费",maxLength=8,required=false,valuesRange="")   
     private Float feeTcmDrugFood;
    /**
     *名称:西药费
     *
 	 *
 	 *
     */
     @Column(name="FEE_WESTERN_MEDICINE",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_WESTERN_MEDICINE",displayName="西药费",maxLength=8,required=false,valuesRange="")   
     private Float feeWesternMedicine;
    /**
     *名称:抗菌药物费用
     *
 	 *
 	 *
     */
     @Column(name="FEE_ANTIMICROBIAL",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_ANTIMICROBIAL",displayName="抗菌药物费用",maxLength=8,required=false,valuesRange="")   
     private Float feeAntimicrobial;
    /**
     *名称:中成药费
     *
 	 *
 	 *
     */
     @Column(name="FEE_CN_MEDICINE",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_CN_MEDICINE",displayName="中成药费",maxLength=8,required=false,valuesRange="")   
     private Float feeCnMedicine;
    /**
     *名称:中草药费
     *
 	 *
 	 *
     */
     @Column(name="FEE_CN_HERBAL_MEDICINE",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_CN_HERBAL_MEDICINE",displayName="中草药费",maxLength=8,required=false,valuesRange="")   
     private Float feeCnHerbalMedicine;
    /**
     *名称:中成药费-医疗机构中药制剂费
     *
 	 *
 	 *
     */
     @Column(name="FEE_TCM_ORG_MEDICINE",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_TCM_ORG_MEDICINE",displayName="中成药费-医疗机构中药制剂费",maxLength=8,required=false,valuesRange="")   
     private Float feeTcmOrgMedicine;
    /**
     *名称:血费
     *
 	 *
 	 *
     */
     @Column(name="FEE_BLOOD",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_BLOOD",displayName="血费",maxLength=8,required=false,valuesRange="")   
     private Float feeBlood;
    /**
     *名称:白蛋白类制品费
     *
 	 *
 	 *
     */
     @Column(name="FEE_ALBUMIN",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_ALBUMIN",displayName="白蛋白类制品费",maxLength=8,required=false,valuesRange="")   
     private Float feeAlbumin;
    /**
     *名称:球蛋白类制品费
     *
 	 *
 	 *
     */
     @Column(name="FEE_GLOBULIN",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_GLOBULIN",displayName="球蛋白类制品费",maxLength=8,required=false,valuesRange="")   
     private Float feeGlobulin;
    /**
     *名称:凝血因子类制品费
     *
 	 *
 	 *
     */
     @Column(name="FEE_BCF",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_BCF",displayName="凝血因子类制品费",maxLength=8,required=false,valuesRange="")   
     private Float feeBcf;
    /**
     *名称:细胞因子类制品费
     *
 	 *
 	 *
     */
     @Column(name="FEE_CYTOKINE",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_CYTOKINE",displayName="细胞因子类制品费",maxLength=8,required=false,valuesRange="")   
     private Float feeCytokine;
    /**
     *名称:检查用一次性医用材料费
     *
 	 *
 	 *
     */
     @Column(name="FEE_CHECK_MATERIAL",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_CHECK_MATERIAL",displayName="检查用一次性医用材料费",maxLength=8,required=false,valuesRange="")   
     private Float feeCheckMaterial;
    /**
     *名称:治疗用一次性医用材料费
     *
 	 *
 	 *
     */
     @Column(name="FEE_TREAT_MATERIAL",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_TREAT_MATERIAL",displayName="治疗用一次性医用材料费",maxLength=8,required=false,valuesRange="")   
     private Float feeTreatMaterial;
    /**
     *名称:手术用一次性医用材料费
     *
 	 *
 	 *
     */
     @Column(name="FEE_OPER_MATERIAL",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_OPER_MATERIAL",displayName="手术用一次性医用材料费",maxLength=8,required=false,valuesRange="")   
     private Float feeOperMaterial;
    /**
     *名称:其他费
     *
 	 *
 	 *
     */
     @Column(name="FEE_OTHER",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_OTHER",displayName="其他费",maxLength=8,required=false,valuesRange="")   
     private Float feeOther;
    /**
     *名称:婴儿费
     *
 	 *
 	 *
     */
     @Column(name="FEE_BABY",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_BABY",displayName="婴儿费",maxLength=8,required=false,valuesRange="")   
     private Float feeBaby;
    /**
     *名称:陪床费
     *
 	 *
 	 *
     */
     @Column(name="FEE_EXTRA_BED",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_EXTRA_BED",displayName="陪床费",maxLength=8,required=false,valuesRange="")   
     private Float feeExtraBed;
    /**
     *名称:床位费
     *
 	 *
 	 *
     */
     @Column(name="FEE_BED",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_BED",displayName="床位费",maxLength=8,required=false,valuesRange="")   
     private Float feeBed;
    /**
     *名称:放射费
     *
 	 *
 	 *
     */
     @Column(name="FEE_RADIATION",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_RADIATION",displayName="放射费",maxLength=8,required=false,valuesRange="")   
     private Float feeRadiation;
    /**
     *名称:化验费
     *
 	 *
 	 *
     */
     @Column(name="FEE_ASSAY",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_ASSAY",displayName="化验费",maxLength=8,required=false,valuesRange="")   
     private Float feeAssay;
    /**
     *名称:输氧费用
     *
 	 *
 	 *
     */
     @Column(name="FEE_OXYGEN",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_OXYGEN",displayName="输氧费用",maxLength=8,required=false,valuesRange="")   
     private Float feeOxygen;
    /**
     *名称:接生费
     *
 	 *
 	 *
     */
     @Column(name="FEE_DELIVER",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_DELIVER",displayName="接生费",maxLength=8,required=false,valuesRange="")   
     private Float feeDeliver;
    /**
     *名称:检查费
     *
 	 *
 	 *
     */
     @Column(name="FEE_CHECK",length = 8,nullable = true)
     @FhirFieldValidate(name="FEE_CHECK",displayName="检查费",maxLength=8,required=false,valuesRange="")   
     private Float feeCheck;
    /**
     *名称:总金额
     *
 	 *
 	 *
     */
     @Column(name="TOTAL",length = 8,nullable = true)
     @FhirFieldValidate(name="TOTAL",displayName="总金额",maxLength=8,required=false,valuesRange="")   
     private Float total;
    /**
     *名称:备注
     *
 	 *
 	 *
     */
     @Column(name="NOTES",length = 500,nullable = true)
     @FhirFieldValidate(name="NOTES",displayName="备注",maxLength=500,required=false,valuesRange="")   
     private String notes;
    /**
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
     @javax.persistence.OrderBy("upTime DESC")
     @OneToMany(mappedBy="tiMedicalRecord",cascade=CascadeType.ALL,fetch=javax.persistence.FetchType.EAGER)
     @org.hibernate.annotations.Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
     private List<TiMod> tiMods;
     @javax.persistence.OrderBy("upTime DESC")
     @OneToMany(mappedBy="tiMedicalRecord",cascade=CascadeType.ALL,fetch=javax.persistence.FetchType.EAGER)
     @org.hibernate.annotations.Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
     private List<TiMpd> tiMpds;
     @javax.persistence.OrderBy("upTime DESC")
     @OneToMany(mappedBy="tiMedicalRecord",cascade=CascadeType.ALL,fetch=javax.persistence.FetchType.EAGER)
     @org.hibernate.annotations.Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
     private List<TiMid> tiMids;
     @javax.persistence.OrderBy("upTime DESC")
     @OneToMany(mappedBy="tiMedicalRecord",cascade=CascadeType.ALL,fetch=javax.persistence.FetchType.EAGER)
     @org.hibernate.annotations.Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
     private List<TiMiied> tiMiieds;
     @javax.persistence.OrderBy("upTime DESC")
     @OneToMany(mappedBy="tiMedicalRecord",cascade=CascadeType.ALL,fetch=javax.persistence.FetchType.EAGER)
     @org.hibernate.annotations.Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
     private List<TiMndd> tiMndds;
     @javax.persistence.OrderBy("upTime DESC")
     @OneToMany(mappedBy="tiMedicalRecord",cascade=CascadeType.ALL,fetch=javax.persistence.FetchType.EAGER)
     @org.hibernate.annotations.Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
     private List<TiMomd> tiMomds;
     @javax.persistence.OrderBy("upTime DESC")
     @OneToMany(mappedBy="tiMedicalRecord",cascade=CascadeType.ALL,fetch=javax.persistence.FetchType.EAGER)
     @org.hibernate.annotations.Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
     private List<TiMood> tiMoods;
     @javax.persistence.OrderBy("upTime DESC")
     @OneToMany(mappedBy="tiMedicalRecord",cascade=CascadeType.ALL,fetch=javax.persistence.FetchType.EAGER)
     @org.hibernate.annotations.Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
     private List<TiMis> tiMiss;
     @javax.persistence.OrderBy("upTime DESC")
     @OneToMany(mappedBy="tiMedicalRecord",cascade=CascadeType.ALL,fetch=javax.persistence.FetchType.EAGER)
     @org.hibernate.annotations.Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
     private List<TiMr> tiMrs;
     @javax.persistence.OrderBy("upTime DESC")
     @OneToMany(mappedBy="tiMedicalRecord",cascade=CascadeType.ALL,fetch=javax.persistence.FetchType.EAGER)
     @org.hibernate.annotations.Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
     private List<TiMo> tiMos;
    
     public String getTcmInpatientMedicalRecordId(){
       	return this.tcmInpatientMedicalRecordId;
     }
     public void setTcmInpatientMedicalRecordId(String tcmInpatientMedicalRecordId){
       	this.tcmInpatientMedicalRecordId=tcmInpatientMedicalRecordId;
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
     public String getPatientServiceNo(){
       	return this.patientServiceNo;
     }
     public void setPatientServiceNo(String patientServiceNo){
       	this.patientServiceNo=patientServiceNo;
     }
     public String getIdCard(){
       	return this.idCard;
     }
     public void setIdCard(String idCard){
       	this.idCard=idCard;
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
     public String getPhone(){
       	return this.phone;
     }
     public void setPhone(String phone){
       	this.phone=phone;
     }
     public String getWorkPhone(){
       	return this.workPhone;
     }
     public void setWorkPhone(String workPhone){
       	this.workPhone=workPhone;
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
     public String getWorkPostCd(){
       	return this.workPostCd;
     }
     public void setWorkPostCd(String workPostCd){
       	this.workPostCd=workPostCd;
     }
     public String getMaritalstatus(){
       	return this.maritalstatus;
     }
     public void setMaritalstatus(String maritalstatus){
       	this.maritalstatus=maritalstatus;
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
     public String getContactsState(){
       	return this.contactsState;
     }
     public void setContactsState(String contactsState){
       	this.contactsState=contactsState;
     }
     public String getContactsCity(){
       	return this.contactsCity;
     }
     public void setContactsCity(String contactsCity){
       	this.contactsCity=contactsCity;
     }
     public String getContactsDistrict(){
       	return this.contactsDistrict;
     }
     public void setContactsDistrict(String contactsDistrict){
       	this.contactsDistrict=contactsDistrict;
     }
     public String getContactsLine(){
       	return this.contactsLine;
     }
     public void setContactsLine(String contactsLine){
       	this.contactsLine=contactsLine;
     }
     public String getContactsRoad(){
       	return this.contactsRoad;
     }
     public void setContactsRoad(String contactsRoad){
       	this.contactsRoad=contactsRoad;
     }
     public String getContactsHouseNo(){
       	return this.contactsHouseNo;
     }
     public void setContactsHouseNo(String contactsHouseNo){
       	this.contactsHouseNo=contactsHouseNo;
     }
     public String getContactsPostCd(){
       	return this.contactsPostCd;
     }
     public void setContactsPostCd(String contactsPostCd){
       	this.contactsPostCd=contactsPostCd;
     }
     public String getContactsAddressDetails(){
       	return this.contactsAddressDetails;
     }
     public void setContactsAddressDetails(String contactsAddressDetails){
       	this.contactsAddressDetails=contactsAddressDetails;
     }
     public String getNationCd(){
       	return this.nationCd;
     }
     public void setNationCd(String nationCd){
       	this.nationCd=nationCd;
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
     public String getNationalityCode(){
       	return this.nationalityCode;
     }
     public void setNationalityCode(String nationalityCode){
       	this.nationalityCode=nationalityCode;
     }
     public String getWorkUnit(){
       	return this.workUnit;
     }
     public void setWorkUnit(String workUnit){
       	this.workUnit=workUnit;
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
     public String getBirthProCode(){
       	return this.birthProCode;
     }
     public void setBirthProCode(String birthProCode){
       	this.birthProCode=birthProCode;
     }
     public String getBirthCityCode(){
       	return this.birthCityCode;
     }
     public void setBirthCityCode(String birthCityCode){
       	this.birthCityCode=birthCityCode;
     }
     public String getBirthCouCode(){
       	return this.birthCouCode;
     }
     public void setBirthCouCode(String birthCouCode){
       	this.birthCouCode=birthCouCode;
     }
     public String getBirthAddressVillage(){
       	return this.birthAddressVillage;
     }
     public void setBirthAddressVillage(String birthAddressVillage){
       	this.birthAddressVillage=birthAddressVillage;
     }
     public String getBirthAddressHouse(){
       	return this.birthAddressHouse;
     }
     public void setBirthAddressHouse(String birthAddressHouse){
       	this.birthAddressHouse=birthAddressHouse;
     }
     public String getBirthAddressStreet(){
       	return this.birthAddressStreet;
     }
     public void setBirthAddressStreet(String birthAddressStreet){
       	this.birthAddressStreet=birthAddressStreet;
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
     public Float getAge(){
       	return this.age;
     }
     public void setAge(Float age){
       	this.age=age;
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
     public String getDepartmentHeadId(){
       	return this.departmentHeadId;
     }
     public void setDepartmentHeadId(String departmentHeadId){
       	this.departmentHeadId=departmentHeadId;
     }
     public String getDepartmentHeadName(){
       	return this.departmentHeadName;
     }
     public void setDepartmentHeadName(String departmentHeadName){
       	this.departmentHeadName=departmentHeadName;
     }
     public Date getDepartmentHeadDate(){
       	return this.departmentHeadDate;
     }
     public void setDepartmentHeadDate(Date departmentHeadDate){
       	this.departmentHeadDate=departmentHeadDate;
     }
     public String getChiefPhysicianId(){
       	return this.chiefPhysicianId;
     }
     public void setChiefPhysicianId(String chiefPhysicianId){
       	this.chiefPhysicianId=chiefPhysicianId;
     }
     public String getChiefPhysicianName(){
       	return this.chiefPhysicianName;
     }
     public void setChiefPhysicianName(String chiefPhysicianName){
       	this.chiefPhysicianName=chiefPhysicianName;
     }
     public Date getChiefPhysicianSignDate(){
       	return this.chiefPhysicianSignDate;
     }
     public void setChiefPhysicianSignDate(Date chiefPhysicianSignDate){
       	this.chiefPhysicianSignDate=chiefPhysicianSignDate;
     }
     public String getAttendingDoctorId(){
       	return this.attendingDoctorId;
     }
     public void setAttendingDoctorId(String attendingDoctorId){
       	this.attendingDoctorId=attendingDoctorId;
     }
     public String getAttendingDoctorName(){
       	return this.attendingDoctorName;
     }
     public void setAttendingDoctorName(String attendingDoctorName){
       	this.attendingDoctorName=attendingDoctorName;
     }
     public Date getAttendingDoctorSignDate(){
       	return this.attendingDoctorSignDate;
     }
     public void setAttendingDoctorSignDate(Date attendingDoctorSignDate){
       	this.attendingDoctorSignDate=attendingDoctorSignDate;
     }
     public String getResidentDoctorId(){
       	return this.residentDoctorId;
     }
     public void setResidentDoctorId(String residentDoctorId){
       	this.residentDoctorId=residentDoctorId;
     }
     public String getResidentDoctorName(){
       	return this.residentDoctorName;
     }
     public void setResidentDoctorName(String residentDoctorName){
       	this.residentDoctorName=residentDoctorName;
     }
     public Date getResidentDoctorSignDate(){
       	return this.residentDoctorSignDate;
     }
     public void setResidentDoctorSignDate(Date residentDoctorSignDate){
       	this.residentDoctorSignDate=residentDoctorSignDate;
     }
     public String getResponsibilityNurseId(){
       	return this.responsibilityNurseId;
     }
     public void setResponsibilityNurseId(String responsibilityNurseId){
       	this.responsibilityNurseId=responsibilityNurseId;
     }
     public String getResponsibilityNurseName(){
       	return this.responsibilityNurseName;
     }
     public void setResponsibilityNurseName(String responsibilityNurseName){
       	this.responsibilityNurseName=responsibilityNurseName;
     }
     public Date getResponsibilityNurseDate(){
       	return this.responsibilityNurseDate;
     }
     public void setResponsibilityNurseDate(Date responsibilityNurseDate){
       	this.responsibilityNurseDate=responsibilityNurseDate;
     }
     public String getRefresherDoctorId(){
       	return this.refresherDoctorId;
     }
     public void setRefresherDoctorId(String refresherDoctorId){
       	this.refresherDoctorId=refresherDoctorId;
     }
     public String getRefresherDoctorName(){
       	return this.refresherDoctorName;
     }
     public void setRefresherDoctorName(String refresherDoctorName){
       	this.refresherDoctorName=refresherDoctorName;
     }
     public Date getRefresherDoctorDate(){
       	return this.refresherDoctorDate;
     }
     public void setRefresherDoctorDate(Date refresherDoctorDate){
       	this.refresherDoctorDate=refresherDoctorDate;
     }
     public String getInternId(){
       	return this.internId;
     }
     public void setInternId(String internId){
       	this.internId=internId;
     }
     public String getInternName(){
       	return this.internName;
     }
     public void setInternName(String internName){
       	this.internName=internName;
     }
     public Date getInternDate(){
       	return this.internDate;
     }
     public void setInternDate(Date internDate){
       	this.internDate=internDate;
     }
     public String getCoderId(){
       	return this.coderId;
     }
     public void setCoderId(String coderId){
       	this.coderId=coderId;
     }
     public String getCoderName(){
       	return this.coderName;
     }
     public void setCoderName(String coderName){
       	this.coderName=coderName;
     }
     public Date getCoderDate(){
       	return this.coderDate;
     }
     public void setCoderDate(Date coderDate){
       	this.coderDate=coderDate;
     }
     public String getGraduateInternId(){
       	return this.graduateInternId;
     }
     public void setGraduateInternId(String graduateInternId){
       	this.graduateInternId=graduateInternId;
     }
     public String getGraduateInternName(){
       	return this.graduateInternName;
     }
     public void setGraduateInternName(String graduateInternName){
       	this.graduateInternName=graduateInternName;
     }
     public Date getGraduateInternDate(){
       	return this.graduateInternDate;
     }
     public void setGraduateInternDate(Date graduateInternDate){
       	this.graduateInternDate=graduateInternDate;
     }
     public String getInpatientRegistrationId(){
       	return this.inpatientRegistrationId;
     }
     public void setInpatientRegistrationId(String inpatientRegistrationId){
       	this.inpatientRegistrationId=inpatientRegistrationId;
     }
     public String getInhId(){
       	return this.inhId;
     }
     public void setInhId(String inhId){
       	this.inhId=inhId;
     }
     public Date getStart(){
       	return this.start;
     }
     public void setStart(Date start){
       	this.start=start;
     }
     public Date getEnd(){
       	return this.end;
     }
     public void setEnd(Date end){
       	this.end=end;
     }
     public String getInDeptId(){
       	return this.inDeptId;
     }
     public void setInDeptId(String inDeptId){
       	this.inDeptId=inDeptId;
     }
     public String getInDeptName(){
       	return this.inDeptName;
     }
     public void setInDeptName(String inDeptName){
       	this.inDeptName=inDeptName;
     }
     public String getInDeptCd(){
       	return this.inDeptCd;
     }
     public void setInDeptCd(String inDeptCd){
       	this.inDeptCd=inDeptCd;
     }
     public String getInModeCode(){
       	return this.inModeCode;
     }
     public void setInModeCode(String inModeCode){
       	this.inModeCode=inModeCode;
     }
     public String getInInpatientArea(){
       	return this.inInpatientArea;
     }
     public void setInInpatientArea(String inInpatientArea){
       	this.inInpatientArea=inInpatientArea;
     }
     public String getInpatWardNo(){
       	return this.inpatWardNo;
     }
     public void setInpatWardNo(String inpatWardNo){
       	this.inpatWardNo=inpatWardNo;
     }
     public String getInBedNum(){
       	return this.inBedNum;
     }
     public void setInBedNum(String inBedNum){
       	this.inBedNum=inBedNum;
     }
     public String getInhospitalReasonCd(){
       	return this.inhospitalReasonCd;
     }
     public void setInhospitalReasonCd(String inhospitalReasonCd){
       	this.inhospitalReasonCd=inhospitalReasonCd;
     }
     public String getFeeCode(){
       	return this.feeCode;
     }
     public void setFeeCode(String feeCode){
       	this.feeCode=feeCode;
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
     public String getOutDeptId(){
       	return this.outDeptId;
     }
     public void setOutDeptId(String outDeptId){
       	this.outDeptId=outDeptId;
     }
     public String getOutDeptName(){
       	return this.outDeptName;
     }
     public void setOutDeptName(String outDeptName){
       	this.outDeptName=outDeptName;
     }
     public String getOutDeptCd(){
       	return this.outDeptCd;
     }
     public void setOutDeptCd(String outDeptCd){
       	this.outDeptCd=outDeptCd;
     }
     public String getOutInpatientArea(){
       	return this.outInpatientArea;
     }
     public void setOutInpatientArea(String outInpatientArea){
       	this.outInpatientArea=outInpatientArea;
     }
     public String getOutpatWardNo(){
       	return this.outpatWardNo;
     }
     public void setOutpatWardNo(String outpatWardNo){
       	this.outpatWardNo=outpatWardNo;
     }
     public String getOutBedNum(){
       	return this.outBedNum;
     }
     public void setOutBedNum(String outBedNum){
       	this.outBedNum=outBedNum;
     }
     public String getReportFormNo(){
       	return this.reportFormNo;
     }
     public void setReportFormNo(String reportFormNo){
       	this.reportFormNo=reportFormNo;
     }
     public String getMedicalRecordType(){
       	return this.medicalRecordType;
     }
     public void setMedicalRecordType(String medicalRecordType){
       	this.medicalRecordType=medicalRecordType;
     }
     public String getCaseNo(){
       	return this.caseNo;
     }
     public void setCaseNo(String caseNo){
       	this.caseNo=caseNo;
     }
     public String getInpatTypeCd(){
       	return this.inpatTypeCd;
     }
     public void setInpatTypeCd(String inpatTypeCd){
       	this.inpatTypeCd=inpatTypeCd;
     }
     public Boolean getIsLocalMark(){
       	return this.isLocalMark;
     }
     public void setIsLocalMark(Boolean isLocalMark){
       	this.isLocalMark=isLocalMark;
     }
     public Boolean getReferralMark(){
       	return this.referralMark;
     }
     public void setReferralMark(Boolean referralMark){
       	this.referralMark=referralMark;
     }
     public Boolean getClinPathMark(){
       	return this.clinPathMark;
     }
     public void setClinPathMark(Boolean clinPathMark){
       	this.clinPathMark=clinPathMark;
     }
     public String getClinicalPathwayCd(){
       	return this.clinicalPathwayCd;
     }
     public void setClinicalPathwayCd(String clinicalPathwayCd){
       	this.clinicalPathwayCd=clinicalPathwayCd;
     }
     public Boolean getTcmMedicalCd(){
       	return this.tcmMedicalCd;
     }
     public void setTcmMedicalCd(Boolean tcmMedicalCd){
       	this.tcmMedicalCd=tcmMedicalCd;
     }
     public Boolean getTcmDiagTreatDeviceCd(){
       	return this.tcmDiagTreatDeviceCd;
     }
     public void setTcmDiagTreatDeviceCd(Boolean tcmDiagTreatDeviceCd){
       	this.tcmDiagTreatDeviceCd=tcmDiagTreatDeviceCd;
     }
     public Boolean getTcmDiagTreatTechCd(){
       	return this.tcmDiagTreatTechCd;
     }
     public void setTcmDiagTreatTechCd(Boolean tcmDiagTreatTechCd){
       	this.tcmDiagTreatTechCd=tcmDiagTreatTechCd;
     }
     public Boolean getSyndromeNursingCd(){
       	return this.syndromeNursingCd;
     }
     public void setSyndromeNursingCd(Boolean syndromeNursingCd){
       	this.syndromeNursingCd=syndromeNursingCd;
     }
     public Boolean getIfDead(){
       	return this.ifDead;
     }
     public void setIfDead(Boolean ifDead){
       	this.ifDead=ifDead;
     }
     public Date getDeathTime(){
       	return this.deathTime;
     }
     public void setDeathTime(Date deathTime){
       	this.deathTime=deathTime;
     }
     public String getDeathCause(){
       	return this.deathCause;
     }
     public void setDeathCause(String deathCause){
       	this.deathCause=deathCause;
     }
     public String getDeathCauseDiagnosticCode(){
       	return this.deathCauseDiagnosticCode;
     }
     public void setDeathCauseDiagnosticCode(String deathCauseDiagnosticCode){
       	this.deathCauseDiagnosticCode=deathCauseDiagnosticCode;
     }
     public Boolean getInfusionReactionMark(){
       	return this.infusionReactionMark;
     }
     public void setInfusionReactionMark(Boolean infusionReactionMark){
       	this.infusionReactionMark=infusionReactionMark;
     }
     public Float getFollowInterval(){
       	return this.followInterval;
     }
     public void setFollowInterval(Float followInterval){
       	this.followInterval=followInterval;
     }
     public Boolean getResearchExampleMark(){
       	return this.researchExampleMark;
     }
     public void setResearchExampleMark(Boolean researchExampleMark){
       	this.researchExampleMark=researchExampleMark;
     }
     public Boolean getFirstOperationMark(){
       	return this.firstOperationMark;
     }
     public void setFirstOperationMark(Boolean firstOperationMark){
       	this.firstOperationMark=firstOperationMark;
     }
     public Boolean getFirstTreatmentMark(){
       	return this.firstTreatmentMark;
     }
     public void setFirstTreatmentMark(Boolean firstTreatmentMark){
       	this.firstTreatmentMark=firstTreatmentMark;
     }
     public Boolean getFirstExamMark(){
       	return this.firstExamMark;
     }
     public void setFirstExamMark(Boolean firstExamMark){
       	this.firstExamMark=firstExamMark;
     }
     public Boolean getFirstDiagnosisMark(){
       	return this.firstDiagnosisMark;
     }
     public void setFirstDiagnosisMark(Boolean firstDiagnosisMark){
       	this.firstDiagnosisMark=firstDiagnosisMark;
     }
     public Boolean getInfectiousMark(){
       	return this.infectiousMark;
     }
     public void setInfectiousMark(Boolean infectiousMark){
       	this.infectiousMark=infectiousMark;
     }
     public String getInfectiousTypeCode(){
       	return this.infectiousTypeCode;
     }
     public void setInfectiousTypeCode(String infectiousTypeCode){
       	this.infectiousTypeCode=infectiousTypeCode;
     }
     public Boolean getInfectReportCd(){
       	return this.infectReportCd;
     }
     public void setInfectReportCd(Boolean infectReportCd){
       	this.infectReportCd=infectReportCd;
     }
     public String getAllergensCode(){
       	return this.allergensCode;
     }
     public void setAllergensCode(String allergensCode){
       	this.allergensCode=allergensCode;
     }
     public String getHbsagCode(){
       	return this.hbsagCode;
     }
     public void setHbsagCode(String hbsagCode){
       	this.hbsagCode=hbsagCode;
     }
     public String getHcvAbCode(){
       	return this.hcvAbCode;
     }
     public void setHcvAbCode(String hcvAbCode){
       	this.hcvAbCode=hcvAbCode;
     }
     public String getHivAbCode(){
       	return this.hivAbCode;
     }
     public void setHivAbCode(String hivAbCode){
       	this.hivAbCode=hivAbCode;
     }
     public String getClinic2outCode(){
       	return this.clinic2outCode;
     }
     public void setClinic2outCode(String clinic2outCode){
       	this.clinic2outCode=clinic2outCode;
     }
     public String getIn2outCode(){
       	return this.in2outCode;
     }
     public void setIn2outCode(String in2outCode){
       	this.in2outCode=in2outCode;
     }
     public String getPreOper2operCode(){
       	return this.preOper2operCode;
     }
     public void setPreOper2operCode(String preOper2operCode){
       	this.preOper2operCode=preOper2operCode;
     }
     public String getRadiation2operCode(){
       	return this.radiation2operCode;
     }
     public void setRadiation2operCode(String radiation2operCode){
       	this.radiation2operCode=radiation2operCode;
     }
     public String getClinic2pathologyCode(){
       	return this.clinic2pathologyCode;
     }
     public void setClinic2pathologyCode(String clinic2pathologyCode){
       	this.clinic2pathologyCode=clinic2pathologyCode;
     }
     public String getRadiation2pathologyCode(){
       	return this.radiation2pathologyCode;
     }
     public void setRadiation2pathologyCode(String radiation2pathologyCode){
       	this.radiation2pathologyCode=radiation2pathologyCode;
     }
     public String getClinic2autopsyCode(){
       	return this.clinic2autopsyCode;
     }
     public void setClinic2autopsyCode(String clinic2autopsyCode){
       	this.clinic2autopsyCode=clinic2autopsyCode;
     }
     public Float getInfectiousnessTimes(){
       	return this.infectiousnessTimes;
     }
     public void setInfectiousnessTimes(Float infectiousnessTimes){
       	this.infectiousnessTimes=infectiousnessTimes;
     }
     public Float getSaveTimes(){
       	return this.saveTimes;
     }
     public void setSaveTimes(Float saveTimes){
       	this.saveTimes=saveTimes;
     }
     public Float getSaveSuccessTimes(){
       	return this.saveSuccessTimes;
     }
     public void setSaveSuccessTimes(Float saveSuccessTimes){
       	this.saveSuccessTimes=saveSuccessTimes;
     }
     public Float getProtectSpecial(){
       	return this.protectSpecial;
     }
     public void setProtectSpecial(Float protectSpecial){
       	this.protectSpecial=protectSpecial;
     }
     public Float getProtectI(){
       	return this.protectI;
     }
     public void setProtectI(Float protectI){
       	this.protectI=protectI;
     }
     public Float getProtectIi(){
       	return this.protectIi;
     }
     public void setProtectIi(Float protectIi){
       	this.protectIi=protectIi;
     }
     public Float getProtectIii(){
       	return this.protectIii;
     }
     public void setProtectIii(Float protectIii){
       	this.protectIii=protectIii;
     }
     public String getIntensiveCareTherapy(){
       	return this.intensiveCareTherapy;
     }
     public void setIntensiveCareTherapy(String intensiveCareTherapy){
       	this.intensiveCareTherapy=intensiveCareTherapy;
     }
     public Float getFollowUpWeeks(){
       	return this.followUpWeeks;
     }
     public void setFollowUpWeeks(Float followUpWeeks){
       	this.followUpWeeks=followUpWeeks;
     }
     public Float getFollowUpMonths(){
       	return this.followUpMonths;
     }
     public void setFollowUpMonths(Float followUpMonths){
       	this.followUpMonths=followUpMonths;
     }
     public Float getFollowUpYears(){
       	return this.followUpYears;
     }
     public void setFollowUpYears(Float followUpYears){
       	this.followUpYears=followUpYears;
     }
     public Boolean getTeachingExampleMark(){
       	return this.teachingExampleMark;
     }
     public void setTeachingExampleMark(Boolean teachingExampleMark){
       	this.teachingExampleMark=teachingExampleMark;
     }
     public Boolean getFollowMark(){
       	return this.followMark;
     }
     public void setFollowMark(Boolean followMark){
       	this.followMark=followMark;
     }
     public Float getAgeBaby(){
       	return this.ageBaby;
     }
     public void setAgeBaby(Float ageBaby){
       	this.ageBaby=ageBaby;
     }
     public String getInpatIllStateCd(){
       	return this.inpatIllStateCd;
     }
     public void setInpatIllStateCd(String inpatIllStateCd){
       	this.inpatIllStateCd=inpatIllStateCd;
     }
     public Integer getInpatBefComaD(){
       	return this.inpatBefComaD;
     }
     public void setInpatBefComaD(Integer inpatBefComaD){
       	this.inpatBefComaD=inpatBefComaD;
     }
     public Integer getInpatBefComaH(){
       	return this.inpatBefComaH;
     }
     public void setInpatBefComaH(Integer inpatBefComaH){
       	this.inpatBefComaH=inpatBefComaH;
     }
     public Integer getInpatBefComaM(){
       	return this.inpatBefComaM;
     }
     public void setInpatBefComaM(Integer inpatBefComaM){
       	this.inpatBefComaM=inpatBefComaM;
     }
     public Integer getInpatAftComaD(){
       	return this.inpatAftComaD;
     }
     public void setInpatAftComaD(Integer inpatAftComaD){
       	this.inpatAftComaD=inpatAftComaD;
     }
     public Integer getInpatAftComaH(){
       	return this.inpatAftComaH;
     }
     public void setInpatAftComaH(Integer inpatAftComaH){
       	this.inpatAftComaH=inpatAftComaH;
     }
     public Integer getInpatAftComaM(){
       	return this.inpatAftComaM;
     }
     public void setInpatAftComaM(Integer inpatAftComaM){
       	this.inpatAftComaM=inpatAftComaM;
     }
     public Float getLifeSkillsInhosp(){
       	return this.lifeSkillsInhosp;
     }
     public void setLifeSkillsInhosp(Float lifeSkillsInhosp){
       	this.lifeSkillsInhosp=lifeSkillsInhosp;
     }
     public Float getLifeSkillsOuthosp(){
       	return this.lifeSkillsOuthosp;
     }
     public void setLifeSkillsOuthosp(Float lifeSkillsOuthosp){
       	this.lifeSkillsOuthosp=lifeSkillsOuthosp;
     }
     public String getOutModeCode(){
       	return this.outModeCode;
     }
     public void setOutModeCode(String outModeCode){
       	this.outModeCode=outModeCode;
     }
     public String getReceiveHosCd(){
       	return this.receiveHosCd;
     }
     public void setReceiveHosCd(String receiveHosCd){
       	this.receiveHosCd=receiveHosCd;
     }
     public String getReceiveHosName(){
       	return this.receiveHosName;
     }
     public void setReceiveHosName(String receiveHosName){
       	this.receiveHosName=receiveHosName;
     }
     public Integer getInpatTimes(){
       	return this.inpatTimes;
     }
     public void setInpatTimes(Integer inpatTimes){
       	this.inpatTimes=inpatTimes;
     }
     public Integer getInpatDays(){
       	return this.inpatDays;
     }
     public void setInpatDays(Integer inpatDays){
       	this.inpatDays=inpatDays;
     }
     public Boolean getAutopsyMark(){
       	return this.autopsyMark;
     }
     public void setAutopsyMark(Boolean autopsyMark){
       	this.autopsyMark=autopsyMark;
     }
     public String getMedicalRecordQualityCd(){
       	return this.medicalRecordQualityCd;
     }
     public void setMedicalRecordQualityCd(String medicalRecordQualityCd){
       	this.medicalRecordQualityCd=medicalRecordQualityCd;
     }
     public Date getQualityControlDate(){
       	return this.qualityControlDate;
     }
     public void setQualityControlDate(Date qualityControlDate){
       	this.qualityControlDate=qualityControlDate;
     }
     public Date getQcDoctDate(){
       	return this.qcDoctDate;
     }
     public void setQcDoctDate(Date qcDoctDate){
       	this.qcDoctDate=qcDoctDate;
     }
     public Date getQcNurseDate(){
       	return this.qcNurseDate;
     }
     public void setQcNurseDate(Date qcNurseDate){
       	this.qcNurseDate=qcNurseDate;
     }
     public String getQcDoctorId(){
       	return this.qcDoctorId;
     }
     public void setQcDoctorId(String qcDoctorId){
       	this.qcDoctorId=qcDoctorId;
     }
     public String getQcDoctorName(){
       	return this.qcDoctorName;
     }
     public void setQcDoctorName(String qcDoctorName){
       	this.qcDoctorName=qcDoctorName;
     }
     public String getQcNurseId(){
       	return this.qcNurseId;
     }
     public void setQcNurseId(String qcNurseId){
       	this.qcNurseId=qcNurseId;
     }
     public String getQcNurseName(){
       	return this.qcNurseName;
     }
     public void setQcNurseName(String qcNurseName){
       	this.qcNurseName=qcNurseName;
     }
     public Boolean getReInpatFlg(){
       	return this.reInpatFlg;
     }
     public void setReInpatFlg(Boolean reInpatFlg){
       	this.reInpatFlg=reInpatFlg;
     }
     public String getReInpatPurpose(){
       	return this.reInpatPurpose;
     }
     public void setReInpatPurpose(String reInpatPurpose){
       	this.reInpatPurpose=reInpatPurpose;
     }
     public Float getPsnExpense(){
       	return this.psnExpense;
     }
     public void setPsnExpense(Float psnExpense){
       	this.psnExpense=psnExpense;
     }
     public Float getFeeGeneralMedical(){
       	return this.feeGeneralMedical;
     }
     public void setFeeGeneralMedical(Float feeGeneralMedical){
       	this.feeGeneralMedical=feeGeneralMedical;
     }
     public Float getFeeGeneralTcmTreatment(){
       	return this.feeGeneralTcmTreatment;
     }
     public void setFeeGeneralTcmTreatment(Float feeGeneralTcmTreatment){
       	this.feeGeneralTcmTreatment=feeGeneralTcmTreatment;
     }
     public Float getFeeGeneralTcmConsult(){
       	return this.feeGeneralTcmConsult;
     }
     public void setFeeGeneralTcmConsult(Float feeGeneralTcmConsult){
       	this.feeGeneralTcmConsult=feeGeneralTcmConsult;
     }
     public Float getFeeGeneralTreat(){
       	return this.feeGeneralTreat;
     }
     public void setFeeGeneralTreat(Float feeGeneralTreat){
       	this.feeGeneralTreat=feeGeneralTreat;
     }
     public Float getFeeTend(){
       	return this.feeTend;
     }
     public void setFeeTend(Float feeTend){
       	this.feeTend=feeTend;
     }
     public Float getFeeMedicalOther(){
       	return this.feeMedicalOther;
     }
     public void setFeeMedicalOther(Float feeMedicalOther){
       	this.feeMedicalOther=feeMedicalOther;
     }
     public Float getFeePathology(){
       	return this.feePathology;
     }
     public void setFeePathology(Float feePathology){
       	this.feePathology=feePathology;
     }
     public Float getFeeLaboratory(){
       	return this.feeLaboratory;
     }
     public void setFeeLaboratory(Float feeLaboratory){
       	this.feeLaboratory=feeLaboratory;
     }
     public Float getFeeImaging(){
       	return this.feeImaging;
     }
     public void setFeeImaging(Float feeImaging){
       	this.feeImaging=feeImaging;
     }
     public Float getFeeClinc(){
       	return this.feeClinc;
     }
     public void setFeeClinc(Float feeClinc){
       	this.feeClinc=feeClinc;
     }
     public Float getFeeNonsurgicalTreat(){
       	return this.feeNonsurgicalTreat;
     }
     public void setFeeNonsurgicalTreat(Float feeNonsurgicalTreat){
       	this.feeNonsurgicalTreat=feeNonsurgicalTreat;
     }
     public Float getFeeClinPhysical(){
       	return this.feeClinPhysical;
     }
     public void setFeeClinPhysical(Float feeClinPhysical){
       	this.feeClinPhysical=feeClinPhysical;
     }
     public Float getFeeSurgicalTreat(){
       	return this.feeSurgicalTreat;
     }
     public void setFeeSurgicalTreat(Float feeSurgicalTreat){
       	this.feeSurgicalTreat=feeSurgicalTreat;
     }
     public Float getFeeAnaes(){
       	return this.feeAnaes;
     }
     public void setFeeAnaes(Float feeAnaes){
       	this.feeAnaes=feeAnaes;
     }
     public Float getFeeOperation(){
       	return this.feeOperation;
     }
     public void setFeeOperation(Float feeOperation){
       	this.feeOperation=feeOperation;
     }
     public Float getFeeRecovery(){
       	return this.feeRecovery;
     }
     public void setFeeRecovery(Float feeRecovery){
       	this.feeRecovery=feeRecovery;
     }
     public Float getFeeTcmDiag(){
       	return this.feeTcmDiag;
     }
     public void setFeeTcmDiag(Float feeTcmDiag){
       	this.feeTcmDiag=feeTcmDiag;
     }
     public Float getFeeCnTreatment(){
       	return this.feeCnTreatment;
     }
     public void setFeeCnTreatment(Float feeCnTreatment){
       	this.feeCnTreatment=feeCnTreatment;
     }
     public Float getFeeTcmForeignRule(){
       	return this.feeTcmForeignRule;
     }
     public void setFeeTcmForeignRule(Float feeTcmForeignRule){
       	this.feeTcmForeignRule=feeTcmForeignRule;
     }
     public Float getFeeTcmOrthopedics(){
       	return this.feeTcmOrthopedics;
     }
     public void setFeeTcmOrthopedics(Float feeTcmOrthopedics){
       	this.feeTcmOrthopedics=feeTcmOrthopedics;
     }
     public Float getFeeTcmAcuMoxi(){
       	return this.feeTcmAcuMoxi;
     }
     public void setFeeTcmAcuMoxi(Float feeTcmAcuMoxi){
       	this.feeTcmAcuMoxi=feeTcmAcuMoxi;
     }
     public Float getFeeTcmMassage(){
       	return this.feeTcmMassage;
     }
     public void setFeeTcmMassage(Float feeTcmMassage){
       	this.feeTcmMassage=feeTcmMassage;
     }
     public Float getFeeTcmAnorectal(){
       	return this.feeTcmAnorectal;
     }
     public void setFeeTcmAnorectal(Float feeTcmAnorectal){
       	this.feeTcmAnorectal=feeTcmAnorectal;
     }
     public Float getFeeTcmSpecial(){
       	return this.feeTcmSpecial;
     }
     public void setFeeTcmSpecial(Float feeTcmSpecial){
       	this.feeTcmSpecial=feeTcmSpecial;
     }
     public Float getFeeTcmOther(){
       	return this.feeTcmOther;
     }
     public void setFeeTcmOther(Float feeTcmOther){
       	this.feeTcmOther=feeTcmOther;
     }
     public Float getFeeTcmSpecialMix(){
       	return this.feeTcmSpecialMix;
     }
     public void setFeeTcmSpecialMix(Float feeTcmSpecialMix){
       	this.feeTcmSpecialMix=feeTcmSpecialMix;
     }
     public Float getFeeTcmDrugFood(){
       	return this.feeTcmDrugFood;
     }
     public void setFeeTcmDrugFood(Float feeTcmDrugFood){
       	this.feeTcmDrugFood=feeTcmDrugFood;
     }
     public Float getFeeWesternMedicine(){
       	return this.feeWesternMedicine;
     }
     public void setFeeWesternMedicine(Float feeWesternMedicine){
       	this.feeWesternMedicine=feeWesternMedicine;
     }
     public Float getFeeAntimicrobial(){
       	return this.feeAntimicrobial;
     }
     public void setFeeAntimicrobial(Float feeAntimicrobial){
       	this.feeAntimicrobial=feeAntimicrobial;
     }
     public Float getFeeCnMedicine(){
       	return this.feeCnMedicine;
     }
     public void setFeeCnMedicine(Float feeCnMedicine){
       	this.feeCnMedicine=feeCnMedicine;
     }
     public Float getFeeCnHerbalMedicine(){
       	return this.feeCnHerbalMedicine;
     }
     public void setFeeCnHerbalMedicine(Float feeCnHerbalMedicine){
       	this.feeCnHerbalMedicine=feeCnHerbalMedicine;
     }
     public Float getFeeTcmOrgMedicine(){
       	return this.feeTcmOrgMedicine;
     }
     public void setFeeTcmOrgMedicine(Float feeTcmOrgMedicine){
       	this.feeTcmOrgMedicine=feeTcmOrgMedicine;
     }
     public Float getFeeBlood(){
       	return this.feeBlood;
     }
     public void setFeeBlood(Float feeBlood){
       	this.feeBlood=feeBlood;
     }
     public Float getFeeAlbumin(){
       	return this.feeAlbumin;
     }
     public void setFeeAlbumin(Float feeAlbumin){
       	this.feeAlbumin=feeAlbumin;
     }
     public Float getFeeGlobulin(){
       	return this.feeGlobulin;
     }
     public void setFeeGlobulin(Float feeGlobulin){
       	this.feeGlobulin=feeGlobulin;
     }
     public Float getFeeBcf(){
       	return this.feeBcf;
     }
     public void setFeeBcf(Float feeBcf){
       	this.feeBcf=feeBcf;
     }
     public Float getFeeCytokine(){
       	return this.feeCytokine;
     }
     public void setFeeCytokine(Float feeCytokine){
       	this.feeCytokine=feeCytokine;
     }
     public Float getFeeCheckMaterial(){
       	return this.feeCheckMaterial;
     }
     public void setFeeCheckMaterial(Float feeCheckMaterial){
       	this.feeCheckMaterial=feeCheckMaterial;
     }
     public Float getFeeTreatMaterial(){
       	return this.feeTreatMaterial;
     }
     public void setFeeTreatMaterial(Float feeTreatMaterial){
       	this.feeTreatMaterial=feeTreatMaterial;
     }
     public Float getFeeOperMaterial(){
       	return this.feeOperMaterial;
     }
     public void setFeeOperMaterial(Float feeOperMaterial){
       	this.feeOperMaterial=feeOperMaterial;
     }
     public Float getFeeOther(){
       	return this.feeOther;
     }
     public void setFeeOther(Float feeOther){
       	this.feeOther=feeOther;
     }
     public Float getFeeBaby(){
       	return this.feeBaby;
     }
     public void setFeeBaby(Float feeBaby){
       	this.feeBaby=feeBaby;
     }
     public Float getFeeExtraBed(){
       	return this.feeExtraBed;
     }
     public void setFeeExtraBed(Float feeExtraBed){
       	this.feeExtraBed=feeExtraBed;
     }
     public Float getFeeBed(){
       	return this.feeBed;
     }
     public void setFeeBed(Float feeBed){
       	this.feeBed=feeBed;
     }
     public Float getFeeRadiation(){
       	return this.feeRadiation;
     }
     public void setFeeRadiation(Float feeRadiation){
       	this.feeRadiation=feeRadiation;
     }
     public Float getFeeAssay(){
       	return this.feeAssay;
     }
     public void setFeeAssay(Float feeAssay){
       	this.feeAssay=feeAssay;
     }
     public Float getFeeOxygen(){
       	return this.feeOxygen;
     }
     public void setFeeOxygen(Float feeOxygen){
       	this.feeOxygen=feeOxygen;
     }
     public Float getFeeDeliver(){
       	return this.feeDeliver;
     }
     public void setFeeDeliver(Float feeDeliver){
       	this.feeDeliver=feeDeliver;
     }
     public Float getFeeCheck(){
       	return this.feeCheck;
     }
     public void setFeeCheck(Float feeCheck){
       	this.feeCheck=feeCheck;
     }
     public Float getTotal(){
       	return this.total;
     }
     public void setTotal(Float total){
       	this.total=total;
     }
     public String getNotes(){
       	return this.notes;
     }
     public void setNotes(String notes){
       	this.notes=notes;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
     public List<TiMod> getTiMods(){
       	return this.tiMods;
    }
     public void setTiMods(List<TiMod> tiMods){
        this.tiMods=tiMods;
    }
     public List<TiMpd> getTiMpds(){
       	return this.tiMpds;
    }
     public void setTiMpds(List<TiMpd> tiMpds){
        this.tiMpds=tiMpds;
    }
     public List<TiMid> getTiMids(){
       	return this.tiMids;
    }
     public void setTiMids(List<TiMid> tiMids){
        this.tiMids=tiMids;
    }
     public List<TiMiied> getTiMiieds(){
       	return this.tiMiieds;
    }
     public void setTiMiieds(List<TiMiied> tiMiieds){
        this.tiMiieds=tiMiieds;
    }
     public List<TiMndd> getTiMndds(){
       	return this.tiMndds;
    }
     public void setTiMndds(List<TiMndd> tiMndds){
        this.tiMndds=tiMndds;
    }
     public List<TiMomd> getTiMomds(){
       	return this.tiMomds;
    }
     public void setTiMomds(List<TiMomd> tiMomds){
        this.tiMomds=tiMomds;
    }
     public List<TiMood> getTiMoods(){
       	return this.tiMoods;
    }
     public void setTiMoods(List<TiMood> tiMoods){
        this.tiMoods=tiMoods;
    }
     public List<TiMis> getTiMiss(){
       	return this.tiMiss;
    }
     public void setTiMiss(List<TiMis> tiMiss){
        this.tiMiss=tiMiss;
    }
     public List<TiMr> getTiMrs(){
       	return this.tiMrs;
    }
     public void setTiMrs(List<TiMr> tiMrs){
        this.tiMrs=tiMrs;
    }
     public List<TiMo> getTiMos(){
       	return this.tiMos;
    }
     public void setTiMos(List<TiMo> tiMos){
        this.tiMos=tiMos;
    }
}