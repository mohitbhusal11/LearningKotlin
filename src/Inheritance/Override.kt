package Inheritance

open class Mobile(val type: String){
    open val name : String = ""
    open val size : Int = 5
    fun makeCall(){
        println("calling from mobile")
    }
    fun powerOff(){
        println("shutting down")
    }
    open fun display(){
        println("simple mobile display")
    }
}

class OnePlus(typeParam: String) : Mobile(typeParam){
    override fun display(){
        println("oneplus mobile display")
        print("old mobile have ")
        //=================using super keyword we can use parents class===========
        super.display()
    }
    override val size: Int = 7
    override val name: String = "oneplus"
}

fun main(){
    val newPhone = OnePlus("General")
    newPhone.display()
    println("size of oneplus is: ${newPhone.size}")
    println("your newPhone name is: ${newPhone.name}")
}
