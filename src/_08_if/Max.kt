package _08_if

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    print("Por favor ingresa x: ")
    val x = scanner.nextInt()

    print("Por favor ingresa y: ")
    val y = scanner.nextInt()

    val max = if (x>y) {
        println("x es mayor que y")
        x
    } else {
        println("x no es mayor que y")
        y
    }
    println("max = $max")
}