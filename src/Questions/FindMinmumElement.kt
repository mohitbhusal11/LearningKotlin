fun findMinmumElement(arr:Array<Int>):Int{
    var ans = arr[0]
    for(i in 1..arr.size-1){
        if(ans > arr[i]){
            ans = arr[i]
        }
    }
    return ans
}
fun main(){
    val arr:Array<Int> = arrayOf(5,8,5,8,6,5,6,56,-8)
    if(arr.size >= 1){
        val ans = findMinmumElement(arr)
        println(ans)
    }
    else{
        println("array is empty")
    }
}