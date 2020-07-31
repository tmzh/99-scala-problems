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

  it should "Decode a run-length encoded list" in {
    P12.decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) shouldEqual List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  }

  it should "Run-length encoding of a list (direct solution)" in {
    P13.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldEqual List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  }
  
  it should "Duplicate the elements of a list" in {
    P14.duplicate(List('a, 'b, 'c, 'c, 'd)) shouldEqual List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
  }

  it should "Duplicate the elements of a list a given number of times" in {
    P15.duplicateN(3, List('a, 'b, 'c, 'c, 'd)) shouldEqual List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
  }

  it should "Drop every Nth element from a list" in {
    P16.drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) shouldEqual List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
  }

  it should "Split a list into two parts" in {
    P17.split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) shouldEqual (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  }

  it should "Given two indices, I and K, the slice is the list containing the elements from and including the Ith element up to but not including the Kth element of the original list. Start counting the elements with 0" in {
    P18.slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) shouldEqual List('d, 'e, 'f, 'g)
  }

  it should "Rotate a list N places to the left" in {
    P19.rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) shouldEqual List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
  }

  it should "Remove the Kth element from a list" in {
    P20.removeAt(1, List('a, 'b, 'c, 'd)) shouldEqual (List('a, 'c, 'd),'b)
  }

  it should "Insert an element at a given position into a list" in {
    P21.insertAt('new, 1, List('a, 'b, 'c, 'd)) shouldEqual List('a, 'new, 'b, 'c, 'd)
  }

  it should "Create a list containing all integers within a given range" in {
    P22.range(4,9) shouldEqual List(4, 5, 6, 7, 8, 9)
  }

  it should "Extract a given number of randomly selected elements from a list" in {
    P23.randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h)) should have length 3
    P23.randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h)).toSet.size shouldEqual 3
    P23.randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h)) should not equal P23.randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
  }

  it should "Lotto: Draw N different random numbers from the set 1..M." in {
    P24.lotto(6, 49) should have length 6
    P24.lotto(6, 49).toSet.size shouldEqual 6
    P24.lotto(6, 49) should not equal P24.lotto(6,49)
  }

  it should "Generate a random permutation of the elements of a list" in {
    P25.randomPermute(List('a, 'b, 'c, 'd, 'e, 'f)) should have length 6
  }

  it should "Generate the combinations of K distinct objects chosen from the N elements of a list" in {
    P26.combinations(3, List('a, 'b, 'c, 'd, 'e, 'f )) should have length 20
  }

   it should "Group the elements of a set into disjoint subsets" in {
     P27.group(List(2, 2, 5), List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")) should have length 756
   }

  it should "Sort a list of lists according to length of sublists" in {
    P28.lsort(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o))) shouldEqual List(List('o), List('d, 'e), List('d, 'e), List('m, 'n), List('a, 'b, 'c), List('f, 'g, 'h), List('i, 'j, 'k, 'l))
  }

  it should "Sort the elements according to their length frequency" in {
    val lsorted = P28.lsortFreq(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o)))
    assert(List(List('i, 'j, 'k, 'l), List('o)).toSet === lsorted.take(2).toSet )
    assert(List(List('a, 'b, 'c), List('f, 'g, 'h)).toSet === lsorted.slice(2, 4).toSet )
    assert(List(List('d, 'e), List('d, 'e), List('m, 'n)).toSet == lsorted.takeRight(3).toSet )
  }
}
