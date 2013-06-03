<!doctype html>
<html>
<head>
	<meta name="layout" content="nge2e">
	<title>AngularJS E2E Scenario Runner</title>
	<g:if test="${params.module}">
		<r:require module="${params.module}"/>
	</g:if>
</head>

<body>
	<g:if test="${!params.module}">
		<h1>Please, specify the module to be tested!</h1>
	</g:if>
</body>
</html>
