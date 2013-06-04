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

def dev = grails.util.GrailsUtil.isDevelopmentEnv()
def applicationContext = org.codehaus.groovy.grails.commons.ApplicationHolder.application.mainContext
def jqueryPlugin = applicationContext.pluginManager.getGrailsPlugin('jquery')

def jsFile = dev ? "angular.js" :"angular.min.js"

modules = {
	'angular' {
		defaultBundle 'angular'
		if(jqueryPlugin){
			dependsOn 'jquery'
		}
        resource id: 'angular', url:[plugin: 'angularjs-resources', dir:'js/angular', file: jsFile], nominify: dev
    }
	
	'angular-autobind' {
		defaultBundle 'angular'
		dependsOn 'angular'
		resource url:[plugin: 'angularjs-resources', dir:'js/angular', file: 'angular-manual.js'], nominify: true
	}
	
	'angular-mock' {
		resource url:[plugin: 'angularjs-resources', dir:'js/angular', file:"angular-mocks.js"]
	}
	
	'angular-scenario' {
		resource url:[plugin: 'angularjs-resources', dir:'js/angular', file:"angular-scenario.js"], attrs: ['ng:autotest': true]
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
