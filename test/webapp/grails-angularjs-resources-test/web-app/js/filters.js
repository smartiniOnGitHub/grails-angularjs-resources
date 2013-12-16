'use strict';

/* Filters */

angular.module('app.filters', []).
	filter('interpolate', ['version', function(version) {
			return function(text) {
				return String(text).replace(/\%VERSION\%/mg, version);
			}
		}
		])
	/*
// TODO: make it work (later) ...
	.filter('interpolate', ['webapp_context_name', function(webapp_context_name) {
			return function(text) {
				return String(text).replace(/\%WEBAPP_CONTEXT_NAME\%/mg, webapp_context_name);
			}
		}
	])
	 */
;
