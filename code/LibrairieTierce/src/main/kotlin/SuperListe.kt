package org.tupayachi

import org.magicwerk.brownies.collections.GapList
import java.util.LinkedList
import kotlin.random.Random

fun main() {
    val linkedList: LinkedList<Int> = LinkedList<Int>()
    println("\nLinkedList:")
    testeCetteListe(linkedList)
    val arrayList: ArrayList<Int> = ArrayList<Int>()
    println("\nArrayList:")
    testeCetteListe(arrayList)
    val gapList: GapList<Int> = GapList<Int>()
    println("\nGapList:")
    testeCetteListe(gapList)
}

fun testeCetteListe(liste: MutableList<Int>) {
    val random: Random = Random(1234)
    val nombre = 1
    val a = System.currentTimeMillis()
    // ajouter 100 000 elements en dernière position liste.add(nombre);
    for (i: Int in 1..100000) {
        liste.add(nombre)
    }
    val b = System.currentTimeMillis()
    // ajouter 100 000 elements en première position liste.add(0, nombre);
    for (i: Int in 1..100000) {
        liste.add(0, nombre)
    }
    val c = System.currentTimeMillis()
    // ajouter 100 000 elements position au hasard liste.add(random.nextInt(liste.size + 1), nombre);
    for (i: Int in 1..100000) {
        liste.add(random.nextInt(liste.size + 1), nombre)
    }
    val d = System.currentTimeMillis()
    // afficher b-a, c-b, d-c qui sont les durées d'exécution en millisecondes
    println("${b - a} millisecondes pour ajouter en dernière position")
    println("${c - b} millisecondes pour ajouter en première position")
    println("${d - c} millisecondes pour ajouter en position au hasard")
}