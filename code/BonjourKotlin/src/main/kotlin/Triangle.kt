package org.tupayachi

fun main(args: Array<Char>) {
    var a: String = "*"
    var hauteur: Int = args[0].code
    for (i: Int in 0..3) {
        print(a)
        a += "*"
    }
}