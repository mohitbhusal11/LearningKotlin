package Questions

//Write a Kotlin program to find the factorial of a given number. The user should enter a number, and the program should calculate and print its factorial.

fun factorial(num:Int):Int{
    if(num <= 1){
        return 1
    }
    val ans = num * factorial(num-1)
    return ans
}

fun main(){
    val num = readLine()!!.toInt()
    val ans = factorial(num)
    println(ans)
}