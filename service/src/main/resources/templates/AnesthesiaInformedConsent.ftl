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
            <!-- 资源：麻醉知情同意书 -->
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
                            <state value="${homeState}" />
                            </#if>
                        </address>
                        <maritalStatus>
                            <coding>
                                <!-- 婚姻状况代码命名空间 -->
                                <system value="urn:oid:2.16.156.10011.2.3.3.5" />
                                <#if maritalstatus??>
                                <!-- 婚姻状况代码 -->
                                <code value="${maritalstatus}" />
                                </#if>
                            </coding>
                        </maritalStatus>
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
                <!-- 麻醉医师 -->
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra2" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                            <#if anaesthetic??>
                            <!-- 院内人员ID号 -->
                            <value value="${anaesthetic}" />
                            </#if>
                        </identifier>
                        <name>
                            <#if anaestheticName??>
                            <!-- 姓名 -->
                            <text value="${anaestheticName}" />
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
                                        <valueString value="110" />
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
                        <#if visitMark??>
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
                        </#if>
                        <!-- 状态 -->
                        <status value="in-progress" />
                        <#if visitMark=='2'>
                        <!-- 类型：住院 -->
                        <class value="inpatient" />
                        <#else>
                        <!-- 类型：门诊 -->
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
                        <#if visitMark=='2'>
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
                <!-- 术前诊断 -->
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
                <!-- 麻醉单 -->
                <contained>
                    <Procedure>
                        <id value="pro1"/>
                        <identifier>
                            <!-- 原系统麻醉单id命名空间 -->
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/anaesthesia-id" />
                            <#if anaesthesiaId??>
                            <!-- 原系统麻醉id号 -->
                            <value value="${anaesthesiaId}" />
                            </#if>
                        </identifier>
                        <subject/>
                        <!-- 状态：进行中 -->
                        <status value="in-progress" />
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
                                <!-- 手术编码 -->
                                <code value="${operationCd}" />
                                </#if>
                                <#if operationName??>
                                <!-- 手术名字 -->
                                <display value="${operationName}" />
                                </#if>
                            </coding>
                        </code>
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
                <#if anesthesiaInformedConsentId??>
                <!-- 麻醉知情同意书id -->
                <identifier>
                    <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/anesthesia-informed-consent-id" />
                    <value value="${anesthesiaInformedConsentId}" />
                </identifier>
                </#if>
                <#if date??>
                <!-- 记录日期 -->
                <date value="${date?string("yyyy-MM-dd")}T${date?string("HH:mm:ss")}" />
                </#if>
                <!-- 文档类型：麻醉知情同意书 -->
                <type>
                    <coding>
                        <system value="2.16.156.10011.2.4" />
                        <code value="C0027" />
                    </coding>
                    <text value="麻醉知情同意书" />
                </type>
                <!-- 文档标题：麻醉知情同意书 -->
                <title value="麻醉知情同意书" />
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
                <!-- 麻醉医师 -->
                <attester>
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
                        <valueCode value="28" />
                    </extension>
                    <!-- 对于该文档的意义：法律认可 -->
                    <mode value="legal" />
                    <#if anaestheticSignDate??>
                    <!-- 签名日期 -->
                    <time value="${anaestheticSignDate?string("yyyy-MM-dd")}T${anaestheticSignDate?string("HH:mm:ss")}" />
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
                <!-- 术前诊断章节 -->
                <section>
                    <title value="术前诊断章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="10219-4" />
                            <display value="Surgical operation note preoperative DX" />
                        </coding>
                    </code>
                    <entry>
                        <reference value="#con1"/>
                    </entry>
                </section>
                <!-- 治疗计划章节 -->
                <section>
                    <#if invasiveOperationAndTestMethods??>
                    <!-- 拟行有创操作和检测方法 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/invasive-operation-and-test-methods">
                        <valueString value="${invasiveOperationAndTestMethods}"/>
                    </extension>
                    </#if>
                    <#if basicDiseases??>
                    <!-- 基础疾病-->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/basic-diseases">
                        <valueString value="${basicDiseases}"/>
                    </extension>
                    </#if>
                    <#if basicDiseasesOnAnesthesiaInfluence??>
                    <!-- 基础疾病对麻醉可能产生的影响-->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/basic-diseases-on-anesthesia-influence">
                        <valueString value="${basicDiseasesOnAnesthesiaInfluence}"/>
                    </extension>
                    </#if>
                    <#if ifUseAnesthesiaPump??>
                    <!-- 使用麻醉镇痛泵标志 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/boolean/if-use-anesthesia-pump">
                        <valueBoolean value="${ifUseAnesthesiaPump?string("true","false")}"/>
                    </extension>
                    </#if>
                    <#if ifAttendAnesthesiaInsurance??>
                    <!-- 参加麻醉安全保险标志 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/boolean/if-attend-anesthesia-insurance">
                        <valueBoolean value="${ifAttendAnesthesiaInsurance?string("true","false")}"/>
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
                    <!-- 患者/法定代理人的意见 -->
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
                    <#if anesthesiaPossibleAccident??>
                    <!-- 麻醉中可能出现的意外 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/anesthesia-possible-accident">
                        <valueString value="${anesthesiaPossibleAccident}" />
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