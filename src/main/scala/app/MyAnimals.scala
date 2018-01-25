package app

object MyAnimals extends App {

    val jess : Animal = new Cat()
    val lassie : Animal = new Dog()
    val garfield : Cat = new Cat()

    val tim : Meowth = new Meowth(100,true)
    val l : Animal = new Wolf
    val k : BorderTerrier = new BorderTerrier
    val u : Animal = new PersianCat

    println(l.speak())
    println(k.hunt())
    println(u.speak())
    println(tim.speak())

  /*
    println("Jess said " + jess.speak())
    println("Lassie said " + lassie.speak())
    println("Garfield made " + garfield.scratch())
    println("Garfield said " + garfield.speak())
    println("Is Garfield furry? " + garfield.furry())
    println("Is Lassie furry? " + lassie.furry())
  */
}

abstract class Animal {

  def speak() : String
  //def furry() : Boolean

}

class Cat() extends Animal {

  override def speak(): String = "Meow"
  //def scratch() : String = "loud noises"
  //override def furry(): Boolean = false

}

class Dog() extends Animal {

  override def speak(): String = "Woof"
  //override def furry(): Boolean = true

}

class Wolf() extends Dog {

  override def speak(): String = "Howl"

}

class BorderTerrier extends Dog {

  def hunt(): String = "Border Terrier is hunting"

}

class PersianCat extends Cat {



}

class Meowth(coins : Int, teamRocket : Boolean) extends Cat() {

  val rocket: String = {
    if (teamRocket) {
      "I am"
    }
    else {

      "I am not"
    }
  }
  override def speak(): String = s"That's right! I have $coins coins and $rocket part of Team Rocket."
}

/*
class Meowth (coins : Int, teamRocket : Boolean) extends Cat() {

  override def speak(): String = {

    if (teamRocket) {

      s"That's right! I have $coins coins. I am part of Team Rocket"

    }

    else {

      s"I have $coins coins. I am not part of Team Rocket"

    }
  }
}*/

