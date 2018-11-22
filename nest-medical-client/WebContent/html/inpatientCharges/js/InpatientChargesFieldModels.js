var datetimeValueHandler = function(value){
	var date = new Date(value);
	return date.format('yyyy-MM-dd hh:mm:ss');
};
var fieldModels = [ 
{
'name' : 'INPATIENT_CHARGES_ID',
'displayName' : '院内住院收费记录id',
'type' : 'varchar(40)',
'javaName' : 'inpatientChargesId',
'note' : '住院收费记录在院内系统中的唯一标识',
'nullable':false,
'check':''},
{
'name' : 'CREATED',
'displayName' : '报销日期',
'type' : 'date',
'javaName' : 'created',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'ORIGINAL_CHARGES_ID',
'displayName' : '原收费单号id',
'type' : 'varchar(40)',
'javaName' : 'originalChargesId',
'note' : '仅当此单为红票时填写',
'nullable':true,
'check':''},
{
'name' : 'CHARGE_EMP_ID',
'displayName' : '收费人ID',
'type' : 'varchar(40)',
'javaName' : 'chargeEmpId',
'note' : '引用医务人员信息表T_EMPLOYEE院内人员id',
'nullable':true,
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
'name' : 'TOTAL',
'displayName' : '总金额',
'type' : 'number(8)',
'javaName' : 'total',
'note' : '',
'nullable':false,
'check':''},
{
'name' : 'MEDICALINS_RURALCMS_MARK',
'displayName' : '农合/医保标志',
'type' : 'number(2)',
'javaName' : 'medicalinsRuralcmsMark',
'note' : '',
'nullable':true,
'check':'CUS00016'},
{
'name' : 'INSURANCE_NUMBER',
'displayName' : '农合/医保流水号',
'type' : 'varchar(40)',
'javaName' : 'insuranceNumber',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'INPATIENT_REGISTRATION_ID',
'displayName' : '住院流水号',
'type' : 'varchar(40)',
'javaName' : 'inpatientRegistrationId',
'note' : '引用住院接诊表T_INPATIENT_REGISTRATION院内住院流水号',
'nullable':false,
'check':''},
{
'name' : 'REIMBURSEMENT_TYPE',
'displayName' : '报销类型',
'type' : 'varchar(20)',
'javaName' : 'reimbursementType',
'note' : '',
'nullable':true,
'check':'CV990100'},
{
'name' : 'INVOICE_ID',
'displayName' : '打印发票号',
'type' : 'varchar(40)',
'javaName' : 'invoiceId',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'CANCEL_TYPE',
'displayName' : '是否红票标识',
'type' : 'number(5)',
'javaName' : 'cancelType',
'note' : '',
'nullable':true,
'check':'CUS00004'},
{
'name' : 'FEE_CODE',
'displayName' : '医疗付费方式代码',
'type' : 'varchar(20)',
'javaName' : 'feeCode',
'note' : '',
'nullable':false,
'check':'CV9900376'},
{
'name' : 'CLIN_COST_DATE',
'displayName' : '收费时间',
'type' : 'date',
'javaName' : 'clinCostDate',
'note' : '',
'nullable':false,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'NOTES',
'displayName' : '备注',
'type' : 'varchar(500)',
'javaName' : 'notes',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'PSN_EXPENSE',
'displayName' : '个人承担费用',
'type' : 'number(8)',
'javaName' : 'psnExpense',
'note' : '',
'nullable':false,
'check':''},
{
'name' : 'REIMBURSEMENT_COST',
'displayName' : '报销金额',
'type' : 'number(8)',
'javaName' : 'reimbursementCost',
'note' : '',
'nullable':false,
'check':''},
{
'name' : 'SUBMIT_RATIO',
'displayName' : '报销比例',
'type' : 'number(4)',
'javaName' : 'submitRatio',
'note' : '',
'nullable':true,
'check':''}
];