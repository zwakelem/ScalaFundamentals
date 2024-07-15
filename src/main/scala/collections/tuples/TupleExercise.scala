package collections.tuples

@main
def tupleExe(): Unit = {
  val userInfo = ("Alex", "alex@gmail.com", 3456)
  println(s"User's name is ${userInfo._1}, his account number is ${userInfo._3}")

  val spend = Tuple1(1236.54)
  val newTup = userInfo ++ spend
  println(newTup)
}
