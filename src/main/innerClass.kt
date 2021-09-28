package main

import data.Teacher

//make inner classes inside of class
//outer class cannot use function inside of inner class
//You need to make another function inside outer class

fun main(){
    val teacher = Teacher("Amin")

    val student1 = teacher.Student("Bowo")
    val student2 = teacher.Student("Bambang")

    teacher.teach(student1)

    student1.hello()
    student2.hello()
}