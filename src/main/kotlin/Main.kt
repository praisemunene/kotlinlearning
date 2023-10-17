fun main(args: Array<String>) {
    var age = 18
    if (age < 18){
        println("you are underage")
    }else{
        println("welcome to the party")
    }
    var marks = 90
    if (marks <= 40){
        println("E")
    }else if(marks <= 50){
        println("D")
    }else if(marks <= 60){
        println("C")
    }else if(marks <= 70){
        println("B")
    }else{
        println("A")
    }
//    WHEN STATEMENTS
//    var bettingNumber = 2
    print("Enter your betting number: ")
    val bettingNumber  = 3
    when(bettingNumber){
        1 -> {
            println("you have lost")
        }
        2 -> {
        println("you have lost")
        }
        3 -> {
        println("you have won")
        }
        else ->{
            println("Enter a number from 1 - 3")
        }
    }
}