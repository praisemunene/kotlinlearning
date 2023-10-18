package oop

class Superadmin (name: String, email:String, password:String):Admin(name, email, password){
    fun suspendAdmin(){
        println("yeah i can suspend an admin")
    }
}