package _09_when

fun main(args: Array<String>) {
    print("Ingresa un operador: ")
    val op = readLine() // String?

    val x = 20
    val y = 6

    op?.let {
        println("result = ${evalOperator(x, y, it)}")
    }
}

fun evalOperator(n1: Int, n2: Int, op: String) = when (op) {
    "+" -> {
        println("Suma")
        n1+n2
    }
    "-" -> {
        println("Resta")
        n1-n2
    }
    "*" -> {
        println("Multiplicación")
        n1*n2
    }
    "/" -> {
        println("División")
        n1/n2
    }
    "%", "mod" -> {
        println("Módulo")
        n1%n2
    }
    17.toString() -> {
        println("Nro 17")
        17
    }
    in "A" .. "Z" -> {
        println("Es una letra mayúscula")
        0
    }
    else -> {
        println("Operador no encontrado")
        0
    }
}
