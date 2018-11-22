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
            <!-- 资源：出院评估与指导 -->
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
                            <#if documentManagerName??>
                            <!-- 姓名 -->
                            <text value="${documentManagerName}" />
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
                <!-- 住院信息 -->
                <contained>
                    <Encounter xmlns="http://hl7.org/fhir">
                        <id value="e1" />
                        <!-- 接诊护士 -->
                        <contained>
                            <Practitioner xmlns="http://hl7.org/fhir">
                                <id value="e1pra1" />
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
                                <practitionerRole>
                                    <specialty>
                                        <coding>
                                            <!-- 专业技术职务代码命名空间 -->
                                            <system value="urn:oid:2.16.156.10011.2.3.3.10" />
                                            <#if treatmentNursePostCd??>
                                            <!-- 专业技术职务代码 -->
                                            <code value="${treatmentNursePostCd}" />
                                            </#if>
                                        </coding>
                                    </specialty>
                                </practitionerRole>
                            </Practitioner>
                        </contained>
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
                        <status value="arrived" />
                        <!-- 类型：住院 -->
                        <class value="inpatient" />
                        <participant>
                            <type>
                                <coding>
                                    <!-- 角色代码命名空间 -->
                                    <system value="http://hl7.org/fhir/v3/ParticipationType" />
                                    <!-- 角色代码：接诊医生 -->
                                    <code value="REFT" />
                                    <display value="接诊医生" />
                                </coding>
                            </type>
                            <!-- 接诊医生id -->
                            <individual>
                                <reference value="#e1pra1" />
                            </individual>
                        </participant>
                        <period>
                            <#if startTime??>
                            <!-- 入院时间 -->
                            <start value="${startTime?string("yyyy-MM-dd")}T${startTime?string("HH:mm:ss")}" />
                            </#if>
                            <#if endTime??>
                            <!-- 出院时间 -->
                            <end value="${endTime?string("yyyy-MM-dd")}T${endTime?string("HH:mm:ss")}" />
                            </#if>
                        </period>
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
                <!-- 出院评估与指导id -->
                <identifier>
                    <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/discharge-assessment-guidance-records-id" />
                    <#if dischargeAssessmentGuidanceRecordsId??>
                    <value value="${dischargeAssessmentGuidanceRecordsId}" />
                    </#if>
                </identifier>
                <#if date??>
                <!-- 记录日期 -->
                <date value="${date?string("yyyy-MM-dd")}T${date?string("HH:mm:ss")}" />
                </#if>
                <!-- 文档类型：出院评估与指导 -->
                <type>
                    <coding>
                        <system value="2.16.156.10011.2.4" />
                        <code value="C0025" />
                    </coding>
                    <text value="出院评估与指导" />
                </type>
                <!-- 文档标题：出院评估与指导 -->
                <title value="出院评估与指导" />
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
                        <reference value="#pra3" />
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
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
                        <valueCode value="05" />
                    </extension>
                    <!-- 对于该文档的意义：个人 -->
                    <mode value="personal" />
                    <#if responsibilityNurseDate??>
                    <!-- 签名日期 -->
                    <time value="${responsibilityNurseDate?string("yyyy-MM-dd")}T${responsibilityNurseDate?string("HH:mm:ss")}" />
                    </#if>
                    <party>
                        <reference value="#pra4" />
                    </party>
                </attester>
                <!-- 文档管理机构信息 -->
                <custodian>
                    <reference value="#hos1" />
                </custodian>
                <!-- 入院信息 -->
                <encounter>
                    <reference value="#e1" />
                </encounter>
                <!-- 出院诊断章节 -->
                <section>   
                    <#if outpatientDetails??>
                    <!-- 出院情况 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/outpatient-details">
                        <valueString value="${outpatientDetails}"/>
                    </extension>
                    </#if>
                    <#if outModeCode??>
                    <!-- 离院方式 -->
                    <extension  url="http://www.nestvision.com/platform/app/data/v1/code/out-mode-code">
                        <valueCode value="${outModeCode}" />
                    </extension>
                    </#if>
                    <title value="出院诊断章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="11535-2" />
                            <display value="Discharge Diagnosis" />
                        </coding>
                    </code>
                    <entry>
                        <reference value="#con1"/>
                    </entry>
                </section>
                <!-- 健康指导章节 -->
                <section>
                    <#if dietGuide??>
                    <!-- 饮食指导代码CV9900333 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/diet-guide">
                        <valueCode value="${dietGuide}" />
                    </extension>
                    </#if>
                    <#if lifestyleGuidance??>
                    <!-- 生活方式指导 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/lifestyle-guidance">
                        <valueString value="${lifestyleGuidance}"/>
                    </extension>
                    </#if>
                    <#if propagandaContent??>
                    <!-- 宣教内容 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/propaganda-content">
                        <valueString value="${propagandaContent}"/>
                    </extension>
                    </#if>
                    <#if visitTheGuide??>
                    <!-- 复诊指导 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/visit-the-guide">
                        <valueString value="${visitTheGuide}"/>
                    </extension>
                    </#if>
                    <#if medicationGuide??>
                    <!-- 用药指导 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/medication-guide">
                        <valueString value="${medicationGuide}"/>
                    </extension>
                    </#if>
                    <title value="健康指导章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="69730-0" />
                            <display value="Instructions" />
                        </coding>
                    </code>
                </section>
                <!-- 健康评估章节 -->
                <section>
                    <#if ofDaily??>
                    <!-- 自理能力代码CV9900339 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/of-daily">
                        <valueCode value="${ofDaily}" />
                    </extension>
                    </#if>
                    <#if dietaryStatus??>
                    <!-- 饮食情况代码CV9900003 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/dietary-status">
                        <valueCode value="${dietaryStatus}" />
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
            </Composition>
        </resource>
    </entry>
</Bundle>