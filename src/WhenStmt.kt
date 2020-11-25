fun main(){
    /*val a = 12
    val b = 9
    println("Enter operator either +. -, * or /")
    val operator = readLine()
    val result = when(operator){
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> "$operator operator is invalid operator"
    }

    println("result = $result")*/
    println("Enter a month")
    val month = readLine()
    val year = 2019
    when(month?.toInt()){
        1,3,5,7,8,10,12 -> println("Month $month has 31 days")
        4,6,9,11 -> println("Month $month has 30 days")
        2 -> if(year % 4 == 0)
                println("Month $month has 29 days")
             else
                println("Month $month has 28 days")
        else -> println("Entered value is invalid")
    }

    val a = 100
    when(a){
        in 1..10 -> println("A positive number less than 11")
        in 10..100 -> println("A positive number between 10 and 100 (inclusive)")
    }
}