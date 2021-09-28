package data

import main.Gender

fun main(){
    val man = Gender.MALE
    val woman = Gender.FEMALE
    val listGender : Array<Gender> = Gender.values()

    println(man)
    println(woman)
    println(listGender.toList())

    man.printDescription()
    woman.printDescription()
}