package lab1.exam2

import kotlin.math.PI

fun addToppings(vararg toppings: String) {
    for (topping in toppings) {
        println(topping)
    }
}

fun main() {
    addToppings("Cheese", "Olives", "Mushroom")

    val radius = 5.0
    println(PI * radius * radius)
    println(kotlin.math.PI * radius * radius)
}