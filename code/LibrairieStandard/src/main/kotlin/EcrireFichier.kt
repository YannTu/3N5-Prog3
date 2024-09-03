package org.tupayachi

import java.io.File

fun main() {
    File("vide.txt").writeText("allo")
    val fichier = File("../TupayachiYann.txt").createNewFile()
}