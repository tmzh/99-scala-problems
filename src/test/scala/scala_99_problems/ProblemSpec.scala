package scala_99_problems

import org.scalatest._

class ProblemSpec extends FlatSpec with Matchers {
  it should "Find the last element of a list" in {
    P01.last(List(1, 1, 2, 3, 5, 8)) shouldEqual 8
  }

  it should "Find the last but one element of a list" in {
    P02.penultimate(List(1, 1, 2, 3, 5, 8)) shouldEqual 5
  }

  it should "Find the Kth element of a list" in {
    P03.nth(2, List(1, 1, 2, 3, 5, 8)) shouldEqual 2
  }

  it should "Find the number of elements of a list" in {
    P04.length(List(1, 1, 2, 3, 5, 8)) shouldEqual 6
  }

  it should "Reverse a list" in {
    P05.reverse(List(1, 1, 2, 3, 5, 8)) shouldEqual List(8, 5, 3, 2, 1, 1)
  }
}
