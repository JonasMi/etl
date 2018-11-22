<#ftl output_format="XML">
<Practitioner xmlns="http://hl7.org/fhir">
    <#if praScope??>
    <!-- 执业范围 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/pra-scope">
        <valueString value="${praScope}" />
    </extension>
    </#if>
    <#if ifPrescribe??>
    <!-- 是否拥有处方权 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/boolean/if-prescribe">
        <valueBoolean value="${ifPrescribe?string("true","flase")}" />
    </extension>
    </#if>
    <#if ifPoison??>
    <!-- 是否可以开立毒麻药品 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/boolean/if-poison">
        <valueBoolean value="${ifPoison?string("true","flase")}" />
    </extension>
    </#if>
    <#if ifPsychotropic??>
    <!-- 是否可以开立精神药品 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/boolean/if-psychotropic">
        <valueBoolean value="${ifPsychotropic?string("true","flase")}" />
    </extension>
    </#if>
    <#if antibioticUsePermission??>
    <!-- 抗生素使用权限 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/antibiotic-use-permission">
        <valueCode value="${antibioticUsePermission}" />
    </extension>
    </#if>
    <#if employeeId??>
    <identifier>
        <!-- 院内人员ID号命名空间 -->
        <system
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id" />
        <!-- 院内人员ID号 -->
        <value value="${employeeId}" />
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
    <#if name??>
    <name>
        <!-- 姓名 -->
        <text value="${name}" />
    </name>
    </#if>
    <#if gender??>
    <!-- 性别 -->
    <gender value="${mappingValue('GBT22611',gender)!''}" />
    </#if>
    <#if birthdate??>
    <!-- 出生日期 -->
    <birthDate value="${birthdate?string("yyyy-MM-dd")}" />
    </#if>
   	<#if departmentId?? || practitionerRole?? || post??>
    <practitionerRole>
    	<#if departmentId??>
        <!--科室代码 -->
        <organization>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id|${departmentId}" />
        </organization>
        </#if>
        <#if practitionerRole??>
        <role>
            <coding>
                <!--岗位代码命名空间 -->
                <system value="http://hl7.org/fhir/practitioner-role" />
                <!-- 岗位代码 -->
                <code value="${practitionerRole}" />
            </coding>
        </role>
        </#if>
        <#if post??>
        <specialty>
            <coding>
                <!-- 专业技术职务代码命名空间 -->
                <system value="urn:oid:2.16.156.10011.2.3.3.10" />
                <!-- 专业技术职务代码 -->
                <code value="${post}" />
            </coding>
        </specialty>
        </#if>
    </practitionerRole>
    </#if>
    <#if qualificationCertificateNo??>
    <qualification>
        <identifier>
            <!-- 从业资格证号 -->
            <system value="http://www.nestvision.com/platform/app/data/v1/text/qualification-certificate-no"/>
            <value value="${qualificationCertificateNo}" />
        </identifier>
        <code />
    </qualification>
    </#if>
</Practitioner>