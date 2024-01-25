//In kotline hashmap have (key and value) pair

fun main(){
    var listOfUser = HashMap<Int, String>()
    listOfUser[123] = "soham"
    listOfUser[193] = "mohit"
    listOfUser[323] = "naushad"
    listOfUser[234] = "rohit"
    listOfUser[534] = "manish"
    listOfUser[423] = "sidharth"
    listOfUser[754] = "yogesh"
    listOfUser[837] = "vaishnavi"
    listOfUser[542] = "piyush"

    println("=====printing user details=======")

    for(key in listOfUser.keys){
        println("user: $key, username: ${listOfUser[key]}" )
    }

    println("===============keys============")
    for(key in listOfUser.keys){
        println(key)
    }

    println("========values========")
    for(value in listOfUser.values){
        println(value)
    }
}