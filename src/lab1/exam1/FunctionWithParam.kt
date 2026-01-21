package lab1.exam1

fun printBorder(border: String, timesToRepeat: Int) {
    repeat(timesToRepeat) {
        print(border)
    }
    println()
}

fun main() {
    printBorder("*", 10)
}