var datetimeValueHandler = function(value){
	var date = new Date(value);
	return date.format('yyyy-MM-dd hh:mm:ss');
};
var fieldModels = [ 
{
'name' : 'INTAKE_AND_OUTPUT_RECORD_ID',
'displayName' : '院内出入量记录id',
'type' : 'varchar(40)',
'javaName' : 'intakeAndOutputRecordId',
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
'name' : 'BIRTHDATE',
'displayName' : '出生日期',
'type' : 'date',
'javaName' : 'birthdate',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'AGE',
'displayName' : '年龄',
'type' : 'number(8)',
'javaName' : 'age',
'note' : '',
'nullable':true,
'check':''},
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
'name' : 'INPATIENT_REGISTRATION_ID',
'displayName' : '住院流水号',
'type' : 'varchar(40)',
'javaName' : 'inpatientRegistrationId',
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
'name' : 'CN_FOUR_RESULT',
'displayName' : '中医&quot;四诊&quot;观察结果',
'type' : 'varchar(200)',
'javaName' : 'cnFourResult',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'IN_MODE_CODE',
'displayName' : '入院途径',
'type' : 'varchar(20)',
'javaName' : 'inModeCode',
'note' : '',
'nullable':true,
'check':'CV0900403'},
{
'name' : 'INHOSPITAL_REASON_CD',
'displayName' : '住院原因代码',
'type' : 'varchar(20)',
'javaName' : 'inhospitalReasonCd',
'note' : '',
'nullable':true,
'check':'CV0600212'},
{
'name' : 'INHOSPITAL_WAY',
'displayName' : '入病房方式',
'type' : 'varchar(40)',
'javaName' : 'inhospitalWay',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'CASE_NO',
'displayName' : '病案号',
'type' : 'varchar(40)',
'javaName' : 'caseNo',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'INPAT_TIMES',
'displayName' : '住院次数',
'type' : 'number(3)',
'javaName' : 'inpatTimes',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'RESPONSIBILITY_NURSE_ID',
'displayName' : '责任护士id',
'type' : 'varchar(40)',
'javaName' : 'responsibilityNurseId',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'RESPONSIBILITY_NURSE_NAME',
'displayName' : '责任护士姓名',
'type' : 'varchar(40)',
'javaName' : 'responsibilityNurseName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'RESPONSIBILITY_NURSE_DATE',
'displayName' : '责任护士签名日期',
'type' : 'date',
'javaName' : 'responsibilityNurseDate',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'CN_SYM_DIAG_CODE',
'displayName' : '中医症候代码',
'type' : 'varchar(20)',
'javaName' : 'cnSymDiagCode',
'note' : '',
'nullable':true,
'check':'CV9900357'},
{
'name' : 'CN_DIS_DIAG_CODE',
'displayName' : '中医病名代码',
'type' : 'varchar(20)',
'javaName' : 'cnDisDiagCode',
'note' : '',
'nullable':true,
'check':'CV9900357'},
{
'name' : 'DIAG_CODE',
'displayName' : '诊断编码',
'type' : 'varchar(20)',
'javaName' : 'diagCode',
'note' : '',
'nullable':true,
'check':'CV990111'},
{
'name' : 'DIAG_NAME',
'displayName' : '诊断编码名称',
'type' : 'varchar(40)',
'javaName' : 'diagName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'DIAG_DATE',
'displayName' : '诊断日期',
'type' : 'date',
'javaName' : 'diagDate',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'WEIGHT',
'displayName' : '体重(kg)',
'type' : 'number(8)',
'javaName' : 'weight',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'NURSING_TYPE',
'displayName' : '护理等级代码',
'type' : 'varchar(20)',
'javaName' : 'nursingType',
'note' : '',
'nullable':true,
'check':'CV9900330'},
{
'name' : 'NURSING_GRADE',
'displayName' : '护理类型代码',
'type' : 'varchar(20)',
'javaName' : 'nursingGrade',
'note' : '',
'nullable':true,
'check':'CV9900331'},
{
'name' : 'OBSERVATION_PROJECT_NAME',
'displayName' : '护理观察项目名称',
'type' : 'varchar(40)',
'javaName' : 'observationProjectName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'OBSERVATION_RESULTS_DESCRIPTION',
'displayName' : '护理观察结果',
'type' : 'varchar(200)',
'javaName' : 'observationResultsDescription',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'NURSING_NAME',
'displayName' : '护理操作名称',
'type' : 'varchar(40)',
'javaName' : 'nursingName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'NURSING_ITEM_NAME',
'displayName' : '护理操作项目类目名称',
'type' : 'varchar(40)',
'javaName' : 'nursingItemName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'NURSING_RESULT_DESCRIPTION',
'displayName' : '护理操作结果描述',
'type' : 'varchar(200)',
'javaName' : 'nursingResultDescription',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'DRUGS_USAGE',
'displayName' : '药物用法',
'type' : 'varchar(40)',
'javaName' : 'drugsUsage',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'CN_MEDICATION_TYPE_CODE',
'displayName' : '中药使用类别代码',
'type' : 'varchar(20)',
'javaName' : 'cnMedicationTypeCode',
'note' : '',
'nullable':true,
'check':'CV0600101'},
{
'name' : 'DRUG_TOTAL_DOSE',
'displayName' : '药物使用总剂量',
'type' : 'number(8)',
'javaName' : 'drugTotalDose',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'DRUG_TOTAL_DOSE_UTIL',
'displayName' : '药物使用总剂量单位',
'type' : 'varchar(40)',
'javaName' : 'drugTotalDoseUtil',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'FREQ_CODE',
'displayName' : '频率代码',
'type' : 'varchar(20)',
'javaName' : 'freqCode',
'note' : '',
'nullable':true,
'check':'CV9900341'},
{
'name' : 'ALIAS_NAME',
'displayName' : '商品名',
'type' : 'varchar(40)',
'javaName' : 'aliasName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'SPEC',
'displayName' : '规格',
'type' : 'varchar(40)',
'javaName' : 'spec',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'IF_VOMIT',
'displayName' : '呕吐标志',
'type' : 'number(5)',
'javaName' : 'ifVomit',
'note' : '',
'nullable':true,
'check':'CUS00004'},
{
'name' : 'IF_DYSURIA',
'displayName' : '排尿困难标志',
'type' : 'number(5)',
'javaName' : 'ifDysuria',
'note' : '',
'nullable':true,
'check':'CUS00004'},
{
'name' : 'MEDICATION_CD',
'displayName' : '院内药物编码',
'type' : 'varchar(20)',
'javaName' : 'medicationCd',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'MEDICATION_NAME',
'displayName' : '院内药物名称',
'type' : 'varchar(40)',
'javaName' : 'medicationName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'DRUG_DOSAGE_FORMS',
'displayName' : '药物剂型代码',
'type' : 'varchar(20)',
'javaName' : 'drugDosageForms',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'DRUG_DOSAGE_FORMS_NAME',
'displayName' : '药物剂型名称',
'type' : 'varchar(40)',
'javaName' : 'drugDosageFormsName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'DOSAGE_CODE',
'displayName' : '用药途径代码',
'type' : 'varchar(20)',
'javaName' : 'dosageCode',
'note' : '',
'nullable':true,
'check':'CV0600102'},
{
'name' : 'ONCE_VALUE',
'displayName' : '用药次剂量',
'type' : 'number(8)',
'javaName' : 'onceValue',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'ONCE_UNIT',
'displayName' : '用药次剂量单位',
'type' : 'varchar(20)',
'javaName' : 'onceUnit',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'BOUNDSPERIOD_START',
'displayName' : '医嘱开始时间',
'type' : 'date',
'javaName' : 'boundsperiodStart',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'TEXT',
'displayName' : '用法用量指导',
'type' : 'varchar(200)',
'javaName' : 'text',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'DURATION',
'displayName' : '执行天数',
'type' : 'number(8)',
'javaName' : 'duration',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'C_MED_CODE',
'displayName' : '特殊用法代码',
'type' : 'varchar(20)',
'javaName' : 'cMedCode',
'note' : '',
'nullable':true,
'check':'CV9900285'},
{
'name' : 'UP_HOSPITAL_NAME',
'displayName' : '上传机构名称',
'type' : 'varchar(40)',
'javaName' : 'upHospitalName',
'note' : '上传数据医疗机构在市平台的机构代码',
'nullable':false,
'check':''}
];