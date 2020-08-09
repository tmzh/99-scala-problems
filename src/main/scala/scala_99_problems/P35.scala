package scala_99_problems

case class P35(i: Int) {
  val primes = sieve(Stream.from(2))

  def sieve(s: Stream[Int]): Stream[Int] =
    s.head #:: sieve(s.tail.filter(_ % s.head != 0))

  object primeFactors {
    def primeFactorsR(i: Int, ps: Stream[Int]): List[Int] = {
      if (P31(i).isPrime) List(i)
      else if (i % ps.head == 0) ps.head :: primeFactorsR(i / ps.head, ps)
      else primeFactorsR(i, ps.tail)

    }

    primeFactorsR(i, primes)
  }

}
