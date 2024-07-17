package expressions

import scala.io.StdIn

@main
def rangeFunc(): Unit = {
  val r = 1 to 10 by 2

  print("Guess a number in the range =: ")
  val input = StdIn.readLine().toInt
  val message = if(r.contains(input))
    "good guess :-D"
  else
    "wrong :-("

  println(message)

  println(r.toList) // List(1, 3, 5, 7, 9)
  println(s"Step: ${r.step}") // Step: 2
  println(s"Head: ${r.head}") // Head: 1
  println(s"Tail: ${r.tail}") // Tail: inexact Range 3 to 10 by 2
  println(s"Last: ${r.last}") // Last: 9
  println(s"End: ${r.end}") // End: 10
  println(s"Index of 3: ${r.indexOf(3)}") // Index of 3: 1
  println(s"Index of 4: ${r.indexOf(4)}") // Index of 4: -1 => element not part of collection
  println(s"Length: ${r.length}") // Length: 5
}
