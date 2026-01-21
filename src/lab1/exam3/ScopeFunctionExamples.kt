package lab1.exam3

fun main() {
    val arguments: Map<String, String>? = mapOf("LETTER" to "A")

    var letterId = ""
    arguments?.let {
        letterId = it["LETTER"].toString()
    }
    println(letterId)

    val person = Person().apply {
        name = "Luân"
        age = 20
    }

    println(person)
}

class Person {
    var name = ""
    var age = 0
}