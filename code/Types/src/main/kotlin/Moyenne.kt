package org.tupayachi

import kotlin.random.Random

fun main() {
    val tableauAleatoire = creeTableauAleatoire(10)
    println(tableauAleatoire.contentToString())
    println(calcule(tableauAleatoire))
}

fun creeTableauAleatoire(n: Int): Array<Int> {
    return Array(n) { Random.nextInt(0, 100)}
}

fun calcule(t: Array<Int>): String {
    val somme: Int = t.sum()
    val moyenne: Double = t.average()
    val min: Int = t.min()
    val max: Int = t.max()
    return "Somme: $somme\nMoyenne: $moyenne\nMin: $min\nMax: $max"
}