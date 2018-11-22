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
			<!-- 资源：一般护理记录 -->
			<Composition xmlns="http://hl7.org/fhir">
				<!-- 保管机构 -->
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
				<!-- 患者 -->
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
						<#if birthDate??>
						<!-- 出生日期 -->
						<birthDate value="${birthDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
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
				<!-- 责任护士 -->
				<contained>
					<Practitioner xmlns="http://hl7.org/fhir">
						<id value="pra2" />
						<#if responsibilityNurseId??>
      					<identifier>
							<!-- 院内人员ID号命名空间 -->
							<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
							<!-- 院内人员ID号 -->
							<value value="${responsibilityNurseId}" />
						</identifier>
						</#if>
						<#if responsibilityNurseName??>
      					<name>
							<!-- 姓名 -->
							<text value="${responsibilityNurseName}" />
						</name>
						</#if>
					</Practitioner>
				</contained>
				<!-- 住院 -->
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
						<extension url="http://www.nestvision.com/platform/app/data/v1/text/cn-four-result">
							<valueString value="${cnFourResult}" />
						</extension>
						</#if>
						<#if inModeCode??>
      					<!-- 入院途径 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/code/in-mode-code">
							<valueCode value="${inModeCode}" />
						</extension>
						</#if>
						<#if inhospitalReasonCd??>
      					<!-- 住院原因代码 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/code/inhospital-reason-cd">
							<valueCode value="${inhospitalReasonCd}" />
						</extension>
						</#if>
						<#if inhospitalWay??>
      					<!--入病房方式 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/text/inhospital-way">
							<valueString value="${inhospitalWay}" />
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
				<!-- 诊断 -->
				<contained>
					<Condition xmlns="http://hl7.org/fhir">
						<id value="con1" />
						<#if cnSymDiagCode??>
						<!--中医症候代码CV9900357 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/code/cn-sym-diag-code">
							<valueCode value="${cnSymDiagCode}" />
						</extension>
						</#if>
						<#if cnDisDiagCode??>
						<!--中医病名代码CV9900357 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/code/cn-dis-diag-code">
							<valueCode value="${cnDisDiagCode}" />
						</extension>
						</#if>
						<patient />
						<code>
							<coding>
								<!--诊断编码 -->
								<system value="urn:oid:2.16.156.10011.2.3.3.11" />
								<#if diagCode??>
								<!--疾病诊断编码 -->
								<code value="${diagCode}" />
								</#if>
								<#if diagName??>
      							<display value="${diagName}" />
								</#if>
							</coding>
						</code>
						<verificationStatus />
						<#if diagDate??>
     	 				<!-- 诊断日期 -->
						<onsetDateTime value="${diagDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
						</#if>
					</Condition>
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
					<valueInteger value="${inpatTimes?string('#')}" />
				</extension>
				</#if>
				<!-- 一般护理记录id -->
				<identifier>
					<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/general-nursing-records-id" />
					<value value="${generalNursingRecordsId}" />
				</identifier>
				<!-- 记录日期 -->
				<date value="${date?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
				<!-- 文档类型：一般护理记录 -->
				<type>
					<coding>
						<system value="2.16.156.10011.2.4" />
						<code value="C0017" />
					</coding>
					<text value="一般护理记录" />
				</type>
				<!-- 文档标题：一般护理记录 -->
				<title value="一般护理记录" />
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
				<!-- 责任护士 -->
				<attester>
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
						<valueCode value="05" />
					</extension>
					<!-- 对于该文档的意义：个人 -->
					<mode value="personal" />
					<#if responsibilityNurseDate??>
     	 			<!-- 签名日期 -->
					<time value="${responsibilityNurseDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</#if>
					<party>
						<reference value="#pra2" />
					</party>
				</attester>
				<!-- 文档管理机构信息 -->
				<custodian>
					<reference value="#hos1" />
				</custodian>
				<!-- 住院 -->
				<encounter>
					<reference value="#e1" />
				</encounter>
				<!-- 过敏史章节 -->
				<section>
					<#if rritability??>
      				<!-- 过敏史其他描述 -->
				    <extension
				        url="http://www.nestvision.com/platform/app/data/v1/text/rritability">
				        <valueString value="${rritability}" />
				    </extension>
					</#if>
					<#if ifRritability??>
					<!-- 是否有过敏史 -->
				    <extension
				        url="http://www.nestvision.com/platform/app/data/v1/boolean/if-rritability">
				        <valueBoolean value="${ifRritability?then('true','false')}" />
				    </extension>
					</#if>
					<title value="过敏史章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="48765-2" />
							<display value="Allergies, adverse reactions, alerts" />
						</coding>
					</code>
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
				<!-- 生命体征章节 -->
				<section>
					 <#if bodyTemperature??>
      				 <!-- 体温（℃） -->
				    <extension
				        url="http://www.nestvision.com/platform/app/data/v1/number/body-temperature">
				        <valueDecimal value="${bodyTemperature?string('#')}" />
				    </extension>
					</#if>
					<#if pulses??>
      				<!-- 脉率（次/min） -->
				    <extension
				        url="http://www.nestvision.com/platform/app/data/v1/number/pulses">
				        <valueDecimal value="${pulses?string('#')}" />
				    </extension>
					</#if>
					<#if breathingRate??>
      				<!-- 呼吸频率（次/min） -->
				    <extension
				        url="http://www.nestvision.com/platform/app/data/v1/number/breathing-rate">
				        <valueDecimal value="${breathingRate?string('#')}" />
				    </extension>
					</#if>
					<#if breathingRate??>
      				<!-- 体重(kg) -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/number/weight">
						<valueDecimal value="${weight?string('#')}" />
					</extension>
					</#if>
					<#if sbp??>
      				<!-- 收缩压（mmHg） -->
				    <extension
				        url="http://www.nestvision.com/platform/app/data/v1/number/sbp">
				        <valueDecimal value="${sbp?string('#')}" />
				    </extension>
					</#if>
					 <#if dbp??>
      				<!-- 舒张压（mmHg） -->
				    <extension
				        url="http://www.nestvision.com/platform/app/data/v1/number/dbp">
				        <valueDecimal value="${dbp?string('#')}" />
				    </extension>
					</#if>
					 <#if dbp??>
      				<!-- 血糖检测值（mmol/L） -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/number/glu">
						<valueDecimal value="${glu?string('#')}" />
					</extension>
					</#if>
					<#if dbp??>
      				<!-- 血氧饱和度（%） -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/number/saO2">
						<valueDecimal value="${sao2?string('#')}" />
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
				<!-- 四肢章节 -->
				<section>
					<#if dorsalisPedisArteryPulse??>
      				<!-- 足背动脉搏动标志 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/boolean/dorsalis-pedis-artery-pulse">
						<valueBoolean value="${dorsalisPedisArteryPulse?then('true','false')}" />
					</extension>
					</#if>
					<title value="四肢章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="10196-4" />
							<display value="EXTREMITIES" />
						</coding>
					</code>
				</section>
				<!-- 健康评估章节 -->
				<section>
					<#if dietaryStatus??>
      				<!-- 饮食情况代码CV9900003 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/code/dietary-status">
						<valueCode value="${dietaryStatus}" />
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
				<!-- 健康指导章节 -->
				<section>
					<#if dietGuide??>
      				<!-- 饮食指导代码CV9900333 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/code/diet-guide">
						<valueCode value="${dietGuide}" />
					</extension>
					</#if>
					<title value="健康指导章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="69730-0" />
							<display value="Instructions" />
						</coding>
					</code>
				</section>
				<!--  护理记录章节 -->
				<section>
					<#if nursingType??>
      				<!-- 护理等级代码CV9900330 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/code/nursing-type">
						<valueCode value="${nursingType}"/>
					</extension>
					</#if>
					<#if nursingGrade??>
      				<!-- 护理类型代码表CV9900331 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/code/nursing-grade">
						<valueCode value="${nursingGrade}"/>
					</extension>
					</#if>
					<#if catheterCareDescription??>
      				<!-- 导管护理 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/text/catheter-care-description">
						<valueString value="${catheterCareDescription}"/>
					</extension>
					</#if>
					<#if positionNurseDescription??>
      				<!-- 体位护理 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/text/position-nurse-description">
						<valueString value="${positionNurseDescription}"/>
					</extension>
					</#if>
					<#if skinNurseDescription??>
      				<!-- 皮肤护理 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/text/skin-nurse-description">
						<valueString value="${skinNurseDescription}"/>
					</extension>
					</#if>
					<#if nutritionCareDescription??>
      				<!-- 营养护理 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/text/nutrition-care-description">
						<valueString value="${nutritionCareDescription}"/>
					</extension>
					</#if>
					<#if tracheaNurseDescription??>
      				<!-- 气管护理代码CV9900332 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/code/trachea-nurse-description">
						<valueCode value="${tracheaNurseDescription}"/>
					</extension>
					</#if>
					<#if securityNurseDescription??>
      				<!-- 安全护理代码表CV9900335 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/code/security-nurse-description">
						<valueCode value="${securityNurseDescription}"/>
					</extension>
					</#if>
					<#if psychologicalNursing??>
      				<!-- 心理护理代码CV9900334 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/code/psychological-nursing">
						<valueCode value="${psychologicalNursing}"/>
					</extension>
					</#if>
					<title value="护理记录章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="99999-19" />
							<display value="Nursing record" />
						</coding>
					</code>
				</section>
				<!-- 护理观察章节 -->
				<section>
					<#if briefIllnessDescription??>
      				<!-- 简要病情 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/text/brief-illness-description">
						<valueString value="${briefIllnessDescription}" />
					</extension>
					</#if>
					<#if observationProjectName??>
      				<!-- 护理观察项目名称 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/text/observation-project-name">
						<valueString value="${observationProjectName}" />
					</extension>
					</#if>
					<#if observationResultsDescription??>
      				<!-- 护理观察结果 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/text/observation-results-description">
						<valueString value="${observationResultsDescription}" />
					</extension>
					</#if>
					<title value="护理观察章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="99999-22" />
							<display value="Nursing observation" />
						</coding>
					</code>
				</section>
				<!-- 护理操作章节 -->
				<section>
					<#if observationResultsDescription??>
      				<!-- 护理操作名称 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/text/nursing-name">
						<valueString value="${nursingName}"/>
					</extension>
					</#if>
					<#if nursingItemName??>
      				<!-- 护理操作项目类目名称 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/text/nursing-item-name">
						<valueString value="${nursingItemName}"/>
					</extension>
					</#if>
					<#if nursingResultDescription??>
      				<!-- 护理操作结果描述 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/text/nursing-result-description">
						<valueString value="${nursingResultDescription}"/>
					</extension>
					</#if>
					<#if breathingMachineMonitoringDescription??>
      				<!-- 呼吸机监护项目 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/text/breathing-machine-monitoring-description">
						<valueString value="${breathingMachineMonitoringDescription}"/>
					</extension>
					</#if>
					<title value="护理操作章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="99999-23" />
							<display value="Nursing operation" />
						</coding>
					</code>
				</section>
				<!-- 手术评估标志章节 -->
				<section>
					<#if surgicalSafetyChecklist??>
      				<!-- 发出手术安全核对表标志 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/boolean/surgical-safety-checklist">
						<valueBoolean value="${surgicalSafetyChecklist?then('true','false')}"/>
					</extension>
					</#if>
					<#if recoverSurgicalSafetyChecklist??>
      				<!-- 收回手术安全核对表标志 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/boolean/recover-surgical-safety-checklist">
						<valueBoolean value="${recoverSurgicalSafetyChecklist?then('true','false')}"/>
					</extension>
					</#if>
					<#if operationRiskAssessment??>
      				<!-- 发出手术风险评估表标志 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/boolean/operation-risk-assessment">
						<valueBoolean value="${operationRiskAssessment?then('true','false')}"/>
					</extension>
					</#if>
					<#if recoveryOperationRiskAssessment??>
      				<!-- 收回手术风险评估表标志 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/boolean/recovery-operation-risk-assessment">
						<valueBoolean value="${recoveryOperationRiskAssessment?then('true','false')}"/>
					</extension>
					</#if>
					<#if isolatedSigns??>
      				<!-- 隔离标志 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/boolean/isolated-signs">
						<valueBoolean value="${isolatedSigns?then('true','false')}"/>
					</extension>
					</#if>
					<#if isolationType??>
      				<!-- 隔离种类代码CV9900336 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/code/isolation-type">
						<valueCode value="${isolationType}"/>
					</extension>
					</#if>
					<title value="手术评估标志章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="99999-25" />
							<display value="Operative evaluation marker" />
						</coding>
					</code>
				</section>
			</Composition>
		</resource>
	</entry>
</Bundle>
