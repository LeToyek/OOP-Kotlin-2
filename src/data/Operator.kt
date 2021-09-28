package data

//sealed class is a best class to be parent class

sealed class Operator (val name : String)
class Plus : Operator("Plus")
class Minus : Operator ("Minus")
class Multiplication : Operator("Multiplication")