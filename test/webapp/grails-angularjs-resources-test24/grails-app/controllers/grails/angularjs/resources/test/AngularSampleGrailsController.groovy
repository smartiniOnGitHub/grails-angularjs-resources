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

    def data() 
	{
		// sample method for an normal (non-ajax) action (it will not be filtered by plugin AngularJsAjaxFilters) ...
		log.info("data - params: $params")

		render(view: "data")
	}

    def ajaxData() 
	{
		// sample method for an ajax-only action (it will be filtered by plugin AngularJsAjaxFilters, to let only ajax calls to execute it) ...
		log.info("ajaxData - params: $params")

		render(view: "data")
	}

}
