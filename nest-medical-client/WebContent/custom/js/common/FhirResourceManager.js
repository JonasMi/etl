var FhirResourceManager = function(_config) {
	var defaultConfig = {};
	var config = $.extend(defaultConfig, _config);
	var resourceService = config.resourceService;
	var instance = this;
	var searchSort = 'upTime=DESC';
	var recordTable = $('#recordTable');

	var pager = new Pager({
		'wrapper' : '#page-wrapper',
		'onPageChange' : function(e, pageNumber) {
			instance.changePageNumber(pageNumber);
		},
		'onPageSizeChange' : function(pageSize) {
			instance.refresh();
		}
	});
	var registryEvents = function() {

		// 全选反选事件
		$('#checkAll').change(function() {
			var checked = this.checked;
			$('input.checkItem').each(function() {
				this.checked = checked;
			});
		});

		// 刷新事件
		$('.refresh').click(function(e) {
			e.preventDefault();
			instance.refresh();
		});

		// 批量删除事件
		$('#batchDelete').click(
				function(e) {
					e.preventDefault();
					var ids = instance.getCheckedRecordIds();
					if (ids.length > 0) {
						NestProxy.modal.confirm('删除确认', '您确认要删除选中的'
								+ ids.length + '条消息记录吗?', function() {
							instance.removeAll(ids);
						});

					} else {
						NestProxy.dialog.warn('系统提示', '请至少选中一行需要删除的记录');
					}
				});
		// 详情弹出框打开事件
		$('#messageDetailModal').on('shown.bs.modal', function() {
			var message = $('#messageDetailModal').data('record');
			instance.loadDetail(message);
		});
		// 请求详情弹出框打开事件
		$('#nestRequestDetailModal').on('shown.bs.modal', function() {
			var request = $('#nestRequestDetailModal').data('request');
			instance.loadRequestDetail(request);
		});

		var buildSendMessageHtml = function(ids) {

			var form = $('<form id="batchSendOptionForm" class="form-horizontal form-bordered"></form>');
			var formGroup = $('<div class="form-group"></div>');
			var sendOptionLabel = $('<label class="col-sm-3 control-label">发送选项</label>');
			var sendOptionWrapper = $('<div class="col-sm-9"></div>');
			var sendSuccessOptions = $('<div class="radio"><label><input name="sendOption" type="radio" value="0" checked="checked"> 仅发送未成功的请求 (包含未发送的)</label></div>');
			var sendErrorOptions = $('<div class="radio"><label><input name="sendOption" type="radio" value="1"> 仅发送已成功的请求</label></div>');
			var sendAllOptions = $('<div class="radio"><label><input name="sendOption" type="radio" value="2"> 发送所有请求</label></div>');
			sendOptionWrapper.append(sendSuccessOptions).append(
					sendErrorOptions).append(sendAllOptions);
			formGroup.append(sendOptionLabel).append(sendOptionWrapper);
			form.append(formGroup);

			var message = $('<p></p>');
			message.html('您确认要发送选中的' + ids.length + '条消息记录吗? 如果是,请选择以下的发送选项.');
			var element = $('<div></div>');
			element.append(message).append(form);
			return element;

		};

		// 批量发送事件
		$('#batchSend').click(
				function(e) {
					e.preventDefault();
					var ids = instance.getCheckedRecordIds();
					if (ids.length > 0) {
						var msgElement = buildSendMessageHtml(ids);

						NestProxy.modal.confirm('发送确认', msgElement, function() {
							var option = $('#batchSendOptionForm')
									.serializeArray()[0].value;
							instance.sendAll(ids, option);
						});

					} else {
						NestProxy.dialog.warn('系统提示', '请至少选中一行需要发送的消息记录');
					}
				});
		//自动刷新事件
		$('#searchForm select').change(function(e){
			instance.refresh();
		});
		
		//查看消息结构
		$('#lookMessageMeta').click(function(e){
			$('#messageMetaModal').modal('show');
		});

	};
	var createEmptyRecordElement = function() {

		return $('<tr class="record"><td colspan="9" align="center">没有查询到消息记录</td></tr>');

	};
	var createRecordElement = function(message) {
		var recordElement = $('<tr class="record"></tr>');

		// create checkbox
		var checkBoxUI = $('<div class="ckbox ckbox-success"></div>');
		var checkBoxInput = $('<input type="checkbox" class="checkItem"></input>');
		checkBoxInput.attr('id', 'input_' + message.uid);
		var checkBoxLabel = $('<label></label>');
		checkBoxLabel.attr('for', 'input_' + message.uid);
		var checkBoxUIWrapper = $('<td></td>');
		checkBoxUI.append(checkBoxInput).append(checkBoxLabel);
		checkBoxUIWrapper.append(checkBoxUI);
		recordElement.append(checkBoxUIWrapper);

		// uid
		var uidElement = $('<td class="row-uid"></td>');
		if (!message.errorType) {
			uidElement
					.html('<a href="#"><span class="text-success glyphicon glyphicon-ok"></span> <span>'
							+ message.uid + "</span></a>");
			uidElement.attr('title', '消息处理正常');
		} else {
			uidElement
					.html('<a href="#"><i style="color:#D9534F" class="fa fa-bug"></i> <span>'
							+ message.uid + "</span></a>");
			uidElement.attr('title', '消息处理有错:' + message.errorType);
		}

		recordElement.append(uidElement);
		uidElement.click(function(e) {
			e.preventDefault();
			var messageRecord = $(this).parent().data('record');
			instance.showDetailDialog(messageRecord);
		});

		// upHospital
		var upHospitalElement = $('<td class="row-upHospital"></td>');
		upHospitalElement.text(message.upHospital);
		recordElement.append(upHospitalElement);

		// 上传时间
		var upTimeElement = $('<td class="row-upTime"></td>');
		if (message.upTime) {
			var d = new Date(message.upTime);
			upTimeElement.text(d.format('yyyy-MM-dd hh:mm:ss'));
		}
		recordElement.append(upTimeElement);

		// 开发商
		var developerElement = $('<td class="row-developer"></td>');
		developerElement.text(message.developer);
		recordElement.append(developerElement);

		// 操作状态
		var operationStateElement = $('<td class="row-operationState"></td>');
		if (message.operationState == 'CREATE') {
			var label = $('<span class="label label-success"><span>');
			label.text('新增');
			operationStateElement.html(label);
		} else if (message.operationState == 'UPDATE') {
			var label = $('<span class="label label-primary"><span>');
			label.text('更新');
			operationStateElement.html(label);
		}
		recordElement.append(operationStateElement);

		// 处理状态
		var dealStateElement = $('<td class="row-dealState"></td>');

		if (message.dealState == 'PROCESSED') {
			var label = $('<span class="label label-success"><span>');
			label.text('已处理');
			dealStateElement.html(label);
		} else if (message.dealState == 'UNPROCESSED') {
			var label = $('<span class="label label-danger"><span>');
			label.text('未处理');
			dealStateElement.html(label);
		}

		recordElement.append(dealStateElement);

		// 错误类型
		var errorTypeElement = $('<td class="row-errorType"></td>');
		if (!message.errorType) {
			var span = $('<span class="blank">N/A</span>');
			errorTypeElement.html(span);
		} else {
			errorTypeElement.text(message.errorType);
		}
		recordElement.append(errorTypeElement);
		recordElement.data('record', message);
		return recordElement;
	};
	this.getCheckedRecordIds = function() {
		var ids = [];
		$('input.checkItem:checked').each(function() {
			var message = $(this).parent().parent().parent().data('record');
			ids.push(message.uid);
		});
		return ids;
	};
	this.createColumnRecord = function(fieldModel, messageDetail) {

		var createEmptyElement = function() {
			var valueElement = $('<td></td>');
			var span = $('<span class="blank"></span>');
			span.text('N/A');
			valueElement.html(span);
			return valueElement;
		};
		var columnRecord = $('<tr class="record"></tr>');
		if (fieldModel.nullable === false) {
			columnRecord.addClass('danger');
			columnRecord.attr('必填项');
		} else {
			
			columnRecord.attr('选填项');

		}
		if (fieldModel.name) {
			var nameElement = $('<td></td>');
			nameElement.text(fieldModel.name);
			columnRecord.append(nameElement);
		} else {
			columnRecord.append(createEmptyElement());
		}

		if (fieldModel.displayName) {
			var displayNameElement = $('<td></td>');
			displayNameElement.text(fieldModel.displayName);
			columnRecord.append(displayNameElement);
		} else {
			columnRecord.append(createEmptyElement());
		}

		if (fieldModel.type) {
			var typeElement = $('<td></td>');
			typeElement.text(fieldModel.type);
			columnRecord.append(typeElement);
		} else {
			columnRecord.append(createEmptyElement());
		}
		var valueElement = $('<td></td>');
		var value = messageDetail[fieldModel.javaName];
		if (value) {
			if (fieldModel.valueHandler) {
				var realValue = fieldModel.valueHandler.call(this, value);
				valueElement.html(realValue);
			} else {
				valueElement.text(value);
			}
			columnRecord.append(valueElement);
		} else {
			columnRecord.append(createEmptyElement());
		}

		if (fieldModel.note) {
			var noteElement = $('<td></td>');
			noteElement.text(fieldModel.note);
			columnRecord.append(noteElement);
		} else {
			columnRecord.append(createEmptyElement());
		}

		return columnRecord;
	};
	var createNestRequestRecordElement = function(nestRequest) {
		var nestRecordElement = $('<tr class="record"></tr>');
		nestRecordElement.attr('id', 'nestRequest_' + nestRequest.id);
		// order
		var orderElement = $('<td></td>');
		var orderLabel = $('<span class="label label-primary"></span>');
		orderLabel.text(nestRequest.order + 1);
		orderElement.append(orderLabel);
		nestRecordElement.append(orderElement);

		// 消息内容
		var resourceTypeElement = $('<td></td>');
		var resourceTypeHref = $('<a href="#"></a>');
		resourceTypeHref.click(function(e) {
			e.preventDefault();
			var request = $(this).parent().parent().data('record');
			$('#nestRequestDetailModal').data('request', request)
			$('#nestRequestDetailModal').modal('show');
		});

		resourceTypeHref.text(nestRequest.resourceType);
		resourceTypeElement.html(resourceTypeHref);
		nestRecordElement.append(resourceTypeElement);

		// soapAction
		var soapActionElement = $('<td></td>');
		soapActionElement.text(nestRequest.soapAction);
		nestRecordElement.append(soapActionElement);
		
		//重发次数
		var retryTimesElement = $('<td></td>');
		retryTimesElement.text(nestRequest.retryTimes);
		nestRecordElement.append(retryTimesElement);
		// 发送时间
		var sendTimeElement = $('<td></td>');
		if (nestRequest.sendTime) {
			sendTimeElement.text(new Date(nestRequest.sendTime)
					.format('yyyy-MM-dd hh:mm:ss'));
		} else {
			sendTimeElement.html('<span class="blank">N/A</span>');
		}
		sendTimeElement.attr('id', 'sendTime_' + nestRequest.id)
		nestRecordElement.append(sendTimeElement);
		

		// 发送状态
		var sendedElement = $('<td></td>');
		var label = null;
		if (nestRequest.sended === true) {
			label = $('<span class="label label-success">已发送</span>')
		} else {
			label = $('<span class="label label-danger">未发送</span>')
		}
		label.attr('id', 'requestStatus_' + nestRequest.id);
		sendedElement.html(label);
		nestRecordElement.append(sendedElement);

		// 发送结果
		var successElement = $('<td></td>');

		if (nestRequest.sended === true) {
			if (nestRequest.success === true) {
				label = $('<span class="label label-success">成功</span>')
			} else {
				label = $('<span class="label label-danger">失败</span>')
			}
		} else {
			label = $('<span class="label label-default">N/A</span>')
		}
		label.attr('id', 'requestResult_' + nestRequest.id);
		successElement.html(label);
		nestRecordElement.append(successElement);

		// 发送
		var sendElement = $('<td></td>');
		var sendBtn = $('<a data-toggle="tooltip" title="发送" href="#"><span class="glyphicon glyphicon-send"></span></a>');
		sendBtn.attr('id', 'sendBtn_' + nestRequest.id);
		sendElement.append(sendBtn);
		nestRecordElement.append(sendElement);

		sendBtn.click(function(e) {
			e.preventDefault();
			var request = $(this).parent().parent().data('record');
			;
			NestProxy.modal.confirm('发送确认', '您确定要发送这条Nest请求吗?', function() {
				instance.sendNestRequest(request);
			});

		});
		nestRecordElement.data('record', nestRequest);
		return nestRecordElement;

	};
	this.sendNestRequest = function(request) {

		var buildBlockMessage = function(currentRequest) {
			var panel = $('<div class="panel panel-default"></div>');
			var panelBody = $('<div class="panel-body"></div>');
			var msg = $('<div class="row">Nest请求发送中...受网络影响可能花费较长时间,请耐心等待</div>');
			var info = $('<div class="row"><div class="col-sm-3">消息序号</div><div class="col-sm-3">1</div></div>');
			panelBody.append(msg);
			panelBody.append(info);
			panel.append(panelBody);
			return panel;
		};
		var before = function(currentRequest) {
			var id = currentRequest.id;
			var blockMessage = buildBlockMessage(currentRequest);
			// instance.blockNestRequestPanel(blockMessage);
			var statusUI = $('#requestStatus_' + id);
			var resultUI = $('#requestResult_' + id);
			var sendTimeUI = $('#sendTime_' + id);
			var sendBtn = $('#sendBtn_' + id);
			sendBtn
					.replaceWith('<img src="../../images/loaders/loader26.gif">');
			sendTimeUI.text(new Date().format('yyyy-MM-dd hh:mm:ss'));
			resultUI
					.replaceWith('<img src="../../images/loaders/loader26.gif">')
			statusUI.removeClass('label-success');
			statusUI.removeClass('label-danger');
			statusUI.addClass('label-default');
			statusUI.text('发送中');
		};
		var after = function(currentRequest) {
			var future = resourceService
					.getNestRequestRecord(currentRequest.id);
			future
					.success(function(resp) {
						if (resp.status == NestProxy.API_STATUS.SUCCESS) {
							var newRecordElement = createNestRequestRecordElement(resp.data);
							var oldRecordElement = $('#nestRequest_'
									+ currentRequest.id);
							oldRecordElement.replaceWith(newRecordElement);
						} else {
							alert('刷新Nest请求记录失败');
						}
					});

		};
		var success = function(currentRequest, result) {
			instance.refreshNestRequests();
		};
		var fail = function(currentRequest, error) {
			NestProxy.dialog.error('消息发送失败', error);
		};

		var taskConfig = {
			'handlers' : {
				'before' : before,
				'after' : after,
				'success' : success,
				'fail' : fail

			},
			'service' : resourceService,
			'requests' : [ request ]
		};
		var nestRequestSendTask = new NestRequestSendTask(taskConfig);
		nestRequestSendTask.execute();
	};
	this.setNestRequests = function(nestRequests) {
		var nestRequestsTable = $('#nestRequestsTable');
		nestRequestsTable.find('tr.record').remove();
		if (nestRequests && nestRequests.length > 0) {
			$.each(nestRequests, function() {
				var nestRecordElement = createNestRequestRecordElement(this);
				nestRequestsTable.append(nestRecordElement);
			});
		} else {
			var emptyRecord = $('<tr class="record"><td class="blank" colspan="6" align="center">没有查询到相关数据</td></tr>');
			nestRequestsTable.append(emptyRecord);
		}

	};
	this.getNestRequestPanel = function() {
		var nestRequestsTable = $('#nestRequestsTable');
		var wrapper = nestRequestsTable.parent();
		return wrapper;
	};
	this.blockNestRequestPanel = function(message) {

		var wrapper = instance.getNestRequestPanel();
		wrapper.block({
			message : message,
			css : {
				width : '400px;'
			}
		});
	};
	this.unblockNestRequestPanel = function() {
		var wrapper = instance.getNestRequestPanel();
		wrapper.unblock();
	};

	this.refreshNestRequests = function(id) {
		if (id) {
			instance.currentMessageId = id;
		} else {
			id = instance.currentMessageId;
		}

		instance.blockNestRequestPanel('正在加载消息的Nest请求数据...');
		var future = resourceService.findNestRequests(id);
		future.complete(function() {
			instance.unblockNestRequestPanel();
		});
		future.success(function(resp) {
			if (resp.status == NestProxy.API_STATUS.SUCCESS) {
				instance.setNestRequests(resp.data);
			} else {
				NestProxy.dialog.error('错误', resp.msg);
			}
		});
	};
	this.setRequestDetail = function(requestDetail) {
		$.each(requestDetail, function(key, value) {
			var element = $('#request_' + key);
			if (key == 'order') {
				element.text(value + 1);
			} else if (key == 'sendTime') {
				var time = new Date(value).format('yyyy-MM-dd hh:mm:ss');
				element.text(time);
			} else if (key == 'sended') {
				var span;
				if (value === true) {
					span = $('<span class="label label-success">已发送</span>');
				} else {
					span = $('<span class="label label-danger">未发送</span>');
				}
				element.html(span);
			} else if (key == 'success') {
				var span;
				if (value === true) {
					span = $('<span class="label label-success">成功</span>');
				} else {
					span = $('<span class="label label-danger">失败</span>');
				}
				element.html(span);
			} else {
				element.text(value);
			}

		});
		var exceptionContent = $('#exceptionContent');// 异常信息内容
		if (requestDetail.success === true) {
			exceptionContent.hide();
		} else {
			exceptionContent.show();
		}

	};
	this.setDetail = function(messageDetail) {

		// 处理数据字段的显示
		var dataColumnsTable = $('#dataColumnsTable');
		dataColumnsTable.find('tr.record').remove();
		$.each(fieldModels, function() {
			var record = instance.createColumnRecord(this, messageDetail);
			dataColumnsTable.append(record);
		});

		// 处理请求消息记录
		instance.refreshNestRequests(messageDetail.uid);
	};
	this.loadRequestDetail = function(request) {
		var blockUI = $('#nestRequestDetailModal .modal-content');
		blockUI.block({
			message : '正在加载请求详情...'
		});
		var future = resourceService.getNestRequest(request.id);
		future.complete(function() {
			blockUI.unblock();
		});
		future.success(function(resp) {
			if (resp.status == NestProxy.API_STATUS.SUCCESS) {
				instance.setRequestDetail(resp.data);
			} else {
				NestProxy.dialog.error('错误', resp.msg);
			}
		});
	};
	this.loadDetail = function(message) {

		$('#messageDetailModal .modal-content').block({
			message : '正在加载消息详情...'
		});
		var future = resourceService.get(message.uid);
		future.complete(function() {
			$('#messageDetailModal .modal-content').unblock();
		});
		future.success(function(resp) {
			if (resp.status == NestProxy.API_STATUS.SUCCESS) {
				instance.setDetail(resp.data);
			} else {
				NestProxy.dialog.error('错误', resp.msg);
			}
		});
	};
	this.showDetailDialog = function(message) {
		$('#messageDetailModal').data('record', message);
		$('#messageDetailModal').modal('show');

	};
	this.changePageNumber = function(pageNumber) {
		var search = this.buildSearch({
			page : pageNumber
		});
		this.executeSearch(search);
	};
	this.refresh = function() {
		var search = instance.buildSearch();
		instance.executeSearch(search);
	};

	this.buildSearch = function(_search) {
		var search = {
			page : 0,
			size : pager.pageSize,
			sort : searchSort
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
	};
	this.clearRecords = function() {
		recordTable.find('tr.record').remove();
	};
	this.setRecords = function(data) {
		instance.clearRecords();
		var messages = data.content;
		if (messages.length > 0) {
			$.each(messages, function() {
				var recordElemet = createRecordElement(this);
				recordTable.append(recordElemet);
			});
		} else {
			var emptyRecord = createEmptyRecordElement();
			recordTable.append(emptyRecord);
		}
	};
	this.sendAll = function(ids, option) {
		$('#contentpanel').block({
			message : '正在发送消息记录...'
		});
		var future = resourceService.sendAll(ids, option);
		future.complete(function() {
			$('#contentpanel').unblock();
		});
		future.done(function(resp) {
			if (resp.status == NestProxy.API_STATUS.SUCCESS) {
				NestProxy.dialog.success('成功', resp.msg);
				instance.refresh();
			} else {
				NestProxy.dialog.error('错误', resp.msg);
			}
		});
	};
	this.removeAll = function(ids) {
		$('#contentpanel').block({
			message : '正在删除消息记录...'
		});
		var future = resourceService.removeAll(ids);
		future.complete(function() {
			$('#contentpanel').unblock();
		});
		future.done(function(resp) {
			if (resp.status == NestProxy.API_STATUS.SUCCESS) {
				NestProxy.dialog.success('成功', '删除消息记录成功');
				instance.refresh();
			} else {
				NestProxy.dialog.error('错误', resp.msg);
			}
		});
	};
	this.executeSearch = function(search) {
		
		$('body').block({message:'正在查询数据...'});
		var future = resourceService.find(search);
		future.complete(function() {
			$('body').unblock();
		});
		future.done(function(resp) {
			if (resp.status == NestProxy.API_STATUS.SUCCESS) {
				instance.setRecords(resp.data);
				$('#checkAll')[0].checked = false;
				pager.setPage(resp.data);
			} else {
				NestProxy.dialog.error('错误', resp.msg);
			}
		});
	};
	this.initMessageMetaTable=function(){
		
		var messageMetaTable =$('#messageMetaTable');
		var createValue=function(value){
			var span =$('<span></span>');
			if(!value){
				span.addClass('blank');
				span.text('N/A');
			}else{
				span.text(value);
			}
			return span;
		};
		var createMessageMetaRecord =function(fieldModel){
			var record =$('<tr></tr>');
			
			var nameElement =$('<td></td>');
			nameElement.html(createValue(fieldModel.name));
			record.append(nameElement);
			
			var displayNameElement =$('<td></td>');
			displayNameElement.html(createValue(fieldModel.displayName));
			record.append(displayNameElement);
			
			var typeElement =$('<td></td>');
			typeElement.html(createValue(fieldModel.type));
			record.append(typeElement);
			
			var requiredElement =$('<td></td>');
			var requiredSpan;
			if(fieldModel.nullable===false){
				requiredSpan =$('<span class="label label-danger">必填</span>');				
			}else{
				requiredSpan =$('<span class="label label-success">选填</span>');				
			}
			requiredElement.html(requiredSpan);
			record.append(requiredElement);
			
			var checkeElement =$('<td></td>');
			checkeElement.html(createValue(fieldModel.check));
			record.append(checkeElement);
			
			var noteElement =$('<td></td>');
			noteElement.html(createValue(fieldModel.note));
			record.append(noteElement);
			
			return record;
			
		};
		$.each(fieldModels,function(){

			var record =createMessageMetaRecord(this);
			messageMetaTable.append(record);
		});
	};
	this.init = function() {
		registryEvents();
		instance.refresh();
		instance.initMessageMetaTable();
	};
};