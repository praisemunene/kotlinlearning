fun main(args: Array<String>) {
    //while loop
    var counterOne = 10
    while (counterOne <= 15){
        println(counterOne)
        counterOne++
    }
    //    do-while loop
    var counterTwo = 10
    do{
        println(counterTwo)
        counterTwo++
    }while (counterTwo <= 15)

    //    for loop
    var names = arrayOf(
        "jamal",
        "Derick",
        "Ian",
        "Erick",
        "Isaac"
    )
        println(names[1])
    for (name in names){
        println(name)
    }
    for (number in 90 .. 95){
        println(number)
    }


    //for each loop
    names.forEach {
        println(it)
    }
    //repeat loop
    repeat(5){
        println("hello there")
    }
}