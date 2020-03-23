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

  it should "Find out whether a list is a palindrome" in {
    P06.isPalindrome(List(1, 2, 3, 2, 1)) shouldEqual true
    P06.isPalindrome(List(1, 2, 3, 2)) shouldEqual false
  }

  it should "Flatten a nested list structure" in {
    P07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) shouldEqual List(1, 1, 2, 3, 5, 8)
  }

  it should "Eliminate consecutive duplicates of list elements" in {
    P08.compress(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd','e', 'e', 'e', 'e')) shouldEqual List('a', 'b', 'c', 'a', 'd', 'e')
  }

  it should "Pack consecutive duplicates of list elements into sublists" in {
    P09.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldEqual List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
  }
  
  it should "Run-length encoding of a list" in {
    P10.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldEqual List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  }

  it should "Modified run-length encoding" in {
    P11.encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldEqual List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
  }
}
