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
import groovy.util.ConfigObject
import groovy.util.ConfigSlurper
 
class AngularjsResourcesGrailsPlugin {
    def version = "1.4.2"
    def grailsVersion = "2.2 > *"
    def title = "AngularJS Resources Plugin"
    def author = "Sandro Martini, originally developed by Vladimír Oraný"
    def authorEmail = "sandro.martini@gmail.com"
    def description = "Angular JS resources plugin"
    def documentation = "http://smartiniongithub.github.com/grails-angularjs-resources/"

    def license = "APACHE"
    def issueManagement = [ system: "github", url: "https://github.com/smartiniOnGitHub/grails-angularjs-resources/issues/" ]
    def scm = [ url: "https://github.com/smartiniOnGitHub/grails-angularjs-resources/" ]

    def pluginExcludes = [
		'**/Thumbs.db',
        'src/docs/**',
        'src/groovy/grails_angularjs_resources_test/**'
    ]

    def developers = [ 
		[name: "Vladimír Oraný", email: "vladimir.orany@appsatori.eu"],
		[name: "Sandro Martini", email: "sandro.martini@gmail.com"],
	]

	def doWithSpring = {
		// merge primary configuration with that provided by the plugin
		def conf = application.config
		ConfigSlurper configSlurper = new ConfigSlurper(Environment.getCurrent().getName());
		ConfigObject configPrimary = conf.grails.angularjs_resources
		ConfigObject configSecondary = configSlurper.parse(application.classLoader.loadClass("AngularjsResourcesConfig"))
		ConfigObject config = new ConfigObject();
		config.putAll(configSecondary.angularjs_resources.merge(configPrimary))
		conf.grails.angularjs_resources = config;
	}

}
