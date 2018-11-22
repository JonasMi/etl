var datetimeValueHandler = function(value){
	var date = new Date(value);
	return date.format('yyyy-MM-dd hh:mm:ss');
};
var fieldModels = [ 
{
'name' : 'DEATH_PROOF_ID',
'displayName' : '死亡医学证明id',
'type' : 'varchar(40)',
'javaName' : 'deathProofId',
'note' : '',
'nullable':false,
'check':''},
{
'name' : 'DATE',
'displayName' : '记录日期',
'type' : 'date',
'javaName' : 'date',
'note' : '',
'nullable':false,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'AUTHOR_ID',
'displayName' : '文档创建者id',
'type' : 'varchar(40)',
'javaName' : 'authorId',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'AUTHOR_NAME',
'displayName' : '文档创建者姓名',
'type' : 'varchar(20)',
'javaName' : 'authorName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'PATIENT_ID',
'displayName' : '院内患者ID',
'type' : 'varchar(40)',
'javaName' : 'patientId',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'ID_CARD',
'displayName' : '身份证号',
'type' : 'varchar(40)',
'javaName' : 'idCard',
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
'name' : 'HEALTH_CARD',
'displayName' : '健康卡号',
'type' : 'varchar(40)',
'javaName' : 'healthCard',
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
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'NATION_CD',
'displayName' : '民族代码',
'type' : 'varchar(20)',
'javaName' : 'nationCd',
'note' : '',
'nullable':true,
'check':'CV9900377'},
{
'name' : 'EDUCATION_CD',
'displayName' : '学历代码',
'type' : 'varchar(20)',
'javaName' : 'educationCd',
'note' : '',
'nullable':true,
'check':'GBT4658'},
{
'name' : 'OCCUPATION_CD',
'displayName' : '职业代码',
'type' : 'varchar(20)',
'javaName' : 'occupationCd',
'note' : '',
'nullable':true,
'check':'GBT22614'},
{
'name' : 'RPR_ADDR_PROVINCE',
'displayName' : '户籍登记所在地址的省、自治区或直辖市名称',
'type' : 'varchar(40)',
'javaName' : 'rprAddrProvince',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'RPR_ADDR_CITY',
'displayName' : '户籍登记所在地址的市、地区或州的名称',
'type' : 'varchar(40)',
'javaName' : 'rprAddrCity',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'RPR_ADDR_AREA',
'displayName' : '户籍登记所在地址的县（区）的名称',
'type' : 'varchar(40)',
'javaName' : 'rprAddrArea',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'RPR_ADDR_STREET',
'displayName' : '户籍登记所在地址的乡、镇或城市的街道办事处名称',
'type' : 'varchar(40)',
'javaName' : 'rprAddrStreet',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'RPR_ADDR_VILLAGE',
'displayName' : '户籍登记所在地址的村或城市的街、路、里、弄等名称',
'type' : 'varchar(40)',
'javaName' : 'rprAddrVillage',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'RPR_ADDR_HOUSE',
'displayName' : '户籍登记所在地址的门牌号码',
'type' : 'varchar(40)',
'javaName' : 'rprAddrHouse',
'note' : '',
'nullable':true,
'check':''},
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
'name' : 'MARITALSTATUS',
'displayName' : '婚姻状况代码',
'type' : 'varchar(20)',
'javaName' : 'maritalstatus',
'note' : '',
'nullable':true,
'check':'GBT22612'},
{
'name' : 'RELATIONSHIP',
'displayName' : '联系人关系代码',
'type' : 'varchar(20)',
'javaName' : 'relationship',
'note' : '',
'nullable':true,
'check':'GBT4761'},
{
'name' : 'CONTACTS_NAME',
'displayName' : '联系人姓名',
'type' : 'varchar(20)',
'javaName' : 'contactsName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'CONTACTS_PHONE',
'displayName' : '联系人电话号码',
'type' : 'varchar(20)',
'javaName' : 'contactsPhone',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'DEATH_DATE',
'displayName' : '死亡日期',
'type' : 'date',
'javaName' : 'deathDate',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'DEATH_PLACE_CATEGORY',
'displayName' : '死亡地点类别',
'type' : 'varchar(20)',
'javaName' : 'deathPlaceCategory',
'note' : '',
'nullable':true,
'check':'CV0201103'},
{
'name' : 'DEATH_HOSPITAL',
'displayName' : '死亡医院',
'type' : 'varchar(40)',
'javaName' : 'deathHospital',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'ONSET_TO_DEATH',
'displayName' : '发病到死亡时长',
'type' : 'number(8)',
'javaName' : 'onsetToDeath',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'HIGHEST_DIAGNOSTIC_LEVEL',
'displayName' : '最高诊断机构级别',
'type' : 'varchar(20)',
'javaName' : 'highestDiagnosticLevel',
'note' : '',
'nullable':true,
'check':'CV0810004'},
{
'name' : 'HIGHEST_DEATH_DIAGNOSIS_CATEGORY_CODE',
'displayName' : '死亡最高诊断依据类别代码',
'type' : 'varchar(20)',
'javaName' : 'highestDeathDiagnosisCategoryCode',
'note' : '',
'nullable':true,
'check':'CV0501037'},
{
'name' : 'DIRECT_DEATH_REASON_CD',
'displayName' : '直接死亡原因代码',
'type' : 'varchar(20)',
'javaName' : 'directDeathReasonCd',
'note' : '',
'nullable':true,
'check':'CV990111'},
{
'name' : 'DIRECT_DEATH_REASON_NAME',
'displayName' : '直接死亡原因名称',
'type' : 'varchar(40)',
'javaName' : 'directDeathReasonName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'OTHER_DISEASE_DIAGNOSIS_CD',
'displayName' : '其他疾病诊断代码',
'type' : 'varchar(20)',
'javaName' : 'otherDiseaseDiagnosisCd',
'note' : '',
'nullable':true,
'check':'CV990111'},
{
'name' : 'OTHER_DISEASE_DIAGNOSIS_NAME',
'displayName' : '其他疾病诊断名称',
'type' : 'varchar(40)',
'javaName' : 'otherDiseaseDiagnosisName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'UNDERLYING_DEATH_CAUSE_CD',
'displayName' : '根本死亡原因编码',
'type' : 'varchar(20)',
'javaName' : 'underlyingDeathCauseCd',
'note' : '',
'nullable':true,
'check':'CV990111'},
{
'name' : 'UNDERLYING_DEATH_CAUSE_NAME',
'displayName' : '根本死亡原因名称',
'type' : 'varchar(40)',
'javaName' : 'underlyingDeathCauseName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'DIAGNOSIS_DATE',
'displayName' : '诊断日期',
'type' : 'date',
'javaName' : 'diagnosisDate',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'PHYSICIAN',
'displayName' : '医师签名',
'type' : 'varchar(20)',
'javaName' : 'physician',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'UP_HOSPITAL_NAME',
'displayName' : '上传机构名称',
'type' : 'varchar(40)',
'javaName' : 'upHospitalName',
'note' : '医疗机构在爱心医疗云平台中的唯一编码',
'nullable':false,
'check':''}
];