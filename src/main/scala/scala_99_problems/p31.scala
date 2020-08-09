package scala_99_problems

case class P31(val number: Int) {

  def isPrime: Boolean =
    (number > 1) && ( 2 to Math.sqrt(number).toInt  forall { number % _ != 0 })
}


