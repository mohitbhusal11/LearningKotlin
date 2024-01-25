package Questions

//Write a Kotlin program to calculate the sum of digits of a given number.
//The user should enter a positive integer, and the program should calculate and print the sum of its digits.

fun sumOfDigits(num:Int):Int{
    var ans = 0
    var tempNum = num
    while(tempNum >= 1){
        val temp = tempNum % 10
        ans += temp
        tempNum = tempNum / 10
    }
    return ans
}

fun main(){
    val num = readLine()!!.toInt()
    val ans = sumOfDigits(num)
    println("sum of digits $num is: $ans")
}