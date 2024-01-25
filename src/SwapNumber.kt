fun main(){
    var number1 = readLine()!!.toInt()
    var number2 = readLine()!!.toInt()
    println("Before")
    println("Number1 : $number1, Number2: $number2")

    val temp = number1
    number1 = number2
    number2 = temp
    println("After")
    println("Number1: $number1, Number2: $number2")
}