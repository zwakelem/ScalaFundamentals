package collections

import scala.collection.mutable

@main
def setsPractice(): Unit = {
  val colors = mutable.HashSet[String]()
  colors += ("red", "green", "blue")
  colors -= "red"
  println(colors) // HashSet(green, blue)

  println("#########################################")
  val deskObjects = mutable.HashSet("laptop", "monitor", "cellphone", "tissues")
  println(deskObjects)
  val toRemove = Set("cellphone", "tissues")
  deskObjects --= toRemove
  println(deskObjects) // HashSet(monitor, laptop)

}
