package org.tupayachi

fun main() {
    val nbInt: Int = 15
    val nbDouble: Double = 15.89
    val nbString: String = "32"
    val nbFloat: Float = 15.89F
    println(nbInt.toFloat()) //convertit un Int en Float
    println(nbDouble.toInt()) //convertit un Double en Int
    println(nbString.toInt()) //convertit une String en Int
    println(nbInt.toString()) //convertit un Int en String
    println(nbFloat.toDouble()) //convertit un Float en Double
}