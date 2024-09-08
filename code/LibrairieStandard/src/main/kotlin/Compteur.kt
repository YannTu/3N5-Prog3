package org.tupayachi

fun main(args: Array<String>) {
    val map: MutableMap<String, Int> = mutableMapOf()
    for (i: String in args.toSet()) {
        map[i] = args.count { it == i }
    }
    println(map)
}