package data

//internal is for give a limit to classes in 1 project
//protected's limit is for their inherited
//private only can be accessed in his class
// IRL private is the most used

open class Book (internal val name : String) {
    private fun read(){
        println("read")
    }
    open protected fun open(){
        println("open")
    }
}

class Magazine (name : String) : Book(name){
    override public fun open(){
        super.open()
    }
}