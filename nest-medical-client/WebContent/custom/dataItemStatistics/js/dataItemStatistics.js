$(function(){
	var gloabErrorType = "";
	var errorTypesService = new FhirResourceService(NestProxy.SERVER_API_URL + '/api/dataQualityReport/interface/errorTypes/'+parameterMap('logicName')+'/');
	var emptyRecord = '<div class="well well-lg" style="text-align:center">没有查询到相关数据！</div>';
	var pager = new Pager({
		'wrapper' : '#pager',
		'onPageChange' : function(e, pageNumber) {
			var dataItemsService = new FhirResourceService(NestProxy.SERVER_API_URL + '/api/dataQualityReport/interface/dataItems/'+gloabErrorType+'/');
		    customSearch.logicName = parameterMap('logicName');
			customSearch.page = pageNumber;
			searchRefresh(dataItemsService,pager,emptyRecord,customSearch);
		},
		'onPageSizeChange' : function(pageSize) {
			var dataItemsService = new FhirResourceService(NestProxy.SERVER_API_URL + '/api/dataQualityReport/interface/dataItems/'+gloabErrorType+'/');
		    customSearch.logicName = parameterMap('logicName');
		    customSearch.size = pageSize;
			searchRefresh(dataItemsService,pager,emptyRecord,customSearch);
		}
	});
	var customSearch = {
			upHospital:parameterMap('upHospital'),
			sort : 'upTime=DESC',
			page : 0,
			size : pager.pageSize
	}
	/*$('#content').on('click','.spread',function(e){
		 $("#action"+$(this).attr('num')).fadeToggle();
	});*/
	$('#content').on('click','.search',function(e){
		var url = $(this).attr('url') + "&upHospital="+ parameterMap('upHospital')+"&logicName="+parameterMap('logicName');
		window.location.href =encodeURI(url);
	});
	$('#contentTabTitle').on('click','.tab',function(e){
		 var errorType = $(this).attr('errorType');
		 gloabErrorType = $(this).attr('errorType');
		 var dataItemsService = new FhirResourceService(NestProxy.SERVER_API_URL + '/api/dataQualityReport/interface/dataItems/'+errorType+'/');
	     customSearch.logicName = parameterMap('logicName');
	     searchRefresh(dataItemsService,pager,emptyRecord,customSearch);
	     $('.errorTab').css("background-color","#CCDDFF");
	     $(this).css("background-color","#FFFFBB");
	});
	/* resourceService 资源查询对象
	 * pager 分页对象
	 * emptyRecord 查询为空时列表显示内容
	 * customSearch 自定义查询参数
	 */
	/*searchRefresh(resourceService,pager,emptyRecord,customSearch);*/
	
	var future = errorTypesService.find(customSearch);
	future.done(function(resp) {
		if (resp) {
			var data = {};
			data.content = resp;
			var html = baidu.template("contentTabTitleTpl",data);
			$('#contentTabTitle').html(html);
			$('.errorTab').css("background-color","#CCDDFF");
			$('#css0').css("background-color","#FFFFBB");
			if(resp.length > 0){
				var dataItemsService = new FhirResourceService(NestProxy.SERVER_API_URL + '/api/dataQualityReport/interface/dataItems/'+resp[0].errorType+'/');
				gloabErrorType = resp[0].errorType;
				customSearch.logicName = parameterMap('logicName');
				searchRefresh(dataItemsService,pager,emptyRecord,customSearch);
			}
		}
	});
	
});

