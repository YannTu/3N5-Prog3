package org.tupayachi

fun main(args: Array<String>) {
    val index: Int = args.size - 1
    for (i: Int in 0..index) {
        afficherPyramide(args[i].toInt())
    }
}

fun afficherPyramide(hauteur: Int) {
    var nbEtoiles: Int = 1
    var nbEspaces: Int = hauteur - 1
    var ligne: String = ""
    for (i: Int in 1..hauteur) {
        ligne = " ".repeat(nbEspaces) + "*".repeat(nbEtoiles)
        println(ligne)
        nbEtoiles += 2
        nbEspaces -= 1
    }
}