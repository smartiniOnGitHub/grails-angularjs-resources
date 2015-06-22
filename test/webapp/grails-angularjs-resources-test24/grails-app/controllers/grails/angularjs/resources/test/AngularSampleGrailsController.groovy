package grails.angularjs.resources.test

class AngularSampleGrailsController 
{

	def angularJsService

    def index() 
	{
		log.info("index - params: $params")

		// get some info from the service (exposed by the plugin)
		def angularJsVersion = angularJsService?.getAngularJsVersion()
		log.info("angularJsVersion is '$angularJsVersion'")

		render(view: "index")
	}

}
