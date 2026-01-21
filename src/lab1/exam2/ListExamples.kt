package lab1.exam2

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    println("Size: ${numbers.size}")
    println("First: ${numbers[0]}")
    println("Reversed: ${numbers.reversed()}")

    val entrees = mutableListOf<String>()
    entrees.add("spaghetti")
    entrees[0] = "lasagna"
    entrees.remove("lasagna")

    println(entrees)
}