package app.models

 sealed trait Pet {

    val name : String
    def speak() : String

  }

trait Walking {

  def walk : String

}

trait DogWalking extends Walking {

  override def walk = "trot"

}

trait CatWalking extends Walking {

  override def walk ="swag"

}

  class Dog(override val name : String) extends Pet {

    override def speak() : String = {

      "woof"

    }
  }

  class Cat (override val name : String) extends Pet {

    override def speak() : String = {

      "meow"

    }

  }

  object Pet extends App {

    val pets : List[Pet with Walking] = List(
      new Dog("lassie") with DogWalking,
      new Cat("anna") with CatWalking
    )

    val c1 = new Cat("Garfield")
    val d1 = new Dog("Brian")

    println(c1.speak())
    println(d1.speak())
    pets.foreach(p => println(p.walk))

  }
