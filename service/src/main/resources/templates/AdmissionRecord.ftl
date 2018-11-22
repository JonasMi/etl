<#ftl output_format="XML">
<Bundle xmlns="http://hl7.org/fhir">
	<!-- bundle业务类型：电子病历（必填） -->
	<meta>
		<tag>
			<system value="http://www.nestvision.com/platform/app/data/v1/code/bundle-business-type"/>
			<code value="01"/>
		</tag>
	</meta>
	<type value="document" />
	<entry>
		<fullUrl value="http://fhir.healthintersections.com.au/open/Composition/180f219f-97a8-486d-99d9-ed631fe4fc57" />
		<resource>
			<!-- 资源：入院记录 -->
			<Composition xmlns="http://hl7.org/fhir">
				<!-- 保管机构 -->
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
				<!-- 患者 -->
				<contained>
					<Patient xmlns="http://hl7.org/fhir">
						<id value="pat1" />
						<#if age??>
      					<!-- 年龄 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/number/age">
							<valueDecimal value="${age}" />
						</extension>
						</#if>
						<#if nationCd??>
      					<!-- 民族代码 -->
						<extension url="urn:oid:2.16.156.10011.2.3.3.3">
							<valueCode value="${nationCd}" />
						</extension>
						</#if>
						<#if occupationCd??>
      					<!-- 职业代码 -->
						<extension url="urn:oid:2.16.156.10011.2.3.3.7">
							<valueCode value="${occupationCd}" />
						</extension>
						</#if>
						<#if workUnit??>
						<!-- 工作单位 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/work-unit">
							<valueString value="${workUnit}" />
						</extension>
						</#if>
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
						<address>
					        <#if tempRoad??>
							<!-- 地址-村（街、路、弄等）-->
							<extension
								url="http://www.nestvision.com/platform/app/data/v1/text/address-road">
								<valueString value="${tempRoad}" />
							</extension>
							</#if>
							<#if tempHouseNo??>
							<!--地址-门牌号码 -->
							<extension
								url="http://www.nestvision.com/platform/app/data/v1/text/house-no">
								<valueString value="${tempHouseNo}" />
							</extension>
							</#if>
							<#if tempPostCd??>
							<!--现地址邮政编码 -->
					        <extension
					            url="http://www.nestvision.com/platform/app/data/v1/text/post-cd">
					            <valueString value="${tempPostCd}" />
							</extension>
							</#if>
							
							<!-- 地址类别代码:现居住地址 -->
							<use value="temp" />
							<#if tempText??>
							<!-- 地址详细信息 -->
							<text value="${tempText}" />
							</#if>
							<#if tempLine??>
							<!-- 地址-乡（镇、街道办事处） -->
							<line value="${tempLine}" />
							</#if>
							<#if tempCity??>
							<!-- 地址-市（地区） -->
							<city value="${tempCity}" />
							</#if>
							<#if tempDistrict??>
							<!-- 地址-县（区） -->
							<district value="${tempDistrict}" />
							</#if>
							<#if tempState??>
							<!-- 地址-省（自治区、直辖市） -->
							<state  value="${tempState}" />
							</#if>
					    </address>
						<maritalStatus>
							<coding>
								<!-- 婚姻状况代码命名空间 -->
								<system value="urn:oid:2.16.156.10011.2.3.3.5" />
								<!-- 婚姻状况代码 -->
								<code value="${maritalstatus}" />
							</coding>
						</maritalStatus>
						<!-- 联系人的信息 -->
						<contact>
							<#if relationship??>
      						<relationship>
								<coding>
									<!-- 联系人关系代码命名空间 -->
									<system value="urn:oid:2.16.156.10011.2.3.3.8" />
									<!-- 联系人关系代码 -->
									<code value="${relationship}" />
								</coding>
							</relationship>
							</#if>
							<#if contactsName??>
      						<name>
								<!-- 联系人姓名 -->
								<text value="${contactsName}" />
							</name>
							</#if>
							<#if contactsPhone??>
      						<telecom>
								<!-- 联系人联系方式代码 -->
								<system value="phone" />
								<!-- 联系人电话号码 -->
								<value value="${contactsPhone}" />
								<use value="temp" />
							</telecom>
							</#if>
						</contact>
					</Patient>
				</contained>
				<!-- 文档创建者 -->
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
				<!-- 最终审核者 -->
				<contained>
					<Practitioner xmlns="http://hl7.org/fhir">
						<id value="pra3" />
						<#if auditorId??>
      					<identifier>
							<!-- 院内人员ID号命名空间 -->
							<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
							<!-- 院内人员ID号 -->
							<value value="${auditorId}" />
						</identifier>
						</#if>
						<#if auditorName??>
      					<name>
							<!-- 姓名 -->
							<text value="${auditorName}" />
						</name>
						</#if>
						<#if auditorPost??>
						<practitionerRole>
							<specialty>
								<coding>
									<!-- 专业技术职务代码命名空间 -->
									<system value="urn:oid:2.16.156.10011.2.3.3.10" />
									
      								<!-- 专业技术职务代码 -->
									<code value="${auditorPost}" />
								</coding>
							</specialty>
						</practitionerRole>
						</#if>
					</Practitioner>
				</contained>
				<!-- 主治医师 -->
				<contained>
					<Practitioner xmlns="http://hl7.org/fhir">
						<id value="pra4" />
						<#if attendingDoctorId??>
      					<identifier>
							<!-- 院内人员ID号命名空间 -->
							<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
							<!-- 院内人员ID号 -->
							<value value="${attendingDoctorId}" />
						</identifier>
						</#if>
						<#if attendingDoctorName??>
      					<name>
							<!-- 姓名 -->
							<text value="${attendingDoctorName}" />
						</name>
						</#if>
					</Practitioner>
				</contained>
				<!-- 住院医师 -->
				<contained>
					<Practitioner xmlns="http://hl7.org/fhir">
						<id value="pra5" />
						<#if residentDoctorId??>
      					<identifier>
							<!-- 院内人员ID号命名空间 -->
							<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
							<!-- 院内人员ID号 -->
							<value value="${residentDoctorId}" />
						</identifier>
						</#if>
						<#if residentDoctorName??>
      					<name>
							<!-- 姓名 -->
							<text value="${residentDoctorName}" />
						</name>
						</#if>
					</Practitioner>
				</contained>
				<!-- 记录者 -->
				<contained>
					<Practitioner xmlns="http://hl7.org/fhir">
						<id value="pra6" />
						<#if recorderId??>
      					<identifier>
							<!-- 院内人员ID号命名空间 -->
							<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
							<!-- 院内人员ID号 -->
							<value value="${recorderId}" />
						</identifier>
						</#if>
						<#if recorderName??>
      					<name>
							<!-- 姓名 -->
							<text value="${recorderName}" />
						</name>
						</#if>
					</Practitioner>
				</contained>
				<!-- 接诊医师 -->
				<contained>
					<Practitioner xmlns="http://hl7.org/fhir">
						<id value="pra7" />
						<#if receiveEmployeeId??>
      					<identifier>
							<!-- 院内人员ID号命名空间 -->
							<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
							<!-- 院内人员ID号 -->
							<value value="${receiveEmployeeId}" />
						</identifier>
						</#if>
						<#if receiveEmployeeName??>
      					<name>
							<!-- 姓名 -->
							<text value="${receiveEmployeeName}" />
						</name>
						</#if>
					</Practitioner>
				</contained>
				<!-- 主管护士 -->
				<contained>
					<Practitioner xmlns="http://hl7.org/fhir">
						<id value="pra8" />
						<#if chargeNurseId??>
      					<identifier>
							<!-- 院内人员ID号命名空间 -->
							<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
							<!-- 院内人员ID号 -->
							<value value="${chargeNurseId}" />
						</identifier>
						</#if>
						<#if chargeNurseName??>
      					<name>
							<!-- 姓名 -->
							<text value="${chargeNurseName}" />
						</name>
						</#if>
					</Practitioner>
				</contained>
				<!-- 住院信息 -->
				<contained>
					<Encounter xmlns="http://hl7.org/fhir">
						<id value="e1" />
						<contained>
							<Location xmlns="http://hl7.org/fhir">
								<id value="e1l1" />
								<#if bedNum??>
								<identifier>
									<!--原系统床位ID号命名空间 -->
									<system
										value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/bed-id" />
									<!-- 原系统床位ID号 -->
									<value value="${bedNum}" />
								</identifier>
								</#if>
								<#if wardNo??|| wardArea??|| bedNum??>
								<address>
									<#if wardNo??>
									<!--病房号 -->
									<extension
										url="http://www.nestvision.com/platform/app/data/v1/text/ward-no">
										<valueString value="${wardNo}" />
									</extension>
									</#if>
									<#if wardArea??>
									<!--病区 -->
									<extension
										url="http://www.nestvision.com/platform/app/data/v1/text/ward-area">
										<valueString value="${wardArea}" />
									</extension>
									</#if>
									<#if bedNum??>
      								<!--床位号 -->
									<extension
										url="http://www.nestvision.com/platform/app/data/v1/text/bed-num">
										<valueString value="${bedNum}" />
									</extension>
									</#if>
								</address>
								</#if>
							</Location>
						</contained>
						<!-- 入院科室 -->
						<contained>
							<Organization xmlns="http://hl7.org/fhir">
								<id value="e1o2" />
								<#if visitingDeptCd??>
      							<!-- 科室归类代码 -->
								<extension url="urn:oid:2.16.156.10011.2.3.2.62">
									<valueCode value="${visitingDeptCd}" />
								</extension>
								</#if>
								<#if visitingDeptId??>
								<identifier>
									<!-- 院内科室ID号命名空间 -->
									<system
										value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id" />
									<!-- 院内科室ID号 -->
									<value value="${visitingDeptId}" />
								</identifier>
								</#if>
								<#if visitingDeptName??>
								<!-- 科室名称 -->
								<name value="${visitingDeptName}" />
								</#if>
							</Organization>
						</contained>
						<!-- 出院科室 -->
						<contained>
							<Organization xmlns="http://hl7.org/fhir">
								<id value="e1o3" />
								<#if outDeptCd??>
      							<!-- 科室归类代码 -->
								<extension url="urn:oid:2.16.156.10011.2.3.2.62">
									<valueCode value="${outDeptCd}" />
								</extension>
								</#if>
								<#if outDeptId??>
								<identifier>
									<!-- 院内科室ID号命名空间 -->
									<system
										value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id" />
									<!-- 院内科室ID号 -->
									<value value="${outDeptId}" />
								</identifier>
								</#if>
								<#if outDeptName??>
								<!-- 科室名称 -->
								<name value="${outDeptName}" />
								</#if>
							</Organization>
						</contained>
						<contained>
							<Organization xmlns="http://hl7.org/fhir">
								<id value="e1o1" />
								<contained>
									<Organization xmlns="http://hl7.org/fhir">
										<id value="e1o1h1" />
										<identifier>
											<!-- 机构ID号命名空间 -->
											<system
												value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/hospital-id" />
											<!-- 机构ID号 -->
											<value value="${upHospital}" />
										</identifier>
      									<!-- 医院名称 -->
										<name value="${upHospitalName}" />
									</Organization>
								</contained>
								<#if visitingDeptCd??>
      							<!-- 科室归类代码 -->
								<extension url="urn:oid:2.16.156.10011.2.3.2.62">
									<valueCode value="${visitingDeptCd}" />
								</extension>
								</#if>
								<#if visitingDeptId??>
								<identifier>
									<!-- 院内科室ID号命名空间 -->
									<system
										value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id" />
									<!-- 院内科室ID号 -->
									<value value="${visitingDeptId}" />
								</identifier>
								</#if>
								<#if visitingDeptName??>
								<!-- 科室名称 -->
								<name value="${visitingDeptName}" />
								</#if>
								<partOf>
							        <!-- 就诊医疗机构 -->
							        <reference value="#e1o1h1" />
							    </partOf>
							</Organization>
						</contained>
						<!-- 入院科室 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/identifier/in-dpid">
							<valueReference>
								<reference value="#e1o2" />
							</valueReference>
						</extension>
						<#if cnFourResult??>
						<!--中医"四诊"观察结果 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/cn-four-result">
							<valueString value="${cnFourResult}" />
						</extension>
						</#if>
						<#if inpatientDays??>
						<!--住院天数 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/number/inpatient-days">
							<valueDecimal value="${inpatientDays?string('#')}" />
						</extension>
						</#if>
						<#if deathTime??>
						<!-- 死亡时间 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/datetime/death-time">
							<valueDateTime value="${deathTime?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
						</extension>
						</#if>
						<!-- 出院科室 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/identifier/out-dpid">
							<valueReference>
								<reference value="#e1o3" />
							</valueReference>
						</extension>
						<#if outpatWardNo??>
						<!-- 出院病房 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/outpat-ward-no">
							<valueString value="${outpatWardNo}" />
						</extension>
						</#if>
						<#if inpatientRegistrationId?? >
						<identifier>
							<system
								value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/inpatient-registration-id" />
							<!-- 原系统住院流水id号 -->
							<value value="${inpatientRegistrationId}" />
						</identifier>
						</#if>
						<!-- 状态 -->
						<status value="finished" />
						<!-- 类型：住院 -->
						<class value="inpatient" />
						<#if start??>
     	 				<period>
     	 					<#if start??>
							<!-- 入院时间 -->
							<start value="${start?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
							</#if>
						</period>
						</#if>
						<#if inhId??>
      					<hospitalization>
							<preAdmissionIdentifier>
								<!-- 住院号命名空间 -->
								<system
									value="http://www.nestvision.com/platform/app/data/v1/text/inh-id" />
								<!-- 住院号 -->
								<value value="${inhId}" />
							</preAdmissionIdentifier>
						</hospitalization>
						</#if>
						<!-- 当前床号 -->
						<location>
							<location>
								<reference value="#e1l1" />
							</location>
						</location>
						<!-- 当前科室 -->
					    <serviceProvider>
					        <reference
					            value="#e1o1" />
					    </serviceProvider>
					</Encounter>
				</contained>
				<!-- 初步诊断 -->
				<contained>
					<Condition xmlns="http://hl7.org/fhir">
						<id value="con1" />
						<#if preliminaryCnSymDiagCode??>
						<!--中医症候代码CV9900357 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/cn-sym-diag-code">
							<valueCode value="${preliminaryCnSymDiagCode}" />
						</extension>
						</#if>
						<#if preliminaryCnDisDiagCode??>
						<!--中医病名代码CV9900357 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/cn-dis-diag-code">
							<valueCode value="${preliminaryCnDisDiagCode}" />
						</extension>
						</#if>
						<#if preliminaryAdmitDiag??>
						<!-- 西医诊断顺位 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/number/admit-diag">
							<valueDecimal value="${preliminaryAdmitDiag?string('#')}" />
						</extension>
						</#if>
						<#if preliminaryTcmAdmitDiag??>
						<!-- 中医诊断顺位 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/number/tcm-admit-diag">
							<valueDecimal value="${preliminaryTcmAdmitDiag?string('#')}" />
						</extension>
						</#if>
						<#if preliminaryDiagId??>
						<identifier>
							<system
								value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/condition-id" />
							<!-- 原系统诊断记录id -->
							<value value="${preliminaryDiagId}" />
						</identifier>
						</#if>
						<patient />
						<code>
							<coding>
								<!--诊断编码 -->
								<system value="urn:oid:2.16.156.10011.2.3.3.11" />
								<#if preliminaryDiagCode??>
								<!--诊断编码 -->
								<code value="${preliminaryDiagName}" />
								</#if>
								<#if inDiagValue??>
      							<display value="${preliminaryDiagName}" />
								</#if>
							</coding>
						</code>
						<category>
					        <coding>
					            <system
					                value="http://www.nestvision.com/platform/app/data/v1/code/condition-types" />
					            <code value="23" />
					            <display value="入院初步诊断西医诊断" />
					        </coding>
					    </category>
						<verificationStatus />
						<#if preliminaryDiagDate??>
						<!-- 诊断日期 -->
						<onsetDateTime value="${preliminaryDiagDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
						</#if>
					</Condition>
				</contained>
				<!-- 修正诊断 -->
				<contained>
					<Condition xmlns="http://hl7.org/fhir">
						<id value="con2" />
						<#if correctCnSymDiagCode??>
						<!--中医症候代码CV9900357 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/cn-sym-diag-code">
							<valueCode value="${correctCnSymDiagCode}" />
						</extension>
						</#if>
						<#if correctCnDisDiagCode??>
						<!--中医病名代码CV9900357 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/cn-dis-diag-code">
							<valueCode value="${correctCnDisDiagCode}" />
						</extension>
						</#if>
						<#if correctAdmitDiag??>
						<!-- 西医诊断顺位 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/number/admit-diag">
							<valueDecimal value="${correctAdmitDiag?string('#')}" />
						</extension>
						</#if>
						<#if correctTcmAdmitDiag??>
						<!-- 中医诊断顺位 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/number/tcm-admit-diag">
							<valueDecimal value="${correctTcmAdmitDiag?string('#')}" />
						</extension>
						</#if>
						<#if correctDiagId??>
						<identifier>
							<system
								value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/condition-id" />
							<!-- 原系统诊断记录id -->
							<value value="${correctDiagId}" />
						</identifier>
						</#if>
						<patient />
						<code>
							<coding>
								<!--诊断编码 -->
								<system value="urn:oid:2.16.156.10011.2.3.3.11" />
								<#if correctDiagCode??>
								<!--诊断编码 -->
								<code value="${correctDiagCode}" />
								</#if>
								<#if correctDiagName??>
      							<display value="${correctDiagName}" />
								</#if>
							</coding>
						</code>
						<category>
					        <coding>
					            <system
					                value="http://www.nestvision.com/platform/app/data/v1/code/condition-types" />
					            <code value="26" />
					            <display value="入院修正诊断西医诊断" />
					        </coding>
					    </category>
						<verificationStatus />
						<#if correctDiagDate??>
						<!-- 诊断日期 -->
						<onsetDateTime value="${correctDiagDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
						</#if>
					</Condition>
				</contained>
				<!-- 确定诊断 -->
				<contained>
					<Condition xmlns="http://hl7.org/fhir">
						<id value="con3" />
						<#if determineCnSymDiagCode??>
						<!--中医症候代码CV9900357 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/cn-sym-diag-code">
							<valueCode value="${determineCnSymDiagCode}" />
						</extension>
						</#if>
						<#if determineCnDisDiagCode??>
						<!--中医病名代码CV9900357 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/cn-dis-diag-code">
							<valueCode value="${determineCnDisDiagCode}" />
						</extension>
						</#if>
						<#if determineAdmitDiag??>
						<!-- 西医诊断顺位 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/number/admit-diag">
							<valueDecimal value="${determineAdmitDiag?string('#')}" />
						</extension>
						</#if>
						<#if determineTcmAdmitDiag??>
						<!-- 中医诊断顺位 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/number/tcm-admit-diag">
							<valueDecimal value="${determineTcmAdmitDiag?string('#')}" />
						</extension>
						</#if>
						<#if determineDiagId??>
						<identifier>
							<system
								value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/condition-id" />
							<!-- 原系统诊断记录id -->
							<value value="${determineDiagId}" />
						</identifier>
						</#if>
						<patient />
						<code>
							<coding>
								<!--诊断编码 -->
								<system value="urn:oid:2.16.156.10011.2.3.3.11" />
								<#if determineDiagCode??>
								<!--诊断编码 -->
								<code value="${determineDiagCode}" />
								</#if>
								<#if determineDiagName??>
      							<display value="${determineDiagName}" />
								</#if>
							</coding>
						</code>
						<category>
					        <coding>
					            <system
					                value="http://www.nestvision.com/platform/app/data/v1/code/condition-types" />
					            <code value="20" />
					            <display value="入院确定诊断西医诊断" />
					        </coding>
					    </category>
						<verificationStatus />
						<#if determineDiagDate??>
						<!-- 诊断日期 -->
						<onsetDateTime value="${determineDiagDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
						</#if>
					</Condition>
				</contained>
				<!-- 补充诊断 -->
				<contained>
					<Condition xmlns="http://hl7.org/fhir">
						<#if supplementCnSymDiagCode??>
						<!--中医症候代码CV9900357 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/cn-sym-diag-code">
							<valueCode value="${supplementCnSymDiagCode}" />
						</extension>
						</#if>
						<#if supplementCnDisDiagCode??>
						<!--中医病名代码CV9900357 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/cn-dis-diag-code">
							<valueCode value="${supplementCnDisDiagCode}" />
						</extension>
						</#if>
						<#if supplementAdmitDiag??>
						<!-- 西医诊断顺位 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/number/admit-diag">
							<valueDecimal value="${supplementAdmitDiag?string('#')}" />
						</extension>
						</#if>
						<#if supplementTcmAdmitDiag??>
						<!-- 中医诊断顺位 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/number/tcm-admit-diag">
							<valueDecimal value="${supplementTcmAdmitDiag?string('#')}" />
						</extension>
						</#if>
						<#if supplementDiagId??>
						<identifier>
							<system
								value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/condition-id" />
							<!-- 原系统诊断记录id -->
							<value value="${supplementDiagId}" />
						</identifier>
						</#if>
						<patient />
						<code>
							<coding>
								<!--诊断编码 -->
								<system value="urn:oid:2.16.156.10011.2.3.3.11" />
								<#if supplementDiagCode??>
								<!--诊断编码 -->
								<code value="${supplementDiagCode}" />
								</#if>
								<#if supplementDiagName??>
      							<display value="${supplementDiagName}" />
								</#if>
							</coding>
						</code>
						<category>
					        <coding>
					            <system
					                value="http://www.nestvision.com/platform/app/data/v1/code/condition-types" />
					            <code value="19" />
					            <display value="入院补充诊断记录" />
					        </coding>
					    </category>
						<verificationStatus />
						<#if supplementDiagDate??>
						<!-- 诊断日期 -->
						<onsetDateTime value="${supplementDiagDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
						</#if>
					</Condition>
				</contained>
				<!-- 入院诊断 -->
				<contained>
					<Condition xmlns="http://hl7.org/fhir">
						<id value="con5" />
						<#if inpatientDetails??>
						<!-- 入院情况 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/inpatient-details">
							<valueString value="${inpatientDetails}" />
						</extension>
						</#if>
						<#if inhosCnSymDiagCode??>
						<!--中医症候代码CV9900357 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/cn-sym-diag-code">
							<valueCode value="${inhosCnSymDiagCode}" />
						</extension>
						</#if>
						<#if inhosCnDisDiagCode??>
						<!--中医病名代码CV9900357 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/cn-dis-diag-code">
							<valueCode value="${inhosCnDisDiagCode}" />
						</extension>
						</#if>
						<#if inhosAdmitDiag??>
						<!-- 西医诊断顺位 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/number/admit-diag">
							<valueDecimal value="${inhosAdmitDiag?string('#')}" />
						</extension>
						</#if>
						<#if inhosTcmAdmitDiag??>
						<!-- 中医诊断顺位 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/number/tcm-admit-diag">
							<valueDecimal value="${inhosTcmAdmitDiag?string('#')}" />
						</extension>
						</#if>
						<#if inhosDiagId??>
						<identifier>
							<system
								value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/condition-id" />
							<!-- 原系统诊断记录id -->
							<value value="${inhosDiagId}" />
						</identifier>
						</#if>
						<patient />
						<code>
							<coding>
								<!--诊断编码 -->
								<system value="urn:oid:2.16.156.10011.2.3.3.11" />
								<#if inhosDiagCode??>
								<!--诊断编码 -->
								<code value="${inhosDiagCode}" />
								</#if>
								<#if inhosDiagName??>
      							<display value="${inhosDiagName}" />
								</#if>
							</coding>
						</code>
						<category>
					        <coding>
					            <system
					                value="http://www.nestvision.com/platform/app/data/v1/code/condition-types" />
					            <code value="3" />
					            <display value="入院初步诊断" />
					        </coding>
					    </category>
						<verificationStatus />
						<#if inhosDiagDate??>
						<!-- 诊断日期 -->
						<onsetDateTime value="${inhosDiagDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
						</#if>
					</Condition>
				</contained>
				<!-- 出院诊断 -->
				<contained>
					<Condition xmlns="http://hl7.org/fhir">
						<id value="con6" />
						<#if outpatientDetails??>
						<!-- 出院情况 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/outpatient-details">
							<valueString value="${outpatientDetails}" />
						</extension>
						</#if>
						<#if outhosDiagId??>
						<identifier>
							<system
								value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/condition-id" />
							<!-- 原系统诊断记录id -->
							<value value="${outhosDiagId}" />
						</identifier>
						</#if>
						<patient />
						<code>
							<coding>
								<!--诊断编码 -->
								<system value="urn:oid:2.16.156.10011.2.3.3.11" />
								<#if outhosDiagCode??>
								<!--诊断编码 -->
								<code value="${outhosDiagCode}" />
								</#if>
								<#if outhosDiagName??>
      							<display value="${outhosDiagName}" />
								</#if>
							</coding>
						</code>
						<category>
					        <coding>
					            <system
					                value="http://www.nestvision.com/platform/app/data/v1/code/condition-types" />
					            <code value="1" />
					            <display value="出院诊断" />
					        </coding>
					    </category>
						<verificationStatus />
						<#if outhosDiagDate??>
						<!-- 诊断日期 -->
						<onsetDateTime value="${outhosDiagDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
						</#if>
					</Condition>
				</contained>
				<!-- 护理科室 -->
				<contained>
					<Organization xmlns="http://hl7.org/fhir">
						<id value="o1" />
						<#if nursingDeptCd??>
      					<!-- 科室归类代码 -->
						<extension url="urn:oid:2.16.156.10011.2.3.2.62">
							<valueCode value="${nursingDeptCd}" />
						</extension>
						</#if>
						<#if nursingDeptId??>
						<identifier>
							<!-- 院内科室ID号命名空间 -->
							<system
								value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id" />
							<!-- 院内科室ID号 -->
							<value value="${nursingDeptId}" />
						</identifier>
						</#if>
						<#if nursingDeptName??>
						<!-- 科室名称 -->
						<name value="${nursingDeptName}" />
						</#if>		
					</Organization>
				</contained>
				<#if deathCause??>
				<!-- 死亡原因描述 -->
				<extension
					url="http://www.nestvision.com/platform/app/data/v1/text/death-cause">
					<valueString value="${deathCause}" />
				</extension>
				</#if>
				<#if deathDiagnosticCode??>
				<!-- 死亡诊断代码 -->
				<extension url="urn:oid:2.16.156.10011.2.3.3.11">
					<valueCode value="1" />
				</extension>
				</#if>
				<#if treatmentResultCode??>
				<!-- 治疗结果代码 -->
				<extension
					url="http://www.nestvision.com/platform/app/data/v1/code/treatment-result-code">
					<valueCode value="${treatmentResultCode}" />
				</extension>
				</#if>
				<#if dischargeOrder??>
				<!-- 出院医嘱 -->
				<extension
					url="http://www.nestvision.com/platform/app/data/v1/text/discharge-order">
					<valueString value="${dischargeOrder}" />
				</extension>
				</#if>
				<#if presentationTime??>
				<!-- 病历陈述时间 -->
				<extension
					url="http://www.nestvision.com/platform/app/data/v1/datetime/presentation-time">
					<valueDateTime value="${presentationTime?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
				</extension>
				</#if>
				<#if admissionRecordTypeCode??>
				<!-- 入院记录类型代码 -->
				<extension
					url="http://www.nestvision.com/platform/app/data/v1/code/admission-record-type-code">
					<valueCode value="${admissionRecordTypeCode}" />
				</extension>
				</#if>
				<!-- 护理科室信息 -->
				<extension url="http://www.nestvision.com/platform/app/data/v1/identifier/nursing-dpid">
					<valueReference>
						<reference value="#o1" />
					</valueReference>
				</extension>
				<!-- 入院记录id -->
				<identifier>
					<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/admission-record-id" />
					<value value="${admissionRecordId}" />
				</identifier>
				<!-- 记录日期 -->
				<date value="${date?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
				<!-- 文档类型：入院记录 -->
				<type>
					<coding>
						<system value="2.16.156.10011.2.4" />
						<code value="C0034" />
					</coding>
					<text value="入院记录" />
				</type>
				<!-- 文档标题：入院记录 -->
				<title value="入院记录" />
				<!-- 状态：preliminary初步 final最终amended修订entered-in-error错误 -->
				<status value="final" />
				<!-- 保密等级：U:不受限制的 L:低等级 M:中等 N:常规 R:保密的 V:十分机密的 -->
				<confidentiality value="N" />
				<!-- 居民信息 -->
				<subject>
					<reference value="#pat1" />
				</subject>
				<!-- 指定创作者 -->
				<author>
					<reference value="#pra1" />
				</author>
				<!-- 最终审核者 -->
				<attester>
					<extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
						<valueCode value="22"/>
					</extension>
					<mode value="legal" />
					<#if auditorDate??>
      				<!-- 签名日期 -->
					<time value="${auditorDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</#if>
					<party>
						<reference value="#pra3"/>
					</party>
				</attester>
				<!-- 住院医师 -->
				<attester>
					<extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
						<valueCode value="04"/>
					</extension>
					<mode value="legal" />
					<#if residentDoctorSignDate??>
      				<!-- 签名日期 -->
					<time value="${residentDoctorSignDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</#if>
					<party>
						<reference value="#pra5"/>
					</party>
				</attester>
				<!-- 主治医师 -->
				<attester>
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
						<valueCode value="03" />
					</extension>
					<!-- 对于该文档的意义：个人 -->
					<mode value="personal" />
					<#if attendingDoctorSignDate??>
      				<!-- 签名日期 -->
					<time value="${attendingDoctorSignDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</#if>
					<party>
						<reference value="#pra4" />
					</party>
				</attester>
				<!-- 记录者 -->
				<attester>
					<extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
						<valueCode value="10"/>
					</extension>
					<mode value="legal" />
					<#if recorderSignDate??>
      				<!-- 签名日期 -->
					<time value="${recorderSignDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</#if>
					<party>
						<reference value="#pra6"/>
					</party>
				</attester>
				<!-- 接诊医师 -->
				<attester>
					<extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
						<valueCode value="26"/>
					</extension>
					<mode value="legal" />
					<#if treatmentPhysicianDate??>
      				<!-- 签名日期 -->
					<time value="${treatmentPhysicianDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</#if>
					<party>
						<reference value="#pra7"/>
					</party>
				</attester>
				<!-- 主管护士 -->
				<attester>
					<extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
						<valueCode value="27"/>
					</extension>
					<mode value="legal" />
					<#if chargeNurseDate??>
      				<!-- 签名日期 -->
					<time value="${chargeNurseDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</#if>
					<party>
						<reference value="#pra8"/>
					</party>
				</attester>
				<!-- 文档管理机构信息 -->
				<custodian>
					<reference value="#hos1" />
				</custodian>
				<!-- 入院信息 -->
				<encounter>
					<reference value="#e1" />
				</encounter>
				<!-- 主诉章节 -->
				<section>
					<#if chief??>
					<!-- 主诉 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/chief">
						<valueString value="${chief}" />
					</extension>
					</#if>
					<title value="主诉章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="10154-3" />
							<display value="CHIEF COMPLAINT" />
						</coding>
					</code>
				</section>
				<!-- 现病史章节 -->
				<section>
					<#if illness??>
					<!-- 现病史 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/illness">
						<valueString value="${illness}" />
					</extension>
					</#if>
					<title value="现病史章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="10164-2" />
							<display value="HISTORY OF PRESENT ILLNESS" />
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
					<#if healthMark??>
					<!-- 健康状况标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/health-mark">
						<valueBoolean value="${healthMark?then('true','false')}" />
					</extension>
					</#if>
					<#if historyOfDisease??>
					<!-- 疾病史（含外伤） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/history-of-disease">
						<valueString value="${historyOfDisease}" />
					</extension>
					</#if>
					<#if infectiousMark??>
					<!-- 传染性标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/infectious-mark">
						<valueBoolean value="${infectiousMark?then('true','false')}" />
					</extension>
					</#if>
					<#if infectionHistory??>
					<!-- 传染病史 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/infection-history">
						<valueString value="${infectionHistory}" />
					</extension>
					</#if>
					<#if obstetricalHistory??>
					<!-- 婚育史 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/obstetrical-history">
						<valueString value="${obstetricalHistory}" />
					</extension>
					</#if>
					<#if rritability??>
					<!-- 过敏史描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/rritability">
						<valueString value="${rritability}" />
					</extension>
					</#if>
					<#if opHis??>
					<!-- 手术史 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/op-his">
						<valueString value="${opHis}" />
					</extension>
					</#if>
					<#if vaccHis??>
					<!-- 预防接种史描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/vacc-his">
						<valueString value="${vaccHis}" />
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
				<!-- 输血章节 -->
				<section>
					<#if transfusionHis??>
					<!-- 输血史描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/transfusion-his">
						<valueString value="${transfusionHis}" />
					</extension>
					</#if>
					<title value="输血章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="56836-0" />
							<display value="History of blood transfusion" />
						</coding>
					</code>
				</section>
				<!-- 个人史章节 -->
				<section>
					<#if perHistory??>
					<!-- 个人史 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/per-history">
						<valueString value="${perHistory}" />
					</extension>
					</#if>
					<title value="个人史章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="29762-2" />
							<display value="Social history" />
						</coding>
					</code>
				</section>
				<!-- 月经史章节 -->
				<section>
					<#if mensesHis??>
					<!-- 月经史 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/menses-his">
						<valueString value="${mensesHis}" />
					</extension>
					</#if>
					<title value="月经史章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="49033-4" />
							<display value="Menstrual History" />
						</coding>
					</code>
				</section>
				<!-- 家族史章节 -->
				<section>
					<#if famHistory??>
					<!-- 家族史 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/fam-history">
						<valueString value="${famHistory}" />
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
					<#if bodyTemperature??>
					<!--体格检查：体温 (体温的测量值，计量单位为℃)-->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/body-temperature">
						<valueDecimal value="${bodyTemperature?string('#')}" />
					</extension>
					</#if>
					<#if prFreq??>
					<!--体格检查：脉搏 (患者每分钟脉搏次数的测量值，计量单位为次/min)-->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/pr-freq">
						<valueInteger value="${prFreq}" />
					</extension>
					</#if>
					<#if breatheFreq??>
					<!--体格检查：呼吸 (患者每分钟呼吸次数的测量值，计量单位为次/min)-->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/breathe-freq">
						<valueInteger value="${breatheFreq}" />
					</extension>
					</#if>
					<#if sbp??>
					<!--体格检查：收缩压 (收缩压的测量值，计量单位为mmHg)-->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/sbp">
						<valueInteger value="${sbp}" />
					</extension>
					</#if>
					<#if dbp??>
					<!--体格检查：舒张压 (舒张压的测量值，计量单位为mmHg)-->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/dbp">
						<valueInteger value="${dbp}" />
					</extension>
					</#if>
					<#if bodyHeight??>
					<!--体格检查：身高 (患者身高的测量值，计量单位为cm)-->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/body-height">
						<valueDecimal value="${bodyHeight?string('#')}" />
					</extension>
					</#if>
					<#if bodyWeight??>
					<!--体格检查：体重 (患者体重的测量值，计量单位为kg)-->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/body-weight">
						<valueDecimal value="${bodyWeight?string('#')}" />
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
				<!-- 体格检查章节 -->
				<section>
					<#if generalSituExamResult??>
					<!--体格检查：一般状况 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/general-situ-exam-result">
						<valueString value="${generalSituExamResult}" />
					</extension>
					</#if>
					<#if skin??>
					<!--体格检查：皮肤粘膜 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/skin">
						<valueString value="${skin}" />
					</extension>
					</#if>
					<#if ln??>
					<!--体格检查：淋巴结 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/ln">
						<valueString value="${ln}" />
					</extension>
					</#if>
					<#if head??>
					<!--体格检查：头部 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/head">
						<valueString value="${head}" />
					</extension>
					</#if>
					<#if neck??>
					<!--体格检查：颈部 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/neck">
						<valueString value="${neck}" />
					</extension>
					</#if>
					<#if chest??>
					<!--体格检查：胸部 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/chest">
						<valueString value="${chest}" />
					</extension>
					</#if>
					<#if belly??>
					<!--体格检查：腹部 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/belly">
						<valueString value="${belly}" />
					</extension>
					</#if>
					<#if dreResultDescr??>
					<!--体格检查：肛门直肠 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/dre-result-descr">
						<valueString value="${dreResultDescr}" />
					</extension>
					</#if>
					<#if anusPudendum??>
					<!--体格检查：生殖器 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/anus-pudendum">
						<valueString value="${anusPudendum}" />
					</extension>
					</#if>
					<#if spine??>
					<!--体格检查：脊椎 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/spine">
						<valueString value="${spine}" />
					</extension>
					</#if>
					<#if limbs??>
					<!--体格检查：四肢 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/limbs">
						<valueString value="${limbs}" />
					</extension>
					</#if>
					<#if mental??>
					<!--体格检查：神经系统 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/mental">
						<valueString value="${mental}" />
					</extension>
					</#if>
					<#if specialistChecks??>
					<!--专科情况检查 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/specialist-checks">
						<valueString value="${specialistChecks}" />
					</extension>
					</#if>
					<#if lung??>
					<!--体格检查：肺 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/lung">
						<valueString value="${lung}" />
					</extension>
					</#if>
					<#if heart??>
					<!--体格检查：心 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/heart">
						<valueString value="${heart}" />
					</extension>
					</#if>
					<#if peripheralVessels??>
					<!--体格检查：周围血管 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/peripheral-vessels">
						<valueString value="${peripheralVessels}" />
					</extension>
					</#if>
					<title value="体格检查章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="29545-1" />
							<display value="PHYSICAL EXAMINATION" />
						</coding>
					</code>
				</section>
				<!-- 辅助检查章节 -->
				<section>
					<#if auxiliaryExaminationResults??>
					<!-- 辅助检查结果 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/auxiliary-examination-results">
						<valueString value="${auxiliaryExaminationResults}" />
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
				<!-- 主要健康问题章节 -->
				<section>
					<#if statementsReliability??>
					<!-- 陈述内容可靠标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/statements-reliability">
						<valueBoolean value="${statementsReliability?then('true','false')}" />
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
					<!-- 初步诊断 -->
					<entry>
						<reference value="#con1"/>
					</entry>
					<!-- 修正诊断 -->
					<entry>
						<reference value="#con2"/>
					</entry>
					<!-- 确定诊断 -->
					<entry>
						<reference value="#con3"/>
					</entry>
					<!-- 补充诊断 -->
					<entry>
						<reference value="#con4"/>
					</entry>
					<!-- 入院诊断 -->
					<entry>
						<reference value="#con5"/>
					</entry>
					<!-- 出院诊断 -->
					<entry>
						<reference value="#con6"/>
					</entry>
				</section>
				<!-- 治疗计划章节 -->
				<section>
					<#if therapeuticPrinciples??>
					<!--治则治法GBT167513 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/therapeutic-principles">
						<valueCode value="${therapeuticPrinciples}" />
					</extension>
					</#if>
					<title value="治疗计划章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="18776-5" />
							<display value="TREATMENT PLAN" />
						</coding>
					</code>
				</section>
				<!-- 其他处置章节 -->
				<section>
					<#if treatRescueCourse??>
					<!-- 诊疗过程描述 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/treat-resource-course">
						<valueString value="${treatRescueCourse}" />
					</extension>
					</#if>
					<title value="其他处置章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="99999-4" />
							<display value="OTHER DISPOSAL" />
						</coding>
					</code>
				</section>
			</Composition>
		</resource>
	</entry>
</Bundle>
