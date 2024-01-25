package Questions

//Write a Kotlin program to check if a given string is a palindrome.
//A palindrome is a string that reads the same forwards and backwards, ignoring spaces, punctuation, and capitalization.
//The user should enter a string, and the program should print whether the entered string is a palindrome or not.

fun stringPalindrome(word:String):Boolean{
    var i = 0
    var j = word.length-1
    while(i<j){
        if(word[i] != word[j]){
            return false
        }
        i++
        j--
    }
    return true
}

fun main(){
    val word = readLine()!!.toString()
    val ans = stringPalindrome(word)
    println("$word is palindrome: $ans")
}