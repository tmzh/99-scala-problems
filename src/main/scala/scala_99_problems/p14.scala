package scala_99_problems

object P14 {
  def duplicate[A](l: List[A]): List[A] = {
    l flatMap {
      el => List(el, el)
    }

  }
}
