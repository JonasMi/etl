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
            <!-- 资源：出院记录 -->
            <Composition xmlns="http://hl7.org/fhir">
                <!-- Organization -->
                <contained>
                    <Organization xmlns="http://hl7.org/fhir">
                        <id value="hos1" />
                        <identifier>
                            <!-- 原系统机构ID号命名空间 -->
                            <system value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/hospital-id" />
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
                <!-- Patient -->
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
                                value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/patient-id" />
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
                    </Patient>
                </contained>
                <!-- Practitioner -->
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra1" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/employee-id" />
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
                <!-- Practitioner -->
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra2" />
                        <#if residentDoctorSignDate??>
                        <!-- 签名日期 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/datetime/signature-date">
                            <valueDateTime value="${residentDoctorSignDate?string("yyyy-MM-dd")}"/>
                        </extension>
                        </#if>
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/employee-id" />
                            <#if residentDoctorId??>
                            <!-- 院内人员ID号 -->
                            <value value="${residentDoctorId}" />
                            </#if>
                        </identifier>
                        <name>
                            <#if residentDoctorName??>
                            <!-- 姓名 -->
                            <text value="${residentDoctorName}" />
                            </#if>
                        </name>
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
                <!-- Practitioner -->
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
                            <system value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/employee-id" />
                            <#if attendingDoctorId??>
                            <!-- 院内人员ID号 -->
                            <value value="${attendingDoctorId}" />
                            </#if>
                        </identifier>
                        <name>
                            <#if attendingDoctorName??>
                            <!-- 姓名 -->
                            <text value="${attendingDoctorName}" />
                            </#if>
                        </name>
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
                <!-- Practitioner -->
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
                            <system value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/employee-id" />
                            <#if directorDoctorId??>
                            <!-- 院内人员ID号 -->
                            <value value="${directorDoctorId}" />
                            </#if>
                        </identifier>
                        <name>
                            <#if directorDoctorName??>
                            <!-- 姓名 -->
                            <text value="${directorDoctorName}" />
                            </#if>
                        </name>
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
                <!-- Encounter -->
                <contained>
                    <Encounter xmlns="http://hl7.org/fhir">
                        <id value="e1" />
                        <contained>
                            <Location xmlns="http://hl7.org/fhir">
                                <id value="e1l1" />
                                <identifier>
                                    <!--原系统床位ID号命名空间 -->
                                    <system value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/bed-id" />
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
                                        value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/department-id" />
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
                                                value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/hospital-id" />
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
                                        value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/department-id" />
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
                            <system value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/inpatient-registration-id" />
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
                <!-- Condition -->
                <contained>
                    <!-- 入院诊断 -->
                    <Condition xmlns="http://hl7.org/fhir">
                        <id value="con1" />
                        <patient />
                        <code>
                            <coding>
                                <!--诊断编码 -->
                                <system value="urn:oid:2.16.156.10011.2.3.3.11" />
                                <#if inAdmissionDiagnosis??>
                                <!--诊断编码 -->
                                <code value="${inAdmissionDiagnosis}" />
                                </#if>
                                <#if inAdmissionDiagnosisName??>
                                <display value="${inAdmissionDiagnosisName}" />
                                </#if>
                            </coding>
                        </code>
                        <verificationStatus />
                        <#if inDiagnosisDate??>
                        <!-- 诊断日期 -->
                        <onsetDateTime value="${inDiagnosisDate?string("yyyy-MM-dd")}" />
                        </#if>
                    </Condition>
                </contained>
                <!-- MedicationOrder -->
                <contained>
                    <MedicationOrder xmlns="http://hl7.org/fhir">
                        <id value="me1" />
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
                <!-- 出院诊断 -->
                <contained>
                    <Condition xmlns="http://hl7.org/fhir">
                        <id value="con2" />
                        <#if outCnSymDiagCode??>
                        <!--中医症候代码CV9900357 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/code/cn-sym-diag-code">
                        <valueCode value="${outCnSymDiagCode}" />
                        </extension>
                        </#if>
                        <#if outCnDisDiagCode??>
                        <!--中医病名代码CV9900357 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/code/cn-dis-diag-code">
                        <valueCode value="${outCnDisDiagCode}" />
                        </extension>
                        </#if>
                        <#if outDischargeSymptomAndSign??>
                        <!--出院时症状与体征 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/text/discharge-symptom-and-sign">
                            <valueString value="${outDischargeSymptomAndSign}" />
                        </extension>
                        </#if>
                        <#if outDischargeCircumstance??>
                        <!--出院情况 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/text/discharge-circumstance">
                            <valueString value="${outDischargeCircumstance}" />
                        </extension>
                        </#if>
                        <#if outDischargeAdvice??>
                        <!-- 出院医嘱 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/text/discharge-advice">
                            <valueString value="${outDischargeAdvice}" />
                        </extension>
                        </#if>
                        <patient />
                        <code>
                            <coding>
                                <!--诊断编码 -->
                                <system value="urn:oid:2.16.156.10011.2.3.3.11" />
                                <#if outAdmissionDiagnosis??>
                                <!--诊断编码 -->
                                <code value="${outAdmissionDiagnosis}" />
                                </#if>
                                <#if outAdmissionDiagnosisName??>
                                <display value="${outAdmissionDiagnosisName}" />
                                </#if>
                            </coding>
                        </code>
                        <verificationStatus />
                        <#if outDiagnosisDate??>
                        <!-- 诊断日期 -->
                        <onsetDateTime value="${outDiagnosisDate?string("yyyy-MM-dd")}" />
                        </#if>
                    </Condition>
                </contained>
                <#if hcrDischargeRecordId??>
                <!-- 出院记录id -->
                <identifier>
                    <system value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/hcr-discharge-record-id" />
                    <value value="${hcrDischargeRecordId}" />
                </identifier>
                </#if>
                <#if date??>
                <!-- 记录日期 -->
                <date value="${date?string("yyyy-MM-dd")}T${date?string("HH:mm:ss")}" />
                </#if>
                <!-- 文档类型：出院记录 -->
                <type>
                    <coding>
                        <system value="2.16.156.10011.2.4" />
                        <code value="C0049" />
                    </coding>
                    <text value="出院记录" />
                </type>
                <!-- 文档标题：出院记录 -->
                <title value="出院记录" />
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
                <!-- 住院医师 -->
                <attester>
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
                        <valueCode value="04"/>
                    </extension>
                    <mode value="legal" />
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
                    <party>
                        <reference value="#pra4"/>
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
                <!-- 主要健康问题 -->
                <section>
                    <#if hthInpatientDetails??>
                    <!-- 入院情况 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/inpatient-details">
                        <valueString value="${hthInpatientDetails}"/>
                    </extension>
                    </#if>
                    <title value="主要健康问题" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="11450-4" />
                            <display value="Problem list" />
                        </coding>
                    </code>
                </section>
                <!-- 出院诊断记录 -->
                <section>
                    <title value="出院诊断记录" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="11535-2" />
                            <display value="Discharge Diagnosis" />
                        </coding>
                    </code>
                    <entry>
                        <reference value="#con2"/>
                    </entry>
                </section>
                <!-- 入院诊断 -->
                <section>
                    <#if inPositiveAuxInspectionResult??>
                    <!-- 阳性辅助检查结果 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/positive-aux-inspection-result">
                        <valueString value="${inPositiveAuxInspectionResult}" />
                    </extension>
                    </#if>
                    <#if inTherapeuticPrinciples??>
                    <!--治则治法 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/therapeutic-principles">
                        <valueString value="${inTherapeuticPrinciples}" />
                    </extension>
                    </#if>
                    <title value="入院诊断" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="11535-2" />
                            <display value="HOSPITAL DISCHARGE DX" />
                        </coding>
                    </code>
                    <entry>
                        <reference value="#con1"/>
                    </entry>
                </section>
                <!-- 住院过程 -->
                <section>
                    <#if inTreatRescueCourse??>
                    <!-- 诊疗过程描述 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/treat-rescue-course">
                        <valueString value="${inTreatRescueCourse}" />
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
                <!-- 医嘱用药 -->
                <section>
                    <title value="医嘱用药" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="46209-3" />
                            <display value="Provider Orders" />
                        </coding>
                    </code>
                    <entry>
                        <reference value="#me1"/>
                    </entry>
                </section>
            </Composition>
        </resource>
    </entry>
</Bundle>