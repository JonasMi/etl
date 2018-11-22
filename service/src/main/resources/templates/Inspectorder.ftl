<#ftl output_format="XML">
<!-- 检查申请单 -->
<DiagnosticOrder xmlns="http://hl7.org/fhir">
    <#if dpId??>
    <!--检查科室 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifier/dp-id">
        <valueReference>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id|${dpId}" />
        </valueReference>
    </extension>
    </#if>
 
    <!--申请科室 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifier/order-dpid">
        <valueReference>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id|${orderDpid}" />
        </valueReference>
    </extension>
    <#if orderDate??>
    <!--申请时间 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/date/order-date">
        <valueDateTime value="${orderDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
    </extension>
    </#if>
    <#if inspectionObjective??>
    <!--检查目的 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/inspection-objective">
        <valueString value="${inspectionObjective}" />
    </extension>
    </#if>
    <#if orderTypeCd??>
    <!--对应医嘱类型 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/order-type-cd">
        <valueCode value="${orderTypeCd}" />
    </extension>
    </#if>
    <#if adviceId??>
    <!--对应医嘱号 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifier/advice-id">
        <valueString value="${adviceId}"/>
    </extension>
    </#if>
    <#if inspectionType??>
    <!--检查类别代码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/inspection-type">
        <valueCode value="${inspectionType}" />
    </extension>
    </#if>
    <#if inspectionTypeName??>
    <!--检查类别名称 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/inspection-type-name">
        <valueString value="${inspectionTypeName}" />
    </extension>
    </#if>
    <identifier>
        <!-- 原系统检查单id命名空间 -->
        <system
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/inspection-order-id" />
        <!-- 原系统检查单id -->
        <value value="${inspectionOrderId}" />
    </identifier>
    
    <#if status??>
    <!-- 状态:完成 -->
    <status value="${status}" />
    </#if>
    <#if priority??>
    <!--优先等级:常规 -->
    <priority value="${priority}" />
    </#if>
    <subject>
        <!-- 院内患者ID -->
        <reference
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/patient-id|${patientId}" />
        <!--患者姓名 -->
        <display value="${patientName}" />
    </subject>
    <#if visitMark=='1'>
    <#assign encounterType='outpatient-registration-id'> 
    <#elseif visitMark=='2'>
    <#assign encounterType='inpatient-registration-id'> 
    </#if>
    <!-- 门诊或者住院信息id -->
    <encounter>
        <reference
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/${encounterType}|${registrationId}" />
    </encounter>
   
   <#if ordererEmployeeId??>
    <orderer>
        <!-- 申请医生ID -->
        <reference
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${ordererEmployeeId}" />
    </orderer>
    </#if>
    
    <#if inspectionItemCd??||inspectionItemName??||partCode??||partName??>
    <item>
        <#if inspectionItemCd??||inspectionItemName??>
        <code>
            <coding>
                <#if inspectionItemCd??>
                <!-- 检查项目代码命名空间 -->
                <system
                    value="http://www.nestvision.com/platform/app/data/v1/code/inspection-item-cd" />
                <!-- 检验项目代码 -->
                <code value="${inspectionItemCd}" />
                </#if>
                <#if inspectionItemName??>
                <!-- 检验项目名字 -->
                <display value="${inspectionItemName}" />
                </#if>
            </coding>
        </code>
        </#if>
        <#if partCode??||partName??>
        <bodySite>
            <coding>
            	 <#if partCode??>
                <!--检查部位代码命名空间 -->
                <system
                    value="http://www.nestvision.com/platform/app/data/v1/code/part-code" />
                <!--检查部位代码 -->
                <code value="${partCode}"/>
                </#if>
                <#if partName??>
                 <!--检查部位名称 -->
                <display value="${partName}"/>
                </#if>
            </coding>
        </bodySite>
        </#if>
    </item>
    </#if>
</DiagnosticOrder>
