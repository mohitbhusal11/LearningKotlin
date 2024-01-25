//We can access the string characters using indexing

fun main(){
    val message = "Welcome to Bhopal! "
    val name = "Mohit"
    val allMessage = message + name //concatination
    val usingTemplates = "$name,$allMessage" //using templates
    println(allMessage)
}