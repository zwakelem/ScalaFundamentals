package collections

@main
def listFunctions(): Unit = {
  val colours = List("red", "green", "blue", "black")

  println(colours.isEmpty) // false
  println(colours.length) // 4
  println(colours.contains("pink")) // false
  println(colours.contains("blue")) // true
  println(colours.indexOf("black")) // 3

}
