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
            <!-- 资源：抢救记录 -->
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
                            <#if authorName??>
                            <!-- 姓名 -->
                            <text value="${authorName}" />
                            </#if>
                        </name>
                    </Practitioner>
                </contained>
                <!-- 签名医师 -->
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra2" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                            <#if signDoctorId??>
                            <!-- 院内人员ID号 -->
                            <value value="${signDoctorId}" />
                            </#if>
                        </identifier>
                        <name>
                            <#if signDoctorName??>
                            <!-- 姓名 -->
                            <text value="${signDoctorName}" />
                            </#if>
                        </name>
                        <practitionerRole>
                            <specialty>
                                <coding>
                                    <!-- 专业技术职务代码命名空间 -->
                                    <system value="urn:oid:2.16.156.10011.2.3.3.10" />
                                    <#if signDoctorPost??>
                                    <!-- 专业技术职务代码 -->
                                    <code value="${signDoctorPost}" />
                                    </#if>
                                </coding>
                            </specialty>
                        </practitionerRole>
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
                                            <#if visitingDeptId??>
                                            <!-- 机构ID号 -->
                                            <value value="${visitingDeptId}" />
                                            </#if>
                                        </identifier>
                                        <#if visitingDeptName??>
                                        <!-- 医院名称 -->
                                        <name value="${visitingDeptName}" />
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
                <!-- 讨论成员1 -->
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra3" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                            <#if discussionOneId??>
                            <!-- 院内人员ID号 -->
                            <value value="${discussionOneId}" />
                            </#if>
                        </identifier>
                        <name>
                            <#if discussionOneName??>
                            <!-- 姓名 -->
                            <text value="${discussionOneName}" />
                            </#if>
                        </name>
                    </Practitioner>
                </contained>
                <!-- 讨论成员2 -->
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra4" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                            <#if discussionTwoId??>
                            <!-- 院内人员ID号 -->
                            <value value="${discussionTwoId}" />
                            </#if>
                        </identifier>
                        <name>
                            <#if discussionTwoName??>
                            <!-- 姓名 -->
                            <text value="${discussionTwoName}" />
                            </#if>
                        </name>
                    </Practitioner>
                </contained>
                <!-- 讨论成员3 -->
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra5" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                            <#if discussionThreeId??>
                            <!-- 院内人员ID号 -->
                            <value value="${discussionThreeId}" />
                            </#if>
                        </identifier>
                        <name>
                            <#if discussionThreeName??>
                            <!-- 姓名 -->
                            <text value="${discussionThreeName}" />
                            </#if>
                        </name>
                    </Practitioner>
                </contained>
                <!-- 诊断记录 -->
                <contained>
                    <Condition xmlns="http://hl7.org/fhir">
                        <id value="con1" />
                        <#if conditionChanges??>
                        <!--病情变化情况 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/text/condition-changes">
                            <valueString value="${conditionChanges}" />
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
                        <#if diagnosisDate??>
                        <!-- 诊断日期 -->
                        <onsetDateTime value="${diagnosisDate?string("yyyy-MM-dd")}" />
                        </#if>
                    </Condition>
                </contained>
                <!-- 手术操作 -->
                <contained>
                    <Procedure>
                        <id value="pro1"/>
                        <#if intervention??>
                        <!-- 介入物名称 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/text/intervention">
                            <valueString value="${intervention}" />
                        </extension>
                        </#if>
                        <#if operationMethod??>
                        <!-- 操作方法 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/text/operation-method">
                            <valueString value="${operationMethod}" />
                        </extension>
                        </#if>
                        <#if operationTimes??>
                        <!-- 操作次数 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/text/operation-times">
                            <valueString value="${operationTimes}" />
                        </extension>
                        </#if>
                        <#if rescueMeasures??>
                        <!-- 抢救措施 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/text/rescue-measures">
                            <valueString value="${rescueMeasures}" />
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
                                <#if anesthesiaMethodCd??>
                                <!-- 麻醉方法代码 -->
                                <code value="${anesthesiaMethodCd}" />
                                </#if>
                                <#if anesthesiaMethodName??>
                                <!-- 麻醉方法 -->
                                <display value="${anesthesiaMethodName}" />
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
                        <bodySite>
                            <coding>
                                <!-- 手术操作目标部位代码命名空间 -->
                                <system value="urn:oid:2.16.156.10011.2.3.1.262" />
                                <#if partCode??>
                                <!-- 手术操作目标部位代码 -->
                                <code value="${partCode}" />
                                </#if>
                                <#if partName??>
                                <!-- 手术操作目标部位名称 -->
                                <display value="${partName}" />
                                </#if>
                            </coding>
                        </bodySite>
                        <performedPeriod>
                            <#if saveStartDate??>
                            <!-- 抢救开始日期时间 -->
                            <start value="${saveStartDate?string("yyyy-MM-dd")}T${saveStartDate?string("HH:mm:ss")}" />
                            </#if>
                            <#if saveEndDate??>
                            <!-- 抢救结束日期时间 -->
                            <end value="${saveEndDate?string("yyyy-MM-dd")}T${saveEndDate?string("HH:mm:ss")}" />
                            </#if>
                        </performedPeriod>
                    </Procedure>
                </contained>
                <!-- 检查/检验项目 -->
                <contained>
                    <DiagnosticReport xmlns="http://hl7.org/fhir">
                        <id value="dia1"/>
                        <contained>
                            <Observation>
                                <id value="r1" />
                                <#if resultInterpre??>
                                <!-- 结果值的解释 -->
                                <extension url="http://www.nestvision.com/platform/app/data/v1/text/result-interpre">
                                    <valueString value="${resultInterpre}" />
                                </extension>
                                </#if>
                                <#if testResultCd??>
                                <!-- 检验/检查结果代码 -->
                                <extension url="http://www.nestvision.com/platform/app/data/v1/code/test-result-cd">
                                    <valueCode value="${testResultCd}" />
                                </extension>
                                </#if>
                                <#if testTypeCd??>
                                <!-- 结果类型代码 -->
                                <extension url="http://www.nestvision.com/platform/app/data/v1/code/test-type-cd">
                                    <valueCode value="${testTypeCd}" />
                                </extension>
                                </#if>
                                <#if reportDescription??>
                                <!-- 检验/检查结果的客观说明 -->
                                <extension url="http://www.nestvision.com/platform/app/data/v1/text/report-description">
                                    <valueString value="${reportDescription}" />
                                </extension>
                                </#if>
                                <#if reportDescription??>
                                <!-- 检验/检查结果的主观说明 -->
                                <extension url="http://www.nestvision.com/platform/app/data/v1/text/report-impression">
                                    <valueString value="${reportDescription}" />
                                </extension>
                                </#if>
                                <identifier>
                                    <!-- 原系统检验/检查报告观察命名空间 -->
                                    <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/examination-observation-id" />
                                    <#if examinationObservationId??>
                                    <!-- 原系统检验/检查报告观察ID -->
                                    <value value="${examinationObservationId}" />
                                    </#if>
                                </identifier>
                                <!-- 本项目的检验/检查状态:完成观察 -->
                                <status value="final" />
                                <code>
                                    <coding>
                                        <!-- 报告项目代码命名空间 -->
                                        <system value="http://www.nestvision.com/platform/app/data/v1/code/report-id" />
                                        <#if reportItemCode??>
                                        <!-- 报告项目代码(必填) -->
                                        <code value="${reportItemCode}" />
                                        </#if>
                                        <#if reportItemName??>
                                        <display value="${reportItemName}" />
                                        </#if>
                                    </coding>
                                </code>
                                <valueQuantity>
                                    <#if value??>
                                    <!-- 结果值 -->
                                    <value value="${value}" />
                                    </#if>
                                    <#if unit??>
                                    <!-- 结果单位 -->
                                    <unit value="${unit}" />
                                    </#if>
                                </valueQuantity>
                            </Observation>
                        </contained>
                        <status/>
                        <code>
                            <coding>
                                <!-- 报告项目代码命名空间 -->
                                <system value="http://www.nestvision.com/platform/app/data/v1/code/report-id" />
                                <#if reportItemCode??>
                                <!-- 报告项目代码(必填) -->
                                <code value="${reportItemCode}" />
                                </#if>
                                <#if reportItemName??>
                                <display value="${reportItemName}" />
                                </#if>
                            </coding>
                        </code>
                        <subject/>
                        <#if effectivedatetime??>
                        <!-- 标本采集时间 -->
                        <effectiveDateTime value="${effectivedatetime?string("yyyy-MM-dd")}T${effectivedatetime?string("HH:mm:ss")}" />
                        <#else>
                        <effectiveDateTime  />
                        </#if>
                        <#if issued??>
                        <!-- 报告时间 -->
                        <issued value="${issued?string("yyyy-MM-dd")}T${issued?string("HH:mm:ss")}" />
                        <#else>
                        <issued  />
                        </#if>
                        <!-- 执行报告的医生 -->
                        <performer/>
                        <!-- 检验/检查结果明细 -->
                        <result>
                            <reference value="#r1" />
                        </result>
                    </DiagnosticReport>
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
                <#if ipnSaveRecordId??>
                <!-- 抢救记录id -->
                <identifier>
                    <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/ipn-save-record-id" />
                    <value value="${ipnSaveRecordId}" />
                </identifier>
                </#if>
                <#if date??>
                <!-- 记录日期 -->
                <date value="${date?string("yyyy-MM-dd")}T${date?string("HH:mm:ss")}" />
                </#if>
                <!-- 文档类型：抢救记录 -->
                <type>
                    <coding>
                        <system value="2.16.156.10011.2.4" />
                        <code value="C0044" />
                    </coding>
                    <text value="抢救记录" />
                </type>
                <!-- 文档标题：抢救记录 -->
                <title value="抢救记录" />
                <!-- 状态：preliminary初步 final最终amended修订entered-in-error错误 -->
                <status value="final" />
                <!-- 保密等级：U:不受限制的 L:低等级 M:中等 N:常规 R:保密的 V:十分机密的 -->
                <confidentiality value="N" />
                <!-- 居民信息 -->
                <subject>
                    <reference value="#pat1" />
                </subject>
                <!-- 文档创建者-->
                <author>
                    <reference value="#pra1" />
                </author>
                <!-- 医师签名 -->
                <attester>
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
                        <valueCode value="30"/>
                    </extension>
                    <mode value="legal" />
                    <#if signDoctorSignDate??>
                    <!-- 签名日期 -->
                    <time value="${signDoctorSignDate?string("yyyy-MM-dd")}T${signDoctorSignDate?string("HH:mm:ss")}"/>
                    </#if>
                    <party>
                        <reference value="#pra2"/>
                    </party>
                </attester>
                <!-- 讨论成员1 -->
                <attester>
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
                        <valueCode value="19"/>
                    </extension>
                    <mode value="official"/>
                    <party>
                        <reference value="#pra3"/>
                    </party>
                </attester>
                <!-- 讨论成员2 -->
                <attester>
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
                        <valueCode value="19"/>
                    </extension>
                    <mode value="official"/>
                    <party>
                        <reference value="#pra4"/>
                    </party>
                </attester>
                <!-- 讨论成员3 -->
                <attester>
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
                        <valueCode value="19"/>
                    </extension>
                    <mode value="official"/>
                    <party>
                        <reference value="#pra5"/>
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
                    <#if mattersNeedingAttention??>
                    <!-- 注意事项 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/matters-needing-attention">
                        <valueString value="${mattersNeedingAttention}"/>
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
                    <entry>
                        <reference value="#pro1"/>
                    </entry>
                </section>
                <!-- 实验室检查章节 -->
                <section>
                    <title value="实验室检查章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="30954-2" />
                            <display value="STUDIES SUMMARY" />
                        </coding>
                    </code>
                    <entry>
                        <reference value="#dia1"/>
                    </entry>
                </section>
            </Composition>
        </resource>
    </entry>
</Bundle>