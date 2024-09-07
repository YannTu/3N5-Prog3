package org.tupayachi

fun main() {
    val liste1: List<Int> = listOf(-78, 248, -32, 1, 43)
    println("Liste: $liste1")
    println("La liste contient l'élément 1 fourni: ${trouveALaMain(1, liste1)}")
    println("La liste contient l'élément 1 fourni: ${trouve(1, liste1)}")
    println("La liste a l'élément 43 fourni ${compteALaMain(43, liste1)} fois")
    println("La liste a l'élément 43 fourni ${compte(43, liste1)} fois")
    val liste2: List<Int> = listOf(3, 3, -1, 0, -4, 1)
    println("Liste: $liste2")
    println("La liste contient l'élément 5 fourni: ${trouveALaMain(5, liste2)}")
    println("La liste contient l'élément 5 fourni: ${trouve(5, liste2)}")
    println("La liste a l'élément 3 fourni ${compteALaMain(3, liste2)} fois")
    println("La liste a l'élément 3 fourni ${compte(3, liste2)} fois")

}

fun trouveALaMain(element: Int, liste: List<Int>): Boolean {
    for (i: Int in liste) {
        if (i == element) {
            return true
        }
    }
    return false
}

fun trouve(element: Int, liste: List<Int>): Boolean {
    return liste.contains(element)
}

fun compteALaMain(element: Int, liste: List<Int>): Int {
    var cpt = 0
    for (i: Int in liste) {
        if (i == element) {
            cpt++
        }
    }
    return cpt
}

fun compte(element: Int, liste: List<Int>): Int {
    return liste.count({ it == element })
}