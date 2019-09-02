package _04_extension_functions_properties

//fun getFirstWord(s: String): String {
//    val index = s.indexOf(" ")
//    return s.substring(0, index)
//}

//fun String.getFirstWord(): String {
//    val index = this.indexOf(" ")
//    return this.substring(0, index)
//}

val String.firstWord: String
get() {
    val index = this.indexOf(" ")
    return this.substring(0, index)
}

fun main(args: Array<String>) {
    val fullName = "Juan Ramos"
    // println(getFirstWord(fullName))
    // println(fullName.getFirstWord())
    println(fullName.firstWord)
    println("Elon Musk".firstWord)
}