package collections

import scala.collection.mutable.ArrayBuffer

@main
def listExercise(): Unit = {
  val animals = List("dog", "cat", "penguin")
  animals.foreach(println)
  println(animals(1))

  val customers = ArrayBuffer("Zwakele", "Sibo", "Simpy")
  customers.addAll(List("Pontso", "Mapae"))
  println(customers)

  customers.addOne("Margaret")
  println(customers)

  customers --= List("Sibo")
  println(customers)

  val customerIndex = customers.indexOf("Simpy")
  customers.remove(customerIndex)
  println(customers)
}
