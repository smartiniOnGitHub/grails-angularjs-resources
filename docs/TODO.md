grails-angularjs-resources - TODO
=================================

TODO
----
- for release 1.3.x (aligned with AngularJS-1.3.x):
	- check if make a dedicated branch (at least for 1.2.x maintenance) ...
	- test-webapp24: under the web-app folder, remove static files outside assets folders (if/where possible) ... no, it's already ok, see todo of test webapp
	- test-webapp24: add an additional page payout that doesn't use the resources plugin, and use from a new Grails controller ... see later todo of test webapp
	- verify if restore the module angular-autobind (and related angular-manual.js file ...
	- verify if add a config key for disabling the minification of JavaScript files (but only for DEV environment) ...
	- update to AngularJS-1.3.x ...
	- finish initial version of the test webapp: get data from the Rest Controller via service/resource/http ...
	- update doc in history ...
	- generate and publish plugin doc for this release ...


- future:
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

- for release 1.2.22 (small fixes):
	- update AngularJS ... ok
	- do the same steps of previous releases ... ok

- for release 1.2.23 (small fixes):
	- update AngularJS ... ok
	- do the same steps of previous releases ... ok

---------------
