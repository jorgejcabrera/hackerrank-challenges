package org.hackerrank;

import java.lang.RuntimeException

/*
 * Complete the 'countingValleys' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER steps
 *  2. STRING path
 */

fun countingValleys(steps: Int, path: String): Int {
    var level = 0
    var countedValleys = 0
    for (char in path) {
        val previousLevel = level
        when (char) {
            'U' -> level++
            'D' -> level--
            else -> throw RuntimeException("Unknown hike value: $char")
        }
        if (previousLevel == 0 && level == -1) {
            countedValleys++
        }
    }
    return countedValleys
}

fun main(args: Array<String>) {
    val steps = readLine()!!.trim().toInt()

    val path = readLine()!!

    val result = countingValleys(steps, path)

    println(result)
}