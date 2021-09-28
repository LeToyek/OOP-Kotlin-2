package main

object Utilitise {
    val name = "My Utilities"

    fun toUpper(value : String):String{
        return value.toUpperCase()
    }

}
class Shirt(val name : String){
    object Utilize{
        fun wear(name : String) : Unit{
            println("is wearing $name")
        }
    }
}