package _08_if

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    print("Por favor ingresa un valor entero: ")
    val n = scanner.nextInt()

    // if: statement
    if (n > 0) {
        println("El valor de n es positivo")
    } else {
        println("El valor de n es negativo")
    }

    // if: expression
    val message = if (n > 0) {
        "El valor de n es positivo"
    } else {
        "El valor de n es negativo"
    }
    println(message)

    // if: expression
    println("El valor de n es ${if (n>0) "positivo" else "negativo"}")
}