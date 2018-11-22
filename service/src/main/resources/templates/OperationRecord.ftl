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
            <!-- 资源： 一般手术记录 -->
            <Composition xmlns="http://hl7.org/fhir">
                <contained>
                    <Organization xmlns="http://hl7.org/fhir">
                        <id value="hos1" />
                        <#if upHospital??>
                        <identifier>
                            <!-- 原系统机构ID号命名空间 -->
                            <system
                                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/hospital-id" />
                            <!-- 原系统机构ID号 -->
                            <value value="${upHospital}" />
                        </identifier>
                        </#if>
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
                        <telecom>
                            <!-- 联系方式代码 -->
                            <system value="phone" />
                            <#if telecom??>
                            <!-- 现使用电话号码 -->
                            <value value="${telecom}" />
                            </#if>
                            <!-- 使用方式:现在 -->
                            <use value="temp" />
                        </telecom>
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
                            <system
                                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
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
                    <!-- 术前诊断 -->
                    <Condition xmlns="http://hl7.org/fhir">
                        <id value="c1" />
                        <patient />
                        <code>
                            <coding>
                                <!--术前诊断编码 -->
                                <system value="urn:oid:2.16.156.10011.2.3.3.11" />
                                <#if preoperativeDiagnosis??>
                                <!--术前诊断编码 -->
                                <code value="${preoperativeDiagnosis}" />
                                </#if>
                                <#if preoperativeDiagnosis??>
                                <display value="${preoperativeDiagnosis}" />
                                </#if>
                            </coding>
                        </code>
                        <verificationStatus />
                        <#if preoperativeDiagnosisDate??>
                        <!-- 诊断日期 -->
                        <onsetDateTime value="${preoperativeDiagnosisDate?string("yyyy-MM-dd")}" />
                        </#if>
                    </Condition>
                </contained>
                <contained>
                    <!-- 术后诊断 -->
                    <Condition xmlns="http://hl7.org/fhir">
                        <id value="c2" />
                        <patient />
                        <code>
                            <coding>
                                <!--术后诊断编码 -->
                                <system value="urn:oid:2.16.156.10011.2.3.3.11" />
                                <#if afterOperationDiagnosis??>
                                <!--术后诊断编码 -->
                                <code value="${afterOperationDiagnosis}" />
                                </#if>
                                <#if afterOperationDiagnosisName??>
                                <display value="${afterOperationDiagnosisName}" />
                                </#if>
                            </coding>
                        </code>
                        <verificationStatus />
                        <#if afterOperationDiagnosisDate??>
                        <!-- 诊断日期 -->
                        <onsetDateTime value="${afterOperationDiagnosisDate?string("yyyy-MM-dd")}" />
                        </#if>
                    </Condition>
                </contained>
                <contained>
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
                                    <value value="10010023" />
                                </identifier>
                                </#if>
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
                                        <#if upHospital??>
                                        <identifier>
                                            <!-- 机构ID号命名空间 -->
                                            <system
                                                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/hospital-id" />
                                            <!-- 机构ID号 -->
                                            <value value="130058273" />
                                        </identifier>
                                        </#if>
                                        <#if upHospitalName??>
                                        <!-- 医院名称 -->
                                        <name value="就诊机构" />
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
                        <!-- 入院科室 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/identifier/in-dpid">
                            <valueReference>
                                <reference value="#e1o2" />
                            </valueReference>
                        </extension>
                        <#if registrationId??>
                        <identifier>
                            <#if visitMark =='2'>
                            <system
                                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/inpatient-registration-id" />
                            <#else>
                            <system
                                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/outpatient-registration-id" />
                            </#if>
                            <!-- 原系统住院流水id号 -->
                            <value value="${registrationId}" />
                        </identifier>
                        </#if>
                        <!-- 状态 -->
                        <status value="in-progress" />
                        <#if visitMark =='2'>
                        <!-- 类型：住院 -->
                        <class value="inpatient" />
                        <#else>
                        <!-- 类型：门诊 -->
                        <class value="outpatient" />
                        </#if>
                        <#if visitMark =='2'>
                        <period>
                            <#if start??>
                            <!-- 入院时间 -->
                            <start value="${start?string("yyyy-MM-dd")}T${start?string("HH:mm:ss")}" />
                            </#if>
                        </period>
                        <#else>
                        <period>
                            <#if visitingTime??>
                            <!-- 就诊时间 -->
                            <start value="${visitingTime?string("yyyy-MM-dd")}T${visitingTime?string("HH:mm:ss")}" />
                            </#if>
                        </period>
                        </#if>
                        <#if visitMark =='2'>
                        <hospitalization>
                            <preAdmissionIdentifier>
                                <!-- 住院号命名空间 -->
                                <system
                                    value="http://www.nestvision.com/platform/app/data/v1/text/inh-id" />
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
                <contained>
                    <!-- 手术单示例 -->
                    <Procedure xmlns="http://hl7.org/fhir">
                        <id value="p1" />
                        <contained>
                            <Practitioner xmlns="http://hl7.org/fhir">
                                <id value="p1pra1" />
                                <#if operative??>
                                <identifier>
                                    <!-- 院内人员ID号命名空间 -->
                                    <system
                                        value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                                    <!-- 院内人员ID号 -->
                                    <value value="${operative}" />
                                </identifier>
                                </#if>
                                <#if operativeName??>
                                <name>
                                    <!-- 姓名 -->
                                    <text value="${operativeName}" />
                                </name>
                                </#if>
                            </Practitioner>
                        </contained>
                        <contained>
                            <Practitioner xmlns="http://hl7.org/fhir">
                                <id value="p1pra2" />
                                <#if firstAssistant??>
                                <identifier>
                                    <!-- 院内人员ID号命名空间 -->
                                    <system
                                        value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                                    <!-- 院内人员ID号 -->
                                    <value value="${firstAssistant}" />
                                </identifier>
                                </#if>
                                <#if firstAssistantName??>
                                <name>
                                    <!-- 姓名 -->
                                    <text value="${firstAssistantName}" />
                                </name>
                                </#if>
                            </Practitioner>
                        </contained>
                        <contained>
                            <Practitioner xmlns="http://hl7.org/fhir">
                                <id value="p1pra3" />
                                <#if secondAssistant??>
                                <identifier>
                                    <!-- 院内人员ID号命名空间 -->
                                    <system
                                        value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                                    <!-- 院内人员ID号 -->
                                    <value value="${secondAssistant}" />
                                </identifier>
                                </#if>
                                <#if secondAssistantName??>
                                <name>
                                    <!-- 姓名 -->
                                    <text value="${secondAssistantName}" />
                                </name>
                                </#if>
                            </Practitioner>
                        </contained>
                        <contained>
                            <Practitioner xmlns="http://hl7.org/fhir">
                                <id value="p1pra4" />
                                <#if equipmentManager??>
                                <identifier>
                                    <!-- 院内人员ID号命名空间 -->
                                    <system
                                        value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                                    <!-- 院内人员ID号 -->
                                    <value value="${equipmentManager}" />
                                </identifier>
                                </#if>
                                <#if equipmentManagerName??>
                                <name>
                                    <!-- 姓名 -->
                                    <text value="${equipmentManagerName}" />
                                </name>
                                </#if>
                            </Practitioner>
                        </contained>
                        <contained>
                            <Practitioner xmlns="http://hl7.org/fhir">
                                <id value="p1pra5" />
                                <#if patrolNurse??>
                                <identifier>
                                    <!-- 院内人员ID号命名空间 -->
                                    <system
                                        value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                                    <!-- 院内人员ID号 -->
                                    <value value="${patrolNurse}" />
                                </identifier>
                                </#if>
                                <#if patrolNurseName??>
                                <name>
                                    <!-- 姓名 -->
                                    <text value="${patrolNurseName}" />
                                </name>
                                </#if>
                            </Practitioner>
                        </contained>
                        <contained>
                            <Practitioner xmlns="http://hl7.org/fhir">
                                <id value="p1pra4" />
                                <#if anaesthetic??>
                                <identifier>
                                    <!-- 院内人员ID号命名空间 -->
                                    <system
                                        value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                                    <!-- 院内人员ID号 -->
                                    <value value="${anaesthetic}" />
                                </identifier>
                                </#if>
                                <#if anaestheticName??>
                                <name>
                                    <!-- 姓名 -->
                                    <text value="${anaestheticName}" />
                                </name>
                                </#if>
                            </Practitioner>
                        </contained>
                        <#if opRoom??>
                        <!-- 手术间编号 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/op-room">
                            <valueString value="${opRoom}" />
                        </extension>
                        </#if>
                        <#if opLevelCd??>
                        <!-- 手术级别代码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/op-level-cd">
                            <valueCode value="${opLevelCd}" />
                        </extension>
                        </#if>
                        <#if transfusionItemAmount??>
                        <!-- 输血量（mL） -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/transfusion-item-amount">
                            <valueDecimal value="${transfusionItemAmount}" />
                        </extension>
                        </#if>
                        <#if transfuseReactionFlag??>
                        <!-- 输血反应标志 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/boolean/transfuse-reaction-flag">
                            <valueBoolean value="${transfuseReactionFlag?string("true","false")}" />
                        </extension>
                        </#if>
                        <#if opPreDrug??>
                        <!-- 术前用药 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/op-pre-drug">
                            <valueString value="${opPreDrug}" />
                        </extension>
                        </#if>
                        <#if opDrug??>
                        <!-- 术中用药 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/op-drug">
                            <valueString value="${opDrug}" />
                        </extension>
                        </#if>
                        <#if lossbloodAmount??>
                        <!-- 出血量（mL） -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/lossblood-amount">
                            <valueDecimal value="${lossbloodAmount}" />
                        </extension>
                        </#if>
                        <#if infusionAmount??>
                        <!-- 输液量 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/infusion-amount">
                            <valueDecimal value="${infusionAmount}" />
                        </extension>
                        </#if>
                        <#if operationCourse??>
                        <!-- 手术经过 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/operation-course">
                            <valueString value="${operationCourse}" />
                        </extension>
                        </#if>
                        <#if intervention??>
                        <!-- 介入物名称 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/intervention">
                            <valueString value="${intervention}" />
                        </extension>
                        </#if>
                        <#if skinThimerosal??>
                        <!-- 皮肤消毒描述 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/skin-thimerosal">
                            <valueString value="${skinThimerosal}" />
                        </extension>
                        </#if>
                        <#if woundDescr??>
                        <!-- 手术切口描述 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/wound-descr">
                            <valueString value="${woundDescr}" />
                        </extension>
                        </#if>
                        <#if ifDrain??>
                        <!-- 引流标志代码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/boolean/if-drain">
                            <valueBoolean value="${ifDrain?string("true","false")}" />
                        </extension>
                        </#if>
                        <#if drainMaterialAmount??>
                        <!-- 引流材料数量 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/drain-material-amount">
                            <valueDecimal value="${drainMaterialAmount}" />
                        </extension>
                        </#if>
                        <#if drainMaterialName??>
                        <!-- 引流材料名称 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/drain-material-name">
                            <valueString value="${drainMaterialName}" />
                        </extension>
                        </#if>
                        <#if placedPart??>
                        <!-- 放置部位 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/placed-part">
                            <valueString value="${placedPart}" />
                        </extension>
                        </#if>
                        <#if operationId??>
                        <identifier>
                            <!-- 原系统手术单id命名空间 -->
                            <system
                                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/operation-id" />
                            <!-- 原系统手术单id号 -->
                            <value value="${operationId}" />
                        </identifier>
                        </#if>
                        <subject />
                        <status />
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
                        <performer>
                            <!-- 手术者id -->
                            <actor>
                                <reference value="#p1pra1" />
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
                        <performer>
                            <!-- I助id -->
                            <actor>
                                <reference value="#p1pra2" />
                            </actor>
                            <role>
                                <coding>
                                    <!-- 角色代码命名空间 -->
                                    <system value="http://hl7.org/fhir/ValueSet/performer-role" />
                                    <!-- 角色代码：手术助理 -->
                                    <code value="405685006" />
                                </coding>
                                <!-- 角色名称 -->
                                <text value="I助" />
                            </role>
                        </performer>
                        <performer>
                            <!-- II助id -->
                            <actor>
                                <reference value="#p1pra3" />
                            </actor>
                            <role>
                                <coding>
                                    <!-- 角色代码命名空间 -->
                                    <system value="http://hl7.org/fhir/ValueSet/performer-role" />
                                    <!-- 角色代码：手术助理 -->
                                    <code value="405685006" />
                                </coding>
                                <!-- 角色名称 -->
                                <text value="II助" />
                            </role>
                        </performer>
                        <performer>
                            <!-- 器械护士id -->
                            <actor>
                                <reference value="#p1pra4" />
                            </actor>
                            <role>
                                <coding>
                                    <!-- 角色代码命名空间 -->
                                    <system value="http://hl7.org/fhir/ValueSet/performer-role" />
                                    <!-- 角色代码：器械护士 -->
                                    <code value="310194009" />
                                </coding>
                                <!-- 角色名称 -->
                                <text value="器械护士" />
                            </role>
                        </performer>
                        <performer>
                            <!-- 巡台护士id -->
                            <actor>
                                <reference value="#p1pra5" />
                            </actor>
                            <role>
                                <coding>
                                    <!-- 角色代码命名空间 -->
                                    <system value="http://hl7.org/fhir/ValueSet/performer-role" />
                                    <!-- 角色代码：巡台护士 -->
                                    <code value="413854007" />
                                </coding>
                                <!-- 角色名称 -->
                                <text value="巡台护士" />
                            </role>
                        </performer>
                        <performer>
                            <!-- 麻醉者id -->
                            <actor>
                                <reference value="#p1pra4" />
                            </actor>
                            <role>
                                <coding>
                                    <!-- 角色代码命名空间 -->
                                    <system value="http://hl7.org/fhir/ValueSet/performer-role" />
                                    <!-- 角色代码：麻醉者 -->
                                    <code value="158970007" />
                                </coding>
                                <!-- 角色名称 -->
                                <text value="麻醉者" />
                            </role>
                        </performer>
                        <performedPeriod>
                            <!-- 手术开始时间 -->
                            <start value="2015-01-02T01:02:03" />
                            <!-- 手术结束时间 -->
                            <end value="2015-01-02T06:02:03" />
                        </performedPeriod>
                    </Procedure>
                </contained>
                <#if operationRecordId??>
                <!-- 原系统一般手术记录id -->
                <identifier>
                    <system
                        value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/operation-record-id" />
                    <value value="${operationRecordId}" />
                </identifier>
                </#if>
                <#if date??>
                <!-- 记录日期 -->
                <date value="${date?string("yyyy-MM-dd")}T${date?string("HH:mm:ss")}" />
                </#if>
                <!-- 文档类型：一般手术记录 -->
                <type>
                    <coding>
                        <system value="2.16.156.10011.2.4" />
                        <code value="C0009" />
                    </coding>
                    <text value="一般手术记录" />
                </type>
                <!-- 文档标题：一般手术记录 -->
                <title value="一般手术记录" />
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
                <!-- 既往史章节 -->
                <section>
                    <#if inpatOpMark??>
                    <!--手术史标志 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/code/inpat-op-mark">
                        <valueCode value="${inpatOpMark}" />
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
                <!-- 术前诊断章节 -->
                <section>
                    <title value="术前诊断章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="10219-4" />
                            <display value="Surgical operation note preoperative Dx" />
                        </coding>
                    </code>
                    <!-- 术前诊断 -->
                    <entry>
                        <reference value="#c1" />
                    </entry>
                </section>
                <!-- 手术章节 -->
                <section>
                    <title value="手术章节" />
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
                <!-- 失血章节 -->
                <section>
                    <title value="失血章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="55103-6" />
                            <display value="Surgical operation note estimated blood loss" />
                        </coding>
                    </code>
                    <!-- 手术 -->
                    <entry>
                        <reference value="#p1" />
                    </entry>
                </section>
                <!-- 输血章节  -->
                <section>
                    <title value="输血章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="56836-0" />
                            <display value="History of blood transfusion" />
                        </coding>
                    </code>
                    <!-- 手术 -->
                    <entry>
                        <reference value="#p1" />
                    </entry>
                </section>
                <!-- 麻醉章节 -->
                <section>
                    <title value="麻醉章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="10213-7" />
                            <display value="Surgical operation note anesthesia" />
                        </coding>
                    </code>
                    <!-- 手术 -->
                    <entry>
                        <reference value="#p1" />
                    </entry>
                </section>
                <!-- 用药章节 -->
                <section>
                    <title value="用药章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="10160-0" />
                            <display value="History of medication use" />
                        </coding>
                    </code>
                    <!-- 手术 -->
                    <entry>
                        <reference value="#p1" />
                    </entry>
                </section>
                <!-- 输液章节 -->
                <section>
                    <title value="输液章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="10216-0" />
                            <display value="Surgical operation note fluids" />
                        </coding>
                    </code>
                    <!-- 手术 -->
                    <entry>
                        <reference value="#p1" />
                    </entry>
                </section>
                <!-- 术后诊断章节 -->
                <section>
                    <title value="术后诊断章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="10218-6" />
                            <display value="Surgical operation note postoperative Dx" />
                        </coding>
                    </code>
                    <!-- 术后诊断 -->
                    <entry>
                        <reference value="#c2" />
                    </entry>
                </section>
                <!-- 手术过程描述章节 -->
                <section>
                    <title value="手术过程描述章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="8724-7" />
                            <display value="Surgical operation note description" />
                        </coding>
                    </code>
                    <!-- 手术 -->
                    <entry>
                        <reference value="#p1" />
                    </entry>
                </section>
                <!-- 引流章节 -->
                <section>
                    <title value="引流章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="11537-8" />
                            <display value="Surgical drains" />
                        </coding>
                    </code>
                    <!-- 手术 -->
                    <entry>
                        <reference value="#p1" />
                    </entry>
                </section>
            </Composition>
        </resource>
    </entry>
</Bundle>