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
			<!-- 资源：死亡医学证明 -->
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
						<#if nationCd??>
						<!-- 民族代码 -->
						<extension url="urn:oid:2.16.156.10011.2.3.3.3">
							<valueCode value="${nationCd}" />
						</extension>
						</#if>
						<#if educationCd??>
					    <!-- 学历代码 GBT4658 -->
					    <extension url="urn:oid:2.16.156.10011.2.3.3.6">
					        <valueCode value="${educationCd}" />
					    </extension>
					    </#if>
					    <#if occupationCd??>
					    <!-- 职业代码 -->
					    <extension url="urn:oid:2.16.156.10011.2.3.3.7">
					        <valueCode value="${occupationCd}" />
					    </extension>
					    </#if>
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
					    <maritalStatus>
					        <coding>
								<!-- 婚姻状况代码命名空间 -->
								<system value="urn:oid:2.16.156.10011.2.3.3.5" />
								<#if maritalstatus??>
								<!-- 婚姻状况代码 -->
								<code value="${maritalstatus}" />
								 </#if>
							</coding>
					    </maritalStatus>
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
						<#if onsetToDeath??>
						<!-- 发病到死亡时长 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/number/onset-to-death">
							<valueDecimal value="${onsetToDeath?string('#')}" />
						</extension>
						</#if>
						<#if highestDiagnosticLevel??>
						<!-- 最高诊断机构级别 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/highest-diagnostic-level">
							<valueCode value="${highestDiagnosticLevel}" />
						</extension>
						</#if>
						<#if highestDeathDiagnosisCategoryCode??>
						<!-- 死亡最高诊断依据类别代码 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/highest-death-diagnosis-category-code">
							<valueCode value="${highestDeathDiagnosisCategoryCode}" />
						</extension>
						</#if>
						<patient />
						<code>
							<coding>
								<!--直接死亡原因名字空间 -->
								<system value="http://www.nestvision.com/platform/app/data/v1/code/death-direct-cause" />
								<!--直接死亡原因代码 -->
								<#if directDeathReasonCd??>
								<code value="${directDeathReasonCd}" />
								</#if>
								<#if directDeathReasonName??>
								<!--直接死亡原因 -->
								<display value="${directDeathReasonName}" />
								</#if>	
										
							</coding>
							<coding>
								<!--其他疾病诊断名字空间 -->
								<system value="urn:oid:2.16.156.10011.2.3.3.11" />
								<!--其他疾病诊断 -->
								<#if otherDiseaseDiagnosisCd??>
								<code value="${otherDiseaseDiagnosisCd}" />
								</#if>
								<#if otherDiseaseDiagnosisName??>
								<display value="${otherDiseaseDiagnosisName}" />
								</#if>
							</coding>
							<coding>
								<!--根本死亡原因编码名字空间 -->
								<system value="http://www.nestvision.com/platform/app/data/v1/code/underlying-death-cause-code" />
								<!--根本死亡原因编码 -->
								<#if underlyingDeathCauseCd??>
								<code value="${underlyingDeathCauseCd}" />
								</#if>
								<#if underlyingDeathCauseName??>
								<display value="${underlyingDeathCauseName}" />
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
				<!-- 死亡医学证明id -->
				<identifier>
					<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/death-proof-id" />
					<#if deathProofId??>
					<value value="${deathProofId}" />
					</#if>
				</identifier>
				<#if date??>
				<!-- 记录日期 -->
				<date value="${date?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
				</#if>
				<!-- 文档类型：死亡医学证明 -->
				<type>
					<coding>
						<system value="2.16.156.10011.2.4" />
						<code value="HSDB03.03" />
					</coding>
					<text value="死亡医学证明" />
				</type>
				<!-- 文档标题：死亡医学证明 -->
				<title value="死亡医学证明" />
				<!-- 状态：preliminary初步 final最终amended修订entered-in-error错误 -->
				<status value="final" />
				<!-- 保密等级：U:不受限制的 L:低等级 M:中等 N:常规 R:保密的 V:十分机密的 -->
				<confidentiality value="N" />
				<!-- 患者信息 -->
				<subject>
					<reference value="#pat1" />
				</subject>
				<!-- 签名医师 -->
				<author>
					<reference value="#pra1" />
				</author>
				<!-- 提供患者服务机构 -->
				<custodian>
					<reference value="#hos1" />
				</custodian>
				<!-- 死亡信息章节 -->
				<section>
					<#if deathDate??>
					<!-- 死亡日期 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/datetime/death-date">
						<valueDateTime value="${deathDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</extension>
					</#if>
					<#if deathPlaceCategory??>
					<!-- 死亡地点类别 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/death-place-category">
						<valueCode value="${deathPlaceCategory}" />
					</extension>
					</#if>
					<#if deathHospital??>
					<!-- 死亡医院 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/death-hospital">
						<valueString value="${deathHospital}" />
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
			</Composition>
		</resource>
	</entry>
</Bundle>

