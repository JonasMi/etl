<#ftl output_format="XML">
<!-- 检查报告单 -->
<DiagnosticReport xmlns="http://hl7.org/fhir">
    <!-- 检查结果明细示例 -->
    <contained>
        <Observation>
            <id value="r1" />
            <#if reportEnglish??>
    		 <!-- 报告项目英文描述 -->
            <extension
                url="http://www.nestvision.com/platform/app/data/v1/text/report-english">
                <valueString value="${reportEnglish}" />
            </extension>
    		</#if>
            <#if equipment??>
   			<!-- 检查设备名称 -->
            <extension
                url="http://www.nestvision.com/platform/app/data/v1/text/equipment">
                <valueString value="${equipment}" />
            </extension>
    		</#if>
            <#if findings??>
   			<!-- 检查所见 -->
            <extension
                url="http://www.nestvision.com/platform/app/data/v1/text/findings">
                <valueString value="${findings}" />
            </extension>
    		</#if>
            <#if testResultCd??>
   			<!-- 检查结果代码 -->
            <extension
                url="http://www.nestvision.com/platform/app/data/v1/code/test-result-cd">
                <valueCode value="${testResultCd}" />
            </extension>
    		</#if>
            <#if reportDescription??>
   			 <!-- 检查结果的客观说明 -->
            <extension
                url="http://www.nestvision.com/platform/app/data/v1/text/report-description">
                <valueString value="${reportDescription}" />
            </extension>
    		</#if>
             <#if reportImpression??>
   			 <!-- 检查结果的主观说明 -->
            <extension
                url="http://www.nestvision.com/platform/app/data/v1/text/report-impression">
                <valueString value="${reportImpression}" />
            </extension>
  			  </#if>
            <identifier>
                <!-- 原系统检查报告观察命名空间 -->
                <system
                    value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/inspection-observation-id" />
                <!-- 原系统检查报告观察ID -->
                <value value="${inspectionResultId}" />
            </identifier>
      		<!-- 状态:完成 -->
    		<status/>
            <#if reportItemCode??||reportItemName??>
			<code>
			  <coding>
			  	<!-- 项目代码命名空间 -->
			   	<system value="http://www.nestvision.com/platform/app/data/v1/code/report-id" />
			    <#if reportItemCode??>
			     <!-- 报告项目代码(必填) -->
			     <code value="${reportItemCode}" />
			     </#if>
			     <#if reportItemName??>
			     <display value="${reportItemName}" />
			     </#if>
			  </coding>
			</code>
			</#if>
			  <#if inspectIssued??>
     		<!-- 观察执行时间 -->
           	 <issued value="${inspectIssued?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
    		</#if>
            <#if inspectEmployeeId??>
   			 <performer>
                <!-- 执行医生ID -->
                <reference
                    value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${inspectEmployeeId}" />
            </performer>
    		</#if>
            <#if value??||unit??>
            <valueQuantity>
            	<#if value??>
                <!-- 结果值 -->
                <value value="${value}" />
                </#if>
			    <#if unit??>
			   <!-- 结果单位 -->
                <unit value="${unit}" />
			    </#if>
            </valueQuantity>
  			</#if>
        	<#if method??>
   			<!-- 检查方法 -->
            <method>
                <coding>
                    <display value="${method}" />
                </coding>
            </method>
   			</#if>
		    <#if (lowValue??&&lowUnit??)||(highUnit??&&highValue) >
		    <!-- 参考范围 -->
            <referenceRange>
            	<#if lowValue??&&lowUnit??>
	    		<!-- 正常参考值下限 -->
                <low>
                    <value value="${lowValue}" />
                    <unit value="${lowUnit}" />
                </low>
	    		</#if>
                <#if highUnit??&&highValue??>
                <!-- 正常参考值上限 -->
                <high>
                    <value value="${highValue}" />
                    <unit value="${highUnit}" />
                </high>
                </#if>
                <#if referencerange??>
    			<text value="${referencerange}" />
    			</#if>
            </referenceRange>
		    </#if>
        </Observation>
    </contained>
    <#if abnormal??>
     <!-- 异常标志 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/abnormal">
        <valueCode value="${abnormal}" />
    </extension>
    </#if>
    <#if reportNo??>
    <!-- 序号 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/report-no">
        <valueString value="${reportNo}" />
    </extension>
    </#if>
    <#if auditId??>
    <!-- 报告审核者ID -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifier/audit-id">
        <valueReference>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${auditId}" />
        </valueReference>
    </extension>
    </#if>
    <#if auditDate??>
    <!-- 报告审核时间 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/date/audit-date">
        <valueDateTime value="${auditDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
    </extension>
    </#if>
    <#if effectiveDtime??>
    <!-- 文档创建时间 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/datetime/effective-dtime">
        <valueDateTime value="${effectiveDtime?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
    </extension>
    </#if>
    <#if confidentiality??>
     <!-- 保密级别 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/confidentiality">
        <valueCode value="${confidentiality}" />
    </extension>
    </#if>
   <#if recognitionCd??>
   <!-- 可互认标志 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/boolean/recognition-cd">
        <valueBoolean value="${recognitionCd?then("true","false")}" />
    </extension>
   </#if>
    <#if reportRemark??>
    <!-- 报告备注 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/report-remark">
        <valueString value="${reportRemark}" />
    </extension>
    </#if>
    <#if printTime??>
     <!-- 打印时间 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/datetime/print-time">
        <valueDateTime value="${printTime?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
    </extension>
    </#if>
    <identifier>
        <!-- 原系统检查报告命名空间 -->
        <system
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/inspection-result-id" />
        <!-- 原系统检查报告ID -->
        <value value="${inspectionResultId}" />
    </identifier>
    <#if status??>
      <!-- 状态:完成 -->
    <status value="${status}" />
    </#if>
    <#if reportItemCode??||reportItemName??>
    <code>
   	 <coding>
    	<!-- 项目代码命名空间 -->
    		<system
        		value="http://www.nestvision.com/platform/app/data/v1/code/report-item-code" />
            <#if reportItemCode??>
            <!-- 报告项目代码(必填) -->
            <code value="${reportItemCode}" />
            </#if>
          	<#if reportItemName??>
            <display value="${reportItemName}" />
            </#if>
     </coding>
    </code>
    </#if>
    <subject>
        <!-- 患者ID -->
        <reference
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/patient-id|${patientId}" />
            <!-- 患者姓名 -->
        <display value="${patientName}"/>
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
    <!-- 标本采集时间 -->
    <effectiveDateTime <#if effectivedatetime??>value="${effectivedatetime?string('yyyy-MM-dd\'T\'HH:mm:ss')}"</#if> />
    <#if issued??>
     <!-- 报告时间 -->
    <issued value="${issued?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
    </#if>
   <#if performerEmployeeId??>
   	<performer>
        <!-- 执行报告的医生 -->
        <reference
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${performerEmployeeId}" />
    </performer>
   </#if>
    <!-- 检查申请单ID -->
    <request>
        <reference
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/inspection-order-id|${inspectionOrderId}" />
    </request>
    <!-- 检查结果明细 -->
    <result>
        <reference value="#r1" />
    </result>
     <#if conclusion??>
     <!-- 报告结论 -->
    <conclusion value="${conclusion}" />
    </#if>
</DiagnosticReport>
