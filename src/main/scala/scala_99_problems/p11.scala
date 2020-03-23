package scala_99_problems

object P11 {
  def pack[A](l: List[A]): List[List[A]] = {
    val (similar, rest) = l span (_ == l.head)  
    rest match {
      case Nil => List(similar)
      case _ => similar :: pack(rest)
    }
  }
  def encodeModified[A](l: List[A]): List[Any] = {
    pack(l) map {
    case el if el.size > 1 => (el.size, el.head)
    case el => el.head
  }
}
}