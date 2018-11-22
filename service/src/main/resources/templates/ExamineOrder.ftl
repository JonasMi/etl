<#ftl output_format="XML">
<!-- 检验申请单 -->
<DiagnosticOrder xmlns="http://hl7.org/fhir">
	<#if dpId??>
    <!--检验科室 -->
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
	<#if orderTypeCd??>
	<!--对应医嘱类型 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/code/order-type-cd">
		<valueCode value="${orderTypeCd}"/>
	</extension>
	</#if>
	 <#if adviceId??>
    <!--对应医嘱号 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/identifier/advice-id">
		<valueString value="${adviceId}"/>
	</extension>	
	</#if>
	<#if examinationType??>
	<!--检验类别代码 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/code/examination-type">
		<valueCode value="${examinationType}" />
	</extension>
	</#if>
	<#if examinationTypeName??>
	<!--检验类别名称 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/text/examination-type-name">
		<valueString value="${examinationTypeName}" />
	</extension>
	</#if>
    <identifier>
        <!-- 原系统检验单id命名空间 -->
        <system
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/examination-order-id" />
        <!-- 原系检验查单id -->
        <value value="${examinationOrderId}" />
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
    
    <#if examinationItemCd??||examinationItemName??||specimensCode??||specimensName??>
    <item>
        <code>
            <coding>
            	 <#if examinationItemCd??>
                <!-- 检验总项目代码命名空间 -->
                <system
                    value="http://www.nestvision.com/platform/app/data/v1/code/examination-item-cd" />
                <!-- 检验总项目代码 -->
                <code value="${examinationItemCd}"/>
                </#if>
                 <#if examinationItemName??>
                <!-- 检验总项目名字 -->
                <display value="${examinationItemName}" />
                </#if>
            </coding>
        </code>
        <#if specimensCode??||specimensName??>
        <bodySite>
            <coding>
           	 <#if specimensCode??>
                <!--标本采集部位代码命名空间 -->
                <system
                    value="http://www.nestvision.com/platform/app/data/v1/code/specimens-code" />
                <!--标本采集部位代码 -->
                <code value="${specimensCode}" />
              </#if>
              <#if specimensName??>
                <!--标本采集部位名称 -->
                <display value="${specimensName}"/>
              </#if>
            </coding>
        </bodySite>
        </#if>
    </item>
    </#if>
</DiagnosticOrder>
