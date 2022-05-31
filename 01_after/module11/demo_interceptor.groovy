class helloInterceptor implements Interceptor{

    @Override
    Object beforeInvoke(Object o, String s, Object[] objects) {
        println("Before Invoke ${o.class.name}")
    }

    @Override
    Object afterInvoke(Object o, String s, Object[] objects, Object result) {
        println("After Invoke ${o.class.name}")
        return result
    }

    @Override
    boolean doInvoke() {
        return true
    }
}

class mop {
    mop(){
        println("Creating an instance of mop object")
    }
    String intercept() {
        "This method will be intercepted"
    }
}

def proxy = ProxyMetaClass.getInstance(mop)
def interceptor = new helloInterceptor()
proxy.interceptor = interceptor

proxy.use {
    def newInstance = new mop()
    println(newInstance.intercept())
}
