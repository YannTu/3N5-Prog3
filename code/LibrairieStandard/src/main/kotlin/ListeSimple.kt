package org.tupayachi

fun main(args: Array<String>) {
    if(args.isEmpty())
    {
        println("Entrer un ou des entiers")
        return
    }
    val liste = repete(args[0].toInt(), args[1].toInt())
    println(liste)
}

fun repete(n: Int, nombreFois: Int): MutableList<Int> {
    val listeRetourne: MutableList<Int> = mutableListOf()
    for (i: Int in 1 .. n) {
        repeat(nombreFois) {
            listeRetourne.add(i)
        }
    }
    return listeRetourne
}