package grails.angularjs.resources.test

import grails.converters.JSON


class RestSampleController 
{

    def index() 
	{
		log.info("index - params: $params")

		def sampleJSonResponse = [
			id:1, 
			controller:'RestSampleController', 
			method:null, 
			message:'Hello from Grails in JSON format', 
			timestamp: new java.util.Date().format("yyyy-MM-dd HH:mm:ss.SSS"), 
			// timestamp: new java.util.Date().format("yyyy-MM-dd\'T\'HH:mm:ss.SSSZ"), 
			status:'OK'
		]

		// render(view: "index")
		// render Product.list() as JSON
		render sampleJSonResponse as JSON
	}

}
