var datetimeValueHandler = function(value){
	var date = new Date(value);
	return date.format('yyyy-MM-dd hh:mm:ss');
};
var fieldModels = [ 
{
'name' : 'SCHEDULE_ID',
'displayName' : '院内排班id',
'type' : 'varchar(40)',
'javaName' : 'scheduleId',
'note' : '号别在院内系统中的唯一标识',
'nullable':false,
'check':''},
{
'name' : 'EMPLOYEE_ID',
'displayName' : '被安排的医务人员ID号',
'type' : 'varchar(40)',
'javaName' : 'employeeId',
'note' : '引用医务人员表T_EMPLOYEE院内人员id',
'nullable':true,
'check':''},
{
'name' : 'ARR_DATE',
'displayName' : '排班日期',
'type' : 'date',
'javaName' : 'arrDate',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'CHARGE_TYPE',
'displayName' : '号别信息id',
'type' : 'varchar(40)',
'javaName' : 'chargeType',
'note' : '引用号别信息表T_CLINICTYPE院内号别编码',
'nullable':false,
'check':''},
{
'name' : 'ALLOW_RESERVATION_NUM',
'displayName' : '允许预约量',
'type' : 'number(3)',
'javaName' : 'allowReservationNum',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'ALLOW_REGISTRATION_NUM',
'displayName' : '允许挂号量',
'type' : 'number(3)',
'javaName' : 'allowRegistrationNum',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'PRE_TIME_CODE',
'displayName' : '时间段代码',
'type' : 'varchar(20)',
'javaName' : 'preTimeCode',
'note' : '',
'nullable':false,
'check':'CV9900282'},
{
'name' : 'START',
'displayName' : '排班时间段开始时间',
'type' : 'date',
'javaName' : 'start',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'END',
'displayName' : '排班时间段结束时间',
'type' : 'date',
'javaName' : 'end',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'COMMENT',
'displayName' : '备注',
'type' : 'varchar(200)',
'javaName' : 'comment',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'IF_STOP_DIAGNOSIS',
'displayName' : '是否停诊',
'type' : 'number(5)',
'javaName' : 'ifStopDiagnosis',
'note' : '',
'nullable':true,
'check':'CUS00004'},
{
'name' : 'REPLACE_DIAGNOSIS_DOCTOR',
'displayName' : '替诊医生',
'type' : 'varchar(40)',
'javaName' : 'replaceDiagnosisDoctor',
'note' : '引用医务人员表T_EMPLOYEE院内人员id',
'nullable':true,
'check':''},
{
'name' : 'STOP_DIAGNOSIS_REASON',
'displayName' : '停诊原因',
'type' : 'varchar(200)',
'javaName' : 'stopDiagnosisReason',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'STOP_DIAGNOSIS_STARTDATE',
'displayName' : '停诊起始日期',
'type' : 'date',
'javaName' : 'stopDiagnosisStartdate',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'STOP_DIAGNOSIS_ENDDATE',
'displayName' : '停诊结束日期',
'type' : 'date',
'javaName' : 'stopDiagnosisEnddate',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
}
];