
	var resourceService = new FhirResourceService(NestProxy.SERVER_API_URL + '/api/dataQualityReport/interface/'+parameterMap('upHospital')+'/'+searchParameter());
	var emptyRecord = $('<tr class="record"><td class="blank" colspan="6" align="center">没有查询到相关数据</td></tr>');
	var flagNo = _getRandomString(32);
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
	var registryEvents = function() {
		$('#searchBtn').on('click',function(){
			refresh(resourceService,pager,emptyRecord,customSearch);
		});
		$('#resetBtn').on('click',function(){
			$("input[type=reset]").trigger("click");
		});
		$('#content').on('click','.search',function(e){
			var url = $(this).attr('url') + "&upHospital="+parameterMap('upHospital');
			window.location.href =encodeURI(url);
		});
	}
	registryEvents();
	$('.excel').on('click',function(event){
		var url =NestProxy.SERVER_API_URL+ $(this).attr('url')+"?orgName="+parameterMap('upHospital')+"&flagNo="+flagNo+"&hospitalName="+parameterMap('upHospitalName');
		for(var key in searchSE){
			url += "&"+key+"="+searchSE[key];
		}
		window.location.href = url;
		var flagUrl =NestProxy.SERVER_API_URL + "/api/dataQualityReport/export/"+flagNo+"/";
		$("#loadingModal").modal({show:'true',backdrop:'static'});
		$(".progress-bar").css("width","0%");
		$("#rate").html("正在下载excel..."+0+"%");
		var timer = setInterval(function(){
	        $.get(flagUrl, null, function(res){
	        	$(".progress-bar").css("width",res+"%");
	        	$("#rate").html("正在下载excel..."+res+"%");
	            if(res == 100){
	            	$(".progress-bar").css("width",res+"%");
	            	$("#rate").html("正在下载excel..."+res+"%");
	            	$("#loadingModal").modal('hide');
	            	clearTimeout(timer);
	            }
	        });    
	    }, 1000);
	});
	
	
	
	
	/* resourceService 资源查询对象
	 * pager 分页对象
	 * emptyRecord 查询为空时列表显示内容
	 * pageSize:分页大小
	 * searchSort:排序方式
	 */
	searchRefresh(resourceService,pager,emptyRecord,customSearch);
	
	function searchParameter(){
		var start = parameterMap('start');
		var end = parameterMap('end');
		var parameter = '?search=yes';
		if(start != ''){
			parameter +="&start="+start;
			$('#start').attr('value',start);
		}
		if(end != ''){
			parameter += "&end="+end;
			$('#end').attr('value',end);
		}
		return parameter;
	}


