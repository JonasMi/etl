<#ftl output_format="XML">
<!--住院症状记录 -->
<Condition xmlns="http://hl7.org/fhir">
    <#if dpId??>
    <!-- 记录医生所在科室id -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifier/dp-id">
        <valueReference>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id|${dpId}" />
        </valueReference>
    </extension>
    </#if>  
    <#if onsetDate??>
    <!-- 发病时间 -->
    <extension url="http://www.nestvision.com/platform/app/data/v1/date/onset-date">
        <valueDateTime value="${onsetDate?string("yyyy-MM-dd")}T${onsetDate?string("HH:mm:ss")}"/>
    </extension>
    </#if>  
    <#if diagnosisId??>
    <identifier>
        <system
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/condition-id" />
        <!-- 原系统症状记录id -->
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
    <#if inpatientRegistrationId??>
    <!--住院信息id -->
    <encounter>
        <reference
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/inpatient-registration-id|${inpatientRegistrationId}" />
    </encounter>
    </#if>
    <#if diagnosisEmpId??>
    <!--医生信息 id -->
    <asserter>
        <reference
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${diagnosisEmpId}" />
    </asserter>
    </#if>
    <!-- 症状代码 -->
    <code>
        <coding>
            <!--症状ICD-10编码 -->
            <system value="urn:oid:2.16.156.10011.2.3.3.11"/>
            <#if diagnosisCd??>
            <!--症状ICD-10编码（必填） -->
            <code value="${diagnosisCd}" />
            </#if>
            <#if diagnosisValue??>
            <display value="${diagnosisValue}" />
            </#if>
        </coding>
    </code>
    <!-- 诊断、症状类型 -->
    <category>
        <coding>
            <system value="http://www.nestvision.com/platform/app/data/v1/code/condition-types"/>
            <code value="15"/>
            <display value="住院症状"/>
        </coding>
    </category>
    <!-- 症状状态（必填） -->
<verificationStatus value="differential"/>
    <#if onsetdatetime??>
    <!-- 记录日期 -->
    <onsetDateTime value="${onsetdatetime?string("yyyy-MM-dd")}" />
    </#if>
</Condition>