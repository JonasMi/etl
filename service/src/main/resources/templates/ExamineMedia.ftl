<#ftl output_format="XML">
<!-- 检验标本图片信息请求样例 -->
<Media xmlns="http://hl7.org/fhir">
    <!-- 原系统媒体信息id -->
    <identifier>
        <system value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/media-id"/>
        <value value="${mediaId}"/>
</identifier>
<!-- 媒体类别photo图片video视频audio声音 -->
    <type value="photo"/>
    <!-- 患者信息 -->
    <subject>
        <reference value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/patient-id|${patientId}"/>
    </subject>
    <#if operator??>
    <!-- 生成图像的人 -->
    <operator>
        <reference value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${operator}"/>
    </operator>
   	</#if>
	<content>
		<#if data??||url??>
    	<contentType/>
   		<#if data??>
        <!-- 图片信息 -->
        <data value="${data}"/>
        </#if>
        <#if url??>
        <!-- 图片路径 -->
        <url value="${url}"/>
         </#if>
     	</#if>
    </content>
</Media>
