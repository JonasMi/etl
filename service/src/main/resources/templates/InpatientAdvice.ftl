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
			<!-- 资源：住院医嘱 -->
			<Composition xmlns="http://hl7.org/fhir">
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
				<contained>
					<Patient xmlns="http://hl7.org/fhir">
						<id value="pat1" />
						<#if age??>
      					<!-- 年龄 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/number/age">
							<valueDecimal value="${age}" />
						</extension>
						</#if>
						<#if patientType??>
      					<!-- 患者类型 -->
						<extension url="urn:oid:2.16.156.10011.2.3.1.271">
							<valueCode value="${patientType}" />
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
						<#if telecom??>
					    <telecom>
					        <!-- 联系方式代码 -->
					        <system value="phone" />
					        <!-- 现使用电话号码 -->
					        <value value="${telecom}" />
					        <!-- 使用方式:现在 -->
					        <use value="temp" />
					    </telecom>
					    </#if>
					    <#if gender??>
						<!-- 性别 -->
						<gender value="${gender}" />
						</#if>
					</Patient>
				</contained>
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
				<contained>
					<Practitioner xmlns="http://hl7.org/fhir">
						<id value="pra2" />
						<#if cancelDoctorId??>
      					<identifier>
							<!-- 院内人员ID号命名空间 -->
							<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
							<!-- 院内人员ID号 -->
							<value value="${cancelDoctorId}" />
						</identifier>
						</#if>
						<#if cancelDoctorName??>
      					<!-- 姓名 -->
						<name>
							<text value="${cancelDoctorName}" />
						</name>
						</#if>
					</Practitioner>
				</contained>
				<contained>
					<MedicationOrder xmlns="http://hl7.org/fhir">
						<id value="me1" />
						<contained>
							<Practitioner xmlns="http://hl7.org/fhir">
								<id value="me1pra1" />
								<contained>
									<Organization xmlns="http://hl7.org/fhir">
										<id value="me1pra1org1" />
										<#if openAdviceDoctorStandardCode??>
      									<!-- 科室归类代码 -->
										<extension url="urn:oid:2.16.156.10011.2.3.2.62">
											<valueCode value="${openAdviceDoctorStandardCode}" />
										</extension>
										</#if>
										<#if openAdviceDoctorOrgId??>
      									<identifier>
											<!-- 院内科室ID号命名空间 -->
											<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id" />
											<!-- 院内科室ID号 -->
											<value value="${openAdviceDoctorOrgId}" />
										</identifier>
										</#if>
										<#if openAdviceDoctorOrgName??>
      									<!-- 科室名称 -->
										<name value="${openAdviceDoctorOrgName}"/>
										</#if>
									</Organization>
								</contained>
								<#if openAdviceDoctorId??>
      							<identifier>
									<!-- 院内人员ID号命名空间 -->
									<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
									<!-- 院内人员ID号 -->
									<value value="${openAdviceDoctorId}" />
								</identifier>
								</#if>
								<#if openAdviceDoctorName??>
      							<!-- 姓名 -->
								<name>
									<text value="${openAdviceDoctorName}" />
								</name>
								</#if>
								<practitionerRole>
									<!--科室代码 -->
									<organization>
										<reference value="#me1pra1org1" />
									</organization>
								</practitionerRole>
							</Practitioner>
						</contained>
						<contained>
							<Practitioner xmlns="http://hl7.org/fhir">
								<id value="me1pra2" />
								<#if checkNuridId??>
      							<identifier>
									<!-- 院内人员ID号命名空间 -->
									<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
									<!-- 院内人员ID号 -->
									<value value="${checkNuridId}" />
								</identifier>
								</#if>
								<#if checkNuridName??>
      							<!-- 姓名 -->
								<name>
									<text value="${checkNuridName}" />
								</name>
								</#if>
							</Practitioner>
						</contained>
						<contained>
							<Practitioner xmlns="http://hl7.org/fhir">
								<id value="me1pra3" />
								<#if orderAuditorId??>
      							<identifier>
									<!-- 院内人员ID号命名空间 -->
									<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
									<!-- 院内人员ID号 -->
									<value value="${orderAuditorId}" />
								</identifier>
								</#if>
								<#if orderAuditorName??>
      							<!-- 姓名 -->
								<name>
									<text value="${orderAuditorName}" />
								</name>
								</#if>
							</Practitioner>
						</contained>
						<contained>
							<Practitioner xmlns="http://hl7.org/fhir">
								<id value="me1pra4" />
								<#if stopDoctoridId??>
      							<identifier>
									<!-- 院内人员ID号命名空间 -->
									<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
									<!-- 院内人员ID号 -->
									<value value="${stopDoctoridId}" />
								</identifier>
								</#if>
								<#if stopDoctoridName??>
      							<!-- 姓名 -->
								<name>
									<text value="${stopDoctoridName}" />
								</name>
								</#if>
							</Practitioner>
						</contained>
						<contained>
							<Practitioner xmlns="http://hl7.org/fhir">
								<id value="me1pra5" />
								<#if performerCdId??>
      							<identifier>
									<!-- 院内人员ID号命名空间 -->
									<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
									<!-- 院内人员ID号 -->
									<value value="${performerCdId}" />
								</identifier>
								</#if>
								<#if performerCdName??>
      							<!-- 姓名 -->
								<name>
									<text value="${performerCdName}" />
								</name>
								</#if>
							</Practitioner>
						</contained>
						<contained>
							<Organization xmlns="http://hl7.org/fhir">
								<id value="me1org1" />
								<#if performDeptCd??>
      							<!-- 科室归类代码 -->
								<extension url="urn:oid:2.16.156.10011.2.3.2.62">
									<valueCode value="${performDeptCd}" />
								</extension>
								</#if>
								<#if performDeptCdId??>
      							<identifier>
									<!-- 院内科室ID号命名空间 -->
									<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id" />
									<!-- 院内科室ID号 -->
									<value value="${performDeptCdId}" />
								</identifier>
								</#if>
								<#if performDeptCdName??>
      							<!-- 科室名称 -->
								<name value="${performDeptCdName}"/>
								</#if>
							</Organization>
						</contained>
						<#if orderTypeCode??>
      					<!-- 医嘱项目类型 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/code/order-type-code">
							<valueCode value="${orderTypeCode}" />
						</extension>
						</#if>
						<#if orderPlanStDate??>
      					<!-- 医嘱计划开始日期时间 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/datetime/order-plan-st-date">
							<valueDateTime value="${orderPlanStDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
						</extension>
						</#if>
						<#if orderPlanEndDate??>
      					<!-- 医嘱计划结束日期时间 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/datetime/order-plan-end-date">
							<valueDateTime value="${orderPlanEndDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
						</extension>
						</#if>
						<!-- 医嘱审核 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/identifier/order-auditor">
							<valueReference>
								<reference value="#me1pra2" />
							</valueReference>
						</extension>
						<!-- 医嘱核对护士 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/identifier/check-nurid">
							<valueReference>
								<reference value="#me1pra3" />
							</valueReference>
						</extension>
						<!-- 医嘱停止医生 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/identifier/stop-doctorid">
							<valueReference>
								<reference value="#me1pra4" />
							</valueReference>
						</extension>
						<#if performTime??>
      					<!-- 医嘱执行日期时间 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/datetime/perform-time">
							<valueDateTime value="${performTime?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
						</extension>
						</#if>
						<!-- 医嘱执行科室 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/identifier/perform-dept-cd">
							<valueReference>
								<reference value="#me1org1" />
							</valueReference>
						</extension>
						<!-- 医嘱执行医生 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/identifier/performer-cd">
							<valueReference>
								<reference value="#me1pra5" />
							</valueReference>
						</extension>
						<#if applyId??>
      					<!-- 电子申请单编号 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/text/apply-id">
							<valueString value="${applyId}" />
						</extension>
						</#if>
						<#if precDrugNo??>
      					<!-- 处方药品组号 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/text/prec-drug-no">
							<valueString value="${precDrugNo}" />
						</extension>
						</#if>
						<medicationReference />
						<prescriber>
							<!-- 开立医生ID -->
							<reference value="#me1pra1" />
						</prescriber>
						<#if orderEndDate??>
      					<!-- 医嘱停止日期时间 -->
						<dateEnded value="${orderEndDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
						</#if>
						<#if orderNoteRemark??>
      					<!-- 医嘱备注信息 -->
						<note>
							<text value="${orderNoteRemark}" />
						</note>
						</#if>
					</MedicationOrder>
				</contained>
				<!-- 住院医嘱id -->
				<identifier>
					<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/inpatient-advice-id" />
					<value value="${inpatientAdviceId}" />
				</identifier>
				<!-- 记录日期 -->
				<date value="${date?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
				<!-- 文档类型：住院医嘱 -->
				<type>
					<coding>
						<system value="2.16.156.10011.2.4" />
						<code value="C0052" />
					</coding>
					<text value="住院医嘱" />
				</type>
				<!-- 文档标题：住院医嘱 -->
				<title value="住院医嘱" />
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
				<!-- 文档生成机构 -->
				<custodian>
					<reference value="#hos1" />
				</custodian>
				<!-- 门诊或住院信息 -->
				<encounter>
					<reference value="#e1" />
				</encounter>
				<!-- 生命体征章节 -->
				<section>
					<#if weight??>
       				<!-- 体重 -->
					<extension
				        url="http://www.nestvision.com/platform/app/data/v1/number/weight">
						<valueDecimal value="${weight}" />
					</extension>
					</#if>
					<title value="生命体征章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="8716-3" />
							<display value="VITAL SIGNS" />
						</coding>
					</code>
				</section>
				<!-- 医嘱章节 -->
				<section>
					<!-- 医嘱取消医生 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/identifier/cancel-doctorid">
						<valueReference>
							<reference value="#pra2" />
						</valueReference>
					</extension>
					<#if advicePlanInformation??>
      				<!-- 医嘱计划信息 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/identifier/advice-plan-information">
						<valueString value="${advicePlanInformation}"/>
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
					<!-- 医嘱 -->
					<entry>
						<reference value="#me1" />
					</entry>
				</section>
			</Composition>
		</resource>
	</entry>
</Bundle>
