<#ftl output_format="XML">
<!-- 门诊处方明细示例 -->
<MedicationOrder xmlns="http://hl7.org/fhir">
   <!-- 医嘱类型代码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/order-type-code">
        <valueCode value="1" />
    </extension>
	<!-- 皮试标志 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/code/skintest-type">
		<valueCode value="0" />
	</extension>
	<!-- 皮试结果 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/text/skintest-result">
		<valueString value="正常" />
	</extension>
	<!-- 皮试护士 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/identifier/skintest-nurid">
		<valueReference>
			<reference
				value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/employee-id|116" />
		</valueReference>
	</extension>
	<!-- 第二皮试护士 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/identifier/skintest-senurid">
		<valueReference>
			<reference
				value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/employee-id|116" />
		</valueReference>
	</extension>
	<!-- 开立科室 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/identifier/order-dpid">
		<valueReference>
			<reference
				value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/department-id|121" />
		</valueReference>
	</extension>
	<!-- 处方类型代码 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/code/recipe-type-code">
		<valueCode value="1" />
	</extension>
	<!-- 申请单号 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/text/apply-id">
		<valueString value="20121512" />
	</extension>
	<!-- 中药剂数 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/c-med-num">
		<valueInteger value="10" />
	</extension>
	<!-- 序号 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/text/recipe-no">
		<valueString value="012" />
	</extension>
	<!-- 处方药品组号 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/text/prec-drug-no">
		<valueString value="012" />
	</extension>
	<!-- 项目规格 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/text/item-spec">
		<valueString value="100g/瓶" />
	</extension>
	<!-- 频率代码 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/code/freq-code">
		<valueCode value="1" />
	</extension>
	<!-- 数量 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/item-number">
		<valueInteger value="10" />
	</extension>
	<!-- 项目单位 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/text/item-unit">
		<valueString value="瓶" />
	</extension>
	<!-- 金额 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/item-amount">
		<valueDecimal value="120" />
	</extension>
	<!-- 单价 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/item-price">
		<valueDecimal value="10" />
	</extension>
	<!-- 发药时间 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/datetime/dispensing-dtime">
		<valueDateTime value="2015-01-02T10:02:03" />
	</extension>
	<!-- 中药处方 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/text/cn-prescribe">
		<valueString value="中药饮片处方的详细描述" />
	</extension>
	<!-- 中药煎煮法 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/text/cn-prescribe-descr">
		<valueString value="中药饮片煎煮方法描述" />
	</extension>
	<!-- 中药服用方法代码 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/code/cn-drug-way-cd">
		<valueCode value="01" />
	</extension>
	<!-- 中药剂型:1:饮片2:颗粒 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/code/cn-type-cd">
		<valueCode value="1" />
	</extension>
	<!-- 成组号（0-无分组） -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/text/group-no">
		<valueString value="患者用药时，某些药物是一组,药物搭配用" />
	</extension>
	<!-- 药物使用总剂量 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/drug-total-dose">
		<valueDecimal value="100" />
	</extension>
	<!-- 药物使用总剂量单位 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/text/drug-total-dose-util">
		<valueString value="毫升" />
	</extension>
	<!-- 处方项目（引用收费项目或药品信息） -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/identifier/prescription-item-code">
		<valueReference>
			<reference
				value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/item-code|116" />
		</valueReference>
	</extension>
	<!-- 是否代办 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/boolean/if-agency">
		<valueBoolean value="true" />
	</extension>
	<!-- 是否打印 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/boolean/if-print">
		<valueBoolean value="true" />
	</extension>
	<!-- 是否收费 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/boolean/if-change">
		<valueBoolean value="true" />
	</extension>
	<!-- 门诊收费单号 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/identifier/ch-id">
		<valueReference>
			<reference
				value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/outpatient-charges-id|110" />
		</valueReference>
	</extension>
	<!-- 代办人关系代码 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/code/agency-rel-code">
		<valueCode value="01" />
	</extension>
	<!-- 代办人身份证号 -->
	<extension url="urn:oid:2.16.156.10011.1.3">
		<valueString value="513901199102135413" />
	</extension>
	<!-- 调配者ID -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/identifier/allocate-psid">
		<valueReference>
			<reference
				value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/employee-id|116" />
		</valueReference>
	</extension>
	<!-- 发药者ID -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/identifier/drug-psid">
		<valueReference>
			<reference
				value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/employee-id|116" />
		</valueReference>
	</extension>
	<!-- 审核药剂师ID -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/identifier/prec-audit-psid">
		<valueReference>
			<reference
				value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/employee-id|116" />
		</valueReference>
	</extension>
	<!-- 核对药剂师ID -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/identifier/prec-check-psid">
		<valueReference>
			<reference
				value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/employee-id|116" />
		</valueReference>
	</extension>
	<!-- 执行科室ID -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/identifier/perform-dept">
		<valueReference>
			<reference
				value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/department-id|121" />
		</valueReference>
	</extension>
	<!-- 执行人ID -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/identifier/prec-perform">
		<valueReference>
			<reference
				value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/employee-id|116" />
		</valueReference>
	</extension>
	<!-- 处方总金额 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/total-amount">
		<valueDecimal value="1120" />
	</extension>
	<identifier>
		<!-- 原系统门诊处方id命名空间 -->
		<system
			value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/outpatient-prescription-id" />
		<!-- 原系统门诊处方id : 处方号+”_”+序号 -->
		<value value="1001000_001" />
	</identifier>
	<status value="completed" />
	<medicationCodeableConcept/>
	<patient>
		<!-- 院内患者ID -->
		<reference
			value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/patient-id|101" />
		<!-- 患者姓名 -->
		<display value="张二娃" />
	</patient>
	<!-- 状态：完成的 -->
	<encounter>
		<!-- 门诊信息ID -->
		<reference
			value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/outpatient-registration-id|140" />
	</encounter>
	<!-- 开立时间 -->
	<dateWritten value="2015-03-01T01:01:02" />
	<prescriber>
		<!-- 开立医生ID -->
		<reference
			value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/employee-id|116" />
	</prescriber>
	<!-- 停止时间 -->
	<dateEnded value="2015-05-01T02:03:04" />
	<note>
		<!-- 备注 -->
		<text value="不要吃辛辣食物" />
	</note>
	<dosageInstruction>
		<!-- 用法用量指导 -->
		<text value="饭后半小时喝，2次/天" />
		<timing>
			<repeat>
				<boundsPeriod>
					<!-- 医嘱开始时间 -->
					<start value="2015-03-01T12:12:01" />
				</boundsPeriod>
				<!-- 执行天数 -->
				<duration value="3" />
				<durationUnit value="d" />
			</repeat>
		</timing>
		<route>
			<coding>
				<!-- 用药途径代码命名空间 -->
				<system
					value="http://www.nestvision.com/platform/app/data/v1/code/dosage-code" />
				<!-- 用药途径代码：口服 -->
				<code value="1" />
			</coding>
		</route>
		<method>
			<coding>
				<!-- 特殊用法代码命名空间 -->
				<system
					value="http://www.nestvision.com/platform/app/data/v1/code/c-med-code" />
				<!-- 特殊用法代码 -->
				<code value="2" />
			</coding>
		</method>
		<doseQuantity>
			<!-- 用药次剂量 -->
			<value value="2" />
			<!-- 用药次剂量单位 -->
			<unit value="瓶" />
		</doseQuantity>
	</dosageInstruction>
</MedicationOrder>