package collections

import scala.collection.mutable.ArrayBuffer

/**
 * Arrays are mutable, ordered collections
 *
 * the size of the Array CANNOT be changed,
 */
@main
def arraysDef(): Unit = {
  val a = Array(1,3,true)
  println(a) // [Ljava.lang.Object;@67b6d4ae => an object
  a.foreach(println) // prints each element in its line
  println(a.mkString) // 13true
  println(a.toList) // List(1, 3, true)

  a(1) = 7
  println(a.toList) // List(1, 7, true)

  // you can create a new Array from an old one
  // prepend element with value 23, and append element with value 4
  val b = 23 +: a :+ 4
  println(b.toList) // List(23, 1, 7, true, 4)

  // concatenate two Arrays
  val c = a ++ b
  println(c.toList) // List(1, 7, true, 23, 1, 7, true, 4)

   // ArrayBuffer size can be modified, but is slower than Array
  val d = ArrayBuffer(1,2,3)
  println(d)                // ArrayBuffer(1, 2, 3)
  d.addOne(4)
  println(d)                // ArrayBuffer(1, 2, 3, 4)
  d.addAll(List(5,6,7))
  println(d)                // ArrayBuffer(1, 2, 3, 4, 5, 6, 7)

  // you can remove elements
  println(d(3)) // 4
  d.remove(3)
  println(d) // ArrayBuffer(1, 2, 3, 5, 6, 7) => element at index 3 removed

  // remove multiple elements
  d --= List(1, 3, 5, 7) // remove elements with these values 
  println(d) // ArrayBuffer(2, 6)
}
