package Questions

fun findMaximumElement(arr:Array<Int>):Int{
    var ans = arr[0]
    for(i in 1..arr.size-1){
        if(ans < arr[i]){
            ans = arr[i]
        }
    }
    return ans
}

fun main(){
    var arr:Array<Int> = arrayOf(5,8,75,455,8,7,2,65)
    if(arr.isNotEmpty()){
        val ans = findMaximumElement(arr)
        println("Maximum Element is $ans")
    }
    else{
        println("array is empty")
    }
}