package main

import data.Book
import data.Magazine

fun main (){
    val livre = Book("La Foule")
    val vogue = Magazine("Vogue")

    println(livre.name)
    println(vogue.name)
    vogue.open()
    //livre.open() error
    //livre.read() error
}