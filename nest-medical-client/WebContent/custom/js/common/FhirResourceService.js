var FhirResourceService = function(url) {
	var instance = this;
	this.apiPaths = {
		defaultPath : url
	};
	this.find = function(search) {
		return $.ajax({
			url : instance.apiPaths.defaultPath,
			type : 'GET',
			dataType : 'json',
			data : search
		});
	};
    this.importDow = function(search) {
        return $.ajax({
            url : instance.apiPaths.defaultPath,
            type : 'GET',
            dataType : 'binary',
            processData: false,
            data : search
        });
    };

	this.get = function(id) {
		return $.ajax({
			url : instance.apiPaths.defaultPath + id,
			type : 'GET',
			dataType : 'json'
		});
	};
	this.removeAll = function(ids) {
		return $.ajax({
			url : instance.apiPaths.defaultPath + 'deleteAll',
			type : 'POST',
			data : {
				'id' : ids
			},
			dataType : 'json'
		});
	};
	this.sendAll = function(ids, option) {
		return $.ajax({
			url : instance.apiPaths.defaultPath + 'sendAll',
			type : 'POST',
			data : {
				'id' : ids,
				'option' : option
			},
			dataType : 'json'
		});
	};
	this.sendNestRequest = function(id) {
		return $.ajax({
			url : instance.apiPaths.defaultPath + 'sendNestRequest',
			type : 'POST',
			data : {
				'nestRequestId' : id
			},
			dataType : 'json'
		});

	};
	this.getNestRequest = function(id) {
		
		return $.ajax({
			url : instance.apiPaths.defaultPath + 'nestRequests/' + id,
			type : 'GET',
			dataType : 'json'
		});
	};
	this.getNestRequestRecord = function(id){
		return $.ajax({
			url : instance.apiPaths.defaultPath + 'nestRequestRecords/' + id,
			type : 'GET',
			dataType : 'json'
		});
	};
	this.findNestRequests = function(id) {
		return $.ajax({
			url : instance.apiPaths.defaultPath + id + '/nestRequests',
			type : 'GET',
			dataType : 'json'
		});
	};
};