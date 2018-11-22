<#ftl output_format="XML">
<Bundle xmlns="http://hl7.org/fhir">
	<!-- bundle业务类型：电子病历（必填） -->
	<meta>
		<tag>
			<system value="http://www.nestvision.com/platform/app/data/v1/code/bundle-business-type"/>
			<code value="01"/>
		</tag>
	</meta>
	<type value="document" />
	<entry>
		<fullUrl value="http://fhir.healthintersections.com.au/open/Composition/180f219f-97a8-486d-99d9-ed631fe4fc57" />
		<resource>
			<!-- 资源：上级医师查房记录 -->
			<Composition xmlns="http://hl7.org/fhir">
				<!-- 文档管理机构 -->
				<contained>
					<Organization xmlns="http://hl7.org/fhir">
						<id value="hos1" />
						<identifier>
							<!-- 原系统机构ID号命名空间 -->
							<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/hospital-id" />
							<!-- 原系统机构ID号 -->
							<value value="${upHospital}" />
						</identifier>
						<!-- 医院名称 -->
						<name value="${upHospitalName}" />
					</Organization>
				</contained>
				<!-- 患者信息 -->
				<contained>
					<Patient xmlns="http://hl7.org/fhir">
						<id value="pat1" />
						<#if age??>
      					<!-- 年龄 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/number/age">
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
						<#if healthFileNumber??>
						<identifier>
							<!-- 城乡居民健康档案编号命名空间 -->
							<system value="urn:oid:2.16.156.10011.1.2" />
							<!-- 城乡居民健康档案编号 -->
							<value value="${healthFileNumber}" />
						</identifier>
						</#if>
						<#if healthCard??>
						<identifier>
							<!-- 健康卡命名空间 -->
							<system value="urn:oid:2.16.156.10011.1.19" />
							<!-- 健康卡号 -->
							<value value="${healthCard}" />
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
                        <gender value="${mappingValue('GBT22611',gender)!''}" />
                        </#if>
					</Patient>
				</contained>
				<!-- 文档创建者 -->
				<contained>
					<Practitioner xmlns="http://hl7.org/fhir">
						<id value="pra1" />
						<#if authorId??>
      					<identifier>
							<!-- 院内人员ID号命名空间 -->
							<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
							<!-- 院内人员ID号 -->
							<value value="${authorId}" />
						</identifier>
						</#if>
						<#if authorName??>
      					<name>
							<!-- 姓名 -->
							<text value="${authorName}" />
						</name>
						</#if>
					</Practitioner>
				</contained>
				<!-- 主治医师 -->
				<contained>
					<Practitioner xmlns="http://hl7.org/fhir">
						<id value="pra2" />
						<#if attendingDoctorId??>
      					<identifier>
							<!-- 院内人员ID号命名空间 -->
							<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
							<!-- 院内人员ID号 -->
							<value value="${attendingDoctorId}" />
						</identifier>
						</#if>
						<#if attendingDoctorName??>
      					<name>
							<!-- 姓名 -->
							<text value="${attendingDoctorName}" />
						</name>
						</#if>
						<#if attendingDoctorPostCode??>
      					<practitionerRole>
							<specialty>
								<coding>
									<!-- 专业技术职务代码命名空间 -->
									<system value="urn:oid:2.16.156.10011.2.3.3.10" />
									<!-- 专业技术职务代码 -->
									<code value="${attendingDoctorPostCode}" />
								</coding>
							</specialty>
						</practitionerRole>
						</#if>
					</Practitioner>
				</contained>
				<!-- 主任医师 -->
				<contained>
					<Practitioner xmlns="http://hl7.org/fhir">
						<id value="pra3" />
						<#if directorDoctorId??>
      					<identifier>
							<!-- 院内人员ID号命名空间 -->
							<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
							<!-- 院内人员ID号 -->
							<value value="${directorDoctorId}" />
						</identifier>
						</#if>
						<#if directorDoctorName??>
      					<name>
							<!-- 姓名 -->
							<text value="${directorDoctorName}" />
						</name>
						</#if>
						<#if directorDoctorPostCode??>
      					<practitionerRole>
							<specialty>
								<coding>
									<!-- 专业技术职务代码命名空间 -->
									<system value="urn:oid:2.16.156.10011.2.3.3.10" />
									<!-- 专业技术职务代码 -->
									<code value="${directorDoctorPostCode}" />
								</coding>
							</specialty>
						</practitionerRole>
						</#if>
					</Practitioner>
				</contained>
				<!-- 记录人 -->
				<contained>
					<Practitioner xmlns="http://hl7.org/fhir">
						<id value="pra4" />
						<#if recordId??>
      					<identifier>
							<!-- 院内人员ID号命名空间 -->
							<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
							<!-- 院内人员ID号 -->
							<value value="${recordId}" />
						</identifier>
						</#if>
						<#if recordName??>
      					<name>
							<!-- 姓名 -->
							<text value="${recordName}" />
						</name>
						</#if>
					</Practitioner>
				</contained>
				<!-- 住院信息 -->
				<contained>
					<Encounter xmlns="http://hl7.org/fhir">
						<id value="e1" />
						<contained>
							<Location xmlns="http://hl7.org/fhir">
								<id value="e1l1" />
								<#if bedNum??>
								<identifier>
									<!--原系统床位ID号命名空间 -->
									<system
										value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/bed-id" />
									<!-- 原系统床位ID号 -->
									<value value="${bedNum}" />
								</identifier>
								</#if>
								<#if wardNo??|| wardArea??|| bedNum??>
								<address>
									<#if wardNo??>
									<!--病房号 -->
									<extension
										url="http://www.nestvision.com/platform/app/data/v1/text/ward-no">
										<valueString value="${wardNo}" />
									</extension>
									</#if>
									<#if wardArea??>
									<!--病区 -->
									<extension
										url="http://www.nestvision.com/platform/app/data/v1/text/ward-area">
										<valueString value="${wardArea}" />
									</extension>
									</#if>
									<#if bedNum??>
      								<!--床位号 -->
									<extension
										url="http://www.nestvision.com/platform/app/data/v1/text/bed-num">
										<valueString value="${bedNum}" />
									</extension>
									</#if>
								</address>
								</#if>
							</Location>
						</contained>
						<contained>
							<Organization xmlns="http://hl7.org/fhir">
								<id value="e1o2" />
								<#if visitingDeptCd??>
      							<!-- 科室归类代码 -->
								<extension url="urn:oid:2.16.156.10011.2.3.2.62">
									<valueCode value="${visitingDeptCd}" />
								</extension>
								</#if>
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
								<!-- 科室名称 -->
								<name value="${visitingDeptName}" />
								</#if>
							</Organization>
						</contained>
						<contained>
							<Organization xmlns="http://hl7.org/fhir">
								<id value="e1o1" />
								<contained>
									<Organization xmlns="http://hl7.org/fhir">
										<id value="e1o1h1" />
										<identifier>
											<!-- 机构ID号命名空间 -->
											<system
												value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/hospital-id" />
											<!-- 机构ID号 -->
											<value value="${upHospital}" />
										</identifier>
      									<!-- 医院名称 -->
										<name value="${upHospitalName}" />
									</Organization>
								</contained>
								<#if visitingDeptCd??>
      							<!-- 科室归类代码 -->
								<extension url="urn:oid:2.16.156.10011.2.3.2.62">
									<valueCode value="${visitingDeptCd}" />
								</extension>
								</#if>
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
								<!-- 科室名称 -->
								<name value="${visitingDeptName}" />
								</#if>
								<partOf>
							        <!-- 就诊医疗机构 -->
							        <reference value="#e1o1h1" />
							    </partOf>
							</Organization>
						</contained>
						<!-- 入院科室 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/identifier/in-dpid">
							<valueReference>
								<reference value="#e1o2" />
							</valueReference>
						</extension>
						<#if cnFourResult??>
						<!--中医"四诊"观察结果 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/cn-four-result">
							<valueString value="${cnFourResult}" />
						</extension>
						</#if>
						<#if inpatientRegistrationId?? >
						<identifier>
							<system
								value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/inpatient-registration-id" />
							<!-- 原系统住院流水id号 -->
							<value value="${inpatientRegistrationId}" />
						</identifier>
						</#if>
						<!-- 状态 -->
						<status value="finished" />
						<!-- 类型：住院 -->
						<class value="inpatient" />
						<#if start??>
     	 				<period>
     	 					<#if start??>
							<!-- 入院时间 -->
							<start value="${start?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
							</#if>
						</period>
						</#if>
						<#if inhId??>
      					<hospitalization>
							<preAdmissionIdentifier>
								<!-- 住院号命名空间 -->
								<system
									value="http://www.nestvision.com/platform/app/data/v1/text/inh-id" />
								<!-- 住院号 -->
								<value value="${inhId}" />
							</preAdmissionIdentifier>
						</hospitalization>
						</#if>
						<!-- 当前床号 -->
						<location>
							<location>
								<reference value="#e1l1" />
							</location>
						</location>
						<!-- 当前科室 -->
					    <serviceProvider>
					        <reference
					            value="#e1o1" />
					    </serviceProvider>
					</Encounter>
				</contained>
				<#if caseNo??>
				<!-- 病案号 -->
				<extension
					url="http://www.nestvision.com/platform/app/data/v1/text/case-no">
					<valueString value="${caseNo}" />
				</extension>
				</#if>
				<#if inpatTimes??>
				<!-- 住院次数 -->
				<extension
					url="http://www.nestvision.com/platform/app/data/v1/number/inpat-times">
					<valueInteger value="${inpatTimes}" />
				</extension>
				</#if>
				<#if remarks??>
				<!-- 备注 -->
				<extension
					url="http://www.nestvision.com/platform/app/data/v1/text/remarks">
					<valueString value="${remarks}" />
				</extension>
				</#if>
				<!-- 上级医师查房记录id -->
				<identifier>
					<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/ipn-superior-inspection-records-id" />
					<value value="${ipnSuperiorInspectionRecordsId}" />
				</identifier>
				<!-- 记录日期 -->
				<date value="${date?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
				<!-- 文档类型：上级医师查房记录 -->
				<type>
					<coding>
						<system value="2.16.156.10011.2.4" />
						<code value="C0039" />
					</coding>
					<text value="上级医师查房记录" />
				</type>
				<!-- 文档标题：上级医师查房记录 -->
				<title value="上级医师查房记录" />
				<!-- 状态：preliminary初步 final最终amended修订entered-in-error错误 -->
				<status value="final" />
				<!-- 保密等级：U:不受限制的 L:低等级 M:中等 N:常规 R:保密的 V:十分机密的 -->
				<confidentiality value="N" />
				<!-- 居民信息 -->
				<subject>
					<reference value="#pat1" />
				</subject>
				<!-- 文档创建者 -->
				<author>
					<reference value="#pra1" />
				</author>
				<!-- 主治医师 -->
				<attester>
					<extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
						<valueCode value="03"/>
					</extension>
					<mode value="legal" />
					<#if attendingDoctorSignDate??>
      				<!-- 签名日期 -->
					<time value="${attendingDoctorSignDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</#if>
					<party>
						<reference value="#pra2"/>
					</party>
				</attester>
				<!-- 主任医师 -->
				<attester>
					<extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
					    <valueCode value="02"/>
					</extension>
					<mode value="legal" />
					<#if directorDoctorSignDate??>
      				<!-- 签名日期 -->
					<time value="${directorDoctorSignDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</#if>
					<party>
						<reference value="#pra3"/>
					</party>
				</attester>
				<!-- 记录人 -->
				<attester>
					<extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
					    <valueCode value="10"/>
					</extension>
					<mode value="legal" />
					<#if recordSignDate??>
      				<!-- 签名日期 -->
					<time value="${recordSignDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</#if>
					<party>
						<reference value="#pra4"/>
					</party>
				</attester>
				<!-- 文档管理机构信息 -->
				<custodian>
					<reference value="#hos1" />
				</custodian>
				<#if wardRoundsDate??>
      			<!-- 查房时间 -->
			    <event>
			         <period>
    			        <start value="${wardRoundsDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}"/>
			         </period>
			    </event>
				</#if>
				<!-- 住院信息 -->
				<encounter>
					<reference value="#e1" />
				</encounter>
				<!-- 健康评估章节 -->
				<section>
					<#if wardRoundsRecord??>
      				<!-- 查房记录 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/text/check-record">
						<valueString value="${wardRoundsRecord}" />
					</extension>
					</#if>
					<title value="健康评估章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="51848-0" />
							<display value="Assessment note" />
						</coding>
					</code>
				</section>
				<!-- 诊断章节 -->
				<section>
					<title value="诊断章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="29548-5" />
							<display value="Diagnosis" />
						</coding>
					</code>
					<entry>
						<reference value="#e1"/>
					</entry>
				</section>
				<!-- 治疗计划章节 -->
				<section>
					<#if dialecticalTreatment??>
					<!-- 辩证论治 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/dialectical-treatment">
						<valueString value="${dialecticalTreatment}" />
					</extension>
					</#if>
					<#if assessmentPlan??>
					<!--诊疗计划 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/assessment-plan">
						<valueString value="${assessmentPlan}" />
					</extension>
					</#if>
					<title value="治疗计划章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="18776-5" />
							<display value="TREATMENT PLAN" />
						</coding>
					</code>
				</section>
				<!-- 用药章节 -->
				<section>
				<#if cnPrescribeDescr??>
				<!-- 中药煎煮法 -->
				<extension
					url="http://www.nestvision.com/platform/app/data/v1/text/cn-prescribe-descr">
					<valueString value="${cnPrescribeDescr}" />
				</extension>
				</#if>
				<#if cnDrugWayCd??>
				<!-- 中药服用方法代码 -->
				<extension
					url="http://www.nestvision.com/platform/app/data/v1/code/cn-drug-way-cd">
					<valueCode value="${cnDrugWayCd}" />
				</extension>
				</#if>
					<title value="用药章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="10160-0" />
							<display value="HISTORY OFMEDICATION USE" />
						</coding>
					</code>
				</section>
				<!-- 医嘱章节 -->
				<section>
					<#if cnPrescribe??>
					<!-- 医嘱内容 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/cn-prescribe">
						<valueString value="${cnPrescribe}" />
					</extension>
					</#if>
					<title value="医嘱章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="46209-3" />
							<display value="Provider Orders" />
						</coding>
					</code>
				</section>
			</Composition>
		</resource>
	</entry>
</Bundle>
