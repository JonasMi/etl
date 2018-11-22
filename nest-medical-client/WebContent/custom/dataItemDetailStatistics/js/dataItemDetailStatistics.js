$(function(){
	var resourceService = new FhirResourceService(NestProxy.SERVER_API_URL + '/api/dataQualityReport/interface/keys/'+parameterMap('dataItem')+'/');
	var emptyRecord = $('<tr class="record"><td class="blank" colspan="6" align="center">没有查询到相关数据</td></tr>');
	var pager = new Pager({
		'wrapper' : '#pager',
		'onPageChange' : function(e, pageNumber) {
			customSearch.page = pageNumber;
			searchRefresh(resourceService,pager,emptyRecord,customSearch);
		},
		'onPageSizeChange' : function(pageSize) {
			customSearch.size = pageSize;
			searchRefresh(resourceService,pager,emptyRecord,customSearch);
		}
	});
	var customSearch = {
			upHospital:parameterMap('upHospital'),
			logicName:parameterMap('logicName'),
			path:parameterMap('path'),
			errorCode:parameterMap('errorCode'),
			sort : 'upTime=DESC',
			page : 0,
			size : pager.pageSize
	}
	$('#content').on('click','.search',function(e){
		var num = $(this).attr('num');
		$('#message').attr('value',data.content[num].message);
	});
	/* resourceService 资源查询对象
	 * pager 分页对象
	 * emptyRecord 查询为空时列表显示内容
	 * pageSize:分页大小
	 * searchSort:排序方式
	 */
	searchRefresh(resourceService,pager,emptyRecord,customSearch);
});

