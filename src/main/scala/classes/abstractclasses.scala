package classes

/**
 * works like Java
 */
@main
def abstractClasses(): Unit = {

  val bottle = Bottle()
  bottle.pour() // pouring liquid

  val jug = Jug()
  jug.pour() // pouring Jug
}

abstract class Container:
  def pour() = println("pouring liquid")

class Bottle extends Container

class Jug extends Container:
  override def pour(): Unit = println("pouring Jug")

