package org.tupayachi

import java.io.File

fun main(args: Array<String>) {
    var contenu = ""
    for (fichier: String in args) {
        if(!File(fichier).exists()) {
            println("Le fichier $fichier n'existe pas")
            return
        }
        try {
            if(args[args.size - 1] == fichier) {
                contenu += File(fichier).readText()
            }
            else {
                contenu += File(fichier).readText() + "-------------"
            }
        }
        catch (e: Exception) {
            println("Le fichier $fichier ne peut pas être lu.")
        }
    }
    print(contenu)
}