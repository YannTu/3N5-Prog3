package org.tupayachi

import org.apache.commons.validator.routines.EmailValidator
import java.io.File

fun main() {
    val file: File = File("page.md")
    for (i in file.readLines()) {
        if (EmailValidator.getInstance().isValid(i)) {
            println("Ok : $i")
        }
        else {
            println("Ko : $i")
        }
    }
}