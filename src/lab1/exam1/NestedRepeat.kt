package lab1.exam1

fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }
}

fun main() {
    printCakeBottom(5, 3)
}