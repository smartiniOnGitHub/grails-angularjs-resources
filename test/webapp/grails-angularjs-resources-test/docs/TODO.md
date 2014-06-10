
grails-angularjs-resources-test - TODO
======================================

TODO
----


- future:
	- check if/how to debug routing, for example to show errors in case of missing template/partial ...
	- add content like in AngularJS-phonecat ...
	- refactor webapp AngularJS-related files to use a structure like that of Grails sources ...
	- use even from run-war ... ok, but in Tomcat logs there are some warnings ... verify it
	- deploy the war in Tomcat, and test it ...
	- add sample (but real) AngularJS tests, and then execute them using angularjs.Nge2eController ...
	- etc ...

---------------


DONE
----

- setup and fix initial webapp skeleton ... ok
- fix the error when trying to use the angularjs.Nge2eController ... ok, add app module and even index module

- generate a war and inspect content ... ok

- verify why test-app gives error:
ERROR resource.ResourceMeta  - Resource not found: /plugins/angularjs-resources-0.2.5/js/angular/angular.min.js
  - it was something related to resources nominify inside the plugin (for the TEST environment) ... ok
  - note that still the error happen (but now for the normal, not minified version) of js files, 
    probably it's something related to resources plugin, verify later ...

- enable AngularJS routes and template instead of Grails templating, but in a dedicated page (to show both cases) ... ok

- Grails sample controllers, add (AngularSampleGrailsController, AngularSampleStaticController, RestSampleController) ... ok
- Grails sample controllers, RestSampleController: map under /rest/sample ... no, but note that probably it's not needed (at least here)
- Grails sample controllers, RestSampleController: remove sample view (gsp page) ... no, it could stay here, even if not used anymore
- Grails sample controllers, RestSampleController: add other methods (and map them) in the right REST way ... no, it's not needed here

- Grails sample controllers, AngularSampleStaticController: ... ok
  - add a sample html (or htm ?) page, remove its gsp view and ensure it will be used (or redirect to it) ... ok
  - note that probably it's better to go to a (standard view) gsp page, so it's possible for the controller to publish some variables to it),
    and then use static (or dynamic) pages but using only AngularJS templating ... like in the AngularSampleGrailsController ... ok
  - anyway this controller is useful to test an all-static view ... ok

- Grails sample controllers, add related view pages but with AngularJS templating inside ... ok
	- a gsp ... wip, need to add reference to the right (to do resource bundle "app" with all application-specific AngularJS Controllers, etc ... maybe later
	- an html page ... wip, verify if it makes sense here, or if forward to a html page under /static ... maybe later
	- some json data ... wip (ok for a first version, with only one object, but without input parameters, not based on domain object, etc) ... maybe later

- use resources of the angularjs-resources plugin ... it's not-so-simple because in the url there is the plugin name and version ... maybe later

- fix the (client-side) include in the static page ... resolved: keep AngularJS related application scripts as last (at the bottom of the page) ... ok
- put in evidence (via a css style) included template ... ok


---------------
