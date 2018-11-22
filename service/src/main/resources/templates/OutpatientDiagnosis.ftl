<#ftl output_format="XML">
<!-- 门（急）诊诊断 -->
<Condition xmlns="http://hl7.org/fhir">
    <#if patientSerialNo??>
    <!--诊断序号 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/patient-serial-no">
        <valueString value="${patientSerialNo}" />
    </extension>
    </#if>
    <#if ifInfection??>
    <!--是否传染病标志 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/boolean/if-infection">
        <valueBoolean value="${ifInfection?string("true","false")}" />
    </extension>
    </#if>
    <#if infectReportCd??>
    <!--传染上报标志 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/boolean/infect-report-cd">
        <valueBoolean value="${infectReportCd?string("true","false")}" />
    </extension>
    </#if>
    <#if cnSymDiagCode??>
    <!--中医征候诊断代码CV9900357 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/cn-sym-diag-code">
        <valueCode value="${cnSymDiagCode}" />
    </extension>
    </#if>
    <#if admitDiag??>
    <!-- 诊断顺位 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/admit-diag">
        <valueDecimal value="${admitDiag}" />
    </extension>
    </#if>
    <#if cnDisDiagCode??>
    <!--中医病名诊断代码CV9900357 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/cn-dis-diag-code">
        <valueCode value="${cnDisDiagCode}" />
    </extension>
    </#if>
    <#if diagnosisId??>
    <identifier>
        <system
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/condition-id" />
        <!-- 原系统诊断记录id -->
        <value value="${diagnosisId}" />
    </identifier>
    </#if>
    <patient>
        <#if patientId??>
        <!--患者信息id(必填) -->
        <reference
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/patient-id|${patientId}" />
        </#if>
        <#if patientName??>
        <!--姓名 -->
        <display value="${patientName}" />
        </#if>
    </patient>
    <#if outpatientRegistrationId??>
    <!--门诊信息id -->
    <encounter>
        <reference
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/outpatient-registration-id|${outpatientRegistrationId}" />
    </encounter>
    </#if>
    <#if diagnosisEmpId??>
    <!--诊断医生信息 id -->
    <asserter>
        <reference
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${diagnosisEmpId}" />
    </asserter>
    </#if>
    <code>
        <coding>
            <!--诊断ICD-10编码 -->
            <system value="urn:oid:2.16.156.10011.2.3.3.11" />
            <#if diagnosisCd??>
            <!--诊断ICD-10编码（必填） -->
            <code value="${diagnosisCd}" />
            </#if>
            <#if diagnosisValue??>
            <display value="${diagnosisValue}" />
            </#if>
        </coding>
    </code>
    <category>
        <coding>
            <system
                value="http://www.nestvision.com/platform/app/data/v1/code/condition-types" />
            <code value="2" />
            <display value="门（急）诊诊断" />
        </coding>
    </category>
    <!--诊断状态（必填） -->
    <verificationStatus value="provisional" />
    <#if onsetdatetime??>
    <!--诊断时间 -->
    <onsetDateTime value="${onsetdatetime?string("yyyy-MM-dd")}" />
    </#if>
</Condition>