val names = List("adam", "daniel", "david", "david")

for (name <- names) {

  //println(name)

}

for (name <- names if name !="daniel") {

  //println(name)

}

val filteredNames = for (name <- names if name != "daniel") yield name

val ages = List(1, 25, 34, 18)

val nested = for(name <- names if name != "daniel"; if name != "david"; age <- ages) yield s"name: $name, age: $age"

class BankAccount(num : String) {

  override def toString: String = s"accountNumber: $num"

}

val accounts = for (num <- 1 to 10)
  yield new BankAccount(s"$num")

val personsWithAccounts = List(
  ("adam",
    List(
      accounts(0),
      accounts(1)
    )
  ),
  ("daniel", List(accounts(1))),
  ("michael", List(accounts(2))),
  ("chris", List(accounts(3))),
  ("connor", List(accounts(4)))
)

for(p <- personsWithAccounts;
    accounts <- p._2) yield s"${p._1} ${accounts}"

val ints = List(1,3,5,6,8,2,1)

ints.foldLeft[Int](0)((acc, num) => acc + num)
//                   [this part anonymous function]
//ints is list. foldLeft works from left to right. Int states data type. 0 is starting number. acc is accumulative amount. num is current number.

ints.foldLeft[String]("")((runningTotal, currentNumber) => runningTotal + currentNumber)