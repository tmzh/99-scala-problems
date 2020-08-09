package scala_99_problems

case class P36(i: Int) {
  val primes = sieve(Stream.from(2))

  def sieve(s: Stream[Int]): Stream[Int] =
    s.head #:: sieve(s.tail.filter(_ % s.head != 0))

  def primeFactorMultiplicity = {
    def primeFactorMultiplicityR(i: Int, ps: Stream[Int]): List[Int] = {
      if (P31(i).isPrime) List(i)
      else if (i % ps.head == 0) ps.head :: primeFactorMultiplicityR(i / ps.head, ps)
      else primeFactorMultiplicityR(i, ps.tail)

    }

    primeFactorMultiplicityR(i, primes).groupMapReduce(identity)(_ => 1)(_ + _)
  }

}
