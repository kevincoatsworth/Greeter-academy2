package app.random_classes

import scala.io.StdIn

class ScrabbleCalc (word : String) {

  private val word1 = word.toList

  val letters : Map[Char, Int] = Map(
    'a' -> 1,
    'e' -> 1,
    'i' -> 1,
    'o' -> 1,
    'n' -> 1,
    'r' -> 1,
    't' -> 1,
    'l' -> 1,
    's' -> 1,
    'u' -> 1,
    'd' -> 2,
    'g' -> 2,
    'b' -> 3,
    'c' -> 3,
    'm' -> 3,
    'p' -> 3,
    'f' -> 4,
    'h' -> 4,
    'v' -> 4,
    'w' -> 4,
    'y' -> 4,
    'k' -> 5,
    'j' -> 8,
    'x' -> 8,
    'q' -> 10,
    'z' -> 10,
  )

  private val totalScore = word1.foldLeft(0)( _ + letters(_))
  println(s"Your word is valid and is currently worth $totalScore points.")

  private val doubleScore = StdIn.readLine("Is your word a Double Score? (yes/no): ").toLowerCase
  private val tripleScore = StdIn.readLine("Is your word a Triple Score? (yes/no): ").toLowerCase

  if(doubleScore == "yes") {

    println("Your score is " + totalScore * 2)

  }
  else if (tripleScore == "yes") {

    println("Your score is " + totalScore * 3)

  }
  else {
    println(totalScore)
  }
}

object ScrabbleGame extends App {

  val userWord = StdIn.readLine("Please enter a word: ")

  val dict = scala.io.Source.fromFile("/usr/share/dict/british-english").getLines.toSet

  if (dict.contains(userWord)){

    new ScrabbleCalc(userWord)

  }

  else{

    println("Your word is not valid.")

  }

}