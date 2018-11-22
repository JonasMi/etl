var datetimeValueHandler = function(value){
	var date = new Date(value);
	return date.format('yyyy-MM-dd hh:mm:ss');
};
var fieldModels = [ 
{
'name' : 'EXAMINATION_ORDER_ID',
'displayName' : '院内检验申请单id',
'type' : 'varchar(40)',
'javaName' : 'examinationOrderId',
'note' : '检验申请单在院内系统中的唯一标识',
'nullable':false,
'check':''},
{
'name' : 'STATUS',
'displayName' : '申请状态',
'type' : 'varchar(20)',
'javaName' : 'status',
'note' : '',
'nullable':true,
'check':'CUS00009'},
{
'name' : 'PRIORITY',
'displayName' : '优先等级',
'type' : 'varchar(20)',
'javaName' : 'priority',
'note' : '',
'nullable':true,
'check':'CUS00010'},
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
'name' : 'ORDERER_EMPLOYEE_ID',
'displayName' : '申请医生ID',
'type' : 'varchar(40)',
'javaName' : 'ordererEmployeeId',
'note' : '引用医务人员信息表T_EMPLOYEE院内人员id',
'nullable':true,
'check':''},
{
'name' : 'EXAMINATION_ITEM_CD',
'displayName' : '检验总项目代码',
'type' : 'varchar(20)',
'javaName' : 'examinationItemCd',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'EXAMINATION_ITEM_NAME',
'displayName' : '检验总项目名字',
'type' : 'varchar(20)',
'javaName' : 'examinationItemName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'SPECIMENS_CODE',
'displayName' : '标本采集部位代码',
'type' : 'varchar(20)',
'javaName' : 'specimensCode',
'note' : '',
'nullable':true,
'check':'CV9900316'},
{
'name' : 'SPECIMENS_NAME',
'displayName' : '标本采集部位名称',
'type' : 'varchar(50)',
'javaName' : 'specimensName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'ORDER_DPID',
'displayName' : '申请科室id',
'type' : 'varchar(40)',
'javaName' : 'orderDpid',
'note' : '引用科室信息表T_DEPARTMENT院内科室id',
'nullable':false,
'check':''},
{
'name' : 'DP_ID',
'displayName' : '检验科室id',
'type' : 'varchar(40)',
'javaName' : 'dpId',
'note' : '引用科室信息表T_DEPARTMENT院内科室id',
'nullable':true,
'check':''},
{
'name' : 'ORDER_DATE',
'displayName' : '申请时间',
'type' : 'date',
'javaName' : 'orderDate',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'INSPECTION_OBJECTIVE',
'displayName' : '检查目的',
'type' : 'varchar(500)',
'javaName' : 'inspectionObjective',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'ORDER_TYPE_CD',
'displayName' : '对应医嘱类型',
'type' : 'varchar(20)',
'javaName' : 'orderTypeCd',
'note' : '',
'nullable':true,
'check':'CV9900390'},
{
'name' : 'ADVICE_ID',
'displayName' : '对应医嘱号',
'type' : 'varchar(40)',
'javaName' : 'adviceId',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'EXAMINATION_TYPE',
'displayName' : '检验类别代码',
'type' : 'varchar(20)',
'javaName' : 'examinationType',
'note' : '',
'nullable':true,
'check':'CV9900393'},
{
'name' : 'EXAMINATION_TYPE_NAME',
'displayName' : '检验类别名称',
'type' : 'varchar(40)',
'javaName' : 'examinationTypeName',
'note' : '',
'nullable':true,
'check':'CV9900393'}
];