package FunctionsInKotlin


//.split("condition like , and _ etc" this will return the list<string>
//.toTypedArray() this will change the list in array

fun main(){
    val input = "cat,dog,rat,cow"

    val pets = input.split(",")

    println("list of pets: $pets")

    val petsInArray  = pets.toTypedArray()
    println("list of pets in array:")
    petsInArray.forEach{pet -> print("$pet ")}
}