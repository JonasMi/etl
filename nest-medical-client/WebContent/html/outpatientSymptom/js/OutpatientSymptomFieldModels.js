var datetimeValueHandler = function(value){
	var date = new Date(value);
	return date.format('yyyy-MM-dd hh:mm:ss');
};
var fieldModels = [ 
{
'name' : 'DIAGNOSIS_ID',
'displayName' : '院内诊断记录id',
'type' : 'varchar(40)',
'javaName' : 'diagnosisId',
'note' : '本次诊断在院内系统中的唯一标识',
'nullable':false,
'check':''},
{
'name' : 'PATIENT_ID',
'displayName' : '患者id',
'type' : 'varchar(40)',
'javaName' : 'patientId',
'note' : '引用患者信息表T_PATIENT院内患者id',
'nullable':false,
'check':''},
{
'name' : 'PATIENT_NAME',
'displayName' : '患者姓名',
'type' : 'varchar(40)',
'javaName' : 'patientName',
'note' : '',
'nullable':false,
'check':''},
{
'name' : 'OUTPATIENT_REGISTRATION_ID',
'displayName' : '门诊流水号',
'type' : 'varchar(40)',
'javaName' : 'outpatientRegistrationId',
'note' : '引用门诊接诊表T_OUTPATIENT_REGISTRATION院内门诊流水号',
'nullable':false,
'check':''},
{
'name' : 'DIAGNOSIS_EMP_ID',
'displayName' : '诊断医生信息 id',
'type' : 'varchar(40)',
'javaName' : 'diagnosisEmpId',
'note' : '引用医务人员信息表T_EMPLOYEE院内人员id',
'nullable':true,
'check':''},
{
'name' : 'DIAGNOSIS_CD',
'displayName' : '诊断ICD-10编码',
'type' : 'varchar(20)',
'javaName' : 'diagnosisCd',
'note' : '',
'nullable':false,
'check':'CV990111'},
{
'name' : 'DIAGNOSIS_VALUE',
'displayName' : '诊断ICD-10编码的值',
'type' : 'varchar(100)',
'javaName' : 'diagnosisValue',
'note' : '',
'nullable':true,
'check':'CV990111'},
{
'name' : 'ONSETDATETIME',
'displayName' : '诊断时间',
'type' : 'date',
'javaName' : 'onsetdatetime',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'DP_ID',
'displayName' : '记录医生所在科室id',
'type' : 'varchar(40)',
'javaName' : 'dpId',
'note' : '引用科室信息表T_DEPARTMENT院内科室id',
'nullable':true,
'check':''},
{
'name' : 'ONSET_DATE',
'displayName' : '发病时间',
'type' : 'date',
'javaName' : 'onsetDate',
'note' : '',
'nullable':false,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'SYMP_DURATION_MINS',
'displayName' : '症状持续时间（min)',
'type' : 'number(8)',
'javaName' : 'sympDurationMins',
'note' : '',
'nullable':true,
'check':''}
];