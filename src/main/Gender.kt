package main

enum class Gender (val description : String){
    //enum as usual only make this stuff
    MALE("MALE"),
    FEMALE("FEMALE");

    //It's very unusual to make functions inside of enum
    fun printDescription() = println(description)
}