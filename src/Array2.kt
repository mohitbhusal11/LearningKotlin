//array2 practice using array and if-else

fun main(){
    println("=======Pet Race=========")
    println("you have a pet ? enter in yes or no")
    val response:String = readLine()!!.toString()
    if(response == "yes" || response == "Yes" || response == "YES"){
        print("enter total number of pets: ")
        val size:Int = readLine()!!.toInt()
        var ListOfPets:Array<String> = Array(size){""}
        for(i in 0..size-1){
            print("enter $i pet name: ")
            ListOfPets[i] = readLine()!!.toString()
        }
        println("\n Printing Your Pet's Name")
        for(i in 0..size-1){
            println("$i pet name: ${ListOfPets[i]}")
        }
    }
    else{
        println("you are not eligible, Good luck next time")
    }
}