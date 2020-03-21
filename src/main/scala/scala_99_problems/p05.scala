package scala_99_problems

object P05 {
  def reverse[A](l: List[A]): List[A] = l.reverse

  def reverseRecursive[A](l: List[A]): List[A] = l match {
    case Nil => Nil
    case head :: next => reverseRecursive(next) ::: List(head)
  }
}