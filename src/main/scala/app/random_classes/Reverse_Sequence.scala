package app.random_classes

import scala.io.StdIn

object Reverse_Sequence extends App {

  def makeList (Number : Int) : List[Int] = {

    val x = (1 to Number).toList.reverse
    x
  }

  println("Please enter a number: ")
  val userNum = StdIn.readInt()
  println(makeList(userNum))
}
