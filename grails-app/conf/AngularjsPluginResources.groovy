def dev = grails.util.GrailsUtil.isDevelopmentEnv()
def applicationContext = org.codehaus.groovy.grails.commons.ApplicationHolder.application.mainContext
def jqueryPlugin = applicationContext.pluginManager.getGrailsPlugin('jquery')

def jsFile = dev ? "angular.js" :"angular.min.js"

modules = {
	'angular' {
		if(jqueryPlugin){
			dependsOn 'jquery'
		}
        resource url:[plugin: 'angularjs', dir:'js/angular', file: jsFile], nominify: !dev
		resource url:[plugin: 'angularjs', dir:'js/angular', file: 'angular-manual.js'], nominify: true
    }
	
	'angular-mock' {
		resource url:[plugin: 'angularjs', dir:'js/angular', file:"angular-mocks.js"]
			
	}
	
	'angular-scenario' {
		resource url:[plugin: 'angularjs', dir:'js/angular', file:"angular-scenario.js"]
			
	}
}
