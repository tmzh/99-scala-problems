package scala_99_problems

class P34(x: Int) {
  def totient: Int = Stream.from(1).takeWhile(_ <= x).count(x % _ == 0)

}
