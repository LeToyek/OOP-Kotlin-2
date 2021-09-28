package data

class Teacher(val name : String) {
    inner class Student (val name: String){
        fun hello(){
            println("hello ${this@Teacher.name}, my name is $name")
        }
    }
    fun teach(student: Student){
        println("${this.name} is teaching ${student.name}")
    }
}