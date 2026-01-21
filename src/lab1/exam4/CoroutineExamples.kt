//package lab1.exam4
//
//import kotlinx.coroutines.*
//import kotlin.random.Random
//
//suspend fun getValue(): Double {
//    delay(1000)
//    return Random.nextDouble(0.0, 100.0)
//}
//
//suspend fun processValue() {
//    val value = getValue()
//    println("Processed value: ${value * 2}")
//}
//
//fun main() = runBlocking {
//
//    val output = getValue()
//    println("Output: $output")
//
//    val job: Job = GlobalScope.launch {
//        val result = getValue()
//        println("GlobalScope result: $result")
//    }
//
//    delay(500)
//    job.cancel()
//
//    val deferred = async {
//        getValue()
//    }
//    println("Async result: ${deferred.await()}")
//
//    processValue()
//}
