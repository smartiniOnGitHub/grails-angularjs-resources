package grails.angularjs.resources.test

import grails.converters.JSON


class RestSampleController 
{

	def sampleJSonResponse = [controller:'RestSampleController', method:null, message:'Hello from Grails in JSON format']

    def index() 
	{
		// render(view: "index")
		// render Product.list() as JSON
		render sampleJSonResponse as JSON
	}

}
