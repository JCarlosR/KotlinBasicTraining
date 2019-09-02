package _12_functional_programming

// Higher order functions

fun main(args: Array<String>) {
    // FP
    val languages = arrayOf(
        "PHP",
        "Javascript",
        "Java",
        "Kotlin",
        "C++"
    )

    // exclude length <= 3
    // list Java (4)
    /*
    val filteredLanguages = mutableListOf<String>()
    for (lang in languages) {
        if (lang.length > 3)
            filteredLanguages.add(lang)
    }

    for (lang in filteredLanguages) {
        println("$lang (${lang.length})")
    }*/

    /*
    val filteredLanguages = filterLanguages(languages)
    printLanguages(filteredLanguages)
    */

    /* Explicit parameter name
    languages.filter { lang -> lang.length > 3 }
            .map { lang -> "$lang (${lang.length})" }
            .forEach { language -> println(language) }
    */

    // Implicit parameter name
    languages.filter { it.length > 3 }
            .map { "$it (${it.length})" }
            .forEach { println(it) }
}

// Pure function
/*
fun filterLanguages(languages: Array<String>): MutableList<String> {
    val filteredLanguages = mutableListOf<String>()
    for (lang in languages) {
        if (lang.length > 3)
            filteredLanguages.add(lang)
    }
    return filteredLanguages
}

fun printLanguages(languages: MutableList<String>) {
    for (lang in languages) {
        println("$lang (${lang.length})")
    }
}
*/