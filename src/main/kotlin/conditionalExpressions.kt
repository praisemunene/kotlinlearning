fun main(args: Array<String>) {
    var marks = 90
    var grade = if(marks <= 40){
        "E"
    }else if(marks <= 50){
        "D"
    }else if(marks <= 60) {
        "C"
    }else if(marks <= 70) {
        "B"
    }else {
        "A"
    }
    println(grade)

    var bettingNumber = 3
    var bettingResult = when(bettingNumber){
        1 ->{
            "you lost"
        }2 ->{
            "you won"
        }
        else ->{
            "Enter a valid number"
        }
    }
    println(bettingResult)
    }