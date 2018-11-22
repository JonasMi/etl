var datetimeValueHandler = function(value){
	var date = new Date(value);
	return date.format('yyyy-MM-dd hh:mm:ss');
};
var fieldModels = [ 
{
'name' : 'BED_ID',
'displayName' : '院内床位id',
'type' : 'varchar(40)',
'javaName' : 'bedId',
'note' : '床位在院内系统中的唯一标识',
'nullable':false,
'check':''},
{
'name' : 'STATUS',
'displayName' : '使用状态',
'type' : 'varchar(20)',
'javaName' : 'status',
'note' : '',
'nullable':true,
'check':'CUS00005'},
{
'name' : 'TYPE_CODE',
'displayName' : '床位类型代码',
'type' : 'varchar(20)',
'javaName' : 'typeCode',
'note' : '',
'nullable':true,
'check':'CV9900278'},
{
'name' : 'WARD_NO',
'displayName' : '病房号',
'type' : 'varchar(40)',
'javaName' : 'wardNo',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'WARD_AREA',
'displayName' : '病区',
'type' : 'varchar(100)',
'javaName' : 'wardArea',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'DEPARTMENT_ID',
'displayName' : '所在科室id',
'type' : 'varchar(40)',
'javaName' : 'departmentId',
'note' : '引用科室信息表T_DEPARTMENT院内科室id',
'nullable':true,
'check':''},
{
'name' : 'LEVEL_CODE',
'displayName' : '床位等级代码',
'type' : 'varchar(20)',
'javaName' : 'levelCode',
'note' : '',
'nullable':true,
'check':'CV9900262'}
];