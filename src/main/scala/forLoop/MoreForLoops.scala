package forLoop

@main
def moreForLoops(): Unit = {

  /*for(row <- 1 to 5; column <- 3 to 9)
    println(s"row is $row, column is $column")*/

  // loop within a loop
  for(row <- 1 to 5)
    for(column <- 1 to 5)
      print(s"$row-$column \t")
    println()

  println("")
  println(" ####################################### ")
  println(" **** for loops with filters **** ")
  println("")

  val clients = List("Alice", "Bob", "Carol", "Tom")
  for(client <- clients if client.length > 4)
    println(s"Hello $client")

  println("")
  println(" ####################################### ")
  println(" **** for loops with multiple filters **** ")
  println("")

  // multiple filters
  for (client <- clients if client.length > 4; if client.startsWith("A"))
    println(s"Hi $client")

  println("")
  println(" ####################################### ")
  println(" **** for loops with return value **** ")
  println("")

  val output = for (client <- clients if client.length > 4)
    yield client
  println(output) // List(Alice, Carol)
}
