package grails.angularjs.resources.test

class AngularSampleStaticController 
{

    def index() 
	{
		log.info("index - params: $params")

		// render(view: "index")  // ok, go to index.gsp
		// render(view: "page.html")  // no, it search page.html.jsp
		// redirect(uri: "/angularSampleStatic/index.html")
		// redirect(uri: "/angularSampleStatic/page.html")  // ok, but do not call it "index.html" ...
		// other test: redirect to a different (and full) url, where all static resources could be hosted ...
		//
		redirect(uri: "/angularSampleStatic/page.html")

	}

}
