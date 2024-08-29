package org.tupayachi

fun main() {
    println("Hello World!")
    val a = 1                                   // type est Int
    val aa = 1L                                 // type est Long *
    val aaa = a * 25 + aa * 100                 // type est Long *
    val b = 1.0                                 // type est Double
    val c = "1"                                 // type est String
    val d = true                                // type est Boolean
    val laChose = c + b                         // type est String *
    val k = listOf("1", "2", "3")               // type est List<String>
    val l = mutableListOf(true, false, true)    // type est MutableList<Boolean> *
}