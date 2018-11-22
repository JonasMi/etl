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
			<!-- 资源：预防接种报告 -->
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
				<!-- 预防接种报告id -->
				<identifier>
					<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/vaccination-report-id" />
					<#if vaccinationReportId??>
					<value value="${vaccinationReportId}" />
					</#if>
				</identifier>
				<#if date??>
				<!-- 记录日期 -->
				<date value="${date?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
				</#if>
				<!-- 文档类型：预防接种报告 -->
				<type>
					<coding>
						<system value="2.16.156.10011.2.4" />
						<code value="HSDB03.01" />
					</coding>
					<text value="预防接种报告" />
				</type>
				<!-- 文档标题：预防接种报告 -->
				<title value="预防接种报告" />
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
				<!-- 搬迁信息章节 -->
				<section>
				   	<#if migrationTime??>
					<!-- 迁入时间 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/datetime/migration-time">
						<valueDateTime value="${migrationTime?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</extension>
					</#if>
					<#if moveoutTime??>
					<!-- 迁出时间 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/datetime/moveout-time">
						<valueDateTime value="${moveoutTime?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</extension>
					</#if>
					<#if reasonForRemoval??>
					<!-- 搬迁原因 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/reason-for-removal">
						<valueString value="${reasonForRemoval}" />
					</extension>
					</#if>
					<title value="搬迁信息章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="99999-31" />
							<display value="Relocation information" />
						</coding>
					</code>
				</section>
				<!-- 既往史章节 -->
				<section>
					<#if infectiousNameDisease??>
					<!-- 既往所患传染病名称描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/infectious-name-disease">
						<valueString value="${infectiousNameDisease}" />
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
				<!-- 手术操作章节 -->
				<section>
					<#if vaccinationDate??>
					<!-- 接种日期 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/datetime/vaccination-date">
						<valueDateTime value="${vaccinationDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</extension>
					</#if>
					<#if inoculumDose??>
					<!-- 接种剂次 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/inoculum-dose">
						<valueDecimal value="${inoculumDose?string('#')}" />
					</extension>
					</#if>
					<#if inoculationSite??>
					<!-- 接种部位 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/inoculation-site">
						<valueString value="${inoculationSite}" />
					</extension>
					</#if>
					<#if vaccinationDoctorNumber??>
					<!-- 接种医生编号 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/vaccination-doctor-number">
						<valueString value="${vaccinationDoctorNumber}" />
					</extension>
					</#if>
					<#if vaccinationDoctorName??>
					<!-- 接种医生名称 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/vaccination-doctor-name">
						<valueString value="${vaccinationDoctorName}" />
					</extension>
					</#if>
					<#if vaccinationOrgNumber??>
					<!-- 接种机构编号 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/vaccination-org-number">
						<valueString value="${vaccinationOrgNumber}" />
					</extension>
					</#if>
					<#if vaccinationOrgName??>
					<!-- 接种机构名称 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/vaccination-org-name">
						<valueString value="${vaccinationOrgName}" />
					</extension>
					</#if>
					<#if reactionsAbnormalDescriptionHistory??>
					<!-- 疫苗异常反应史 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/reactions-abnormal-description-history">
						<valueString value="${reactionsAbnormalDescriptionHistory}" />
					</extension>
					</#if>
					<#if vaccinationTaboo??>
					<!-- 接种禁忌 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/vaccination-taboo">
						<valueString value="${vaccinationTaboo}" />
					</extension>
					</#if>
					<#if vaccineValidity??>
					<!-- 疫苗有效期 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/datetime/vaccine-validity">
						<valueDateTime value="${vaccineValidity?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</extension>
					</#if>
					<#if vaccineLot??>
					<!-- 疫苗批号 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/vaccine-lot">
						<valueString value="${vaccineLot}" />
					</extension>
					</#if>
					<#if vaccineName??>
					<!-- 疫苗名称 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/vaccine-name">
						<valueString value="${vaccineName}" />
					</extension>
					</#if>
					<#if vaccineOrgNumber??>
					<!-- 疫苗生产厂商编号 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/vaccine-org-number">
						<valueString value="${vaccineOrgNumber}" />
					</extension>
					</#if>
					<#if vaccineOrgName??>
					<!-- 疫苗生产厂商名称 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/vaccine-org-name">
						<valueString value="${vaccineOrgName}" />
					</extension>
					</#if>
					<title value="手术操作章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="47519-4" />
							<display value="HISTORY OF PROCEDURES" />
						</coding>
					</code>
					<!-- 手术 -->
					<entry>
						<reference value="#p1" />
					</entry>
				</section>
				<!-- 接种不良反应章节  -->
				<section>
				    <#if vaccineNameCode??>
					<!-- 引起不良反应的可疑疫苗名称代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/vaccine-name-code">
						<valueCode value="${vaccineNameCode}" />
					</extension>
					</#if>
					<#if adverseReactionsSuspectVaccineNameCode??>
					<!-- 预防接种后不良反应临床诊断代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/adverse-reactions-suspect-vaccine-name-code">
						<valueCode value="${adverseReactionsSuspectVaccineNameCode}" />
					</extension>
					</#if>
					<#if adverseReactionsOccurrenceDate??>
					<!-- 不良反应发生日期 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/datetime/adverse-reactions-occurrence-date">
						<valueDateTime value="${adverseReactionsOccurrenceDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</extension>
					</#if>
					<#if adverseDrugReaction??>
					<!-- 不良反应处理结果 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/adverse-drug-reaction">
						<valueString value="${adverseDrugReaction}" />
					</extension>
					</#if>
					<title value="接种不良反应章节 " />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="99999-31" />
							<display value="Adverse reaction" />
						</coding>
					</code>
				</section>
			</Composition>
		</resource>
	</entry>
</Bundle>

