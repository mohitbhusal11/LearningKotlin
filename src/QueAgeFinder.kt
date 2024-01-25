fun main(){
    print("Enter Your Birth Year: ")
    var birthYear:Int = readLine()!!.toInt()
    print("Enter Current Year: ")
    var currentYear:Int = readLine()!!.toInt()
    val yourAge = currentYear - birthYear
    print("Your Age: $yourAge")
}