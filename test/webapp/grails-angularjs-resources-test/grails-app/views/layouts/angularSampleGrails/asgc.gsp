<!doctype html>
<html lang="en" class="no-js" ng-app="app">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
		<title><g:layoutTitle default="Grails"/></title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
		<meta name="pageId" content="${controllerName}.${actionName}" />
		<link rel="shortcut icon" href="${resource(dir: 'images', file: 'favicon.ico')}" type="image/x-icon"/>
		<link rel="apple-touch-icon" href="${resource(dir: 'images', file: 'apple-touch-icon.png')}"/>
		<link rel="apple-touch-icon" sizes="114x114" href="${resource(dir: 'images', file: 'apple-touch-icon-retina.png')}"/>
		<link rel="stylesheet" href="${resource(dir: 'css', file: 'main.css')}" type="text/css"/>
		<link rel="stylesheet" href="${resource(dir: 'css', file: 'mobile.css')}" type="text/css"/>
		<g:layoutHead/>
		<!--  // include a module published by the plugin, but unnecessary here because already referenced in the app module ... //-->
		<%-- <r:require modules="angular"/> //--%>
		<%-- <r:require modules="angular-all"/> //--%>
		<!--  // implicit (so unnecessary here) because it has the same name used ...
		<r:require modules="app"/>
		//-->
		<r:layoutResources />
	</head>
	<body>
		<!-- 
			Sample reference to AngularJS objects from inline scripts.
			Otherwise in gsp pages, use the resources script tag (r_script), 
			and optionally force it at the end of head specifying disposition="head".
			Otherwise (manual way, as seen here) use directly the HTML script tag.
		//-->
		<script>
		// Sample reference to AngularJS objects from inline scripts
		var app = angular.module('app', ['app']);
		var angularVersion = angular.version.full;
		if (window.console) {
			// console.log('Angular instance: ', app);
			console.log('Angular Version: ', angularVersion);
		}
		</script>

		<div id="grailsLogo" role="banner">
			<a href="${request.contextPath}"><img src="${resource(dir: 'images', file: 'grails_logo.png')}" alt="Home"/></a>
		</div>

		<g:layoutBody/>

		<div class="footer" role="contentinfo">
			<div>AngularJS, Variable binding samples: 
				v<span app-version></span>
				<!-- , webapp-context-name: <span app-webapp_context_name></span> -->
			</div>
		</div>

		<g:javascript library="application"/>
        <r:layoutResources />

		<!-- // manual version ...
		<script src="js/app.js"/>
		<script src="js/services.js"/>
		<script src="js/controllers.js"/>
		<script src="js/filters.js"/>
		<script src="js/directives.js"/>
		//-->
	</body>
</html>
