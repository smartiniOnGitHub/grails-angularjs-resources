/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import grails.util.Environment

def dev  = Environment.isDevelopmentMode()
def test = Environment.current == Environment.TEST
def isDevOrTestEnvironment = (dev || test)

def applicationContext = org.codehaus.groovy.grails.commons.ApplicationHolder.application.mainContext
def jqueryPlugin = applicationContext.pluginManager.getGrailsPlugin('jquery')

def getJsFile(String name) {
	isDevOrTestEnvironment ? "${name}.js" : "${name}.min.js"
}



// environment specific settings
environments 
{
    development {
		/*
		// define the following modules, but only in this environment
		// note that these modules depends on another module (defined in another source)
		modules = {
			'angularJsMap' {
				dependsOn 'angular'
				resource url:[plugin: 'angularjs-resources', dir:'js/angular', file:"angular.min.js.map"]
			}
			'angular-animateJsMap' {
				dependsOn 'angular-animate'
				resource url:[plugin: 'angularjs-resources', dir:'js/angular', file:"angular-animate.min.js.map"]
			}
			'angular-cookiesJsMap' {
				dependsOn 'angular-cookies'
				resource url:[plugin: 'angularjs-resources', dir:'js/angular', file:"angular-cookies.min.js.map"]
			}
			'angular-loaderJsMap' {
				dependsOn 'angular-loader'
				resource url:[plugin: 'angularjs-resources', dir:'js/angular', file:"angular-loader.min.js.map"]
			}
			'angular-resourceJsMap' {
				dependsOn 'angular-resource'
				resource url:[plugin: 'angularjs-resources', dir:'js/angular', file:"angular-resource.min.js.map"]
			}
			'angular-routeJsMap' {
				dependsOn 'angular-route'
				resource url:[plugin: 'angularjs-resources', dir:'js/angular', file:"angular-route.min.js.map"]
			}
			'angular-sanitizeJsMap' {
				dependsOn 'angular-sanitize'
				resource url:[plugin: 'angularjs-resources', dir:'js/angular', file:"angular-sanitize.min.js.map"]
			}
			'angular-touchJsMap' {
				dependsOn 'angular-touch'
				resource url:[plugin: 'angularjs-resources', dir:'js/angular', file:"angular-touch.min.js.map"]
			}
		}
		 */
	}

}
