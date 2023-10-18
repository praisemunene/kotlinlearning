package oop

open class Admin( name:String,  email:String, password:String):User(name, email, password) {
    fun suspendUser(){
        println("yeah i can suspend users")
    }
}