'use strict';

// Declare app level module which depends on filters, and services
var app = angular.module('app', [
	'ngRoute', // since AngularJS-1.2.x ...
	'app.filters', 'app.services', 'app.directives', 'app.controllers'
]);

app.config(['$routeProvider', function($routeProvider) {
	// use relative url (as usual), but note that here Grails need that related pages
	// must be under web-app/$controllerName/<relativePath> ...
	// $routeProvider.when('/view1', {templateUrl: 'partials/partial1.html', controller: 'App1Controller'});
	// $routeProvider.when('/view2', {templateUrl: 'partials/partial2.html', controller: 'App2Controller'});
	//
	// use relative url (as usual), but going up one level, so here Grails need that related pages
	// must be under web-app/<relativePath> ... better for sharing partials between multiple Grails Controllers ...
	// $routeProvider.when('/view1', {templateUrl: '../partials/partial1.html', controller: 'App1Controller'});
	// $routeProvider.when('/view2', {templateUrl: '../partials/partial2.html', controller: 'App2Controller'});
	//
	// or use absolute url here (put related pages under web-app), for better reuse between Grails controllers,
	// but note that the context name has to be provided here ...
	// $routeProvider.when('/view1', {templateUrl: '/partials/partial1.html', controller: 'App1Controller'});
	// $routeProvider.when('/view2', {templateUrl: '/partials/partial2.html', controller: 'App2Controller'});
	//
	// so it's simpler for now to use a relative approach ...
	$routeProvider.when('/view1', {templateUrl: '../partials/partial1.html', controller: 'App1Controller', controllerAs: 'ctrl1'});
	$routeProvider.when('/view2', {templateUrl: '../partials/partial2.html', controller: 'App2Controller', controllerAs: 'ctrl2'});

	// fallback mapping
	$routeProvider.otherwise({redirectTo: '/view1'});
	// $routeProvider.otherwise({redirectTo: '/empty'});
}]);

// manually add a common (but not standard) AJAX header to all $http requests, it has been removed as built-in feature in AngularJS to avoid problems with with CORS requests
app.config(['$httpProvider', function($httpProvider) {
	$httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';
}]);
