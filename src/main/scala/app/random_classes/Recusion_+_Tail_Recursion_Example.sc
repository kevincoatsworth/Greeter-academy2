import scala.annotation.tailrec

def sum(nums : List[Int]) : Int = {

  nums match {

    case Nil => 0
    case h :: tail => h + sum(tail)

  }

}

val oneTo200 = List.range(0, 5000) //causes stackoverflow so need tail recursion
sum(oneTo200)

val oneTo200BD = oneTo200.map(BigDecimal(_))



def sumTR(nums : List[BigDecimal]) : BigDecimal = {
  @tailrec
  def sumHelper(tail : List[BigDecimal], acc : BigDecimal) : BigDecimal = {

    tail match {

      case Nil => acc
      case h :: tail => sumHelper(tail, acc + h)

    }

  }

  sumHelper(nums, 0)

}

sumTR(oneTo200BD).toString()

/*
def sumTR(nums : List[Int]) : Int = {

  def sumHelper(tail : List[Int], acc : Int) : Int = {

    tail match {

      case Nil => acc
      case h :: tail => sumHelper(tail, acc + h)

    }

  }

  sumHelper(nums, 0)

}

sumTR(oneTo200) //works but can't show as Output exceeds cutoff limit
*/


case class Person(name : String)

def filter(p : List[Person], f : Person => Boolean) : List[Person] = {

  @tailrec
  def filter(t : List[Person], acc : List[Person]) : List[Person] = {
    t match {
      case Nil => acc
      case h :: tail =>
        if (f(h)) {
          filter(tail, h :: acc)
        } else {
          filter(tail, acc)
        }
    }
  }

  filter(p, Nil)
}

val people = List(Person("Adam"), Person("Daniel"), Person("John"), Person("Adam"),Person("Adam"),Person("Adam"),Person("Daniel"),Person("Daniel"),Person("Daniel"))

filter(people, x => x.name == "Daniel")
filter(people, x => x.name != "Daniel")