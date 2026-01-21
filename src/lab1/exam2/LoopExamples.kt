package lab1.exam2

fun main() {
    val myList = listOf("A", "B", "C")

    for (item in myList) {
        println(item)
    }

    var index = 0
    while (index < myList.size) {
        println(myList[index])
        index++
    }
}