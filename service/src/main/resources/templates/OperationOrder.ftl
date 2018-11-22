<#ftl output_format="XML">
<!-- 手术申请单示例 -->
<ProcedureRequest xmlns="http://hl7.org/fhir">
    <#if orderDpid??>
    <!-- 申请科室 -->
    <extension url="http://www.nestvision.com/platform/app/data/v1/identifier/order-dpid">
        <valueReference>
            <reference value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id|${orderDpid}"/>
        </valueReference>
    </extension>
    </#if>
    <#if opDateType??>
    <!-- 手术日期类型 :1：定期手术-->
    <extension url="http://www.nestvision.com/platform/app/data/v1/code/op-date-type">
        <valueCode value="${opDateType}"/>
    </extension>
    </#if>
    <#if operationOrderId??>
    <identifier>
        <!-- 原系统手术申请单id命名空间 -->
        <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/operation-order-id"/>
        <!-- 原系统手术申请单id号 -->
        <value value="${operationOrderId}"/>
    </identifier>
    </#if>
    <subject>
        <#if patientId??>
        <!-- 院内患者ID -->
        <reference value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/patient-id|${patientId}"/>
        </#if>
        <#if patientName??>
        <!-- 患者姓名 -->
        <display value="${patientName}"/>
        </#if>
    </subject>
    <code>
        <coding>
            <!-- 手术编码命名空间 -->
            <system value="urn:oid:2.16.156.10011.2.3.3.12"/>
            <#if operationCd??>
            <!-- 手术编码 -->
            <code value="${operationCd}"/>
            </#if>
            <#if operationName??>
            <!-- 手术名字 -->
            <display value="${operationName}"/>
            </#if>
        </coding>
    </code>
    <#if scheduleddatetime??>
    <!-- 预计手术日期 -->
    <scheduledDateTime value="${scheduleddatetime?string("yyyy-MM-dd")}"/>
    </#if>
    <#if registrationId??>
    <encounter>
        <!-- 住院信息ID -->
        <reference value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/inpatient-registration-id|${registrationId}"/>
    </encounter>
    </#if>
    <#if status??>
    <!-- 状态：申请中 -->
    <status value="${status}"/>
    </#if>
    <#if orderEmployeeId??>
    <orderer>
        <!-- 申请医生ID -->
        <reference value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${orderEmployeeId}"/>
    </orderer>
    </#if>
</ProcedureRequest>