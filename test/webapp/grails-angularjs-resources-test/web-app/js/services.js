'use strict';

/* Services */

// Sample value service
var servicesModule = angular.module('app.services', []);

servicesModule.value('version', '1.0');
servicesModule.value('webapp_context_name', 'grails-angularjs-resources-test');  // manual set webapp context name here, as a sample

/*
// TODO: make it work (later) ...
	.value('webapp_context_name', 'grails-angularjs-resources-test')  // manual set webapp context name here, as a sample
// TODO: make it work (later) ...
	.factory('GrailsRestService', function($http) {  // sample to call a GrailsController that returns REST data in json format
		var grailsRestService = {};
		$http.get('restSample/index').success(function(response) {
			grailsRestService.data = response;
		});
		return grailsRestService;
	}
 */
;

/*
// TODO: make it work (later) ...
// $provide.constant('webapp_context_name2', '/grails-angularjs-resources-test');  // manual set webapp context name here, as a sample
 */
