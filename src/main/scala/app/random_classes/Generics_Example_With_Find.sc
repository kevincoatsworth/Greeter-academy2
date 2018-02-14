def find[A](list : List[A], fn : A => Boolean) : Option[A] = {

  list match {
    case head :: _ if fn(head) => Some(head)
    case Nil => None
    case _ :: tail => find(tail, fn)
  }

}

find[Int](List(1,2,3), _ == 4)
find[Int](List(1,2,3), _ == 3)

find[String](List("Adam", "Chris"), _ == "Chris")

find[(Int, String)](List((1, "Adam"), (2, "Chris")), _._2 == "Chris")

find[(Int, String)](List((1, "Adam"), (2, "Chris"), (3, "Kevin")), _._1 == 3)

find[Any](List(1,2,"Chris"), _ == 2)
