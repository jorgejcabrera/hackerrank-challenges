import org.hackerrank.jumpingOnClouds
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

internal class JumpTest {

    companion object {
        @JvmStatic
        fun testData() = listOf(
            arrayOf(arrayOf(0, 0, 0, 1, 0, 0), 3),
            arrayOf(arrayOf(0, 0, 1, 0, 0, 1, 0), 4),
        )
    }


    @ParameterizedTest
    @MethodSource("testData")
    fun testCountingValleys(clouds: Array<Int>, expectedJumps: Int) {
        // when
        val jumps = jumpingOnClouds(clouds)

        // then
        assertEquals(expectedJumps, jumps, "The number of jumps counted should be $expectedJumps")
    }
}