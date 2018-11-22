<#ftl output_format="XML">
<!-- 门诊处方明细示例 -->
<MedicationOrder xmlns="http://hl7.org/fhir">
    <#if orderTypeCode??>
    <!-- 医嘱类型代码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/order-type-code">
        <valueCode value="${orderTypeCode}" />
    </extension>
    </#if>
    <#if outpatientPrescription?? && outpatientPrescription.skintestType??>
    <!-- 皮试标志 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/skintest-type">
        <valueCode value="${outpatientPrescription.skintestType}" />
    </extension>
    </#if>
    <#if outpatientPrescription?? && outpatientPrescription.skintestResult??>
    <!-- 皮试结果 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/skintest-result">
        <valueString value="${outpatientPrescription.skintestResult}" />
    </extension>
    </#if>
    <#if outpatientPrescription?? && outpatientPrescription.skintestNurid??>
    <!-- 皮试护士 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifier/skintest-nurid">
        <valueReference>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${outpatientPrescription.skintestNurid}" />
        </valueReference>
    </extension>
    </#if>
    <#if outpatientPrescription?? && outpatientPrescription.skintestSenurid??>
    <!-- 第二皮试护士 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifier/skintest-senurid">
        <valueReference>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${outpatientPrescription.skintestSenurid}" />
        </valueReference>
    </extension>
    </#if>
    <#if outpatientPrescription?? && outpatientPrescription.orderDpid??>
    <!-- 开立科室 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifier/order-dpid">
        <valueReference>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id|${outpatientPrescription.orderDpid}" />
        </valueReference>
    </extension>
    </#if>
    <#if outpatientPrescription?? && outpatientPrescription.recipeTypeCode??>
    <!-- 处方类型代码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/recipe-type-code">
        <valueCode value="${outpatientPrescription.recipeTypeCode}" />
    </extension>
    </#if>
    <#if outpatientPrescription?? && outpatientPrescription.applyId??>
    <!-- 申请单号 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/apply-id">
        <valueString value="${outpatientPrescription.applyId}" />
    </extension>
    </#if>
    <#if outpatientPrescription?? && outpatientPrescription.cMedNum??>
    <!-- 中药剂数 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/c-med-num">
        <valueInteger value="${outpatientPrescription.cMedNum}" />
    </extension>
    </#if>
    <#if sequence??>
    <!-- 序号 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/recipe-no">
        <valueString value="${sequence}" />
    </extension>
    </#if>
    <#if precDrugNo??>
    <!-- 处方药品组号 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/prec-drug-no">
        <valueString value="${precDrugNo}" />
    </extension>
    </#if>
    <#if itemSpec??>
    <!-- 项目规格 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/item-spec">
        <valueString value="${itemSpec}" />
    </extension>
    </#if>
    <#if freqCode??>
    <!-- 频率代码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/freq-code">
        <valueCode value="${freqCode}" />
    </extension>
    </#if>
    <#if itemNumber??>
    <!-- 数量 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/item-number">
        <valueInteger value="${itemNumber}" />
    </extension>
    </#if>
    <#if itemUnit??>
    <!-- 项目单位 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/item-unit">
        <valueString value="${itemUnit}" />
    </extension>
    </#if>
    <#if itemAmount??>
    <!-- 金额 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/item-amount">
        <valueDecimal value="${itemAmount}" />
    </extension>
    </#if>
    <#if itemPrice??>
    <!-- 单价 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/item-price">
        <valueDecimal value="${itemPrice}" />
    </extension>
    </#if>
    <#if outpatientPrescription?? && outpatientPrescription.dispensingDtime??>
    <!-- 发药时间 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/datetime/dispensing-dtime">
        <valueDateTime value="${outpatientPrescription.dispensingDtime?string("yyyy-MM-dd")}T${outpatientPrescription.dispensingDtime?string("HH:mm:ss")}" />
    </extension>
    </#if>
    <#if outpatientPrescription?? && outpatientPrescription.cnPrescribe??>
    <!-- 中药处方 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/cn-prescribe">
        <valueString value="${outpatientPrescription.cnPrescribe}" />
    </extension>
    </#if>
    <#if outpatientPrescription?? && outpatientPrescription.cnPrescribeDescr??>
    <!-- 中药煎煮法 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/cn-prescribe-descr">
        <valueString value="${outpatientPrescription.cnPrescribeDescr}" />
    </extension>
    </#if>
    <#if outpatientPrescription?? && outpatientPrescription.cnDrugWayCd??>
    <!-- 中药服用方法代码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/cn-drug-way-cd">
        <valueCode value="${outpatientPrescription.cnDrugWayCd}" />
    </extension>
    </#if>
    <#if outpatientPrescription?? && outpatientPrescription.cnTypeCd??>
    <!-- 中药剂型:1:饮片2:颗粒 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/cn-type-cd">
        <valueCode value="${outpatientPrescription.cnTypeCd}" />
    </extension>
    </#if>
    <#if groupNo??>
    <!-- 成组号（0-无分组） -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/group-no">
        <valueString value="${groupNo}" />
    </extension>
    </#if>
    <#if drugTotalDose??>
    <!-- 药物使用总剂量 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/drug-total-dose">
        <valueDecimal value="${drugTotalDose}" />
    </extension>
    </#if>
    <#if drugTotalDoseUtil??>
    <!-- 药物使用总剂量单位 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/drug-total-dose-util">
        <valueString value="${drugTotalDoseUtil}" />
    </extension>
    </#if>
    <#if prescriptionItemCode??>
    <!-- 处方项目（引用收费项目或药品信息） -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifier/prescription-item-code">
        <#if orderTypeCode ?? && orderTypeCode=='01'>
        <valueReference>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/code/medication|${prescriptionItemCode}" />
        </valueReference>
        <#else>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/item-code|${prescriptionItemCode}" />
        </valueReference>
        </#if>
    </extension>
    </#if>
    <#if outpatientPrescription?? && outpatientPrescription.ifAgency??>
    <!-- 是否代办 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/boolean/if-agency">
        <valueBoolean value="${outpatientPrescription.ifAgency?string("true","false")}" />
    </extension>
    </#if>
    <#if outpatientPrescription?? && outpatientPrescription.ifPrint??>
    <!-- 是否打印 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/boolean/if-print">
        <valueBoolean value="${outpatientPrescription.ifPrint?string("true","false")}" />
    </extension>
    </#if>
    <#if outpatientPrescription?? && outpatientPrescription.ifChange??>
    <!-- 是否收费 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/boolean/if-change">
        <valueBoolean value="${outpatientPrescription.ifChange?string("true","false")}" />
    </extension>
    </#if>
    <#if outpatientPrescription?? && outpatientPrescription.agencyRelCode??>
    <!-- 代办人关系代码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/agency-rel-code">
        <valueCode value="${outpatientPrescription.agencyRelCode}" />
    </extension>
    </#if>
    <#if outpatientPrescription?? && outpatientPrescription.idCard??>
    <!-- 代办人身份证号 -->
    <extension url="urn:oid:2.16.156.10011.1.3">
        <valueString value="${outpatientPrescription.idCard}" />
    </extension>
    </#if>
    <#if outpatientPrescription?? && outpatientPrescription.allocatePsid??>
    <!-- 调配者ID -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifier/allocate-psid">
        <valueReference>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${outpatientPrescription.allocatePsid}" />
        </valueReference>
    </extension>
    </#if>
    <#if outpatientPrescription?? && outpatientPrescription.drugPsid??>
    <!-- 发药者ID -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifier/drug-psid">
        <valueReference>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${outpatientPrescription.drugPsid}" />
        </valueReference>
    </extension>
    </#if>
    <#if outpatientPrescription?? && outpatientPrescription.precAuditPsid??>
    <!-- 审核药剂师ID -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifier/prec-audit-psid">
        <valueReference>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${outpatientPrescription.precAuditPsid}" />
        </valueReference>
    </extension>
    </#if>
    <#if outpatientPrescription?? && outpatientPrescription.precCheckPsid??>
    <!-- 核对药剂师ID -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifier/prec-check-psid">
        <valueReference>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${outpatientPrescription.precCheckPsid}" />
        </valueReference>
    </extension>
    </#if>
    <#if outpatientPrescription?? && outpatientPrescription.performDept??>
    <!-- 执行科室ID -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifier/perform-dept">
        <valueReference>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id|${outpatientPrescription.performDept}" />
        </valueReference>
    </extension>
    </#if>
    <#if outpatientPrescription?? && outpatientPrescription.precPerform??>
    <!-- 执行人ID -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifier/prec-perform">
        <valueReference>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${outpatientPrescription.precPerform}" />
        </valueReference>
    </extension>
    </#if>
    <#if outpatientPrescription?? && outpatientPrescription.totalAmount??>
    <!-- 处方总金额 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/total-amount">
        <valueDecimal value="${outpatientPrescription.totalAmount}" />
    </extension>
    </#if>
    <#if outpatientPrescription?? && outpatientPrescription.outpatientPrescriptionId?? && sequence??>
    <identifier>
        <!-- 原系统门诊处方id命名空间 -->
        <system
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/outpatient-prescription-id" />
        <!-- 原系统门诊处方id : 处方号+”_”+序号 -->
        <value value="${outpatientPrescription.outpatientPrescriptionId}_${sequence}" />
    </identifier>
    </#if>
    <#if outpatientPrescription?? && outpatientPrescription.status??>
    <status value="${outpatientPrescription.status}" />
    </#if>
    <#if outpatientPrescription?? && outpatientPrescription.prescriptionItemCode??>
    <!-- 药品信息 -->
    <medicationReference>
        <reference
            value="http://www.nestvision.com/entity/hospital/${hospitalId}/his/${vendorId}/v${version}/code/medication|${outpatientPrescription.prescriptionItemCode}" />
    </medicationReference>
    <#else>
	<medicationCodeableConcept/>
    </#if>
    <patient>
        <#if outpatientPrescription?? && outpatientPrescription.patientId??>
        <!-- 院内患者ID -->
        <reference
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/patient-id|${outpatientPrescription.patientId}" />
        </#if>
        <#if outpatientPrescription?? && outpatientPrescription.patientName??>
        <!-- 患者姓名 -->
        <display value="${outpatientPrescription.patientName}" />
        </#if>
    </patient>
    <#if outpatientPrescription?? && outpatientPrescription.outpatientRegistrationId??>
    <!-- 状态：完成的 -->
    <encounter>
        <!-- 门诊信息ID -->
        <reference
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/outpatient-registration-id|${outpatientPrescription.outpatientRegistrationId}" />
    </encounter>
    </#if>
    <#if outpatientPrescription?? && outpatientPrescription.datewritten??>
    <!-- 开立时间 -->
    <dateWritten value="${outpatientPrescription.datewritten?string("yyyy-MM-dd")}T${outpatientPrescription.datewritten?string("HH:mm:ss")}" />
    </#if>
    <#if outpatientPrescription?? && outpatientPrescription.prescriber??>
    <prescriber>
        <!-- 开立医生ID -->
        <reference
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${outpatientPrescription.prescriber}" />
    </prescriber>
    </#if>
    <#if outpatientPrescription?? && outpatientPrescription.dateended??>
    <!-- 停止时间 -->
    <dateEnded value="${outpatientPrescription.dateended?string("yyyy-MM-dd")}T${outpatientPrescription.dateended?string("HH:mm:ss")}" />
    </#if>
    <#if outpatientPrescription?? && outpatientPrescription.note??>
    <note>
        <!-- 备注 -->
        <text value="${outpatientPrescription.note}" />
    </note>
    </#if>
    <dosageInstruction>
        <#if text??>
        <!-- 用法用量指导 -->
        <text value="${text}" />
        </#if>
        <timing>
            <repeat>
                <#if start??>
                <boundsPeriod>
                    <!-- 医嘱开始时间 -->
                    <start value="${start?string("yyyy-MM-dd")}T${start?string("HH:mm:ss")}" />
                </boundsPeriod>
                </#if>
                <#if duration??>
                <!-- 执行天数 -->
                <duration value="${duration}" />
                </#if>
                <durationUnit value="d" />
            </repeat>
        </timing>
        <#if dosageCode??>
        <route>
            <coding>
                <!-- 用药途径代码命名空间 -->
                <system
                    value="http://www.nestvision.com/platform/app/data/v1/code/dosage-code" />
                <#if dosageCode??>
                <!-- 用药途径代码：口服 -->
                <code value="${dosageCode}" />
                </#if>
            </coding>
        </route>
        </#if>
        <#if cMedCode??>
        <method>
            <coding>
                <!-- 特殊用法代码命名空间 -->
                <system
                    value="http://www.nestvision.com/platform/app/data/v1/code/c-med-code" />
                <#if cMedCode??>
                <!-- 特殊用法代码 -->
                <code value="${cMedCode}" />
                </#if>
            </coding>
        </method>
        </#if>
        <#if onceValue??>
        <doseQuantity>
            <#if onceValue??>
            <!-- 用药次剂量 -->
            <value value="${onceValue}" />
            </#if>
            <#if onceUnit??>
            <!-- 用药次剂量单位 -->
            <unit value="${onceUnit}" />
            </#if>
        </doseQuantity>
        </#if>
    </dosageInstruction>
</MedicationOrder>