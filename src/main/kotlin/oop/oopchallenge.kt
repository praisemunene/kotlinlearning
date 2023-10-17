package oop

//create a class called person.ensure a person can register and login
//also ask the person to give you their age and blood group securely through encapsulation
fun main(args: Array<String>) {
    var user = Person("praise","praisemunene87@yahoo.com","kaberia")
    user.login()
    user.setbloodgroup("A positive")
    println(user.getbloodgroup())
    user.setage("23")
    println(user.getage())
}