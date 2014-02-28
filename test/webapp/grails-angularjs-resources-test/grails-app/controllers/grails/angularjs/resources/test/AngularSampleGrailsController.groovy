package grails.angularjs.resources.test

class AngularSampleGrailsController 
{

    def index() 
	{
		log.info("index - params: $params")

		render(view: "index")
	}

}
