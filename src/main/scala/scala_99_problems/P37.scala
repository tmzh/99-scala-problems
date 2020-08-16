package scala_99_problems

case class P37(x: Int) {
  private val num = P36(x)

  def totient: Double = num.primeFactorMultiplicity.foldLeft(1.0) {
    (acc, f) =>
      f match {
        case (p, m) => (p - 1) * math.pow(p, m - 1) * acc
      }
  }

}
