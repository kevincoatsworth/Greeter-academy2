val ints = List(100,100,100,100,100)

ints.foldLeft[Int](0)((acc, num) => acc + num)
ints.foldRight[Int](0)((acc, num) => acc + num)

val total = ints.foldLeft(0)((acc, num) => {
  val sum = acc + num
  println(s"$acc $num = $sum")
  sum
})
total

val ints1 = List(1,3,5,6,8,2,1)

val total1 = ints1.foldLeft(0)(_+_)

val ints2 = List(1,3,5,6,8,2,1)

def plus(l : Int, r : Int) = l + r
val total2 = ints1.foldLeft(0)(plus)
total2

