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

// def dev  = Environment.isDevelopmentMode()
// def test = Environment.current == Environment.TEST
// def isDevOrTestEnvironment = (dev || test)

def applicationContext = org.codehaus.groovy.grails.commons.ApplicationHolder.application.mainContext
def jqueryPlugin = applicationContext.pluginManager.getGrailsPlugin('jquery')

def getJsFile(String name) {
	// isDevOrTestEnvironment ? "${name}.js" : "${name}.min.js"
	def fileName = Environment.isDevelopmentMode() ? "${name}.js" : "${name}.min.js"
	// println "Environment.current: ${Environment.current}, Environment.isDevelopmentMode(): ${Environment.isDevelopmentMode()}"
	// println "dev: $dev, test: $test, isDevOrTestEnvironment: $isDevOrTestEnvironment"
	// println "name: $name, fileName: $fileName"
	return fileName
}



modules = {
	'angular' {
		if (jqueryPlugin) {
			dependsOn 'jquery'
		}
		resource url:[plugin: 'angularjs-resources', dir:'js/angular', file:getJsFile("angular")], 
			disposition: 'head', exclude:'minify'
	}

    'angular-animate' {
		dependsOn 'angular'
		resource url:[plugin: 'angularjs-resources', dir:'js/angular', file:getJsFile("angular-animate")],
			exclude:'minify'
    }
    'angular-cookies' {
        dependsOn 'angular'
        resource url:[plugin: 'angularjs-resources', dir:'js/angular', file:getJsFile("angular-cookies")],
			exclude:'minify'
    }
    'angular-loader' {
        // dependsOn 'angular'
        resource url:[plugin: 'angularjs-resources', dir:'js/angular', file:getJsFile("angular-loader")],
			disposition: 'head', exclude:'minify'
    }
    'angular-resource' {
        dependsOn 'angular'
        resource url:[plugin: 'angularjs-resources', dir:'js/angular', file:getJsFile("angular-resource")],
			disposition: 'head', exclude:'minify'
    }
	'angular-route' {
        dependsOn 'angular'
        resource url:[plugin: 'angularjs-resources', dir:'js/angular', file:getJsFile("angular-route")],
			disposition: 'head', exclude:'minify'
    }
	'angular-sanitize' {
        dependsOn 'angular'
        resource url:[plugin: 'angularjs-resources', dir:'js/angular', file:getJsFile("angular-sanitize")],
			exclude:'minify'
    }
	'angular-touch' {
        dependsOn 'angular'
        resource url:[plugin: 'angularjs-resources', dir:'js/angular', file:getJsFile("angular-touch")],
			exclude:'minify'
    }

	'angular-mocks' {
		resource url:[plugin: 'angularjs-resources', dir:'js/angular-tests', file:"angular-mocks.js"],
			disposition: 'head'
	}
	'angular-scenario' {
		resource url:[plugin: 'angularjs-resources', dir:'js/angular-tests', file:"angular-scenario.js"], 
			disposition: 'head', attrs: ['ng:autotest': true]
	}

	'angular-services'{
		dependsOn 'angular'
	}
	'angular-controllers'{
		dependsOn 'angular-services'
	}
	'angular-filters'{
		dependsOn 'angular-controllers'
	}
	'angular-widgets'{
		dependsOn 'angular-filters'
	}


	// define additional modules, for simpler usage

	'angular-cfsw'{  // application specific scripts
		dependsOn 'angular-services'
		dependsOn 'angular-controllers'
		dependsOn 'angular-filters'
		dependsOn 'angular-widgets'
	}

	'angular-top'{  // more commonly used scripts
		dependsOn 'angular-route'
		dependsOn 'angular-resource'
	}

	'angular-all'{  // all without test-related scripts
		// dependsOn 'angular-loader'
		dependsOn 'angular-top'
		dependsOn 'angular-cookies'
		dependsOn 'angular-sanitize'
		dependsOn 'angular-touch'
		dependsOn 'angular-animate'
	}

	'angular-all-with-tests'{  // all with test-related scripts
		dependsOn 'angular-all'
		dependsOn 'angular-mocks'
		dependsOn 'angular-scenario'
	}

}
