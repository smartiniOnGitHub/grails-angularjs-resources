'use strict';

/* Controllers */

angular.module('app.controllers', [])
	.controller('App1Controller', ['$scope', function() {
		this.foo = 'First';
	}])
	.controller('App2Controller', ['$scope', function() {
		this.foo = 'Second';
	}])
;

// angular.module('app.controllers').controller('DemoCtrl', function($scope) {
angular.module('app.controllers').controller('DemoCtrl', function() {
	this.data = [
		{ id: 1, name: "First", description: "First description", timestamp: new Date().getTime() },
		{ id: 2, name: "Second", description: "Second description \n multiline", timestamp: new Date().getTime() },
		{ id: 3, name: "Third", description: "", timestamp: new Date().getTime() }
	];
});
angular.module('app.controllers').controller('QueryCtrl', function($scope, $http) {
	// use a relative url here to be able to call another controller
	var url = // '../restSample/index';  // call another controller, and a standard action
		// '../restSample/notExisting';  // sample bad url, to show error ...
		// '../restSample/ajaxData';     // call another controller, and an ajax action (filtered by Grails Plugin filter)
		'../restSample/ajaxData';
	// $http({ 'url': url, 'method': method, 'data': data, 'headers': { 'X-Requested-With' :'XMLHttpRequest'} });  // manually set an AJAX marker in request headers
	$http.get(url)
		// .success(function(data, status, headers, config) {
			// this.data = data;
		.success(function(response) {
			console.log("data returned from '" + url + "' is: '" + response + "'");
			// console.log("data returned (extract):" + " message: '" + response.message + "', " + " timestamp: '" + response.timestamp + "'");  // ok for single record (old here now) ...
// debugger;  // manually trigger the debugger
			if (response == null || response == '') {
				console.error("error by calling '" + url + "', returning an empty response, status: " + response.status + " and content: '" + response + "'");
				// throw new EmptyResponseException('Empty response');  // need to define EmptyResponseException
				throw new Object({code: -1, name: 'Empty response', detail: response, status: response.status });
			}
			else {
				$scope.data = response;
			}
// TODO: check how to use this instead of $scope (old way) ...
		})
		.error(function(data, status, headers, config) {
			console.error("error by calling '" + url + "', with response status: " + status + " and content: " + data);  // log error
		});
});
