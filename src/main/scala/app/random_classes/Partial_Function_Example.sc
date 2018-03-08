val divide = (x : Int) => 42 / x
List(1, 2).map(divide)
divide(2)

val dividePF = new PartialFunction[Int, Int] {
  def apply(x : Int) = 42/x
  override def isDefinedAt(x : Int) : Boolean = x != 0
}

val x = 2
if(dividePF.isDefinedAt(x)) {
  dividePF(x)
} else {
  println("Can't handle 0")
}

val handleZeros : PartialFunction[Int, Int] = {
  case y => y
}

val dividePF2 : PartialFunction[Int, Int] = {
  case y if y != 0 => 42 / y
}

val divideOrHandle = dividePF2 orElse handleZeros

//handles issue with 0
List(0,1,2,3,4,5).map(divideOrHandle)

//filters out 0's
List(0,1,2,3,4,5).collect(dividePF)


val isEven : PartialFunction[Int, String] = {

  case x : Int if x % 2 == 0 => s"$x is even"

}

val isOdd : PartialFunction[Int, String] = {

  case x : Int if x % 2 == 1 => s"$x is odd"

}

val isEvenOrOdd = isEven orElse isOdd

val numbers = 1 to 5
val evenNumbers = numbers collect isEvenOrOdd

val evenNumbers1 : IndexedSeq[String] = numbers map isEvenOrOdd

val double = (n:Int) => n * 2
val addOne = (n:Int) => n + 1

//compose evaluates the right side first
val doublePlusOne = double compose addOne

val nums = (1 to 20).toList

nums.map(doublePlusOne)