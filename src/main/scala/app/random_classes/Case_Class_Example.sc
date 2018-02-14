abstract class Animal(name : String)

//in a case class the name argument is automatically a public property.

case class Dog(name : String) extends Animal(name)

val d = Dog("Lassie")

d.name

