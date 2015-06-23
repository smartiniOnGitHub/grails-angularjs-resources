<!doctype html>
<html>
	<head>
		<meta http-equiv="Content-type" content="text/html; charset=utf-8">
		<meta name="layout" content="angularSampleGrails/asgc"/>
		<title>Page for AngularSampleGrailsController</title>
	</head>
	<body>
		<div>
			<%= "Hello GSP!" %>
		</div>
		<br/>

		<div>
		<p>
			This is a Grails page (gsp), using a Grails Layout.
			<br/>
			Depending on the content value in this page, the layout used could be the usual "main" (general),
			or a layout defined for this controller (for example "asgc").
			Or define a default one for all the webapp (by default in layouts/application.gsp).
		</p>
		</div>
		<hr/>
		<br/>

		<div>
			<h3>AngularJS, AJAX Query sample</h3>
			<br/>
			<hr/>

		<script>
		/*
		// Sample script using AngularJS objects defined upper (by Grails layout used here)
		app = angular.module('app');  // update previously defined app
		// console.log('Angular instance: ', app);

		// important: do not define controllers here because they will overwritten by the inclusion under,
		// and an error will be thrown by Angular ... instead move them in general controllers js file ...

		app.controller('QueryCtrl', ['$scope', function() {
				this.foo = 'First';
		}]);
		// app.controller('QueryCtrl', function($scope) {
		// 	$scope.data = {message: 'Hello'};
		// });
		 */
		</script>

		</div>
		<br/>

		<div ng-controller="DemoCtrl as ctrl">
			<fieldset>
				<legend>DemoCtrl (static data inside the DemoCtrl controller):</legend>
			<!-- DemoCtrl data (dump): {{ ctrl.data }}<br/><br/> //-->
			<ul>
				<li ng-repeat="x in ctrl.data">
					<!-- {{ x }} //-->
					{{ ::x.id }}: {{ ::x.name }} , description: {{ ::x.description }}, timestamp (formatted, from timestamp): {{ x.timestamp | date: 'dd-MM-yyyy HH:mm:ss.sss' }}
				</li>
			</ul>
			</fieldset>
		</div>
		<br/>

		<div ng-controller="QueryCtrl as ctrl">
			<fieldset>
				<legend>QueryCtrl (ajax query to Grails Controller RestSampleController, action method index):</legend>
			<!-- QueryCtrl data (dump): {{ data }}<br/><br/> //-->
			Search: <input ng-model="query"><br/>
			<ul>
				<li ng-repeat="x in data | filter:query">
					{{ ::x.id }}: {{ ::x.message }} , status: {{ ::x.status }}
				</li>
			</ul>
			</fieldset>
		</div>
		<br/>

	</body>
</html>
