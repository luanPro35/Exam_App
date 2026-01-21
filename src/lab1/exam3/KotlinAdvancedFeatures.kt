package lab1.exam3

class Example {

    // backing property
    private var _currentScrambledWord = "test"
    val currentScrambledWord: String
        get() = _currentScrambledWord

    // lateinit
    private lateinit var currentWord: String

    fun initWord() {
        currentWord = "Kotlin"
    }

    companion object {
        const val LETTER = "letter"
    }
}

fun main() {
    // Lambda
    val triple: (Int) -> Int = { a -> a * 3 }
    println(triple(5))

    // Elvis operator
    var quantity: Int? = null
    println(quantity ?: 0)
    quantity = 4
    println(quantity ?: 0)
}