package org.tupayachi

fun main() {
    val a: Truc = Truc(3, "pop")
    val b: Truc = Truc(9, "pip")
    val c: Truc = Truc(17, "popi")
    val liste1 = listOf(a, b, c)
    val liste2 = listOf(b, c, a)
    println("$liste1\n$liste2")
    a.pipo = 87
    a.popi = "a"
    println("$liste1\n$liste2")
}