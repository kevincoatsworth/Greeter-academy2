def find(list : List[Int], fn : Int => Boolean) : Option[Int] = {

  list match {
    case head :: _ if fn(head) => Some(head)
    case Nil => None
    case _ :: tail => find(tail, fn)
  }

}

find(List(1,2,3), _ == 1)
find(List(1,2,3), _ == 4)
find(Nil, _ == 2)