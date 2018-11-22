<#ftl output_format="XML">
<Organization xmlns="http://hl7.org/fhir">
	<#if zipcode??>
		<!-- 邮政编码 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/text/zipcode">
		<valueString value="${zipcode}" />
	</extension>
	</#if>	
	<#if website??>
		<!-- 网站 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/text/website">
		<valueString value="${website}" />
	</extension>
	</#if>	
	<#if area??>
	  <!-- 所在地区（区县） -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/text/area">
		<valueString value="${area}" />
	</extension>
	</#if>
		
	<#if latandlon??>	
	<!-- 医院经纬度 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/text/latandlon">
		<valueString value="${latandlon}" />
	</extension>
	</#if>	
	<#if orggrade??>
	<!-- 医院等级 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/text/orggrade">
		<valueString value="${orggrade}" />
	</extension>
	</#if>		
	<#if rideway??>
	<!-- 乘车方式 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/text/rideway">
		<valueString value="${rideway}" />
	</extension>
	</#if>	
	<#if orgintroduce??>
		<!-- 医院简介 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/text/orgintroduce">
		<valueString value="${orgintroduce}" />
	</extension>
	</#if>
	<#if orgphoto??>
		<!-- 医院照片(base64位编码，不得大于200K) -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/text/orgphoto">
		<valueString value="${orgphoto}" />
	</extension>
	</#if>
	<#if orgstate??>
		<!-- 医院状态（目前医院是否是正常营业状态。1开启；0关闭） -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/code/orgstate">
		<valueCode value="${orgstate}" />
	</extension>
	</#if>
	<#if upHospital??>
	 <identifier>
		<!-- 医院ID号命名空间 -->
		<system
			value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/hospital-id" />
		<!-- 医院ID号 -->
		<value value="${upHospital}" />
	  </identifier>
	</#if>
	<#if name??>
	<!-- 医院名称 -->
	<name value="${name}" />
	<#else>
	<name />
	</#if>
	<#if phone??>
		<telecom>
		<!-- 医院联系方式代码 -->
		<system value="phone" />
		<!-- 医院咨询电话 -->
		<value value="${phone}" />
		<use value="work" />
	   </telecom>
	</#if>
	<#if address??>
	  <address>
		<text value="${address}"/>
	  </address>
	</#if>
	
</Organization>