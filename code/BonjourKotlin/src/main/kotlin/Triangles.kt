package org.tupayachi

fun main() {
    println(triangle(4))
    println(triangle(8))
    println(triangle(10))
    println(triangle(100))
}

fun triangle(hauteur : Int) : String {
    var triangle = ""
    for (i in 1..hauteur) {
        for (e in 1..i) {
            triangle += "*"
        }
        triangle += "\n"
    }
    return triangle
}