fun main(){
    var number = 5.5
    println("Result = ${Math.sqrt(number)}")

    val number1 = 5.5;
    val number2 = 5.0
    var result : Int
    result = addNumbers(number1, number2)
    println("result = ${addNumbers(number1, number2)}")

    println("${getName("Hugh", "Jackman")}")
}

fun addNumbers(n1: Double, n2: Double):Int{
    val sum = n1 + n2;
    val result = sum.toInt()
    return result
}

//fun getName(firstname : String, lastname : String): String = "$firstname $lastname"
fun getName(firstname : String, lastname : String) = "$firstname $lastname"
