<#ftl output_format="XML">
<Patient xmlns="http://hl7.org/fhir">
    <#if nationCd ??>
    <!-- 民族代码 -->
    <extension url="urn:oid:2.16.156.10011.2.3.3.3">
        <valueCode value="${nationCd}" />
    </extension>
    </#if>
    <#if nationalityCode ??>
    <!-- 国籍代码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/nationality-code">
        <valueCode value="${nationalityCode}" />
    </extension>
    </#if>
    <#if occupationCd ??>
    <!-- 职业代码 -->
    <extension url="urn:oid:2.16.156.10011.2.3.3.7">
        <valueCode value="${occupationCd}" />
    </extension>
    </#if>
    <#if medicalInsuranceCategory ??>
    <!-- 医疗保险类别代码 -->
    <extension url="urn:oid:2.16.156.10011.2.3.1.248">
        <valueCode value="${medicalInsuranceCategory}" />
    </extension>
    </#if>
    <#if workUnit ??>
    <!-- 工作单位 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/work-unit">
        <valueString value="${workUnit}" />
    </extension>
    </#if>
    <#if patientType ??>
    <!-- 患者类型 -->
    <extension url="urn:oid:2.16.156.10011.2.3.1.271">
        <valueCode value="${patientType}" />
    </extension>
    </#if>
    <#if ifRritability ??>
    <!-- 是否有过敏史 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/boolean/if-rritability">
        <valueBoolean value="${ifRritability?string("true","false")}" />
    </extension>
    </#if>
    <#if rritability ??>
    <!-- 过敏史其他描述 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/rritability">
        <valueString value="${rritability}" />
    </extension>
    </#if>
    <#if aboCd ??>
    <!-- ABO血型代码 -->
    <extension url="urn:oid:2.16.156.10011.2.3.1.85">
        <valueCode value="${aboCd}" />
    </extension>
    </#if>
    <#if rhCd ??>
    <!-- RH血型代码 -->
    <extension url="urn:oid:2.16.156.10011.2.3.1.250">
        <valueCode value="${rhCd}" />
    </extension>
    </#if>
    <#if rhNegCd ??>
    <!-- RH阴性代码:1否2是3不详 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/rh-neg-cd">
        <valueCode value="${rhNegCd}" />
    </extension>
    </#if>
    <#if religionCode ??>
    <!-- 宗教信仰代码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/religion-code">
        <valueCode value="religionCode" />
    </extension>
    </#if>
    <#if englishName ??>
    <!-- 英文姓名 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/english-name">
        <valueString value="${englishName}" />
    </extension>
    </#if>
    <#if dieDate ??>
    <!-- 死亡日期 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/date/die-date">
        <valueDateTime value="${dieDate?string("yyyy-MM-dd")}T${dieDate?string("HH:mm:ss")}" />
    </extension>
    </#if>
    <#if bodyWeight ??>
    <!-- 新生儿体重 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/body-weight">
        <valueDecimal value="${bodyWeight}" />
    </extension>
    </#if>
    <#if inpatWeight ??>
    <!-- 新生儿入院时体重 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/inpat-weight">
        <valueDecimal value="${inpatWeight}" />
    </extension>
    </#if>
    <#if educationCd ??>
    <!-- 学历代码 GBT4658 -->
    <extension url="urn:oid:2.16.156.10011.2.3.3.6">
        <valueCode value="${educationCd}" />
    </extension>
    </#if>
    <#if administration ??>
    <!-- 行政区划代码GBT2260(2013版) -->
    <extension url="urn:oid:2.16.156.10011.2.3.3.2">
        <valueCode value="${administration}" />
    </extension>
    </#if>
    <#if nativeProvince ??>
    <!-- 籍贯-省代码GBT2260(2013版) -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/native-province">
        <valueCode value="${nativeProvince}" />
    </extension>
    </#if>
    <#if nativeCity ??>
    <!-- 籍贯-市代码GBT2260(2013版) -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/native-city">
        <valueCode value="${nativeCity}" />
    </extension>
    </#if>
    <#if birthState ??>
    <!-- 出生地省代码GBT2260(2013版) -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/birth-pro-code">
        <valueCode value="${birthState}" />
    </extension>
    </#if>
    <#if birthCity ??>
    <!-- 出生地市代码GBT2260(2013版) -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/birth-city-code">
        <valueCode value="${birthCity}" />
    </extension>
    </#if>
    <#if birthDistrict ??>
    <!-- 出生地县代码GBT2260(2013版) -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/birth-cou-code">
        <valueCode value="${birthDistrict}" />
    </extension>
    </#if>
    <#if birthRoad ??>
    <!-- 出生地址的村或城市的街、路、里、弄等名称 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/birth-address-village">
        <valueString value="${birthRoad}" />
    </extension>
    </#if>
    <#if birthHouseNo ??>
    <!-- 出生地址的门牌号码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/birth-address-house">
        <valueString value="${birthHouseNo}" />
    </extension>
    </#if>
    <#if birthLine ??>
    <!-- 出生地址的乡、镇或城市的街道办事处名称 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/birth-address-street">
        <valueString value="${birthLine}" />
    </extension>
    </#if>
    <#if rprAddr ??>
    <!-- 户口地址 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/rpr-addr">
        <valueString value="${rprAddr}" />
    </extension>
    </#if>
    <#if rprAddrProvince ??>
    <!-- 户籍登记所在地址的省、自治区或直辖市名称 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/rpr_addr_province">
        <valueString value="${rprAddrProvince}" />
    </extension>
    </#if>
    <#if rprAddrCity ??>
    <!-- 户籍登记所在地址的市、地区或州的名称 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/rpr-addr-city">
        <valueString value="${rprAddrCity}" />
    </extension>
    </#if>
    <#if rprAddrArea ??>
    <!-- 户籍登记所在地址的县（区）的名称 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/rpr-addr-area">
        <valueString value="${rprAddrArea}" />
    </extension>
    </#if>
    <#if rprAddrStreet ??>
    <!-- 户籍登记所在地址的乡、镇或城市的街道办事处名称 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/rpr-addr-street">
        <valueString value="${rprAddrStreet}" />
    </extension>
    </#if>
    <#if rprAddrVillage ??>
    <!-- 户籍登记所在地址的村或城市的街、路、里、弄等名称 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/rpr-addr-village">
        <valueString value="rprAddrVillage" />
    </extension>
    </#if>
    <#if rprAddrHouse ??>
    <!-- 户籍登记所在地址的门牌号码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/rpr-addr-house">
        <valueString value="rprAddrHouse" />
    </extension>
    </#if>
    <#if rprPost ??>
    <!-- 户口地址邮编 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/rpr-post">
        <valueString value="${rprPost}" />
    </extension>
    </#if>
    <#if rprPhone ??>
    <!-- 户口电话 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/rpr-phone">
        <valueString value="${rprPhone}" />
    </extension>
    </#if>
    <#if usualTypeMark ??>
    <!-- 常住地址户籍标志 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/boolean/usual-type-mark">
        <valueBoolean value="${usualTypeMark?string("true","false")}" />
    </extension>
    </#if>
    <#if servicePremises ??>
    <!-- 服务处所 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/service-premises">
        <valueString value="${servicePremises}" />
    </extension>
    </#if>
    <#if servicePremisesTypeCd ??>
    <!-- 服务处所类型代码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/service-premises-type-cd">
        <valueCode value="${servicePremisesTypeCd}" />
    </extension>
    </#if>
    <#if inDate ??>
    <!-- 进入服务场所日期 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/date/in-date">
        <valueDateTime value="${inDate?string("yyyy-MM-dd")}T${inDate?string("HH:mm:ss")}" />
    </extension>
    </#if>
    <#if inReasonCd ??>
    <!-- 进入原因代码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/in-reason-cd">
        <valueCode value="${inReasonCd}" />
    </extension>
    </#if>
    <#if outDate ??>
    <!-- 退出日期 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/date/out-date">
        <valueDateTime value="${outDate?string("yyyy-MM-dd")}T${outDate?string("HH:mm:ss")}" />
    </extension>
    </#if>
    <#if outReasonCd ??>
    <!-- 退出原因代码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/out-reason-cd">
        <valueCode value="${outReasonCd}" />
    </extension>
    </#if>
    <#if manageUnitNo ??>
    <!-- 管理单位号码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/manage-unit-no">
        <valueString value="${manageUnitNo}" />
    </extension>
    </#if>
    <#if veteransMilitaryMark ??>
    <!-- 退伍军人标志 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/boolean/veterans-military-mark">
        <valueBoolean value="${veteransMilitaryMark?string("true","false")}" />
    </extension>
    </#if>
    <#if cardNo ??>
    <!-- 卡号 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/card-no">
        <valueString value="${cardNo}" />
    </extension>
    </#if>
    <#if cardArea ??>
    <!-- 发卡地区GBT2260(2013版) -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/card-area">
        <valueCode value="${cardArea}" />
    </extension>
    </#if>
    <#if insureType ??>
    <!-- 保险类型 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/insure-type">
        <valueCode value="${insureType}" />
    </extension>
    </#if>
    <#if medicalTreat ??>
    <!-- 医疗待遇代码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/medical-treatment-cd">
        <valueCode value="${medicalTreat}" />
    </extension>
    </#if>
    <#if patientTypeDescr ??>
    <!-- 患者就诊类别描述 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/patient-type-descr">
        <valueString value="${patientTypeDescr}" />
    </extension>
    </#if>
    <#if responsDocCode ??>
    <!-- 责任医师id -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/respons-doc-code">
        <valueReference>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${responsDocCode}" />
        </valueReference>
    </extension>
    </#if>
    <#if otherOcccDescr ??>
    <!-- 其他职业描述 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/other-occc-descr">
        <valueString value="${otherOcccDescr}" />
    </extension>
    </#if>
    <#if issuingAgency ??>
    <!-- 发证机关 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/issuing-agency">
        <valueString value="${issuingAgency}" />
    </extension>
    </#if>
    <#if issuingAgencyCd ??>
    <!-- 发证机关所在地 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/issuing-agency-cd">
        <valueString value="${issuingAgencyCd}" />
    </extension>
    </#if>
    <#if validDate ??>
    <!-- 有效期 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/valid-date">
        <valueString value="${validDate}" />
    </extension>
    </#if>
    <#if registerDate ??>
    <!-- 建档日期 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/date/register-date">
        <valueDateTime value="${registerDate?string("yyyy-MM-dd")}T${registerDate?string("HH:mm:ss")}" />
    </extension>
    </#if>
    <#if registerPersonCode ??>
    <!-- 建档人员代码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/register-person-code">
        <valueCode value="${registerPersonCode}" />
    </extension>
    </#if>
    <#if registerPersonName ??>
    <!-- 建档人员姓名 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/register-person-name">
        <valueString value="${registerPersonName}" />
    </extension>
    </#if>
    <#if registerOrgCode ??>
    <!-- 注册机构代码 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/register-org-code">
        <valueCode value="${registerOrgCode}" />
    </extension>
    </#if>
    <#if registerOrgName ??>
    <!-- 注册机构名称 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/register-org-name">
        <valueString value="${registerOrgName}" />
    </extension>
    </#if>
    <#if constrOrgCode ??>
    <!-- 建档医疗机构代码WS2182002 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/constr-org-code">
        <valueCode value="${constrOrgCode}" />
    </extension>
    </#if>
    <#if providerOrgCode ??>
    <!-- 开发商机构代码:《中华人民共和国组织机构代码证》 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/provider-org-code">
        <valueCode value="${providerOrgCode}" />
    </extension>
    </#if>
    <#if remark ??>
    <!-- 备注 -->
    <extension url="http://www.nestvision.com/platform/app/data/v1/text/remark">
        <valueString value="${remark}" />
    </extension>
    </#if>
    <#if patientId ??>
    <identifier>
        <!-- 院内患者ID命名空间 -->
        <system
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/patient-id" />
        <!-- 院内患者ID -->
        <value value="${patientId}" />
    </identifier>
    </#if>
    <#if patientServiceNo ??>
    <identifier>
        <!-- 院内患者就诊卡命名空间 -->
        <system
            value="http://www.nestvision.com/entity/hospital/guan/his/sinosoft/v1/identifier/patient-service-no" />
        <!-- 院内患者就诊卡 -->
        <value value="${patientServiceNo}" />
    </identifier>
    </#if>
    
    <#if idTypeCode=="01">
    <identifier>
        <!-- 身份证号命名空间 -->
        <system value="urn:oid:2.16.156.10011.1.3" />
        <!-- 身份证号 -->
        <value value="${idNo}" />
    </identifier>
    </#if>
    
    <#if socialInsuranceCard ??>
    <identifier>
        <!-- 社保卡命名空间 -->
        <system
            value="http://www.nestvision.com/entity/person/social-insurance-card" />
        <!-- 社保卡号 -->
        <value value="${socialInsuranceCard}" />
    </identifier>
    </#if>
    <#if medicalInsuranceCard ??>
    <identifier>
        <!-- 医疗保险卡号命名空间 -->
        <system
            value="http://www.nestvision.com/entity/person/medical-insurance-card" />
        <!-- 医疗保险卡号 -->
        <value value="${medicalInsuranceCard}" />
    </identifier>
    </#if>
    <#if healthCardTemp ??>
    <identifier>
        <!-- 城乡居民健康档案编号命名空间 -->
        <system value="urn:oid:2.16.156.10011.1.2" />
        <!-- 城乡居民健康档案编号 -->
        <value value="${healthCardTemp}" />
    </identifier>
    </#if>
    <#if ncmsCard ??>
    <identifier>
        <!-- 新农合卡号命名空间 -->
        <system value="http://www.nestvision.com/entity/person/ncms-card" />
        <!-- 新农合卡号 -->
        <value value="${ncmsCard}" />
    </identifier>
    </#if>
    
    <#if idTypeCode=="02">
    <identifier>
	    <!-- 居民户口薄命名空间 -->
	    <system
	        value="http://www.nestvision.com/entity/person/household-register" />
	    <!-- 居民户口薄 -->
	    <value value="${idNo}" />
	</identifier>
	</#if>
	<#if idTypeCode=="03">
	<identifier>
	    <!-- 护照命名空间 -->
	    <system
	        value="http://www.nestvision.com/entity/person/passport" />
	    <!-- 护照 -->
	    <value value="${idNo}" />
	</identifier>
	</#if>
	<#if idTypeCode=="04">
	<identifier>
	    <!-- 军官证命名空间 -->
	    <system
	        value="http://www.nestvision.com/entity/person/officers-certificate" />
	    <!-- 军官证 -->
	    <value value="${idNo}" />
	</identifier>
	</#if>
	<#if idTypeCode=="05">
	<identifier>
	    <!-- 驾驶证命名空间 -->
	    <system
	        value="http://www.nestvision.com/entity/person/driver-license" />
	    <!-- 驾驶证 -->
	    <value value="${idNo}" />
	</identifier>
	</#if>
	<#if idTypeCode=="06">
	<identifier>
	    <!-- 港澳居民来往内地通行证命名空间 -->
	    <system
	        value="http://www.nestvision.com/entity/person/home-return-permit" />
	    <!-- 港澳居民来往内地通行证 -->
	    <value value="${idNo}" />
	</identifier>
	</#if>
	<#if idTypeCode=="07">
	<identifier>
	    <!-- 台湾居民来往内地通行证命名空间 -->
	    <system
	        value="http://www.nestvision.com/entity/person/taiwan-home-return-permit" />
	    <!-- 台湾居民来往内地通行证 -->
	    <value value="${idNo}" />
	</identifier>
    </#if>
    
    <#if healthCard ??>
    <identifier>
        <!-- 健康卡命名空间 -->
        <system value="urn:oid:2.16.156.10011.1.19" />
        <!-- 健康卡号 -->
        <value value="${healthCard}" />
    </identifier>
    </#if>
    <#if healthCardTemp ??>
    <identifier>
        <!-- 健康卡临时卡命名空间 -->
        <system value="http://www.nestvision.com/entity/person/health-card-temp" />
        <!-- 健康卡临时卡号 -->
        <value value="${healthCardTemp}" />
    </identifier>
    </#if>
    <#if name ??>
    <name>
        <!-- 姓名 -->
        <text value="${name}" />
    </name>
    </#if>
    <#if homePhone ??>
    <telecom>
        <!-- 联系方式代码 -->
        <system value="phone" />
        <!-- 现住址电话号码 -->
        <value value="${homePhone}" />
        <!-- 使用方式:家 -->
        <use value="home" />
    </telecom>
    </#if>
    <#if workPhone ??>
    <telecom>
        <!-- 联系方式代码 -->
        <system value="phone" />
        <!-- 工作单位电话号码 -->
        <value value="${workPhone}" />
        <!-- 使用方式:工作 -->
        <use value="work" />
    </telecom>
    </#if>
    <#if mobilePhone ??>
    <telecom>
        <!-- 联系方式代码 -->
        <system value="phone" />
        <!-- 手机号码 -->
        <value value="${mobilePhone}" />
        <!-- 使用方式:移动 -->
        <use value="mobile" />
    </telecom>
    </#if>
    <#if tempPhone ??>
    <telecom>
        <!-- 联系方式代码 -->
        <system value="phone" />
        <!-- 联系电话 -->
        <value value="${tempPhone}" />
        <!-- 使用方式:现在 -->
        <use value="temp" />
    </telecom>
    </#if>
    <#if tempEmail ??>
    <telecom>
        <!-- 联系方式代码 -->
        <system value="email" />
        <!-- 电子邮箱地址 -->
        <value value="${tempEmail}" />
        <!-- 使用方式:现在 -->
        <use value="temp" />
    </telecom>
    </#if>
    <#if gender ??>
    <!-- 性别 -->
    <gender value="${mappingValue('GBT22611',gender)!''}" />
    </#if>
    <#if birthdate ??>
    <!-- 出生日期 -->
    <birthDate value="${birthdate?string("yyyy-MM-dd")}" />
    </#if>
    
    <address>
        <#if homeRoad ??>
        <!-- 地址-村（街、路、弄等）-->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/text/address-road">
            <valueString value="${homeRoad}" />
        </extension>
        </#if>
        <#if homeHouseNo ??>
        <!--地址-门牌号码 -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/text/house-no">
            <valueString value="${homeHouseNo}" />
        </extension>
        </#if>
        <!-- 地址类别代码:家庭住址 -->
        <use value="home" />
        <#if homeText ??>
        <!-- 地址详细信息 -->
        <text value="${homeText}" />
        </#if>
        <#if homeLine ??>
        <!-- 地址-乡（镇、街道办事处） -->
        <line value="${homeLine}" />
        </#if>
        <#if homeCity ??>
        <!-- 地址-市（地区） -->
        <city value="${homeCity}" />
        </#if>
        <#if homeDistrict ??>
        <!-- 地址-县（区） -->
        <district value="${homeDistrict}" />
        </#if>
        <#if homeState ??>
        <!-- 地址-省（自治区、直辖市） -->
        <state value="${homeState}" />
        </#if>
    </address>
    <address>
        <#if tempRoad ??>
        <!-- 地址-村（街、路、弄等） -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/text/address-road">
            <valueString value="${tempRoad}" />
        </extension>
        </#if>
        <#if tempHouseNo ??>
        <!--地址-门牌号码 -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/text/house-no">
            <valueString value="${tempHouseNo}" />
        </extension>
        </#if>
        <#if tempPostCd ??>
         <!--现地址邮政编码 -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/text/post-cd">
            <valueString value="${tempPostCd}" />
        </extension>
        </#if>
        <!-- 地址类别代码:现居住地址 -->
        <use value="temp" />
        <#if tempText ??>
        <!-- 地址详细信息 -->
        <text value="${tempText}" />
        </#if>
        <#if tempLine ??>
        <!-- 地址-乡（镇、街道办事处） -->
        <line value="${tempLine}" />
        </#if>
        <#if tempCity ??>
        <!-- 地址-市（地区） -->
        <city value="${tempCity}" />
        </#if>
        <#if tempDistrict ??>
        <!-- 地址-县（区） -->
        <district value="${tempDistrict}" />
        </#if>
        <#if tempState ??>
        <!-- 地址-省（自治区、直辖市） -->
        <state value="${tempState}" />
        </#if>
    </address>
    <address>
        <#if workRoad ??>
        <!-- 地址-村（街、路、弄等） -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/text/address-road">
            <valueString value="${workRoad}" />
        </extension>
        </#if>
        <#if workHouseNo ??>
        <!--地址-门牌号码 -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/text/house-no">
            <valueString value="${workHouseNo}" />
        </extension>
        </#if>
        <#if workPostCd ??>
        <!--工作单位邮政编码 -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/text/post-cd">
            <valueString value="${workPostCd}" />
        </extension>
        </#if>
        <!-- 地址类别代码:工作单位地址 -->
        <use value="work" />
        <#if workText ??>
        <!-- 地址详细信息 -->
        <text value="${workText}" />
        </#if>
        <#if workLine ??>
        <!-- 地址-乡（镇、街道办事处） -->
        <line value="${workLine}" />
        </#if>
        <#if workCity ??>
        <!-- 地址-市（地区）-->
        <city value="${workCity}" />
        </#if>
        <#if workDistrict ??>
        <!-- 地址-县（区） -->
        <district value="${workDistrict}" />
        </#if>
        <#if workState ??>
        <!-- 地址-省（自治区、直辖市） -->
        <state value="${workState}" />
        </#if>
    </address>
    <#if maritalstatus ??>
    <maritalStatus>
        <coding>
            <!-- 婚姻状况代码命名空间 -->
            <system value="urn:oid:2.16.156.10011.2.3.3.5" />
            <!-- 婚姻状况代码 -->
            <code value="${maritalstatus}" />
        </coding>
    </maritalStatus>
    </#if>
    <#if patientTelecoms ??>
    <#list patientTelecoms as patientTelecom>
    <!-- 联系人的信息 -->
    <contact>
        <#if patientTelecom.idCardType ??>
        <!-- 联系人身份证件类别代码CV0201101 -->
        <extension url="urn:oid:2.16.156.10011.2.3.1.1">
            <valueCode value="${patientTelecom.idCardType}" />
        </extension>
        </#if>
        <#if patientTelecom.lmIdNo ??>
        <!-- 联系人标识号号码 -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/text/lm-id-no">
            <valueString value="${patientTelecom.lmIdNo}" />
        </extension>
        </#if>
        <#if patientTelecom.telTypeCd ??>
        <!-- 联系人电话-类别代码 -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/code/tel-type-cd">
            <valueCode value="${patientTelecom.telTypeCd}" />
        </extension>
        </#if>
        <#if patientTelecom.linkmanPost ??>
        <!-- 联系人邮编 -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/text/linkman-post">
            <valueString value="${patientTelecom.linkmanPost}" />
        </extension>
        </#if>
        <#if patientTelecom.relationship ??>
        <relationship>
            <coding>
                <!-- 联系人关系代码命名空间 -->
                <system value="urn:oid:2.16.156.10011.2.3.3.8" />
                <!-- 联系人关系代码 -->
                <code value="${patientTelecom.relationship}" />
            </coding>
        </relationship>
        </#if>
        <#if patientTelecom.name ??>
        <name>
            <!-- 联系人姓名 -->
            <text value="${patientTelecom.name}" />
        </name>
        </#if>
        <#if patientTelecom.phone ??>
        <telecom>
            <!-- 联系人联系方式代码 -->
            <system value="phone" />
            <!-- 联系人电话号码 -->
            <value value="${patientTelecom.phone}" />
            <use value="temp" />
        </telecom>
        </#if>
        <address>
            <#if patientTelecom.tempRoad ??>
            <!-- 地址-村（街、路、弄等） -->
            <extension
                url="http://www.nestvision.com/platform/app/data/v1/text/address-road">
                <valueString value="${patientTelecom.tempRoad}" />
            </extension>
            </#if>
            <#if patientTelecom.tempHouseNo ??>
            <!--地址-门牌号码 -->
            <extension
                url="http://www.nestvision.com/platform/app/data/v1/text/house-no">
                <valueString value="${patientTelecom.tempHouseNo}" />
            </extension>
            </#if>
            <!-- 地址类别代码:现居住地址 -->
            <use value="temp" />
            <#if patientTelecom.tempText ??>
            <!-- 联系人地址详细信息 -->
            <text value="${patientTelecom.tempText}" />
            </#if>
            <#if patientTelecom.tempLine ??>
            <!-- 地址-乡（镇、街道办事处） -->
            <line value="${patientTelecom.tempLine}" />
            </#if>
            <#if patientTelecom.tempCity ??>
            <!-- 地址-市（地区） -->
            <city value="${patientTelecom.tempCity}" />
            </#if>
            <#if patientTelecom.tempDistrict ??>
            <!-- 地址-县（区） -->
            <district value="${patientTelecom.tempDistrict}" />
            </#if>
            <#if patientTelecom.tempState ??>
            <!-- 地址-省（自治区、直辖市） -->
            <state value="${patientTelecom.tempState}" />
            </#if>
        </address>
    </contact>
    </#list>
    </#if>
</Patient>