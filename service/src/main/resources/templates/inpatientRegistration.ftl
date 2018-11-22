<#ftl output_format="XML">
<!-- 住院样例 -->
<Encounter xmlns="http://hl7.org/fhir"> 
    <#if inDpid??>
    <!-- 入院科室 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifier/in-dpid">
        <valueReference>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id|${inDpid}" />
        </valueReference>
    </extension>
    </#if>
    <#if inModeCode??>
    <!-- 入院途径 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/in-mode-code">
        <valueCode value="${inModeCode}" />
    </extension>
    </#if>
    <#if outDpid??>
    <!-- 出院科室 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifier/out-dpid">
        <valueReference>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id|${outDpid}" />
        </valueReference>
    </extension>
    </#if>
    <#if outModeCode??>
    <!-- 离院方式ID -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/out-mode-code">
        <valueCode value="${outModeCode}" />
    </extension>
    </#if>
    <#if feeCode??>
    <!-- 医疗付费方式 -->
    <extension url="http://www.nestvision.com/platform/app/data/v1/code/fee-code">
        <valueCode value="${feeCode}" />
    </extension>
    </#if>
    <#if inhospitalReasonCd??>
    <!-- 住院原因代码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/inhospital-reason-cd">
        <valueCode value="${inhospitalReasonCd}" />
    </extension>
    </#if>
    
    
    
    <#if admissionMethod??>
    <!-- 入院方式 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/text/admission-method">
		<valueString value="${admissionMethod}" />
	</extension>
	</#if>
	<#if inSituation??>
	<!-- 入院时情况 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/text/in-situation">
		<valueString value="${inSituation}" />
	</extension>
	</#if>
	<#if inInpatientArea??>
	<!-- 入院病区 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/text/in-inpatient-area">
		<valueString value="${inInpatientArea}" />
	</extension>
	</#if>
	<#if outInpatientArea??>
	<!-- 出院病区 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/text/out-inpatient-area">
		<valueString value="${outInpatientArea}" />
	</extension>
	</#if>
	<#if inpatTimes??>
	<!-- 住院次数 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/inpat-times">
		<valueInteger value="${inpatTimes}" />
	</extension>
	</#if>
	<#if inpatDays??>
	<!-- 住院天数 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/inpat-days">
		<valueDecimal value="${inpatDays}" />
	</extension>
	</#if>
    
    <#if inpatientRegistrationId??>
    <identifier>
        <system
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/inpatient-registration-id" />
        <!-- 原系统住院流水id号 -->
        <value value="${inpatientRegistrationId}" />
    </identifier>
    </#if>
    <!-- 状态 -->
    <status value="in-progress" />
    <!-- 类型：住院 -->
    <class value="inpatient" />
    <patient>
        <#if patientId??>
        <!-- 院内患者ID -->
        <reference
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/patient-id|${patientId}" />
        </#if>
        <#if patientName??>
        <!-- 患者姓名 -->
        <display value="${patientName}" />
        </#if>
    </patient>
    <participant>
        <type>
            <coding>
                <!-- 角色代码命名空间 -->
                <system value="http://hl7.org/fhir/v3/ParticipationType" />
                <!-- 角色代码：第一执行者 -->
                <code value="PPRF" />
                <display value="当前第一执行医生" />
            </coding>
        </type>
        <#if residentPhysicianId??>
        <!-- 当前住院医师 -->
        <individual>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${residentPhysicianId}" />
        </individual>
        </#if>
    </participant>
    <period>
        <#if startTime??>
        <!-- 入院时间 -->
        <start value="${startTime?string("yyyy-MM-dd")}T${startTime?string("HH:mm:ss")}" />
        </#if>
        <#if endTime??>
        <!-- 出院时间 -->
        <end value="${endTime?string("yyyy-MM-dd")}T${endTime?string("HH:mm:ss")}" />
        </#if>
    </period>
    <hospitalization>
        <#if inhId??>
        <preAdmissionIdentifier>
            <!-- 住院号命名空间 -->
            <system value="http://www.nestvision.com/platform/app/data/v1/text/inh-id" />
            <!-- 住院号 -->
            <value value="${inhId}" />
        </preAdmissionIdentifier>
        </#if>
    </hospitalization>
    <#if bedId??>
    <!-- 当前床号 -->
    <location>
        <location>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/bed-id|${bedId}" />
        </location>
    </location>
    </#if>
    <#if serviceprovider??>
    <!-- 当前科室 -->
    <serviceProvider>
        <reference
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id|${serviceprovider}" />
    </serviceProvider>
    </#if>
</Encounter>