package lab1.exam1

fun main() {
    val diceRoll = (1..6).random()

    val result = when (diceRoll) {
        1 -> "Dice 1"
        2 -> "Dice 2"
        3 -> "Dice 3"
        4 -> "Dice 4"
        5 -> "Dice 5"
        else -> "Dice 6"
    }

    println(result)
}
