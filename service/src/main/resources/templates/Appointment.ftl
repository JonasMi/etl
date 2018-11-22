<#ftl output_format="XML">
<!-- 挂号请求样例 -->
<Appointment xmlns="http://hl7.org/fhir">
    <#if reFee??>
    <!-- 挂号费 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/re-fee">
        <valueDecimal value="${reFee}" />
    </extension>
    </#if>
    <#if dtFee??>
    <!-- 诊疗费 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/dt-fee">
        <valueDecimal value="${dtFee}" />
    </extension>
    </#if>
    <#if rbFee??>
    <!-- 病历本费 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/rb-fee">
        <valueDecimal value="${rbFee}" />
    </extension>
    </#if>
    <#if ifSpecial??>
    <!-- 是否门诊特殊病 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/boolean/if-special">
        <valueBoolean value="${ifSpecial?string("true","false")}" />
    </extension>
    </#if>
    <#if regSourceCode??>
    <!-- 就诊方式代码-->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/reg-source-code">
        <valueCode value="${regSourceCode}" />
    </extension>
    </#if>
    <#if registerDpCode??>
    <!-- 挂号科室 -->
    <extension url="http://www.nestvision.com/platform/app/data/v1/identifier/register-dp-code">
        <valueReference>
            <reference value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id|${registerDpCode}"/>
        </valueReference>
    </extension>
    </#if>
    <#if medicalInsuranceType??>
    <!-- 医疗（保险）类别代码 -->
    <extension url="urn:oid:2.16.156.10011.2.3.1.248">
        <valueCode value="${medicalInsuranceType}"/>
    </extension>
    </#if>
    <#if regTypeCode??>
    <!-- 就诊类别 -->
    <extension url="http://www.nestvision.com/platform/app/data/v1/code/reg-type-code">
        <valueCode value="${regTypeCode}"/>
    </extension>
    </#if>
    <#if registerTime??>
    <!-- 挂号时间 -->
    <extension url="http://www.nestvision.com/platform/app/data/v1/date/register-time">
        <valueDateTime value="${registerTime?string("yyyy-MM-dd")}T${registerTime?string("HH:mm:ss")}"/>
    </extension>
    </#if>
    <#if regNo??>
    <!-- 就诊顺序号 -->
    <extension url="http://www.nestvision.com/platform/app/data/v1/text/reg-no">
        <valueString value="${regNo}"/>
    </extension>
    </#if>
    <#if regSerialNo??>
    <!-- 就诊流水号 -->
    <extension url="http://www.nestvision.com/platform/app/data/v1/text/reg-serial-no">
        <valueString value="${regSerialNo}"/>
    </extension>
    </#if>
    <!-- 门诊挂号支付信息集 -->
    
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/extension/cli-register-paymays">
        <#if appointmentPays??>
        <#list appointmentPays as appointmentpay>
        <!-- 门诊挂号支付信息1 -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/extension/cli-register-paymay">
            <#if appointmentpay.payWayCd??>
            <!-- 支付方式代码CV9900376  -->
            <extension
                url="urn:oid:2.16.156.10011.2.3.1.269">
                <valueCode value="${appointmentpay.payWayCd}" />
            </extension>
            </#if>
            <#if appointmentpay.settlementWayCd??>
            <!-- 结算方式代码CV0710004 -->
            <extension
                url="urn:oid:2.16.156.10011.2.3.1.198">
                <valueCode value="${appointmentpay.settlementWayCd}" />
            </extension>
            </#if>
            <#if appointmentpay.payAmount??>
            <!-- 支付金额 -->
            <extension
                url="http://www.nestvision.com/platform/app/data/v1/number/pay-amount">
                <valueDecimal value="${appointmentpay.payAmount}" />
            </extension>
            </#if>
        </extension>
        </#list>
        </#if>
    </extension>
    <#if appointmentId??>
    <!-- 预约号 -->
    <identifier>
        <system
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/appointment-id" />
        <value value="${appointmentId}" />
    </identifier>
    </#if>
    <#if registerId??>
    <!-- 挂号号 -->
    <identifier>
        <system
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/register-id" />
        <value value="${registerId}" />
    </identifier>
    </#if>
    <#if status??>
    <!-- proposed已预约| pending| booked已支付| arrived已取票| fulfilled| cancelled已取消 -->
    <status value="${status}" />
    </#if>
    <#if priority??>
    <!-- 等级 -->
    <priority value="${priority}" />
    </#if>
    <#if startTime??>
    <!-- 预计就诊时间，可以不填 -->
    <start value="${startTime?string("yyyy-MM-dd")}T${startTime?string("HH:mm:ss")}" />
    </#if>
    <#if endTime??>
    <end value="${endTime?string("yyyy-MM-dd")}T${endTime?string("HH:mm:ss")}" />
    </#if>
    <#if numberSourceId??>
    <!-- 号源编号 -->
    <slot>
        <reference
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/number-source-id|${numberSourceId}" />
    </slot>
    </#if>
    <!-- 患者信息 -->
    <participant>
        <type>
            <coding>
                <!-- 参与者角色命名空间 -->
                <system value="http://hl7.org/fhir/v3/ParticipationType" />
                <!-- 参与者角色代码 -->
                <code value="SBJ" />
                <!-- 参与者角色名字 -->
                <display value="患者" />
            </coding>
        </type>
        <actor>
            <#if patientId??>
            <!-- 患者ID -->
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/patient-id|${patientId}" />
            </#if>
            <#if patientName??>
            <!-- 患者名字 -->
            <display value="${patientName}" />
            </#if>
        </actor>
        <!-- 状态：已接受（必填） -->
        <status value="accepted" />
    </participant>
    <!-- 挂号医生信息 -->
    <participant>
        <type>
            <coding>
                <!-- 参与者角色命名空间 -->
                <system value="http://hl7.org/fhir/v3/ParticipationType" />
                <!-- 参与者角色代码 -->
                <code value="ADM" />
                <!-- 参与者角色名字 -->
                <display value="挂号" />
            </coding>
        </type>
        <#if registerEmployeeId?? || registerEmployeeName??>
        <actor>
            <#if registerEmployeeId??>
            <!-- 挂号医生id -->
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${registerEmployeeId}" />
            </#if>
            <#if registerEmployeeName??>
            <!-- 挂号医生姓名 -->
            <display value="${registerEmployeeName}" />
            </#if>
        </actor>
        </#if>
        <required value="required" />
        <!-- 状态：已接受（必填） -->
        <status value="accepted" />
    </participant>
    <!-- 专家ID -->
    <participant>
        <type>
            <coding>
                <system value="http://hl7.org/fhir/v3/ParticipationType" />
                <code value="ATND" />
            </coding>
        </type>
        <#if expertId?? || expertName??>
        <actor>
            <#if expertId??>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${expertId}" />
            </#if>
            <#if expertName??>
            <display value="${expertName}" />
            </#if>
        </actor>
        </#if>
        <!-- 状态：已接受（必填） -->
        <status value="accepted" />
    </participant>
</Appointment>