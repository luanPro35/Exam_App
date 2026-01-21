package lab1.exam4

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

fun main() {
    val direction = Direction.NORTH

    when (direction) {
        Direction.NORTH -> println("NORTH")
        Direction.SOUTH -> println("SOUTH")
        Direction.WEST -> println("WEST")
        Direction.EAST -> println("EAST")
    }
}
