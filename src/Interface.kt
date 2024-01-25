

interface CreditCard{
    val cardNumber: String
    fun score(age:Int)
}

class MasterCard(override val cardNumber: String) : CreditCard{
    override fun score(age: Int){
        if(age>50){
            println("negative")
        }
        else{
            println("positive")
        }
    }
}

class Visa(override val cardNumber: String) : CreditCard{
    override fun score(age: Int){
        if(age>60){
            println("negative")
        }
        else{
            println("positive")
        }
    }
}

fun main(){
    val visa =  Visa("2151512212")
    visa.score(50)
    val masterCard = MasterCard("54654432131121")
    masterCard.score(51)
}