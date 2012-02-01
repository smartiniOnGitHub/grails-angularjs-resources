# Grails AngularJS Plugin

This plugin adds [AngularJS](http://angularjs.org/) resources to the Grails Application.

It uses new [Resources Plugin](http://grails.org/plugin/resources) to handle resources gracefully.
Just let your AngularJS resources (services, controllers etc.) depend on 'angular' module and it's done.
To autobind AngularJS to the page require 'angular-autobind' module in the template.

There is also controller for AngularJS scenario testing. Just navigate to `<app>/nge2e/<scenario-module-name>` to see the results.
The scenario module must depend on 'angular-scenario'.

The plugin serves minified version for environments other than development. If jQuery plugin is installed
it automatically depends on it (inspired by great [Twitter Bootstrap Plugin](http://grails.org/plugin/twitter-bootstrap)).

The plugin is not yet available on the grails repository, install it by running following command

```
  grails install-plugin http://cloud.github.com/downloads/musketyr/grails-angularjs-resources/grails-angularjs-resources.0.1.1.zip
```

