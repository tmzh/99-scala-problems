package scala_99_problems

object P16 {
  def drop1[A](n: Int, l: List[A]): List[A] = (n, l) match {
    case (_, Nil) => Nil
    case (1, head::tail) => drop(n, tail)
    case (_, head::tail) => head::drop(n -1, tail)
  }

  def drop[A](n: Int, l: List[A]): List[A] = {
    l.zipWithIndex.filter {
      el =>  (el._2 + 1) % n != 0
    }.map(_._1)
  }
}
