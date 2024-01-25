package Questions

fun main(){
    print("enter the num1: ")
    var num1 = readLine()!!.toInt()
    print("enter the num2: ")
    var num2 = readLine()!!.toInt()
    if(num1 > num2){
        val temp = num1
        num1 = num2
        num2 = temp
    }
    while(num2 > 0){
        val reminder = num1 % num2
        num1 = num2
        num2 = reminder
    }
    println("GCD is $num1")
}