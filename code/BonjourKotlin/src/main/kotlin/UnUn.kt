package org.tupayachi

fun main() {
    val input = "334446121"
    println(input)
    println(unUn(input))
}

fun unUn(source: String): String{
    if (source.isEmpty()) return ""
    var sourcefinal = ""
    var count = 1
    var currentChar = source[0]
    for (i in 1 until source.length) {
        if (source[i] == currentChar) {
            count++
        } else {
            sourcefinal += "$count$currentChar"
            currentChar = source[i]
            count = 1
        }
    }
    sourcefinal += "$count$currentChar"
    return sourcefinal
}

