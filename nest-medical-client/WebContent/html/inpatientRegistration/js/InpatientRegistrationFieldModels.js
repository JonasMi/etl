var datetimeValueHandler = function(value){
	var date = new Date(value);
	return date.format('yyyy-MM-dd hh:mm:ss');
};
var fieldModels = [ 
{
'name' : 'INPATIENT_REGISTRATION_ID',
'displayName' : '院内住院流水号',
'type' : 'varchar(40)',
'javaName' : 'inpatientRegistrationId',
'note' : '本次住院就诊在院内系统中的唯一标识',
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
'name' : 'RESIDENT_PHYSICIAN_ID',
'displayName' : '住院医师id',
'type' : 'varchar(40)',
'javaName' : 'residentPhysicianId',
'note' : '引用医务人员信息表T_EMPLOYEE院内人员id',
'nullable':true,
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
'name' : 'END',
'displayName' : '出院时间',
'type' : 'date',
'javaName' : 'end',
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
'name' : 'ADMISSION_METHOD',
'displayName' : '入院方式',
'type' : 'varchar(100)',
'javaName' : 'admissionMethod',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'IN_DPID',
'displayName' : '入院科室id',
'type' : 'varchar(40)',
'javaName' : 'inDpid',
'note' : '引用科室信息表T_DEPARTMENT院内科室id',
'nullable':false,
'check':''},
{
'name' : 'IN_SITUATION',
'displayName' : '入院时情况',
'type' : 'varchar(200)',
'javaName' : 'inSituation',
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
'name' : 'IN_INPATIENT_AREA',
'displayName' : '入院病区',
'type' : 'varchar(50)',
'javaName' : 'inInpatientArea',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'BED_ID',
'displayName' : '床位id',
'type' : 'varchar(40)',
'javaName' : 'bedId',
'note' : '引用床位信息表T_BED院内床位id',
'nullable':true,
'check':''},
{
'name' : 'SERVICEPROVIDER',
'displayName' : '住院科室id',
'type' : 'varchar(40)',
'javaName' : 'serviceprovider',
'note' : '引用科室信息表T_DEPARTMENT院内科室id',
'nullable':true,
'check':''},
{
'name' : 'OUT_DPID',
'displayName' : '出院科室',
'type' : 'varchar(40)',
'javaName' : 'outDpid',
'note' : '引用科室信息表T_DEPARTMENT院内科室id',
'nullable':true,
'check':''},
{
'name' : 'OUT_INPATIENT_AREA',
'displayName' : '出院病区',
'type' : 'varchar(50)',
'javaName' : 'outInpatientArea',
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
'name' : 'INPAT_DAYS',
'displayName' : '住院天数',
'type' : 'number(3)',
'javaName' : 'inpatDays',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'OUT_MODE_CODE',
'displayName' : '离院方式',
'type' : 'varchar(20)',
'javaName' : 'outModeCode',
'note' : '',
'nullable':true,
'check':'CV0600226'},
{
'name' : 'FEE_CODE',
'displayName' : '医疗付费方式',
'type' : 'varchar(20)',
'javaName' : 'feeCode',
'note' : '',
'nullable':true,
'check':'CV9900376'},
{
'name' : 'INHOSPITAL_REASON_CD',
'displayName' : '住院原因代码',
'type' : 'varchar(20)',
'javaName' : 'inhospitalReasonCd',
'note' : '',
'nullable':true,
'check':'CV0600212'}
];