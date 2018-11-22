<#ftl output_format="XML">
<Location xmlns="http://hl7.org/fhir">
    <#if levelCode??>
    <!--床位等级代码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/level-code">
        <valueCode value="${levelCode}" />
    </extension>
    </#if>
    <#if bedId??>
    <identifier>
        <!--原系统床位ID号命名空间 -->
        <system
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/bed-id" />
        <!-- 原系统床位ID号 -->
        <value value="${bedId}" />
    </identifier>
    </#if>
    <#if status??>
    <!--状态：启用 -->
    <status value="${status}" />
    </#if>
    <type>
        <#if typeCode??>
        <coding>
            <!--床位类型代码命名空间 -->
            <system
                value="http://www.nestvision.com/platform/app/data/v1/code/type-code" />
            <!--床位类型代码 -->
            <code value="${typeCode}" />
        </coding>
        </#if>
    </type>
    <address>
        <#if wardNo??>
        <!--病房号 -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/text/ward-no">
            <valueString value="${wardNo}" />
        </extension>
        </#if>
        <#if wardArea??>
        <!--病区 -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/text/ward-area">
            <valueString value="${wardArea}" />
        </extension>
        </#if>
        <#if bedId??>
        <!--床位号 -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/text/bed-num">
            <valueString value="${bedId}" />
        </extension>
        </#if>
    </address>
    <#if departmentId??>
    <!--科室id -->
    <managingOrganization>
        <reference
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id|${departmentId}" />
    </managingOrganization>
    </#if>
</Location>