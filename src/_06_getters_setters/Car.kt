package _06_getters_setters

class Car {
    var color: String = "unknown"
    get() {
        countColorRead += 1
        println("Se ha leído el atributo color de $code")
        return field
    }
    set(value) {
        field = if (value in arrayOf("black", "white", "red"))
            value
        else
            "invalid"
    }

    var code = "00000"
    var countColorRead: Int = 0
}