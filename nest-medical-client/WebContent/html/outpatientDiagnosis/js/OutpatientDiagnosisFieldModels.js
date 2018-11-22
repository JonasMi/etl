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
'nullable':false,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'PATIENT_SERIAL_NO',
'displayName' : '诊断序号',
'type' : 'varchar(40)',
'javaName' : 'patientSerialNo',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'IF_INFECTION',
'displayName' : '是否传染病标志',
'type' : 'number(5)',
'javaName' : 'ifInfection',
'note' : '',
'nullable':false,
'check':'CUS00004'},
{
'name' : 'INFECT_REPORT_CD',
'displayName' : '传染上报标志',
'type' : 'number(5)',
'javaName' : 'infectReportCd',
'note' : '',
'nullable':false,
'check':'CUS00004'},
{
'name' : 'CN_SYM_DIAG_CODE',
'displayName' : '中医征候诊断代码',
'type' : 'varchar(20)',
'javaName' : 'cnSymDiagCode',
'note' : '',
'nullable':true,
'check':'CV9900357'},
{
'name' : 'ADMIT_DIAG',
'displayName' : '诊断顺位',
'type' : 'number(8)',
'javaName' : 'admitDiag',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'CN_DIS_DIAG_CODE',
'displayName' : '中医病名诊断代码',
'type' : 'varchar(20)',
'javaName' : 'cnDisDiagCode',
'note' : '',
'nullable':true,
'check':'CV9900357'}
];