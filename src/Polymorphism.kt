//Polymorphism refers to the ability of a single function or method name to represent different behaviors based
//on the context.

//In this there is same name of function with same number of parameters but with different datatype

fun showInfo(name:String){
    println("hello, $name")
}

fun showInfo(id:Int){
    println("your employee ID: $id")
}

fun main(){
    showInfo("mohit")
    showInfo(193)
}