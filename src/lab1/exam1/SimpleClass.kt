package lab1.exam1

class Dice {
    var sides = 6

    fun roll() {
        println((1..sides).random())
    }
}

fun main() {
    val dice = Dice()
    dice.roll()
}
