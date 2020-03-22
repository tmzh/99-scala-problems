package scala_99_problems

object P06 {
  def isPalindrome[A](l: List[A]): Boolean = {
    l == l.reverse
  }

  def isPalindromeCum[A](l: List[A]): Boolean = {
    l == P05.reverse(l)
  }
}