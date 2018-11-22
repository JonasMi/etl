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
			<!-- 资源：成人健康体检 -->
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
				<contained>
					<!-- 症状 -->
					<Condition xmlns="http://hl7.org/fhir">
						<id value="c1" />
						<patient />
						<code>
							<coding>
								<!--症状编码名字空间 -->
								<system value="urn:oid:2.16.156.10011.2.3.3.11" />
								<#if symptomCd??>
								<!--症状编码 -->
								<code value="${symptomCd}" />
						        </#if>
						        <#if symptomName??>
								<display value="${symptomName}" />
						        </#if>
							</coding>
						</code>
						<verificationStatus />
						<#if admissionDiagnosisDate??>
						<!-- 诊断日期 -->
						<onsetDateTime value="${admissionDiagnosisDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
						</#if>
					</Condition>
				</contained>
				<contained>
					<!-- 诊断-->
					<Condition xmlns="http://hl7.org/fhir">
						<id value="c2" />
						<#if tcmConstitutionClassificationCode??>
						<!-- 中医体质分类代码 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/tcm-constitution-classification-code">
							<valueCode value="${tcmConstitutionClassificationCode}" />
						</extension>
						</#if>
						<#if tcmConstitutionClassificationResultCode??>
						<!-- 中医体质分类结果判定代码 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/tcm-constitution-classification-result-code">
							<valueCode value="${tcmConstitutionClassificationResultCode}" />
						</extension>
						</#if>
						<patient />
						<code>
							<coding>
								<!--诊断编码名字空间 -->
								<system value="urn:oid:2.16.156.10011.2.3.3.11" />
								<#if diagnosis??>
								<!--诊断编码 -->
								<code value="${diagnosis}" />
						        </#if>
						        <#if diagnosisName??>
								<display value="${diagnosisName}" />
						        </#if>
							</coding>
						</code>
						<verificationStatus />
						<#if diagnosisDate??>
						<!-- 诊断日期 -->
						<onsetDateTime value="${diagnosisDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
						</#if>
					</Condition>
				</contained>
				<!-- 成人健康体检id -->
				<identifier>
					<system
						value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/adult-health-examination-id" />
				    <#if adultHealthExaminationId??>
					<value value="${adultHealthExaminationId}" />
					</#if>
				</identifier>
				<#if date??>
				<!-- 记录日期 -->
				<date value="${date?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
				</#if>
				<!-- 文档类型：成人健康体检 -->
				<type>
					<coding>
						<system value="2.16.156.10011.2.4" />
						<code value="HSDC00.01" />
					</coding>
					<text value="成人健康体检" />
				</type>
				<!-- 文档标题：成人健康体检 -->
				<title value="成人健康体检" />
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
				<!-- 症状章节 -->
				<section>
				    <#if symptomDescription??>
					<!-- 症状描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/symptom-description">
						<valueString value="${symptomDescription}" />
					</extension>
					</#if>
					<title value="症状描述" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="11450-4" />
							<display value="PROBLEM LIST" />
						</coding>
					</code>
					<!-- 症状 -->
					<entry>
						<reference value="#c1" />
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
					<#if leftSystolicPressure??>
					<!-- 左侧收缩压（mmHg） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/left-systolic-pressure">
						<valueDecimal value="${leftSystolicPressure?string('#')}" />
					</extension>
					</#if>
					<#if leftDiastolicPressure??>
					<!-- 左侧舒张压（mmHg） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/left-diastolic-pressure">
						<valueDecimal value="${leftDiastolicPressure?string('#')}" />
					</extension>
					</#if>
					<#if rightSystolicPressure??>
					<!-- 右侧收缩压（mmHg） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/right-systolic-pressure">
						<valueDecimal value="${rightSystolicPressure?string('#')}" />
					</extension>
					</#if>
					<#if rightDiastolicPressure??>
					<!-- 右侧舒张压（mmHg） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/right-diastolic-pressure">
						<valueDecimal value="${rightDiastolicPressure?string('#')}" />
					</extension>
					</#if>
					<#if prenatalHeight??>
					<!-- 身高（cm） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/prenatal-height">
						<valueDecimal value="${prenatalHeight?string('#')}" />
					</extension>
					</#if>
					<#if weight??>
					<!-- 体重（kg） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/weight">
						<valueDecimal value="${weight?string('#')}" />
					</extension>
					</#if>
					<#if waist??>
					<!-- 腰围（cm） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/waist">
						<valueDecimal value="${waist?string('#')}" />
					</extension>
					</#if>
					<#if bodyMassIndex??>
					<!--体质指数 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/body-mass-index">
						<valueString value="${bodyMassIndex}" />
					</extension>
					</#if>
					<#if heartRate??>
					<!-- 心率（次/min） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/heart-rate">
						<valueDecimal value="${heartRate?string('#')}" />
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
				<!-- 口腔、咽喉和牙齿章节 -->
				<section>
					<#if lipAppearanceCode??>
					<!-- 口唇外观检查结果代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/lip-appearance-code">
						<valueCode value="${lipAppearanceCode}" />
					</extension>
					</#if>
					<#if dentitionClassCode??>
					<!-- 齿列类别代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/dentition-class-code">
						<valueCode value="${dentitionClassCode}" />
					</extension>
					</#if>
					<#if dentitionDescription??>
					<!--齿列描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/dentition-description">
						<valueString value="${dentitionDescription}" />
					</extension>
					</#if>
					<#if pharyngealExaminationResultCode??>
					<!-- 咽部检查结果代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/pharyngeal-examination-result-code">
						<valueCode value="${pharyngealExaminationResultCode}" />
					</extension>
					</#if>
					<title value="口腔、咽喉和牙齿章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="10201-2" />
							<display value="EMOUTH and THROAT and TEETH" />
						</coding>
					</code>
				</section>
				<!-- 眼章节 -->
				<section>
					<#if farVisualAcuity??>
					<!-- 左眼裸眼远视力值 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/far-visual-acuity">
						<valueDecimal value="${farVisualAcuity?string('#')}" />
					</extension>
					</#if>
					<#if leftCorrectedVisualAcuity??>
					<!-- 左眼矫正远视力值 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/left-corrected-visual-acuity">
						<valueDecimal value="${leftCorrectedVisualAcuity?string('#')}" />
					</extension>
					</#if>
					<#if rightCorrectedVisualAcuity??>
					<!-- 右眼矫正远视力值 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/right-corrected-visual-acuity">
						<valueDecimal value="${rightCorrectedVisualAcuity?string('#')}" />
					</extension>
					</#if>
					<#if fundusExaminationResultsAbnormalMark??>
					<!-- 眼底检查结果异常标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/fundus-examination-results-abnormal-mark">
						<valueBoolean value="${fundusExaminationResultsAbnormalMark?then('true','false')}" />
					</extension>
					</#if>
					<#if fundusExaminationResultsAbnormalDescribe??>
					<!-- 眼底检查结果异常描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/fundus-examination-results-abnormal-describe">
						<valueString value="${fundusExaminationResultsAbnormalDescribe}" />
					</extension>
					</#if>
					<#if scleralExaminationResultCode??>
					<!-- 巩膜检查结果代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/scleral-examination-result-code">
						<valueCode value="${scleralExaminationResultCode}" />
					</extension>
					</#if>
					<title value="眼章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="10197-2" />
							<display value="Physical findings of Eye" />
						</coding>
					</code>
				</section>
				<!-- 耳章节 -->
				<section>
				<#if hearingTestResultCode??>
					<!-- 听力检测结果代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/hearing-test-result-code">
						<valueCode value="${hearingTestResultCode}" />
					</extension>
					</#if>
					<title value="耳章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="10195-6" />
							<display value="EAR" />
						</coding>
					</code>
				</section>
				<!-- 腹部章节 -->
				<section>
					<#if abdominalTendernessSign??>
					<!-- 腹部压痛标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/abdominal-tenderness-sign">
						<valueBoolean value="${abdominalTendernessSign?then('true','false')}" />
					</extension>
					</#if>
					<#if abdominalTendernessDescribe??>
					<!-- 腹部压痛描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/abdominal-tenderness-describe">
						<valueString value="${abdominalTendernessDescribe}" />
					</extension>
					</#if>
					<#if abdominalMassSign??>
					<!-- 腹部包块标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/abdominal-mass-sign">
						<valueBoolean value="${abdominalMassSign?then('true','false')}" />
					</extension>
					</#if>
					<#if abdominalMassDescribe??>
					<!-- 腹部包块描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/abdominal-mass-describe">
						<valueString value="${abdominalMassDescribe}" />
					</extension>
					</#if>
					<#if liverSign??>
					<!-- 肝大标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/liver-sign">
						<valueBoolean value="${liverSign?then('true','false')}" />
					</extension>
					</#if>
					<#if liverDescribe??>
					<!-- 肝大描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/liver-describe">
						<valueString value="${liverDescribe}" />
					</extension>
					</#if>
					<#if splenomegalySign??>
					<!-- 脾大标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/splenomegaly-sign">
						<valueBoolean value="${splenomegalySign?then('true','false')}" />
					</extension>
					</#if>
					<#if splenomegalyDescribe??>
					<!-- 脾大描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/splenomegaly-describe">
						<valueString value="${splenomegalyDescribe}" />
					</extension>
					</#if>
					<#if abdominalShiftingDullnessSign??>
					<!-- 腹部移动性浊音标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/abdominal-shifting-dullness-sign">
						<valueBoolean value="${abdominalShiftingDullnessSign?then('true','false')}" />
					</extension>
					</#if>
					<#if abdominalShiftingDullnessDescribe??>
					<!-- 腹部移动性浊音描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/abdominal-shifting-dullness-describe">
						<valueString value="${abdominalShiftingDullnessDescribe}" />
					</extension>
					</#if>
					<title value="腹部章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="10191-5" />
							<display value="ABDOMEN" />
						</coding>
					</code>
				</section>
				<!-- 功能检查章节 -->
				<section>
				    <#if motionFunctionStatusCode??>
					<!-- 运动功能状态代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/motion-function-status-code">
						<valueCode value="${motionFunctionStatusCode}" />
					</extension>
					</#if>
					<title value="功能检查章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="46006-3" />
							<display value="Physical functioning and structural problems" />
						</coding>
					</code>
				</section>
				<!-- 心脏章节 -->
				<section>
					<#if heartTypeCode??>
					<!-- 心律类别代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/heart-type-code">
						<valueCode value="${heartTypeCode}" />
					</extension>
					</#if>
					<#if cardiacMurmurSign??>
					<!-- 心脏杂音标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/cardiac-murmur-sign">
						<valueBoolean value="${cardiacMurmurSign?then('true','false')}" />
					</extension>
					</#if>
					<#if cardiacMurmurDescribe??>
					<!-- 心脏杂音描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/cardiac-murmur-describe">
						<valueString value="${cardiacMurmurDescribe}" />
					</extension>
					</#if>
					<title value="心脏章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="10200-4" />
							<display value="HEART" />
						</coding>
					</code>
				</section>
				<!-- 血管章节 -->
				<section>
					<#if dorsalisPedisPulseCode??>
					<!-- 足背动脉搏动代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/dorsalis-pedis-pulse-code">
						<valueCode value="${dorsalisPedisPulseCode}" />
					</extension>
					</#if>
					<title value="血管章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="10208-7" />
							<display value="VESSELS" />
						</coding>
					</code>
				</section>
				<!-- 呼吸系统章节 -->
				<section>
					<#if lungAbnormalBreathSoundsSign??>
					<!-- 肺部异常呼吸音标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/lung-abnormal-breath-sounds-sign">
						<valueBoolean value="${lungAbnormalBreathSoundsSign?then('true','false')}" />
					</extension>
					</#if>
					<#if lungAbnormalBreathSoundsDescribe??>
					<!-- 肺部异常呼吸音描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/lung-abnormal-breath-sounds-describe">
						<valueString value="${lungAbnormalBreathSoundsDescribe}" />
					</extension>
					</#if>
					<#if lungRaleSign??>
					<!-- 肺部罗音标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/lung-rale-sign">
						<valueBoolean value="${lungRaleSign?then('true','false')}" />
					</extension>
					</#if>
					<#if lungRaleDescribe??>
					<!-- 肺部罗音描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/lung-rale-describe">
						<valueString value="${lungRaleDescribe}" />
					</extension>
					</#if>
					<#if barrelChestSign??>
					<!-- 桶状胸标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/barrel-chest-sign">
						<valueBoolean value="${barrelChestSign?then('true','false')}" />
					</extension>
					</#if>
					<title value="呼吸系统章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="11412-4" />
							<display value="RESPIRATORY SYSTEM" />
						</coding>
					</code>
				</section>
				<!-- 皮肤章节 -->
				<section>
					<#if skinTestResultCode??>
					<!-- 皮肤检查结果代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/skin-test-result-code">
						<valueCode value="${skinTestResultCode}" />
					</extension>
					</#if>
					<title value="皮肤章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="29302-7" />
							<display value="INTEGUMENTARY SYSTEM" />
						</coding>
					</code>
				</section>
				<!-- 淋巴系统章节 -->
				<section>
					<#if lymphNodeExaminationResultCode??>
						<!-- 淋巴结检查结果代码 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/lymph-node-examination-result-code">
							<valueCode value="${lymphNodeExaminationResultCode}" />
						</extension>
						</#if>
					<title value="淋巴系统章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="11447-0" />
							<display value="HEMATOLOGIC+LYMPHATIC+IMMUNOLOGIC SYSTEM" />
						</coding>
					</code>
				</section>
				<!-- 四肢章节 -->
				<section>
					<#if lowerExtremityEdemaTestResultCode??>
					<!-- 下肢水肿检查结果代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/lower-extremity-edema-test-result-code">
						<valueCode value="${lowerExtremityEdemaTestResultCode}" />
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
				<!-- 直肠章节 -->
				<section>
					<#if analExaminationResultsCode??>
					<!-- 肛门指诊检查结果类别代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/anal-examination-results-code">
						<valueCode value="${analExaminationResultsCode}" />
					</extension>
					</#if>
					<title value="直肠章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="10205-3" />
							<display value="RECTUM" />
						</coding>
					</code>
				</section>
				<!-- 乳腺章节 -->
				<section>
					<#if breastExaminationResultsCode??>
					<!--乳腺检查结果代码-->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/breast-examination-results-code">
						<valueCode value="${breastExaminationResultsCode}" />
					</extension>
					</#if>
					<title value="乳腺章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="10193-1" />
							<display value="Breasts" />
						</coding>
					</code>
				</section>
				<!-- 生殖器章节 -->
				<section>
					<#if vulvaAbnormalitySign??>
					<!-- 外阴异常标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/vulva-abnormality-sign">
						<valueBoolean value="${vulvaAbnormalitySign?then('true','false')}" />
					</extension>
					</#if>
					<#if vulvaAbnormalityDescribe??>
					<!-- 外阴异常描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/vulva-abnormality-describe">
						<valueString value="${vulvaAbnormalityDescribe}" />
					</extension>
					</#if>
					<#if abnormalVaginaSign??>
					<!-- 阴道异常标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/abnormal-vagina-sign">
						<valueBoolean value="${abnormalVaginaSign?then('true','false')}" />
					</extension>
					</#if>
					<#if abnormalVaginaDescribe??>
					<!-- 阴道异常描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/abnormal-vagina-describe">
						<valueString value="${abnormalVaginaDescribe}" />
					</extension>
					</#if>
					<#if cervicalAbnormalitySign??>
					<!-- 宫颈异常标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/cervical-abnormality-sign">
						<valueBoolean value="${cervicalAbnormalitySign?then('true','false')}" />
					</extension>
					</#if>
					<#if cervicalAbnormalityDescribe??>
					<!-- 宫颈异常描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/cervical-abnormality-describe">
						<valueString value="${cervicalAbnormalityDescribe}" />
					</extension>
					</#if>
					<#if uterineBodyAbnormalSign??>
					<!-- 宫体异常标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/uterine-body-abnormal-sign">
						<valueBoolean value="${uterineBodyAbnormalSign?then('true','false')}" />
					</extension>
					</#if>
					<#if uterineBodyAbnormalDescribe??>
					<!-- 宫体异常描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/uterine-body-abnormal-describe">
						<valueString value="${uterineBodyAbnormalDescribe}" />
					</extension>
					</#if>
					<#if enclosureAbnormalSign??>
					<!-- 附件异常标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/enclosure-abnormal-sign">
						<valueBoolean value="${enclosureAbnormalSign?then('true','false')}" />
					</extension>
					</#if>
					<#if enclosureAbnormalDescribe??>
					<!-- 附件异常描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/enclosure-abnormal-describe">
						<valueString value="${enclosureAbnormalDescribe}" />
					</extension>
					</#if>
					<title value="生殖器章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="11400-9" />
							<display value="GENITALIA" />
						</coding>
					</code>
				</section>
				<!-- 实验室检查章节 -->
				<section>
					<#if hemoglobin??>
					<!-- 血红蛋白 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/hemoglobin">
						<valueDecimal value="${hemoglobin?string('#')}" />
					</extension>
					</#if>
					<#if whiteBloodCell??>
					<!-- 白细胞 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/white-blood-cell">
						<valueDecimal value="${whiteBloodCell?string('#')}" />
					</extension>
					</#if>
					<#if platelet??>
					<!-- 血小板 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/platelet">
						<valueDecimal value="${platelet?string('#')}" />
					</extension>
					</#if>
					<#if urineProteinQualitativeTestResultCode??>
					<!-- 尿蛋白定性检测结果代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/urine-protein-qualitative-test-result-code">
						<valueCode value="${urineProteinQualitativeTestResultCode}" />
					</extension>
					</#if>
					<#if niaotangQualitativeTestResultCode??>
					<!-- 尿糖定性检测结果代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/niaotang-qualitative-test-result-code">
						<valueCode value="${niaotangQualitativeTestResultCode}" />
					</extension>
					</#if>
					<#if urineKetoneQualitativeTestResultCode??>
					<!-- 尿酮体定性检测结果代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/urine-ketone-qualitative-test-result-code">
						<valueCode value="${urineKetoneQualitativeTestResultCode}" />
					</extension>
					</#if>
					<#if bldQualitativeTestResultCode??>
					<!-- 尿潜血定性检测结果代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/bld-qualitative-test-result-code">
						<valueCode value="${bldQualitativeTestResultCode}" />
					</extension>
					</#if>
					<#if bloodSugar??>
					<!-- 血糖检测值（mmol/L） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/blood-sugar">
						<valueDecimal value="${bloodSugar?string('#')}" />
					</extension>
					</#if>
					<#if urineMicroalbumin??>
					<!-- 尿微量白蛋白(mg/dL) -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/urine-microalbumin">
						<valueDecimal value="${urineMicroalbumin?string('#')}" />
					</extension>
					</#if>
					<#if fecalOccultBlood??>
					<!-- 大便潜血 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/fecal-occult-blood">
						<valueDecimal value="${fecalOccultBlood?string('#')}" />
					</extension>
					</#if>
					<#if glycosylatedHemoglobin??>
					<!-- 糖化血红蛋白(%) -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/glycosylated-hemoglobin">
						<valueDecimal value="${glycosylatedHemoglobin?string('#')}" />
					</extension>
					</#if>
					<#if serumAlanineAminotransferase??>
					<!-- 血清谷丙转氨酶 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/serum-alanine-aminotransferase">
						<valueDecimal value="${serumAlanineAminotransferase?string('#')}" />
					</extension>
					</#if>
					<#if serumAspartateAminotransferase??>
					<!-- 血清谷草转氨酶 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/serum-aspartate-aminotransferase">
						<valueDecimal value="${serumAspartateAminotransferase?string('#')}" />
					</extension>
					</#if>
					<#if albumin??>
					<!-- 白蛋白(mg/dL) -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/albumin">
						<valueDecimal value="${albumin?string('#')}" />
					</extension>
					</#if>
					<#if totalBilirubin??>
					<!-- 总胆红素 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/total-bilirubin">
						<valueDecimal value="${totalBilirubin?string('#')}" />
					</extension>
					</#if>
					<#if conjugatedBilirubin??>
					<!-- 结合胆红素 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/conjugated-bilirubin">
						<valueDecimal value="${conjugatedBilirubin?string('#')}" />
					</extension>
					</#if>
					<#if scr??>
					<!-- 血清肌酐 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/scr">
						<valueDecimal value="${scr?string('#')}" />
					</extension>
					</#if>
					<#if bloodUreaNitrogen??>
					<!-- 血尿素氮 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/blood-urea-nitrogen">
						<valueDecimal value="${bloodUreaNitrogen?string('#')}" />
					</extension>
					</#if>
					<#if bloodPotassiumConcentration??>
					<!-- 血钾浓度(mmol/L) -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/blood-potassium-concentration">
						<valueDecimal value="${bloodPotassiumConcentration?string('#')}" />
					</extension>
					</#if>
					<#if serumSodiumConcentration??>
					<!-- 血钠浓度(mmol/L) -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/serum-sodium-concentration">
						<valueDecimal value="${serumSodiumConcentration?string('#')}" />
					</extension>
					</#if>
					<#if totalCholesterol??>
					<!-- 总胆固醇(mmol/L) -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/total-cholesterol">
						<valueDecimal value="${totalCholesterol?string('#')}" />
					</extension>
					</#if>
					<#if triglyceride??>
					<!-- 甘油三酯(mmol/L) -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/triglyceride">
						<valueDecimal value="${triglyceride?string('#')}" />
					</extension>
					</#if>
					<#if serumLowDensityLipoproteinCholesterol??>
					<!-- 血清低密度酯蛋白胆固醇(mmol/L) -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/serum-low-density-lipoprotein-cholesterol">
						<valueDecimal value="${serumLowDensityLipoproteinCholesterol?string('#')}" />
					</extension>
					</#if>
					<#if hepatitisBSurfaceAntigen??>
					<!-- 乙型肝炎表面抗原定性检测结果分类代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/hepatitis-b-surface-antigen">
						<valueCode value="${hepatitisBSurfaceAntigen}" />
					</extension>
					</#if>
					<#if hepatitisBSurfaceAntibody??>
					<!-- 乙型肝炎表面抗体定性检测结果分类代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/hepatitis-b-surface-antibody">
						<valueCode value="${hepatitisBSurfaceAntibody}" />
					</extension>
					</#if>
					<#if hepatitisBEAntigen??>
					<!-- 乙型肝炎e抗原定性检测结果分类代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/hepatitis-b-e-antigen">
						<valueCode value="${hepatitisBEAntigen}" />
					</extension>
					</#if>
					<#if hepatitisBEAntibody??>
					<!-- 乙型肝炎e抗体定性检测结果分类代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/hepatitis-b-e-antibody">
						<valueCode value="${hepatitisBEAntibody}" />
					</extension>
					</#if>
					<#if hepatitisBCoreAntibody??>
					<!-- 乙型肝炎核心抗体定性检测结果分类代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/hepatitis-b-core-antibody">
						<valueCode value="${hepatitisBCoreAntibody}" />
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
				<!-- 辅助检查章节 -->
				<section>
					<#if abnormalChestXRaySign??>
					<!-- 胸部X线检查异常标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/abnormal-chest-x-ray-sign">
						<valueBoolean value="${abnormalChestXRaySign?then('true','false')}" />
					</extension>
					</#if>
					<#if abnormalChestXRayDescribe??>
					<!-- 胸部X线检查异常描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/abnormal-chest-x-ray-describe">
						<valueString value="${abnormalChestXRayDescribe}" />
					</extension>
					</#if>
					<#if ecgAbnormalitySign??>
					<!-- 心电图异常标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/ecg-abnormality-sign">
						<valueBoolean value="${ecgAbnormalitySign?then('true','false')}" />
					</extension>
					</#if>
					<#if ecgAbnormalityDescribe??>
					<!-- 心电图异常描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/ecg-abnormality-describe">
						<valueString value="${ecgAbnormalityDescribe}" />
					</extension>
					</#if>
					<#if abnormalUltrasonographySign??>
					<!-- B超检查异常标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/abnormal-ultrasonography-sign">
						<valueBoolean value="${abnormalUltrasonographySign?then('true','false')}" />
					</extension>
					</#if>
					<#if abnormalUltrasonographyDescribe??>
					<!-- B超检查异常描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/abnormal-ultrasonography-describe">
						<valueString value="${abnormalUltrasonographyDescribe}" />
					</extension>
					</#if>
					<#if cervicalSmearAbnormalitySign??>
					<!-- 宫颈涂片异常标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/cervical-smear-abnormality-sign">
						<valueBoolean value="${cervicalSmearAbnormalitySign?then('true','false')}" />
					</extension>
					</#if>
					<#if cervicalSmearAbnormalityDescribe??>
					<!-- 宫颈涂片异常描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/cervical-smear-abnormality-describe">
						<valueString value="${cervicalSmearAbnormalityDescribe}" />
					</extension>
					</#if>
					<title value="辅助检查章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="99999-12" />
							<display value="Supplementary Examination" />
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
					<!-- 诊断 -->
					<entry>
						<reference value="#c2" />
					</entry>
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
				<!-- 家族史章节 -->
				<section>
					<#if familyDiseaseNameCode??>
					<!-- 家族性疾病名称代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/family-disease-name-code">
						<valueCode value="${familyDiseaseNameCode}" />
					</extension>
					</#if>
					<title value="家族史章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="10157-6" />
							<display value="HISTORY OF FAMILY MEMBER DISEASES" />
						</coding>
					</code>
				</section>
				<!-- 住院史章节 -->
				<section>
					<#if registeredMedicalInstitutionName??>
					<!-- 曾住院医疗机构名称 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/registered-medical-institution-name">
						<valueString value="${registeredMedicalInstitutionName}" />
					</extension>
					</#if>
					<#if inpatientMedicalRecordNumber??>
					<!-- 曾住院病案号 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/inpatient-medical-record-number">
						<valueString value="${inpatientMedicalRecordNumber}" />
					</extension>
					</#if>
					<#if hospitalizationCauses??>
					<!-- 住院原因 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/hospitalization-causes">
						<valueString value="${hospitalizationCauses}" />
					</extension>
					</#if>
					<#if onceEstablishFamilyBedOrgName??>
					<!-- 曾建立家庭病床医疗机构名称 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/once-establish-family-bed-org-name">
						<valueString value="${onceEstablishFamilyBedOrgName}" />
					</extension>
					</#if>
					<#if onceEstablishFamilyBedMedicalRecordNumber??>
					<!-- 曾建立家庭病床病案号 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/once-establish-family-bed-medical-record-number">
						<valueString value="${onceEstablishFamilyBedMedicalRecordNumber}" />
					</extension>
					</#if>
					<#if establishFamilyBedsReason??>
					<!-- 家庭病床建立原因 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/establish-family-beds-reason">
						<valueString value="${establishFamilyBedsReason}" />
					</extension>
					</#if>
					<title value="住院史章节 " />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="11336-5" />
							<display value="HISTORY OF HOSPITALIZATIONS" />
						</coding>
					</code>
				</section>
				<!-- 预防接种史章节 -->
				<section>
					<#if inoculationTime??>
					<!-- 接种时间 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/datetime/inoculation-time">
						<valueDateTime value="${inoculationTime?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</extension>
					</#if>
					<#if immuneDose??>
					<!-- 免疫剂次 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/immune-dose">
						<valueDecimal value="${immuneDose?string('#')}" />
					</extension>
					</#if>
					<#if vaccineNameCode??>
					<!-- 疫苗编码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/vaccine-name-code">
						<valueCode value="${vaccineNameCode}" />
					</extension>
					</#if>
					<#if vaccineBatch??>
					<!-- 疫苗批次 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/vaccine-batch">
						<valueString value="${vaccineBatch}" />
					</extension>
					</#if>
					<#if vaccineManufacturers??>
					<!-- 疫苗的生产厂家 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/vaccine-manufacturers">
						<valueString value="${vaccineManufacturers}" />
					</extension>
					</#if>
					<#if vaccinationPhysician??>
					<!-- 免疫接种医师 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/vaccination-physician">
						<valueString value="${vaccinationPhysician}" />
					</extension>
					</#if>
					<#if inoculationMechanism??>
					<!-- 接种机构师 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/inoculation-mechanism">
						<valueString value="${inoculationMechanism}" />
					</extension>
					</#if>
					<title value="预防接种史章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="11369-6" />
							<display value="HISTORY OF IMMUNIZATIONS" />
						</coding>
					</code>
				</section>
				<!-- 职业暴露史章节 -->
				<section>
					<#if occupationalExposureToHazardousFactors??>
					<!-- 有危害因素接触职业描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/occupational-exposure-to-hazardous-factors">
						<valueString value="${occupationalExposureToHazardousFactors}" />
					</extension>
					</#if>
					<#if engagedInHazardousFactors??>
					<!-- 从事有危害因素职业时长(年) -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/engaged-in-hazardous-factors">
						<valueDecimal value="${engagedInHazardousFactors?string('#')}" />
					</extension>
					</#if>
					<#if occupationalHazardFactorsCode??>
					<!-- 职业病危害因素类别代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/occupational-hazard-factors-code">
						<valueCode value="${occupationalHazardFactorsCode}" />
					</extension>
					</#if>
					<#if occupationalExposureRiskFactorsName??>
					<!-- 职业暴露危险因素名称 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/occupational-exposure-risk-factors-name">
						<valueString value="${occupationalExposureRiskFactorsName}" />
					</extension>
					</#if>
					<#if occupationalProtectionMeasures??>
					<!-- 职业防护措施标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/occupational-protection-measures">
						<valueBoolean value="${occupationalProtectionMeasures?then('true','false')}" />
					</extension>
					</#if>
					<title value="职业暴露史章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="10161-8" />
							<display value="HISTORY OF OCCUPATIONAL EXPOSURE" />
						</coding>
					</code>
				</section>
				<!-- 生活方式章节 -->
				<section>
					<#if physicalActivityFrequencyCode??>
					<!-- 身体活动频率代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/physical-activity-frequency-code">
						<valueCode value="${physicalActivityFrequencyCode}" />
					</extension>
					</#if>
					<#if eachExerciseTime??>
					<!--每次锻炼时间 （min）-->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/each-exercise-time">
						<valueDecimal value="${eachExerciseTime?string('#')}" />
					</extension>
					</#if>
					<#if adhereToExerciseTime??>
					<!--坚持锻炼时间 （年）-->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/adhere-to-exercise-time">
						<valueDecimal value="${adhereToExerciseTime?string('#')}" />
					</extension>
					</#if>
					<#if exerciseMode??>
					<!-- 锻炼方式-->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/exercise-mode">
						<valueString value="${exerciseMode}" />
					</extension>
					</#if>
					<#if dietCode??>
					<!-- 饮食习惯代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/diet-code">
						<valueCode value="${dietCode}" />
					</extension>
					</#if>
					<#if smokingStatus??>
					<!-- 吸烟状况-->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/smoking-status">
						<valueString value="${smokingStatus}" />
					</extension>
					</#if>
					<#if daySmokingAmount??>
					<!-- 日吸烟量 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/day-smoking-amount">
						<valueDecimal value="${daySmokingAmount?string('#')}" />
					</extension>
					</#if>
					<#if startSmokingAge??>
					<!-- 开始吸烟年龄（岁） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/start-smoking-age">
						<valueDecimal value="${startSmokingAge?string('#')}" />
					</extension>
					</#if>
					<#if smokingCessationAge??>
					<!-- 戒烟年龄（岁） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/smoking-cessation-age">
						<valueDecimal value="${smokingCessationAge?string('#')}" />
					</extension>
					</#if>
					<#if drinkingFrequency??>
					<!-- 饮酒频率代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/drinking-frequency">
						<valueCode value="${drinkingFrequency}" />
					</extension>
					</#if>
					<#if drinkingPerDay??>
					<!-- 日饮酒量（mL） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/drinking-per-day">
						<valueDecimal value="${drinkingPerDay?string('#')}" />
					</extension>
					</#if>
					<#if ifDrinking??>
					<!--饮酒标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/if-drinking">
						<valueBoolean value="${ifDrinking?then('true','false')}" />
					</extension>
					</#if>
					<#if abstinenceAge??>
					<!-- 戒酒年龄（岁） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/abstinence-age">
						<valueDecimal value="${abstinenceAge?string('#')}" />
					</extension>
					</#if>
					<#if drinkingAge??>
					<!-- 开始饮酒年龄（岁） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/drinking-age">
						<valueDecimal value="${drinkingAge?string('#')}" />
					</extension>
					</#if>
					<#if abstinenceSign??>
					<!--戒酒标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/abstinence-sign">
						<valueBoolean value="${abstinenceSign?then('true','false')}" />
					</extension>
					</#if>
					<#if drinkingTypeCode??>
					<!-- 饮酒种类代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/drinking-type-code">
						<valueCode value="${drinkingTypeCode}" />
					</extension>
					</#if>
					<title value="生活方式章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="99999-24" />
							<display value="Life style" />
						</coding>
					</code>
				</section>
				<!-- 健康评估章节 -->
				<section>
					<#if elderlyHealthStatusAssessmentCode??>
					<!-- 老年人健康状态自我评估代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/elderly-health-status-assessment-code">
						<valueCode value="${elderlyHealthStatusAssessmentCode}" />
					</extension>
					</#if>
					<#if elderlySelfAssessmentCode??>
					<!-- 老年人生活自理能力自我评估代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/elderly-self-assessment-code">
						<valueCode value="${elderlySelfAssessmentCode}" />
					</extension>
					</#if>
					<#if screeningCognitiveStateClassificationCode??>
					<!-- 认知状态粗筛结果分类代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/screening-cognitive-state-classification-code">
						<valueCode value="${screeningCognitiveStateClassificationCode}" />
					</extension>
					</#if>
					<#if cognitiveFunctionScore??>
					<!-- 老年人认知功能评分 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/cognitive-function-score">
						<valueDecimal value="${cognitiveFunctionScore?string('#')}" />
					</extension>
					</#if>
					<#if theEmotionalStateOfCoarseCode??>
					<!-- 情感状态粗筛结果代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/the-emotional-state-of-coarse-code">
						<valueCode value="${theEmotionalStateOfCoarseCode}" />
					</extension>
					</#if>
					<#if geriatricDepressionScore??>
					<!-- 老年人抑郁评分 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/geriatric-depression-score">
						<valueDecimal value="${geriatricDepressionScore?string('#')}" />
					</extension>
					</#if>
					<#if healthEvaluationAbnormalSigns??>
					<!--健康评价异常标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/health-evaluation-abnormal-signs">
						<valueBoolean value="${healthEvaluationAbnormalSigns?then('true','false')}" />
					</extension>
					</#if>
					<#if healthEvaluationExceptionDescription??>
					<!-- 健康评价异常描述-->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/health-evaluation-exception-description">
						<valueString value="${healthEvaluationExceptionDescription}" />
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
					<#if healthInstructionCode??>
					<!-- 健康指导代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/health-instruction-code">
						<valueCode value="${healthInstructionCode}" />
					</extension>
					</#if>
					<#if riskFactorControlCode??>
					<!-- 危险因素控制建议代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/risk-factor-control-code">
						<valueCode value="${riskFactorControlCode}" />
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
			</Composition>
		</resource>
	</entry>
</Bundle>

