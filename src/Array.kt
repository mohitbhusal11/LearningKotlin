fun main(){
    println("pet app")
    print("enter number of pets: ")
    val maxSize:Int = readLine()!!.toInt()
    var listOfPets:Array<String> = Array(maxSize){""}
    for(i in 0..maxSize-1){
        print("enter your ${i+1} pet name: ")
        listOfPets[i] = readLine()!!.toString()
    }
    println("printing pets name:")
    for(i in 0..maxSize-1){
        println("pet ${i+1} name: ${listOfPets[i]}")
    }
}