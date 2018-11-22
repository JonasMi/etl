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
            <!-- 资源：转科记录 -->
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
                <!-- 转出签名医师 -->
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra2" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                            <#if rollOutOperatorId??>
                            <!-- 院内人员ID号 -->
                            <value value="${rollOutOperatorId}" />
                            </#if>
                        </identifier>
                        <name>
                            <#if rollOutOperatorName??>
                            <!-- 姓名 -->
                            <text value="${rollOutOperatorName}" />
                            </#if>
                        </name>
                        <practitionerRole>
                            <specialty>
                                <coding>
                                    <!-- 专业技术职务代码命名空间 -->
                                    <system value="urn:oid:2.16.156.10011.2.3.3.10" />
                                    <#if rollOutOperatorPost??>
                                    <!-- 专业技术职务代码 -->
                                    <code value="${rollOutOperatorPost}" />
                                    </#if>
                                </coding>
                            </specialty>
                        </practitionerRole>
                    </Practitioner>
                </contained>
                <!-- 转入签名医师 -->
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra3" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                            <#if rollInOperatorId??>
                            <!-- 院内人员ID号 -->
                            <value value="${rollInOperatorId}" />
                            </#if>
                        </identifier>
                        <name>
                            <#if rollInOperatorName??>
                            <!-- 姓名 -->
                            <text value="${rollInOperatorName}" />
                            </#if>
                        </name>
                        <practitionerRole>
                            <specialty>
                                <coding>
                                    <!-- 专业技术职务代码命名空间 -->
                                    <system value="urn:oid:2.16.156.10011.2.3.3.10" />
                                    <#if rollInOperatorPost??>
                                    <!-- 专业技术职务代码 -->
                                    <code value="${rollInOperatorPost}" />
                                    </#if>
                                </coding>
                            </specialty>
                        </practitionerRole>
                    </Practitioner>
                </contained>
                <!-- 住院或门诊 -->
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
                        <#if chief??>
                        <!--主诉 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/text/chief">
                            <valueString value="${chief}" />
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
                <!-- 用药 -->
                <contained>
                    <MedicationOrder xmlns="http://hl7.org/fhir">
                        <id value="me1" />
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
                            <valueCode value="${cnDrugWayCd}" />
                        </extension>
                        </#if>
                        <medicationReference/>
                    </MedicationOrder>
                </contained>
                <!-- 转科记录 -->
                <contained>
                    <ReferralRequest xmlns="http://hl7.org/fhir">
                            <id value="ref1"/>
                            <!-- Practitioner -->
                            <contained>
                                <Practitioner xmlns="http://hl7.org/fhir">
                                    <id value="ref1pra1" />
                                    <identifier>
                                        <!-- 院内人员ID号命名空间 -->
                                        <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                                        <#if rollOutOperatorId??>
                                        <!-- 院内人员ID号 -->
                                        <value value="${rollOutOperatorId}" />
                                        </#if>
                                    </identifier>
                                    <name>
                                        <#if rollOutOperatorName??>
                                        <!-- 姓名 -->
                                        <text value="${rollOutOperatorName}" />
                                        </#if>
                                    </name>
                                </Practitioner>
                            </contained>
                            <!-- Practitioner -->
                            <contained>
                                <Practitioner xmlns="http://hl7.org/fhir">
                                    <id value="ref1pra2" />
                                    <identifier>
                                        <!-- 院内人员ID号命名空间 -->
                                        <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                                        <#if rollInOperatorId??>
                                        <!-- 院内人员ID号 -->
                                        <value value="${rollInOperatorId}" />
                                        </#if>
                                    </identifier>
                                    <name>
                                        <#if rollInOperatorName??>
                                        <!-- 姓名 -->
                                        <text value="${rollInOperatorName}" />
                                        </#if>
                                    </name>
                                </Practitioner>
                            </contained>
                            <contained>
                                <Organization xmlns="http://hl7.org/fhir">
                                    <id value="ref1org1" />
                                    <identifier>
                                        <!-- 院内科室IDID号命名空间 -->
                                        <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id" />
                                        <#if outDpidId??>
                                        <!-- 院内科室IDID号 -->
                                        <value value="${outDpidId}" />
                                        </#if>
                                    </identifier>
                                    <#if outDpidName??>
                                    <!-- 科室名称 -->
                                    <name value="${outDpidName}" />
                                    </#if>
                                </Organization>
                            </contained>
                            <contained>
                                <Organization xmlns="http://hl7.org/fhir">
                                    <id value="ref1org2" />
                                    <identifier>
                                        <!-- 院内科室IDID号命名空间 -->
                                        <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id" />
                                        <#if inDpidId??>
                                        <!-- 院内科室IDID号 -->
                                        <value value="${inDpidId}" />
                                        </#if>
                                    </identifier>
                                    <#if inDpidName??>
                                    <!-- 科室名称 -->
                                    <name value="${inDpidName}" />
                                    </#if>
                                </Organization>
                            </contained>
                            <!-- 转出科室id -->
                            <extension url="http://www.nestvision.com/platform/app/data/v1/identifier/out-dpid">
                                <valueReference>
                                    <reference value="ref1org1"/>
                                </valueReference>
                            </extension>
                            <#if inDate??>
                            <!-- 转入时间 -->
                            <extension url="http://www.nestvision.com/platform/app/data/v1/datetime/in-date">
                                <valueDateTime value="${inDate?string("yyyy-MM-dd")}T${inDate?string("HH:mm:ss")}" />
                            </extension>
                            </#if>
                            <#if outDate??>
                            <!-- 转出时间 -->
                            <extension url="http://www.nestvision.com/platform/app/data/v1/datetime/out-date">
                                <valueDateTime value="${outDate?string("yyyy-MM-dd")}T${outDate?string("HH:mm:ss")}" />
                            </extension>
                            </#if>
                            <#if transferReason??>
                            <!-- 转科目的 -->
                            <extension url="http://www.nestvision.com/platform/app/data/v1/text/transfer-reason">
                                <valueString value="${transferReason}" />
                            </extension>
                            </#if>
                            <#if inpatientTransferId??>
                            <identifier>
                                <!-- 原系统转诊id -->
                                <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/inpatient-transfer-id" />
                                <value value="${inpatientTransferId}" />
                            </identifier>
                            </#if>
                            <!-- 状态 -->
                            <status value="completed"/>
                            <category/>
                            <!-- 转出操作人id -->
                            <requester>
                                <reference value="ref1pra1" />
                            </requester>
                            <!-- 转入科室id -->
                            <recipient>
                                <reference value="ref1org2" />
                            </recipient>
                            <!-- 转入操作人id -->
                            <recipient>
                                <reference value="ref1pra2" />
                            </recipient>
                        </ReferralRequest>
                </contained>
                <#if ipnTransferDepartmentRecordsId??>
                <!-- 转科记录id -->
                <identifier>
                    <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/ipn-transfer-department-records-id" />
                    <value value="${ipnTransferDepartmentRecordsId}" />
                </identifier>
                </#if>
                <#if date??>
                <!-- 记录日期 -->
                <date value="${date?string("yyyy-MM-dd")}T${date?string("HH:mm:ss")}" />
                </#if>
                <!-- 文档类型：转科记录 -->
                <type>
                    <coding>
                        <system value="2.16.156.10011.2.4" />
                        <code value="C0042" />
                    </coding>
                    <text value="转科记录" />
                </type>
                <!-- 文档标题：转科记录 -->
                <title value="转科记录" />
                <!-- 状态：preliminary初步 final最终amended修订entered-in-error错误 -->
                <status value="final" />
                <!-- 保密等级：U:不受限制的 L:低等级 M:中等 N:常规 R:保密的 V:十分机密的 -->
                <confidentiality value="N" />
                <!-- 居民信息 -->
                <subject>
                    <reference value="#pat1" />
                </subject>
                <!-- 指定创作者 -->
                <author>
                    <reference value="#pra1" />
                </author>
                <custodian>
                    <reference value="#hos1" />
                </custodian>
                <!-- 门诊或住院信息 -->
                <encounter>
                    <reference value="#e1" />
                </encounter>
                <!-- 主诉 -->
                <section>
                    <title value="主诉" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="10154-3" />
                            <display value="CHIEF COMPLAINT" />
                        </coding>
                    </code>
                    <entry>
                        <reference value="#e1"/>
                    </entry>
                </section>
                <!-- 入院诊断 -->
                <section>
                    <title value="入院诊断" />
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
                <!-- 诊断记录 -->
                <section>
                    <title value="诊断记录" />
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
                <!-- 转科记录 -->
                <section>
                    <title value="转科记录" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="99999-17" />
                            <display value="转科记录" />
                        </coding>
                    </code>
                    <entry>
                        <reference value="#ref1"/>
                    </entry>
                </section>
                <!-- 治疗计划 -->
                <section>
                    <#if referralrequestTreatmentOptions??>
                    <!--转入诊疗计划 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/referralrequest-treatment-options">
                        <valueString value="${referralrequestTreatmentOptions}" />
                    </extension>
                    </#if>
                    <#if therapeuticPrinciples??>
                    <!--治则治法GBT167513 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/therapeutic-principles">
                        <valueCode value="${therapeuticPrinciples}" />
                    </extension>
                    </#if>
                    <#if mattersNeedingAttention??>
                    <!--注意事项 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/matters-needing-attention">
                        <valueString value="${mattersNeedingAttention}" />
                    </extension>
                    </#if>
                    <title value="治疗计划" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="18776-5" />
                            <display value="TREATMENT PLAN" />
                        </coding>
                    </code>
                </section>
                <!-- 用药 -->
                <section>
                    <title value="用药" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="10160-0" />
                            <display value="HISTORY OFMEDICATION USE" />
                        </coding>
                    </code>
                    <entry>
                        <reference value="#me1"/>
                    </entry>
                </section>
                <!-- 住院过程 -->
                <section>
                    <#if treatRescueCourse??>
                    <!-- 诊疗过程描述 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/treat-rescue-course">
                        <valueString value="${treatRescueCourse}" />
                    </extension>
                    </#if>
                    <title value="住院过程" />
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