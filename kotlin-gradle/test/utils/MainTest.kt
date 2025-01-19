package org.example.utils

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MainKtTest {

    @Test
    fun testSum() {
        assertEquals(3, sum(1, 2))
        assertEquals(0, sum(-1, 1))
        assertEquals(-3, sum(-1, -2))
    }
}