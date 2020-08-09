package scala_99_problems

case class P36(i: Int) {
  def primeFactorMultiplicity = {
    P35(i).primeFactors.groupMapReduce(identity)(_ => 1)(_ + _)
  }
}
