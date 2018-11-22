<#ftl output_format="XML">
<!-- 号源请求样例 -->
<Slot xmlns="http://hl7.org/fhir">
	<#if surplusAllowReservationNum??>
    <!-- 剩余可预约量-->
	<extension url="http://www.nestvision.com/platform/app/data/v1/number/surplus-allow-reservation-num">
		<valueInteger value="${surplusAllowReservationNum}"/>
	</extension>
	</#if>
    <#if itemCode??>
    <identifier>
        <!--原系统号源ID号命名空间 -->
        <system
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/number-source-id" />
        <!-- 原系统号源ID号 -->
        <value value="${itemCode}" />
    </identifier>
    </#if>
    <#if scheduleId??>
    <!-- 排班信息id -->
    <schedule>
        <reference value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/schedule-id|${scheduleId}"/>
    </schedule>
    </#if>
    <!-- 状态标记:忙碌的（节点必填）-->
    <status value="busy"/>
    <#if start??>
    <!-- 开始时间（节点必填）-->
    <start value="${start?string('yyyy-MM-dd\'T\'HH:mm:ss')}"/>
    <#else>
    <start />
    </#if>
    <#if end??>
    <!-- 結束时间（节点必填）-->
    <end value="${end?string('yyyy-MM-dd\'T\'HH:mm:ss')}"/>
    <#else>
    <end />
    </#if>
    <#if overbooked??>
    <!-- 是否可以被预约 -->
    <overbooked value="${overbooked?string("true","false")}"/>
    </#if>
    <#if comment??>
    <comment value="${comment}"/>
    </#if>
</Slot>