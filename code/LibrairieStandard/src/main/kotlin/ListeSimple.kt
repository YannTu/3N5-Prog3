package org.tupayachi

fun main(args: Array<String>) {
    if(args.isEmpty())
    {
        println("Entrer un ou des entiers")
        return
    }
    for (i: Int in 0..args.size) {
        val liste: List<Int> = repete(args[i].toInt(), args[i].toInt() + 2)
        println(liste)
    }
}

fun repete(n: Int, nombreFois: Int) {
    var list: List<Int>
    for (i: Int in 1 .. n) {
        list.
    }
}