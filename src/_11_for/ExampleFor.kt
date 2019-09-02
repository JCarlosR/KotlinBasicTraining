package _11_for

fun main(args: Array<String>) {
    for (i in 1..5)
        print(i)

    println()

    for (i in 1..10 step 2)
        print(i)

    println()

    // mistake -> 5..1
    for (i in 5 downTo 1)
        print(i)

    println()

    for (i in 10 downTo 1 step 2)
        print(i)

    println()

    val languages = arrayOf("PHP", "Javascript", "Java", "Kotlin")
    for (language in languages)
        print("$language ")

    println()

    for (i in languages.indices)
        print("$i:${languages[i]} ")

    println()

    for ((index, element) in languages.withIndex())
        println("El elemento que está en el índice $index es $element.")

    for (c in languages.last())
        print("$c ")

    println()

    languages.forEach {
        print(it)
    }
}