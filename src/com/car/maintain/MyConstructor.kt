package com.car.maintain

class MyConstructor(){
    var name:String? = null
    var cardID:Int? = null
    var age:Int? = null
    constructor(name:String, cardID:Int, age:Int):this(){
        this.name = name
        this.cardID = cardID
        this.age = age
    }
    fun getUsername():String?{
        return this.name
    }
}

fun main(){
    val userInfo1 = MyConstructor("mohit",193,21)
    println("user1 name is: "+ userInfo1.getUsername())

    val userInfo2 = MyConstructor("rohit",113,17)
    println("user2 name is: ${userInfo2.getUsername()}")
}