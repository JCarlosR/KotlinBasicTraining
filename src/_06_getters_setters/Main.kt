package _06_getters_setters

fun main(args: Array<String>) {
    val car = Car()
    car.color = "black"
    car.color = "brown"
    car.code = "ABCDE"

//    println("El color del carro es ${car.color}")
//    println("El color del carro es ${car.color}")
    println("El color del carro es ${car.color}")
    println("El color se ha leído ${car.countColorRead} veces")
}