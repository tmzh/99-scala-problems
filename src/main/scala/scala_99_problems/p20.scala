package scala_99_problems

object P20 {
  def removeAt[A](n: Int, l: List[A]): (List[A], A) = (l.zipWithIndex.filter ( t => t._2 != n  ).map(_._1), l(n))
}
