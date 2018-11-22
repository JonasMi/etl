var datetimeValueHandler = function(value){
	var date = new Date(value);
	return date.format('yyyy-MM-dd hh:mm:ss');
};
var fieldModels = [ 
{
'name' : 'METACHYSIS_RECORD_ID',
'displayName' : '院内输血记录id',
'type' : 'varchar(40)',
'javaName' : 'metachysisRecordId',
'note' : '',
'nullable':false,
'check':''},
{
'name' : 'DATE',
'displayName' : '记录日期',
'type' : 'date',
'javaName' : 'date',
'note' : '',
'nullable':false,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'PATIENT_ID',
'displayName' : '院内患者ID',
'type' : 'varchar(40)',
'javaName' : 'patientId',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'ID_CARD',
'displayName' : '身份证号',
'type' : 'varchar(40)',
'javaName' : 'idCard',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'HEALTH_FILE_NUMBER',
'displayName' : '城乡居民健康档案编号',
'type' : 'varchar(40)',
'javaName' : 'healthFileNumber',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'HEALTH_CARD',
'displayName' : '健康卡号',
'type' : 'varchar(40)',
'javaName' : 'healthCard',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'NAME',
'displayName' : '姓名',
'type' : 'varchar(20)',
'javaName' : 'name',
'note' : '',
'nullable':false,
'check':''},
{
'name' : 'GENDER',
'displayName' : '性别',
'type' : 'varchar(10)',
'javaName' : 'gender',
'note' : '',
'nullable':false,
'check':'GBT22611'},
{
'name' : 'TELECOM',
'displayName' : '电话号码',
'type' : 'varchar(20)',
'javaName' : 'telecom',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'AGE',
'displayName' : '年龄',
'type' : 'number(8)',
'javaName' : 'age',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'PATIENT_TYPE',
'displayName' : '患者类型',
'type' : 'varchar(20)',
'javaName' : 'patientType',
'note' : '',
'nullable':true,
'check':'CV0900404'},
{
'name' : 'AUTHOR_ID',
'displayName' : '文档创建者id',
'type' : 'varchar(40)',
'javaName' : 'authorId',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'AUTHOR_NAME',
'displayName' : '文档创建者姓名',
'type' : 'varchar(20)',
'javaName' : 'authorName',
'note' : '',
'nullable':true,
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
'note' : '',
'nullable':false,
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
'name' : 'INH_ID',
'displayName' : '住院号',
'type' : 'varchar(40)',
'javaName' : 'inhId',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'VISITING_TIME',
'displayName' : '就诊时间',
'type' : 'date',
'javaName' : 'visitingTime',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'VISITING_DEPT_ID',
'displayName' : '就诊科室id',
'type' : 'varchar(40)',
'javaName' : 'visitingDeptId',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'VISITING_DEPT_NAME',
'displayName' : '就诊科室名称',
'type' : 'varchar(40)',
'javaName' : 'visitingDeptName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'VISITING_DEPT_CD',
'displayName' : '就诊科室标准编码',
'type' : 'varchar(20)',
'javaName' : 'visitingDeptCd',
'note' : '',
'nullable':true,
'check':'CV9900051'},
{
'name' : 'VISITING_TYPE',
'displayName' : '就诊类型',
'type' : 'varchar(20)',
'javaName' : 'visitingType',
'note' : '',
'nullable':true,
'check':'CV9900340'},
{
'name' : 'WARD_NO',
'displayName' : '病房号',
'type' : 'varchar(20)',
'javaName' : 'wardNo',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'WARD_AREA',
'displayName' : '病区',
'type' : 'varchar(40)',
'javaName' : 'wardArea',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'BED_NUM',
'displayName' : '床位号',
'type' : 'varchar(20)',
'javaName' : 'bedNum',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'ABO_CD',
'displayName' : 'ABO血型代码',
'type' : 'varchar(20)',
'javaName' : 'aboCd',
'note' : '',
'nullable':true,
'check':'CV0450005'},
{
'name' : 'RH_CD',
'displayName' : 'RH血型代码',
'type' : 'varchar(20)',
'javaName' : 'rhCd',
'note' : '',
'nullable':true,
'check':'CV0450020'},
{
'name' : 'DIAGNOSIS',
'displayName' : '诊断编码',
'type' : 'varchar(20)',
'javaName' : 'diagnosis',
'note' : '',
'nullable':true,
'check':'CV990111'},
{
'name' : 'DIAGNOSIS_NAME',
'displayName' : '诊断编码名称',
'type' : 'varchar(40)',
'javaName' : 'diagnosisName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'DIAGNOSIS_DATE',
'displayName' : '诊断日期',
'type' : 'date',
'javaName' : 'diagnosisDate',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'TRANSFUSE_HISTORY_FLAG',
'displayName' : '输血史标识代码',
'type' : 'varchar(20)',
'javaName' : 'transfuseHistoryFlag',
'note' : '',
'nullable':true,
'check':'CV9900024'},
{
'name' : 'TRANS_KIND',
'displayName' : '输血性质代码',
'type' : 'varchar(20)',
'javaName' : 'transKind',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'APPLY_ABO_BLOOD_CODE',
'displayName' : '申请ABO血型代码',
'type' : 'varchar(20)',
'javaName' : 'applyAboBloodCode',
'note' : '',
'nullable':true,
'check':'CV0450005'},
{
'name' : 'APPLY_RH_BLOOD_CODE',
'displayName' : '申请Rh血型代码',
'type' : 'varchar(20)',
'javaName' : 'applyRhBloodCode',
'note' : '',
'nullable':true,
'check':'CV0450020'},
{
'name' : 'TRANSFUSION_INDICATION',
'displayName' : '输血指征',
'type' : 'varchar(100)',
'javaName' : 'transfusionIndication',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'TRANSFUSION_PROCESS_REC',
'displayName' : '输血过程记录',
'type' : 'varchar(100)',
'javaName' : 'transfusionProcessRec',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'BAGS_CODING',
'displayName' : '血袋编码',
'type' : 'varchar(20)',
'javaName' : 'bagsCoding',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'TRANSFUSION_ITEM_AMOUNT',
'displayName' : '输血量',
'type' : 'number(8)',
'javaName' : 'transfusionItemAmount',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'TRANSFUSION_ITEM_UNIT',
'displayName' : '输血量计量单位',
'type' : 'varchar(40)',
'javaName' : 'transfusionItemUnit',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'TRANSFUSE_REACTION_FLAG',
'displayName' : '输血反应标志',
'type' : 'number(5)',
'javaName' : 'transfuseReactionFlag',
'note' : '',
'nullable':true,
'check':'CUS00004'},
{
'name' : 'TRANSFUSION_COUNT',
'displayName' : '输血次数',
'type' : 'number(3)',
'javaName' : 'transfusionCount',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'BLOOD_TRANSF_CAUSE',
'displayName' : '输血原因',
'type' : 'varchar(100)',
'javaName' : 'bloodTransfCause',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'TRANSFUSION_VARIETY_CODE',
'displayName' : '输血品种编码',
'type' : 'varchar(20)',
'javaName' : 'transfusionVarietyCode',
'note' : '',
'nullable':true,
'check':'CV530201'},
{
'name' : 'TRANSFUSION_VARIETY_NAME',
'displayName' : '输血品种编码名称',
'type' : 'varchar(40)',
'javaName' : 'transfusionVarietyName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'TRANSFUSION_EMP_ID',
'displayName' : '输血医生id',
'type' : 'varchar(40)',
'javaName' : 'transfusionEmpId',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'TRANSFUSION_EMP_NAME',
'displayName' : '输血医生姓名',
'type' : 'varchar(40)',
'javaName' : 'transfusionEmpName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'TRANSFUSION_START_TIME',
'displayName' : '输血开始时间',
'type' : 'date',
'javaName' : 'transfusionStartTime',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'TRANSFUSION_END_TIME',
'displayName' : '输血结束时间',
'type' : 'date',
'javaName' : 'transfusionEndTime',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'TRANSFUSION_REACTION_TYPE',
'displayName' : '输血反应类型',
'type' : 'varchar(20)',
'javaName' : 'transfusionReactionType',
'note' : '',
'nullable':true,
'check':'CV9900084'},
{
'name' : 'REMARKS',
'displayName' : '备注',
'type' : 'text',
'javaName' : 'remarks',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'UP_HOSPITAL_NAME',
'displayName' : '上传机构名称',
'type' : 'varchar(40)',
'javaName' : 'upHospitalName',
'note' : '上传数据医疗机构在市平台的机构代码',
'nullable':false,
'check':''}
];