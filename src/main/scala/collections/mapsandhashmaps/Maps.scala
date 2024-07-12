package collections.mapsandhashmaps

/**
 * Maps are immutable
 * Maps store key-value pairs
 * keys are unique, values can duplicate
 */
@main
def maps(): Unit = {
  // these 3 are the same
  val count = Map(1 -> "one", 2 -> "two", 3 -> "three")
  val count1 = Map((1, "one"), (2, "two"), (3, "three"))
  val count2 = Map[Int, String]((1, "one"), (2, "two"), (3, "three")) // u can define types
  //  val count3 = Map[Int, String](1 -> "one", 2 -> true) => Error

  println(count) // Map(1 -> one, 2 -> two, 3 -> three)
  println(count1) // Map(1 -> one, 2 -> two, 3 -> three)
  println(count2) // Map(1 -> one, 2 -> two, 3 -> three)
  // get value based on key
  println(count(2)) // two => this is the actual value of the key, NOT an index

  println(count.keySet) // Set(1, 2, 3)
  println(count.values) // Iterable(one, two, three)
}
