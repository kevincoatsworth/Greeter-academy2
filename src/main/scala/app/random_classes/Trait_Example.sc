import scala.io.Source

/*
trait Pet {

  val name : String

}

final class Cat (override val name : String) extends Pet

final class Dog (override val name : String) extends Pet

val pets : List[Pet] = List(
  new Dog("lassie"),
  new Cat("anna")
)
*/

trait Logging {

  def log : Boolean

}


trait LoggingToFile extends Logging {

  override def log: Boolean = {

    val file = Source.fromFile("").getLines()
    file.nonEmpty
    true

  }

}

abstract class Bank

/**Without traits we would have to achieve this by defining pointless abstract classes to share behaviours. We overcome this using traits to mix-in behaviours.*/

class SAccount extends Bank

trait LoggingToFileEncrypted extends LoggingToFile {

  //fancy encryption here
  override def log = ???

}


//This is to encrypt Richard Branson's account logging. Specific trait created for this event rather than individual amendments where applicable.
val rb = new SAccount() with LoggingToFileEncrypted {

  override def log : Boolean = true

}

//example if you wanted to apply log differently for a different customer.
val rh = new SAccount() with LoggingToFileEncrypted {

  override def log : Boolean = false

}

val acc = new SAccount() with LoggingToFile

val acc2 = new SAccount()

acc.log
rb.log

//acc2.log  - doesn't work as not given LoggingToFile's log trait.
//acc2.log