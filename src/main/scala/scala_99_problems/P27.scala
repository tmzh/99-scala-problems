package scala_99_problems
import P26.combinations

object P27 {
  def group[A](groupCount: List[Int], members: List[A]): List[List[List[A]]] =
    groupCount match {
      case Nil => List(Nil)
      case first :: rest =>
        combinations(first, members).flatMap { firstGroup =>
          group(rest, members diff firstGroup).map{ remainingGroup =>
            firstGroup +: remainingGroup
          }
        }
    }
}
