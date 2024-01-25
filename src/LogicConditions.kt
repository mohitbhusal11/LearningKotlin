//In kotlin there is 4 logical operations

//< > >= <=


//Two logical Gate there is also a NOT gate:
//!= : which is also called not equal to

//Logical AND (&&)
//+-----------+-----------+--------+
//| Operand 1 | Operand 2 | Result |
//+-----------+-----------+--------+
//| true      | true      | true   |
//| true      | false     | false  |
//| false     | true      | false  |
//| false     | false     | false  +
//+-----------+-----------+--------+
//
//Logical OR (||)
//+-----------+-----------+--------+
//| Operand 1 | Operand 2 | Result |
//+-----------+-----------+--------+
//| true      | true      | true   |
//| true      | false     | true   |
//| false     | true      | true   |
//| false     | false     | false  |
//+-----------+-----------+--------+

fun main(){
//    val number = 11
//    println(number >= 1 || number <= 11)
    val age = 17
//    println(age > 18 && age < 58) insted of this we can write
    println(age in 15..20)
}