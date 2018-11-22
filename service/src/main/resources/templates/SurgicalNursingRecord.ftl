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
            <!-- 资源：手术护理记录 -->
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
                <!-- 交接护士 -->
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra2" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                            <#if transferNurseId??>
                            <!-- 院内人员ID号 -->
                            <value value="${transferNurseId}" />
                            </#if>
                        </identifier>
                        <name>
                            <#if transferNurseName??>
                            <!-- 姓名 -->
                            <text value="${transferNurseName}" />
                            </#if>
                        </name>
                    </Practitioner>
                </contained>
                <!-- 转运者 -->
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra3" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                            <#if transportersNurseId??>
                            <!-- 院内人员ID号 -->
                            <value value="${transportersNurseId}" />
                            </#if>
                        </identifier>
                        <name>
                            <#if transportersNurseName??>
                            <!-- 姓名 -->
                            <text value="${transportersNurseName}" />
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
                                        <!-- 医院名称 -->
                                        <#if upHospitalName??>
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
                <!-- 手术 -->
                <contained>
                    <Procedure>
                        <id value="pro1"/>
                        <!-- 手术操作者 -->
                        <contained>
                            <Practitioner xmlns="http://hl7.org/fhir">
                                <id value="pro1pra0" />
                                <identifier>
                                    <!-- 院内人员ID号命名空间 -->
                                    <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                                    <#if operative??>
                                    <!-- 院内人员ID号 -->
                                    <value value="${operative}" />
                                    </#if>
                                </identifier>
                                <name>
                                    <#if operativeName??>
                                    <!-- 姓名 -->
                                    <text value="${operativeName}" />
                                    </#if>
                                </name>
                            </Practitioner>
                        </contained>
                        <!-- 巡台护士 -->
                        <contained>
                            <Practitioner xmlns="http://hl7.org/fhir">
                                <id value="pro1pra1" />
                                <identifier>
                                    <!-- 院内人员ID号命名空间 -->
                                    <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                                    <#if patrolNurse??>
                                    <!-- 院内人员ID号 -->
                                    <value value="${patrolNurse}" />
                                    </#if>
                                </identifier>
                                <name>
                                    <#if patrolNurseName??>
                                    <!-- 姓名 -->
                                    <text value="${patrolNurseName}" />
                                    </#if>
                                </name>
                            </Practitioner>
                        </contained>
                        <!-- 器械护士 -->
                        <contained>
                            <Practitioner xmlns="http://hl7.org/fhir">
                                <id value="pro1pra2" />
                                <identifier>
                                    <!-- 院内人员ID号命名空间 -->
                                    <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
                                    <#if equipmentManager??>
                                    <!-- 院内人员ID号 -->
                                    <value value="${equipmentManager}" />
                                    </#if>
                                </identifier>
                                <name>
                                    <#if equipmentManagerName??>
                                    <!-- 姓名 -->
                                    <text value="${equipmentManagerName}" />
                                    </#if>
                                </name>
                            </Practitioner>
                        </contained>
                        <#if incisionTypeCode??>
                        <!-- 切口类别代码 -->
                        <extension url="urn:oid:2.16.156.10011.2.3.1.256">
                            <valueCode value="${incisionTypeCode}" />
                        </extension>
                        </#if>
                        <#if incisionHealingRankCode??>
                        <!-- 切口愈合级别代码 -->
                        <extension url="urn:oid:2.16.156.10011.2.3.1.257">
                            <valueCode value="${incisionHealingRankCode}" />
                        </extension>
                        </#if>
                        <#if operationCourses??>
                        <!-- 手术过程 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/text/operation-course">
                            <valueString value="${operationCourses}" />
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
                                <#if anesthesiaCode??>
                                <!-- 麻醉方法代码 -->
                                <code value="${anesthesiaCode}" />
                                </#if>
                                <#if anesthesiaWay??>
                                <!-- 麻醉方法 -->
                                <display value="${anesthesiaWay}" />
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
                                <reference value="#pro1pra0" />
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
                            <!-- 巡台护士id -->
                            <actor>
                                <reference value="#pro1pra1" />
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
                            <!-- 器材管理者id -->
                            <actor>
                                <reference value="#pro1pra2"/>
                            </actor>
                            <role>
                                <coding>
                                    <!-- 角色代码命名空间 -->
                                    <system value="http://hl7.org/fhir/ValueSet/performer-role" />
                                    <!-- 角色代码：器材管理者 -->
                                    <code value="310194009" />
                                </coding>
                                <!-- 角色名称 -->
                                <text value="器材管理者" />
                            </role>
                        </performer>
                        <performedPeriod>
                            <#if procedureStart??>
                            <!-- 手术开始时间 -->
                            <start value="${procedureStart?string("yyyy-MM-dd")}T${procedureStart?string("HH:mm:ss")}" />
                            </#if>
                            <#if procedureEnd??>
                            <!-- 手术结束时间 -->
                            <end value="${procedureEnd?string("yyyy-MM-dd")}T${procedureEnd?string("HH:mm:ss")}" />
                            </#if>
                        </performedPeriod>
                    </Procedure>
                </contained>
                <#if visitingType??>
                <!-- 就诊类型 -->
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/code/visiting-type">
                    <valueCode value="${visitingType}" />
                </extension>
                </#if>
                <#if surgicalNursingRecordId??>
                <!-- 手术护理记录id -->
                <identifier>
                    <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/surgical-nursing-record-id" />
                    <value value="${surgicalNursingRecordId}" />
                </identifier>
                </#if>
                <#if date??>
                <!-- 记录日期 -->
                <date value="${date?string("yyyy-MM-dd")}T${date?string("HH:mm:ss")}" />
                </#if>
                <!-- 文档类型：手术护理记录 -->
                <type>
                    <coding>
                        <system value="2.16.156.10011.2.4" />
                        <code value="C0019" />
                    </coding>
                    <text value="手术护理记录" />
                </type>
                <!-- 文档标题：手术护理记录 -->
                <title value="手术护理记录" />
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
                <!-- 交接护士 -->
                <attester>
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
                        <valueCode value="24" />
                    </extension>
                    <!-- 对于该文档的意义：个人 -->
                    <mode value="personal" />
                    <#if transferNurseDate??>
                    <!-- 签名日期 -->
                    <time value="${transferNurseDate?string("yyyy-MM-dd")}T${transferNurseDate?string("HH:mm:ss")}" />
                    </#if>
                    <party>
                        <reference value="#pra2" />
                    </party>
                </attester>
                <!-- 转运者 -->
                <attester>
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
                        <valueCode value="25" />
                    </extension>
                    <!-- 对于该文档的意义：个人 -->
                    <mode value="personal" />
                    <#if transportersNurseDate??>
                    <!-- 签名日期 -->
                    <time value="${transportersNurseDate?string("yyyy-MM-dd")}T${transportersNurseDate?string("HH:mm:ss")}" />
                    </#if>
                    <party>
                        <reference value="#pra3" />
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
                <!-- 术前诊断章节 -->
                <section>
                    <title value="术前诊断章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="10219-4" />
                            <display value="Surgical operation note preoperative DX" />
                        </coding>
                    </code>
                    <entry>
                        <reference value="#con1"/>
                    </entry>
                </section>
                <!-- 生命体征章节 -->
                <section>
                    <#if weight??>
                    <!-- 体重(kg) -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/number/weight">
                        <valueDecimal value="${weight}" />
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
                <!-- 皮肤章节 -->
                <section>
                    <#if skinCheckDescription??>
                    <!-- 皮肤检查描述 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/skin-check-description">
                        <valueString value="${skinCheckDescription}" />
                    </extension>
                    </#if>
                    <title value="皮肤章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="29302-7" />
                            <display value="INTEGUMENTARY SYSTEM" />
                        </coding>
                    </code>
                </section>
                <!-- 过敏史章节 -->
                <section>
                    <#if inpatAlleMark??>
                    <!--患者过敏史标志 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/inpat-alle-mark">
                        <valueCode value="${inpatAlleMark}" />
                    </extension>
                    </#if>
                    <#if rritability??>
                    <!-- 过敏史描述 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/rritability">
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
                <!--  护理记录章节 -->
                <section>
                    <#if nursingType??>
                    <!-- 护理等级代码CV9900330 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/nursing-type">
                        <valueCode value="${nursingType}"/>
                    </extension>
                    </#if>
                    <#if nursingGrade??>
                    <!-- 护理类型代码表CV9900331 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/nursing-grade">
                        <valueCode value="${nursingGrade}"/>
                    </extension>
                    </#if>
                    <title value="护理记录章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="99999-19" />
                            <display value="Nursing record" />
                        </coding>
                    </code>
                </section>
                <!-- 护理观察章节 -->
                <section>
                    <#if observationProjectName??>
                    <!-- 护理观察项目名称 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/observation-project-name">
                        <valueString value="${observationProjectName}" />
                    </extension>
                    </#if>
                    <#if observationResultsDescription??>
                    <!-- 护理观察结果 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/observation-results-description">
                        <valueString value="${observationResultsDescription}" />
                    </extension>
                    </#if>
                    <title value="护理观察章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="99999-22" />
                            <display value="Nursing observation" />
                        </coding>
                    </code>
                </section>
                <!-- 护理操作章节 -->
                <section>
                    <#if nursingName??>
                    <!-- 护理操作名称 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/nursing-name">
                        <valueString value="${nursingName}"/>
                    </extension>
                    </#if>
                    <#if nursingItemName??>
                    <!-- 护理操作项目类目名称 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/nursing-item-name">
                        <valueString value="${nursingItemName}"/>
                    </extension>
                    </#if>
                    <#if nursingResultDescription??>
                    <!-- 护理操作结果描述 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/nursing-result-description">
                        <valueString value="${nursingResultDescription}"/>
                    </extension>
                    </#if>
                    <title value="护理操作章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="99999-23" />
                            <display value="Nursing operation" />
                        </coding>
                    </code>
                </section>
                <!-- 器械物品核对章节 -->
                <section>
                    <#if operationItemsName??>
                    <!-- 术中所用物品名称 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/operation-items-name">
                        <valueString value="${operationItemsName}"/>
                    </extension>
                    </#if>
                    <#if ifPreoperativeInventory??>
                    <!-- 术前清点标志 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/boolean/if-preoperative-inventory">
                        <valueBoolean value="${ifPreoperativeInventory?string("true","false")}" />
                    </extension>
                    </#if>
                    <#if ifPreMaterialCheck??>
                    <!-- 关前核对标志 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/boolean/if-pre-material-check">
                        <valueBoolean value="${ifPreMaterialCheck?string("true","false")}" />
                    </extension>
                    </#if>
                    <#if ifPostMaterialCheck??>
                    <!-- 关后核对标志 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/boolean/if-post-material-check">
                        <valueBoolean value="${ifPostMaterialCheck?string("true","false")}" />
                    </extension>
                    </#if>
                    <title value="器械物品核对章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="99999-25" />
                            <display value="术前器械物品核对" />
                        </coding>
                    </code>
                    <entry>
                        <reference value="#pro1"/>
                    </entry>
                </section>
                <!-- 手术操作章节 -->
                <section>
                    <#if opPathologyDn??>
                    <!-- 术中病理标志 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/boolean/op-pathology-dn">
                        <valueBoolean value="${opPathologyDn?string("true","false")}" />
                    </extension>
                    </#if>
                    <#if preOperativePreparation??>
                    <!-- 准备事项 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/pre-operative-preparation">
                        <valueString value="${preOperativePreparation}"/>
                    </extension>
                    </#if>
                    <#if opRoomNo??>
                    <!-- 手术间编号 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/op-room-no">
                        <valueString value="${opRoomNo}"/>
                    </extension>
                    </#if>
                    <#if inOperatingRoomTime??>
                    <!-- 入手术室日期时间 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/datetime/in-operating-room-time">
                        <valueDateTime value="${inOperatingRoomTime?string("yyyy-MM-dd")}T${inOperatingRoomTime?string("HH:mm:ss")}"/>
                    </extension>
                    </#if>
                    <#if outOperatingRoomTime??>
                    <!-- 出手术室日期时间 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/datetime/out-operating-room-time">
                        <valueDateTime value="${outOperatingRoomTime?string("yyyy-MM-dd")}T${outOperatingRoomTime?string("HH:mm:ss")}"/>
                    </extension>
                    </#if>
                    <title value="手术操作章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="47519-4" />
                            <display value="HISTORY OF PROCEDURES" />
                        </coding>
                    </code>
                    <!-- 手术 -->
                    <entry>
                        <reference value="#pro1" />
                    </entry>
                </section>
                <!-- 住院过程章节 -->
                <section>
                    <#if patHandoverItem??>
                    <!-- 病人交接核对项目 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/pat-handover-item">
                        <valueString value="${patHandoverItem}" />
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