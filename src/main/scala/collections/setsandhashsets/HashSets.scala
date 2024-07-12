package collections.setsandhashsets

import scala.collection.mutable

/*
 * HashSets are mutable Sets
 */

@main
def hashSets(): Unit = {
  val values = mutable.HashSet(3, 6, true, "hello")
  val noValues = mutable.HashSet[Int]() // initialise an empty HashSet

  println(values) // HashSet(3, hello, 6, true)
  println(noValues) // HashSet()

  values.add(67)
  println(values) // HashSet(3, 67, hello, 6, true) => note undefined order
  values.remove(3)
  println(values) // HashSet(67, hello, 6, true) => removed element with value 3

  values += 55 // same as add() function
  values -= 67 // same as remove function
  println(values) // HashSet(hello, 6, 55, true)

  values.addAll(List(1, 2, 3, 4, 5, 6, 7))
  println(values) // HashSet(1, 2, 3, 4, 5, 6, 7, 55, hello, true)
  values += (7, 8)
  println(values) // HashSet(1, 2, 3, 4, 5, 6, 7, 55, 8, hello, true)
  values -= (4, 5)
  println(values) // HashSet(1, 2, 3, 6, 7, 55, 8, hello, true)

  val colors = mutable.HashSet("red", "green", "blue")
  colors ++= Set("pink", "orange")
  println(colors)
  colors --= Set("red", "pink")
  println(colors)

}