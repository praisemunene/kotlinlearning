package oop

class governor : MCA() {
    fun govern() {
        var student = arrayOf("bob","mary", "praise","munene","jack","jakebling")
        var skippednamescount:Int = 0
        for (name in student){
            if(name.length >= 5){
                println(name.reversed())
            }else{
                skippednamescount++
            }

        }
        println(skippednamescount)

    }
}