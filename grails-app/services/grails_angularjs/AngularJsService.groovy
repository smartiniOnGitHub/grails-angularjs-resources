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
package grails_angularjs

import javax.annotation.PostConstruct
import javax.annotation.PreDestroy

/**
 * Service for get some info on the AngularJs published by the plugin in the webapp
 * <br/>
 * It has default scope (singleton), but in a not transactional way.
 */
class AngularJsService
{
	static transactional = false  // transactional behaviour not needed here ...
	private static final String angularJsVersion = "1.4.2"  // define here instead of BuildConfig
	
	def grailsApplication

	/**
	 * Initialization, automatically called after creation, via the PostConstruct annotation.
	 */
	@PostConstruct
	void init() {
		// log.info "initializing AngularJs service: start ..."
	}

	/**
	 * Destroy, automatically called before destroy, via the PreDestroy annotation.
	 */
	@PreDestroy
	void destroy() {
		// log.info "destroying AngularJs service: start shutdown ..."
	}


	/**
	 * Returns the AngularJs version used and published by the plugin.
	 *
	 * @return the AngularJs version
	 */
	String getAngularJsVersion() {
		// return BuildConfig.angularJsVersion  // not possible in a plugin
		// grailsApplication.config.angularJsVersion  // use the value from Config, but currently doesn't work
		angularJsVersion  // define here and use it from BuildConfig
	}

}
