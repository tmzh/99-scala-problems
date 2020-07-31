package scala_99_problems

object P28 {
  def lsortFreq[A](members: List[List[A]]): List[List[A]] = {
    members
      .groupBy{ e => e.size }
      .toList
      .sortBy(_._2.size)
      .flatMap(_._2)
  }

  def lsort[A](members: List[List[A]]): List[List[A]] = {
    members.sortBy{ e => e.size}
  }

}
