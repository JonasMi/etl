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
            <!-- 资源：入院评估 -->
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
                        <#if educationCd??>
                        <!-- 学历代码 GBT4658 -->
                        <extension url="urn:oid:2.16.156.10011.2.3.3.6">
                            <valueCode value="${educationCd}" />
                        </extension>
                        </#if>
                        <#if nationalityCode??>
                        <!-- 国籍代码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/nationality-code">
                            <valueCode value="${nationalityCode}" />
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
                        <telecom>
                            <!-- 联系方式代码 -->
                            <system value="phone" />
                            <#if telecom??>
                            <!-- 手机号码 -->
                            <value value="${telecom}" />
                            </#if>
                            <!-- 使用方式:移动 -->
                            <use value="mobile" />
                        </telecom>
                        <telecom>
                            <!-- 联系方式代码 -->
                            <system value="phone" />
                            <#if workPhone??>
                            <!-- 工作单位电话号码 -->
                            <value value="${workPhone}" />
                            </#if>
                            <!-- 使用方式:工作 -->
                            <use value="work" />
                        </telecom>
                        <telecom>
                            <!-- 联系方式代码 -->
                            <system value="email" />
                            <#if email??>
                            <!-- 电子邮箱地址 -->
                            <value value="${email}" />
                            </#if>
                            <!-- 使用方式:现在 -->
                            <use value="temp" />
                        </telecom>
                        <#if gender??>
                        <!-- 性别 -->
                        <gender value="${mappingValue('GBT22611',gender)!''}" />
                        </#if>
                        <#if birthdate??>
                        <!-- 出生日期 -->
                        <birthDate value="${birthdate?string("yyyy-MM-dd")}" />
                        </#if>
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
                        <!-- 联系人 -->
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
                <!-- 文档管理者 -->
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra2" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                            <#if documentManagerId??>
                            <!-- 院内人员ID号 -->
                            <value value="${documentManagerId}" />
                            </#if>
                        </identifier>
                        <name>
                            <#if documentManagerId??>
                            <!-- 姓名 -->
                            <text value="${documentManagerId}" />
                            </#if>
                        </name>
                    </Practitioner>
                </contained>
                <!-- 文档审核者 -->
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra3" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                            <#if documentVerifierId??>
                            <!-- 院内人员ID号 -->
                            <value value="${documentVerifierId}" />
                            </#if>
                        </identifier>
                        <name>
                            <#if documentVerifierName??>
                            <!-- 姓名 -->
                            <text value="${documentVerifierName}" />
                            </#if>
                        </name>
                    </Practitioner>
                </contained>
                <!-- 责任护士 -->
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra4" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                            <#if responsibilityNurseId??>
                            <!-- 院内人员ID号 -->
                            <value value="${responsibilityNurseId}" />
                            </#if>
                        </identifier>
                        <name>
                            <#if responsibilityNurseName??>
                            <!-- 姓名 -->
                            <text value="${responsibilityNurseName}" />
                            </#if>
                        </name>
                    </Practitioner>
                </contained>
                <!-- 接诊护士 -->
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra5" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                            <#if treatmentNurseId??>
                            <!-- 院内人员ID号 -->
                            <value value="${treatmentNurseId}" />
                            </#if>
                        </identifier>
                        <name>
                            <#if treatmentNurseName??>
                            <!-- 姓名 -->
                            <text value="${treatmentNurseName}" />
                            </#if>
                        </name>
                    </Practitioner>
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
                        <#if cnFourResult??>
                        <!--中医"四诊"观察结果 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/text/cn-four-result">
                            <valueString value="${cnFourResult}" />
                        </extension>
                        </#if>
                        <#if inModeCode??>
                        <!-- 入院途径 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/code/in-mode-code">
                            <valueCode value="${inModeCode}" />
                        </extension>
                        </#if>
                        <#if inhospitalReasonCd??>
                        <!-- 住院原因代码 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/code/inhospital-reason-cd">
                            <valueCode value="${inhospitalReasonCd}" />
                        </extension>
                        </#if>
                        <#if inhospitalWay??>
                        <!--入病房方式 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/text/inhospital-way">
                            <valueString value="${inhospitalWay}" />
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
                <!-- 诊断 -->
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
                <#if admissionAssessmentRecordsId??>
                <!-- 入院评估id -->
                <identifier>
                    <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/admission-assessment-records-id" />
                    <value value="${admissionAssessmentRecordsId}" />
                </identifier>
                </#if>
                <#if date??>
                <!-- 记录日期 -->
                <date value="${date?string("yyyy-MM-dd")}T${date?string("HH:mm:ss")}" />
                </#if>
                <!-- 文档类型：入院评估 -->
                <type>
                    <coding>
                        <system value="2.16.156.10011.2.4" />
                        <code value="C0023" />
                    </coding>
                    <text value="入院评估" />
                </type>
                <!-- 文档标题：入院评估 -->
                <title value="入院评估" />
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
                <!-- 文档管理者 -->
                <attester>
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
                        <valueCode value="23" />
                    </extension>
                    <!-- 对于该文档的意义：法律认可 -->
                    <mode value="legal" />
                    <#if documentManagerDate??>
                    <!-- 签名日期 -->
                    <time value="${documentManagerDate?string("yyyy-MM-dd")}T${documentManagerDate?string("HH:mm:ss")}" />
                    </#if>
                    <party>
                        <reference value="#pra2" />
                    </party>
                </attester>
                <!-- 文档审核者 -->
                <attester>
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
                        <valueCode value="17" />
                    </extension>
                    <!-- 对于该文档的意义：法律认可 -->
                    <mode value="legal" />
                    <#if documentVerifierSignDate??>
                    <!-- 签名日期 -->
                    <time value="${documentVerifierSignDate?string("yyyy-MM-dd")}T${documentVerifierSignDate?string("HH:mm:ss")}" />
                    </#if>
                    <party>
                        <reference value="#pra3" />
                    </party>
                </attester>
                <!-- 责任护士 -->
                <attester>
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
                        <valueCode value="05" />
                    </extension>
                    <!-- 对于该文档的意义：法律认可 -->
                    <mode value="legal" />
                    <#if responsibilityNurseDate??>
                    <!-- 签名日期 -->
                    <time value="${responsibilityNurseDate?string("yyyy-MM-dd")}T${responsibilityNurseDate?string("HH:mm:ss")}" />
                    </#if>
                    <party>
                        <reference value="#pra4" />
                    </party>
                </attester>
                <!-- 接诊护士 -->
                <attester>
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
                        <valueCode value="29" />
                    </extension>
                    <!-- 对于该文档的意义：法律认可 -->
                    <mode value="legal" />
                    <#if treatmentNurseDate??>
                    <!-- 签名日期 -->
                    <time value="${treatmentNurseDate?string("yyyy-MM-dd")}T${treatmentNurseDate?string("HH:mm:ss")}" />
                    </#if>
                    <party>
                        <reference value="#pra5" />
                    </party>
                </attester>
                <!-- 文档管理机构信息 -->
                <custodian>
                    <reference value="#hos1" />
                </custodian>
                <!-- 住院或门诊 -->
                <encounter>
                    <reference value="#e1" />
                </encounter>
                <!-- 入院信息章节 -->
                <section>
                    <title value="入院信息章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="99999-20" />
                            <display value="入院信息" />
                        </coding>
                    </code>
                    <entry>
                        <reference value="#e1"/>
                    </entry>
                </section>
                <!-- 症状（主要健康问题） -->
                <section>
                    <#if mainSymptomsName??>
                    <!-- 主要症状名称 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/main-symptoms-name">
                        <valueString value="${mainSymptomsName}" />
                    </extension>
                    </#if>
                    <#if mainSymptomsDescribed??>
                    <!-- 主要症状描述 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/main-symptoms-described">
                        <valueString value="${mainSymptomsDescribed}" />
                    </extension>
                    </#if>
                    <title value="症状章节" />
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
                    <#if weight??>
                    <!-- 体重 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/number/weight">
                        <valueDecimal value="${weight}" />
                    </extension>
                    </#if>
                    <#if bodyTemperature??>
                    <!--体格检查：体温 (体温的测量值，计量单位为℃)-->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/number/body-temperature">
                        <valueDecimal value="${bodyTemperature}" />
                    </extension>
                    </#if>
                    <#if prFreq??>
                    <!--体格检查：脉率（次/min） (患者每分钟脉搏次数的测量值，计量单位为次/min)-->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/number/pr-freq">
                        <valueInteger value="${prFreq}" />
                    </extension>
                    </#if>
                    <#if breatheFreq??>
                    <!--体格检查：呼吸频率（次/min）-->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/number/breathe-freq">
                        <valueInteger value="${breatheFreq}" />
                    </extension>
                    </#if>
                    <#if sbp??>
                    <!--体格检查：收缩压 (收缩压的测量值，计量单位为mmHg)-->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/number/sbp">
                        <valueInteger value="${sbp}" />
                    </extension>
                    </#if>
                    <#if dbp??>
                    <!--体格检查：舒张压 (舒张压的测量值，计量单位为mmHg)-->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/number/dbp">
                        <valueInteger value="${dbp}" />
                    </extension>
                    </#if>
                    <#if bodyHeight??>
                    <!--体格检查：身高 (患者身高的测量值，计量单位为cm)-->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/number/body-height">
                        <valueDecimal value="${bodyHeight}" />
                    </extension>
                    </#if>
                    <#if bodyWeight??>
                    <!--体格检查：体重 (患者体重的测量值，计量单位为kg)-->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/number/body-weight">
                        <valueDecimal value="${bodyWeight}" />
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
                    <#if historyOfDisease??>
                    <!-- 疾病史（含外伤） -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/history-of-disease">
                        <valueString value="${historyOfDisease}" />
                    </extension>
                    </#if>
                    <#if infectionHistory??>
                    <!-- 传染病史 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/infection-history">
                        <valueString value="${infectionHistory}" />
                    </extension>
                    </#if>
                    <#if vaccHis??>
                    <!-- 预防接种史描述 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/vacc-his">
                        <valueString value="${vaccHis}" />
                    </extension>
                    </#if>
                    <#if opHis??>
                    <!-- 手术史 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/op-his">
                        <valueString value="${opHis}" />
                    </extension>
                    </#if>
                    <#if transfusionHis??>
                    <!-- 输血史描述 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/transfusion-his">
                        <valueString value="${transfusionHis}" />
                    </extension>
                    </#if>
                    <#if obstetricalHistory??>
                    <!-- 婚育史 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/obstetrical-history">
                        <valueString value="${obstetricalHistory}" />
                    </extension>
                    </#if>
                    <#if healthMark??>
                    <!-- 一般健康状况标志 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/boolean/health-mark">
                        <valueBoolean value="${healthMark?string("true","false")}" />
                    </extension>
                    </#if>
                    <#if infectiousMark??>
                    <!-- 患者传染性标志 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/boolean/infectious-mark">
                        <valueBoolean value="${infectiousMark?string("true","false")}" />
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
                <!-- 过敏史章节 -->
                <section>
                    <#if rritability??>
                    <!-- 过敏史描述 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/rritability">
                        <valueString value="${rritability}" />
                    </extension>
                    </#if>
                    <title value="过敏史章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="10155-0" />
                            <display value="HISTORY OF ALLERGIES" />
                        </coding>
                    </code>
                </section>
                <!-- 家族史章节 -->
                <section>
                    <#if famHistory??>
                    <!-- 家族史 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/fam-history">
                        <valueString value="${famHistory}" />
                    </extension>
                    </#if>
                    <title value="家族史章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="10157-6" />
                            <display value="HISTORY OF FAMILY MEMBER DISEASES" />
                        </coding>
                    </code>
                </section>
                <!-- 健康评估章节 -->
                <section>
                    <#if apgarScore??>
                    <!-- Apgar评分值 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/number/apgar-score">
                        <valueDecimal value="${apgarScore}" />
                    </extension>
                    </#if>
                    <#if developmentDegree??>
                    <!-- 发育程度代码CV9900337 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/development-degree">
                        <valueCode value="${developmentDegree}" />
                    </extension>
                    </#if>
                    <#if spiritNormalStatus??>
                    <!--精神状态正常标志 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/boolean/spirit-normal-status">
                        <valueBoolean value="${spiritNormalStatus?string("true","false")}" />
                    </extension>
                    </#if>
                    <#if sleepStatus??>
                    <!--睡眠状况 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/sleep-status">
                        <valueString value="${sleepStatus}" />
                    </extension>
                    </#if>
                    <#if exceptionalCase??>
                    <!-- 特殊情况 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/exceptional-case">
                        <valueString value="${exceptionalCase}" />
                    </extension>
                    </#if>
                    <#if mentalState??>
                    <!-- 心理状态代码CV0510002 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/mental-state">
                        <valueCode value="${mentalState}" />
                    </extension>
                    </#if>
                    <#if nutritionalStatus??>
                    <!-- 营养状态代码CV9900338 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/nutritional-status">
                        <valueCode value="${nutritionalStatus}" />
                    </extension>
                    </#if>
                    <#if ofDaily??>
                    <!-- 自理能力代码CV9900339 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/of-daily">
                        <valueCode value="${ofDaily}" />
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
                <!-- 生活方式章节 -->
                <section>
                    <#if ifSmoking??>
                    <!--吸烟标志 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/boolean/if-smoking">
                        <valueBoolean value="${ifSmoking?string("true","false")}" />
                    </extension>
                    </#if>
                    <#if smokingState??>
                    <!-- 吸烟状况代码CV0300101 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/smoking-state">
                        <valueCode value="${smokingState}" />
                    </extension>
                    </#if>
                    <#if smokingPerDay??>
                    <!-- 日吸烟量(支) -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/number/smoking-per-day">
                        <valueDecimal value="${smokingPerDay}" />
                    </extension>
                    </#if>
                    <#if stopSmokingDays??>
                    <!-- 停止吸烟天数 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/number/stop-smoking-days">
                        <valueDecimal value="${stopSmokingDays}" />
                    </extension>
                    </#if>
                    <#if ifDrinking??>
                    <!--饮酒标志 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/boolean/if-drinking">
                        <valueBoolean value="${ifDrinking?string("true","false")}" />
                    </extension>
                    </#if>
                    <#if drinkingFrequency??>
                    <!-- 饮酒频率代码CV0300104 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/drinking-frequency">
                        <valueCode value="${drinkingFrequency}" />
                    </extension>
                    </#if>
                    <#if drinkingPerDay??>
                    <!-- 日饮酒量（mL） -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/number/drinking-per-day">
                        <valueDecimal value="${drinkingPerDay}" />
                    </extension>
                    </#if>
                    <#if dietaryStatus??>
                    <!-- 饮食情况代码CV9900003 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/dietary-status">
                        <valueCode value="${dietaryStatus}" />
                    </extension>
                    </#if>
                    <title value="生活方式章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="99999-21" />
                            <display value="生活方式" />
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
                        <reference value="#con1" />
                    </entry>
                </section>
                <!-- 护理观察章节 -->
                <section>
                    <#if observationProjectName??>
                    <!-- 护理观察项目名称 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/observation-project-name">
                        <valueString value="${observationProjectName}" />
                    </extension>
                    </#if>
                    <#if observationResultsDescription??>
                    <!-- 护理观察结果 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/observation-results-description">
                        <valueString value="${observationResultsDescription}" />
                    </extension>
                    </#if>
                    <title value="护理观察章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="99999-22" />
                            <display value="护理观察" />
                        </coding>
                    </code>
                </section>
                <!-- 住院过程章节 -->
                <section>
                    <#if ifNotifyPhysician??>
                    <!--通知医师标志 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/boolean/if-notify-physician">
                        <valueBoolean value="${ifNotifyPhysician?string("true","false")}" />
                    </extension>
                    </#if>
                    <#if notifyPhysicianTime??>
                    <!--通知医师日期时间 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/datetime/notify-physician-time">
                        <valueDateTime value="${notifyPhysicianTime?string("yyyy-MM-dd")}T${notifyPhysicianTime?string("HH:mm:ss")}" />
                    </extension>
                    </#if>
                    <#if assessmentTime??>
                    <!--评估日期时间 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/datetime/assessment-time">
                        <valueDateTime value="${assessmentTime?string("yyyy-MM-dd")}T${assessmentTime?string("HH:mm:ss")}" />
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