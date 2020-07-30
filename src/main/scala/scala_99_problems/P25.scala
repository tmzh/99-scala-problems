package scala_99_problems

object P25 {
  def randomPermute[A](l:List[A]): List[A] = {
    P23.randomSelect(l.size, l)
  }
}
