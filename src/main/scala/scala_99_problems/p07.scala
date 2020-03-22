package scala_99_problems

object P07 {
  def flatten(l: List[Any]): List[Any] = l flatMap {
    case e: List[Any] => flatten(e)
    case x => List(x)
  }
}