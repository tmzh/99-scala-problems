package scala_99_problems

object P13 {
  def encode[A](l: List[A]): List[(Int, A)] = {
    val (similar, rest) = l span (_ == l.head)
    rest match {
      case Nil => List((similar.size, similar.head))
      case _   => (similar.size, similar.head) :: encode(rest)
    }

  }
}
