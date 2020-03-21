package scala_99_problems

object P04 {
  def length[A](l: List[A]): Int = l.size

  def lengthRecursive[A](l: List[A]): Int = {
    def lengthRecursiveCount[A](n: Int, l: List[A]): Int = l match {
      case Nil => n
      case h :: tail => lengthRecursiveCount(n+1, tail)
      case _ => throw new NoSuchElementException
    }
    lengthRecursiveCount(0, l)
  }
}