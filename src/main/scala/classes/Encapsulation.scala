package classes

/**
 * no access modifier mean public in Scala
 */
@main
def encap(): Unit = {
  val plane = Airplane2()
  plane.fly()

  // plane.runEngines() // Eroor => not visible outside class
}

open class Airplane2:
  protected var name = "Airbus" // protected means visible within package

  private def runEngines() = println("Turn on engines")

  def fly() =
    runEngines()
    println(s"$name flying")
