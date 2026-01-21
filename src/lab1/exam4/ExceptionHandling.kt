package lab1.exam4


fun divide(a: Int, b: Int): Int {
    return a / b
}

fun main() {
    try {
        val result = divide(10, 0)
        println(result)
    } catch (e: Exception) {
        println(e.message)
    }
}
