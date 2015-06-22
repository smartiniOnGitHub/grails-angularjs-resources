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

log4j = {
	error 'org.codehaus.groovy.grails',
	      'org.springframework',
	      'org.hibernate',
	      'net.sf.ehcache.hibernate'

	error 'org.grails.plugin.resource',
	      'grails.app.services.org.grails.plugin.resource',
	      'grails.app.taglib.org.grails.plugin.resource',
	      'grails.app.resourceMappers.org.grails.plugin.resource'

	warn   'org.mortbay.log'

	// debug 'org.grails.plugin.resource'
}

grails.doc.authors = 'Sandro Martini, originally developed by Vladimír Oraný'
grails.doc.license = 'Apache License 2.0'
grails.doc.title   = 'AngularJS Grails Plugin'


// What URL patterns should be processed by the resources plugin
// grails.resources.adhoc.patterns = ['/images/*', '/css/*', '/js/*', '/plugins/*']
// grails.resources.adhoc.includes = ['/images/**', '/css/**', '/js/**', '/plugins/**']
// grails.resources.debug = true


grails.views.default.codec="none" // none, html, base64
grails.views.gsp.encoding="UTF-8"

// def angularJsVersion = "1.4.1"
// grails.angularJsVersion = angularJsVersion  // the version of AngularJs used by the plugin (at runtime)
