<#ftl output_format="XML">
<Bundle xmlns="http://hl7.org/fhir">
	<!-- bundle业务类型：健康档案（必填） -->
	<meta>
		<tag>
			<system value="http://www.nestvision.com/platform/app/data/v1/code/bundle-business-type"/>
			<code value="04"/>
		</tag>
	</meta>
	<type value="document" />
	<entry>
		<fullUrl
			value="http://fhir.healthintersections.com.au/open/Composition/180f219f-97a8-486d-99d9-ed631fe4fc57" />
		<resource>
			<!-- 资源：诊断证明 -->
			<Composition xmlns="http://hl7.org/fhir">
				<contained>
					<Organization xmlns="http://hl7.org/fhir">
						<id value="hos1" />
						<identifier>
							<!-- 原系统机构ID号命名空间 -->
							<system
								value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/hospital-id" />
							<!-- 原系统机构ID号 -->
							<value value="${upHospital}" />
						</identifier>
						<!-- 医院名称 -->
						<name value="${upHospitalName}" />
					</Organization>
				</contained>
				<contained>
					<Patient xmlns="http://hl7.org/fhir">
						<id value="pat1" />
						<#if age??>
						<!-- 年龄 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/number/age">
							<valueDecimal value="23" />
						</extension>
						</#if>
						<#if patientId??>
						<identifier>
							<!-- 院内患者ID命名空间 -->
							<system
								value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/patient-id" />
							<!-- 院内患者ID -->
							<value value="${patientId}" />
						</identifier>
						</#if>
						<#if idCard??>
						<identifier>
							<!-- 身份证号命名空间 -->
							<system value="urn:oid:2.16.156.10011.1.3" />
							<!-- 身份证号 -->
							<value value="${idCard}" />
						</identifier>
						</#if>
						<#if name??>
						<name>
							<!-- 姓名 -->
							<text value="${name}" />
						</name>
						</#if>
						<#if gender??>
						<!-- 性别 -->
						<gender value="${gender}" />
						</#if>
						<#if birthdate??>
						<!-- 出生日期 -->
						<birthDate value="${birthdate}" />
						</#if>
					</Patient>
				</contained>
				<!-- 住院信息 -->
				<contained>
					<Encounter xmlns="http://hl7.org/fhir">
						<id value="e1" />
						<contained>
							<Organization xmlns="http://hl7.org/fhir">
								<id value="e1o1" />
								<#if visitingDeptId??>
								<identifier>
									<!-- 院内科室ID号命名空间 -->
									<system
										value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/department-id" />
									<!-- 院内科室ID号 -->
									<value value="${visitingDeptId}" />
								</identifier>
								</#if>
								<#if visitingDeptName??>
								<!-- 住院科室名称 -->
								<name value="${visitingDeptName}" />
								</#if>
							</Organization>
						</contained>
						<#if inpatDays??>
						<!--住院天数 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/number/inpatient-days">
							<valueDecimal value="${inpatDays}" />
						</extension>
						</#if>
						<#if inhId??>
						<identifier>
							<system value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/inpatient-registration-id" />
							<!-- 原系统住院流水id号 -->
							<value value="${inpatientRegistrationId}" />
						</identifier>
						</#if>
						<!-- 状态 -->
						<status value="in-progress" />
						<!-- 类型：住院 -->
						<class value="inpatient" />
						<period>
							<#if start??>
							<!-- 入院时间 -->
							<start value="${start}" />
							</#if>
							<#if end??>
							<!-- 出院时间 -->
							<end value="${end}" />
							</#if>
						</period>
						<#if inhId??>
						<hospitalization>
							<preAdmissionIdentifier>
								<!-- 住院号命名空间 -->
								<system value="http://www.nestvision.com/platform/app/data/v1/text/inh-id" />
								<!-- 住院号 -->
								<value value="${inhId}" />
							</preAdmissionIdentifier>
						</hospitalization>
						</#if>
						<!-- 当前科室 -->
						<serviceProvider>
							<reference
								value="#e1o1" />
						</serviceProvider>
					</Encounter>
				</contained>
				<#if treatRescueCourse??>
				<!-- 治疗过程描述 -->
				<extension url="http://www.nestvision.com/platform/app/data/v1/text/treat-rescue-course">
					<valueString value="${treatRescueCourse}" />
				</extension>
				</#if>
				<#if outMainDiagnosisName??>
				<!-- 出院主要诊断名称 -->
				<extension
					url="http://www.nestvision.com/platform/app/data/v1/text/out-main-diagnosis-name">
					<valueString value="${outMainDiagnosisName}" />
				</extension>
				</#if>
				<#if outAccompanyDiagnosisName??>
				<!-- 出院伴随诊断名称 -->
				<extension
					url="http://www.nestvision.com/platform/app/data/v1/text/out-accompany-diagnosis-name">
					<valueString value="${outAccompanyDiagnosisName}" />
				</extension>
				</#if>
				<#if dischargeAdviceMedicine??>
				<!-- 出院建议及带药 -->
				<extension
					url="http://www.nestvision.com/platform/app/data/v1/text/discharge-advice-medicine">
					<valueString value="${dischargeAdviceMedicine}" />
				</extension>
				</#if>
				<#if physician??>
				<!-- 医师签名 -->
				<extension
					url="http://www.nestvision.com/platform/app/data/v1/text/physician">
					<valueString value="${physician}" />
				</extension>
				</#if>
				<#if diagnosisProveId??>
				<!-- 诊断证明id -->
				<identifier>
					<system
						value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/diagnosis-prove-id" />
					<value value="${diagnosisProveId}" />
				</identifier>
				</#if>
				<#if recordDate??>
				<!-- 记录日期 -->
				<date value="${recordDate}" />
				</#if>
				<!-- 文档类型：诊断证明 -->
				<type>
					<!-- 文档类型-->
					<coding>
						<!-- 文档类型-->
						<system value="2.16.156.10011.2.4" />
						<!-- 文档类型-->
						<code value="99999-102" />
					</coding>
					<!-- 文档类型-->
					<text value="diagnosis prove" />
				</type>
				<!-- 文档标题：诊断证明 -->
				<title value="诊断证明" />
				<!-- 状态：preliminary初步 final最终amended修订entered-in-error错误 -->
				<status value="final" />
				<!-- 保密等级：U:不受限制的 L:低等级 M:中等 N:常规 R:保密的 V:十分机密的 -->
				<confidentiality value="N" />
				<!-- 居民信息 -->
				<subject>
					<reference value="#pat1" />
				</subject>
				<author />
				<!-- 上传机构 -->
				<custodian>
					<reference value="#hos1" />
				</custodian>
				<!-- 住院信息 -->
				<encounter>
					<reference value="#e1" />
				</encounter>
			</Composition>
		</resource>
	</entry>
</Bundle>