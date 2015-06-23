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
		{ id: 1, name: "First", description: "First description" },
		{ id: 2, name: "Second", description: "Second description \n multiline" },
		{ id: 3, name: "Third", description: "" }
	];
});
angular.module('app.controllers').controller('QueryCtrl', function($scope, $http) {
	var url = '../restSample/index';  // relative url to be able to call another controller
	// var url = '../restSample/index2';  // sample bad url, to show error ...
	$http.get(url)
		// .success(function(data, status, headers, config) {
			// this.data = data;
		.success(function(response) {
			console.log("data returned from '" + url + "' is: " + response);
			console.log("data returned (extract):"
				+ " message: '" + response.message + "', "
				+ " timestamp: '" + response.timestamp + "'"
			);
// debugger;  // manually trigger the debugger
			$scope.data = response;
// TODO: check how to use this instead of $scope (old way) ...
		})
		.error(function(data, status, headers, config) {
			console.error("error by calling '" + url + "', with response status: " + status + ' and content: '+ data);  // log error
		});
});
