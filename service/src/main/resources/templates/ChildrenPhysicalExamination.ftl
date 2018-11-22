<#ftl output_format="XML">
<Bundle xmlns="http://hl7.org/fhir">
	<!-- bundle业务类型：健康档案（必填） -->
	<meta>
		<tag>
			<system
				value="http://www.nestvision.com/platform/app/data/v1/code/bundle-business-type" />
			<code value="02" />
		</tag>
	</meta>
	<type value="document" />
	<entry>
		<fullUrl
			value="http://fhir.healthintersections.com.au/open/Composition/180f219f-97a8-486d-99d9-ed631fe4fc57" />
		<resource>
			<!-- 资源：儿童健康体检 -->
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
						<birthDate value="${birthdate?string('yyyy-MM-dd')}" />
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
							</Medication>
						</contained>
						<#if freqCode??>
						<!-- 频率代码 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/freq-code">
							<valueCode value="${freqCode}" />
						</extension>
						</#if>
						<!-- 药品信息 -->
						<medicationReference>
							<reference value="#me1med1" />
						</medicationReference>
						<dosageInstruction>
							<doseQuantity>
								<#if medicationName??>
      							<!-- 用药次剂量 -->
								<value value="${onceValue?string('#')}" />
								</#if>
								<#if medicationName??>
      							<!-- 用药次剂量单位 -->
								<unit value="${onceUnit}" />
								</#if>
							</doseQuantity>
						</dosageInstruction>
					</MedicationOrder>
				</contained>
				<!-- 儿童健康体检id -->
				<identifier>
					<system
						value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/children-physical-examination" />
					<value value="${childrenPhysicalExaminationId}" />
				</identifier>
				<!-- 记录日期 -->
				<date value="${date?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
				<!-- 文档类型：儿童健康体检 -->
				<type>
					<coding>
						<system value="2.16.156.10011.2.4" />
						<code value="HSDB01.03" />
					</coding>
					<text value="儿童健康体检" />
				</type>
				<!-- 文档标题：儿童健康体检 -->
				<title value="儿童健康体检" />
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
				<!-- 生命体征章节 -->
				<section>
					<#if birthLength??>
					<!-- 出生身长 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/birth-length">
						<valueDecimal value="${birthLength?string('#')}" />
					</extension>
					</#if>
					<#if birthWeight??>
					<!-- 出生体重（g） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/birth-weight">
						<valueDecimal value="${birthWeight?string('#')}" />
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
				<!-- 一般外观章节 -->
				<section>
					<#if faceCode??>
					<!-- 新生儿面色代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/face-code">
						<valueCode value="${faceCode}" />
					</extension>
					</#if>
					<#if ricketsSymptomCode??>
					<!-- 可疑佝偻病症状代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/rickets-symptom-code">
						<valueCode value="${ricketsSymptomCode}" />
					</extension>
					</#if>
					<#if ricketsSignCode??>
					<!-- 可疑佝偻病体征代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/rickets-sign-code">
						<valueCode value="${ricketsSignCode}" />
					</extension>
					</#if>
					<title value="一般外观章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="10210-3" />
							<display value="GENERAL STATUS" />
						</coding>
					</code>
				</section>
				<!-- 皮肤章节 -->
				<section>
					<#if skinInspectAbnormalMark??>
					<!-- 皮肤检查异常标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/skin-inspect-abnormal-mark">
						<valueBoolean value="${skinInspectAbnormalMark?then('true','false')}" />
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
				<!-- 头部章节 -->
				<section>
					<#if anteriorFontanelleClosedSign??>
					<!-- 前囟闭合标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/anterior-fontanelle-closed-sign">
						<valueBoolean value="${anteriorFontanelleClosedSign?then('true','false')}" />
					</extension>
					</#if>
					<#if transverseDiameterAnteriorFontanel??>
					<!-- 前囟横径 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/transverse-diameter-anterior-fontanel">
						<valueDecimal value="${transverseDiameterAnteriorFontanel?string('#')}" />
					</extension>
					</#if>
					<#if anteriorLongitudinalDiameter??>
					<!-- 前囟纵径 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/anterior-longitudinal-diameter">
						<valueDecimal value="${anteriorLongitudinalDiameter?string('#')}" />
					</extension>
					</#if>
					<#if anteriorFontanelTensionCode??>
					<!-- 前囟张力代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/anterior-fontanel-tension-code">
						<valueCode value="${anteriorFontanelTensionCode}" />
					</extension>
					</#if>
					<title value="头部章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="10199-8" />
							<display value="HEAD" />
						</coding>
					</code>
				</section>
				<!-- 颈部章节 -->
				<section>
					<#if neckMass??>
					<!-- 颈部包块标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/neck-mass">
						<valueBoolean value="${neckMass?then('true','false')}" />
					</extension>
					</#if>
					<#if cervicalMassExaminationResults??>
					<!-- 颈部包块检查结果描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/cervical-mass-examination-results">
						<valueString value="${cervicalMassExaminationResults}" />
					</extension>
					</#if>
					<title value="颈部章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="11411-6" />
							<display value="NECK" />
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
					<#if eyeAppearanceCheck??>
					<!-- 眼外观检查异常标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/eye-appearance-check">
						<valueBoolean value="${eyeAppearanceCheck?then('true','false')}" />
					</extension>
					</#if>
					<#if eyeAppearanceInspectionResults??>
					<!-- 眼外观检查异常结果描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/eye-appearance-inspection-results">
						<valueString value="${eyeAppearanceInspectionResults}" />
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
					<#if earAppearanceAbnormalSign??>
					<!-- 耳外观检查异常标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/ear-appearance-abnormal-sign">
						<valueBoolean value="${earAppearanceAbnormalSign?then('true','false')}" />
					</extension>
					</#if>
					<#if earAppearanceResult??>
					<!-- 耳外观检查异常结果描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/ear-appearance-result">
						<valueString value="${earAppearanceResult}" />
					</extension>
					</#if>
					<#if hearingScreeningResultsCode??>
					<!-- 新生儿听力筛查结果代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/hearing-screening-results-code">
						<valueCode value="${hearingScreeningResultsCode}" />
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
				<!-- 口腔、咽喉和牙齿检查章节 -->
				<section>
					<#if oralExaminationAbnormalSign??>
					<!-- 口腔检查异常标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/oral-examination-abnormal-sign">
						<valueBoolean value="${oralExaminationAbnormalSign?then('true','false')}" />
					</extension>
					</#if>
					<#if oralExaminationResults??>
					<!-- 口腔检查异常结果描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/oral-examination-results">
						<valueString value="${oralExaminationResults}" />
					</extension>
					</#if>
					<#if teethingNum??>
					<!-- 出牙数 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/teething-num">
						<valueDecimal value="${teethingNum?string('#')}" />
					</extension>
					</#if>
					<#if dentalCariesNum??>
					<!-- 龋齿数 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/dental-caries-num">
						<valueDecimal value="${dentalCariesNum?string('#')}" />
					</extension>
					</#if>
					<title value="口腔、咽喉和牙齿检查章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="10201-2" />
							<display value="EMOUTH and THROAT and TEETH" />
						</coding>
					</code>
				</section>
				<!-- 心脏章节 -->
				<section>
					<#if cardiacAuscultationAbnormalSign??>
					<!-- 心脏听诊异常标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/cardiac-auscultation-abnormal-sign">
						<valueBoolean value="${cardiacAuscultationAbnormalSign?then('true','false')}" />
					</extension>
					</#if>
					<#if cardiacAuscultationResults??>
					<!-- 心脏听诊异常结果描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/cardiac-auscultation-results">
						<valueString value="${cardiacAuscultationResults}" />
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
				<!-- 呼吸系统章节 -->
				<section>
					<#if lungAuscultationAbnormalSign??>
					<!-- 肺部听诊异常标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/lung-auscultation-abnormal-sign">
						<valueBoolean value="${lungAuscultationAbnormalSign?then('true','false')}" />
					</extension>
					</#if>
					<#if lungAuscultationResults??>
					<!-- 肺部听诊异常结果描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/lung-auscultation-results">
						<valueString value="${lungAuscultationResults}" />
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
				<!-- 腹部章节 -->
				<section>
					<#if abdominalPalpationAbnormalSign??>
					<!-- 腹部触诊异常标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/abdominal-palpation-abnormal-sign">
						<valueBoolean value="${abdominalPalpationAbnormalSign?then('true','false')}" />
					</extension>
					</#if>
					<#if abdominalPalpationResults??>
					<!-- 腹部触诊异常结果描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/abdominal-palpation-results">
						<valueString value="${abdominalPalpationResults}" />
					</extension>
					</#if>
					<#if umbilicalCord??>
					<!-- 脐带脱落标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/umbilical-cord">
						<valueBoolean value="${umbilicalCord?then('true','false')}" />
					</extension>
					</#if>
					<#if umbilicalCordExaminationResultsCode??>
					<!-- 脐带检查结果代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/umbilical-cord-examination-results-code">
						<valueCode value="${umbilicalCordExaminationResultsCode}" />
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
				<!-- 四肢章节 -->
				<section>
					<#if limbActivityAbnormalSign??>
					<!-- 四肢活动度异常标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/limb-activity-abnormal-sign">
						<valueBoolean value="${limbActivityAbnormalSign?then('true','false')}" />
					</extension>
					</#if>
					<#if limbMobilityAbnormalResults??>
					<!-- 四肢活动度异常结果描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/limb-mobility-abnormal-results">
						<valueString value="${limbMobilityAbnormalResults}" />
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
				<!-- 脊柱章节 -->
				<section>
					<#if spinalExaminationAbnormalSign??>
					<!-- 脊柱检查异常标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/spinal-examination-abnormal-sign">
						<valueBoolean value="${spinalExaminationAbnormalSign?then('true','false')}" />
					</extension>
					</#if>
					<#if spinalExaminationResults??>
					<!-- 脊柱检查异常结果描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/spinal-examination-results">
						<valueString value="${spinalExaminationResults}" />
					</extension>
					</#if>
					<title value="脊柱章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="32476-4" />
							<display value="Physical findings of spine" />
						</coding>
					</code>
				</section>
				<!-- 生殖器章节 -->
				<section>
					<#if externalGenitalOrgansAbnormalSign??>
					<!-- 外生殖器检查异常标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/external-genital-organs-abnormal-sign">
						<valueBoolean value="${externalGenitalOrgansAbnormalSign?then('true','false')}" />
					</extension>
					</#if>
					<#if externalGenitalOrgansResults??>
					<!-- 外生殖器检查异常结果描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/external-genital-organs-results">
						<valueString value="${externalGenitalOrgansResults}" />
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
				<!-- 直肠章节 -->
				<section>
					<#if anusAbnormalSign??>
					<!-- 肛门检查异常标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/anus-abnormal-sign">
						<valueBoolean value="${anusAbnormalSign?then('true','false')}" />
					</extension>
					</#if>
					<#if anusExaminationResults??>
					<!-- 肛门检查异常结果描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/anus-examination-results">
						<valueString value="${anusExaminationResults}" />
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
				<!-- 儿童健康史章节 -->
				<section>
					<#if outdoorActivityLength??>
					<!-- 户外活动时长 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/outdoor-activity-length">
						<valueDecimal value="${outdoorActivityLength?string('#')}" />
					</extension>
					</#if>
					<#if twoFollowUpVisitsMark??>
					<!-- 两次随访间患病标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/two-follow-up-visits-mark">
						<valueBoolean value="${twoFollowUpVisitsMark?then('true','false')}" />
					</extension>
					</#if>
					<#if pneumoniaTimes??>
					<!-- 两次随访间患肺炎住院次数 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/pneumonia-times">
						<valueInteger value="${pneumoniaTimes}" />
					</extension>
					</#if>
					<#if diarrheaTimes??>
					<!-- 两次随访间患腹泻住院次数 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/diarrhea-times">
						<valueInteger value="${diarrheaTimes}" />
					</extension>
					</#if>
					<#if traumaTimes??>
					<!-- 两次随访间因外伤住院次数 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/trauma-times">
						<valueInteger value="${traumaTimes}" />
					</extension>
					</#if>
					<#if otherDiseaseCondition??>
					<!-- 两次随访间患其他疾病情况 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/other-disease-condition">
						<valueString value="${otherDiseaseCondition}" />
					</extension>
					</#if>
					<title value="儿童健康史章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="99999-30" />
							<display value="Child health history" />
						</coding>
					</code>
				</section>
				<!-- 实验室检查章节 -->
				<section>
					<#if hemoglobin??>
					<!-- 血红蛋白(g/L) -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/hemoglobin">
						<valueDecimal value="${hemoglobin?string('#')}" />
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
					<#if heightEvaluationResultCode??>
					<!-- 年龄别身高评价结果代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/height-evaluation-result-code">
						<valueCode value="${heightEvaluationResultCode}" />
					</extension>
					</#if>
					<#if weightEvaluationResultCode??>
					<!-- 年龄别体重评价结果代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/weight-evaluation-result-code">
						<valueCode value="${weightEvaluationResultCode}" />
					</extension>
					</#if>
					<#if physiqueEvaluationResultCode??>
					<!-- 体格发育评价代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/physique-evaluation-result-code">
						<valueCode value="${physiqueEvaluationResultCode}" />
					</extension>
					</#if>
					<#if childEvaluationAdoptMark??>
					<!-- 儿童发育评估通过标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/child-evaluation-adopt-mark">
						<valueBoolean value="${childEvaluationAdoptMark?then('true','false')}" />
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
					<title value="健康指导章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="69730-0" />
							<display value="Instructions" />
						</coding>
					</code>
				</section>
				<!-- 转诊建议章节 -->
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
				<!-- 下次随访安排章节 -->
				<section>
					<#if nextFollowUpDate??>
					<!-- 下次随访日期 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/datetime/next-follow-up-date">
						<valueDateTime value="${nextFollowUpDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</extension>
					</#if>
					<#if nextVisitLocation??>
					<!-- 下次访视地点 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/next-visit-location">
						<valueString value="${nextVisitLocation}" />
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