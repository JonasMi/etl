<#ftl output_format="XML">
<Bundle xmlns="http://hl7.org/fhir">
	<!-- bundle业务类型：健康档案（必填） -->
	<meta>
		<tag>
			<system value="http://www.nestvision.com/platform/app/data/v1/code/bundle-business-type"/>
			<code value="02"/>
		</tag>
	</meta>
	<type value="document" />
	<entry>
		<fullUrl
			value="http://fhir.healthintersections.com.au/open/Composition/180f219f-97a8-486d-99d9-ed631fe4fc57" />
		<resource>
			<!-- 资源：重性精神病患者随访服务 -->
			<Composition xmlns="http://hl7.org/fhir">
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
				<contained>
					<Patient xmlns="http://hl7.org/fhir">
						<id value="pat1" />
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
						<telecom>
					        <!-- 联系方式代码 -->
					        <system value="phone" />
					        <#if phone??>
					        <!-- 手机号码 -->
					        <value value="${phone}" />
					        </#if>
					        <!-- 使用方式:移动 -->
					        <use value="mobile" />
					    </telecom>
						 <#if gender??>
						<!-- 性别 -->
						<gender value="${mappingValue('GBT22611',gender)!''}" />
						</#if>
						<#if birthdate??>
                        <!-- 出生日期 -->
                        <birthDate value="${birthdate?string("yyyy-MM-dd")}" />
                        </#if>
                        <address>
                            <#if homeRoad??>
                            <!-- 地址-村（街、路、弄等）-->
                            <extension
                                url="http://www.nestvision.com/platform/app/data/v1/text/address-road">
                                <valueString value="${homeRoad}" />
                            </extension>
                            </#if>
                            <#if homeHouseNo??>
                            <!--地址-门牌号码 -->
                            <extension
                                url="http://www.nestvision.com/platform/app/data/v1/text/house-no">
                                <valueString value="${homeHouseNo}" />
                            </extension>
                            </#if>
                            <!-- 地址类别代码:家庭住址 -->
                            <use value="home" />
                            <#if homeText??>
                            <!-- 地址详细信息 -->
                            <text value="${homeText}" />
                            </#if>
                            <#if homeLine??>
                            <!-- 地址-乡（镇、街道办事处） -->
                            <line value="${homeLine}" />
                            </#if>
                            <#if homeCity??>
                            <!-- 地址-市（地区） -->
                            <city value="${homeCity}" />
                            </#if>
                            <#if homeDistrict??>
                            <!-- 地址-县（区） -->
                            <district value="${homeDistrict}" />
                            </#if>
                            <#if homeState??>
                            <!-- 地址-省（自治区、直辖市） -->
                            <state value="${homeState}" />
                            </#if>
					    </address>
					</Patient>
				</contained>
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
				<!-- 用药、医嘱 -->
				<contained>
					<MedicationOrder xmlns="http://hl7.org/fhir">
						<id value="me1" />
						<contained>
							<Medication xmlns="http://hl7.org/fhir">
								<id value="me1med1" />
								<code>
									<coding>
										<!-- 院内药物编码 -->
										<system
											value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/code/medication" />
										<#if medicationCd??>	
										<code value="${medicationCd}" />
										</#if>
										<#if medicationName??>
										<display value="${medicationName}" />
										</#if>
									</coding>
								</code>
								<product>
									<!-- 药物剂型 -->
									<form>
										<coding>
											<!-- 药物剂型命名空间 -->
											<system value="urn:oid:2.16.156.10011.2.3.1.211" />
											<#if drugDosageForms??>
											<!-- 药物剂型 -->
											<code value="${drugDosageForms}" />
											</#if>
											<#if drugDosageFormsName??>
											<!-- 药物剂型名字 -->
											<display value="${drugDosageFormsName}" />
											</#if>
										</coding>
									</form>
								</product>
							</Medication>
						</contained>
						<#if cnMedicationTypeCode??>
						<!-- 中药使用类别代码 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/cn-medication-type-code">
							<valueCode value="${cnMedicationTypeCode}" />
						</extension>
						</#if>
						<#if freqCode??>
						<!-- 频率代码 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/freq-code">
							<valueCode value="${freqCode}" />
						</extension>
						</#if>
						<#if medicationComplianceCode??>
						<!-- 服药依从性代码 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/medication-compliance-code">
							<valueCode value="${medicationComplianceCode}" />
						</extension>
						</#if>
						<#if drugAdverseReaction??>
						<!-- 药物不良反应情况 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/drug-adverse-reaction">
							<valueString value="${drugAdverseReaction}" />
						</extension>
						</#if>
						<#if drugTotalDose??>
						<!-- 药物使用总剂量 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/number/drug-total-dose">
							<valueDecimal value="${drugTotalDose?string('#')}" />
						</extension>
						</#if>
						<#if drugTotalDoseUtil??>
						<!-- 药物使用总剂量单位 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/drug-total-dose-util">
							<valueString value="${drugTotalDoseUtil}" />
						</extension>
						</#if>
						<!-- 药品信息 -->
						<medicationReference>
							<reference value="#me1med1" />
						</medicationReference>
						<dosageInstruction>
							<!-- 用法用量指导 -->
							<text value="饭后半小时喝，2次/天" />
							<timing>
								<repeat>
									<boundsPeriod>
										<#if start??>
										<!-- 医嘱开始时间 -->
							            <start value="${start?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
							            </#if>
									</boundsPeriod>
									<#if duration??>
									<!-- 执行天数 -->
									<duration value="${duration}" />
									</#if>
									<durationUnit value="d" />
								</repeat>
							</timing>
							<route>
								<coding>
									<!-- 用药途径代码命名空间 -->
									<system
										value="http://www.nestvision.com/platform/app/data/v1/code/dosage-code" />
									<#if dosageCode??>
									<!-- 用药途径代码：口服 -->
									<code value="${dosageCode}" />
									</#if>
								</coding>
							</route>
							<method>
								<coding>
									<!-- 特殊用法代码命名空间 -->
									<system
										value="http://www.nestvision.com/platform/app/data/v1/code/c-med-code" />
									<#if cMedCode??>	
									<!-- 特殊用法代码 -->
									<code value="${cMedCode}" />
									</#if>
								</coding>
							</method>
							<doseQuantity>
								<#if onceValue??>
								<!-- 用药次剂量 -->
								<value value="${onceValue}" />
								</#if>
								<#if onceUnit??>
								<!-- 用药次剂量单位 -->
								<unit value="${onceUnit}" />
								</#if>
							</doseQuantity>
						</dosageInstruction>
					</MedicationOrder>
				</contained>
				<!-- 重性精神病患者随访服务id -->
				<identifier>
					<system
						value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/severe-psychosis-patients-follow-up-service-id" />
					<#if severePsychosisPatientsFollowUpServiceId??>	
					<value value="${severePsychosisPatientsFollowUpServiceId}" />
					</#if>
				</identifier>
				<#if date??>
				<!-- 记录日期 -->
				<date value="${date?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
				</#if>
				<!-- 文档类型：重性精神病患者随访服务 -->
				<type>
					<coding>
						<system value="2.16.156.10011.2.4" />
						<code value="HSDB04.04" />
					</coding>
					<text value="重性精神病患者随访服务" />
				</type>
				<!-- 文档标题：重性精神病患者随访服务 -->
				<title value="重性精神病患者随访服务" />
				<!-- 状态：preliminary初步 final最终amended修订entered-in-error错误 -->
				<status value="final" />
				<!-- 保密等级：U:不受限制的 L:低等级 M:中等 N:常规 R:保密的 V:十分机密的 -->
				<confidentiality value="N" />
				<!-- 患者信息 -->
				<subject>
					<reference value="#pat1" />
				</subject>
				<!-- 文档创建者 -->
				<author>
					<reference value="#pra1" />
				</author>
				<!-- 提供患者服务机构 -->
				<custodian>
					<reference value="#hos1" />
				</custodian>
				<!-- 随访事件章节 -->
				<section>
					<#if severeMentalIllnessPatientsVisitSigns??>
					<!-- 重性精神疾病患者访到标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/severe-mental-illness-patients-visit-signs">
						<valueBoolean value="${severeMentalIllnessPatientsVisitSigns?then('true','false')}" />
					</extension>
					</#if>
					<title value="随访事件章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="99999-33" />
							<display value="Follow-up events" />
						</coding>
					</code>
				</section>
				<!-- 主要健康问题章节 -->
				<section>
					<#if stdSmiDangerLevel??>
					<!-- 重性精神疾病患者危险性分级代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/std-smi-danger-level">
						<valueCode value="${stdSmiDangerLevel}" />
					</extension>
					</#if>
					<#if mentalSymptomCode??>
					<!-- 精神症状代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/mental-symptom-code">
						<valueCode value="${mentalSymptomCode}" />
					</extension>
					</#if>
					<#if insightEvaluationResultCode??>
					<!-- 自知力评价结果代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/insight-evaluation-result-code">
						<valueCode value="${insightEvaluationResultCode}" />
					</extension>
					</#if>
					<#if sleepCode??>
					<!-- 睡眠情况代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/sleep-code">
						<valueCode value="${sleepCode}" />
					</extension>
					</#if>
					<#if dietaryStatus??>
					<!-- 饮食情况代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/dietary-status">
						<valueCode value="${dietaryStatus}" />
					</extension>
					</#if>
					<#if socialFunctionClassificationCode??>
					<!-- 社会功能情况分类代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/social-function-classification-code">
						<valueCode value="${socialFunctionClassificationCode}" />
					</extension>
					</#if>
					<#if socialFunctionEvaluationCode??>
					<!-- 社会功能情况评价代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/social-function-evaluation-code">
						<valueCode value="${socialFunctionEvaluationCode}" />
					</extension>
					</#if>
					<#if mentalIllnessOnFamilySocietyImpact??>
					<!-- 患重性精神疾病对家庭社会的影响代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/mental-illness-on-family-society-impact">
						<valueCode value="${mentalIllnessOnFamilySocietyImpact}" />
					</extension>
					</#if>
					<#if illnessOnFamilySocietyInfluenceTimes??>
					<!-- 患病对家庭社会的影响次数 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/illness-on-family-society-influence-times">
						<valueInteger value="${illnessOnFamilySocietyInfluenceTimes}" />
					</extension>
					</#if>
					<#if lockCaseCode??>
					<!-- 关锁情况代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/lock-case-code">
						<valueCode value="${lockCaseCode}" />
					</extension>
					</#if>
					<title value="主要健康问题章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="11450-4" />
							<display value="PROBLEM LIST" />
						</coding>
					</code>
				</section>
				<!-- 住院史章节 -->
				<section>
					<#if inpatientCode??>
					<!-- 住院情况的代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/inpatient-code">
						<valueCode value="${inpatientCode}" />
					</extension>
					</#if>
					<title value="住院史章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="11336-5" />
							<display value="HISTORY OF HOSPITALIZATIONS" />
						</coding>
					</code>
				</section>
				<!-- 实验室检查章节 -->
				<section>
					<#if auxiliaryInspectionMark??>
					<!-- 辅助检查标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/auxiliary-inspection-mark">
						<valueBoolean value="${auxiliaryInspectionMark?then('true','false')}" />
					</extension>
					</#if>
					<#if auxiliaryExaminationProject??>
					<!-- 辅助检查项目 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/auxiliary-examination-project">
						<valueString value="${auxiliaryExaminationProject}" />
					</extension>
					</#if>
					<#if testDate??>
					<!-- 检测日期 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/datetime/test-date">
						<valueDateTime value="${testDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</extension>
					</#if>
					<#if auxiliaryExaminationResults??>
					<!-- 辅助检查结果 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/auxiliary-examination-results">
						<valueString value="${auxiliaryExaminationResults}" />
					</extension>
					</#if>
					<title value="实验室检查章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="30954-2" />
							<display value="STUDIES SUMMARY" />
						</coding>
					</code>
				</section>
				<!-- 用药章节 -->
				<section>
					<title value="用药章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="10160-0" />
							<display value="HISTORY OFMEDICATION USE" />
						</coding>
					</code>
					<entry>
						<reference value="#me1" />
					</entry>
				</section>
				<!-- 健康评估章节 -->
				<section>
					<#if followupEvaluationResultsCode??>
					<!-- 随访评价结果代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/followup-evaluation-results-code">
						<valueCode value="${followupEvaluationResultsCode}" />
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
					<#if psychiatricRehabilitationCode??>
					<!-- 精神康复措施代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/psychiatric-rehabilitation-code">
						<valueCode value="${psychiatricRehabilitationCode}" />
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
				<!-- 转诊建议章节  -->
				<section>
					<#if referralMark??>
					<!-- 转诊标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/referral-mark">
						<valueBoolean value="${referralMark?then('true','false')}" />
					</extension>
					</#if>
					<#if referralReasons??>
					<!-- 转诊原因 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/referral-reasons">
						<valueString value="${referralReasons}" />
					</extension>
					</#if>
					<#if referralInOrg??>
					<!-- 转入机构的名称 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/referral-in-org">
						<valueString value="${referralInOrg}" />
					</extension>
					</#if>
					<#if referralInDep??>
					<!-- 转入科室的名称 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/referral-in-dep">
						<valueString value="${referralInDep}" />
					</extension>
					</#if>
					<title value="转诊建议章节 " />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="18776-1" />
							<display value="referal" />
						</coding>
					</code>
				</section>
				<!-- 下次随访安排章节  -->
				<section>
					<#if nextFollowUpDate??>
					<!-- 下次随访日期 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/datetime/next-follow-up-date">
						<valueDateTime value="${nextFollowUpDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</extension>
					</#if>
					<title value="下次随访安排章节 " />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="99999-29" />
							<display value="Next follow-up schedule" />
						</coding>
					</code>
				</section>
			</Composition>
		</resource>
	</entry>
</Bundle>

