var datetimeValueHandler = function(value){
	var date = new Date(value);
	return date.format('yyyy-MM-dd hh:mm:ss');
};
var fieldModels = [ 
{
'name' : 'OPERATION_ORDER_ID',
'displayName' : '院内手术申请单id',
'type' : 'varchar(40)',
'javaName' : 'operationOrderId',
'note' : '手术申请单在院内系统中的唯一标识',
'nullable':false,
'check':''},
{
'name' : 'PATIENT_ID',
'displayName' : '患者ID',
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
'name' : 'OPERATION_CD',
'displayName' : '手术编码',
'type' : 'varchar(20)',
'javaName' : 'operationCd',
'note' : '',
'nullable':true,
'check':'CV990113'},
{
'name' : 'OPERATION_NAME',
'displayName' : '手术名称',
'type' : 'varchar(40)',
'javaName' : 'operationName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'SCHEDULEDDATETIME',
'displayName' : '预计手术日期',
'type' : 'date',
'javaName' : 'scheduleddatetime',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'VISIT_MARK',
'displayName' : '门诊或住院标识',
'type' : 'varchar(10)',
'javaName' : 'visitMark',
'note' : '',
'nullable':false,
'check':'CUS00010'},
{
'name' : 'REGISTRATION_ID',
'displayName' : '就诊流水号',
'type' : 'varchar(40)',
'javaName' : 'registrationId',
'note' : '引用门诊接诊表T_OUTPATIENT_REGISTRATION院内门诊流水号或引用住院接诊表T_INPATIENT_REGISTRATION院内住院流水号',
'nullable':false,
'check':''},
{
'name' : 'STATUS',
'displayName' : '状态',
'type' : 'varchar(20)',
'javaName' : 'status',
'note' : '',
'nullable':true,
'check':'CUS00014'},
{
'name' : 'ORDER_EMPLOYEE_ID',
'displayName' : '申请医生ID',
'type' : 'varchar(40)',
'javaName' : 'orderEmployeeId',
'note' : '引用医务人员信息表T_EMPLOYEE院内人员id',
'nullable':true,
'check':''},
{
'name' : 'ORDER_DPID',
'displayName' : '申请科室',
'type' : 'varchar(40)',
'javaName' : 'orderDpid',
'note' : '引用科室信息表T_DEPARTMENT院内科室id',
'nullable':true,
'check':''},
{
'name' : 'OP_DATE_TYPE',
'displayName' : '手术日期类型',
'type' : 'varchar(20)',
'javaName' : 'opDateType',
'note' : '',
'nullable':true,
'check':'CV9900277'}
];