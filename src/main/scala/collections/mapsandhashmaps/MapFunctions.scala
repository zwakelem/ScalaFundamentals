package collections.mapsandhashmaps

@main
def mapFuncs(): Unit = {
  val count = Map(1 -> "one", 2 -> "two", 3 -> "three")
  println(count.size) // 3
  println(count.contains(3)) // true
  println(count.contains(5)) // false
  println(count.head) // (1,one)
  println(count.tail) // Map(2 -> two, 3 -> three)
  println(count.isEmpty) // false
}
