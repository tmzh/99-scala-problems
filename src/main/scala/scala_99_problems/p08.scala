package scala_99_problems

object P08 {
  def compress[A](l: List[A]): List[A] = l match {
    case a :: tail => a :: compress(tail.dropWhile(_ == a))
    case Nil => Nil
  }
}