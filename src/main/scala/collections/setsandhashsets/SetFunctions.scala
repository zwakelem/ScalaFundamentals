package collections.setsandhashsets

@main
def setFuncs(): Unit = {
  val items = Set(3, 4, true, "hello")
  println(items.size) // 4
  println(items.contains(3)) // true
  println(items.contains(7)) // false
  println(items.isEmpty) // false
  println(items.nonEmpty) // true
}
