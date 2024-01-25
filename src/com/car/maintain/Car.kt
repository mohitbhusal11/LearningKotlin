package com.car.maintain

class Car(name:String, age:Int) {
    //properties
    val userName = name
    val userAge = age

    fun price(number:Double){
        print("car price of $userName is: ")
        println(number * 1.4)
    }
    init{
        println("This is Car Class")
    }
}

fun main(){
    val car = Car("mohit", 21)
    car.price(1400.0)

}