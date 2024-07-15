package collections.tuples

@main
def tupleChalle(): Unit = {
  // a tuple of tuples, contains store and amount of revenue
  val stores = (("Downtown", 74552), ("West side", 4588), ("East side", 99))

  // add total of all stores
  val total = stores._1._2 + stores._2._2 + stores._3._2
  println(s"Total is $total")

  val storeNames = (stores._1._1, stores._2._1, stores._3._1)
  println(storeNames)
}