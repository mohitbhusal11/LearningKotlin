//Loops in kotlin is used to execute block of code many times


fun main(){
    print("enter the num: ")
    val num:Int = readLine()!!.toInt()

//    if(num > 0){
//        for(i in 1..num){
//            println("count: $i")
//        }
//    }
//    else{
//        println("invalid")
//    }

    //odd and even
    if(num%2 == 0){
        for(i in 0..num step 2){
            println("count: $i")
        }
    }
    else{
        for(i in 1..num step 2){
            println("count: $i")
        }
    }
}