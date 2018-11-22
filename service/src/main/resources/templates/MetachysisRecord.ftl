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
			<!-- 资源： 输血记录 -->
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
					<!-- 诊断 -->
					<Condition xmlns="http://hl7.org/fhir">
						<id value="c1" />
						<patient />
						<code>
							<coding>
								<!--诊断编码 -->
								<system value="urn:oid:2.16.156.10011.2.3.3.11" />
								<#if diagnosis??>
								<!--疾病诊断编码 -->
								<code value="${diagnosis}" />
								</#if>
								<#if diagnosisName??>
      							<display value="${diagnosisName}" />
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
				<contained>
					<!-- 输血 -->
					<Procedure xmlns="http://hl7.org/fhir">
						<id value="p1" />
						<contained>
							<Practitioner xmlns="http://hl7.org/fhir">
								<id value="p1pra1" />
								<#if transfusionEmpId??>
      							<identifier>
									<!-- 院内人员ID号命名空间 -->
									<system
										value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
									<!-- 院内人员ID号 -->
									<value value="${transfusionEmpId}" />
								</identifier>
								</#if>
								<#if transfusionEmpName??>
      							<name>
									<!-- 姓名 -->
									<text value="${transfusionEmpName}" />
								</name>
								</#if>
							</Practitioner>
						</contained>
						<#if transfuseHistoryFlag??>
     	 				<!-- 输血史标识代码 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/transfuse-history-flag">
							<valueCode value="${transfuseHistoryFlag}" />
						</extension>
						</#if>
						<#if transKind??>
     	 				<!-- 输血性质代码 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/trans-kind">
							<valueCode value="${transKind}" />
						</extension>
						</#if>
						<#if applyAboBloodCode??>
     	 				<!-- 申请ABO血型代码 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/apply-abo-blood-code">
							<valueCode value="${applyAboBloodCode}" />
						</extension>
						</#if>
						<#if applyRhBloodCode??>
						<!-- 申请Rh血型代码 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/code/apply-rh-blood-code">
							<valueCode value="${applyRhBloodCode}" />
						</extension>
						</#if>
						<#if transfusionIndication??>
						<!-- 输血指征 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/transfusion-indication">
							<valueString value="${transfusionIndication}" />
						</extension>
						</#if>
						<#if transfusionProcessRec??>
						<!-- 输血过程记录 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/transfusion-process-rec">
							<valueString value="${transfusionProcessRec}" />
						</extension>
						</#if>
						<#if bagsCoding??>
						<!-- 血袋编码 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/bags-coding">
							<valueString value="${bagsCoding}" />
						</extension>
						</#if>
						<#if transfusionItemAmount??>
						<!-- 输血量 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/number/transfusion-item-amount">
							<valueDecimal value="${transfusionItemAmount?string('#')}" />
						</extension>
						</#if>
						<#if transfusionItemUnit??>
						<!-- 输血量计量单位 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/transfusion-item-unit">
							<valueString value="${transfusionItemUnit}" />
						</extension>
						</#if>
						<#if transfuseReactionFlag??>
						<!-- 输血反应标志 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/boolean/transfuse-reaction-flag">
							<valueBoolean value="${transfuseReactionFlag?then('true','false')}" />
						</extension>
						</#if>
						<#if transfusionCount??>
						<!-- 输血次数 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/number/transfusion-count">
							<valueInteger value="${transfusionCount?string('#')}" />
						</extension>
						</#if>
						<#if bloodTransfCause??>
						<!-- 输血原因 -->
						<extension
							url="http://www.nestvision.com/platform/app/data/v1/text/blood-transf-cause">
							<valueString value="${bloodTransfCause}" />
						</extension>
						</#if>
						<#if transfusionReactionType??>
						<!-- 输血反应类型 -->
						<extension url="urn:oid:2.16.156.10011.2.3.1.252">
							<valueCode value="${transfusionReactionType}" />
						</extension>
						</#if>
						<identifier>
							<!-- 原系统输血单id命名空间 -->
							<system
								value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/metachysis-record-id" />
							<!-- 原系统输血单id号 -->
							<value value=" ${metachysisRecordId}" />
						</identifier>
						<subject />
						<status />
						<code>
							<#if transfusionVarietyCode??||transfusionVarietyCode??>
							<coding>
								<!-- 输血品种命名空间 -->
								<system value="urn:oid:2.16.156.10011.2.3.1.251" />
								<#if transfusionVarietyCode??>
								<!-- 输血品种编码 -->
								<code value="${transfusionVarietyCode}" />
								</#if>
								<#if transfusionVarietyName??>
								<!-- 输血品种名字 -->
								<display value="${transfusionVarietyName}" />
								</#if>
							</coding>
							</#if>
						</code>
						<performer>
							<!-- 输血医生id -->
							<actor>
								<reference value="#p1pra1" />
							</actor>
							<role>
								<coding>
									<!-- 角色代码命名空间 -->
									<system value="http://hl7.org/fhir/ValueSet/performer-role" />
									<!-- 角色代码：输血医生 -->
									<code value="309341008" />
								</coding>
								<!-- 角色名称 -->
								<text value="输血医生" />
							</role>
						</performer>
						<performedPeriod>
							<#if transfusionStartTime??>
     	 					<!-- 输血开始时间 -->
							<start value="${transfusionStartTime?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
							</#if>
							<#if transfusionEndTime??>
     	 					<!-- 输血结束时间 -->
							<end value="${transfusionEndTime?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
							</#if>
						</performedPeriod>
					</Procedure>
				</contained>
				<#if remarks??>
     	 		<!--备注 -->
				<extension
					url="http://www.nestvision.com/platform/app/data/v1/text/remarks">
					<valueString value="${remarks}" />
				</extension>
				</#if>
				<!-- 原系统输血记录id -->
				<identifier>
					<system
						value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/metachysis-record-id" />
					<value value="${metachysisRecordId}" />
				</identifier>
				<!-- 记录日期 -->
				<date value="${date?string('yyyy-MM-dd\'T\'HH:mm:ss')}" />
				<!-- 文档类型：输血记录 -->
				<type>
					<coding>
						<system value="2.16.156.10011.2.4" />
						<code value="C0013" />
					</coding>
					<text value="输血记录" />
				</type>
				<!-- 文档标题：输血记录 -->
				<title value="输血记录" />
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
				<!-- 文档保管机构id -->
				<custodian>
					<reference value="#hos1" />
				</custodian>
				<!-- 门诊或住院信息 -->
				<encounter>
					<reference value="#e1" />
				</encounter>
				<!-- 实验室检查章节 -->
				<section>
					<#if aboCd??>
      				<!-- ABO血型代码 -->
					<extension url="urn:oid:2.16.156.10011.2.3.1.85">
						<valueCode value="${aboCd}" />
					</extension>
					</#if>
					<#if rhCd??>
      				<!-- RH血型代码 -->
					<extension url="urn:oid:2.16.156.10011.2.3.1.250">
						<valueCode value="${rhCd}" />
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
				<!-- 主要健康问题章节 -->
				<section>
					<title value="主要健康问题章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="11450-4" />
							<display value="PROBLEM LIST" />
						</coding>
					</code>
					<!-- 诊断 -->
					<entry>
						<reference value="#c1" />
					</entry>
				</section>
				<!-- 输血章节 -->
				<section>
					<title value="输血章节" />
					<code>
						<coding>
							<system value="http://loinc.org" />
							<code value="56836-0" />
							<display value="History of blood transfusion" />
						</coding>
					</code>
					<!-- 输血 -->
					<entry>
						<reference value="#p1" />
					</entry>
				</section>
			</Composition>
		</resource>
	</entry>
</Bundle>
