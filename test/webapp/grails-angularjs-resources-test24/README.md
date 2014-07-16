grails-angularjs-resources-test24
=================================

Test webapp for the Grails Plugin (for using AngularJS via the Resources Grails plugin) in inline mode.
Note that this webapp requires Grails-2.4 to work.


## Installing the plugin ##

First you need to install the plugin into a Grails application:
configuring it as a dependency in @BuildConfig.groovy@:

	plugins {
	    runtime ':angularjs-resources:<plugin version>'
	}

but note that in this webapp it's used in inline mode.


## Modules published by the plugin ##

Currently, this plugin exposes the following AngularJS files as Grails Resources modules:

* angular.js as 'angular' module
* angular-animate.js  as 'angular-animate'  module
* angular-cookies.js  as 'angular-cookies'  module
* angular-loader.js   as 'angular-loader'   module, useful for asynchronous loading of modules (use this as first)
* angular-resource.js as 'angular-resource' module
* angular-route.js    as 'angular-route'    module
* angular-sanitize.js as 'angular-sanitize' module
* angular-touch.js    as 'angular-touch'    module

and for testing:

* angular-mocks.js    as 'angular-mocks'    module, for mocking objects
* angular-scenario.js as 'angular-scenario' module, for end-to-end tests

Note that there are even other modules defined (just for convenience) to group more modules, for example:

* angular-top, with most-common AngularJS scripts
* angular-all, with all scripts but not test-related scripts


## Using the plugin ##

To use resource modules published by the plugin, you just need to define dependency 
in your ApplicationResources.groovy in the following way (sample):

first add the base module (published by the plugin), then (optional) other modules needed,
and finally all application-specific JavaScript files.

Example:

	modules = {
	    app {  // where 'app' is the name of my-angular-module used in pages ...
			dependsOn 'angular',  // base angular script ...
				// other angular scripts, as needed ...
				'angular-resource', 'angular-route'
	        // last, add application-specific JavaScript files related to angular
			resource url:'js/app.js'
	        resource url:'js/services.js'
	        resource url:'js/controllers.js'
	        resource url:'js/filters.js'
	        resource url:'js/directives.js'
	    }
	}


Please refer to [Resources Plugin - Reference Documentation](http://grails-plugins.github.io/grails-resources/) if you are not familiar with the above settings.



License
=======

Licensed under the terms of the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0)
