package org.typayachi

import org.typayachi.org.typayachi.ElementNonTrouvéException

fun main() {
    println(trouveru(arrayOf("a", "b", "c"), "b"))
    try {
        trouveru(arrayOf("a", "b", "c"), "d")
    } catch (e: ElementNonTrouvéException) {
        println(e.message)
    }
}

fun trouveru(tableau: Array<String>, element: String): Int {
    for (i in tableau.indices) {
         if (tableau[i] == element) {
             return i
         }
    }
    throw ElementNonTrouvéException()
}