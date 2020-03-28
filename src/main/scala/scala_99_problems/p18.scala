package scala_99_problems

object P18 {
  def slice[A](m: Int, n: Int, l: List[A]): List[A] = l.drop(m).take(n-m)
}
