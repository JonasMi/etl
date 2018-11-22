<#ftl output_format="XML">

<!-- 排班请求样例 -->
<Schedule xmlns="http://hl7.org/fhir">
	<#if ifStopDiagnosis??>
	<!-- 是否停诊-->
	<extension url="http://www.nestvision.com/platform/app/data/v1/boolean/if-stop-diagnosis">
	    <valueBoolean value="${ifStopDiagnosis?string("true","false")}"/>
	</extension>
	</#if>
	<#if replaceDiagnosisDoctor??>
	<!-- 替诊医生-->
	<extension url="http://www.nestvision.com/platform/app/data/v1/boolean/replace-diagnosis-doctor">
	    <valueReference>
	        <reference value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/employee-id|${replaceDiagnosisDoctor}"/>
	    </valueReference>
	</extension>
	</#if>
	<#if stopDiagnosisReason??>
	 <!-- 停诊原因-->
	<extension url="http://www.nestvision.com/platform/app/data/v1/text/stop-diagnosis-reason">
	     <valueString value="${stopDiagnosisReason}"/>
	</extension>
	</#if>
	<#if stopDiagnosisStartdate??>
	 <!-- 停诊起始日期-->
	<extension url="http://www.nestvision.com/platform/app/data/v1/text/stop-diagnosis-startdate">
	    <valueDate value="${stopDiagnosisStartdate?string("yyyy-MM-dd")}"/>
	</extension>
	</#if>
	<#if stopDiagnosisEnddate??>
	<!-- 停诊结束日期-->
	<extension url="http://www.nestvision.com/platform/app/data/v1/text/stop-diagnosis-enddate">
	    <valueDate value="${stopDiagnosisEnddate?string("yyyy-MM-dd")}"/>
	</extension>
	</#if>
    <#if arrDate??>
    <!-- 排班日期 -->
    <extension url="http://www.nestvision.com/platform/app/data/v1/date/arr-date">
        <valueDateTime value="${arrDate?string("yyyy-MM-dd")}"/>
    </extension>
    </#if>
    <#if preTimeCode??>
    <!-- 时间段代码-->
    <extension url="http://www.nestvision.com/platform/app/data/v1/code/pre-time-code">
        <valueCode value="${preTimeCode}"/>
    </extension>
    </#if>
    <#if chargeType??>
    <!-- 号别信息id -->
    <extension url="http://www.nestvision.com/platform/app/data/v1/identifier/charge-type">
        <valueReference>
            <reference value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/charge-type-id|${chargeType}"/>
        </valueReference>
    </extension>
    </#if>
    <#if allowReservationNum??>
    <!-- 允许预约量-->
    <extension url="http://www.nestvision.com/platform/app/data/v1/number/allow-reservation-num">
        <valueInteger value="${allowReservationNum}"/>
    </extension>
    </#if>
    <#if allowRegistrationNum??>
    <!-- 允许挂号量-->
    <extension url="http://www.nestvision.com/platform/app/data/v1/number/allow-registration-num">
        <valueInteger value="${allowRegistrationNum}"/>
    </extension>
    </#if>
    <#if scheduleId??>
    <identifier>
        <!--原系统排班id号命名空间 -->
        <system
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/schedule-id" />
        <!-- 原系统排班id号 -->
        <value value="${scheduleId}" />
    </identifier>
    </#if>
    <!-- 被安排的医务人员ID号（节点必填） -->
    <actor>
        <#if employeeId??>
        <reference value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${employeeId}"/>
        </#if>
    </actor>
    <#if start??>
    <!-- 排班时间段 -->
    <planningHorizon>
        <start value="${start?string("yyyy-MM-dd")}T${start?string("HH:mm:ss")}"/>
        <end value="${end?string("yyyy-MM-dd")}T${end?string("HH:mm:ss")}"/>
    </planningHorizon>
    </#if>
    <#if comment??>
    <comment value="${comment}"/>
    </#if>
</Schedule>