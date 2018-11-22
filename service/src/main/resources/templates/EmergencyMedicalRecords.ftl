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
            <!-- 资源： 急诊留观病历 -->
            <Composition xmlns="http://hl7.org/fhir">
                <contained>
                    <Organization xmlns="http://hl7.org/fhir">
                        <id value="hos1" />
                        <identifier>
                            <!-- 原系统机构ID号命名空间 -->
                            <system
                                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/hospital-id" />
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
                        <#if age??>
                        <!-- 年龄 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/age">
                            <valueDecimal value="${age}" />
                        </extension>
                        </#if>
                        <#if responsDocName??>
                        <!-- 责任医师姓名 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/respons-doc-name">
                            <valueString value="${responsDocName}" />
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
                        <#if name??>
                        <name>
                            <!-- 姓名 -->
                            <text value="${name}" />
                        </name>
                        </#if>
                        <#if telecom??>
                        <telecom>
                            <!-- 电话号码 -->
                            <value value="${telecom}" />
                        </telecom>
                        </#if>
                        <#if gender??>
                        <!-- 性别 -->
                        <gender value="${mappingValue('GBT22611',gender)!''}" />
                        </#if>
                        <#if birthdate??>
                        <!-- 出生日期 -->
                        <birthDate value="${birthdate?string("yyyy-MM-dd")}" />
                        </#if>
                    </Patient>
                </contained>
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra1" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system
                                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                            <#if authorId??>
                            <!-- 院内人员ID号 -->
                            <value value="${authorId}" />
                            </#if>
                        </identifier>
                        <#if authorName??>
                        <name>
                            <!-- 姓名 -->
                            <text value="${authorName}" />
                        </name>
                        </#if>
                    </Practitioner>
                </contained>
                <contained>
                    <!-- 西医诊断 -->
                    <Condition xmlns="http://hl7.org/fhir">
                        <id value="c1" />
                        <patient />
                        <code>
                            <coding>
                                <!--西医诊断编码 -->
                                <system value="urn:oid:2.16.156.10011.2.3.3.11" />
                                <#if diagnosticCode??>
                                <!--西医诊断编码 -->
                                <code value="${diagnosticCode}" />
                                </#if>
                                <#if diagnosticName??>
                                <display value="${diagnosticName}" />
                                </#if>
                            </coding>
                        </code>
                        <verificationStatus />
                    </Condition>
                </contained>
                <contained>
                    <!-- 中医病名诊断 -->
                    <Condition xmlns="http://hl7.org/fhir">
                        <id value="c2" />
                        <#if cnDisDiagCode??>
                        <!--中医病名诊断代码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/cn-dis-diag-code">
                            <valueCode value="${cnDisDiagCode}" />
                        </extension>
                        </#if>
                        <#if cnDisDiagName??>
                        <!--中医病名诊断名称 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/cn-dis-diag-name">
                            <valueString value="${cnDisDiagName}" />
                        </extension>
                        </#if>
                        <patient />
                        <code />
                        <verificationStatus />
                    </Condition>
                </contained>
                <contained>
                    <!-- 中医证候诊断 -->
                    <Condition xmlns="http://hl7.org/fhir">
                        <id value="c3" />
                        <#if cnSymDiagCode??>
                        <!--中医证候诊断代码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/cn-sym-diag-code">
                            <valueCode value="${cnSymDiagCode}" />
                        </extension>
                        </#if>
                        <#if cnSymDiagName??>
                        <!--中医证候诊断名称 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/cn-sym-diag-name">
                            <valueString value="${cnSymDiagName}" />
                        </extension>
                        </#if>
                        <patient />
                        <code />
                        <verificationStatus />
                    </Condition>
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
                            <coding>
                                <!-- 手术编码命名空间 -->
                                <system value="urn:oid:2.16.156.10011.2.3.3.12" />
                                <#if operationCd??>
                                <!-- 手术编码ICD-9 -->
                                <code value="${operationCd}" />
                                </#if>
                                <#if operationName ??>
                                <!-- 手术名字ICD-9 -->
                                <display value="${operationName}" />
                                </#if>
                            </coding>
                        </code>
                        <bodySite>
                            <coding>
                                <!-- 手术操作目标部位代码命名空间 -->
                                <system value="urn:oid:2.16.156.10011.2.3.1.262"/>
                                <#if partCode ??>
                                <!-- 手术操作目标部位代码 -->
                                <code value="${partCode}"/>
                                </#if>
                                <#if partName ??>
                                <!-- 手术操作目标部位名称 -->
                                <display value="${partName}"/>
                                </#if>
                            </coding>
                        </bodySite>
                    </Procedure>
                </contained>
                <contained>
                    <!-- 医嘱 -->
                    <MedicationOrder xmlns="http://hl7.org/fhir">
                        <id value="m1" />
                        <#if performerEmp??>
                        <contained>
                            <Organization xmlns="http://hl7.org/fhir">
                                <id value="m1o1" />
                                <!-- 执行科室名称 -->
                                <name value="${performerEmp}" />
                            </Organization>
                        </contained>
                        </#if>
                        <#if performerEmp??>
                        <contained>
                            <Practitioner xmlns="http://hl7.org/fhir">
                                <id value="m1p1" />
                                <name>
                                    <!-- 执行医生姓名 -->
                                    <text value="${performerEmp}" />
                                </name>
                            </Practitioner>
                        </contained>
                        </#if>
                        <#if orderDp??>
                        <contained>
                            <Organization xmlns="http://hl7.org/fhir">
                                <id value="m1o2" />
                                <!-- 开立科室名称 -->
                                <name value="${orderDp}" />
                            </Organization>
                        </contained>
                        </#if>
                        <#if prescriber??>
                        <contained>
                            <Practitioner xmlns="http://hl7.org/fhir">
                                <id value="m1p2" />
                                <name>
                                    <!-- 开立医生姓名 -->
                                    <text value="${prescriber}" />
                                </name>
                            </Practitioner>
                        </contained>
                        </#if>
                        <#if orderAuditor??>
                        <contained>
                            <Practitioner xmlns="http://hl7.org/fhir">
                                <id value="m1p3" />
                                <name>
                                    <!-- 审核人姓名 -->
                                    <text value="${orderAuditor}" />
                                </name>
                            </Practitioner>
                        </contained>
                        </#if>
                        <#if stopDoctor??>
                        <contained>
                            <Practitioner xmlns="http://hl7.org/fhir">
                                <id value="m1p4" />
                                <name>
                                    <!-- 医嘱取消人姓名 -->
                                    <text value="${stopDoctor}" />
                                </name>
                            </Practitioner>
                        </contained>
                        </#if>
                        <#if orderTypeCode??>
                        <!-- 医嘱类型代码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/order-type-code">
                            <valueCode value="${orderTypeCode}" />
                        </extension>
                        </#if>
                        <#if orderPlanStDate??>
                        <!-- 医嘱计划开始日期时间 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/datetime/order-plan-st-date">
                            <valueDateTime value="${orderPlanStDate?string("yyyy-MM-dd")}T${orderPlanStDate?string("HH:mm:ss")}" />
                        </extension>
                        </#if>
                        <#if orderPlanEndDate??>
                        <!-- 医嘱计划结束日期时间 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/datetime/order-plan-end-date">
                            <valueDateTime value="${orderPlanEndDate?string("yyyy-MM-dd")}T${orderPlanEndDate?string("HH:mm:ss")}" />
                        </extension>
                        </#if>
                        <#if orderPlanMsg??>
                        <!-- 医嘱计划信息 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/order-plan-msg">
                            <valueString value="${orderPlanMsg}" />
                        </extension>
                        </#if>
                        <#if performTime??>
                        <!-- 执行时间 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/datetime/perform-time">
                            <valueDateTime value="${performTime?string("yyyy-MM-dd")}T${performTime?string("HH:mm:ss")}" />
                        </extension>
                        </#if>
                        <!-- 执行科室 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/identifier/perform-dept-cd">
                            <valueReference>
                                <reference value="#m1o1" />
                            </valueReference>
                        </extension>
                        <!-- 执行医生 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/identifier/performer-cd">
                            <valueReference>
                                <reference value="#m1p1" />
                            </valueReference>
                        </extension>
                        <!-- 开立科室 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/identifier/order-dpid">
                            <valueReference>
                                <reference value="#m1o2" />
                            </valueReference>
                        </extension>
                        <#if orderAuditorDate??>
                        <!-- 审核时间 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/datetime/order-auditor-date">
                            <valueDateTime value="${orderAuditorDate?string("yyyy-MM-dd")}T${orderAuditorDate?string("HH:mm:ss")}" />
                        </extension>
                        </#if>
                        <!-- 审核人 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/identifier/order-auditor">
                            <valueReference>
                                <reference value="#m1p3" />
                            </valueReference>
                        </extension>
                        <!-- 取消医嘱医生 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/identifier/stop-doctorid">
                            <valueReference>
                                <reference value="#m1p4" />
                            </valueReference>
                        </extension>
                        <!-- 状态：active开始 on-hold正在进行 completed完成 entered-in-error错误 stopped停止 
                            draft草稿 -->
                        <status value="completed" />
                        <medicationReference />
                        <#if datewritten??>
                        <!-- 开立时间 -->
                        <dateWritten value="${datewritten?string("yyyy-MM-dd")}T${datewritten?string("HH:mm:ss")}" />
                        </#if>
                        <prescriber>
                            <!-- 开立医生ID -->
                            <reference value="#m1p2" />
                        </prescriber>
                        <#if dateended??>
                        <!-- 取消时间 -->
                        <dateEnded value="${dateended?string("yyyy-MM-dd")}T${dateended?string("HH:mm:ss")}" />
                        </#if>
                        <#if note??>
                        <note>
                            <!-- 医嘱备注信息 -->
                            <text value="${note}" />
                        </note>
                        </#if>
                        <dosageInstruction>
                            <#if text??>
                            <!-- 医嘱正文 -->
                            <text value="${text}" />
                            </#if>
                            <#if boundsperiodStart??>
                            <timing>
                                <repeat>
                                    <boundsPeriod>
                                        <!-- 医嘱开始时间 -->
                                        <start value="${boundsperiodStart?string("yyyy-MM-dd")}T${boundsperiodStart?string("HH:mm:ss")}" />
                                    </boundsPeriod>
                                </repeat>
                            </timing>
                            </#if>
                        </dosageInstruction>
                    </MedicationOrder>
                </contained>
                <contained>
                    <!-- 门诊 -->
                    <Encounter xmlns="http://hl7.org/fhir">
                        <id value="e1" />
                        <contained>
                            <Organization xmlns="http://hl7.org/fhir">
                                <id value="e1o1" />
                                <contained>
                                    <Organization xmlns="http://hl7.org/fhir">
                                        <id value="e1o1h1" />
                                        <#if upHospital??>
                                        <identifier>
                                            <!-- 机构ID号命名空间 -->
                                            <system
                                                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/hospital-id" />
                                            <!-- 机构ID号 -->
                                            <value value="${upHospital}" />
                                        </identifier>
                                        </#if>
                                        <#if upHospitalName??>
                                        <!-- 医院名称 -->
                                        <name value="${upHospitalName}" />
                                        </#if>
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
                        <#if outpatientRegistrationId??>
                        <identifier>
                            <system
                                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/outpatient-registration-id" />
                            <!-- 原系统门诊登记流水号 -->
                            <value value="${outpatientRegistrationId}" />
                        </identifier>
                        </#if>
                        <!-- 门诊标志:已登记 -->
                        <status value="arrived" />
                        <!-- 就诊类型:门诊 -->
                        <class value="outpatient" />
                        <#if visitingTime??>
                        <period>
                            <!-- 接诊时间 -->
                            <start value="${visitingTime?string("yyyy-MM-dd")}T${visitingTime?string("HH:mm:ss")}" />
                        </period>
                        </#if>
                        <!-- 接诊科室 -->
                        <serviceProvider>
                            <reference value="#e1o1" />
                        </serviceProvider>
                    </Encounter>
                </contained>
                <#if remarks??>
                <!-- 备注 -->
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/text/remarks">
                    <valueString value="${remarks}" />
                </extension>
                </#if>
                <#if emergencyMedicalRecordsId??>
                <!-- 原系统急诊留观病历id -->
                <identifier>
                    <system
                        value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/emergency-medical-records" />
                    <value value="${emergencyMedicalRecordsId}" />
                </identifier>
                </#if>
                <#if date??>
                <!-- 记录日期 -->
                <date value="${date?string("yyyy-MM-dd")}T${date?string("HH:mm:ss")}" />
                </#if>
                <!-- 文档类型：急诊留观病历 -->
                <type>
                    <coding>
                        <system value="2.16.156.10011.2.4" />
                        <code value="C0003" />
                    </coding>
                    <text value="急诊留观病历" />
                </type>
                <!-- 文档标题：急诊留观病历 -->
                <title value="急诊留观病历" />
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
                <!-- 门诊 -->
                <encounter>
                    <reference value="#e1" />
                </encounter>
                <!-- 过敏史章节 -->
                <section>
                    <#if inpatAlleMark??>
                    <!--患者过敏史标志 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/code/inpat-alle-mark">
                        <valueCode value="${inpatAlleMark}" />
                    </extension>
                    </#if>
                    <#if rritability??>
                    <!-- 过敏史描述 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/rritability">
                        <valueString value="${rritability}" />
                    </extension>
                    </#if>
                    <title value="过敏史章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="48765-2" />
                            <display value="Allergies, adverse reactions, alerts" />
                        </coding>
                    </code>
                </section>
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
                    <!-- 既往史 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/history">
                        <valueString value="${history}" />
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
                <!-- 体格检查章节 -->
                <section>
                    <#if phyCheckup??>
                    <!--体格检查 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/phy-checkup">
                        <valueString value="${phyCheckup}" />
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
                <!-- 实验室检验章节 -->
                <section>
                    <#if auxiliaryExaminationProject??>
                    <!--辅助检查项目 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/auxiliary-examination-project">
                        <valueString value="${auxiliaryExaminationProject}" />
                    </extension>
                    </#if>
                    <#if auxiliaryExaminationResults??>
                    <!--辅助检查结果 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/auxiliary-examination-results">
                        <valueString value="${auxiliaryExaminationResults}" />
                    </extension>
                    </#if>
                    <title value="实验室检验章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="30954-2" />
                            <display value="STUDIES SUMMARY" />
                        </coding>
                    </code>
                </section>
                <!-- 诊断记录章节 -->
                <section>
                    <#if newlyMark??>
                    <!--初诊标志代码 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/code/newly-mark">
                        <valueCode value="${newlyMark}" />
                    </extension>
                    </#if>
                    <#if cnFourResult??>
                    <!--中医"四诊"观察结果 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/cn-four-result">
                        <valueString value="${cnFourResult}" />
                    </extension>
                    </#if>
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
                    <!-- 中医病名 -->
                    <entry>
                        <reference value="#c2" />
                    </entry>
                    <!-- 中医证候 -->
                    <entry>
                        <reference value="#c3" />
                    </entry>
                </section>
                <!-- 治疗计划章节 -->
                <section>
                    <#if dialectProof??>
                    <!--辨证依据 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/dialect-proof">
                        <valueString value="${dialectProof}" />
                    </extension>
                    </#if>
                    <#if therapeuticPrinciples??>
                    <!--治则治法 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/therapeutic-principles">
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
                <!-- 医嘱章节 -->
                <section>
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
                        <reference value="#m1" />
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
                    <!-- 手术 -->
                    <entry>
                        <reference value="#p1" />
                    </entry>
                </section>
                <!-- 抢救记录章节 -->
                <section>
                    <#if rescueSt??>
                    <!--抢救开始时间 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/date/rescue-st">
                        <valueDateTime value="${rescueSt?string("yyyy-MM-dd")}T${rescueSt?string("HH:mm:ss")}" />
                    </extension>
                    </#if>
                    <#if rescueEt??>
                    <!--抢救结束时间 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/date/rescue-et">
                        <valueDateTime value="${rescueEt?string("yyyy-MM-dd")}T${rescueEt?string("HH:mm:ss")}" />
                    </extension>
                    </#if>
                    <#if rescueRecord??>
                    <!--急诊抢救记录 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/rescue-record">
                        <valueString value="${rescueRecord}" />
                    </extension>
                    </#if>
                    <#if rescueNameList??>
                    <!--参加抢救人员名单 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/rescue-name-list">
                        <valueString value="${rescueNameList}" />
                    </extension>
                    </#if>
                    <#if post??>
                    <!--专业技术职务代码 -->
                    <extension
                        url="urn:oid:2.16.156.10011.2.3.3.10">
                        <valueCode value="${post}" />
                    </extension>
                    </#if>
                    <title value="抢救记录章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="99999-2" />
                            <display value="RESCUE RECORD" />
                        </coding>
                    </code>
                </section>
                <!-- 住院过程章节 -->
                <section>
                    <#if inReason??>
                    <!-- 急诊留观病程记录 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/in-reason">
                        <valueString value="${inReason}" />
                    </extension>
                    </#if>
                    <#if observationTime??>
                    <!-- 收入观察室日期时间 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/date/observation-time">
                        <valueDateTime value="${observationTime?string("yyyy-MM-dd")}T${observationTime?string("HH:mm:ss")}" />
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
                <!-- 其他相关信息章节 -->
                <section>
                    <#if mattersNeedingAttention??>
                    <!--注意事项 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/matters-needing-attention">
                        <valueString value="${mattersNeedingAttention}" />
                    </extension>
                    </#if>
                    <#if outCode??>
                    <!-- 患者去向代码 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/code/out-code">
                        <valueCode value="${outCode}" />
                    </extension>
                    </#if>
                    <title value="其他相关信息章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="99999-3" />
                            <display value="OTHER RELATED INFORMATION" />
                        </coding>
                    </code>
                </section>
            </Composition>
        </resource>
    </entry>
</Bundle>