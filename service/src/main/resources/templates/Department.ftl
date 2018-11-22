<#ftl output_format="XML">
<Organization xmlns="http://hl7.org/fhir">
    <#if ifEnd??>
    <!-- 是否末级科室 -->
    <extension url="http://www.nestvision.com/platform/app/data/v1/boolean/if-end">
        <valueBoolean value="${ifEnd?string("true","flase")}" />
    </extension>
    </#if>
    <#if classification??>
    <!-- 科室归类代码 -->
    <extension url="urn:oid:2.16.156.10011.2.3.2.62">
        <valueCode value="${classification}"/>
    </extension>
    </#if>
    <#if takeNoPlace??>
	<!-- 取号地点 -->
	<extension url="http://www.nestvision.com/platform/app/data/v1/text/take-no-place">
		<valueString value="${takeNoPlace}" />
	</extension>
    </#if>
    <#if departmentId??>
    <identifier>
        <!-- 院内科室ID号命名空间 -->
        <system
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id" />
        <!-- 院内科室ID号 -->
        <value value="${departmentId}" />
    </identifier>
    </#if>
    <#if dpType??>
    <type>
        <coding>
            <!-- 科室类型命名空间 -->
            <system value="http://www.nestvision.com/platform/app/data/v1/code/dp-type" />
            <!-- 科室类型 -->
            <code value="${dpType}" />
        </coding>
    </type>
    </#if>
    <#if name??>
    <!-- 科室名称 -->
    <name value="${name}" />
    </#if>
    <#if phone??>
    <telecom>
        <!-- 科室联系方式代码 -->
        <system value="phone" />
        <!-- 科室电话 -->
        <value value="${phone}" />
        <use value="work"/>
    </telecom>
    </#if>
    <#if partof??>
    <partOf>
        <!-- 上级机构id（如果没有上级科室，则填写上级医院） -->
        <reference value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id|${partof}" />
    </partOf>
    <#else>
    <partOf>
        <reference value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/hospital-id|${upHospital}" />
    </partOf>
    </#if>
</Organization>