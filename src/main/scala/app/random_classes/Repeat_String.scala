package app.random_classes

import scala.io.StdIn

object Repeat_String extends App {

  val userString = StdIn.readLine("Please enter a String: ")

  val userInt = StdIn.readLine("Please enter an Int: ").toInt

  for(x <-1 to userInt){

    print(userString)

  }

  //println(userString * 3)

}