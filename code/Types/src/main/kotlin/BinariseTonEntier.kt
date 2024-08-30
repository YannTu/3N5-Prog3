package org.tupayachi

fun main(args: Array<String>) {
    if(args.isEmpty()) {
        print("Aucune chaîne de charactères")
    }
    else {
        try {
            val nombre = args[0].toInt()
            print(nombre.toString(2))
        } catch (e: Exception) {
            println("Cet argument n'est pas un nombre")
        }
    }
}