var NestRequestSendTask = function(taskConfig) {

	var instance = this;

	var defaultConfig = {
		async : false
	};
	var config = $.extend(defaultConfig, taskConfig);

	var beforeHandler = config.handlers['before'];
	var afterHandler = config.handlers['after'];
	var successHandler = config.handlers['success'];
	var failHandler = config.handlers['fail'];
	this.sendOne = function(request) {
		var service = config.service;
		var requestId = request.id;
		beforeHandler.call(this, request);
		var future = service.sendNestRequest(requestId);
		future.complete(function() {
			afterHandler.call(instance, request);
		});
		future.success(function(resp) {
			if (resp.status == NestProxy.API_STATUS.SUCCESS) {
				successHandler.call(instance,request, resp.data);
			} else {
				failHandler.call(instance,request, resp.msg);
			}
		});

	};
	this.execute = function() {
		var requests = taskConfig.requests;
		$.each(requests, function() {
			instance.sendOne(this);
		});
	};
};