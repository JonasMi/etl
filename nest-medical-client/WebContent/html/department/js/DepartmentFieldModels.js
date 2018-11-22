var datetimeValueHandler = function(value){
	var date = new Date(value);
	return date.format('yyyy-MM-dd hh:mm:ss');
};
var fieldModels = [ 
{
'name' : 'DEPARTMENT_ID',
'displayName' : '院内科室id',
'type' : 'varchar(40)',
'javaName' : 'departmentId',
'note' : '科室在院内系统中的唯一标识',
'nullable':false,
'check':''},
{
'name' : 'DP_TYPE',
'displayName' : '科室类型',
'type' : 'varchar(20)',
'javaName' : 'dpType',
'note' : '',
'nullable':true,
'check':'CV9900276'},
{
'name' : 'NAME',
'displayName' : '科室名称',
'type' : 'varchar(40)',
'javaName' : 'name',
'note' : '',
'nullable':false,
'check':''},
{
'name' : 'PHONE',
'displayName' : '联系方式',
'type' : 'varchar(20)',
'javaName' : 'phone',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'PARTOF',
'displayName' : '上级科室id',
'type' : 'varchar(40)',
'javaName' : 'partof',
'note' : '引用科室信息表T_DEPARTMENT院内科室id',
'nullable':true,
'check':''},
{
'name' : 'IF_END',
'displayName' : '是否末级科室',
'type' : 'number(5)',
'javaName' : 'ifEnd',
'note' : '',
'nullable':true,
'check':'CUS00004'},
{
'name' : 'CLASSIFICATION',
'displayName' : '科室归类代码',
'type' : 'varchar(20)',
'javaName' : 'classification',
'note' : '科室在市平台的标准编码',
'nullable':false,
'check':'CV9900051'},
{
'name' : 'TAKE_NO_PLACE',
'displayName' : '取号地点',
'type' : 'varchar(200)',
'javaName' : 'takeNoPlace',
'note' : '',
'nullable':true,
'check':''}
];