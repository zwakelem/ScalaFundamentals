package collections.mapsandhashmaps

import scala.collection.mutable

/**
 * HashMaps are mutable
 */
@main
def hashMaps(): Unit = {
  val count = mutable.HashMap(1 -> "one", 2 -> "two", 3 -> "three")
  count += (4 -> "four")
  println(count) // HashMap(1 -> one, 2 -> two, 3 -> three, 4 -> four)
  count.addOne(5 -> "five")
  println(count) // HashMap(1 -> one, 2 -> two, 3 -> three, 4 -> four, 5 -> five)

  count ++= Map(9 -> "nine", 10 -> "ten")
  println(count) // HashMap(1 -> one, 2 -> two, 3 -> three, 4 -> four, 5 -> five, 9 -> nine, 10 -> ten)
  count.addAll(Map(11 -> "eleven", 12 -> "twelve"))
  println(count) // HashMap(1 -> one, 2 -> two, 3 -> three, 4 -> four, 5 -> five, 9 -> nine, 10 -> ten, 11 -> eleven, 12 -> twelve)

  count -= 4 // remove from HashMap, where 4 is the key value
  println(count) // HashMap(1 -> one, 2 -> two, 3 -> three, 5 -> five, 9 -> nine, 10 -> ten, 11 -> eleven, 12 -> twelve)
  count --= Set(10 , 11)
  println(count) // HashMap(1 -> one, 2 -> two, 3 -> three, 5 -> five, 9 -> nine, 12 -> twelve)

  // change values
  count(9) = "two plus seven"
  println(count) // HashMap(1 -> one, 2 -> two, 3 -> three, 5 -> five, 9 -> two plus seven, 12 -> twelve)

  count.clear()
  println(count) // HashMap()
}
