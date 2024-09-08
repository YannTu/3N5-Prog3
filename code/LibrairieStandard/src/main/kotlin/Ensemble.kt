package org.tupayachi

fun main(args: Array<String>) {
    val mots: Set<String> = args.toSet()
    for (i: Int in 0..mots.size - 1) {
        println(mots.sorted()[i])
    }
}