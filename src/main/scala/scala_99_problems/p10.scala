package scala_99_problems

object P10 {
  def pack[A](l: List[A]): List[List[A]] = {
    val (similar, rest) = l span (_ == l.head)  
    rest match {
      case Nil => List(similar)
      case _ => similar :: pack(rest)
    }
  }
  def encode[A](l: List[A]): List[(Int, A)] = {
    pack(l) map {
    el => (el.size, el.head)
  }
}
}