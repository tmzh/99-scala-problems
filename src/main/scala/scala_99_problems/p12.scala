package scala_99_problems

object P12 {
  def decode[A](l: List[(Int, A)]): List[A] = {
    l flatMap {
      case (n, el) => List.fill(n)(el)
    }
  }
}
