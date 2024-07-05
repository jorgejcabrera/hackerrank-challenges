package org.hackerrank;

/*
 * Complete the 'jumpingOnClouds' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY c as parameter.
 */
fun jumpingOnClouds(c: Array<Int>): Int {
    var jumps = 0
    var index = 0
    while (index < c.size - 1) {
        if (index + 2 < c.size && c[index + 2] == 0) {
            index += 2
        } else {
            index++
        }
        jumps++
    }
    return jumps
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val c = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = jumpingOnClouds(c)

    println(result)
}