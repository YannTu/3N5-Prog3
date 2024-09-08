package org.tupayachi

fun main() {
    val dictionnaire: MutableMap<String, Int> = mutableMapOf("Sanchez" to 92, "Tremblay" to 68, "Richard" to 73)
    afficherMap(dictionnaire)
    dictionnaire["Gino Tremblay"] = 30
    afficherMap(dictionnaire)
    dictionnaire["Sasa"] = 68
    afficherMap(dictionnaire)
}

fun afficherMap(map: Map<String, Int>) {
    println("NOTES")
    println(map.map { "${it.key} a eu ${it.value}%." }.joinToString("\n"))
}