package module11

class demo_mop {

    def implementDynamism = {name->
        "We are exploring Groovy Dynamic behaviour by passing property $name"
    }
    def propertyMissing(String name){
        name
        implementDynamism(name)
    }

    def methodMissing(String method, Object args){
        println "called $method with $args"
    }
}
