fun addTwo(x:Int=0, y:Int=0):Int{
    return (x+y)
}

fun main(){
    println(addTwo(5,7))
    println(addTwo(y=5,x=3))
}