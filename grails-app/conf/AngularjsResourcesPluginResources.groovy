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



modules = {
	'angular' {
		defaultBundle 'angular'
		if (jqueryPlugin) {
			dependsOn 'jquery'
		}
		resource id: 'angular', 
			url:[plugin: 'angularjs-resources', dir:'js/angular', file:getJsFile("angular")], 
			nominify: isDevOrTestEnvironment, 
			disposition: 'defer'
	}

    'angular-animate' {
		dependsOn 'angular'
		resource url:[plugin: 'angularjs-resources', dir:'js/angular', file:getJsFile("angular-animate")]
    }
    'angular-cookies' {
        dependsOn 'angular'
        resource url:[plugin: 'angularjs-resources', dir:'js/angular', file:getJsFile("angular-cookies")]
    }
    'angular-loader' {
        dependsOn 'angular'
        resource url:[plugin: 'angularjs-resources', dir:'js/angular', file:getJsFile("angular-loader")]
    }
    'angular-resource' {
        dependsOn 'angular'
        resource url:[plugin: 'angularjs-resources', dir:'js/angular', file:getJsFile("angular-resource")]
    }
	'angular-route' {
        dependsOn 'angular'
        resource url:[plugin: 'angularjs-resources', dir:'js/angular', file:getJsFile("angular-route")]
    }
	'angular-sanitize' {
        dependsOn 'angular'
        resource url:[plugin: 'angularjs-resources', dir:'js/angular', file:getJsFile("angular-sanitize")]
    }
	'angular-touch' {
        dependsOn 'angular'
        resource url:[plugin: 'angularjs-resources', dir:'js/angular', file:getJsFile("angular-touch")]
    }

	'angular-mocks' {
		resource url:[plugin: 'angularjs-resources', dir:'js/angular-tests', file:"angular-mocks.js"]
	}
	'angular-scenario' {
		resource url:[plugin: 'angularjs-resources', dir:'js/angular-tests', file:"angular-scenario.js"], 
			attrs: ['ng:autotest': true]
	}

	'angular-services'{
		dependsOn 'angular'
		defaultBundle 'angular'
	}
	'angular-controllers'{
		dependsOn 'angular-services'
		defaultBundle 'angular'
	}
	'angular-filters'{
		dependsOn 'angular-controllers'
	}
	'angular-widgets'{
		dependsOn 'angular-filters'
		defaultBundle 'angular'
	}

}
