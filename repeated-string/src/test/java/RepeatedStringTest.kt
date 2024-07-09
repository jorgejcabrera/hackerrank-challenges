import org.hackerrank.repeatedString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

internal class RepeatedStringTest {

    companion object {
        @JvmStatic
        fun testData() = listOf(
            arrayOf("abcac", 10, 4),
        )
    }


    @ParameterizedTest
    @MethodSource("testData")
    fun testCountingValleys(input: String, n: Long, expectedOccurrences: Long) {
        // when
        val repeatedString = repeatedString(input, n)

        // then
        assertEquals(
            expectedOccurrences,
            repeatedString,
            "The number of repeatedString counted should be $expectedOccurrences"
        )
    }
}