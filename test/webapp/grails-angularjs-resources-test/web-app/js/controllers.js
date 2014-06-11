'use strict';

/* Controllers */

angular.module('app.controllers', [])
	.controller('AppCtrl1', ['$scope', '$log', function($scope, $log) {
		$log.debug("in AppCtrl1");
		$scope.message = "Hello from Controller 1";
	}])
	.controller('AppCtrl2', ['$scope', '$log', function($scope, $log) {
		$log.debug("in AppCtrl2");
		$scope.message = "Hello from Controller 2";
	}])
;
