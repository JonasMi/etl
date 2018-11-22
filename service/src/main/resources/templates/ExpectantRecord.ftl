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
			<!-- 资源： 待产记录 -->
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
						<#if birthControlExaminerId??>
      					<identifier>
							<!-- 院内人员ID号命名空间 -->
							<system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
							<!-- 院内人员ID号 -->
							<value value="${birthControlExaminerId}" />
						</identifier>
						</#if>
						<#if birthControlExaminerName??>
      					<name>
							<!-- 姓名 -->
							<text value="${birthControlExaminerName}" />
						</name>
						</#if>
					</Practitioner>
				</contained>
				<contained>
					<Practitioner xmlns="http://hl7.org/fhir">
						<id value="pra3" />
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
				<!--备注 -->
				<extension
					url="http://www.nestvision.com/platform/app/data/v1/text/remarks">
					<valueString value="${remarks}" />
				</extension>
				</#if>
				<!-- 原系统待产记录id -->
				<identifier>
					<system
						value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/expectant-record-id" />
					<value value="${expectantRecordId}" />
				</identifier>
				<!-- 记录日期 -->
				<date value="${date?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
				<!-- 文档类型：待产记录 -->
				<type>
					<coding>
						<system value="2.16.156.10011.2.4" />
						<code value="C0014" />
					</coding>
					<text value="待产记录" />
				</type>
				<!-- 文档标题：待产记录 -->
				<title value="待产记录" />
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
				<!-- 产程检查者id -->
				<attester>
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
						<valueCode value="09" />
					</extension>
					<!-- 对于该文档的意义：个人 -->
					<mode value="personal" />
					<#if birthControlExaminerDate??>
      				<!-- 签名日期 -->
					<time value="${birthControlExaminerDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</#if>
					<party>
						<reference value="#pra2" />
					</party>
				</attester>
				<!-- 记录人id -->
				<attester>
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
						<valueCode value="10" />
					</extension>
					<!-- 对于该文档的意义：个人 -->
					<mode value="personal" />
					<#if recorderDate??>
      				<!-- 签名日期 -->
					<time value="${recorderDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
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
				<!-- 主要健康问题章节 -->
				<section>
					<#if deliveryTime??>
      				<!--待产日期时间 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/datetime/delivery-time">
						<valueDateTime value="${deliveryTime?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</extension>
					</#if>
					<#if gravidity??>
      				<!-- 孕次 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/gravidity">
						<valueDecimal value="${gravidity}" />
					</extension>
					</#if>
					<#if parity??>
      				<!-- 产次 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/parity">
						<valueDecimal value="${parity}" />
					</extension>
					</#if>
					<#if mensesLastDate??>
      				<!--末次月经日期 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/datetime/menses-last-date">
						<valueDateTime value="${mensesLastDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</extension>
					</#if>
					<#if conceptionFormCd??>
      				<!-- 受孕形式代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/conception-form-cd">
						<valueCode value="${conceptionFormCd}" />
					</extension>
					</#if>
					<#if expectedChildbirthDate??>
      				<!--预产期 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/datetime/expected-childbirth-date">
						<valueDateTime value="${expectedChildbirthDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</extension>
					</#if>
					<#if pregnancyExamineCd??>
      				<!--产前检查标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/pregnancy-examine-cd">
						<valueBoolean value="${pregnancyExamineCd?then('true','false')}" />
					</extension>
					</#if>
					<#if antenatalExamAbnormal??>
      				<!--产前检查异常情况 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/antenatal-exam-abnormal">
						<valueString value="${antenatalExamAbnormal}" />
					</extension>
					</#if>
					<#if antenatalExamAbnormal??>
      				<!--此次妊娠特殊情况 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/pregnancy-special-circumstances">
						<valueString value="${pregnancySpecialCircumstances}" />
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
					<#if antenatalExamAbnormal??>
      				<!-- 孕前体重（kg） -->
				    <extension
				        url="http://www.nestvision.com/platform/app/data/v1/number/prepregnancy-weight">
				        <valueDecimal value="${prepregnancyWeight}" />
				    </extension>
					</#if>
					<#if antenatalExamAbnormal??>
      				<!-- 身高（cm） -->
				    <extension
				        url="http://www.nestvision.com/platform/app/data/v1/number/prenatal-height">
				        <valueDecimal value="${prenatalHeight}" />
				    </extension>
					</#if>
					<#if prenatalWeight??>
      				<!-- 产前体重（kg） -->
				    <extension
				        url="http://www.nestvision.com/platform/app/data/v1/number/prenatal-weight">
				        <valueDecimal value="${prenatalWeight}" />
				    </extension>
					</#if>
					<#if sbp??>
      				<!-- 收缩压（mmHg） -->
				    <extension
				        url="http://www.nestvision.com/platform/app/data/v1/number/sbp">
				        <valueDecimal value="${sbp}" />
				    </extension>
					</#if>
				    <#if dbp??>
      				<!-- 舒张压（mmHg） -->
				    <extension
				        url="http://www.nestvision.com/platform/app/data/v1/number/dbp">
				        <valueDecimal value="${dbp}" />
				    </extension>
					</#if>
				     <#if bodyTemperature??>
      				 <!-- 体温（℃） -->
				    <extension
				        url="http://www.nestvision.com/platform/app/data/v1/number/body-temperature">
				        <valueDecimal value="${bodyTemperature}" />
				    </extension>
					</#if>
					<#if pulses??>
      				<!-- 脉率（次/min） -->
				    <extension
				        url="http://www.nestvision.com/platform/app/data/v1/number/pulses">
				        <valueDecimal value="${pulses}" />
				    </extension>
					</#if>
					<#if breathingRate??>
      				<!-- 呼吸频率（次/min） -->
				    <extension
				        url="http://www.nestvision.com/platform/app/data/v1/number/breathing-rate">
				        <valueDecimal value="${breathingRate}" />
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
				<!-- 既往史章节 -->
				<section>
					<#if history??>
      				<!--既往史 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/history">
						<valueString value="${history}" />
					</extension>
					</#if>
					<#if opHis??>
      				<!-- 手术史 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/op-his">
						<valueString value="${opHis}" />
					</extension>
					</#if>
					<#if maternalHistory??>
      				<!-- 既往孕产史 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/maternal-history">
						<valueString value="${maternalHistory}" />
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
				<!-- 产前检查章节 -->
				<section>
					<#if uterusHeight??>
      				<!--宫底高度（cm） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/uterus-height">
						<valueDecimal value="${uterusHeight?string('#')}" />
					</extension>
					</#if>
					<#if abdominalGirth??>
      				<!--腹围（cm） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/abdominal-girth">
						<valueDecimal value="${abdominalGirth?string('#')}" />
					</extension>
					</#if>
					<#if fetusPositionCd??>
      				<!--胎方位代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/fetus-position-cd">
						<valueCode value="${fetusPositionCd}" />
					</extension>
					</#if>
					<#if fetalHeartRate??>
      				<!--胎心率（次/min） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/fetal-heart-rate">
						<valueDecimal value="${fetalHeartRate?string('#')}" />
					</extension>
					</#if>
					<#if headDifferSituationEva??>
      				<!--头位难产情况的评估 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/head-differ-situation-eva">
						<valueString value=" ${headDifferSituationEva}" />
					</extension>
					</#if>
					<#if transverseOutlet??>
      				<!--出口横径（cm） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/transverse-outlet">
						<valueDecimal value="${transverseOutlet?string('#')}" />
					</extension>
					</#if>
					<#if externalConjugate??>
      				<!--骶耻外径（cm） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/external-conjugate">
						<valueDecimal value="${externalConjugate?string('#')}" />
					</extension>
					</#if>
					<#if biischialDiameter??>
      				<!--坐骨结节间径（cm） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/biischial-diameter">
						<valueDecimal value="${biischialDiameter?string('#')}" />
					</extension>
					</#if>
					<#if contractionState??>
      				<!--宫缩情况 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/contraction-state">
						<valueString value="${contractionState}" />
					</extension>
					</#if>
					<#if cervicalThickness??>
      				<!--宫颈厚度 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/cervical-thickness">
						<valueString value="${cervicalThickness}" />
					</extension>
					</#if>
					
					<#if palaceMouthState??>
      				<!--宫口情况 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/palace-mouth-state">
						<valueString value=" ${palaceMouthState}" />
					</extension>
					</#if>
					<#if membraneCd??>
      				<!--胎膜是否破 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/membrane-cd">
						<valueBoolean value="${membraneCd?then('true','false')}" />
					</extension>
					</#if>
					<#if promCode??>
      				<!--胎膜情况代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/prom-code">
						<valueCode value="${promCode}" />
					</extension>
					</#if>
					<#if ruptureWayCd??>
      				<!--破膜方式代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/rupture-way-cd">
						<valueCode value="${ruptureWayCd}" />
					</extension>
					</#if>
					<#if prePartStation??>
      				<!--先露位置 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/pre-part-station">
						<valueString value="${prePartStation}" />
					</extension>
					</#if>
					<#if amnioticFluidState??>
      				<!--羊水情况 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/amniotic-fluid-state">
						<valueString value="${amnioticFluidState}" />
					</extension>
					</#if>
					<#if fillingBladderCd??>
      				<!--膀胱充盈标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/filling-bladder-cd">
						<valueBoolean value="${fillingBladderCd?then('true','false')}" />
					</extension>
					</#if>
					<#if intestinalInflationCd??>
      				<!--肠胀气标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/intestinal-inflation-cd">
						<valueBoolean value="${intestinalInflationCd?then('true','false')}" />
					</extension>
					</#if>
					<#if examMethodCd??>
      				<!--检查方式代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/exam-method-cd">
						<valueCode value="${examMethodCd}" />
					</extension>
					</#if>
					<title value="产前检查章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="57073-9" />
							<display value="Prenatal events" />
						</coding>
					</code>
				</section>
				<!-- 处置计划章节 -->
				<section>
					<#if treatmentPlan??>
      				<!--处置计划 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/treatment-plan">
						<valueString value="${treatmentPlan}" />
					</extension>
					</#if>
					<#if planDeliveryMethod??>
      				<!--计划选取的分娩方式 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/plan-delivery-method">
						<valueString value="${planDeliveryMethod}" />
					</extension>
					</#if>
					<#if laborRecordTime??>
      				<!--产程记录日期时间 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/datetime/labor-record-time">
						<valueDateTime value="${laborRecordTime?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</extension>
					</#if>
					<#if laborCourse??>
      				<!--产程经过 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/labor-course">
						<valueString value="${laborCourse}" />
					</extension>
					</#if>
					<title value="处置计划章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="18776-5" />
							<display value="TREATMENT PLAN" />
						</coding>
					</code>
				</section>
			</Composition>
		</resource>
	</entry>
</Bundle>
