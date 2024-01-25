package Questions

//Write a Kotlin program that checks whether a given number is prime or not. The user should enter a number,
//and the program should print whether the entered number is a prime number or not.

fun primeOrNot(num:Int):Boolean{
    for(i in 2..num-1){
        if(num % i == 0){
            return false
        }
    }
    return true
}

fun main(){
    val num = readLine()!!.toInt()
    val ans = primeOrNot(num)
    if(ans){
        println("$num is prime number")
    }
    else{
        println("$num is not a prime number")
    }
}