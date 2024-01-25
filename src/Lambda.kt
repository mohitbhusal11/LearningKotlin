//lambdas is an anonymous function which is declare using currly bracess "{ }" and
//body start after the arrow "->" and whatever datatype last in the function it will be the return type
//of the lambda function


//fun sum(x:Int,y:Int): Int{
//    return x + y
//}

val sum = {num1:Int, num2:Int -> num1 + num2} //lambda function is also known as anonymous function or function without name
fun main(){
    val addNumber = sum(5,6)
    println(addNumber)

    val list:List<Int> = listOf(5,4,2,5,4,7,8,9)
    println("this is normal for loop")
    for(number in list){
        print("$number ")
    }
    println("\nusing for each loop")
    list.forEach{ number ->
        print("$number ")
    }
}