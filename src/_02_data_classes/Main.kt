package _02_data_classes

fun main(args: Array<String>) {
    // val
    // var
    val person = Person("Juan", 23)
    val age = person.age
    println("La edad de ${person.name} es $age")

    val person2 = Person("Juan", 23)
    if (person == person2) {
        println("Las personas son iguales")
    } else {
        println("Las personas son diferentes")
    }

    println(person)
}