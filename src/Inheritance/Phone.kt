package Inheritance

//In this phone class we add all the common features of the phone

open class Phone{
    //common properties of all phone
    val name: String = ""
    val type: String = ""
    val volume: Int = 10

    //common methods of all phone
    fun makeCall(){}
    fun display(){}
    fun powerOff(){}
    fun getDeviceInfo(){}
}