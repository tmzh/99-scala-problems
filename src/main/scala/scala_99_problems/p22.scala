package scala_99_problems

object P22 {
  def range(start:Int, end: Int): List[Int] = (start, end) match {
    case(s,e) => if (s == e) List(s) else s :: range(s+1, e)
  }
}
