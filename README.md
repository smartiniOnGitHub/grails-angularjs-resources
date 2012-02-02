# Grails AngularJS Resources Plugin

This plugin adds [AngularJS](http://angularjs.org/) resources to the Grails Application.

It uses new [Resources Plugin](http://grails.org/plugin/resources) to handle resources gracefully.
Just let your AngularJS resources (services, controllers etc.) depend on 'angular' module and it's done.
To autobind AngularJS to the page require 'angular-autobind' module in the template.

There is also controller for AngularJS scenario testing. Just navigate to `<app>/nge2e/<scenario-module-name>` to see the results.
The scenario module must depend on 'angular-scenario'.

The plugin serves minified version for environments other than development. If jQuery plugin is installed
it automatically depends on it (inspired by great [Twitter Bootstrap Plugin](http://grails.org/plugin/twitter-bootstrap)).

To install the plugin just type

```
  grails install-plugin angularjs-resources
```

