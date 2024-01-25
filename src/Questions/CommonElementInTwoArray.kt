package Questions

//Write a Kotlin program to find the common elements between two arrays of integers. The user should enter two arrays,
//and the program should determine and print the common elements present in both arrays.

fun findCommonElements(arr1:ArrayList<Int>, arr2:ArrayList<Int>){
    arr1.sort()
    arr2.sort()
    var i = 0
    var j = 0

    while(i<arr1.size && j<arr2.size){
        if(arr1[i] == arr2[j]){
            print("${arr1[i]} ")
            i++
            j++
        }
        else if(i<j){
            i++
        }
        else{
            j++
        }
    }
}

fun main(){
    print("Enter the size of array: ")
    val size = readLine()!!.toInt()
    var arr1 = ArrayList<Int>()
    var arr2 = ArrayList<Int>()
    println("enter the array value for the fist array:")
    for(i in 0 until size){
        print("For index $i : ")
        arr1.add(readLine()!!.toInt())
    }
    println("enter the array value for the second array:")
    for(i in 0 until size){
        print("For index $i : ")
        arr2.add(readLine()!!.toInt())
    }

    findCommonElements(arr1, arr2)

}