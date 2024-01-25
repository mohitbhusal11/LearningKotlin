import java.util.LinkedList

//it will create node and it will use only required space

fun main(){
    println("======pet info======")
    var arrLinkedList = LinkedList<String>()
    while(true){
        print("enter your pet name: ")
        val petName = readLine()!!.toString()
        if(petName.lowercase() == "end"){
            break
        }
        arrLinkedList.add(petName)
    }
    println("=========printing names using index===========")
    for(i in 0..arrLinkedList.size-1){
        println("name of $i pet is ${arrLinkedList[i]}")
    }

    println(arrLinkedList[1])

    println("=========printing names using object==========")
    for(name in arrLinkedList){
        println("name: $name")
    }
}