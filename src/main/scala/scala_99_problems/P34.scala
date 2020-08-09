package scala_99_problems

class P34(x: Int) {
  val num = new P33(x)

  def totient: Int = Stream.from(1).takeWhile(_ <= x).count(num.isCoprimeTo(_))

}
