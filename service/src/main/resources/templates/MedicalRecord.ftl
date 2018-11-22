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
            <!-- 资源：病案首页 -->
            <Composition xmlns="http://hl7.org/fhir">
                <contained>
                    <Organization xmlns="http://hl7.org/fhir">
                        <id value="hos1" />
                        <identifier>
                            <!-- 原系统机构ID号命名空间 -->
                            <system
                                value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/hospital-id" />
                            <#if upHospital??>
                            <!-- 原系统机构ID号（必填） -->
                            <value value="${upHospital}" />
                            </#if>
                        </identifier>
                        <#if upHospitalName??>
                        <!-- 医院名称（必填） -->
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
                        <#if nationalityCode??>
                        <!-- 国籍代码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/nationality-code">
                            <valueCode value="${nationalityCode}" />
                        </extension>
                        </#if>
                        <#if occupationCd??>
                        <!-- 职业代码 -->
                        <extension url="urn:oid:2.16.156.10011.2.3.3.7">
                            <valueCode value="${occupationCd}" />
                        </extension>
                        </#if>
                        <#if medicalInsuranceCategory??>
                        <!-- 医疗保险类别代码 -->
                        <extension url="urn:oid:2.16.156.10011.2.3.1.248">
                            <valueCode value="${medicalInsuranceCategory}" />
                        </extension>
                        </#if>
                        <#if workUnit??>
                        <!-- 工作单位 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/work-unit">
                            <valueString value="${workUnit}" />
                        </extension>
                        </#if>
                        <#if bodyWeight??>
                        <!-- 新生儿体重 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/body-weight">
                            <valueDecimal value="${bodyWeight?string('#')}" />
                        </extension>
                        </#if>
                        <#if inpatWeight??>
                        <!-- 新生儿入院时体重 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/inpat-weight">
                            <valueDecimal value="${inpatWeight?string('#')}" />
                        </extension>
                        </#if>
                        <#if nativeProvince??>
                        <!-- 籍贯-省代码GBT2260(2013版) -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/native-province">
                            <valueCode value="${nativeProvince}" />
                        </extension>
                        </#if>
                        <#if nativeCity??>
                        <!-- 籍贯-市代码GBT2260(2013版) -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/native-city">
                            <valueCode value="${nativeCity}" />
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
                        <#if birthAddressHouse??>
                        <!-- 出生地址的门牌号码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/birth-address-house">
                            <valueString value="${birthAddressHouse}" />
                        </extension>
                        </#if>
                        <#if birthAddressStreet??>
                        <!-- 出生地址的乡、镇或城市的街道办事处名称 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/birth-address-street">
                            <valueString value="${birthAddressStreet}" />
                        </extension>
                        </#if>
                        <#if rprAddrProvince??>
                        <!-- 户籍登记所在地址的省、自治区或直辖市名称 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/rpr_addr_province">
                            <valueString value="${rprAddrProvince}" />
                        </extension>
                        </#if>
                        <#if rprAddrCity??>
                        <!-- 户籍登记所在地址的市、地区或州的名称 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/rpr-addr-city">
                            <valueString value="${rprAddrCity}" />
                        </extension>
                        </#if>
                        <#if rprAddrArea??>
                        <!-- 户籍登记所在地址的县（区）的名称 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/rpr-addr-area">
                            <valueString value="${rprAddrArea}" />
                        </extension>
                        </#if>
                        <#if rprAddrStreet??>
                        <!-- 户籍登记所在地址的乡、镇或城市的街道办事处名称 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/rpr-addr-street">
                            <valueString value="${rprAddrStreet}" />
                        </extension>
                        </#if>
                        <#if rprAddrVillage??>
                        <!-- 户籍登记所在地址的村或城市的街、路、里、弄等名称 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/rpr-addr-village">
                            <valueString value="${rprAddrVillage}" />
                        </extension>
                        </#if>
                        <#if rprAddrHouse??>
                        <!-- 户籍登记所在地址的门牌号码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/rpr-addr-house">
                            <valueString value="${rprAddrHouse}" />
                        </extension>
                        </#if>
                        <#if rprPost??>
                        <!-- 户口地址邮编 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/rpr-post">
                            <valueString value="${rprPost}" />
                        </extension>
                        </#if>
                        <#if age??>
                        <!-- 年龄 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/age">
                            <valueDecimal value="${age?string('#')}" />
                        </extension>
                        </#if>
                        <#if ifRritability??>
                        <!-- 是否有过敏史 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/boolean/if-rritability">
                            <valueBoolean value="${ifRritability?then('true','false')}" />
                        </extension>
                        </#if>
                        <#if rritability??>
                        <!-- 过敏史描述 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/rritability">
                            <valueString value="${rritability}" />
                        </extension>
                        </#if>
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
                        <#if patientId??>
                        <identifier>
                            <!-- 院内患者ID命名空间 -->
                            <system
                                value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/patient-id" />
                            <!-- 院内患者ID（必填） -->
                            <value value="${patientId}" />
                        </identifier>
                        </#if>
                        <#if patientServiceNo??>
                        <identifier>
                            <!-- 院内患者就诊卡命名空间 -->
                            <system
                                value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/patient-service-no" />
                            <!-- 院内患者就诊卡 -->
                            <value value="${patientServiceNo}" />
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
                        <#if socialInsuranceCard??>
                        <identifier>
                            <!-- 社保卡命名空间 -->
                            <system
                                value="http://www.nestvision.com/entity/person/social-insurance-card" />
                            <!-- 社保卡号 -->
                            <value value="${socialInsuranceCard}" />
                        </identifier>
                        </#if>
                        <#if medicalInsuranceCard??>
                        <identifier>
                            <!-- 医疗保险卡号命名空间 -->
                            <system
                                value="http://www.nestvision.com/entity/person/medical-insurance-card" />
                            <!-- 医疗保险卡号 -->
                            <value value="${medicalInsuranceCard}" />
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
                        <#if ncmsCard??>
                        <identifier>
                            <!-- 新农合卡号命名空间 -->
                            <system value="http://www.nestvision.com/entity/person/ncms-card" />
                            <!-- 新农合卡号 -->
                            <value value="${ncmsCard}" />
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
                        <#if workPhone??>
                        <telecom>
                            <!-- 联系方式代码 -->
                            <system value="phone" />
                            <!-- 工作单位电话号码 -->
                            <value value="${workPhone}" />
                            <!-- 使用方式:工作 -->
                            <use value="work" />
                        </telecom>
                        </#if>
                        <#if phone??>
                        <telecom>
                            <!-- 联系方式代码 -->
                            <system value="phone" />
                            <!-- 现地址的电话号码 -->
                            <value value="${phone}" />
                            <!-- 使用方式:现在 -->
                            <use value="temp" />
                        </telecom>
                        </#if>
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
                            <#if workLine??>
                            <!-- 地址-乡（镇、街道办事处） -->
                            <line value="16" />
                            </#if>
                            <#if workCity??>
                            <!-- 地址-市（地区） -->
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
                                <!-- 婚姻状况代码 -->
                                <code value="10" />
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
                                <#if contactsRoad??>
                                <!-- 地址-村（街、路、弄等） -->
                                <extension
                                    url="http://www.nestvision.com/platform/app/data/v1/text/address-road">
                                    <valueString value="${contactsRoad}" />
                                </extension>
                                </#if>
                                <#if contactsHouseNo??>
                                <!--地址-门牌号码 -->
                                <extension
                                    url="http://www.nestvision.com/platform/app/data/v1/text/house-no">
                                    <valueString value="${contactsHouseNo}" />
                                </extension>
                                </#if>
                                <!-- 地址类别代码:现居住地址 -->
                                <use value="temp" />
                                <#if contactsAddressDetails??>
                                <!-- 地址详细信息 -->
                                <text value="${contactsAddressDetails}" />
                                </#if>
                                <#if contactsLine??>
                                <!-- 地址-乡（镇、街道办事处） -->
                                <line value="${contactsLine}" />
                                </#if>
                                <#if contactsCity??>
                                <!-- 地址-市（地区） -->
                                <city value="${contactsCity}" />
                                </#if>
                                <#if contactsDistrict??>
                                <!-- 地址-县（区） -->
                                <district value="${contactsDistrict}" />
                                </#if>
                                <#if contactsState??>
                                <!-- 地址-省（自治区、直辖市） -->
                                <state value="${contactsState}" />
                                </#if>
                            </address>
                        </contact>
                    </Patient>
                </contained>
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra1" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system
                                value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/employee-id" />
                            <#if departmentHeadId??>
                            <!-- 院内人员ID号 -->
                            <value value="${departmentHeadId}" />
                            </#if>
                        </identifier>
                        <name>
                            <#if departmentHeadName??>
                            <!-- 姓名 -->
                            <text value="${departmentHeadName}" />
                            </#if>
                        </name>
                    </Practitioner>
                </contained>
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra2" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system
                                value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/employee-id" />
                            <#if chiefPhysicianId??>
                            <!-- 院内人员ID号 -->
                            <value value="${chiefPhysicianId}" />
                            </#if>
                        </identifier>
                        <name>
                            <#if chiefPhysicianName??>
                            <!-- 姓名 -->
                            <text value="${chiefPhysicianName}" />
                            </#if>
                        </name>
                    </Practitioner>
                </contained>
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra3" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system
                                value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/employee-id" />
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
                    </Practitioner>
                </contained>
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra4" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system
                                value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/employee-id" />
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
                    </Practitioner>
                </contained>
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra5" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system
                                value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/employee-id" />
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
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra6" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system
                                value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/employee-id" />
                            <#if refresherDoctorId??>
                            <!-- 院内人员ID号 -->
                            <value value="${refresherDoctorId}" />
                            </#if>
                        </identifier>
                        <name>
                            <#if refresherDoctorName??>
                            <!-- 姓名 -->
                            <text value="${refresherDoctorName}" />
                            </#if>
                        </name>
                    </Practitioner>
                </contained>
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra7" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system
                                value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/employee-id" />
                            <#if internId??>
                            <!-- 院内人员ID号 -->
                            <value value="${internId}" />
                            </#if>
                        </identifier>
                        <name>
                            <#if internName??>
                            <!-- 姓名 -->
                            <text value="${internName}" />
                            </#if>
                        </name>
                    </Practitioner>
                </contained>
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra8" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system
                                value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/employee-id" />
                            <#if coderId??>
                            <!-- 院内人员ID号 -->
                            <value value="${coderId}" />
                            </#if>
                        </identifier>
                        <name>
                            <#if coderName??>
                            <!-- 姓名 -->
                            <text value="${coderName}" />
                            </#if>
                        </name>
                    </Practitioner>
                </contained>
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra9" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system
                                value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/employee-id" />
                            <#if graduateInternId??>
                            <!-- 院内人员ID号 -->
                            <value value="${graduateInternId}" />
                            </#if>
                        </identifier>
                        <name>
                            <#if graduateInternName??>
                            <!-- 姓名 -->
                            <text value="${graduateInternName}" />
                            </#if>
                        </name>
                    </Practitioner>
                </contained>
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra10" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system
                                value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/employee-id" />
                            <#if qcDoctorId??>
                            <!-- 院内人员ID号 -->
                            <value value="${qcDoctorId}" />
                            </#if>
                        </identifier>
                        <name>
                            <#if qcDoctorName??>
                            <!-- 姓名 -->
                            <text value="${qcDoctorName}" />
                            </#if>
                        </name>
                    </Practitioner>
                </contained>
                <contained>
                    <Practitioner xmlns="http://hl7.org/fhir">
                        <id value="pra11" />
                        <identifier>
                            <!-- 院内人员ID号命名空间 -->
                            <system
                                value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/employee-id" />
                            <#if qcNurseId??>
                            <!-- 院内人员ID号 -->
                            <value value="${qcNurseId}" />
                            </#if>
                        </identifier>
                        <name>
                            <#if qcNurseName??>
                            <!-- 姓名 -->
                            <text value="${qcNurseName}" />
                            </#if>
                        </name>
                    </Practitioner>
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
                                        value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/bed-id" />
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
                                <#if inDeptCd??>
                                <!-- 科室归类代码（必填） -->
                                <extension url="urn:oid:2.16.156.10011.2.3.2.62">
                                    <valueCode value="${inDeptCd}" />
                                </extension>
                                </#if>
                                <identifier>
                                    <!-- 院内科室ID号命名空间 -->
                                    <system
                                        value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/department-id" />
                                    <#if inDeptId??>
                                    <!-- 院内科室ID号（必填） -->
                                    <value value="${inDeptId}" />
                                    </#if>
                                </identifier>
                                <#if inDeptName??>
                                <!-- 科室名称（必填） -->
                                <name value="${inDeptName}" />
                                </#if>
                            </Organization>
                        </contained>
                        <contained>
                            <Organization xmlns="http://hl7.org/fhir">
                                <id value="e1o3" />
                                <#if outDeptCd??>
                                <!-- 科室归类代码（必填） -->
                                <extension url="urn:oid:2.16.156.10011.2.3.2.62">
                                    <valueCode value="${outDeptCd}" />
                                </extension>
                                </#if>
                                <identifier>
                                    <!-- 院内科室ID号命名空间 -->
                                    <system
                                        value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/department-id" />
                                    <#if outDeptId??>
                                    <!-- 院内科室ID号（必填） -->
                                    <value value="${outDeptId}" />
                                    </#if>
                                </identifier>
                                <#if outDeptName??>
                                <!-- 科室名称（必填） -->
                                <name value="${outDeptName}" />
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
                        <!-- 入院科室（必填） -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/identifier/in-dpid">
                            <valueReference>
                                <reference value="#e1o2" />
                            </valueReference>
                        </extension>
                        <#if inModeCode??>
                        <!-- 入院途径 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/in-mode-code">
                            <valueCode value="${inModeCode}" />
                        </extension>
                        </#if>
                        <!-- 出院科室 （必填）-->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/identifier/out-dpid">
                            <valueReference>
                                <reference value="#e1o3" />
                            </valueReference>
                        </extension>
                        <#if feeCode??>
                        <!-- 医疗付费方式 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/fee-code">
                            <valueCode value="${feeCode}" />
                        </extension>
                        </#if>
                        <#if inhospitalReasonCd??>
                        <!-- 住院原因代码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/inhospital-reason-cd">
                            <valueCode value="${inhospitalReasonCd}" />
                        </extension>
                        </#if>
                        <#if inInpatientArea??>
                        <!-- 入院病区代码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/in-inpatient-area">
                            <valueString value="${inInpatientArea}" />
                        </extension>
                        </#if>
                        <#if outInpatientArea??>
                        <!-- 出院病区代码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/out-inpatient-area">
                            <valueString value="${outInpatientArea}" />
                        </extension>
                        </#if>
                        <#if inBedNum??>
                        <!-- 入院床位号 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/in-bed-num">
                            <valueString value="${inBedNum}" />
                        </extension>
                        </#if>
                        <#if outBedNum??>
                        <!-- 出院床位号 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/out-bed-num">
                            <valueString value="${outBedNum}" />
                        </extension>
                        </#if>
                        <identifier>
                            <system
                                value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/inpatient-registration-id" />
                            <#if inpatientRegistrationId??>
                            <!-- 原系统住院流水id号（必填） -->
                            <value value="${inpatientRegistrationId}" />
                            </#if>
                        </identifier>
                        <!-- 状态 -->
                        <status value="in-progress" />
                        <!-- 类型：住院（必填）-->
                        <class value="inpatient" />
                        <period>
                            <#if start??>
                            <!-- 入院时间（必填） -->
                            <start value="${start?string("yyyy-MM-dd")}T${start?string("HH:mm:ss")}" />
                            </#if>
                            <#if end??>
                            <!-- 出院时间 -->
                            <end value="${end?string("yyyy-MM-dd")}T${end?string("HH:mm:ss")}" />
                            </#if>
                        </period>
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
                <#if mrs??>
                <#list mrs as mr>
                <contained>
                    <ReferralRequest xmlns="http://hl7.org/fhir">
                        <id value="r1${mr.inpatientTransferId}" />
                        <contained>
                            <Organization xmlns="http://hl7.org/fhir">
                                <id value="r1o1" />
                                <identifier>
                                    <!-- 院内科室ID号命名空间 -->
                                    <system
                                        value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/department-id" />
                                    <#if mr.inDpidId??>
                                    <!-- 院内科室ID号 -->
                                    <value value="{mr.inDpidId}" />
                                    </#if>
                                </identifier>
                                <#if mr.inDpidName??>
                                <!-- 科室名称 -->
                                <name value="${mr.inDpidName}" />
                                </#if>
                            </Organization>
                        </contained>
                        <contained>
                            <Organization xmlns="http://hl7.org/fhir">
                                <id value="r1o2${mr.inpatientTransferId}" />
                                <identifier>
                                    <!-- 院内科室ID号命名空间 -->
                                    <system
                                        value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/department-id" />
                                    <#if mr.outDpidId??>
                                    <!-- 院内科室ID号 -->
                                    <value value="${mr.outDpidId}" />
                                    </#if>
                                </identifier>
                                <#if mr.outDpidName??>
                                <!-- 科室名称 -->
                                <name value="${mr.outDpidName}" />
                                </#if>
                            </Organization>
                        </contained>
                        <contained>
                            <Location xmlns="http://hl7.org/fhir">
                                <id value="r1l1${mr.inpatientTransferId}" />
                                <identifier>
                                    <!--原系统床位ID号命名空间 -->
                                    <system
                                        value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/bed-id" />
                                    <#if mr.inDpidId?? && mr.inBedno??>
                                    <!-- 原系统床位ID号：入科科室ID号+“_”+入科床位号 -->
                                    <value value="${mr.inDpidId}_${mr.inBedno}" />
                                    </#if>
                                </identifier>
                            </Location>
                        </contained>
                        <contained>
                            <Location xmlns="http://hl7.org/fhir">
                                <id value="r1l2${mr.inpatientTransferId}" />
                                <identifier>
                                    <!--原系统床位ID号命名空间 -->
                                    <system
                                        value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/bed-id" />
                                    <#if mr.outDpidId?? && mr.outBednoId??>
                                    <!-- 原系统床位ID号：出科科室ID号+“_”+出科床位号 -->
                                    <value value="${mr.outDpidId}_${mr.outBednoId}" />
                                    </#if>
                                </identifier>
                            </Location>
                        </contained>
                        <contained>
                            <Practitioner xmlns="http://hl7.org/fhir">
                                <id value="r1pra1${mr.inpatientTransferId}" />
                                <identifier>
                                    <!-- 院内人员ID号命名空间 -->
                                    <system
                                        value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/employee-id" />
                                    <#if mr.inEmpId??>
                                    <!-- 院内人员ID号 -->
                                    <value value="${mr.inEmpId}" />
                                    </#if>
                                </identifier>
                                <name>
                                    <#if mr.inEmpName??>
                                    <!-- 姓名 -->
                                    <text value="${mr.inEmpName}" />
                                    </#if>
                                </name>
                            </Practitioner>
                        </contained>
                        <!-- 转入床位信息id -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/identifer/in-bedno">
                            <valueReference>
                                <reference value="#r1l1${mr.inpatientTransferId}" />
                            </valueReference>
                        </extension>
                        <!-- 转出床位信息id -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/identifer/out-bedno">
                            <valueReference>
                                <reference value="#r1l2${mr.inpatientTransferId}" />
                            </valueReference>
                        </extension>
                        <!-- 转出科室id -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/identifier/out-dpid">
                            <valueReference>
                                <reference value="#r1o2${mr.inpatientTransferId}" />
                            </valueReference>
                        </extension>
                        <#if mr.inDate??>
                        <!-- 转入时间 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/datetime/in-date">
                            <valueDateTime value="${mr.inDate?string("yyyy-MM-dd")}T${mr.inDate?string("HH:mm:ss")}" />
                        </extension>
                        </#if>
                        <#if mr.outDate??>
                        <!-- 转出时间 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/datetime/out-date">
                            <valueDateTime value="${mr.outDate?string("yyyy-MM-dd")}T${mr.outDate?string("HH:mm:ss")}" />
                        </extension>
                        </#if>
                        <identifier>
                            <!-- 原系统转诊id -->
                            <system
                                value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/inpatient-transfer-id" />
                            <#if mr.inpatientTransferId??>
                            <value value="${mr.inpatientTransferId}" />
                            </#if>
                        </identifier>
                        <!-- 状态 active:转出待转入 completed完成转入 -->
                        <status value="active"/>
                        <category />
                        <!-- 转入科室id -->
                        <recipient>
                            <reference value="#r1o1" />
                        </recipient>
                        <!-- 转入操作人id -->
                        <recipient>
                            <reference value="#r1pra1${mr.inpatientTransferId}" />
                        </recipient>
                    </ReferralRequest>
                </contained>
                </#list>
                </#if>
                <contained>
                    <Organization xmlns="http://hl7.org/fhir">
                        <id value="o1" />
                        <identifier>
                            <!-- 院内科室ID号命名空间 -->
                            <system
                                value="http://www.nestvision.com/entity/hospital/guan1/his/sinosoft/v1/identifier/hospital-id" />
                            <#if receiveHosCd??>
                            <!-- 拟接收医疗机构代码 -->
                            <value value="${receiveHosCd}" />
                            </#if>
                        </identifier>
                        <#if receiveHosName??>
                        <!-- 拟接收医疗机构名称 -->
                        <name value="${receiveHosName}" />
                        </#if>
                    </Organization>
                </contained>
                <#if mods??>
                <#list mods as mod>
                <contained>
                    <!-- 门（急）诊诊断 -->
                    <Condition xmlns="http://hl7.org/fhir">
                        <id value="c1" />
                        <#if mod.admitDiag??>
                        <!-- 诊断顺位 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/admit-diag">
                            <valueDecimal value="${mod.admitDiag}" />
                        </extension>
                        </#if>
                        <identifier>
                            <system
                                value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/condition-id" />
                            <#if mod.diagnosisId??>
                            <!-- 原系统诊断记录id（必填） -->
                            <value value="${mod.diagnosisId}" />
                            </#if>
                        </identifier>
                        <patient />
                        <code>
                            <coding>
                                <!--诊断ICD-10编码 -->
                                <system value="urn:oid:2.16.156.10011.2.3.3.11" />
                                <#if mod.diagnosisCd??>
                                <!--诊断ICD-10编码（必填） -->
                                <code value="${mod.diagnosisCd}" />
                                </#if>
                                <#if mod.diagnosisValue??>
                                <display value="${mod.diagnosisValue}" />
                                </#if>
                            </coding>
                        </code>
                        <category>
                            <coding>
                                <system
                                    value="http://www.nestvision.com/platform/app/data/v1/code/condition-types" />
                                <code value="2" />
                                <display value="门（急）诊诊断" />
                            </coding>
                        </category>
                        <verificationStatus />
                        <#if mod.onsetdatetime??>
                        <!--诊断时间 -->
                        <onsetDateTime value="${mod.onsetdatetime?string("yyyy-MM-dd")}" />
                        </#if>
                    </Condition>
                </contained>
                </#list>
                </#if>
                <#if mpds??>
                <#list mpds as mpd>
                <contained>
                    <!-- 病理诊断 -->
                    <Condition xmlns="http://hl7.org/fhir">
                        <id value="c2" />
                        <#if mpd.pathhologyNo??>
                        <!-- 病理标本编号 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/pathhology-no">
                            <valueString value="${mpd.pathhologyNo}" />
                        </extension>
                        </#if>
                        <#if mpd.differentiationCd??>
                        <!-- 分化程度代码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/differentiation-cd">
                            <valueCode value="${mpd.differentiationCd}" />
                        </extension>
                        </#if>
                        <#if mpd.highestDiagCd??>
                        <!-- 最高诊断依据代码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/highest-diag-cd">
                            <valueCode value="${mpd.highestDiagCd}" />
                        </extension>
                        </#if>
                        <#if mpd.admitDiag??>
                        <!-- 诊断顺位 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/admit-diag">
                            <valueDecimal value="${mpd.admitDiag}" />
                        </extension>
                        </#if>
                        <identifier>
                            <system
                                value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/condition-id" />
                            <#if mpd.diagnosisId??>
                            <!-- 原系统诊断记录id（必填） -->
                            <value value="${mpd.diagnosisId}" />
                            </#if>
                        </identifier>
                        <patient />
                        <code>
                            <coding>
                                <!--诊断ICD-10编码 -->
                                <system value="urn:oid:2.16.156.10011.2.3.3.11" />
                                <#if mpd.diagnosisCd??>
                                <!--诊断ICD-10编码（必填） -->
                                <code value="${mpd.diagnosisCd}" />
                                </#if>
                                <#if mpd.diagnosisValue??>
                                <display value="${mpd.diagnosisValue}" />
                                </#if>
                            </coding>
                        </code>
                        <!-- 诊断、症状类型代码 -->
                        <category>
                            <coding>
                                <system
                                    value="http://www.nestvision.com/platform/app/data/v1/code/condition-types" />
                                <code value="9" />
                                <display value="病理诊断" />
                            </coding>
                        </category>
                        <verificationStatus />
                        <#if mpd.onsetdatetime??>
                        <!--诊断时间 -->
                        <onsetDateTime value="${mpd.onsetdatetime?string("yyyy-MM-dd")}" />
                        </#if>
                    </Condition>
                </contained>
                </#list>
                </#if>
                <#if miieds??>
                <#list miieds as miied>
                <contained>
                    <!-- 损伤中毒外部原因记录 -->
                    <Condition xmlns="http://hl7.org/fhir">
                        <id value="c3" />
                        <#if miied.admitDiag??>
                        <!-- 诊断顺位 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/admit-diag">
                            <valueDecimal value="${miied.admitDiag}" />
                        </extension>
                        </#if>
                        <identifier>
                            <system
                                value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/condition-id" />
                            <#if miied.diagnosisId??>
                            <!-- 原系统诊断记录id（必填） -->
                            <value value="${miied.diagnosisId}" />
                            </#if>
                        </identifier>
                        <patient />
                        <!-- 损伤中毒外部原因代码 -->
                        <code>
                            <coding>
                                <!--损伤中毒外部原因ICD-10编码 -->
                                <system value="urn:oid:2.16.156.10011.2.3.3.11" />
                                <#if miied.diagnosisCd??>
                                <!--损伤中毒外部原因ICD-10编码（必填） -->
                                <code value="${miied.diagnosisCd}" />
                                </#if>
                                <#if miied.diagnosisValue??>
                                <display value="${miied.diagnosisValue}" />
                                </#if>
                            </coding>
                        </code>
                        <!-- 诊断、症状类型 -->
                        <category>
                            <coding>
                                <system
                                    value="http://www.nestvision.com/platform/app/data/v1/code/condition-types" />
                                <code value="18" />
                                <display value="损伤中毒外部原因" />
                            </coding>
                        </category>
                        <verificationStatus />
                        <#if miied.onsetdatetime??>
                        <!--诊断时间 -->
                        <onsetDateTime value="${miied.onsetdatetime?string("yyyy-MM-dd")}" />
                        </#if>
                    </Condition>
                </contained>
                </#list>
                </#if>
                <#if mndds??>
                <#list mndds as mndd>
                <contained>
                    <!-- 新生儿缺陷诊断记录 -->
                    <Condition xmlns="http://hl7.org/fhir">
                        <id value="c4" />
                        <identifier>
                            <system
                                value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/condition-id" />
                            <#if mndd.diagnosisId??>
                            <!-- 原系统诊断记录id（必填） -->
                            <value value="${mndd.diagnosisId}" />
                            </#if>
                        </identifier>
                        <patient />
                        <!-- 症状代码 -->
                        <code>
                            <coding>
                                <!--症状ICD-10编码 -->
                                <system value="urn:oid:2.16.156.10011.2.3.3.11" />
                                <#if mndd.diagnosisCd??>
                                <!--症状ICD-10编码（必填） -->
                                <code value="${mndd.diagnosisCd}" />
                                </#if>
                                <#if mndd.diagnosisValue??>
                                <display value="${mndd.diagnosisValue}" />
                                </#if>
                            </coding>
                        </code>
                        <!-- 诊断、症状类型 -->
                        <category>
                            <coding>
                                <system
                                    value="http://www.nestvision.com/platform/app/data/v1/code/condition-types" />
                                <code value="17" />
                                <display value="新生儿缺陷诊断" />
                            </coding>
                        </category>
                        <verificationStatus />
                        <#if mndd.onsetdatetime??>
                        <!--诊断时间 -->
                        <onsetDateTime value="${mndd.onsetdatetime?string("yyyy-MM-dd")}" />
                        </#if>
                    </Condition>
                </contained>
                </#list>
                </#if>
                <#if mids??>
                <#list mids as mid>
                <contained>
                    <!-- 入院诊断 -->
                    <Condition xmlns="http://hl7.org/fhir">
                        <id value="c5" />
                        <#if mid.tcmWesternCd??>
                        <!-- 中西医诊断标志 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/tcm-western-cd">
                            <valueCode value="${mid.tcmWesternCd}" />
                        </extension>
                        </#if>
                        <#if mid.inhosIllnessCd??>
                        <!-- 入院病情代码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/inhos-illness-cd">
                            <valueCode value="${mid.inhosIllnessCd}" />
                        </extension>
                        </#if>
                        <#if mid.treatmentResultCode??>
                        <!-- 诊断结果 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/treatment-result-code">
                            <valueCode value="${mid.treatmentResultCode}" />
                        </extension>
                        </#if>
                        <#if mid.propertyCd??>
                        <!-- 诊断性质代码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/property-cd">
                            <valueCode value="${mid.propertyCd}" />
                        </extension>
                        </#if>
                        <#if mid.diagExplan??>
                        <!-- 诊断说明 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/diag-explan">
                            <valueString value="${mid.diagExplan}" />
                        </extension>
                        </#if>
                        <#if mid.admitDiag??>
                        <!-- 诊断顺位 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/admit-diag">
                            <valueDecimal value="${mid.admitDiag?string('#')}" />
                        </extension>
                        </#if>
                        <identifier>
                            <system
                                value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/condition-id" />
                            <#if mid.diagnosisId??>
                            <!-- 原系统诊断记录id（必填） -->
                            <value value="${mid.diagnosisId}" />
                            </#if>
                        </identifier>
                        <patient />
                        <code>
                            <coding>
                                <!--诊断ICD-10编码 -->
                                <system value="urn:oid:2.16.156.10011.2.3.3.11" />
                                <#if mid.diagnosisCd??>
                                <!--诊断ICD-10编码（必填） -->
                                <code value="${mid.diagnosisCd}" />
                                </#if>
                                <#if mid.diagnosisValue??>
                                <display value="${mid.diagnosisValue}" />
                                </#if>
                            </coding>
                        </code>
                        <!-- 诊断、症状类型代码 -->
                        <category>
                            <coding>
                                <system
                                    value="http://www.nestvision.com/platform/app/data/v1/code/condition-types" />
                                <code value="3" />
                                <display value="入院初步诊断" />
                            </coding>
                        </category>
                        <verificationStatus />
                        <#if mid.onsetdatetime??>
                        <!--诊断时间 -->
                        <onsetDateTime value="${mid.onsetdatetime?string("yyyy-MM-dd")}" />
                        </#if>
                    </Condition>
                </contained>
                </#list>
                </#if>
                <#if momds??>
                <#list momds as momd>
                <contained>
                    <!-- 出院主要诊断 -->
                    <Condition xmlns="http://hl7.org/fhir">
                        <id value="c6" />
                        <#if momd.tcmWesternCd??>
                        <!-- 中西医诊断标志 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/tcm-western-cd">
                            <valueCode value="${momd.tcmWesternCd}" />
                        </extension>
                        </#if>
                        <#if momd.inhosIllnessCd??>
                        <!-- 入院病情代码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/inhos-illness-cd">
                            <valueCode value="${momd.inhosIllnessCd}" />
                        </extension>
                        </#if>
                        <#if momd.treatmentResultCode??>
                        <!-- 治疗结果代码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/treatment-result-code">
                            <valueCode value="${momd.treatmentResultCode}" />
                        </extension>
                        </#if>
                        <#if momd.propertyCd??>
                        <!-- 诊断性质代码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/property-cd">
                            <valueCode value="${momd.propertyCd}" />
                        </extension>
                        </#if>
                        <#if momd.diagExplan??>
                        <!-- 诊断说明 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/diag-explan">
                            <valueString value="${momd.diagExplan}" />
                        </extension>
                        </#if>
                        <#if momd.admitDiag??>
                        <!-- 诊断顺位 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/admit-diag">
                            <valueDecimal value="${momd.admitDiag?string('#')}" />
                        </extension>
                        </#if>
                        <identifier>
                            <system
                                value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/condition-id" />
                            <#if momd.diagnosisId??>
                            <!-- 原系统诊断记录id（必填） -->
                            <value value="${momd.diagnosisId}" />
                            </#if>
                        </identifier>
                        <patient />
                        <code>
                            <coding>
                                <!--诊断ICD-10编码 -->
                                <system value="urn:oid:2.16.156.10011.2.3.3.11" />
                                <#if momd.diagnosisCd??>
                                <!--诊断ICD-10编码（必填） -->
                                <code value="${momd.diagnosisCd}" />
                                </#if>
                                <#if momd.diagnosisValue??>
                                <display value="${momd.diagnosisValue}" />
                                </#if>
                            </coding>
                        </code>
                        <!-- 诊断、症状类型代码 -->
                        <category>
                            <coding>
                                <system
                                    value="http://www.nestvision.com/platform/app/data/v1/code/condition-types" />
                                <code value="1" />
                                <display value="出院诊断" />
                            </coding>
                        </category>
                        <verificationStatus />
                        <#if momd.onsetdatetime??>
                        <!--诊断时间 -->
                        <onsetDateTime value="${momd.onsetdatetime?string("yyyy-MM-dd")}" />
                        </#if>
                    </Condition>
                </contained>
                </#list>
                </#if>
                <#if moods??>
                <#list moods as mood>
                <contained>
                    <!-- 出院其它诊断 -->
                    <Condition xmlns="http://hl7.org/fhir">
                        <id value="c7" />
                        <#if mood.tcmWesternCd??>
                        <!-- 中西医诊断标志 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/tcm-western-cd">
                            <valueCode value="${mood.tcmWesternCd}" />
                        </extension>
                        </#if>
                        <#if mood.inhosIllnessCd??>
                        <!-- 入院病情代码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/inhos-illness-cd">
                            <valueCode value="${mood.inhosIllnessCd}" />
                        </extension>
                        </#if>
                        <#if mood.treatmentResultCode??>
                        <!-- 治疗结果代码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/treatment-result-code">
                            <valueCode value="${mood.treatmentResultCode}" />
                        </extension>
                        </#if>
                        <#if mood.propertyCd??>
                        <!-- 诊断性质代码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/property-cd">
                            <valueCode value="${mood.propertyCd}" />
                        </extension>
                        </#if>
                        <#if mood.diagExplan??>
                        <!-- 诊断说明 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/diag-explan">
                            <valueString value="${mood.diagExplan}" />
                        </extension>
                        </#if>
                        <#if mood.admitDiag??>
                        <!-- 诊断顺位 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/admit-diag">
                            <valueDecimal value="${mood.admitDiag?string('#')}" />
                        </extension>
                        </#if>
                        <identifier>
                            <system
                                value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/condition-id" />
                            <#if mood.diagnosisId??>
                            <!-- 原系统诊断记录id（必填） -->
                            <value value="${mood.diagnosisId}" />
                            </#if>
                        </identifier>
                        <patient />
                        <code>
                            <coding>
                                <!--诊断ICD-10编码 -->
                                <system value="urn:oid:2.16.156.10011.2.3.3.11" />
                                <#if mood.diagnosisCd??>
                                <!--诊断ICD-10编码（必填） -->
                                <code value="${mood.diagnosisCd}" />
                                </#if>
                                <#if mood.diagnosisValue??>
                                <display value="${mood.diagnosisValue}" />
                                </#if>
                            </coding>
                        </code>
                        <!-- 诊断、症状类型代码 -->
                        <category>
                            <coding>
                                <system
                                    value="http://www.nestvision.com/platform/app/data/v1/code/condition-types" />
                                <code value="14" />
                                <display value="出院其它诊断" />
                            </coding>
                        </category>
                        <verificationStatus />
                        <#if mood.onsetdatetime??>
                        <!--诊断时间 -->
                        <onsetDateTime value="${mood.onsetdatetime?string("yyyy-MM-dd")}" />
                        </#if>
                    </Condition>
                </contained>
                </#list>
                </#if>
                <#if miss??>
                <#list miss as mis>
                <contained>
                    <!--住院症状记录 -->
                    <Condition xmlns="http://hl7.org/fhir">
                        <id value="c8" />
                        <#if mis.onsetDate??>
                        <!-- 发病时间 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/date/onset-date">
                            <valueDateTime value="${mis.onsetDate?string("yyyy-MM-dd")}T${mis.onsetDate?string("HH:mm:ss")}" />
                        </extension>
                        </#if>
                        <identifier>
                            <system
                                value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/condition-id" />
                            <#if mis.diagnosisId??>
                            <!-- 原系统症状记录id（必填） -->
                            <value value="${mis.diagnosisId}" />
                            </#if>
                        </identifier>
                        <patient />
                        <!-- 症状代码 -->
                        <code>
                            <coding>
                                <!--症状ICD-10编码 -->
                                <system value="urn:oid:2.16.156.10011.2.3.3.11" />
                                <#if mis.diagnosisCd??>
                                <!--症状ICD-10编码（必填） -->
                                <code value="${mis.diagnosisCd}" />
                                </#if>
                                <#if mis.diagnosisValue??>
                                <display value="${mis.diagnosisValue}" />
                                </#if>
                            </coding>
                        </code>
                        <!-- 诊断、症状类型 -->
                        <category>
                            <coding>
                                <system
                                    value="http://www.nestvision.com/platform/app/data/v1/code/condition-types" />
                                <code value="15" />
                                <display value="住院症状" />
                            </coding>
                        </category>
                        <verificationStatus />
                        <#if mis.onsetdatetime??>
                        <!--诊断时间（必填） -->
                        <onsetDateTime value="${mis.onsetdatetime?string("yyyy-MM-dd")}" />
                        </#if>
                    </Condition>
                </contained>
                </#list>
                </#if>
                <#if mos??>
                <#list mos as mo>
                <contained>
                    <!-- 手术单示例 -->
                    <Procedure xmlns="http://hl7.org/fhir">
                        <id value="p1" />
                        <contained>
                            <Practitioner xmlns="http://hl7.org/fhir">
                                <id value="p1pra1" />
                                <identifier>
                                    <!-- 院内人员ID号命名空间 -->
                                    <system
                                        value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/employee-id" />
                                    <#if mo.operative??>
                                    <!-- 院内人员ID号 -->
                                    <value value="${mo.operative}" />
                                    </#if>
                                </identifier>
                                <name>
                                    <#if mo.operativeName??>
                                    <!-- 姓名 -->
                                    <text value="${mo.operativeName}" />
                                    </#if>
                                </name>
                            </Practitioner>
                        </contained>
                        <contained>
                            <Practitioner xmlns="http://hl7.org/fhir">
                                <id value="p1pra2" />
                                <identifier>
                                    <!-- 院内人员ID号命名空间 -->
                                    <system
                                        value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/employee-id" />
                                    <#if mo.firstAssistant??>
                                    <!-- 院内人员ID号 -->
                                    <value value="${mo.firstAssistant}" />
                                    </#if>
                                </identifier>
                                <name>
                                    <#if mo.firstAssistantName??>
                                    <!-- 姓名 -->
                                    <text value="${mo.firstAssistantName}" />
                                    </#if>
                                </name>
                            </Practitioner>
                        </contained>
                        <contained>
                            <Practitioner xmlns="http://hl7.org/fhir">
                                <id value="p1pra3" />
                                <identifier>
                                    <!-- 院内人员ID号命名空间 -->
                                    <system
                                        value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/employee-id" />
                                    <#if mo.secondAssistant??>
                                    <!-- 院内人员ID号 -->
                                    <value value="${mo.secondAssistant}" />
                                    </#if>
                                </identifier>
                                <name>
                                    <#if mo.secondAssistantName??>
                                    <!-- 姓名 -->
                                    <text value="${mo.secondAssistantName}" />
                                    </#if>
                                </name>
                            </Practitioner>
                        </contained>
                        <contained>
                            <Practitioner xmlns="http://hl7.org/fhir">
                                <id value="p1pra4" />
                                <identifier>
                                    <!-- 院内人员ID号命名空间 -->
                                    <system
                                        value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/employee-id" />
                                    <#if mo.anaesthetic??>
                                    <!-- 院内人员ID号 -->
                                    <value value="${mo.anaesthetic}" />
                                    </#if>
                                </identifier>
                                <name>
                                    <#if mo.anaestheticName??>
                                    <!-- 姓名 -->
                                    <text value="${mo.anaestheticName}" />
                                    </#if>
                                </name>
                            </Practitioner>
                        </contained>
                        <#if mo.incisionTypeCode??>
                        <!-- 切口类别代码 -->
                        <extension url="urn:oid:2.16.156.10011.2.3.1.256">
                            <valueCode value="${mo.incisionTypeCode}" />
                        </extension>
                        </#if>
                        <#if mo.incisionHealingRankCode??>
                        <!-- 切口愈合级别代码 -->
                        <extension url="urn:oid:2.16.156.10011.2.3.1.257">
                            <valueCode value="${mo.incisionHealingRankCode}" />
                        </extension>
                        </#if>
                        <#if mo.opMark??>
                        <!-- 是否主要术式 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/boolean/op-mark">
                            <valueBoolean value="${mo.opMark?then('true','false')}" />
                        </extension>
                        </#if>
                        <#if mo.opProMark??>
                        <!-- 是否主要手术或操作 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/boolean/op-pro-mark">
                            <valueBoolean value="${mo.opProMark?then('true','false')}" />
                        </extension>
                        </#if>
                        <#if mo.opLevelCd??>
                        <!-- 手术级别代码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/op-level-cd">
                            <valueCode value="${mo.opLevelCd}" />
                        </extension>
                        </#if>
                        <#if mo.anesthesiaLevelCd??>
                        <!-- 麻醉分级代码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/anesthesia-level-cd">
                            <valueCode value="${mo.anesthesiaLevelCd}" />
                        </extension>
                        </#if>
                        <#if mo.opNo??>
                        <!-- 手术操作序号 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/text/op-no">
                            <valueString value="${mo.opNo}" />
                        </extension>
                        </#if>
                        <#if mo.operPatientTypeCode??>
                        <!-- 手术患者类型代码 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/code/oper-patient-type-code">
                            <valueCode value="${mo.operPatientTypeCode}" />
                        </extension>
                        </#if>
                        <#if mo.transfuseReactionFlag??>
                        <!-- 输血反应标志 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/boolean/transfuse-reaction-flag">
                            <valueBoolean value="${mo.transfuseReactionFlag?then('true','false')}" />
                        </extension>
                        </#if>
                        <#if mo.redBloodCell??>
                        <!-- 输红细胞量(单位) -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/red-blood-cell">
                            <valueDecimal value="${mo.redBloodCell?string('#')}" />
                        </extension>
                        </#if>
                        <#if mo.platelet??>
                        <!-- 输血小板量(袋) -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/platelet">
                            <valueDecimal value="${mo.platelet?string('#')}" />
                        </extension>
                        </#if>
                        <#if mo.plasma??>
                        <!-- 输血浆量(ml) -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/plasma">
                            <valueDecimal value="${mo.plasma?string('#')}" />
                        </extension>
                        </#if>
                        <#if mo.wholeBlood??>
                        <!-- 输全血量(ml) -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/whole_blood">
                            <valueDecimal value="${mo.wholeBlood?string('#')}" />
                        </extension>
                        </#if>
                        <#if mo.selfBlood??>
                        <!-- 自身回收(ml) -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/self_blood">
                            <valueDecimal value="${mo.selfBlood?string('#')}" />
                        </extension>
                        </#if>
                        <#if mo.otherBlood??>
                        <!-- 输其它血制品量(ml) -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/other_blood">
                            <valueDecimal value="${mo.otherBlood?string('#')}" />
                        </extension>
                        </#if>
                        <#if mo.lifeSupportMachineTime??>
                        <!-- 呼吸机使用时度（h） -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/life-support-machine-time">
                            <valueDecimal value="${mo.lifeSupportMachineTime?string('#')}" />
                        </extension>
                        </#if>
                        <identifier>
                            <!-- 原系统手术单id命名空间 -->
                            <system
                                value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/operation-id" />
                            <#if mo.operationId??>
                            <!-- 原系统手术单id号（必填） -->
                            <value value="${mo.operationId}" />
                            </#if>
                        </identifier>
                        <subject />
                        <status />
                        <category>
                            <coding>
                                <!-- 处置类别命名空间 -->
                                <system
                                    value="http://www.nestvision.com/platform/app/data/v1/code/procedure-types" />
                                <!-- 处置类别 -->
                                <code value="01" />
                                <!-- 处置类别名称 -->
                                <display value="手术" />
                            </coding>
                        </category>
                        <code>
                            <coding>
                                <!-- 麻醉方法命名空间 -->
                                <system value="urn:oid:2.16.156.10011.2.3.1.159" />
                                <#if mo.anesthesiaMethodCd??>
                                <!-- 麻醉方法代码 -->
                                <code value="${mo.anesthesiaMethodCd}" />
                                </#if>
                                <#if mo.anesthesiaMethodName??>
                                <!-- 麻醉方法 -->
                                <display value="${mo.anesthesiaMethodName}" />
                                </#if>
                            </coding>
                            <coding>
                                <!-- 手术编码命名空间 -->
                                <system value="urn:oid:2.16.156.10011.2.3.3.12" />
                                <#if mo.operationCd??>
                                <!-- 手术编码 -->
                                <code value="${mo.operationCd}" />
                                </#if>
                                <#if mo.operationName??>
                                <!-- 手术名字 -->
                                <display value="${mo.operationName}" />
                                </#if>
                            </coding>
                        </code>
                        <bodySite>
                            <coding>
                                <!-- 手术操作目标部位代码命名空间 -->
                                <system value="http://www.nestvision.com/platform/app/data/v1/code/part-code" />
                                <#if mo.partCode??>
                                <!-- 手术操作目标部位代码 -->
                                <code value="${mo.partCode}" />
                                </#if>
                                <#if mo.partName??>
                                <!-- 手术操作目标部位名称 -->
                                <display value="${mo.partName}" />
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
                            <#if mo.procedureStart??>
                            <!-- 手术开始时间（必填） -->
                            <start value="${mo.procedureStart?string("yyyy-MM-dd")}T${mo.procedureStart?string("HH:mm:ss")}" />
                            </#if>
                            <#if mo.procedureEnd??>
                            <!-- 手术结束时间 -->
                            <end value="${mo.procedureEnd?string("yyyy-MM-dd")}T${mo.procedureEnd?string("HH:mm:ss")}" />
                            </#if>
                        </performedPeriod>
                    </Procedure>
                </contained>
                </#list>
                </#if>
                <contained>
                    <!-- 住院结算示例 -->
                    <Claim xmlns="http://hl7.org/fhir">
                        <id value="claim1" />
                        <#if psnExpense??>
                        <!-- 个人承担费用 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/psn-expense">
                            <valueDecimal value="${psnExpense?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeGeneralMedical??>
                        <!-- 一般医疗服务费 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-general-medical">
                            <valueDecimal value="${feeGeneralMedical?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeGeneralTreat??>
                        <!-- 一般治疗操作费 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-general-treat">
                            <valueDecimal value="${feeGeneralTreat?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeTend??>
                        <!-- 护理费 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-tend">
                            <valueDecimal value="${feeTend?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeMedicalOther??>
                        <!-- 综合医疗服务其他费用 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-medical-other">
                            <valueDecimal value="${feeMedicalOther?string('#')}" />
                        </extension>
                        </#if>
                        <#if feePathology??>
                        <!-- 病理诊断费 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-pathology">
                            <valueDecimal value="${feePathology?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeLaboratory??>
                        <!-- 实验室诊断费 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-laboratory">
                            <valueDecimal value="${feeLaboratory?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeImaging??>
                        <!-- 影像学诊断费 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-imaging">
                            <valueDecimal value="${feeImaging?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeClinc??>
                        <!-- 临床诊断项目费 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-clinc">
                            <valueDecimal value="${feeClinc?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeNonsurgicalTreat??>
                        <!-- 非手术治疗项目费 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-nonsurgical-treat">
                            <valueDecimal value="${feeNonsurgicalTreat?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeClinPhysical??>
                        <!-- 临床物理治疗费 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-clin-physical">
                            <valueDecimal value="${feeClinPhysical?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeSurgicalTreat??>
                        <!-- 手术治疗费 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-surgical-treat">
                            <valueDecimal value="${feeSurgicalTreat?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeAnaes??>
                        <!-- 麻醉费 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-anaes">
                            <valueDecimal value="${feeAnaes?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeOperation??>
                        <!-- 手术费 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-operation">
                            <valueDecimal value="${feeOperation?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeRecovery??>
                        <!-- 康复费 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-recovery">
                            <valueDecimal value="${feeRecovery?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeCnTreatment??>
                        <!-- 中医治疗费 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-cn-treatment">
                            <valueDecimal value="${feeCnTreatment?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeWesternMedicine??>
                        <!-- 西药费 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-western-medicine">
                            <valueDecimal value="${feeWesternMedicine?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeAntimicrobial??>
                        <!-- 抗菌药物费用 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-antimicrobial">
                            <valueDecimal value="${feeAntimicrobial?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeCnMedicine??>
                        <!-- 中成药费 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-cn-medicine">
                            <valueDecimal value="${feeCnMedicine?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeCnHerbalMedicine??>
                        <!-- 中草药费 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-cn-herbal-medicine">
                            <valueDecimal value="${feeCnHerbalMedicine?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeBlood??>
                        <!-- 血费 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-blood">
                            <valueDecimal value="${feeBlood?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeAlbumin??>
                        <!-- 白蛋白类制品费 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-albumin">
                            <valueDecimal value="${feeAlbumin?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeGlobulin??>
                        <!-- 球蛋白类制品费 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-globulin">
                            <valueDecimal value="${feeGlobulin?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeBcf??>
                        <!-- 凝血因子类制品费 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-bcf">
                            <valueDecimal value="${feeBcf?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeCytokine??>
                        <!-- 细胞因子类制品费 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-cytokine">
                            <valueDecimal value="${feeCytokine?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeCheckMaterial??>
                        <!-- 检查用一次性医用材料费 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-check-material">
                            <valueDecimal value="${feeCheckMaterial?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeTreatMaterial??>
                        <!-- 治疗用一次性医用材料费 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-treat-material">
                            <valueDecimal value="${feeTreatMaterial?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeOperMaterial??>
                        <!-- 手术用一次性医用材料费 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-oper-material">
                            <valueDecimal value="${feeOperMaterial?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeOther??>
                        <!-- 其他费 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-other">
                            <valueDecimal value="${feeOther?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeBaby??>
                        <!-- 婴儿费 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-baby">
                            <valueDecimal value="${feeBaby?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeExtraBed??>
                        <!-- 陪床费 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-extra-bed">
                            <valueDecimal value="${feeExtraBed?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeBed??>
                        <!-- 床位费 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-bed">
                            <valueDecimal value="${feeBed?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeRadiation??>
                        <!-- 放射费 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-radiation">
                            <valueDecimal value="${feeRadiation?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeAssay??>
                        <!-- 化验费 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-assay">
                            <valueDecimal value="${feeAssay?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeOxygen??>
                        <!-- 输氧费用 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-oxygen">
                            <valueDecimal value="${feeOxygen?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeDeliver??>
                        <!-- 接生费 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-deliver">
                            <valueDecimal value="${feeDeliver?string('#')}" />
                        </extension>
                        </#if>
                        <#if feeCheck??>
                        <!-- 检查费 -->
                        <extension
                            url="http://www.nestvision.com/platform/app/data/v1/number/fee-check">
                            <valueDecimal value="${feeCheck?string('#')}" />
                        </extension>
                        </#if>
                        <type />
                        <patientReference />
                        <!-- 总金额 -->
                        <total>
                            <#if total??>
                            <value value="${total}" />
                            </#if>
                            <unit value="人民币" />
                            <system value="urn:iso:std:iso:4217" />
                            <code value="CNY" />
                        </total>
                    </Claim>
                </contained>
                <#if reportFormNo??>
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/text/report-form-no">
                    <!-- 病案首页报告单号 -->
                    <valueString value="${reportFormNo}" />
                </extension>
                </#if>
                <#if medicalRecordType??>
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/code/medical-record-type">
                    <!-- 病案首页类型CV9900328 -->
                    <valueCode value="${medicalRecordType}" />
                </extension>
                </#if>
                <#if caseNo??>
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/text/case-no">
                    <!-- 病案号（必填） -->
                    <valueString value="${caseNo}" />
                </extension>
                </#if>
                <#if inpatTypeCd??>
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/code/inpat-type-cd">
                    <!-- 治疗类别代码CV9900320 -->
                    <valueCode value="${inpatTypeCd}" />
                </extension>
                </#if>
                <#if isLocalMark??>
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/boolean/is-local-mark">
                    <!-- 是否本地标志 -->
                    <valueBoolean value="${isLocalMark?string("true","false")}" />
                </extension>
                </#if>
                <#if referralMark??>
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/boolean/referral-mark">
                    <!-- 是否转诊标志 -->
                    <valueBoolean value="${referralMark?string("true","false")}" />
                </extension>
                </#if>
                <#if inpatWardNo??>
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/text/inpat-ward-no">
                    <!-- 入院病房号 -->
                    <valueString value="${inpatWardNo}" />
                </extension>
                </#if>
                <#if outpatWardNo??>
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/text/outpat-ward-no">
                    <!-- 出院病房号 -->
                    <valueString value="${outpatWardNo}" />
                </extension>
                </#if>
                <#if clinPathMark??>
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/boolean/clin-path-mark">
                    <!-- 是否实施临床路径 -->
                    <valueBoolean value="${clinPathMark?string("true","false")}" />
                </extension>
                </#if>
                <#if clinicalPathwayCd??>
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/code/clinical-pathway-cd">
                    <!-- 实施临床路径标志代码CV9900321 -->
                    <valueCode value="${clinicalPathwayCd}" />
                </extension>
                </#if>
                <#if tcmMedicalCd??>
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/boolean/tcm-medical-cd">
                    <!-- 是否使用医疗机构中药制剂标志 -->
                    <valueBoolean value="${tcmMedicalCd?string("true","false")}" />
                </extension>
                </#if>
                <#if tcmDiagTreatDeviceCd??>
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/boolean/tcm-diag-treat-device-cd">
                    <!-- 是否使用中医诊疗设备标志 -->
                    <valueBoolean value="${tcmDiagTreatDeviceCd?string("true","false")}" />
                </extension>
                </#if>
                <#if tcmDiagTreatTechCd??>
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/boolean/tcm-diag-treat-tech-cd">
                    <!-- 是否使用中医诊疗技术标志 -->
                    <valueBoolean value="${tcmDiagTreatTechCd?string("true","false")}" />
                </extension>
                </#if>
                <#if syndromeNursingCd??>
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/boolean/syndrome-nursing-cd">
                    <!-- 是否辨证施护标志 -->
                    <valueBoolean value="${syndromeNursingCd?string("true","false")}" />
                </extension>
                </#if>
                <#if ifDead??>
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/boolean/if-dead">
                    <!-- 死亡标志 -->
                    <valueBoolean value="${ifDead?string("true","false")}" />
                </extension>
                </#if>
                <#if deathTime??>
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/datetime/death-time">
                    <!-- 死亡时间 -->
                    <valueDateTime value="${deathTime?string("yyyy-MM-dd")}T${deathTime?string("HH:mm:ss")}" />
                </extension>
                </#if>
                <#if deathCause??>
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/text/death-cause">
                    <!-- 死亡原因描述 -->
                    <valueString value="${deathCause}" />
                </extension>
                </#if>
                <#if deathCauseDiagnosticCode??>
                <extension url="urn:oid:2.16.156.10011.2.3.3.11">
                    <!-- 死亡根本原因诊断代码 -->
                    <valueCode value="${deathCauseDiagnosticCode}" />
                </extension>
                </#if>
                <#if infusionReactionMark??>
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/boolean/infusion-reaction-mark">
                    <!-- 输液反应标志 -->
                    <valueBoolean value="${infusionReactionMark?string("true","false")}" />
                </extension>
                </#if>
                <#if followInterval??>
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/number/follow-interval">
                    <!-- 随访时间间隔(天) -->
                    <valueDecimal value="${followInterval}" />
                </extension>
                </#if>
                <#if researchExampleMark??>
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/boolean/research-example-mark">
                    <!-- 科研病例标志 -->
                    <valueBoolean value="${researchExampleMark?string("true","false")}" />
                </extension>
                </#if>
                <#if firstOperationMark??>
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/boolean/first-operation-mark">
                    <!-- 手术为本院第一例标志 -->
                    <valueBoolean value="${firstOperationMark?string("true","false")}" />
                </extension>
                </#if>
                <#if firstTreatmentMark??>
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/boolean/first-treatment-mark">
                    <!-- 治疗为本院第一例标志 -->
                    <valueBoolean value="${firstTreatmentMark?string("true","false")}" />
                </extension>
                </#if>
                <#if firstExamMark??>
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/boolean/first-exam-mark">
                    <!-- 检查为本院第一例标志 -->
                    <valueBoolean value="${firstExamMark?string("true","false")}" />
                </extension>
                </#if>
                <#if firstDiagnosisMark??>
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/boolean/first-diagnosis-mark">
                    <!-- 诊断为本院第一例标志 -->
                    <valueBoolean value="${firstDiagnosisMark?string("true","false")}" />
                </extension>
                </#if>
                <#if infectiousMark??>
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/boolean/infectious-mark">
                    <!-- 传染性标志 -->
                    <valueBoolean value="${infectiousMark?string("true","false")}" />
                </extension>
                </#if>
                <#if infectiousTypeCode??>
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/code/infectious-type-code">
                    <!-- 传染病分类代码 -->
                    <valueCode value="${infectiousTypeCode}" />
                </extension>
                </#if>
                <#if infectReportCd??>
                <!--传染上报标志 -->
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/boolean/infect-report-cd">
                    <valueBoolean value="${infectReportCd?then('true','false')}" />
                </extension>
                </#if>
                <#if allergensCode??>
                <!-- 过敏源代码 -->
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/code/allergens-code">
                    <valueCode value="${allergensCode}" />
                </extension>
                </#if>
                <#if hbsagCode??>
                <!-- HbsAg检查结果代码 -->
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/code/hbsag-code">
                    <valueCode value="${hbsagCode}" />
                </extension>
                </#if>
                <#if hcvAbCode??>
                <!-- HCV_Ab检查结果代码 -->
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/code/hcv-ab-code">
                    <valueCode value="${hcvAbCode}" />
                </extension>
                </#if>
                <#if hivAbCode??>
                <!-- HIV_Ab检查结果代码 -->
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/code/hiv-ab-code">
                    <valueCode value="${hivAbCode}" />
                </extension>
                </#if>
                <#if clinic2outCode??>
                <!-- 门诊与出院诊断对比符合情况代码 -->
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/code/clinic2out-code">
                    <valueCode value="${clinic2outCode}" />
                </extension>
                </#if>
                <#if in2outCode??>
                <!-- 入院与出院诊断对比符合情况代码 -->
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/code/in2out-code">
                    <valueCode value="${in2outCode}" />
                </extension>
                </#if>
                <#if preOper2operCode??>
                <!-- 术前与术后诊断对比符合情况代码 -->
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/code/pre-oper2oper-code">
                    <valueCode value="${preOper2operCode}" />
                </extension>
                </#if>
                <#if radiation2operCode??>
                <!-- 放射与术后诊断对比符合情况代码 -->
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/code/radiation2oper-code">
                    <valueCode value="${radiation2operCode}" />
                </extension>
                </#if>
                <#if clinic2pathologyCode??>
                <!-- 临床与病理诊断对比符合情况代码 -->
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/code/clinic2pathology-code">
                    <valueCode value="${clinic2pathologyCode}" />
                </extension>
                </#if>
                <#if radiation2pathologyCode??>
                <!-- 放射与病理诊断对比符合情况代码 -->
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/code/radiation2pathology-code">
                    <valueCode value="${radiation2pathologyCode}" />
                </extension>
                </#if>
                <#if clinic2autopsyCode??>
                <!-- 临床与尸检诊断对比符合情况代码 -->
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/code/clinic2autopsy-code">
                    <valueCode value="${clinic2autopsyCode}" />
                </extension>
                </#if>
                <#if infectiousnessTimes??>
                <!-- 感染次数 -->
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/number/infectiousness-times">
                    <valueDecimal value="${infectiousnessTimes?string('#')}" />
                </extension>
                </#if>
                <#if saveTimes??>
                <!-- 抢救次数 -->
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/number/save-times">
                    <valueDecimal value="${saveTimes?string('#')}" />
                </extension>
                </#if>
                <#if saveSuccessTimes??>
                <!-- 抢救成功次数 -->
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/number/save-success-times">
                    <valueDecimal value="${saveSuccessTimes?string('#')}" />
                </extension>
                </#if>
                <#if protectSpecial??>
                <!-- 特级护理天数 -->
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/number/protect-special">
                    <valueDecimal value="${protectSpecial?string('#')}" />
                </extension>
                </#if>
                <#if protectI??>
                <!-- 一级护理天数 -->
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/number/protect-i">
                    <valueDecimal value="${protectI?string('#')}" />
                </extension>
                </#if>
                <#if protectIi??>
                <!-- 二级护理天数 -->
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/number/protect-ii">
                    <valueDecimal value="${protectIi?string('#')}" />
                </extension>
                </#if>
                <#if protectIii??>
                <!-- 三级护理天数 -->
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/number/protect-iii">
                    <valueDecimal value="${protectIii?string('#')}" />
                </extension>
                </#if>
                <#if intensiveCareTherapy??>
                <!-- 重症监护 -->
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/text/intensive-care-therapy">
                    <valueString value="${intensiveCareTherapy}" />
                </extension>
                </#if>
                <#if followUpWeeks??>
                <!-- 随诊周数 -->
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/number/follow-up-weeks">
                    <valueDecimal value="${followUpWeeks?string('#')}" />
                </extension>
                </#if>
                <#if followUpMonths??>
                <!-- 随诊月数 -->
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/number/follow-up-months">
                    <valueDecimal value="${followUpMonths?string('#')}" />
                </extension>
                </#if>
                <#if followUpYears??>
                <!-- 随诊年数 -->
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/number/follow-up-years">
                    <valueDecimal value="${followUpYears?string('#')}" />
                </extension>
                </#if>
                <#if teachingExampleMark??>
                <!--住院患者示教病例标志 -->
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/boolean/teaching-example-mark">
                    <valueBoolean value="${teachingExampleMark?then('true','false')}" />
                </extension>
                </#if>
                <#if followMark??>
                <!-- 住院患者随诊标志 -->
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/boolean/follow-mark">
                    <valueBoolean value="${followMark?then('true','false')}" />
                </extension>
                </#if>
                <#if ageBaby??>
                <!-- 婴幼儿年龄（天） -->
                <extension
                    url="http://www.nestvision.com/platform/app/data/v1/number/age-baby">
                    <valueDecimal value="${ageBaby?string('#')}" />
                </extension>
                </#if>
                <!-- 原系统住院病案首页id（必填） -->
                <identifier>
                    <system
                        value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/medical-record-id" />
                    <#if medicalRecordId??>
                    <value value="${medicalRecordId}" />
                    </#if>
                </identifier>
                <#if date??>
                <!-- 记录日期 -->
                <date value="${date?string("yyyy-MM-dd")}T${date?string("HH:mm:ss")}" />
                </#if>
                <!-- 文档类型：病案 -->
                <type>
                    <coding>
                        <system value="http://loinc.org" />
                        <code value="11503-0" />
                    </coding>
                    <text value="Medical records" />
                </type>
                <!-- 文档标题：病案首页 -->
                <title value="病案首页" />
                <!-- 状态：preliminary初步 final最终amended修订entered-in-error错误 -->
                <status value="final" />
                <!-- 保密等级：U:不受限制的 L:低等级 M:中等 N:常规 R:保密的 V:十分机密的 -->
                <confidentiality value="N" />
                <!-- 居民信息 -->
                <subject>
                    <reference value="#pat1" />
                </subject>
                <author />
                <!-- 科主任id -->
                <attester>
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
                        <valueCode value="01" />
                    </extension>
                    <!-- 对于该文档的意义：法律认可 -->
                    <mode value="legal" />
                    <#if departmentHeadDate??>
                    <!-- 签名日期 -->
                    <time value="${departmentHeadDate?string("yyyy-MM-dd")}T${departmentHeadDate?string("HH:mm:ss")}" />
                    </#if>
                    <party>
                        <reference value="#pra1" />
                    </party>
                </attester>
                <!-- 主(副主)任医师id -->
                <attester>
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
                        <valueCode value="02" />
                    </extension>
                    <!-- 对于该文档的意义：个人 -->
                    <mode value="personal" />
                    <#if chiefPhysicianSignDate??>
                    <!-- 签名日期 -->
                    <time value="${chiefPhysicianSignDate?string("yyyy-MM-dd")}T${chiefPhysicianSignDate?string("HH:mm:ss")}" />
                    </#if>
                    <party>
                        <reference value="#pra2" />
                    </party>
                </attester>
                <!-- 主治医师id -->
                <attester>
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
                        <valueCode value="03" />
                    </extension>
                    <!-- 对于该文档的意义：个人 -->
                    <mode value="personal" />
                    <#if attendingDoctorSignDate??>
                    <!-- 签名日期 -->
                    <time value="${attendingDoctorSignDate?string("yyyy-MM-dd")}T${attendingDoctorSignDate?string("HH:mm:ss")}" />
                    </#if>
                    <party>
                        <reference value="#pra3" />
                    </party>
                </attester>
                <!-- 住院医师id -->
                <attester>
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
                        <valueCode value="04" />
                    </extension>
                    <!-- 对于该文档的意义：个人 -->
                    <mode value="personal" />
                    <#if residentDoctorSignDate??>
                    <!-- 签名日期 -->
                    <time value="${residentDoctorSignDate?string("yyyy-MM-dd")}T${residentDoctorSignDate?string("HH:mm:ss")}" />
                    </#if>
                    <party>
                        <reference value="#pra4" />
                    </party>
                </attester>
                <!-- 责任护士id -->
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
                        <reference value="#pra5" />
                    </party>
                </attester>
                <!-- 进修医师id -->
                <attester>
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
                        <valueCode value="06" />
                    </extension>
                    <!-- 对于该文档的意义：个人 -->
                    <mode value="personal" />
                    <#if refresherDoctorDate??>
                    <!-- 签名日期 -->
                    <time value="${refresherDoctorDate?string("yyyy-MM-dd")}T${refresherDoctorDate?string("HH:mm:ss")}" />
                    </#if>
                    <party>
                        <reference value="#pra6" />
                    </party>
                </attester>
                <!-- 实习医师id -->
                <attester>
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
                        <valueCode value="07" />
                    </extension>
                    <!-- 对于该文档的意义：个人 -->
                    <mode value="personal" />
                    <#if internDate??>
                    <!-- 签名日期 -->
                    <time value="${internDate?string("yyyy-MM-dd")}T${internDate?string("HH:mm:ss")}" />
                    </#if>
                    <party>
                        <reference value="#pra7" />
                    </party>
                </attester>
                <!-- 编码员id -->
                <attester>
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
                        <valueCode value="08" />
                    </extension>
                    <!-- 对于该文档的意义：个人 -->
                    <mode value="personal" />
                    <#if coderDate??>
                    <!-- 签名日期 -->
                    <time value="${coderDate?string("yyyy-MM-dd")}T${coderDate?string("HH:mm:ss")}" />
                    </#if>
                    <party>
                        <reference value="#pra8" />
                    </party>
                </attester>
                <!-- 研究生实习医师id -->
                <attester>
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/code/employee-role-cd">
                        <valueCode value="09" />
                    </extension>
                    <!-- 对于该文档的意义：个人 -->
                    <mode value="personal" />
                    <#if graduateInternDate??>
                    <!-- 签名日期 -->
                    <time value="${graduateInternDate?string("yyyy-MM-dd")}T${graduateInternDate?string("HH:mm:ss")}" />
                    </#if>
                    <party>
                        <reference value="#pra9" />
                    </party>
                </attester>
                <!-- 文档保管机构id -->
                <custodian>
                    <reference value="#hos1" />
                </custodian>
                <!-- 住院信息 -->
                <encounter>
                    <reference value="#e1" />
                </encounter>
                <section>
                    <title value="诊断章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="29548-5" />
                            <display value="Diagnosis" />
                        </coding>
                    </code>
                    <#if mods??>
                    <#list mods as mod>
                    <!--门（急）诊诊断 -->
                    <entry>
                        <reference value="#c1${mod.diagnosisId}" />
                    </entry>
                    </#list>
                    </#if>
                    <#if mpds ??>
                    <#list mpds as mpd>
                    <!--病理诊断 -->
                    <entry>
                        <reference value="#c2${mpd.diagnosisId}" />
                    </entry>
                    </#list>
                    </#if>
                    <#if mids??>
                    <#list mids as mid>
                    <!-- 入院诊断 -->
                    <entry>
                        <reference value="#c5${mid.diagnosisId}" />
                    </entry>
                    </#list>
                    </#if>
                </section>
                <section>
                    <#if inpatIllStateCd??>
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/number/inpat-ill-state-cd">
                        <!-- 住院者疾病状态代码 -->
                        <valueCode value="${inpatIllStateCd}" />
                    </extension>
                    </#if>
                    <#if inpatBefComaD??>
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/number/inpat-bef-coma-d">
                        <!-- 颅脑损伤患者入院前昏迷时间的天数 -->
                        <valueInteger value="${inpatBefComaD}" />
                    </extension>
                    </#if>
                    <#if inpatBefComaH??>
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/number/inpat-bef-coma-h">
                        <!-- 颅脑损伤患者入院前昏迷时间的小时数 -->
                        <valueInteger value="${inpatBefComaH}" />
                    </extension>
                    </#if>
                    <#if inpatBefComaM??>
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/number/inpat-bef-coma-m">
                        <!-- 颅脑损伤患者入院前昏迷时间的分钟数 -->
                        <valueInteger value="${inpatBefComaM}" />
                    </extension>
                    </#if>
                    <#if inpatAftComaD??>
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/number/inpat-aft-coma-d">
                        <!-- 颅脑损伤患者入院后昏迷时间的天数 -->
                        <valueInteger value="${inpatAftComaD}" />
                    </extension>
                    </#if>
                    <#if inpatAftComaH??>
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/number/inpat-aft-coma-h">
                        <!-- 颅脑损伤患者入院后昏迷时间的小时数 -->
                        <valueInteger value="${inpatAftComaH}" />
                    </extension>
                    </#if>
                    <#if inpatAftComaM??>
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/number/inpat-aft-coma-m">
                        <!-- 颅脑损伤患者入院后昏迷时间的分钟数 -->
                        <valueInteger value="${inpatAftComaM}" />
                    </extension>
                    </#if>
                    <#if lifeSkillsInhosp??>
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/number/life-skills-inhosp">
                        <!-- 日常生活能力评定量表得分-入院 -->
                        <valueDecimal value="${lifeSkillsInhosp}" />
                    </extension>
                    </#if>
                    <#if lifeSkillsOuthosp??>
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/number/life-skills-outhosp">
                        <!-- 日常生活能力评定量表得分-出院 -->
                        <valueDecimal value="${lifeSkillsOuthosp}" />
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
                    <#if miieds??>
                    <#list miieds as miied>
                    <!--损伤中毒外部原因诊断 -->
                    <entry>
                        <reference value="#c3${miied.diagnosisId}" />
                    </entry>
                    </#list>
                    </#if>
                    <#if mndds??>
                    <#list mndds as mndd>
                    <!--新生儿缺陷诊断记录 -->
                    <entry>
                        <reference value="#c4${mndd.diagnosisId}" />
                    </entry>
                    </#list>
                    </#if>
                </section>
                <section>
                    <title value="转科记录章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="42349-1" />
                            <display value="REASON FOR REFERRAL" />
                        </coding>
                    </code>
                    <#if mrs ??>
                    <#list mrs as mr>
                    <!-- 转科信息 -->
                    <entry>
                        <reference value="#r1${mr.inpatientTransferId}" />
                    </entry>
                    </#list>
                    </#if>
                </section>
                <section>
                    <#if outModeCode??>
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/code/out-mode-code">
                        <!-- 离院方式 -->
                        <valueCode value="${outModeCode}" />
                    </extension>
                    </#if>
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/number/plan-accept-org-code">
                        <!-- 拟接收医疗机构id -->
                        <valueReference>
                            <reference value="#o1" />
                        </valueReference>
                    </extension>
                    <title value="出院诊断章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="11535-2" />
                            <display value="HOSPITAL DISCHARGE DX" />
                        </coding>
                    </code>
                    <#if momds??>
                    <#list momds as momd>
                    <!--出院主要诊断 -->
                    <entry>
                        <reference value="#c6${momd.diagnosisId}" />
                    </entry>
                    </#list>
                    </#if>
                    <#if moods??>
                    <#list moods as mood>
                    <!--出院其它诊断 -->
                    <entry>
                        <reference value="#c7${mood.diagnosisId}" />
                    </entry>
                    </#list>
                    </#if>
                </section>
                <section>
                    <title value="手术操作章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="47519-4" />
                            <display value="HISTORY OF PROCEDURES" />
                        </coding>
                    </code>
                    <!--手术信息 -->
                    <entry>
                        <reference value="#p1" />
                    </entry>
                </section>
                <section>
                    <#if inpatTimes??>
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/number/inpat-times">
                        <!-- 住院次数 -->
                        <valueInteger value="${inpatTimes}" />
                    </extension>
                    </#if>
                    <#if inpatDays??>
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/number/inpat-days">
                        <!-- 住院天数 -->
                        <valueInteger value="${inpatDays}" />
                    </extension>
                    </#if>
                    <title value="住院史章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="11336-5" />
                            <display value="HISTORY OF HOSPITALIZATIONS" />
                        </coding>
                    </code>
                    <#if miss??>
                    <#list miss as mis>
                    <!--住院病案症状记录 -->
                    <entry>
                        <reference value="#c8${mis.diagnosisId}" />
                    </entry>
                    </#list>
                    </#if>
                </section>
                <section>
                    <#if autopsyMark??>
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/boolean/autopsy-mark">
                        <!-- 死亡患者尸检标志 -->
                        <valueBoolean value="${autopsyMark?string("true","false")}" />
                    </extension>
                    </#if>
                    <#if medicalRecordQualityCd??>
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/boolean/re-inpat-purpose">
                        <!-- 病案质量:1甲2乙3丙 -->
                        <valueCode value="${medicalRecordQualityCd}" />
                    </extension>
                    </#if>
                    <!-- 质控医生id -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/identifier/quality-control-doctor">
                        <valueReference>
                            <reference value="#pra10" />
                        </valueReference>
                    </extension>
                    <!-- 质控护士id -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/identifier/quality-control-nurse">
                        <valueReference>
                            <reference value="#pra11" />
                        </valueReference>
                    </extension>
                    <#if qualityControlDate??>
                    <!-- 质控日期 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/datetime/quality-control-date">
                        <valueDateTime value="${qualityControlDate?string("yyyy-MM-dd")}T${qualityControlDate?string("HH:mm:ss")}" />
                    </extension>
                    </#if>
                    <#if qcDoctDate??>
                    <!-- 质控医师签名日期 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/datetime/qc-doct-date">
                        <valueDateTime value="${qcDoctDate?string("yyyy-MM-dd")}T${qcDoctDate?string("HH:mm:ss")}" />
                    </extension>
                    </#if>
                    <#if qcNurseDate??>
                    <!-- 质控护士签名日期 -->
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/datetime/qc-nurse-date">
                        <valueDateTime value="${qcNurseDate?string("yyyy-MM-dd")}T${qcNurseDate?string("HH:mm:ss")}" />
                    </extension>
                    </#if>
                    <title value="行政管理章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="51851-4" />
                            <display value="Administrative note" />
                        </coding>
                    </code>
                </section>
                <section>
                    <#if reInpatFlg??>
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/boolean/re-inpat-flg">
                        <!-- 出院31天内再住院标志 -->
                        <valueBoolean value="${reInpatFlg?string("true","false")}" />
                    </extension>
                    </#if>
                    <#if reInpatPurpose??>
                    <extension
                        url="http://www.nestvision.com/platform/app/data/v1/text/re-inpat-purpose">
                        <!-- 出院31天内再住院目的 -->
                        <valueString value="${reInpatPurpose}" />
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
                <section>
                    <title value="费用章节" />
                    <code>
                        <coding>
                            <system value="http://loinc.org" />
                            <code value="48768-6" />
                            <display value="PAYMENT SOURCES" />
                        </coding>
                    </code>
                    <!--住院收费信息 -->
                    <entry>
                        <reference value="#claim1" />
                    </entry>
                </section>
            </Composition>
        </resource>
    </entry>
</Bundle>