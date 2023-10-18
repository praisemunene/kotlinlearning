package oop

data class Person(var name: String, var email: String, var password: String) {
    private var bloodgroup:String = ""
    fun setbloodgroup(bloodgroup:String){
        this.bloodgroup = bloodgroup
    }

    fun getbloodgroup():String{
        return this.bloodgroup
    }
    private var age:String = ""
    fun setage(age:String){
        this.age = age
    }
    fun getage():String{
        return this.age
    }
    fun login(){
       if(name == "praise"&& password == "kaberia"){
           println("login successfully")

       }else{
           println("incorrect logins")
       }
}
    fun register(){
        println("i can register")
    }

}