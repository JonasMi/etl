var NestProxy = {};
NestProxy.SERVER_API_URL = 'http://localhost:8092';
NestProxy.CN = "130058273";
NestProxy.HOSPITALNAME="大厂县人民医院";
NestProxy.API_STATUS = {
	'SUCCESS' : 200,
	'INPUT_ERROR' : 400,
	'SERVER_ERROR' : 500,
	'AUTH_ERROR' : 401
};
NestProxy.redirect = function(url) {
	window.location.href = url;
};
NestProxy.redirectRoot = function(url) {

	window.top.location.href = url;

};
NestProxy.dialog = {};
NestProxy.modal = {};
NestProxy.dialog._alert = function(title, msg) {
	var rootDocument = window.parent.document;
	var render = $('body', rootDocument);
	var html = $('<div class="alert"></div>');
	html.css({
		'position' : 'fixed',
		'left' : '0px',
		'top' : '0px',
		'z-index' : '9999',
		'text-align' : 'center'
	});
	html.width(rootDocument.body.clientWidth);
	var closeBtn = $('<button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>');
	var titleUI = $('<strong></strong>');
	titleUI.html(title);

	html.append(closeBtn);
	html.append(titleUI);
	html.append('!&nbsp;');
	html.append(msg);
	html.appendTo(render);
	return html;
};
NestProxy.dialog.info = function(title, msg) {

	var html = NestProxy.dialog._alert(title, msg);
	html.addClass('alert-info');
	html.fadeOut(5000, function() {
		$(this).remove();
	});

};
NestProxy.dialog.error = function(title, msg) {
	var html = NestProxy.dialog._alert(title, msg);
	html.addClass('alert-danger');
	html.fadeOut(10000, function() {
		$(this).remove();
	});
};
NestProxy.dialog.success = function(title, msg) {
	var html = NestProxy.dialog._alert(title, msg);
	html.addClass('alert-success');
	html.fadeOut(5000, function() {
		$(this).remove();
	});
};
NestProxy.dialog.warn = function(title, msg) {
	var html = NestProxy.dialog._alert(title, msg);
	html.addClass('alert-warning');
	html.fadeOut(5000, function() {
		$(this).remove();
	});
};
NestProxy.modal._html = function(title, message, buttons) {

	var html = $('<div class="modal fade" role="dialog" aria-hidden="true"></div>');
	var dialog = $('<div class="modal-dialog"></div>');
	var dialog_content = $('<div class="modal-content"></div>');
	var dialog_header = $('<div class="modal-header"> <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button></div>');
	var dialog_title = $('<h4 class="modal-title"></h4>');
	dialog_title.html(title);
	var dialog_body = $('<div class="modal-body"></div>');
	dialog_body.html(message);
	var dialog_footer = $('<div class="modal-footer"></div>');

	$.each(buttons, function() {
		var btn = $('<button type="button"></button>');
		if (this.text) {
			btn.text(this.text);
		}
		if (this.cls) {
			btn.addClass(this.cls);
		}
		if (this.handler) {
			btn.click(this.handler);
		}
		dialog_footer.append(btn);
	});

	dialog_header.append(dialog_title);

	dialog_content.append(dialog_header).append(dialog_body).append(
			dialog_footer);
	dialog.append(dialog_content);
	html.append(dialog);
	return html;
};
NestProxy.modal.alert = function(title, message, callback) {
	var buttons = [ {
		text : '确定',
		cls : 'btn btn-primary',
		handler : function(e) {
			$(this).closest('div.modal').modal('hide');

		}
	} ];
	var modal = NestProxy.modal._html(title, message, buttons);
	modal.on('hidden.bs.modal', function(e) {
		$(this).remove();
		if (callback) {
			callback.call(this);
		}
	});
	modal.modal('show');
};
NestProxy.modal.confirm = function(title, message, callback) {

	var buttons = [ {
		text : '取消',
		cls : 'btn btn-default',
		handler : function(e) {
			$(this).closest('div.modal').modal('hide');
		}
	}, {
		text : '确定',
		cls : 'btn btn-primary',
		handler : function(e) {
			$(this).closest('div.modal').modal('hide');
			if (callback) {
				callback.call(this, e);
			}
		}
	} ];
	var modal = NestProxy.modal._html(title, message, buttons);
	modal.on('hidden.bs.modal', function(e) {
		$(this).remove();
	});
	modal.modal('show');

};
Date.prototype.format = function(fmt)   
{ // author: meizz
  var o = {   
    "M+" : this.getMonth()+1,                 // 月份
    "d+" : this.getDate(),                    // 日
    "h+" : this.getHours(),                   // 小时
    "m+" : this.getMinutes(),                 // 分
    "s+" : this.getSeconds(),                 // 秒
    "q+" : Math.floor((this.getMonth()+3)/3), // 季度
    "S"  : this.getMilliseconds()             // 毫秒
  };   
  if(/(y+)/.test(fmt))   
    fmt=fmt.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length));   
  for(var k in o)   
    if(new RegExp("("+ k +")").test(fmt))   
  fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));   
  return fmt;   
};
var ajaxSetup = {
	beforeSend : function(request) {
		var token = $.cookie('x-token');
		if (token) {
			request.setRequestHeader("x-token", token);
		}

	},
	error : function(XMLHttpRequest, textStatus, errorThrown) {

		NestProxy.dialog.error('错误', '服务端连接错误:' + textStatus + '[' + errorThrown
				+ '],请稍后再试或者联系管理员修复此问题');
	},
	success : function(resp) {
		if (resp.status == NestProxy.API_STATUS.AUTH_ERROR) {
			NestProxy.redirectRoot(NestProxy.BASE_URL + '/signin.html');
		}
	}
};
$.ajaxSetup(ajaxSetup);
$(document).ready(function() {
	var rootDocument = window.parent.document;
	$('div.alert', rootDocument).fadeOut(5000);
});