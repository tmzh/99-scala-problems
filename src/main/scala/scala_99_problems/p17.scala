package scala_99_problems

object P17 {
  def split[A](n: Int, l: List[A]): (List[A],List[A]) = {
    def splitR[A](n: Int, left: List[A], right: List[A]): (List[A], List[A]) = {
      (n, left, right) match {
        case (_, left, Nil) => (left, Nil)
        case (0, left, right) => (left, right)
        case (n, left, right) => splitR(n-1, left :+ right.head, right.tail)
      }
    }
    splitR(n, Nil, l)
  }
}
