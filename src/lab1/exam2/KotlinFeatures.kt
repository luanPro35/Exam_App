package lab1.exam2

class SquareCabin {
    val capacity = 6
    val buildingMaterial = "Wood"
    fun hasRoom() = true
}

fun main() {
    val cabin = SquareCabin()

    with(cabin) {
        println("Capacity: $capacity")
        println("Material: $buildingMaterial")
        println("Has room? ${hasRoom()}")
    }

    val text = " 10000 "
    println(text.trim().toInt())
}