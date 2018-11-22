<#ftl output_format="XML">
<!-- 检验报告单 -->
<DiagnosticReport xmlns="http://hl7.org/fhir">
	<#list examineReportDetails as detail>
	<!-- 检验结果明细示例 -->
	<contained>
		<Observation>
			<id value="${detail.observationId}" />
			<#if detail.reportEnglish??>
    		 <!-- 报告项目英文描述 -->
            <extension
                url="http://www.nestvision.com/platform/app/data/v1/text/report-english">
                <valueString value="${detail.reportEnglish}" />
            </extension>
    		</#if>
			 <#if detail.equipment??>
   			<!-- 检查设备名称 -->
            <extension
                url="http://www.nestvision.com/platform/app/data/v1/text/equipment">
                <valueString value="${detail.equipment}" />
            </extension>
    		</#if>
            <#if detail.findings??>
   			<!-- 检查所见 -->
            <extension
                url="http://www.nestvision.com/platform/app/data/v1/text/findings">
                <valueString value="${detail.findings}" />
            </extension>
    		</#if>
    		<#if detail.tip??>
			<!-- 提示 -->
			<extension url="http://www.nestvision.com/platform/app/data/v1/text/tip">
				<valueString value="${detail.tip}" />
			</extension>
			</#if>
			<#if detail.normValueNotes??>
			<!-- 参考值备注 -->
			<extension
				url="http://www.nestvision.com/platform/app/data/v1/text/norm-value-notes">
				<valueString value="${detail.normValueNotes}" />
			</extension>
			</#if>
			<#if detail.resultInterpre??>
			<!-- 结果值的解释 -->
			<extension
				url="http://www.nestvision.com/platform/app/data/v1/text/result-interpre">
				<valueString value="${detail.resultInterpre}" />
			</extension>
			</#if>
			<#if detail.testResultCd??>
   			<!-- 检验结果代码 -->
            <extension
                url="http://www.nestvision.com/platform/app/data/v1/code/test-result-cd">
                <valueCode value="${detail.testResultCd}" />
            </extension>
    		</#if>
    		<#if detail.testTypeCd??>
			<!-- 结果类型代码 -->
			<extension
				url="http://www.nestvision.com/platform/app/data/v1/code/test-type-cd">
				<valueCode value="${detail.testTypeCd}" />
			</extension>
			</#if>
			 <#if detail.reportDescription??>
   			 <!-- 检查结果的客观说明 -->
            <extension
                url="http://www.nestvision.com/platform/app/data/v1/text/report-description">
                <valueString value="${detail.reportDescription}" />
            </extension>
    		</#if>
             <#if detail.reportImpression??>
   			 <!-- 检查结果的主观说明 -->
            <extension
                url="http://www.nestvision.com/platform/app/data/v1/text/report-impression">
                <valueString value="${detail.reportImpression}" />
            </extension>
  			 </#if>
  			 <#if detail.testDate??>
			<!-- 检验日期 -->
			<extension
				url="http://www.nestvision.com/platform/app/data/v1/datetime/test-date">
				<valueDateTime value="${detail.testDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
			</extension>
			 </#if>
			<identifier>
				<!-- 原系统检验报告观察命名空间 -->
				<system
					value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/examination-observation-id" />
				<!-- 原系统检验报告观察ID -->
				<value value="${detail.examinationResultId}_${detail.observationId}" />
			</identifier>
			<!-- 本项目的检验状态:完成观察 -->
			<status <#if detail.status??>value="${detail.status}" </#if>/>
			<code>
				<coding>
					<!-- 报告项目代码命名空间 -->
					<system
						value="http://www.nestvision.com/platform/app/data/v1/code/report-id" />
					<!-- 报告项目代码(必填) -->
					<code value="${detail.reportItemCode}" />
					<display value="${detail.reportItemName}" />		
				</coding>
			</code>
			<#if detail.issued??>
			<!-- 观察执行时间 -->
			<issued value="${detail.issued?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
			</#if>
			<#if detail.performerEmployeeId??>
			<performer>
				<!-- 执行医生ID -->
				<reference
					value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${detail.performerEmployeeId}" />
			</performer>
			</#if>
			<#if detail.value??||detail.unit??>
            <valueQuantity>
            	<#if detail.value??>
                <!-- 结果值 -->
                <value value="${detail.value}" />
                </#if>
			    <#if detail.unit??>
			   <!-- 结果单位 -->
                <unit value=" ${detail.unit}" />
			    </#if>
            </valueQuantity>
  			</#if>
        	<#if detail.method??>
   			<!-- 检查方法 -->
            <method>
                <coding>
                    <display value="${detail.method}" />
                </coding>
            </method>
   			</#if>
			<#if (detail.lowValue??&&detail.lowUnit??)||(detail.highUnit??&&detail.highValue) >
		    <!-- 参考范围 -->
            <referenceRange>
            	<#if detail.lowValue??&&detail.lowUnit??>
	    		<!-- 正常参考值下限 -->
                <low>
                    <value value="${detail.lowValue}" />
                    <unit value="${detail.lowUnit}" />
                </low>
	    		</#if>
                <#if detail.highUnit??&&detail.highValue??>
                <!-- 正常参考值上限 -->
                <high>
                    <value value="${detail.highValue}" />
                    <unit value="${detail.highUnit}" />
                </high>
                </#if>
                <#if detail.referencerange??>
    			<text value="${detail.referencerange}" />
    			</#if>
            </referenceRange>
		    </#if>
		</Observation>
	</contained>
	</#list>
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
	<!-- 报告科室ID -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/identifier/report-dpid">
		<valueReference>
			<reference
				value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id|${reportDpid}" />
		</valueReference>
	</extension>
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
   <#if barcodeNo??>
      <!-- 条形码 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/text/barcode-no">
		<valueString value="${barcodeNo}" />
	</extension>
	</#if>
	<#if printTime??>
     <!-- 打印时间 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/datetime/print-time">
        <valueDateTime value="${printTime?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
    </extension>
    </#if>
    <#if printOperator??>
      <!-- 打印人 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/text/print-operator">
		<valueString value="${printOperator}" />
	</extension>
	</#if>
	<identifier>
		<!-- 原系统检验报告命名空间 -->
		<system
			value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/examination-result-id" />
		<!-- 原系统检验报告ID -->
		<value value="${examinationResultId}" />
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
	<!-- 检验申请单ID -->
	<request>
		<reference
			value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/examination-order-id|${examinationOrderId}" />
	</request>
	<#list examineSpecimens as specimen>
	<!-- 检验标本记录信息 -->
	<specimen>
		<reference
			value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/specimen-id|${specimen.specimenId}" />
	</specimen>
	</#list>
	<#list examineReportDetails as detail>
	<!-- 检验结果明细 -->
	<result>
		<reference value="${'#'+detail.observationId}" />
	</result>
	</#list>
	<#list examineMedias as media>
	<!-- 媒体信息 -->
	<image>
	  <link>
		<reference
			value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/media-id|${media.mediaId}" />
	  </link>
	</image>
	</#list>
	 <#if conclusion??>
     <!-- 报告结论 -->
    <conclusion value="${conclusion}" />
    </#if>
</DiagnosticReport>
