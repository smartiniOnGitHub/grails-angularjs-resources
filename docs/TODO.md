grails-angularjs-resources - TODO
=================================

TODO
----

- for release 1.3.17, in maintenance branch 1.3.x (update dependencies) ... do if/when needed ...

- for release 1.4.x (aligned with AngularJS-1.4.x):
	- AngularJsAjaxFilters, in test webapp 2.4 override default settings (for example for actions prefix) and make it work ...
	- add a test webapp even with latest stable Grails 2.5.x, but without wrapper (not so useful here) ...
	- make it compatible (consumable) even with the Asset-Pipeline Plugin, and use it from latest test webapp ...


- future:
	- refactor AngularJS sample code to use services/factories for ajax queries, as a sample usage from here ... maybe later
	- update code to updated best practices (if/where required) ...
	- to simplify debugging of variables, try to use angular.mock.dump(object); (requires ngMock) ...
	- add (in project root) a CHANGELOG.md and move there all things done ...
	- verify if restore the module angular-autobind (and related angular-manual.js file ...
	- verify if add a config key for disabling the minification of JavaScript files (but only for DEV environment) ...
	- use bower (from Node.js) to handle dependencies to static resources (where possible) ...
	- check if add Angular-Hint (but only in DEV environment) ... ok, but maybe later (wait for a release) ...
		https://github.com/angular/angular-hint
		- at least in test webapps ... yes, start to use here ...
	- migrate from Resources Plugin to Asset-Pipeline Plugin (default in Grails-2.4.x) ... no, it's better to create another (dedicated) plugin
		- note that there is already another Plugin for AngularJS and Assets ... ok, let's see later what to do
		- otherwise try to make both work together ...
	- verify how to deploy modules for *.js.map files only in dev environment (if possible) ...
	- add some real unit/integration tests ...
	- improve documentation with a detailed Tutorial, from a Grails point of view ...
	- verify if move (maybe in the *NoProdResource.groovy configuration file) angular test-only js files (angular-mocks.js, angular-scenario.js) ...
	  or verify al least if exclude those files with a dedicated flag (set up in the webapp that uses the plugin) ...
	- verify if add a Groovy (or Grails) Script to start a minimal Web Server for publishing static resources only, 
	  to simplify/speedup development with static resources only ...


- etc ...

---------------


DONE
----

- fork the original plugin, update dependencies, and do some cleanup ... ok
- add test webapp with reference to the inline plugin ... ok

- in the test webapp start to use resources published by the plugin ... ok

- try to empty "index" module of resources, and see if n2e controller work the same ... ok

- create documentation for the plugin and generate it ... ok
	- in the History put a reference to original author: "Vladimír Oraný", email: "vladimir.orany@appsatori.eu" ... ok

- as requested by a user, publish plugin release as is (updated but without finishing my tests and update docs) ... ok
	- and tag it in git (but for simplicity use the same release number) ... ok

- for release 1.0.7 (small improvements/cleanup):
	- update plugin version to 1.0.7 ... ok
	- update AngularJS to latest stable (currently 1.0.7), update docs, etc ... ok
	- remove angular-manual.js (unless objections or problems) ... ok
	- then re-tag and re-deploy the updated plugin ... ok
	- re-generate documentation, and publish in my GitHUB Pages ... ok
	- just after publishing the new release, update docs/links in Grails Plugin web page ... ok

- for release 1.0.8 (small improvements/cleanup):
	- update AngularJS files to 1.0.8 ... ok
    - add Thumbs.db in pluginExcludes ... ok

- for release 1.0.9 (small improvements/cleanup):
	- remove remaining references to angular-manual.js in the angular-autobind section ... ok
	- remove the (unnecessary now) angular-autobind section ... ok
	- add some tests in the test webapp for a Grails Controller and related gsp pages ... ok
	- add some tests in the test webapp to call a Grails Controller that returns json data ... ok
	- add some tests in the test webapp for a Grails Controller but using only static html pages ... ok but still not fully working

- reminder: re-generate documentation, and publish in my GitHUB Pages (in any release) ... ok

- for release 1.2.5 (first in the 1.2.x development line):
	- update to AngularJS 1.2.5 ... ok
	- define new modules in resources config for new AngularJS files ... ok
	- update requirements to Grails-2.2.x (currently 2.2.4) ... ok
	- update dependencies to resources 1.2.1 or later ... ok
	- update the test webapp to Grails-2.2.x (currently 2.2.4) ... ok
	- check if delete *.js.map files ... yes, and maybe re-add them later ... ok
	- define modules even for *.js.map files in resources configuration ... ok but do not enable it now
	- enable modules for *.js.map files in resources configuration ... no, remove related *Resource config file (it seems unnecessary)
	- update install/usage info in main README.md in the test webapp ... ok
	- improve tests in the test webapp for a Grails Controller but using only static html pages ... ok

- for release 1.2.11 (small improvements/cleanup):
	- update to AngularJS-1.2.11 ... ok
	- update doc in history ... ok

- for release 1.2.14 (small improvements/cleanup):
	- update to AngularJS-1.2.14 ... ok
	- copy minimal AngularJS files even in the static part of test webapp (to have it working without copying by hand) ... ok
	- update doc in history ... ok
	- generate and publish plugin doc for this release ... ok

- for release 1.2.14.1 (maintenance over 1.2.14):
	- small improvements over 1.2.14 release, and small updates/clarifications in docs and in the test webapp ... ok
	- merge fixes and do some tests ... ok
	- check to fix the issue #13, (and #14 and related), on download of first *.min.js.map file ... ok
	- fix remaining issues: #16 ... ok
	- fix no minification for js files in DEV environment ... ok
	- generate and publish plugin doc for this release ... ok
	- note that here angularJSVersion is '1.2.14' (and not '1.2.14.1', my mistake) ...ok

- for release 1.2.15 (small fixes):
	- update to AngularJS-1.2.15 ... ok
	- update doc in history ... ok
	- generate and publish plugin doc for this release ... ok
	- test the plugin in the test webapp ... ok

- for release 1.2.16 (small fixes):
	- do the same steps of previous releases ... ok

- for release 1.2.17 (small fixes):
	- do the same steps of previous releases ... ok

- for release 1.2.20 (small fixes and compatibility with Grails-2.4):
	- update AngularJS ... ok
	- create a (another) test webapp with Grails-2.4.2 and configure it for testing the plugin in inline mode (as in the other) ... ok
	- remove references to old Grails *Holder classes (no more present in Grails-2.4.x), and use grails.util.Holders instead ... ok
	- merge/update changes from the existing (older) test webapp into the new one (based on Grails-2.4.x)... ok
	- do the same steps of previous releases ... ok

- for release 1.2.21 (small fixes):
	- update AngularJS ... ok
	- do the same steps of previous releases ... ok

- for release 1.2.22 (small fixes) ... ok
- for release 1.2.23 (small fixes) ... ok
- for release 1.2.25 (update dependencies) ... ok
- for release 1.2.26 (update dependencies) ... ok
- for release 1.2.26.1 (small fixes): unreleased because since resources 1.2.9 (up to the last 1.2.13) things aren't working ...
	- create a maintenance branch for plugin sources for AngularJS-1.2.x, and use master for 1.3.x ... ok
	- update resources plugin to latest stable (last working was 1.2.8) ... ok
	- note that it seems more a problem os Resources Plugin, or JQuery Plugin ... ok

- for release 1.3.0 (aligned with AngularJS-1.3.0):
	- create a maintenance branch for plugin sources for AngularJS-1.2.x, and use master for 1.3.x ... ok
	- test-webapp24: under the web-app folder, remove static files outside assets folders (if/where possible) ... no, it's already ok, see todo of test webapp
	- test-webapp24: add an additional page payout that doesn't use the resources plugin, and use from a new Grails controller ... see later todo of test webapp
	- update to AngularJS-1.3.0 (even minimal files under all test webapps, just for convenience) ... ok
	- define additional modules (for new AngularJS resources), and delete old ones (if any) ... ok
	- print angular version in console (not in pages for now), using angular.version JavaScript method ... ok
	- update doc in history with updated/new modules, etc ... ok
	- generate and publish plugin doc for this release ... ok

- for release 1.3.1 (update dependencies) ... ok
	- test webapps: update RestSampleController to be more generic, and handle more output formats (json, xml) using withFormat ... ok
	- update test webapp (for Grails 2.4.x) to latest stable Grails 2.4.4 ... ok

- for release 1.3.2 (update dependencies) ... ok

- for release 1.2.26.1 (small fixes): unreleased because since resources 1.2.9 (up to the last 1.2.13) things aren't working ... maybe later
- for release 1.2.27 (update dependencies, and revert to an Resources plugin release 1.2.8) ... ok

- for release 1.3.4 (update dependencies) ... ok
- for release 1.3.7 (update dependencies) ... ok
- for release 1.3.8 (update dependencies) ... ok
- for release 1.3.10 (update dependencies) ... change number, update workaround on resources plugin, update dependencies (even in test webapps) ... ok
	- use the new angular syntax as for Controllers (and remove $scope, etc) as a sample for new best practices ... maybe later
	- make changes proposed by Angular Batarang (Chrome Extension) as a sample for new best practices ... ok
	- check if disabling asset-pipeline plugin (and related tags in layouts/gsp pages) even latest resources plugin works good (1.2.9 and higher) ... no, it was a problem in the Resources Plugin, resolved in 1.2.14
- for release 1.3.15 (update dependencies) ... ok
	- update test webapp (for Grails 2.4.x) to latest stable Grails 2.4.5 ... ok

- when AngularJS-1.4.0 will be released, create maintenance branch for 1.3.x in the Plugin ... ok

- for release 1.3.16 (update dependencies) ... ok

- for release 1.4.0 (update to AngularJS-1.4.x) ... ok
	- update modules with the new ones (angular-message-format) and remove old/outdated (if any), then update docs ... ok
	- remove dependency on jQuery Plugin (old 1.11.x version bundled with Grails) ... better, first try with it enabled, the comment it ... ok (add some js code block to log to console if jQuery is or isn't present, and if present, print its version)
	- update Plugin generated docs ... ok

- for release 1.4.1 (update dependencies) ... ok
	- add an AngularJsService, to publish (server side) some useful info, like version, etc ... ok
	- in test webapp 2.4, show usage for AngularJsService, and update log to show info level ... ok
	- do some cleanup (and revert log level, to avoid resources warnings for false positive messages) ... ok
	- check if remove Grails Wrapper in the test webapp 2.4 ... maybe later
	- add a AngularJsAjaxFilters where any method name that starts with ajax (and with GET or POST) must be an Ajax call ... ok
	- AngularJsAjaxFilters, update log to display info level (both in the plugin and in the test webapp 2.4) ... ok
	- AngularJsAjaxFilters, ensure is will be called only with desired actions ... ok
	- AngularJsAjaxFilters, show its minimal usage in test webapp 2.4 ... ok
	- AngularJsAjaxFilters, check if filter only GET or POST query ... maybe it's enough the current implementation
	- AngularJsAjaxFilters, in test webapp 2.4 add a sample ajax call to sample Grails Controller or the Rest-like one (update related view accordingly) ... ok
	- Rest sample Controller, in test webapp 2.4, update results returned from index action to return a list of results (more than 1 record), for a more general sample ... ok
	- Rest sample Controller, in test webapp 2.4, add an ajaxData action, like in the just updated index action ... ok
	- finish initial version of the test webapp: get data from the Rest Controller via service/resource/http (or at least from a static json file) ... ok
	- update Plugin generated docs ... ok

- for release 1.4.2 (update dependencies and small updates) ... ok
	- Rest sample Controller, in test webapp 2.4, check AngularJS ajax call to ajaxData action, why it's filtered out by the plugin filter (check if needed some header in AngularJS $http query or similar) ... ok (updated sample js code to force add a non standard, but common, and used in Grails xhr method called by my filter) request header
	- Rest sample Controller, in test webapp 2.4, instead of index, call ajaxData action (in controller.js, and info in data.gsp) ... ok
	- AngularJsAjaxFilters, check if return HTTP error for filtered out queries (if possible), or forward/redirect to a dedicated error page ... ok (returning an HTTP error 403)
	- AngularJsAjaxFilters, set the prefix for controller name, and for action name in a configuration variable (instead resp. of all controllers '*' and the fixed prefix 'ajax*'), in plugin AngularjsResourcesConfig (and then load/merge its config in plugin doWithSpring closure) ... ok
	- update plugin docs with new settings ... ok
	- update Plugin generated docs ... ok


---------------
