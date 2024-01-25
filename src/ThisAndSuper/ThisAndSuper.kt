package ThisAndSuper

//this is refer to the same class
//super is refer to the parent class

open class A{
    open fun getName(name:String):String{
        return "my name is ${name}"
    }
}

class B:A(){

    override fun getName(name:String):String{
        return super.getName(name)

    }
}

fun main(){
    println("creating class A object")
    val a = A()
    var message = a.getName("mohit")
    println(message)
    println("creating class B object")
    val b = B()
    var message2 = b.getName("rohit")
    println(message2)
}