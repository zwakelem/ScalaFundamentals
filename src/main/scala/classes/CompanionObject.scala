package classes

/**
 * houses static code, code used without instatiating the class
 * Singleton
 * has access to private class fields and methods
 * Has the same name as the class it accompanies
 *
 * */
@main
def companionObject() = {

  Airplane.checkDescent(4000) // checkDescent function can be access statically, here's an example
  Airplane.checkDescent(500)
  println()

  val airplane = Airplane()
  airplane.up()
  airplane.down()
  airplane.down()

}

class Airplane:

  import Airplane.* // has to be imported

  private val brand = "Airbus A380"
  private var altitude = 1000

  def up() =
    altitude += 1000
    println(s"$brand ascending to $altitude")

  def down() =
    if (checkDescent(altitude)) // companion object access within the class it accompanies
      altitude -= 1000
      println(s"$brand descending to $altitude")

object Airplane:
  def checkDescent(altitude: Int): Boolean =
    if(altitude <= 1000)
      println("Denied: You are about to hit the ground")
      false
    else
      println("Approved: You can ascend")
      true

