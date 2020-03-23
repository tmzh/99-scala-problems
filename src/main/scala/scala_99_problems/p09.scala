package scala_99_problems

object P09 {
  def pack[A](l: List[A]): List[List[A]] = l match {
    case a :: tail => List(List(a) ::: tail.takeWhile(_ == a)) ::: pack(tail.dropWhile(_ == a))
    case Nil => Nil
  }
}