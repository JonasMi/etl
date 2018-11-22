<#ftl output_format="XML">
<ReferralRequest xmlns="http://hl7.org/fhir">
    <#if inBedno??>
    <!-- 转入床位信息id -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifer/in-bedno">
        <valueReference>
            <reference value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/bed-id|${inBedno}"/>
        </valueReference>
    </extension>
    </#if>
    <#if outBedno??>
    <!-- 转出床位信息id -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifer/out-bedno">
        <valueReference>
            <reference value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/bed-id|${outBedno}"/>
        </valueReference>
    </extension>
    </#if>
    <#if outDpid??>
    <!-- 转出科室id -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifier/out-dpid">
        <valueReference>
            <reference value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id|${outDpid}"/>
        </valueReference>
    </extension>
    </#if>
    <#if inDate??>
    <!-- 转入时间 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/datetime/in-date">
        <valueDateTime value="${inDate?string("yyyy-MM-dd")}T${inDate?string("HH:mm:ss")}" />
    </extension>
    </#if>
    <#if outDate??>
    <!-- 转出时间 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/datetime/out-date">
        <valueDateTime value="${outDate?string("yyyy-MM-dd")}T${outDate?string("HH:mm:ss")}" />
    </extension>
    </#if>
    <#if transferReason??>
    <!-- 转诊原因 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/transfer-reason">
        <valueString value="${transferReason}" />
    </extension>
    </#if>
    <#if transferRecord??>
    <!-- 转诊记录 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/transfer-record">
        <valueString value="${transferRecord}" />
    </extension>
    </#if>
    <#if inpatientTransferId??>
    <identifier>
        <!-- 原系统转诊id -->
        <system
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/inpatient-transfer-id" />
        <value value="${inpatientTransferId}" />
    </identifier>
    </#if>
    <#if status??>
    <!-- 状态 -->
    <status value="${status}"/>
    </#if>
    <category/>
    <#if patientId??>
    <patient>
        <!-- 患者id -->
        <reference value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/patient-id|${patientId}" />
    </patient>
    </#if>
    <#if inpatientRegistrationId??>
    <context>
        <!-- 住院流水id -->
        <reference value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/inpatient-registration-id|${inpatientRegistrationId}" />
    </context>
    </#if>
    <#if outEmpId??>
    <!-- 转出操作人id -->
    <requester>
        <reference value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${outEmpId}" />
    </requester>
    </#if>
    <#if inDpid??>
    <!-- 转入科室id -->
    <recipient>
        <reference value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id|${inDpid}" />
    </recipient>
    </#if>
    <#if inEmpId??>
    <!-- 转入操作人id -->
    <recipient>
        <reference value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${inEmpId}" />
    </recipient>
    </#if>
</ReferralRequest>