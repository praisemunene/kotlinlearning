fun main() {
    reverseNumber()
}

fun reverseNumber() {
    // Convert the number to a string, reverse it, and convert it back to an integer
//    print("Enter a number: ")
    var number:Int = 201
    val reversedString = number.toString().reversed()
    var ans =  reversedString.toInt()
    if (ans == number){
        println("this is a palindrome")
    }else{
        println("this is not a palindrome")
    }
}
