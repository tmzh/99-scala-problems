package scala_99_problems

object P15 {
  def duplicateN[A](n: Int, l: List[A]): List[A] = {
    l flatMap {
      el => List.fill(n)(el)
    }

  }
}
