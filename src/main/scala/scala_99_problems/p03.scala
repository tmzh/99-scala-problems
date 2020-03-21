package scala_99_problems

object P03 {
  def nth[A](n: Int, l: List[A]): A = l(n)

  def nthRecursive[A](n: Int, l: List[A]): A = n match {
    case 0 => l.head
    case _ => nthRecursive(n-1, l.tail)
  }
}