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
			<!-- 资源：重性精神疾病患者个人信息登记 -->
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
						 <#if gender??>
						<!-- 性别 -->
						<gender value="${mappingValue('GBT22611',gender)!''}" />
						</#if>
						<#if birthdate??>
                        <!-- 出生日期 -->
                        <birthDate value="${birthdate?string("yyyy-MM-dd")}" />
                        </#if>
						<!-- 联系人的信息 -->
						<contact>
							<#if relationship ??>
					        <relationship>
					            <coding>
					                <!-- 联系人关系代码命名空间 -->
					                <system value="urn:oid:2.16.156.10011.2.3.3.8" />
					                <!-- 联系人关系代码 -->
					                <code value="${relationship}" />
					            </coding>
					        </relationship>
					        </#if>
					        <#if contactsName ??>
							<name>
								<!-- 联系人姓名 -->
								<text value="${contactsName}" />
							</name>
							</#if>
							<#if contactsPhone ??>
					        <telecom>
					            <!-- 联系人联系方式代码 -->
					            <system value="phone" />
					            <!-- 联系人电话号码 -->
					            <value value="${contactsPhone}" />
					            <use value="mobile" />
					        </telecom>
					        </#if>
							 <address>
					            <#if contactsHomeRoad ??>
					            <!-- 地址-村（街、路、弄等） -->
					            <extension
					                url="http://www.nestvision.com/platform/app/data/v1/text/address-road">
					                <valueString value="${contactsHomeRoad}" />
					            </extension>
					            </#if>
					            <#if contactsHomeHouseNo ??>
					            <!--地址-门牌号码 -->
					            <extension
					                url="http://www.nestvision.com/platform/app/data/v1/text/house-no">
					                <valueString value="${contactsHomeHouseNo}" />
					            </extension>
					            </#if>
					            <!-- 地址类别代码:现居住地址 -->
					            <use value="temp" />
					            <#if contactsHomeText ??>
					            <!-- 联系人地址详细信息 -->
					            <text value="${contactsHomeText}" />
					            </#if>
					            <#if contactsHomeLine ??>
					            <!-- 地址-乡（镇、街道办事处） -->
					            <line value="${contactsHomeLine}" />
					            </#if>
					            <#if contactsHomeCity ??>
					            <!-- 地址-市（地区） -->
					            <city value="${contactsHomeCity}" />
					            </#if>
					            <#if contactsHomeDistrict ??>
					            <!-- 地址-县（区） -->
					            <district value="${contactsHomeDistrict}" />
					            </#if>
					            <#if contactsHomeState ??>
					            <!-- 地址-省（自治区、直辖市） -->
					            <state value="${contactsHomeState}" />
					            </#if>
					        </address>
						</contact>
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
				<!-- 重性精神疾病患者个人信息登记id -->
				<identifier>
					<system
						value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/severe-mental-illness-personal-information-registration-id" />
					<#if smipirId??>
					<value value="${smipirId}" />
					</#if>
				</identifier>
				<#if date??>
				<!-- 记录日期 -->
				<date value="${date?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
				</#if>
				<!-- 文档类型：重性精神疾病患者个人信息登记 -->
				<type>
					<coding>
						<system value="2.16.156.10011.2.4" />
						<code value="HSDB04.03" />
					</coding>
					<text value="重性精神疾病患者个人信息登记" />
				</type>
				<!-- 文档标题：重性精神疾病患者个人信息登记 -->
				<title value="重性精神疾病患者个人信息登记" />
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
				<!--知情同意章节-->
				<section>
					<#if informedConsentManagementMark??>
					<!-- 知情同意管理标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/informed-consent-management-mark">
						<valueBoolean value="${informedConsentManagementMark?then('true','false')}" />
					</extension>
					</#if>
					<#if informedConsentSignature??>
					<!-- 知情同意签字人姓名 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/informed-consent-signature">
						<valueString value="${informedConsentSignature}" />
					</extension>
					</#if>
					<#if informedConsentSignatureDate??>
					<!-- 知情同意签字日期 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/datetime/informed-consent-signature-date">
						<valueDateTime value="${informedConsentSignatureDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</extension>
					</#if>
					<title value="知情同意章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="34895-3" />
							<display value="EDUCATION NOTE" />
						</coding>
					</code>
				</section>
				<!--重性精神病患者健康史章节-->
				<section>
					<#if severeMentalIllnessPatientsFirstOnsetAge??>
					<!-- 重性精神疾病患者首次发病年龄（岁） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/severe-mental-illness-patients-first-onset-age">
						<valueDecimal value="${severeMentalIllnessPatientsFirstOnsetAge?string('#')}" />
					</extension>
					</#if>
					<#if mentalSymptomCode??>
					<!-- 精神症状代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/mental-symptom-code">
						<valueCode value="${mentalSymptomCode}" />
					</extension>
					</#if>
					<#if previousOutpatientTreatmentCode??>
					<!-- 既往门诊治疗情况代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/previous-outpatient-treatment-code">
						<valueCode value="${previousOutpatientTreatmentCode}" />
					</extension>
					</#if>
					<#if firstTreatmentAntipsychoticDate??>
					<!-- 首次抗精神神病治疗日期 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/datetime/first-treatment-antipsychotic-date">
						<valueDateTime value="${firstTreatmentAntipsychoticDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</extension>
					</#if>
					<#if pastPsychiatricHospitalTimes??>
					<!-- 既往精神专科住院次数 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/past-psychiatric-hospital-times">
						<valueInteger value="${pastPsychiatricHospitalTimes}" />
					</extension>
					</#if>
					<#if treatmentResultCode??>
					<!-- 疾病转归代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/treatment-result-code">
						<valueCode value="${treatmentResultCode}" />
					</extension>
					</#if>
					<title value="重性精神病患者健康史章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="99999-34" />
							<display value="Health history of patients with severe mental illness" />
						</coding>
					</code>
				</section>
				<!-- 主要健康问题章节 -->
				<section>
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
					<#if economicCode??>
					<!-- 经济情况代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/economic-code">
						<valueCode value="${economicCode}" />
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
				<!-- 诊断记录章节 -->
				<section>
					<#if severeMentalIllnessNameCode??>
					<!-- 重性精神疾病名称代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/severe-mental-illness-name-code">
						<valueCode value="${severeMentalIllnessNameCode}" />
					</extension>
					</#if>
					<#if diagnosticMedicalInstitutionName??>
					<!-- 确诊医疗机构名称 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/diagnostic-medical-institution-name">
						<valueString value="${diagnosticMedicalInstitutionName}" />
					</extension>
					</#if>
					<title value="诊断记录章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="29548-5" />
							<display value="Diagnosis" />
						</coding>
					</code>
				</section>
				<!-- 健康评估章节 -->
				<section>
					<#if specialistAdvice??>
					<!-- 专科医生意见 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/specialist-advice">
						<valueString value="${specialistAdvice}" />
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
			</Composition>
		</resource>
	</entry>
</Bundle>

