//extension is used to add extra or more function in the classes like String
//extension works exactly same as other inbuilt functions in the Class


fun String.decorateIt():String{
    return "----------------------\n${this.uppercase()}\n------------------------"
}

fun Array<Int>.findMax():Int{
    var ans = this[0]
    for(i in 1 until this.size){
        if(ans < this[i]){
            ans = this[i]
        }
    }
    return ans
}
fun main(){
    val arr: Array<Int> = arrayOf(5,4,2,8,9,6,7)
    val ans = arr.findMax()
    println("this is max value: " + ans)
}