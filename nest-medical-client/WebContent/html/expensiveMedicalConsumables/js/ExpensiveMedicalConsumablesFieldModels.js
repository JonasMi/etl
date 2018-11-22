var datetimeValueHandler = function(value){
	var date = new Date(value);
	return date.format('yyyy-MM-dd hh:mm:ss');
};
var fieldModels = [ 
{
'name' : 'EXPENSIVE_MEDICAL_CONSUMABLES_USAGE_RECORDS_ID',
'displayName' : '院内高值耗材使用记录id',
'type' : 'varchar(40)',
'javaName' : 'expensiveMedicalConsumablesUsageRecordsId',
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
'name' : 'AGE',
'displayName' : '年龄',
'type' : 'number(8)',
'javaName' : 'age',
'note' : '',
'nullable':true,
'check':''},
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
'name' : 'INPATIENT_REGISTRATION_ID',
'displayName' : '住院流水号',
'type' : 'varchar(40)',
'javaName' : 'inpatientRegistrationId',
'note' : '',
'nullable':false,
'check':''},
{
'name' : 'START',
'displayName' : '入院时间',
'type' : 'date',
'javaName' : 'start',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'INH_ID',
'displayName' : '住院号',
'type' : 'varchar(40)',
'javaName' : 'inhId',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'VISITING_DEPT_ID',
'displayName' : '就诊科室id',
'type' : 'varchar(40)',
'javaName' : 'visitingDeptId',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'VISITING_DEPT_NAME',
'displayName' : '就诊科室名称',
'type' : 'varchar(40)',
'javaName' : 'visitingDeptName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'VISITING_DEPT_CD',
'displayName' : '就诊科室标准编码',
'type' : 'varchar(20)',
'javaName' : 'visitingDeptCd',
'note' : '',
'nullable':true,
'check':'CV9900051'},
{
'name' : 'WARD_NO',
'displayName' : '病房号',
'type' : 'varchar(20)',
'javaName' : 'wardNo',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'WARD_AREA',
'displayName' : '病区',
'type' : 'varchar(40)',
'javaName' : 'wardArea',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'BED_NUM',
'displayName' : '床位号',
'type' : 'varchar(20)',
'javaName' : 'bedNum',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'CN_FOUR_RESULT',
'displayName' : '中医&quot;四诊&quot;观察结果',
'type' : 'varchar(200)',
'javaName' : 'cnFourResult',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'IN_MODE_CODE',
'displayName' : '入院途径',
'type' : 'varchar(20)',
'javaName' : 'inModeCode',
'note' : '',
'nullable':true,
'check':'CV0900403'},
{
'name' : 'INHOSPITAL_REASON_CD',
'displayName' : '住院原因代码',
'type' : 'varchar(20)',
'javaName' : 'inhospitalReasonCd',
'note' : '',
'nullable':true,
'check':'CV0600212'},
{
'name' : 'INHOSPITAL_WAY',
'displayName' : '入病房方式',
'type' : 'varchar(40)',
'javaName' : 'inhospitalWay',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'CASE_NO',
'displayName' : '病案号',
'type' : 'varchar(40)',
'javaName' : 'caseNo',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'INPAT_TIMES',
'displayName' : '住院次数',
'type' : 'number(3)',
'javaName' : 'inpatTimes',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'RESPONSIBILITY_NURSE_ID',
'displayName' : '责任护士id',
'type' : 'varchar(40)',
'javaName' : 'responsibilityNurseId',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'RESPONSIBILITY_NURSE_NAME',
'displayName' : '责任护士姓名',
'type' : 'varchar(40)',
'javaName' : 'responsibilityNurseName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'RESPONSIBILITY_NURSE_DATE',
'displayName' : '责任护士签名日期',
'type' : 'date',
'javaName' : 'responsibilityNurseDate',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'CN_SYM_DIAG_CODE',
'displayName' : '中医症候代码',
'type' : 'varchar(20)',
'javaName' : 'cnSymDiagCode',
'note' : '',
'nullable':true,
'check':'CV9900357'},
{
'name' : 'CN_DIS_DIAG_CODE',
'displayName' : '中医病名代码',
'type' : 'varchar(20)',
'javaName' : 'cnDisDiagCode',
'note' : '',
'nullable':true,
'check':'CV9900357'},
{
'name' : 'DIAG_CODE',
'displayName' : '诊断编码',
'type' : 'varchar(20)',
'javaName' : 'diagCode',
'note' : '',
'nullable':true,
'check':'CV990111'},
{
'name' : 'DIAG_NAME',
'displayName' : '诊断编码名称',
'type' : 'varchar(40)',
'javaName' : 'diagName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'DIAG_DATE',
'displayName' : '诊断日期',
'type' : 'date',
'javaName' : 'diagDate',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'DOSAGE_CODE',
'displayName' : '用药途径代码',
'type' : 'varchar(20)',
'javaName' : 'dosageCode',
'note' : '',
'nullable':true,
'check':'CV0600102'},
{
'name' : 'ONCE_VALUE',
'displayName' : '用药次剂量',
'type' : 'number(8)',
'javaName' : 'onceValue',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'ONCE_UNIT',
'displayName' : '用药次剂量单位',
'type' : 'varchar(20)',
'javaName' : 'onceUnit',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'C_MED_CODE',
'displayName' : '特殊用法代码',
'type' : 'varchar(20)',
'javaName' : 'cMedCode',
'note' : '',
'nullable':true,
'check':'CV9900285'},
{
'name' : 'CN_PRESCRIBE',
'displayName' : '医嘱内容',
'type' : 'varchar(200)',
'javaName' : 'cnPrescribe',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'CN_PRESCRIBE_DESCR',
'displayName' : '中药煎煮法',
'type' : 'varchar(40)',
'javaName' : 'cnPrescribeDescr',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'CN_DRUG_WAY_CD',
'displayName' : '中药服用方法代码',
'type' : 'varchar(20)',
'javaName' : 'cnDrugWayCd',
'note' : '',
'nullable':true,
'check':'CV9900304'},
{
'name' : 'FACTORY_NAME',
'displayName' : '产品生产厂家',
'type' : 'varchar(40)',
'javaName' : 'factoryName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'PROVIDER_NAME',
'displayName' : '产品供应商',
'type' : 'varchar(40)',
'javaName' : 'providerName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'IMPLANTABLE_CONSUMABLES_FLG',
'displayName' : '植入性耗材标志',
'type' : 'number(5)',
'javaName' : 'implantableConsumablesFlg',
'note' : '',
'nullable':true,
'check':'CUS00004'},
{
'name' : 'USE_WAY',
'displayName' : '使用途径',
'type' : 'varchar(40)',
'javaName' : 'useWay',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'EXPIRY',
'displayName' : '有效期',
'type' : 'date',
'javaName' : 'expiry',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'QUANTITY_VALUE',
'displayName' : '数量',
'type' : 'number(8)',
'javaName' : 'quantityValue',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'QUANTITY_UNIT',
'displayName' : '单位',
'type' : 'varchar(40)',
'javaName' : 'quantityUnit',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'SUBSTANCE_ID',
'displayName' : '院内耗材id',
'type' : 'varchar(40)',
'javaName' : 'substanceId',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'SUBSTANCE_CD',
'displayName' : '材料编码',
'type' : 'varchar(20)',
'javaName' : 'substanceCd',
'note' : '',
'nullable':true,
'check':'CV9900399'},
{
'name' : 'SUBSTANCE_NAME',
'displayName' : '材料名称',
'type' : 'varchar(40)',
'javaName' : 'substanceName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'UP_HOSPITAL_NAME',
'displayName' : '上传机构名称',
'type' : 'varchar(40)',
'javaName' : 'upHospitalName',
'note' : '上传数据医疗机构在市平台的机构代码',
'nullable':false,
'check':''}
];