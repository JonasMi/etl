<#ftl output_format="XML">
<!-- 手术单示例 -->
<Procedure xmlns="http://hl7.org/fhir">
    <#if notchType??>
    <!-- 切口类别代码 -->
    <extension url="urn:oid:2.16.156.10011.2.3.1.256">
        <valueCode value="${notchType}" />
    </extension>
    </#if>
    <#if incisionHealingCd??>
    <!-- 切口愈合级别代码 -->
    <extension url="urn:oid:2.16.156.10011.2.3.1.257">
        <valueCode value="${incisionHealingCd}" />
    </extension>
    </#if>
    <#if noticeDate??>
    <!-- 手术通知时间 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/datetime/notice-date">
        <valueDateTime value="${noticeDate?string("yyyy-MM-dd")}T${noticeDate?string("HH:mm:ss")}" />
    </extension>
    </#if>
    <#if opMark??>
    <!-- 是否主要术式 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/boolean/op-mark">
        <valueBoolean value="${opMark?string("true","false")}" />
    </extension>
    </#if>
    <#if opProMark??>
    <!-- 是否主要手术或操作 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/boolean/op-pro-mark">
        <valueBoolean value="${opProMark?string("true","false")}" />
    </extension>
    </#if>
    <#if opLevelCd??>
    <!-- 手术级别代码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/op-level-cd">
        <valueCode value="${opLevelCd}" />
    </extension>
    </#if>
    <#if anesthesiaLevelCd??>
    <!-- 麻醉分级代码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/anesthesia-level-cd">
        <valueCode value="${anesthesiaLevelCd}" />
    </extension>
    </#if>
    <#if opTypeCode??>
    <!-- 手术类型 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/op-type-code">
        <valueCode value="${opTypeCode}" />
    </extension>
    </#if>
    <#if authorDtime??>
    <!-- 记录时间 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/datetime/author-dtime">
        <valueDateTime value="${authorDtime?string("yyyy-MM-dd")}T${authorDtime?string("HH:mm:ss")}" />
    </extension>
    </#if>
    <#if woundDescr??>
    <!-- 手术切口描述 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/wound-descr">
        <valueString value="${woundDescr}" />
    </extension>
    </#if>
    <#if transfusionItemAmount??>
    <!-- 输血量 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/transfusion-item-amount">
        <valueDecimal value="${transfusionItemAmount}" />
    </extension>
    </#if>
    <#if infusionAmount??>
    <!-- 输液量 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/infusion-amount">
        <valueDecimal value="${infusionAmount}" />
    </extension>
    </#if>
    <#if lossbloodAmount??>
    <!-- 出血量 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/lossblood-amount">
        <valueDecimal value="${lossbloodAmount}" />
    </extension>
    </#if>
    <#if ifDrain??>
    <!-- 引流标志代码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/boolean/if-drain">
        <valueBoolean value="${ifDrain?string("true","false")}" />
    </extension>
    </#if>
    <#if drainMaterialAmount??>
    <!-- 引流材料数量 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/drain-material-amount">
        <valueDecimal value="${drainMaterialAmount}" />
    </extension>
    </#if>
    <#if drainMaterialName??>
    <!-- 引流材料名称 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/drain-material-name">
        <valueString value="${drainMaterialName}" />
    </extension>
    </#if>
    <#if placedPart??>
    <!-- 放置部位 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/placed-part">
        <valueString value="${placedPart}" />
    </extension>
    </#if>
    <#if opPreDrug??>
    <!-- 术前用药 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/op-pre-drug">
        <valueString value="${opPreDrug}" />
    </extension>
    </#if>
    <#if opDrug??>
    <!-- 术中用药 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/op-drug">
        <valueString value="${opDrug}" />
    </extension>
    </#if>
    <#if operationCourse??>
    <!-- 手术经过 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/operation-course">
        <valueString value="${operationCourse}" />
    </extension>
    </#if>
    <#if intervention??>
    <!-- 介入物名称 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/intervention">
        <valueString value="${intervention}" />
    </extension>
    </#if>
    <#if skinThimerosal??>
    <!-- 皮肤消毒描述 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/skin-thimerosal">
        <valueString value="${skinThimerosal}" />
    </extension>
    </#if>
    <#if transfuseReactionFlag??>
    <!-- 输血反应标志 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/boolean/transfuse-reaction-flag">
        <valueBoolean value="${transfuseReactionFlag?string("true","false")}" />
    </extension>
    </#if>
    <#if opNo??>
    <!-- 手术操作序号 -->
    <extension url="http://www.nestvision.com/platform/app/data/v1/text/op-no">
        <valueString value="${opNo}" />
    </extension>
    </#if>
    <#if authorCode??>
    <!-- 记录者id -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifier/author-code">
        <valueReference>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${authorCode}" />
        </valueReference>
    </extension>
    </#if>
    <#if preDiagnosisDn??>
    <!-- 术前诊断的值 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/pre-diagnosis-dn">
        <valueString value="${preDiagnosisDn}" />
    </extension>
    </#if>
    <#if operationId??>
    <identifier>
        <!-- 原系统手术单id命名空间 -->
        <system
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/operation-id" />
        <!-- 原系统手术单id号 -->
        <value value="${operationId}" />
    </identifier>
    </#if>
    <subject>
        <#if patientId??>
        <!-- 院内患者ID -->
        <reference
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/patient-id|${patientId}" />
        </#if>
        <#if patientName??>
        <!-- 患者姓名 -->
        <display value="${patientName}" />
        </#if>
    </subject>
    <#if status??>
    <!-- 状态：进行中 -->
    <status value="${status}" />
    </#if>
    <category>
        <coding>
            <!-- 处置类别命名空间 -->
            <system
                value="http://www.nestvision.com/platform/app/data/v1/code/procedure-types" />
            <!-- 处置类别 -->
            <code value="01" />
            <!-- 处置类别名称 -->
            <display value="手术" />
        </coding>
    </category>
    <code>
        <coding>
            <!-- 麻醉方法命名空间 -->
            <system value="urn:oid:2.16.156.10011.2.3.1.159" />
            <#if anesthesiaMethodCd??>
            <!-- 麻醉方法代码 -->
            <code value="${anesthesiaMethodCd}" />
            </#if>
            <#if anesthesiaMethodName??>
            <!-- 麻醉方法 -->
            <display value="${anesthesiaMethodName}" />
            </#if>
        </coding>
        <coding>
            <!-- 手术编码命名空间 -->
            <system value="urn:oid:2.16.156.10011.2.3.3.12" />
            <#if operationCd??>
            <!-- 手术编码 -->
            <code value="${operationCd}" />
            </#if>
            <#if operationName??>
            <!-- 手术名字 -->
            <display value="${operationName}" />
            </#if>
        </coding>
    </code>
    <bodySite>
        <coding>
            <!-- 手术操作体位代码命名空间 -->
            <system value="urn:oid:2.16.156.10011.2.3.1.262" />
            <#if operatingPosition??>
            <!-- 手术操作体位代码 -->
            <code value="${operatingPosition}" />
            </#if>
            <#if operatingPositionName??>
            <!-- 手术操作体位名称 -->
            <display value="${operatingPositionName}" />
            </#if>
        </coding>
        <coding>
            <!-- 手术操作目标部位代码命名空间 -->
            <system value="http://www.nestvision.com/platform/app/data/v1/code/part-code" />
            <#if partCode??>
            <!-- 手术操作目标部位代码 -->
            <code value="${partCode}" />
            </#if>
            <#if partName??>
            <!-- 手术操作目标部位名称 -->
            <display value="${partName}" />
            </#if>
        </coding>
    </bodySite>
    <performer>
        <#if medicalRecordManager??>
        <!-- 病案管理者id -->
        <actor>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${medicalRecordManager}" />
        </actor>
        </#if>
        <role>
            <coding>
                <!-- 角色代码命名空间 -->
                <system value="http://hl7.org/fhir/ValueSet/performer-role" />
                <!-- 角色代码：病案管理者 -->
                <code value="56542007" />
            </coding>
            <!-- 角色名称 -->
            <text value="病案管理者" />
        </role>
    </performer>
    <performer>
        <#if equipmentManager??>
        <!-- 器材管理者id -->
        <actor>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${equipmentManager}" />
        </actor>
        </#if>
        <role>
            <coding>
                <!-- 角色代码命名空间 -->
                <system value="http://hl7.org/fhir/ValueSet/performer-role" />
                <!-- 角色代码：器材管理者 -->
                <code value="310194009" />
            </coding>
            <!-- 角色名称 -->
            <text value="器材管理者" />
        </role>
    </performer>
    <performer>
        <#if patrolNurse??>
        <!-- 巡台护士id -->
        <actor>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${patrolNurse}" />
        </actor>
        </#if>
        <role>
            <coding>
                <!-- 角色代码命名空间 -->
                <system value="http://hl7.org/fhir/ValueSet/performer-role" />
                <!-- 角色代码：巡台护士 -->
                <code value="413854007" />
            </coding>
            <!-- 角色名称 -->
            <text value="巡台护士" />
        </role>
    </performer>
    <performer>
        <#if operative??>
        <!-- 手术者id -->
        <actor>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${operative}" />
        </actor>
        </#if>
        <role>
            <coding>
                <!-- 角色代码命名空间 -->
                <system value="http://hl7.org/fhir/ValueSet/performer-role" />
                <!-- 角色代码：手术者 -->
                <code value="405684005" />
            </coding>
            <!-- 角色名称 -->
            <text value="术者" />
        </role>
    </performer>
    <performer>
        <#if firstAssistant??>
        <!-- I助id -->
        <actor>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${firstAssistant}" />
        </actor>
        </#if>
        <role>
            <coding>
                <!-- 角色代码命名空间 -->
                <system value="http://hl7.org/fhir/ValueSet/performer-role" />
                <!-- 角色代码：手术助理 -->
                <code value="405685006" />
            </coding>
            <!-- 角色名称 -->
            <text value="I助" />
        </role>
    </performer>
    <performer>
        <#if secondAssistant??>
        <!-- II助id -->
        <actor>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${secondAssistant}" />
        </actor>
        </#if>
        <role>
            <coding>
                <!-- 角色代码命名空间 -->
                <system value="http://hl7.org/fhir/ValueSet/performer-role" />
                <!-- 角色代码：手术助理 -->
                <code value="405685006" />
            </coding>
            <!-- 角色名称 -->
            <text value="II助" />
        </role>
    </performer>
    <performer>
        <#if anaesthetic??>
        <!-- 麻醉者id -->
        <actor>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${anaesthetic}" />
        </actor>
        </#if>
        <role>
            <coding>
                <!-- 角色代码命名空间 -->
                <system value="http://hl7.org/fhir/ValueSet/performer-role" />
                <!-- 角色代码：麻醉者 -->
                <code value="158970007" />
            </coding>
            <!-- 角色名称 -->
            <text value="麻醉者" />
        </role>
    </performer>
    <performer>
        <#if notify??>
        <!-- 通知者id -->
        <actor>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${notify}" />
        </actor>
        </#if>
        <role>
            <coding>
                <!-- 角色代码命名空间 -->
                <system value="http://hl7.org/fhir/ValueSet/performer-role" />
                <!-- 角色代码：通知者 -->
                <code value="224620002" />
            </coding>
            <!-- 角色名称 -->
            <text value="通知者" />
        </role>
    </performer>
    <performedPeriod>
        <#if start??>
        <!-- 手术开始时间 -->
        <start value="${start?string("yyyy-MM-dd")}T${start?string("HH:mm:ss")}" />
        </#if>
        <#if end??>
        <!-- 手术结束时间 -->
        <end value="${end?string("yyyy-MM-dd")}T${end?string("HH:mm:ss")}" />
        </#if>
    </performedPeriod>
    
    <!-- 住院信息ID -->
    <#if registrationId??>
    <encounter>
        <reference
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/inpatient-registration-id|${registrationId}" />
    </encounter>
    </#if>
    <#if bedId??>
    <!-- 床位 -->
    <location>
        <reference
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/bed-id|${bedId}" />
    </location>
    </#if>
    <#if operationOrderId??>
    <request>
        <!-- 手术申请单id -->
        <reference
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/operation-order-id|${operationOrderId}" />
    </request>
    </#if>
</Procedure>