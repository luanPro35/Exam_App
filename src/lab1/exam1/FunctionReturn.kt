package lab1.exam1

fun roll(): Int {
    return (1..6).random()
}

fun main() {
    println("Dice rolled: ${roll()}")
}