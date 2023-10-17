//create a function to display names of students on an array in the following manner:
//        print only the names with 5 or more characters
fun main() {
    val students = arrayOf("Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace")

    displayNamesWithMinLength(students, 5)
    displayNamesInReverse(students)
}

fun displayNamesWithMinLength(names: Array<String>, minLength: Int) {
    for (name in names) {
        if (name.length >= minLength) {
            println(name)
        }
    }
}


//        ensure the names are printed in reverse

fun displayNamesInReverse(names: Array<String>) {
    for (name in names) {
        val reversedName = name.reversed()
        println(reversedName)
    }

}




