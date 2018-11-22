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
			<!-- 资源：出院小结 -->
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
						<#if age??>
      					<!-- 年龄 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/number/age">
							<valueDecimal value="${age}" />
						</extension>
						</#if>
						<#if patientType??>
      					<!-- 患者类型 -->
						<extension url="urn:oid:2.16.156.10011.2.3.1.271">
							<valueCode value="${patientType}" />
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
						<#if nationCd??>
      					<!-- 民族代码 -->
					    <extension url="urn:oid:2.16.156.10011.2.3.3.3">
					        <valueCode value="${nationCd}" />
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
						<#if telecom??>
					    <telecom>
					        <!-- 联系方式代码 -->
					        <system value="phone" />
					        <!-- 现使用电话号码 -->
					        <value value="${telecom}" />
					        <!-- 使用方式:现在 -->
					        <use value="temp" />
					    </telecom>
					    </#if>
					     <#if gender??>
                        <!-- 性别 -->
                        <gender value="${mappingValue('GBT22611',gender)!''}" />
                        </#if>
						<#if birthdate??>
     	 				<!-- 出生日期 -->
						<birthDate value="${birthdate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
						</#if>
						<address>
							<#if workRoad??>
      						<!-- 地址-村（街、路、弄等） -->
							<extension
								url="http://www.nestvision.com/platform/app/data/v1/text/address-road">
								<valueString value="${workRoad}" />
							</extension>
							</#if>
							<#if workHouseNo??>
      						<!--地址-门牌号码 -->
							<extension
								url="http://www.nestvision.com/platform/app/data/v1/text/house-no">
								<valueString value="${workHouseNo}" />
							</extension>
							</#if>
							<#if workPostCd??>
      						<!--工作单位邮政编码 -->
							<extension
								url="http://www.nestvision.com/platform/app/data/v1/text/post-cd">
								<valueString value="${workPostCd}" />
							</extension>
							</#if>
							<!-- 地址类别代码:工作单位地址 -->
							<use value="work" />
							<#if workAddressDetails??>
      						<!-- 地址详细信息 -->
							<text value="${workAddressDetails}" />
							</#if>
							<#if workLine??>
      						<!-- 地址-乡（镇、街道办事处） -->
							<line value="${workLine}" />
							</#if>
							<#if workCity??>
      						<!-- 地址-市（地区）-->
							<city value="${workCity}" />
							</#if>
							<#if workDistrict??>
      						<!-- 地址-县（区） -->
							<district value="${workDistrict}" />
							</#if>
							<#if workState??>
      						<!-- 地址-省（自治区、直辖市） -->
							<state value="${workState}" />
							</#if>
						</address>
						<address>
					        <#if tempRoad??>
      						<!-- 地址-村（街、路、弄等） -->
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
      						<!--工作单位邮政编码 -->
							<extension
								url="http://www.nestvision.com/platform/app/data/v1/text/post-cd">
								<valueString value="${tempPostCd}" />
							</extension>
							</#if>
							<!-- 地址类别代码:工作单位地址 -->
							<use value="temp" />
							<#if tempAddressDetails??>
      						<!-- 地址详细信息 -->
							<text value="${tempAddressDetails}" />
							</#if>
							<#if tempLine??>
      						<!-- 地址-乡（镇、街道办事处） -->
							<line value="${tempLine}" />
							</#if>
							<#if tempCity??>
      						<!-- 地址-市（地区）-->
							<city value="${tempCity}" />
							</#if>
							<#if tempDistrict??>
      						<!-- 地址-县（区） -->
							<district value="${tempDistrict}" />
							</#if>
							<#if tempState??>
      						<!-- 地址-省（自治区、直辖市） -->
							<state value="${tempState}" />
							</#if>
					    </address>
					    <#if maritalstatus??>
      					<maritalStatus>
							<coding>
								<!-- 婚姻状况代码命名空间 -->
								<system value="urn:oid:2.16.156.10011.2.3.3.5" />
								<!-- 婚姻状况代码 -->
								<code value="${maritalstatus}" />
							</coding>
						</maritalStatus>
						</#if>
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
				<contained>
    				<#assign encounterType='inpatient-registration-id'> 
    				<#assign encounterMark='inpatient'>
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
						<#if encounterMark??&&encounterMark='inpatient'>
						<!-- 入院科室 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/identifier/in-dpid">
							<valueReference>
								<reference value="#e1o2" />
							</valueReference>
						</extension>
					    </#if>
					    <#if cnFourResult??>
      					<!--中医"四诊"观察结果 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/text/cn-four-result">
							<valueString value="${cnFourResult}" />
						</extension>
						</#if>
						<#if inpatientDays??>
      					<!--住院天数 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/number/inpatient-days">
							<valueDecimal value="${inpatientDays}" />
						</extension>
						</#if>
						
						<#if inpatientRegistrationId??&& encounterType?? >
						<identifier>
							<system
								value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/${encounterType}" />
							<!-- 原系统住院流水id号 -->
							<value value="${inpatientRegistrationId}" />
						</identifier>
						</#if>
						<!-- 状态 -->
						<status value="finished" />
						<#if encounterMark??>
						<!-- 类型：住院 -->
						<class value="${encounterMark}" />
						</#if>
						<#if startTime??||endTime??>
     	 				<period>
     	 					<#if startTime??>
							<!-- 入院时间 -->
							<start value="${startTime?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
							</#if>
							<#if endTime??>
     	 					<!-- 手术结束时间 -->
							<end value="${endTime?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
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
				<!-- 医嘱信息 -->
				<contained>
					<MedicationOrder xmlns="http://hl7.org/fhir">
						<id value="me1" />
						<#if cnPrescribeDescr??>
      					<!-- 中药煎煮法 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/cn-prescribe-descr">
							<valueString value="${cnPrescribeDescr}" />
						</extension>
						</#if>
						<#if cnDrugWayCd??>
      					<!-- 中药服用方法代码 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/cn-drug-way-cd">
							<valueCode value="${cnDrugWayCd}" />
						</extension>
						</#if>
						<medicationReference/>
					</MedicationOrder>
				</contained>
				<contained>
					<Practitioner xmlns="http://hl7.org/fhir">
						<id value="pra2" />
						<#if statutoryAuditId??>
      					<identifier>
							<!-- 院内人员ID号命名空间 -->
							<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
							<!-- 院内人员ID号 -->
							<value value="${statutoryAuditId}" />
						</identifier>
						</#if>
						<#if statutoryAuditName??>
      					<name>
							<!-- 姓名 -->
							<text value="${statutoryAuditName}" />
						</name>
						</#if>
					</Practitioner>
				</contained>
				<contained>
					<Practitioner xmlns="http://hl7.org/fhir">
						<id value="pra3" />
						<#if documentVerifierId??>
      					<identifier>
							<!-- 院内人员ID号命名空间 -->
							<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
							<!-- 院内人员ID号 -->
							<value value="${documentVerifierId}" />
						</identifier>
						</#if>
						<#if documentVerifierName??>
      					<name>
							<!-- 姓名 -->
							<text value="${documentVerifierName}" />
						</name>
						</#if>
					</Practitioner>
				</contained>
				<contained>
					<Practitioner xmlns="http://hl7.org/fhir">
						<id value="pra4" />
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
				<contained>
					<Practitioner xmlns="http://hl7.org/fhir">
						<id value="pra5" />
						<#if attendingPhysicianId??>
      					<identifier>
							<!-- 院内人员ID号命名空间 -->
							<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
							<!-- 院内人员ID号 -->
							<value value="${attendingPhysicianId}" />
						</identifier>
						</#if>
						<#if attendingPhysicianName??>
      					<name>
							<!-- 姓名 -->
							<text value="${attendingPhysicianName}" />
						</name>
						</#if>
					</Practitioner>
				</contained>
				<contained>
					<!-- 入院诊断 -->
					<Condition xmlns="http://hl7.org/fhir">
						<id value="c1" />
						<#if inCnSymDiagCode??>
      					<!--中医征候诊断代码CV9900357 -->
						<extension
								url="http://www.nestvision.com/platform/app/data/v1/code/cn-sym-diag-code">
						<valueCode value="${inCnSymDiagCode}" />
						</extension>
						</#if>
						<#if inCnDisDiagCode??>
      					<!--中医病名诊断代码CV9900357 -->
						<extension
								url="http://www.nestvision.com/platform/app/data/v1/code/cn-dis-diag-code">
						<valueCode value="${inCnDisDiagCode}" />
						</extension>
						</#if>
						<patient />
						<code>
							<coding>
								<!--诊断编码 -->
								<system value="urn:oid:2.16.156.10011.2.3.3.11" />
								<#if inDiagCode??>
								<!--诊断编码 -->
								<code value="${inDiagCode}" />
								</#if>
								<#if inDiagValue??>
      							<display value="${inDiagValue}" />
								</#if>
							</coding>
						</code>
						<category>
					        <coding>
					            <system
					                value="http://www.nestvision.com/platform/app/data/v1/code/condition-types" />
					            <code value="3" />
					            <display value="入院确定诊断西医诊断" />
					        </coding>
					    </category>
						<verificationStatus />
						<#if inDiagDate??>
						<!-- 诊断日期 -->
						<onsetDateTime value="${inDiagDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
						</#if>
					</Condition>
				</contained>
				<contained>
					<!-- 出院诊断 -->
					<Condition xmlns="http://hl7.org/fhir">
						<id value="c2" />
						<#if outCnSymDiagCode??>
      					<!--中医征候诊断代码CV9900357 -->
						<extension
								url="http://www.nestvision.com/platform/app/data/v1/code/cn-sym-diag-code">
						<valueCode value="${outCnSymDiagCode}" />
						</extension>
						</#if>
						<#if outCnDisDiagCode??>
      					<!--中医病名诊断代码CV9900357 -->
						<extension
								url="http://www.nestvision.com/platform/app/data/v1/code/cn-dis-diag-code">
						<valueCode value="${outCnDisDiagCode}" />
						</extension>
						</#if>
						<#if outDischargeSymptomAndSign??>
      					<!--出院时症状与体征 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/text/discharge-symptom-and-sign">
							<valueString value="${outDischargeSymptomAndSign}" />
						</extension>
						</#if>
						<#if outDischargeCircumstance??>
      					<!--出院情况 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/text/discharge-circumstance">
							<valueString value="${outDischargeCircumstance}" />
						</extension>
						</#if>
						<#if outTreatmentResultCode??>
      					<!-- 治疗结果代码 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/treatment-result-code">
							<valueCode value="${outTreatmentResultCode}" />
						</extension>
						</#if>
						<patient />
						<code>
							<coding>
								<!--诊断编码 -->
								<system value="urn:oid:2.16.156.10011.2.3.3.11" />
								<#if outDiagCode??>
								<!--诊断编码 -->
								<code value="${outDiagCode}" />
								</#if>
								<#if outDiagValue??>
      							<display value="${outDiagValue}" />
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
						<#if outDiagDate??>
						<!-- 诊断日期 -->
						<onsetDateTime value="${outDiagDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
						</#if>
					</Condition>
				</contained>
				<contained>
					<Procedure>
						<id value="pro1"/>
						<#if incisionTypeCode??>
      					<!-- 切口类别代码 -->
						<extension url="urn:oid:2.16.156.10011.2.3.1.256">
							<valueCode value="${incisionTypeCode}" />
						</extension>
						</#if>
						<#if incisionHealingRankCode??>
      					<!-- 切口愈合级别代码 -->
						<extension url="urn:oid:2.16.156.10011.2.3.1.257">
							<valueCode value="${incisionHealingRankCode}" />
						</extension>
						</#if>
						<#if operationCourses??>
      					<!-- 手术过程 -->
						<extension url="http://www.nestvision.com/platform/app/data/v1/text/operation-course">
							<valueString value="${operationCourses}" />
						</extension>
						</#if>
						<#if operationId??>
      					<identifier>
							<!-- 原系统手术单id命名空间 -->
							<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/operation-id" />
							<!-- 原系统手术单id号 -->
							<value value="${operationId}" />
						</identifier>
						</#if>
						<subject/>
						<!-- 状态 -->
						<status/>
						<code>
							<coding>
								<!-- 麻醉方法命名空间 -->
								<system value="urn:oid:2.16.156.10011.2.3.1.159" />
								<#if anesthesiaCode??>
      							<!-- 麻醉方法代码 -->
								<code value="${anesthesiaCode}" />
								</#if>
								<#if anesthesiaWay??>
      							<!-- 麻醉方法 -->
								<display value="${anesthesiaWay}" />
								</#if>
							</coding>
						</code>
						<performedPeriod>
							<#if procedureStart??>
     	 					<!-- 手术开始时间 -->
							<start value="${procedureStart?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
							</#if>
							<#if procedureEnd??>
     	 					<!-- 手术结束时间 -->
							<end value="${procedureEnd?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
							</#if>
						</performedPeriod>
					</Procedure>
				</contained>
				<#if dischargeSummaryType??>
      			<!-- 出院小结类型 -->
			 	<extension url="http://www.nestvision.com/platform/app/data/v1/code/discharge-summary-type">
		            <valueCode value="${dischargeSummaryType}" />
		        </extension>
				</#if>
				<!-- 出院小结id -->
				<identifier>
					<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/discharge-summary-id" />
					<value value="${dischargeSummaryId}" />
				</identifier>
				<!-- 记录日期 -->
				<date value="${date?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
				<!-- 文档类型：出院小结 -->
				<type>
					<coding>
						<system value="2.16.156.10011.2.4" />
						<code value="C0053" />
					</coding>
					<text value="出院小结" />
				</type>
				<!-- 文档标题：出院小结 -->
				<title value="出院小结" />
				<!-- 状态：preliminary初步 final最终amended修订entered-in-error错误 -->
				<status value="final" />
				<!-- 保密等级：U:不受限制的 L:低等级 M:中等 N:常规 R:保密的 V:十分机密的 -->
				<confidentiality value="N" />
				<!-- 居民信息 -->
				<subject>
					<reference value="#pat1" />
				</subject>
				<!-- 文档创建者 -->
				<author>
					<reference value="#pra1" />
				</author>
				<!-- 法定审核者 -->
			    <attester>
			        <extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
			            <valueCode value="16" />
			        </extension>
			        <!-- 对于该文档的意义：法律认可 -->
			        <mode value="legal" />
			        <#if statutoryAuditSignDate??>
     	 			 <!-- 签名日期 -->
			        <time value="${statutoryAuditSignDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</#if>
			        <party>
			            <reference value="#pra2" />
			        </party>
			    </attester>
			    <!-- 文档审核者 -->
			    <attester>
			        <extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
			            <valueCode value="17" />
			        </extension>
			        <!-- 对于该文档的意义：法律认可 -->
			        <mode value="legal" />
			        <#if documentVerifierSignDate??>
     	 			<!-- 签名日期 -->
			        <time value="${documentVerifierSignDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</#if>
			        <party>
			            <reference value="#pra3" />
			        </party>
			    </attester>
			    <!-- 住院医师 -->
			    <attester>
			        <extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
			            <valueCode value="04" />
			        </extension>
			        <!-- 对于该文档的意义：法律认可 -->
			        <mode value="legal" />
			        <#if residentDoctorSignDate??>
     	 			<!-- 签名日期 -->
			        <time value="${residentDoctorSignDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</#if>
			        <party>
			            <reference value="#pra4" />
			        </party>
			    </attester>
			    <!-- 主治医师 -->
			    <attester>
			        <extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
			            <valueCode value="03" />
			        </extension>
			        <!-- 对于该文档的意义：法律认可 -->
			        <mode value="legal" />
			        <#if attendingPhysicianSignDate??>
     	 			 <!-- 签名日期 -->
			        <time value="${attendingPhysicianSignDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</#if>
			        <party>
			            <reference value="#pra5" />
			        </party>
			    </attester>
				<!-- 提供患者服务机构 -->
				<custodian>
					<reference value="#hos1" />
				</custodian>
				<!-- 门诊或住院信息 -->
				<encounter>
					<reference value="#e1" />
				</encounter>
				<!-- 主要健康问题章节 -->
				<section>
					<#if inpatientCircumstance??>
      				<!-- 入院情况 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/text/inpatient-circumstance">
						<valueString value="${inpatientCircumstance}" />
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
				<!-- 入院诊断章节 -->
				<section>
					<title value="入院诊断章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="46241-6" />
							<display value="HOSPITAL ADMISSION DX" />
						</coding>
					</code>
					<!-- 入院诊断信息 -->
					<entry>
						<reference value="#c1" />
					</entry>
				</section>
				<!-- 出院诊断章节 -->
				<section>
					<title value="出院诊断章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="11535-2" />
							<display value="Discharge Diagnosis" />
						</coding>
					</code>
					<!-- 出院诊断信息 -->
					<entry>
						<reference value="#c2" />
					</entry>
				</section>
				<!-- 手术操作章节 -->
				<section>
					<title value="手术操作章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="47519-4" />
							<display value="HISTORY OF PROCEDURES" />
						</coding>
					</code>
					<!-- 手术操作信息 -->
					<entry>
						<reference value="#pro1" />
					</entry>
				</section>
				<!-- 治疗计划章节 -->
				<section>
					<#if therapeuticPrinciples??>
      				<!--治则治法 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/text/therapeutic-principles">
						<valueString value="${therapeuticPrinciples}" />
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
				<!-- 住院过程章节 -->
				<section>
					<#if mattersNeedingAttention??>
      				<!-- 诊疗过程描述 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/text/matters-needing-attention">
						<valueString value="${mattersNeedingAttention}" />
					</extension>
					</#if>
					<title value="住院过程章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="8648-8" />
							<display value="Hospital Course" />
						</coding>
					</code>
				</section>
				<!-- 医嘱章节 -->
				<section>
					<#if dischargeAdvice??>
      				<!-- 出院医嘱 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/text/discharge-advice">
						<valueString value="${dischargeAdvice}" />
					</extension>
					</#if>
					<title value="医嘱章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="46209-3" />
							<display value="Provider Orders" />
						</coding>
					</code>
					<!-- 医嘱 -->
					<entry>
						<reference value="#me1" />
					</entry>
				</section>
				<!-- 实验室检查章节 -->
				<section>
					<#if positiveAuxInspectionResult??>
      				<!-- 阳性辅助检查结果 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/text/positive-aux-inspection-result">
						<valueString value="${positiveAuxInspectionResult}" />
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
			</Composition>
		</resource>
	</entry>
</Bundle>

