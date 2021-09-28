package main

import data.Student
import data.sayHello
import data.upperName


fun main () {
    val joko = Student("Joko", 3)
    joko.sayHello("bambang")
    println(joko.upperName)
}