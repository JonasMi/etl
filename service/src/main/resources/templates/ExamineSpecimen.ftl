<#ftl output_format="XML">
<!-- 检验标本记录请求样例 -->
<Specimen xmlns="http://hl7.org/fhir">
	<!-- 标本编号 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/string/sample-no">
		<valueString value="${sampleNo}" />
	</extension>
	<!-- 标本名称 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/string/specimen-name">
		<valueString value="${specimenName}" />
	</extension>
	<#if specimenClass??>
	<!-- 标本类型 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/string/specimen-class">
		<valueString value="${specimenClass}" />
	</extension>
	</#if>
	<#if sampleCollectorCode??>
	<!-- 标本核收者医生id -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/identifier/sample-collector-code">
		<valueReference>
			<reference
				value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${sampleCollectorCode}" />
		</valueReference>
	</extension>
	</#if>
	<#if specimenRiskCd??>
	<!-- 标本危险程度代码CV9900317 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/code/specimen-risk-cd">
		<valueCode value="${specimenRiskCd}" />
	</extension>
	</#if>
	<#if specimenQuantityCd??>
	<!-- 标本质量代码CV9900318 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/code/specimen-quantity-cd">
		<valueCode value="${specimenQuantityCd}" />
	</extension>
	</#if>
	<#if specimenRejectreasonCd??>
	<!-- 标本拒绝原因代码CV9900319 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/code/specimen-rejectreason-cd">
		<valueCode value="${specimenRejectreasonCd}" />
	</extension>
	</#if>
	<!-- 原系统标本id -->
	<identifier>
		<system
			value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/specimen-id" />
		<value value="${specimenId}" />
	</identifier>
	<#if status??>
	<!-- 状态available可利用unavailable不可利用unsatisfactory不符合要求entered-in-error错误 -->
	<status value="${status}" />
	</#if>
	<#if sampleTypeCd??>
	<!-- 标本类型CV519701 -->
	<type>
	 <coding>
		<system
			value="http://www.nestvision.com/platform/app/data/v1/code/sample-type-cd" />
		<code value="${sampleTypeCd}" />
	 </coding>
	</type>
	</#if>
	<!-- 患者信息 -->
	<subject>
		<reference
			value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/patient-id|${patientId}" />
		<!-- 患者姓名 -->
        <display value="${patientName}"/>
	</subject>
	<#if receivedtime??>
	<!-- 接收标本日期 -->
	<receivedTime value="${receivedtime?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
	</#if>
	<#if collector??>
	<collection>
		<#if collector??||collectedTime??||value??||unit??||specimenDeterminerCd??>
		<!-- 标本采样者 -->
		<collector>
			<reference
				value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${collector}" />
		</collector>
		</#if>
		<#if collectedTime??>
		<!-- 采集标本时间 -->
		<collectedPeriod>
			<start value="${collectedTime?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
		</collectedPeriod>
		</#if>
		<#if value??||unit??>
		<quantity>
			<!-- 采集标本值 -->
			<value value="${value}" />
			<!-- 采集标本单位 -->
			<unit value="${unit}" />
		</quantity>
		</#if>
		<#if specimenDeterminerCd??>
		<!-- 标本采集部位代码CV9900316 -->
		<bodySite>
			<coding>
				<system
					value="http://www.nestvision.com/platform/app/data/v1/code/specimen-determiner-cd" />
				<code value="${specimenDeterminerCd}" />
			</coding>
		</bodySite>
		</#if>
	</collection>
	</#if>
</Specimen>
