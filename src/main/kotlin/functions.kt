import java.time.Year

fun main(args: Array<String>) {
    motto()
    add()
    addition("nesh", 12.7,23)
    simpleInterest(1000.0,2.5, 2)
}
fun motto(){
    println("hello world, this is our motto")
}
fun add (){
    var x = 10
    var y = 20
    var z = x + y
    println("your answer is $z")
}

fun addition(name:String, a:Double, b:Int){
    val answer = a + b
    println("hello $name your answer is $answer")
}
fun simpleInterest(p:Double, r:Double, t:Int){
    val interest = (p * r * t) / 100.0
    println("your interest is $interest")
}