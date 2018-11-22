var datetimeValueHandler = function(value){
	var date = new Date(value);
	return date.format('yyyy-MM-dd hh:mm:ss');
};
var fieldModels = [ 
{
'name' : 'MEDICAL_RECORD_OUTLINE_ID',
'displayName' : '院内系统病历概要id',
'type' : 'varchar(40)',
'javaName' : 'medicalRecordOutlineId',
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
'name' : 'TELECOM',
'displayName' : '联系电话',
'type' : 'varchar(20)',
'javaName' : 'telecom',
'note' : '',
'nullable':true,
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
'name' : 'NATION_CD',
'displayName' : '民族代码',
'type' : 'varchar(20)',
'javaName' : 'nationCd',
'note' : '',
'nullable':true,
'check':'CV9900377'},
{
'name' : 'OCCUPATION_CD',
'displayName' : '职业代码',
'type' : 'varchar(20)',
'javaName' : 'occupationCd',
'note' : '',
'nullable':true,
'check':'GBT22614'},
{
'name' : 'WORK_UNIT',
'displayName' : '工作单位',
'type' : 'varchar(40)',
'javaName' : 'workUnit',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'CONTACT_NUMBER',
'displayName' : '工作单位联系方式',
'type' : 'varchar(40)',
'javaName' : 'contactNumber',
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
'name' : 'RESPONS_DOC_NAME',
'displayName' : '责任医师姓名',
'type' : 'varchar(20)',
'javaName' : 'responsDocName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'TEMP_STATE',
'displayName' : '现居住住址-省（自治区、直辖市）代码',
'type' : 'varchar(10)',
'javaName' : 'tempState',
'note' : '',
'nullable':true,
'check':'GBT2260'},
{
'name' : 'TEMP_CITY',
'displayName' : '现居住住址-市（地区）代码',
'type' : 'varchar(10)',
'javaName' : 'tempCity',
'note' : '',
'nullable':true,
'check':'GBT2260'},
{
'name' : 'TEMP_DISTRICT',
'displayName' : '现居住住址-县（区）代码',
'type' : 'varchar(10)',
'javaName' : 'tempDistrict',
'note' : '',
'nullable':true,
'check':'GBT2260'},
{
'name' : 'TEMP_LINE',
'displayName' : '现居住住址-乡（镇、街道办事处）',
'type' : 'varchar(100)',
'javaName' : 'tempLine',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'TEMP_ROAD',
'displayName' : '现居住住址-村（街、路、弄等）',
'type' : 'varchar(100)',
'javaName' : 'tempRoad',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'TEMP_HOUSE_NO',
'displayName' : '现居住住址-门牌号码',
'type' : 'varchar(50)',
'javaName' : 'tempHouseNo',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'TEMP_POST_CD',
'displayName' : '现地址邮政编码',
'type' : 'varchar(50)',
'javaName' : 'tempPostCd',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'MARITALSTATUS',
'displayName' : '婚姻状况代码',
'type' : 'varchar(20)',
'javaName' : 'maritalstatus',
'note' : '',
'nullable':true,
'check':'GBT22612'},
{
'name' : 'RELATIONSHIP',
'displayName' : '联系人关系代码',
'type' : 'varchar(20)',
'javaName' : 'relationship',
'note' : '',
'nullable':true,
'check':'GBT4761'},
{
'name' : 'CONTACTS_NAME',
'displayName' : '联系人姓名',
'type' : 'varchar(20)',
'javaName' : 'contactsName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'CONTACTS_PHONE',
'displayName' : '联系人电话号码',
'type' : 'varchar(20)',
'javaName' : 'contactsPhone',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'CONTACTS_TEMP_STATE',
'displayName' : '联系人地址-省（自治区、直辖市）代码',
'type' : 'varchar(10)',
'javaName' : 'contactsTempState',
'note' : '',
'nullable':true,
'check':'GBT2260'},
{
'name' : 'CONTACTS_TEMP_CITY',
'displayName' : '联系人地址-市（地区）代码',
'type' : 'varchar(10)',
'javaName' : 'contactsTempCity',
'note' : '',
'nullable':true,
'check':'GBT2260'},
{
'name' : 'CONTACTS_TEMP_DISTRICT',
'displayName' : '联系人地址-县（区）代码',
'type' : 'varchar(10)',
'javaName' : 'contactsTempDistrict',
'note' : '',
'nullable':true,
'check':'GBT2260'},
{
'name' : 'CONTACTS_TEMP_LINE',
'displayName' : '联系人地址-乡（镇、街道办事处）',
'type' : 'varchar(100)',
'javaName' : 'contactsTempLine',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'CONTACTS_TEMP_ROAD',
'displayName' : '联系人地址-村（街、路、弄等）',
'type' : 'varchar(100)',
'javaName' : 'contactsTempRoad',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'CONTACTS_TEMP_HOUSE_NO',
'displayName' : '联系人地址-门牌号码',
'type' : 'varchar(50)',
'javaName' : 'contactsTempHouseNo',
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
'name' : 'HISTORY_OF_DISEASE',
'displayName' : '疾病史（含外伤）',
'type' : 'text',
'javaName' : 'historyOfDisease',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'INFECTION_HISTORY',
'displayName' : '传染病史',
'type' : 'text',
'javaName' : 'infectionHistory',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'OP_HIS',
'displayName' : '手术史',
'type' : 'text',
'javaName' : 'opHis',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'OBSTETRICAL_HISTORY',
'displayName' : '婚育史',
'type' : 'text',
'javaName' : 'obstetricalHistory',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'TRANSFUSION_HIS',
'displayName' : '输血史描述',
'type' : 'text',
'javaName' : 'transfusionHis',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'RRITABILITY',
'displayName' : '过敏史描述',
'type' : 'text',
'javaName' : 'rritability',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'VACC_HIS',
'displayName' : '预防接种史描述',
'type' : 'text',
'javaName' : 'vaccHis',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'PER_HISTORY',
'displayName' : '个人史',
'type' : 'text',
'javaName' : 'perHistory',
'note' : '患者个人生活习惯及有无烟、酒、药物等嗜好，职业与工作条件及有无工业毒物、粉尘、放射性物质接触史，有无冶游史的描述',
'nullable':true,
'check':''},
{
'name' : 'MENSES_HIS',
'displayName' : '月经史',
'type' : 'text',
'javaName' : 'mensesHis',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'FAM_HISTORY',
'displayName' : '家族史',
'type' : 'text',
'javaName' : 'famHistory',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'DEATH_CODE',
'displayName' : '死因代码',
'type' : 'varchar(20)',
'javaName' : 'deathCode',
'note' : '',
'nullable':true,
'check':'CV990111'},
{
'name' : 'IN_REASON',
'displayName' : '就诊原因',
'type' : 'varchar(100)',
'javaName' : 'inReason',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'OTHER_MEDICAL_TREATMENT',
'displayName' : '其他医学处置',
'type' : 'varchar(1000)',
'javaName' : 'otherMedicalTreatment',
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
'name' : 'END',
'displayName' : '出院时间',
'type' : 'date',
'javaName' : 'end',
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
'name' : 'DIAGNOSTIC_CODE',
'displayName' : '西医诊断-编码',
'type' : 'varchar(20)',
'javaName' : 'diagnosticCode',
'note' : '',
'nullable':true,
'check':'CV990111'},
{
'name' : 'DIAGNOSTIC_NAME',
'displayName' : '西医诊断-编码名称',
'type' : 'varchar(40)',
'javaName' : 'diagnosticName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'ONSET_DATE',
'displayName' : '西医诊断-发病时间',
'type' : 'date',
'javaName' : 'onsetDate',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'TREATMENT_RESULT_CODE',
'displayName' : '西医诊断-病情转归代码',
'type' : 'varchar(20)',
'javaName' : 'treatmentResultCode',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'OTHER_DIAGNOSTIC_CODE',
'displayName' : '其他西医诊断编码',
'type' : 'varchar(20)',
'javaName' : 'otherDiagnosticCode',
'note' : '',
'nullable':true,
'check':'CV990111'},
{
'name' : 'OTHER_DIAGNOSTIC_NAME',
'displayName' : '其他西医诊断编码',
'type' : 'varchar(40)',
'javaName' : 'otherDiagnosticName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'CN_SYM_DIAG_CODE',
'displayName' : '中医征候诊断代码',
'type' : 'varchar(20)',
'javaName' : 'cnSymDiagCode',
'note' : '',
'nullable':true,
'check':'CV9900357'},
{
'name' : 'CN_DIS_DIAG_CODE',
'displayName' : '中医病名诊断代码',
'type' : 'varchar(20)',
'javaName' : 'cnDisDiagCode',
'note' : '',
'nullable':true,
'check':'CV9900357'},
{
'name' : 'CN_TREATMENT_RESULT_CODE',
'displayName' : '中医病名/中医征候诊断病情转归代码',
'type' : 'varchar(20)',
'javaName' : 'cnTreatmentResultCode',
'note' : '',
'nullable':true,
'check':'CV0510010'},
{
'name' : 'OPERATION_CD',
'displayName' : '手术编码',
'type' : 'varchar(20)',
'javaName' : 'operationCd',
'note' : '',
'nullable':true,
'check':'CV990113'},
{
'name' : 'OPERATION_NAME',
'displayName' : '手术名称',
'type' : 'varchar(40)',
'javaName' : 'operationName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'CRUCIAL_DRUG_NAME',
'displayName' : '关键药物名称',
'type' : 'varchar(40)',
'javaName' : 'crucialDrugName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'CRUCIAL_DRUG_USAGE',
'displayName' : '关键药物用法',
'type' : 'varchar(40)',
'javaName' : 'crucialDrugUsage',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'DRUG_ADVERSE_REACTION',
'displayName' : '药物不良反应情况',
'type' : 'varchar(200)',
'javaName' : 'drugAdverseReaction',
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
'name' : 'MEDICAL_INSURANCE_CATEGORY',
'displayName' : '医疗保险类别代码',
'type' : 'varchar(20)',
'javaName' : 'medicalInsuranceCategory',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'FEE_CODE',
'displayName' : '医疗付费方式',
'type' : 'varchar(20)',
'javaName' : 'feeCode',
'note' : '',
'nullable':true,
'check':'CV9900376'},
{
'name' : 'PSN_EXPENSE',
'displayName' : '个人承担费用',
'type' : 'number(8)',
'javaName' : 'psnExpense',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'OUTPATIENT_EXPENSES',
'displayName' : '门诊费用金额',
'type' : 'number(8)',
'javaName' : 'outpatientExpenses',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'INPATIENT_EXPENSES',
'displayName' : '住院费用金额',
'type' : 'number(8)',
'javaName' : 'inpatientExpenses',
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