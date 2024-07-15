package collections.tuples

/**
 * Tuple are immutable collections
 */
@main
def tupleBasics(): Unit = {
  val conn = (80, "www", "google.com", true)
  val conn2 = Tuple4(80, "www", "google.com", true)
//  val conn3 = Tuple4(80, "www", "google.com", true, false) Error => too many arguments

  println(conn) // (80,www,google.com,true)
  println(conn2) // (80,www,google.com,true)

  val tup = Tuple2[Int, String](123, "abc")
  println(tup) // (123,abc)

  println(conn(1)) // www => 1 here is the index
  println(conn._1) // 80 => 1 means the 1st element

  println("############## Functions ########################")
  println(conn.toString()) // (80,www,google.com,true)
  val conn3 = conn.copy(_2 = "ftp") // make copy and change 2nd element to "ftp"
  println(conn3) // (80,ftp,google.com,true)

  println(conn.productArity) // size of the tuple

  println(tup.swap) // (abc,123) => return new tuple with order swapped, works only with Tuple2

  println(tup ++ conn)  // (123,abc,80,www,google.com,true) => concatenates 2 tuples
}
