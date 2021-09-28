package data

class Food (val name : String) {
    companion object {
        fun eat (name : String) : Unit{
            println("is eating $name")
        }
    }
    object utilitise{
        fun send(name: String) : Unit{
            println("is sending $name")
        }
    }

}