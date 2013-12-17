grails-angularjs-resources - TODO
=================================

TODO
----

- for release 1.0.9 (small improvements/cleanup):
	- remove remaining references to angular-manual.js in the angular-autobind section ... ok
	- remove the (unnecessary now) angular-autobind section ... ok
	- add some tests in the test webapp for a Grails Controller and related gsp pages ... ok
	- add some tests in the test webapp for a Grails Controller but related html pages ...
	- add some tests in the test webapp to call a Grails Controller that returns json data ...

- for release 1.2.0 (small improvements/cleanup):
	- update to AngularJS 1.2.5 or later ...
	- update requirements to Grails-2.2.x (currently 2.2.4) ...
	- update dependencies to resources 1.2.1 or later ...
	- finish initial version of the test webapp: get data from the Rest Controller via service/resource/http ...


- update install info in main README.md, and test it creating a new Grails webapp from scratch (but then delete it), important ...
- improve documentation with a detailed Tutorial, from a Grails point of view ...


- verify if remove (or move in a test configuration) angular test-only js files (angular-scenario.js and other test-related sources, like angular-mocks.js) ...
	- or verify al least if exclude those files with a dedicated flag (set up in the webapp that uses the plugin) ...

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

- reminder: re-generate documentation, and publish in my GitHUB Pages (in any release) ... ok


---------------
