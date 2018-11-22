var datetimeValueHandler = function(value){
	var date = new Date(value);
	return date.format('yyyy-MM-dd hh:mm:ss');
};
var fieldModels = [ 
{
'name' : 'PATIENT_ID',
'displayName' : '院内患者ID',
'type' : 'varchar(40)',
'javaName' : 'patientId',
'note' : '患者信息在院内系统中的唯一标识',
'nullable':false,
'check':''},
{
'name' : 'PATIENT_SERVICE_NO',
'displayName' : '就诊卡号',
'type' : 'varchar(40)',
'javaName' : 'patientServiceNo',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'ID_TYPE_CODE',
'displayName' : '证件类别代码',
'type' : 'varchar(10)',
'javaName' : 'idTypeCode',
'note' : '',
'nullable':false,
'check':'CUS00018'},
{
'name' : 'ID_NO',
'displayName' : '证件号码',
'type' : 'varchar(50)',
'javaName' : 'idNo',
'note' : '',
'nullable':false,
'check':''},
{
'name' : 'SOCIAL_INSURANCE_CARD',
'displayName' : '社保卡号',
'type' : 'varchar(40)',
'javaName' : 'socialInsuranceCard',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'MEDICAL_INSURANCE_CARD',
'displayName' : '医疗保险卡号',
'type' : 'varchar(40)',
'javaName' : 'medicalInsuranceCard',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'HEALTH_FILE_NUMBER',
'displayName' : '城乡居民健康档案编号',
'type' : 'varchar(40)',
'javaName' : 'healthFileNumber',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'NCMS_CARD',
'displayName' : '新农合卡号',
'type' : 'varchar(40)',
'javaName' : 'ncmsCard',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'HEALTH_CARD',
'displayName' : '健康卡号',
'type' : 'varchar(40)',
'javaName' : 'healthCard',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'HEALTH_CARD_TEMP',
'displayName' : '健康卡临时卡号',
'type' : 'varchar(40)',
'javaName' : 'healthCardTemp',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'NAME',
'displayName' : '姓名',
'type' : 'varchar(20)',
'javaName' : 'name',
'note' : '',
'nullable':false,
'check':''},
{
'name' : 'AGE',
'displayName' : '年龄',
'type' : 'number(3)',
'javaName' : 'age',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'EXACT_AGE',
'displayName' : '实足年龄',
'type' : 'number(3)',
'javaName' : 'exactAge',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'HOME_PHONE',
'displayName' : '家庭联系方式',
'type' : 'varchar(20)',
'javaName' : 'homePhone',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'WORK_PHONE',
'displayName' : '工作联系方式',
'type' : 'varchar(20)',
'javaName' : 'workPhone',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'MOBILE_PHONE',
'displayName' : '个人联系方式',
'type' : 'varchar(20)',
'javaName' : 'mobilePhone',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'TEMP_PHONE',
'displayName' : '临时联系方式',
'type' : 'varchar(20)',
'javaName' : 'tempPhone',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'TEMP_EMAIL',
'displayName' : '电子邮箱',
'type' : 'varchar(20)',
'javaName' : 'tempEmail',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'GENDER',
'displayName' : '性别',
'type' : 'varchar(10)',
'javaName' : 'gender',
'note' : '',
'nullable':false,
'check':'GBT22611'},
{
'name' : 'BIRTHDATE',
'displayName' : '出生日期',
'type' : 'date',
'javaName' : 'birthdate',
'note' : '',
'nullable':false,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'MARITALSTATUS',
'displayName' : '婚姻状况代码',
'type' : 'varchar(20)',
'javaName' : 'maritalstatus',
'note' : '',
'nullable':false,
'check':'GBT22612'},
{
'name' : 'HOME_STATE',
'displayName' : '家庭住址-省（自治区、直辖市）代码',
'type' : 'varchar(10)',
'javaName' : 'homeState',
'note' : '',
'nullable':true,
'check':'GBT2260'},
{
'name' : 'HOME_CITY',
'displayName' : '家庭住址-市（地区）代码',
'type' : 'varchar(10)',
'javaName' : 'homeCity',
'note' : '',
'nullable':true,
'check':'GBT2260'},
{
'name' : 'HOME_DISTRICT',
'displayName' : '家庭住址-县（区）代码',
'type' : 'varchar(10)',
'javaName' : 'homeDistrict',
'note' : '',
'nullable':true,
'check':'GBT2260'},
{
'name' : 'HOME_LINE',
'displayName' : '家庭住址-乡（镇、街道办事处）',
'type' : 'varchar(100)',
'javaName' : 'homeLine',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'HOME_ROAD',
'displayName' : '家庭住址-村（街、路、弄等）',
'type' : 'varchar(100)',
'javaName' : 'homeRoad',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'HOME_HOUSE_NO',
'displayName' : '家庭住址-门牌号码',
'type' : 'varchar(50)',
'javaName' : 'homeHouseNo',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'HOME_TEXT',
'displayName' : '家庭住址-详细信息',
'type' : 'varchar(500)',
'javaName' : 'homeText',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'TEMP_STATE',
'displayName' : '现居住住址-省（自治区、直辖市）代码',
'type' : 'varchar(10)',
'javaName' : 'tempState',
'note' : '',
'nullable':true,
'check':'GBT2260'},
{
'name' : 'TEMP_CITY',
'displayName' : '现居住住址-市（地区）代码',
'type' : 'varchar(10)',
'javaName' : 'tempCity',
'note' : '',
'nullable':true,
'check':'GBT2260'},
{
'name' : 'TEMP_DISTRICT',
'displayName' : '现居住住址-县（区）代码',
'type' : 'varchar(10)',
'javaName' : 'tempDistrict',
'note' : '',
'nullable':true,
'check':'GBT2260'},
{
'name' : 'TEMP_LINE',
'displayName' : '现居住住址-乡（镇、街道办事处）',
'type' : 'varchar(100)',
'javaName' : 'tempLine',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'TEMP_ROAD',
'displayName' : '现居住住址-村（街、路、弄等）',
'type' : 'varchar(100)',
'javaName' : 'tempRoad',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'TEMP_HOUSE_NO',
'displayName' : '现居住住址-门牌号码',
'type' : 'varchar(50)',
'javaName' : 'tempHouseNo',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'TEMP_TEXT',
'displayName' : '现居住住址-详细信息',
'type' : 'varchar(500)',
'javaName' : 'tempText',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'TEMP_POST_CD',
'displayName' : '现地址邮政编码',
'type' : 'varchar(50)',
'javaName' : 'tempPostCd',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'WORK_STATE',
'displayName' : '工作单位住址-省（自治区、直辖市）代码',
'type' : 'varchar(10)',
'javaName' : 'workState',
'note' : '',
'nullable':true,
'check':'GBT2260'},
{
'name' : 'WORK_CITY',
'displayName' : '工作单位住址-市（地区）代码',
'type' : 'varchar(10)',
'javaName' : 'workCity',
'note' : '',
'nullable':true,
'check':'GBT2260'},
{
'name' : 'WORK_DISTRICT',
'displayName' : '工作单位住址-县（区）代码',
'type' : 'varchar(10)',
'javaName' : 'workDistrict',
'note' : '',
'nullable':true,
'check':'GBT2260'},
{
'name' : 'WORK_LINE',
'displayName' : '工作单位住址-乡（镇、街道办事处）',
'type' : 'varchar(100)',
'javaName' : 'workLine',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'WORK_ROAD',
'displayName' : '工作单位住址-村（街、路、弄等）',
'type' : 'varchar(100)',
'javaName' : 'workRoad',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'WORK_HOUSE_NO',
'displayName' : '工作单位住址-门牌号码',
'type' : 'varchar(50)',
'javaName' : 'workHouseNo',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'WORK_TEXT',
'displayName' : '工作单位住址-详细信息',
'type' : 'varchar(500)',
'javaName' : 'workText',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'WORK_POST_CD',
'displayName' : '工作单位邮政编码',
'type' : 'varchar(50)',
'javaName' : 'workPostCd',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'BIRTH_STATE',
'displayName' : '出生地-省（自治区、直辖市）代码',
'type' : 'varchar(10)',
'javaName' : 'birthState',
'note' : '',
'nullable':true,
'check':'GBT2260'},
{
'name' : 'BIRTH_CITY',
'displayName' : '出生地-市（地区）代码',
'type' : 'varchar(10)',
'javaName' : 'birthCity',
'note' : '',
'nullable':true,
'check':'GBT2260'},
{
'name' : 'BIRTH_DISTRICT',
'displayName' : '出生地-县（区）代码',
'type' : 'varchar(10)',
'javaName' : 'birthDistrict',
'note' : '',
'nullable':true,
'check':'GBT2260'},
{
'name' : 'BIRTH_LINE',
'displayName' : '出生地-乡（镇、街道办事处）',
'type' : 'varchar(100)',
'javaName' : 'birthLine',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'BIRTH_ROAD',
'displayName' : '出生地-村（街、路、弄等）',
'type' : 'varchar(100)',
'javaName' : 'birthRoad',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'BIRTH_HOUSE_NO',
'displayName' : '出生地-门牌号码',
'type' : 'varchar(50)',
'javaName' : 'birthHouseNo',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'RPR_ADDR_PROVINCE',
'displayName' : '户籍登记所在地址的省、自治区或直辖市名称',
'type' : 'varchar(50)',
'javaName' : 'rprAddrProvince',
'note' : '',
'nullable':true,
'check':'GBT2260'},
{
'name' : 'RPR_ADDR_CITY',
'displayName' : '户籍登记所在地址的市、地区或州的名称',
'type' : 'varchar(50)',
'javaName' : 'rprAddrCity',
'note' : '',
'nullable':true,
'check':'GBT2260'},
{
'name' : 'RPR_ADDR_AREA',
'displayName' : '户籍登记所在地址的县（区）的名称',
'type' : 'varchar(50)',
'javaName' : 'rprAddrArea',
'note' : '',
'nullable':true,
'check':'GBT2260'},
{
'name' : 'RPR_ADDR_STREET',
'displayName' : '户籍登记所在地址的乡、镇或城市的街道办事处名称',
'type' : 'varchar(100)',
'javaName' : 'rprAddrStreet',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'RPR_ADDR_VILLAGE',
'displayName' : '户籍登记所在地址的村或城市的街、路、里、弄等名称',
'type' : 'varchar(100)',
'javaName' : 'rprAddrVillage',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'RPR_ADDR_HOUSE',
'displayName' : '户籍登记所在地址的门牌号码',
'type' : 'varchar(50)',
'javaName' : 'rprAddrHouse',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'RPR_POST',
'displayName' : '户口地址邮编',
'type' : 'varchar(50)',
'javaName' : 'rprPost',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'RPR_PHONE',
'displayName' : '户口电话',
'type' : 'varchar(50)',
'javaName' : 'rprPhone',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'RPR_ADDR',
'displayName' : '户口地址',
'type' : 'varchar(100)',
'javaName' : 'rprAddr',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'NATIVE_PROVINCE',
'displayName' : '籍贯-省代码',
'type' : 'varchar(20)',
'javaName' : 'nativeProvince',
'note' : '',
'nullable':true,
'check':'GBT2260'},
{
'name' : 'NATIVE_CITY',
'displayName' : '籍贯-市代码',
'type' : 'varchar(20)',
'javaName' : 'nativeCity',
'note' : '',
'nullable':true,
'check':'GBT2260'},
{
'name' : 'ADMINISTRATION',
'displayName' : '行政区划代码',
'type' : 'varchar(20)',
'javaName' : 'administration',
'note' : '',
'nullable':true,
'check':'GBT2260'},
{
'name' : 'NATION_CD',
'displayName' : '民族代码',
'type' : 'varchar(20)',
'javaName' : 'nationCd',
'note' : '',
'nullable':true,
'check':'CV9900377'},
{
'name' : 'NATIONALITY_CODE',
'displayName' : '国籍代码',
'type' : 'varchar(20)',
'javaName' : 'nationalityCode',
'note' : '',
'nullable':true,
'check':'GBT2659'},
{
'name' : 'OCCUPATION_CD',
'displayName' : '职业代码',
'type' : 'varchar(20)',
'javaName' : 'occupationCd',
'note' : '',
'nullable':true,
'check':'GBT22614'},
{
'name' : 'MEDICAL_INSURANCE_CATEGORY',
'displayName' : '医疗保险类别代码',
'type' : 'varchar(20)',
'javaName' : 'medicalInsuranceCategory',
'note' : '',
'nullable':false,
'check':'CV9900281'},
{
'name' : 'WORK_UNIT',
'displayName' : '工作单位',
'type' : 'varchar(100)',
'javaName' : 'workUnit',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'PATIENT_TYPE',
'displayName' : '患者类型',
'type' : 'varchar(20)',
'javaName' : 'patientType',
'note' : '',
'nullable':true,
'check':'CV0900404'},
{
'name' : 'IF_RRITABILITY',
'displayName' : '是否有过敏史',
'type' : 'number(5)',
'javaName' : 'ifRritability',
'note' : '',
'nullable':true,
'check':'CUS00004'},
{
'name' : 'RRITABILITY',
'displayName' : '过敏史其他描述',
'type' : 'varchar(1000)',
'javaName' : 'rritability',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'ABO_CD',
'displayName' : 'ABO血型代码',
'type' : 'varchar(20)',
'javaName' : 'aboCd',
'note' : '',
'nullable':true,
'check':'CV0450005'},
{
'name' : 'RH_CD',
'displayName' : 'RH血型代码',
'type' : 'varchar(20)',
'javaName' : 'rhCd',
'note' : '',
'nullable':true,
'check':'CV0450020'},
{
'name' : 'RH_NEG_CD',
'displayName' : 'RH阴性代码',
'type' : 'varchar(20)',
'javaName' : 'rhNegCd',
'note' : '',
'nullable':true,
'check':'CV9900361'},
{
'name' : 'RELIGION_CODE',
'displayName' : '宗教信仰代码',
'type' : 'varchar(20)',
'javaName' : 'religionCode',
'note' : '',
'nullable':true,
'check':'GA21412'},
{
'name' : 'ENGLISH_NAME',
'displayName' : '英文姓名',
'type' : 'varchar(50)',
'javaName' : 'englishName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'DIE_DATE',
'displayName' : '死亡日期',
'type' : 'date',
'javaName' : 'dieDate',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'BODY_WEIGHT',
'displayName' : '新生儿体重',
'type' : 'number(8)',
'javaName' : 'bodyWeight',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'INPAT_WEIGHT',
'displayName' : '新生儿入院时体重',
'type' : 'number(8)',
'javaName' : 'inpatWeight',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'EDUCATION_CD',
'displayName' : '学历代码',
'type' : 'varchar(20)',
'javaName' : 'educationCd',
'note' : '',
'nullable':true,
'check':'GBT4658'},
{
'name' : 'USUAL_TYPE_MARK',
'displayName' : '常住地址户籍标志',
'type' : 'number(5)',
'javaName' : 'usualTypeMark',
'note' : '',
'nullable':true,
'check':'CUS00004'},
{
'name' : 'SERVICE_PREMISES',
'displayName' : '服务处所',
'type' : 'varchar(100)',
'javaName' : 'servicePremises',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'SERVICE_PREMISES_TYPE_CD',
'displayName' : '服务处所类型代码',
'type' : 'varchar(20)',
'javaName' : 'servicePremisesTypeCd',
'note' : '',
'nullable':true,
'check':'CV9900292'},
{
'name' : 'IN_DATE',
'displayName' : '进入服务场所日期',
'type' : 'date',
'javaName' : 'inDate',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'IN_REASON_CD',
'displayName' : '进入原因代码',
'type' : 'varchar(20)',
'javaName' : 'inReasonCd',
'note' : '',
'nullable':true,
'check':'CV9900295'},
{
'name' : 'OUT_DATE',
'displayName' : '退出日期',
'type' : 'date',
'javaName' : 'outDate',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'OUT_REASON_CD',
'displayName' : '退出原因代码',
'type' : 'varchar(20)',
'javaName' : 'outReasonCd',
'note' : '',
'nullable':true,
'check':'CV9900296'},
{
'name' : 'MANAGE_UNIT_NO',
'displayName' : '管理单位号码',
'type' : 'varchar(100)',
'javaName' : 'manageUnitNo',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'VETERANS_MILITARY_MARK',
'displayName' : '退伍军人标志',
'type' : 'number(5)',
'javaName' : 'veteransMilitaryMark',
'note' : '',
'nullable':true,
'check':'CUS00004'},
{
'name' : 'CARD_NO',
'displayName' : '卡号',
'type' : 'varchar(50)',
'javaName' : 'cardNo',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'CARD_AREA',
'displayName' : '发卡地区',
'type' : 'varchar(20)',
'javaName' : 'cardArea',
'note' : '',
'nullable':true,
'check':'GBT2260'},
{
'name' : 'INSURE_TYPE',
'displayName' : '保险类型',
'type' : 'varchar(20)',
'javaName' : 'insureType',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'MEDICAL_TREATMENT_CD',
'displayName' : '医疗待遇代码',
'type' : 'varchar(20)',
'javaName' : 'medicalTreatmentCd',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'PATIENT_TYPE_DESCR',
'displayName' : '患者就诊类别描述',
'type' : 'varchar(50)',
'javaName' : 'patientTypeDescr',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'RESPONS_DOC_CODE',
'displayName' : '责任医师id',
'type' : 'varchar(20)',
'javaName' : 'responsDocCode',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'OTHER_OCCC_DESCR',
'displayName' : '其他职业描述',
'type' : 'varchar(100)',
'javaName' : 'otherOcccDescr',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'ISSUING_AGENCY',
'displayName' : '发证机关',
'type' : 'varchar(100)',
'javaName' : 'issuingAgency',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'ISSUING_AGENCY_CD',
'displayName' : '发证机关所在地',
'type' : 'varchar(100)',
'javaName' : 'issuingAgencyCd',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'VALID_DATE',
'displayName' : '有效期',
'type' : 'varchar(50)',
'javaName' : 'validDate',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'REGISTER_DATE',
'displayName' : '建档日期',
'type' : 'date',
'javaName' : 'registerDate',
'note' : '',
'nullable':false,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'REGISTER_PERSON_CODE',
'displayName' : '建档人员代码',
'type' : 'varchar(50)',
'javaName' : 'registerPersonCode',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'REGISTER_PERSON_NAME',
'displayName' : '建档人员姓名',
'type' : 'varchar(50)',
'javaName' : 'registerPersonName',
'note' : '',
'nullable':false,
'check':''},
{
'name' : 'REGISTER_ORG_CODE',
'displayName' : '注册机构代码',
'type' : 'varchar(50)',
'javaName' : 'registerOrgCode',
'note' : '',
'nullable':false,
'check':''},
{
'name' : 'REGISTER_ORG_NAME',
'displayName' : '注册机构名称',
'type' : 'varchar(50)',
'javaName' : 'registerOrgName',
'note' : '',
'nullable':false,
'check':''},
{
'name' : 'CONSTR_ORG_CODE',
'displayName' : '建档医疗机构代码',
'type' : 'varchar(50)',
'javaName' : 'constrOrgCode',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'PROVIDER_ORG_CODE',
'displayName' : '开发商机构代码',
'type' : 'varchar(50)',
'javaName' : 'providerOrgCode',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'REMARK',
'displayName' : '备注',
'type' : 'varchar(200)',
'javaName' : 'remark',
'note' : '',
'nullable':true,
'check':''}
];