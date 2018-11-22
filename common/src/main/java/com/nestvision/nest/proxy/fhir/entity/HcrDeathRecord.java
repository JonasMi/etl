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
@Table(name = BaseEntity.TABLE_PREFIX + "HCR_DEATH_RECORD")
public class HcrDeathRecord extends FhirResourceEntity {

    /**
     *名称:死亡记录id
     *
 	 *
 	 *主键字段
     */
     @Column(name="HCR_DEATH_RECORD_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="HCR_DEATH_RECORD_ID",displayName="死亡记录id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String hcrDeathRecordId;
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
     *名称:患者年龄
     *
 	 *
 	 *
     */
     @Column(name="AGE",length = 8,nullable = true)
     @FhirFieldValidate(name="AGE",displayName="患者年龄",maxLength=8,required=false,valuesRange="")   
     private Float age;
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
     *名称:学历代码
     *
 	 *限制:GBT4658
 	 *
     */
     @Column(name="EDUCATION_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="EDUCATION_CD",displayName="学历代码",maxLength=20,required=false,valuesRange="GBT4658")   
     private String educationCd;
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
     *名称:出生地住址-省（自治区、直辖市）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="BIRTH_PRO_CODE",length = 10,nullable = true)
     @FhirFieldValidate(name="BIRTH_PRO_CODE",displayName="出生地住址-省（自治区、直辖市）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String birthProCode;
    /**
     *名称:出生地住址-市（地区）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="BIRTH_CITY_CODE",length = 10,nullable = true)
     @FhirFieldValidate(name="BIRTH_CITY_CODE",displayName="出生地住址-市（地区）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String birthCityCode;
    /**
     *名称:出生地住址-县（区）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="BIRTH_COU_CODE",length = 10,nullable = true)
     @FhirFieldValidate(name="BIRTH_COU_CODE",displayName="出生地住址-县（区）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String birthCouCode;
    /**
     *名称:出生地住址-村（街、路、弄等）
     *
 	 *
 	 *
     */
     @Column(name="BIRTH_ADDRESS_VILLAGE",length = 100,nullable = true)
     @FhirFieldValidate(name="BIRTH_ADDRESS_VILLAGE",displayName="出生地住址-村（街、路、弄等）",maxLength=100,required=false,valuesRange="")   
     private String birthAddressVillage;
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
     *名称:行政区划代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="ADMINISTRATION",length = 20,nullable = true)
     @FhirFieldValidate(name="ADMINISTRATION",displayName="行政区划代码",maxLength=20,required=false,valuesRange="GBT2260")   
     private String administration;
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
     *名称:联系电话
     *
 	 *
 	 *
     */
     @Column(name="TELECOM",length = 20,nullable = true)
     @FhirFieldValidate(name="TELECOM",displayName="联系电话",maxLength=20,required=false,valuesRange="")   
     private String telecom;
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
     *名称:家庭住址-邮政编码
     *
 	 *
 	 *
     */
     @Column(name="HOME_POST_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="HOME_POST_CD",displayName="家庭住址-邮政编码",maxLength=20,required=false,valuesRange="")   
     private String homePostCd;
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
     *名称:现居住地址-详细信息
     *
 	 *
 	 *
     */
     @Column(name="TEMP_TEXT",length = 500,nullable = true)
     @FhirFieldValidate(name="TEMP_TEXT",displayName="现居住地址-详细信息",maxLength=500,required=false,valuesRange="")   
     private String tempText;
    /**
     *名称:工作住址-省（自治区、直辖市）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="WORK_STATE",length = 10,nullable = true)
     @FhirFieldValidate(name="WORK_STATE",displayName="工作住址-省（自治区、直辖市）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String workState;
    /**
     *名称:工作住址-市（地区）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="WORK_CITY",length = 10,nullable = true)
     @FhirFieldValidate(name="WORK_CITY",displayName="工作住址-市（地区）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String workCity;
    /**
     *名称:工作住址-县（区）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="WORK_DISTRICT",length = 10,nullable = true)
     @FhirFieldValidate(name="WORK_DISTRICT",displayName="工作住址-县（区）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String workDistrict;
    /**
     *名称:工作住址-乡（镇、街道办事处）
     *
 	 *
 	 *
     */
     @Column(name="WORK_LINE",length = 100,nullable = true)
     @FhirFieldValidate(name="WORK_LINE",displayName="工作住址-乡（镇、街道办事处）",maxLength=100,required=false,valuesRange="")   
     private String workLine;
    /**
     *名称:工作住址-村（街、路、弄等）
     *
 	 *
 	 *
     */
     @Column(name="WORK_ROAD",length = 100,nullable = true)
     @FhirFieldValidate(name="WORK_ROAD",displayName="工作住址-村（街、路、弄等）",maxLength=100,required=false,valuesRange="")   
     private String workRoad;
    /**
     *名称:工作住址-门牌号码
     *
 	 *
 	 *
     */
     @Column(name="WORK_HOUSE_NO",length = 50,nullable = true)
     @FhirFieldValidate(name="WORK_HOUSE_NO",displayName="工作住址-门牌号码",maxLength=50,required=false,valuesRange="")   
     private String workHouseNo;
    /**
     *名称:工作住址-邮政编码
     *
 	 *
 	 *
     */
     @Column(name="WORK_POST_CD",length = 50,nullable = true)
     @FhirFieldValidate(name="WORK_POST_CD",displayName="工作住址-邮政编码",maxLength=50,required=false,valuesRange="")   
     private String workPostCd;
    /**
     *名称:工作住址-详细信息
     *
 	 *
 	 *
     */
     @Column(name="WORK_ADDRESS_DETAILS",length = 50,nullable = true)
     @FhirFieldValidate(name="WORK_ADDRESS_DETAILS",displayName="工作住址-详细信息",maxLength=50,required=false,valuesRange="")   
     private String workAddressDetails;
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
     *名称:联系人地址-省（自治区、直辖市）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="CONTACTS_TEMP_STATE",length = 10,nullable = true)
     @FhirFieldValidate(name="CONTACTS_TEMP_STATE",displayName="联系人地址-省（自治区、直辖市）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String contactsTempState;
    /**
     *名称:联系人地址-市（地区）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="CONTACTS_TEMP_CITY",length = 10,nullable = true)
     @FhirFieldValidate(name="CONTACTS_TEMP_CITY",displayName="联系人地址-市（地区）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String contactsTempCity;
    /**
     *名称:联系人地址-县（区）代码
     *
 	 *限制:GBT2260
 	 *
     */
     @Column(name="CONTACTS_TEMP_DISTRICT",length = 10,nullable = true)
     @FhirFieldValidate(name="CONTACTS_TEMP_DISTRICT",displayName="联系人地址-县（区）代码",maxLength=10,required=false,valuesRange="GBT2260")   
     private String contactsTempDistrict;
    /**
     *名称:联系人地址-乡（镇、街道办事处）
     *
 	 *
 	 *
     */
     @Column(name="CONTACTS_TEMP_LINE",length = 100,nullable = true)
     @FhirFieldValidate(name="CONTACTS_TEMP_LINE",displayName="联系人地址-乡（镇、街道办事处）",maxLength=100,required=false,valuesRange="")   
     private String contactsTempLine;
    /**
     *名称:联系人地址-村（街、路、弄等）
     *
 	 *
 	 *
     */
     @Column(name="CONTACTS_TEMP_ROAD",length = 100,nullable = true)
     @FhirFieldValidate(name="CONTACTS_TEMP_ROAD",displayName="联系人地址-村（街、路、弄等）",maxLength=100,required=false,valuesRange="")   
     private String contactsTempRoad;
    /**
     *名称:联系人地址-门牌号码
     *
 	 *
 	 *
     */
     @Column(name="CONTACTS_TEMP_HOUSE_NO",length = 50,nullable = true)
     @FhirFieldValidate(name="CONTACTS_TEMP_HOUSE_NO",displayName="联系人地址-门牌号码",maxLength=50,required=false,valuesRange="")   
     private String contactsTempHouseNo;
    /**
     *名称:联系人地址-详细信息
     *
 	 *
 	 *
     */
     @Column(name="CONTACTS_ADDRESS_DETAILS",length = 50,nullable = true)
     @FhirFieldValidate(name="CONTACTS_ADDRESS_DETAILS",displayName="联系人地址-详细信息",maxLength=50,required=false,valuesRange="")   
     private String contactsAddressDetails;
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
     *名称:住院医师职务代码
     *
 	 *限制:CV9900374
 	 *
     */
     @Column(name="RESIDENT_DOCTOR_POST_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="RESIDENT_DOCTOR_POST_CODE",displayName="住院医师职务代码",maxLength=20,required=false,valuesRange="CV9900374")   
     private String residentDoctorPostCode;
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
     *名称:主治医师职务代码
     *
 	 *限制:CV9900374
 	 *
     */
     @Column(name="ATTENDING_DOCTOR_POST_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="ATTENDING_DOCTOR_POST_CODE",displayName="主治医师职务代码",maxLength=20,required=false,valuesRange="CV9900374")   
     private String attendingDoctorPostCode;
    /**
     *名称:主任医师签名日期
     *
 	 *
 	 *
     */
     @Column(name="DIRECTOR_DOCTOR_SIGN_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="DIRECTOR_DOCTOR_SIGN_DATE",displayName="主任医师签名日期",required=false,valuesRange="")   
     private Date directorDoctorSignDate;
    /**
     *名称:主任医师id
     *
 	 *
 	 *
     */
     @Column(name="DIRECTOR_DOCTOR_ID",length = 40,nullable = true)
     @FhirFieldValidate(name="DIRECTOR_DOCTOR_ID",displayName="主任医师id",maxLength=40,required=false,valuesRange="")   
     private String directorDoctorId;
    /**
     *名称:主任医师姓名
     *
 	 *
 	 *
     */
     @Column(name="DIRECTOR_DOCTOR_NAME",length = 20,nullable = true)
     @FhirFieldValidate(name="DIRECTOR_DOCTOR_NAME",displayName="主任医师姓名",maxLength=20,required=false,valuesRange="")   
     private String directorDoctorName;
    /**
     *名称:主任医师职务代码
     *
 	 *限制:CV9900374
 	 *
     */
     @Column(name="DIRECTOR_DOCTOR_POST_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="DIRECTOR_DOCTOR_POST_CODE",displayName="主任医师职务代码",maxLength=20,required=false,valuesRange="CV9900374")   
     private String directorDoctorPostCode;
    /**
     *名称:病房号
     *
 	 *
 	 *
     */
     @Column(name="WARD_NO",length = 40,nullable = true)
     @FhirFieldValidate(name="WARD_NO",displayName="病房号",maxLength=40,required=false,valuesRange="")   
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
     @Column(name="BED_NUM",length = 40,nullable = true)
     @FhirFieldValidate(name="BED_NUM",displayName="床位号",maxLength=40,required=false,valuesRange="")   
     private String bedNum;
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
     *名称:死亡原因代码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="DEATH_CAUSE_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="DEATH_CAUSE_CODE",displayName="死亡原因代码",maxLength=20,required=false,valuesRange="CV990111")   
     private String deathCauseCode;
    /**
     *名称:死亡原因名称
     *
 	 *
 	 *
     */
     @Column(name="DEATH_CAUSE_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="DEATH_CAUSE_NAME",displayName="死亡原因名称",maxLength=40,required=false,valuesRange="")   
     private String deathCauseName;
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
     *名称:死亡地点类别
     *
 	 *限制:CV0201103
 	 *
     */
     @Column(name="DEATH_PLACE_CATEGORY",length = 40,nullable = true)
     @FhirFieldValidate(name="DEATH_PLACE_CATEGORY",displayName="死亡地点类别",maxLength=40,required=false,valuesRange="CV0201103")   
     private String deathPlaceCategory;
    /**
     *名称:死亡原因分类代码
     *
 	 *限制:CV9900379
 	 *
     */
     @Column(name="DEATH_CAUSE_CLASSIFICATION_CODE",length = 40,nullable = true)
     @FhirFieldValidate(name="DEATH_CAUSE_CLASSIFICATION_CODE",displayName="死亡原因分类代码",maxLength=40,required=false,valuesRange="CV9900379")   
     private String deathCauseClassificationCode;
    /**
     *名称:主要致死疾病的最高诊断机构级别代码
     *
 	 *限制:CV0810004
 	 *
     */
     @Column(name="HIGHEST_DIAGNOSTIC_LEVEL",length = 40,nullable = true)
     @FhirFieldValidate(name="HIGHEST_DIAGNOSTIC_LEVEL",displayName="主要致死疾病的最高诊断机构级别代码",maxLength=40,required=false,valuesRange="CV0810004")   
     private String highestDiagnosticLevel;
    /**
     *名称:死亡最高诊断依据类别代码
     *
 	 *限制:CV0501037
 	 *
     */
     @Column(name="HIGHEST_DEATH_DIAGNOSIS_CATEGORY_CODE",length = 40,nullable = true)
     @FhirFieldValidate(name="HIGHEST_DEATH_DIAGNOSIS_CATEGORY_CODE",displayName="死亡最高诊断依据类别代码",maxLength=40,required=false,valuesRange="CV0501037")   
     private String highestDeathDiagnosisCategoryCode;
    /**
     *名称:死亡诊断编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="DEATH_DIAG_CODE",length = 20,nullable = true)
     @FhirFieldValidate(name="DEATH_DIAG_CODE",displayName="死亡诊断编码",maxLength=20,required=false,valuesRange="CV990111")   
     private String deathDiagCode;
    /**
     *名称:死亡诊断名称
     *
 	 *
 	 *
     */
     @Column(name="DEATH_DIAG_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="DEATH_DIAG_NAME",displayName="死亡诊断名称",maxLength=40,required=false,valuesRange="")   
     private String deathDiagName;
    /**
     *名称:入院诊断-入院情况
     *
 	 *
 	 *
     */
     @Column(name="INPATIENT_DIAG_DETAILS",length = 100,nullable = true)
     @FhirFieldValidate(name="INPATIENT_DIAG_DETAILS",displayName="入院诊断-入院情况",maxLength=100,required=false,valuesRange="")   
     private String inpatientDiagDetails;
    /**
     *名称:入院诊断-诊断编码
     *
 	 *限制:CV990111
 	 *
     */
     @Column(name="INPATIENT_DIAG_CODE",length = 100,nullable = true)
     @FhirFieldValidate(name="INPATIENT_DIAG_CODE",displayName="入院诊断-诊断编码",maxLength=100,required=false,valuesRange="CV990111")   
     private String inpatientDiagCode;
    /**
     *名称:入院诊断-诊断名称
     *
 	 *
 	 *
     */
     @Column(name="INPATIENT_DIAG_NAME",length = 40,nullable = true)
     @FhirFieldValidate(name="INPATIENT_DIAG_NAME",displayName="入院诊断-诊断名称",maxLength=40,required=false,valuesRange="")   
     private String inpatientDiagName;
    /**
     *名称:入院诊断-诊断日期
     *
 	 *
 	 *
     */
     @Column(name="INPATIENT_DIAG_DATE",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="INPATIENT_DIAG_DATE",displayName="入院诊断-诊断日期",required=false,valuesRange="")   
     private Date inpatientDiagDate;
    /**
     *名称:住院过程-诊疗过程描述
     *
 	 *
 	 *
     */
     @Column(name="TREAT_RESCUE_COURSE",length = 500,nullable = true)
     @FhirFieldValidate(name="TREAT_RESCUE_COURSE",displayName="住院过程-诊疗过程描述",maxLength=500,required=false,valuesRange="")   
     private String treatRescueCourse;
    /**
     *名称:尸检意见-家属是否同意尸体解剖标志
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="FAMILY_ADVICE_FOR_DISSECT",length = 5,nullable = true)
     @FhirFieldValidate(name="FAMILY_ADVICE_FOR_DISSECT",displayName="尸检意见-家属是否同意尸体解剖标志",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean familyAdviceForDissect;
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
     *名称:上传机构名称
     *备注:上传数据医疗机构在市平台的机构代码
 	 *
 	 *
     */
     @Column(name="UP_HOSPITAL_NAME",length = 40,nullable = false)
     @FhirFieldValidate(name="UP_HOSPITAL_NAME",displayName="上传机构名称",maxLength=40,required=true,valuesRange="")   
     private String upHospitalName;
     @javax.persistence.OrderBy("upTime DESC")
     @OneToMany(mappedBy="hcrDeathRecord",cascade=CascadeType.ALL,fetch=javax.persistence.FetchType.EAGER)
     @org.hibernate.annotations.Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
     private List<HcrDeathCauseLineRecord> hcrDeathCauseLineRecords;
    
     public String getHcrDeathRecordId(){
       	return this.hcrDeathRecordId;
     }
     public void setHcrDeathRecordId(String hcrDeathRecordId){
       	this.hcrDeathRecordId=hcrDeathRecordId;
     }
     public Date getDate(){
       	return this.date;
     }
     public void setDate(Date date){
       	this.date=date;
     }
     public Float getAge(){
       	return this.age;
     }
     public void setAge(Float age){
       	this.age=age;
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
     public String getEducationCd(){
       	return this.educationCd;
     }
     public void setEducationCd(String educationCd){
       	this.educationCd=educationCd;
     }
     public Date getBirthdate(){
       	return this.birthdate;
     }
     public void setBirthdate(Date birthdate){
       	this.birthdate=birthdate;
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
     public String getNationalityCode(){
       	return this.nationalityCode;
     }
     public void setNationalityCode(String nationalityCode){
       	this.nationalityCode=nationalityCode;
     }
     public String getAdministration(){
       	return this.administration;
     }
     public void setAdministration(String administration){
       	this.administration=administration;
     }
     public String getWorkUnit(){
       	return this.workUnit;
     }
     public void setWorkUnit(String workUnit){
       	this.workUnit=workUnit;
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
     public String getHomePostCd(){
       	return this.homePostCd;
     }
     public void setHomePostCd(String homePostCd){
       	this.homePostCd=homePostCd;
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
     public String getTempText(){
       	return this.tempText;
     }
     public void setTempText(String tempText){
       	this.tempText=tempText;
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
     public String getWorkAddressDetails(){
       	return this.workAddressDetails;
     }
     public void setWorkAddressDetails(String workAddressDetails){
       	this.workAddressDetails=workAddressDetails;
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
     public String getContactsTempState(){
       	return this.contactsTempState;
     }
     public void setContactsTempState(String contactsTempState){
       	this.contactsTempState=contactsTempState;
     }
     public String getContactsTempCity(){
       	return this.contactsTempCity;
     }
     public void setContactsTempCity(String contactsTempCity){
       	this.contactsTempCity=contactsTempCity;
     }
     public String getContactsTempDistrict(){
       	return this.contactsTempDistrict;
     }
     public void setContactsTempDistrict(String contactsTempDistrict){
       	this.contactsTempDistrict=contactsTempDistrict;
     }
     public String getContactsTempLine(){
       	return this.contactsTempLine;
     }
     public void setContactsTempLine(String contactsTempLine){
       	this.contactsTempLine=contactsTempLine;
     }
     public String getContactsTempRoad(){
       	return this.contactsTempRoad;
     }
     public void setContactsTempRoad(String contactsTempRoad){
       	this.contactsTempRoad=contactsTempRoad;
     }
     public String getContactsTempHouseNo(){
       	return this.contactsTempHouseNo;
     }
     public void setContactsTempHouseNo(String contactsTempHouseNo){
       	this.contactsTempHouseNo=contactsTempHouseNo;
     }
     public String getContactsAddressDetails(){
       	return this.contactsAddressDetails;
     }
     public void setContactsAddressDetails(String contactsAddressDetails){
       	this.contactsAddressDetails=contactsAddressDetails;
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
     public Date getResidentDoctorSignDate(){
       	return this.residentDoctorSignDate;
     }
     public void setResidentDoctorSignDate(Date residentDoctorSignDate){
       	this.residentDoctorSignDate=residentDoctorSignDate;
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
     public String getResidentDoctorPostCode(){
       	return this.residentDoctorPostCode;
     }
     public void setResidentDoctorPostCode(String residentDoctorPostCode){
       	this.residentDoctorPostCode=residentDoctorPostCode;
     }
     public Date getAttendingDoctorSignDate(){
       	return this.attendingDoctorSignDate;
     }
     public void setAttendingDoctorSignDate(Date attendingDoctorSignDate){
       	this.attendingDoctorSignDate=attendingDoctorSignDate;
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
     public String getAttendingDoctorPostCode(){
       	return this.attendingDoctorPostCode;
     }
     public void setAttendingDoctorPostCode(String attendingDoctorPostCode){
       	this.attendingDoctorPostCode=attendingDoctorPostCode;
     }
     public Date getDirectorDoctorSignDate(){
       	return this.directorDoctorSignDate;
     }
     public void setDirectorDoctorSignDate(Date directorDoctorSignDate){
       	this.directorDoctorSignDate=directorDoctorSignDate;
     }
     public String getDirectorDoctorId(){
       	return this.directorDoctorId;
     }
     public void setDirectorDoctorId(String directorDoctorId){
       	this.directorDoctorId=directorDoctorId;
     }
     public String getDirectorDoctorName(){
       	return this.directorDoctorName;
     }
     public void setDirectorDoctorName(String directorDoctorName){
       	this.directorDoctorName=directorDoctorName;
     }
     public String getDirectorDoctorPostCode(){
       	return this.directorDoctorPostCode;
     }
     public void setDirectorDoctorPostCode(String directorDoctorPostCode){
       	this.directorDoctorPostCode=directorDoctorPostCode;
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
     public String getInpatientRegistrationId(){
       	return this.inpatientRegistrationId;
     }
     public void setInpatientRegistrationId(String inpatientRegistrationId){
       	this.inpatientRegistrationId=inpatientRegistrationId;
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
     public String getDeathCauseCode(){
       	return this.deathCauseCode;
     }
     public void setDeathCauseCode(String deathCauseCode){
       	this.deathCauseCode=deathCauseCode;
     }
     public String getDeathCauseName(){
       	return this.deathCauseName;
     }
     public void setDeathCauseName(String deathCauseName){
       	this.deathCauseName=deathCauseName;
     }
     public Date getDeathTime(){
       	return this.deathTime;
     }
     public void setDeathTime(Date deathTime){
       	this.deathTime=deathTime;
     }
     public String getDeathPlaceCategory(){
       	return this.deathPlaceCategory;
     }
     public void setDeathPlaceCategory(String deathPlaceCategory){
       	this.deathPlaceCategory=deathPlaceCategory;
     }
     public String getDeathCauseClassificationCode(){
       	return this.deathCauseClassificationCode;
     }
     public void setDeathCauseClassificationCode(String deathCauseClassificationCode){
       	this.deathCauseClassificationCode=deathCauseClassificationCode;
     }
     public String getHighestDiagnosticLevel(){
       	return this.highestDiagnosticLevel;
     }
     public void setHighestDiagnosticLevel(String highestDiagnosticLevel){
       	this.highestDiagnosticLevel=highestDiagnosticLevel;
     }
     public String getHighestDeathDiagnosisCategoryCode(){
       	return this.highestDeathDiagnosisCategoryCode;
     }
     public void setHighestDeathDiagnosisCategoryCode(String highestDeathDiagnosisCategoryCode){
       	this.highestDeathDiagnosisCategoryCode=highestDeathDiagnosisCategoryCode;
     }
     public String getDeathDiagCode(){
       	return this.deathDiagCode;
     }
     public void setDeathDiagCode(String deathDiagCode){
       	this.deathDiagCode=deathDiagCode;
     }
     public String getDeathDiagName(){
       	return this.deathDiagName;
     }
     public void setDeathDiagName(String deathDiagName){
       	this.deathDiagName=deathDiagName;
     }
     public String getInpatientDiagDetails(){
       	return this.inpatientDiagDetails;
     }
     public void setInpatientDiagDetails(String inpatientDiagDetails){
       	this.inpatientDiagDetails=inpatientDiagDetails;
     }
     public String getInpatientDiagCode(){
       	return this.inpatientDiagCode;
     }
     public void setInpatientDiagCode(String inpatientDiagCode){
       	this.inpatientDiagCode=inpatientDiagCode;
     }
     public String getInpatientDiagName(){
       	return this.inpatientDiagName;
     }
     public void setInpatientDiagName(String inpatientDiagName){
       	this.inpatientDiagName=inpatientDiagName;
     }
     public Date getInpatientDiagDate(){
       	return this.inpatientDiagDate;
     }
     public void setInpatientDiagDate(Date inpatientDiagDate){
       	this.inpatientDiagDate=inpatientDiagDate;
     }
     public String getTreatRescueCourse(){
       	return this.treatRescueCourse;
     }
     public void setTreatRescueCourse(String treatRescueCourse){
       	this.treatRescueCourse=treatRescueCourse;
     }
     public Boolean getFamilyAdviceForDissect(){
       	return this.familyAdviceForDissect;
     }
     public void setFamilyAdviceForDissect(Boolean familyAdviceForDissect){
       	this.familyAdviceForDissect=familyAdviceForDissect;
     }
     public Date getVisitingTime(){
       	return this.visitingTime;
     }
     public void setVisitingTime(Date visitingTime){
       	this.visitingTime=visitingTime;
     }
     public String getUpHospitalName(){
       	return this.upHospitalName;
     }
     public void setUpHospitalName(String upHospitalName){
       	this.upHospitalName=upHospitalName;
     }
     public List<HcrDeathCauseLineRecord> getHcrDeathCauseLineRecords(){
       	return this.hcrDeathCauseLineRecords;
    }
     public void setHcrDeathCauseLineRecords(List<HcrDeathCauseLineRecord> hcrDeathCauseLineRecords){
        this.hcrDeathCauseLineRecords=hcrDeathCauseLineRecords;
    }
}