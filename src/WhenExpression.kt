//When in kotlin is similar to switch statements in other programming language

fun main(){
    print("enter your grade: ")
    val grade:Double = readLine()!!.toDouble()

//    when(grade){
//        99.0 -> print("ohhhwow!")
//        95.0,96.0,97.0,98.0 -> print("ohwow!")
//        in 80.0..95.0 -> print("wow!")
//        else -> print("nice")
//    }


    //Another way

    when{
        grade >=100.0 -> print("Invalid input")
        grade == 99.0 -> print("ohhhwow!")
        grade in 95.0..98.0 -> print("ohwow!")
        grade in 80.0..95.0 -> print("wow!")
        else -> print("nice")
    }

}