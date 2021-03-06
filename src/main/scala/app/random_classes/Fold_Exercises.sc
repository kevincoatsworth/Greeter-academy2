/*
List(1, 2, 3, 4, 5).foldLeft(0)((acc, x) => {

  val result = x + acc
  println(s"$x + $acc = $result")
  result

})
*/

def intMap(list: List[Int], f: Int => Int): List[Int] = {

  if (list != Nil) {

    f(list.head) :: intMap(list.tail, f)

  }

  else {

    Nil

  }

}

intMap(List(1,2,3), x => x + 2)

intMap(List(1,2,3), x => x * 5)




def intMap2(list: List[Int], f: Int => Int): List[Int] = {
  list match {
    case Nil => list
    case head :: tail => f(head) :: intMap2(tail, f)
  }
}

val list1 = List(1,2,3)
val double = (x: Int) => x * 2

list.map(double)
intMap(list1, double)
intMap2(list1, double)

//val list1 = List(1,2,3)

val four = 4
val list = List(1,2,3)
4 :: list

Nil
2 :: Nil
1 :: 2 :: Nil
Nil :: 1 :: 2 :: Nil
1 :: Nil :: 1 :: 2 :: Nil

Nil
3 :: Nil
2 :: (3 :: Nil)
1 :: (2 :: (3 :: Nil))

//Nil = empty list.

val fibs = 1::1::2::3::5::Nil

fibs.head

fibs.tail

fibs.tail.tail.head

fibs.tail.tail.tail.head

val fibs1 = 1::1::Nil::2::3::5::Nil

fibs1.tail.tail.tail.tail.head

val fibs2 = 1::1::2::3::5::Nil

fibs2.tail.tail.tail.tail.head

fibs2.distinct

val fibs3 = 2::4::6::8::10::Nil

fibs3.tail.tail.tail.tail.head





