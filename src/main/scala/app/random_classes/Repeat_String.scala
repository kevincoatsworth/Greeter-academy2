package app.random_classes

import scala.io.StdIn

object Repeat_String extends App {

  var userString = StdIn.readLine("Please enter a String: ")
  println("Please enter an Int: ")
  var userInt = StdIn.readInt()

  for(x <-1 to userInt){

    println(userString)

  }

}
