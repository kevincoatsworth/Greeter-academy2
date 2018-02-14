def double (int : Int) = int * 2

val num = (1, 5)
/*
num match {

  case 1 => "one"
  case 2 => "two"
  case 3 => "three"
  case _ => "some other number"

    /* another way to do
  case 4 => {
    double = (num)
  }
    */
}
*/

num match {

  case(1, num2) if num2 < 5 =>
    double(num._1 * num2)
  case(2, _) => 2
  case _ => double(num._1 * 2)

}







def isListEmpty(list : List[Int]) = list match {

  case Nil => true
  case h :: _ if h == 2 =>
    false
  case _ :: _ :: _  =>
    true
  case _ => false

}

val numbers = List(1, 2, 3)
isListEmpty(numbers)






sealed trait Pet{

  val name : String

  val age : Int

}

case class Dog2(name : String, age : Int) extends Pet {

  def speak = "hello!"

}
case class Cat(name : String, age : Int) extends Pet

def isDog(pet : Pet) : String = pet match {

  case d : Dog2 =>
    s"${d.name} I am a dog ${d.speak}"

  case c : Cat =>
    s"${c.name} I am a cat"
  case _ => "Something else"

}

isDog(Dog2("Jessie", 12))
isDog(Cat("Anna", 2))

def determineAgeOfPet(pet : Pet) = pet match {

  case Dog2(name, age) if name == "Roxy" =>

    s"$name is ${age*7} years old"

  case Cat(name, age) =>
    s"$name is $age years old"
  case Dog2(name, _) => s"I've got a runt $name"
  
}

determineAgeOfPet(Dog2("Roxy", 6))
determineAgeOfPet(Cat("Storm", 8))
determineAgeOfPet(Cat("Anna", 10))

/*
def	isDog1(pet : Pet)	:	String	=	{
  pet	match	{
      //stores d in Dog2
    case	d	:	Dog2	=>	true
    case	c	:	Cat	=>	false
  }
}
val	d	=	Dog2("geoff")

//function to check if d is a type of Dog
isDog1(d)
*/