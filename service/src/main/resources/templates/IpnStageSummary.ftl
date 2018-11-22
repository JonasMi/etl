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
            <!-- 资源：阶段小结 -->
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
                            <#if authorId??>
                            <!-- 姓名 -->
                            <text value="${authorId}" />
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
                <!-- 入院诊断 -->
                <contained>
                    <Condition xmlns="http://hl7.org/fhir">
                        <id value="con2" />
                        <#if inDiagDetails??>
                        <!-- 入院情况 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/text/inpatient-details">
                            <valueString value="${inDiagDetails}"/>
                        </extension>
                        </#if>
                        <#if inRecordCnSymDiagCode??>
                        <!--中医症候代码CV9900357 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/code/cn-sym-diag-code">
                            <valueCode value="${inRecordCnSymDiagCode}" />
                        </extension>
                        </#if>
                        <#if inRecordCnDisDiagCode??>
                        <!--中医病名代码CV9900357 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/code/cn-dis-diag-code">
                            <valueCode value="${inRecordCnDisDiagCode}" />
                        </extension>
                        </#if>
                        <patient />
                        <code>
                            <coding>
                                <!--诊断编码 -->
                                <system value="urn:oid:2.16.156.10011.2.3.3.11" />
                                <#if inRecordDiagCode??>
                                <!--诊断编码 -->
                                <code value="${inRecordDiagCode}" />
                                </#if>
                                <#if inRecordDiagValue??>
                                <display value="${inRecordDiagValue}" />
                                </#if>
                            </coding>
                        </code>
                        <verificationStatus />
                        <#if inRecordDiagDate??>
                        <!-- 诊断日期 -->
                        <onsetDateTime value="${inRecordDiagDate?string("yyyy-MM-dd")}" />
                        </#if>
                    </Condition>
                </contained>
                <!-- 诊断记录 -->
                <contained>
                    <Condition xmlns="http://hl7.org/fhir">
                        <id value="con1" />
                        <#if inDiagRecordCurrentCircumstances??>
                        <!--目前情况 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/text/current-circumstances">
                            <valueString value="${inDiagRecordCurrentCircumstances}" />
                        </extension>
                        </#if>
                        <#if inRecordCnSymDiagCode??>
                        <!--中医症候代码CV9900357 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/code/cn-sym-diag-code">
                            <valueCode value="${inRecordCnSymDiagCode}" />
                        </extension>
                        </#if>
                        <#if inRecordCnDisDiagCode??>
                        <!--中医病名代码CV9900357 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/code/cn-dis-diag-code">
                            <valueCode value="${inRecordCnDisDiagCode}" />
                        </extension>
                        </#if>
                        <patient />
                        <code>
                            <coding>
                                <!--诊断编码 -->
                                <system value="urn:oid:2.16.156.10011.2.3.3.11" />
                                <#if inRecordDiagCode??>
                                <!--诊断编码 -->
                                <code value="${inRecordDiagCode}" />
                                </#if>
                                <#if inRecordDiagValue??>
                                <display value="${inRecordDiagValue}" />
                                </#if>
                            </coding>
                        </code>
                        <verificationStatus />
                        <#if inRecordDiagDate??>
                        <!-- 诊断日期 -->
                        <onsetDateTime value="${inRecordDiagDate?string("yyyy-MM-dd")}" />
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
                <#if documentationofServiceeventEffectivetime??>
                <!-- 小结日期时间 -->
                <extension url="http://www.nestvision.com/platform/app/data/v1/text/documentationOf-serviceEvent-effectiveTime">
                    <valueString value="${documentationofServiceeventEffectivetime?string("yyyy-MM-dd")}T${documentationofServiceeventEffectivetime?string("HH:mm:ss")}" />
                </extension>
                </#if>
                <#if ipnStageSummaryId??>
                <!-- 阶段小结id -->
                <identifier>
                    <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/ipn-stage-summary-id" />
                    <value value="${ipnStageSummaryId}" />
                </identifier>
                </#if>
                <#if date??>
                <!-- 记录日期 -->
                <date value="${date?string("yyyy-MM-dd")}T${date?string("HH:mm:ss")}" />
                </#if>
                <!-- 文档类型：阶段小结 -->
                <type>
                    <coding>
                        <system value="2.16.156.10011.2.4" />
                        <code value="C0043" />
                    </coding>
                    <text value="阶段小结" />
                </type>
                <!-- 文档标题：阶段小结 -->
                <title value="阶段小结" />
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
                <!-- 经治医师 -->
                <attester>
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
                        <valueCode value="30"/>
                    </extension>
                    <mode value="legal" />
                    <#if certifiedPhysicianDate??>
                    <!-- 签名日期 -->
                    <time value="${certifiedPhysicianDate?string("yyyy-MM-dd")}T${certifiedPhysicianDate?string("HH:mm:ss")}"/>
                    </#if>
                    <party>
                        <reference value="#pra2"/>
                    </party>
                </attester>
                <!-- 保管机构 -->
                <custodian>
                    <reference value="#hos1" />
                </custodian>
                <!-- 住院信息 -->
                <encounter>
                    <reference value="#e1" />
                </encounter>
                <!-- 主诉章节 -->
                <section>
                    <#if chief??>
                    <!--主诉 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/chief">
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
                <!-- 入院诊断章节 -->
                <section>
                    <title value="入院诊断章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="46241-6" />
                            <display value="HOSPITAL ADMISSION DX" />
                        </coding>
                    </code>
                    <entry>
                        <reference value="#con2"/>
                    </entry>
                </section>
                <!-- 诊断记录章节 -->
                <section>
                    <title value="诊断记录章节" />
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
                    <#if futureTreatmentOptions??>
                    <!--今后治疗方案 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/future-treatment-options">
                        <valueString value="${futureTreatmentOptions}" />
                    </extension>
                    </#if>
                    <#if therapeuticPrinciples??>
                    <!--治则治法GBT167513 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/therapeutic-principles">
                        <valueCode value="${therapeuticPrinciples}" />
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
                <!-- 用药章节 -->
                <section>
                    <#if cnPrescribe??>
                    <!-- 医嘱内容 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/cn-prescribe">
                        <valueString value="${cnPrescribe}" />
                    </extension>
                    </#if>
                    <#if cnPrescribeDescr??>
                    <!-- 中药煎煮法 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/cn-prescribe-descr">
                        <valueString value="${cnPrescribeDescr}" />
                    </extension>
                    </#if>
                    <#if cnDrugWayCd??>
                    <!-- 中药服用方法代码 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/code/cn-drug-way-cd">
                        <valueCode value="cnDrugWayCd" />
                    </extension>
                    </#if>
                    <title value="用药章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="10160-0" />
                            <display value="HISTORY OFMEDICATION USE" />
                        </coding>
                    </code>
                </section>
                <!-- 住院过程章节 -->
                <section>
                    <#if treatRescueCourse??>
                    <!-- 诊疗过程描述 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/treat-rescue-course">
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