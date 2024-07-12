package collections.setsandhashsets

import scala.collection.mutable

@main
def hashSetFuncs(): Unit = {
  val numbers = mutable.HashSet(3, 4, null, 56, 78)
  println(numbers)
  numbers.addOne(9)
  println(numbers) // HashSet(null, 3, 4, 56, 9, 78)
  numbers.addAll(List(4, 5, 6))
  println(numbers) // HashSet(null, 3, 4, 5, 6, 56, 9, 78)

  numbers.remove(5)
  numbers.subtractOne(6)
  println(numbers) // HashSet(null, 3, 4, 56, 9, 78)

  /* issues running this code, question asked on udemy
  val n2: Set[Matchable] = Set(4, 5, 6, 7, 8)
  println(numbers1.intersect(n2))

  Found:    (n2 : Set[Matchable])
  Required: scala.collection.Set²[Null | Int]

  where:    Set  is a trait in package scala.collection.immutable
          Set² is a trait in package scala.collection

  println(numbers.intersect(n2))
  */

  println("")
  println("#########################################")
  println("")

  val numbers1 = mutable.HashSet(3, 4, 56, 78)
  val n2 = Set(3, 4, 5, 6, 7, 8)
  println(numbers1.intersect(n2)) // HashSet(3, 4) => elements in both Sets
  println(numbers1.union(n2)) // HashSet(3, 4, 5, 6, 7, 8, 56, 78) => all the elements of the 2 Sets, with no duplicates
  println(numbers1.diff(n2)) // HashSet(56, 78)
  println(n2.diff(numbers1)) // HashSet(5, 6, 7, 8)

}
