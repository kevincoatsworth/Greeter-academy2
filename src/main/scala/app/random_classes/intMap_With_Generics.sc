def intMap[A](list: List[A], f: A => A): List[A] = {
  list match {
    case Nil => list
    case head :: tail => f(head) :: intMap(tail, f)
  }
}

intMap[Int](List(1,2,3), _ * 3)

intMap[String](List("Kevin Coatsworth", "Ken Rayner", "Liam Henderson"), _ .replace(" ", "").toLowerCase)

