package collections

import scala.collection.mutable.ArrayBuffer

@main
def arrayFunc(): Unit = {

  val colours = Array("red", "green", "blue", "black")
  println(colours.toList)

  colours(1) = "pink" // remember Arrays are mutable in Scala
  println(colours.toList) // List(red, pink, blue, black)
  colours.update(3, "blacker") // another way to update
  println(colours.toList) // List(red, pink, blue, blacker)

  println(" ############################### ")

  val colours2 = ArrayBuffer("red", "green", "blue", "black")
  colours2.addOne("yellow")
  println(colours2) // ArrayBuffer(red, green, blue, black, yellow)

  colours2.addAll(List("cyan", "magenta"))
  println(colours2) // ArrayBuffer(red, green, blue, black, yellow, cyan, magenta)

  colours2.remove(3)
  println(colours2) // ArrayBuffer(red, green, blue, yellow, cyan, magenta)

  colours2.insert(1, "orange")
  println(colours2) // ArrayBuffer(red, orange, green, blue, yellow, cyan, magenta)

  colours2.insertAll(1, List("white", "black"))
  println(colours2) // ArrayBuffer(red, white, black, orange, green, blue, yellow, cyan, magenta)

  colours2.clear()
  println(colours2) // ArrayBuffer()
}
