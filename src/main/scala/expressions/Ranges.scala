package expressions

/**
 * ranges use the key word "to" includes final value
 * keyword "until" does not include final value
 */

@main
def ranges(): Unit = {

  val r1 = 1 to 10
  println(r1) // Range 1 to 10
  println(r1.toList) // List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  val r2 = 'a' to 'z'
  println(r2.toList) // List(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z)

  val r3 = 1 until 10
  println(r3.toList) // List(1, 2, 3, 4, 5, 6, 7, 8, 9)

  val r4 = 'a' until 'z'
  println(r4.toList) // List(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y)

  val r5 = 1 to 20 by 2 // take every second element
  println(r5.toList) // List(1, 3, 5, 7, 9, 11, 13, 15, 17, 19)

  val r6 = 1 to 20 by 3 // take every third element
  println(r6.toList) // List(1, 4, 7, 10, 13, 16, 19)

  val r7 = Range(1, 10) // similar to 'val r3 = 1 until 10'
  println(r7.toList) // List(1, 2, 3, 4, 5, 6, 7, 8, 9)

  val r8 = Range.inclusive(1, 10) // val r1 = 1 to 10
  println(r8.toList) // List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  val r9 = Range(1, 20, 3) // similar to '1 until 20 by 3'
  println(r9.toList) // List(1, 4, 7, 10, 13, 16, 19)

  val r10 = Range(1, 20, 3) // similar to '1 to 20 by 3'
  println(r10.toList) // List(1, 4, 7, 10, 13, 16, 19)

  println("")
  println(" ####################################### ")
  println(" **** descending ranges **** ")
  println("")

  val r11 = 10 to 1 by -1
  println(r11.toList) // List(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)

  val r12 = (1 to 10).reverse // same as above
  println(r12.toList) // List(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)

  println("")
  println(" ####################################### ")
  println(" **** range functions **** ")
  println("")
  
  
}
