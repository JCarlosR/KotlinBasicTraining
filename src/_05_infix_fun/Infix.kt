package _05_infix_fun

import _02_data_classes.Person

infix fun Person.say(message: String) {
    println("$name dice $message")
}

fun main(args: Array<String>) {
    val p1 = Person("Juan", 23)
    p1 say "Hello"
}