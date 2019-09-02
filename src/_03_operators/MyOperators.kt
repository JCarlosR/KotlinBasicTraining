package _03_operators

import _02_data_classes.Person

//operator fun Person.compareTo(person: Person): Int {
//    return this.age.compareTo(person.age)
//}
operator fun Person.compareTo(person: Person)
        = this.age.compareTo(person.age)

// p1++
operator fun Person.inc() = Person(name, age+1)

// p1--
operator fun Person.dec(): Person {
    return Person(name, age-1)
}

fun main(args: Array<String>) {
    val a = 20
    val b = 5
    println("a + b = ${a+b}")
    println("a - b = ${a-b}")
    println("a * b = ${a*b}")
    println("a / b = ${a/b}")

    var p1 = Person("Juan", 23)
    val p2 = p1.copy(age = 30)

    // println("p1 es mayor que p2: ${p1.age > p2.age}")
    println("p1 es mayor que p2: ${p1 > p2}")
    println("p1 es menor que p2: ${p1 < p2}")
    println("p1 y p2 tienen la misma edad: ${p1 == p2}")

    p1++
    println(p1)
}