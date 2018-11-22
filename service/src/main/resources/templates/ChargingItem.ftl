<#ftl output_format="XML">
<!-- 收费项目请求样例 -->
<Basic xmlns="http://hl7.org/fhir">
    <#if itemName??>
    <!-- 收费项目名称 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/item-name">
        <valueString value="${itemName}" />
    </extension>
    </#if>
    <#if outpFeeTypeCode??>
    <!-- 门诊费用类型代码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/outp-fee-type-code">
        <valueCode value="${outpFeeTypeCode}" />
    </extension>
    </#if>
    <#if hospFeeTypeCode??>
    <!-- 住院费用类型代码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/hosp-fee-type-code">
        <valueCode value="${hospFeeTypeCode}" />
    </extension>
    </#if>
    <#if itemSpec??>
    <!-- 项目规格 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/item-spec">
        <valueString value="${itemSpec}" />
    </extension>
    </#if>
    <#if itemUnit??>
    <!-- 单位 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/item-unit">
        <valueString value="${itemUnit}" />
    </extension>
    </#if>
    <#if itemPrice??>
    <!-- 单价 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/item-price">
        <valueDecimal value="${itemPrice}" />
    </extension>
    </#if>
    <#if ncmsMedication??>
    <!-- 对应农合编码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/ncms/medication">
        <valueCode value="${ncmsMedication}" />
    </extension>
    </#if>
    <#if medicalInsurance??>
    <!-- 对应医保编码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/medicalins/medication">
        <valueCode value="${medicalInsurance}" />
    </extension>
    </#if>
    <#if feeBasis??>
    <!-- 收费依据 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/fee-basis">
        <valueString value="${feeBasis}" />
    </extension>
    </#if>
    <#if medicationCategory??>
    <!-- 医保报销标志 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/medicalins/medication-category">
        <valueCode value="${medicationCategory}" />
    </extension>
    </#if>
    <#if ncmsMedicationCategory??>
    <!-- 农合报销标志 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/ncms/medication-category">
        <valueCode value="${ncmsMedicationCategory}" />
    </extension>
    </#if>
    <#if itemStdCode??>
    <!-- 收费项目标准编码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/item-std-code">
        <valueCode value="${itemStdCode}" />
    </extension>
    </#if>
    <#if itemCode??>
    <!-- 原系统收费项目编码 -->
    <identifier>
        <system
            value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/item-code" />
        <value value="${itemCode}" />
    </identifier>
    </#if>
    <code>
        <coding>
            <system
                value="http://www.nestvision.com/platform/app/data/v1/code/source-type" />
            <code value="1" />
            <display value="收费项目" />
        </coding>
    </code>
</Basic>