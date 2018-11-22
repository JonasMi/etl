var datetimeValueHandler = function(value){
	var date = new Date(value);
	return date.format('yyyy-MM-dd hh:mm:ss');
};
var fieldModels = [ 
{
'name' : 'INPATIENT_ADVICE_ID',
'displayName' : '住院医嘱id',
'type' : 'varchar(40)',
'javaName' : 'inpatientAdviceId',
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
'name' : 'AGE',
'displayName' : '患者年龄',
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
'name' : 'INH_ID',
'displayName' : '住院号',
'type' : 'varchar(40)',
'javaName' : 'inhId',
'note' : '',
'nullable':true,
'check':''},
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
'type' : 'varchar(40)',
'javaName' : 'wardArea',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'BED_NUM',
'displayName' : '床位号',
'type' : 'varchar(40)',
'javaName' : 'bedNum',
'note' : '',
'nullable':true,
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
'name' : 'WEIGHT',
'displayName' : '体重',
'type' : 'number(8)',
'javaName' : 'weight',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'ADVICE_PLAN_INFORMATION',
'displayName' : '医嘱计划信息',
'type' : 'varchar(100)',
'javaName' : 'advicePlanInformation',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'CANCEL_DOCTOR_ID',
'displayName' : '取消医嘱医生id',
'type' : 'varchar(20)',
'javaName' : 'cancelDoctorId',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'CANCEL_DOCTOR_NAME',
'displayName' : '取消医嘱医生姓名',
'type' : 'varchar(20)',
'javaName' : 'cancelDoctorName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'OPEN_ADVICE_DOCTOR_ID',
'displayName' : '开立医生ID',
'type' : 'varchar(20)',
'javaName' : 'openAdviceDoctorId',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'OPEN_ADVICE_DOCTOR_NAME',
'displayName' : '开立医生姓名',
'type' : 'varchar(20)',
'javaName' : 'openAdviceDoctorName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'OPEN_ADVICE_DOCTOR_ORG_ID',
'displayName' : '开立科室id',
'type' : 'varchar(40)',
'javaName' : 'openAdviceDoctorOrgId',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'OPEN_ADVICE_DOCTOR_ORG_NAME',
'displayName' : '开立科室名称',
'type' : 'varchar(40)',
'javaName' : 'openAdviceDoctorOrgName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'OPEN_ADVICE_DOCTOR_STANDARD_CODE',
'displayName' : '开立科室标准代码',
'type' : 'varchar(20)',
'javaName' : 'openAdviceDoctorStandardCode',
'note' : '',
'nullable':true,
'check':'CV9900051'},
{
'name' : 'ORDER_AUDITOR_ID',
'displayName' : '医嘱审核人id',
'type' : 'varchar(20)',
'javaName' : 'orderAuditorId',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'ORDER_AUDITOR_NAME',
'displayName' : '医嘱审核人姓名',
'type' : 'varchar(20)',
'javaName' : 'orderAuditorName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'CHECK_NURID_ID',
'displayName' : '医嘱核对护士id',
'type' : 'varchar(20)',
'javaName' : 'checkNuridId',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'CHECK_NURID_NAME',
'displayName' : '医嘱核对护士姓名',
'type' : 'varchar(20)',
'javaName' : 'checkNuridName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'STOP_DOCTORID_ID',
'displayName' : '医嘱停止医生id',
'type' : 'varchar(20)',
'javaName' : 'stopDoctoridId',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'STOP_DOCTORID_NAME',
'displayName' : '医嘱停止医生姓名',
'type' : 'varchar(20)',
'javaName' : 'stopDoctoridName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'PERFORMER_CD_ID',
'displayName' : '医嘱执行医生id',
'type' : 'varchar(20)',
'javaName' : 'performerCdId',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'PERFORMER_CD_NAME',
'displayName' : '医嘱执行医生姓名',
'type' : 'varchar(20)',
'javaName' : 'performerCdName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'PERFORM_DEPT_CD',
'displayName' : '医嘱执行科室标准编码',
'type' : 'varchar(20)',
'javaName' : 'performDeptCd',
'note' : '',
'nullable':true,
'check':'CV9900051'},
{
'name' : 'PERFORM_DEPT_CD_ID',
'displayName' : '医嘱执行科室id',
'type' : 'varchar(40)',
'javaName' : 'performDeptCdId',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'PERFORM_DEPT_CD_NAME',
'displayName' : '医嘱执行科室名称',
'type' : 'varchar(40)',
'javaName' : 'performDeptCdName',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'ORDER_TYPE_CODE',
'displayName' : '医嘱项目类型',
'type' : 'varchar(20)',
'javaName' : 'orderTypeCode',
'note' : '',
'nullable':true,
'check':'CV9900229'},
{
'name' : 'ORDER_PLAN_ST_DATE',
'displayName' : '医嘱计划开始日期时间',
'type' : 'date',
'javaName' : 'orderPlanStDate',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'ORDER_PLAN_END_DATE',
'displayName' : '医嘱计划结束日期时间',
'type' : 'date',
'javaName' : 'orderPlanEndDate',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'PERFORM_TIME',
'displayName' : '医嘱执行日期时间',
'type' : 'date',
'javaName' : 'performTime',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'APPLY_ID',
'displayName' : '电子申请单编号',
'type' : 'varchar(40)',
'javaName' : 'applyId',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'PREC_DRUG_NO',
'displayName' : '处方药品组号',
'type' : 'varchar(40)',
'javaName' : 'precDrugNo',
'note' : '',
'nullable':true,
'check':''},
{
'name' : 'ORDER_END_DATE',
'displayName' : '医嘱停止日期时间',
'type' : 'date',
'javaName' : 'orderEndDate',
'note' : '',
'nullable':true,
'check':'',
'valueHandler':datetimeValueHandler
},
{
'name' : 'ORDER_NOTE_REMARK',
'displayName' : '医嘱备注信息',
'type' : 'text',
'javaName' : 'orderNoteRemark',
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