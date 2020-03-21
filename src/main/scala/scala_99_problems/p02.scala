package scala_99_problems

object P02 {
  def penultimate[A](l: List[A]): A = l.init.last

  def penultimateRecursive[A](l: List[A]): A = l match {
    case p :: _ :: Nil  => p
    case _ :: tail => penultimateRecursive(tail)
    case _ => throw new NoSuchElementException
  }
}