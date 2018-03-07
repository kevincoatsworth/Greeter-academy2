/*
class Person(val name : String)

class BankAccount(val number : Int)

class Quiz (quiz : String, quizzie : String, score : Int)

val p1 = new Person("adam")
val b1 = new BankAccount("12345")
val q1 = new Quiz "quiz", "quizzie", 0)

val t : (Person, BankAccount, Quiz) = (p1, b1, q1)

t._1
t._2
t._3

val test = (true, (false, true))

}
*/

class Dog(val name : String, age : Int)

class Cat(val name : String, age : Int)

class Person (val name : String)

class Month (val month : Int)

val d1 = new  Dog("Bill", 6)

val c1 = new Cat("Paul", 12)

val p1 = new Person("Ted")

val m1 = new Month(5)


val t : (Dog, Cat, Person, Month) = (d1, c1, p1, m1)

t._1
t._2
t._3
t._4



val	t1	:	(Int,	String,	Int)	=	(1,	"hello", 2)
t1.productIterator.foreach(x	=>	println(x))



