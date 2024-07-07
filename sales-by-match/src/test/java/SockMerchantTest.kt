import org.hackerrank.sockMerchant
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

internal class SockMerchantTest {

    companion object {
        @JvmStatic
        fun testData() = listOf(
            arrayOf(6, arrayOf(1, 2, 1, 2, 4, 3), 2),
            arrayOf(6, arrayOf(1, 1, 1, 1, 1, 3), 2),
            arrayOf(8, arrayOf(1, 1, 1, 2, 2, 5, 1, 5), 4),
            arrayOf(8, arrayOf(5, 4, 3, 2, 3, 1, 1, 2), 3),
            arrayOf(8, arrayOf(1, 2, 3, 4, 5, 6, 7, 8), 0),
            )
    }


    @ParameterizedTest
    @MethodSource("testData")
    fun testCountingValleys(size: Int, sockets: Array<Int>, expectedPairs: Int) {
        // when
        val pairs = sockMerchant(size, sockets)

        // then
        assertEquals(expectedPairs, pairs, "The number of socket pairs counted should be $expectedPairs")
    }
}