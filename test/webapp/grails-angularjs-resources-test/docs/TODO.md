
grails-angularjs-resources-test - TODO
======================================

TODO
----

- use resources of the angularjs-resources plugin ...

- Grails sample controllers, AngularSampleStaticController: add a sample html (or htm ?) page, remove its gsp view and ensure it will be used (or redirect to it) ...
- Grails sample controllers, add related view pages but with AngularJS templating inside ...
  - a gsp ... wip, need to add rerefence to the right (to do resource bundle "app" with all application-specific AngularJS Controllers, etc ...
  - an html page ... wip, verify if it makes sense here, or if forward to a html page under /static ...
  - some json data ... wip (ok for a first version, with only one object, but without input parameters, not based on domain object, etc) ...

- add content like in AngularJS-seed ...
- enable AngularJS routes and template instead of Grails templating, but in a dedicated page (to show both cases) ...
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
  - note that still the error happen (but now for the normal, not ninified version) of js files, 
    probably it's something related to resources plugin, verify later ...

- Grails sample controllers, add (AngularSampleGrailsController, AngularSampleStaticController, RestSampleController) ... ok
- Grails sample controllers, RestSampleController: map under /rest/sample ... no, but note that probably it's not needed (at least here)
- Grails sample controllers, RestSampleController: remove sample view (gsp page) ... no, it could stay here, even if not used anymore
- Grails sample controllers, RestSampleController: add other methods (and map them) in the right REST way ... no, it's not needed here


---------------
