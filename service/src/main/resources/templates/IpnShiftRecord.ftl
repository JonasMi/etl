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
			<!-- 资源：交接班记录 -->
			<Composition xmlns="http://hl7.org/fhir">
				<!-- 保管机构 -->
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
						 <#if ifRritability??>
                        <!-- 是否有过敏史 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/boolean/if-rritability">
                            <valueBoolean value="${ifRritability?string("true","false")}" />
                        </extension>
                        </#if>
                        <#if rritability??>
                        <!-- 过敏史其他描述 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/text/rritability">
                            <valueString value="${rritability}" />
                        </extension>
                        </#if>
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
				<!-- 交班者 -->
				<contained>
					<Practitioner xmlns="http://hl7.org/fhir">
						<id value="pra3" />
						 <#if shiftPId??>
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system
                                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                            <!-- 院内人员ID号 -->
                            <value value="${shiftPId}" />
                        </identifier>
                        </#if>
                        <#if shiftPName??>
                        <name>
                            <!-- 姓名 -->
                            <text value="${shiftPName}" />
                        </name>
                        </#if>
					</Practitioner>
				</contained>
				<!-- 接班者 -->
				<contained>
					<Practitioner xmlns="http://hl7.org/fhir">
						<id value="pra4" />
						 <#if successorPId??>
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system
                                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                            <!-- 院内人员ID号 -->
                            <value value="${successorPId}" />
                        </identifier>
                        </#if>
                        <#if successorPName??>
                        <name>
                            <!-- 姓名 -->
                            <text value="${successorPName}" />
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
				<!-- 入院诊断 -->
				<contained>
					<Condition xmlns="http://hl7.org/fhir">
						<id value="con2" />
						<#if inDiagDetails??>
						<!-- 入院情况 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/text/inpatient-details">
							<valueString value="${inDiagDetails}"/>
						</extension>
						</#if>
						<#if inCnSymDiagCode??>
						<!--中医症候代码CV9900357 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/code/cn-sym-diag-code">
							<valueCode value="${inCnSymDiagCode}" />
						</extension>
						</#if>
						<#if inCnDisDiagCode??>
						<!--中医病名代码CV9900357 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/code/cn-dis-diag-code">
							<valueCode value="${inCnDisDiagCode}" />
						</extension>
						</#if>
						<patient />
						<code>
							<coding>
								<!--诊断编码 -->
								<system value="urn:oid:2.16.156.10011.2.3.3.11" />
								<#if inDiagCode??>
								<!--诊断编码 -->
								<code value="${inDiagCode}" />
						        </#if>
						        <#if inDiagValue??>
								<display value="${inDiagValue}" />
						        </#if>
							</coding>
						</code>
						<verificationStatus />
						<#if inDiagDate??>
						<!-- 诊断日期 -->
						<onsetDateTime value="${inDiagDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
						</#if>
					</Condition>
				</contained>
				<!-- 诊断记录 -->
				<contained>
					<Condition xmlns="http://hl7.org/fhir">
						<id value="con1" />
						<#if inDiagRecordCurrentCircumstances??>
						<!--目前情况 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/text/current-circumstances">
							<valueString value="${inDiagRecordCurrentCircumstances}" />
						</extension>
						</#if>
						<#if inRecordCnSymDiagCode??>
						<!--中医症候代码CV9900357 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/code/cn-sym-diag-code">
							<valueCode value="${inRecordCnSymDiagCode}" />
						</extension>
						</#if>
						<#if inRecordCnDisDiagCode??>
						<!--中医病名代码CV9900357 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/code/cn-dis-diag-code">
							<valueCode value="${inRecordCnDisDiagCode}" />
						</extension>
						</#if>
						<patient />
						<code>
							<coding>
								<!--诊断编码 -->
								<system value="urn:oid:2.16.156.10011.2.3.3.11" />
								<#if inRecordDiagCode??>
								<!--诊断编码 -->
								<code value="${inRecordDiagCode}" />
						        </#if>
						        <#if inRecordDiagValue??>
								<display value="${inRecordDiagValue}" />
						        </#if>
							</coding>
						</code>
						<verificationStatus />
						<#if inRecordDiagDate??>
						<!-- 诊断日期 -->
						<onsetDateTime value="${inRecordDiagDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
						</#if>
					</Condition>
				</contained>
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
				<!-- 交接班记录id -->
				<identifier>
					<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/ipn-shift-record-id" />
					<#if ipnShiftRecordId??>
					<value value="${ipnShiftRecordId}" />
					</#if>
				</identifier>
				<#if date??>
				<!-- 记录日期 -->
				<date value="${date?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
				</#if>
				<!-- 文档类型：交接班记录 -->
				<type>
					<coding>
						<system value="2.16.156.10011.2.4" />
						<code value="C0041" />
					</coding>
					<text value="交接班记录" />
				</type>
				<!-- 文档标题：交接班记录 -->
				<title value="交接班记录" />
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
				<!-- 交班者 -->
				<attester>
					<extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
						<valueCode value="20"/>
					</extension>
					<mode value="official"/>
					<#if shiftDate??>
					<!-- 交班时间 -->
					<time value="${shiftDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}"/>
					</#if>
					<party>
						<reference value="#pra3"/>
					</party>
				</attester>
				<!-- 接班者 -->
				<attester>
					<extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
					    <valueCode value="21"/>
					</extension>
					<mode value="official"/>
					<#if successorDate??>
					<!-- 接班时间 -->
					<time value="${successorDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}"/>
					</#if>
					<party>
						<reference value="#pra4"/>
					</party>
				</attester>
				<!-- 保管机构 -->
				<custodian>
					<reference value="#hos1" />
				</custodian>
				<!-- 住院信息 -->
				<encounter>
					<reference value="#e1" />
				</encounter>
				<!-- 主诉记录章节 -->
				<section>
					<!--主诉 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/text/chief">
						<valueString value="主诉" />
					</extension>
					<title value="主诉记录章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="10154-3" />
							<display value="CHIEF COMPLAINT" />
						</coding>
					</code>
				</section>
				<!-- 入院诊断章节-->
				<section>
					<title value="入院诊断章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="46241-6" />
							<display value="HOSPITAL ADMISSION DX" />
						</coding>
					</code>
					<entry>
						<reference value="#con2"/>
					</entry>
				</section>
				<!-- 诊断记录章节 -->
				<section>
					<title value="诊断记录章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="29548-5" />
							<display value="Diagnosis" />
						</coding>
					</code>
					<entry>
						<reference value="#con1"/>
					</entry>
				</section>
				<!-- 治疗计划章节 -->
				<section>
				    <#if succeedTreatmentOptions??>
					<!--接班诊疗计划 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/text/succeed-treatment-options">
						<valueString value="${succeedTreatmentOptions}" />
					</extension>
					</#if>
					<#if therapeuticPrinciples??>
					<!--治则治法GBT167513 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/code/therapeutic-principles">
						<valueCode value="${therapeuticPrinciples}" />
					</extension>
					</#if>
					<#if mattersNeedingAttention??>
					<!--注意事项 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/text/matters-needing-attention">
						<valueString value="${mattersNeedingAttention}" />
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
				<!-- 住院过程章节 -->
				<section>
				    <#if treatRescueCourse??>
					<!-- 诊疗过程描述 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/text/treat-rescue-course">
						<valueString value="${treatRescueCourse}" />
					</extension>
					</#if>
					<title value="住院过程章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="8648-8" />
							<display value="Hospital Course" />
						</coding>
					</code>
				</section>
			</Composition>
		</resource>
	</entry>
</Bundle>
