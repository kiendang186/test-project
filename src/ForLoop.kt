fun main(){
    for(i in 1..5){
        println(i)
    }

    for(i in 5 downTo 1){
        println(i)
    }

    for(i in 1..10 step 2){
        println(i)
    }

    here@ for(i in 1..5)
        for(j in 1..4){
            if(j == 2 || j == 3)
                continue@here
            println("i=$i; j=$j")
        }

}