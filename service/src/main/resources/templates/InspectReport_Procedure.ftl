<#ftl output_format="XML">
<!-- 检查单示例 -->
<Procedure xmlns="http://hl7.org/fhir">
    <identifier>
        <!-- 原系统检查单id命名空间 -->
        <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/inspection-id"/>
        <!-- 原系统检查单id号 -->
        <value value="${inspectionResultId}"/>
    </identifier>
    <subject>
        <!-- 院内患者ID -->
        <reference value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/patient-id|${patientId}"/>
        <!-- 患者姓名 -->
        <display value="${patientName}"/>
    </subject>
    <#if status??>
      <!-- 状态:完成 -->
    <status/>
    </#if>
	<category>
    	<coding>
    		<!-- 处置类别命名空间 -->
            <system value="http://www.nestvision.com/platform/app/data/v1/code/procedure-types"/>
            <!-- 处置类别 -->
            <code value="03"/>
            <!-- 处置类别名称 -->
            <display value="检查"/>
    	</coding>
    </category>
    <code>
    <#if inspectionType??||inspectionTypeName??>
        <coding>
            <!-- 检查类别命名空间 -->
            <system value="http://www.nestvision.com/platform/app/data/v1/code/inspection-type"/>
             <#if inspectionType??>
            <!-- 检查类别 -->
            <code value="${inspectionType}"/>
            </#if>
             <#if inspectionTypeName??>
            <!-- 检查类别名字 -->
            <display value="${inspectionTypeName}"/>
            </#if>
        </coding>
        </#if>
    </code>
    <report>
        <!-- 检查报告单id -->
        <reference value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/inspection-result-id|${inspectionResultId}"/>
    </report>
    <request>
        <!-- 检查申请单id -->
        <reference value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/inspection-order-id|${inspectionOrderId}"/>
    </request>
</Procedure>
