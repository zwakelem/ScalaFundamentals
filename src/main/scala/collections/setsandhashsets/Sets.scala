package collections

/*
 * Sets store unique elements in an undefined order
 * Sets are immutable
 */
@main
def setsBasics(): Unit = {
  val numbers = Set(6, 34, 6, 76)
  println(numbers) // Set(6, 34, 76) => duplicates removed

//  numbers(1) = 89 => Error Sets are immutable

  val things = Set(5, "Hello", true)
  println(things) // Set(5, Hello, true) => can store different types

  // val restricted = Set[Int](5, 9, "hi") // Error => restricted to integers only
}

