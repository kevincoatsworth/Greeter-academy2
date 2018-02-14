/*

val numbers = List(1, 2, 3, 5, 8, 13)

def sumAndMulitplyBy (list : List[Int], f: Int => Int) = numbers.map(n => f(n)).sum

val timesTwo = (n : Int) => n * 2

val timesThree = (n : Int) => n * 3

val timesTwoThenTimesThree = timesTwo andThen timesThree

sumAndMulitplyBy(numbers, timesTwo)
sumAndMulitplyBy(numbers, timesThree)
sumAndMulitplyBy(numbers, timesTwoThenTimesThree)


numbers.map(timesTwo).map(timesThree)
numbers.map(timesTwo andThen timesThree)
numbers.map(timesThree compose timesTwo)

//All the same:-
//'list name'.map(timesTwo).map(timesThree)
//'list name'.map(timesTwo andThen timesThree)
//'list name'.map(timesThree compose timesTwo)
*/

//High Ordered Functions (some with Pattern matching)

/*

def isFour(number : Int) : Boolean = {

  number == 4

}
*/



def find(list : List[Int], fn : Int => Boolean) : Option[Int] = {

  list match {
    case head :: _ if fn(head) => Some(head)
    case Nil => None
    case _ :: tail => find(tail, fn)
  }

}

//if list of String
//val x : Option[String] = find(List("a","b") == "b")

/*
find(List(1,2,3), _ == 1)
find(List(1,2,3), _ == 4)
find(List(1,2,3), (number : Int) => number == 4)
find(List(1,2,3), number => number == 4)
find(Nil, _ == 2)
*/

/*
Four ways to iterate over a list =
1. recursion, 2. for loops, 3. do while, 4. map
 */
/*
def find(list : List[Int], test : Int => Boolean) : Option[Int] = {

  if (list.nonEmpty && test(list.head)) {

    Some(list.head)

  }

  else {

    None

  }

}
*/