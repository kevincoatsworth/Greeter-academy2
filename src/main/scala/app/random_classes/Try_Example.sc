import scala.util.{Failure, Success, Try}

def parseInt(n : Any) = Try(n.toString.toInt)

parseInt(2)
parseInt("2")
parseInt("two")

val two = parseInt("two")

two match {

  case Success(x) => x
  case Failure(e) => e

}

two.map {n =>
  n
} recover {

  case _: Exception =>
  0

}

two.fold(_ => 0, _ + 2)

val age = for {

  a <- parseInt("5")

} yield s"You are $a years old"