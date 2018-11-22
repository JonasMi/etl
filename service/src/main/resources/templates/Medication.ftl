<#ftl output_format="XML">
<!-- 药品请求样例 -->
<Medication xmlns="http://hl7.org/fhir">
    <#if isOtc??>
    <!-- 是否OTC -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/boolean/is-otc">
        <valueBoolean value="${isOtc?string("true","false")}" />
    </extension>
    </#if>
    <#if medicationName??>
    <!-- 商品名 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/alias-name">
        <valueString value="${medicationName}" />
    </extension>
    </#if>
    <#if spec??>
    <!-- 规格 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/spec">
        <valueString value="${spec}" />
    </extension>
    </#if>
    <#if routeUnit??>
    <!-- 大包装单位 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/route-unit">
        <valueString value="${routeUnit}" />
    </extension>
    </#if>
    <#if leastUnit??>
    <!-- 小包装单位 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/least-unit">
        <valueString value="${leastUnit}" />
    </extension>
    </#if>
    <#if proportion??>
    <!-- 大、小包装换算 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/proportion">
        <valueDecimal value="${proportion}" />
    </extension>
    </#if>
    <#if cliUnitCheck??>
    <!-- 门诊使用单位 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/cli-unit-check">
        <valueCode value="${cliUnitCheck}" />
    </extension>
    </#if>
    <#if inhUnitCheck??>
    <!-- 住院使用单位 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/inh-unit-check">
        <valueCode value="${inhUnitCheck}" />
    </extension>
    </#if>
    <#if ifBasic??>
    <!-- 是否基础药 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/boolean/if-basic">
        <valueBoolean value="${ifBasic?string("true","flase")}" />
    </extension>
    </#if>
    <#if ifImport??>
    <!-- 是否进口药：否 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/boolean/if-import">
        <valueBoolean value="${ifImport?string("true","flase")}" />
    </extension>
    </#if>
    <#if ifPoison??>
    <!-- 是否毒、麻类药物：否 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/boolean/if-poison">
        <valueBoolean value="${ifPoison?string("true","flase")}" />
    </extension>
    </#if>
    <#if ifPsychotropic??>
    <!-- 是否精神类药物：否 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/boolean/if-psychotropic">
        <valueBoolean value="${ifPsychotropic?string("true","flase")}" />
    </extension>
    </#if>
    <#if ifPrecious??>
    <!-- 是否贵重药品：否 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/boolean/if-precious">
        <valueBoolean value="${ifPrecious?string("true","flase")}" />
    </extension>
    </#if>
    <#if ifAntibiotic??>
    <!-- 是否抗菌药物标志：否 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/boolean/if-antibiotic">
        <valueBoolean value="${ifAntibiotic?string("true","flase")}" />
    </extension>
    </#if>
    <#if antibioticType??>
    <!-- 抗菌药等级 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/antibiotic-type">
        <valueCode value="${antibioticType}" />
    </extension>
    </#if>
    <#if medicationTypeCode??>
    <!-- 药品类别代码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/medication-type-code">
        <valueCode value="${medicationTypeCode}" />
    </extension>
    </#if>
    <#if cnMedicationTypeCode??>
    <!-- 中药类别代码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/cn-medication-type-code">
        <valueCode value="${cnMedicationTypeCode}" />
    </extension>
    </#if>
    <#if drugTypeCode??>
    <!-- 药物类型代码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/drug-type-code">
        <valueCode value="${drugTypeCode}" />
    </extension>
    </#if>
    <#if dddValue??>
    <!-- DDD值/最小剂量 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/ddd-value">
        <valueDecimal value="${dddValue}" />
    </extension>
    </#if>
    <#if drugAdverseReaction??>
    <!-- 药物不良反应情况 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/drug-adverse-reaction">
        <valueString value="${drugAdverseReaction}" />
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
    <code>
    	<#if medicalInsurance?? || medicalInsuranceName??>
        <coding>
            <!-- 医保系统药物编码 -->
            <system
                value="http://www.nestvision.com/platform/app/data/v1/code/medicalins/medication" />
            <#if medicalInsurance??>
            <code value="${medicalInsurance}" />
            </#if>
            <#if medicalInsuranceName??>
            <display value="${medicalInsuranceName}" />
            </#if>
        </coding>
        </#if>
        
        <#if agricultural?? || agriculturalName??>
        <coding>
            <#if agricultural??>
            <!-- 农合系统药物编码 -->
            <system
                value="http://www.nestvision.com/platform/app/data/v1/code/ncms/medication" />
            <code value="${agricultural}" />
            </#if>
            <#if agriculturalName??>
            <display value="${agriculturalName}" />
            </#if>
        </coding>
        </#if>
        
        <#if standardCd?? || standardName??>
        <coding>
            <!-- 国药准字系统药物编码 -->
            <system
                value="http://www.nestvision.com/platform/app/data/v1/code/medication" />
            <#if standardCd??>
            <code value="${standardCd}" />
            </#if>
            <#if standardName??>
            <display value="${standardName}" />
            </#if>
        </coding>
        </#if>
        <#if medicationCd?? || medicationName??>
        <coding>
            <!-- 院内药物编码 -->
            <system
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/code/medication" />
            <#if medicationCd??>
            <code value="${medicationCd}" />
            </#if>
            <#if medicationCd??>
            <display value="${medicationName}" />
            </#if>
        </coding>
        </#if>
    </code>
    <#if isbrand??>
    <!-- 是否是品牌药物：是 -->
    <isBrand value="${isbrand?string("true","flase")}" />
    </#if>
    <#if manufacturer??>
    <manufacturer>
        <display value="${manufacturer}" />
    </manufacturer>
    </#if>
    <product>
        <!-- 药物剂型 -->
        <form>
            <coding>
                <!-- 药物剂型命名空间 -->
                <system value="urn:oid:2.16.156.10011.2.3.1.211" />
                <!-- 药物剂型 -->
                <#if drugDosageForms??>
                <code value="${drugDosageForms}" />
                </#if>
                <#if drugDosageName??>
                <!-- 药物剂型名字 -->
                <display value="${drugDosageName}" />
                </#if>
            </coding>
        </form>
        <#if lotnumber?? || expirationdate??>
        <batch>
            <#if lotnumber??>
            <!-- 生产批次号 -->
            <lotNumber value="${lotnumber}" />
            </#if>
            <#if expirationdate??>
            <!-- 过期时间 -->
            <expirationDate value="${expirationdate?string("yyyy-MM-dd")}" />
            </#if>
        </batch>
        </#if>
    </product>
</Medication>