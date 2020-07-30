package scala_99_problems

object P26 {
  def combinations[A](i: Int, value: List[A]): List[List[A]] = {
    if (i == 0) List(Nil)
    else if (i == value.size) List(value)
    else value match {
      case Nil => List(Nil)
      case head::tail =>
        combinations(i, tail) ::: combinations(i - 1, tail).map { tailCombos => head :: tailCombos }
    }
  }

}
