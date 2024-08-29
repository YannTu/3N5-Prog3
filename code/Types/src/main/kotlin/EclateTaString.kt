package org.tupayachi

fun main(args: Array<String>) {
    val chaine: String = args[0]
    val dernierIndex: Int = chaine.length - 1
    for (i: Int in 0 ..dernierIndex) {
        println(chaine[i])
    }
}