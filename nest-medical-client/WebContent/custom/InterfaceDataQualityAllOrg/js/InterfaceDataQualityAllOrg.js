$(function(){
	var resourceService = new FhirResourceService(NestProxy.SERVER_API_URL + '/api/dataQualityReport/interface/org/');
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
			sort : 'upTime=DESC',
			page : 0,
			size : pager.pageSize
	};
	$('#searchBtn').on('click',function(){
		searchRefresh(resourceService,pager,emptyRecord,customSearch);
	});
	$('#resetBtn').on('click',function(){
		$("input[type=reset]").trigger("click");
	});
	$('#content').on('click','.spread',function(e){
		 $("#action"+$(this).attr('num')).fadeToggle();
	});
	$('#content').on('click','.search',function(e){
		var start = searchSE.start;
		var end = searchSE.end;
		var url = $(this).attr('url');
		if(start != '' && start != undefined){
			url+="&start="+start;
		}
		if(end != '' && end != undefined){
			url+="&end="+end;
		}
		window.location.href =encodeURI(url);
	});
	/* resourceService 资源查询对象
	 * pager 分页对象
	 * emptyRecord 查询为空时列表显示内容
	 * customSearch:自定义查询条件
	 */
	searchRefresh(resourceService,pager,emptyRecord,customSearch);
});

