Grails AngularJS Resources Plugin
=================================

This plugin adds [AngularJS](http://angularjs.org/) resources to a Grails Application.


It uses Grails [Resources Plugin](http://grails.org/plugin/resources) to handle resources gracefully.
Just let your AngularJS resources (services, controllers etc.) depend on 'angular' module and it's done.

There is also controller for AngularJS scenario testing. Just navigate to `<app>/nge2e/<scenario-module-name>` to see the results.
The scenario module must depend on 'angular-scenario'.

The plugin serves minified version for environments other than development. 
If jQuery plugin is installed it automatically depends on it 
(inspired by great Grails [Twitter Bootstrap Plugin](http://grails.org/plugin/twitter-bootstrap)).


Installation
============

In BuildConfig.groovy of the webapp, under the plugins section (at the end of the file) add:

    runtime ":angularjs-resources:<version>"

then run grails refresh-dependencies, grails clean , then grails compile , and the plugin should be installed.
In case of Errors during plugin installation, Set log level to 'warn' in BuildConfig.groovy to get more information, and retry.
Instead of the compile it's possible even to use runtime, and in that case simply running a grails console should be enough.


Documentation
=============

See the Plugin documentation (sources under src/docs/), or the "live" version here:
[grails-angularjs-resources docs](http://smartiniongithub.github.com/grails-angularjs-resources/)

Home Page for the project (and sources) on GitHUB:
[grails-angularjs-resources](https://github.com/smartiniOnGitHub/grails-angularjs-resources/)


Usage
=====

See the inline test web application (sources under test/webapp/) here:
[grails-angularjs-resources-test](test/webapp/grails-angularjs-resources-test/)


License
=======

Licensed under the terms of the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0)
