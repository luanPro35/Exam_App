package lab1.exam1

fun main() {
    val rollResult = (1..6).random()
    val luckyNumber = 3

    when (rollResult) {
        luckyNumber -> println("You won!")
        1 -> println("You rolled a 1")
        2 -> println("You rolled a 2")
        3 -> println("You rolled a 3")
        4 -> println("You rolled a 4")
        5 -> println("You rolled a 5")
        6 -> println("You rolled a 6")
    }
}