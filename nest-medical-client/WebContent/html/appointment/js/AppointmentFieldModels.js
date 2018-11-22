var datetimeValueHandler = function(value){
	var date = new Date(value);
	return date.format('yyyy-MM-dd hh:mm:ss');
};
var fieldModels = [ 
{
'name' : 'REGISTER_ID',
'displayName' : '挂号号',
'type' : 'varchar(40)',
'javaName' : 'registerId',
'note' : '挂号信息在院内系统中的唯一标识',
'nullable':false,
'check':''},
{
'name' : 'APPOINTMENT_ID',
'displayName' : '预约号',
'type' : 'varchar(40)',
'javaName' : 'appointmentId',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'STATUS',
'displayName' : '状态',
'type' : 'varchar(20)',
'javaName' : 'status',
'note' : '',
'nullable':true,
'check':'CUS00007'},
{
'name' : 'PRIORITY',
'displayName' : '等级',
'type' : 'varchar(20)',
'javaName' : 'priority',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'START_TIME',
'displayName' : '预计就诊开始时间',
'type' : 'date',
'javaName' : 'startTime',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'END_TIME',
'displayName' : '预计就诊结束时间',
'type' : 'date',
'javaName' : 'endTime',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'NUMBER_SOURCE_ID',
'displayName' : '号源id',
'type' : 'varchar(40)',
'javaName' : 'numberSourceId',
'note' : '引用号源信息表T_SLOT院内号源id',
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
'nullable':true,
'check':''},
{
'name' : 'REGISTER_EMPLOYEE_ID',
'displayName' : '挂号医生id',
'type' : 'varchar(40)',
'javaName' : 'registerEmployeeId',
'note' : '引用医务人员信息表T_EMPLOYEE院内人员id',
'nullable':true,
'check':''},
{
'name' : 'REGISTER_EMPLOYEE_NAME',
'displayName' : '挂号医生姓名',
'type' : 'varchar(40)',
'javaName' : 'registerEmployeeName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'EXPERT_ID',
'displayName' : '专家ID',
'type' : 'varchar(40)',
'javaName' : 'expertId',
'note' : '引用医务人员信息表T_EMPLOYEE院内人员id',
'nullable':false,
'check':''},
{
'name' : 'EXPERT_NAME',
'displayName' : '专家姓名',
'type' : 'varchar(40)',
'javaName' : 'expertName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'RE_FEE',
'displayName' : '挂号费',
'type' : 'number(8)',
'javaName' : 'reFee',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'DT_FEE',
'displayName' : '诊疗费',
'type' : 'number(8)',
'javaName' : 'dtFee',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'RB_FEE',
'displayName' : '病历本费',
'type' : 'number(8)',
'javaName' : 'rbFee',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'IF_SPECIAL',
'displayName' : '是否门诊特殊病',
'type' : 'number(5)',
'javaName' : 'ifSpecial',
'note' : '',
'nullable':true,
'check':'CUS00004'},
{
'name' : 'REG_SOURCE_CODE',
'displayName' : '就诊方式代码',
'type' : 'varchar(20)',
'javaName' : 'regSourceCode',
'note' : '',
'nullable':true,
'check':'CV9900263'},
{
'name' : 'REGISTER_DP_CODE',
'displayName' : '挂号科室id',
'type' : 'varchar(40)',
'javaName' : 'registerDpCode',
'note' : '引用科室信息表T_DEPARTMENT院内科室id',
'nullable':true,
'check':''},
{
'name' : 'MEDICAL_INSURANCE_TYPE',
'displayName' : '医疗（保险）类别代码',
'type' : 'varchar(20)',
'javaName' : 'medicalInsuranceType',
'note' : '',
'nullable':false,
'check':'CV9900281'},
{
'name' : 'REG_TYPE_CODE',
'displayName' : '就诊类别',
'type' : 'varchar(20)',
'javaName' : 'regTypeCode',
'note' : '',
'nullable':true,
'check':'CV9900133'},
{
'name' : 'REGISTER_TIME',
'displayName' : '挂号时间',
'type' : 'date',
'javaName' : 'registerTime',
'note' : '',
'nullable':false,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'REG_NO',
'displayName' : '就诊顺序号',
'type' : 'varchar(40)',
'javaName' : 'regNo',
'note' : '',
'nullable':false,
'check':''}
];