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
		<fullUrl
			value="http://fhir.healthintersections.com.au/open/Composition/180f219f-97a8-486d-99d9-ed631fe4fc57" />
		<resource>
			<!-- 资源： 剖宫产记录 -->
			<Composition xmlns="http://hl7.org/fhir">
				<contained>
					<Organization xmlns="http://hl7.org/fhir">
						<id value="hos1" />
						<identifier>
							<!-- 原系统机构ID号命名空间 -->
							<system
								value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/hospital-id" />
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
					<Practitioner xmlns="http://hl7.org/fhir">
						<id value="pra2" />
						<#if protectBabyId??>
      					<identifier>
							<!-- 院内人员ID号命名空间 -->
							<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
							<!-- 院内人员ID号 -->
							<value value="${protectBabyId}" />
						</identifier>
						</#if>
						<#if protectBabyName??>
      					<name>
							<!-- 姓名 -->
							<text value="${protectBabyName}" />
						</name>
						</#if>
					</Practitioner>
				</contained>
				<contained>
					<Practitioner xmlns="http://hl7.org/fhir">
						<id value="pra3" />
						<#if instructorId??>
      					<identifier>
							<!-- 院内人员ID号命名空间 -->
							<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
							<!-- 院内人员ID号 -->
							<value value="${instructorId}" />
						</identifier>
						</#if>
						<#if instructorName??>
      					<name>
							<!-- 姓名 -->
							<text value="${instructorName}" />
						</name>
						</#if>
					</Practitioner>
				</contained>
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
						<!-- 入院科室 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/identifier/in-dpid">
							<valueReference>
								<reference value="#e1o2" />
							</valueReference>
						</extension>
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
				<contained>
					<!-- 手术单示例 -->
					<Procedure xmlns="http://hl7.org/fhir">
						<id value="p1" />
						<contained>
							<Practitioner xmlns="http://hl7.org/fhir">
								<id value="p1pra1" />
								<#if operative??>
		      					<identifier>
									<!-- 院内人员ID号命名空间 -->
									<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
									<!-- 院内人员ID号 -->
									<value value="${operative}" />
								</identifier>
								</#if>
								<#if operativeName??>
		      					<name>
									<!-- 姓名 -->
									<text value="${operativeName}" />
								</name>
								</#if>
							</Practitioner>
						</contained>
						<contained>
							<Practitioner xmlns="http://hl7.org/fhir">
								<id value="p1pra2" />
								<#if firstAssistant??>
		      					<identifier>
									<!-- 院内人员ID号命名空间 -->
									<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
									<!-- 院内人员ID号 -->
									<value value="${firstAssistant}" />
								</identifier>
								</#if>
								<#if firstAssistantName??>
		      					<name>
									<!-- 姓名 -->
									<text value="${firstAssistantName}" />
								</name>
								</#if>
							</Practitioner>
						</contained>
						<contained>
							<Practitioner xmlns="http://hl7.org/fhir">
								<id value="p1pra3" />
								<#if equipmentManager??>
		      					<identifier>
									<!-- 院内人员ID号命名空间 -->
									<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
									<!-- 院内人员ID号 -->
									<value value="${equipmentManager}" />
								</identifier>
								</#if>
								<#if equipmentManagerName??>
		      					<name>
									<!-- 姓名 -->
									<text value="${equipmentManagerName}" />
								</name>
								</#if>
							</Practitioner>
						</contained>
						<contained>
							<Practitioner xmlns="http://hl7.org/fhir">
								<id value="p1pra4" />
								<#if anaesthetic??>
		      					<identifier>
									<!-- 院内人员ID号命名空间 -->
									<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
									<!-- 院内人员ID号 -->
									<value value="${anaesthetic}" />
								</identifier>
								</#if>
								<#if anaestheticName??>
		      					<name>
									<!-- 姓名 -->
									<text value="${anaestheticName}" />
								</name>
								</#if>
							</Practitioner>
						</contained>
						<#if anesPosition??>
      					<!-- 麻醉体位 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/anes-position">
							<valueString value="${anesPosition}" />
						</extension>
						</#if>
						<#if anesEffect??>
      					<!-- 麻醉效果 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/anes-effect">
							<valueString value="${anesEffect}" />
						</extension>
						</#if>
						<#if lossbloodAmount??>
      					<!-- 出血量（mL） -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/number/lossblood-amount">
							<valueDecimal value="${lossbloodAmount?string('#')}" />
						</extension>
						</#if>
						<#if transfusionItemAmount??>
      					<!-- 输血量 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/number/transfusion-item-amount">
							<valueDecimal value="${transfusionItemAmount?string('#')}" />
						</extension>
						</#if>
						<#if infusionAmount??>
      					<!-- 输液量 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/number/infusion-amount">
							<valueDecimal value="${infusionAmount?string('#')}" />
						</extension>
						</#if>
						<#if oxygenTime??>
      					<!-- 供氧时间（min） -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/number/oxygen-time">
							<valueDecimal value="${oxygenTime?string('#')}" />
						</extension>
						</#if>
						<#if operationId??>
      					<identifier>
							<!-- 原系统手术单id命名空间 -->
							<system
								value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/operation-id" />
							<!-- 原系统手术单id号 -->
							<value value="${operationId}" />
						</identifier>
						</#if>
						<subject />
						<status />
						<category>
							<coding>
								<!-- 处置类别命名空间 -->
								<system
									value="http://www.nestvision.com/platform/app/data/v1/code/procedure-types" />
								<!-- 处置类别 -->
								<code value="01" />
								<!-- 处置类别名称 -->
								<display value="手术" />
							</coding>
						</category>
						<code>
							<#if anesthesiaMethodCd??||anesthesiaMethodName??>
							<coding>
								<!-- 麻醉方法命名空间 -->
								<system value="urn:oid:2.16.156.10011.2.3.1.159" />
								<#if anesthesiaMethodCd??>
      							<!-- 麻醉方法代码 -->
								<code value="${anesthesiaMethodCd}" />
								</#if>
								<#if anesthesiaMethodName??>
      							<!-- 麻醉方法 -->
								<display value="${anesthesiaMethodName}" />
								</#if>
							</coding>
							</#if>
							<#if operationCd??||operationName??>
							<coding>
								<!-- 手术编码命名空间 -->
								<system value="urn:oid:2.16.156.10011.2.3.3.12" />
								<#if operationCd??>
      							<!-- 手术编码 -->
								<code value="${operationCd}" />
								</#if>
								<#if operationName??>
      							<!-- 手术名字 -->
								<display value="${operationName}" />
								</#if>
							</coding>
							</#if>
						</code>
						<#if partCode??||partName??>
						<bodySite>
							<coding>
								<!-- 手术操作目标部位代码命名空间 -->
								<system value="urn:oid:2.16.156.10011.2.3.1.262" />
								<#if partCode??>
      							<!-- 手术操作目标部位代码 -->
								<code value="${partCode}" />
								</#if>
								<#if partName??>
      							<!-- 手术操作目标部位名称 -->
								<display value="${partName}" />
								</#if>
							</coding>
						</bodySite>
						</#if>
						<performer>
							<!-- 手术者id -->
							<actor>
								<reference value="#p1pra1" />
							</actor>
							<role>
								<coding>
									<!-- 角色代码命名空间 -->
									<system value="http://hl7.org/fhir/ValueSet/performer-role" />
									<!-- 角色代码：手术者 -->
									<code value="405684005" />
								</coding>
								<!-- 角色名称 -->
								<text value="术者" />
							</role>
						</performer>
						<performer>
							<!-- I助id -->
							<actor>
								<reference value="#p1pra2" />
							</actor>
							<role>
								<coding>
									<!-- 角色代码命名空间 -->
									<system value="http://hl7.org/fhir/ValueSet/performer-role" />
									<!-- 角色代码：手术助理 -->
									<code value="405685006" />
								</coding>
								<!-- 角色名称 -->
								<text value="I助" />
							</role>
						</performer>
						<performer>
							<!-- 器械护士id -->
							<actor>
								<reference value="#p1pra3" />
							</actor>
							<role>
								<coding>
									<!-- 角色代码命名空间 -->
									<system value="http://hl7.org/fhir/ValueSet/performer-role" />
									<!-- 角色代码：器械护士 -->
									<code value="310194009" />
								</coding>
								<!-- 角色名称 -->
								<text value="器械护士" />
							</role>
						</performer>
						<performer>
							<!-- 麻醉者id -->
							<actor>
								<reference value="#p1pra4" />
							</actor>
							<role>
								<coding>
									<!-- 角色代码命名空间 -->
									<system value="http://hl7.org/fhir/ValueSet/performer-role" />
									<!-- 角色代码：麻醉者 -->
									<code value="158970007" />
								</coding>
								<!-- 角色名称 -->
								<text value="麻醉者" />
							</role>
						</performer>
						<#if procedureStart??||procedureEnd??>
						<performedPeriod>
							<#if procedureStart??>
     	 					<!-- 手术开始时间 -->
							<start value="${procedureStart?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
							</#if>
							<#if procedureEnd??>
     	 					<!-- 手术结束时间 -->
							<end  value="${procedureEnd?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
							</#if>
						</performedPeriod>
						</#if>
					</Procedure>
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
					<valueInteger value="${inpatTimes?string('#')}" />
				</extension>
				</#if>
				<#if remarks??>
      			<!--备注 -->
				<extension
					url="http://www.nestvision.com/platform/app/data/v1/text/remarks">
					<valueString value="${remarks}" />
				</extension>
				</#if>
				<!-- 原系统剖宫产记录id -->
				<identifier>
					<system
						value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/cesarean-section-record-id" />
					<value value="${cesareanSectionRecordId}" />
				</identifier>
				<!-- 记录日期 -->
				<date value="${date?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
				<!-- 文档类型：剖宫产记录 -->
				<type>
					<coding>
						<system value="2.16.156.10011.2.4" />
						<code value="C0016" />
					</coding>
					<text value="剖宫产记录" />
				</type>
				<!-- 文档标题：剖宫产记录 -->
				<title value="剖宫产记录" />
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
				<!-- 护婴者id -->
				<attester>
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
						<valueCode value="14" />
					</extension>
					<!-- 对于该文档的意义：个人 -->
					<mode value="personal" />
					<#if protectBabyDate??>
     	 			<!-- 签名日期 -->
					<time value="${protectBabyDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</#if>
					<party>
						<reference value="#pra2" />
					</party>
				</attester>
				<!-- 指导者id -->
				<attester>
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
						<valueCode value="15" />
					</extension>
					<!-- 对于该文档的意义：个人 -->
					<mode value="personal" />
					<#if instructorDate??>
     	 			<!-- 签名日期 -->
					<time value="${instructorDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</#if>
					<party>
						<reference value="#pra3" />
					</party>
				</attester>
			    <!-- 文档保管机构id -->
			    <custodian>
			        <reference value="#hos1" />
			    </custodian>
				<!-- 住院信息 -->
				<encounter>
					<reference value="#e1" />
				</encounter>
				<!-- 手术操作章节 -->
				<section>
					<#if expectantTime??>
      				<!-- 待产日期时间 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/datetime/expectant-time">
						<valueDateTime value="${expectantTime?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</extension>
					</#if>
					<#if amnioticCompleteMark??>
      				<!--胎膜完整情况标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/amniotic-complete-mark">
						<valueBoolean value="${amnioticCompleteMark?then('true','false')}" />
					</extension>
					</#if>
					<#if chordaUmbilicalisLength??>
      				<!-- 脐带长度（cm） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/chorda-umbilicalis-length">
						<valueDecimal value="${chordaUmbilicalisLength?string('#')}" />
					</extension>
					</#if>
					<#if raogengBody??>
      				<!-- 绕颈身（周） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/raogeng-body">
						<valueDecimal value="${raogengBody?string('#')}" />
					</extension>
					</#if>
					<#if prenatalDiagName??>
      				<!-- 产前诊断 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/prenatal-diag-name">
						<valueString value="${prenatalDiagName}" />
					</extension>
					</#if>
					<#if prenatalDiagName??>
      				<!-- 手术指征 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/operation-indication">
						<valueString value="${operationIndication}" />
					</extension>
					</#if>
					<#if operationDescribe??>
      				<!-- 剖宫产手术过程 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/operation-describe">
						<valueString value="${operationDescribe}" />
					</extension>
					</#if>
					<#if operationDescribe??>
      				<!-- 子宫情况 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/uterine-conditions">
						<valueString value="${uterineConditions}" />
					</extension>
					</#if>
					<#if fetusPositionCd??>
      				<!--胎方位代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/fetus-position-cd">
						<valueCode value="${fetusPositionCd}" />
					</extension>
					</#if>
					<#if deliveryBabyMethod??>
      				<!-- 胎儿娩出方式 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/delivery-baby-method">
						<valueString value="${deliveryBabyMethod}" />
					</extension>
					</#if>
					<#if placentaYellow??>
      				<!-- 胎盘黄染 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/placenta-yellow">
						<valueString value="${placentaYellow}" />
					</extension>
					</#if>
					<#if membraneYellow??>
					<!-- 胎膜黄染 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/membrane-yellow">
						<valueString value="${membraneYellow}" />
					</extension>
					</#if>
					<#if cordEntanglementState??>
					<!-- 脐带缠绕情况 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/cord-entanglement-state">
						<valueString value="${cordEntanglementState}" />
					</extension>
					</#if>
					<#if umbilicalCordTorsion??>
					<!-- 脐带扭转（周） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/umbilical-cord-torsion">
						<valueDecimal value="${umbilicalCordTorsion?string('#')}" />
					</extension>
					</#if>
					<#if saveCordBloodCd??>
					<!-- 留存脐带血情况标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/save-cord-blood-cd">
						<valueBoolean value="${saveCordBloodCd?then('true','false')}" />
					</extension>
					</#if>
					<#if uterineSutureState??>
					<!-- 子宫壁缝合情况 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/uterine-suture-state">
						<valueString value="${uterineSutureState}" />
					</extension>
					</#if>
					<#if uterotonicName??>
					<!-- 宫缩剂名称 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/uterotonic-name">
						<valueString value="${uterotonicName}" />
					</extension>
					</#if>
					<#if uterotonicUseWay??>
					<!-- 宫缩剂使用方法 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/uterotonic-use-way">
						<valueString value="${uterotonicUseWay}" />
					</extension>
					</#if>
					<#if operationDrug??>
					<!-- 手术用药 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/operation-drug">
						<valueString value="${operationDrug}" />
					</extension>
					</#if>
					<#if operationDrugAmount??>
					<!-- 手术用药量 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/operation-drug-amount">
						<valueString value="${operationDrugAmount}" />
					</extension>
					</#if>
					<#if explorationUterus??>
					<!-- 腹腔探查子宫 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/exploration-uterus">
						<valueString value="${explorationUterus}" />
					</extension>
					</#if>
					<#if explorationUterus??>
					<!-- 腹腔探查附件 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/exploration-adnexa">
						<valueString value="${explorationAdnexa}" />
					</extension>
					</#if>
					<#if uterotonicYcCd??>
					<!-- 宫腔探查异常情况标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/uterotonic-yc-cd">
						<valueBoolean value="${uterotonicYcCd?then('true','false')}" />
					</extension>
					</#if>
					<#if uterotonicJlCd??>
					<!-- 宫腔探查肌瘤标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/uterotonic-jl-cd">
						<valueBoolean value="${uterotonicJlCd?then('true','false')}" />
					</extension>
					</#if>
					<#if uterineProbe??>
					<!-- 宫腔探查处理情况 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/uterine-probe">
						<valueString value="${uterineProbe}" />
					</extension>
					</#if>
					<#if operationMaternalState??>
					<!-- 手术时产妇情况 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/operation-maternal-state">
						<valueString value="${operationMaternalState}" />
					</extension>
					</#if>
					<#if transfusionComponent??>
					<!-- 输血成分 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/transfusion-component">
						<valueString value="${transfusionComponent}" />
					</extension>
					</#if>
					<#if otherDrug??>
					<!-- 其他用药 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/other-drug">
						<valueString value="${otherDrug}" />
					</extension>
					</#if>
					<#if otherState??>
					<!-- 其他情况 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/other-state">
						<valueString value="${otherState}" />
					</extension>
					</#if>
					<#if operationWholeTime??>
					<!-- 手术全程时间（min） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/operation-whole-time">
						<valueDecimal value="${operationWholeTime?string('#')}" />
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
						<reference value="#p1"/>
					</entry>
				</section>
				<!-- 产后处置章节 -->
				<section>
					<#if opPostDiag??>
      				<!-- 产后诊断 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/op-post-diag">
						<valueString value="${opPostDiag}" />
					</extension>
					</#if>
					<#if postpartumObsTime??>
      				<!-- 产后观察日期时间-->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/datetime/postpartum-obs-time">
						<valueDateTime value="${postpartumObsTime?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</extension>
					</#if>
					<#if postpartumExaminationTime??>
      				<!-- 产后检查时间（min）-->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/postpartum-examination-time">
						<valueDecimal value="${postpartumExaminationTime?string('#')}" />
					</extension>
					</#if>
					<#if sbp??>
      				<!-- 收缩压（mmHg ） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/sbp">
						<valueDecimal value="${sbp?string('#')}" />
					</extension>
					</#if>
					<#if dbp??>
      				<!-- 舒张压 （mmHg ）-->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/dbp">
						<valueDecimal value="${dbp?string('#')}" />
					</extension>
					</#if>
					<#if pulses??>
      				<!-- 脉搏（次/min ） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/pulses">
						<valueDecimal value="${pulses?string('#')}" />
					</extension>
					</#if>
					<#if postpartumHeartRate??>
      				<!-- 产后心率（次/min ） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/postpartum-heart-rate">
						<valueDecimal value="${postpartumHeartRate?string('#')}" />
					</extension>
					</#if>
					<#if postpartumLossbloodAmount??>
      				<!-- 产后出血量（mL） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/postpartum-lossblood-amount">
						<valueDecimal value="${postpartumLossbloodAmount?string('#')}" />
					</extension>
					</#if>
					<#if postpartumUc??>
      				<!-- 产后宫缩 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/postpartum-uc">
						<valueDecimal value="${postpartumUc?string('#')}" />
					</extension>
					</#if>
					<#if postpartumFundusHeight??>
      				<!-- 产后宫底高度（cm） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/postpartum-fundus-height">
						<valueDecimal value="${postpartumFundusHeight?string('#')}" />
					</extension>
					</#if>
					<title value="产后处置章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="57076-2" />
							<display value="postpartum hospitalization treatment" />
						</coding>
					</code>
				</section>
				<!-- 新生儿章节 -->
				<section>
					<#if genderCode??>
      				<!--性别代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/gender-code">
						<valueCode value="${genderCode}" />
					</extension>
					</#if>
					<#if birthWeight??>
      				<!-- 新生儿出生体重（g） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/birth-weight">
						<valueDecimal value="${birthWeight?string('#')}" />
					</extension>
					</#if>
					<#if birthLength??>
      				<!-- 新生儿出生身长（cm） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/birth-length">
						<valueDecimal value="${birthLength?string('#')}" />
					</extension>
					</#if>
					<#if tumorSize??>
      				<!-- 产瘤大小 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/tumor-size">
						<valueString value="${tumorSize}" />
					</extension>
					</#if>
					<#if tumorPart??>
      				<!-- 产瘤部位 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/tumor-part">
						<valueString value="${tumorPart}" />
					</extension>
					</#if>
					<title value="新生儿章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="57075-4" />
							<display value="newborn delivery information" />
						</coding>
					</code>
				</section>
				<!-- 分娩评估章节 -->
				<section>
					<#if apgarScoreIntervalCd??>
      				<!-- Apgar评分间隔时间代码 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/code/apgar-score-interval-cd">
						<valueCode value="${apgarScoreIntervalCd}" />
					</extension>
					</#if>
					<#if apgarScore??>
      				<!-- Apgar评分值 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/apgar-score">
						<valueDecimal value="${apgarScore?string('#')}" />
					</extension>
					</#if>
					<#if deliveryOutcomeCd??>
      				<!-- 分娩结局代码 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/code/delivery-outcome-cd">
						<valueCode value="${deliveryOutcomeCd}" />
					</extension>
					</#if>
					<#if newbornAbnormalCd??>
      				<!-- 新生儿异常情况代码 -->
					<extension url="http://www.nestvision.com/platform/app/data/v1/code/newborn-abnormal-cd">
						<valueCode value="${newbornAbnormalCd}" />
					</extension>
					</#if>
					<title value="分娩评估章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="51848-0" />
							<display value="Assessment note" />
						</coding>
					</code>
				</section>
			</Composition>
		</resource>
	</entry>
</Bundle>
