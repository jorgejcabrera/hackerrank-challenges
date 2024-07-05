import org.hackerrank.countingValleys
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

internal class HikeTest {


    companion object {
        @JvmStatic
        fun testData() = listOf(
            arrayOf(8, "UDDDUDUU", 1),
            arrayOf(4, "UUDD", 0),
            /*
            * _    /\      /\  _
            *  \  /  \/\  /  \/
            *   \/      \/
            * */
            arrayOf(16, "DDUUUDDUDDUUUDDU", 4)
        )
    }


    @ParameterizedTest
    @MethodSource("testData")
    fun testCountingValleys(steps: Int, path: String, expectedValleys: Int) {
        // when
        val actualValleys = countingValleys(steps, path)

        // then
        assertEquals(expectedValleys, actualValleys, "The number of valleys counted should be $expectedValleys")
    }
}