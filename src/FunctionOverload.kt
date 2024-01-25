//Functions with the same name exist in the same scope, distinguished by their parameter lists.
fun add(x:Int, y:Int):Int{
    return (x+y)
}

fun add(x:Int, y:Int, z:Int):Int{
    return x+y+z
}



fun main(){
    println(add(5,6))
    println(add(5,6,7))
}