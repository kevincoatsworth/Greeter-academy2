package app.random_classes

import scala.io.StdIn

object Discount_Calc extends App {

  def calculateDiscount (cost : Double, discount : Int) {

    val discountToDouble = discount.toDouble

    val totalDiscount: Double = discountToDouble / 100.00 * cost

    val newCost = cost - totalDiscount

    val amountToString = newCost.toString

    if (amountToString.contains(".0")) {

      println(s"Following your $discount% discount, you have saved £${totalDiscount.toInt}. " +
        s"Your total cost is £${newCost.toInt}")

    }

    else {

      println(s"Following your $discount% discount, you have saved £$totalDiscount. " +
        s"Your total cost is £$newCost")

    }
  }


  val userCost = StdIn.readLine("Please enter the cost of your item: ")

  val userDiscount = StdIn.readLine("Please enter the amount of your discount: ")

  val costDouble : Double = {

    if (userCost.contains("£")) {

      userCost.replace("£", "").toDouble

    }
    else {

      userCost.toDouble

    }
  }

  val discountAmount : Int = {

    if (userDiscount.contains("%")) {

      userDiscount.replace("%", "").toInt

    }
    else {

      userDiscount.toInt

    }

  }

  calculateDiscount(costDouble, discountAmount)

}
