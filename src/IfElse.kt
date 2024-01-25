//if, else is used for especific condition to execute
//if, else and else if same in kotlin as other language

fun main(){
    print("Enter your grade: ")
    val grade:Float = readLine()!!.toFloat()

    if(grade >= 90){
        print("wow! you got a 1st division")
    }
    else if( grade >= 80){
        print("nice! you got a 2nd division")
    }
    else if( grade >= 70){
        print("good! you got a 3rd division")
    }
    else{
        print(("oh! you got a 4th division, you could do better"))
    }
}