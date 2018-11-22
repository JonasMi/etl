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
			<!-- 资源：出生医学证明 -->
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
						<#if birthProCode??>
						<!-- 出生地省代码GBT2260(2013版) -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/birth-pro-code">
							<valueCode value="${birthProCode}" />
						</extension>
						</#if>
						<#if birthCityCode??>
						<!-- 出生地市代码GBT2260(2013版) -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/birth-city-code">
							<valueCode value="${birthCityCode}" />
						</extension>
						</#if>
						<#if birthCouCode??>
						<!-- 出生地县代码GBT2260(2013版) -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/birth-cou-code">
							<valueCode value="${birthCouCode}" />
						</extension>
						</#if>
						<#if birthAddressVillage??>
						<!-- 出生地址的村或城市的街、路、里、弄等名称 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/birth-address-village">
							<valueString value="${birthAddressVillage}" />
						</extension>
						</#if>
						<#if birthAddressHouse??>
						<!-- 出生地址的门牌号码 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/birth-address-house">
							<valueString value="${birthAddressHouse}" />
						</extension>
						</#if>
						<#if birthAddressStreet??>
						<!-- 出生地址的乡、镇或城市的街道办事处名称 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/birth-address-street">
							<valueString value="${birthAddressStreet}" />
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
							<#if fatherNationalityCode??>
							<!-- 国籍代码 -->
							<extension
								url="http://www.nestvision.com/platform/app/data/v1/code/nationality-code">
								<valueCode value="${fatherNationalityCode}" />
							</extension>
							</#if>
							<#if fatherNationCd??>
							<!-- 民族代码 -->
							<extension url="urn:oid:2.16.156.10011.2.3.3.3">
								<valueCode value="${fatherNationCd}" />
							</extension>
							</#if>
							<#if fatherIdCard??>
							<!-- 身份证号 -->
							<extension url="urn:oid:2.16.156.10011.1.3">
								<valueString value="${fatherIdCard}" />
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
							<#if motherNationalityCode??>
							<!-- 国籍代码 -->
							<extension
								url="http://www.nestvision.com/platform/app/data/v1/code/nationality-code">
								<valueCode value="${motherNationalityCode}" />
							</extension>
							</#if>
							<#if motherNationCd??>
							<!-- 民族代码 -->
							<extension url="urn:oid:2.16.156.10011.2.3.3.3">
								<valueCode value="${motherNationCd}" />
							</extension>
							</#if>
							<#if motherIdCard??>
							<!-- 身份证号 -->
							<extension url="urn:oid:2.16.156.10011.1.3">
								<valueString value="${motherIdCard}" />
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
				<!-- 出生医学证明id -->
				<identifier>
					<system
						value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/birth-certificate-id" />
					<value value="${birthCertificateId}" />
				</identifier>
				<!-- 记录日期 -->
				<date value="${date?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
				<!-- 文档类型：出生医学证明 -->
				<type>
					<coding>
						<system value="2.16.156.10011.2.4" />
						<code value="HSDB01.01" />
					</coding>
					<text value="出生医学证明" />
				</type>
				<!-- 文档标题：出生医学证明 -->
				<title value="出生医学证明" />
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
					<#if generalHealthMark??>
					<!-- 健康状况代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/general-health-mark">
						<valueCode value="${generalHealthMark}" />
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
				<!-- 母亲章节 -->
				<section>
					<title value="母亲" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="99999-26" />
							<display value="mother" />
						</coding>
					</code>
					<!-- 母亲信息 -->
					<entry>
						<reference value="#pat1" />
					</entry>
				</section>
				<!-- 父亲章节 -->
				<section>
					<title value="父亲" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="99999-27" />
							<display value="father" />
						</coding>
					</code>
					<!-- 父亲信息 -->
					<entry>
						<reference value="#pat1" />
					</entry>
				</section>
				<!-- 接生相关信息章节 -->
				<section>
					<#if birthPlaceTypeCd??>
					<!-- 出生（分娩）地点类别代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/birth-place-type-cd">
						<valueCode value="${birthPlaceTypeCd}" />
					</extension>
					</#if>
					<#if midwife??>
					<!-- 接生人员名字 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/midwife">
						<valueString value="${midwife}" />
					</extension>
					</#if>
					<#if midwiferyUnit??>
					<!-- 接生单位名称 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/midwifery-unit">
						<valueString value="${midwiferyUnit}" />
					</extension>
					</#if>
					<title value="接生相关信息章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="99999-28" />
							<display value="Deliver relevant information" />
						</coding>
					</code>
				</section>
			</Composition>
		</resource>
	</entry>
</Bundle>

