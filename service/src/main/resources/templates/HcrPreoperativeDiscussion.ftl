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
			<!-- 资源：术前讨论 -->
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
						<contact>
							<#if relationship??>
                            <relationship>
                                <coding>
                                    <!-- 联系人关系代码命名空间 -->
                                    <system value="urn:oid:2.16.156.10011.2.3.3.8" />
                                    <!-- 联系人关系代码 -->
                                    <code value="${relationship}" />
                                </coding>
                            </relationship>
                            </#if>
                            <#if contactsName??>
                            <name>
                                <!-- 联系人姓名 -->
                                <text value="${contactsName}" />
                            </name>
                            </#if>
                            <telecom>
                                <!-- 联系人联系方式代码 -->
                                <system value="phone" />
                                <#if contactsPhone??>
                                <!-- 联系人电话号码 -->
                                <value value="${contactsPhone}" />
                                </#if>
                                <use value="temp" />
                            </telecom>
						</contact>
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
				<!-- 签名医师 -->
				<contained>
					<Practitioner xmlns="http://hl7.org/fhir">
						<id value="pra2" />
						<identifier>
							<!-- 院内人员ID号命名空间 -->
							<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
							<#if doctorId??>
							<!-- 院内人员ID号 -->
							<value value="${doctorId}" />
							</#if>
						</identifier>
						 <#if doctorName??>
                        <name>
                            <!-- 姓名 -->
                            <text value="${doctorName}" />
                        </name>
                        </#if>
						<practitionerRole>
					        <specialty>
					            <coding>
					                <!-- 专业技术职务代码命名空间 -->
					                <system value="urn:oid:2.16.156.10011.2.3.3.10" />
					                <#if doctorPost??>
					                <!-- 专业技术职务代码 -->
					                <code value="${doctorPost}" />
							        </#if>
					            </coding>
					        </specialty>
					    </practitionerRole>
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
				<!-- 术前诊断 -->
				<contained>
					<Condition xmlns="http://hl7.org/fhir">
						<id value="con1" />
						<#if highestDiagCd??>
						<!-- 诊断依据代码 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/code/highest-diag-cd">
							<valueCode value="${highestDiagCd}" />
						</extension>
						</#if>
						<patient />
						<code>
							<coding>
								<!--诊断编码 -->
								<system value="urn:oid:2.16.156.10011.2.3.3.11" />
						<#if preoperativeDiagnosis??>
								<!--诊断编码 -->
								<code value="${preoperativeDiagnosis}" />
						</#if>
						<#if preoperativeDiagnosisName??>
								<display value="${preoperativeDiagnosisName}" />
						</#if>
							</coding>
						</code>
						<verificationStatus />
						<#if preoperativeDiagnosisDate??>
						<!-- 诊断日期 -->
						<onsetDateTime value="${preoperativeDiagnosisDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
						</#if>
					</Condition>
				</contained>
				<!-- 手术过程 -->
				<contained>
					<Procedure>
						<id value="pro1"/>
						<!-- 手术者 -->
						<contained>
							<Practitioner xmlns="http://hl7.org/fhir">
								<id value="pro1pra1" />
						<#if operativeSignDate??>
								<!-- 签名日期 -->
								<extension url="http://www.nestvision.com/platform/app/data/v1/datetime/signature-date">
									<valueDateTime value="${operativeSignDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}"/>
								</extension>
								</#if>
								<identifier>
									<!-- 院内人员ID号命名空间 -->
									<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
									<#if operative??>
									<!-- 院内人员ID号 -->
									<value value="${operative}" />
									</#if>
								</identifier>
								<#if operativeName??>
								<name>
									<!-- 姓名 -->
									<text value="${operativeName}" />
								</name>
								</#if>
								<practitionerRole>
									<specialty>
										<coding>
											<!-- 专业技术职务代码命名空间 -->
											<system value="urn:oid:2.16.156.10011.2.3.3.10" />
								<#if operativePost??>
											<!-- 专业技术职务代码 -->
											<code value="${operativePost}" />
											</#if>
										</coding>
									</specialty>
								</practitionerRole>
							</Practitioner>
						</contained>
						<!-- 麻醉医师 -->
						<contained>
							<Practitioner xmlns="http://hl7.org/fhir">
								<id value="pro1pra1" />
						<#if anaestheticSignDate??>
								<!-- 签名日期 -->
								<extension url="http://www.nestvision.com/platform/app/data/v1/datetime/signature-date">
									<valueDateTime value="${anaestheticSignDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}"/>
								</extension>
								</#if>
								<identifier>
									<!-- 院内人员ID号命名空间 -->
									<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
									<#if anaesthetic??>
									<!-- 院内人员ID号 -->
									<value value="${anaesthetic}" />
									</#if>
								</identifier>
								<#if anaestheticName??>
								<name>
									<!-- 姓名 -->
									<text value="${anaestheticName}" />
								</name>
								</#if>
								<practitionerRole>
									<specialty>
										<coding>
											<!-- 专业技术职务代码命名空间 -->
											<system value="urn:oid:2.16.156.10011.2.3.3.10" />
								<#if anaestheticPost??>
											<!-- 专业技术职务代码 -->
											<code value="${anaestheticPost}" />
											</#if>
										</coding>
									</specialty>
								</practitionerRole>
							</Practitioner>
						</contained>
						<!-- 手术过程 -->
						<#if operationCourses??>
						<extension url="http://www.nestvision.com/platform/app/data/v1/text/operation-course">
							<valueString value="${operationCourses}" />
						</extension>
						</#if>
						<identifier>
							<!-- 原系统手术单id命名空间 -->
							<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/operation-id" />
							<#if operationId??>
							<!-- 原系统手术单id号 -->
							<value value="${operationId}" />
							</#if>
						</identifier>
						<subject/>
						<!-- 状态 -->
						<status/>
						<code>
							<coding>
								<!-- 麻醉方法命名空间 -->
								<system value="urn:oid:2.16.156.10011.2.3.1.159" />
								<#if anesthesiaCode??>
								<!-- 麻醉方法代码 -->
								<code value="${anesthesiaCode}" />
								</#if>
								<#if anesthesiaWay??>
								<!-- 麻醉方法 -->
								<display value="${anesthesiaWay}" />
								</#if>
							</coding>
							<coding>
								<!-- 手术编码命名空间 -->
								<system value="urn:oid:2.16.156.10011.2.3.3.12" />
								<#if operationCd??>
								<!-- 手术编码 -->
								<code value="${operationCd}" />
								</#if>
								<#if operationName??>
								<!-- 手术名字 -->
								<display value="${operationName}" />
								</#if>
							</coding>
						</code>
						<bodySite>
							<coding>
								<!-- 手术操作目标部位代码命名空间 -->
								<system value="urn:oid:2.16.156.10011.2.3.1.262" />
								<#if partCode??>
								<!-- 手术操作目标部位代码 -->
								<code value="${partCode}" />
								</#if>
								<#if partName??>
								<!-- 手术操作目标部位名称 -->
								<display value="${partName}" />
								</#if>
							</coding>
						</bodySite>
						<performer>
							<!-- 麻醉者id -->
							<actor>
								<reference value="#pro1pra2" />
							</actor>
							<role>
								<coding>
									<!-- 角色代码命名空间 -->
									<system value="http://hl7.org/fhir/ValueSet/performer-role" />
									<!-- 角色代码：麻醉者 -->
									<code value="158970007" />
								</coding>
								<!-- 角色名称 -->
								<text value="麻醉者" />
							</role>
						</performer>
						<performer>
							<!-- 手术者id -->
							<actor>
								<reference value="#pro1pra1" />
							</actor>
							<role>
								<coding>
									<!-- 角色代码命名空间 -->
									<system value="http://hl7.org/fhir/ValueSet/performer-role" />
									<!-- 角色代码：手术者 -->
									<code value="405684005" />
								</coding>
								<!-- 角色名称 -->
								<text value="术者" />
							</role>
						</performer>
						<performedPeriod>
						<#if procedureStart??>
							<!-- 手术开始时间 -->
							<start value="${procedureStart?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
							</#if>
							<#if procedureEnd??>
							<!-- 手术结束时间 -->
							<end value="${procedureEnd?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
							</#if>
						</performedPeriod>
					</Procedure>
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
						<id value="pra8" />
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
				<#if discussionDate??>
				<!-- 讨论日期时间 -->
				<extension url="http://www.nestvision.com/platform/app/data/v1/datetime/discussion-date">
					<valueDateTime value="${discussionDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}"/>
				</extension>
				</#if>
				<#if discussionSites??>
				<!-- 讨论地点 -->
				<extension url="http://www.nestvision.com/platform/app/data/v1/text/discussion-sites">
					<valueString value="${discussionSites}"/>
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
				<!-- 术前讨论id -->
				<identifier>
					<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/hcr-preoperative-discussion-id" />
					<#if hcrPreoperativeDiscussionId??>
					<value value="${hcrPreoperativeDiscussionId}" />
					</#if>
				</identifier>
				<#if date??>
				<!-- 记录日期 -->
				<date value="${date?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
				</#if>
				<!-- 文档类型：术前讨论 -->
				<type>
					<coding>
						<system value="2.16.156.10011.2.4" />
						<code value="C0047" />
					</coding>
					<text value="术前讨论" />
				</type>
				<!-- 文档标题：术前讨论 -->
				<title value="术前讨论" />
				<!-- 状态：preliminary初步 final最终amended修订entered-in-error错误 -->
				<status value="final" />
				<!-- 保密等级：U:不受限制的 L:低等级 M:中等 N:常规 R:保密的 V:十分机密的 -->
				<confidentiality value="N" />
				<!-- 居民信息 -->
				<subject>
					<reference value="#pat1" />
				</subject>
				<!-- 文档创建 -->
				<author>
					<reference value="#pra1" />
				</author>
				<!-- 医师签名 -->
				<attester>
					<extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
					    <valueCode value="30"/>
					</extension>
					<mode value="legal" />
					<#if doctorSignDate??>
					<!-- 签名日期 -->
					<time value="${doctorSignDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}"/>
					</#if>
					<party>
						<reference value="#pra2"/>
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
				<!-- 术前诊断章节 -->
				<section>
					<title value="术前诊断章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="10219-4" />
							<display value="Surgical operation note preoperative DX" />
						</coding>
					</code>
					<entry>
						<reference value="#con1"/>
					</entry>
				</section>
				<!-- 治疗计划章节 -->
				<section>
					<title value="治疗计划章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="18776-5" />
							<display value="TREATMENT PLAN" />
						</coding>
					</code>
					<entry>
						<reference value="#pro1"/>
					</entry>
				</section>
				<!-- 手术操作章节 -->
				<section>
				    <#if operativeKeyPoints??>
					<!-- 手术要点 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/text/operative-key-points">
						<valueString value="${operativeKeyPoints}"/>
					</extension>
					</#if>
					<#if operativeKeyPoints??>
					<!-- 术前准备 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/text/pre-operative-preparation">
						<valueString value="${preOperativePreparation}"/>
					</extension>
					</#if>
					<#if operationIndication??>
					<!-- 手术指征 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/text/operation-indication">
						<valueString value="${operationIndication}"/>
					</extension>
					</#if>
					<#if operativePlan??>
					<!-- 手术方案 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/text/operative-plan">
						<valueString value="${operativePlan}"/>
					</extension>
					</#if>
					<#if mattersNeedingAttention??>
					<!-- 注意事项 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/text/matters-needing-attention">
						<valueString value="${mattersNeedingAttention}"/>
					</extension>
					</#if>
					<title value="手术操作章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="47519-4" />
							<display value="HISTORY OF PROCEDURES" />
						</coding>
					</code>
					<entry>
						<reference value="#pro1"/>
					</entry>
				</section>
				<!-- 术前总结章节 -->
				<section>
				    <#if discussOpinion??>
					<!-- 讨论意见 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/text/discuss-opinion">
						<valueString value="${discussOpinion}" />
					</extension>
					</#if>
					<#if discussConclude??>
					<!-- 讨论结论 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/text/discuss-conclude">
						<valueString value="${discussConclude}" />
					</extension>
					</#if>
					<title value="术前总结章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="99999-10" />
							<display value="Preoperative summary" />
						</coding>
					</code>
				</section>
			</Composition>
		</resource>
	</entry>
</Bundle>
