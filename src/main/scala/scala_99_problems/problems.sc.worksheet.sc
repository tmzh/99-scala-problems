List(1,2,3,4,5).last
List(1,2,3,4,5).init.last
val l = List(List(1, 1), 2, List(3, List(5, 8)))
def flatten(l: List[Any]): List[Any] = l flatMap {
case e: List[Any] => flatten(e)
case x => List(x)
}
flatten(l)
