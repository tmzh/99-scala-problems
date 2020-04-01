package scala_99_problems

object P23 {
  def randomSelect[A](count:Int, l:List[A]): List[A] = {
    import util.Random
    def randomSplit[A](small: List[A], big: List[A], count: Int):(List[A], List[A], Int) = (small, big, count) match {
      case (s, b, 0) => (s, b, 0)
      case (s, b, c) =>  {
        val (newBig, el) = P20.removeAt(Random.nextInt(b.size), b)
        randomSplit(s :+ el, newBig, c - 1)
      }
    }

    randomSplit(Nil, l, count)._1
  }
  
}
