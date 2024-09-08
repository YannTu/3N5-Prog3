package org.tupayachi

fun main() {
    val liste1 = listOf(1234, -747, 77, 1977, -71, 17, 7)
    println("Avant: $liste1\nAprès: ${triComplexe(liste1)}")
    val liste2 = listOf(17234, 747, 2177, -1977, -71, 170, 3980)
    println("Avant: $liste2\nAprès: ${triComplexe(liste2)}")

}

fun triComplexe(liste: List<Int>): List<Int> {
    return liste.sortedWith { a, b ->
        val countA = a.toString().count { it == '7' }
        val countB = b.toString().count { it == '7' }
        when {
            countA < countB -> -1
            countA > countB -> 1
            else -> a.compareTo(b)
        }
    }
}