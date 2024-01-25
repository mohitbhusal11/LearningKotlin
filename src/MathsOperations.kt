fun main(){
    print("enter num1 : ")
    val num1  = readLine()!!.toDouble()
    print("enter num2 : ")
    val num2  = readLine()!!.toDouble()
    println("Answers")
    val sum = num1 + num2
    val sub = num1 - num2
    val mul = num1 * num2
    val div = num1 / num2
    println("sum of num1 and num2: $sum")
    println("sub of num1 and num2: $sub")
    println("mul of num1 and num2: $mul")
    println("div of num1 and num2: $div")
}