import java.util.Scanner

fun main(){
    var a : Double = 10000.0
    var b : Float = 100.00F
    var c : Long = 1000
    var d : Int = 100
    var e : Short = 10
    var f : Byte = 1
    println("Your Double value is $a")
    println("Your Float value is $b")
    println("Your Long value is $c")
    println("Your Int value is $d")
    println("Your Short value is $e")
    println("Your Byte value is $f")

    var letter : Char;
    letter = 'A'
    println(letter)

    var gender : Boolean
    gender = true
    if(gender){
        println("Male")
    }
    else{
        println("Female")
    }

    var intArr : IntArray = intArrayOf(1,2,3,4)
    var longArr : LongArray = longArrayOf(10,20,30,40)
    for (item in intArr){
        print("$item ")
    }

    for(item in intArr.indices){
        print("$item ")
    }

   /* val language : String = "French"
    language = "German"*/
    var lang : String = "English"
    lang = "Vietnamese"

    var num1 : Int = 100
    var num2 : Long = num1.toLong()

    var intNum : Int = 545344
    var byteNum : Byte = intNum.toByte()
    println("Int value = $intNum")
    println("Byte value = $byteNum")

    print("Enter text: ")
    var stringInput = readLine()!!
    println("You entered: $stringInput")

    var reader = Scanner(System.`in`)
    print("Enter your Int number: ")
    var intVal = reader.nextInt()
    println("You entered: $intVal")
}