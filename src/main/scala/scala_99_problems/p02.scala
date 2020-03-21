package scala_99_problems

object P02 {
  def penultimate[A](l: List[A]): A = l.init.last
}