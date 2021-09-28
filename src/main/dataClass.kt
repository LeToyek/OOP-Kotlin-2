package main

import data.Guitar

//able to be copied by using object.copy
fun main (){
    val guitar = Guitar("Yohanes",450000,"Acoustic")
    val guitar2 = guitar.copy(type = "Electric")

    println(guitar)
    println(guitar2)
}