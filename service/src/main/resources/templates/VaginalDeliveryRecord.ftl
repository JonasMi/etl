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
			<!-- 资源： 阴道分娩记录 -->
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
					<#if visitMark=='1'>
    				<#assign encounterType='outpatient-registration-id'> 
    				<#assign encounterMark='outpatient'>
   			 		<#elseif visitMark=='2'>
    				<#assign encounterType='inpatient-registration-id'> 
    				<#assign encounterMark='inpatient'>
    				</#if>
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
						<#if registrationId??&& encounterType??>
						<identifier>
							<system
								value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/${encounterType}" />
							<!-- 原系统住院流水id号 -->
							<value value="${registrationId}" />
						</identifier>
						</#if>
						<!-- 状态 -->
						<status value="finished" />
						<#if encounterMark??>
						<!-- 类型：门诊或住院 -->
						<class value="${encounterMark}" />
						</#if>
						<#if start??>
						<#assign time=start>
						</#if>
						<#if start??>
						<#assign time=visitingTime>
						</#if>
						<#if time??>
     	 				<period>
							<!-- 入院时间或者就诊时间 -->
							<start value="${time?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
						</period>
						</#if>
						<#if inhId??&&(encounterMark??&&encounterMark='inpatient')>
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
				<!-- 原系统阴道分娩记录id -->
				<identifier>
					<system
						value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/vaginal-delivery-record-id" />
					<value value="${vaginalDeliveryRecordId}" />
				</identifier>
				<!-- 记录日期 -->
				<date value="${date?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
				<!-- 文档类型：阴道分娩记录 -->
				<type>
					<coding>
						<system value="2.16.156.10011.2.4" />
						<code value="C0015" />
					</coding>
					<text value="阴道分娩记录" />
				</type>
				<!-- 文档标题：阴道分娩记录 -->
				<title value="阴道分娩记录" />
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
						<valueCode value="09" />
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
				<!-- 门诊或住院信息 -->
				<encounter>
					<reference value="#e1" />
				</encounter>
				<!-- 既往史章节 -->
				<section>
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
					<title value="既往史章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="11348-0" />
							<display value="HISTORY OF PAST ILLNESS" />
						</coding>
					</code>
				</section>
				<!-- 阴道分娩章节 -->
				<section>
					<#if expectedChildbirthDate??>
      				<!--预产期 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/datetime/expected-childbirth-date">
						<valueDateTime value="${expectedChildbirthDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</extension>
					</#if>
					<#if deliveryDatetime??>
      				<!-- 临产日期时间 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/datetime/delivery-datetime">
						<valueDateTime value="${deliveryDatetime?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</extension>
					</#if>
					<#if ruptureMembranesDatetime??>
      				<!-- 胎膜破裂日期时间 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/datetime/rupture-membranes-datetime">
						<valueDateTime value="${ruptureMembranesDatetime?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</extension>
					</#if>
					<#if preAmnFluidDescr??>
      				<!-- 前羊水性状 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/pre-amn-fluid-descr">
						<valueString value="${preAmnFluidDescr}" />
					</extension>
					</#if>
					<#if preAmnFluidAmount??>
      				<!-- 前羊水量（mL） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/pre-amn-fluid-amount">
						<valueDecimal value="${preAmnFluidAmount?string('#')}" />
					</extension>
					</#if>
					<#if uterineContractionStdate??>
      				<!-- 宫缩开始日期时间 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/datetime/uterine-contraction-stdate">
						<valueDateTime value="${uterineContractionStdate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</extension>
					</#if>
					<#if firstLaborTime??>
      				<!-- 第1产程时长（min） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/first-labor-time">
						<valueDecimal value="${firstLaborTime?string('#')}" />
					</extension>
					</#if>
					<#if contractionStartTime??>
      				<!-- 宫口开全日期时间 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/datetime/contraction-start-time">
						<valueDateTime value="${contractionStartTime?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</extension>
					</#if>
					<#if secondLaborTime??>
      				<!-- 第2产程时长（min） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/second-labor-time">
						<valueDecimal value="${secondLaborTime?string('#')}" />
					</extension>
					</#if>
					<#if deliveryTime??>
      				<!-- 胎儿娩出日期时间 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/datetime/delivery-time">
						<valueDateTime value="${deliveryTime?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</extension>
					</#if>
					<#if thirdLaborTime??>
      				<!-- 第3产程时长（min） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/third-labor-time">
						<valueDecimal value="${thirdLaborTime?string('#')}" />
					</extension>
					</#if>
					<#if placentaTime??>
      				<!-- 胎盘娩出日期时间 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/datetime/placenta-time">
						<valueDateTime value="${placentaTime?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</extension>
					</#if>
					<#if totalLaborTime??>
      				<!-- 总产程时长（min） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/total-labor-time">
						<valueDecimal value="${totalLaborTime?string('#')}" />
					</extension>
					</#if>
					<#if fetusPositionCd??>
      				<!--胎方位代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/fetus-position-cd">
						<valueCode value="${fetusPositionCd}" />
					</extension>
					</#if>
					<#if ifMidwifery??>
      				<!--胎儿娩出助产标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/if-midwifery">
						<valueBoolean value="${ifMidwifery?then('true','false')}" />
					</extension>
					</#if>
					<#if midwiferyWay??>
      				<!--助产方式 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/midwifery-way">
						<valueString value="${midwiferyWay}" />
					</extension>
					</#if>
					<#if placentaSitu??>
      				<!--胎盘娩出情况 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/placenta-situ">
						<valueString value="${placentaSitu}" />
					</extension>
					</#if>
					<#if amnioticCompleteMark??>
      				<!--胎膜完整情况标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/amniotic-complete-mark">
						<valueBoolean value="${amnioticCompleteMark?then('true','false')}" />
					</extension>
					</#if>
					<#if amnFluidDescr??>
      				<!--羊水性状 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/amn-fluid-descr">
						<valueString value="${amnFluidDescr}" />
					</extension>
					</#if>
					<#if amnFluidAmount??>
      				<!-- 羊水量（mL） -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/amn-fluid-amount">
						<valueDecimal value="${amnFluidAmount?string('#')}" />
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
					<#if ifAbnormalUmbilicalCord??>
      				<!--脐带异常标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/if-abnormal-umbilical-cord">
						<valueBoolean value="${ifAbnormalUmbilicalCord?then('true','false')}" />
					</extension>
					</#if>
					<#if productionDrugs??>
      				<!--产时用药 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/production-drugs">
						<valueString value="${productionDrugs}" />
					</extension>
					</#if>
					<#if preventiveMeasure??>
      				<!--预防措施 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/preventive-measure">
						<valueString value="${preventiveMeasure}" />
					</extension>
					</#if>
					<#if episiotomyMark??>
      				<!--产妇会阴切开标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/episiotomy-mark">
						<valueBoolean value="${episiotomyMark?then('true','false')}" />
					</extension>
					</#if>
					<#if episiotomy??>
      				<!--会阴切开位置 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/episiotomy">
						<valueString value="${episiotomy}" />
					</extension>
					</#if>
					<#if perineumStitches??>
      				<!-- 会阴缝合针数 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/number/perineum-stitches">
						<valueDecimal value="${perineumStitches?string('#')}" />
					</extension>
					</#if>
					<#if perinealLacerCd??>
      				<!--会阴裂伤情况代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/perineal-lacer-cd">
						<valueCode value="${perinealLacerCd}" />
					</extension>
					</#if>
					<#if perinealHematomaMark??>
      				<!--会阴血肿标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/perineal-hematoma-mark">
						<valueBoolean value="${perinealHematomaMark?then('true','false')}" />
					</extension>
					</#if>
					<#if perinealHematomaSize??>
      				<!--会阴血肿大小 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/perineal-hematoma-size">
						<valueString value="${perinealHematomaSize}" />
					</extension>
					</#if>
					<#if perinealHematomaDeal??>
      				<!--会阴血肿处理 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/perineal-hematoma-deal">
						<valueString value="${perinealHematomaDeal}" />
					</extension>
					</#if>
					<#if anesthesiaCode??>
      				<!--麻醉方法代码 -->
					<extension
						url="urn:oid:2.16.156.10011.2.3.1.159">
						<valueCode value="${anesthesiaCode}" />
					</extension>
					</#if>
					<#if anesDrugName??>
      				<!-- 麻醉药物名称 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/anes-drug-name">
						<valueString value="${anesDrugName}" />
					</extension>
					</#if>
					<#if ifVaginaLacer??>
      				<!--阴道裂伤标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/if-vagina-lacer">
						<valueBoolean value="${ifVaginaLacer?then('true','false')}" />
					</extension>
					</#if>
					<#if ifVaginaHematoma??>
      				<!--阴道血肿标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/if-vagina-hematoma">
						<valueBoolean value="${ifVaginaHematoma?then('true','false')}" />
					</extension>
					</#if>
					<#if ifCervicalLacer??>
      				<!--宫颈裂伤标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/if-cervical-lacer">
						<valueBoolean value="${ifCervicalLacer?then('true','false')}" />
					</extension>
					</#if>
					<#if cervicalSuture??>
      				<!-- 宫颈缝合情况 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/cervical-suture">
						<valueString value="${cervicalSuture}" />
					</extension>
					</#if>
					<#if postpartumMedication??>
      				<!-- 产后用药 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/postpartum-medication">
						<valueString value="${postpartumMedication}" />
					</extension>
					</#if>
					<#if summaryDeliveryProcess??>
      				<!-- 分娩过程摘要 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/summary-delivery-process">
						<valueString value="${summaryDeliveryProcess}" />
					</extension>
					</#if>
					<#if uterineContraction??>
      				<!-- 宫缩情况 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/uterine-contraction">
						<valueString value="${uterineContraction}" />
					</extension>
					</#if>
					<#if uterineConditions??>
      				<!-- 子宫情况 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/uterine-conditions">
						<valueString value="${uterineConditions}" />
					</extension>
					</#if>
					<#if lochiaSituation??>
      				<!-- 恶露状况 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/lochia-situation">
						<valueString value="${lochiaSituation}" />
					</extension>
					</#if>
					<#if perinealCondition??>
      				<!-- 会阴情况 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/perineal-condition">
						<valueString value="${perinealCondition}" />
					</extension>
					</#if>
					<#if repairProcedure??>
      				<!-- 修补手术过程 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/repair-procedure">
						<valueString value="${repairProcedure}" />
					</extension>
					</#if>
					<#if cordBloodMark??>
      				<!--存脐带血情况标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/cord-blood-mark">
						<valueBoolean value="${cordBloodMark?then('true','false')}" />
					</extension>
					</#if>
					<title value="阴道分娩章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="57074-7" />
							<display value="labor and delivery process" />
						</coding>
					</code>
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
					<#if opPostDiag??>
      				<!-- 肛查 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/anus-exam">
						<valueString value="${anusExam}" />
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
