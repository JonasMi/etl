var datetimeValueHandler = function(value){
	var date = new Date(value);
	return date.format('yyyy-MM-dd hh:mm:ss');
};
var fieldModels = [ 
{
'name' : 'ITEM_CODE',
'displayName' : '院内号源id',
'type' : 'varchar(40)',
'javaName' : 'itemCode',
'note' : '号源在院内系统中的唯一标识',
'nullable':false,
'check':''},
{
'name' : 'SCHEDULE_ID',
'displayName' : '排班信息id',
'type' : 'varchar(40)',
'javaName' : 'scheduleId',
'note' : '引用排班信息表T_SCHEDULE院内排班id',
'nullable':false,
'check':''},
{
'name' : 'SURPLUS_ALLOW_RESERVATION_NUM',
'displayName' : '剩余可预约量',
'type' : 'number(3)',
'javaName' : 'surplusAllowReservationNum',
'note' : '初始值与排班中可预约量相同。',
'nullable':false,
'check':''},
{
'name' : 'START',
'displayName' : '开始时间',
'type' : 'date',
'javaName' : 'start',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'END',
'displayName' : '結束时间',
'type' : 'date',
'javaName' : 'end',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'OVERBOOKED',
'displayName' : '是否可以被预约',
'type' : 'number(5)',
'javaName' : 'overbooked',
'note' : '',
'nullable':true,
'check':'CUS00004'},
{
'name' : 'COMMENT',
'displayName' : '备注',
'type' : 'varchar(200)',
'javaName' : 'comment',
'note' : '',
'nullable':true,
'check':''}
];