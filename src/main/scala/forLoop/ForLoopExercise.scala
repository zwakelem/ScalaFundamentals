package forLoop

@main
def forLoopExe(): Unit = {
  for(i <- 1 to 10)
    println(s"Hello #$i")

  var total: Int = 0
  for(i <- 1 to 100)
    total += i
  println(s"Total is $total")

  val customers = Map("Alice" -> 4, "Judy" -> 8, "Anna" -> 6)
  for(customerName <- customers.keys)
    val purchases = customers(customerName)
    println(s"$customerName, u purchased $purchases items!!")

}
