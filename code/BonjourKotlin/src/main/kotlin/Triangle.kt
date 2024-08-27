package org.tupayachi

fun main(args: Array<String>) {
    for (i in 1..args[0].toInt()) {
        for (e in 1..i) {
            print("*")
        }
        println()
    }
}