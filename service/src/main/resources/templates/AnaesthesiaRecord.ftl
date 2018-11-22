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
            <!-- 资源： 麻醉记录 -->
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
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra2" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system
                                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                            <#if anaesthetic??>
                            <!-- 院内人员ID号 -->
                            <value value="1" />
                            </#if>
                        </identifier>
                        <#if anaestheticName??>
                        <name>
                            <!-- 姓名 -->
                            <text value="${anaestheticName}" />
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
                                <#if preoperativeDiagnosisName??>
                                <display value="${preoperativeDiagnosisName}" />
                                </#if>
                            </coding>
                        </code>
                        <category>
                            <coding>
                                <system
                                    value="http://www.nestvision.com/platform/app/data/v1/code/condition-types" />
                                <code value="4" />
                                <display value="术前诊断" />
                            </coding>
                        </category>
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
                        <category>
                            <coding>
                                <system
                                    value="http://www.nestvision.com/platform/app/data/v1/code/condition-types" />
                                <code value="5" />
                                <display value="术后诊断" />
                            </coding>
                        </category>
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
                                <identifier>
                                    <!--原系统床位ID号命名空间 -->
                                    <system
                                        value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/bed-id" />
                                    <#if bedNum??>
                                    <!-- 原系统床位ID号 -->
                                    <value value="${bedNum}" />
                                    </#if>
                                </identifier>
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
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/identifier/in-dpid">
                            <valueReference>
                                <reference value="#e1o2" />
                            </valueReference>
                        </extension>
                        <#if visitingType??>
                        <!-- 就诊类型 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/visiting-type">
                            <valueCode value="${visitingType}" />
                        </extension>
                        </#if>
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
                            <!-- 入院时间 -->
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
                    <!-- 处方 -->
                    <MedicationOrder xmlns="http://hl7.org/fhir">
                        <id value="m1" />
                        <contained>
                            <!-- 药品请求样例 -->
                            <Medication xmlns="http://hl7.org/fhir">
                                <id value="m1m1" />
                                <#if aliasName??>
                                <!-- 商品名 -->
                                <extension
                                    url="http://www.nestvision.com/platform/app/data/v1/text/alias-name">
                                    <valueString value="${aliasName}" />
                                </extension>
                                </#if>
                                <code>
                                    <coding>
                                        <!-- 院内药物编码 -->
                                        <system
                                            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/code/medication" />
                                        <#if medicationCd??>
                                        <code value="${medicationCd}" />
                                        </#if>
                                        <#if medicationName??>
                                        <display value="${medicationName}" />
                                        </#if>
                                    </coding>
                                </code>
                            </Medication>
                        </contained>
                        <#if drugsUsage??>
                        <!-- 药物用法 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/drugs-usage">
                            <valueString value="${drugsUsage}" />
                        </extension>
                        </#if>
                        <#if freqCode??>
                        <!-- 频率代码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/freq-code">
                            <valueCode value="${freqCode}" />
                        </extension>
                        </#if>
                        <#if drugTotalDose??>
                        <!-- 药物使用总剂量 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/drug-total-dose">
                            <valueDecimal value="${drugTotalDose}" />
                        </extension>
                        </#if>
                        <#if drugTotalDoseUtil??>
                        <!-- 药物使用总剂量单位 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/drug-total-dose-util">
                            <valueString value="${drugTotalDoseUtil}" />
                        </extension>
                        </#if>
                        <!-- 药品信息 -->
                        <medicationReference>
                            <reference
                                value="#m1m1" />
                        </medicationReference>
                        <dosageInstruction>
                            <route>
                                <coding>
                                    <!-- 用药途径代码命名空间 -->
                                    <system
                                        value="http://www.nestvision.com/platform/app/data/v1/code/dosage-code" />
                                    <#if dosageCode??>
                                    <!-- 用药途径代码：口服 -->
                                    <code value="${dosageCode}" />
                                    </#if>
                                </coding>
                            </route>
                            <doseQuantity>
                                <#if onceValue??>
                                <!-- 用药次剂量 -->
                                <value value="${onceValue}" />
                                </#if>
                                <#if onceUnit??>
                                <!-- 用药剂量单位 -->
                                <unit value="${onceUnit}" />
                                </#if>
                            </doseQuantity>
                        </dosageInstruction>
                    </MedicationOrder>
                </contained>
                <contained>
                    <!-- 麻醉示例 -->
                    <Procedure xmlns="http://hl7.org/fhir">
                        <id value="p1"/>
                        <contained>
                            <Practitioner xmlns="http://hl7.org/fhir">
                                <id value="p1pra1" />
                                <identifier>
                                    <!-- 院内人员ID号命名空间 -->
                                    <system
                                        value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                                    <#if operative??>
                                    <!-- 院内人员ID号 -->
                                    <value value="${operative}" />
                                    </#if>
                                </identifier>
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
                                <id value="p1pra4" />
                                <identifier>
                                    <!-- 院内人员ID号命名空间 -->
                                    <system
                                        value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                                    <#if anaesthetic??>
                                    <!-- 院内人员ID号 -->
                                    <value value="${anaesthetic}" />
                                    </#if>
                                </identifier>
                                <#if anaestheticName??>
                                <name>
                                    <!-- 姓名 -->
                                    <text value="${anaestheticName}" />
                                </name>
                                </#if>
                            </Practitioner>
                        </contained>
                        <#if bloodTransfDtime??>
                        <!-- 输血日期时间 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/datetime/blood-transf-dtime">
                            <valueDateTime value="${bloodTransfDtime?string("yyyy-MM-dd")}T${bloodTransfDtime?string("HH:mm:ss")}" />
                        </extension>
                        </#if>
                        <#if transfusionItemAmount??>
                        <!-- 输血量 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/transfusion-item-amount">
                            <valueDecimal value="${transfusionItemAmount}" />
                        </extension>
                        </#if>
                        <#if transfusionItemUnit??>
                        <!-- 输血量计量单位 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/transfusion-item-unit">
                            <valueString value="${transfusionItemUnit}" />
                        </extension>
                        </#if>
                        <#if transfuseReactionFlag??>
                        <!-- 输血反应标志 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/boolean/transfuse-reaction-flag">
                            <valueBoolean value="${transfuseReactionFlag?string("true","false")}" />
                        </extension>
                        </#if>
                        <#if asaGradingStandardCode??>
                        <!-- ASA分级标准代码 CV9900329 -->
                        <extension url="urn:oid:2.16.156.10011.2.3.1.255">
                            <valueCode value="${asaGradingStandardCode}" />
                        </extension>
                        </#if>
                        <#if tracheaCannulaClass??>
                        <!-- 气管插管分类 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/trachea-cannula-class">
                            <valueString value="${tracheaCannulaClass}" />
                        </extension>
                        </#if>
                        <#if anesDrugName??>
                        <!-- 麻醉药物名称 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/anes-drug-name">
                            <valueString value="${anesDrugName}" />
                        </extension>
                        </#if>
                        <#if breatheTypeCd??>
                        <!-- 呼吸类型代码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/breathe-type-cd">
                            <valueCode value="${breatheTypeCd}" />
                        </extension>
                        </#if>
                        <#if anesDescr??>
                        <!-- 麻醉描述 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/anes-descr">
                            <valueString value="${anesDescr}" />
                        </extension>
                        </#if>
                        <#if anesCompCd??>
                        <!-- 麻醉合并症标志代码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/anes-comp-cd">
                            <valueCode value="${anesCompCd}" />
                        </extension>
                        </#if>
                        <#if punctureProcess??>
                        <!-- 穿刺过程 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/puncture-process">
                            <valueString value="${punctureProcess}" />
                        </extension>
                        </#if>
                        <#if anesEffect??>
                        <!-- 麻醉效果 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/anes-effect">
                            <valueString value="${anesEffect}" />
                        </extension>
                        </#if>
                        <#if anesPreDrug??>
                        <!-- 麻醉前用药 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/anes-pre-drug">
                            <valueString value="${anesPreDrug}" />
                        </extension>
                        </#if>
                        <#if procedureStart??>
                        <!-- 手术开始日期时间 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/datetime/operation-start-time">
                            <valueDateTime value="${procedureStart?string("yyyy-MM-dd")}T${procedureStart?string("HH:mm:ss")}" />
                        </extension>
                        </#if>
                        <#if procedureEnd??>
                        <!-- 手术结束日期时间 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/datetime/operation-end-time">
                            <valueDateTime value="${procedureEnd?string("yyyy-MM-dd")}T${procedureEnd?string("HH:mm:ss")}" />
                        </extension>
                        </#if>
                        <#if opRoom??>
                        <!-- 手术间编号 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/op-room">
                            <valueString value="${opRoom}" />
                        </extension>
                        </#if>
                        <#if mattersNeedingAttention??>
                        <!-- 诊疗过程描述 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/matters-needing-attention">
                            <valueString value="${mattersNeedingAttention}" />
                        </extension>
                        </#if>
                        <#if eOrderNo??>
                        <!-- 电子申请单编号 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/e-order-no">
                            <valueString value="${eOrderNo}" />
                        </extension>
                        </#if>
                        <#if anaesthesiaId??>
                        <identifier>
                            <!-- 原系统麻醉单id命名空间 -->
                            <system
                                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/anaesthesia-id" />
                            <!-- 原系统麻醉id号 -->
                            <value value="${anaesthesiaId}" />
                        </identifier>
                        </#if>
                        <subject />
                        <status />
                        <category>
                            <coding>
                                <!-- 处置类别命名空间 -->
                                <system
                                    value="http://www.nestvision.com/platform/app/data/v1/code/procedure-types" />
                                <!-- 处置类别 -->
                                <code value="05" />
                                <!-- 处置类别名称 -->
                                <display value="麻醉" />
                            </coding>
                        </category>
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
                                <display value="全身麻醉" />
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
                            <coding>
                                <!-- 输血品种命名空间 -->
                                <system value="urn:oid:2.16.156.10011.2.3.1.251" />
                                <#if transfusionVarietyCode??>
                                <!-- 输血品种编码 -->
                                <code value="${transfusionVarietyCode}" />
                                </#if>
                                <#if transfusionVarietyName??>
                                <!-- 输血品种名字 -->
                                <display value="${transfusionVarietyName}" />
                                </#if>
                            </coding>
                        </code>
                        <bodySite>
                            <coding>
                                <!-- 麻醉部位代码命名空间 -->
                                <system value="urn:oid:2.16.156.10011.2.3.1.266" />
                                <#if anesthesiaSiteCode??>
                                <!-- 麻醉部位代码 -->
                                <code value="${anesthesiaSiteCode}" />
                                </#if>
                                <#if anesthesiaSiteName??>
                                <!-- 麻醉部位名称 -->
                                <display value="${anesthesiaSiteName}" />
                                </#if>
                            </coding>
                            <coding>
                                <!-- 手术操作目标部位代码命名空间 -->
                                <system value="urn:oid:2.16.156.10011.2.3.1.262" />
                                <#if partCode??>
                                <!-- 手术操作目标部位代码 -->
                                <code value="03" />
                                </#if>
                                <#if partName??>
                                <!-- 手术操作目标部位名称 -->
                                <display value="${partName}" />
                                </#if>
                            </coding>
                        </bodySite>
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
                        <performedPeriod>
                            <#if anesthesiaStartTime??>
                            <!-- 麻醉开始时间 -->
                            <start value="${anesthesiaStartTime?string("yyyy-MM-dd")}T${anesthesiaStartTime?string("HH:mm:ss")}" />
                            </#if>
                            <#if anesthesiaEndTime??>
                            <!-- 麻醉结束时间 -->
                            <end value="${anesthesiaEndTime?string("yyyy-MM-dd")}T${anesthesiaEndTime?string("HH:mm:ss")}" />
                            </#if>
                        </performedPeriod>
                    </Procedure>
                </contained>
                <#if remarks??>
                <!--备注 -->
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/text/remarks">
                    <valueString value="${remarks}" />
                </extension>
                </#if>
                <!-- 原系统麻醉记录id -->
                <#if anaesthesiaRecordId??>
                <identifier>
                    <system
                        value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/anaesthesia-record-id" />
                    <value value="${anaesthesiaRecordId}" />
                </identifier>
                </#if>
                <#if date??>
                <!-- 记录日期 -->
                <date value="${date?string("yyyy-MM-dd")}T${date?string("HH:mm:ss")}" />
                </#if>
                <!-- 文档类型：麻醉记录 -->
                <type>
                    <coding>
                        <system value="2.16.156.10011.2.4" />
                        <code value="C0011" />
                    </coding>
                    <text value="麻醉记录" />
                </type>
                <!-- 文档标题：麻醉记录 -->
                <title value="麻醉记录" />
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
                <!-- 文档保管机构id -->
                <custodian>
                    <reference value="#hos1" />
                </custodian>
                <!-- 门诊或住院信息 -->
                <encounter>
                    <reference value="#e1" />
                </encounter>
                <!-- 实验室检查章节 -->
                <section>
                    <#if aboCd??>
                    <!-- ABO血型代码 -->
                    <extension url="urn:oid:2.16.156.10011.2.3.1.85">
                        <valueCode value="${aboCd}" />
                    </extension>
                    </#if>
                    <#if rhCd??>
                    <!-- RH血型代码 -->
                    <extension url="urn:oid:2.16.156.10011.2.3.1.250">
                        <valueCode value="${rhCd}" />
                    </extension>
                    </#if>
                    <title value="实验室检查章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="30954-2" />
                            <display value="STUDIES SUMMARY" />
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
                <!-- 用药管理章节 -->
                <section>
                    <title value="用药管理章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="18610-6" />
                            <display value="MEDICATION ADMINISTERED" />
                        </coding>
                    </code>
                    <!-- 医嘱处方 -->
                    <entry>
                        <reference value="#m1" />
                    </entry>
                </section>
                <!-- 输液章节 -->
                <section>
                    <#if opInfusionItem??>
                    <!-- 术中输液项目 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/op-infusion-item">
                        <valueString value="${opInfusionItem}" />
                    </extension>
                    </#if>
                    <title value="输液章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="10216-0" />
                            <display value="Surgical operation note fluids" />
                        </coding>
                    </code>
                </section>
                <!-- 输血章节 -->
                <section>
                    <title value="输血章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="56836-0" />
                            <display value="History of blood transfusion" />
                        </coding>
                    </code>
                    <!-- 麻醉 -->
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
                    <!-- 麻醉 -->
                    <entry>
                        <reference value="#p1" />
                    </entry>
                </section>
                <!-- 主要健康问题章节 -->
                <section>
                    <#if routeMonitorItemName??>
                    <!-- 常规监测项目名称 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/route-monitor-item-name">
                        <valueString value="${routeMonitorItemName}" />
                    </extension>
                    </#if>
                    <#if routeMonitorItemResult??>
                    <!-- 常规监测项目结果 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/route-monitor-item-result">
                        <valueString value="${routeMonitorItemResult}" />
                    </extension>
                    </#if>
                    <#if specMonitorItemName??>
                    <!-- 特殊监测项目名称 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/spec-monitor-item-name">
                        <valueString value="${specMonitorItemName}" />
                    </extension>
                    </#if>
                    <#if specMonitorItemResult??>
                    <!-- 特殊监测项目结果 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/spec-monitor-item-result">
                        <valueString value="${specMonitorItemResult}" />
                    </extension>
                    </#if>
                    <title value="主要健康问题章节" />
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
                    <#if bodyTemperature??>
                    <!-- 体温（℃） -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/number/body-temperature">
                        <valueDecimal value="${bodyTemperature}" />
                    </extension>
                    </#if>
                    <#if heartRate??>
                    <!-- 心率（次/min） -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/number/heart-rate">
                        <valueDecimal value="${heartRate}" />
                    </extension>
                    </#if>
                    <#if pulses??>
                    <!-- 脉率（次/min） -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/number/pulses">
                        <valueDecimal value="${pulses}" />
                    </extension>
                    </#if>
                    <#if breathingRate??>
                    <!-- 呼吸频率（次/min） -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/number/breathing-rate">
                        <valueDecimal value="${breathingRate}" />
                    </extension>
                    </#if>
                    <#if weight??>
                    <!-- 体重(kg) -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/number/weight">
                        <valueDecimal value="${weight}" />
                    </extension>
                    </#if>
                    <#if sbp??>
                    <!-- 收缩压（mmHg） -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/number/sbp">
                        <valueDecimal value="${sbp}" />
                    </extension>
                    </#if>
                    <#if dbp??>
                    <!-- 舒张压（mmHg） -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/number/dbp">
                        <valueDecimal value="${dbp}" />
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
                    <!-- 麻醉 -->
                    <entry>
                        <reference value="#p1" />
                    </entry>
                </section>
                <!-- 失血章节 -->
                <section>
                    <#if lossbloodAmount??>
                    <!-- 出血量（mL） -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/number/lossblood-amount">
                        <valueDecimal value="${lossbloodAmount}" />
                    </extension>
                    </#if>
                    <title value="失血章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="55103-6" />
                            <display value="Surgical operation note estimated blood loss" />
                        </coding>
                    </code>
                </section>
                <!-- 术后去向章节 -->
                <section>
                    <#if outCode??>
                    <!-- 患者去向代码 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/code/out-code">
                        <valueCode value="${outCode}" />
                    </extension>
                    </#if>
                    <#if outOperationRoomTime??>
                    <!-- 出手术室日期时间 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/datetime/out-operation-room-time">
                        <valueDateTime value="${outOperationRoomTime?string("yyyy-MM-dd")}T${outOperationRoomTime?string("HH:mm:ss")}" />
                    </extension>
                    </#if>
                    <title value="术后去向章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="59775-7" />
                            <display value="Procedure disposition" />
                        </coding>
                    </code>
                </section>
            </Composition>
        </resource>
    </entry>
</Bundle>