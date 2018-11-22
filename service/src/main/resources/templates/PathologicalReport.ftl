<#ftl output_format="XML">
<Bundle xmlns="http://hl7.org/fhir">
	<meta>
		<tag>
			<system value="http://www.nestvision.com/platform/app/data/v1/code/bundle-business-type"/>
			<code value="04"/>
		</tag>
	</meta>
	<type value="document" />
	<entry>
		<fullUrl value="http://fhir.healthintersections.com.au/open/Composition/180f219f-97a8-486d-99d9-ed631fe4fc57" />
		<resource>
			<!-- 资源：病理报告 -->
			<Composition xmlns="http://hl7.org/fhir">
				<contained>
					<Organization xmlns="http://hl7.org/fhir">
						<id value="hos1" />
						<identifier>
							<!-- 原系统机构ID号命名空间 -->
							<system
								value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/hospital-id" />
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
							<valueDecimal value="${age}" />
						</extension>
						</#if>
						<#if patientId??>
						<identifier>
							<!-- 院内患者ID命名空间 -->
							<system
								value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/patient-id" />
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
				<!-- 门诊或住院信息 -->
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
										value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id" />
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
						<#if inpatientRegistrationId??>
						<identifier>
							<!-- 门诊和住院的命名空间不一样 -->
							<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/inpatient-registration-id" />
							<!-- 原系统门诊或住院流水id号 -->
							<value value="${inpatientRegistrationId}" />
						</identifier>
						</#if>
						<!-- 状态 -->
						<status value="in-progress" />
						<#if visitMark=='2'>
						<!-- 类型：住院inpatient  门诊outpatient -->
                        <!-- 类型：住院 -->
                        <class value="inpatient" />
                        <#else>
                        <!-- 类型：门诊 -->
                        <class value="outpatient" />
                        </#if>
						<#if visitMark=='2'>
                        <hospitalization>
                            <preAdmissionIdentifier>
                                <!-- 住院号命名空间 -->
                                <system value="http://www.nestvision.com/platform/app/data/v1/text/inh-id" />
                                <#if inhId??>
                                <!-- 住院号 -->
                                <value value="${inhId}" />
                                </#if>
                            </preAdmissionIdentifier>
                        </hospitalization>
                        </#if>
						<!-- 就诊科室 -->
						<serviceProvider>
							<reference
								value="#e1o1" />
						</serviceProvider>
					</Encounter>
				</contained>
				<#if inspectionDate??>
				<!-- 送检日期 -->
				<extension
					url="http://www.nestvision.com/platform/app/data/v1/date/inspection-date">
					<valueDateTime value="${inspectionDate}" />
				</extension>
				</#if>
				<#if inspectionUnit??>
				<!-- 送检单位 -->
				<extension
					url="http://www.nestvision.com/platform/app/data/v1/text/inspection-unit">
					<valueString value="${inspectionUnit}" />
				</extension>
				</#if>
				<#if clinicalDiagnosis??>
				<!-- 临床诊断 -->
				<extension
					url="http://www.nestvision.com/platform/app/data/v1/text/clinical-diagnosis">
					<valueString value="${clinicalDiagnosis}" />
				</extension>
				</#if>
				<#if inspectionMaterialsParts??>
				<!-- 送检材料/部位 -->
				<extension
					url="http://www.nestvision.com/platform/app/data/v1/text/inspection-materials-parts">
					<valueString value="${inspectionMaterialsParts}" />
				</extension>
				</#if>
				<#if nakedEyeExamination??>
				<!-- 肉眼检查 -->
				<extension
					url="http://www.nestvision.com/platform/app/data/v1/text/naked-eye-examination">
					<valueString value="${nakedEyeExamination}" />
				</extension>
				</#if>
				<#if image??>
				<!-- 图像（base64Binary） -->
				<extension
					url="http://www.nestvision.com/platform/app/data/v1/text/image">
					<valueString value="${image}" />
				</extension>
				</#if>
				<#if pathologicDiagnosis??>
				<!-- 病理诊断 -->
				<extension
					url="http://www.nestvision.com/platform/app/data/v1/text/pathologic-diagnosis">
					<valueString value="${pathologicDiagnosis}" />
				</extension>
				</#if>
				<#if diagnosisDate??>
				<!-- 诊断日期 -->
				<extension
					url="http://www.nestvision.com/platform/app/data/v1/date/diagnosis-date">
					<valueDateTime value="${diagnosisDate}" />
				</extension>
				</#if>
				<#if revisitDoctor??>
				<!-- 复诊医师 -->
				<extension
					url="http://www.nestvision.com/platform/app/data/v1/text/revisit-doctor">
					<valueString value="${revisitDoctor}" />
				</extension>
				</#if>
				<#if primaryDoctor??>
				<!-- 初诊医师 -->
				<extension
					url="http://www.nestvision.com/platform/app/data/v1/text/primary-doctor">
					<valueString value="${primaryDoctor}" />
				</extension>
				</#if>
				<#if pathologicalReportId??>
				<!-- 病理号 -->
				<identifier>
					<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/pathological-report-id" />
					<value value="${pathologicalReportId}" />
				</identifier>
				</#if>
				<#if pathologicalReportId??>
				<!-- 记录日期 -->
				<date value="${pathologicalReportId}" />
				</#if>
				<!-- 文档类型：病理报告 -->
				<type>
					<coding>
						<system value="2.16.156.10011.2.4" />
						<code value="99999-103" />
					</coding>
					<text value="病理报告" />
				</type>
				<!-- 文档标题：病理报告 -->
				<title value="病理报告" />
				<status value="final" />
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
