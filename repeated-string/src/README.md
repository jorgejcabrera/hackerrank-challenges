There is a string, _s_, of lowercase English letters that is repeated infinitely many times. Given an integer, _n_, find
and print the number of letter a's in the first _n_ letters of the infinite string.

**Example**

- s = 'abcac'
- n = 10

The substring we consider is _abcacabcac_ , the first _10_ characters of the infinite string. There are _4_ occurrences
of a in the substring.

**Function Description**

Complete the repeatedString function in the editor below.

_repeatedString_ has the following parameter(s):

- s: a string to repeat
- n: the number of characters to consider

**Returns**

-int: the frequency of a in the substring

**Input Format**

The first line contains a single string, _s_.
The second line contains an integer, _n_.

**Contraints**

- 1 <= |s| <= 100
- 1 <= n <= 10¹²
- for 25% of the test cases. n <= 10⁶
