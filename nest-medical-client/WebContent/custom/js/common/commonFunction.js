var data;
var searchSE;
function parameterMap(dataItem)
{
		var strHref = decodeURI(window.location.search);
		var intPos = strHref.indexOf("?");
		var strRight = strHref.substr(intPos + 1);
		var arrTmp = strRight.split("&");
		for(var i = 0; i < arrTmp.length; i++)
		{
		var arrTemp = arrTmp[i ].split("=");
		if(arrTmp[i].substring(0,arrTmp[i].indexOf("=")) == dataItem){
			return arrTmp[i].substring(arrTmp[i].indexOf("=")+1);
		}
		
		if(arrTemp[0] == dataItem) return arrTemp[1];
		}
		return "";
}
function buildSearch(_search) {
	var search = {
		page : 0,
		size : 10,
		sort : 'upTime=DESC'
	};
	if (_search) {
		$.extend(search, _search);
	}
	var searchFormData = $('#searchForm').serializeArray();
	$.each(searchFormData, function() {
		var realValue = $.trim(this.value);
		if (realValue) {
			search[this.name] = this.value;
		}

	});
	return search;
}
function searchRefresh(resourceService,pager,emptyRecord,customSearch){
	var search = buildSearch(customSearch);
	searchSE = search;
	return executeSearch(search,resourceService,pager,emptyRecord);
}

function refresh(resourceService,pager,emptyRecord,searchSort) {
	var search = buildSearch({
		page : 0,
		size : pager.pageSize,
		sort : searchSort
	});
	searchSE = search;
	executeSearch(search,resourceService,pager,emptyRecord)
	return search;
};

function changePageNumber (pageNumber,resourceService,pager,emptyRecord,searchSort) {
	var search = buildSearch({
		page : pageNumber,
		size : pager.pageSize,
		sort : searchSort
	});
	executeSearch(search,resourceService,pager,emptyRecord);
};

function _getRandomString(len) {  
    var l = len || 32;  
    var $chars = 'ABCDEFGHJKMNPQRSTWXYZabcdefhijkmnprstwxyz2345678'; // 默认去掉了容易混淆的字符oOLl,9gq,Vv,Uu,I1  
    var maxPos = $chars.length;  
    var pwd = '';  
    for (var i = 0; i < l; i++) {  
        pwd += $chars.charAt(Math.floor(Math.random() * maxPos));  
    }  
    return pwd;  
} 

function executeSearch(search,resourceService,pager,emptyRecord) {
	$('#preloader').show();
	var future = resourceService.find(search);
	$('body').block({message:'正在查询数据...'});
	future.complete(function() {
		$('#preloader').hide();
		$('body').unblock();
	});
	future.done(function(resp) {
		data = resp;
		if (resp.content.length > 0 ) {
			var html = baidu.template("contentTpl",resp);
			$('#content').html(html);
			pager.setPage(resp);
		} else {
			$('#content').html(emptyRecord);
			pager.setPage(resp);
		}
	});
};
