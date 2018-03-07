def toIntEither(n : String)
: Either[String, Int] ={
  try {
    Right(n.toInt)
  }
  catch {
    case _ : Exception =>
      Left(s"Could not represent '$n' s a number")
  }
}

toIntEither("2")

toIntEither("two") match {
  case Left(s) => s
  case Right(i) => i
}

val handled = toIntEither("2").fold(
  l => {
    ""
  },
  r => {
    ""
  }
)
handled