package main

import data.Action
import data.Read

// like it's name, Anonymous class has a function to make objects without class

fun fireAction(action : Action){
    action.action()
}
fun readAction(read : Read){
    read.read()
}

fun main (){
    fireAction(object : Action {
        override fun action() {
            println("rainfire")
        }
    })
    readAction(object : Read{
        override fun read() {
            println("is reading")
        }
    })
    fireAction(object : Action{
        override fun action() = println("has fired")
    })
}