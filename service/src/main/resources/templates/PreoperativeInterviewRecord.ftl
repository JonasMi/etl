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
            <!-- 资源： 麻醉术前访视记录 -->
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
                                    <value value="1" />
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
                <#if remarks??>
                <!--备注 -->
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/text/remarks">
                    <valueString value="${remarks}" />
                </extension>
                </#if>
                <#if preoperativeInterviewRecordId??>
                <!-- 原系统麻醉术前访视记录id -->
                <identifier>
                    <system
                        value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/preoperative-interview-record-id" />
                    <value value="${preoperativeInterviewRecordId}" />
                </identifier>
                </#if>
                <#if date??>
                <!-- 记录日期 -->
                <date value="${date?string("yyyy-MM-dd")}T${date?string("HH:mm:ss")}" />
                </#if>
                <!-- 文档类型：麻醉术前访视记录 -->
                <type>
                    <coding>
                        <system value="2.16.156.10011.2.4" />
                        <code value="C0010" />
                    </coding>
                    <text value="麻醉术前访视记录" />
                </type>
                <!-- 文档标题：麻醉术前访视记录 -->
                <title value="麻醉术前访视记录" />
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
                <!-- 术前诊断章节 -->
                <section>
                    <#if diseaseBeforeOperation??>
                    <!--术前合并疾病 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/disease-before-operation">
                        <valueString value="${diseaseBeforeOperation}" />
                    </extension>
                    </#if>
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
                <!-- 现病史章节 -->
                <section>
                    <#if illness??>
                    <!-- 现病史 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/illness">
                        <valueString value="${illness}" />
                    </extension>
                    </#if>
                    <title value="现病史章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="10164-2" />
                            <display value="HISTORY OF PRESENT ILLNESS" />
                        </coding>
                    </code>
                </section>
                <!-- 既往史章节 -->
                <section>
                    <#if rritability??>
                    <!-- 过敏史描述 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/rritability">
                        <valueString value="${rritability}" />
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
                <!-- 体格检查章节 -->
                <section>
                    <#if bodyWeight??>
                    <!--体重 (患者体重的测量值，计量单位为kg)-->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/number/body-weight">
                        <valueDecimal value="${bodyWeight}" />
                    </extension>
                    </#if>
                    <#if generalSituExamResult??>
                    <!--一般状况 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/general-situ-exam-result">
                        <valueString value="${generalSituExamResult}" />
                    </extension>
                    </#if>
                    <#if spiritNormalStatus??>
                    <!--精神状态正常标志 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/boolean/spirit-normal-status">
                        <valueBoolean value="${spiritNormalStatus?string("true","false")}" />
                    </extension>
                    </#if>
                    <#if cardiacAuscultationResult??>
                    <!--心脏听诊结果 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/cardiac-auscultation-result">
                        <valueString value="${cardiacAuscultationResult}" />
                    </extension>
                    </#if>
                    <#if lungAuscultationResult??>
                    <!--肺部听诊结果 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/lung-auscultation-result">
                        <valueString value="${lungAuscultationResult}" />
                    </extension>
                    </#if>
                    <#if limbs??>
                    <!--四肢检查结果 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/limbs">
                        <valueString value="${limbs}" />
                    </extension>
                    </#if>
                    <#if spine??>
                    <!--脊柱检查结果 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/spine">
                        <valueString value="${spine}" />
                    </extension>
                    </#if>
                    <#if belly??>
                    <!--腹部检查结果 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/belly">
                        <valueString value="${belly}" />
                    </extension>
                    </#if>
                    <#if trachea??>
                    <!--气管检查结果 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/trachea">
                        <valueString value="${trachea}" />
                    </extension>
                    </#if>
                    <#if dentalExaminationResult??>
                    <!--牙齿检查结果 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/dental-examination-result">
                        <valueString value="${dentalExaminationResult}" />
                    </extension>
                    </#if>
                    <title value="牙齿检查结果" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="29545-1" />
                            <display value="PHYSICAL EXAMINATION" />
                        </coding>
                    </code>
                </section>
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
                    <#if ecgResult??>
                    <!--心电图检查结果 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/ecg-result">
                        <valueString value="${ecgResult}" />
                    </extension>
                    </#if>
                    <#if xrayExamResult??>
                    <!--胸部X线检查结果 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/xray-exam-result">
                        <valueString value="${xrayExamResult}" />
                    </extension>
                    </#if>
                    <#if ctExamResult??>
                    <!--CT检查结果 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/ct-exam-result">
                        <valueString value="${ctExamResult}" />
                    </extension>
                    </#if>
                    <#if bscanResultDescr??>
                    <!--B超检查结果 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/bscan-result-descr">
                        <valueString value="${bscanResultDescr}" />
                    </extension>
                    </#if>
                    <#if mriExamResult??>
                    <!--MRI超检查结果 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/mri-exam-result">
                        <valueString value="${mriExamResult}" />
                    </extension>
                    </#if>
                    <#if pulmonaryExamResult??>
                    <!--肺功能检查结果 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/pulmonary-exam-result">
                        <valueString value="${pulmonaryExamResult}" />
                    </extension>
                    </#if>
                    <#if routineTestResult??>
                    <!--血常规检查结果 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/routine-test-result">
                        <valueString value="${routineTestResult}" />
                    </extension>
                    </#if>
                    <#if urineTestResult??>
                    <!--尿常规检查结果 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/urine-test-result">
                        <valueString value="${urineTestResult}" />
                    </extension>
                    </#if>
                    <#if bloodCoagulaTestResult??>
                    <!--凝血功能检查结果 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/blood-coagula-test-result">
                        <valueString value="${bloodCoagulaTestResult}" />
                    </extension>
                    </#if>
                    <#if liverTestResult??>
                    <!--肝功能检查结果 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/liver-test-result">
                        <valueString value="${liverTestResult}" />
                    </extension>
                    </#if>
                    <#if bloodGasTestResult??>
                    <!--血气分析检查结果 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/blood-gas-test-result">
                        <valueString value="${bloodGasTestResult}" />
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
                <!-- 治疗计划章节 -->
                <section>
                    <#if operationCd??>
                    <!-- 手术(操作)代码表（ICD-9-CM） -->
                    <extension url="urn:oid:2.16.156.10011.2.3.3.12">
                        <valueCode value="${operationCd}" />
                    </extension>
                    </#if>
                    <#if opRoom??>
                    <!-- 手术间编号 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/op-room">
                        <valueString value="${opRoom}" />
                    </extension>
                    </#if>
                    <#if proposedAnesthesiaMethod??>
                    <!-- 拟实施麻醉方法代码 -->
                    <extension url="urn:oid:2.16.156.10011.2.3.1.159">
                        <valueCode value="${proposedAnesthesiaMethod}" />
                    </extension>
                    </#if>
                    <#if opPreAnesOrder??>
                    <!-- 术前麻醉医嘱 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/op-pre-anes-order">
                        <valueString value="${opPreAnesOrder}" />
                    </extension>
                    </#if>
                    <#if anesIndication??>
                    <!-- 麻醉适应证 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/anes-indication">
                        <valueString value="${anesIndication}" />
                    </extension>
                    </#if>
                    <#if mattersNeedingAttention??>
                    <!--注意事项 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/matters-needing-attention">
                        <valueString value="${mattersNeedingAttention}" />
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
            </Composition>
        </resource>
    </entry>
</Bundle>