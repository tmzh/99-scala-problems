package scala_99_problems

class P33(x: Int) {
  def isCoprimeTo(y: Int): Boolean = P32.gcd(x, y) == 1
}
