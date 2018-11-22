<#ftl output_format="XML">
<!-- 号别信息请求样例 -->
<Basic xmlns="http://hl7.org/fhir">
	<#if itemCode??>
	<!-- 号别代码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/no-do-code">
        <valueCode value="${itemCode}" />
    </extension>
    </#if>
    <#if dpId??>
    <!-- 对应科室id -->
    <extension url="http://www.nestvision.com/platform/app/data/v1/identifier/dp-id">
        <valueReference>
            <reference value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id|${dpId}"/>
        </valueReference>
    </extension>
    </#if>
    <#if clinicCode??>
    <!-- 号别类型代码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/clinic-code">
        <valueCode value="${clinicCode}" />
    </extension>
    </#if>
    <#if reFee??>
    <!-- 挂号费 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/re-fee">
        <valueDecimal value="${reFee}" />
    </extension>
    </#if>
    <#if dtFee??>
    <!-- 诊疗费 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/dt-fee">
        <valueDecimal value="${dtFee}" />
    </extension>
    </#if>
    <#if itemCode??>
    <!-- 原系统号别id -->
    <identifier>
        <system
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/charge-type-id" />
        <value value="${itemCode}" />
    </identifier>
    </#if>
    <code>
        <coding>
            <system
                value="http://www.nestvision.com/platform/app/data/v1/code/source-type" />
            <code value="2" />
            <display value="号别信息" />
        </coding>
    </code>
</Basic>