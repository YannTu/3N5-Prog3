package org.tupayachi

import java.lang.StringBuilder

fun main() {
    val input = "334446121"
    println(input)
    println(unUn(input))
}

fun unUn(source: String): String{
    if (source.isEmpty()) return ""
    val sourcefinal = StringBuilder()
    var count = 1
    var currentChar = source[0]
    for (i in 1 until source.length) {
        if (source[i] == currentChar) {
            count++
        } else {
            sourcefinal.append(count).append(currentChar)
            currentChar = source[i]
            count = 1
        }
    }
    sourcefinal.append(count).append(currentChar)
    return sourcefinal.toString()
}

