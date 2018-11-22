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
			<!-- 资源： 治疗记录 -->
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
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/number/age">
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
					<!-- 入院诊断 -->
					<Condition xmlns="http://hl7.org/fhir">
						<id value="c1" />
						<patient />
      					<code>
							<coding>
								<!--疾病诊断编码 -->
								<system value="urn:oid:2.16.156.10011.2.3.3.11" />
								<#if admissionDiagnosis??>
								<!--疾病诊断编码 -->
								<code value="${admissionDiagnosis}" />
								</#if>
								<#if admissionDiagnosisName??>
      							<display value="${admissionDiagnosisName}" />
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
						<#if admissionDiagnosisDate??>
     	 				<!-- 诊断日期 -->
						<onsetDateTime value="${admissionDiagnosisDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
						</#if>
					</Condition>
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
						<#if visitingType??>
      					<!-- 就诊类型 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/visiting-type">
							<valueCode value="${visitingType}" />
						</extension>
						</#if>
    					<#if registrationId??&& encounterType?? >
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
						<!-- 类型：住院 -->
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
				<contained>
					<!-- 手术 -->
					<Procedure xmlns="http://hl7.org/fhir">
						<id value="p1" />
						<#if intervention??>
      					<!-- 介入物名称 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/intervention">
							<valueString value="${intervention}" />
						</extension>
						</#if>
						<#if operationMethod??>
      					<!-- 操作方法 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/operation-method">
							<valueString value="${operationMethod}" />
						</extension>
						</#if>
						<#if operationTimes??>
      					<!-- 操作次数 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/operation-times">
							<valueString value="${operationTimes}" />
						</extension>
						</#if>
						<subject />
						<status />
      					<code>
      						<#if operationCd??||operationName??>
							<coding>
								<!-- 手术编码命名空间 -->
								<system value="urn:oid:2.16.156.10011.2.3.3.12" />
								<#if operationCd??>
      							<!-- 手术编码ICD-9 -->
								<code value="${operationCd}" />
								</#if>
								<#if operationName??>
      							<!-- 手术名字ICD-9 -->
								<display value="${operationName}" />
								</#if>
							</coding>
							</#if>
						</code>
						<#if partCode??||partName??>
      					<bodySite>
					    	<coding>
					   			<!-- 手术操作目标部位代码命名空间 -->
					    		<system value="urn:oid:2.16.156.10011.2.3.1.262"/>
					    		<#if partCode??>
      							<!-- 手术操作目标部位代码 -->
					    		<code value="${partCode}"/>
								</#if>
					    		<#if partName??>
      							<!-- 手术操作目标部位名称 -->
					    		<display value="${partName}"/>
								</#if>
					    	</coding>
					    </bodySite>
						</#if>
					</Procedure>
				</contained>
				<contained>
					<!-- 医嘱处方 -->
					<MedicationOrder xmlns="http://hl7.org/fhir">
						<id value="m1" />
						<contained>
							<!-- 药品请求样例 -->
							<Medication xmlns="http://hl7.org/fhir">
								<id value="m1m1" />
								<#if aliasName??>
      							<!-- 商品名 -->
							    <extension
							        url="http://www.nestvision.com/platform/app/data/v1/text/alias-name">
							        <valueString value="${aliasName}" />
							    </extension>					
								</#if>
							    <#if spec??>
      							<!-- 规格 -->
							    <extension
							        url="http://www.nestvision.com/platform/app/data/v1/text/spec">
							        <valueString value="${spec}" />
							    </extension>
								</#if>
							    <#if medicationCd??||medicationName??>
							    <code>
							        <coding>
							            <!-- 院内药物编码 -->
							            <system
							                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/code/medication" />
							            <#if medicationCd??>
      									 <code value="${medicationCd}" />
										</#if>
							            <#if medicationName??>
      									<display value="${medicationName}" />
										</#if>
							        </coding>
							    </code>
							    </#if>
							    <#if drugDosageForms??||drugDosageFormsName??>
							    <product>
							        <!-- 药物剂型 -->
							        <form>
							            <coding>
							                <!-- 药物剂型命名空间 -->
							                <system value="urn:oid:2.16.156.10011.2.3.1.211" />
							                <#if drugDosageForms??>
      										<!-- 药物剂型 -->
							                <code value="${drugDosageForms}" />
											</#if>
							                <#if drugDosageFormsName??>
      										<!-- 药物剂型名字 -->
							                <display value="${drugDosageFormsName}" />
											</#if>
							            </coding>
							        </form>
							    </product>
							    </#if>
							</Medication>
						</contained>
						<contained>
							<Practitioner xmlns="http://hl7.org/fhir">
								<id value="m1pra1" />
								<#if performerEmpid??>
      							<identifier>
									<!-- 院内人员ID号命名空间 -->
									<system
										value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
									<!-- 院内人员ID号 -->
									<value value="${performerEmpid}" />
								</identifier>
								</#if>
								<#if performerEmpName??>
      							<name>
									<!-- 姓名 -->
									<text value="${performerEmpName}" />
								</name>
								</#if>
							</Practitioner>
						</contained>
						<contained>
							<Practitioner xmlns="http://hl7.org/fhir">
								<id value="m1p1" />
								<#if prescriberId??>
      							<identifier>
									<!-- 院内人员ID号命名空间 -->
									<system
										value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/employee-id" />
									<!-- 院内人员ID号 -->
									<value value="${prescriberId}" />
								</identifier>
								</#if>
								<#if prescriberName??>
      							<name>
									<!-- 姓名 -->
									<text value="${prescriberName}" />
								</name>
								</#if>
							</Practitioner>
						</contained>
						<#if drugsUsage??>
      					<!-- 药物用法 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/drugs-usage">
							<valueString value="${drugsUsage}" />
						</extension>
						</#if>
						<#if cnMedicationTypeCode??>
      					<!-- 中药使用类别代码 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/cn-medication-type-code">
							<valueCode value="${cnMedicationTypeCode}" />
						</extension>
						</#if>
						<#if freqCode??>
      					<!-- 频率代码 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/freq-code">
							<valueCode value="${freqCode}" />
						</extension>
						</#if>
						<#if drugTotalDose??>
       					<!-- 药物使用总剂量 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/number/drug-total-dose">
							<valueDecimal value="${drugTotalDose}" />
						</extension>
						</#if>
						<#if drugTotalDoseUtil??>
      					<!-- 药物使用总剂量单位 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/drug-total-dose-util">
							<valueString value="${drugTotalDoseUtil}" />
						</extension>
						</#if>
						<!-- 执行人ID -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/identifier/prec-perform">
							<valueReference>
								<reference
									value="#m1pra1" />
							</valueReference>
						</extension>
						<#if performTime??>
     	 				<!-- 执行时间 -->
					    <extension
					        url="http://www.nestvision.com/platform/app/data/v1/datetime/perform-time">
					        <valueDateTime value="${performTime?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					    </extension>
						</#if>
						<!-- 药品信息 -->
						<medicationReference>
							<reference
								value="#m1m1" />
						</medicationReference>
						<#if datewritten??>
     	 				<!-- 开立时间 -->
						<dateWritten value="${datewritten?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
						</#if>
						<prescriber>
							<!-- 开立医生ID -->
							<reference value="#m1p1" />
						</prescriber>
						<#if dosageCode??||(onceValue??||onceUnit??)>
						<dosageInstruction>
							<#if dosageCode??>
      						<route>
								<coding>
									<!-- 用药途径代码命名空间 -->
									<system
					                    value="http://www.nestvision.com/platform/app/data/v1/code/dosage-code" />
									<!-- 用药途径代码：口服 -->
									<code value="${dosageCode}" />
								</coding>
							</route>
							</#if>
							<#if onceValue??||onceUnit??>
       						<doseQuantity>
								<#if onceValue??>
       							<!-- 用药次剂量 -->
								<value value="${onceValue}" />
								</#if>
								<#if onceUnit??>
      							<!-- 用药剂量单位 -->
								<unit value="${onceUnit}" />
								</#if>
							</doseQuantity> 
							</#if>
						</dosageInstruction>
						</#if>
					</MedicationOrder>
				</contained>
				<!-- 原系统治疗记录id -->
				<identifier>
					<system
						value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/treatment-record-id" />
					<value value="${treatmentRecordId}" />
				</identifier>
				<!-- 记录日期 -->
				<date value="${date?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
				<!-- 文档类型：治疗记录 -->
				<type>
					<coding>
						<system value="2.16.156.10011.2.4" />
						<code value="C0008" />
					</coding>
					<text value="治疗记录" />
				</type>
				<!-- 文档标题：治疗记录 -->
				<title value="治疗记录" />
				<!-- 状态：preliminary初步 final最终amended修订entered-in-error错误 -->
				<status value="final" />
				<!-- 保密等级：U:不受限制的 L:低等级 M:中等 N:常规 R:保密的 V:十分机密的 -->
				<confidentiality value="N" />
				<!-- 居民信息 -->
				<subject>
					<reference value="#pat1" />
				</subject>
				<!-- 治疗记录医师（文档创建者） -->
				<author>
					<reference value="#pra1" />
				</author>
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
					<#if ifInvasiveTreatment??>
					<!-- 有创诊疗操作标志 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/boolean/if-invasive-treatment">
						<valueBoolean value="${ifInvasiveTreatment?then('true','false')}" />
					</extension>
					</#if>
					<#if ifRritability??>
					<!-- 是否有过敏史 -->
				    <extension
				        url="http://www.nestvision.com/platform/app/data/v1/boolean/if-rritability">
				        <valueBoolean value="${ifRritability?then('true','false')}" />
				    </extension>
					</#if>
					<#if rritability??>
      				<!-- 过敏史其他描述 -->
				    <extension
				        url="http://www.nestvision.com/platform/app/data/v1/text/rritability">
				        <valueString value="${rritability}" />
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
				<!-- 生命体征章节 -->
				<section>
					<#if weight??>
      		 		<!-- 体重(kg) -->
				    <extension
				        url="http://www.nestvision.com/platform/app/data/v1/number/weight">
				        <valueDecimal value="${weight}" />
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
				<!-- 入院诊断章节 -->
				<section>
					<title value="入院诊断章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="46241-6" />
							<display value="Diagnosis" />
						</coding>
					</code>
					<!-- 诊断 -->
					<entry>
						<reference value="#c1" />
					</entry>
				</section>
				<!-- 治疗计划章节 -->
				<section>
					<#if treatmentGuidance??>
      				<!--处理及指导意见 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/treatment-guidance">
						<valueString value="${treatmentGuidance}" />
					</extension>
					</#if>
					<#if ordersRemarks??>
      				<!--医嘱使用备注 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/orders-remarks">
						<valueString value="${ordersRemarks}" />
					</extension>
					</#if>
					<#if futureTreatmentOptions??>
      				<!--今后治疗方案 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/text/future-treatment-options">
						<valueString value="${futureTreatmentOptions}" />
					</extension>
					</#if>
					<#if visitWayCd??>
      				<!-- 随访方式代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/visit-way-cd">
						<valueCode value="${visitWayCd}" />
					</extension>
					</#if>
					<#if followupDate??>
     	 			<!-- 随访日期 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/datetime/followup-date">
						<valueDateTime value="${followupDate?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
					</extension>
					</#if>
					<#if followupPeriodCd??>
      				<!-- 随访周期建议代码 -->
					<extension
						url="http://www.nestvision.com/platform/app/data/v1/code/followup-period-cd">
						<valueCode value="${followupPeriodCd}" />
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
					<!-- 手术 -->
					<entry>
						<reference value="#p1" />
					</entry>
				</section>
				<!-- 用药管理章节 -->
				<section>
					<title value="用药管理章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="18610-6" />
							<display value="MEDICATION ADMINISTERED" />
						</coding>
					</code>
					<!-- 医嘱处方 -->
					<entry>
						<reference value="#m1" />
					</entry>
				</section>
			</Composition>
		</resource>
	</entry>
</Bundle>
