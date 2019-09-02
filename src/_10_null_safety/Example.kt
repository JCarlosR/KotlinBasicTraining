package _10_null_safety

fun main(args: Array<String>) {
    // val name: String?
    // println(name::class.simpleName)
    // name = "Carlos"
    // name = null
    // println(name)
    val name = readLine() // String?
    /*
    if (name != null)
        printName(name)
    */
    // printName(name ?: "Default name")
    name?.let {
        printName(it)
    }
    // printName(name!!)
}

fun printName(name: String) {
    println("El nombre ingresado es $name")
}