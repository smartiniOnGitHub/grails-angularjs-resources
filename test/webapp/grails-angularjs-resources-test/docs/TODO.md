
grails-angularjs-resources-test - TODO
======================================

TODO
----

- use resources of the angularjs-resources plugin ...

- Grails sample controllers, add related view pages (a gsp, an html page, and some json data files ) but with AngularJS templating inside ...
- Grails sample controllers, map RestSampleController under /rest/sample ...

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


---------------
