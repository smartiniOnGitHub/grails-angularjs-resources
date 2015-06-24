// some Groovy statements for testing available classes from the Grails Console

def conf = grailsApplication.config
// conf
// conf.grails

// conf.grails.angularjs_resources
// (String) conf.grails.angularjs_resources.filter.controllers

assert conf.grails.angularjs_resources.filter.controllers == '*'
assert conf.grails.angularjs_resources.filter.actions     == 'ajax*'

"conf.grails.angularjs_resources.filter.controllers = '$conf.grails.angularjs_resources.filter.controllers' , conf.grails.angularjs_resources.filter.actions = '$conf.grails.angularjs_resources.filter.actions'"
