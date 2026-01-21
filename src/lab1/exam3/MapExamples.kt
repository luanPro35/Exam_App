package lab1.exam3

fun main() {
    val peopleAges = mutableMapOf(
        "Fred" to 30,
        "Ann" to 23
    )

    peopleAges["Barbara"] = 42
    peopleAges.put("Joe", 51)

    peopleAges.forEach {
        print("${it.key} is ${it.value}, ")
    }
    println()

    val mapped = peopleAges.map { "${it.key} is ${it.value}" }
        .joinToString(", ")
    println(mapped)

    val filteredNames = peopleAges.filter { it.key.length < 4 }
    println(filteredNames)
}