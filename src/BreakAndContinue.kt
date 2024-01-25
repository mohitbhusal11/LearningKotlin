fun main(){
    //I want to print number form 1 to 10 but ignore 4 and loop should break after print 10
//    for(i in 1..100){
//        if(i == 4){
//            continue
//        }
//        println("count: $i")
//        if(i==10){
//            break
//        }
//    }
    loop@ for(i in 1..10){
        println("number: $i")
        for(j in 1..6){
            println("count: $j")
            if(j == 5){
                break@loop
            }
        }
    }
}