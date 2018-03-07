val numList = List(10, 20, 30, 40, 50, 5, 15, 25, 35, 45, 55)

def sumCalc(nums : List[Int], acc : Int): Int = {

  nums match {

    case Nil => acc
    case x :: tail => sumCalc(tail, acc + x)

  }

}
