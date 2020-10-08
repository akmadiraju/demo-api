def call(String msg, Closure body){
    Map config = [:]
    body.resolveStragtegy = Closure.DELEGATE_FIRST
    body.resolve = config
    body()
    call(config)
}

def call(Map config = [:]){
    println config.greeting
}

