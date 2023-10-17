fun main() {
    println("Enter your email: ")
    val email = readln()
    println("Enter your password: ")
    val password = readln()
    if (login(email, password)) {
        println("Login successful")
        calculateBMI()
    } else {
        println("Login failed")
    }
}
fun login(email: String, password: String): Boolean {
    val expectedEmail = "emobilis@test.com"
    val expectedPassword = "emobilis123"
    return email == expectedEmail && password == expectedPassword
}
fun calculateBMI() {
    println("Enter your weight")
    var weightKg: String = readln()
    println("Enter your height")
    var heightM: String = readln()
    var height = heightM.toDouble()
    var answer = weightKg.toInt() / (height * height)
    var results = if(answer <= 18){
        "you are underweight"
    }else if(answer <= 29){
        "you are of normal weight"
    }else if(answer <= 34) {
        "you are overweight "
    }else {
        "you are obese"
    }
    println(results)
}