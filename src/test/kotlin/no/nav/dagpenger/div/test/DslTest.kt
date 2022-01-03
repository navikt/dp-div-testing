package no.nav.dagpenger.div.test

import org.junit.jupiter.api.Test

class DslTest {

    @Test
    fun `første dsl test`() {
        fetch balance(241241)
    }
}

object fetch {
    infix fun balance(number: Int) = println("Fetch the balance for $number")
}
