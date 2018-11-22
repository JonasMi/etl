var MatcherConfigurationMappingService = function() {
	var basePath = NestProxy.SERVER_API_URL
			+ '/api/MatcherConfigurationMapping';
	this.get =function(clazz){
		return $.ajax({
			url : basePath + '/get',
			type : 'GET',
			data:{'clazz':clazz},
			dataType : 'json'		
		});
	};
	this.save = function(mapping) {

		return $.ajax({
			url : basePath + '/',
			type : 'POST',
			dataType : 'json',
			data:JSON.stringify(mapping),
			contentType : 'application/json'
		});
	};
};