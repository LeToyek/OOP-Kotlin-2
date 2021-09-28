package data

class Student(val name : String, val grade : Int)
fun Student.sayHello(name : String){
    println("Hello $name !, I'm ${this.name}, I'm ${this.grade}")
}
val Student.upperName : String
    get() = this.name.toUpperCase()