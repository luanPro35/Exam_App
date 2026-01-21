package lab1.exam3

fun main() {
    val words = listOf("about", "acute", "balloon", "best", "brief", "class")

    val result = words
        .filter { it.startsWith("b", ignoreCase = true) }
        .shuffled()
        .take(2)
        .sorted()

    println(result)
}