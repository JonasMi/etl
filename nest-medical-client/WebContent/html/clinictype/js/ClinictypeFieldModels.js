var datetimeValueHandler = function(value){
	var date = new Date(value);
	return date.format('yyyy-MM-dd hh:mm:ss');
};
var fieldModels = [ 
{
'name' : 'ITEM_CODE',
'displayName' : '院内号别编码',
'type' : 'varchar(40)',
'javaName' : 'itemCode',
'note' : '号别在院内系统中的唯一标识',
'nullable':false,
'check':''},
{
'name' : 'DP_ID',
'displayName' : '对应科室id',
'type' : 'varchar(20)',
'javaName' : 'dpId',
'note' : '引用科室信息表T_DEPARTMENT院内科室id',
'nullable':false,
'check':''},
{
'name' : 'CLINIC_CODE',
'displayName' : '号别类型代码',
'type' : 'varchar(20)',
'javaName' : 'clinicCode',
'note' : '',
'nullable':false,
'check':'CV9900261'},
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
'check':''}
];