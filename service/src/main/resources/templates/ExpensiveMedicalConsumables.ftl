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
            <!-- 资源：高值耗材使用记录 -->
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
                <!-- 责任护士 -->
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra2" />
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
                <!-- 用药、医嘱 -->
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
                            <method>
                                <coding>
                                    <!-- 特殊用法代码命名空间 -->
                                    <system
                                        value="http://www.nestvision.com/platform/app/data/v1/code/c-med-code" />
                                    <#if cMedCode??>
                                    <!-- 特殊用法代码 -->
                                    <code value="${cMedCode}" />
                                    </#if>
                                </coding>
                            </method>
                            <doseQuantity>
                                <#if onceValue??>
                                <!-- 用药次剂量 -->
                                <value value="${onceValue}" />
                                </#if>
                                <#if onceUnit??>
                                <!-- 用药次剂量单位 -->
                                <unit value="${onceUnit}" />
                                </#if>
                            </doseQuantity>
                        </dosageInstruction>
                    </MedicationOrder>
                </contained>
                <!-- 耗材信息 -->
                <contained>
                    <Substance xmlns="http://hl7.org/fhir">
                        <id value="sub1"/>
                        <#if factoryName??>
                        <!-- 产品生产厂家 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/text/factory-name">
                            <valueString value="${factoryName}"/>
                        </extension>
                        </#if>
                        <#if providerName??>
                        <!-- 产品供应商 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/text/provider-name">
                            <valueString value="${providerName}"/>
                        </extension>
                        </#if>
                        <#if implantableConsumablesFlg??>
                        <!-- 植入性耗材标志 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/boolean/implantable-consumables-flg">
                            <valueBoolean value="${implantableConsumablesFlg?string("true","false")}"/>
                        </extension>
                        </#if>
                        <#if useWay??>
                        <!-- 使用途径 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/text/use-way">
                            <valueString value="${useWay}"/>
                        </extension>
                        </#if>
                        <#if substanceId??>
                        <!-- 原系统耗材id -->
                        <identifier>
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/substance-id"/>
                            <value value="${substanceId}"/>
                        </identifier>
                        </#if>
                        
                        <!-- 材料名称 -->
                        <code>
                            <coding>
                                <system value="http://www.nestvision.com/platform/app/data/v1/code/substance-cd"/>
                                <#if substanceCd??>
                                <code value="${substanceCd}"/>
                                </#if>
                                <#if substanceName??>
                                <display value="备皮包"/>
                                </#if>
                            </coding>
                        </code>
                        <instance>
                            <#if expiry??>
                            <!-- 有效期 -->
                            <expiry value="${expiry?string("yyyy-MM-dd")}"/>
                            </#if>
                            <quantity>
                                <#if quantityValue??>
                                <!-- 数量 -->
                                <value value="${quantityValue}"/>
                                </#if>
                                <#if quantityUnit??>
                                <!-- 单位 -->
                                <unit value="${quantityUnit}"/>
                                </#if>
                            </quantity>
                        </instance>
                    </Substance>
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
                <#if expensiveMedicalConsumablesUsageRecordsId??>
                <!-- 高值耗材使用记录id -->
                <identifier>
                    <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/expensive-medical-consumables-usage-records-id" />
                    <value value="${expensiveMedicalConsumablesUsageRecordsId}" />
                </identifier>
                </#if>
                <#if date??>
                <!-- 记录日期 -->
                <date value="${date?string("yyyy-MM-dd")}T${date?string("HH:mm:ss")}" />
                </#if>
                <!-- 文档类型：高值耗材使用记录 -->
                <type>
                    <coding>
                        <system value="2.16.156.10011.2.4" />
                        <code value="C0022" />
                    </coding>
                    <text value="高值耗材使用记录" />
                </type>
                <!-- 文档标题：高值耗材使用记录 -->
                <title value="高值耗材使用记录" />
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
                        <reference value="#pra2" />
                    </party>
                </attester>
                <!-- 文档管理机构信息 -->
                <custodian>
                    <reference value="#hos1" />
                </custodian>
                <!-- 住院 -->
                <encounter>
                    <reference value="#e1" />
                </encounter>
                <!-- 诊断章节 -->
                <section>
                    <title value="诊断章节" />
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
                <!-- 高值耗材章节（同用药章节） -->
                <section>
                    <title value="高值耗材章节（同用药章节）" />
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
                    <entry>
                        <reference value="#sub1"/>
                    </entry>
                </section>
            </Composition>
        </resource>
    </entry>
</Bundle>