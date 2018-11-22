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
		<fullUrl value="http://fhir.healthintersections.com.au/open/Composition/180f219f-97a8-486d-99d9-ed631fe4fc57" />
		<resource>
			<!-- 资源：新生儿家庭访视 -->
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
							<state  value="${homeState}" />
							</#if>
					    </address>
						<contact>
							<#if fatherOccupationCd??>
							<!-- 职业代码 -->
						    <extension url="urn:oid:2.16.156.10011.2.3.3.7">
						        <valueCode value="${fatherOccupationCd}" />
						    </extension>
							</#if>
							<relationship>
								<coding>
									<!-- 联系人关系代码命名空间 -->
									<system value="urn:oid:2.16.156.10011.2.3.3.8" />
									<!-- 联系人关系代码 -->
									<code value="51" />
								</coding>
							</relationship>
							<#if fatherName??>
							<name>
								<!-- 姓名 -->
								<text value="${fatherName}" />
							</name>
							</#if>
						</contact>
						<contact>
							<#if motherOccupationCd??>
							<!-- 职业代码 -->
						    <extension url="urn:oid:2.16.156.10011.2.3.3.7">
						        <valueCode value="${motherOccupationCd}" />
						    </extension>
							</#if>
							<relationship>
								<coding>
									<!-- 联系人关系代码命名空间 -->
									<system value="urn:oid:2.16.156.10011.2.3.3.8" />
									<!-- 联系人关系代码 -->
									<code value="52" />
								</coding>
							</relationship>
							<#if motherName??>
							<name>
								<!-- 姓名 -->
								<text value="${motherName}" />
							</name>
							</#if>
						</contact>
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
				<!-- 新生儿家庭访视id -->
				<identifier>
					<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/neonatal-family-visit-id" />
					<value value="${neonatalFamilyVisitId}" />
				</identifier>
				<!-- 记录日期 -->
				<date value="${date?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
				<!-- 文档类型：新生儿家庭访视 -->
				<type>
					<coding>
						<system value="2.16.156.10011.2.4" />
						<code value="HSDB01.02" />
					</coding>
					<text value="新生儿家庭访视" />
				</type>
				<!-- 文档标题：新生儿家庭访视 -->
				<title value="新生儿家庭访视" />
				<!-- 状态：preliminary初步 final最终amended修订entered-in-error错误 -->
				<status value="final" />
				<!-- 保密等级：U:不受限制的 L:低等级 M:中等 N:常规 R:保密的 V:十分机密的 -->
				<confidentiality value="N" />
				<!-- 新生儿信息 -->
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
				<!-- 主要健康问题章节 -->
				<section>
					<#if gestationalWeek??>
					<!-- 出生孕周 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/gestational-week">
						<valueDecimal value="${gestationalWeek?string('#')}" />
					</extension>
					</#if>
					<#if midwiferyOrganizationName??>
					<!-- 助产机构名称 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/midwifery-organization-name">
						<valueString value="${midwiferyOrganizationName}" />
					</extension>
					</#if>
					<#if maternalPregnancyComplications??>
					<!-- 母亲妊娠合并症 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/maternal-pregnancy-complications">
						<valueString value="${maternalPregnancyComplications}" />
					</extension>
					</#if>
					<#if modeDelivery??>
					<!-- 分娩方式 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/mode-delivery">
						<valueCode value="${modeDelivery}" />
					</extension>
					</#if>
					<#if asphyxiaNewbornMark??>
					<!-- 新生儿窒息标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/asphyxia-newborn-mark">
						<valueBoolean value="${asphyxiaNewbornMark?then('true','false')}" />
					</extension>
					</#if>
					<#if apgarScore??>
					<!-- Apgar评分值 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/apgar-score">
						<valueDecimal value="${apgarScore?string('#')}" />
					</extension>
					</#if>
					<#if feedingMode??>
					<!-- 喂养方式 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/feeding-mode">
						<valueCode value="${feedingMode}" />
					</extension>
					</#if>
					<#if atTimesDay??>
					<!-- 每天吃奶次数 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/at-times-day">
						<valueDecimal value="${atTimesDay?string('#')}" />
					</extension>
					</#if>
					<#if dailyFeedingAmount??>
					<!-- 每天吃奶量(ml) -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/daily-feeding-amount">
						<valueDecimal value="${dailyFeedingAmount?string('#')}" />
					</extension>
					</#if>
					<#if vomitingMark??>
					<!-- 呕吐标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/vomiting-mark">
						<valueBoolean value="${vomitingMark?then('true','false')}" />
					</extension>
					</#if>
					<#if childrenStoolCharacterCode??>
					<!-- 新生儿大便性状代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/children-stool-character-code">
						<valueCode value="${childrenStoolCharacterCode}" />
					</extension>
					</#if>
					<#if stoolFrequency??>
					<!-- 大便次数 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/stool-frequency">
						<valueDecimal value="${stoolFrequency?string('#')}" />
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
					<title value="耳章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="10195-6" />
							<display value="EAR" />
						</coding>
					</code>
				</section>
				<!-- 实验室检查章节 -->
				<section>
					<#if neonatalDiseaseScreeningCode??>
					<!-- 新生儿疾病筛查代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/neonatal-disease-screening-code">
						<valueCode value="${neonatalDiseaseScreeningCode}" />
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
					<#if birthLength??>
					<!-- 身长（cm） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/birth-length">
						<valueDecimal value="${birthLength?string('#')}" />
					</extension>
					</#if>
					<#if birthWeight??>
					<!-- 体重（g） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/birth-weight">
						<valueDecimal value="${birthWeight?string('#')}" />
					</extension>
					</#if>
					<#if newbornBirthWeight??>
					<!-- 新生儿出生体重（g） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/newborn-birth-weight">
						<valueDecimal value="${newbornBirthWeight?string('#')}" />
					</extension>
					</#if>
					<#if newbornBirthLength??>
					<!-- 出生身长（cm） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/newborn-birth-length">
						<valueDecimal value="${newbornBirthLength?string('#')}" />
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
				<!-- 皮肤章节 -->
				<section>
					<#if skinTestResultCode??>
					<!-- 皮肤检查结果代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/skin-test-result-code">
						<valueCode value="${skinTestResultCode}" />
					</extension>
					</#if>
					<#if aundiceSiteCode??>
					<!-- 黄疸部位代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/aundice-site-code">
						<valueCode value="${aundiceSiteCode}" />
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
				<!-- 一般外观章节 -->
				<section>
					<#if faceCode??>
					<!-- 新生儿面色代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/face-code">
						<valueCode value="${faceCode}" />
					</extension>
					</#if>
					<#if neonatalMalformation??>
					<!-- 新生儿畸形标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/neonatal-malformation">
						<valueBoolean value="${neonatalMalformation?then('true','false')}" />
					</extension>
					</#if>
					<#if neonatalMalformationDescription??>
					<!-- 新生儿畸形描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/neonatal-malformation-description">
						<valueString value="${neonatalMalformationDescription}" />
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
				<!-- 鼻章节 -->
				<section>
					<#if nasalExaminationAbnormalSigns??>
					<!-- 鼻检查异常标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/nasal-examination-abnormal-signs">
						<valueBoolean value="${nasalExaminationAbnormalSigns?then('true','false')}" />
					</extension>
					</#if>
					<#if nasalExaminationResults??>
					<!-- 鼻检查异常结果描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/nasal-examination-results">
						<valueString value="${nasalExaminationResults}" />
					</extension>
					</#if>
					<title value="鼻章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="10203-8" />
							<display value="NOSE" />
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
					<title value="口腔、咽喉和牙齿检查章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="10201-2" />
							<display value="EMOUTH and THROAT and TEETH" />
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

