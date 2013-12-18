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

modules = {
    application {
        resource url:'js/application.js'
    }

    app {
		dependsOn 'angular',  // add base angular modules ...
			// add even all other angular modules defined in the plugin ...
			'angular-animate', 'angular-cookies', 'angular-loader', 
			'angular-resource', 'angular-route', 
			'angular-sanitize', 'angular-touch'
			// add even angular test-only modules ... not now
			// 'angular-mocks', 'angular-scenario'
        resource url:'js/app.js'
        resource url:'js/services.js'
        resource url:'js/controllers.js'
        resource url:'js/filters.js'
        resource url:'js/directives.js'
    }

    index {
        // resource url:'js/app.js'
    }

}
