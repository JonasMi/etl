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
			<!-- 资源：首次产前随访服务 -->
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
						<contact>
							<relationship>
								<coding>
									<!-- 联系人关系代码命名空间 -->
									<system value="urn:oid:2.16.156.10011.2.3.3.8" />
									<#if relationship??>
					                <!-- 联系人关系代码 -->
					                <code value="${relationship}" />
					                </#if>
								</coding>
							</relationship>
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
				<!-- 首次产前随访服务id -->
				<identifier>
					<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/first-prenatal-follow-up-service" />
					<#if firstPrenatalFollowUpServiceId??>
					<value value="${firstPrenatalFollowUpServiceId}" />
					</#if>
				</identifier>
				<#if date??>
				<!-- 记录日期 -->
				<date value="${date?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
				</#if>
				<!-- 文档类型：首次产前随访服务 -->
				<type>
					<coding>
						<system value="2.16.156.10011.2.4" />
						<code value="HSDB02.01" />
					</coding>
					<text value="首次产前随访服务" />
				</type>
				<!-- 文档标题：首次产前随访服务 -->
				<title value="首次产前随访服务" />
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
				<!-- 孕产史章节 -->
				<section>
					<#if gravidity??>
					<!-- 孕次 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/gravidity">
						<valueDecimal value="${gravidity?string('#')}" />
					</extension>
					</#if>
					<#if parity??>
					<!-- 产次 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/parity">
						<valueDecimal value="${parity?string('#')}" />
					</extension>
					</#if>
					<#if vaginalDeliveryTimes??>
					<!-- 阴道分娩次数 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/vaginal-delivery-times">
						<valueDecimal value="${vaginalDeliveryTimes?string('#')}" />
					</extension>
					</#if>
					<#if cesareanSection??>
					<!-- 阴道分娩次数 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/cesarean-section">
						<valueDecimal value="${cesareanSection?string('#')}" />
					</extension>
					</#if>
					<#if ifLastMenstrual??>
					<!-- 末次月经日期明确标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/if-last-menstrual">
						<valueBoolean value="${ifLastMenstrual?then('true','false')}" />
					</extension>
					</#if>
					<#if expectedChildbirthDate??>
					<!--预产期 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/datetime/expected-childbirth-date">
						<valueDateTime value="${expectedChildbirthDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</extension>
					</#if>
					<#if abortionTotalNumber??>
					<!-- 流产总次数 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/abortion-total-number">
						<valueDecimal value="${abortionTotalNumber?string('#')}" />
					</extension>
					</#if>
					<#if stillbirthCasesNumber??>
					<!-- 死产例数 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/stillbirth-cases-number">
						<valueDecimal value="${stillbirthCasesNumber?string('#')}" />
					</extension>
					</#if>
					<#if casesNumber??>
					<!-- 死胎例数 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/cases-number">
						<valueDecimal value="${casesNumber?string('#')}" />
					</extension>
					</#if>
					<#if neonatalDeathReciprocal??>
					<!-- 新生儿死亡倒数 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/neonatal-death-reciprocal">
						<valueDecimal value="${neonatalDeathReciprocal?string('#')}" />
					</extension>
					</#if>
					<#if birthDefectsNumber??>
					<!-- 出生缺陷儿例数 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/birth-defects-number">
						<valueDecimal value="${birthDefectsNumber?string('#')}" />
					</extension>
					</#if>
					<title value="孕产史章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="10162-6" />
							<display value="HISTORY OF PREGNANCIES" />
						</coding>
					</code>
				</section>
				<!-- 既往史章节 -->
				<section>
					<#if history??>
					<!--既往史 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/history">
						<valueString value="${history}" />
					</extension>
					</#if>
					<#if ifGynecologicSurgeryHistory??>
					<!--妇科手术史标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/if-gynecologic-surgery-history">
						<valueBoolean value="${ifGynecologicSurgeryHistory?then('true','false')}" />
					</extension>
					</#if>
					<#if gynecologicSurgeryHistory??>
					<!--妇科手术史 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/gynecologic-surgery-history">
						<valueString value="${gynecologicSurgeryHistory}" />
					</extension>
					</#if>
					<#if pregnancyComplications??>
					<!--妊娠合并症/并发症史 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/pregnancy-complications">
						<valueString value="${pregnancyComplications}" />
					</extension>
					</#if>
					<#if exposureHazardousFactors??>
					<!--接触有害因素类别代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/exposure-hazardous-factors">
						<valueCode value="${exposureHazardousFactors}" />
					</extension>
					</#if>
					<title value="既往史章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="11348-0" />
							<display value="HISTORY OF PAST ILLNESS" />
						</coding>
					</code>
				</section>
				<!-- 家族史章节 -->
				<section>
					<#if familyHistoryDisease??>
					<!-- 家族既往患病种类代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/family-history-disease">
						<valueCode value="${familyHistoryDisease}" />
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
				<!-- 生命体征章节 -->
				<section>
					<#if sbp??>
					<!--收缩压 (收缩压的测量值，计量单位为mmHg) -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/sbp">
						<valueInteger value="${sbp}" />
					</extension>
					</#if>
					<#if dbp??>
					<!--舒张压 (舒张压的测量值，计量单位为mmHg) -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/dbp">
						<valueInteger value="${dbp}" />
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
					<#if bodyMassIndex??>
					<!--体质指数 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/body-mass-index">
						<valueString value="${bodyMassIndex}" />
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
					<#if vaginaAbnormalSign??>
					<!-- 阴道异常标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/vagina-abnormal-sign">
						<valueBoolean value="${vaginaAbnormalSign?then('true','false')}" />
					</extension>
					</#if>
					<#if vaginaAbnormalDescribe??>
					<!-- 阴道异常描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/vagina-abnormal-describe">
						<valueString value="${vaginaAbnormalDescribe}" />
					</extension>
					</#if>
					<#if cervicalAbnormalSign??>
					<!-- 宫颈异常标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/cervical-abnormal-sign">
						<valueBoolean value="${cervicalAbnormalSign?then('true','false')}" />
					</extension>
					</#if>
					<#if cervicalAbnormalDescribe??>
					<!-- 宫颈异常描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/cervical-abnormal-describe">
						<valueString value="${cervicalAbnormalDescribe}" />
					</extension>
					</#if>
					<#if palaceAbnormalSign??>
					<!-- 宫体异常标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/palace-abnormal-sign">
						<valueBoolean value="${palaceAbnormalSign?then('true','false')}" />
					</extension>
					</#if>
					<#if palaceAbnormalDescribe??>
					<!-- 宫体异常描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/palace-abnormal-describe">
						<valueString value="${palaceAbnormalDescribe}" />
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
					<#if urineProtein??>
					<!-- 尿蛋白定量检测值（mg/24h） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/urine-protein">
						<valueDecimal value="${urineProtein?string('#')}" />
					</extension>
					</#if>
					<#if urineProteinQualitativeTestResultCode??>
					<!-- 尿蛋白定性检测结果代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/urine-protein-qualitative-test-result-code">
						<valueCode value="${urineProteinQualitativeTestResultCode}" />
					</extension>
					</#if>
					<#if niaotang??>
					<!-- 尿糖定量检测（mmol/L） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/niaotang">
						<valueDecimal value="${niaotang?string('#')}" />
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
					<!-- 白蛋白 -->
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
					<#if aboCd??>
					<!-- ABO血型代码 -->
					<extension url="urn:oid:2.16.156.10011.2.3.1.85">
						<valueCode value="${aboCd}" />
					</extension>
					</#if>
					<#if rhCd??>
					<!-- RH血型代码 -->
					<extension url="urn:oid:2.16.156.10011.2.3.1.250">
						<valueCode value="${rhCd}" />
					</extension>
					</#if>
					<#if vaginalSecretionExaminationResultCode??>
					<!-- 阴道分泌物检查结果代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/vaginal-secretion-examination-result-code">
						<valueCode value="${vaginalSecretionExaminationResultCode}" />
					</extension>
					</#if>
					<#if vaginalCleanerCode??>
					<!-- 阴道分泌物清洁度代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/vaginal-cleaner-code">
						<valueCode value="${vaginalCleanerCode}" />
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
					<#if bscanResultDescr??>
					<!--B超检查结果 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/bscan-result-descr">
						<valueString value="${bscanResultDescr}" />
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
				<!-- 健康评估章节 -->
				<section>
					<#if maternalHealthAssessment??>
					<!--孕产妇健康评估异常标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/maternal-health-assessment">
						<valueBoolean value="${maternalHealthAssessment?then('true','false')}" />
					</extension>
					</#if>
					<#if maternalHealthResultDescr??>
					<!--孕产妇健康评估异常结果描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/maternal-health-result-descr">
						<valueString value="${maternalHealthResultDescr}" />
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

