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
            <!-- 资源：会诊记录 -->
            <Composition xmlns="http://hl7.org/fhir">
                <!-- 保管机构 -->
                <contained>
                    <Organization xmlns="http://hl7.org/fhir">
                        <id value="hos1" />
                        <identifier>
                            <!-- 原系统机构ID号命名空间 -->
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/hospital-id" />
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
                <!-- 患者信息 -->
                <contained>
                    <Patient xmlns="http://hl7.org/fhir">
                        <id value="pat1" />
                        <#if age??>
                        <!-- 年龄 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/number/age">
                            <valueDecimal value="${age}" />
                        </extension>
                        </#if>
                        <#if ifRritability??>
                        <!-- 是否有过敏史 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/boolean/if-rritability">
                            <valueBoolean value="${ifRritability?string("true","false")}" />
                        </extension>
                        </#if>
                        <#if rritability??>
                        <!-- 过敏史其他描述 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/text/rritability">
                            <valueString value="${rritability}" />
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
                        <name>
                            <#if name??>
                            <!-- 姓名 -->
                            <text value="${name}" />
                            </#if>
                        </name>
                        <#if gender??>
                        <!-- 性别 -->
                        <gender value="${mappingValue('GBT22611',gender)!''}" />
                        </#if>
                        <contact>
                            <relationship>
                                <coding>
                                    <!-- 联系人关系代码命名空间 -->
                                    <system value="urn:oid:2.16.156.10011.2.3.3.8" />
                                    <#if relationship??>
                                    <!-- 联系人关系代码 -->
                                    <code value="${relationship}" />
                                    </#if>
                                </coding>
                            </relationship>
                            <name>
                                <#if contactsName??>
                                <!-- 联系人姓名 -->
                                <text value="${contactsName}" />
                                </#if>
                            </name>
                            <telecom>
                                <!-- 联系人联系方式代码 -->
                                <system value="phone" />
                                <!-- 联系人电话号码 -->
                                <#if contactsPhone??>
                                <value value="${contactsPhone}" />
                                </#if>
                                <use value="temp" />
                            </telecom>
                        </contact>
                    </Patient>
                </contained>
                <!-- 文档创建者 -->
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra1" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                            <#if authorId??>
                            <!-- 院内人员ID号 -->
                            <value value="${authorId}" />
                            </#if>
                        </identifier>
                        <name>
                            <#if authorName??>
                            <!-- 姓名 -->
                            <text value="${authorName}" />
                            </#if>
                        </name>
                    </Practitioner>
                </contained>
                <!-- 会诊申请医师 -->
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra2" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                            <#if consultationRequestDoctorId??>
                            <!-- 院内人员ID号 -->
                            <value value="${consultationRequestDoctorId}" />
                            </#if>
                        </identifier>
                        <name>
                            <#if consultationRequestDoctorName??>
                            <!-- 姓名 -->
                            <text value="${consultationRequestDoctorName}" />
                            </#if>
                        </name>
                    </Practitioner>
                </contained>
                <!-- 会诊医师 -->
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra3" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                            <#if consultationDoctorId??>
                            <!-- 院内人员ID号 -->
                            <value value="${consultationDoctorId}" />
                            </#if>
                        </identifier>
                        <name>
                            <#if consultationDoctorName??>
                            <!-- 姓名 -->
                            <text value="${consultationDoctorName}" />
                            </#if>
                        </name>
                    </Practitioner>
                </contained>
                <!-- 会诊申请科室 -->
                <contained>
                    <Organization xmlns="http://hl7.org/fhir">
                        <id value="o1" />
                        <!-- 会诊申请机构 -->
                        <contained>
                            <Organization xmlns="http://hl7.org/fhir">
                                <id value="o1hos1" />
                                <identifier>
                                    <!-- 原系统机构ID号命名空间 -->
                                    <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/hospital-id" />
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
                        <#if consultationRequestDeptCd??>
                        <!-- 科室归类代码 -->
                        <extension url="urn:oid:2.16.156.10011.2.3.2.62">
                            <valueCode value="${consultationRequestDeptCd}" />
                        </extension>
                        </#if>
                        <identifier>
                            <!-- 院内科室ID号命名空间 -->
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id" />
                            <#if consultationRequestDeptId??>
                            <!-- 院内科室ID号 -->
                            <value value="${consultationRequestDeptId}" />
                            </#if>
                        </identifier>
                        <#if consultationRequestDeptName??>
                        <!-- 科室名称 -->
                        <name value="${consultationRequestDeptName}" />
                        </#if>
                        <partOf>
                            <!-- 会诊申请医院 -->
                            <reference value="#o1hos1" />
                        </partOf>
                    </Organization>
                </contained>
                <!-- 会诊科室 -->
                <contained>
                    <Organization xmlns="http://hl7.org/fhir">
                        <id value="o2" />
                        <!-- 会诊机构 -->
                        <contained>
                            <Organization xmlns="http://hl7.org/fhir">
                                <id value="o2hos1" />
                                <identifier>
                                    <!-- 原系统机构ID号命名空间 -->
                                    <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/hospital-id" />
                                    <#if upHospital??>
                                    <!-- 原系统机构ID号 -->
                                    <value value="upHospital" />
                                    </#if>
                                </identifier>
                                <#if upHospitalName??>
                                <!-- 医院名称 -->
                                <name value="${upHospitalName}" />
                                </#if>
                            </Organization>
                        </contained>
                        <#if consultationDeptCd??>
                        <!-- 科室归类代码 -->
                        <extension url="urn:oid:2.16.156.10011.2.3.2.62">
                            <valueCode value="${consultationDeptCd}" />
                        </extension>
                        </#if>
                        <identifier>
                            <!-- 院内科室ID号命名空间 -->
                            <system
                                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id" />
                            <#if consultationDeptId??>
                            <!-- 院内科室ID号 -->
                            <value value="${consultationDeptId}" />
                            </#if>
                        </identifier>
                        <#if consultationDeptName??>
                        <!-- 科室名称 -->
                        <name value="${consultationDeptName}" />
                        </#if>
                        <partOf>
                            <!-- 会诊申请医院 -->
                            <reference value="#o2hos1" />
                        </partOf>
                    </Organization>
                </contained>
                <!-- 住院 -->
                <contained>
                    <Encounter xmlns="http://hl7.org/fhir">
                        <id value="e1" />
                        <contained>
                            <Location xmlns="http://hl7.org/fhir">
                                <id value="e1l1" />
                                <identifier>
                                    <!--原系统床位ID号命名空间 -->
                                    <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/bed-id" />
                                    <#if bedNum??>
                                    <!-- 原系统床位ID号 -->
                                    <value value="${bedNum}" />
                                    </#if>
                                </identifier>
                                <address>
                                    <#if wardNo??>
                                    <!--病房号 -->
                                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/ward-no">
                                        <valueString value="${wardNo}" />
                                    </extension>
                                    </#if>
                                    <#if wardArea??>
                                    <!--病区 -->
                                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/ward-area">
                                        <valueString value="${wardArea}" />
                                    </extension>
                                    </#if>
                                    <#if bedNum??>
                                    <!--床位号 -->
                                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/bed-num">
                                        <valueString value="${bedNum}" />
                                    </extension>
                                    </#if>
                                </address>
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
                                <identifier>
                                    <!-- 院内科室ID号命名空间 -->
                                    <system
                                        value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id" />
                                    <#if visitingDeptId??>
                                    <!-- 院内科室ID号 -->
                                    <value value="${visitingDeptId}" />
                                    </#if>
                                </identifier>
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
                                            <#if upHospital??>
                                            <!-- 机构ID号 -->
                                            <value value="${upHospital}" />
                                            </#if>
                                        </identifier>
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
                                <identifier>
                                    <!-- 院内科室ID号命名空间 -->
                                    <system
                                        value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id" />
                                    <#if visitingDeptId??>
                                    <!-- 院内科室ID号 -->
                                    <value value="${visitingDeptId}" />
                                    </#if>
                                </identifier>
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
                        <identifier>
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/inpatient-registration-id" />
                            <#if inpatientRegistrationId??>
                            <!-- 原系统住院流水id号 -->
                            <value value="${inpatientRegistrationId}" />
                            </#if>
                        </identifier>
                        <!-- 状态 -->
                        <status value="in-progress" />
                        <!-- 类型：住院 -->
                        <class value="inpatient" />
                        <period>
                            <#if start??>
                            <!-- 入院时间 -->
                            <start value="${start?string("yyyy-MM-dd")}T${start?string("HH:mm:ss")}" />
                            </#if>
                        </period>
                        <hospitalization>
                            <preAdmissionIdentifier>
                                <!-- 住院号命名空间 -->
                                <system value="http://www.nestvision.com/platform/app/data/v1/text/inh-id" />
                                <#if inhId??>
                                <!-- 住院号 -->
                                <value value="${inhId}" />
                                </#if>
                            </preAdmissionIdentifier>
                        </hospitalization>
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
                <!-- 诊断记录 -->
                <contained>
                    <Condition xmlns="http://hl7.org/fhir">
                        <id value="con1" />
                        <#if cnSymDiagCode??>
                        <!--中医症候代码CV9900357 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/code/cn-sym-diag-code">
                            <valueCode value="${cnSymDiagCode}" />
                        </extension>
                        </#if>
                        <#if cnDisDiagCode??>
                        <!--中医病名代码CV9900357 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/code/cn-dis-diag-code">
                            <valueCode value="${cnDisDiagCode}" />
                        </extension>
                        </#if>
                        <#if cnFourResult??>
                        <!--中医"四诊"观察结果 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/text/cn-four-result">
                            <valueString value="${cnFourResult}" />
                        </extension>
                        </#if>
                        <patient />
                        <code>
                            <coding>
                                <!--诊断编码 -->
                                <system value="urn:oid:2.16.156.10011.2.3.3.11" />
                                <#if diagCode??>
                                <!--诊断编码 -->
                                <code value="${diagCode}" />
                                </#if>
                                <#if diagName??>
                                <display value="${diagName}" />
                                </#if>
                            </coding>
                        </code>
                        <verificationStatus />
                        <#if diagDate??>
                        <!-- 诊断日期 -->
                        <onsetDateTime value="${diagDate?string("yyyy-MM-dd")}" />
                        </#if>
                    </Condition>
                </contained>
                <!-- 会诊申请科室 -->
                <extension  url="http://www.nestvision.com/platform/app/data/v1/identifier/order-dpid">
                    <valueReference>
                        <reference value="#o1"/>
                    </valueReference>
                </extension>
                <!-- 会诊科室-->
                <extension  url="http://www.nestvision.com/platform/app/data/v1/identifier/in-dpid">
                    <valueReference>
                        <reference value="#o2"/>
                    </valueReference>
                </extension>
                <#if consultationDate??>
                <!-- 会诊日期时间 -->
                <extension url="http://www.nestvision.com/platform/app/data/v1/datetime/consutants-time">
                    <valueDateTime value="${consultationDate?string("yyyy-MM-dd")}T${consultationDate?string("HH:mm:ss")}"/>
                </extension>
                </#if>
                <#if hcrConsultationNoteId??>
                <!-- 会诊记录id -->
                <identifier>
                    <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/hcr-consultation-note-id" />
                    <value value="${hcrConsultationNoteId}" />
                </identifier>
                </#if>
                <#if date??>
                <!-- 记录日期 -->
                <date value="${date?string("yyyy-MM-dd")}T${date?string("HH:mm:ss")}" />
                </#if>
                <!-- 文档类型：会诊记录 -->
                <type>
                    <coding>
                        <system value="2.16.156.10011.2.4" />
                        <code value="C0045" />
                    </coding>
                    <text value="会诊记录" />
                </type>
                <!-- 文档标题：会诊记录 -->
                <title value="会诊记录" />
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
                <!-- 会诊申请医师 -->
                <attester>
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
                        <valueCode value="31" />
                    </extension>
                    <!-- 对于该文档的意义：专业 -->
                    <mode value="personal" />
                    <party>
                        <reference value="#pra2"/>
                    </party>
                </attester>
                <!-- 会诊医师 -->
                <attester>
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
                        <valueCode value="32" />
                    </extension>
                    <!-- 对于该文档的意义：专业 -->
                    <mode value="personal" />
                    <party>
                        <reference value="#pra3"/>
                    </party>
                </attester>
                <!-- 文档管理机构信息 -->
                <custodian>
                    <reference value="#hos1" />
                </custodian>
                <!-- 住院信息 -->
                <encounter>
                    <reference value="#e1" />
                </encounter>
                <!-- 健康评估 -->
                <section>
                    <#if caseAbstract??>
                    <!-- 病历摘要 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/case-abstract">
                        <valueString value="${caseAbstract}"/>
                    </extension>
                    </#if>
                    <title value="健康评估章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="51848-0" />
                            <display value="Assessment note" />
                        </coding>
                    </code>
                </section>
                <!-- 诊断章节 -->
                <section>
                    <title value="诊断章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="29548-5" />
                            <display value="Diagnosis" />
                        </coding>
                    </code>
                    <entry>
                        <reference value="#con1"/>
                    </entry>
                </section>
                <!-- 辅助检查章节 -->
                <section>
                    <#if auxiliaryExaminationResults??>
                    <!-- 辅助检查结果 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/auxiliary-examination-results">
                        <valueString value="${auxiliaryExaminationResults}"/>
                    </extension>
                    </#if>
                    <title value="辅助检查章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="99999-12" />
                            <display value="辅助检查章节" />
                        </coding>
                    </code>
                </section>
                <!-- 治疗计划章节 -->
                <section>
                    <#if treatCourseName??>
                    <!-- 诊疗过程名称 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/treat-course-name">
                        <valueString value="${treatCourseName}" />
                    </extension>
                    </#if>
                    <#if therapeuticPrinciples??>
                    <!--治则治法GBT167513 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/therapeutic-principles">
                        <valueCode value="${therapeuticPrinciples}" />
                    </extension>
                    </#if>
                    <#if consultationPurposes??>
                    <!-- 会诊目的 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/consultation-purposes">
                        <valueString value="${consultationPurposes}" />
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
                <!-- 会诊原因章节 -->
                <section>
                    <#if consultationType??>
                    <!-- 会诊类型 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/consultation-type">
                        <valueString value="${consultationType}"/>
                    </extension>
                    </#if>
                    <#if consultationReason??>
                    <!-- 会诊原因 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/consultation-reason">
                        <valueString value="${consultationReason}"/>
                    </extension>
                    </#if>
                    <title value="会诊原因章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="99999-15" />
                            <display value="会诊原因" />
                        </coding>
                    </code>
                </section>
                <!-- 会诊意见章节 -->
                <section>
                    <#if consultationOpinion??>
                    <!-- 会诊意见 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/consultation-opinion">
                        <valueString value="${consultationOpinion}"/>
                    </extension>
                    </#if>
                    <title value="会诊意见章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="99999-16" />
                            <display value="会诊意见" />
                        </coding>
                    </code>
                </section>
                <!-- 住院过程章节 -->
                <section>
                    <#if treatRescueCourse??>
                    <!-- 诊疗过程描述 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/matters-needing-attention">
                        <valueString value="${treatRescueCourse}" />
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
            </Composition>
        </resource>
    </entry>
</Bundle>