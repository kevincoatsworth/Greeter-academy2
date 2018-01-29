/*package app

class Point(val x:Int, val y:Int){

  override def toString: String = s"Current position: $x, $y"

}

abstract class Resource (amount: Int){

}

class Mana(amount:Int) extends Resource(amount){
  //used for Mage and Cleric
}
class Rage(amount:Int) extends Resource(amount){
  //used for Warrior

}
class Gold(amount:Int) extends Resource(amount){
  //all monsters should have an instance of Gold with an amount set
}

abstract class Character(health: Int, resource: Resource, startingPosition:Point){
  def move(startingPosition:Point)
  def attack(): String
}

class Mage (health:Int, resource:Resource, startingPosition:Point) extends Character(health,resource,startingPosition){
  override def attack(): String = "I cast a spell"

}
class Cleric (health:Int, resource:Resource, startingPosition:Point) extends Character(health,resource,startingPosition){
  override def attack(): String = "I am healing"

}
class Warrior (health:Int, resource:Resource, startingPosition:Point) extends Character(health,resource,startingPosition){
  override def attack(): String = "I am swinging my axe"

  override def move(startingPositionPoint : Point)
}
abstract class Enemy (health : Int, resource:Resource, startingPosition:Point) extends Character(health, resource, startingPosition) {

  val gold : Int

}
class DemonDog (health:Int, resource:Resource, startingPosition:Point) extends Enemy(health,resource,startingPosition) {
}
abstract class HumanEnemy (health:Int, resource:Resource, startingPosition:Point) extends Enemy(health,resource,startingPosition) {
}
class NightBornElf (health:Int, resource:Resource, startingPosition:Point) extends HumanEnemy(health,resource,startingPosition) {
}
class Ork (health:Int, resource:Resource, startingPosition:Point) extends Enemy(health,resource,startingPosition) {
}
/*
object Game extends App {

  val kev: Mage = new Mage()
  val ken: Cleric = new Cleric()
  val liam: Warrior = new Warrior()
  val connor: DemonDog = new DemonDog()
  val lilShaz: NightBornElf= new NightBornElf()
  val pan: Ork = new Ork()


  println(kev.attack())
*/
  /*
abstract class Character(health : Int, resource: Resource, var cPos: Point {

    def move(pos: Point) : String {
    val diffX = pos.x - cPos.x
    val diffY = pos.y - cPos.y

  if((diffX != 1 || diffY != 1)) {

    println(s"You can't move this much")

  }
  else {
  cPos = pos
  cPos
  }

}
  def attack(): String

}*/*/