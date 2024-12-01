package ca.cem.tupayachi

import org.apache.commons.validator.routines.EmailValidator


fun main() {
    println(isValidZipCode("A4F9p3"))
    println(isValidEmail("abc@a.com"))
}

fun isValidZipCode(zippy: String): Boolean {
    val regex = Regex("^[A-Za-z]\\d[A-Za-z][ -]{0,2}\\d[A-Za-z]\\d$", RegexOption.IGNORE_CASE)
    //verifier si le pattern coincide avec le zippy
    return regex.matches(zippy)
}

fun isValidEmail(courriel: String): Boolean {
    return EmailValidator.getInstance().isValid(courriel)
}
