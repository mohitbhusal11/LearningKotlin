package FunctionsInKotlin

//It is often used to create a readable representation of a collection by specifying a separator, a prefix, a postfix, and other optional parameters.


fun deco(str:Array<String>):String{
    val ans = "we need "+str.joinToString(separator = "-", prefix = "[", postfix = "]")
    return ans
}
fun main(){
    val str:Array<String> = arrayOf("car","bike","food","house")
    print(deco(str))
}