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
            <!-- 资源：手术知情同意书 -->
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
                        <identifier>
                            <!-- 院内患者ID命名空间 -->
                            <system
                                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/patient-id" />
                            <#if patientId??>
                            <!-- 院内患者ID -->
                            <value value="${patientId}" />
                            </#if>
                        </identifier>
                        <identifier>
                            <!-- 身份证号命名空间 -->
                            <system value="urn:oid:2.16.156.10011.1.3" />
                            <#if idCard??>
                            <!-- 身份证号 -->
                            <value value="${idCard}" />
                            </#if>
                        </identifier>
                        <identifier>
                            <!-- 城乡居民健康档案编号命名空间 -->
                            <system value="urn:oid:2.16.156.10011.1.2" />
                            <#if healthFileNumber??>
                            <!-- 城乡居民健康档案编号 -->
                            <value value="${healthFileNumber}" />
                            </#if>
                        </identifier>
                        <identifier>
                            <!-- 健康卡命名空间 -->
                            <system value="urn:oid:2.16.156.10011.1.19" />
                            <#if healthCard??>
                            <!-- 健康卡号 -->
                            <value value="${healthCard}" />
                            </#if>
                        </identifier>
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
                        <#if birthdate??>
                        <!-- 出生日期 -->
                        <birthDate value="${birthdate?string("yyyy-MM-dd")}" />
                        </#if>
                        <!-- 签名代理人 -->
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
                                <#if contactsPhone??>
                                <!-- 联系人电话号码 -->
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
                <!-- 经治医师 -->
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra2" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                            <#if certifiedPhysicianId??>
                            <!-- 院内人员ID号 -->
                            <value value="${certifiedPhysicianId}" />
                            </#if>
                        </identifier>
                        <name>
                            <#if certifiedPhysicianName??>
                            <!-- 姓名 -->
                            <text value="${certifiedPhysicianName}" />
                            </#if>
                        </name>
                    </Practitioner>
                </contained>
                <!-- 门诊或住院 -->
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
                        <#if cnFourResult??>
                        <!--中医"四诊"观察结果 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/text/cn-four-result">
                            <valueString value="${cnFourResult}" />
                        </extension>
                        </#if>
                        <#if chief??>
                        <!--主诉 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/text/chief">
                            <valueString value="${chief}" />
                        </extension>
                        </#if>
                        <#if visitingType??>
                        <!-- 就诊类型 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/visiting-type">
                            <valueCode value="${visitingType}" />
                        </extension>
                        </#if>
                        <identifier>
                            <#if visitMark=='2'>
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/inpatient-registration-id" />
                            <#else>
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/outpatient-registration-id" />
                            </#if>
                            <#if registrationId??>
                            <!-- 原系统住院流水id号 -->
                            <value value="${registrationId}" />
                            </#if>
                        </identifier>
                        <!-- 状态 -->
                        <status value="in-progress" />
                        <#if visitMark=='2'>
                        <!-- 类型：住院 -->
                        <class value="inpatient" />
                        <#else>
                        <!-- 类型：就诊 -->
                        <class value="outpatient" />
                        </#if>
                        <period>
                            <#if visitMark=='2'>
                            <#if start??>
                            <!-- 入院时间 -->
                            <start value="${start?string("yyyy-MM-dd")}T${start?string("HH:mm:ss")}" />
                            </#if>
                            <#else>
                            <#if visitingTime??>
                            <!-- 就诊时间 -->
                            <start value="${visitingTime?string("yyyy-MM-dd")}T${visitingTime?string("HH:mm:ss")}" />
                            </#if>
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
                <!-- 手术过程 -->
                <contained>
                    <Procedure>
                        <id value="pro1"/>
                        <!-- 手术者 -->
                        <contained>
                            <Practitioner xmlns="http://hl7.org/fhir">
                                <id value="pro1pra1" />
                                <identifier>
                                    <!-- 院内人员ID号命名空间 -->
                                    <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                                    <#if operative??>
                                    <!-- 院内人员ID号 -->
                                    <value value="${operative}" />
                                    </#if>
                                </identifier>
                                <name>
                                    <#if operativeName??>
                                    <!-- 姓名 -->
                                    <text value="${operativeName}" />
                                    </#if>
                                </name>
                            </Practitioner>
                        </contained>
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
                        <#if operationCourse??>
                        <!-- 手术方式描述 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/text/operation-course">
                            <valueString value="${operationCourse}" />
                        </extension>
                        </#if>
                        <identifier>
                            <!-- 原系统手术单id命名空间 -->
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/operation-id" />
                            <#if operationId??>
                            <!-- 原系统手术单id号 -->
                            <value value="${operationId}" />
                            </#if>
                        </identifier>
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
                        </code>
                        <performer>
                            <!-- 手术者id -->
                            <actor>
                                <reference value="#pro1pra1" />
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
                        <performedPeriod>
                            <#if procedureStart??>
                            <!-- 手术开始时间 -->
                            <start value="${procedureStart?string("yyyy-MM-dd")}T${procedureStart?string("HH:mm:ss")}" />
                            </#if>
                            <#if procedureEnd??>
                            <!-- 手术结束时间 -->
                            <end value="${procedureEnd?string("yyyy-MM-dd")}T${procedureEnd?string("HH:mm:ss")}" />
                            </#if>
                        </performedPeriod>
                    </Procedure>
                </contained>
                <!-- 术前诊断 -->
                <contained>
                    <Condition xmlns="http://hl7.org/fhir">
                        <id value="con1" />
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
                <#if patientAgentSignDate??>
                <!-- 患者签名日期时间 -->
                <extension url="http://www.nestvision.com/platform/app/data/v1/datetime/patient-agent-sign-date">
                    <valueDateTime value="${patientAgentSignDate?string("yyyy-MM-dd")}T${patientAgentSignDate?string("HH:mm:ss")}"/>
                </extension>
                </#if>
                <#if agentSignDate??>
                <!-- 法定代理人签名日期时间 -->
                <extension url="http://www.nestvision.com/platform/app/data/v1/datetime/agent-sign-date">
                    <valueDateTime value="${agentSignDate?string("yyyy-MM-dd")}T${agentSignDate?string("HH:mm:ss")}"/>
                </extension>
                </#if>
                <#if remarks??>
                <!--备注 -->
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/text/remarks">
                    <valueString value="${remarks}" />
                </extension>
                </#if>
                <#if informingInformationId??>
                <!-- 手术知情同意书id -->
                <identifier>
                    <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/informing-information-id" />
                    <value value="${informingInformationId}" />
                </identifier>
                </#if>
                <#if date??>
                <!-- 记录日期 -->
                <date value="${date?string("yyyy-MM-dd")}T${date?string("HH:mm:ss")}" />
                </#if>
                <!-- 文档类型：手术知情同意书 -->
                <type>
                    <coding>
                        <system value="2.16.156.10011.2.4" />
                        <code value="C0026" />
                    </coding>
                    <text value="手术知情同意书" />
                </type>
                <!-- 文档标题：手术知情同意书 -->
                <title value="手术知情同意书" />
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
                <!-- 经治医师 -->
                <attester>
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
                        <valueCode value="30" />
                    </extension>
                    <!-- 对于该文档的意义：法律认可 -->
                    <mode value="legal" />
                    <#if certifiedPhysicianDate??>
                    <!-- 签名日期 -->
                    <time value="${certifiedPhysicianDate?string("yyyy-MM-dd")}T${certifiedPhysicianDate?string("HH:mm:ss")}" />
                    </#if>
                    <party>
                        <reference value="#pra2" />
                    </party>
                </attester>
                <!-- 文档管理机构信息 -->
                <custodian>
                    <reference value="#hos1" />
                </custodian>
                <!-- 门诊或入院信息 -->
                <encounter>
                    <reference value="#e1" />
                </encounter>
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
                <!-- 治疗计划章节 -->
                <section>
                    <#if preOperativePreparation??>
                    <!-- 术前准备 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/pre-operative-preparation">
                        <valueString value="${preOperativePreparation}"/>
                    </extension>
                    </#if>
                    <#if operationContraindication??>
                    <!-- 手术禁忌症 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/operation-contraindication">
                        <valueString value="${operationContraindication}"/>
                    </extension>
                    </#if>
                    <#if operationIndication??>
                    <!-- 手术指征 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/operation-indication">
                        <valueString value="${operationIndication}"/>
                    </extension>
                    </#if>
                    <#if alternativeSolution??>
                    <!-- 替代方案 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/alternative-solution">
                        <valueString value="${alternativeSolution}"/>
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
                    <entry>
                        <reference value="#pro1"/>
                    </entry>
                </section>
                <!-- 意见章节 -->
                <section>
                    <#if hospitalAdvice??>
                    <!-- 医疗机构的意见 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/hospital-advice">
                        <valueString value="${hospitalAdvice}" />
                    </extension>
                    </#if>
                    <#if patientAdvice??>
                    <!-- 患者的意见 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/patient-advice">
                        <valueString value="${patientAdvice}" />
                    </extension>
                    </#if>
                    <title value="意见章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="99999-17" />
                            <display value="Opinion" />
                        </coding>
                    </code>
                </section>
                <!-- 风险章节 -->
                <section>
                    <#if operationPossibleAccident??>
                    <!-- 手术中可能出现的意外 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/operation-possible-accident">
                        <valueString value="${operationPossibleAccident}" />
                    </extension>
                    </#if>
                    <#if postoperativePossibleAccident??>
                    <!-- 手术后可能出现的意外 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/postoperative-possible-accident">
                        <valueString value="${postoperativePossibleAccident}" />
                    </extension>
                    </#if>
                    <title value="风险章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="99999-18" />
                            <display value="risk" />
                        </coding>
                    </code>
                </section>
            </Composition>
        </resource>
    </entry>
</Bundle>