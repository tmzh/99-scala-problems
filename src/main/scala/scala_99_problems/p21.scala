package scala_99_problems

object P21 {
  def insertAt[A](el:A, n: Int, l: List[A]): List[A] = l.take(n).:+(el) ::: l.drop(n)
}
