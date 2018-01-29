package app

object Zoo extends App {

  //val jess : Animal = new Cat()
  //val lassie : Animal = new Dog()

}

abstract class Animals {

  def eat() : String
  def move() : String

}

class Mammals extends Animals {

  def drinkMilk() : String = "Baby Mammals drink milk"
  def furry() : String = "Mammals are furry"

  override def eat(): String = "Mammal eats"
  override def move(): String = "Mammal moves"

}

abstract class Birds extends Animals {

  def feathers() : String
  def bornOutOfHardShellEggs() : String
  def wings() : String
  def fly() : String

  override def eat(): String = "Birds eat"

  override def move(): String = "Birds move"
}

class Fishes extends Animals {

  def livesInWater(): String = "Fishes live in water"

  def hasGills() : String = "Fishes have Gills"

  def hasScales() : String = "Fishes have Scales"

  def hasFins() : String = "Fishes have Fins"

  override def eat(): String = "Fishes eat"

  override def move(): String = "Fishes move"
}

class Reptiles extends Animals {

  def hasScalySkin() : String = "Reptiles have scaly skin"

  def coldBlooded() : String = "Reptiles are cold blooded"

  def bornOnLand() : String = "Reptiles are born on land"

  override def eat(): String = "Reptiles eat"

  override def move(): String = "Reptiles move"
}

class Amphibians extends Animals {

  def bornInWater() : String = "Amphibians are born in water"

  def developLungs() : String = "Amphibians are born with gills but develop lungs when they grow up"

  def liveOnLand() : String = "Amphibians can live on land once they grow up"

  override def eat(): String = "Amphibians eat"

  override def move(): String = "Amphibians move"
}

class Invertebrates extends Animals {

  def quantityOfAnimals : String = "Over 95% of animals are Invertebrates"

  def noBackbone : String = "All Invertebrates lack a backbone/vertebral column"

  override def eat(): String = "Invertebrates eat"

  override def move(): String = "Invertebrates move"
}

class Gorilla extends Mammals {



}

class Dolphin extends Mammals {



}