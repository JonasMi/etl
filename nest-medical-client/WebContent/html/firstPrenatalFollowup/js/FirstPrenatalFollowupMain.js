$(document).ready(function() {
	var fhirResourceManager = new FhirResourceManager({
		resourceService :  new FhirResourceService(NestProxy.SERVER_API_URL + '/api/FirstPrenatalFollowup/')
	});
	fhirResourceManager.init();
});