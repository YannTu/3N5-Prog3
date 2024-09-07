package org.tupayachi

fun main() {
    while (true) {
        println("Veuillez entrer un nombre :")
        val reponse: String = readln()
        try {
            reponse.toInt()
            println("Merci, votre nombre est $reponse")
            return
        } catch (e: Exception) {
            println("Ceci n’est pas un nombre, veuillez entrer un nombre :")
        }
    }
}