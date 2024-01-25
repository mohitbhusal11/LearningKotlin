package Questions

//Write a Kotlin program to find the factorial of a given number using an iterative approach.
//The user should enter a number, and the program should calculate and print its factorial using a loop.

fun main(){
    print("enter the number: ")
    var num = readLine()!!.toInt()

    var ans = num
    while(num > 1){
        num--
        ans = ans * num
    }
    if(ans == 0){
        ans = 1
    }
    println("ans is: $ans")
}