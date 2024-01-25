package Questions

//Write a Kotlin program to reverse an array of integers. The user should enter an array of integers,
//and the program should reverse the order of elements in the array and print the reversed array.

fun reverseArray(arr:ArrayList<Int>){
    var i = 0
    var j = arr.size-1
    while(i<j){
        val temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp

        i++
        j--
    }
}

fun main(){
    print("enter the size of array: ")
    val size = readLine()!!.toInt()

    var arr = ArrayList<Int>()

    println("enter the array value")
    for(i in 0 until size){
        print("enter the index $i value: ")
        arr.add(readLine()!!.toInt())
    }
    println("==reverse array==")
    reverseArray(arr)
    for(i in 0 until size){
        print("${arr[i]} ")
    }
}