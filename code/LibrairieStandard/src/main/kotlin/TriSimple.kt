package org.tupayachi

fun main() {
    val liste: List<Double> = listOf<Double>(-78.0, 248.544576, -32.76, 1.90, 43.008)
    triInverseALaMain(liste)
    triInverse(liste)
}

fun triInverseALaMain(liste: List<Double>) {
    val listeMutable: MutableList<Double> = mutableListOf()
    for (i: Int in 0..liste.size - 1) {
        listeMutable.add(liste[i])
    }
    println(listeMutable.sorted())
}

fun triInverse(liste: List<Double>) {
    println(liste.toMutableList().sorted())
}