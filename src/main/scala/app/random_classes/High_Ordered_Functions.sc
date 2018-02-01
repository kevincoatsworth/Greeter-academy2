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