package scala_99_problems

object P24 {
  def lotto(count:Int, max:Int): List[Int] = {
    P23.randomSelect(count, P22.range(1, max))
  }
}
