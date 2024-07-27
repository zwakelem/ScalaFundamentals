package classes

@main
def inheritancePractice(): Unit = {
  val myLaptop = Laptop()
  myLaptop.run()

  val appleLaptop = Apple()
  appleLaptop.screenSize = 20
  appleLaptop.run()
}

/**
 * I could've excluded the "open" keyword because the class which extends is in the same file
 * but this is an edge case
 */
open class Laptop:
  var screenSize: Int = 30

  def run() =
    println(s"Running laptop of screensize $screenSize")

class Apple extends Laptop