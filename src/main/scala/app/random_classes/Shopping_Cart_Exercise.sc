class Product(val name: String, val category: String, val price: Int) {
  override def toString(): String = {
    s"$name - $category ($price)"
  }
}

val bread = new Product("Bread", "Food", 80)
val milk = new Product("Milk", "Food", 60)
val washingUpLiquid = new Product("Washing up liquid", "Household", 100)
val bleach = new Product("Bleach", "Household", 70)

val basket = List(bread, milk, milk, washingUpLiquid, bleach)

//2 examples of foldRight
basket.foldRight(0)((prod, acc) => prod.price + acc)
basket.foldRight(0)(_.price + _)

//2 examples of foldLeft
basket.foldLeft(0)((acc, prod) => acc + prod.price)
basket.foldLeft(0)(_+_.price)

//2 examples of filtering lists and chaining foldRight
val filtered: List[Product] = basket.filter(p => p.category == "Food")
filtered.foldRight(0)(_.price + _)
basket.filter(p=> p.category == "Food").foldRight(0)(_.price + _)

//how to accept double
basket.map(_.price * 0.9).foldRight(0.0)(_ + _)
basket.map(_.price * 0.9).foldRight(0d)(_ + _)

//washing up total added to everything else (long way)
val washingUpTotal = basket.filter(p => p.name == "Washing up liquid").map(_.price * 0.5).foldRight(0d)(_ + _)

val everythingElseTotal = basket.filter(p => p.name != "Washing up liquid").map(_.price).foldRight(0d)(_ + _)

washingUpTotal + everythingElseTotal

//washing up total added to everything else (short way)
basket.map(p => if(p.name == "Washing up liquid") p.price * 0.5 else p.price).foldRight(0d)(_+_)


