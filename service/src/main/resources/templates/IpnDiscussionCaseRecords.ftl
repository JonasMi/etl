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
			<!-- 资源：疑难病例讨论记录 -->
			<Composition xmlns="http://hl7.org/fhir">
				<!-- 文档管理机构 -->
				<contained>
					<Organization xmlns="http://hl7.org/fhir">
						<id value="hos1" />
						<identifier>
							<!-- 原系统机构ID号命名空间 -->
							<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/hospital-id" />
							 <#if upHospital??>
							<!-- 原系统机构ID号 -->
							<value value="${upHospital}" />
							</#if>
						</identifier>
						 <#if upHospitalName??>
						<!-- 医院名称 -->
						<name value="${upHospitalName}" />
						  </#if>
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
                            <system
                                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
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
						<id value="pra3" />
						<identifier>
							<!-- 院内人员ID号命名空间 -->
							<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
							<#if attendingDoctorId??>
							<!-- 院内人员ID号 -->
							<value value="${attendingDoctorId}" />
							</#if>
						</identifier>
						 <#if attendingDoctorName??>
                        <name>
                            <!-- 姓名 -->
                            <text value="${attendingDoctorName}" />
                        </name>
                        </#if>
						<practitionerRole>
							<specialty>
								<coding>
					                <!-- 专业技术职务代码命名空间 -->
					                <system value="urn:oid:2.16.156.10011.2.3.3.10" />
					                <#if attendingDoctorPostCode??>
					                <!-- 专业技术职务代码 -->
					                <code value="${attendingDoctorPostCode}" />
							        </#if>
					            </coding>
							</specialty>
						</practitionerRole>
					</Practitioner>
				</contained>
				<!-- 主任医师 -->
				<contained>
					<Practitioner xmlns="http://hl7.org/fhir">
						<id value="pra4" />
						<identifier>
							<!-- 院内人员ID号命名空间 -->
							<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
							<#if directorDoctorId??>
							<!-- 院内人员ID号 -->
							<value value="${directorDoctorId}" />
							</#if>
						</identifier>
						 <#if directorDoctorName??>
                        <name>
                            <!-- 姓名 -->
                            <text value="${directorDoctorName}" />
                        </name>
                        </#if>
						<practitionerRole>
							<specialty>
								<coding>
					                <!-- 专业技术职务代码命名空间 -->
					                <system value="urn:oid:2.16.156.10011.2.3.3.10" />
					                <#if directorDoctorPostCode??>
					                <!-- 专业技术职务代码 -->
					                <code value="${directorDoctorPostCode}" />
							        </#if>
					            </coding>
							</specialty>
						</practitionerRole>
					</Practitioner>
				</contained>
				<!-- 讨论支持人 -->
				<contained>
					<Practitioner xmlns="http://hl7.org/fhir">
						<id value="pra5" />
						<identifier>
							<!-- 院内人员ID号命名空间 -->
							<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
							<#if discussionModeratorId??>
							<!-- 院内人员ID号 -->
							<value value="${discussionModeratorId}" />
							</#if>
						</identifier>
						 <#if discussionModeratorName??>
                        <name>
                            <!-- 姓名 -->
                            <text value="${discussionModeratorName}" />
                        </name>
                        </#if>
					</Practitioner>
				</contained>
				<!-- 讨论成员1 -->
				<contained>
					<Practitioner xmlns="http://hl7.org/fhir">
						<id value="pra6" />
						<identifier>
							<!-- 院内人员ID号命名空间 -->
							<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
							<#if discussionOneId??>
							<!-- 院内人员ID号 -->
							<value value="${discussionOneId}" />
							</#if>
						</identifier>
						 <#if discussionOneName??>
                        <name>
                            <!-- 姓名 -->
                            <text value="${discussionOneName}" />
                        </name>
                        </#if>
					</Practitioner>
				</contained>
				<!-- 讨论成员2 -->
				<contained>
					<Practitioner xmlns="http://hl7.org/fhir">
						<id value="pra7" />
						<identifier>
							<!-- 院内人员ID号命名空间 -->
							<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
							<#if discussionTwoId??>
							<!-- 院内人员ID号 -->
							<value value="${discussionTwoId}" />
							</#if>
						</identifier>
						 <#if discussionTwoName??>
                        <name>
                            <!-- 姓名 -->
                            <text value="${discussionTwoName}" />
                        </name>
                        </#if>
					</Practitioner>
				</contained>
				<!-- 讨论成员3 -->
				<contained>
					<Practitioner xmlns="http://hl7.org/fhir">
						<id value="pra10" />
						<identifier>
							<!-- 院内人员ID号命名空间 -->
							<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
							<#if discussionThreeId??>
							<!-- 院内人员ID号 -->
							<value value="${discussionThreeId}" />
							</#if>
						</identifier>
						 <#if discussionThreeName??>
                        <name>
                            <!-- 姓名 -->
                            <text value="${discussionThreeName}" />
                        </name>
                        </#if>
					</Practitioner>
				</contained>
				<!-- 经治医师 -->
				<contained>
					<Practitioner xmlns="http://hl7.org/fhir">
						<id value="pra8" />
						<identifier>
							<!-- 院内人员ID号命名空间 -->
							<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
							<#if certifiedPhysicianId??>
							<!-- 院内人员ID号 -->
							<value value="${certifiedPhysicianId}" />
							</#if>
						</identifier>
						 <#if certifiedPhysicianName??>
                        <name>
                            <!-- 姓名 -->
                            <text value="${certifiedPhysicianName}" />
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
								<identifier>
									<!--原系统床位ID号命名空间 -->
									<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/bed-id" />
									<#if bedNum??>
									<!-- 原系统床位ID号 -->
									<value value="${bedNum}" />
									</#if>
								</identifier>
								<address>
									<#if wardNo??>
									<!--病房号 -->
									<extension url="http://www.nestvision.com/platform/app/data/v1/text/ward-no">
										<valueString value="${wardNo}" />
									</extension>
									</#if>
									<#if wardArea??>
									<!--病区 -->
									<extension url="http://www.nestvision.com/platform/app/data/v1/text/ward-area">
										<valueString value="${wardArea}" />
									</extension>
									</#if>
									<#if bedNum??>
									<!--床位号 -->
									<extension url="http://www.nestvision.com/platform/app/data/v1/text/bed-num">
										<valueString value="${bedNum}" />
									</extension>
									</#if>
								</address>
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
                                        <#if upHospital??>
                                        <identifier>
                                            <!-- 机构ID号命名空间 -->
                                            <system
                                                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/hospital-id" />
                                            <!-- 机构ID号 -->
                                            <value value="${upHospital}" />
                                        </identifier>
                                        </#if>
                                        <#if upHospitalName??>
                                        <!-- 医院名称 -->
                                        <name value="${upHospitalName}" />
                                        </#if>
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
						<identifier>
							<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/inpatient-registration-id" />
							<#if inpatientRegistrationId??>
							<!-- 原系统住院流水id号 -->
							<value value="${inpatientRegistrationId}" />
							</#if>
						</identifier>
						<!-- 状态 -->
						<status value="in-progress" />
						<!-- 类型：住院 -->
						<class value="inpatient" />
						<period>
						   <#if start??>
							<!-- 入院时间 -->
							<start value="${start?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
							</#if>
						</period>
						<hospitalization>
							<preAdmissionIdentifier>
								<!-- 住院号命名空间 -->
								<system value="http://www.nestvision.com/platform/app/data/v1/text/inh-id" />
								<#if inhId??>
							<!-- 住院号-->
							<value value="${inhId}" />
							</#if>
							</preAdmissionIdentifier>
						</hospitalization>
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
				<#if discussionSites??>
				<!-- 讨论地点 -->
				<extension url="http://www.nestvision.com/platform/app/data/v1/text/discussion-sites">
					<valueString value="${discussionSites}"/>
				</extension>
				</#if>
				<#if discussionDate??>
				<!-- 讨论时间 -->
				<extension url="http://www.nestvision.com/platform/app/data/v1/datetime/discussion-when">
					<valueDateTime value="${discussionDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}"/>
				</extension>
				</#if>
				<!-- 病案号 -->
				<#if caseNo??>
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
				<!--备注 -->
				<#if remarks??>
				<extension
					url="http://www.nestvision.com/platform/app/data/v1/text/remarks">
					<valueString value="${remarks}" />
				</extension>
				</#if>
				<!-- 疑难病例讨论记录id -->
				<identifier>
					<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/ipn-discussion-case-records-id" />
					<#if ipnDiscussionCaseRecordsId??>
					<value value="1" />
					</#if>
				</identifier>
				<#if date??>
				<!-- 记录日期 -->
				<date value="${date?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
				</#if>
				<!-- 文档类型：疑难病例讨论记录 -->
				<type>
					<coding>
						<system value="2.16.156.10011.2.4" />
						<code value="C0040" />
					</coding>
					<text value="疑难病例讨论记录" />
				</type>
				<!-- 文档标题：疑难病例讨论记录 -->
				<title value="疑难病例讨论记录" />
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
					<time value="${attendingDoctorSignDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}"/>
					</#if>
					<party>
						<reference value="#pra3"/>
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
					<time value="${directorDoctorSignDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}"/>
					</#if>
					<party>
						<reference value="#pra4"/>
					</party>
				</attester>
				<!-- 讨论主持人 -->
				<attester>
					<extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
					    <valueCode value="18"/>
					</extension>
					<mode value="legal" />
					<party>
						<reference value="#pra5"/>
					</party>
				</attester>
				<!-- 讨论成员1 -->
				<attester>
					<extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
					    <valueCode value="19"/>
					</extension>
					<mode value="legal" />
					<party>
						<reference value="#pra6"/>
					</party>
				</attester>
				<!-- 讨论成员2 -->
				<attester>
					<extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
					    <valueCode value="19"/>
					</extension>
					<mode value="legal" />
					<party>
						<reference value="#pra7"/>
					</party>
				</attester>
				<!-- 讨论成员3 -->
				<attester>
					<extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
					    <valueCode value="19"/>
					</extension>
					<mode value="legal" />
					<party>
						<reference value="#pra10"/>
					</party>
				</attester>
				<!-- 经治医师 -->
				<attester>
					<extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
					    <valueCode value="30"/>
					</extension>
					<mode value="legal" />
					<#if certifiedPhysicianDate??>
					<!-- 签名日期 -->
					<time value="${certifiedPhysicianDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}"/>
					</#if>
					<party>
						<reference value="#pra8"/>
					</party>
				</attester>
				<!-- 文档管理机构信息 -->
				<custodian>
					<reference value="#hos1" />
				</custodian>
				<!-- 住院信息 -->
				<encounter>
					<reference value="#e1" />
				</encounter>
				<!-- 健康评估章节 -->
				<section>
					 <#if discussOpinion??>
					<!-- 讨论意见 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/text/discuss-opinion">
						<valueString value="${discussOpinion}" />
					</extension>
					</#if>
					<#if discussionSummarize??>
					<!-- 主持人总结意见-->
					<extension url="http://www.nestvision.com/platform/app/data/v1/text/discussion-summary">
						<valueString value="${discussionSummarize}" />
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
					<extension url="http://www.nestvision.com/platform/app/data/v1/text/dialectical-treatment">
						<valueString value="${dialecticalTreatment}"/>
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
				    <#if cnPrescribe??>
					<!-- 医嘱内容 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/text/cn-prescribe">
						<valueString value="${cnPrescribe}" />
					</extension>
					</#if>
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
			</Composition>
		</resource>
	</entry>
</Bundle>
