package ca.cem.tupayachi

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MainTest {

    @Test
    fun testValidZipCode() {
        assertTrue(isValidZipCode("H1Y1E1"))
        assertTrue(isValidZipCode("H1Y 1E1"))
        assertTrue(isValidZipCode("h3Y 1E8"))
    }

    @Test
    fun testInvalidZipCode() {
        assertFalse(isValidZipCode("H1Y    1E1"))
        assertFalse(isValidZipCode("H1Y_1E1"))
        assertFalse(isValidZipCode("h3Y 1TO"))
    }

    @Test
    fun testValidEmail() {
        assertTrue(isValidEmail("bob@smith.org"))
        assertTrue(isValidEmail("a.b.c@pipo.com"))
        assertTrue(isValidEmail("Rodgere.Federer@tennis.info"))
    }

    @Test
    fun testInvalidEmail() {
        assertFalse(isValidEmail("bob@smith"))
        assertFalse(isValidEmail("a..b@popi.org"))
        assertFalse(isValidEmail("john.doe@.com"))
        assertFalse(isValidEmail("john.doe@plop.c"))
    }
}