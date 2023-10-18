package oop

class NamePrinterImpl : NamePrinter {
    override fun printNames(names: Array<String>) {
        for (name in names) {
            println(name)
        }
    }
    override fun printNamesinReverse(names: Array<String>) {
        for (i in names.size - 1 downTo 0) {
            println(names[i])
        }
//        val name = names.reverse()
//        println(name)
    }

    override fun printeachNamesinReverse(names: Array<String>) {
        for (name in names) {
            val reversedName = name.reversed()
            println(reversedName)
        }
    }
}
