package flowcontrol

import scala.io.StdIn

@main
def ifCondition(): Unit = {
  val night = false
//  val night = true

  if(night)
    println("Sleep its night")
  else
    println("Be active, its day")

  println("")
  println(" ########################## ")
  println("")

  print("Please input the funds amount: ")
  var clientFunds = StdIn.readLine().toInt
  val price = 50
  var clientProducts = 0

  if(clientFunds >= price)
    clientFunds -= price
    clientProducts += 1
    println(s"You have purchased ${clientProducts} products")
    println(s"You have $$$clientFunds")
  else
    println("You have insufficient funds")
}
