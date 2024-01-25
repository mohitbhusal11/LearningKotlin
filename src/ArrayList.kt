//In arrayList you don't need to define array size it is called dynamic array

fun main(){
    val listOfPets = ArrayList<String>()
    while(true){
        print("enter your pet name: ")
        val name:String = readLine()!!.toString()
        if(name.lowercase() == "end"){
            break
        }
        listOfPets.add(name)
    }
    println("printing using Index")
    for(i in 0..listOfPets.size-1){
        println("pet $i name: ${listOfPets[i]}")
    }
    println("printing using Object")
    for(pet in listOfPets){
        println("pet name $pet")
    }
}