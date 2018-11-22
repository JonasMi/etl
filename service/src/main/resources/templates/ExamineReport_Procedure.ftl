<#ftl output_format="XML">
<!-- 检验单示例 -->
<Procedure xmlns="http://hl7.org/fhir">
    <identifier>
        <!-- 原系统检验单id命名空间 -->
        <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/examination-id"/>
        <!-- 原系统检验单id号 -->
        <value value="${examinationResultId}"/>
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
            <code value="04"/>
            <!-- 处置类别名称 -->
            <display value="检验"/>
    	</coding>
    </category>
    <code>
     <#if examinationType??||examinationTypeName??>
        <coding>
            <!-- 检验类别命名空间 -->
            <system value="http://www.nestvision.com/platform/app/data/v1/code/examination-type"/>
             <#if examinationType??>
            <!-- 检验类别 -->
            <code value="${examinationType}"/>
            </#if>
            <#if examinationTypeName??>
            <!-- 检验类别名字 -->
            <display value="${examinationTypeName}"/>
             </#if>
        </coding>
        </#if>
    </code>
    <report>
        <!-- 检验报告单id -->
        <reference value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/examination-result-id|${examinationResultId}"/>
    </report>
    <request>
        <!-- 检验申请单id -->
        <reference value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/examination-order-id|${examinationOrderId}"/>
    </request>
</Procedure>
