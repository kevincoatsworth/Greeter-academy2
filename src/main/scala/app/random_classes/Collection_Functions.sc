val numbers = Range(1,11).toList

val evenNumbers: List[Int] = numbers.filter(x => x % 2 == 0)
val oddNumbers: List[Int] = numbers.filter(x => x % 2 == 1)
val multipleof3Numbers: List[Int] = numbers.filter(x => x % 3 == 0)
val greaterthan5Numbers: List[Int] = numbers.filter(x => x > 5)

val doubleNumbers: List[Int] = numbers.map(x => x * 2)
val doublePlus1Numbers: List[Int] = numbers.map(x => x * 2 + 1)

val doubleEvenNumbers: List[Int] = numbers.filter(x => x % 2 == 0).map(x => x * 2)
val doubleEvenNumbersKeeping8s: List[Int] =
  numbers.filter(x => x % 2 == 0).map(x => x * 8)

val printNumbers: Unit = numbers.foreach(x => println(x))

val commaSeparated = numbers.mkString(",")