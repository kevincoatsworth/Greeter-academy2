package app.controllers

import app.models.{CashISASavingsAccount, Person, SavingsAccount}
import app.views.Prompt

import scala.util.Try



object GreeterApplication2 extends App {

  val savingsAccount = new SavingsAccount("12345", 100.00)
  val savingsPlus100 = savingsAccount.deposit(50.00)
  val cashISASavingsAccount = new CashISASavingsAccount("67890", 100.00)
  //val cashISAPlus100 = cashISASavingsAccount.deposit(50.00)
  val cashISAMinus100 = cashISASavingsAccount.withdraw(50.00)

  //println(savingsAccount.balance)
  //println(savingsPlus100.balance)
  //println(cashISASavingsAccount.balance)
  //println(cashISAMinus100.balance)

  val cashISA = new CashISASavingsAccount("1234566", 0)
  val isaDeposited = cashISA.deposit(1000.00)
  val withdrawFromISA = isaDeposited.withdraw(200.00)
  val personWithACashISA = new Person("loyal customer", 56,List(withdrawFromISA))
  //println(personWithACashISA.speak())

  val superAccount = new CashISASavingsAccount("1234566", 0.00, depositThreshold = 1000.00).deposit(1000.00).withdraw(300.00)
  val superPersonWithISA = new Person("Super Loyal customer", 56, List(superAccount))

  //println(superPersonWithISA.speak())
  /*
  val normalAccount = new CashISASavingsAccount("12334", 100.00)
  val loyalAccountDeposited = normalAccount.deposit(300.00)
  val loyal = new Person("Loyal customer", 22, loyalAccountDeposited)
  println(loyal.speak())
  */

  def prompt() : (String, Int) = {
    val name : String = Prompt.ask("What is your name? ")

    def getAge(): Int = {

      //One way to handle exception:-
      //import scala.util.control.Exception._
      //val a : Option[Int] = nonFatalCatch.opt(Prompt.ask("How old are you? ").toInt)
      //a.fold(getAge())(a => a)

      val age = Try(Prompt.ask("How old are you? ").toInt)
      age.fold(e => {

        println(e.getMessage)
        getAge()

      }, a => a)

    }

    /* try and catch example of above.
    def getAge() : Int = {
      try{
        val age : Int = Prompt.ask("What is your age? ").toInt
        age
        } catch {
        case _: NumberFormatException => getAge()
        }
    }*/
    (name, getAge())
  }

  val (name, age) = prompt()
  val p = new Person(name, age, Nil)

/*
  def CreateNewPerson {

    val name = Prompt.ask("What is your name? ")
    val age = Prompt.ask("What is your age? ")

    try {
      val p = new Person(name, age.toInt, Nil)
    } catch {
      case ex: NumberFormatException => {
        CreateNewPerson
      }
    }
  }
*/

  val child = new Person("David")
  val p2 = new Person("Adam", "Conder")

  //println(p2.speak())
  //println(child.speak())
  //println(p.speak())

}
