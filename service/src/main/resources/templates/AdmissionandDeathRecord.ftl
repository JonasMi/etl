<#ftl output_format="XML">
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
			<!-- 资源：24h内入院死亡记录 -->
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
				<!-- 指定创作者 -->
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
				<!-- 主任医师 -->
				<contained>
					<Practitioner xmlns="http://hl7.org/fhir">
						<id value="pra6" />
						<#if chiefPhysicianId??>
      					<identifier>
							<!-- 院内人员ID号命名空间 -->
							<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
							<!-- 院内人员ID号 -->
							<value value="${chiefPhysicianId}" />
						</identifier>
						</#if>
						<#if chiefPhysicianName??>
      					<name>
							<!-- 姓名 -->
							<text value="${chiefPhysicianName}" />
						</name>
						</#if>
					</Practitioner>
				</contained>
				<!-- 住院信息 -->
				<contained>
					<Encounter xmlns="http://hl7.org/fhir">
						<id value="e1" />
						<!-- 接诊医师 -->
						<contained>
							<Practitioner xmlns="http://hl7.org/fhir">
								<id value="e1pra1" />
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
								<#if receiveEmployeePostCd??>
								<practitionerRole>
									<specialty>
										<coding>
											<!-- 专业技术职务代码命名空间 -->
											<system value="urn:oid:2.16.156.10011.2.3.3.10" />
											
		      								<!-- 专业技术职务代码 -->
											<code value="${receiveEmployeePostCd}" />
										</coding>
									</specialty>
								</practitionerRole>
								</#if>
							</Practitioner>
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
						<#if cnFourResult??>
						<!--中医"四诊"观察结果 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/cn-four-result">
							<valueString value="${cnFourResult}" />
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
						<participant>
							<type>
								<coding>
									<!-- 角色代码命名空间 -->
									<system value="http://hl7.org/fhir/v3/ParticipationType" />
									<!-- 角色代码：接诊医生 -->
									<code value="REFT" />
									<display value="接诊医生" />
								</coding>
							</type>
							<!-- 接诊医生id -->
							<individual>
								<reference value="#e1pra1" />
							</individual>
						</participant>
						<#if start??>
     	 				<period>
							<!-- 入院时间 -->
							<start value="${start?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
						</period>
						</#if>
						<!-- 当前科室 -->
					    <serviceProvider>
					        <reference
					            value="#e1o1" />
					    </serviceProvider>
					</Encounter>
				</contained>
				<!-- 入院诊断 -->
				<contained>
					<Condition xmlns="http://hl7.org/fhir">
						<id value="con1" />
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
				<!-- 死亡诊断 -->
				<contained>
					<Condition xmlns="http://hl7.org/fhir">
						<id value="con2" />
						<#if inpatientDetails??>
						<!-- 入院情况 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/inpatient-details">
							<valueString value="${inpatientDetails}" />
						</extension>
						</#if>
						<#if treatRescueCourse??>
						<!-- 诊疗过程描述 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/treat-rescue-course">
							<valueString value="${treatRescueCourse}" />
						</extension>
						</#if>
						<#if deathTime??>
						<!-- 死亡日期时间-->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/datetime/death-time">
							<valueDateTime value="${deathTime?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
						</extension>
						</#if>
						<#if deathReasonName??>
						<!-- 直接死亡原因名称-->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/death-reason-name">
							<valueString value="${deathReasonName}" />
						</extension>
						</#if>
						<#if deathCnSymDiagCode??>
						<!--中医症候代码CV9900357 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/cn-sym-diag-code">
							<valueCode value="${deathCnSymDiagCode}" />
						</extension>
						</#if>
						<#if deathCnDisDiagCode??>
						<!--中医病名代码CV9900357 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/cn-dis-diag-code">
							<valueCode value="${deathCnDisDiagCode}" />
						</extension>
						</#if>
						<patient />
						<code>
							<coding>
								<!--诊断编码 -->
								<system value="urn:oid:2.16.156.10011.2.3.3.11" />
								<#if deathDiagCode??>
								<!--诊断编码 -->
								<code value="${deathDiagCode}" />
								</#if>
								<#if deathDiagName??>
      							<display value="${deathDiagName}" />
								</#if>
							</coding>
						</code>
						<category>
							<coding>
								<system
									value="http://www.nestvision.com/platform/app/data/v1/code/condition-types" />
								<code value="29" />
								<display value="死亡诊断" />
							</coding>
						</category>
						<verificationStatus />
						<#if deathDiagDate??>
						<!-- 诊断日期 -->
						<onsetDateTime value="${deathDiagDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
						</#if>
					</Condition>
				</contained>
				<#if caseNo??>
				<!-- 病案号 -->
				<extension
					url="http://www.nestvision.com/platform/app/data/v1/text/case-no">
					<valueString value="${caseNo}" />
				</extension>
				</#if>
				<#if inpatTimes??>
				<!-- 住院次数 -->
				<extension
					url="http://www.nestvision.com/platform/app/data/v1/number/inpat-times">
					<valueInteger value="${inpatTimes}" />
				</extension>
				</#if>
				<#if remarks??>
				<!-- 备注 -->
				<extension
					url="http://www.nestvision.com/platform/app/data/v1/text/remarks">
					<valueString value="${remarks}" />
				</extension>
				</#if>
				<!-- 24h内入院死亡记录id -->
				<identifier>
					<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/admissionand-death-record-id" />
					<value value="${admissionandDeathRecordId}" />
				</identifier>
				<!-- 记录日期 -->
				<date value="${date?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
				<!-- 文档类型：24h内入院死亡记录 -->
				<type>
					<coding>
						<system value="2.16.156.10011.2.4" />
						<code value="C0036" />
					</coding>
					<text value="24h内入院死亡记录" />
				</type>
				<!-- 文档标题：24h内入院死亡记录 -->
				<title value="24h内入院死亡记录" />
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
				<!-- 主(副主)任医师 -->
				<attester>
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
						<valueCode value="02" />
					</extension>
					<!-- 对于该文档的意义：个人 -->
					<mode value="personal" />
					<#if chiefPhysicianSignDate??>
      				<!-- 签名日期 -->
					<time value="${chiefPhysicianSignDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</#if>
					<party>
						<reference value="#pra6" />
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
					<entry>
						<reference value="#e1" />
					</entry>
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
					<entry>
						<reference value="#con1"/>
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
				<!-- 住院过程章节 -->
				<section>
					<title value="住院过程章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="8648-8" />
							<display value="Hospital Course" />
						</coding>
					</code>
					<!-- 死亡诊断 -->
					<entry>
						<reference value="#con2"/>
					</entry>
				</section>
			</Composition>
		</resource>
	</entry>
</Bundle>