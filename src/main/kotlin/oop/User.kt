package oop

class User(var name: String, var email: String, var password: String) {
    private var phonenumber:String = ""
    fun setphonenumber(phonenumber:String){
        this.phonenumber = phonenumber
    }

    fun getphonenumber():String{
        return this.phonenumber
    }
    var gender:String = ""
    fun setgender(gender:String){
        this.gender = gender
    }
    fun getgender():String{
        return this.gender
    }
fun register(){
        println("i can register")
    }fun login(){
        println("i can login")
    }fun logout(){
        println("i can logout")
    }
}