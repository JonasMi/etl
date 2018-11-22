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
			<!-- 资源：产后42天健康体检 -->
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
				<!-- 产后42天健康体检id -->
				<identifier>
					<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/postpartum-42days-health-examination-id" />
					<#if postpartum42daysHealthExaminationId??>
					<value value="${postpartum42daysHealthExaminationId}" />
					</#if>
				</identifier>
				<#if date??>
				<!-- 记录日期 -->
				<date value="${date?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
				</#if>
				<!-- 文档类型：产后42天健康体检 -->
				<type>
					<coding>
						<system value="2.16.156.10011.2.4" />
						<code value="HSDB02.04" />
					</coding>
					<text value="产后42天健康体检" />
				</type>
				<!-- 文档标题：产后42天健康体检 -->
				<title value="产后42天健康体检" />
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
				<!-- 主要健康问题章节 -->
				<section>
				    <#if healthStatusDetails??>
					<!-- 健康状况详细描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/health-status-details">
						<valueString value="${healthStatusDetails}" />
					</extension>
					</#if>
					<#if mentalStateDetailedDescription??>
					<!-- 心理状况详细描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/mental-state-detailed-description">
						<valueString value="${mentalStateDetailedDescription}" />
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
					<title value="生命体征章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="8716-3" />
							<display value="VITAL SIGNS" />
						</coding>
					</code>
				</section>
				<!-- 乳腺章节 -->
				<section>
					<#if breastExaminationResultsCode??>
					<!--乳腺检查结果代码 -->
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
					<#if lochiaAbnormalSign??>
					<!-- 恶露异常标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/lochia-abnormal-sign">
						<valueBoolean value="${lochiaAbnormalSign?then('true','false')}" />
					</extension>
					</#if>
					<#if uterineBodyAbnormalSign??>
					<!-- 宫体异常标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/uterine-body-abnormal-sign">
						<valueBoolean value="${uterineBodyAbnormalSign?then('true','false')}" />
					</extension>
					</#if>
					<#if woundHealingStatusCode??>
					<!--伤口愈合状况代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/wound-healing-status-code">
						<valueCode value="${woundHealingStatusCode}" />
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

