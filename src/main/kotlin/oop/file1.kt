package oop

fun main(args: Array<String>) {
    var carOne  = Car(
        "Toyota supra",
        "gray",
        "kcy 202r",
        "1500000"
    )
    var carTwo  = Car(
        "porche cayenn",
        "black",
        "kcz 202r",
        "15500000"
    )
    println(carTwo.regNo)
    var flowerOne = flower(
        "rose",
        "natural",
        "1000"
    )
    println(flowerOne.state)

    var userOne = User(
        "praise",
        "praisemunene87@gmail.com",
        "kaberia5"
    )

    println(userOne.email)
    userOne.login()
    userOne.setphonenumber("0712982944")
    println(userOne.getphonenumber())
}