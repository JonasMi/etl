<#ftl output_format="XML">
<!-- 长期医嘱示例 -->
<MedicationOrder xmlns="http://hl7.org/fhir">
	<#if feeCode??>
    <!-- 医疗付费方式代码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/fee-code">
        <valueCode value="${feeCode}" />
    </extension>
	</#if>
    <!-- 医嘱类型代码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/order-type-code">
        <valueCode value="${orderTypeCode}" />
    </extension>
    <#if stMark??>
    <!-- 是否需要皮试 -->
    <extension
       url="http://www.nestvision.com/platform/app/data/v1/boolean/st-mark">
       <valueBoolean value="${stMark?then("true","false")}" />
    </extension>
	</#if>
	<#if skintestType??>
    <!-- 皮试类型标志:1 皮试 2 免试 3 空 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/skintest-type">
        <valueCode value="${skintestType}" />
    </extension>  
	</#if>
    <#if skintestResult??>
    <!-- 皮试结果 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/skintest-result">
        <valueString value="${skintestResult}" />
    </extension> 
	</#if>
    <#if skintestNurid??>
    <!-- 皮试护士 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifier/skintest-nurid">
        <valueReference>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${skintestNurid}" />
        </valueReference>
    </extension> 
	</#if>
    <#if skintestSenurid??>
    <!-- 第二皮试护士 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifier/skintest-senurid">
        <valueReference>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${skintestSenurid}" />
        </valueReference>
    </extension>
	</#if>
    <#if orderDpid??>
    <!-- 开立科室 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifier/order-dpid">
        <valueReference>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id|${orderDpid}" />
        </valueReference>
    </extension>
	</#if>
    <#if checkDate??>
    <!-- 校对时间 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/datetime/check-date">
        <valueDateTime value="${checkDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
    </extension>	 
	</#if>
	<#if checkNurid??>
    <!-- 校对护士 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifier/check-nurid">
        <valueReference>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${checkNurid}" />
        </valueReference>
    </extension>
	</#if>
    <#if orderAuditorDate??>
    <!-- 审核时间 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/datetime/order-auditor-date">
        <valueDateTime value="${orderAuditorDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
    </extension>	 
	</#if>
    <#if orderAuditor??>
    <!-- 审核人 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifier/order-auditor">
        <valueReference>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${orderAuditor}" />
        </valueReference>
    </extension> 
	</#if>
    <#if orderCheckTime??>
    <!-- 医嘱核对日期时间 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/datetime/order-check-time">
        <valueDateTime value="${orderCheckTime?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
    </extension>	 
	</#if>
    <#if performTime??>
    <!-- 执行时间 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/datetime/perform-time">
        <valueDateTime value="${performTime?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
    </extension> 	 
	</#if>
    <#if performDeptCd??>
    <!-- 执行科室 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifier/perform-dept-cd">
        <valueReference>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id|${performDeptCd}" />
        </valueReference>
    </extension> 
	</#if>
    <#if performerCd??>
    <!-- 执行医生 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifier/performer-cd">
        <valueReference>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${performerCd}" />
        </valueReference>
    </extension> 
	</#if>
    <#if stopDoctorid??>
    <!-- 停止医生 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifier/stop-doctorid">
        <valueReference>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${stopDoctorid}" />
        </valueReference>
    </extension>
	</#if>
	<#if orderStopNurseCd??>
     <!-- 停止护士 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifier/order-stop-nurse_cd">
        <valueReference>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${orderStopNurseCd}" />
        </valueReference>
    </extension> 
	</#if>
    <#if itemSpec??>
    <!-- 项目规格 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/item-spec">
        <valueString value="${itemSpec}" />
    </extension>
	</#if>
    <#if freqCode??>
    <!-- 医嘱频率代码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/freq-code">
        <valueCode value="${freqCode}" />
    </extension>
	</#if>
    <#if itemNumber??>
    <!-- 数量 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/item-number">
        <valueInteger value="${itemNumber?string('#')}" />
    </extension>
	</#if>
    <#if itemUnit??>
    <!-- 项目单位 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/item-unit">
        <valueString value="${itemUnit}" />
    </extension> 
	</#if>
    <#if itemAmount??>
    <!-- 金额 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/item-amount">
        <valueDecimal value="${itemAmount}" />
    </extension>  
	</#if>
	<#if itemPrice??>
    <!-- 单价 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/item-price">
        <valueDecimal value="${itemPrice}" />
    </extension>  
	</#if>
	<#if dispensingDtime??>
     <!-- 发药时间 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/datetime/dispensing-dtime">
        <valueDateTime value="${dispensingDtime?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
    </extension>	 
	</#if>
  	<#if groupNo??>
     <!-- 成组号（0-无分组） -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/group-no">
        <valueString value="${groupNo}" />
	</extension>
	</#if>
	<#if drugTotalDose??>
     <!-- 药物使用总剂量 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/drug-total-dose">
        <valueDecimal value="${drugTotalDose}" />
    </extension> 
	</#if>
	<#if drugTotalDoseUtil??>
    <!-- 药物使用总剂量单位 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/drug-total-dose-util">
        <valueString value="${drugTotalDoseUtil}" />
    </extension>
	</#if>
    <#if orderPlanStDate??>
    <!-- 医嘱计划开始日期时间 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/datetime/order-plan-st-date">
        <valueDateTime value="${orderPlanStDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
    </extension>	 
	</#if>
    <#if orderPlanEndDate??>
    <!-- 医嘱计划结束日期时间 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/datetime/order-plan-end-date">
        <valueDateTime value="${orderPlanEndDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
    </extension> 	 
	</#if>
	<#if crucialDrugName??>
    <!-- 关键药物名称 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/text/crucial-drug-name">
	   <valueString value="${crucialDrugName}" />
	</extension>  
	</#if>
   	<#if crucialDrugUsage??>
	<!-- 关键药物用法 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/text/crucial-drug-usage">
		<valueString value="${crucialDrugUsage}" />
	</extension>      
	</#if>
	<#if orderTypeCode=='01'>
	<#assign adviceItem='code/medication'>
	<#else>
	<#assign adviceItem='identifier/item-code'>
	</#if>
	<#if prescriptionItemCode??>
    <!--医嘱项目（引用收费项目或药品信息） -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifier/prescription-item-code">
        <valueReference>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/${adviceItem}|${prescriptionItemCode}" />
        </valueReference>
    </extension> 
	</#if>
    <identifier>
        <!-- 原系统长期医嘱id命名空间 -->
        <system
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/longterm-advice-id" />
        <!-- 原系统长期医嘱id：住院流水号+"_"+医嘱序号+"_"+医嘱子序号 -->
        <value value="${inpatientRegistrationId}_${adviceSequence}_${adviceSubSequence}" />
    </identifier>
    <#if status??>
     <!-- 状态：完成的 -->
    <status value="${status}" />
	</#if>
	<medicationReference/>
    <patient>
        <!-- 院内患者ID -->
        <reference
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/patient-id|${patientId}" />
         <#-- 患者姓名是否需要 -->
        <!-- 患者姓名 -->
        <display value="${patientName}" />
    </patient>
    <encounter>
        <!-- 住院信息ID -->
        <reference
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/inpatient-registration-id|${inpatientRegistrationId}" />
    </encounter>
    <#if datewritten??>
     <!-- 开立时间 -->
    <dateWritten value="${datewritten?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />	 
	</#if>
   	<#if prescriber??>
     <prescriber>
        <!-- 开立医生ID -->
        <reference
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${prescriber}" />
    </prescriber>
	</#if>
   	<#if dateended??>
	<!-- 停止操作时间 -->
    <dateEnded value="${dateended?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
	</#if>
    <#if note??>
    <note>
        <!-- 备注 -->
        <text value="${note}" />
    </note> 
	</#if>
	<#if text??||(start??||end??||duration??)||dosageCode??||cMedCode??||(onceValue??||onceUnit??)>
    <dosageInstruction>
     	<#if text??>
     	<!-- 医嘱正文 -->
        <text value="${text}" />
		</#if>
		<#if start??||end??||duration??>
        <timing>
            <repeat>
            	<#if start??||end??>
                <boundsPeriod>
                	<#if start??>
     	 			<!-- 医嘱开始时间 -->
                    <start value="${start?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</#if>
					<#if end??>
     				<!-- 用药停止日期时间 -->
                    <end value=" ${end?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</#if>
                </boundsPeriod>
                </#if>
                <#if duration??>
      			<!-- 执行天数 -->
                <duration value="${duration}" />
                <durationUnit value="d" />
				</#if>
            </repeat>
        </timing>
        </#if>
        <#if dosageCode??>
      	<route>
            <coding>
                <!-- 用药途径代码命名空间 -->
                <system
                    value="http://www.nestvision.com/platform/app/data/v1/code/dosage-code" />
                <!-- 用药途径代码：口服 -->
                <code value="${dosageCode}" />
            </coding>
        </route>
		</#if>
		<#if cMedCode??>
      	<method>
            <coding>
                <!-- 特殊用法代码命名空间 -->
                <system
                    value="http://www.nestvision.com/platform/app/data/v1/code/c-med-code" />
                <!-- 特殊用法代码 -->
                <code value="${cMedCode}" />
            </coding>
        </method>
		</#if>
		<#if onceValue??||onceUnit??>
        <doseQuantity>
        	<#if onceValue??>
       		<!-- 用药剂量 -->
            <value value="${onceValue}" />
			</#if>
			<#if onceUnit??>
      		<!-- 用药剂量单位 -->
            <unit value="${onceUnit}" />
			</#if>
        </doseQuantity>
        </#if>
    </dosageInstruction>
    </#if>
</MedicationOrder>
