package scala_99_problems

object P32 {
  def gcd(i: Int, j: Int): Int = if (j == 0) i else gcd(j, i % j)
}
