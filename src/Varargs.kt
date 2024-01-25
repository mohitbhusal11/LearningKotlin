//In Kotlin, varargs is like ordering a pizza with customizable toppings.
//It allows you to call the function with different numbers of arguments without explicitly creating an array.


fun orderPizza(vararg toppings: String){
    println("Your pizza have ${toppings.size} toppings: ${toppings.joinToString(separator="-",prefix="[",postfix="]")}")
}
fun main(){
    orderPizza("macaronis","capsicum","cheese")
}