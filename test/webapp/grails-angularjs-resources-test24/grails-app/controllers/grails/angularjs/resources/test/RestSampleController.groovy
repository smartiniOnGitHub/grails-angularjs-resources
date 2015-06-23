package grails.angularjs.resources.test

import grails.converters.JSON
import grails.converters.XML


class RestSampleController 
{

	def initialTimestamp = new java.util.Date().format("yyyy-MM-dd\'T\'HH:mm:ss.SSSZ")
	def sampleDataResponse =  // = [:]  // empty map
		[
		id:1, 
		// controller:'RestSampleController', 
		// action:'index', // set a default value
		message:'Hello from Grails in JSON format', 
		initialTimestamp: initialTimestamp, 
		timestamp: new java.util.Date().format("yyyy-MM-dd HH:mm:ss.SSS"), 
		status:'OK'
	]
	def sampleDataResponse2 = 
		[
		id:5, 
		message:null, 
		initialTimestamp: initialTimestamp, 
		timestamp: new java.util.Date().format("yyyy-MM-dd HH:mm:ss.SSS"), 
		status:'KO'
	]
	def sampleDataList =   // = []  // empty list
		[
		sampleDataResponse,
		sampleDataResponse2
	]

    def index() 
	{
		log.info("index - params: $params")

		// test, update timestamp with current, and add some dynamic properties ...
		sampleDataList.eachWithIndex { e, i -> 
			e['id'] = i + 1
			e['timestamp'] = new java.util.Date().format('yyyy-MM-dd HH:mm:ss.SSS')
			e['controller'] = controllerName
			e['action'] = actionName
		}

		// render sampleDataResponse as JSON
		// more generic
		return withFormat {
			// json { render sampleDataResponse as JSON }  // initial version, ok for a single record (and if it contains only basic types)
			json { render sampleDataList as JSON }  // initial but improved version, ok for a list of records (but containing only basic types)
			xml  { render sampleDataResponse as XML  }
			html { render "<p>Hello from $controllerName.$actionName</p>" }
			js   { render "alert('Hello from $controllerName.$actionName')" }
			// '*'  { render status: NO_CONTENT } 
			// '*'  { render status: response.SC_UNSUPPORTED_MEDIA_TYPE } 
		}
	}

}
