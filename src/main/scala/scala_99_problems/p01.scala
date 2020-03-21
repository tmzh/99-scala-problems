package scala_99_problems

object P01 {
  def last[A](l: List[A]): A = l.last

  def lastRecursive[A](l: List[A]): A = l match {
    case t :: Nil  => t
    case h :: tail => lastRecursive(tail)
    case _ => throw new NoSuchElementException
  }
}