package main

import data.Minus
import data.Multiplication
import data.Operator
import data.Plus

fun operation(a : Int, b :Int, operator: Operator) : Int{
    return when(operator) {
        is Plus -> a + b
        is Minus -> a - b
        is Multiplication -> a * b
    }
}
fun main (){
    println(operation(1,3,Multiplication()))
    println(operation(4,6,Plus()))
    println(operation(6,2,Minus()))
}