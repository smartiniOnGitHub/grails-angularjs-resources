package grails.angularjs.resources.test

import grails.converters.JSON
import grails.converters.XML


class RestSampleController 
{

	def sampleDataResponse = [
		id:1, 
		// controller:'RestSampleController', 
		// action:'index', // set a default value
		message:'Hello from Grails in JSON format', 
		initialTimestamp: new java.util.Date().format("yyyy-MM-dd\'T\'HH:mm:ss.SSSZ"), 
		timestamp: new java.util.Date().format("yyyy-MM-dd HH:mm:ss.SSS"), 
		status:'OK'
	]

    def index() 
	{
		log.info("index - params: $params")

		// test, update timestamp with current ...
		sampleDataResponse['timestamp'] = new java.util.Date().format('yyyy-MM-dd HH:mm:ss.SSS')
		sampleDataResponse['controller'] = controllerName
		sampleDataResponse['action'] = actionName

		// render sampleDataResponse as JSON
		// more generic
		return withFormat {
			json { render sampleDataResponse as JSON }
			xml  { render sampleDataResponse as XML  }
			html { render "<p>Hello from $controllerName.$actionName</p>" }
			js   { render "alert('Hello from $controllerName.$actionName')" }
			// '*'  { render status: NO_CONTENT } 
			// '*'  { render status: response.SC_UNSUPPORTED_MEDIA_TYPE } 
		}
	}

}
