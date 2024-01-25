//data is a keyword used to create a data class


fun main(){
    val p1 = Person(1,"mohit")
    val p2 = Person(2,"rohit")
    val p3 = Person(1,"mohit")
    println(p1)
    println(p2)
    println(p3.hashCode())
    println(p1 == p3)

    //copy() function -> this function copy the object
    val p4 = p2.copy()
    println(p4 == p2)

    val (id,name) = p3
    println(id)
    println(name)

}

//class Person(val id:Int, val name:String) //without adding data keyword it will return
//                                            Person@312b1dae
//                                            Person@7530d0a
//                                            666641942
//                                            false


data class Person(val id:Int, val name:String) //After adding data keyword it will return
//                                            Person(id=1, name=mohit)
//                                            Person(id=2, name=rohit)
//                                            104073936
//                                            true