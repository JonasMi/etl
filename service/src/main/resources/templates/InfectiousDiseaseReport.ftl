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
			<!-- 资源：传染病报告 -->
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
						<#if rprAddrProvince??>
						<!-- 户籍登记所在地址的省、自治区或直辖市名称 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/rpr-addr-province">
							<valueString value="${rprAddrProvince}" />
						</extension>
						</#if>
						<#if rprAddrCity??>
						<!-- 户籍登记所在地址的市、地区或州的名称 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/rpr-addr-city">
							<valueString value="${rprAddrCity}" />
						</extension>
						</#if>
						<#if rprAddrArea??>
						<!-- 户籍登记所在地址的县（区）的名称 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/rpr-addr-area">
							<valueString value="${rprAddrArea}" />
						</extension>
						</#if>
						<#if rprAddrStreet??>
						<!-- 户籍登记所在地址的乡、镇或城市的街道办事处名称 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/rpr-addr-street">
							<valueString value="${rprAddrStreet}" />
						</extension>
						</#if>
						<#if rprAddrVillage??>
						<!-- 户籍登记所在地址的村或城市的街、路、里、弄等名称 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/rpr-addr-village">
							<valueString value="${rprAddrVillage}" />
						</extension>
						</#if>
						<#if rprAddrHouse??>
						<!-- 户籍登记所在地址的门牌号码 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/rpr-addr-house">
							<valueString value="${rprAddrHouse}" />
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
				<contained>
					<!-- 诊断 -->
					<Condition xmlns="http://hl7.org/fhir">
						<id value="c1" />
						<#if morbidityTypeCode??>
						<!-- 发病类别代码 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/morbidity-type-code">
							<valueCode value="${morbidityTypeCode}" />
						</extension>
						</#if>
						<#if infectiousDiseaseCategoryCode??>
						<!-- 传染病类别代码 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/infectious-disease-category-code">
							<valueCode value="${infectiousDiseaseCategoryCode}" />
						</extension>
						</#if>
						<#if infectiousDiseaseNameCode??>
						<!-- 传染病类别代码 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/infectious-disease-name-code">
							<valueCode value="${infectiousDiseaseNameCode}" />
						</extension>
						</#if>
						<#if otherInfectiousDiseasesName??>
						<!-- 其他法定管理及重点监测传染病名称 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/other-infectious-diseases-name">
							<valueString value="${otherInfectiousDiseasesName}" />
						</extension>
						</#if>
						<#if revisedDiseaseName??>
						<!-- 订正病名 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/revised-disease-name">
							<valueString value="${revisedDiseaseName}" />
						</extension>
						</#if>
						<patient />
						<code>
							<coding>
								<!--诊断编码 -->
								<system value="urn:oid:2.16.156.10011.2.3.3.11" />
								<!--诊断编码 -->
								<#if diagnosis??>
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
				<!-- 传染病报告id -->
				<identifier>
					<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/infectious-disease-report-id" />
					<#if infectiousDiseaseReportId??>
					<value value="${infectiousDiseaseReportId}" />
					</#if>
				</identifier>
				<#if date??>
				<!-- 记录日期 -->
				<date value="${date?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
				</#if>
				<!-- 文档类型：传染病报告 -->
				<type>
					<coding>
						<system value="2.16.156.10011.2.4" />
						<code value="HSDB03.02" />
					</coding>
					<text value="传染病报告" />
				</type>
				<!-- 文档标题：传染病报告 -->
				<title value="传染病报告" />
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
					<#if infectiousDiseaseFirstSymptomsDate??>
					<!-- 传染病首次出现症状日期 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/datetime/infectious-disease-first-symptoms-date">
						<valueDateTime value="${infectiousDiseaseFirstSymptomsDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</extension>
					</#if>
					<title value="症状章节" />
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
						<reference value="#c1" />
					</entry>
				</section>
				<!-- 死亡信息章节 -->
				<section>
					<#if infectiousDiseasesDeathDate??>
					<!-- 传染病死亡日期 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/datetime/infectious-diseases-death-date">
						<valueDateTime value="${infectiousDiseasesDeathDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</extension>
					</#if>
					<title value="死亡信息章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="99999-32" />
							<display value="Death information" />
						</coding>
					</code>
				</section>
				<!-- 行政管理章节 -->
				<section>
					<#if reportCardTypeCode??>
					<!-- 报告卡类别代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/report-card-type-code">
						<valueCode value="${reportCardTypeCode}" />
					</extension>
					</#if>
					<#if infectiousDiseaseAttributionCode??>
					<!-- 传染病患者归属代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/infectious-disease-attribution-code">
						<valueCode value="${infectiousDiseaseAttributionCode}" />
					</extension>
					</#if>
					<#if withdrawalReasons??>
					<!-- 退卡原因 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/withdrawal-reasons">
						<valueString value="${withdrawalReasons}" />
					</extension>
					</#if>
					<title value="行政管理章节 " />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="51851-4" />
							<display value="Administrative note" />
						</coding>
					</code>
				</section>
			</Composition>
		</resource>
	</entry>
</Bundle>

