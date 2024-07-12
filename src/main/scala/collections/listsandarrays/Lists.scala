package collections.listsandarrays

/**
 * Lists are immutable, ordered collection, can contain duplicates
 */
@main
def listsFunc(): Unit = {
  val l = List(1,3,6,8)
  println(l) // List(1, 3, 6, 8)
  println(l(2)) // 6 => index start at 0

  // lists can also contain different types
  val m = List(1, true, "hello")
  println(m) // List(1, true, hello)

  val n = List()
  val o = Nil // keyword for empty list
  println(n) // List()
  println(o) // List()

  // we can limit data types for lists
  val p = List[Int](2,5,67)
//  val p = List[Int](2, 5,"hello")  // Error => list only takes integers
  println(p) // List(2, 5, 67)

  val matrix = List(
    List(1, 2, 3),
    List(4, 5, 6),
    List(7, 8, 9),
  )
  println(matrix) // List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
  println(matrix(0)(1)) // 2
  println(matrix(2)(0)) // 7
  println(matrix(1)(2)) // 6

  val colours = List("red", "green", "blue", "black")
  println(colours.head) // red => first element in the list
  println(colours.tail) // List(green, blue, black) => rest of the list without head
  println(colours.tail.head) // green => head of the tail
  println(colours.length) // 4
}
