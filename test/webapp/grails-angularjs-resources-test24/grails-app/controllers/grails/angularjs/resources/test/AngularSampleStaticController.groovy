package grails.angularjs.resources.test

class AngularSampleStaticController 
{

    def index() 
	{
		log.info("index - params: $params")

		// do some processing (if needed), before redirecting/forwarding to the static page here ...

		// redirecting/forwarding to the static page ...
		//
		// render(view: "index")  // ok, go to index.gsp
		// render(view: "page.html")  // no, it search page.html.jsp
		// redirect(uri: "/angularSampleStatic/index.html")
		// redirect(uri: "/angularSampleStatic/page.html")  // ok, but do not call it "index.html" ...
		// other test: redirect to a different (and full) url, where all static resources could be hosted ...
		//
		// redirect(uri: "/angularSampleStatic/page.html")
		// new, just as a sample, redirect to a page if given as parameter (but attention !!) ...
		def page = safePageFromParameters(params?.page)
		log.info("redirecting to page ${page}")
		redirect(uri: "${page}")
	}

	private def safePageFromParameters(page) {
		def pageName = page ?: "page"
		// minimal security: force to be only under the related folder , and a .html resource ...
		def pattern = /^[.\\/]/
		if (pageName =~ pattern)
			throw new IllegalArgumentException("page parameter must not contain path characters at the beginning")

		return "/angularSampleStatic/${pageName}.html"
	}
}
