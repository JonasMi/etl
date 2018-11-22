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
            <!-- 资源：死亡记录 -->
            <Composition xmlns="http://hl7.org/fhir">
                <!-- 文档管理机构 -->
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
                        <#if educationCd??>
                        <!-- 学历代码 GBT4658 -->
                        <extension url="urn:oid:2.16.156.10011.2.3.3.6">
                            <valueCode value="${educationCd}" />
                        </extension>
                        </#if>
                        <#if birthProCode??>
                        <!-- 出生地省代码GBT2260(2013版) -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/birth-pro-code">
                            <valueCode value="${birthProCode}" />
                        </extension>
                        </#if>
                        <#if birthCityCode??>
                        <!-- 出生地市代码GBT2260(2013版) -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/birth-city-code">
                            <valueCode value="${birthCityCode}" />
                        </extension>
                        </#if>
                        <#if birthCouCode??>
                        <!-- 出生地县代码GBT2260(2013版) -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/birth-cou-code">
                            <valueCode value="${birthCouCode}" />
                        </extension>
                        </#if>
                        <#if birthAddressVillage??>
                        <!-- 出生地址的村或城市的街、路、里、弄等名称 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/birth-address-village">
                            <valueString value="${birthAddressVillage}" />
                        </extension>
                        </#if>
                        <#if nationalityCode??>
                        <!-- 国籍代码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/nationality-code">
                            <valueCode value="${nationalityCode}" />
                        </extension>
                        </#if>
                        <#if administration??>
                        <!-- 行政区划代码GBT2260(2013版) -->
                        <extension url="urn:oid:2.16.156.10011.2.3.3.2">
                            <valueCode value="${administration}" />
                        </extension>
                        </#if>
                        <#if workUnit??>
                        <!-- 工作单位 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/work-unit">
                            <valueString value="${workUnit}" />
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
                            <!-- 工作单位电话号码 -->
                            <value value="${telecom}" />
                            </#if>
                            <!-- 使用方式:工作 -->
                            <use value="work" />
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
                            <#if homeRoad??>
                            <!-- 地址-村（街、路、弄等）-->
                            <extension
                                url="http://www.nestvision.com/platform/app/data/v1/text/address-road">
                                <valueString value="${homeRoad}" />
                            </extension>
                            </#if>
                            <#if homeHouseNo??>
                            <!--地址-门牌号码 -->
                            <extension
                                url="http://www.nestvision.com/platform/app/data/v1/text/house-no">
                                <valueString value="${homeHouseNo}" />
                            </extension>
                            </#if>
                            <#if homePostCd??>
                            <!--家庭地址邮政编码 -->
                            <extension
                                url="http://www.nestvision.com/platform/app/data/v1/text/post-cd">
                                <valueString value="${homePostCd}" />
                            </extension>
                            </#if>
                            <!-- 地址类别代码:家庭住址 -->
                            <use value="home" />
                            <#if homeText??>
                            <!-- 地址详细信息 -->
                            <text value="${homeText}" />
                            </#if>
                            <#if homeLine??>
                            <!-- 地址-乡（镇、街道办事处） -->
                            <line value="${homeLine}" />
                            </#if>
                            <#if homeCity??>
                            <!-- 地址-市（地区） -->
                            <city value="${homeCity}" />
                            </#if>
                            <#if homeDistrict??>
                            <!-- 地址-县（区） -->
                            <district value="${homeDistrict}" />
                            </#if>
                            <#if homeState??>
                            <!-- 地址-省（自治区、直辖市） -->
                            <state value="${homeState}" />
                            </#if>
                        </address>
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
                            <#if tempText??>
                            <!-- 地址详细信息 -->
                            <text value="${tempText}" />
                            </#if>
                            <#if tempLine??>
                            <!-- 地址-乡（镇、街道办事处） -->
                            <line value="16" />
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
                        <address>
                            <#if workRoad??>
                            <!-- 地址-村（街、路、弄等） -->
                            <extension
                                url="http://www.nestvision.com/platform/app/data/v1/text/address-road">
                                <valueString value="${workRoad}" />
                            </extension>
                            </#if>
                            <#if workHouseNo??>
                            <!--地址-门牌号码 -->
                            <extension
                                url="http://www.nestvision.com/platform/app/data/v1/text/house-no">
                                <valueString value="${workHouseNo}" />
                            </extension>
                            </#if>
                            <#if workPostCd??>
                            <!--工作单位邮政编码 -->
                            <extension
                                url="http://www.nestvision.com/platform/app/data/v1/text/post-cd">
                                <valueString value="${workPostCd}" />
                            </extension>
                            </#if>
                            <!-- 地址类别代码:工作单位地址 -->
                            <use value="work" />
                            <#if workAddressDetails??>
                            <!-- 地址详细信息 -->
                            <text value="${workAddressDetails}" />
                            </#if>
                            <#if workLine??>
                            <!-- 地址-乡（镇、街道办事处） -->
                            <line value="${workLine}" />
                            </#if>
                            <#if workCity??>
                            <!-- 地址-市（地区）-->
                            <city value="${workCity}" />
                            </#if>
                            <#if workDistrict??>
                            <!-- 地址-县（区） -->
                            <district value="${workDistrict}" />
                            </#if>
                            <#if workState??>
                            <!-- 地址-省（自治区、直辖市） -->
                            <state value="${workState}" />
                            </#if>
                        </address>
                        <maritalStatus>
                            <coding>
                                <!-- 婚姻状况代码命名空间 -->
                                <system value="urn:oid:2.16.156.10011.2.3.3.5" />
                                <#if maritalstatus??>
                                <!-- 婚姻状况代码 -->
                                <code value="${maritalstatus}" />
                                </#if>
                            </coding>
                        </maritalStatus>
                        <!-- 联系人的信息 -->
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
                                <#if contactsAddressDetails??>
                                <!-- 联系人地址详细信息 -->
                                <text value="${contactsAddressDetails}" />
                                </#if>
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
                        <#if authorName??>
                        <name>
                            <!-- 姓名 -->
                            <text value="${authorName}" />
                        </name>
                        </#if>
                    </Practitioner>
                </contained>
                <!-- 住院医师 -->
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra2" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
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
                <!-- 主治医师 -->
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra3" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
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
                <!-- 主任医师 -->
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra4" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
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
                <!-- 住院登记信息 -->
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
                        <id value="con1" />
                        <#if inpatientDiagDetails??>
                        <!-- 入院情况 -->
                        <extension url="http://www.nestvision.com/platform/app/data/v1/text/inpatient-details">
                            <valueString value="${inpatientDiagDetails}"/>
                        </extension>
                        </#if>
                        <patient />
                        <code>
                            <coding>
                                <!--诊断编码 -->
                                <system value="urn:oid:2.16.156.10011.2.3.3.11" />
                                <#if inpatientDiagCode??>
                                <!--诊断编码 -->
                                <code value="${inpatientDiagCode}" />
                                </#if>
                                <#if inpatientDiagName??>
                                <display value="${inpatientDiagName}" />
                                </#if>
                            </coding>
                        </code>
                        <category>
                            <coding>
                                <system
                                    value="http://www.nestvision.com/platform/app/data/v1/code/condition-types" />
                                <code value="3" />
                                <display value="入院初步诊断" />
                            </coding>
                        </category>
                        <verificationStatus />
                        <#if inpatientDiagDate??>
                        <!-- 诊断日期 -->
                        <onsetDateTime value="${inpatientDiagDate?string("yyyy-MM-dd")}" />
                        </#if>
                    </Condition>
                </contained>
                <#if visitingTime??>
                <!-- 就诊时间 -->
                <extension url="http://www.nestvision.com/platform/app/data/v1/datetime/visiting-time">
                    <valueDateTime value="${visitingTime?string("yyyy-MM-dd")}T${visitingTime?string("HH:mm:ss")}"/>
                </extension>
                </#if>
                <!-- 死因链信息 -->
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/extension/cause-chain-informations">
                    <#if hcrDeathCauseLineRecords??>
                    <#list hcrDeathCauseLineRecords as hcrDeathCauseLineRecord>    
                    <!-- 死因链信息1 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/extension/cause-chain-information">
                        <#if hcrDeathCauseLineRecord.chainDeathChain??>
                        <!-- 死因链序列号 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/death-chain">
                            <valueString value="${hcrDeathCauseLineRecord.chainDeathChain}" />
                        </extension>
                        </#if>
                        <#if hcrDeathCauseLineRecord.chainDeathSequenceCode??>
                        <!-- 死因链-顺序代码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/death-sequence-code">
                            <valueCode value="${hcrDeathCauseLineRecord.chainDeathSequenceCode}" />
                        </extension>
                        </#if>
                        <#if hcrDeathCauseLineRecord.chainDeathIllnessCode??>
                        <!-- 死因链-疾病代码 -->
                        <extension
                            url="urn:oid:2.16.156.10011.2.3.3.11">
                            <valueCode value="${hcrDeathCauseLineRecord.chainDeathIllnessCode}" />
                        </extension>
                        </#if>
                        <#if hcrDeathCauseLineRecord.chainTimeIntervalUnitCode??>
                        <!-- 时间间隔-单位代码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/time-interval-unit-code">
                            <valueCode value="${hcrDeathCauseLineRecord.chainTimeIntervalUnitCode}" />
                        </extension>
                        </#if>
                        <#if hcrDeathCauseLineRecord.chainTimeIntervalTime??>
                        <!-- 时间间隔-时长 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/time-interval-time">
                            <valueDecimal value="${hcrDeathCauseLineRecord.chainTimeIntervalTime}" />
                        </extension>
                        </#if>
                        <#if hcrDeathCauseLineRecord.chainDeathCause??>
                        <!-- 死因链-死亡原因详细描述 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/death-cause">
                            <valueString value="${hcrDeathCauseLineRecord.chainDeathCause}" />
                        </extension>
                        </#if>
                    </extension>
                    </#list>
                    </#if>
                </extension>
                <#if hcrDeathRecordId??>
                <!-- 死亡记录id -->
                <identifier>
                    <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/hcr-death-record-id" />
                    <value value="${hcrDeathRecordId}" />
                </identifier>
                </#if>
                <#if date??>
                <!-- 记录日期 -->
                <date value="${date?string("yyyy-MM-dd")}T${date?string("HH:mm:ss")}" />
                </#if>
                <!-- 文档类型：死亡记录 -->
                <type>
                    <coding>
                        <system value="2.16.156.10011.2.4" />
                        <code value="C0050" />
                    </coding>
                    <text value="死亡记录" />
                </type>
                <!-- 文档标题：死亡记录 -->
                <title value="死亡记录" />
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
                <!-- 住院医师 -->
                <attester>
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
                        <valueCode value="04"/>
                    </extension>
                    <mode value="legal" />
                    <#if residentDoctorSignDate??>
                    <!-- 签名日期 -->
                    <time value="${residentDoctorSignDate?string("yyyy-MM-dd")}T${residentDoctorSignDate?string("HH:mm:ss")}"/>
                    </#if>
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
                    <#if attendingDoctorSignDate??>
                    <!-- 签名日期 -->
                    <time value="${attendingDoctorSignDate?string("yyyy-MM-dd")}T${attendingDoctorSignDate?string("HH:mm:ss")}"/>
                    </#if>
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
                    <#if directorDoctorSignDate??>
                    <!-- 签名日期 -->
                    <time value="${directorDoctorSignDate?string("yyyy-MM-dd")}T${directorDoctorSignDate?string("HH:mm:ss")}"/>
                    </#if>
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
                <!-- 死亡原因章节 -->
                <section>
                    <#if deathCauseCode??>
                    <!-- 死亡原因代码 ICD-10-->
                    <extension url="urn:oid:2.16.156.10011.2.3.3.11">
                        <valueCode value="${deathCauseCode}" />
                    </extension>
                    </#if>
                    <#if deathTime??>
                    <!-- 死亡日期时间-->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/datetime/death-time">
                        <valueDateTime value="${deathTime?string("yyyy-MM-dd")}T${deathTime?string("HH:mm:ss")}" />
                    </extension>
                    </#if>
                    <#if deathCauseName??>
                    <!-- 直接死亡原因名称-->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/death-reason-name">
                        <valueString value="${deathCauseName}" />
                    </extension>
                    </#if>
                    <#if deathPlaceCategory??>
                    <!-- 死亡地点类别 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/code/death-place-category">
                        <valueCode value="${deathPlaceCategory}" />
                    </extension>
                    </#if>
                    <#if deathCauseClassificationCode??>
                    <!-- 死亡原因分类代码-->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/death-cause-classification-code">
                        <valueCode value="${deathCauseClassificationCode}" />
                    </extension>
                    </#if>
                    <#if highestDiagnosticLevel??>
                    <!-- 主要致死疾病的最高诊断机构级别代码-->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/highest-diagnostic-level">
                        <valueCode value="${highestDiagnosticLevel}" />
                    </extension>
                    </#if>
                    <#if highestDeathDiagnosisCategoryCode??>
                    <!-- 死亡最高诊断依据类别代码-->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/code/highest-death-diagnosis-category-code">
                        <valueCode value="${highestDeathDiagnosisCategoryCode}" />
                    </extension>
                    </#if>
                    <title value="死亡原因章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="99999-7" />
                            <display value="Cause of death" />
                        </coding>
                    </code>
                </section>
                <!-- 死亡诊断记录章节 -->
                <section>
                    <#if deathDiagCode??>
                    <!--死亡诊断编码 -->
                    <extension url="urn:oid:2.16.156.10011.2.3.3.11">
                        <valueCode value="${deathDiagCode}" />
                    </extension>
                    </#if>
                    <#if deathDiagName??>
                    <!-- 死亡诊断名称-->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/death-diagnosis-name">
                        <valueString value="${deathDiagName}" />
                    </extension>
                    </#if>
                    <title value="死亡诊断记录章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="11535-2" />
                            <display value="HOSPITAL DISCHARGE DX" />
                        </coding>
                    </code>
                </section>
                <!-- 入院诊断章节 -->
                <section>
                    <title value="入院诊断章节" />
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
                <!-- 住院过程章节 -->
                <section>
                    <#if treatRescueCourse??>
                    <!-- 诊疗过程描述 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/text/matters-needing-attention">
                        <valueString value="${treatRescueCourse}" />
                    </extension>
                    </#if>
                    <title value="住院过程章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="8648-8" />
                            <display value="住院过程" />
                        </coding>
                    </code>
                </section>
                <!-- 尸检意见章节 -->
                <section>
                    <#if familyAdviceForDissect??>
                    <!-- 家属是否同意尸体解剖标志 -->
                    <extension url="http://www.nestvision.com/platform/app/data/v1/boolean/family-advice-for-dissect">
                        <valueBoolean value="${familyAdviceForDissect?string("true","false")}" />
                    </extension>
                    </#if>
                    <title value="尸检意见章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="99999-8" />
                            <display value="尸检意见" />
                        </coding>
                    </code>
                </section>
            </Composition>
        </resource>
    </entry>
</Bundle>