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
            <!-- 资源：死亡病例讨论记录 -->
            <Composition xmlns="http://hl7.org/fhir">
                <!-- 文档管理机构 -->
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
                        <#if authorName??>
                        <name>
                            <!-- 姓名 -->
                            <text value="${authorName}" />
                        </name>
                        </#if>
                    </Practitioner>
                </contained>
                <!-- 住院医师 -->
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra2" />
                        <#if residentDoctorSignDate??>
                        <!-- 签名日期 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/datetime/signature-date">
                            <valueDateTime value="${residentDoctorSignDate?string("yyyy-MM-dd")}"/>
                        </extension>
                        </#if>
                        <#if residentDoctorId??>
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                            <!-- 院内人员ID号 -->
                            <value value="${residentDoctorId}" />
                        </identifier>
                        </#if>
                        <#if residentDoctorName??>
                        <name>
                            <!-- 姓名 -->
                            <text value="${residentDoctorName}" />
                        </name>
                        </#if>
                        <practitionerRole>
                            <specialty>
                                <coding>
                                    <!-- 专业技术职务代码命名空间 -->
                                    <system value="urn:oid:2.16.156.10011.2.3.3.10" />
                                    <#if residentDoctorPostCode??>
                                    <!-- 专业技术职务代码 -->
                                    <code value="${residentDoctorPostCode}" />
                                    </#if>
                                </coding>
                            </specialty>
                        </practitionerRole>
                    </Practitioner>
                </contained>
                <!-- 主治医师 -->
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra3" />
                        <#if attendingDoctorSignDate??>
                        <!-- 签名日期 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/datetime/signature-date">
                            <valueDateTime value="${attendingDoctorSignDate?string("yyyy-MM-dd")}"/>
                        </extension>
                        </#if>
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                            <#if attendingDoctorId??>
                            <!-- 院内人员ID号 -->
                            <value value="${attendingDoctorId}" />
                            </#if>
                        </identifier>
                        <#if attendingDoctorName??>
                        <name>
                            <!-- 姓名 -->
                            <text value="${attendingDoctorName}" />
                        </name>
                        </#if>
                        <practitionerRole>
                            <specialty>
                                <coding>
                                    <!-- 专业技术职务代码命名空间 -->
                                    <system value="urn:oid:2.16.156.10011.2.3.3.10" />
                                    <#if attendingDoctorPostCode??>
                                    <!-- 专业技术职务代码 -->
                                    <code value="${attendingDoctorPostCode}" />
                                    </#if>
                                </coding>
                            </specialty>
                        </practitionerRole>
                    </Practitioner>
                </contained>
                <!-- 主任医师 -->
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra4" />
                        <#if directorDoctorSignDate??>
                        <!-- 签名日期 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/datetime/signature-date">
                            <valueDateTime value="${directorDoctorSignDate?string("yyyy-MM-dd")}"/>
                        </extension>
                        </#if>
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                            <#if directorDoctorId??>
                            <!-- 院内人员ID号 -->
                            <value value="${directorDoctorId}" />
                            </#if>
                        </identifier>
                        <#if directorDoctorName??>
                        <name>
                            <!-- 姓名 -->
                            <text value="${directorDoctorName}" />
                        </name>
                        </#if>
                        <practitionerRole>
                            <specialty>
                                <coding>
                                    <!-- 专业技术职务代码命名空间 -->
                                    <system value="urn:oid:2.16.156.10011.2.3.3.10" />
                                    <#if directorDoctorPostCode??>
                                    <!-- 专业技术职务代码 -->
                                    <code value="${directorDoctorPostCode}" />
                                    </#if>
                                </coding>
                            </specialty>
                        </practitionerRole>
                    </Practitioner>
                </contained>
                <!-- 讨论主持人 -->
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra5" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                            <#if discussionModeratorId??>
                            <!-- 院内人员ID号 -->
                            <value value="${discussionModeratorId}" />
                            </#if>
                        </identifier>
                        <#if discussionModeratorName??>
                        <name>
                            <!-- 姓名 -->
                            <text value="${discussionModeratorName}" />
                        </name>
                        </#if>
                    </Practitioner>
                </contained>
                <#if discussionOneId??>
                <!-- 讨论成员1 -->
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra6" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                            <#if discussionOneId??>
                            <!-- 院内人员ID号 -->
                            <value value="${discussionOneId}" />
                            </#if>
                        </identifier>
                        <#if discussionOneName??>
                        <name>
                            <!-- 姓名 -->
                            <text value="${discussionOneName}" />
                        </name>
                        </#if>
                    </Practitioner>
                </contained>
                </#if>
                <#if discussionTwoId??>
                <!-- 讨论成员2 -->
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra7" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                            <#if discussionTwoId??>
                            <!-- 院内人员ID号 -->
                            <value value="${discussionTwoId}" />
                            </#if>
                        </identifier>
                        <#if discussionTwoName??>
                        <name>
                            <!-- 姓名 -->
                            <text value="${discussionTwoName}" />
                        </name>
                        </#if>
                    </Practitioner>
                </contained>
                </#if>
                <#if discussionThreeId??>
                <!-- 讨论成员3 -->
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra7" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                            <#if discussionThreeId??>
                            <!-- 院内人员ID号 -->
                            <value value="${discussionThreeId}" />
                            </#if>
                        </identifier>
                        <#if discussionThreeName??>
                        <name>
                            <!-- 姓名 -->
                            <text value="${discussionThreeName}" />
                        </name>
                        </#if>
                    </Practitioner>
                </contained>
                </#if>
                <!-- 住院信息 -->
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
                <#if discussionDate??>
                <!-- 讨论日期时间 -->
                <extension url="http://www.nestvision.com/platform/app/data/v1/datetime/discussion-date">
                    <valueDateTime value="${discussionDate?string("yyyy-MM-dd")}T${discussionDate?string("HH:mm:ss")}"/>
                </extension>
                </#if>
                <#if discussionSites??>
                <!-- 讨论地点 -->
                <extension url="http://www.nestvision.com/platform/app/data/v1/text/discussion-sites">
                    <valueString value="${discussionSites}"/>
                </extension>
                </#if>
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
                <#if hcrDeathCaseDiscussionId??>
                <!-- 死亡病例讨论记录id -->
                <identifier>
                    <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/hcr-death-case-discussion" />
                    <value value="${hcrDeathCaseDiscussionId}" />
                </identifier>
                </#if>
                <#if date??>
                <!-- 记录日期 -->
                <date value="${date?string("yyyy-MM-dd")}T${date?string("HH:mm:ss")}" />
                </#if>
                <!-- 文档类型：死亡病例讨论记录 -->
                <type>
                    <coding>
                        <system value="2.16.156.10011.2.4" />
                        <code value="C0051" />
                    </coding>
                    <text value="死亡病例讨论记录" />
                </type>
                <!-- 文档标题：死亡病例讨论记录 -->
                <title value="死亡病例讨论记录" />
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
                <!-- 住院医师 -->
                <attester>
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
                        <valueCode value="04"/>
                    </extension>
                    <mode value="legal" />
                    <#if residentDoctorSignDate??>
                    <!-- 签名日期 -->
                    <time value="${residentDoctorSignDate?string("yyyy-MM-dd")}T${residentDoctorSignDate?string("HH:mm:ss")}"/>
                    </#if>
                    <party>
                        <reference value="#pra2"/>
                    </party>
                </attester>
                <!-- 主治医师 -->
                <attester>
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
                        <valueCode value="03"/>
                    </extension>
                    <mode value="legal" />
                    <#if attendingDoctorSignDate??>
                    <!-- 签名日期 -->
                    <time value="${attendingDoctorSignDate?string("yyyy-MM-dd")}T${attendingDoctorSignDate?string("HH:mm:ss")}"/>
                    </#if>
                    <party>
                        <reference value="#pra3"/>
                    </party>
                </attester>
                <!-- 主任医师 -->
                <attester>
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
                        <valueCode value="02"/>
                    </extension>
                    <mode value="legal" />
                    <#if directorDoctorSignDate??>
                    <!-- 签名日期 -->
                    <time value="${directorDoctorSignDate?string("yyyy-MM-dd")}T${directorDoctorSignDate?string("HH:mm:ss")}"/>
                    </#if>
                    <party>
                        <reference value="#pra4"/>
                    </party>
                </attester>
                <!-- 讨论主持人 -->
                <attester>
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
                        <valueCode value="18"/>
                    </extension>
                    <mode value="legal" />
                    <#if discussionModeratorSignDate??>
                    <!-- 签名日期 -->
                    <time value="${discussionModeratorSignDate?string("yyyy-MM-dd")}T${discussionModeratorSignDate?string("HH:mm:ss")}"/>
                    </#if>
                    <party>
                        <reference value="#pra5"/>
                    </party>
                </attester>
                <!-- 讨论成员1 -->
                <attester>
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
                        <valueCode value="19"/>
                    </extension>
                    <mode value="legal" />
                    <#if discussionOneSignDate??>
                    <!-- 签名日期 -->
                    <time value="${discussionOneSignDate?string("yyyy-MM-dd")}T${discussionOneSignDate?string("HH:mm:ss")}"/>
                    </#if>
                    <party>
                        <reference value="#pra6"/>
                    </party>
                </attester>
                <!-- 讨论成员2 -->
                <attester>
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
                        <valueCode value="19"/>
                    </extension>
                    <mode value="legal" />
                    <#if discussionTwoSignDate??>
                    <!-- 签名日期 -->
                    <time value="${discussionTwoSignDate?string("yyyy-MM-dd")}T${discussionTwoSignDate?string("HH:mm:ss")}"/>
                    </#if>
                    <party>
                        <reference value="#pra7"/>
                    </party>
                </attester>
                <!-- 讨论成员3 -->
                <attester>
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
                        <valueCode value="19"/>
                    </extension>
                    <mode value="legal" />
                    <#if discussionThreeSignDate??>
                    <!-- 签名日期 -->
                    <time value="${discussionThreeSignDate?string("yyyy-MM-dd")}T${discussionThreeSignDate?string("HH:mm:ss")}"/>
                    </#if>
                    <party>
                        <reference value="#pra7"/>
                    </party>
                </attester>
                <!-- 文档管理机构信息 -->
                <custodian>
                    <reference value="#hos1" />
                </custodian>
                <!-- 门诊或住院信息 -->
                <encounter>
                    <reference value="#e1" />
                </encounter>
                <!-- 死亡原因章节 -->
                <section>
                    <#if deathCauseCode??>
                    <!-- 死亡原因代码 ICD-10-->
                    <extension url="urn:oid:2.16.156.10011.2.3.3.11">
                        <valueCode value="${deathCauseCode}" />
                    </extension>
                    </#if>
                    <#if deathCauseName??>
                    <!-- 直接死亡原因名称-->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/death-reason-name">
                        <valueString value="${deathCauseName}" />
                    </extension>
                    </#if>
                    <title value="死亡原因章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="99999-7" />
                            <display value="Cause of death" />
                        </coding>
                    </code>
                </section>
                <!-- 诊断章节 -->
                <section>
                    <#if deathDiagCode??>
                    <!--死亡诊断编码 -->
                    <extension url="urn:oid:2.16.156.10011.2.3.3.11">
                        <valueCode value="${deathDiagCode}" />
                    </extension>
                    </#if>
                    <#if deathDiagName??>
                    <!-- 死亡诊断名称-->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/death-diagnosis-name">
                        <valueString value="${deathDiagName}" />
                    </extension>
                    </#if>
                    <title value="诊断章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="11535-2" />
                            <display value="HOSPITAL DISCHARGE DX" />
                        </coding>
                    </code>
                </section>
                <!-- 讨论内容章节 -->
                <section>
                    <#if discussionContent??>
                    <!-- 讨论内容-->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/discussion-content">
                        <valueString value="${discussionContent}" />
                    </extension>
                    </#if>
                    <title value="讨论内容章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="99999-8" />
                            <display value="Discussion content" />
                        </coding>
                    </code>
                </section>
                <!-- 讨论总结章节 -->
                <section>
                    <#if discussionSummarize??>
                    <!-- 讨论总结-->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/discussion-summary">
                        <valueString value="${discussionSummarize}" />
                    </extension>
                    </#if>
                    <title value="讨论总结章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="99999-9" />
                            <display value="Discussion summary" />
                        </coding>
                    </code>
                </section>
            </Composition>
        </resource>
    </entry>
</Bundle>