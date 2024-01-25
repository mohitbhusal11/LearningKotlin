package Questions

//Write a Kotlin program that takes two numbers as input from the user and prints their sum.

fun addTwoNumber(num1:Int, num2:Int): Int {
    val ans = num1 + num2
    return ans;
}

fun main(){
    val num1:Int = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    val ans = addTwoNumber(num1, num2)
    println("$num1 + $num2 = $ans")
}