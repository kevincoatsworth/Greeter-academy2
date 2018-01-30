package app.random_classes

import scala.io.StdIn

object Repeat_String extends App {

  val userString = StdIn.readLine("Please enter a String: ")
  println("Please enter an Int: ")
  val userInt = StdIn.readInt()

  for(x <-1 to userInt){

    print(userString)

  }

}
