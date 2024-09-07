package org.tupayachi

fun main() {
    val liste1: List<Double> = listOf<Double>(-78.0, 248.544576, -32.76, 1.90, 43.008)
    val liste2: List<Double> = listOf<Double>(3.89, 3.089, -1.2, 0.3, -45.3, 1.0)
    val liste3: List<Double> = listOf<Double>(378.0, -4.3, 67.0, 324.99, -89.23)
    triInverseALaMain(liste1)
    triInverse(liste1)
    triInverseALaMain(liste2)
    triInverse(liste2)
    triInverseALaMain(liste3)
    triInverse(liste3)
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