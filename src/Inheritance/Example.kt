package Inheritance

open class Parent{
    val lastName: String = "Bhusal"

    init {
        println("parents constructor")
    }
    fun myMethod(){
        println("I am in parent")
    }
}

class Child: Parent(){
    val name:String = "Mohit"

    init{
        println("child constructor")
    }
    fun getChildFullName(){
        println("$name $lastName")
    }
}

fun main(){
    val child1 = Child()
    child1.getChildFullName()
    child1.myMethod()
}