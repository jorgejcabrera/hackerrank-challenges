package org.hackerrank;

/*
 * Complete the 'repeatedString' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts following parameters:
 *  1. STRING s
 *  2. LONG_INTEGER n
 */

fun repeatedString(s: String, n: Long): Long {
    val fullRepeats = n / s.length
    val remainder = (n % s.length).toInt()
    val countAInFullString = s.count { it == 'a' }
    val totalFullRepeats = countAInFullString * fullRepeats
    val countAInRemainder = s.take(remainder).count { it == 'a' }
    return totalFullRepeats + countAInRemainder
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val n = readLine()!!.trim().toLong()

    val result = repeatedString(s, n)

    println(result)
}