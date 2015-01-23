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
