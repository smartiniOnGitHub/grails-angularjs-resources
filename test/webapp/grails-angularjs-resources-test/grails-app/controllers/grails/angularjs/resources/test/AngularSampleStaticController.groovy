package grails.angularjs.resources.test

class AngularSampleStaticController 
{

    def index() 
	{
		// render(view: "index")  // ok, go to index.gsp
		// render(view: "page.html")  // no, it search page.html.jsp
		// redirect(uri: "/angularSampleStatic/index.html")
		// redirect(uri: "/angularSampleStatic/page.html")  // ok, but do not call it "index.html" ...
		redirect(uri: "/angularSampleStatic/page.html")
	}

}
