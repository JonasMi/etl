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
            <!-- 资源： 病历概要 -->
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
                    <Organization xmlns="http://hl7.org/fhir">
                        <id value="hos2" />
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
                        <#if workUnit??>
                        <!-- 工作单位 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/work-unit">
                            <valueString value="${workUnit}" />
                        </extension>
                        </#if>
                        <#if contactNumber??>
                        <!-- 工作单位联系方式 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/contact-number">
                            <valueString value="${contactNumber}" />
                        </extension>
                        </#if>
                        <#if patientType??>
                        <!-- 患者类型 -->
                        <extension url="urn:oid:2.16.156.10011.2.3.1.271">
                            <valueCode value="${patientType}" />
                        </extension>
                        </#if>
                        <#if responsDocName??>
                        <!-- 责任医师姓名 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/respons-doc-name">
                            <valueString value="${responsDocName}" />
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
                        <#if birthdate??>
                        <!-- 出生日期 -->
                        <birthDate value="${birthdate?string("yyyy-MM-dd")}" />
                        </#if>
                        <address>
                            <#if tempRoad??>
                            <!-- 地址-村（街、路、弄等） -->
                            <extension
                                url="http://www.nestvision.com/platform/app/data/v1/text/address-road">
                                <valueString value="${tempRoad}" />
                            </extension>
                            </#if>
                            <#if tempHouseNo??>
                            <!--地址-门牌号码 -->
                            <extension
                                url="http://www.nestvision.com/platform/app/data/v1/text/house-no">
                                <valueString value="${tempHouseNo}" />
                            </extension>
                            </#if>
                            <#if tempPostCd??>
                            <!--现地址邮政编码 -->
                            <extension
                                url="http://www.nestvision.com/platform/app/data/v1/text/post-cd">
                                <valueString value="${tempPostCd}" />
                            </extension>
                            </#if>
                            <!-- 地址类别代码:现居住地址 -->
                            <use value="temp" />
                            <#if tempLine??>
                            <!-- 地址-乡（镇、街道办事处） -->
                            <line value="${tempLine}" />
                            </#if>
                            <#if tempCity??>
                            <!-- 地址-市（地区） -->
                            <city value="${tempCity}" />
                            </#if>
                            <#if tempDistrict??>
                            <!-- 地址-县（区） -->
                            <district value="${tempDistrict}" />
                            </#if>
                            <#if tempState??>
                            <!-- 地址-省（自治区、直辖市） -->
                            <state value="${tempState}" />
                            </#if>
                        </address>
                        <#if maritalstatus??>
                        <maritalStatus>
                            <coding>
                                <!-- 婚姻状况代码命名空间 -->
                                <system value="urn:oid:2.16.156.10011.2.3.3.5" />
                                <!-- 婚姻状况代码 -->
                                <code value="${maritalstatus}" />
                            </coding>
                        </maritalStatus>
                        </#if>
                        <!-- 联系人的信息 -->
                        <contact>
                            <#if relationship??>
                            <relationship>
                                <coding>
                                    <!-- 联系人关系代码命名空间 -->
                                    <system value="urn:oid:2.16.156.10011.2.3.3.8" />
                                    <!-- 联系人关系代码 -->
                                    <code value="${relationship}" />
                                </coding>
                            </relationship>
                            </#if>
                            <#if contactsName??>
                            <name>
                                <!-- 联系人姓名 -->
                                <text value="${contactsName}" />
                            </name>
                            </#if>
                            <telecom>
                                <!-- 联系人联系方式代码 -->
                                <system value="phone" />
                                <#if contactsPhone??>
                                <!-- 联系人电话号码 -->
                                <value value="${contactsPhone}" />
                                </#if>
                                <use value="temp" />
                            </telecom>
                            <address>
                                <#if contactsTempRoad??>
                                <!-- 地址-村（街、路、弄等） -->
                                <extension
                                    url="http://www.nestvision.com/platform/app/data/v1/text/address-road">
                                    <valueString value="${contactsTempRoad}" />
                                </extension>
                                </#if>
                                <#if contactsTempHouseNo??>
                                <!--地址-门牌号码 -->
                                <extension
                                    url="http://www.nestvision.com/platform/app/data/v1/text/house-no">
                                    <valueString value="${contactsTempHouseNo}" />
                                </extension>
                                </#if>
                                <!-- 地址类别代码:现居住地址 -->
                                <use value="temp" />
                                <#if contactsTempLine??>
                                <!-- 地址-乡（镇、街道办事处） -->
                                <line value="${contactsTempLine}" />
                                </#if>
                                <#if contactsTempCity??>
                                <!-- 地址-市（地区） -->
                                <city value="${contactsTempCity}" />
                                </#if>
                                <#if contactsTempDistrict??>
                                <!-- 地址-县（区） -->
                                <district value="${contactsTempDistrict}" />
                                </#if>
                                <#if contactsTempState??>
                                <!-- 地址-省（自治区、直辖市） -->
                                <state value="${contactsTempState}" />
                                </#if>
                            </address>
                        </contact>
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
                    <!-- 住院 -->
                    <Encounter xmlns="http://hl7.org/fhir">
                        <id value="e1" />
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
                                            <value value="${upHospital}" />
                                        </identifier>
                                        </#if>
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
                        <#if inReason??>
                        <!-- 就诊原因 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/in-reason">
                            <valueString value="${inReason}" />
                        </extension>
                        </#if>
                        <#if otherMedicalTreatment??>
                        <!--其他医学处置 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/other-medical-treatment">
                            <valueString value="${otherMedicalTreatment}" />
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
                        <status value="finished" />
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
                            <#if end??>
                            <!-- 出院时间 -->
                            <end value="${end?string("yyyy-MM-dd")}T${end?string("HH:mm:ss")}" />
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
                        <!-- 接诊科室 -->
                        <serviceProvider>
                            <reference value="#e1o1" />
                        </serviceProvider>
                    </Encounter>
                </contained>
                <contained>
                    <!-- 西医诊断 -->
                    <Condition xmlns="http://hl7.org/fhir">
                        <id value="c1" />
                        <#if onsetDate??>
                        <!-- 发病时间 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/date/onset-date">
                            <valueDateTime value="${onsetDate?string("yyyy-MM-dd")}T${onsetDate?string("HH:mm:ss")}" />
                        </extension>
                        </#if>
                        <#if treatmentResultCode??>
                        <!-- 病情转归代码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/treatment-result-code">
                            <valueCode value="${treatmentResultCode}" />
                        </extension>
                        </#if>
                        <patient />
                        <code>
                            <coding>
                                <!--西医诊断编码 -->
                                <system value="urn:oid:2.16.156.10011.2.3.3.11" />
                                <#if diagnosticCode??>
                                <!--西医诊断编码 -->
                                <code value="${diagnosticCode}" />
                                </#if>
                                <#if diagnosticName??>
                                <display value="${diagnosticName}" />
                                </#if>
                            </coding>
                        </code>
                        <verificationStatus />
                    </Condition>
                </contained>
                <contained>
                    <!-- 其他西医诊断 -->
                    <Condition xmlns="http://hl7.org/fhir">
                        <id value="c2" />
                        <patient />
                        <code>
                            <coding>
                                <!--其他西医诊断编码 -->
                                <system value="urn:oid:2.16.156.10011.2.3.3.11" />
                                <#if otherDiagnosticCode??>
                                <!--其他西医诊断编码 -->
                                <code value="${otherDiagnosticCode}" />
                                </#if>
                                <#if otherDiagnosticName??>
                                <display value="${otherDiagnosticName}" />
                                </#if>
                            </coding>
                        </code>
                        <verificationStatus />
                    </Condition>
                </contained>
                <contained>
                    <!-- 中医病名/中医征候诊断 -->
                    <Condition xmlns="http://hl7.org/fhir">
                        <id value="c3" />
                        <#if cnSymDiagCode??>
                        <!--中医征候诊断代码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/cn-sym-diag-code">
                            <valueCode value="${cnSymDiagCode}" />
                        </extension>
                        </#if>
                        <#if cnDisDiagCode??>
                        <!--中医病名诊断代码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/cn-dis-diag-code">
                            <valueCode value="${cnDisDiagCode}" />
                        </extension>
                        </#if>
                        <#if cnTreatmentResultCode??>
                        <!-- 病情转归代码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/treatment-result-code">
                            <valueCode value="${cnTreatmentResultCode}" />
                        </extension>
                        </#if>
                        <patient />
                        <code />
                        <verificationStatus />
                    </Condition>
                </contained>
                <contained>
                    <!-- 手术 -->
                    <Procedure xmlns="http://hl7.org/fhir">
                        <id value="p1" />
                        <subject />
                        <status />
                        <code>
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
                    </Procedure>
                </contained>
                <contained>
                    <!-- 处方 -->
                    <MedicationOrder xmlns="http://hl7.org/fhir">
                        <id value="m1" />
                        <#if crucialDrugName??>
                        <!-- 关键药物名称 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/crucial-drug-name">
                            <valueString value="${crucialDrugName}" />
                        </extension>
                        </#if>
                        <#if crucialDrugUsage??>
                        <!-- 关键药物用法 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/crucial-drug-usage">
                            <valueString value="${crucialDrugUsage}" />
                        </extension>
                        </#if>
                        <#if drugAdverseReaction??>
                        <!-- 药物不良反应情况 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/drug-adverse-reaction">
                            <valueString value="${drugAdverseReaction}" />
                        </extension>
                        </#if>
                        <#if cnMedicationTypeCode??>
                        <!-- 中药使用类别代码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/cn-medication-type-code">
                            <valueCode value="${cnMedicationTypeCode}" />
                        </extension>
                        </#if>
                        <medicationReference />
                    </MedicationOrder>
                </contained>
                <contained>
                    <!-- 费用 -->
                    <Claim xmlns="http://hl7.org/fhir">
                        <id value="claim1"/>
                        <#if medicalInsuranceCategory??>
                        <!-- 医疗保险类别代码 -->
                        <extension url="urn:oid:2.16.156.10011.2.3.1.248">
                            <valueCode value="${medicalInsuranceCategory}" />
                        </extension>
                        </#if>
                        <#if feeCode??>
                        <!-- 医疗付费方式 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/fee-code">
                            <valueCode value="${feeCode}" />
                        </extension>
                        </#if>
                        <#if psnExpense??>
                        <!-- 个人承担费用 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/psn-expense">
                            <valueDecimal value="${psnExpense}" />
                        </extension>
                        </#if>
                        <#if outpatientExpenses??>
                        <!-- 门诊费用金额 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/outpatient-expenses">
                            <valueDecimal value="${outpatientExpenses}" />
                        </extension>
                        </#if>
                        <#if inpatientExpenses??>
                        <!-- 住院费用金额 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/inpatient-expenses">
                            <valueDecimal value="${inpatientExpenses}" />
                        </extension>
                        </#if>
                        <type/>
                        <patientReference/>
                    </Claim>
                </contained>
                <#if medicalRecordOutlineId??>
                <!-- 原系统病历概要id -->
                <identifier>
                    <system
                        value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/medical-record-outline-id" />
                    <value value="${medicalRecordOutlineId}" />
                </identifier>
                </#if>
                <#if date??>
                <!-- 记录日期 -->
                <date value="${date?string("yyyy-MM-dd")}T${date?string("HH:mm:ss")}" />
                </#if>
                <!-- 文档类型：病历概要 -->
                <type>
                    <coding>
                        <system value="2.16.156.10011.2.4" />
                        <code value="C0001" />
                    </coding>
                    <text value="病历概要" />
                </type>
                <!-- 文档标题：病历概要 -->
                <title value="病历概要" />
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
                <!-- 实验室检验章节 -->
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
                    <title value="实验室检验章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="30954-2" />
                            <display value="STUDIES SUMMARY" />
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
                    <#if opHis??>
                    <!-- 手术史 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/op-his">
                        <valueString value="${opHis}" />
                    </extension>
                    </#if>
                    <#if obstetricalHistory??>
                    <!-- 婚育史 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/obstetrical-history">
                        <valueString value="${obstetricalHistory}" />
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
                <!-- 输血章节 -->
                <section>
                    <#if transfusionHis??>
                    <!-- 输血史描述 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/transfusion-his">
                        <valueString value="${transfusionHis}" />
                    </extension>
                    </#if>
                    <title value="输血章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="56836-0" />
                            <display value="History of blood transfusion" />
                        </coding>
                    </code>
                </section>
                <!-- 过敏史章节 -->
                <section>
                    <#if rritability??>
                    <!-- 过敏史描述 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/rritability">
                        <valueString value="${rritability}" />
                    </extension>
                    </#if>
                    <title value="过敏史章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="48765-2" />
                            <display value="Allergies, adverse reactions, alerts" />
                        </coding>
                    </code>
                </section>
                <!-- 预防接种史章节 -->
                <section>
                    <#if vaccHis??>
                    <!-- 预防接种史描述 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/vacc-his">
                        <valueString value="${vaccHis}" />
                    </extension>
                    </#if>
                    <title value="预防接种史章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="11369-6" />
                            <display value="HISTORY OF IMMUNIZATIONS" />
                        </coding>
                    </code>
                </section>
                <!-- 个人史章节 -->
                <section>
                    <#if perHistory??>
                    <!-- 个人史 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/per-history">
                        <valueString
                            value="${perHistory}" />
                    </extension>
                    </#if>
                    <title value="个人史章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="29762-2" />
                            <display value="Social history" />
                        </coding>
                    </code>
                </section>
                <!-- 月经史章节 -->
                <section>
                    <#if mensesHis??>
                    <!-- 月经史 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/menses-his">
                        <valueString value="${mensesHis}" />
                    </extension>
                    </#if>
                    <title value="月经史章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="49033-4" />
                            <display value="Menstrual History" />
                        </coding>
                    </code>
                </section>
                <!-- 家族史章节 -->
                <section>
                    <#if famHistory??>
                    <!-- 家族史 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/fam-history">
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
                <!-- 卫生事件章节 -->
                <section>
                    <#if deathCode??>
                    <!-- 死因代码icd-10 -->
                    <extension url="urn:oid:2.16.156.10011.2.3.3.11">
                        <valueCode value="${deathCode}" />
                    </extension>
                    </#if>
                    <title value="卫生事件章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="99999-1" />
                            <display value="HEALTH EVENTS" />
                        </coding>
                    </code>
                    <!-- 医疗机构 -->
                    <entry>
                        <reference value="#hos2" />
                    </entry>
                    <!-- 门诊或住院 -->
                    <entry>
                        <reference value="#e1" />
                    </entry>
                    <!-- 西医诊断 -->
                    <entry>
                        <reference value="#c1" />
                    </entry>
                    <!-- 其他西医诊断 -->
                    <entry>
                        <reference value="#c2" />
                    </entry>
                    <!-- 中医病名/中医证候诊断 -->
                    <entry>
                        <reference value="#c3" />
                    </entry>
                    <!-- 手术 -->
                    <entry>
                        <reference value="#p1" />
                    </entry>
                    <!-- 处方 -->
                    <entry>
                        <reference value="#m1" />
                    </entry>
                    <!-- 费用 -->
                    <entry>
                        <reference value="#claim1" />
                    </entry>
                </section>
            </Composition>
        </resource>
    </entry>
</Bundle>