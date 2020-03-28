package scala_99_problems

object P19 {
  def rotate[A](n: Int, l: List[A]): List[A] = l.drop(n) ::: l.take(n)
}
