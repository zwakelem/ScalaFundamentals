package lambdas

@main
def commonHigherOrderFuncs(): Unit = {
  val clients = List("Carol", "David", "Bob", "Anna")
  clients.foreach {client =>
    println(s"Hello $client")
  }

  clients.filter(_.length <= 4).foreach(println) // Bob \n Anna
  println(clients.filter(_.length <= 4)) // List(Bob, Anna)

  val sizes = clients.map(_.length) // returns a list of sizes of the Strings
  println(sizes) // List(5, 5, 3, 4)

  val sorted = clients.sortBy(_.length) // sort Strings in this list by length
  println(sorted) // List(Bob, Anna, Carol, David)

  val max = clients.maxBy(_.length) // Finds the first element which yields the largest value measured by length
  println(max) // Carol

  val min = clients.minBy(_.length) // Finds the first element which yields the smallest value measured by length
  println(min) // Bob
}
