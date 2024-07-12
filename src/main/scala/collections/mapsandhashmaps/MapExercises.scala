package collections.mapsandhashmaps

import scala.collection.mutable

@main
def mapExe(): Unit = {
  val count = mutable.HashMap(1 -> "un", 2 -> "deux", 3 -> "trois")
  println(s"2 in French is ${count(2)}")
  println(s"3 in French is ${count(3)}")

  count += 4 -> "quarte"
  println(count)
}
